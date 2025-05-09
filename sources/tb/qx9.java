package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class qx9 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public boolean f26981a;
    public boolean b;
    public boolean c;
    public boolean d;
    public String e = "";

    static {
        t2o.a(352322007);
    }

    public String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a261a7e2", new Object[]{this});
        }
        String str = this.e;
        if (str != null) {
            return str;
        }
        return "";
    }

    public boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e388fb50", new Object[]{this})).booleanValue();
        }
        return this.f26981a;
    }

    public boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1941d462", new Object[]{this})).booleanValue();
        }
        return this.b;
    }

    public boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e47439d2", new Object[]{this})).booleanValue();
        }
        if (!this.f26981a) {
            return false;
        }
        if (this.b || this.c) {
            return true;
        }
        return false;
    }

    public void e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("490716d4", new Object[]{this, str});
        } else {
            this.e = str;
        }
    }

    public void f(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c9cca840", new Object[]{this, new Boolean(z)});
        } else {
            this.f26981a = z;
        }
    }

    public void g(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c391200", new Object[]{this, new Boolean(z)});
        } else {
            this.c = z;
        }
    }

    public void h(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a16bedfe", new Object[]{this, new Boolean(z)});
        } else {
            this.b = z;
        }
    }

    public void i(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f2001d2", new Object[]{this, new Boolean(z)});
        } else {
            this.d = z;
        }
    }

    public boolean j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("85963210", new Object[]{this})).booleanValue();
        }
        return this.c;
    }

    public boolean k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8a96f288", new Object[]{this})).booleanValue();
        }
        return this.d;
    }
}
