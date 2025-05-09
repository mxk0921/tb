package com.alipay.mobile.common.ipc.api;

import com.alipay.mobile.common.ipc.api.aidl.IPCParameter;
import com.alipay.mobile.common.ipc.api.aidl.IPCResult;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public interface LocalCallRetryHandler {
    boolean retryLocalCall(IPCParameter iPCParameter, IPCResult iPCResult, ServiceBeanManager serviceBeanManager, int i);
}
