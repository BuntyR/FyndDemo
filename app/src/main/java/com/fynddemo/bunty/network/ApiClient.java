package com.fynddemo.bunty.network;

import com.fynddemo.bunty.data.local.models.TestFeed;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiClient {

    @GET("/1.1/statuses/home_timeline.json")
    Call<List<TestFeed>> getUserTimeline(@Query("count") int count);

    @GET("/1.1/statuses/home_timeline.json")
    Call<List<TestFeed>> getMoreUserTimeline(@Query("count") int count,
                                             @Query("max_id") Long maxId);

}
