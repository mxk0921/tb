package com.taobao.android.fluid.business.usertrack.track.mtop.mtoptracker;

import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public final class ExpMonitorRequest implements IMTOPDataObject {
    public String sid;
    public String source;
    public String type;
    private final String API_NAME = "mtop.mediainteraction.video.experience.report";
    private String VERSION = "1.0";
    private boolean NEED_ECODE = false;
    private boolean NEED_SESSION = true;
    public String body = null;

    static {
        t2o.a(468713590);
        t2o.a(589299906);
    }

    public String getApi() {
        return "mtop.mediainteraction.video.experience.report";
    }
}
