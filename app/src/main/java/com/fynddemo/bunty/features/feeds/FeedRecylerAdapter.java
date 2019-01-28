package com.fynddemo.bunty.features.feeds;

import android.graphics.Color;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.facebook.drawee.view.SimpleDraweeView;
import com.fynddemo.bunty.R;
import com.fynddemo.bunty.data.local.models.TestFeed;
import com.orhanobut.logger.Logger;

import java.util.List;

public class FeedRecylerAdapter extends RecyclerView.Adapter<FeedRecylerAdapter.FeedViewHolder> {

    private List<TestFeed> testFeeds;

    public FeedRecylerAdapter(List<TestFeed> testFeeds) {
        this.testFeeds = testFeeds;
    }

    @NonNull
    @Override
    public FeedViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_feed,
                viewGroup, false);
        return new FeedViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull FeedViewHolder feedViewHolder, int i) {
        TestFeed testFeed = testFeeds.get(i);
        if (testFeed != null) {
            feedViewHolder.bindTo(testFeed);
        }
    }

    @Override
    public int getItemCount() {
        int size = testFeeds != null ? testFeeds.size() : 0;
        Logger.d("Size - " + size);
        return size;
    }

    public class FeedViewHolder extends RecyclerView.ViewHolder {
        TextView tvAccount;
        TextView tvScreenName;
        TextView tvTweet;
        TextView tvRetweets;
        TextView tvLike;
        TextView tvFollow;
        SimpleDraweeView ivAccountLogo;

        public FeedViewHolder(@NonNull View itemView) {
            super(itemView);
            tvAccount = itemView.findViewById(R.id.tvAccount);
            tvScreenName = itemView.findViewById(R.id.tvScreenName);
            tvTweet = itemView.findViewById(R.id.tvTweet);
            tvRetweets = itemView.findViewById(R.id.tvRetweets);
            tvLike = itemView.findViewById(R.id.tvLike);
            ivAccountLogo = itemView.findViewById(R.id.ivAccountLogo);
            tvFollow = itemView.findViewById(R.id.tvFollow);
        }

        public void bindTo(TestFeed testFeed) {
            if (testFeed.getText() != null) {
                tvTweet.setText(testFeed.getText());
            }

            if (testFeed.getUser() != null && testFeed.getUser().getName() != null) {
                tvAccount.setText(testFeed.getUser().getName());
            }

            if (testFeed.getUser() != null && testFeed.getUser().getScreenName() != null) {
                tvScreenName.setText(testFeed.getUser().getScreenName());
            }

            if (testFeed.getUser() != null && testFeed.getUser().getProfileImageUrlHttps() != null) {
                ivAccountLogo.setImageURI(Uri.parse(testFeed.getUser().getProfileImageUrlHttps()));
            }

            if (testFeed.isFavorited()) {
                tvLike.setCompoundDrawablesWithIntrinsicBounds(itemView.getResources().getDrawable(R.drawable.ic_favorite_black_24dp, null), null, null, null);
            } else {
                tvLike.setCompoundDrawablesWithIntrinsicBounds(itemView.getResources().getDrawable(R.drawable.ic_favorite_border_black_24dp, null), null, null,
                        null);
            }

            if (testFeed.getUser() != null && testFeed.getUser().isFollowing()) {
                tvFollow.setText("Following");
                tvFollow.setTextColor(Color.parseColor("#FFFFFF"));
                tvFollow.setBackground(itemView.getResources().getDrawable(R.drawable.black_outline_blue_bg_2dp_corner, null));
            } else {
                tvFollow.setText("Follow");
                tvFollow.setTextColor(Color.parseColor("#000000"));
                tvFollow.setBackground(itemView.getResources().getDrawable(R.drawable.black_outline_transparent_bg_2dp_corner, null));
            }

            tvRetweets.setText(String.valueOf(testFeed.getRetweetCount()));
            tvLike.setText(String.valueOf(testFeed.getFavoriteCount()));
        }
    }
}
