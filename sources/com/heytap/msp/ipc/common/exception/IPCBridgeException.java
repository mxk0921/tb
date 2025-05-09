package com.heytap.msp.ipc.common.exception;

import com.heytap.mspsdk.exception.MspSdkException;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class IPCBridgeException extends MspSdkException {
    static {
        t2o.a(253755399);
    }

    public IPCBridgeException(String str, int i) {
        super(i, str);
    }

    public IPCBridgeException(String str, Throwable th, int i) {
        super(str, th, i);
    }

    public IPCBridgeException(Throwable th, int i) {
        super(th.getMessage(), th, i);
    }
}
