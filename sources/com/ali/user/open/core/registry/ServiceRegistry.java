package com.ali.user.open.core.registry;

import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public interface ServiceRegistry {
    <T> T getService(Class<T> cls, Map<String, String> map);

    <T> T[] getServices(Class<T> cls, Map<String, String> map);

    ServiceRegistration registerService(Class<?>[] clsArr, Object obj, Map<String, String> map);

    Object unregisterService(ServiceRegistration serviceRegistration);
}
