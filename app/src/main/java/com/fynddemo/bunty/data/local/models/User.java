package com.fynddemo.bunty.data.local.models;

import com.google.gson.annotations.SerializedName;

import io.realm.RealmObject;


public class User extends RealmObject {

    @SerializedName("friends_count")
    private Long friendsCount;

    @SerializedName("profile_image_url_https")
    private String profileImageUrlHttps;

    @SerializedName("listed_count")
    private Long listedCount;

    @SerializedName("profile_background_image_url")
    private String profileBackgroundImageUrl;

    @SerializedName("default_profile_image")
    private boolean defaultProfileImage;

    @SerializedName("favourites_count")
    private Long favouritesCount;

    @SerializedName("description")
    private String description;

    @SerializedName("created_at")
    private String createdAt;

    @SerializedName("is_translator")
    private boolean isTranslator;

    @SerializedName("profile_background_image_url_https")
    private String profileBackgroundImageUrlHttps;

    @SerializedName("protected")
    private boolean jsonMemberProtected;

    @SerializedName("screen_name")
    private String screenName;

    @SerializedName("id_str")
    private String idStr;

    @SerializedName("profile_link_color")
    private String profileLinkColor;

    @SerializedName("is_translation_enabled")
    private boolean isTranslationEnabled;

    @SerializedName("translator_type")
    private String translatorType;

    @SerializedName("id")
    private Long id;

    @SerializedName("geo_enabled")
    private boolean geoEnabled;

    @SerializedName("profile_background_color")
    private String profileBackgroundColor;

    @SerializedName("lang")
    private String lang;

    @SerializedName("has_extended_profile")
    private boolean hasExtendedProfile;

    @SerializedName("profile_sidebar_border_color")
    private String profileSidebarBorderColor;

    @SerializedName("profile_text_color")
    private String profileTextColor;

    @SerializedName("verified")
    private boolean verified;

    @SerializedName("profile_image_url")
    private String profileImageUrl;


    @SerializedName("url")
    private String url;

    @SerializedName("contributors_enabled")
    private boolean contributorsEnabled;

    @SerializedName("profile_background_tile")
    private boolean profileBackgroundTile;

    @SerializedName("profile_banner_url")
    private String profileBannerUrl;

    @SerializedName("statuses_count")
    private Long statusesCount;

    @SerializedName("follow_request_sent")
    private boolean followRequestSent;

    @SerializedName("followers_count")
    private Long followersCount;

    @SerializedName("profile_use_background_image")
    private boolean profileUseBackgroundImage;

    @SerializedName("default_profile")
    private boolean defaultProfile;

    @SerializedName("following")
    private boolean following;

    @SerializedName("name")
    private String name;

    @SerializedName("location")
    private String location;

    @SerializedName("profile_sidebar_fill_color")
    private String profileSidebarFillColor;

    @SerializedName("notifications")
    private boolean notifications;


    public void setFriendsCount(Long friendsCount) {
        this.friendsCount = friendsCount;
    }

    public Long getFriendsCount() {
        return friendsCount;
    }

    public void setProfileImageUrlHttps(String profileImageUrlHttps) {
        this.profileImageUrlHttps = profileImageUrlHttps;
    }

    public String getProfileImageUrlHttps() {
        return profileImageUrlHttps;
    }

    public void setListedCount(Long listedCount) {
        this.listedCount = listedCount;
    }

    public Long getListedCount() {
        return listedCount;
    }

    public void setProfileBackgroundImageUrl(String profileBackgroundImageUrl) {
        this.profileBackgroundImageUrl = profileBackgroundImageUrl;
    }

    public String getProfileBackgroundImageUrl() {
        return profileBackgroundImageUrl;
    }

    public void setDefaultProfileImage(boolean defaultProfileImage) {
        this.defaultProfileImage = defaultProfileImage;
    }

    public boolean isDefaultProfileImage() {
        return defaultProfileImage;
    }

