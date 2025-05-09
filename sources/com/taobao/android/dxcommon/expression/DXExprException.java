package com.taobao.android.dxcommon.expression;

import tb.h36;
import tb.t2o;
import tb.xv5;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class DXExprException extends RuntimeException {
    static {
        t2o.a(444597889);
    }

    public DXExprException(String str) {
        super("DXExprException: " + str);
        h36.g("DXExpressionVMNew", "DXExprException: " + str);
    }

    public DXExprException(String str, Throwable th) {
        super("DXExprException: " + str, th);
        h36.g("DXExpressionVMNew", "DXExprException: " + xv5.a(th));
    }
}
