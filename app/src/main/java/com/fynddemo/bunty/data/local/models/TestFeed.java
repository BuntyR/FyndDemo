package com.fynddemo.bunty.data.local.models;

import com.google.gson.annotations.SerializedName;

import io.realm.RealmObject;

public class TestFeed extends RealmObject {

    @SerializedName("possibly_sensitive_appealable")
    private boolean possiblySensitiveAppealable;


    @SerializedName("created_at")
    private String createdAt;

    @SerializedName("source")
    private String source;

    @SerializedName("retweet_count")
    private Long retweetCount;

    @SerializedName("retweeted")
    private boolean retweeted;

    @SerializedName("is_quote_status")
    private boolean isQuoteStatus;

    @SerializedName("id_str")
    private String idStr;


    @SerializedName("favorite_count")
    private Long favoriteCount;

    @SerializedName("id")
    private Long id;

    @SerializedName("text")
    private String text;

    @SerializedName("lang")
    private String lang;

    @SerializedName("favorited")
    private boolean favorited;

    @SerializedName("possibly_sensitive")
    private boolean possiblySensitive;


    @SerializedName("truncated")
    private boolean truncated;


    @SerializedName("user")
    private User user;

    public void setPossiblySensitiveAppealable(boolean possiblySensitiveAppealable) {
        this.possiblySensitiveAppealable = possiblySensitiveAppealable;
    }

    public boolean isPossiblySensitiveAppealable() {
        return possiblySensitiveAppealable;
    }


    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getCreatedAt() {
        return createdAt;
    }


    public void setSource(String source) {
        this.source = source;
    }

    public String getSource() {
        return source;
    }

    public void setRetweetCount(Long retweetCount) {
        this.retweetCount = retweetCount;
    }

    public Long getRetweetCount() {
        return retweetCount;
    }

    public void setRetweeted(boolean retweeted) {
        this.retweeted = retweeted;
    }

    public boolean isRetweeted() {
        return retweeted;
    }

    public void setIsQuoteStatus(boolean isQuoteStatus) {
        this.isQuoteStatus = isQuoteStatus;
    }

    public boolean isIsQuoteStatus() {
        return isQuoteStatus;
    }

    public void setIdStr(String idStr) {
        this.idStr = idStr;
    }

    public String getIdStr() {
        return idStr;
    }

    public void setFavoriteCount(Long favoriteCount) {
        this.favoriteCount = favoriteCount;
    }

    public Long getFavoriteCount() {
        return favoriteCount;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setLang(String lang) {
        this.lang = lang;
    }

    public String getLang() {
        return lang;
    }

    public void setFavorited(boolean favorited) {
        this.favorited = favorited;
    }

    public boolean isFavorited() {
        return favorited;
    }

    public void setPossiblySensitive(boolean possiblySensitive) {
        this.possiblySensitive = possiblySensitive;
    }

    public boolean isPossiblySensitive() {
        return possiblySensitive;
    }

    public void setTruncated(boolean truncated) {
        this.truncated = truncated;
    }

    public boolean isTruncated() {
        return truncated;
    }


    public void setUser(User user) {
        this.user = user;
    }

    public User getUser() {
        return user;
    }

    @Override
    public String toString() {
        return "TestFeed{" +
                "possiblySensitiveAppealable=" + possiblySensitiveAppealable +
                ", createdAt='" + createdAt + '\'' +
                ", source='" + source + '\'' +
                ", retweetCount=" + retweetCount +
                ", retweeted=" + retweeted +
                ", isQuoteStatus=" + isQuoteStatus +
                ", idStr='" + idStr + '\'' +
                ", favoriteCount=" + favoriteCount +
                ", id=" + id +
                ", text='" + text + '\'' +
                ", lang='" + lang + '\'' +
                ", favorited=" + favorited +
                ", possiblySensitive=" + possiblySensitive +
                ", truncated=" + truncated +
                ", user=" + user +
                '}';
    }
}