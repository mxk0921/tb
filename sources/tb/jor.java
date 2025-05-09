package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Arrays;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class jor extends u1<shc> implements shc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(1002438766);
        t2o.a(1002438807);
    }

    public jor(asb asbVar) {
        super(asbVar);
    }

    public static final xhv e0(String str, final jor jorVar, geh gehVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xhv) ipChange.ipc$dispatch("12f550af", new Object[]{str, jorVar, gehVar});
        }
        ckf.g(gehVar, "$this$debug");
        gehVar.e(str);
        jorVar.getClass();
        gehVar.g("TBLVKMP");
        gehVar.f(new g1a() { // from class: tb.ior
            @Override // tb.g1a
            public final Object invoke(Object obj) {
                xhv f0;
                f0 = jor.f0(jor.this, (bi8) obj);
                return f0;
            }
        });
        return xhv.INSTANCE;
    }

    public static final xhv f0(jor jorVar, bi8 bi8Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xhv) ipChange.ipc$dispatch("b38543f2", new Object[]{jorVar, bi8Var});
        }
        ckf.g(bi8Var, "errResult");
        jorVar.T(bi8Var);
        return xhv.INSTANCE;
    }

    public static final xhv g0(String str, final jor jorVar, leh lehVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xhv) ipChange.ipc$dispatch("2fb2d395", new Object[]{str, jorVar, lehVar});
        }
        ckf.g(lehVar, "$this$error");
        lehVar.i(str);
        jorVar.getClass();
        lehVar.k("TBLVKMP");
        lehVar.j(new g1a() { // from class: tb.hor
            @Override // tb.g1a
            public final Object invoke(Object obj) {
                xhv h0;
                h0 = jor.h0(jor.this, (bi8) obj);
                return h0;
            }
        });
        return xhv.INSTANCE;
    }

    public static final xhv h0(jor jorVar, bi8 bi8Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xhv) ipChange.ipc$dispatch("f5ffc3dd", new Object[]{jorVar, bi8Var});
        }
        ckf.g(bi8Var, "errResult");
        jorVar.T(bi8Var);
        return xhv.INSTANCE;
    }

    public static final xhv i0(String str, final jor jorVar, weh wehVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xhv) ipChange.ipc$dispatch("45468073", new Object[]{str, jorVar, wehVar});
        }
        ckf.g(wehVar, "$this$info");
        wehVar.e(str);
        jorVar.getClass();
        wehVar.g("TBLVKMP");
        wehVar.f(new g1a() { // from class: tb.for
            @Override // tb.g1a
            public final Object invoke(Object obj) {
                xhv j0;
                j0 = jor.j0(jor.this, (bi8) obj);
                return j0;
            }
        });
        return xhv.INSTANCE;
    }

    public static /* synthetic */ Object ipc$super(jor jorVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/kmp/kernel/serviceimp/TBLogService");
    }

    public static final xhv j0(jor jorVar, bi8 bi8Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xhv) ipChange.ipc$dispatch("a2dcbfaf", new Object[]{jorVar, bi8Var});
        }
        ckf.g(bi8Var, "errResult");
        jorVar.T(bi8Var);
        return xhv.INSTANCE;
    }

    public static final xhv k0(String str, final jor jorVar, xgh xghVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xhv) ipChange.ipc$dispatch("951a9561", new Object[]{str, jorVar, xghVar});
        }
        ckf.g(xghVar, "$this$warn");
        xghVar.e(str);
        jorVar.getClass();
        xghVar.g("TBLVKMP");
        xghVar.f(new g1a() { // from class: tb.gor
            @Override // tb.g1a
            public final Object invoke(Object obj) {
                xhv l0;
                l0 = jor.l0(jor.this, (bi8) obj);
                return l0;
            }
        });
        return xhv.INSTANCE;
    }

    public static final xhv l0(jor jorVar, bi8 bi8Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xhv) ipChange.ipc$dispatch("79255497", new Object[]{jorVar, bi8Var});
        }
        ckf.g(bi8Var, "errResult");
        jorVar.T(bi8Var);
        return xhv.INSTANCE;
    }

    @Override // tb.shc
    public void A(final String str, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f04ec5c", new Object[]{this, str, objArr});
            return;
        }
        ckf.g(str, "tag");
        ckf.g(objArr, "contents");
        ldh.INSTANCE.l(d0(Arrays.copyOf(objArr, objArr.length)), new g1a() { // from class: tb.cor
            @Override // tb.g1a
            public final Object invoke(Object obj) {
                xhv g0;
                g0 = jor.g0(str, this, (leh) obj);
                return g0;
            }
        });
    }

    @Override // tb.zrb
    public ewe B() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ewe) ipChange.ipc$dispatch("cc717fdf", new Object[]{this});
        }
        return ewe.Companion.j();
    }

    @Override // tb.u1
    public void T(bi8 bi8Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d9d032f", new Object[]{this, bi8Var});
            return;
        }
        ckf.g(bi8Var, "result");
        System.out.println((Object) S(bi8Var));
    }

    public final String d0(Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("eff65c1", new Object[]{this, objArr});
        }
        return i04.j0(ic1.D(objArr), "", null, null, 0, null, null, 62, null);
    }

    @Override // tb.shc
    public void v(final String str, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7acc3871", new Object[]{this, str, objArr});
            return;
        }
        ckf.g(str, "tag");
        ckf.g(objArr, "contents");
        ldh.INSTANCE.i(d0(Arrays.copyOf(objArr, objArr.length)), new g1a() { // from class: tb.eor
            @Override // tb.g1a
            public final Object invoke(Object obj) {
                xhv e0;
                e0 = jor.e0(str, this, (geh) obj);
                return e0;
            }
        });
    }

    @Override // tb.shc
    public void y(final String str, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c5cbf2e", new Object[]{this, str, objArr});
            return;
        }
        ckf.g(str, "tag");
        ckf.g(objArr, "contents");
        ldh.INSTANCE.o(d0(Arrays.copyOf(objArr, objArr.length)), new g1a() { // from class: tb.dor
            @Override // tb.g1a
            public final Object invoke(Object obj) {
                xhv i0;
                i0 = jor.i0(str, this, (weh) obj);
                return i0;
            }
        });
    }

    @Override // tb.shc
    public void z(final String str, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52d20456", new Object[]{this, str, objArr});
            return;
        }
        ckf.g(str, "tag");
        ckf.g(objArr, "contents");
        ldh.INSTANCE.r(d0(Arrays.copyOf(objArr, objArr.length)), new g1a() { // from class: tb.bor
            @Override // tb.g1a
            public final Object invoke(Object obj) {
                xhv k0;
                k0 = jor.k0(str, this, (xgh) obj);
                return k0;
            }
        });
    }
}
