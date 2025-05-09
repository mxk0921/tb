package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.nanocompose.megability.ability.b;
import com.taobao.uniinfra_kmp.common_utils.serialization.KMPJSONUtils_androidKt;
import com.taobao.uniinfra_kmp.common_utils.serialization.a;
import java.io.Serializable;
import java.util.Map;
import kotlin.Result;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class dfr extends u1<rhc> implements rhc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(1002438764);
        t2o.a(1002438804);
    }

    public dfr(asb asbVar) {
        super(asbVar);
    }

    public static /* synthetic */ Object ipc$super(dfr dfrVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/kmp/kernel/serviceimp/TBHttpService");
    }

    public static final xhv j0(Map map, final wyf wyfVar, final g1a g1aVar, final u1a u1aVar, pqa pqaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xhv) ipChange.ipc$dispatch("185cf3e3", new Object[]{map, wyfVar, g1aVar, u1aVar, pqaVar});
        }
        ckf.g(pqaVar, "$this$send");
        pqaVar.j(map);
        pqaVar.n(new g1a() { // from class: tb.bfr
            @Override // tb.g1a
            public final Object invoke(Object obj) {
                xhv k0;
                k0 = dfr.k0(wyf.this, g1aVar, u1aVar, (oqa) obj);
                return k0;
            }
        });
        pqaVar.m(new g1a() { // from class: tb.cfr
            @Override // tb.g1a
            public final Object invoke(Object obj) {
                xhv m0;
                m0 = dfr.m0(u1a.this, (b) obj);
                return m0;
            }
        });
        pqaVar.l(new g1a() { // from class: tb.qer
            @Override // tb.g1a
            public final Object invoke(Object obj) {
                xhv o0;
                o0 = dfr.o0(u1a.this, (bi8) obj);
                return o0;
            }
        });
        return xhv.INSTANCE;
    }

    public static final xhv k0(final wyf wyfVar, final g1a g1aVar, final u1a u1aVar, final oqa oqaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xhv) ipChange.ipc$dispatch("e927ec14", new Object[]{wyfVar, g1aVar, u1aVar, oqaVar});
        }
        ckf.g(oqaVar, "result");
        cvs.Companion.e(new d1a() { // from class: tb.ter
            @Override // tb.d1a
            public final Object invoke() {
                xhv l0;
                l0 = dfr.l0(oqa.this, wyfVar, g1aVar, u1aVar);
                return l0;
            }
        });
        return xhv.INSTANCE;
    }

    public static final xhv l0(oqa oqaVar, wyf wyfVar, g1a g1aVar, u1a u1aVar) {
        Object obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xhv) ipChange.ipc$dispatch("2d85ffaa", new Object[]{oqaVar, wyfVar, g1aVar, u1aVar});
        }
        String a2 = oqaVar.a();
        if (a2 != null) {
            try {
                obj = Result.m1108constructorimpl(KMPJSONUtils_androidKt.decodeFromString(a.Companion, a2, wyfVar));
            } catch (Throwable th) {
                obj = Result.m1108constructorimpl(kotlin.b.a(th));
            }
            if (Result.m1115isSuccessimpl(obj)) {
                Serializable serializable = (Serializable) obj;
                if (g1aVar != null) {
                    g1aVar.invoke(serializable);
                }
            }
            Throwable th2 = Result.m1111exceptionOrNullimpl(obj);
            if (!(th2 == null || u1aVar == null)) {
                u1aVar.invoke(-1, "JSON decodeFromString fail errorMsg:" + th2.getMessage());
            }
        }
        return xhv.INSTANCE;
    }

    public static final xhv m0(final u1a u1aVar, final b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xhv) ipChange.ipc$dispatch("58f97689", new Object[]{u1aVar, bVar});
        }
        ckf.g(bVar, "fail");
        cvs.Companion.e(new d1a() { // from class: tb.ser
            @Override // tb.d1a
            public final Object invoke() {
                xhv n0;
                n0 = dfr.n0(u1a.this, bVar);
                return n0;
            }
        });
        return xhv.INSTANCE;
    }

    public static final xhv n0(u1a u1aVar, b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xhv) ipChange.ipc$dispatch("7c4f2b0d", new Object[]{u1aVar, bVar});
        }
        if (u1aVar != null) {
            u1aVar.invoke(-1, "fail errorCode:" + bVar.a() + " errorMsg:" + bVar.b());
        }
        return xhv.INSTANCE;
    }

    public static final xhv o0(final u1a u1aVar, final bi8 bi8Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xhv) ipChange.ipc$dispatch("489d19cb", new Object[]{u1aVar, bi8Var});
        }
        ckf.g(bi8Var, "error");
        cvs.Companion.e(new d1a() { // from class: tb.rer
            @Override // tb.d1a
            public final Object invoke() {
                xhv p0;
                p0 = dfr.p0(u1a.this, bi8Var);
                return p0;
            }
        });
        return xhv.INSTANCE;
    }

    public static final xhv p0(u1a u1aVar, bi8 bi8Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xhv) ipChange.ipc$dispatch("643d33c9", new Object[]{u1aVar, bi8Var});
        }
        if (u1aVar != null) {
            u1aVar.invoke(Integer.valueOf(Integer.parseInt(bi8Var.a())), bi8Var.b());
        }
        return xhv.INSTANCE;
    }

    public static final xhv q0(Map map, final g1a g1aVar, final u1a u1aVar, pqa pqaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xhv) ipChange.ipc$dispatch("75671f4d", new Object[]{map, g1aVar, u1aVar, pqaVar});
        }
        ckf.g(pqaVar, "$this$send");
        pqaVar.j(map);
        pqaVar.n(new g1a() { // from class: tb.uer
            @Override // tb.g1a
            public final Object invoke(Object obj) {
                xhv r0;
                r0 = dfr.r0(g1a.this, (oqa) obj);
                return r0;
            }
        });
        pqaVar.m(new g1a() { // from class: tb.ver
            @Override // tb.g1a
            public final Object invoke(Object obj) {
                xhv t0;
                t0 = dfr.t0(u1a.this, (b) obj);
                return t0;
            }
        });
        pqaVar.l(new g1a() { // from class: tb.wer
            @Override // tb.g1a
            public final Object invoke(Object obj) {
                xhv v0;
                v0 = dfr.v0(u1a.this, (bi8) obj);
                return v0;
            }
        });
        return xhv.INSTANCE;
    }

    public static final xhv r0(final g1a g1aVar, final oqa oqaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xhv) ipChange.ipc$dispatch("fd6ceb07", new Object[]{g1aVar, oqaVar});
        }
        ckf.g(oqaVar, "result");
        cvs.Companion.e(new d1a() { // from class: tb.zer
            @Override // tb.d1a
            public final Object invoke() {
                xhv s0;
                s0 = dfr.s0(oqa.this, g1aVar);
                return s0;
            }
        });
        return xhv.INSTANCE;
    }

    public static final xhv s0(oqa oqaVar, g1a g1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xhv) ipChange.ipc$dispatch("bb8e7393", new Object[]{oqaVar, g1aVar});
        }
        String a2 = oqaVar.a();
        if (!(a2 == null || g1aVar == null)) {
            g1aVar.invoke(KMPJSONUtils_androidKt.a(a.Companion, a2));
        }
        return xhv.INSTANCE;
    }

    public static final xhv t0(final u1a u1aVar, final b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xhv) ipChange.ipc$dispatch("36130589", new Object[]{u1aVar, bVar});
        }
        ckf.g(bVar, "fail");
        cvs.Companion.e(new d1a() { // from class: tb.afr
            @Override // tb.d1a
            public final Object invoke() {
                xhv u0;
                u0 = dfr.u0(u1a.this, bVar);
                return u0;
            }
        });
        return xhv.INSTANCE;
    }

    public static final xhv u0(u1a u1aVar, b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xhv) ipChange.ipc$dispatch("fba60dcb", new Object[]{u1aVar, bVar});
        }
        if (u1aVar != null) {
            u1aVar.invoke(-1, "fail errorCode:" + bVar.a() + " errorMsg:" + bVar.b());
        }
        return xhv.INSTANCE;
    }

    public static final xhv v0(final u1a u1aVar, final bi8 bi8Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xhv) ipChange.ipc$dispatch("bbe6eacb", new Object[]{u1aVar, bi8Var});
        }
        ckf.g(bi8Var, "error");
        cvs.Companion.e(new d1a() { // from class: tb.yer
            @Override // tb.d1a
            public final Object invoke() {
                xhv w0;
                w0 = dfr.w0(u1a.this, bi8Var);
                return w0;
            }
        });
        return xhv.INSTANCE;
    }

    public static final xhv w0(u1a u1aVar, bi8 bi8Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xhv) ipChange.ipc$dispatch("1dbecb87", new Object[]{u1aVar, bi8Var});
        }
        if (u1aVar != null) {
            u1aVar.invoke(Integer.valueOf(Integer.parseInt(bi8Var.a())), bi8Var.b());
        }
        return xhv.INSTANCE;
    }

    @Override // tb.zrb
    public ewe B() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ewe) ipChange.ipc$dispatch("cc717fdf", new Object[]{this});
        }
        return ewe.Companion.h();
    }

    @Override // tb.rhc
    public void D(String str, final g1a<Object, xhv> g1aVar, final u1a<? super Integer, ? super String, xhv> u1aVar, final Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ef722528", new Object[]{this, str, g1aVar, u1aVar, map});
            return;
        }
        ckf.g(str, "url");
        mqa.INSTANCE.d(str, new g1a() { // from class: tb.per
            @Override // tb.g1a
            public final Object invoke(Object obj) {
                xhv q0;
                q0 = dfr.q0(map, g1aVar, u1aVar, (pqa) obj);
                return q0;
            }
        });
    }

    @Override // tb.rhc
    public <T extends Serializable> void c(String str, final g1a<? super T, xhv> g1aVar, final u1a<? super Integer, ? super String, xhv> u1aVar, final Map<String, String> map, final wyf<T> wyfVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("13caf76c", new Object[]{this, str, g1aVar, u1aVar, map, wyfVar});
            return;
        }
        ckf.g(str, "url");
        ckf.g(wyfVar, "clazz");
        mqa.INSTANCE.d(str, new g1a() { // from class: tb.xer
            @Override // tb.g1a
            public final Object invoke(Object obj) {
                xhv j0;
                wyf wyfVar2 = wyfVar;
                g1a g1aVar2 = g1aVar;
                j0 = dfr.j0(map, wyfVar2, g1aVar2, u1aVar, (pqa) obj);
                return j0;
            }
        });
    }
}
