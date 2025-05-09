package tb;

import com.alipay.android.msp.framework.dynfun.TplMsg;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.Volatile;
import kotlin.jvm.internal.Ref$ObjectRef;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public final class mix {
    public static final AtomicReferenceFieldUpdater f = AtomicReferenceFieldUpdater.newUpdater(mix.class, Object.class, TplMsg.VALUE_T_NATIVE_RETURN);
    public static final AtomicIntegerFieldUpdater g = AtomicIntegerFieldUpdater.newUpdater(mix.class, "c");
    public static final AtomicIntegerFieldUpdater h = AtomicIntegerFieldUpdater.newUpdater(mix.class, "d");
    public static final AtomicIntegerFieldUpdater i = AtomicIntegerFieldUpdater.newUpdater(mix.class, "e");

    /* renamed from: a  reason: collision with root package name */
    public final AtomicReferenceArray<sct> f24070a = new AtomicReferenceArray<>(128);
    @Volatile
    public volatile Object b;
    @Volatile
    public volatile int c;
    @Volatile
    public volatile int d;
    @Volatile
    public volatile int e;

    public final sct a(sct sctVar, boolean z) {
        if (z) {
            return b(sctVar);
        }
        sct sctVar2 = (sct) f.getAndSet(this, sctVar);
        if (sctVar2 == null) {
            return null;
        }
        return b(sctVar2);
    }

    public final sct b(sct sctVar) {
        if (d() == 127) {
            return sctVar;
        }
        if (sctVar.b.b() == 1) {
            i.incrementAndGet(this);
        }
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = g;
        int i2 = 127 & atomicIntegerFieldUpdater.get(this);
        while (true) {
            AtomicReferenceArray<sct> atomicReferenceArray = this.f24070a;
            if (atomicReferenceArray.get(i2) != null) {
                Thread.yield();
            } else {
                atomicReferenceArray.lazySet(i2, sctVar);
                atomicIntegerFieldUpdater.incrementAndGet(this);
                return null;
            }
        }
    }

    public final void c(sct sctVar) {
        if (sctVar != null && sctVar.b.b() == 1) {
            i.decrementAndGet(this);
            String str = dv6.DEBUG_PROPERTY_NAME;
        }
    }

    public final int d() {
        return g.get(this) - h.get(this);
    }

    public final int e() {
        if (f.get(this) != null) {
            return d() + 1;
        }
        return d();
    }

    public final void f(gca gcaVar) {
        sct sctVar = (sct) f.getAndSet(this, null);
        if (sctVar != null) {
            gcaVar.a(sctVar);
        }
        do {
        } while (k(gcaVar));
    }

    public final sct g() {
        sct sctVar = (sct) f.getAndSet(this, null);
        if (sctVar == null) {
            return i();
        }
        return sctVar;
    }

    public final sct h() {
        return l(true);
    }

    public final sct i() {
        sct andSet;
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = h;
            int i2 = atomicIntegerFieldUpdater.get(this);
            if (i2 - g.get(this) == 0) {
                return null;
            }
            int i3 = i2 & 127;
            if (atomicIntegerFieldUpdater.compareAndSet(this, i2, i2 + 1) && (andSet = this.f24070a.getAndSet(i3, null)) != null) {
                c(andSet);
                return andSet;
            }
        }
    }

    public final sct j() {
        return l(false);
    }

    public final boolean k(gca gcaVar) {
        sct i2 = i();
        if (i2 == null) {
            return false;
        }
        gcaVar.a(i2);
        return true;
    }

    public final sct l(boolean z) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        sct sctVar;
        do {
            atomicReferenceFieldUpdater = f;
            sctVar = (sct) atomicReferenceFieldUpdater.get(this);
            if (sctVar != null) {
                boolean z2 = true;
                if (sctVar.b.b() != 1) {
                    z2 = false;
                }
                if (z2 == z) {
                }
            }
            int i2 = h.get(this);
            int i3 = g.get(this);
            while (i2 != i3) {
                if (z && i.get(this) == 0) {
                    return null;
                }
                i3--;
                sct n = n(i3, z);
                if (n != null) {
                    return n;
                }
            }
            return null;
        } while (!h30.a(atomicReferenceFieldUpdater, this, sctVar, null));
        return sctVar;
    }

    public final sct m(int i2) {
        int i3 = h.get(this);
        int i4 = g.get(this);
        boolean z = true;
        if (i2 != 1) {
            z = false;
        }
        while (i3 != i4) {
            if (z && i.get(this) == 0) {
                return null;
            }
            int i5 = i3 + 1;
            sct n = n(i3, z);
            if (n != null) {
                return n;
            }
            i3 = i5;
        }
        return null;
    }

    public final sct n(int i2, boolean z) {
        int i3 = i2 & 127;
        AtomicReferenceArray<sct> atomicReferenceArray = this.f24070a;
        sct sctVar = atomicReferenceArray.get(i3);
        if (sctVar != null) {
            boolean z2 = true;
            if (sctVar.b.b() != 1) {
                z2 = false;
            }
            if (z2 == z && yi3.a(atomicReferenceArray, i3, sctVar, null)) {
                if (z) {
                    i.decrementAndGet(this);
                }
                return sctVar;
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long o(int i2, Ref$ObjectRef<sct> ref$ObjectRef) {
        T t;
        if (i2 == 3) {
            t = i();
        } else {
            t = m(i2);
        }
        if (t == 0) {
            return p(i2, ref$ObjectRef);
        }
        ref$ObjectRef.element = t;
        return -1L;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [T, tb.sct, java.lang.Object] */
    /* JADX WARN: Unknown variable types count: 1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long p(int r8, kotlin.jvm.internal.Ref$ObjectRef<tb.sct> r9) {
        /*
            r7 = this;
        L_0x0000:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = tb.mix.f
            java.lang.Object r1 = r0.get(r7)
            tb.sct r1 = (tb.sct) r1
            r2 = -2
            if (r1 != 0) goto L_0x000d
            return r2
        L_0x000d:
            tb.gdt r4 = r1.b
            int r4 = r4.b()
            r5 = 1
            if (r4 != r5) goto L_0x0017
            goto L_0x0018
        L_0x0017:
            r5 = 2
        L_0x0018:
            r4 = r5 & r8
            if (r4 != 0) goto L_0x001d
            return r2
        L_0x001d:
            tb.puo r2 = tb.vft.f29991a
            long r2 = r2.a()
            long r4 = r1.f27955a
            long r2 = r2 - r4
            long r4 = tb.vft.WORK_STEALING_TIME_RESOLUTION_NS
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 >= 0) goto L_0x002e
            long r4 = r4 - r2
            return r4
        L_0x002e:
            r2 = 0
            boolean r0 = tb.h30.a(r0, r7, r1, r2)
            if (r0 == 0) goto L_0x0000
            r9.element = r1
            r8 = -1
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.mix.p(int, kotlin.jvm.internal.Ref$ObjectRef):long");
    }
}
