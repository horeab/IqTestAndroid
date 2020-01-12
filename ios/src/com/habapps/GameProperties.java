package com.habapps;

import org.robovm.apple.foundation.NSBundle;

import libgdx.constants.GameIdEnum;

public enum GameProperties {

    iqtest(
            GameIdEnum.skelgame,
            NSBundle.getMainBundle().getLocalizedString("language", "en", "InfoPlist"),
            NSBundle.getMainBundle().getLocalizedString("CFBundleDisplayName","en","InfoPlist"),
            "ca-app-pub-9894292627655692~1984049171",
            "ca-app-pub-9894292627655692/2871461723",
            "ca-app-pub-9894292627655692/3189319630",
            "ca-app-pub-9894292627655692/9213508797",
            "1470777147",
            "1473489377"),


    iqtest_pro(
            GameIdEnum.skelgame,
            NSBundle.getMainBundle().getLocalizedString("language", "en", "InfoPlist"),
            NSBundle.getMainBundle().getLocalizedString("CFBundleDisplayName","en","InfoPlist"),
            "ca-app-pub-9432399956064043~5498740745",
            "ca-app-pub-9432399956064043/1981580837",
            "ca-app-pub-9432399956064043/9246414061",
            "ca-app-pub-9432399956064043/7505370259",
            "1473489377",
            null);

    private GameIdEnum gameIdEnum;
    private String language;
    private String appName;
    private String adMobAppId;
    private String bannerAdId;
    private String interstitialAdId;
    private String rewardAdId;
    private String storeAppId;
    private String proVersionStoreAppId;

    GameProperties(GameIdEnum gameIdEnum,
                   String language,
                   String appName,
                   String adMobAppId,
                   String bannerAdId,
                   String interstitialAdId,
                   String rewardAdId,
                   String storeAppId,
                   String proVersionStoreAppId) {
        this.gameIdEnum = gameIdEnum;
        this.language = language;
        this.appName = appName;
        this.adMobAppId = adMobAppId;
        this.bannerAdId = bannerAdId;
        this.interstitialAdId = interstitialAdId;
        this.rewardAdId = rewardAdId;
        this.storeAppId = storeAppId;
        this.proVersionStoreAppId = proVersionStoreAppId;
    }

    public GameIdEnum getGameIdEnum() {
        return gameIdEnum;
    }

    public String getLanguage() {
        return language;
    }

    public String getAppName() {
        return appName;
    }

    public String getAdMobAppId() {
        return adMobAppId;
    }

    public String getBannerAdId() {
        return bannerAdId;
    }

    public String getInterstitialAdId() {
        return interstitialAdId;
    }

    public String getRewardAdId() {
        return rewardAdId;
    }

    public String getStoreAppId() {
        return storeAppId;
    }

    public String getProVersionStoreAppId() {
        return proVersionStoreAppId;
    }
}
