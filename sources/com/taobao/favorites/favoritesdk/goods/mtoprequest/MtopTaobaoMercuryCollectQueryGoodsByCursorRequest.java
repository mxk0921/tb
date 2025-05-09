package com.taobao.favorites.favoritesdk.goods.mtoprequest;

import com.alibaba.mtl.appmonitor.AppMonitor;
import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.t2o;

/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class MtopTaobaoMercuryCollectQueryGoodsByCursorRequest implements IMTOPDataObject {
    private String API_NAME = "mtop.taobao.mercury.collect.queryGoodsByCursor";
    private String VERSION = "1.0";
    private boolean NEED_ECODE = true;
    private boolean NEED_SESSION = true;
    private long startTime = 0;
    private long queryType = 0;
    private String categoryName = null;
    private long source = 0;
    private long catAttrId = 0;
    private long size = 10;
    private boolean isFilterBigSale = false;

    static {
        t2o.a(707788858);
        t2o.a(589299906);
    }

    public String getAPI_NAME() {
        AppMonitor.Alarm.commitFail("CodeTrack-favorite", "offline", "com.taobao.favorites.favoritesdk.goods.mtoprequest.MtopTaobaoMercuryCollectQueryGoodsByCursorRequest", "public String getAPI_NAME()", "20180112");
        return this.API_NAME;
    }

    public long getCatAttrId() {
        AppMonitor.Alarm.commitFail("CodeTrack-favorite", "offline", "com.taobao.favorites.favoritesdk.goods.mtoprequest.MtopTaobaoMercuryCollectQueryGoodsByCursorRequest", "public long getCatAttrId()", "20180112");
        return this.catAttrId;
    }

    public String getCategoryName() {
        AppMonitor.Alarm.commitFail("CodeTrack-favorite", "offline", "com.taobao.favorites.favoritesdk.goods.mtoprequest.MtopTaobaoMercuryCollectQueryGoodsByCursorRequest", "public String getCategoryName()", "20180112");
        return this.categoryName;
    }

    public long getQueryType() {
        AppMonitor.Alarm.commitFail("CodeTrack-favorite", "offline", "com.taobao.favorites.favoritesdk.goods.mtoprequest.MtopTaobaoMercuryCollectQueryGoodsByCursorRequest", "public long getQueryType()", "20180112");
        return this.queryType;
    }

    public long getSize() {
        AppMonitor.Alarm.commitFail("CodeTrack-favorite", "offline", "com.taobao.favorites.favoritesdk.goods.mtoprequest.MtopTaobaoMercuryCollectQueryGoodsByCursorRequest", "public long getSize()", "20180112");
        return this.size;
    }

    public long getSource() {
        AppMonitor.Alarm.commitFail("CodeTrack-favorite", "offline", "com.taobao.favorites.favoritesdk.goods.mtoprequest.MtopTaobaoMercuryCollectQueryGoodsByCursorRequest", "public long getSource()", "20180112");
        return this.source;
    }

    public long getStartTime() {
        AppMonitor.Alarm.commitFail("CodeTrack-favorite", "offline", "com.taobao.favorites.favoritesdk.goods.mtoprequest.MtopTaobaoMercuryCollectQueryGoodsByCursorRequest", "public long getStartTime()", "20180112");
        return this.startTime;
    }

    public String getVERSION() {
        AppMonitor.Alarm.commitFail("CodeTrack-favorite", "offline", "com.taobao.favorites.favoritesdk.goods.mtoprequest.MtopTaobaoMercuryCollectQueryGoodsByCursorRequest", "public String getVERSION()", "20180112");
        return this.VERSION;
    }

    public boolean isNEED_ECODE() {
        AppMonitor.Alarm.commitFail("CodeTrack-favorite", "offline", "com.taobao.favorites.favoritesdk.goods.mtoprequest.MtopTaobaoMercuryCollectQueryGoodsByCursorRequest", "public boolean isNEED_ECODE()", "20180112");
        return this.NEED_ECODE;
    }

    public boolean isNEED_SESSION() {
        AppMonitor.Alarm.commitFail("CodeTrack-favorite", "offline", "com.taobao.favorites.favoritesdk.goods.mtoprequest.MtopTaobaoMercuryCollectQueryGoodsByCursorRequest", "public boolean isNEED_SESSION()", "20180112");
        return this.NEED_SESSION;
    }

    public void setAPI_NAME(String str) {
        AppMonitor.Alarm.commitFail("CodeTrack-favorite", "offline", "com.taobao.favorites.favoritesdk.goods.mtoprequest.MtopTaobaoMercuryCollectQueryGoodsByCursorRequest", "public void setAPI_NAME(String API_NAME)", "20180112");
        this.API_NAME = str;
    }

    public void setCatAttrId(long j) {
        AppMonitor.Alarm.commitFail("CodeTrack-favorite", "offline", "com.taobao.favorites.favoritesdk.goods.mtoprequest.MtopTaobaoMercuryCollectQueryGoodsByCursorRequest", "public void setCatAttrId(long catAttrId)", "20180112");
        this.catAttrId = j;
    }

    public void setCategoryName(String str) {
        AppMonitor.Alarm.commitFail("CodeTrack-favorite", "offline", "com.taobao.favorites.favoritesdk.goods.mtoprequest.MtopTaobaoMercuryCollectQueryGoodsByCursorRequest", "public void setCategoryName(String categoryName)", "20180112");
        this.categoryName = str;
    }

    public void setFilterBigSale(boolean z) {
        AppMonitor.Alarm.commitFail("CodeTrack-favorite", "offline", "com.taobao.favorites.favoritesdk.goods.mtoprequest.MtopTaobaoMercuryCollectQueryGoodsByCursorRequest", "public void setFilterBigSale(boolean filterBigSale)", "20180112");
        this.isFilterBigSale = z;
    }

    public void setNEED_ECODE(boolean z) {
        AppMonitor.Alarm.commitFail("CodeTrack-favorite", "offline", "com.taobao.favorites.favoritesdk.goods.mtoprequest.MtopTaobaoMercuryCollectQueryGoodsByCursorRequest", "public void setNEED_ECODE(boolean NEED_ECODE)", "20180112");
        this.NEED_ECODE = z;
    }

    public void setNEED_SESSION(boolean z) {
        AppMonitor.Alarm.commitFail("CodeTrack-favorite", "offline", "com.taobao.favorites.favoritesdk.goods.mtoprequest.MtopTaobaoMercuryCollectQueryGoodsByCursorRequest", "public void setNEED_SESSION(boolean NEED_SESSION)", "20180112");
        this.NEED_SESSION = z;
    }

    public void setQueryType(long j) {
        AppMonitor.Alarm.commitFail("CodeTrack-favorite", "offline", "com.taobao.favorites.favoritesdk.goods.mtoprequest.MtopTaobaoMercuryCollectQueryGoodsByCursorRequest", "public void setQueryType(long queryType)", "20180112");
        this.queryType = j;
    }

    public void setSize(long j) {
        AppMonitor.Alarm.commitFail("CodeTrack-favorite", "offline", "com.taobao.favorites.favoritesdk.goods.mtoprequest.MtopTaobaoMercuryCollectQueryGoodsByCursorRequest", "public void setSize(long size)", "20180112");
        this.size = j;
    }

    public void setSource(long j) {
        AppMonitor.Alarm.commitFail("CodeTrack-favorite", "offline", "com.taobao.favorites.favoritesdk.goods.mtoprequest.MtopTaobaoMercuryCollectQueryGoodsByCursorRequest", "public void setSource(long source)", "20180112");
        this.source = j;
    }

    public void setStartTime(long j) {
        AppMonitor.Alarm.commitFail("CodeTrack-favorite", "offline", "com.taobao.favorites.favoritesdk.goods.mtoprequest.MtopTaobaoMercuryCollectQueryGoodsByCursorRequest", "public void setStartTime(long startTime)", "20180112");
        this.startTime = j;
    }

    public void setVERSION(String str) {
        AppMonitor.Alarm.commitFail("CodeTrack-favorite", "offline", "com.taobao.favorites.favoritesdk.goods.mtoprequest.MtopTaobaoMercuryCollectQueryGoodsByCursorRequest", "public void setVERSION(String VERSION)", "20180112");
        this.VERSION = str;
    }
}
