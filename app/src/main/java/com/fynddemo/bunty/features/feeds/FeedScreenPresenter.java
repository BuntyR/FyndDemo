package com.fynddemo.bunty.features.feeds;

import com.fynddemo.bunty.data.local.models.TestFeed;
import com.fynddemo.bunty.events.Loader;
import com.fynddemo.bunty.network.FyndClient;
import com.twitter.sdk.android.core.TwitterCore;
import com.twitter.sdk.android.core.TwitterSession;

import org.greenrobot.eventbus.EventBus;

import java.util.List;
import java.util.concurrent.TimeUnit;

import io.realm.Realm;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class FeedScreenPresenter implements FeedScreenContract.Presenter {

    private FeedScreenContract.View mView;
    private TwitterSession session;
    private FyndClient fyndClient;
    private Realm realm;

    public FeedScreenPresenter(FeedScreenContract.View mView, Realm realm) {
        this.mView = mView;
        this.realm = realm;
        session = TwitterCore.getInstance().getSessionManager().getActiveSession();
    }

    @Override
    public void getFeeds(int count) {
        if (session != null) {
            EventBus.getDefault().post(new Loader(true));
            Call<List<TestFeed>> userTimeline =
                    getFyndClient().getTwitterClient().getUserTimeline(count);
            userTimeline.enqueue(new Callback<List<TestFeed>>() {
                @Override
                public void onResponse(Call<List<TestFeed>> call,
                                       Response<List<TestFeed>> response) {
                    if (response.isSuccessful()) {
                        if (response.body() != null && !response.body().isEmpty()) {
                            mView.loadedFeeds(response.body());
                        }
                        EventBus.getDefault().post(new Loader(false));
                    }
                }

                @Override
                public void onFailure(Call<List<TestFeed>> call, Throwable t) {
                    mView.loadLocalFeeds(getLocalData());
                    EventBus.getDefault().post(new Loader(false));
                }
            });
        }
    }


    private List<TestFeed> getLocalData() {
        return realm.where(TestFeed.class).findAll();
    }


    private OkHttpClient getOkHttpClient() {
        OkHttpClient.Builder client = new OkHttpClient().newBuilder();
        client.connectTimeout(30, TimeUnit.SECONDS);
        client.readTimeout(30, TimeUnit.SECONDS);
        client.writeTimeout(30, TimeUnit.SECONDS);
        client.addInterceptor(new HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY));
        return client.build();
    }


    @Override
    public void getMoreFeeds(int count, Long maxId) {

        if (session != null) {
            EventBus.getDefault().post(new Loader(true));
            Call<List<TestFeed>> userTimeline =
                    getFyndClient().getTwitterClient().getMoreUserTimeline(count, maxId);

            userTimeline.enqueue(new Callback<List<TestFeed>>() {
                @Override
                public void onResponse(Call<List<TestFeed>> call,
                                       Response<List<TestFeed>> response) {
                    if (response.isSuccessful()) {
                        if (response.body() != null && !response.body().isEmpty()) {
                            mView.loadedFeeds(response.body());
                        }
                        EventBus.getDefault().post(new Loader(false));
                    }

                }

                @Override
                public void onFailure(Call<List<TestFeed>> call, Throwable t) {
                    mView.loadLocalFeeds(getLocalData());
                    EventBus.getDefault().post(new Loader(false));
                }
            });
        }
    }

    @Override
    public void insertData(List<TestFeed> testFeedList) {
        realm.beginTransaction();
        realm.copyToRealmOrUpdate(testFeedList);
        realm.commitTransaction();
    }

    public FyndClient getFyndClient() {
        if (fyndClient == null) {
            fyndClient = new FyndClient(session, getOkHttpClient());
        }
        return fyndClient;
    }
}
