package com.taobao.favorites.favoritesdk.goods.mtoprequest;

import com.alibaba.mtl.appmonitor.AppMonitor;
import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.t2o;

/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class ComTaobaoMclFavAddCollectsRequest implements IMTOPDataObject {
    private String API_NAME = "com.taobao.mcl.fav.addCollect";
    private String VERSION = "2.0";
    private boolean NEED_ECODE = true;
    private boolean NEED_SESSION = true;
    private long favType = 1;
    private String itemId = "";

    static {
        t2o.a(707788852);
        t2o.a(589299906);
    }

    public String getAPI_NAME() {
        AppMonitor.Alarm.commitFail("CodeTrack-favorite", "offline", "com.taobao.favorites.favoritesdk.goods.mtoprequest.ComTaobaoMclFavAddCollectsRequest", "public String getAPI_NAME()", "20180112");
        return this.API_NAME;
    }

    public long getFavType() {
        AppMonitor.Alarm.commitFail("CodeTrack-favorite", "offline", "com.taobao.favorites.favoritesdk.goods.mtoprequest.ComTaobaoMclFavAddCollectsRequest", "public long getFavType()", "20180112");
        return this.favType;
    }

    public String getItemId() {
        AppMonitor.Alarm.commitFail("CodeTrack-favorite", "offline", "com.taobao.favorites.favoritesdk.goods.mtoprequest.ComTaobaoMclFavAddCollectsRequest", "public String getItemId()", "20180112");
        return this.itemId;
    }

    public String getVERSION() {
        AppMonitor.Alarm.commitFail("CodeTrack-favorite", "offline", "com.taobao.favorites.favoritesdk.goods.mtoprequest.ComTaobaoMclFavAddCollectsRequest", "public String getVERSION()", "20180112");
        return this.VERSION;
    }

    public boolean isNEED_ECODE() {
        AppMonitor.Alarm.commitFail("CodeTrack-favorite", "offline", "com.taobao.favorites.favoritesdk.goods.mtoprequest.ComTaobaoMclFavAddCollectsRequest", "public boolean isNEED_ECODE()", "20180112");
        return this.NEED_ECODE;
    }

    public boolean isNEED_SESSION() {
        AppMonitor.Alarm.commitFail("CodeTrack-favorite", "offline", "com.taobao.favorites.favoritesdk.goods.mtoprequest.ComTaobaoMclFavAddCollectsRequest", "public boolean isNEED_SESSION()", "20180112");
        return this.NEED_SESSION;
    }

    public void setAPI_NAME(String str) {
        AppMonitor.Alarm.commitFail("CodeTrack-favorite", "offline", "com.taobao.favorites.favoritesdk.goods.mtoprequest.ComTaobaoMclFavAddCollectsRequest", "public void setAPI_NAME(String API_NAME)", "20180112");
        this.API_NAME = str;
    }

    public void setFavType(long j) {
        AppMonitor.Alarm.commitFail("CodeTrack-favorite", "offline", "com.taobao.favorites.favoritesdk.goods.mtoprequest.ComTaobaoMclFavAddCollectsRequest", "public void setFavType(long favType)", "20180112");
        this.favType = j;
    }

    public void setItemId(String str) {
        AppMonitor.Alarm.commitFail("CodeTrack-favorite", "offline", "com.taobao.favorites.favoritesdk.goods.mtoprequest.ComTaobaoMclFavAddCollectsRequest", "public void setItemId(String itemId)", "20180112");
        this.itemId = str;
    }

    public void setNEED_ECODE(boolean z) {
        AppMonitor.Alarm.commitFail("CodeTrack-favorite", "offline", "com.taobao.favorites.favoritesdk.goods.mtoprequest.ComTaobaoMclFavAddCollectsRequest", "public void setNEED_ECODE(boolean NEED_ECODE)", "20180112");
        this.NEED_ECODE = z;
    }

    public void setNEED_SESSION(boolean z) {
        AppMonitor.Alarm.commitFail("CodeTrack-favorite", "offline", "com.taobao.favorites.favoritesdk.goods.mtoprequest.ComTaobaoMclFavAddCollectsRequest", "public void setNEED_SESSION(boolean NEED_SESSION)", "20180112");
        this.NEED_SESSION = z;
    }

    public void setVERSION(String str) {
        AppMonitor.Alarm.commitFail("CodeTrack-favorite", "offline", "com.taobao.favorites.favoritesdk.goods.mtoprequest.ComTaobaoMclFavAddCollectsRequest", "public void setVERSION(String VERSION)", "20180112");
        this.VERSION = str;
    }
}
