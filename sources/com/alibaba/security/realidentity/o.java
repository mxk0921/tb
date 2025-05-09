package com.alibaba.security.realidentity;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class o {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String b = "o";
    public static final int c = 1;
    public static final int d = 2;
    public static final int e = 4;
    public static final int f = 5;
    public static final int g = 6;
    public static final int h = 7;
    public static final int i = 8;
    public static final int j = 9;
    public static final int k = 10;
    public static final int l = 11;
    public static final int m = 12;
    public static final int n = 13;
    public static final int o = 14;
    public static final int p = 15;
    public static final int q = 16;
    public static final int r = 17;
    public static final int s = 18;
    public static final int t = 19;
    public static final int u = 20;
    public static final int v = 21;

    /* renamed from: a  reason: collision with root package name */
    public final r f2776a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final o f2777a = new o();

        public static /* synthetic */ o a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (o) ipChange.ipc$dispatch("8e56e6ef", new Object[0]);
            }
            return f2777a;
        }
    }

    public static o b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (o) ipChange.ipc$dispatch("1af711f0", new Object[0]);
        }
        return b.a();
    }

    public void a(int i2, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7fc93e8a", new Object[]{this, new Integer(i2), map});
            return;
        }
        try {
            this.f2776a.a(i2, map == null ? "" : com.alibaba.security.realidentity.b.a((Object) map));
        } catch (Exception e2) {
            com.alibaba.security.realidentity.a.a(b, e2);
        }
    }

    public o() {
        this.f2776a = r.a();
    }

    public void a(int i2, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d36ff2b7", new Object[]{this, new Integer(i2), obj});
            return;
        }
        try {
            this.f2776a.a(i2, obj == null ? "" : com.alibaba.security.realidentity.b.a(obj));
        } catch (Exception e2) {
            com.alibaba.security.realidentity.a.a(b, e2);
        }
    }

    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : c.a(this.f2776a.a(true));
    }
}
