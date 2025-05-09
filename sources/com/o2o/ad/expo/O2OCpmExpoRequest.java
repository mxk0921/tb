package com.o2o.ad.expo;

import java.io.Serializable;
import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class O2OCpmExpoRequest implements IMTOPDataObject, Serializable {
    public final String API_NAME = O2OExpoCommitter.API_NAME;
    public String VERSION = "1.0";
    public boolean NEED_ECODE = false;
    public boolean NEED_SESSION = false;

    static {
        t2o.a(1019215899);
        t2o.a(589299906);
    }
}
