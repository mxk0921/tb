package com.taobao.android.dxv4common.exception;

import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class DXResponsiveException extends DXRuntimeException {
    static {
        t2o.a(444597942);
    }

    public DXResponsiveException(String str) {
        super("DXResponsiveException: " + str);
    }

    public DXResponsiveException(String str, Throwable th) {
        super("DXResponsiveException: " + str, th);
    }
}
