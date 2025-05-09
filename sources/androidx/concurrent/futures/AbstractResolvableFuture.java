package androidx.concurrent.futures;

import com.alipay.android.msp.framework.dynfun.TplMsg;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;
import tb.bvg;
import tb.h30;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public abstract class AbstractResolvableFuture<V> implements bvg<V> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final b ATOMIC_HELPER;
    public static final boolean GENERATE_CANCELLATION_CAUSES = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
    public static final Logger d = Logger.getLogger(AbstractResolvableFuture.class.getName());
    public static final Object e;

    /* renamed from: a  reason: collision with root package name */
    public volatile Object f1831a;
    public volatile d b;
    public volatile h c;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static final class Failure {
        public static final Failure FALLBACK_INSTANCE = new Failure(new Throwable("Failure occurred while trying to finish a future.") { // from class: androidx.concurrent.futures.AbstractResolvableFuture.Failure.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass1 r2, String str, Object... objArr) {
                str.hashCode();
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/concurrent/futures/AbstractResolvableFuture$Failure$1");
            }

            @Override // java.lang.Throwable
            public synchronized Throwable fillInStackTrace() {
                IpChange ipChange = $ipChange;
                if (!(ipChange instanceof IpChange)) {
                    return this;
                }
                return (Throwable) ipChange.ipc$dispatch("6c8bc0b1", new Object[]{this});
            }
        });

        /* renamed from: a  reason: collision with root package name */
        public final Throwable f1832a;

        public Failure(Throwable th) {
            this.f1832a = (Throwable) AbstractResolvableFuture.e(th);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static abstract class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        public abstract boolean a(AbstractResolvableFuture<?> abstractResolvableFuture, d dVar, d dVar2);

        public abstract boolean b(AbstractResolvableFuture<?> abstractResolvableFuture, Object obj, Object obj2);

        public abstract boolean c(AbstractResolvableFuture<?> abstractResolvableFuture, h hVar, h hVar2);

        public abstract void d(h hVar, h hVar2);

        public abstract void e(h hVar, Thread thread);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static final class c {
        public static final c CAUSELESS_CANCELLED;
        public static final c CAUSELESS_INTERRUPTED;

        /* renamed from: a  reason: collision with root package name */
        public final boolean f1833a;
        public final Throwable b;

        static {
            if (AbstractResolvableFuture.GENERATE_CANCELLATION_CAUSES) {
                CAUSELESS_CANCELLED = null;
                CAUSELESS_INTERRUPTED = null;
                return;
            }
            CAUSELESS_CANCELLED = new c(false, null);
            CAUSELESS_INTERRUPTED = new c(true, null);
        }

        public c(boolean z, Throwable th) {
            this.f1833a = z;
            this.b = th;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static final class d {
        public static final d TOMBSTONE = new d(null, null);

        /* renamed from: a  reason: collision with root package name */
        public final Runnable f1834a;
        public final Executor b;
        public d c;

        public d(Runnable runnable, Executor executor) {
            this.f1834a = runnable;
            this.b = executor;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static final class e extends b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final AtomicReferenceFieldUpdater<h, Thread> f1835a;
        public final AtomicReferenceFieldUpdater<h, h> b;
        public final AtomicReferenceFieldUpdater<AbstractResolvableFuture, h> c;
        public final AtomicReferenceFieldUpdater<AbstractResolvableFuture, d> d;
        public final AtomicReferenceFieldUpdater<AbstractResolvableFuture, Object> e;

        public e(AtomicReferenceFieldUpdater<h, Thread> atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater<h, h> atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater<AbstractResolvableFuture, h> atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater<AbstractResolvableFuture, d> atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater<AbstractResolvableFuture, Object> atomicReferenceFieldUpdater5) {
            super();
            this.f1835a = atomicReferenceFieldUpdater;
            this.b = atomicReferenceFieldUpdater2;
            this.c = atomicReferenceFieldUpdater3;
            this.d = atomicReferenceFieldUpdater4;
            this.e = atomicReferenceFieldUpdater5;
        }

        public static /* synthetic */ Object ipc$super(e eVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/concurrent/futures/AbstractResolvableFuture$SafeAtomicHelper");
        }

        @Override // androidx.concurrent.futures.AbstractResolvableFuture.b
        public boolean a(AbstractResolvableFuture<?> abstractResolvableFuture, d dVar, d dVar2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("4367843b", new Object[]{this, abstractResolvableFuture, dVar, dVar2})).booleanValue();
            }
            return h30.a(this.d, abstractResolvableFuture, dVar, dVar2);
        }

        @Override // androidx.concurrent.futures.AbstractResolvableFuture.b
        public boolean b(AbstractResolvableFuture<?> abstractResolvableFuture, Object obj, Object obj2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("404c5f25", new Object[]{this, abstractResolvableFuture, obj, obj2})).booleanValue();
            }
            return h30.a(this.e, abstractResolvableFuture, obj, obj2);
        }

        @Override // androidx.concurrent.futures.AbstractResolvableFuture.b
        public boolean c(AbstractResolvableFuture<?> abstractResolvableFuture, h hVar, h hVar2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("7b00a3cd", new Object[]{this, abstractResolvableFuture, hVar, hVar2})).booleanValue();
            }
            return h30.a(this.c, abstractResolvableFuture, hVar, hVar2);
        }

        @Override // androidx.concurrent.futures.AbstractResolvableFuture.b
        public void d(h hVar, h hVar2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("db1b8369", new Object[]{this, hVar, hVar2});
            } else {
                this.b.lazySet(hVar, hVar2);
            }
        }

        @Override // androidx.concurrent.futures.AbstractResolvableFuture.b
        public void e(h hVar, Thread thread) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3ae68815", new Object[]{this, hVar, thread});
            } else {
                this.f1835a.lazySet(hVar, thread);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static final class f<V> implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final AbstractResolvableFuture<V> f1836a;
        public final bvg<? extends V> b;

        public f(AbstractResolvableFuture<V> abstractResolvableFuture, bvg<? extends V> bvgVar) {
            this.f1836a = abstractResolvableFuture;
            this.b = bvgVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (this.f1836a.f1831a == this && AbstractResolvableFuture.ATOMIC_HELPER.b(this.f1836a, this, AbstractResolvableFuture.j(this.b))) {
                AbstractResolvableFuture.g(this.f1836a);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static final class g extends b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public g() {
            super();
        }

        public static /* synthetic */ Object ipc$super(g gVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/concurrent/futures/AbstractResolvableFuture$SynchronizedHelper");
        }

        @Override // androidx.concurrent.futures.AbstractResolvableFuture.b
        public boolean a(AbstractResolvableFuture<?> abstractResolvableFuture, d dVar, d dVar2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("4367843b", new Object[]{this, abstractResolvableFuture, dVar, dVar2})).booleanValue();
            }
            synchronized (abstractResolvableFuture) {
                try {
                    if (abstractResolvableFuture.b != dVar) {
                        return false;
                    }
                    abstractResolvableFuture.b = dVar2;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // androidx.concurrent.futures.AbstractResolvableFuture.b
        public boolean b(AbstractResolvableFuture<?> abstractResolvableFuture, Object obj, Object obj2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("404c5f25", new Object[]{this, abstractResolvableFuture, obj, obj2})).booleanValue();
            }
            synchronized (abstractResolvableFuture) {
                try {
                    if (abstractResolvableFuture.f1831a != obj) {
                        return false;
                    }
                    abstractResolvableFuture.f1831a = obj2;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // androidx.concurrent.futures.AbstractResolvableFuture.b
        public boolean c(AbstractResolvableFuture<?> abstractResolvableFuture, h hVar, h hVar2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("7b00a3cd", new Object[]{this, abstractResolvableFuture, hVar, hVar2})).booleanValue();
            }
            synchronized (abstractResolvableFuture) {
                try {
                    if (abstractResolvableFuture.c != hVar) {
                        return false;
                    }
                    abstractResolvableFuture.c = hVar2;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // androidx.concurrent.futures.AbstractResolvableFuture.b
        public void d(h hVar, h hVar2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("db1b8369", new Object[]{this, hVar, hVar2});
            } else {
                hVar.b = hVar2;
            }
        }

        @Override // androidx.concurrent.futures.AbstractResolvableFuture.b
        public void e(h hVar, Thread thread) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3ae68815", new Object[]{this, hVar, thread});
            } else {
                hVar.f1837a = thread;
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static final class h {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public static final h TOMBSTONE = new h(false);

        /* renamed from: a  reason: collision with root package name */
        public volatile Thread f1837a;
        public volatile h b;

        public h(boolean z) {
        }

        public void a(h hVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("581246e8", new Object[]{this, hVar});
            } else {
                AbstractResolvableFuture.ATOMIC_HELPER.d(this, hVar);
            }
        }

        public void b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a13a490a", new Object[]{this});
                return;
            }
            Thread thread = this.f1837a;
            if (thread != null) {
                this.f1837a = null;
                LockSupport.unpark(thread);
            }
        }

        public h() {
            AbstractResolvableFuture.ATOMIC_HELPER.e(this, Thread.currentThread());
        }
    }

    static {
        b bVar;
        Throwable th;
        try {
            bVar = new e(AtomicReferenceFieldUpdater.newUpdater(h.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(h.class, h.class, TplMsg.VALUE_T_NATIVE_RETURN), AtomicReferenceFieldUpdater.newUpdater(AbstractResolvableFuture.class, h.class, "c"), AtomicReferenceFieldUpdater.newUpdater(AbstractResolvableFuture.class, d.class, TplMsg.VALUE_T_NATIVE_RETURN), AtomicReferenceFieldUpdater.newUpdater(AbstractResolvableFuture.class, Object.class, "a"));
            th = null;
        } catch (Throwable th2) {
            th = th2;
            bVar = new g();
        }
        ATOMIC_HELPER = bVar;
        if (th != null) {
            d.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        e = new Object();
    }

    public static CancellationException d(String str, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CancellationException) ipChange.ipc$dispatch("2723504", new Object[]{str, th});
        }
        CancellationException cancellationException = new CancellationException(str);
        cancellationException.initCause(th);
        return cancellationException;
    }

    public static <T> T e(T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("56526bdd", new Object[]{t});
        }
        t.getClass();
        return t;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [androidx.concurrent.futures.AbstractResolvableFuture$b] */
    /* JADX WARN: Type inference failed for: r4v1, types: [androidx.concurrent.futures.AbstractResolvableFuture] */
    /* JADX WARN: Type inference failed for: r4v6, types: [androidx.concurrent.futures.AbstractResolvableFuture, androidx.concurrent.futures.AbstractResolvableFuture<V>] */
    public static void g(AbstractResolvableFuture<?> abstractResolvableFuture) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ced74346", new Object[]{abstractResolvableFuture});
            return;
        }
        d dVar = null;
        while (true) {
            abstractResolvableFuture.n();
            abstractResolvableFuture.c();
            d f2 = abstractResolvableFuture.f(dVar);
            while (f2 != null) {
                dVar = f2.c;
                Runnable runnable = f2.f1834a;
                if (runnable instanceof f) {
                    f fVar = (f) runnable;
                    abstractResolvableFuture = fVar.f1836a;
                    if (abstractResolvableFuture.f1831a == fVar && ATOMIC_HELPER.b(abstractResolvableFuture, fVar, j(fVar.b))) {
                        break;
                    }
                } else {
                    h(runnable, f2.b);
                }
                f2 = dVar;
            }
            return;
        }
    }

    public static void h(Runnable runnable, Executor executor) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b4ae288", new Object[]{runnable, executor});
            return;
        }
        try {
            executor.execute(runnable);
        } catch (RuntimeException e2) {
            Logger logger = d;
            Level level = Level.SEVERE;
            logger.log(level, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e2);
        }
    }

    public static <V> V k(Future<V> future) throws ExecutionException {
        V v;
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (V) ipChange.ipc$dispatch("b3ae636d", new Object[]{future});
        }
        while (true) {
            try {
                v = future.get();
                break;
            } catch (InterruptedException unused) {
                z = true;
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return v;
    }

    @Override // tb.bvg
    public final void a(Runnable runnable, Executor executor) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5342ebdc", new Object[]{this, runnable, executor});
            return;
        }
        e(runnable);
        e(executor);
        d dVar = this.b;
        if (dVar != d.TOMBSTONE) {
            d dVar2 = new d(runnable, executor);
            do {
                dVar2.c = dVar;
                if (!ATOMIC_HELPER.a(this, dVar, dVar2)) {
                    dVar = this.b;
                } else {
                    return;
                }
            } while (dVar != d.TOMBSTONE);
            h(runnable, executor);
        }
        h(runnable, executor);
    }

    public final void b(StringBuilder sb) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ecd0b050", new Object[]{this, sb});
            return;
        }
        try {
            Object k = k(this);
            sb.append("SUCCESS, result=[");
            sb.append(s(k));
            sb.append("]");
        } catch (CancellationException unused) {
            sb.append("CANCELLED");
        } catch (RuntimeException e2) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e2.getClass());
            sb.append(" thrown from get()]");
        } catch (ExecutionException e3) {
            sb.append("FAILURE, cause=[");
            sb.append(e3.getCause());
            sb.append("]");
        }
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("987ee505", new Object[]{this});
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        boolean z2;
        c cVar;
        boolean z3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9f7d8cf7", new Object[]{this, new Boolean(z)})).booleanValue();
        }
        Object obj = this.f1831a;
        if (obj == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2 && !(obj instanceof f)) {
            return false;
        }
        if (GENERATE_CANCELLATION_CAUSES) {
            cVar = new c(z, new CancellationException("Future.cancel() was called."));
        } else if (z) {
            cVar = c.CAUSELESS_INTERRUPTED;
        } else {
            cVar = c.CAUSELESS_CANCELLED;
        }
        boolean z4 = false;
        AbstractResolvableFuture<V> abstractResolvableFuture = this;
        while (true) {
            if (ATOMIC_HELPER.b(abstractResolvableFuture, obj, cVar)) {
                if (z) {
                    abstractResolvableFuture.l();
                }
                g(abstractResolvableFuture);
                if (!(obj instanceof f)) {
                    return true;
                }
                bvg<? extends V> bvgVar = ((f) obj).b;
                if (bvgVar instanceof AbstractResolvableFuture) {
                    abstractResolvableFuture = (AbstractResolvableFuture) bvgVar;
                    obj = abstractResolvableFuture.f1831a;
                    if (obj == null) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (!z3 && !(obj instanceof f)) {
                        return true;
                    }
                    z4 = true;
                } else {
                    bvgVar.cancel(z);
                    return true;
                }
            } else {
                obj = abstractResolvableFuture.f1831a;
                if (!(obj instanceof f)) {
                    return z4;
                }
            }
        }
    }

    public final d f(d dVar) {
        d dVar2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d) ipChange.ipc$dispatch("c36d93bb", new Object[]{this, dVar});
        }
        do {
            dVar2 = this.b;
        } while (!ATOMIC_HELPER.a(this, dVar2, d.TOMBSTONE));
        d dVar3 = dVar;
        d dVar4 = dVar2;
        while (dVar4 != null) {
            d dVar5 = dVar4.c;
            dVar4.c = dVar3;
            dVar3 = dVar4;
            dVar4 = dVar5;
        }
        return dVar3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0069, code lost:
        java.util.concurrent.locks.LockSupport.parkNanos(r18, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0070, code lost:
        if (java.lang.Thread.interrupted() != false) goto L_0x0092;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0072, code lost:
        r5 = r18.f1831a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0074, code lost:
        if (r5 == null) goto L_0x0078;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0076, code lost:
        r6 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0078, code lost:
        r6 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x007d, code lost:
        if ((r6 & (!(r5 instanceof androidx.concurrent.futures.AbstractResolvableFuture.f))) == false) goto L_0x0084;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0083, code lost:
        return i(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0084, code lost:
        r6 = r10 - java.lang.System.nanoTime();
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x008c, code lost:
        if (r6 >= 1000) goto L_0x0069;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x008e, code lost:
        o(r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0092, code lost:
        o(r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x009a, code lost:
        throw new java.lang.InterruptedException();
     */
    @Override // java.util.concurrent.Future
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final V get(long r19, java.util.concurrent.TimeUnit r21) throws java.lang.InterruptedException, java.util.concurrent.TimeoutException, java.util.concurrent.ExecutionException {
        /*
            Method dump skipped, instructions count: 460
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.concurrent.futures.AbstractResolvableFuture.get(long, java.util.concurrent.TimeUnit):java.lang.Object");
    }

    public final V i(Object obj) throws ExecutionException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (V) ipChange.ipc$dispatch("fd02fe76", new Object[]{this, obj});
        }
        if (obj instanceof c) {
            throw d("Task was cancelled.", ((c) obj).b);
        } else if (obj instanceof Failure) {
            throw new ExecutionException(((Failure) obj).f1832a);
        } else if (obj == e) {
            return null;
        } else {
            return obj;
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6ff5f452", new Object[]{this})).booleanValue();
        }
        return this.f1831a instanceof c;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("15dabe57", new Object[]{this})).booleanValue();
        }
        Object obj = this.f1831a;
        if (obj != null) {
            z = true;
        }
        return z & (true ^ (obj instanceof f));
    }

    public void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("80b9ef0f", new Object[]{this});
        }
    }

    public String m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4f8b99b6", new Object[]{this});
        }
        Object obj = this.f1831a;
        if (obj instanceof f) {
            return "setFuture=[" + s(((f) obj).b) + "]";
        } else if (!(this instanceof ScheduledFuture)) {
            return null;
        } else {
            return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
        }
    }

    public final void n() {
        h hVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f7fc151", new Object[]{this});
            return;
        }
        do {
            hVar = this.c;
        } while (!ATOMIC_HELPER.c(this, hVar, h.TOMBSTONE));
        while (hVar != null) {
            hVar.b();
            hVar = hVar.b;
        }
    }

    public final void o(h hVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3fc04f7", new Object[]{this, hVar});
            return;
        }
        hVar.f1837a = null;
        while (true) {
            h hVar2 = this.c;
            if (hVar2 != h.TOMBSTONE) {
                h hVar3 = null;
                while (hVar2 != null) {
                    h hVar4 = hVar2.b;
                    if (hVar2.f1837a != null) {
                        hVar3 = hVar2;
                    } else if (hVar3 != null) {
                        hVar3.b = hVar4;
                        if (hVar3.f1837a == null) {
                            break;
                        }
                    } else if (!ATOMIC_HELPER.c(this, hVar2, hVar4)) {
                        break;
                    }
                    hVar2 = hVar4;
                }
                return;
            }
            return;
        }
    }

    public boolean q(Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6400d065", new Object[]{this, th})).booleanValue();
        }
        if (!ATOMIC_HELPER.b(this, null, new Failure((Throwable) e(th)))) {
            return false;
        }
        g(this);
        return true;
    }

    public boolean r(bvg<? extends V> bvgVar) {
        Failure failure;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a6c32854", new Object[]{this, bvgVar})).booleanValue();
        }
        e(bvgVar);
        Object obj = this.f1831a;
        if (obj == null) {
            if (!bvgVar.isDone()) {
                f fVar = new f(this, bvgVar);
                if (ATOMIC_HELPER.b(this, null, fVar)) {
                    try {
                        bvgVar.a(fVar, DirectExecutor.INSTANCE);
                    } catch (Throwable th) {
                        try {
                            failure = new Failure(th);
                        } catch (Throwable unused) {
                            failure = Failure.FALLBACK_INSTANCE;
                        }
                        ATOMIC_HELPER.b(this, fVar, failure);
                    }
                    return true;
                }
                obj = this.f1831a;
            } else if (!ATOMIC_HELPER.b(this, null, j(bvgVar))) {
                return false;
            } else {
                g(this);
                return true;
            }
        }
        if (obj instanceof c) {
            bvgVar.cancel(((c) obj).f1833a);
        }
        return false;
    }

    public final String s(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a7dd3227", new Object[]{this, obj});
        }
        if (obj == this) {
            return "this future";
        }
        return String.valueOf(obj);
    }

    public String toString() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (isCancelled()) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            b(sb);
        } else {
            try {
                str = m();
            } catch (RuntimeException e2) {
                str = "Exception thrown from implementation: " + e2.getClass();
            }
            if (str != null && !str.isEmpty()) {
                sb.append("PENDING, info=[");
                sb.append(str);
                sb.append("]");
            } else if (isDone()) {
                b(sb);
            } else {
                sb.append("PENDING");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public static Object j(bvg<?> bvgVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("f497cacf", new Object[]{bvgVar});
        }
        if (bvgVar instanceof AbstractResolvableFuture) {
            Object obj = ((AbstractResolvableFuture) bvgVar).f1831a;
            if (!(obj instanceof c)) {
                return obj;
            }
            c cVar = (c) obj;
            if (!cVar.f1833a) {
                return obj;
            }
            if (cVar.b != null) {
                return new c(false, cVar.b);
            }
            return c.CAUSELESS_CANCELLED;
        }
        boolean isCancelled = bvgVar.isCancelled();
        if ((true ^ GENERATE_CANCELLATION_CAUSES) && isCancelled) {
            return c.CAUSELESS_CANCELLED;
        }
        try {
            Object k = k(bvgVar);
            return k == null ? e : k;
        } catch (CancellationException e2) {
            if (isCancelled) {
                return new c(false, e2);
            }
            return new Failure(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: " + bvgVar, e2));
        } catch (ExecutionException e3) {
            return new Failure(e3.getCause());
        } catch (Throwable th) {
            return new Failure(th);
        }
    }

    public boolean p(V v) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f6236789", new Object[]{this, v})).booleanValue();
        }
        if (v == null) {
            v = (V) e;
        }
        if (!ATOMIC_HELPER.b(this, null, v)) {
            return false;
        }
        g(this);
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0041, code lost:
        java.util.concurrent.locks.LockSupport.park(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0048, code lost:
        if (java.lang.Thread.interrupted() != false) goto L_0x005c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004a, code lost:
        r2 = r6.f1831a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x004c, code lost:
        if (r2 == null) goto L_0x0050;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x004e, code lost:
        r4 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0050, code lost:
        r4 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0055, code lost:
        if ((r4 & (!(r2 instanceof androidx.concurrent.futures.AbstractResolvableFuture.f))) == false) goto L_0x0041;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x005b, code lost:
        return i(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x005c, code lost:
        o(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0064, code lost:
        throw new java.lang.InterruptedException();
     */
    @Override // java.util.concurrent.Future
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final V get() throws java.lang.InterruptedException, java.util.concurrent.ExecutionException {
        /*
            r6 = this;
            r0 = 0
            r1 = 1
            com.android.alibaba.ip.runtime.IpChange r2 = androidx.concurrent.futures.AbstractResolvableFuture.$ipChange
            boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r3 == 0) goto L_0x0013
            java.lang.String r3 = "6352d3f5"
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r0] = r6
            java.lang.Object r0 = r2.ipc$dispatch(r3, r1)
            return r0
        L_0x0013:
            boolean r2 = java.lang.Thread.interrupted()
            if (r2 != 0) goto L_0x0072
            java.lang.Object r2 = r6.f1831a
            if (r2 == 0) goto L_0x001f
            r3 = 1
            goto L_0x0020
        L_0x001f:
            r3 = 0
        L_0x0020:
            boolean r4 = r2 instanceof androidx.concurrent.futures.AbstractResolvableFuture.f
            r4 = r4 ^ r1
            r3 = r3 & r4
            if (r3 == 0) goto L_0x002b
            java.lang.Object r0 = r6.i(r2)
            return r0
        L_0x002b:
            androidx.concurrent.futures.AbstractResolvableFuture$h r2 = r6.c
            androidx.concurrent.futures.AbstractResolvableFuture$h r3 = androidx.concurrent.futures.AbstractResolvableFuture.h.TOMBSTONE
            if (r2 == r3) goto L_0x006b
            androidx.concurrent.futures.AbstractResolvableFuture$h r3 = new androidx.concurrent.futures.AbstractResolvableFuture$h
            r3.<init>()
        L_0x0036:
            r3.a(r2)
            androidx.concurrent.futures.AbstractResolvableFuture$b r4 = androidx.concurrent.futures.AbstractResolvableFuture.ATOMIC_HELPER
            boolean r2 = r4.c(r6, r2, r3)
            if (r2 == 0) goto L_0x0065
        L_0x0041:
            java.util.concurrent.locks.LockSupport.park(r6)
            boolean r2 = java.lang.Thread.interrupted()
            if (r2 != 0) goto L_0x005c
            java.lang.Object r2 = r6.f1831a
            if (r2 == 0) goto L_0x0050
            r4 = 1
            goto L_0x0051
        L_0x0050:
            r4 = 0
        L_0x0051:
            boolean r5 = r2 instanceof androidx.concurrent.futures.AbstractResolvableFuture.f
            r5 = r5 ^ r1
            r4 = r4 & r5
            if (r4 == 0) goto L_0x0041
            java.lang.Object r0 = r6.i(r2)
            return r0
        L_0x005c:
            r6.o(r3)
            java.lang.InterruptedException r0 = new java.lang.InterruptedException
            r0.<init>()
            throw r0
        L_0x0065:
            androidx.concurrent.futures.AbstractResolvableFuture$h r2 = r6.c
            androidx.concurrent.futures.AbstractResolvableFuture$h r4 = androidx.concurrent.futures.AbstractResolvableFuture.h.TOMBSTONE
            if (r2 != r4) goto L_0x0036
        L_0x006b:
            java.lang.Object r0 = r6.f1831a
            java.lang.Object r0 = r6.i(r0)
            return r0
        L_0x0072:
            java.lang.InterruptedException r0 = new java.lang.InterruptedException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.concurrent.futures.AbstractResolvableFuture.get():java.lang.Object");
    }
}
