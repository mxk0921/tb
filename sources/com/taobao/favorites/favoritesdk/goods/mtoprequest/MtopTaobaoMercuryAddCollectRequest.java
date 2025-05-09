package com.taobao.favorites.favoritesdk.goods.mtoprequest;

import com.alibaba.mtl.appmonitor.AppMonitor;
import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.t2o;

/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class MtopTaobaoMercuryAddCollectRequest implements IMTOPDataObject {
    private String API_NAME = "mtop.taobao.mercury.addCollect";
    private String VERSION = "1.0";
    private boolean NEED_ECODE = true;
    private boolean NEED_SESSION = true;
    private long itemId = 0;
    private String appName = null;
    private String extendMap = null;

    static {
        t2o.a(707788856);
        t2o.a(589299906);
    }

    public String getAPI_NAME() {
        AppMonitor.Alarm.commitFail("CodeTrack-favorite", "offline", "com.taobao.favorites.favoritesdk.goods.mtoprequest.MtopTaobaoMercuryAddCollectRequest", "public String getAPI_NAME()", "20180112");
        return this.API_NAME;
    }

    public String getAppName() {
        AppMonitor.Alarm.commitFail("CodeTrack-favorite", "offline", "com.taobao.favorites.favoritesdk.goods.mtoprequest.MtopTaobaoMercuryAddCollectRequest", "public String getAppName()", "20180112");
        return this.appName;
    }

    public String getExtendMap() {
        AppMonitor.Alarm.commitFail("CodeTrack-favorite", "offline", "com.taobao.favorites.favoritesdk.goods.mtoprequest.MtopTaobaoMercuryAddCollectRequest", "public String getExtendMap()", "20180112");
        return this.extendMap;
    }

    public long getItemId() {
        AppMonitor.Alarm.commitFail("CodeTrack-favorite", "offline", "com.taobao.favorites.favoritesdk.goods.mtoprequest.MtopTaobaoMercuryAddCollectRequest", "public long getItemId()", "20180112");
        return this.itemId;
    }

    public String getVERSION() {
        AppMonitor.Alarm.commitFail("CodeTrack-favorite", "offline", "com.taobao.favorites.favoritesdk.goods.mtoprequest.MtopTaobaoMercuryAddCollectRequest", "public String getVERSION()", "20180112");
        return this.VERSION;
    }

    public boolean isNEED_ECODE() {
        AppMonitor.Alarm.commitFail("CodeTrack-favorite", "offline", "com.taobao.favorites.favoritesdk.goods.mtoprequest.MtopTaobaoMercuryAddCollectRequest", "public boolean isNEED_ECODE()", "20180112");
        return this.NEED_ECODE;
    }

    public boolean isNEED_SESSION() {
        AppMonitor.Alarm.commitFail("CodeTrack-favorite", "offline", "com.taobao.favorites.favoritesdk.goods.mtoprequest.MtopTaobaoMercuryAddCollectRequest", "public boolean isNEED_SESSION()", "20180112");
        return this.NEED_SESSION;
    }

    public void setAPI_NAME(String str) {
        AppMonitor.Alarm.commitFail("CodeTrack-favorite", "offline", "com.taobao.favorites.favoritesdk.goods.mtoprequest.MtopTaobaoMercuryAddCollectRequest", "public void setAPI_NAME(String API_NAME)", "20180112");
        this.API_NAME = str;
    }

    public void setAppName(String str) {
        AppMonitor.Alarm.commitFail("CodeTrack-favorite", "offline", "com.taobao.favorites.favoritesdk.goods.mtoprequest.MtopTaobaoMercuryAddCollectRequest", "public void setAppName(String appName)", "20180112");
        this.appName = str;
    }

    public void setExtendMap(String str) {
        AppMonitor.Alarm.commitFail("CodeTrack-favorite", "offline", "com.taobao.favorites.favoritesdk.goods.mtoprequest.MtopTaobaoMercuryAddCollectRequest", "public void setExtendMap(String extendMap)", "20180112");
        this.extendMap = str;
    }

    public void setItemId(long j) {
        AppMonitor.Alarm.commitFail("CodeTrack-favorite", "offline", "com.taobao.favorites.favoritesdk.goods.mtoprequest.MtopTaobaoMercuryAddCollectRequest", "public void setItemId(long itemId)", "20180112");
        this.itemId = j;
    }

    public void setNEED_ECODE(boolean z) {
        AppMonitor.Alarm.commitFail("CodeTrack-favorite", "offline", "com.taobao.favorites.favoritesdk.goods.mtoprequest.MtopTaobaoMercuryAddCollectRequest", "public void setNEED_ECODE(boolean NEED_ECODE)", "20180112");
        this.NEED_ECODE = z;
    }

    public void setNEED_SESSION(boolean z) {
        AppMonitor.Alarm.commitFail("CodeTrack-favorite", "offline", "com.taobao.favorites.favoritesdk.goods.mtoprequest.MtopTaobaoMercuryAddCollectRequest", "public void setNEED_SESSION(boolean NEED_SESSION)", "20180112");
        this.NEED_SESSION = z;
    }

    public void setVERSION(String str) {
        AppMonitor.Alarm.commitFail("CodeTrack-favorite", "offline", "com.taobao.favorites.favoritesdk.goods.mtoprequest.MtopTaobaoMercuryAddCollectRequest", "public void setVERSION(String VERSION)", "20180112");
        this.VERSION = str;
    }
}
