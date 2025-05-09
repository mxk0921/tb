package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class e0g {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public String f18193a;
    public String b;
    public String c;
    public String d;

    static {
        t2o.a(1002438844);
    }

    public final String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b4b88e19", new Object[]{this});
        }
        return this.c;
    }

    public final String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1d101f6b", new Object[]{this});
        }
        return this.f18193a;
    }

    public final String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("abed55cd", new Object[]{this});
        }
        return this.b;
    }

    public final String d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1d0ec7bc", new Object[]{this});
        }
        return this.d;
    }

    public final void e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8203227d", new Object[]{this, str});
        } else {
            this.c = str;
        }
    }

    public final void f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1592426b", new Object[]{this, str});
        } else {
            this.f18193a = str;
        }
    }

    public final void g(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("53fb1fb1", new Object[]{this, str});
        } else {
            this.b = str;
        }
    }

    public final void h(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("707eba2", new Object[]{this, str});
        } else {
            this.d = str;
        }
    }
}
