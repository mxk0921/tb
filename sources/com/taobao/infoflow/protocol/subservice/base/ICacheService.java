package com.taobao.infoflow.protocol.subservice.base;

import com.taobao.infoflow.protocol.subservice.ISubService;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public interface ICacheService extends ISubService {
    public static final String SERVICE_NAME = "CacheService";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public interface a {
        void a(String str);
    }

    <T> T getCacheObject(String str, Class<T> cls);

    a getClickCache();

    void putCacheObject(String str, Object obj);
}
