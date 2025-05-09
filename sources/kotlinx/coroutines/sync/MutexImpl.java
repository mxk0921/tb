package kotlinx.coroutines.sync;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.jvm.Volatile;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.c;
import tb.ar4;
import tb.ckf;
import tb.dkf;
import tb.dv6;
import tb.g1a;
import tb.h30;
import tb.jv6;
import tb.k9p;
import tb.l9p;
import tb.ofj;
import tb.ov6;
import tb.q23;
import tb.qww;
import tb.rr7;
import tb.s23;
import tb.u1r;
import tb.v8p;
import tb.xhv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class MutexImpl extends SemaphoreImpl implements ofj {
    public static final AtomicReferenceFieldUpdater n = AtomicReferenceFieldUpdater.newUpdater(MutexImpl.class, Object.class, "m");
    @Volatile
    public volatile Object m;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public final class CancellableContinuationWithOwner implements q23<xhv>, qww {

        /* renamed from: a  reason: collision with root package name */
        public final c<xhv> f15395a;
        public final Object b;

        /* JADX WARN: Multi-variable type inference failed */
        public CancellableContinuationWithOwner(c<? super xhv> cVar, Object obj) {
            this.f15395a = cVar;
            this.b = obj;
        }

        /* renamed from: a */
        public void l(xhv xhvVar, g1a<? super Throwable, xhv> g1aVar) {
            String str = dv6.DEBUG_PROPERTY_NAME;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = MutexImpl.n;
            Object obj = this.b;
            MutexImpl mutexImpl = MutexImpl.this;
            atomicReferenceFieldUpdater.set(mutexImpl, obj);
            this.f15395a.l(xhvVar, new MutexImpl$CancellableContinuationWithOwner$resume$2(mutexImpl, this));
        }

        /* renamed from: b */
        public void r(CoroutineDispatcher coroutineDispatcher, xhv xhvVar) {
            this.f15395a.r(coroutineDispatcher, xhvVar);
        }

        @Override // tb.qww
        public void c(v8p<?> v8pVar, int i) {
            this.f15395a.c(v8pVar, i);
        }

        /* renamed from: d */
        public Object q(xhv xhvVar, Object obj, g1a<? super Throwable, xhv> g1aVar) {
            String str = dv6.DEBUG_PROPERTY_NAME;
            MutexImpl mutexImpl = MutexImpl.this;
            Object q = this.f15395a.q(xhvVar, obj, new MutexImpl$CancellableContinuationWithOwner$tryResume$token$1(mutexImpl, this));
            if (q != null) {
                MutexImpl.n.set(mutexImpl, this.b);
            }
            return q;
        }

        @Override // tb.ar4
        public d getContext() {
            return this.f15395a.getContext();
        }

        @Override // tb.q23
        public void h(g1a<? super Throwable, xhv> g1aVar) {
            this.f15395a.h(g1aVar);
        }

        @Override // tb.q23
        public void p(Object obj) {
            this.f15395a.p(obj);
        }

        @Override // tb.ar4
        public void resumeWith(Object obj) {
            this.f15395a.resumeWith(obj);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public final class a<Q> implements l9p<Q> {

        /* renamed from: a  reason: collision with root package name */
        public final l9p<Q> f15396a;
        public final Object b;

        public a(l9p<Q> l9pVar, Object obj) {
            this.f15396a = l9pVar;
            this.b = obj;
        }

        @Override // tb.k9p
        public void b(Object obj) {
            String str = dv6.DEBUG_PROPERTY_NAME;
            MutexImpl.n.set(MutexImpl.this, this.b);
            this.f15396a.b(obj);
        }

        @Override // tb.qww
        public void c(v8p<?> v8pVar, int i) {
            this.f15396a.c(v8pVar, i);
        }

        @Override // tb.k9p
        public void d(rr7 rr7Var) {
            this.f15396a.d(rr7Var);
        }

        @Override // tb.k9p
        public boolean e(Object obj, Object obj2) {
            String str = dv6.DEBUG_PROPERTY_NAME;
            boolean e = this.f15396a.e(obj, obj2);
            if (e) {
                MutexImpl.n.set(MutexImpl.this, this.b);
            }
            return e;
        }

        @Override // tb.k9p
        public d getContext() {
            return this.f15396a.getContext();
        }
    }

    public MutexImpl(boolean z) {
        super(1, z ? 1 : 0);
        u1r u1rVar;
        if (z) {
            u1rVar = null;
        } else {
            u1rVar = MutexKt.f15397a;
        }
        this.m = u1rVar;
        new MutexImpl$onSelectCancellationUnlockConstructor$1(this);
    }

    public static /* synthetic */ Object s(MutexImpl mutexImpl, Object obj, ar4<? super xhv> ar4Var) {
        if (mutexImpl.w(obj)) {
            return xhv.INSTANCE;
        }
        Object t = mutexImpl.t(obj, ar4Var);
        if (t == dkf.d()) {
            return t;
        }
        return xhv.INSTANCE;
    }

    @Override // tb.ofj
    public Object b(Object obj, ar4<? super xhv> ar4Var) {
        return s(this, obj, ar4Var);
    }

    public boolean p(Object obj) {
        if (q(obj) == 1) {
            return true;
        }
        return false;
    }

    public final int q(Object obj) {
        while (r()) {
            Object obj2 = n.get(this);
            if (obj2 != MutexKt.f15397a) {
                if (obj2 == obj) {
                    return 1;
                }
                return 2;
            }
        }
        return 0;
    }

    public boolean r() {
        if (j() == 0) {
            return true;
        }
        return false;
    }

    public final Object t(Object obj, ar4<? super xhv> ar4Var) {
        c b = s23.b(IntrinsicsKt__IntrinsicsJvmKt.c(ar4Var));
        try {
            d(new CancellableContinuationWithOwner(b, obj));
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

    public String toString() {
        return "Mutex@" + ov6.b(this) + "[isLocked=" + r() + ",owner=" + n.get(this) + ']';
    }

    public Object u(Object obj, Object obj2) {
        if (!ckf.b(obj2, MutexKt.b)) {
            return this;
        }
        throw new IllegalStateException(("This mutex is already locked by the specified owner: " + obj).toString());
    }

    @Override // tb.ofj
    public void unlock(Object obj) {
        while (r()) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = n;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            u1r u1rVar = MutexKt.f15397a;
            if (obj2 != u1rVar) {
                if (obj2 != obj && obj != null) {
                    throw new IllegalStateException(("This mutex is locked by " + obj2 + ", but " + obj + " is expected").toString());
                } else if (h30.a(atomicReferenceFieldUpdater, this, obj2, u1rVar)) {
                    release();
                    return;
                }
            }
        }
        throw new IllegalStateException("This mutex is not locked");
    }

    public void v(k9p<?> k9pVar, Object obj) {
        if (obj == null || !p(obj)) {
            ckf.e(k9pVar, "null cannot be cast to non-null type kotlinx.coroutines.selects.SelectInstanceInternal<*>");
            k(new a((l9p) k9pVar, obj), obj);
            return;
        }
        k9pVar.b(MutexKt.b);
    }

    public boolean w(Object obj) {
        int x = x(obj);
        if (x == 0) {
            return true;
        }
        if (x == 1) {
            return false;
        }
        if (x != 2) {
            throw new IllegalStateException("unexpected");
        }
        throw new IllegalStateException(("This mutex is already locked by the specified owner: " + obj).toString());
    }

    public final int x(Object obj) {
        while (!l()) {
            if (obj == null) {
                return 1;
            }
            int q = q(obj);
            if (q == 1) {
                return 2;
            }
            if (q == 2) {
                return 1;
            }
        }
        String str = dv6.DEBUG_PROPERTY_NAME;
        n.set(this, obj);
        return 0;
    }
}
