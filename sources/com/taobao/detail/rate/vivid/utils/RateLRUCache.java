package com.taobao.detail.rate.vivid.utils;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class RateLRUCache<T, F> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final int f10377a;
    public final LinkedHashMap<T, F> b;

    public RateLRUCache(int i, int i2) {
        this.f10377a = Math.max(3, i2);
        this.b = new LinkedHashMap<T, F>(i, 0.75f, true) { // from class: com.taobao.detail.rate.vivid.utils.RateLRUCache.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass1 r2, String str, Object... objArr) {
                str.hashCode();
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/detail/rate/vivid/utils/RateLRUCache$1");
            }

            @Override // java.util.LinkedHashMap
            public boolean removeEldestEntry(Map.Entry<T, F> entry) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Boolean) ipChange.ipc$dispatch("6471a6cf", new Object[]{this, entry})).booleanValue();
                }
                if (size() > RateLRUCache.a(RateLRUCache.this)) {
                    return true;
                }
                return false;
            }
        };
    }

    public static /* synthetic */ int a(RateLRUCache rateLRUCache) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f5f9bb97", new Object[]{rateLRUCache})).intValue();
        }
        return rateLRUCache.f10377a;
    }

    public F b(T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (F) ipChange.ipc$dispatch("83ba8cd9", new Object[]{this, t});
        }
        return this.b.get(t);
    }

    public void c(T t, F f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("360f65ce", new Object[]{this, t, f});
        } else {
            this.b.put(t, f);
        }
    }

    public void d(T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec2dfe27", new Object[]{this, t});
        } else {
            this.b.remove(t);
        }
    }
}
