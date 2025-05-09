package com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.business;

import com.taobao.android.livehome.plugin.atype.flexalocal.TaoLiveHomePageX;
import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class RankTabRequest implements IMTOPDataObject {
    public String appVersion;
    public String channelType;
    public String extendParams;
    public String liveHomePageType;
    public String tabSpm;
    public String API_NAME = "mtop.tblive.recommend.videolist.ranktab";
    public String VERSION = "1.0";
    private boolean NEED_ECODE = false;
    private boolean NEED_SESSION = true;

    static {
        t2o.a(310378629);
        t2o.a(589299906);
    }

    public RankTabRequest(String str) {
        this.appVersion = TaoLiveHomePageX.getAppVersion(str);
    }
}
