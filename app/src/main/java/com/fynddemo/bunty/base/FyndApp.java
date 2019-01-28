package com.fynddemo.bunty.base;

import android.app.Application;
import android.util.Log;

import com.facebook.drawee.backends.pipeline.Fresco;
import com.fynddemo.bunty.BuildConfig;
import com.fynddemo.bunty.R;
import com.orhanobut.logger.AndroidLogAdapter;
import com.orhanobut.logger.Logger;
import com.twitter.sdk.android.core.DefaultLogger;
import com.twitter.sdk.android.core.Twitter;
import com.twitter.sdk.android.core.TwitterAuthConfig;
import com.twitter.sdk.android.core.TwitterConfig;

import io.realm.Realm;
import io.realm.RealmConfiguration;

public class FyndApp extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        initTwitter();
        initRealm();
        Fresco.initialize(this);
        Logger.addLogAdapter(new AndroidLogAdapter());
    }

    private void initRealm() {
        Realm.init(getApplicationContext());
        RealmConfiguration realmConfiguration = new RealmConfiguration.Builder()
                .name("fynddemo.realm")
                .schemaVersion(0)
                .deleteRealmIfMigrationNeeded()
                .build();
        Realm.setDefaultConfiguration(realmConfiguration);
    }

    private void initTwitter() {
        TwitterConfig config = new TwitterConfig.Builder(this)
                .logger(new DefaultLogger(Log.VERBOSE))
                .twitterAuthConfig(new TwitterAuthConfig(getResources().getString(R.string.com_twitter_sdk_android_CONSUMER_KEY), getResources().getString(R.string.com_twitter_sdk_android_CONSUMER_SECRET)))
                .debug(BuildConfig.DEBUG)
                .build();

        Twitter.initialize(config);
    }
}
