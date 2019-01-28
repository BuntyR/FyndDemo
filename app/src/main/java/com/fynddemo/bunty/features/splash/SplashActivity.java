package com.fynddemo.bunty.features.splash;

import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;

import com.fynddemo.bunty.R;
import com.fynddemo.bunty.features.feeds.FeedActivity;
import com.fynddemo.bunty.features.login.LoginActivity;
import com.twitter.sdk.android.core.TwitterCore;
import com.twitter.sdk.android.core.TwitterSession;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
    }


    @Override
    protected void onPostResume() {
        super.onPostResume();
        waitForBranding();
    }

    public void checkScenario() {
        TwitterSession session = TwitterCore.getInstance().getSessionManager().getActiveSession();
        if (session != null) {
            startActivity(FeedActivity.newInstance(getApplicationContext()));
        } else {
            startActivity(LoginActivity.newInstance(getApplicationContext()));
        }
        finish();
    }

    public void waitForBranding() {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                checkScenario();
            }
        }, 1000);
    }
}
