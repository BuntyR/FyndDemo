package com.fynddemo.bunty.network;

import com.twitter.sdk.android.core.TwitterApiClient;
import com.twitter.sdk.android.core.TwitterSession;

import okhttp3.OkHttpClient;

public class FyndClient extends TwitterApiClient {

    public FyndClient(TwitterSession twitterSession, OkHttpClient okHttpClient) {
        super(twitterSession, okHttpClient);
    }

    public ApiClient getTwitterClient() {
        return getService(ApiClient.class);
    }

}
