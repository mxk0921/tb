package com.taobao.alimama.net.pojo.request;

import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class SendCpsNewInfoRequest implements IMTOPDataObject {
    public String eParam;
    public String eUrl;
    public String API_NAME = "mtop.alimama.cps.trace.aliTrackId.get";
    public String VERSION = "1.0";
    public boolean NEED_ECODE = false;
    public boolean NEED_SESSION = true;

    static {
        t2o.a(1018167355);
        t2o.a(589299906);
    }
}
