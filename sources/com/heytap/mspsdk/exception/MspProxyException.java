package com.heytap.mspsdk.exception;

import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class MspProxyException extends MspSdkException {
    static {
        t2o.a(253755414);
    }

    public MspProxyException(Throwable th) {
        super(th.getMessage(), th, -1);
    }

    @Override // java.lang.Throwable
    public synchronized Throwable getCause() {
        return super.getCause();
    }
}
