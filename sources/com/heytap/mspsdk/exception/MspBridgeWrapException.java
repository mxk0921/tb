package com.heytap.mspsdk.exception;

import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class MspBridgeWrapException extends MspSdkException {
    static {
        t2o.a(253755413);
    }

    public MspBridgeWrapException(String str, Throwable th, int i) {
        super("bridge: " + str, th, i);
    }
}
