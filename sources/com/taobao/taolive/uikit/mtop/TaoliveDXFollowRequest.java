package com.taobao.taolive.uikit.mtop;

import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.k75;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class TaoliveDXFollowRequest implements IMTOPDataObject {
    private String API_NAME = "mtop.taobao.social.follow.weitao.add";
    private String VERSION = k75.VIDEOCONFIG_API_VERSION_3;
    private boolean NEED_ECODE = true;
    private boolean NEED_SESSION = true;
    public String originBiz = "taoliveSearch";
    public String originFlag = "";
    public String originPage = "Page_TaoLiveSearch";
    public String accountType = "2";
    public String pubAccountId = "";
    public String option = "1";

    static {
        t2o.a(779093640);
        t2o.a(589299906);
    }
}
