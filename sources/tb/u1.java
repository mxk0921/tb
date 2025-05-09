package tb;

import com.android.alibaba.ip.runtime.IpChange;
import tb.zrb;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public abstract class u1<T extends zrb<T>> implements zrb<T> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ADI_SERVICE_PARAMS_TYPE_ERROR_CODE = "117118";
    public static final String ADI_SERVICE_PARAMS_TYPE_ERROR_MSG = "ADIService_ParamsTypeError";
    public static final a Companion = new a(null);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class a {
        static {
            t2o.a(1002438691);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public a() {
        }
    }

    static {
        t2o.a(1002438690);
        t2o.a(1002438692);
    }

    public u1(asb asbVar) {
    }

    public static final xhv O(final u1 u1Var, final g1a g1aVar, final bi8 bi8Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xhv) ipChange.ipc$dispatch("6dd421f4", new Object[]{u1Var, g1aVar, bi8Var});
        }
        ckf.g(bi8Var, "er");
        cvs.Companion.e(new d1a() { // from class: tb.t1
            @Override // tb.d1a
            public final Object invoke() {
                xhv P;
                P = u1.P(u1.this, bi8Var, g1aVar);
                return P;
            }
        });
        return xhv.INSTANCE;
    }

    public static final xhv P(u1 u1Var, bi8 bi8Var, g1a g1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xhv) ipChange.ipc$dispatch("af35fea", new Object[]{u1Var, bi8Var, g1aVar});
        }
        u1Var.T(bi8Var);
        g1aVar.invoke(u1Var.U(bi8Var));
        return xhv.INSTANCE;
    }

    public final g1a<bi8, xhv> N(final g1a<? super n0g, xhv> g1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g1a) ipChange.ipc$dispatch("3d6a68a5", new Object[]{this, g1aVar});
        }
        if (g1aVar != null) {
            return new g1a() { // from class: tb.s1
                @Override // tb.g1a
                public final Object invoke(Object obj) {
                    xhv O;
                    O = u1.O(u1.this, g1aVar, (bi8) obj);
                    return O;
                }
            };
        }
        return null;
    }

    public final String Q(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2cd17639", new Object[]{this, str, str2});
        }
        return R("code:" + str + " - msg:" + str2);
    }

    public final String R(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e51b652f", new Object[]{this, str});
        }
        return "\n\n        [" + bvt.a(ftt.Companion) + "]\n        [E]\n        [TaoBao_Live_KMP]\n        [KMP]\n        [" + B().x() + "]\n        |" + str + "\n    ";
    }

    public final String S(bi8 bi8Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("84e0c219", new Object[]{this, bi8Var});
        }
        ckf.g(bi8Var, "result");
        return Q(bi8Var.a(), bi8Var.b());
    }

    public final n0g U(bi8 bi8Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (n0g) ipChange.ipc$dispatch("eccc3df5", new Object[]{this, bi8Var});
        }
        return new n0g(bi8Var.a(), bi8Var.b());
    }

    public void T(bi8 bi8Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d9d032f", new Object[]{this, bi8Var});
            return;
        }
        ckf.g(bi8Var, "result");
        String S = S(bi8Var);
        mhr.a0(S, S);
    }
}
