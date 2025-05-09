package com.alipay.mobile.common.ipc.api;

import com.alipay.mobile.common.ipc.api.aidl.IIPCManager;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public interface IPCCallManager {
    <T> T getIpcProxy(Class<T> cls);

    void setIIPCManager(IIPCManager iIPCManager);

    void setIPCCallRetryHandler(IPCRetryHandler iPCRetryHandler);
}
