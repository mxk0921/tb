package com.taobao.favorites.favoritesdk.category.mtoprequest;

import com.alibaba.mtl.appmonitor.AppMonitor;
import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.t2o;

/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class ComTaobaoMercuryCreateShareListRequest implements IMTOPDataObject {
    private String API_NAME = "com.taobao.mercury.createShareList";
    private String VERSION = "1.0";
    private boolean NEED_ECODE = true;
    private boolean NEED_SESSION = true;
    private String appName = null;
    private long isSync = 0;
    private String categoryName = null;
    private long utdid = 0;
    private long moduleId = 0;
    private long source = 0;
    private String addItemIds = null;
    private long categoryType = 0;
    private String headPic = null;
    private long type = 0;
    private String categoryDesc = null;

    static {
        t2o.a(707788837);
        t2o.a(589299906);
    }

    public String getAPI_NAME() {
        AppMonitor.Alarm.commitFail("CodeTrack-favorite", "offline", "com.taobao.favorites.favoritesdk.category.mtoprequest.ComTaobaoMercuryCreateShareListRequest", "public String getAPI_NAME()", "20180112");
        return this.API_NAME;
    }

    public String getAddItemIds() {
        AppMonitor.Alarm.commitFail("CodeTrack-favorite", "offline", "com.taobao.favorites.favoritesdk.category.mtoprequest.ComTaobaoMercuryCreateShareListRequest", "public String getAddItemIds()", "20180112");
        return this.addItemIds;
    }

    public String getAppName() {
        AppMonitor.Alarm.commitFail("CodeTrack-favorite", "offline", "com.taobao.favorites.favoritesdk.category.mtoprequest.ComTaobaoMercuryCreateShareListRequest", "public String getAppName()", "20180112");
        return this.appName;
    }

    public String getCategoryDesc() {
        AppMonitor.Alarm.commitFail("CodeTrack-favorite", "offline", "com.taobao.favorites.favoritesdk.category.mtoprequest.ComTaobaoMercuryCreateShareListRequest", "public String getCategoryDesc()", "20180112");
        return this.categoryDesc;
    }

    public String getCategoryName() {
        AppMonitor.Alarm.commitFail("CodeTrack-favorite", "offline", "com.taobao.favorites.favoritesdk.category.mtoprequest.ComTaobaoMercuryCreateShareListRequest", "public String getCategoryName()", "20180112");
        return this.categoryName;
    }

    public long getCategoryType() {
        AppMonitor.Alarm.commitFail("CodeTrack-favorite", "offline", "com.taobao.favorites.favoritesdk.category.mtoprequest.ComTaobaoMercuryCreateShareListRequest", "public long getCategoryType()", "20180112");
        return this.categoryType;
    }

    public String getHeadPic() {
        AppMonitor.Alarm.commitFail("CodeTrack-favorite", "offline", "com.taobao.favorites.favoritesdk.category.mtoprequest.ComTaobaoMercuryCreateShareListRequest", "public String getHeadPic()", "20180112");
        return this.headPic;
    }

    public long getIsSync() {
        AppMonitor.Alarm.commitFail("CodeTrack-favorite", "offline", "com.taobao.favorites.favoritesdk.category.mtoprequest.ComTaobaoMercuryCreateShareListRequest", "public long getIsSync()", "20180112");
        return this.isSync;
    }

    public long getModuleId() {
        AppMonitor.Alarm.commitFail("CodeTrack-favorite", "offline", "com.taobao.favorites.favoritesdk.category.mtoprequest.ComTaobaoMercuryCreateShareListRequest", "public long getModuleId()", "20180112");
        return this.moduleId;
    }

    public long getSource() {
        AppMonitor.Alarm.commitFail("CodeTrack-favorite", "offline", "com.taobao.favorites.favoritesdk.category.mtoprequest.ComTaobaoMercuryCreateShareListRequest", "public long getSource()", "20180112");
        return this.source;
    }

    public long getType() {
        AppMonitor.Alarm.commitFail("CodeTrack-favorite", "offline", "com.taobao.favorites.favoritesdk.category.mtoprequest.ComTaobaoMercuryCreateShareListRequest", "public long getType()", "20180112");
        return this.type;
    }

    public long getUtdid() {
        AppMonitor.Alarm.commitFail("CodeTrack-favorite", "offline", "com.taobao.favorites.favoritesdk.category.mtoprequest.ComTaobaoMercuryCreateShareListRequest", "public long getUtdid()", "20180112");
        return this.utdid;
    }

    public String getVERSION() {
        AppMonitor.Alarm.commitFail("CodeTrack-favorite", "offline", "com.taobao.favorites.favoritesdk.category.mtoprequest.ComTaobaoMercuryCreateShareListRequest", "public String getVERSION()", "20180112");
        return this.VERSION;
    }

    public boolean isNEED_ECODE() {
        AppMonitor.Alarm.commitFail("CodeTrack-favorite", "offline", "com.taobao.favorites.favoritesdk.category.mtoprequest.ComTaobaoMercuryCreateShareListRequest", "public boolean isNEED_ECODE()", "20180112");
        return this.NEED_ECODE;
    }

    public boolean isNEED_SESSION() {
        AppMonitor.Alarm.commitFail("CodeTrack-favorite", "offline", "com.taobao.favorites.favoritesdk.category.mtoprequest.ComTaobaoMercuryCreateShareListRequest", "public boolean isNEED_SESSION()", "20180112");
        return this.NEED_SESSION;
    }

    public void setAPI_NAME(String str) {
        AppMonitor.Alarm.commitFail("CodeTrack-favorite", "offline", "com.taobao.favorites.favoritesdk.category.mtoprequest.ComTaobaoMercuryCreateShareListRequest", "public void setAPI_NAME(String API_NAME)", "20180112");
        this.API_NAME = str;
    }

    public void setAddItemIds(String str) {
        AppMonitor.Alarm.commitFail("CodeTrack-favorite", "offline", "com.taobao.favorites.favoritesdk.category.mtoprequest.ComTaobaoMercuryCreateShareListRequest", "public void setAddItemIds(String addItemIds)", "20180112");
        this.addItemIds = str;
    }

    public void setAppName(String str) {
        AppMonitor.Alarm.commitFail("CodeTrack-favorite", "offline", "com.taobao.favorites.favoritesdk.category.mtoprequest.ComTaobaoMercuryCreateShareListRequest", "public void setAppName(String appName)", "20180112");
        this.appName = str;
    }

    public void setCategoryDesc(String str) {
        AppMonitor.Alarm.commitFail("CodeTrack-favorite", "offline", "com.taobao.favorites.favoritesdk.category.mtoprequest.ComTaobaoMercuryCreateShareListRequest", "public void setCategoryDesc(String categoryDesc)", "20180112");
        this.categoryDesc = str;
    }

    public void setCategoryName(String str) {
        AppMonitor.Alarm.commitFail("CodeTrack-favorite", "offline", "com.taobao.favorites.favoritesdk.category.mtoprequest.ComTaobaoMercuryCreateShareListRequest", "public void setCategoryName(String categoryName)", "20180112");
        this.categoryName = str;
    }

    public void setCategoryType(long j) {
        AppMonitor.Alarm.commitFail("CodeTrack-favorite", "offline", "com.taobao.favorites.favoritesdk.category.mtoprequest.ComTaobaoMercuryCreateShareListRequest", "public void setCategoryType(long categoryType)", "20180112");
        this.categoryType = j;
    }

    public void setHeadPic(String str) {
        AppMonitor.Alarm.commitFail("CodeTrack-favorite", "offline", "com.taobao.favorites.favoritesdk.category.mtoprequest.ComTaobaoMercuryCreateShareListRequest", "public void setHeadPic(String headPic)", "20180112");
        this.headPic = str;
    }

    public void setIsSync(long j) {
        AppMonitor.Alarm.commitFail("CodeTrack-favorite", "offline", "com.taobao.favorites.favoritesdk.category.mtoprequest.ComTaobaoMercuryCreateShareListRequest", "public void setIsSync(long isSync)", "20180112");
        this.isSync = j;
    }

    public void setModuleId(long j) {
        AppMonitor.Alarm.commitFail("CodeTrack-favorite", "offline", "com.taobao.favorites.favoritesdk.category.mtoprequest.ComTaobaoMercuryCreateShareListRequest", "public void setModuleId(long moduleId)", "20180112");
        this.moduleId = j;
    }

    public void setNEED_ECODE(boolean z) {
        AppMonitor.Alarm.commitFail("CodeTrack-favorite", "offline", "com.taobao.favorites.favoritesdk.category.mtoprequest.ComTaobaoMercuryCreateShareListRequest", "public void setNEED_ECODE(boolean NEED_ECODE)", "20180112");
        this.NEED_ECODE = z;
    }

    public void setNEED_SESSION(boolean z) {
        AppMonitor.Alarm.commitFail("CodeTrack-favorite", "offline", "com.taobao.favorites.favoritesdk.category.mtoprequest.ComTaobaoMercuryCreateShareListRequest", "public void setNEED_SESSION(boolean NEED_SESSION)", "20180112");
        this.NEED_SESSION = z;
    }

    public void setSource(long j) {
        AppMonitor.Alarm.commitFail("CodeTrack-favorite", "offline", "com.taobao.favorites.favoritesdk.category.mtoprequest.ComTaobaoMercuryCreateShareListRequest", "public void setSource(long source)", "20180112");
        this.source = j;
    }

    public void setType(long j) {
        AppMonitor.Alarm.commitFail("CodeTrack-favorite", "offline", "com.taobao.favorites.favoritesdk.category.mtoprequest.ComTaobaoMercuryCreateShareListRequest", "public void setType(long type)", "20180112");
        this.type = j;
    }

    public void setUtdid(long j) {
        AppMonitor.Alarm.commitFail("CodeTrack-favorite", "offline", "com.taobao.favorites.favoritesdk.category.mtoprequest.ComTaobaoMercuryCreateShareListRequest", "public void setUtdid(long utdid)", "20180112");
        this.utdid = j;
    }

    public void setVERSION(String str) {
        AppMonitor.Alarm.commitFail("CodeTrack-favorite", "offline", "com.taobao.favorites.favoritesdk.category.mtoprequest.ComTaobaoMercuryCreateShareListRequest", "public void setVERSION(String VERSION)", "20180112");
        this.VERSION = str;
    }
}
