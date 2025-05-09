package com.taobao.android.festival.business.data;

import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.k75;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class FestivalRequest implements IMTOPDataObject {
    public String version;
    public String API_NAME = "mtop.taobao.wireless.homepage.loadAtmosphere";
    public String VERSION = k75.VIDEOCONFIG_API_VERSION_3;
    public boolean NEED_ECODE = false;
    public boolean NEED_SESSION = true;

    static {
        t2o.a(464519188);
        t2o.a(589299906);
    }
}
