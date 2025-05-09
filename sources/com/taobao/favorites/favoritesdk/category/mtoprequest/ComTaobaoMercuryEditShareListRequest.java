package com.taobao.favorites.favoritesdk.category.mtoprequest;

import com.alibaba.mtl.appmonitor.AppMonitor;
import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.t2o;

/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class ComTaobaoMercuryEditShareListRequest implements IMTOPDataObject {
    private String API_NAME = "com.taobao.mercury.editShareList";
    private String VERSION = "1.0";
    private boolean NEED_ECODE = true;
    private boolean NEED_SESSION = true;
    private String appName = null;
    private long isSync = 0;
    private String utdid = null;
    private long source = 0;
    private long listId = 0;
    private long categoryType = 0;
    private String deleteList = null;
    private long type = 0;
    private String categoryDesc = null;
    private String newCategoryName = null;
    private String oldCategoryName = null;
    private String addList = null;

    static {
        t2o.a(707788840);
        t2o.a(589299906);
    }

    public String getAPI_NAME() {
        AppMonitor.Alarm.commitFail("CodeTrack-favorite", "offline", "com.taobao.favorites.favoritesdk.category.mtoprequest.ComTaobaoMercuryEditShareListRequest", "public String getAPI_NAME()", "20180112");
        return this.API_NAME;
    }

    public String getAddList() {
        AppMonitor.Alarm.commitFail("CodeTrack-favorite", "offline", "com.taobao.favorites.favoritesdk.category.mtoprequest.ComTaobaoMercuryEditShareListRequest", "public String getAddList()", "20180112");
        return this.addList;
    }

    public String getAppName() {
        AppMonitor.Alarm.commitFail("CodeTrack-favorite", "offline", "com.taobao.favorites.favoritesdk.category.mtoprequest.ComTaobaoMercuryEditShareListRequest", "public String getAppName()", "20180112");
        return this.appName;
    }

    public String getCategoryDesc() {
        AppMonitor.Alarm.commitFail("CodeTrack-favorite", "offline", "com.taobao.favorites.favoritesdk.category.mtoprequest.ComTaobaoMercuryEditShareListRequest", "public String getCategoryDesc()", "20180112");
        return this.categoryDesc;
    }

    public long getCategoryType() {
        AppMonitor.Alarm.commitFail("CodeTrack-favorite", "offline", "com.taobao.favorites.favoritesdk.category.mtoprequest.ComTaobaoMercuryEditShareListRequest", "public long getCategoryType()", "20180112");
        return this.categoryType;
    }

    public String getDeleteList() {
        AppMonitor.Alarm.commitFail("CodeTrack-favorite", "offline", "com.taobao.favorites.favoritesdk.category.mtoprequest.ComTaobaoMercuryEditShareListRequest", "public String getDeleteList()", "20180112");
        return this.deleteList;
    }

    public long getIsSync() {
        AppMonitor.Alarm.commitFail("CodeTrack-favorite", "offline", "com.taobao.favorites.favoritesdk.category.mtoprequest.ComTaobaoMercuryEditShareListRequest", "public long getIsSync()", "20180112");
        return this.isSync;
    }

    public long getListId() {
        AppMonitor.Alarm.commitFail("CodeTrack-favorite", "offline", "com.taobao.favorites.favoritesdk.category.mtoprequest.ComTaobaoMercuryEditShareListRequest", "public long getListId()", "20180112");
        return this.listId;
    }

    public String getNewCategoryName() {
        AppMonitor.Alarm.commitFail("CodeTrack-favorite", "offline", "com.taobao.favorites.favoritesdk.category.mtoprequest.ComTaobaoMercuryEditShareListRequest", "public String getNewCategoryName()", "20180112");
        return this.newCategoryName;
    }

    public String getOldCategoryName() {
        AppMonitor.Alarm.commitFail("CodeTrack-favorite", "offline", "com.taobao.favorites.favoritesdk.category.mtoprequest.ComTaobaoMercuryEditShareListRequest", "public String getOldCategoryName()", "20180112");
        return this.oldCategoryName;
    }

    public long getSource() {
        AppMonitor.Alarm.commitFail("CodeTrack-favorite", "offline", "com.taobao.favorites.favoritesdk.category.mtoprequest.ComTaobaoMercuryEditShareListRequest", "public long getSource()", "20180112");
        return this.source;
    }

    public long getType() {
        AppMonitor.Alarm.commitFail("CodeTrack-favorite", "offline", "com.taobao.favorites.favoritesdk.category.mtoprequest.ComTaobaoMercuryEditShareListRequest", "public long getType()", "20180112");
        return this.type;
    }

    public String getUtdid() {
        AppMonitor.Alarm.commitFail("CodeTrack-favorite", "offline", "com.taobao.favorites.favoritesdk.category.mtoprequest.ComTaobaoMercuryEditShareListRequest", "public String getUtdid()", "20180112");
        return this.utdid;
    }

    public String getVERSION() {
        AppMonitor.Alarm.commitFail("CodeTrack-favorite", "offline", "com.taobao.favorites.favoritesdk.category.mtoprequest.ComTaobaoMercuryEditShareListRequest", "public String getVERSION()", "20180112");
        return this.VERSION;
    }

    public boolean isNEED_ECODE() {
        AppMonitor.Alarm.commitFail("CodeTrack-favorite", "offline", "com.taobao.favorites.favoritesdk.category.mtoprequest.ComTaobaoMercuryEditShareListRequest", "public boolean isNEED_ECODE()", "20180112");
        return this.NEED_ECODE;
    }

    public boolean isNEED_SESSION() {
        AppMonitor.Alarm.commitFail("CodeTrack-favorite", "offline", "com.taobao.favorites.favoritesdk.category.mtoprequest.ComTaobaoMercuryEditShareListRequest", "public boolean isNEED_SESSION()", "20180112");
        return this.NEED_SESSION;
    }

    public void setAPI_NAME(String str) {
        AppMonitor.Alarm.commitFail("CodeTrack-favorite", "offline", "com.taobao.favorites.favoritesdk.category.mtoprequest.ComTaobaoMercuryEditShareListRequest", "public void setAPI_NAME(String API_NAME)", "20180112");
        this.API_NAME = str;
    }

    public void setAddList(String str) {
        AppMonitor.Alarm.commitFail("CodeTrack-favorite", "offline", "com.taobao.favorites.favoritesdk.category.mtoprequest.ComTaobaoMercuryEditShareListRequest", "public void setAddList(String addList)", "20180112");
        this.addList = str;
    }

    public void setAppName(String str) {
        AppMonitor.Alarm.commitFail("CodeTrack-favorite", "offline", "com.taobao.favorites.favoritesdk.category.mtoprequest.ComTaobaoMercuryEditShareListRequest", "public void setAppName(String appName)", "20180112");
        this.appName = str;
    }

    public void setCategoryDesc(String str) {
        AppMonitor.Alarm.commitFail("CodeTrack-favorite", "offline", "com.taobao.favorites.favoritesdk.category.mtoprequest.ComTaobaoMercuryEditShareListRequest", "public void setCategoryDesc(String categoryDesc)", "20180112");
        this.categoryDesc = str;
    }

    public void setCategoryType(long j) {
        AppMonitor.Alarm.commitFail("CodeTrack-favorite", "offline", "com.taobao.favorites.favoritesdk.category.mtoprequest.ComTaobaoMercuryEditShareListRequest", "public void setCategoryType(long categoryType)", "20180112");
        this.categoryType = j;
    }

    public void setDeleteList(String str) {
        AppMonitor.Alarm.commitFail("CodeTrack-favorite", "offline", "com.taobao.favorites.favoritesdk.category.mtoprequest.ComTaobaoMercuryEditShareListRequest", "public void setDeleteList(String deleteList)", "20180112");
        this.deleteList = str;
    }

    public void setIsSync(long j) {
        AppMonitor.Alarm.commitFail("CodeTrack-favorite", "offline", "com.taobao.favorites.favoritesdk.category.mtoprequest.ComTaobaoMercuryEditShareListRequest", "public void setIsSync(long isSync)", "20180112");
        this.isSync = j;
    }

    public void setListId(long j) {
        AppMonitor.Alarm.commitFail("CodeTrack-favorite", "offline", "com.taobao.favorites.favoritesdk.category.mtoprequest.ComTaobaoMercuryEditShareListRequest", "public void setListId(long listId)", "20180112");
        this.listId = j;
    }

    public void setNEED_ECODE(boolean z) {
        AppMonitor.Alarm.commitFail("CodeTrack-favorite", "offline", "com.taobao.favorites.favoritesdk.category.mtoprequest.ComTaobaoMercuryEditShareListRequest", "public void setNEED_ECODE(boolean NEED_ECODE)", "20180112");
        this.NEED_ECODE = z;
    }

    public void setNEED_SESSION(boolean z) {
        AppMonitor.Alarm.commitFail("CodeTrack-favorite", "offline", "com.taobao.favorites.favoritesdk.category.mtoprequest.ComTaobaoMercuryEditShareListRequest", "public void setNEED_SESSION(boolean NEED_SESSION)", "20180112");
        this.NEED_SESSION = z;
    }

    public void setNewCategoryName(String str) {
        AppMonitor.Alarm.commitFail("CodeTrack-favorite", "offline", "com.taobao.favorites.favoritesdk.category.mtoprequest.ComTaobaoMercuryEditShareListRequest", "public void setNewCategoryName(String newCategoryName)", "20180112");
        this.newCategoryName = str;
    }

    public void setOldCategoryName(String str) {
        AppMonitor.Alarm.commitFail("CodeTrack-favorite", "offline", "com.taobao.favorites.favoritesdk.category.mtoprequest.ComTaobaoMercuryEditShareListRequest", "public void setOldCategoryName(String oldCategoryName)", "20180112");
        this.oldCategoryName = str;
    }

    public void setSource(long j) {
        AppMonitor.Alarm.commitFail("CodeTrack-favorite", "offline", "com.taobao.favorites.favoritesdk.category.mtoprequest.ComTaobaoMercuryEditShareListRequest", "public void setSource(long source)", "20180112");
        this.source = j;
    }

    public void setType(long j) {
        AppMonitor.Alarm.commitFail("CodeTrack-favorite", "offline", "com.taobao.favorites.favoritesdk.category.mtoprequest.ComTaobaoMercuryEditShareListRequest", "public void setType(long type)", "20180112");
        this.type = j;
    }

    public void setUtdid(String str) {
        AppMonitor.Alarm.commitFail("CodeTrack-favorite", "offline", "com.taobao.favorites.favoritesdk.category.mtoprequest.ComTaobaoMercuryEditShareListRequest", "public void setUtdid(String utdid)", "20180112");
        this.utdid = str;
    }

    public void setVERSION(String str) {
        AppMonitor.Alarm.commitFail("CodeTrack-favorite", "offline", "com.taobao.favorites.favoritesdk.category.mtoprequest.ComTaobaoMercuryEditShareListRequest", "public void setVERSION(String VERSION)", "20180112");
        this.VERSION = str;
    }
}
