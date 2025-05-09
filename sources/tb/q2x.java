package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.monitor.MUSMonitor;
import java.util.Map;
import kotlin.jvm.internal.Ref$ObjectRef;
import tb.xpd;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class q2x {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public final String f26475a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(1022361985);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public a() {
        }

        public final q2x a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (q2x) ipChange.ipc$dispatch("5472977", new Object[]{this});
            }
            q2x q2xVar = new q2x(null);
            dr.d(dr.INSTANCE, MUSMonitor.MODULE_DIM_ABILITY, "create", kotlin.collections.a.k(jpu.a(MUSMonitor.MODULE_DIM_ABILITY, "websocket"), jpu.a("__mega_context__", v3i.f(jpu.a("instanceID", q2x.g(q2xVar))))), null, null, 24, null);
            return q2xVar;
        }
    }

    static {
        t2o.a(1022361984);
    }

    public /* synthetic */ q2x(a07 a07Var) {
        this();
    }

    public static final /* synthetic */ String g(q2x q2xVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e80c016a", new Object[]{q2xVar});
        }
        return q2xVar.f26475a;
    }

    public static final xhv i(final Ref$ObjectRef ref$ObjectRef, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xhv) ipChange.ipc$dispatch("169a8918", new Object[]{ref$ObjectRef, obj});
        }
        ckf.g(obj, rb.RESULT_KEY);
        zm8.b(obj, new u1a() { // from class: tb.o2x
            @Override // tb.u1a
            public final Object invoke(Object obj2, Object obj3) {
                xhv j;
                j = q2x.j(Ref$ObjectRef.this, (String) obj2, (Map) obj3);
                return j;
            }
        }, new g1a() { // from class: tb.p2x
            @Override // tb.g1a
            public final Object invoke(Object obj2) {
                xhv k;
                k = q2x.k(Ref$ObjectRef.this, (bi8) obj2);
                return k;
            }
        });
        return xhv.INSTANCE;
    }

    public static final xhv j(Ref$ObjectRef ref$ObjectRef, String str, Map map) {
        s2x s2xVar;
        g1a<t2x, xhv> e;
        s2x s2xVar2;
        g1a<r2x, xhv> c;
        s2x s2xVar3;
        d1a<xhv> f;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xhv) ipChange.ipc$dispatch("f98368b5", new Object[]{ref$ObjectRef, str, map});
        }
        ckf.g(str, "type");
        ckf.g(map, "data");
        int hashCode = str.hashCode();
        if (hashCode != -2003762904) {
            if (hashCode != -1351896231) {
                if (hashCode == -1013079863 && str.equals("onOpen") && (s2xVar3 = (s2x) ref$ObjectRef.element) != null && (f = s2xVar3.f()) != null) {
                    f.invoke();
                }
            } else if (!(!str.equals("onClose") || (s2xVar2 = (s2x) ref$ObjectRef.element) == null || (c = s2xVar2.c()) == null)) {
                c.invoke(new r2x(map));
            }
        } else if (!(!str.equals(xpd.c.EVENT_ON_MESSAGE) || (s2xVar = (s2x) ref$ObjectRef.element) == null || (e = s2xVar.e()) == null)) {
            e.invoke(new t2x(map));
        }
        return xhv.INSTANCE;
    }

    public static final xhv k(Ref$ObjectRef ref$ObjectRef, bi8 bi8Var) {
        g1a<bi8, xhv> d;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xhv) ipChange.ipc$dispatch("b6499563", new Object[]{ref$ObjectRef, bi8Var});
        }
        ckf.g(bi8Var, "error");
        s2x s2xVar = (s2x) ref$ObjectRef.element;
        if (!(s2xVar == null || (d = s2xVar.d()) == null)) {
            d.invoke(bi8Var);
        }
        return xhv.INSTANCE;
    }

    public static final xhv m(final Ref$ObjectRef ref$ObjectRef, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xhv) ipChange.ipc$dispatch("ab1a85b2", new Object[]{ref$ObjectRef, obj});
        }
        ckf.g(obj, rb.RESULT_KEY);
        zm8.b(obj, new u1a() { // from class: tb.m2x
            @Override // tb.u1a
            public final Object invoke(Object obj2, Object obj3) {
                xhv n;
                n = q2x.n(Ref$ObjectRef.this, (String) obj2, (Map) obj3);
                return n;
            }
        }, new g1a() { // from class: tb.n2x
            @Override // tb.g1a
            public final Object invoke(Object obj2) {
                xhv o;
                o = q2x.o(Ref$ObjectRef.this, (bi8) obj2);
                return o;
            }
        });
        return xhv.INSTANCE;
    }

    public static final xhv n(Ref$ObjectRef ref$ObjectRef, String str, Map map) {
        u2x u2xVar;
        d1a<xhv> b;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xhv) ipChange.ipc$dispatch("b18f6d53", new Object[]{ref$ObjectRef, str, map});
        }
        ckf.g(str, "type");
        ckf.g(map, "data");
        if (!(!ckf.b(str, "onSuccess") || (u2xVar = (u2x) ref$ObjectRef.element) == null || (b = u2xVar.b()) == null)) {
            b.invoke();
        }
        return xhv.INSTANCE;
    }

    public static final xhv o(Ref$ObjectRef ref$ObjectRef, bi8 bi8Var) {
        g1a<bi8, xhv> a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xhv) ipChange.ipc$dispatch("db313f85", new Object[]{ref$ObjectRef, bi8Var});
        }
        ckf.g(bi8Var, "error");
        u2x u2xVar = (u2x) ref$ObjectRef.element;
        if (!(u2xVar == null || (a2 = u2xVar.a()) == null)) {
            a2.invoke(bi8Var);
        }
        return xhv.INSTANCE;
    }

    public q2x() {
        this.f26475a = fzv.a();
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [tb.s2x, T, java.lang.Object] */
    /* JADX WARN: Unknown variable types count: 1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void h(java.lang.String r11, tb.g1a<? super tb.s2x, tb.xhv> r12) {
        /*
            r10 = this;
            r0 = 1
            r1 = 0
            com.android.alibaba.ip.runtime.IpChange r2 = tb.q2x.$ipChange
            boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r3 == 0) goto L_0x0018
            java.lang.String r3 = "93eae9c1"
            r4 = 3
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r4[r1] = r10
            r4[r0] = r11
            r11 = 2
            r4[r11] = r12
            r2.ipc$dispatch(r3, r4)
            return
        L_0x0018:
            java.lang.String r2 = "url"
            tb.ckf.g(r11, r2)
            kotlin.Pair r11 = tb.jpu.a(r2, r11)
            kotlin.Pair[] r0 = new kotlin.Pair[r0]
            r0[r1] = r11
            java.util.Map r5 = kotlin.collections.a.k(r0)
            java.lang.String r11 = "instanceID"
            java.lang.String r0 = r10.f26475a
            kotlin.Pair r11 = tb.jpu.a(r11, r0)
            java.util.Map r11 = tb.v3i.f(r11)
            java.lang.String r0 = "__mega_context__"
            r5.put(r0, r11)
            kotlin.jvm.internal.Ref$ObjectRef r11 = new kotlin.jvm.internal.Ref$ObjectRef
            r11.<init>()
            if (r12 == 0) goto L_0x005e
            tb.s2x r0 = new tb.s2x
            r0.<init>()
            r12.invoke(r0)
            r11.element = r0
            java.lang.String r12 = "headers"
            java.util.Map r1 = r0.b()
            tb.dzv.a(r5, r12, r1)
            java.lang.String r12 = "data"
            java.util.Map r0 = r0.a()
            tb.dzv.a(r5, r12, r0)
        L_0x005e:
            tb.dr r2 = tb.dr.INSTANCE
            tb.l2x r7 = new tb.l2x
            r7.<init>()
            java.lang.String r4 = "connect"
            r6 = 0
            java.lang.String r3 = "websocket"
            r8 = 8
            r9 = 0
            tb.dr.d(r2, r3, r4, r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.q2x.h(java.lang.String, tb.g1a):void");
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [T, tb.u2x, java.lang.Object] */
    /* JADX WARN: Unknown variable types count: 1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void l(java.lang.String r11, tb.g1a<? super tb.u2x, tb.xhv> r12) {
        /*
            r10 = this;
            r0 = 1
            r1 = 0
            com.android.alibaba.ip.runtime.IpChange r2 = tb.q2x.$ipChange
            boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r3 == 0) goto L_0x0018
            java.lang.String r3 = "e75c5ddf"
            r4 = 3
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r4[r1] = r10
            r4[r0] = r11
            r11 = 2
            r4[r11] = r12
            r2.ipc$dispatch(r3, r4)
            return
        L_0x0018:
            java.lang.String r2 = "data"
            tb.ckf.g(r11, r2)
            kotlin.Pair r11 = tb.jpu.a(r2, r11)
            kotlin.Pair[] r0 = new kotlin.Pair[r0]
            r0[r1] = r11
            java.util.Map r5 = kotlin.collections.a.k(r0)
            java.lang.String r11 = "instanceID"
            java.lang.String r0 = r10.f26475a
            kotlin.Pair r11 = tb.jpu.a(r11, r0)
            java.util.Map r11 = tb.v3i.f(r11)
            java.lang.String r0 = "__mega_context__"
            r5.put(r0, r11)
            kotlin.jvm.internal.Ref$ObjectRef r11 = new kotlin.jvm.internal.Ref$ObjectRef
            r11.<init>()
            if (r12 == 0) goto L_0x0054
            tb.u2x r0 = new tb.u2x
            r0.<init>()
            r12.invoke(r0)
            r11.element = r0
            java.lang.String r12 = "isBuffer"
            java.lang.Boolean r0 = r0.c()
            tb.dzv.a(r5, r12, r0)
        L_0x0054:
            tb.dr r2 = tb.dr.INSTANCE
            tb.k2x r7 = new tb.k2x
            r7.<init>()
            java.lang.String r4 = "send"
            r6 = 0
            java.lang.String r3 = "websocket"
            r8 = 8
            r9 = 0
            tb.dr.d(r2, r3, r4, r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.q2x.l(java.lang.String, tb.g1a):void");
    }
}
