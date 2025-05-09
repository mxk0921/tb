package com.taobao.alimama.net.pojo.request;

import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.t2o;

/* compiled from: Taobao */
@Deprecated
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class AlimamaCpsSyncERequest implements IMTOPDataObject {
    public String extraParams;
    public String API_NAME = "mtop.alimama.cps.trace.adSession.sync";
    public String VERSION = "1.0";
    public boolean NEED_ECODE = false;
    public boolean NEED_SESSION = false;

    static {
        t2o.a(1018167348);
        t2o.a(589299906);
    }
}
