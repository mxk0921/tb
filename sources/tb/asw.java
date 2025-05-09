package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class asw {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public String f15980a = i6m.DEFAULT_PLAY_RATE;
    public boolean b = false;
    public boolean c = true;
    public boolean d = true;
    public boolean e = true;
    public String f = "true";
    public final boolean g = true;
    public boolean h = false;
    public boolean i = false;
    public boolean j = true;

    static {
        t2o.a(989855747);
    }

    public boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1b50370a", new Object[]{this})).booleanValue();
        }
        return this.i;
    }

    public String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("37908cb7", new Object[]{this});
        }
        return this.f15980a;
    }

    public String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("48aff75a", new Object[]{this});
        }
        return this.f;
    }

    public boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("aba4fc06", new Object[]{this})).booleanValue();
        }
        return this.j;
    }

    public boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4613fb1a", new Object[]{this})).booleanValue();
        }
        return this.b;
    }

    public boolean f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1b14a04c", new Object[]{this})).booleanValue();
        }
        return this.c;
    }

    public boolean g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3306907f", new Object[]{this})).booleanValue();
        }
        return this.e;
    }

    public boolean h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("807e2c98", new Object[]{this})).booleanValue();
        }
        return this.g;
    }

    public boolean i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c101ebca", new Object[]{this})).booleanValue();
        }
        return this.d;
    }

    public void j(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5459190", new Object[]{this, new Boolean(z)});
        } else {
            this.i = z;
        }
    }

    public void k(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b6dbada", new Object[]{this, new Boolean(z)});
        } else {
            this.j = z;
        }
    }

    public void l(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b1f7e9f", new Object[]{this, str});
        } else {
            this.f15980a = str;
        }
    }

    public void m(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cc68179f", new Object[]{this, new Boolean(z)});
        } else {
            this.h = z;
        }
    }

    public void n(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4108b5b6", new Object[]{this, new Boolean(z)});
        } else {
            this.b = z;
        }
    }

    public void o(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1676e754", new Object[]{this, new Boolean(z)});
        } else {
            this.c = z;
        }
    }

    public void p(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fcc2fd81", new Object[]{this, new Boolean(z)});
        } else {
            this.e = z;
        }
    }

    public void q(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4baf3996", new Object[]{this, new Boolean(z)});
        } else {
            this.d = z;
        }
    }

    public void r(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3120af5c", new Object[]{this, str});
        } else {
            this.f = str;
        }
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "WVPerformanceConfig{jsErrorRatio='" + this.f15980a + "', isOpenFSP=" + this.b + ", isOpenH5PP=" + this.c + ", isOpenUserPP=" + this.d + ", isOpenH5_2=" + this.e + ", fSPFilterAnimation='" + this.f + "', openHA=" + this.g + ", onlyBkpg=" + this.h + ", isFilterIllegalUrl=" + this.j + ", closeUCHA=" + this.i + '}';
    }
}
