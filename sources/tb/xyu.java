package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import kotlin.jvm.internal.Ref$ObjectRef;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class xyu {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final xyu INSTANCE = new xyu();

    static {
        t2o.a(1022361947);
    }

    public static final xhv e(final Ref$ObjectRef ref$ObjectRef, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xhv) ipChange.ipc$dispatch("72f89411", new Object[]{ref$ObjectRef, obj});
        }
        ckf.g(obj, rb.RESULT_KEY);
        zm8.b(obj, new u1a() { // from class: tb.vyu
            @Override // tb.u1a
            public final Object invoke(Object obj2, Object obj3) {
                xhv f;
                f = xyu.f(Ref$ObjectRef.this, (String) obj2, (Map) obj3);
                return f;
            }
        }, new g1a() { // from class: tb.wyu
            @Override // tb.g1a
            public final Object invoke(Object obj2) {
                xhv g;
                g = xyu.g(Ref$ObjectRef.this, (bi8) obj2);
                return g;
            }
        });
        return xhv.INSTANCE;
    }

    public static final xhv f(Ref$ObjectRef ref$ObjectRef, String str, Map map) {
        k0v k0vVar;
        g1a<p2v, xhv> g;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xhv) ipChange.ipc$dispatch("11de58ae", new Object[]{ref$ObjectRef, str, map});
        }
        ckf.g(str, "type");
        ckf.g(map, "data");
        if (!(!ckf.b(str, "onResult") || (k0vVar = (k0v) ref$ObjectRef.element) == null || (g = k0vVar.g()) == null)) {
            g.invoke(new p2v(map));
        }
        return xhv.INSTANCE;
    }

    public static final xhv g(Ref$ObjectRef ref$ObjectRef, bi8 bi8Var) {
        g1a<bi8, xhv> f;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xhv) ipChange.ipc$dispatch("eb7c8b0a", new Object[]{ref$ObjectRef, bi8Var});
        }
        ckf.g(bi8Var, "error");
        k0v k0vVar = (k0v) ref$ObjectRef.element;
        if (!(k0vVar == null || (f = k0vVar.f()) == null)) {
            f.invoke(bi8Var);
        }
        return xhv.INSTANCE;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [T, java.lang.Object, tb.k0v] */
    /* JADX WARN: Unknown variable types count: 1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d(com.taobao.nanocompose.megability.ability.UTCommitAction r11, tb.g1a<? super tb.k0v, tb.xhv> r12) {
        /*
            r10 = this;
            r0 = 1
            r1 = 0
            com.android.alibaba.ip.runtime.IpChange r2 = tb.xyu.$ipChange
            boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r3 == 0) goto L_0x0018
            java.lang.String r3 = "c04b56de"
            r4 = 3
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r4[r1] = r10
            r4[r0] = r11
            r11 = 2
            r4[r11] = r12
            r2.ipc$dispatch(r3, r4)
            return
        L_0x0018:
            java.lang.String r2 = "action"
            tb.ckf.g(r11, r2)
            java.lang.String r11 = r11.getRawValue()
            kotlin.Pair r11 = tb.jpu.a(r2, r11)
            kotlin.Pair[] r0 = new kotlin.Pair[r0]
            r0[r1] = r11
            java.util.Map r5 = kotlin.collections.a.k(r0)
            kotlin.jvm.internal.Ref$ObjectRef r11 = new kotlin.jvm.internal.Ref$ObjectRef
            r11.<init>()
            if (r12 == 0) goto L_0x0083
            tb.k0v r0 = new tb.k0v
            r0.<init>()
            r12.invoke(r0)
            r11.element = r0
            java.lang.String r12 = "pageName"
            java.lang.String r1 = r0.h()
            tb.dzv.a(r5, r12, r1)
            java.lang.String r12 = "arg1"
            java.lang.String r1 = r0.a()
            tb.dzv.a(r5, r12, r1)
            java.lang.String r12 = "arg2"
            java.lang.String r1 = r0.b()
            tb.dzv.a(r5, r12, r1)
            java.lang.String r12 = "arg3"
            java.lang.String r1 = r0.c()
            tb.dzv.a(r5, r12, r1)
            java.lang.String r12 = "args"
            java.util.Map r1 = r0.d()
            tb.dzv.a(r5, r12, r1)
            java.lang.String r12 = "eventId"
            java.lang.Integer r1 = r0.e()
            tb.dzv.a(r5, r12, r1)
            boolean r12 = r0.i()
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r12)
            java.lang.String r0 = "useCustomBuilder"
            tb.dzv.a(r5, r0, r12)
        L_0x0083:
            tb.dr r2 = tb.dr.INSTANCE
            tb.uyu r7 = new tb.uyu
            r7.<init>()
            java.lang.String r4 = "commitEvent"
            r6 = 0
            java.lang.String r3 = "ut"
            r8 = 8
            r9 = 0
            tb.dr.d(r2, r3, r4, r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.xyu.d(com.taobao.nanocompose.megability.ability.UTCommitAction, tb.g1a):void");
    }
}
