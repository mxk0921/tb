package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class ozt {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int SOURCE_AMDC = 2;
    public static final int SOURCE_LOCAL_DNS = 1;
    public static final int TYPE_IPV6 = 1;
    public static final int TYPE_NORMAL = 0;
    public static final int TYPE_STATIC_BANDWIDTH = 2;

    /* renamed from: a  reason: collision with root package name */
    public String f25773a = "";
    public int b = 443;
    public int c = 0;
    public int d = 1;

    static {
        t2o.a(962592946);
    }

    public String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c9fd6f9b", new Object[]{this});
        }
        return this.f25773a;
    }

    public int b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a73231f1", new Object[]{this})).intValue();
        }
        return this.b;
    }

    public int c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("abef1f0b", new Object[]{this})).intValue();
        }
        return this.d;
    }

    public int d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5378242a", new Object[]{this})).intValue();
        }
        return this.c;
    }

    public void e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a2fc43b", new Object[]{this, str});
        } else {
            this.f25773a = str;
        }
    }

    public void f(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9b684139", new Object[]{this, new Integer(i)});
        } else {
            this.b = i;
        }
    }

    public void g(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("685aaa5f", new Object[]{this, new Integer(i)});
        } else {
            this.d = i;
        }
    }

    public void h(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("77e09620", new Object[]{this, new Integer(i)});
        } else {
            this.c = i;
        }
    }
}
