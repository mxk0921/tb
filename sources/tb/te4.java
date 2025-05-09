package tb;

import com.alipay.android.msp.framework.dynfun.TplMsg;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.Volatile;
import tb.te4;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public abstract class te4<N extends te4<N>> {
    public static final AtomicReferenceFieldUpdater c = AtomicReferenceFieldUpdater.newUpdater(te4.class, Object.class, "a");
    public static final AtomicReferenceFieldUpdater d = AtomicReferenceFieldUpdater.newUpdater(te4.class, Object.class, TplMsg.VALUE_T_NATIVE_RETURN);
    @Volatile

    /* renamed from: a  reason: collision with root package name */
    public volatile Object f28655a;
    @Volatile
    public volatile Object b;

    public te4(N n) {
        this.b = n;
    }

    public final void b() {
        d.lazySet(this, null);
    }

    public final N c() {
        N g = g();
        while (g != null && g.h()) {
            g = (N) ((te4) d.get(g));
        }
        return g;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [tb.te4] */
    /* JADX WARN: Unknown variable types count: 1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final N d() {
        /*
            r2 = this;
            java.lang.String r0 = tb.dv6.DEBUG_PROPERTY_NAME
            tb.te4 r0 = r2.e()
            tb.ckf.d(r0)
        L_0x0009:
            boolean r1 = r0.h()
            if (r1 == 0) goto L_0x0018
            tb.te4 r1 = r0.e()
            if (r1 != 0) goto L_0x0016
            return r0
        L_0x0016:
            r0 = r1
            goto L_0x0009
        L_0x0018:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.te4.d():tb.te4");
    }

    public final N e() {
        Object f = f();
        if (f == se4.f27989a) {
            return null;
        }
        return (N) ((te4) f);
    }

    public final Object f() {
        return c.get(this);
    }

    public final N g() {
        return (N) ((te4) d.get(this));
    }

    public abstract boolean h();

    public final boolean i() {
        if (e() == null) {
            return true;
        }
        return false;
    }

    public final boolean j() {
        return h30.a(c, this, null, se4.f27989a);
    }

    public final void k() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        Object obj;
        N n;
        String str = dv6.DEBUG_PROPERTY_NAME;
        if (!i()) {
            while (true) {
                N c2 = c();
                N d2 = d();
                do {
                    atomicReferenceFieldUpdater = d;
                    obj = atomicReferenceFieldUpdater.get(d2);
                    if (((te4) obj) == null) {
                        n = null;
                    } else {
                        n = c2;
                    }
                } while (!h30.a(atomicReferenceFieldUpdater, d2, obj, n));
                if (c2 != null) {
                    c.set(c2, d2);
                }
                if (!d2.h() || d2.i()) {
                    if (c2 == null || !c2.h()) {
                        return;
                    }
                }
            }
        }
    }

    public final boolean l(N n) {
        return h30.a(c, this, null, n);
    }
}
