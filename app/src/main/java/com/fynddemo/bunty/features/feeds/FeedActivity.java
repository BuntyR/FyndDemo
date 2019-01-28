package com.fynddemo.bunty.features.feeds;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.fynddemo.bunty.R;
import com.fynddemo.bunty.base.BaseActivity;
import com.fynddemo.bunty.data.local.models.TestFeed;
import com.fynddemo.bunty.events.Loader;

import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;

import java.util.ArrayList;
import java.util.List;

import io.realm.Realm;

public class FeedActivity extends BaseActivity implements FeedScreenContract.View {

    RecyclerView rvFeeds;
    FeedRecylerAdapter feedRecylerAdapter;
    private List<TestFeed> testFeeds;
    private LinearLayoutManager linearLayoutManager;
    private static int PAGE_SIZE = 4;
    private boolean isLoading = false;
    private boolean isLastPage = false;
    private FeedScreenContract.Presenter mPresenter;
    private ProgressBar progressBar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feed);
        progressBar = findViewById(R.id.progressBar);
        mPresenter = new FeedScreenPresenter(this, Realm.getDefaultInstance());
        initiateFeeds();
        manageScroll();
    }

    private void initiateFeeds() {
        testFeeds = new ArrayList<>();
        rvFeeds = (RecyclerView) findViewById(R.id.rvFeeds);
        feedRecylerAdapter = new FeedRecylerAdapter(testFeeds);
        linearLayoutManager = new LinearLayoutManager(this);
        rvFeeds.setLayoutManager(linearLayoutManager);
        rvFeeds.setAdapter(feedRecylerAdapter);
    }

    private void manageScroll() {
        RecyclerView.OnScrollListener recyclerViewOnScrollListener =
                new RecyclerView.OnScrollListener() {
                    @Override
                    public void onScrollStateChanged(@NonNull RecyclerView recyclerView,
                                                     int newState) {
                        super.onScrollStateChanged(recyclerView, newState);
                        int visibleItemCount = recyclerView.getLayoutManager().getChildCount();
                        int totalItemCount = recyclerView.getLayoutManager().getItemCount();
                        int firstVisibleItemPosition =
                                linearLayoutManager.findFirstVisibleItemPosition();

                        if (!isLoading && !isLastPage) {
                            if ((visibleItemCount + firstVisibleItemPosition) >= totalItemCount
                                    && firstVisibleItemPosition >= 0
                                    && totalItemCount >= PAGE_SIZE) {
                                if (testFeeds != null && !testFeeds.isEmpty()) {
                                    mPresenter.getMoreFeeds(PAGE_SIZE,
                                            testFeeds.get(testFeeds.size() - 1).getId());
                                }
                            }
                        }
                    }

                    @Override
                    public void onScrolled(@NonNull RecyclerView recyclerView, int dx, int dy) {
                        super.onScrolled(recyclerView, dx, dy);
                    }
                };
        rvFeeds.addOnScrollListener(recyclerViewOnScrollListener);
    }

    @Override
    protected void onStart() {
        super.onStart();
        mPresenter.getFeeds(PAGE_SIZE);
    }

    @Subscribe(
            threadMode = ThreadMode.MAIN)
    public void onLoadedChange(Loader loader) {
        isLoading = loader.isLoading();
        if (isLoading) {
            progressBar.setVisibility(View.VISIBLE);
            rvFeeds.setVisibility(View.GONE);
        } else {
            progressBar.setVisibility(View.GONE);
            rvFeeds.setVisibility(View.VISIBLE);
        }
    }


    public static Intent newInstance(Context context) {
        return new Intent(context, FeedActivity.class);
    }

    @Override
    public void loadedFeeds(List<TestFeed> testFeedList) {
        testFeeds.addAll(testFeedList);
        feedRecylerAdapter.notifyDataSetChanged();
        mPresenter.insertData(testFeeds);
    }

    @Override
    public void loadLocalFeeds(List<TestFeed> testFeedList) {
        testFeeds.clear();
        testFeeds.addAll(testFeedList);
        feedRecylerAdapter.notifyDataSetChanged();
        Toast.makeText(FeedActivity.this, "Couldn't refresh feeds", Toast.LENGTH_SHORT).show();
    }
}

