package com.taobao.favorites.favoritesdk.goods.mtoprequest;

import com.alibaba.mtl.appmonitor.AppMonitor;
import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.t2o;

/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class ComTaobaoMclFavQueryPriceHistoryRequest implements IMTOPDataObject {
    private String API_NAME = "com.taobao.mcl.fav.queryPriceHistory";
    private String VERSION = "1.0";
    private boolean NEED_ECODE = true;
    private boolean NEED_SESSION = true;
    private String ids = null;

    static {
        t2o.a(707788854);
        t2o.a(589299906);
    }

    public String getAPI_NAME() {
        AppMonitor.Alarm.commitFail("CodeTrack-favorite", "offline", "com.taobao.favorites.favoritesdk.goods.mtoprequest.ComTaobaoMclFavQueryPriceHistoryRequest", "public String getAPI_NAME()", "20180112");
        return this.API_NAME;
    }

    public String getIds() {
        AppMonitor.Alarm.commitFail("CodeTrack-favorite", "offline", "com.taobao.favorites.favoritesdk.goods.mtoprequest.ComTaobaoMclFavQueryPriceHistoryRequest", "public String getIds()", "20180112");
        return this.ids;
    }

    public String getVERSION() {
        AppMonitor.Alarm.commitFail("CodeTrack-favorite", "offline", "com.taobao.favorites.favoritesdk.goods.mtoprequest.ComTaobaoMclFavQueryPriceHistoryRequest", "public String getVERSION()", "20180112");
        return this.VERSION;
    }

    public boolean isNEED_ECODE() {
        AppMonitor.Alarm.commitFail("CodeTrack-favorite", "offline", "com.taobao.favorites.favoritesdk.goods.mtoprequest.ComTaobaoMclFavQueryPriceHistoryRequest", "public boolean isNEED_ECODE()", "20180112");
        return this.NEED_ECODE;
    }

    public boolean isNEED_SESSION() {
        AppMonitor.Alarm.commitFail("CodeTrack-favorite", "offline", "com.taobao.favorites.favoritesdk.goods.mtoprequest.ComTaobaoMclFavQueryPriceHistoryRequest", "public boolean isNEED_SESSION()", "20180112");
        return this.NEED_SESSION;
    }

    public void setAPI_NAME(String str) {
        AppMonitor.Alarm.commitFail("CodeTrack-favorite", "offline", "com.taobao.favorites.favoritesdk.goods.mtoprequest.ComTaobaoMclFavQueryPriceHistoryRequest", "public void setAPI_NAME(String API_NAME)", "20180112");
        this.API_NAME = str;
    }

    public void setIds(String str) {
        AppMonitor.Alarm.commitFail("CodeTrack-favorite", "offline", "com.taobao.favorites.favoritesdk.goods.mtoprequest.ComTaobaoMclFavQueryPriceHistoryRequest", "public void setIds(String ids)", "20180112");
        this.ids = str;
    }

    public void setNEED_ECODE(boolean z) {
        AppMonitor.Alarm.commitFail("CodeTrack-favorite", "offline", "com.taobao.favorites.favoritesdk.goods.mtoprequest.ComTaobaoMclFavQueryPriceHistoryRequest", "public void setNEED_ECODE(boolean NEED_ECODE)", "20180112");
        this.NEED_ECODE = z;
    }

    public void setNEED_SESSION(boolean z) {
        AppMonitor.Alarm.commitFail("CodeTrack-favorite", "offline", "com.taobao.favorites.favoritesdk.goods.mtoprequest.ComTaobaoMclFavQueryPriceHistoryRequest", "public void setNEED_SESSION(boolean NEED_SESSION)", "20180112");
        this.NEED_SESSION = z;
    }

    public void setVERSION(String str) {
        AppMonitor.Alarm.commitFail("CodeTrack-favorite", "offline", "com.taobao.favorites.favoritesdk.goods.mtoprequest.ComTaobaoMclFavQueryPriceHistoryRequest", "public void setVERSION(String VERSION)", "20180112");
        this.VERSION = str;
    }
}
