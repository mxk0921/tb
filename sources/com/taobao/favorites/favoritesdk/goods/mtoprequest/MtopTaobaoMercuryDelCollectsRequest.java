package com.taobao.favorites.favoritesdk.goods.mtoprequest;

import com.alibaba.mtl.appmonitor.AppMonitor;
import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.t2o;

/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class MtopTaobaoMercuryDelCollectsRequest implements IMTOPDataObject {
    private String API_NAME = "mtop.taobao.mercury.delCollects";
    private String VERSION = "1.0";
    private boolean NEED_ECODE = true;
    private boolean NEED_SESSION = true;
    private String appName = null;
    private String itemIds = null;
    private long favType = 0;

    static {
        t2o.a(707788860);
        t2o.a(589299906);
    }

    public String getAPI_NAME() {
        AppMonitor.Alarm.commitFail("CodeTrack-favorite", "offline", "com.taobao.favorites.favoritesdk.goods.mtoprequest.MtopTaobaoMercuryDelCollectsRequest", "public String getAPI_NAME()", "20180112");
        return this.API_NAME;
    }

    public String getAppName() {
        AppMonitor.Alarm.commitFail("CodeTrack-favorite", "offline", "com.taobao.favorites.favoritesdk.goods.mtoprequest.MtopTaobaoMercuryDelCollectsRequest", "public String getAppName()", "20180112");
        return this.appName;
    }

    public long getFavType() {
        AppMonitor.Alarm.commitFail("CodeTrack-favorite", "offline", "com.taobao.favorites.favoritesdk.goods.mtoprequest.MtopTaobaoMercuryDelCollectsRequest", "public long getFavType()", "20180112");
        return this.favType;
    }

    public String getItemIds() {
        AppMonitor.Alarm.commitFail("CodeTrack-favorite", "offline", "com.taobao.favorites.favoritesdk.goods.mtoprequest.MtopTaobaoMercuryDelCollectsRequest", "public String getItemIds()", "20180112");
        return this.itemIds;
    }

    public String getVERSION() {
        AppMonitor.Alarm.commitFail("CodeTrack-favorite", "offline", "com.taobao.favorites.favoritesdk.goods.mtoprequest.MtopTaobaoMercuryDelCollectsRequest", "public String getVERSION()", "20180112");
        return this.VERSION;
    }

    public boolean isNEED_ECODE() {
        AppMonitor.Alarm.commitFail("CodeTrack-favorite", "offline", "com.taobao.favorites.favoritesdk.goods.mtoprequest.MtopTaobaoMercuryDelCollectsRequest", "public boolean isNEED_ECODE()", "20180112");
        return this.NEED_ECODE;
    }

    public boolean isNEED_SESSION() {
        AppMonitor.Alarm.commitFail("CodeTrack-favorite", "offline", "com.taobao.favorites.favoritesdk.goods.mtoprequest.MtopTaobaoMercuryDelCollectsRequest", "public boolean isNEED_SESSION()", "20180112");
        return this.NEED_SESSION;
    }

    public void setAPI_NAME(String str) {
        AppMonitor.Alarm.commitFail("CodeTrack-favorite", "offline", "com.taobao.favorites.favoritesdk.goods.mtoprequest.MtopTaobaoMercuryDelCollectsRequest", "public void setAPI_NAME(String API_NAME)", "20180112");
        this.API_NAME = str;
    }

    public void setAppName(String str) {
        AppMonitor.Alarm.commitFail("CodeTrack-favorite", "offline", "com.taobao.favorites.favoritesdk.goods.mtoprequest.MtopTaobaoMercuryDelCollectsRequest", "public void setAppName(String appName)", "20180112");
        this.appName = str;
    }

    public void setFavType(long j) {
        AppMonitor.Alarm.commitFail("CodeTrack-favorite", "offline", "com.taobao.favorites.favoritesdk.goods.mtoprequest.MtopTaobaoMercuryDelCollectsRequest", "public void setFavType(long favType)", "20180112");
        this.favType = j;
    }

    public void setItemIds(String str) {
        AppMonitor.Alarm.commitFail("CodeTrack-favorite", "offline", "com.taobao.favorites.favoritesdk.goods.mtoprequest.MtopTaobaoMercuryDelCollectsRequest", "public void setItemIds(String itemIds)", "20180112");
        this.itemIds = str;
    }

    public void setNEED_ECODE(boolean z) {
        AppMonitor.Alarm.commitFail("CodeTrack-favorite", "offline", "com.taobao.favorites.favoritesdk.goods.mtoprequest.MtopTaobaoMercuryDelCollectsRequest", "public void setNEED_ECODE(boolean NEED_ECODE)", "20180112");
        this.NEED_ECODE = z;
    }

    public void setNEED_SESSION(boolean z) {
        AppMonitor.Alarm.commitFail("CodeTrack-favorite", "offline", "com.taobao.favorites.favoritesdk.goods.mtoprequest.MtopTaobaoMercuryDelCollectsRequest", "public void setNEED_SESSION(boolean NEED_SESSION)", "20180112");
        this.NEED_SESSION = z;
    }

    public void setVERSION(String str) {
        AppMonitor.Alarm.commitFail("CodeTrack-favorite", "offline", "com.taobao.favorites.favoritesdk.goods.mtoprequest.MtopTaobaoMercuryDelCollectsRequest", "public void setVERSION(String VERSION)", "20180112");
        this.VERSION = str;
    }
}
