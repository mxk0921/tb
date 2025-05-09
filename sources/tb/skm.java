package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import kotlin.jvm.internal.Ref$ObjectRef;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class skm {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final skm INSTANCE = new skm();

    static {
        t2o.a(1022361860);
    }

    public static final xhv A(final Ref$ObjectRef ref$ObjectRef, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xhv) ipChange.ipc$dispatch("ce136cb0", new Object[]{ref$ObjectRef, obj});
        }
        ckf.g(obj, rb.RESULT_KEY);
        zm8.b(obj, new u1a() { // from class: tb.rkm
            @Override // tb.u1a
            public final Object invoke(Object obj2, Object obj3) {
                xhv B;
                B = skm.B(Ref$ObjectRef.this, (String) obj2, (Map) obj3);
                return B;
            }
        }, new g1a() { // from class: tb.ujm
            @Override // tb.g1a
            public final Object invoke(Object obj2) {
                xhv C;
                C = skm.C(Ref$ObjectRef.this, (bi8) obj2);
                return C;
            }
        });
        return xhv.INSTANCE;
    }

    public static final xhv B(Ref$ObjectRef ref$ObjectRef, String str, Map map) {
        ukm ukmVar;
        g1a<blm, xhv> d;
        ukm ukmVar2;
        g1a<bmm, xhv> h;
        ukm ukmVar3;
        g1a<dlm, xhv> e;
        ukm ukmVar4;
        g1a<vkm, xhv> b;
        ukm ukmVar5;
        g1a<ulm, xhv> g;
        ukm ukmVar6;
        g1a<tlm, xhv> f;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xhv) ipChange.ipc$dispatch("19f1044d", new Object[]{ref$ObjectRef, str, map});
        }
        ckf.g(str, "type");
        ckf.g(map, "data");
        switch (str.hashCode()) {
            case -2031501713:
                if (!(!str.equals("onJoinMessageArrived") || (ukmVar = (ukm) ref$ObjectRef.element) == null || (d = ukmVar.d()) == null)) {
                    d.invoke(new blm(map));
                    break;
                }
                break;
            case 567646034:
                if (!(!str.equals("onUnSubscribed") || (ukmVar2 = (ukm) ref$ObjectRef.element) == null || (h = ukmVar2.h()) == null)) {
                    h.invoke(new bmm(map));
                    break;
                }
                break;
            case 908090917:
                if (!(!str.equals("onMessageArrived") || (ukmVar3 = (ukm) ref$ObjectRef.element) == null || (e = ukmVar3.e()) == null)) {
                    e.invoke(new dlm(map));
                    break;
                }
                break;
            case 1510647030:
                if (!(!str.equals("onCountMessageArrived") || (ukmVar4 = (ukm) ref$ObjectRef.element) == null || (b = ukmVar4.b()) == null)) {
                    b.invoke(new vkm(map));
                    break;
                }
                break;
            case 1621779762:
                if (!(!str.equals("onTextMessageArrived") || (ukmVar5 = (ukm) ref$ObjectRef.element) == null || (g = ukmVar5.g()) == null)) {
                    g.invoke(new ulm(map));
                    break;
                }
                break;
            case 2120821657:
                if (!(!str.equals("onSubscribed") || (ukmVar6 = (ukm) ref$ObjectRef.element) == null || (f = ukmVar6.f()) == null)) {
                    f.invoke(new tlm(map));
                    break;
                }
                break;
        }
        return xhv.INSTANCE;
    }

    public static final xhv C(Ref$ObjectRef ref$ObjectRef, bi8 bi8Var) {
        g1a<bi8, xhv> c;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xhv) ipChange.ipc$dispatch("e361a8cb", new Object[]{ref$ObjectRef, bi8Var});
        }
        ckf.g(bi8Var, "error");
        ukm ukmVar = (ukm) ref$ObjectRef.element;
        if (!(ukmVar == null || (c = ukmVar.c()) == null)) {
            c.invoke(bi8Var);
        }
        return xhv.INSTANCE;
    }

    public static final xhv E(final Ref$ObjectRef ref$ObjectRef, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xhv) ipChange.ipc$dispatch("793aea8b", new Object[]{ref$ObjectRef, obj});
        }
        ckf.g(obj, rb.RESULT_KEY);
        zm8.b(obj, new u1a() { // from class: tb.wjm
            @Override // tb.u1a
            public final Object invoke(Object obj2, Object obj3) {
                xhv F;
                F = skm.F(Ref$ObjectRef.this, (String) obj2, (Map) obj3);
                return F;
            }
        }, new g1a() { // from class: tb.xjm
            @Override // tb.g1a
            public final Object invoke(Object obj2) {
                xhv G;
                G = skm.G(Ref$ObjectRef.this, (bi8) obj2);
                return G;
            }
        });
        return xhv.INSTANCE;
    }

    public static final xhv F(Ref$ObjectRef ref$ObjectRef, String str, Map map) {
        wkm wkmVar;
        g1a<jlm, xhv> c;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xhv) ipChange.ipc$dispatch("6a70da23", new Object[]{ref$ObjectRef, str, map});
        }
        ckf.g(str, "type");
        ckf.g(map, "data");
        if (!(!ckf.b(str, "onCountValue") || (wkmVar = (wkm) ref$ObjectRef.element) == null || (c = wkmVar.c()) == null)) {
            c.invoke(new jlm(map));
        }
        return xhv.INSTANCE;
    }

    public static final xhv G(Ref$ObjectRef ref$ObjectRef, bi8 bi8Var) {
        g1a<bi8, xhv> d;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xhv) ipChange.ipc$dispatch("e052f4b5", new Object[]{ref$ObjectRef, bi8Var});
        }
        ckf.g(bi8Var, "error");
        wkm wkmVar = (wkm) ref$ObjectRef.element;
        if (!(wkmVar == null || (d = wkmVar.d()) == null)) {
            d.invoke(bi8Var);
        }
        return xhv.INSTANCE;
    }

    public static final xhv I(final Ref$ObjectRef ref$ObjectRef, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xhv) ipChange.ipc$dispatch("80d1555b", new Object[]{ref$ObjectRef, obj});
        }
        ckf.g(obj, rb.RESULT_KEY);
        zm8.b(obj, new u1a() { // from class: tb.ikm
            @Override // tb.u1a
            public final Object invoke(Object obj2, Object obj3) {
                xhv J;
                J = skm.J(Ref$ObjectRef.this, (String) obj2, (Map) obj3);
                return J;
            }
        }, new g1a() { // from class: tb.jkm
            @Override // tb.g1a
            public final Object invoke(Object obj2) {
                xhv K;
                K = skm.K(Ref$ObjectRef.this, (bi8) obj2);
                return K;
            }
        });
        return xhv.INSTANCE;
    }

    public static final xhv J(Ref$ObjectRef ref$ObjectRef, String str, Map map) {
        elm elmVar;
        g1a<alm, xhv> d;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xhv) ipChange.ipc$dispatch("2a1356f4", new Object[]{ref$ObjectRef, str, map});
        }
        ckf.g(str, "type");
        ckf.g(map, "data");
        if (!(!ckf.b(str, "onHistoryMessages") || (elmVar = (elm) ref$ObjectRef.element) == null || (d = elmVar.d()) == null)) {
            d.invoke(new alm(map));
        }
        return xhv.INSTANCE;
    }

    public static final xhv K(Ref$ObjectRef ref$ObjectRef, bi8 bi8Var) {
        g1a<bi8, xhv> c;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xhv) ipChange.ipc$dispatch("33835484", new Object[]{ref$ObjectRef, bi8Var});
        }
        ckf.g(bi8Var, "error");
        elm elmVar = (elm) ref$ObjectRef.element;
        if (!(elmVar == null || (c = elmVar.c()) == null)) {
            c.invoke(bi8Var);
        }
        return xhv.INSTANCE;
    }

    public static final xhv M(final Ref$ObjectRef ref$ObjectRef, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xhv) ipChange.ipc$dispatch("c05ea4b7", new Object[]{ref$ObjectRef, obj});
        }
        ckf.g(obj, rb.RESULT_KEY);
        zm8.b(obj, new u1a() { // from class: tb.bkm
            @Override // tb.u1a
            public final Object invoke(Object obj2, Object obj3) {
                xhv N;
                N = skm.N(Ref$ObjectRef.this, (String) obj2, (Map) obj3);
                return N;
            }
        }, new g1a() { // from class: tb.ckm
            @Override // tb.g1a
            public final Object invoke(Object obj2) {
                xhv O;
                O = skm.O(Ref$ObjectRef.this, (bi8) obj2);
                return O;
            }
        });
        return xhv.INSTANCE;
    }

    public static final xhv N(Ref$ObjectRef ref$ObjectRef, String str, Map map) {
        flm flmVar;
        g1a<wlm, xhv> d;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xhv) ipChange.ipc$dispatch("781e5f7b", new Object[]{ref$ObjectRef, str, map});
        }
        ckf.g(str, "type");
        ckf.g(map, "data");
        if (!(!ckf.b(str, "onTopicStatus") || (flmVar = (flm) ref$ObjectRef.element) == null || (d = flmVar.d()) == null)) {
            d.invoke(new wlm(map));
        }
        return xhv.INSTANCE;
    }

    public static final xhv O(Ref$ObjectRef ref$ObjectRef, bi8 bi8Var) {
        g1a<bi8, xhv> c;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xhv) ipChange.ipc$dispatch("c8b2b65d", new Object[]{ref$ObjectRef, bi8Var});
        }
        ckf.g(bi8Var, "error");
        flm flmVar = (flm) ref$ObjectRef.element;
        if (!(flmVar == null || (c = flmVar.c()) == null)) {
            c.invoke(bi8Var);
        }
        return xhv.INSTANCE;
    }

    public static final xhv Q(final Ref$ObjectRef ref$ObjectRef, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xhv) ipChange.ipc$dispatch("d293b768", new Object[]{ref$ObjectRef, obj});
        }
        ckf.g(obj, rb.RESULT_KEY);
        zm8.b(obj, new u1a() { // from class: tb.zjm
            @Override // tb.u1a
            public final Object invoke(Object obj2, Object obj3) {
                xhv R;
                R = skm.R(Ref$ObjectRef.this, (String) obj2, (Map) obj3);
                return R;
            }
        }, new g1a() { // from class: tb.akm
            @Override // tb.g1a
            public final Object invoke(Object obj2) {
                xhv S;
                S = skm.S(Ref$ObjectRef.this, (bi8) obj2);
                return S;
            }
        });
        return xhv.INSTANCE;
    }

    public static final xhv R(Ref$ObjectRef ref$ObjectRef, String str, Map map) {
        glm glmVar;
        g1a<ylm, xhv> d;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xhv) ipChange.ipc$dispatch("60bab783", new Object[]{ref$ObjectRef, str, map});
        }
        ckf.g(str, "type");
        ckf.g(map, "data");
        if (!(!ckf.b(str, "onTopicUsers") || (glmVar = (glm) ref$ObjectRef.element) == null || (d = glmVar.d()) == null)) {
            d.invoke(new ylm(map));
        }
        return xhv.INSTANCE;
    }

    public static final xhv S(Ref$ObjectRef ref$ObjectRef, bi8 bi8Var) {
        g1a<bi8, xhv> c;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xhv) ipChange.ipc$dispatch("c5eb3355", new Object[]{ref$ObjectRef, bi8Var});
        }
        ckf.g(bi8Var, "error");
        glm glmVar = (glm) ref$ObjectRef.element;
        if (!(glmVar == null || (c = glmVar.c()) == null)) {
            c.invoke(bi8Var);
        }
        return xhv.INSTANCE;
    }

    public static final xhv U(final Ref$ObjectRef ref$ObjectRef, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xhv) ipChange.ipc$dispatch("277b712b", new Object[]{ref$ObjectRef, obj});
        }
        ckf.g(obj, rb.RESULT_KEY);
        zm8.b(obj, new u1a() { // from class: tb.gkm
            @Override // tb.u1a
            public final Object invoke(Object obj2, Object obj3) {
                xhv V;
                V = skm.V(Ref$ObjectRef.this, (String) obj2, (Map) obj3);
                return V;
            }
        }, new g1a() { // from class: tb.hkm
            @Override // tb.g1a
            public final Object invoke(Object obj2) {
                xhv W;
                W = skm.W(Ref$ObjectRef.this, (bi8) obj2);
                return W;
            }
        });
        return xhv.INSTANCE;
    }

    public static final xhv V(Ref$ObjectRef ref$ObjectRef, String str, Map map) {
        hlm hlmVar;
        g1a<jlm, xhv> d;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xhv) ipChange.ipc$dispatch("57be9fe6", new Object[]{ref$ObjectRef, str, map});
        }
        ckf.g(str, "type");
        ckf.g(map, "data");
        if (!(!ckf.b(str, "onSended") || (hlmVar = (hlm) ref$ObjectRef.element) == null || (d = hlmVar.d()) == null)) {
            d.invoke(new jlm(map));
        }
        return xhv.INSTANCE;
    }

    public static final xhv W(Ref$ObjectRef ref$ObjectRef, bi8 bi8Var) {
        g1a<bi8, xhv> c;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xhv) ipChange.ipc$dispatch("959f76d2", new Object[]{ref$ObjectRef, bi8Var});
        }
        ckf.g(bi8Var, "error");
        hlm hlmVar = (hlm) ref$ObjectRef.element;
        if (!(hlmVar == null || (c = hlmVar.c()) == null)) {
            c.invoke(bi8Var);
        }
        return xhv.INSTANCE;
    }

    public static final xhv Y(final Ref$ObjectRef ref$ObjectRef, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xhv) ipChange.ipc$dispatch("fd77707c", new Object[]{ref$ObjectRef, obj});
        }
        ckf.g(obj, rb.RESULT_KEY);
        zm8.b(obj, new u1a() { // from class: tb.dkm
            @Override // tb.u1a
            public final Object invoke(Object obj2, Object obj3) {
                xhv Z;
                Z = skm.Z(Ref$ObjectRef.this, (String) obj2, (Map) obj3);
                return Z;
            }
        }, new g1a() { // from class: tb.fkm
            @Override // tb.g1a
            public final Object invoke(Object obj2) {
                xhv a0;
                a0 = skm.a0(Ref$ObjectRef.this, (bi8) obj2);
                return a0;
            }
        });
        return xhv.INSTANCE;
    }

    public static final xhv Z(Ref$ObjectRef ref$ObjectRef, String str, Map map) {
        klm klmVar;
        g1a<jlm, xhv> d;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xhv) ipChange.ipc$dispatch("916483b9", new Object[]{ref$ObjectRef, str, map});
        }
        ckf.g(str, "type");
        ckf.g(map, "data");
        if (!(!ckf.b(str, "onTextSended") || (klmVar = (klm) ref$ObjectRef.element) == null || (d = klmVar.d()) == null)) {
            d.invoke(new jlm(map));
        }
        return xhv.INSTANCE;
    }

    public static final xhv a0(Ref$ObjectRef ref$ObjectRef, bi8 bi8Var) {
        g1a<bi8, xhv> c;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xhv) ipChange.ipc$dispatch("b9ce44df", new Object[]{ref$ObjectRef, bi8Var});
        }
        ckf.g(bi8Var, "error");
        klm klmVar = (klm) ref$ObjectRef.element;
        if (!(klmVar == null || (c = klmVar.c()) == null)) {
            c.invoke(bi8Var);
        }
        return xhv.INSTANCE;
    }

    public static final xhv d0(Ref$ObjectRef ref$ObjectRef, bi8 bi8Var) {
        g1a<bi8, xhv> f;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xhv) ipChange.ipc$dispatch("52f6e643", new Object[]{ref$ObjectRef, bi8Var});
        }
        ckf.g(bi8Var, "error");
        rlm rlmVar = (rlm) ref$ObjectRef.element;
        if (!(rlmVar == null || (f = rlmVar.f()) == null)) {
            f.invoke(bi8Var);
        }
        return xhv.INSTANCE;
    }

    public static final xhv g0(Ref$ObjectRef ref$ObjectRef, bi8 bi8Var) {
        g1a<bi8, xhv> d;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xhv) ipChange.ipc$dispatch("46699ec8", new Object[]{ref$ObjectRef, bi8Var});
        }
        ckf.g(bi8Var, "error");
        zlm zlmVar = (zlm) ref$ObjectRef.element;
        if (!(zlmVar == null || (d = zlmVar.d()) == null)) {
            d.invoke(bi8Var);
        }
        return xhv.INSTANCE;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [tb.wkm, T, java.lang.Object] */
    /* JADX WARN: Unknown variable types count: 1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void D(tb.g1a<? super tb.wkm, tb.xhv> r13) {
        /*
            r12 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = tb.skm.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r1 == 0) goto L_0x0015
            java.lang.String r1 = "4dcc6eef"
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r12
            r3 = 1
            r2[r3] = r13
            r0.ipc$dispatch(r1, r2)
            return
        L_0x0015:
            java.util.LinkedHashMap r7 = new java.util.LinkedHashMap
            r7.<init>()
            kotlin.jvm.internal.Ref$ObjectRef r0 = new kotlin.jvm.internal.Ref$ObjectRef
            r0.<init>()
            if (r13 == 0) goto L_0x0052
            tb.wkm r1 = new tb.wkm
            r1.<init>()
            r13.invoke(r1)
            r0.element = r1
            java.lang.String r13 = "bizCode"
            java.lang.Integer r2 = r1.a()
            tb.dzv.a(r7, r13, r2)
            java.lang.String r13 = "needACK"
            java.lang.Boolean r2 = r1.b()
            tb.dzv.a(r7, r13, r2)
            java.lang.String r13 = "topic"
            java.lang.String r2 = r1.f()
            tb.dzv.a(r7, r13, r2)
            java.lang.String r13 = "params"
            java.util.Map r1 = r1.e()
            tb.dzv.a(r7, r13, r1)
        L_0x0052:
            tb.dr r4 = tb.dr.INSTANCE
            tb.tjm r9 = new tb.tjm
            r9.<init>()
            java.lang.String r6 = "countValue"
            r8 = 0
            java.lang.String r5 = "powerMsg"
            r10 = 8
            r11 = 0
            tb.dr.d(r4, r5, r6, r7, r8, r9, r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.skm.D(tb.g1a):void");
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [T, java.lang.Object, tb.elm] */
    /* JADX WARN: Unknown variable types count: 1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void H(tb.g1a<? super tb.elm, tb.xhv> r13) {
        /*
            r12 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = tb.skm.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r1 == 0) goto L_0x0015
            java.lang.String r1 = "37c23d3e"
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r12
            r3 = 1
            r2[r3] = r13
            r0.ipc$dispatch(r1, r2)
            return
        L_0x0015:
            java.util.LinkedHashMap r7 = new java.util.LinkedHashMap
            r7.<init>()
            kotlin.jvm.internal.Ref$ObjectRef r0 = new kotlin.jvm.internal.Ref$ObjectRef
            r0.<init>()
            if (r13 == 0) goto L_0x0051
            tb.elm r1 = new tb.elm
            r1.<init>()
            r13.invoke(r1)
            r0.element = r1
            java.lang.String r13 = "bizCode"
            java.lang.Integer r2 = r1.a()
            tb.dzv.a(r7, r13, r2)
            java.lang.String r13 = "index"
            java.lang.Integer r2 = r1.b()
            tb.dzv.a(r7, r13, r2)
            java.lang.String r13 = "pageSize"
            java.lang.Integer r2 = r1.e()
            tb.dzv.a(r7, r13, r2)
            java.lang.String r13 = "topic"
            java.lang.String r1 = r1.f()
            tb.dzv.a(r7, r13, r1)
        L_0x0051:
            tb.dr r4 = tb.dr.INSTANCE
            tb.mkm r9 = new tb.mkm
            r9.<init>()
            java.lang.String r6 = "requestHistoryMessages"
            r8 = 0
            java.lang.String r5 = "powerMsg"
            r10 = 8
            r11 = 0
            tb.dr.d(r4, r5, r6, r7, r8, r9, r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.skm.H(tb.g1a):void");
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [T, tb.flm, java.lang.Object] */
    /* JADX WARN: Unknown variable types count: 1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void L(tb.g1a<? super tb.flm, tb.xhv> r13) {
        /*
            r12 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = tb.skm.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r1 == 0) goto L_0x0015
            java.lang.String r1 = "d14d653f"
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r12
            r3 = 1
            r2[r3] = r13
            r0.ipc$dispatch(r1, r2)
            return
        L_0x0015:
            java.util.LinkedHashMap r7 = new java.util.LinkedHashMap
            r7.<init>()
            kotlin.jvm.internal.Ref$ObjectRef r0 = new kotlin.jvm.internal.Ref$ObjectRef
            r0.<init>()
            if (r13 == 0) goto L_0x0051
            tb.flm r1 = new tb.flm
            r1.<init>()
            r13.invoke(r1)
            r0.element = r1
            java.lang.String r13 = "bizCode"
            java.lang.Integer r2 = r1.a()
            tb.dzv.a(r7, r13, r2)
            java.lang.String r13 = "index"
            java.lang.Integer r2 = r1.b()
            tb.dzv.a(r7, r13, r2)
            java.lang.String r13 = "pageSize"
            java.lang.Integer r2 = r1.e()
            tb.dzv.a(r7, r13, r2)
            java.lang.String r13 = "topic"
            java.lang.String r1 = r1.f()
            tb.dzv.a(r7, r13, r1)
        L_0x0051:
            tb.dr r4 = tb.dr.INSTANCE
            tb.lkm r9 = new tb.lkm
            r9.<init>()
            java.lang.String r6 = "requestTopicStatus"
            r8 = 0
            java.lang.String r5 = "powerMsg"
            r10 = 8
            r11 = 0
            tb.dr.d(r4, r5, r6, r7, r8, r9, r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.skm.L(tb.g1a):void");
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [T, tb.glm, java.lang.Object] */
    /* JADX WARN: Unknown variable types count: 1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void P(tb.g1a<? super tb.glm, tb.xhv> r13) {
        /*
            r12 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = tb.skm.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r1 == 0) goto L_0x0015
            java.lang.String r1 = "ed09f055"
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r12
            r3 = 1
            r2[r3] = r13
            r0.ipc$dispatch(r1, r2)
            return
        L_0x0015:
            java.util.LinkedHashMap r7 = new java.util.LinkedHashMap
            r7.<init>()
            kotlin.jvm.internal.Ref$ObjectRef r0 = new kotlin.jvm.internal.Ref$ObjectRef
            r0.<init>()
            if (r13 == 0) goto L_0x0051
            tb.glm r1 = new tb.glm
            r1.<init>()
            r13.invoke(r1)
            r0.element = r1
            java.lang.String r13 = "bizCode"
            java.lang.Integer r2 = r1.a()
            tb.dzv.a(r7, r13, r2)
            java.lang.String r13 = "index"
            java.lang.Integer r2 = r1.b()
            tb.dzv.a(r7, r13, r2)
            java.lang.String r13 = "pageSize"
            java.lang.Integer r2 = r1.e()
            tb.dzv.a(r7, r13, r2)
            java.lang.String r13 = "topic"
            java.lang.String r1 = r1.f()
            tb.dzv.a(r7, r13, r1)
        L_0x0051:
            tb.dr r4 = tb.dr.INSTANCE
            tb.ekm r9 = new tb.ekm
            r9.<init>()
            java.lang.String r6 = "requestTopicUsers"
            r8 = 0
            java.lang.String r5 = "powerMsg"
            r10 = 8
            r11 = 0
            tb.dr.d(r4, r5, r6, r7, r8, r9, r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.skm.P(tb.g1a):void");
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [tb.hlm, T, java.lang.Object] */
    /* JADX WARN: Unknown variable types count: 1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void T(tb.g1a<? super tb.hlm, tb.xhv> r13) {
        /*
            r12 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = tb.skm.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r1 == 0) goto L_0x0015
            java.lang.String r1 = "169a322c"
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r12
            r3 = 1
            r2[r3] = r13
            r0.ipc$dispatch(r1, r2)
            return
        L_0x0015:
            java.util.LinkedHashMap r7 = new java.util.LinkedHashMap
            r7.<init>()
            kotlin.jvm.internal.Ref$ObjectRef r0 = new kotlin.jvm.internal.Ref$ObjectRef
            r0.<init>()
            if (r13 == 0) goto L_0x0046
            tb.hlm r1 = new tb.hlm
            r1.<init>()
            r13.invoke(r1)
            r0.element = r1
            java.lang.String r13 = "bizCode"
            java.lang.Integer r2 = r1.a()
            tb.dzv.a(r7, r13, r2)
            tb.dlm r13 = r1.b()
            if (r13 == 0) goto L_0x003f
            java.util.Map r13 = r13.e()
            goto L_0x0040
        L_0x003f:
            r13 = 0
        L_0x0040:
            java.lang.String r1 = "message"
            tb.dzv.a(r7, r1, r13)
        L_0x0046:
            tb.dr r4 = tb.dr.INSTANCE
            tb.pkm r9 = new tb.pkm
            r9.<init>()
            java.lang.String r6 = "sendMessage"
            r8 = 0
            java.lang.String r5 = "powerMsg"
            r10 = 8
            r11 = 0
            tb.dr.d(r4, r5, r6, r7, r8, r9, r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.skm.T(tb.g1a):void");
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [tb.klm, T, java.lang.Object] */
    /* JADX WARN: Unknown variable types count: 1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void X(tb.g1a<? super tb.klm, tb.xhv> r13) {
        /*
            r12 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = tb.skm.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r1 == 0) goto L_0x0015
            java.lang.String r1 = "d75af4a2"
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r12
            r3 = 1
            r2[r3] = r13
            r0.ipc$dispatch(r1, r2)
            return
        L_0x0015:
            java.util.LinkedHashMap r7 = new java.util.LinkedHashMap
            r7.<init>()
            kotlin.jvm.internal.Ref$ObjectRef r0 = new kotlin.jvm.internal.Ref$ObjectRef
            r0.<init>()
            if (r13 == 0) goto L_0x0046
            tb.klm r1 = new tb.klm
            r1.<init>()
            r13.invoke(r1)
            r0.element = r1
            java.lang.String r13 = "bizCode"
            java.lang.Integer r2 = r1.a()
            tb.dzv.a(r7, r13, r2)
            tb.ulm r13 = r1.b()
            if (r13 == 0) goto L_0x003f
            java.util.Map r13 = r13.g()
            goto L_0x0040
        L_0x003f:
            r13 = 0
        L_0x0040:
            java.lang.String r1 = "message"
            tb.dzv.a(r7, r1, r13)
        L_0x0046:
            tb.dr r4 = tb.dr.INSTANCE
            tb.kkm r9 = new tb.kkm
            r9.<init>()
            java.lang.String r6 = "sendText"
            r8 = 0
            java.lang.String r5 = "powerMsg"
            r10 = 8
            r11 = 0
            tb.dr.d(r4, r5, r6, r7, r8, r9, r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.skm.X(tb.g1a):void");
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [T, java.lang.Object, tb.rlm] */
    /* JADX WARN: Unknown variable types count: 1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b0(tb.g1a<? super tb.rlm, tb.xhv> r13) {
        /*
            r12 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = tb.skm.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r1 == 0) goto L_0x0015
            java.lang.String r1 = "9197f697"
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r12
            r3 = 1
            r2[r3] = r13
            r0.ipc$dispatch(r1, r2)
            return
        L_0x0015:
            java.util.LinkedHashMap r7 = new java.util.LinkedHashMap
            r7.<init>()
            kotlin.jvm.internal.Ref$ObjectRef r0 = new kotlin.jvm.internal.Ref$ObjectRef
            r0.<init>()
            if (r13 == 0) goto L_0x006b
            tb.rlm r1 = new tb.rlm
            r1.<init>()
            r13.invoke(r1)
            r0.element = r1
            java.lang.String r13 = "bizCode"
            java.lang.Integer r2 = r1.a()
            tb.dzv.a(r7, r13, r2)
            java.lang.String r13 = "topic"
            java.lang.String r2 = r1.g()
            tb.dzv.a(r7, r13, r2)
            com.taobao.nanocompose.megability.ability.PowerMsgMsgFetchMode r13 = r1.e()
            if (r13 == 0) goto L_0x0049
            java.lang.String r13 = r13.getRawValue()
            goto L_0x004a
        L_0x0049:
            r13 = 0
        L_0x004a:
            java.lang.String r2 = "mode"
            tb.dzv.a(r7, r2, r13)
            java.lang.String r13 = "bizTag"
            java.lang.String r2 = r1.b()
            tb.dzv.a(r7, r13, r2)
            java.lang.String r13 = "from"
            java.lang.String r2 = r1.d()
            tb.dzv.a(r7, r13, r2)
            java.lang.String r13 = "ext"
            java.lang.String r1 = r1.c()
            tb.dzv.a(r7, r13, r1)
        L_0x006b:
            tb.dr r4 = tb.dr.INSTANCE
            tb.qkm r9 = new tb.qkm
            r9.<init>()
            java.lang.String r6 = "subscribe"
            r8 = 0
            java.lang.String r5 = "powerMsg"
            r10 = 8
            r11 = 0
            tb.dr.d(r4, r5, r6, r7, r8, r9, r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.skm.b0(tb.g1a):void");
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [T, tb.zlm, java.lang.Object] */
    /* JADX WARN: Unknown variable types count: 1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e0(tb.g1a<? super tb.zlm, tb.xhv> r13) {
        /*
            r12 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = tb.skm.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r1 == 0) goto L_0x0015
            java.lang.String r1 = "9fb1fc7e"
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r12
            r3 = 1
            r2[r3] = r13
            r0.ipc$dispatch(r1, r2)
            return
        L_0x0015:
            java.util.LinkedHashMap r7 = new java.util.LinkedHashMap
            r7.<init>()
            kotlin.jvm.internal.Ref$ObjectRef r0 = new kotlin.jvm.internal.Ref$ObjectRef
            r0.<init>()
            if (r13 == 0) goto L_0x0050
            tb.zlm r1 = new tb.zlm
            r1.<init>()
            r13.invoke(r1)
            r0.element = r1
            java.lang.String r13 = "bizCode"
            java.lang.Integer r2 = r1.a()
            tb.dzv.a(r7, r13, r2)
            java.lang.String r13 = "topic"
            java.lang.String r2 = r1.e()
            tb.dzv.a(r7, r13, r2)
            java.lang.String r13 = "bizTag"
            java.lang.String r2 = r1.b()
            tb.dzv.a(r7, r13, r2)
            java.lang.String r13 = "from"
            java.lang.String r1 = r1.c()
            tb.dzv.a(r7, r13, r1)
        L_0x0050:
            tb.dr r4 = tb.dr.INSTANCE
            tb.nkm r9 = new tb.nkm
            r9.<init>()
            java.lang.String r6 = "unSubscribe"
            r8 = 0
            java.lang.String r5 = "powerMsg"
            r10 = 8
            r11 = 0
            tb.dr.d(r4, r5, r6, r7, r8, r9, r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.skm.e0(tb.g1a):void");
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [T, tb.ukm, java.lang.Object] */
    /* JADX WARN: Unknown variable types count: 1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void z(tb.g1a<? super tb.ukm, tb.xhv> r13) {
        /*
            r12 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = tb.skm.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r1 == 0) goto L_0x0015
            java.lang.String r1 = "bf37a3cf"
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r12
            r3 = 1
            r2[r3] = r13
            r0.ipc$dispatch(r1, r2)
            return
        L_0x0015:
            java.util.LinkedHashMap r7 = new java.util.LinkedHashMap
            r7.<init>()
            kotlin.jvm.internal.Ref$ObjectRef r0 = new kotlin.jvm.internal.Ref$ObjectRef
            r0.<init>()
            if (r13 == 0) goto L_0x0034
            tb.ukm r1 = new tb.ukm
            r1.<init>()
            r13.invoke(r1)
            r0.element = r1
            java.lang.String r13 = "bizCode"
            java.lang.Integer r1 = r1.a()
            tb.dzv.a(r7, r13, r1)
        L_0x0034:
            tb.dr r4 = tb.dr.INSTANCE
            tb.okm r9 = new tb.okm
            r9.<init>()
            java.lang.String r6 = "constructClient"
            r8 = 0
            java.lang.String r5 = "powerMsg"
            r10 = 8
            r11 = 0
            tb.dr.d(r4, r5, r6, r7, r8, r9, r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.skm.z(tb.g1a):void");
    }

    public static final xhv c0(final Ref$ObjectRef ref$ObjectRef, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xhv) ipChange.ipc$dispatch("e4e0932", new Object[]{ref$ObjectRef, obj});
        }
        ckf.g(obj, rb.RESULT_KEY);
        zm8.c(obj, null, new g1a() { // from class: tb.yjm
            @Override // tb.g1a
            public final Object invoke(Object obj2) {
                xhv d0;
                d0 = skm.d0(Ref$ObjectRef.this, (bi8) obj2);
                return d0;
            }
        }, 1, null);
        return xhv.INSTANCE;
    }

    public static final xhv f0(final Ref$ObjectRef ref$ObjectRef, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xhv) ipChange.ipc$dispatch("8d61a51d", new Object[]{ref$ObjectRef, obj});
        }
        ckf.g(obj, rb.RESULT_KEY);
        zm8.c(obj, null, new g1a() { // from class: tb.vjm
            @Override // tb.g1a
            public final Object invoke(Object obj2) {
                xhv g0;
                g0 = skm.g0(Ref$ObjectRef.this, (bi8) obj2);
                return g0;
            }
        }, 1, null);
        return xhv.INSTANCE;
    }
}