    public void setFavouritesCount(Long favouritesCount) {
        this.favouritesCount = favouritesCount;
    }

    public Long getFavouritesCount() {
        return favouritesCount;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setIsTranslator(boolean isTranslator) {
        this.isTranslator = isTranslator;
    }

    public boolean isIsTranslator() {
        return isTranslator;
    }

    public void setProfileBackgroundImageUrlHttps(String profileBackgroundImageUrlHttps) {
        this.profileBackgroundImageUrlHttps = profileBackgroundImageUrlHttps;
    }

    public String getProfileBackgroundImageUrlHttps() {
        return profileBackgroundImageUrlHttps;
    }

    public void setJsonMemberProtected(boolean jsonMemberProtected) {
        this.jsonMemberProtected = jsonMemberProtected;
    }

    public boolean isJsonMemberProtected() {
        return jsonMemberProtected;
    }

    public void setScreenName(String screenName) {
        this.screenName = screenName;
    }

    public String getScreenName() {
        return screenName;
    }

    public void setIdStr(String idStr) {
        this.idStr = idStr;
    }

    public String getIdStr() {
        return idStr;
    }

    public void setProfileLinkColor(String profileLinkColor) {
        this.profileLinkColor = profileLinkColor;
    }

    public String getProfileLinkColor() {
        return profileLinkColor;
    }

    public void setIsTranslationEnabled(boolean isTranslationEnabled) {
        this.isTranslationEnabled = isTranslationEnabled;
    }

    public boolean isIsTranslationEnabled() {
        return isTranslationEnabled;
    }

    public void setTranslatorType(String translatorType) {
        this.translatorType = translatorType;
    }

    public String getTranslatorType() {
        return translatorType;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setGeoEnabled(boolean geoEnabled) {
        this.geoEnabled = geoEnabled;
    }

    public boolean isGeoEnabled() {
        return geoEnabled;
    }

    public void setProfileBackgroundColor(String profileBackgroundColor) {
        this.profileBackgroundColor = profileBackgroundColor;
    }

    public String getProfileBackgroundColor() {
        return profileBackgroundColor;
    }

    public void setLang(String lang) {
        this.lang = lang;
    }

    public String getLang() {
        return lang;
    }

    public void setHasExtendedProfile(boolean hasExtendedProfile) {
        this.hasExtendedProfile = hasExtendedProfile;
    }

    public boolean isHasExtendedProfile() {
        return hasExtendedProfile;
    }

    public void setProfileSidebarBorderColor(String profileSidebarBorderColor) {
        this.profileSidebarBorderColor = profileSidebarBorderColor;
    }

    public String getProfileSidebarBorderColor() {
        return profileSidebarBorderColor;
    }

    public void setProfileTextColor(String profileTextColor) {
        this.profileTextColor = profileTextColor;
    }

    public String getProfileTextColor() {
        return profileTextColor;
    }

    public void setVerified(boolean verified) {
        this.verified = verified;
    }

    public boolean isVerified() {
        return verified;
    }

    public void setProfileImageUrl(String profileImageUrl) {
        this.profileImageUrl = profileImageUrl;
    }

    public String getProfileImageUrl() {
        return profileImageUrl;
    }


    public void setUrl(String url) {
        this.url = url;
    }

    public String getUrl() {
        return url;
    }

    public void setContributorsEnabled(boolean contributorsEnabled) {
        this.contributorsEnabled = contributorsEnabled;
    }

    public boolean isContributorsEnabled() {
        return contributorsEnabled;
    }

    public void setProfileBackgroundTile(boolean profileBackgroundTile) {
        this.profileBackgroundTile = profileBackgroundTile;
    }

    public boolean isProfileBackgroundTile() {
        return profileBackgroundTile;
    }

    public void setProfileBannerUrl(String profileBannerUrl) {
        this.profileBannerUrl = profileBannerUrl;
    }

    public String getProfileBannerUrl() {
        return profileBannerUrl;
    }


    public void setStatusesCount(Long statusesCount) {
        this.statusesCount = statusesCount;
    }

    public Long getStatusesCount() {
        return statusesCount;
    }

    public void setFollowRequestSent(boolean followRequestSent) {
        this.followRequestSent = followRequestSent;
    }

    public boolean isFollowRequestSent() {
        return followRequestSent;
    }

    public void setFollowersCount(Long followersCount) {
        this.followersCount = followersCount;
    }

    public Long getFollowersCount() {
        return followersCount;
    }

    public void setProfileUseBackgroundImage(boolean profileUseBackgroundImage) {
        this.profileUseBackgroundImage = profileUseBackgroundImage;
    }

    public boolean isProfileUseBackgroundImage() {
        return profileUseBackgroundImage;
    }

    public void setDefaultProfile(boolean defaultProfile) {
        this.defaultProfile = defaultProfile;
    }

    public boolean isDefaultProfile() {
        return defaultProfile;
    }

    public void setFollowing(boolean following) {
        this.following = following;
    }

    public boolean isFollowing() {
        return following;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getLocation() {
        return location;
    }

    public void setProfileSidebarFillColor(String profileSidebarFillColor) {
        this.profileSidebarFillColor = profileSidebarFillColor;
    }

    public String getProfileSidebarFillColor() {
        return profileSidebarFillColor;
    }

    public void setNotifications(boolean notifications) {
        this.notifications = notifications;
    }

    public boolean isNotifications() {
        return notifications;
    }

    @Override
    public String toString() {
        return "User{" +
                "friendsCount=" + friendsCount +
                ", profileImageUrlHttps='" + profileImageUrlHttps + '\'' +
                ", listedCount=" + listedCount +
                ", profileBackgroundImageUrl='" + profileBackgroundImageUrl + '\'' +
                ", defaultProfileImage=" + defaultProfileImage +
                ", favouritesCount=" + favouritesCount +
                ", description='" + description + '\'' +
                ", createdAt='" + createdAt + '\'' +
                ", isTranslator=" + isTranslator +
                ", profileBackgroundImageUrlHttps='" + profileBackgroundImageUrlHttps + '\'' +
                ", jsonMemberProtected=" + jsonMemberProtected +
                ", screenName='" + screenName + '\'' +
                ", idStr='" + idStr + '\'' +
                ", profileLinkColor='" + profileLinkColor + '\'' +
                ", isTranslationEnabled=" + isTranslationEnabled +
                ", translatorType='" + translatorType + '\'' +
                ", id=" + id +
                ", geoEnabled=" + geoEnabled +
                ", profileBackgroundColor='" + profileBackgroundColor + '\'' +
                ", lang='" + lang + '\'' +
                ", hasExtendedProfile=" + hasExtendedProfile +
                ", profileSidebarBorderColor='" + profileSidebarBorderColor + '\'' +
                ", profileTextColor='" + profileTextColor + '\'' +
                ", verified=" + verified +
                ", profileImageUrl='" + profileImageUrl + '\'' +
                ", url='" + url + '\'' +
                ", contributorsEnabled=" + contributorsEnabled +
                ", profileBackgroundTile=" + profileBackgroundTile +
                ", profileBannerUrl='" + profileBannerUrl + '\'' +
                ", statusesCount=" + statusesCount +
                ", followRequestSent=" + followRequestSent +
                ", followersCount=" + followersCount +
                ", profileUseBackgroundImage=" + profileUseBackgroundImage +
                ", defaultProfile=" + defaultProfile +
                ", following=" + following +
                ", name='" + name + '\'' +
                ", location='" + location + '\'' +
                ", profileSidebarFillColor='" + profileSidebarFillColor + '\'' +
                ", notifications=" + notifications +
                '}';
    }
}