package com.alibaba.security.ccrc.service.build;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class zb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static volatile zb f2640a;
    public final ConcurrentHashMap<String, ConcurrentHashMap<String, Ab>> b = new ConcurrentHashMap<>();

    public static zb a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (zb) ipChange.ipc$dispatch("e36fdb6a", new Object[0]);
        }
        if (f2640a == null) {
            synchronized (zb.class) {
                try {
                    if (f2640a == null) {
                        f2640a = new zb();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f2640a;
    }

    public void b(String str, String str2) {
        ConcurrentHashMap<String, Ab> b;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65d7b87d", new Object[]{this, str, str2});
        } else if (str != null && str2 != null && (b = b(str)) != null) {
            b.remove(str2);
        }
    }

    private ConcurrentHashMap<String, Ab> b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ConcurrentHashMap) ipChange.ipc$dispatch("51d19f13", new Object[]{this, str});
        }
        if (this.b.containsKey(str)) {
            return this.b.get(str);
        }
        return null;
    }

    public Ab a(String str, String str2) {
        ConcurrentHashMap<String, Ab> b;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Ab) ipChange.ipc$dispatch("72d17fdd", new Object[]{this, str, str2});
        }
        if (str == null || str2 == null || (b = b(str)) == null) {
            return null;
        }
        return b.get(str2);
    }

    public void a(String str, String str2, Ab ab) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5d17a6ff", new Object[]{this, str, str2, ab});
        } else if (str != null && str2 != null) {
            ConcurrentHashMap<String, Ab> b = b(str);
            if (b == null) {
                b = new ConcurrentHashMap<>();
            }
            b.put(str2, ab);
            this.b.put(str, b);
        }
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else if (str != null) {
            this.b.remove(str);
        }
    }
}
