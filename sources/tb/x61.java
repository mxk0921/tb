package tb;

import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.Ref$ObjectRef;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class x61 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final x61 INSTANCE = new x61();

    static {
        t2o.a(1022361615);
    }

    public static final xhv g(Ref$ObjectRef ref$ObjectRef, bi8 bi8Var) {
        g1a<bi8, xhv> d;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xhv) ipChange.ipc$dispatch("dac10bde", new Object[]{ref$ObjectRef, bi8Var});
        }
        ckf.g(bi8Var, "error");
        f71 f71Var = (f71) ref$ObjectRef.element;
        if (!(f71Var == null || (d = f71Var.d()) == null)) {
            d.invoke(bi8Var);
        }
        return xhv.INSTANCE;
    }

    public static final xhv j(Ref$ObjectRef ref$ObjectRef, bi8 bi8Var) {
        g1a<bi8, xhv> b;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xhv) ipChange.ipc$dispatch("10855fb", new Object[]{ref$ObjectRef, bi8Var});
        }
        ckf.g(bi8Var, "error");
        h71 h71Var = (h71) ref$ObjectRef.element;
        if (!(h71Var == null || (b = h71Var.b()) == null)) {
            b.invoke(bi8Var);
        }
        return xhv.INSTANCE;
    }

    public static final xhv f(final Ref$ObjectRef ref$ObjectRef, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xhv) ipChange.ipc$dispatch("b709b9bb", new Object[]{ref$ObjectRef, obj});
        }
        ckf.g(obj, rb.RESULT_KEY);
        zm8.c(obj, null, new g1a() { // from class: tb.w61
            @Override // tb.g1a
            public final Object invoke(Object obj2) {
                xhv g;
                g = x61.g(Ref$ObjectRef.this, (bi8) obj2);
                return g;
            }
        }, 1, null);
        return xhv.INSTANCE;
    }

    public static final xhv i(final Ref$ObjectRef ref$ObjectRef, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xhv) ipChange.ipc$dispatch("56e7f201", new Object[]{ref$ObjectRef, obj});
        }
        ckf.g(obj, rb.RESULT_KEY);
        zm8.c(obj, null, new g1a() { // from class: tb.v61
            @Override // tb.g1a
            public final Object invoke(Object obj2) {
                xhv j;
                j = x61.j(Ref$ObjectRef.this, (bi8) obj2);
                return j;
            }
        }, 1, null);
        return xhv.INSTANCE;
    }

    /* JADX WARN: Type inference failed for: r13v2, types: [T, java.lang.Object, tb.f71] */
    /* JADX WARN: Unknown variable types count: 1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e(java.lang.String r12, java.lang.String r13, tb.g1a<? super tb.f71, tb.xhv> r14) {
        /*
            r11 = this;
            r0 = 2
            r1 = 1
            r2 = 0
            com.android.alibaba.ip.runtime.IpChange r3 = tb.x61.$ipChange
            boolean r4 = r3 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r4 == 0) goto L_0x001b
            java.lang.String r4 = "3b9ea1f0"
            r5 = 4
            java.lang.Object[] r5 = new java.lang.Object[r5]
            r5[r2] = r11
            r5[r1] = r12
            r5[r0] = r13
            r12 = 3
            r5[r12] = r14
            r3.ipc$dispatch(r4, r5)
            return
        L_0x001b:
            java.lang.String r3 = "module"
            tb.ckf.g(r12, r3)
            java.lang.String r4 = "monitorPoint"
            tb.ckf.g(r13, r4)
            kotlin.Pair r12 = tb.jpu.a(r3, r12)
            kotlin.Pair r13 = tb.jpu.a(r4, r13)
            kotlin.Pair[] r0 = new kotlin.Pair[r0]
            r0[r2] = r12
            r0[r1] = r13
            java.util.Map r6 = kotlin.collections.a.k(r0)
            kotlin.jvm.internal.Ref$ObjectRef r12 = new kotlin.jvm.internal.Ref$ObjectRef
            r12.<init>()
            if (r14 == 0) goto L_0x0065
            tb.f71 r13 = new tb.f71
            r13.<init>()
            r14.invoke(r13)
            r12.element = r13
            java.lang.String r14 = "errorCode"
            java.lang.String r0 = r13.b()
            tb.dzv.a(r6, r14, r0)
            java.lang.String r14 = "errorMessage"
            java.lang.String r0 = r13.c()
            tb.dzv.a(r6, r14, r0)
            java.lang.String r14 = "args"
            java.util.Map r13 = r13.a()
            tb.dzv.a(r6, r14, r13)
        L_0x0065:
            tb.dr r3 = tb.dr.INSTANCE
            tb.t61 r8 = new tb.t61
            r8.<init>()
            java.lang.String r5 = "alarmFail"
            r7 = 0
            java.lang.String r4 = "appMonitor"
            r9 = 8
            r10 = 0
            tb.dr.d(r3, r4, r5, r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.x61.e(java.lang.String, java.lang.String, tb.g1a):void");
    }

    /* JADX WARN: Type inference failed for: r13v2, types: [T, java.lang.Object, tb.h71] */
    /* JADX WARN: Unknown variable types count: 1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void h(java.lang.String r12, java.lang.String r13, tb.g1a<? super tb.h71, tb.xhv> r14) {
        /*
            r11 = this;
            r0 = 2
            r1 = 1
            r2 = 0
            com.android.alibaba.ip.runtime.IpChange r3 = tb.x61.$ipChange
            boolean r4 = r3 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r4 == 0) goto L_0x001b
            java.lang.String r4 = "46a91253"
            r5 = 4
            java.lang.Object[] r5 = new java.lang.Object[r5]
            r5[r2] = r11
            r5[r1] = r12
            r5[r0] = r13
            r12 = 3
            r5[r12] = r14
            r3.ipc$dispatch(r4, r5)
            return
        L_0x001b:
            java.lang.String r3 = "module"
            tb.ckf.g(r12, r3)
            java.lang.String r4 = "monitorPoint"
            tb.ckf.g(r13, r4)
            kotlin.Pair r12 = tb.jpu.a(r3, r12)
            kotlin.Pair r13 = tb.jpu.a(r4, r13)
            kotlin.Pair[] r0 = new kotlin.Pair[r0]
            r0[r2] = r12
            r0[r1] = r13
            java.util.Map r6 = kotlin.collections.a.k(r0)
            kotlin.jvm.internal.Ref$ObjectRef r12 = new kotlin.jvm.internal.Ref$ObjectRef
            r12.<init>()
            if (r14 == 0) goto L_0x0053
            tb.h71 r13 = new tb.h71
            r13.<init>()
            r14.invoke(r13)
            r12.element = r13
            java.lang.String r14 = "args"
            java.util.Map r13 = r13.a()
            tb.dzv.a(r6, r14, r13)
        L_0x0053:
            tb.dr r3 = tb.dr.INSTANCE
            tb.r61 r8 = new tb.r61
            r8.<init>()
            java.lang.String r5 = "alarmSuccess"
            r7 = 0
            java.lang.String r4 = "appMonitor"
            r9 = 8
            r10 = 0
            tb.dr.d(r3, r4, r5, r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.x61.h(java.lang.String, java.lang.String, tb.g1a):void");
    }
}
