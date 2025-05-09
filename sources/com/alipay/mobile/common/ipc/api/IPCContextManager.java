package com.alipay.mobile.common.ipc.api;

import android.content.Context;
import com.alipay.mobile.common.ipc.api.aidl.IIPCManager;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public interface IPCContextManager {
    IPCCallManager getIpcCallManager();

    LocalCallManager getLocalCallManager();

    ServiceBeanManager getServiceBeanManager();

    void init(Context context, IIPCManager iIPCManager);

    void resetIIPCManager();
}
