package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.common.Constants;
import java.util.List;
import kotlin.text.Regex;
import tb.qhc;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class f1t {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final f1t INSTANCE = new f1t();

    /* renamed from: a  reason: collision with root package name */
    public static final String f18949a = "LiveKtRes";

    static {
        t2o.a(1010827288);
    }

    public static final xhv A(g1a g1aVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xhv) ipChange.ipc$dispatch("8b6e0592", new Object[]{g1aVar, new Boolean(z)});
        }
        g1aVar.invoke(Boolean.valueOf(z));
        return xhv.INSTANCE;
    }

    public static final xhv C(g1a g1aVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xhv) ipChange.ipc$dispatch("4fcf464", new Object[]{g1aVar, str});
        }
        if (str == null) {
            str = "";
        }
        g1aVar.invoke(str);
        return xhv.INSTANCE;
    }

    public static final xhv D(g1a g1aVar, n0g n0gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xhv) ipChange.ipc$dispatch("4cb7bc66", new Object[]{g1aVar, n0gVar});
        }
        ckf.g(n0gVar, Constants.SEND_TYPE_RES);
        g1aVar.invoke("");
        return xhv.INSTANCE;
    }

    public static /* synthetic */ void m(f1t f1tVar, String str, boolean z, g1a g1aVar, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("658b0eec", new Object[]{f1tVar, str, new Boolean(z), g1aVar, new Integer(i), obj});
            return;
        }
        if ((i & 2) != 0) {
            z = true;
        }
        if ((i & 4) != 0) {
            g1aVar = null;
        }
        f1tVar.l(str, z, g1aVar);
    }

    public static final xhv n(g1a g1aVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xhv) ipChange.ipc$dispatch("40c0d9d5", new Object[]{g1aVar, new Boolean(z)});
        }
        if (g1aVar != null) {
            g1aVar.invoke(Boolean.valueOf(z));
        }
        return xhv.INSTANCE;
    }

    public static final xhv o(g1a g1aVar, n0g n0gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xhv) ipChange.ipc$dispatch("26dec549", new Object[]{g1aVar, n0gVar});
        }
        ckf.g(n0gVar, Constants.SEND_TYPE_RES);
        if (g1aVar != null) {
            g1aVar.invoke(Boolean.FALSE);
        }
        return xhv.INSTANCE;
    }

    public static final xhv q(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xhv) ipChange.ipc$dispatch("e821a1d9", new Object[]{new Boolean(z)});
        }
        return xhv.INSTANCE;
    }

    public static final xhv r(n0g n0gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xhv) ipChange.ipc$dispatch("92326ec5", new Object[]{n0gVar});
        }
        ckf.g(n0gVar, Constants.SEND_TYPE_RES);
        return xhv.INSTANCE;
    }

    public static final xhv t(g1a g1aVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xhv) ipChange.ipc$dispatch("6c75a4e0", new Object[]{g1aVar, new Boolean(z)});
        }
        g1aVar.invoke(Boolean.valueOf(z));
        return xhv.INSTANCE;
    }

    public static final xhv u(g1a g1aVar, n0g n0gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xhv) ipChange.ipc$dispatch("5f18d75e", new Object[]{g1aVar, n0gVar});
        }
        ckf.g(n0gVar, Constants.SEND_TYPE_RES);
        g1aVar.invoke(Boolean.FALSE);
        return xhv.INSTANCE;
    }

    public static final xhv z(String str, final g1a g1aVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xhv) ipChange.ipc$dispatch("454b9079", new Object[]{str, g1aVar, new Boolean(z)});
        }
        if (!z) {
            m(INSTANCE, str, false, new g1a() { // from class: tb.v0t
                @Override // tb.g1a
                public final Object invoke(Object obj) {
                    xhv A;
                    A = f1t.A(g1a.this, ((Boolean) obj).booleanValue());
                    return A;
                }
            }, 2, null);
        } else {
            g1aVar.invoke(Boolean.TRUE);
        }
        return xhv.INSTANCE;
    }

    public final void B(String str, final g1a<? super String, xhv> g1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("435cf6ed", new Object[]{this, str, g1aVar});
            return;
        }
        ckf.g(str, "filePath");
        ckf.g(g1aVar, "callBack");
        qhc.a.a(mhr.O(), str, null, new g1a() { // from class: tb.l0t
            @Override // tb.g1a
            public final Object invoke(Object obj) {
                xhv C;
                C = f1t.C(g1a.this, (String) obj);
                return C;
            }
        }, new g1a() { // from class: tb.n0t
            @Override // tb.g1a
            public final Object invoke(Object obj) {
                xhv D;
                D = f1t.D(g1a.this, (n0g) obj);
                return D;
            }
        }, 2, null);
    }

    public final String E(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e2e512e2", new Object[]{this, str});
        }
        ckf.g(str, "str");
        if (str.length() == 0) {
            return "";
        }
        return "file://".concat(str);
    }

    public final String F(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c2d0fd05", new Object[]{this, str});
        }
        ckf.g(str, "fileName");
        return new Regex(".zip$").replace(str, "");
    }

    public final String k(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6cf3e0d7", new Object[]{this, str});
        }
        ckf.g(str, "str");
        if (str.length() == 0) {
            return "";
        }
        return mhr.O().s(str);
    }

    public final void l(String str, boolean z, final g1a<? super Boolean, xhv> g1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("be837c5f", new Object[]{this, str, new Boolean(z), g1aVar});
            return;
        }
        ckf.g(str, "folderPath");
        mhr.O().m(str, z, new g1a() { // from class: tb.x0t
            @Override // tb.g1a
            public final Object invoke(Object obj) {
                xhv n;
                n = f1t.n(g1a.this, ((Boolean) obj).booleanValue());
                return n;
            }
        }, new g1a() { // from class: tb.z0t
            @Override // tb.g1a
            public final Object invoke(Object obj) {
                xhv o;
                o = f1t.o(g1a.this, (n0g) obj);
                return o;
            }
        });
    }

    public final void p(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d81481d", new Object[]{this, str});
            return;
        }
        ckf.g(str, "filePath");
        mhr.O().G(str, new g1a() { // from class: tb.b1t
            @Override // tb.g1a
            public final Object invoke(Object obj) {
                xhv q;
                q = f1t.q(((Boolean) obj).booleanValue());
                return q;
            }
        }, new g1a() { // from class: tb.d1t
            @Override // tb.g1a
            public final Object invoke(Object obj) {
                xhv r;
                r = f1t.r((n0g) obj);
                return r;
            }
        });
    }

    public final void s(String str, final g1a<? super Boolean, xhv> g1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("341e992a", new Object[]{this, str, g1aVar});
            return;
        }
        ckf.g(str, "filePath");
        ckf.g(g1aVar, "callBack");
        mhr.O().k(str, new g1a() { // from class: tb.r0t
            @Override // tb.g1a
            public final Object invoke(Object obj) {
                xhv t;
                t = f1t.t(g1a.this, ((Boolean) obj).booleanValue());
                return t;
            }
        }, new g1a() { // from class: tb.t0t
            @Override // tb.g1a
            public final Object invoke(Object obj) {
                xhv u;
                u = f1t.u(g1a.this, (n0g) obj);
                return u;
            }
        });
    }

    public final String v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ce50298b", new Object[]{this});
        }
        return f18949a;
    }

    public final void y(final String str, final g1a<? super Boolean, xhv> g1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4541c6ec", new Object[]{this, str, g1aVar});
            return;
        }
        ckf.g(str, "path");
        ckf.g(g1aVar, "callback");
        s(str, new g1a() { // from class: tb.p0t
            @Override // tb.g1a
            public final Object invoke(Object obj) {
                xhv z;
                z = f1t.z(str, g1aVar, ((Boolean) obj).booleanValue());
                return z;
            }
        });
    }

    public final String w(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b3512dbb", new Object[]{this, str});
        }
        ckf.g(str, "url");
        if (str.length() == 0) {
            return "";
        }
        return tsq.I(str, uyv.HTTPS_SCHEMA, false, 2, null) ? str : uyv.HTTPS_SCHEMA.concat(str);
    }

    public final String x(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6f84c8b", new Object[]{this, str});
        }
        ckf.g(str, "url");
        if (str.length() == 0) {
            return null;
        }
        List y0 = wsq.y0((CharSequence) wsq.z0(str, new String[]{itw.URL_SEPARATOR}, false, 0, 6, null).get(1), new char[]{wh6.DIR}, false, 0, 6, null);
        if (y0.size() <= 1) {
            return null;
        }
        return (String) y0.get(y0.size() - 1);
    }
}
