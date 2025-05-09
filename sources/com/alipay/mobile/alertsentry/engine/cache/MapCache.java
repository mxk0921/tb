package com.alipay.mobile.alertsentry.engine.cache;

import java.util.concurrent.ConcurrentHashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class MapCache<K, V> implements MemoryCache<K, V> {
    public MapCache() {
        new ConcurrentHashMap(16);
    }
}
