package com.fynddemo.bunty.features.login;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;
import android.widget.Toast;

import com.fynddemo.bunty.R;
import com.fynddemo.bunty.base.BaseActivity;
import com.fynddemo.bunty.events.TwitterClick;
import com.fynddemo.bunty.features.feeds.FeedActivity;
import com.twitter.sdk.android.core.Callback;
import com.twitter.sdk.android.core.Result;
import com.twitter.sdk.android.core.TwitterException;
import com.twitter.sdk.android.core.TwitterSession;
import com.twitter.sdk.android.core.identity.TwitterLoginButton;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;

public class LoginActivity extends BaseActivity {

    TwitterLoginButton twitterLoginButton;
    TextView tvLoginText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        twitterLoginButton = (TwitterLoginButton) findViewById(R.id.login_button);
        tvLoginText = (TextView) findViewById(R.id.tvLoginText);
        twitterLoginButton.setCallback(new Callback<TwitterSession>() {
            @Override
            public void success(Result<TwitterSession> result) {
                EventBus.getDefault().post(new TwitterClick(true));
            }

            @Override
            public void failure(TwitterException exception) {
                EventBus.getDefault().post(new TwitterClick(false));
            }
        });
    }


    @Subscribe(
            threadMode = ThreadMode.MAIN)
    public void onTwitterClick(TwitterClick twitterClick) {
        if (twitterClick.isLoginSuccessfull()) {
            startActivity(FeedActivity.newInstance(LoginActivity.this));
        } else {
            Toast.makeText(this, "Login Failed", Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    protected void onStop() {
        super.onStop();
    }


    public static Intent newInstance(Context context) {
        return new Intent(context, LoginActivity.class);
    }


    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        twitterLoginButton.onActivityResult(requestCode, resultCode, data);
    }
}
