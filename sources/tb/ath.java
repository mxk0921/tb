package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import kotlin.jvm.internal.Ref$ObjectRef;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class ath {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final ath INSTANCE = new ath();

    static {
        t2o.a(1022361746);
    }

    public static final xhv e(final Ref$ObjectRef ref$ObjectRef, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xhv) ipChange.ipc$dispatch("cd3000c7", new Object[]{ref$ObjectRef, obj});
        }
        ckf.g(obj, rb.RESULT_KEY);
        zm8.b(obj, new u1a() { // from class: tb.ysh
            @Override // tb.u1a
            public final Object invoke(Object obj2, Object obj3) {
                xhv f;
                f = ath.f(Ref$ObjectRef.this, (String) obj2, (Map) obj3);
                return f;
            }
        }, new g1a() { // from class: tb.zsh
            @Override // tb.g1a
            public final Object invoke(Object obj2) {
                xhv g;
                g = ath.g(Ref$ObjectRef.this, (bi8) obj2);
                return g;
            }
        });
        return xhv.INSTANCE;
    }

    public static final xhv f(Ref$ObjectRef ref$ObjectRef, String str, Map map) {
        fth fthVar;
        g1a<eth, xhv> m;
        g1a<eth, xhv> n;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xhv) ipChange.ipc$dispatch("51e88364", new Object[]{ref$ObjectRef, str, map});
        }
        ckf.g(str, "type");
        ckf.g(map, "data");
        if (ckf.b(str, "onReceiveData")) {
            fth fthVar2 = (fth) ref$ObjectRef.element;
            if (!(fthVar2 == null || (n = fthVar2.n()) == null)) {
                n.invoke(new eth(map));
            }
        } else if (!(!ckf.b(str, "onFailure") || (fthVar = (fth) ref$ObjectRef.element) == null || (m = fthVar.m()) == null)) {
            m.invoke(new eth(map));
        }
        return xhv.INSTANCE;
    }

    public static final xhv g(Ref$ObjectRef ref$ObjectRef, bi8 bi8Var) {
        g1a<bi8, xhv> l;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xhv) ipChange.ipc$dispatch("89634e14", new Object[]{ref$ObjectRef, bi8Var});
        }
        ckf.g(bi8Var, "error");
        fth fthVar = (fth) ref$ObjectRef.element;
        if (!(fthVar == null || (l = fthVar.l()) == null)) {
            l.invoke(bi8Var);
        }
        return xhv.INSTANCE;
    }

    /* JADX WARN: Type inference failed for: r13v2, types: [T, tb.fth, java.lang.Object] */
    /* JADX WARN: Unknown variable types count: 1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d(java.lang.String r12, java.lang.String r13, tb.g1a<? super tb.fth, tb.xhv> r14) {
        /*
            Method dump skipped, instructions count: 328
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.ath.d(java.lang.String, java.lang.String, tb.g1a):void");
    }
}
