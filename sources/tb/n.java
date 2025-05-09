package tb;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.alibaba.ut.abtest.UTABEnvironment;
import com.alibaba.ut.abtest.UTABMethod;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class n {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static n s;

    /* renamed from: a  reason: collision with root package name */
    public volatile Context f24423a;
    public UTABEnvironment b;
    public boolean c;
    public volatile Boolean d;
    public volatile UTABMethod e;
    public boolean f = true;
    public ur8 g;
    public dw6 h;
    public l49 i;
    public ug4 j;
    public nau k;
    public o3m l;
    public c6n m;
    public mv6 n;
    public volatile jl8 o;
    public iaj p;
    public String q;
    public String r;

    static {
        t2o.a(961544314);
    }

    public static synchronized n j() {
        synchronized (n.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (n) ipChange.ipc$dispatch("defc564a", new Object[0]);
            }
            if (s == null) {
                s = new n();
            }
            return s;
        }
    }

    public void A() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a2dade89", new Object[]{this});
            return;
        }
        this.q = bqm.a().d("uid", null);
        this.r = bqm.a().d("un", null);
        ogh.e("ABContext", "获取本地存储用户信息. userId=" + this.q + ", userNick=" + this.r);
    }

    public ug4 a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ug4) ipChange.ipc$dispatch("aaa17ce", new Object[]{this});
        }
        if (this.j == null) {
            synchronized (this) {
                try {
                    if (this.j == null) {
                        this.j = new wg4();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.j;
    }

    public Context b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("e1727078", new Object[]{this});
        }
        if (this.f24423a == null) {
            return wyv.b();
        }
        return this.f24423a;
    }

    public UTABMethod c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (UTABMethod) ipChange.ipc$dispatch("ee1067f8", new Object[]{this});
        }
        return this.e;
    }

    public mv6 d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mv6) ipChange.ipc$dispatch("508c844d", new Object[]{this});
        }
        if (this.n == null) {
            synchronized (this) {
                try {
                    if (this.n == null) {
                        this.n = new nv6();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.n;
    }

    public dw6 e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (dw6) ipChange.ipc$dispatch("d4077291", new Object[]{this});
        }
        if (this.h == null) {
            synchronized (this) {
                try {
                    if (this.h == null) {
                        this.h = new jw6();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.h;
    }

    public UTABEnvironment f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (UTABEnvironment) ipChange.ipc$dispatch("9f3107cf", new Object[]{this});
        }
        return this.b;
    }

    public jl8 g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jl8) ipChange.ipc$dispatch("b0def0b0", new Object[]{this});
        }
        if (this.o == null) {
            synchronized (this) {
                try {
                    if (this.o == null) {
                        this.o = new kl8();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.o;
    }

    public ur8 h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ur8) ipChange.ipc$dispatch("7178d78d", new Object[]{this});
        }
        if (this.g == null) {
            synchronized (this) {
                try {
                    if (this.g == null) {
                        this.g = new vr8();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.g;
    }

    public l49 i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (l49) ipChange.ipc$dispatch("f0f0616d", new Object[]{this});
        }
        if (this.i == null) {
            synchronized (this) {
                try {
                    if (this.i == null) {
                        this.i = new m49();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.i;
    }

    public iaj k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (iaj) ipChange.ipc$dispatch("c2260b22", new Object[]{this});
        }
        if (this.p == null) {
            synchronized (this) {
                try {
                    if (this.p == null) {
                        this.p = new jaj();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.p;
    }

    public o3m l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (o3m) ipChange.ipc$dispatch("e50299ee", new Object[]{this});
        }
        if (this.l == null) {
            synchronized (this) {
                try {
                    if (this.l == null) {
                        this.l = new p3m();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.l;
    }

    public c6n m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c6n) ipChange.ipc$dispatch("53bf2de6", new Object[]{this});
        }
        if (this.m == null) {
            synchronized (this) {
                try {
                    if (this.m == null) {
                        this.m = new d6n();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.m;
    }

    public nau n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (nau) ipChange.ipc$dispatch("d3f7db83", new Object[]{this});
        }
        if (this.k == null) {
            synchronized (this) {
                try {
                    if (this.k == null) {
                        this.k = new pau();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.k;
    }

    public String o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("58ad3b3d", new Object[]{this});
        }
        return this.q;
    }

    public String p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f467ca35", new Object[]{this});
        }
        return this.r;
    }

    public boolean q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e1018317", new Object[]{this})).booleanValue();
        }
        return this.c;
    }

    public boolean r() {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e98530ce", new Object[]{this})).booleanValue();
        }
        if (this.d == null) {
            try {
                if (this.f24423a == null) {
                    return false;
                }
                if ((this.f24423a.getApplicationInfo().flags & 2) != 0) {
                    z = true;
                }
                this.d = Boolean.valueOf(z);
            } catch (Throwable th) {
                Log.e("EVO.ABContext", "Debug 包判断失败", th);
                this.d = Boolean.FALSE;
            }
        }
        return this.d.booleanValue();
    }

    public boolean s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c222adee", new Object[]{this})).booleanValue();
        }
        return this.f;
    }

    public void t(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a164154", new Object[]{this, context});
        } else {
            this.f24423a = context;
        }
    }

    public void u(UTABMethod uTABMethod) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f600a0c", new Object[]{this, uTABMethod});
            return;
        }
        ogh.e("ABContext", "setCurrentApiMethod, apiMethod=" + uTABMethod + ", currentApiMethod=" + this.e);
        if (this.e == null || this.e != uTABMethod) {
            this.e = uTABMethod;
            if (this.e == UTABMethod.Pull) {
                m().destory();
            }
        }
    }

    public void v(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f123f59", new Object[]{this, new Boolean(z)});
        } else {
            this.c = z;
        }
    }

    public void w(UTABEnvironment uTABEnvironment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("be05363", new Object[]{this, uTABEnvironment});
        } else {
            this.b = uTABEnvironment;
        }
    }

    public void x(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("421473f2", new Object[]{this, new Boolean(z)});
        } else {
            this.f = z;
        }
    }

    public void y(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ca419d9", new Object[]{this, str});
            return;
        }
        this.q = bsq.d(str);
        bqm.a().h("uid", this.q);
        if (!TextUtils.isEmpty(str)) {
            bqm.a().h("luid", this.q);
        }
    }

    public void z(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("236ed6e1", new Object[]{this, str});
            return;
        }
        this.r = bsq.d(str);
        bqm.a().h("un", this.r);
        if (!TextUtils.isEmpty(str)) {
            bqm.a().h("lun", this.r);
        }
    }
}
