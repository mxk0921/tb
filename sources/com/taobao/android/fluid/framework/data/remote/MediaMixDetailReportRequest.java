package com.taobao.android.fluid.framework.data.remote;

import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public final class MediaMixDetailReportRequest implements IMTOPDataObject {
    public String contentId;
    public String source = null;
    public String type = null;
    public String extendParameters = null;
    public String eventType = null;
    private final String API_NAME = "mtop.taobao.content.detail.mix.report";
    private final String VERSION = "1.0";
    private final boolean NEED_ECODE = false;
    private final boolean NEED_SESSION = true;

    static {
        t2o.a(468714232);
        t2o.a(589299906);
    }
}
