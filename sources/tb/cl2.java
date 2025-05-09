package tb;

import com.alipay.android.msp.constants.MspFlybirdDefine;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.monitor.MUSMonitor;
import java.util.Map;
import kotlin.jvm.internal.Ref$ObjectRef;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class cl2 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public final String f17127a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(1022361620);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public final cl2 a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (cl2) ipChange.ipc$dispatch("fe2ffbbd", new Object[]{this});
            }
            cl2 cl2Var = new cl2(null);
            dr.d(dr.INSTANCE, MUSMonitor.MODULE_DIM_ABILITY, "create", kotlin.collections.a.k(jpu.a(MUSMonitor.MODULE_DIM_ABILITY, "broadcast"), jpu.a("__mega_context__", v3i.f(jpu.a("instanceID", cl2.f(cl2Var))))), null, null, 24, null);
            return cl2Var;
        }

        public a() {
        }
    }

    static {
        t2o.a(1022361619);
    }

    public /* synthetic */ cl2(a07 a07Var) {
        this();
    }

    public static final /* synthetic */ String f(cl2 cl2Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4e3e8d64", new Object[]{cl2Var});
        }
        return cl2Var.f17127a;
    }

    public static final xhv h(final Ref$ObjectRef ref$ObjectRef, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xhv) ipChange.ipc$dispatch("a13db53b", new Object[]{ref$ObjectRef, obj});
        }
        ckf.g(obj, rb.RESULT_KEY);
        zm8.b(obj, new u1a() { // from class: tb.yk2
            @Override // tb.u1a
            public final Object invoke(Object obj2, Object obj3) {
                xhv i;
                i = cl2.i(Ref$ObjectRef.this, (String) obj2, (Map) obj3);
                return i;
            }
        }, new g1a() { // from class: tb.zk2
            @Override // tb.g1a
            public final Object invoke(Object obj2) {
                xhv j;
                j = cl2.j(Ref$ObjectRef.this, (bi8) obj2);
                return j;
            }
        });
        return xhv.INSTANCE;
    }

    public static final xhv i(Ref$ObjectRef ref$ObjectRef, String str, Map map) {
        dl2 dl2Var;
        g1a<fl2, xhv> b;
        g1a<ml2, xhv> d;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xhv) ipChange.ipc$dispatch("eafd1bd8", new Object[]{ref$ObjectRef, str, map});
        }
        ckf.g(str, "type");
        ckf.g(map, "data");
        if (ckf.b(str, MspFlybirdDefine.FLYBIRD_FRAME_EVENT_TYPE.ON_EVENT)) {
            dl2 dl2Var2 = (dl2) ref$ObjectRef.element;
            if (!(dl2Var2 == null || (d = dl2Var2.d()) == null)) {
                d.invoke(new ml2(map));
            }
        } else if (!(!ckf.b(str, "onAdd") || (dl2Var = (dl2) ref$ObjectRef.element) == null || (b = dl2Var.b()) == null)) {
            b.invoke(new fl2(map));
        }
        return xhv.INSTANCE;
    }

    public static final xhv j(Ref$ObjectRef ref$ObjectRef, bi8 bi8Var) {
        g1a<bi8, xhv> c;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xhv) ipChange.ipc$dispatch("80364620", new Object[]{ref$ObjectRef, bi8Var});
        }
        ckf.g(bi8Var, "error");
        dl2 dl2Var = (dl2) ref$ObjectRef.element;
        if (!(dl2Var == null || (c = dl2Var.c()) == null)) {
            c.invoke(bi8Var);
        }
        return xhv.INSTANCE;
    }

    public static final xhv m(Ref$ObjectRef ref$ObjectRef, bi8 bi8Var) {
        g1a<bi8, xhv> c;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xhv) ipChange.ipc$dispatch("e03b6eed", new Object[]{ref$ObjectRef, bi8Var});
        }
        ckf.g(bi8Var, "error");
        kl2 kl2Var = (kl2) ref$ObjectRef.element;
        if (!(kl2Var == null || (c = kl2Var.c()) == null)) {
            c.invoke(bi8Var);
        }
        return xhv.INSTANCE;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [T, java.lang.Object, tb.kl2] */
    /* JADX WARN: Unknown variable types count: 1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void k(java.lang.String r11, tb.g1a<? super tb.kl2, tb.xhv> r12) {
        /*
            r10 = this;
            r0 = 1
            r1 = 0
            com.android.alibaba.ip.runtime.IpChange r2 = tb.cl2.$ipChange
            boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r3 == 0) goto L_0x0018
            java.lang.String r3 = "43a44e97"
            r4 = 3
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r4[r1] = r10
            r4[r0] = r11
            r11 = 2
            r4[r11] = r12
            r2.ipc$dispatch(r3, r4)
            return
        L_0x0018:
            java.lang.String r2 = "eventName"
            tb.ckf.g(r11, r2)
            kotlin.Pair r11 = tb.jpu.a(r2, r11)
            kotlin.Pair[] r0 = new kotlin.Pair[r0]
            r0[r1] = r11
            java.util.Map r5 = kotlin.collections.a.k(r0)
            java.lang.String r11 = "instanceID"
            java.lang.String r0 = r10.f17127a
            kotlin.Pair r11 = tb.jpu.a(r11, r0)
            java.util.Map r11 = tb.v3i.f(r11)
            java.lang.String r0 = "__mega_context__"
            r5.put(r0, r11)
            kotlin.jvm.internal.Ref$ObjectRef r11 = new kotlin.jvm.internal.Ref$ObjectRef
            r11.<init>()
            if (r12 == 0) goto L_0x005d
            tb.kl2 r0 = new tb.kl2
            r0.<init>()
            r12.invoke(r0)
            r11.element = r0
            java.lang.String r12 = "bizId"
            java.lang.String r1 = r0.a()
            tb.dzv.a(r5, r12, r1)
            java.lang.String r12 = "detail"
            java.util.Map r0 = r0.b()
            tb.dzv.a(r5, r12, r0)
        L_0x005d:
            tb.dr r2 = tb.dr.INSTANCE
            tb.vk2 r7 = new tb.vk2
            r7.<init>()
            java.lang.String r4 = "dispatchEvent"
            r6 = 0
            java.lang.String r3 = "broadcast"
            r8 = 8
            r9 = 0
            tb.dr.d(r2, r3, r4, r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.cl2.k(java.lang.String, tb.g1a):void");
    }

    public cl2() {
        this.f17127a = fzv.a();
    }

    public static final xhv l(final Ref$ObjectRef ref$ObjectRef, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xhv) ipChange.ipc$dispatch("74696dcb", new Object[]{ref$ObjectRef, obj});
        }
        ckf.g(obj, rb.RESULT_KEY);
        zm8.c(obj, null, new g1a() { // from class: tb.al2
            @Override // tb.g1a
            public final Object invoke(Object obj2) {
                xhv m;
                m = cl2.m(Ref$ObjectRef.this, (bi8) obj2);
                return m;
            }
        }, 1, null);
        return xhv.INSTANCE;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [T, tb.dl2, java.lang.Object] */
    /* JADX WARN: Unknown variable types count: 1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void g(java.lang.String r11, tb.g1a<? super tb.dl2, tb.xhv> r12) {
        /*
            r10 = this;
            r0 = 1
            r1 = 0
            com.android.alibaba.ip.runtime.IpChange r2 = tb.cl2.$ipChange
            boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r3 == 0) goto L_0x0018
            java.lang.String r3 = "ef528ee4"
            r4 = 3
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r4[r1] = r10
            r4[r0] = r11
            r11 = 2
            r4[r11] = r12
            r2.ipc$dispatch(r3, r4)
            return
        L_0x0018:
            java.lang.String r2 = "eventName"
            tb.ckf.g(r11, r2)
            kotlin.Pair r11 = tb.jpu.a(r2, r11)
            kotlin.Pair[] r0 = new kotlin.Pair[r0]
            r0[r1] = r11
            java.util.Map r5 = kotlin.collections.a.k(r0)
            java.lang.String r11 = "instanceID"
            java.lang.String r0 = r10.f17127a
            kotlin.Pair r11 = tb.jpu.a(r11, r0)
            java.util.Map r11 = tb.v3i.f(r11)
            java.lang.String r0 = "__mega_context__"
            r5.put(r0, r11)
            kotlin.jvm.internal.Ref$ObjectRef r11 = new kotlin.jvm.internal.Ref$ObjectRef
            r11.<init>()
            if (r12 == 0) goto L_0x0062
            tb.dl2 r0 = new tb.dl2
            r0.<init>()
            r12.invoke(r0)
            r11.element = r0
            java.lang.String r12 = "bizId"
            java.lang.String r1 = r0.a()
            tb.dzv.a(r5, r12, r1)
            boolean r12 = r0.e()
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r12)
            java.lang.String r0 = "once"
            tb.dzv.a(r5, r0, r12)
        L_0x0062:
            tb.dr r2 = tb.dr.INSTANCE
            tb.xk2 r7 = new tb.xk2
            r7.<init>()
            java.lang.String r4 = "addEventListener"
            r6 = 0
            java.lang.String r3 = "broadcast"
            r8 = 8
            r9 = 0
            tb.dr.d(r2, r3, r4, r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.cl2.g(java.lang.String, tb.g1a):void");
    }
}
