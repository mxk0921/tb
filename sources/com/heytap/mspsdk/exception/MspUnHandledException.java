package com.heytap.mspsdk.exception;

import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class MspUnHandledException extends MspSdkException {
    static {
        t2o.a(253755416);
    }

    public MspUnHandledException(Throwable th) {
        super("unhandled: " + th.getMessage(), th, -1);
    }
}
