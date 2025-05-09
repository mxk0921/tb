package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class h3i {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public String f20390a;
    public String b;
    public boolean c = true;
    public boolean d;

    static {
        t2o.a(297795623);
    }

    public String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5826992f", new Object[]{this});
        }
        return this.f20390a;
    }

    public String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7bdc289f", new Object[]{this});
        }
        return this.b;
    }

    public boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("68f205a4", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1f7c881e", new Object[]{this})).booleanValue();
        }
        return this.d;
    }

    public boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ef79c53d", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public boolean f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("38d9a456", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public boolean g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ef70cb59", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public boolean h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("394f4145", new Object[]{this})).booleanValue();
        }
        return this.c;
    }

    public h3i i(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (h3i) ipChange.ipc$dispatch("decc4279", new Object[]{this, new Boolean(z)});
        }
        this.d = z;
        return this;
    }

    public h3i j(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (h3i) ipChange.ipc$dispatch("4dc0c7cc", new Object[]{this, str});
        }
        this.f20390a = str;
        return this;
    }

    public h3i k(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (h3i) ipChange.ipc$dispatch("540ab2a4", new Object[]{this, str});
        }
        this.b = str;
        return this;
    }

    public h3i l(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (h3i) ipChange.ipc$dispatch("af6ad6f0", new Object[]{this, new Boolean(z)});
        }
        this.c = z;
        return this;
    }
}
