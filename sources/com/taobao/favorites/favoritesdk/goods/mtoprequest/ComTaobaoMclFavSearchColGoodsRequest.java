package com.taobao.favorites.favoritesdk.goods.mtoprequest;

import com.alibaba.mtl.appmonitor.AppMonitor;
import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.t2o;

/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class ComTaobaoMclFavSearchColGoodsRequest implements IMTOPDataObject {
    private String API_NAME = "com.taobao.mcl.fav.searchColGoods";
    private String VERSION = "2.0";
    private boolean NEED_ECODE = true;
    private boolean NEED_SESSION = true;
    private String startTime = null;
    private String keyword = null;
    private long size = 0;

    static {
        t2o.a(707788855);
        t2o.a(589299906);
    }

    public String getAPI_NAME() {
        AppMonitor.Alarm.commitFail("CodeTrack-favorite", "offline", "com.taobao.favorites.favoritesdk.goods.mtoprequest.ComTaobaoMclFavSearchColGoodsRequest", "public String getAPI_NAME()", "20180112");
        return this.API_NAME;
    }

    public String getKeyword() {
        AppMonitor.Alarm.commitFail("CodeTrack-favorite", "offline", "com.taobao.favorites.favoritesdk.goods.mtoprequest.ComTaobaoMclFavSearchColGoodsRequest", "public String getKeyword()", "20180112");
        return this.keyword;
    }

    public long getSize() {
        AppMonitor.Alarm.commitFail("CodeTrack-favorite", "offline", "com.taobao.favorites.favoritesdk.goods.mtoprequest.ComTaobaoMclFavSearchColGoodsRequest", "public long getSize()", "20180112");
        return this.size;
    }

    public String getStartTime() {
        AppMonitor.Alarm.commitFail("CodeTrack-favorite", "offline", "com.taobao.favorites.favoritesdk.goods.mtoprequest.ComTaobaoMclFavSearchColGoodsRequest", "public String getStartTime()", "20180112");
        return this.startTime;
    }

    public String getVERSION() {
        AppMonitor.Alarm.commitFail("CodeTrack-favorite", "offline", "com.taobao.favorites.favoritesdk.goods.mtoprequest.ComTaobaoMclFavSearchColGoodsRequest", "public String getVERSION()", "20180112");
        return this.VERSION;
    }

    public boolean isNEED_ECODE() {
        AppMonitor.Alarm.commitFail("CodeTrack-favorite", "offline", "com.taobao.favorites.favoritesdk.goods.mtoprequest.ComTaobaoMclFavSearchColGoodsRequest", "public boolean isNEED_ECODE()", "20180112");
        return this.NEED_ECODE;
    }

    public boolean isNEED_SESSION() {
        AppMonitor.Alarm.commitFail("CodeTrack-favorite", "offline", "com.taobao.favorites.favoritesdk.goods.mtoprequest.ComTaobaoMclFavSearchColGoodsRequest", "public boolean isNEED_SESSION()", "20180112");
        return this.NEED_SESSION;
    }

    public void setAPI_NAME(String str) {
        AppMonitor.Alarm.commitFail("CodeTrack-favorite", "offline", "com.taobao.favorites.favoritesdk.goods.mtoprequest.ComTaobaoMclFavSearchColGoodsRequest", "public void setAPI_NAME(String API_NAME)", "20180112");
        this.API_NAME = str;
    }

    public void setKeyword(String str) {
        AppMonitor.Alarm.commitFail("CodeTrack-favorite", "offline", "com.taobao.favorites.favoritesdk.goods.mtoprequest.ComTaobaoMclFavSearchColGoodsRequest", "public void setKeyword(String keyword)", "20180112");
        this.keyword = str;
    }

    public void setNEED_ECODE(boolean z) {
        AppMonitor.Alarm.commitFail("CodeTrack-favorite", "offline", "com.taobao.favorites.favoritesdk.goods.mtoprequest.ComTaobaoMclFavSearchColGoodsRequest", "public void setNEED_ECODE(boolean NEED_ECODE)", "20180112");
        this.NEED_ECODE = z;
    }

    public void setNEED_SESSION(boolean z) {
        AppMonitor.Alarm.commitFail("CodeTrack-favorite", "offline", "com.taobao.favorites.favoritesdk.goods.mtoprequest.ComTaobaoMclFavSearchColGoodsRequest", "public void setNEED_SESSION(boolean NEED_SESSION)", "20180112");
        this.NEED_SESSION = z;
    }

    public void setSize(long j) {
        AppMonitor.Alarm.commitFail("CodeTrack-favorite", "offline", "com.taobao.favorites.favoritesdk.goods.mtoprequest.ComTaobaoMclFavSearchColGoodsRequest", "public void setSize(long size)", "20180112");
        this.size = j;
    }

    public void setStartTime(String str) {
        AppMonitor.Alarm.commitFail("CodeTrack-favorite", "offline", "com.taobao.favorites.favoritesdk.goods.mtoprequest.ComTaobaoMclFavSearchColGoodsRequest", "public void setStartTime(String startTime)", "20180112");
        this.startTime = str;
    }

    public void setVERSION(String str) {
        AppMonitor.Alarm.commitFail("CodeTrack-favorite", "offline", "com.taobao.favorites.favoritesdk.goods.mtoprequest.ComTaobaoMclFavSearchColGoodsRequest", "public void setVERSION(String VERSION)", "20180112");
        this.VERSION = str;
    }
}
