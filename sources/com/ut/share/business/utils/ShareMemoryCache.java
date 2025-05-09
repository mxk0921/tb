package com.ut.share.business.utils;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class ShareMemoryCache {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final Map<String, CacheData> cache = new ConcurrentHashMap();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class CacheData<T> {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private long cacheTimeMillis;
        private long expiredTimeMillis;
        public T value;

        static {
            t2o.a(663748663);
        }

        public CacheData(T t, long j, long j2) {
            this.value = t;
            this.cacheTimeMillis = j;
            this.expiredTimeMillis = j2;
        }

        public boolean isExpired() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("a65eada6", new Object[]{this})).booleanValue();
            }
            if (System.currentTimeMillis() > this.cacheTimeMillis + this.expiredTimeMillis) {
                return true;
            }
            return false;
        }
    }

    static {
        t2o.a(663748662);
    }

    public static <T> T getValidData(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("8dd357b1", new Object[]{str});
        }
        CacheData cacheData = cache.get(str);
        if (cacheData == null || cacheData.isExpired()) {
            return null;
        }
        return cacheData.value;
    }

    public static void put(String str, Object obj, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("85ed3e08", new Object[]{str, obj, new Long(j)});
        } else {
            cache.put(str, new CacheData(obj, System.currentTimeMillis(), j));
        }
    }

    public static <T> T remove(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("da166bbd", new Object[]{str});
        }
        return (T) cache.remove(str);
    }
}
