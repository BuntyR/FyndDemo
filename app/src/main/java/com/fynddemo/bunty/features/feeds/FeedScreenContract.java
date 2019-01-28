package com.fynddemo.bunty.features.feeds;

import com.fynddemo.bunty.data.local.models.TestFeed;

import java.util.List;

public interface FeedScreenContract {

    interface Presenter {

        void getFeeds(int count);

        void getMoreFeeds(int count, Long maxId);

        void insertData(List<TestFeed> testFeedList);
    }

    interface View {
        void loadedFeeds(List<TestFeed> testFeedList);

        void loadLocalFeeds(List<TestFeed> testFeedList);
    }
}
