package com.taobao.android.dxv4common.exception;

import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class DXAnimationException extends DXRuntimeException {
    static {
        t2o.a(444597939);
    }

    public DXAnimationException(String str) {
        super("DXAnimationException: " + str);
    }

    public DXAnimationException(String str, Throwable th) {
        super("DXAnimationException: " + str, th);
    }
}
