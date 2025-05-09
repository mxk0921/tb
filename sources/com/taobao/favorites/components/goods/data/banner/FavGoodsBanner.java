package com.taobao.favorites.components.goods.data.banner;

import com.alibaba.mtl.appmonitor.AppMonitor;
import java.io.Serializable;
import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class FavGoodsBanner implements IMTOPDataObject, Serializable {
    public String bgColor;
    public String contentURL;
    public boolean isShowed = false;
    public String textColor;
    public String title;
    public int version;

    static {
        t2o.a(707788824);
        t2o.a(589299906);
    }

    public String toString() {
        AppMonitor.Alarm.commitFail("CodeTrack-favorite", "offline", "com.taobao.favorites.components.goods.data.banner.FavGoodsBanner", "public String toString()", "20180112");
        return "title=" + this.title + ", contentURL=" + this.contentURL + ", textColor=" + this.textColor + ",bgColor=" + this.bgColor + ", version=" + this.version;
    }
}
