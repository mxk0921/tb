package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.common.Constants;
import tb.phc;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class j0t {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public String f21694a = "";
    public String b = "";
    public String c = "";
    public String d = "";
    public String e = "";
    public boolean f;
    public g1a<? super String, xhv> g;

    static {
        t2o.a(1010827286);
    }

    public static final xhv B(final g1a g1aVar, j0t j0tVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xhv) ipChange.ipc$dispatch("7d1fe48e", new Object[]{g1aVar, j0tVar, new Boolean(z)});
        }
        if (!z) {
            g1aVar.invoke(Boolean.FALSE);
            return xhv.INSTANCE;
        }
        mhr.O().q(j0tVar.c, j0tVar.e, new g1a() { // from class: tb.h0t
            @Override // tb.g1a
            public final Object invoke(Object obj) {
                xhv C;
                C = j0t.C(g1a.this, (String) obj);
                return C;
            }
        }, new g1a() { // from class: tb.pzs
            @Override // tb.g1a
            public final Object invoke(Object obj) {
                xhv D;
                D = j0t.D(g1a.this, (n0g) obj);
                return D;
            }
        });
        return xhv.INSTANCE;
    }

    public static final xhv C(g1a g1aVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xhv) ipChange.ipc$dispatch("64b66a59", new Object[]{g1aVar, str});
        }
        g1aVar.invoke(Boolean.TRUE);
        return xhv.INSTANCE;
    }

    public static final xhv D(g1a g1aVar, n0g n0gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xhv) ipChange.ipc$dispatch("446df01b", new Object[]{g1aVar, n0gVar});
        }
        ckf.g(n0gVar, Constants.SEND_TYPE_RES);
        g1aVar.invoke(Boolean.FALSE);
        return xhv.INSTANCE;
    }

    public static final xhv n(j0t j0tVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xhv) ipChange.ipc$dispatch("8ec5b141", new Object[]{j0tVar, new Boolean(z)});
        }
        if (z) {
            j0tVar.u();
            j0tVar.v();
        } else {
            j0tVar.l(false);
        }
        return xhv.INSTANCE;
    }

    public static final xhv p(g1a g1aVar, f0g f0gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xhv) ipChange.ipc$dispatch("3c63185b", new Object[]{g1aVar, f0gVar});
        }
        ckf.g(f0gVar, Constants.SEND_TYPE_RES);
        g1aVar.invoke(Boolean.TRUE);
        return xhv.INSTANCE;
    }

    public static final xhv q(g1a g1aVar, j0t j0tVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xhv) ipChange.ipc$dispatch("db64bf81", new Object[]{g1aVar, j0tVar});
        }
        g1aVar.invoke(Boolean.FALSE);
        f1t.INSTANCE.p(j0tVar.c);
        return xhv.INSTANCE;
    }

    public static final xhv r(g1a g1aVar, j0t j0tVar, n0g n0gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xhv) ipChange.ipc$dispatch("555d928d", new Object[]{g1aVar, j0tVar, n0gVar});
        }
        ckf.g(n0gVar, Constants.SEND_TYPE_RES);
        g1aVar.invoke(Boolean.FALSE);
        f1t.INSTANCE.p(j0tVar.c);
        return xhv.INSTANCE;
    }

    public static final xhv t(j0t j0tVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xhv) ipChange.ipc$dispatch("a4fa1050", new Object[]{j0tVar, new Boolean(z)});
        }
        if (z) {
            f1t.INSTANCE.p(j0tVar.c);
            j0tVar.z();
        } else {
            j0tVar.l(false);
        }
        return xhv.INSTANCE;
    }

    public static final xhv w(final j0t j0tVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xhv) ipChange.ipc$dispatch("d06fa220", new Object[]{j0tVar, new Boolean(z)});
        }
        if (z) {
            j0tVar.z();
            return xhv.INSTANCE;
        }
        f1t.INSTANCE.s(j0tVar.c, new g1a() { // from class: tb.tzs
            @Override // tb.g1a
            public final Object invoke(Object obj) {
                xhv x;
                x = j0t.x(j0t.this, ((Boolean) obj).booleanValue());
                return x;
            }
        });
        return xhv.INSTANCE;
    }

    public static final xhv x(final j0t j0tVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xhv) ipChange.ipc$dispatch("913f6e7", new Object[]{j0tVar, new Boolean(z)});
        }
        if (z) {
            j0tVar.s();
        } else {
            j0tVar.o(new g1a() { // from class: tb.vzs
                @Override // tb.g1a
                public final Object invoke(Object obj) {
                    xhv y;
                    y = j0t.y(j0t.this, ((Boolean) obj).booleanValue());
                    return y;
                }
            });
        }
        return xhv.INSTANCE;
    }

    public static final xhv y(j0t j0tVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xhv) ipChange.ipc$dispatch("7ec6ed61", new Object[]{j0tVar, new Boolean(z)});
        }
        if (z) {
            j0tVar.s();
        } else {
            j0tVar.l(false);
        }
        return xhv.INSTANCE;
    }

    public final void A(final g1a<? super Boolean, xhv> g1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9ec7cfd1", new Object[]{this, g1aVar});
        } else {
            f1t.INSTANCE.y(this.e, new g1a() { // from class: tb.f0t
                @Override // tb.g1a
                public final Object invoke(Object obj) {
                    xhv B;
                    B = j0t.B(g1a.this, this, ((Boolean) obj).booleanValue());
                    return B;
                }
            });
        }
    }

    public final void l(boolean z) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e4e29bab", new Object[]{this, new Boolean(z)});
            return;
        }
        if (z) {
            str = this.e;
        } else {
            str = null;
        }
        g1a<? super String, xhv> g1aVar = this.g;
        if (g1aVar != null) {
            g1aVar.invoke(str);
        }
        this.f = false;
    }

    public final void m(String str, String str2, g1a<? super String, xhv> g1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b72b6469", new Object[]{this, str, str2, g1aVar});
            return;
        }
        ckf.g(str, "url");
        ckf.g(str2, "path");
        ckf.g(g1aVar, "callback");
        if (str.length() != 0 && str2.length() != 0 && !this.f) {
            f1t f1tVar = f1t.INSTANCE;
            this.f21694a = f1tVar.w(str);
            this.b = str2;
            this.g = g1aVar;
            f1tVar.y(str2, new g1a() { // from class: tb.nzs
                @Override // tb.g1a
                public final Object invoke(Object obj) {
                    xhv n;
                    n = j0t.n(j0t.this, ((Boolean) obj).booleanValue());
                    return n;
                }
            });
        }
    }

    public final void o(final g1a<? super Boolean, xhv> g1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ebbee271", new Object[]{this, g1aVar});
            return;
        }
        h0g h0gVar = new h0g();
        h0gVar.i(this.d);
        phc.a.a(mhr.N(), this.b, this.f21694a, new g1a() { // from class: tb.zzs
            @Override // tb.g1a
            public final Object invoke(Object obj) {
                xhv p;
                p = j0t.p(g1a.this, (f0g) obj);
                return p;
            }
        }, null, new d1a() { // from class: tb.b0t
            @Override // tb.d1a
            public final Object invoke() {
                xhv q;
                q = j0t.q(g1a.this, this);
                return q;
            }
        }, new g1a() { // from class: tb.d0t
            @Override // tb.g1a
            public final Object invoke(Object obj) {
                xhv r;
                r = j0t.r(g1a.this, this, (n0g) obj);
                return r;
            }
        }, h0gVar, 8, null);
    }

    public final void s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4df6c562", new Object[]{this});
        } else {
            A(new g1a() { // from class: tb.xzs
                @Override // tb.g1a
                public final Object invoke(Object obj) {
                    xhv t;
                    t = j0t.t(j0t.this, ((Boolean) obj).booleanValue());
                    return t;
                }
            });
        }
    }

    public final void u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("46af086", new Object[]{this});
            return;
        }
        f1t f1tVar = f1t.INSTANCE;
        String x = f1tVar.x(this.f21694a);
        if (x == null) {
            x = "";
        }
        this.d = x;
        if (x.length() != 0) {
            String F = f1tVar.F(this.d);
            this.c = this.b + wh6.DIR + this.d;
            this.e = this.b + wh6.DIR + F;
        }
    }

    public final void v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("72815e91", new Object[]{this});
        } else if (this.c.length() != 0 && this.e.length() != 0) {
            this.f = true;
            f1t.INSTANCE.s(this.e, new g1a() { // from class: tb.rzs
                @Override // tb.g1a
                public final Object invoke(Object obj) {
                    xhv w;
                    w = j0t.w(j0t.this, ((Boolean) obj).booleanValue());
                    return w;
                }
            });
        }
    }

    public final void z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("651fa822", new Object[]{this});
        } else {
            l(true);
        }
    }
}
