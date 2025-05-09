package kotlinx.coroutines.sync;

import com.alipay.android.msp.framework.dynfun.TplMsg;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.jvm.Volatile;
import kotlinx.coroutines.c;
import tb.ar4;
import tb.ckf;
import tb.dkf;
import tb.dv6;
import tb.g1a;
import tb.h30;
import tb.jv6;
import tb.k9p;
import tb.q23;
import tb.qww;
import tb.s23;
import tb.se4;
import tb.u1r;
import tb.v8p;
import tb.x8p;
import tb.xhv;
import tb.y9p;
import tb.yi3;
import tb.z9p;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class SemaphoreImpl implements y9p {
    public static final AtomicReferenceFieldUpdater h = AtomicReferenceFieldUpdater.newUpdater(SemaphoreImpl.class, Object.class, TplMsg.VALUE_T_NATIVE_RETURN);
    public static final AtomicLongFieldUpdater i = AtomicLongFieldUpdater.newUpdater(SemaphoreImpl.class, "c");
    public static final AtomicReferenceFieldUpdater j = AtomicReferenceFieldUpdater.newUpdater(SemaphoreImpl.class, Object.class, "d");
    public static final AtomicLongFieldUpdater k = AtomicLongFieldUpdater.newUpdater(SemaphoreImpl.class, "e");
    public static final AtomicIntegerFieldUpdater l = AtomicIntegerFieldUpdater.newUpdater(SemaphoreImpl.class, "f");

    /* renamed from: a  reason: collision with root package name */
    public final int f15398a;
    @Volatile
    public volatile Object b;
    @Volatile
    public volatile long c;
    @Volatile
    public volatile Object d;
    @Volatile
    public volatile long e;
    @Volatile
    public volatile int f;
    public final g1a<Throwable, xhv> g;

    public SemaphoreImpl(int i2, int i3) {
        this.f15398a = i2;
        if (i2 <= 0) {
            throw new IllegalArgumentException(("Semaphore should have at least 1 permit, but had " + i2).toString());
        } else if (i3 < 0 || i3 > i2) {
            throw new IllegalArgumentException(("The number of acquired permits should be in 0.." + i2).toString());
        } else {
            z9p z9pVar = new z9p(0L, null, 2);
            this.b = z9pVar;
            this.d = z9pVar;
            this.f = i2 - i3;
            this.g = new SemaphoreImpl$onCancellationRelease$1(this);
        }
    }

    public static /* synthetic */ Object e(SemaphoreImpl semaphoreImpl, ar4<? super xhv> ar4Var) {
        if (semaphoreImpl.i() > 0) {
            return xhv.INSTANCE;
        }
        Object f = semaphoreImpl.f(ar4Var);
        if (f == dkf.d()) {
            return f;
        }
        return xhv.INSTANCE;
    }

    @Override // tb.y9p
    public Object a(ar4<? super xhv> ar4Var) {
        return e(this, ar4Var);
    }

    public final void d(q23<? super xhv> q23Var) {
        while (i() <= 0) {
            ckf.e(q23Var, "null cannot be cast to non-null type kotlinx.coroutines.Waiter");
            if (g((qww) q23Var)) {
                return;
            }
        }
        q23Var.l(xhv.INSTANCE, this.g);
    }

    public final Object f(ar4<? super xhv> ar4Var) {
        c b = s23.b(IntrinsicsKt__IntrinsicsJvmKt.c(ar4Var));
        try {
            if (!g(b)) {
                d(b);
            }
            Object A = b.A();
            if (A == dkf.d()) {
                jv6.c(ar4Var);
            }
            if (A == dkf.d()) {
                return A;
            }
            return xhv.INSTANCE;
        } catch (Throwable th) {
            b.S();
            throw th;
        }
    }

    public final boolean g(qww qwwVar) {
        int i2;
        Object b;
        int i3;
        u1r u1rVar;
        u1r u1rVar2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = j;
        z9p z9pVar = (z9p) atomicReferenceFieldUpdater.get(this);
        long andIncrement = k.getAndIncrement(this);
        SemaphoreImpl$addAcquireToQueue$createNewSegment$1 semaphoreImpl$addAcquireToQueue$createNewSegment$1 = SemaphoreImpl$addAcquireToQueue$createNewSegment$1.INSTANCE;
        i2 = SemaphoreKt.f;
        long j2 = andIncrement / i2;
        loop0: while (true) {
            b = se4.b(z9pVar, j2, semaphoreImpl$addAcquireToQueue$createNewSegment$1);
            if (x8p.b(b)) {
                break;
            }
            v8p a2 = x8p.a(b);
            while (true) {
                v8p v8pVar = (v8p) atomicReferenceFieldUpdater.get(this);
                if (v8pVar.e >= a2.e) {
                    break loop0;
                } else if (!a2.q()) {
                    break;
                } else if (h30.a(atomicReferenceFieldUpdater, this, v8pVar, a2)) {
                    if (v8pVar.m()) {
                        v8pVar.k();
                    }
                } else if (a2.m()) {
                    a2.k();
                }
            }
        }
        z9p z9pVar2 = (z9p) x8p.a(b);
        i3 = SemaphoreKt.f;
        int i4 = (int) (andIncrement % i3);
        if (yi3.a(z9pVar2.r(), i4, null, qwwVar)) {
            qwwVar.c(z9pVar2, i4);
            return true;
        }
        u1rVar = SemaphoreKt.b;
        u1rVar2 = SemaphoreKt.c;
        if (yi3.a(z9pVar2.r(), i4, u1rVar, u1rVar2)) {
            if (qwwVar instanceof q23) {
                ckf.e(qwwVar, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>");
                ((q23) qwwVar).l(xhv.INSTANCE, this.g);
            } else if (qwwVar instanceof k9p) {
                ((k9p) qwwVar).b(xhv.INSTANCE);
            } else {
                throw new IllegalStateException(("unexpected: " + qwwVar).toString());
            }
            return true;
        }
        String str = dv6.DEBUG_PROPERTY_NAME;
        return false;
    }

    public final void h() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i2;
        int i3;
        do {
            atomicIntegerFieldUpdater = l;
            i2 = atomicIntegerFieldUpdater.get(this);
            i3 = this.f15398a;
            if (i2 <= i3) {
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i2, i3));
    }

    public final int i() {
        int andDecrement;
        do {
            andDecrement = l.getAndDecrement(this);
        } while (andDecrement > this.f15398a);
        return andDecrement;
    }

    public int j() {
        return Math.max(l.get(this), 0);
    }

    public final void k(k9p<?> k9pVar, Object obj) {
        while (i() <= 0) {
            ckf.e(k9pVar, "null cannot be cast to non-null type kotlinx.coroutines.Waiter");
            if (g((qww) k9pVar)) {
                return;
            }
        }
        k9pVar.b(xhv.INSTANCE);
    }

    public boolean l() {
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = l;
            int i2 = atomicIntegerFieldUpdater.get(this);
            if (i2 > this.f15398a) {
                h();
            } else if (i2 <= 0) {
                return false;
            } else {
                if (atomicIntegerFieldUpdater.compareAndSet(this, i2, i2 - 1)) {
                    return true;
                }
            }
        }
    }

    public final boolean m(Object obj) {
        if (obj instanceof q23) {
            ckf.e(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>");
            q23 q23Var = (q23) obj;
            Object q = q23Var.q(xhv.INSTANCE, null, this.g);
            if (q == null) {
                return false;
            }
            q23Var.p(q);
            return true;
        } else if (obj instanceof k9p) {
            return ((k9p) obj).e(this, xhv.INSTANCE);
        } else {
            throw new IllegalStateException(("unexpected: " + obj).toString());
        }
    }

    public final boolean n() {
        int i2;
        Object b;
        int i3;
        u1r u1rVar;
        u1r u1rVar2;
        int i4;
        u1r u1rVar3;
        u1r u1rVar4;
        u1r u1rVar5;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = h;
        z9p z9pVar = (z9p) atomicReferenceFieldUpdater.get(this);
        long andIncrement = i.getAndIncrement(this);
        i2 = SemaphoreKt.f;
        long j2 = andIncrement / i2;
        SemaphoreImpl$tryResumeNextFromQueue$createNewSegment$1 semaphoreImpl$tryResumeNextFromQueue$createNewSegment$1 = SemaphoreImpl$tryResumeNextFromQueue$createNewSegment$1.INSTANCE;
        loop0: while (true) {
            b = se4.b(z9pVar, j2, semaphoreImpl$tryResumeNextFromQueue$createNewSegment$1);
            if (x8p.b(b)) {
                break;
            }
            v8p a2 = x8p.a(b);
            while (true) {
                v8p v8pVar = (v8p) atomicReferenceFieldUpdater.get(this);
                if (v8pVar.e >= a2.e) {
                    break loop0;
                } else if (!a2.q()) {
                    break;
                } else if (h30.a(atomicReferenceFieldUpdater, this, v8pVar, a2)) {
                    if (v8pVar.m()) {
                        v8pVar.k();
                    }
                } else if (a2.m()) {
                    a2.k();
                }
            }
        }
        z9p z9pVar2 = (z9p) x8p.a(b);
        z9pVar2.b();
        if (z9pVar2.e > j2) {
            return false;
        }
        i3 = SemaphoreKt.f;
        int i5 = (int) (andIncrement % i3);
        u1rVar = SemaphoreKt.b;
        Object andSet = z9pVar2.r().getAndSet(i5, u1rVar);
        if (andSet == null) {
            i4 = SemaphoreKt.f15399a;
            for (int i6 = 0; i6 < i4; i6++) {
                Object obj = z9pVar2.r().get(i5);
                u1rVar5 = SemaphoreKt.c;
                if (obj == u1rVar5) {
                    return true;
                }
            }
            u1rVar3 = SemaphoreKt.b;
            u1rVar4 = SemaphoreKt.d;
            return !yi3.a(z9pVar2.r(), i5, u1rVar3, u1rVar4);
        }
        u1rVar2 = SemaphoreKt.e;
        if (andSet == u1rVar2) {
            return false;
        }
        return m(andSet);
    }

    @Override // tb.y9p
    public void release() {
        do {
            int andIncrement = l.getAndIncrement(this);
            int i2 = this.f15398a;
            if (andIncrement >= i2) {
                h();
                throw new IllegalStateException(("The number of released permits cannot be greater than " + i2).toString());
            } else if (andIncrement >= 0) {
                return;
            }
        } while (!n());
    }
}
