package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class mi {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final int f24055a;
    public final String b;
    public final String c;
    public Map<String, Object> d;
    public ni e;
    public final String f;

    static {
        t2o.a(79691781);
    }

    public mi(int i, String str, String str2, String str3) {
        this.f = str;
        this.f24055a = i;
        this.b = str2;
        this.c = str3;
    }

    public ni a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ni) ipChange.ipc$dispatch("f4fdc5c2", new Object[]{this});
        }
        return this.e;
    }

    public String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fa4e0476", new Object[]{this});
        }
        return this.b;
    }

    public String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6fba2f7f", new Object[]{this});
        }
        return this.f;
    }

    public Map<String, Object> d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("2812908d", new Object[]{this});
        }
        return this.d;
    }

    public String e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c8c32fc8", new Object[]{this});
        }
        return this.c;
    }

    public int f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5378242a", new Object[]{this})).intValue();
        }
        return this.f24055a;
    }

    public mi g(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mi) ipChange.ipc$dispatch("779de7c3", new Object[]{this, str, obj});
        }
        if (this.d == null) {
            i(new HashMap());
        }
        this.d.put(str, obj);
        return this;
    }

    public void h(ni niVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae86b85e", new Object[]{this, niVar});
        } else {
            this.e = niVar;
        }
    }

    public void i(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ccea8b39", new Object[]{this, map});
        } else {
            this.d = map;
        }
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "AURAError{mType=" + this.f24055a + ", mCode='" + this.b + "', mMessage='" + this.c + "', mDomain='" + this.f + "'}";
    }
}
