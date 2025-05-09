package com.alipay.mobile.common.ipc.api;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public interface ServiceBeanManager {
    Object getServiceBean(String str);

    int getServiceBeanCount();

    void register(String str, Object obj);

    void registerAndOverride(String str, Object obj);

    void unregister(String str);

    void unregisterAll();
}
