package com.alipay.mobile.common.ipc.api;

import java.lang.reflect.Method;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public interface IPCRetryHandler {
    boolean retryIPCCall(Method method, Object[] objArr, IPCException iPCException, int i);
}
