package com.taobao.android.livehome.plugin.atype.flexalocal.business.search;

import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.k75;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class TaoLiveHotKeyRequest implements IMTOPDataObject {
    public String source;
    public String API_NAME = "mtop.mediaplatform.live.hotquery";
    public String VERSION = k75.VIDEOCONFIG_API_VERSION_3;
    public int n = 5;
    private boolean NEED_ECODE = false;
    private boolean NEED_SESSION = false;

    static {
        t2o.a(310378524);
        t2o.a(589299906);
    }
}
