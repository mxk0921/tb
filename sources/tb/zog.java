package tb;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Metadata;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.d;
import kotlin.jvm.Volatile;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.h;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public final class zog extends CoroutineDispatcher implements h {
    public static final AtomicIntegerFieldUpdater g = AtomicIntegerFieldUpdater.newUpdater(zog.class, "d");

    /* renamed from: a  reason: collision with root package name */
    public final CoroutineDispatcher f32909a;
    public final int b;
    public final /* synthetic */ h c;
    @Volatile
    public volatile int d;
    public final tch<Runnable> e;
    public final Object f;

    /* compiled from: Taobao */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0082\u0004\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0013\u0012\n\u0010\u0003\u001a\u00060\u0001j\u0002`\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0003\u001a\u00060\u0001j\u0002`\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Ltb/zog$a;", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "currentTask", "<init>", "(Ltb/zog;Ljava/lang/Runnable;)V", "Ltb/xhv;", "run", "()V", "a", "Ljava/lang/Runnable;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public final class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        private Runnable f32910a;

        public a(Runnable runnable) {
            this.f32910a = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            int i = 0;
            while (true) {
                try {
                    this.f32910a.run();
                } catch (Throwable th) {
                    tu4.a(EmptyCoroutineContext.INSTANCE, th);
                }
                Runnable P0 = zog.this.P0();
                if (P0 != null) {
                    this.f32910a = P0;
                    i++;
                    if (i >= 16 && zog.this.f32909a.isDispatchNeeded(zog.this)) {
                        zog.this.f32909a.dispatch(zog.this, this);
                        return;
                    }
                } else {
                    return;
                }
            }
        }
    }

    public zog(CoroutineDispatcher coroutineDispatcher, int i) {
        h hVar;
        this.f32909a = coroutineDispatcher;
        this.b = i;
        if (coroutineDispatcher instanceof h) {
            hVar = (h) coroutineDispatcher;
        } else {
            hVar = null;
        }
        this.c = hVar == null ? t07.a() : hVar;
        this.e = new tch<>(false);
        this.f = new Object();
    }

    public final Runnable P0() {
        while (true) {
            Runnable d = this.e.d();
            if (d != null) {
                return d;
            }
            synchronized (this.f) {
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = g;
                atomicIntegerFieldUpdater.decrementAndGet(this);
                if (this.e.c() == 0) {
                    return null;
                }
                atomicIntegerFieldUpdater.incrementAndGet(this);
            }
        }
    }

    public final boolean Q0() {
        synchronized (this.f) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = g;
            if (atomicIntegerFieldUpdater.get(this) >= this.b) {
                return false;
            }
            atomicIntegerFieldUpdater.incrementAndGet(this);
            return true;
        }
    }

    @Override // kotlinx.coroutines.h
    public rr7 b(long j, Runnable runnable, d dVar) {
        return this.c.b(j, runnable, dVar);
    }

    @Override // kotlinx.coroutines.h
    public void c(long j, q23<? super xhv> q23Var) {
        this.c.c(j, q23Var);
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public void dispatch(d dVar, Runnable runnable) {
        Runnable P0;
        this.e.a(runnable);
        if (g.get(this) < this.b && Q0() && (P0 = P0()) != null) {
            this.f32909a.dispatch(this, new a(P0));
        }
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public void dispatchYield(d dVar, Runnable runnable) {
        Runnable P0;
        this.e.a(runnable);
        if (g.get(this) < this.b && Q0() && (P0 = P0()) != null) {
            this.f32909a.dispatchYield(this, new a(P0));
        }
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public CoroutineDispatcher limitedParallelism(int i) {
        apg.a(i);
        if (i >= this.b) {
            return this;
        }
        return super.limitedParallelism(i);
    }
}
