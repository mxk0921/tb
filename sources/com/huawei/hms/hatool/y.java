package com.huawei.hms.hatool;

import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class y {
    private static y b;

    /* renamed from: a  reason: collision with root package name */
    private volatile Map<String, p0> f5413a = new HashMap();

    private y() {
    }

    private p0 a(String str) {
        if (!this.f5413a.containsKey(str)) {
            this.f5413a.put(str, new p0());
        }
        return this.f5413a.get(str);
    }

    private static synchronized void b() {
        synchronized (y.class) {
            if (b == null) {
                b = new y();
            }
        }
    }

    public p0 a(String str, long j) {
        p0 a2 = a(str);
        a2.a(j);
        return a2;
    }

    public static y a() {
        if (b == null) {
            b();
        }
        return b;
    }
}
