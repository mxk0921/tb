package com.taobao.favorites.favoritesdk.goods.mtoprequest;

import com.alibaba.mtl.appmonitor.AppMonitor;
import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.t2o;

/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class MtopTaobaoMercuryPlatformCollectionsGetRequest implements IMTOPDataObject {
    private String API_NAME = "mtop.taobao.mercury.platform.collections.get";
    private String VERSION = "2.0";
    private boolean NEED_ECODE = true;
    private boolean NEED_SESSION = true;
    private long itemType = 0;
    private long startRow = 0;
    private boolean isLowPrice = false;
    private long lv1CategoryId = 0;
    private long pageSize = 0;
    private boolean isFilterPromotion = false;
    private long frontCategoryId = 0;
    private long shareListId = 0;
    private boolean isFilterInvalid = false;
    private boolean isFilterBigSale = false;
    private long startTime = 0;
    private String keyword = null;
    private long platformCode = 0;
    private boolean isFilterNewArrival = false;
    private String appName = "favorite";

    static {
        t2o.a(707788861);
        t2o.a(589299906);
    }

    public String getAPI_NAME() {
        AppMonitor.Alarm.commitFail("CodeTrack-favorite", "offline", "com.taobao.favorites.favoritesdk.goods.mtoprequest.MtopTaobaoMercuryPlatformCollectionsGetRequest", "public String getAPI_NAME()", "20180112");
        return this.API_NAME;
    }

    public long getFrontCategoryId() {
        AppMonitor.Alarm.commitFail("CodeTrack-favorite", "offline", "com.taobao.favorites.favoritesdk.goods.mtoprequest.MtopTaobaoMercuryPlatformCollectionsGetRequest", "public long getFrontCategoryId()", "20180112");
        return this.frontCategoryId;
    }

    public long getItemType() {
        AppMonitor.Alarm.commitFail("CodeTrack-favorite", "offline", "com.taobao.favorites.favoritesdk.goods.mtoprequest.MtopTaobaoMercuryPlatformCollectionsGetRequest", "public long getItemType()", "20180112");
        return this.itemType;
    }

    public String getKeyword() {
        AppMonitor.Alarm.commitFail("CodeTrack-favorite", "offline", "com.taobao.favorites.favoritesdk.goods.mtoprequest.MtopTaobaoMercuryPlatformCollectionsGetRequest", "public String getKeyword()", "20180112");
        return this.keyword;
    }

    public long getLv1CategoryId() {
        AppMonitor.Alarm.commitFail("CodeTrack-favorite", "offline", "com.taobao.favorites.favoritesdk.goods.mtoprequest.MtopTaobaoMercuryPlatformCollectionsGetRequest", "public long getLv1CategoryId()", "20180112");
        return this.lv1CategoryId;
    }

    public long getPageSize() {
        AppMonitor.Alarm.commitFail("CodeTrack-favorite", "offline", "com.taobao.favorites.favoritesdk.goods.mtoprequest.MtopTaobaoMercuryPlatformCollectionsGetRequest", "public long getPageSize()", "20180112");
        return this.pageSize;
    }

    public long getPlatformCode() {
        AppMonitor.Alarm.commitFail("CodeTrack-favorite", "offline", "com.taobao.favorites.favoritesdk.goods.mtoprequest.MtopTaobaoMercuryPlatformCollectionsGetRequest", "public long getPlatformCode()", "20180112");
        return this.platformCode;
    }

    public long getShareListId() {
        AppMonitor.Alarm.commitFail("CodeTrack-favorite", "offline", "com.taobao.favorites.favoritesdk.goods.mtoprequest.MtopTaobaoMercuryPlatformCollectionsGetRequest", "public long getShareListId()", "20180112");
        return this.shareListId;
    }

    public long getStartRow() {
        AppMonitor.Alarm.commitFail("CodeTrack-favorite", "offline", "com.taobao.favorites.favoritesdk.goods.mtoprequest.MtopTaobaoMercuryPlatformCollectionsGetRequest", "public long getStartRow()", "20180112");
        return this.startRow;
    }

    public long getStartTime() {
        AppMonitor.Alarm.commitFail("CodeTrack-favorite", "offline", "com.taobao.favorites.favoritesdk.goods.mtoprequest.MtopTaobaoMercuryPlatformCollectionsGetRequest", "public long getStartTime()", "20180112");
        return this.startTime;
    }

    public String getVERSION() {
        AppMonitor.Alarm.commitFail("CodeTrack-favorite", "offline", "com.taobao.favorites.favoritesdk.goods.mtoprequest.MtopTaobaoMercuryPlatformCollectionsGetRequest", "public String getVERSION()", "20180112");
        return this.VERSION;
    }

    public boolean isIsFilterBigSale() {
        AppMonitor.Alarm.commitFail("CodeTrack-favorite", "offline", "com.taobao.favorites.favoritesdk.goods.mtoprequest.MtopTaobaoMercuryPlatformCollectionsGetRequest", "public boolean isIsFilterBigSale()", "20180112");
        return this.isFilterBigSale;
    }

    public boolean isIsFilterInvalid() {
        AppMonitor.Alarm.commitFail("CodeTrack-favorite", "offline", "com.taobao.favorites.favoritesdk.goods.mtoprequest.MtopTaobaoMercuryPlatformCollectionsGetRequest", "public boolean isIsFilterInvalid()", "20180112");
        return this.isFilterInvalid;
    }

    public boolean isIsFilterNewArrival() {
        AppMonitor.Alarm.commitFail("CodeTrack-favorite", "offline", "com.taobao.favorites.favoritesdk.goods.mtoprequest.MtopTaobaoMercuryPlatformCollectionsGetRequest", "public boolean isIsFilterNewArrival()", "20180112");
        return this.isFilterNewArrival;
    }

    public boolean isIsFilterPromotion() {
        AppMonitor.Alarm.commitFail("CodeTrack-favorite", "offline", "com.taobao.favorites.favoritesdk.goods.mtoprequest.MtopTaobaoMercuryPlatformCollectionsGetRequest", "public boolean isIsFilterPromotion()", "20180112");
        return this.isFilterPromotion;
    }

    public boolean isIsLowPrice() {
        AppMonitor.Alarm.commitFail("CodeTrack-favorite", "offline", "com.taobao.favorites.favoritesdk.goods.mtoprequest.MtopTaobaoMercuryPlatformCollectionsGetRequest", "public boolean isIsLowPrice()", "20180112");
        return this.isLowPrice;
    }

    public boolean isNEED_ECODE() {
        AppMonitor.Alarm.commitFail("CodeTrack-favorite", "offline", "com.taobao.favorites.favoritesdk.goods.mtoprequest.MtopTaobaoMercuryPlatformCollectionsGetRequest", "public boolean isNEED_ECODE()", "20180112");
        return this.NEED_ECODE;
    }

    public boolean isNEED_SESSION() {
        AppMonitor.Alarm.commitFail("CodeTrack-favorite", "offline", "com.taobao.favorites.favoritesdk.goods.mtoprequest.MtopTaobaoMercuryPlatformCollectionsGetRequest", "public boolean isNEED_SESSION()", "20180112");
        return this.NEED_SESSION;
    }

    public void setAPI_NAME(String str) {
        AppMonitor.Alarm.commitFail("CodeTrack-favorite", "offline", "com.taobao.favorites.favoritesdk.goods.mtoprequest.MtopTaobaoMercuryPlatformCollectionsGetRequest", "public void setAPI_NAME(String API_NAME)", "20180112");
        this.API_NAME = str;
    }

    public void setFrontCategoryId(long j) {
        AppMonitor.Alarm.commitFail("CodeTrack-favorite", "offline", "com.taobao.favorites.favoritesdk.goods.mtoprequest.MtopTaobaoMercuryPlatformCollectionsGetRequest", "public void setFrontCategoryId(long frontCategoryId)", "20180112");
        this.frontCategoryId = j;
    }

    public void setIsFilterBigSale(boolean z) {
        AppMonitor.Alarm.commitFail("CodeTrack-favorite", "offline", "com.taobao.favorites.favoritesdk.goods.mtoprequest.MtopTaobaoMercuryPlatformCollectionsGetRequest", "public void setIsFilterBigSale(boolean isFilterBigSale)", "20180112");
        this.isFilterBigSale = z;
    }

    public void setIsFilterInvalid(boolean z) {
        AppMonitor.Alarm.commitFail("CodeTrack-favorite", "offline", "com.taobao.favorites.favoritesdk.goods.mtoprequest.MtopTaobaoMercuryPlatformCollectionsGetRequest", "public void setIsFilterInvalid(boolean isFilterInvalid)", "20180112");
        this.isFilterInvalid = z;
    }

    public void setIsFilterNewArrival(boolean z) {
        AppMonitor.Alarm.commitFail("CodeTrack-favorite", "offline", "com.taobao.favorites.favoritesdk.goods.mtoprequest.MtopTaobaoMercuryPlatformCollectionsGetRequest", "public void setIsFilterNewArrival(boolean isFilterNewArrival)", "20180112");
        this.isFilterNewArrival = z;
    }

    public void setIsFilterPromotion(boolean z) {
        AppMonitor.Alarm.commitFail("CodeTrack-favorite", "offline", "com.taobao.favorites.favoritesdk.goods.mtoprequest.MtopTaobaoMercuryPlatformCollectionsGetRequest", "public void setIsFilterPromotion(boolean isFilterPromotion)", "20180112");
        this.isFilterPromotion = z;
    }

    public void setIsLowPrice(boolean z) {
        AppMonitor.Alarm.commitFail("CodeTrack-favorite", "offline", "com.taobao.favorites.favoritesdk.goods.mtoprequest.MtopTaobaoMercuryPlatformCollectionsGetRequest", "public void setIsLowPrice(boolean isLowPrice)", "20180112");
        this.isLowPrice = z;
    }

    public void setItemType(long j) {
        AppMonitor.Alarm.commitFail("CodeTrack-favorite", "offline", "com.taobao.favorites.favoritesdk.goods.mtoprequest.MtopTaobaoMercuryPlatformCollectionsGetRequest", "public void setItemType(long itemType)", "20180112");
        this.itemType = j;
    }

    public void setKeyword(String str) {
        AppMonitor.Alarm.commitFail("CodeTrack-favorite", "offline", "com.taobao.favorites.favoritesdk.goods.mtoprequest.MtopTaobaoMercuryPlatformCollectionsGetRequest", "public void setKeyword(String keyword)", "20180112");
        this.keyword = str;
    }

    public void setLv1CategoryId(long j) {
        AppMonitor.Alarm.commitFail("CodeTrack-favorite", "offline", "com.taobao.favorites.favoritesdk.goods.mtoprequest.MtopTaobaoMercuryPlatformCollectionsGetRequest", "public void setLv1CategoryId(long lv1CategoryId)", "20180112");
        this.lv1CategoryId = j;
    }

    public void setNEED_ECODE(boolean z) {
        AppMonitor.Alarm.commitFail("CodeTrack-favorite", "offline", "com.taobao.favorites.favoritesdk.goods.mtoprequest.MtopTaobaoMercuryPlatformCollectionsGetRequest", "public void setNEED_ECODE(boolean NEED_ECODE)", "20180112");
        this.NEED_ECODE = z;
    }

    public void setNEED_SESSION(boolean z) {
        AppMonitor.Alarm.commitFail("CodeTrack-favorite", "offline", "com.taobao.favorites.favoritesdk.goods.mtoprequest.MtopTaobaoMercuryPlatformCollectionsGetRequest", "public void setNEED_SESSION(boolean NEED_SESSION)", "20180112");
        this.NEED_SESSION = z;
    }

    public void setPageSize(long j) {
        AppMonitor.Alarm.commitFail("CodeTrack-favorite", "offline", "com.taobao.favorites.favoritesdk.goods.mtoprequest.MtopTaobaoMercuryPlatformCollectionsGetRequest", "public void setPageSize(long pageSize)", "20180112");
        this.pageSize = j;
    }

    public void setPlatformCode(long j) {
        AppMonitor.Alarm.commitFail("CodeTrack-favorite", "offline", "com.taobao.favorites.favoritesdk.goods.mtoprequest.MtopTaobaoMercuryPlatformCollectionsGetRequest", "public void setPlatformCode(long platformCode)", "20180112");
        this.platformCode = j;
    }

    public void setShareListId(long j) {
        AppMonitor.Alarm.commitFail("CodeTrack-favorite", "offline", "com.taobao.favorites.favoritesdk.goods.mtoprequest.MtopTaobaoMercuryPlatformCollectionsGetRequest", "public void setShareListId(long shareListId)", "20180112");
        this.shareListId = j;
    }

    public void setStartRow(long j) {
        AppMonitor.Alarm.commitFail("CodeTrack-favorite", "offline", "com.taobao.favorites.favoritesdk.goods.mtoprequest.MtopTaobaoMercuryPlatformCollectionsGetRequest", "public void setStartRow(long startRow)", "20180112");
        this.startRow = j;
    }

    public void setStartTime(long j) {
        AppMonitor.Alarm.commitFail("CodeTrack-favorite", "offline", "com.taobao.favorites.favoritesdk.goods.mtoprequest.MtopTaobaoMercuryPlatformCollectionsGetRequest", "public void setStartTime(long startTime)", "20180112");
        this.startTime = j;
    }

    public void setVERSION(String str) {
        AppMonitor.Alarm.commitFail("CodeTrack-favorite", "offline", "com.taobao.favorites.favoritesdk.goods.mtoprequest.MtopTaobaoMercuryPlatformCollectionsGetRequest", "public void setVERSION(String VERSION)", "20180112");
        this.VERSION = str;
    }
}
