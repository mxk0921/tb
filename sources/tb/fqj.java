package tb;

import android.app.Activity;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import kotlin.jvm.internal.Ref$ObjectRef;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class fqj {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final fqj INSTANCE = new fqj();

    static {
        t2o.a(1022361763);
    }

    public static /* synthetic */ void e(fqj fqjVar, String str, Activity activity, g1a g1aVar, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f8775f47", new Object[]{fqjVar, str, activity, g1aVar, new Integer(i), obj});
            return;
        }
        if ((i & 2) != 0) {
            activity = null;
        }
        if ((i & 4) != 0) {
            g1aVar = null;
        }
        fqjVar.d(str, activity, g1aVar);
    }

    public static final xhv f(final Ref$ObjectRef ref$ObjectRef, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xhv) ipChange.ipc$dispatch("3731e3b3", new Object[]{ref$ObjectRef, obj});
        }
        ckf.g(obj, rb.RESULT_KEY);
        zm8.b(obj, new u1a() { // from class: tb.dqj
            @Override // tb.u1a
            public final Object invoke(Object obj2, Object obj3) {
                xhv g;
                g = fqj.g(Ref$ObjectRef.this, (String) obj2, (Map) obj3);
                return g;
            }
        }, new g1a() { // from class: tb.eqj
            @Override // tb.g1a
            public final Object invoke(Object obj2) {
                xhv h;
                h = fqj.h(Ref$ObjectRef.this, (bi8) obj2);
                return h;
            }
        });
        return xhv.INSTANCE;
    }

    public static final xhv g(Ref$ObjectRef ref$ObjectRef, String str, Map map) {
        jqj jqjVar;
        g1a<gqj, xhv> f;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xhv) ipChange.ipc$dispatch("896b6250", new Object[]{ref$ObjectRef, str, map});
        }
        ckf.g(str, "type");
        ckf.g(map, "data");
        if (!(!ckf.b(str, "onResult") || (jqjVar = (jqj) ref$ObjectRef.element) == null || (f = jqjVar.f()) == null)) {
            f.invoke(new gqj(map));
        }
        return xhv.INSTANCE;
    }

    public static final xhv h(Ref$ObjectRef ref$ObjectRef, bi8 bi8Var) {
        g1a<bi8, xhv> e;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xhv) ipChange.ipc$dispatch("723f3aa8", new Object[]{ref$ObjectRef, bi8Var});
        }
        ckf.g(bi8Var, "error");
        jqj jqjVar = (jqj) ref$ObjectRef.element;
        if (!(jqjVar == null || (e = jqjVar.e()) == null)) {
            e.invoke(bi8Var);
        }
        return xhv.INSTANCE;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [T, java.lang.Object, tb.jqj] */
    /* JADX WARN: Unknown variable types count: 1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d(java.lang.String r9, android.app.Activity r10, tb.g1a<? super tb.jqj, tb.xhv> r11) {
        /*
            r8 = this;
            r0 = 1
            r1 = 0
            com.android.alibaba.ip.runtime.IpChange r2 = tb.fqj.$ipChange
            boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r3 == 0) goto L_0x001b
            java.lang.String r3 = "d17e02e"
            r4 = 4
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r4[r1] = r8
            r4[r0] = r9
            r9 = 2
            r4[r9] = r10
            r9 = 3
            r4[r9] = r11
            r2.ipc$dispatch(r3, r4)
            return
        L_0x001b:
            java.lang.String r2 = "url"
            tb.ckf.g(r9, r2)
            kotlin.Pair r9 = tb.jpu.a(r2, r9)
            kotlin.Pair[] r0 = new kotlin.Pair[r0]
            r0[r1] = r9
            java.util.Map r5 = kotlin.collections.a.k(r0)
            kotlin.jvm.internal.Ref$ObjectRef r9 = new kotlin.jvm.internal.Ref$ObjectRef
            r9.<init>()
            if (r11 == 0) goto L_0x0067
            tb.jqj r0 = new tb.jqj
            r0.<init>()
            r11.invoke(r0)
            r9.element = r0
            java.lang.String r11 = "extQuery"
            java.util.Map r1 = r0.c()
            tb.dzv.a(r5, r11, r1)
            java.lang.String r11 = "nativeParams"
            java.util.Map r1 = r0.d()
            tb.dzv.a(r5, r11, r1)
            java.lang.String r11 = "elementID"
            java.lang.String r1 = r0.b()
            tb.dzv.a(r5, r11, r1)
            boolean r11 = r0.a()
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r11)
            java.lang.String r0 = "animated"
            tb.dzv.a(r5, r0, r11)
        L_0x0067:
            tb.dr r2 = tb.dr.INSTANCE
            tb.cqj r7 = new tb.cqj
            r7.<init>()
            java.lang.String r3 = "navigator"
            java.lang.String r4 = "openURL"
            r6 = r10
            r2.c(r3, r4, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.fqj.d(java.lang.String, android.app.Activity, tb.g1a):void");
    }
}
