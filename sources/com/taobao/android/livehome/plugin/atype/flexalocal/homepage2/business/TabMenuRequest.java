package com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.business;

import com.taobao.android.livehome.plugin.atype.flexalocal.TaoLiveHomePageX;
import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class TabMenuRequest implements IMTOPDataObject {
    public String appVersion;
    public String channelType;
    public String enableAddH5Tab;
    public String extendParams;
    public String liveHomePageType;
    public String recReasonClkList;
    public String singleStream;
    public String tabSpm;
    public String API_NAME = "mtop.tblive.recommend.videolist.tabmenu";
    public String VERSION = "2.0";
    private boolean NEED_ECODE = false;
    private boolean NEED_SESSION = true;
    public boolean isChannelUpgradation = true;

    static {
        t2o.a(310378630);
        t2o.a(589299906);
    }

    public TabMenuRequest(String str) {
        this.appVersion = TaoLiveHomePageX.getAppVersion(str);
    }
}
