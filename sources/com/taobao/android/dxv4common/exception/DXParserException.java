package com.taobao.android.dxv4common.exception;

import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class DXParserException extends DXRuntimeException {
    static {
        t2o.a(444597941);
    }

    public DXParserException(String str) {
        super("DXParserException: " + str);
    }

    public DXParserException(String str, Throwable th) {
        super("DXParserException: " + str, th);
    }
}
