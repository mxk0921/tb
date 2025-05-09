package com.taobao.favorites.favoritesdk.category.mtoprequest;

import com.alibaba.mtl.appmonitor.AppMonitor;
import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.t2o;

/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class ComTaobaoMercuryQueryShareListRequest implements IMTOPDataObject {
    private String API_NAME = "com.taobao.mercury.queryShareList";
    private String VERSION = "1.0";
    private boolean NEED_ECODE = true;
    private boolean NEED_SESSION = true;
    private String appName = null;
    private String cursor = null;
    private long source = 0;
    private long pageSize = 0;
    private long type = 0;

    static {
        t2o.a(707788842);
        t2o.a(589299906);
    }

    public String getAPI_NAME() {
        AppMonitor.Alarm.commitFail("CodeTrack-favorite", "offline", "com.taobao.favorites.favoritesdk.category.mtoprequest.ComTaobaoMercuryQueryShareListRequest", "public String getAPI_NAME()", "20180112");
        return this.API_NAME;
    }

    public String getAppName() {
        AppMonitor.Alarm.commitFail("CodeTrack-favorite", "offline", "com.taobao.favorites.favoritesdk.category.mtoprequest.ComTaobaoMercuryQueryShareListRequest", "public String getAppName()", "20180112");
        return this.appName;
    }

    public String getCursor() {
        AppMonitor.Alarm.commitFail("CodeTrack-favorite", "offline", "com.taobao.favorites.favoritesdk.category.mtoprequest.ComTaobaoMercuryQueryShareListRequest", "public String getCursor()", "20180112");
        return this.cursor;
    }

    public long getPageSize() {
        AppMonitor.Alarm.commitFail("CodeTrack-favorite", "offline", "com.taobao.favorites.favoritesdk.category.mtoprequest.ComTaobaoMercuryQueryShareListRequest", "public long getPageSize()", "20180112");
        return this.pageSize;
    }

    public long getSource() {
        AppMonitor.Alarm.commitFail("CodeTrack-favorite", "offline", "com.taobao.favorites.favoritesdk.category.mtoprequest.ComTaobaoMercuryQueryShareListRequest", "public long getSource()", "20180112");
        return this.source;
    }

    public long getType() {
        AppMonitor.Alarm.commitFail("CodeTrack-favorite", "offline", "com.taobao.favorites.favoritesdk.category.mtoprequest.ComTaobaoMercuryQueryShareListRequest", "public long getType()", "20180112");
        return this.type;
    }

    public String getVERSION() {
        AppMonitor.Alarm.commitFail("CodeTrack-favorite", "offline", "com.taobao.favorites.favoritesdk.category.mtoprequest.ComTaobaoMercuryQueryShareListRequest", "public String getVERSION()", "20180112");
        return this.VERSION;
    }

    public boolean isNEED_ECODE() {
        AppMonitor.Alarm.commitFail("CodeTrack-favorite", "offline", "com.taobao.favorites.favoritesdk.category.mtoprequest.ComTaobaoMercuryQueryShareListRequest", "public boolean isNEED_ECODE()", "20180112");
        return this.NEED_ECODE;
    }

    public boolean isNEED_SESSION() {
        AppMonitor.Alarm.commitFail("CodeTrack-favorite", "offline", "com.taobao.favorites.favoritesdk.category.mtoprequest.ComTaobaoMercuryQueryShareListRequest", "public boolean isNEED_SESSION()", "20180112");
        return this.NEED_SESSION;
    }

    public void setAPI_NAME(String str) {
        AppMonitor.Alarm.commitFail("CodeTrack-favorite", "offline", "com.taobao.favorites.favoritesdk.category.mtoprequest.ComTaobaoMercuryQueryShareListRequest", "public void setAPI_NAME(String API_NAME)", "20180112");
        this.API_NAME = str;
    }

    public void setAppName(String str) {
        AppMonitor.Alarm.commitFail("CodeTrack-favorite", "offline", "com.taobao.favorites.favoritesdk.category.mtoprequest.ComTaobaoMercuryQueryShareListRequest", "public void setAppName(String appName)", "20180112");
        this.appName = str;
    }

    public void setCursor(String str) {
        AppMonitor.Alarm.commitFail("CodeTrack-favorite", "offline", "com.taobao.favorites.favoritesdk.category.mtoprequest.ComTaobaoMercuryQueryShareListRequest", "public void setCursor(String cursor)", "20180112");
        this.cursor = str;
    }

    public void setNEED_ECODE(boolean z) {
        AppMonitor.Alarm.commitFail("CodeTrack-favorite", "offline", "com.taobao.favorites.favoritesdk.category.mtoprequest.ComTaobaoMercuryQueryShareListRequest", "public void setNEED_ECODE(boolean NEED_ECODE)", "20180112");
        this.NEED_ECODE = z;
    }

    public void setNEED_SESSION(boolean z) {
        AppMonitor.Alarm.commitFail("CodeTrack-favorite", "offline", "com.taobao.favorites.favoritesdk.category.mtoprequest.ComTaobaoMercuryQueryShareListRequest", "public void setNEED_SESSION(boolean NEED_SESSION)", "20180112");
        this.NEED_SESSION = z;
    }

    public void setPageSize(long j) {
        AppMonitor.Alarm.commitFail("CodeTrack-favorite", "offline", "com.taobao.favorites.favoritesdk.category.mtoprequest.ComTaobaoMercuryQueryShareListRequest", "public void setPageSize(long pageSize)", "20180112");
        this.pageSize = j;
    }

    public void setSource(long j) {
        AppMonitor.Alarm.commitFail("CodeTrack-favorite", "offline", "com.taobao.favorites.favoritesdk.category.mtoprequest.ComTaobaoMercuryQueryShareListRequest", "public void setSource(long source)", "20180112");
        this.source = j;
    }

    public void setType(long j) {
        AppMonitor.Alarm.commitFail("CodeTrack-favorite", "offline", "com.taobao.favorites.favoritesdk.category.mtoprequest.ComTaobaoMercuryQueryShareListRequest", "public void setType(long type)", "20180112");
        this.type = j;
    }

    public void setVERSION(String str) {
        AppMonitor.Alarm.commitFail("CodeTrack-favorite", "offline", "com.taobao.favorites.favoritesdk.category.mtoprequest.ComTaobaoMercuryQueryShareListRequest", "public void setVERSION(String VERSION)", "20180112");
        this.VERSION = str;
    }
}
