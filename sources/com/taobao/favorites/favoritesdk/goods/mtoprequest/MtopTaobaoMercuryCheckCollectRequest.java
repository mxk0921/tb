package com.taobao.favorites.favoritesdk.goods.mtoprequest;

import com.alibaba.mtl.appmonitor.AppMonitor;
import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.t2o;

/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class MtopTaobaoMercuryCheckCollectRequest implements IMTOPDataObject {
    private String API_NAME = "mtop.taobao.mercury.checkCollect";
    private String VERSION = "1.0";
    private boolean NEED_ECODE = true;
    private boolean NEED_SESSION = true;
    private String ids = null;
    private long type = 0;

    static {
        t2o.a(707788857);
        t2o.a(589299906);
    }

    public String getAPI_NAME() {
        AppMonitor.Alarm.commitFail("CodeTrack-favorite", "offline", "com.taobao.favorites.favoritesdk.goods.mtoprequest.MtopTaobaoMercuryCheckCollectRequest", "public String getAPI_NAME()", "20180112");
        return this.API_NAME;
    }

    public String getIds() {
        AppMonitor.Alarm.commitFail("CodeTrack-favorite", "offline", "com.taobao.favorites.favoritesdk.goods.mtoprequest.MtopTaobaoMercuryCheckCollectRequest", "public String getIds()", "20180112");
        return this.ids;
    }

    public long getType() {
        AppMonitor.Alarm.commitFail("CodeTrack-favorite", "offline", "com.taobao.favorites.favoritesdk.goods.mtoprequest.MtopTaobaoMercuryCheckCollectRequest", "public long getType()", "20180112");
        return this.type;
    }

    public String getVERSION() {
        AppMonitor.Alarm.commitFail("CodeTrack-favorite", "offline", "com.taobao.favorites.favoritesdk.goods.mtoprequest.MtopTaobaoMercuryCheckCollectRequest", "public String getVERSION()", "20180112");
        return this.VERSION;
    }

    public boolean isNEED_ECODE() {
        AppMonitor.Alarm.commitFail("CodeTrack-favorite", "offline", "com.taobao.favorites.favoritesdk.goods.mtoprequest.MtopTaobaoMercuryCheckCollectRequest", "public boolean isNEED_ECODE()", "20180112");
        return this.NEED_ECODE;
    }

    public boolean isNEED_SESSION() {
        AppMonitor.Alarm.commitFail("CodeTrack-favorite", "offline", "com.taobao.favorites.favoritesdk.goods.mtoprequest.MtopTaobaoMercuryCheckCollectRequest", "public boolean isNEED_SESSION()", "20180112");
        return this.NEED_SESSION;
    }

    public void setAPI_NAME(String str) {
        AppMonitor.Alarm.commitFail("CodeTrack-favorite", "offline", "com.taobao.favorites.favoritesdk.goods.mtoprequest.MtopTaobaoMercuryCheckCollectRequest", "public void setAPI_NAME(String API_NAME)", "20180112");
        this.API_NAME = str;
    }

    public void setIds(String str) {
        AppMonitor.Alarm.commitFail("CodeTrack-favorite", "offline", "com.taobao.favorites.favoritesdk.goods.mtoprequest.MtopTaobaoMercuryCheckCollectRequest", "public void setIds(String ids)", "20180112");
        this.ids = str;
    }

    public void setNEED_ECODE(boolean z) {
        AppMonitor.Alarm.commitFail("CodeTrack-favorite", "offline", "com.taobao.favorites.favoritesdk.goods.mtoprequest.MtopTaobaoMercuryCheckCollectRequest", "public void setNEED_ECODE(boolean NEED_ECODE)", "20180112");
        this.NEED_ECODE = z;
    }

    public void setNEED_SESSION(boolean z) {
        AppMonitor.Alarm.commitFail("CodeTrack-favorite", "offline", "com.taobao.favorites.favoritesdk.goods.mtoprequest.MtopTaobaoMercuryCheckCollectRequest", "public void setNEED_SESSION(boolean NEED_SESSION)", "20180112");
        this.NEED_SESSION = z;
    }

    public void setType(long j) {
        AppMonitor.Alarm.commitFail("CodeTrack-favorite", "offline", "com.taobao.favorites.favoritesdk.goods.mtoprequest.MtopTaobaoMercuryCheckCollectRequest", "public void setType(long type)", "20180112");
        this.type = j;
    }

    public void setVERSION(String str) {
        AppMonitor.Alarm.commitFail("CodeTrack-favorite", "offline", "com.taobao.favorites.favoritesdk.goods.mtoprequest.MtopTaobaoMercuryCheckCollectRequest", "public void setVERSION(String VERSION)", "20180112");
        this.VERSION = str;
    }
}
