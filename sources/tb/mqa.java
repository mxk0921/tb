package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.nanocompose.megability.ability.b;
import java.util.Map;
import kotlin.jvm.internal.Ref$ObjectRef;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class mqa {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final mqa INSTANCE = new mqa();

    static {
        t2o.a(1022361716);
    }

    public static final xhv e(final Ref$ObjectRef ref$ObjectRef, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xhv) ipChange.ipc$dispatch("c7990336", new Object[]{ref$ObjectRef, obj});
        }
        ckf.g(obj, rb.RESULT_KEY);
        zm8.b(obj, new u1a() { // from class: tb.kqa
            @Override // tb.u1a
            public final Object invoke(Object obj2, Object obj3) {
                xhv f;
                f = mqa.f(Ref$ObjectRef.this, (String) obj2, (Map) obj3);
                return f;
            }
        }, new g1a() { // from class: tb.lqa
            @Override // tb.g1a
            public final Object invoke(Object obj2) {
                xhv g;
                g = mqa.g(Ref$ObjectRef.this, (bi8) obj2);
                return g;
            }
        });
        return xhv.INSTANCE;
    }

    public static final xhv f(Ref$ObjectRef ref$ObjectRef, String str, Map map) {
        pqa pqaVar;
        d1a<xhv> e;
        pqa pqaVar2;
        g1a<b, xhv> g;
        pqa pqaVar3;
        g1a<oqa, xhv> h;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xhv) ipChange.ipc$dispatch("92dce8d3", new Object[]{ref$ObjectRef, str, map});
        }
        ckf.g(str, "type");
        ckf.g(map, "data");
        int hashCode = str.hashCode();
        if (hashCode != -1351896231) {
            if (hashCode != -1013362275) {
                if (hashCode == -530890460 && str.equals("onSuccess") && (pqaVar3 = (pqa) ref$ObjectRef.element) != null && (h = pqaVar3.h()) != null) {
                    h.invoke(new oqa(map));
                }
            } else if (!(!str.equals("onFail") || (pqaVar2 = (pqa) ref$ObjectRef.element) == null || (g = pqaVar2.g()) == null)) {
                g.invoke(new b(map));
            }
        } else if (!(!str.equals("onClose") || (pqaVar = (pqa) ref$ObjectRef.element) == null || (e = pqaVar.e()) == null)) {
            e.invoke();
        }
        return xhv.INSTANCE;
    }

    public static final xhv g(Ref$ObjectRef ref$ObjectRef, bi8 bi8Var) {
        g1a<bi8, xhv> f;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xhv) ipChange.ipc$dispatch("3f8bf405", new Object[]{ref$ObjectRef, bi8Var});
        }
        ckf.g(bi8Var, "error");
        pqa pqaVar = (pqa) ref$ObjectRef.element;
        if (!(pqaVar == null || (f = pqaVar.f()) == null)) {
            f.invoke(bi8Var);
        }
        return xhv.INSTANCE;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [T, java.lang.Object, tb.pqa] */
    /* JADX WARN: Unknown variable types count: 1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d(java.lang.String r11, tb.g1a<? super tb.pqa, tb.xhv> r12) {
        /*
            r10 = this;
            r0 = 1
            r1 = 0
            com.android.alibaba.ip.runtime.IpChange r2 = tb.mqa.$ipChange
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
            java.lang.String r2 = "url"
            tb.ckf.g(r11, r2)
            kotlin.Pair r11 = tb.jpu.a(r2, r11)
            kotlin.Pair[] r0 = new kotlin.Pair[r0]
            r0[r1] = r11
            java.util.Map r5 = kotlin.collections.a.k(r0)
            kotlin.jvm.internal.Ref$ObjectRef r11 = new kotlin.jvm.internal.Ref$ObjectRef
            r11.<init>()
            if (r12 == 0) goto L_0x007d
            tb.pqa r0 = new tb.pqa
            r0.<init>()
            r12.invoke(r0)
            r11.element = r0
            java.lang.String r12 = "headers"
            java.util.Map r1 = r0.c()
            tb.dzv.a(r5, r12, r1)
            com.taobao.nanocompose.megability.ability.HTTPRequestMethod r12 = r0.d()
            r1 = 0
            if (r12 == 0) goto L_0x0050
            java.lang.String r12 = r12.getRawValue()
            goto L_0x0051
        L_0x0050:
            r12 = r1
        L_0x0051:
            java.lang.String r2 = "method"
            tb.dzv.a(r5, r2, r12)
            java.lang.String r12 = "data"
            java.util.Map r2 = r0.a()
            tb.dzv.a(r5, r12, r2)
            int r12 = r0.i()
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            java.lang.String r2 = "timeout"
            tb.dzv.a(r5, r2, r12)
            com.taobao.nanocompose.megability.ability.HTTPRequestDataType r12 = r0.b()
            if (r12 == 0) goto L_0x0078
            java.lang.String r1 = r12.getRawValue()
        L_0x0078:
            java.lang.String r12 = "dataType"
            tb.dzv.a(r5, r12, r1)
        L_0x007d:
            tb.dr r2 = tb.dr.INSTANCE
            tb.jqa r7 = new tb.jqa
            r7.<init>()
            java.lang.String r4 = "send"
            r6 = 0
            java.lang.String r3 = "HTTPRequest"
            r8 = 8
            r9 = 0
            tb.dr.d(r2, r3, r4, r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.mqa.d(java.lang.String, tb.g1a):void");
    }
}
