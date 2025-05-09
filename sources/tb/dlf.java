package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.virtual_thread.stub.StubExecutors;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.EmptyDisposable;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import tb.fuo;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class dlf extends fuo {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final wko EVICTOR_THREAD_FACTORY;
    public static final a NONE;
    public static final c SHUTDOWN_THREAD_WORKER;
    public static final wko WORKER_THREAD_FACTORY;
    public static final TimeUnit b = TimeUnit.SECONDS;

    /* renamed from: a  reason: collision with root package name */
    public final AtomicReference<a> f17895a = new AtomicReference<>(NONE);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private final long f17896a;
        private final ConcurrentLinkedQueue<c> b;
        public final jd4 c;
        private final ScheduledExecutorService d;
        private final Future<?> e;

        static {
            t2o.a(973078535);
        }

        public a(long j, TimeUnit timeUnit) {
            long j2;
            ScheduledFuture<?> scheduledFuture;
            ScheduledExecutorService scheduledExecutorService;
            if (timeUnit != null) {
                j2 = timeUnit.toNanos(j);
            } else {
                j2 = 0;
            }
            this.f17896a = j2;
            this.b = new ConcurrentLinkedQueue<>();
            this.c = new jd4();
            if (timeUnit != null) {
                scheduledExecutorService = StubExecutors.newScheduledThreadPool(1, dlf.EVICTOR_THREAD_FACTORY);
                scheduledFuture = scheduledExecutorService.scheduleWithFixedDelay(this, j2, j2, TimeUnit.NANOSECONDS);
            } else {
                scheduledExecutorService = null;
                scheduledFuture = null;
            }
            this.d = scheduledExecutorService;
            this.e = scheduledFuture;
        }

        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("db47e280", new Object[]{this});
            } else if (!this.b.isEmpty()) {
                long c = c();
                Iterator<c> it = this.b.iterator();
                while (it.hasNext()) {
                    c next = it.next();
                    if (next.getExpirationTime() > c) {
                        return;
                    }
                    if (this.b.remove(next)) {
                        this.c.remove(next);
                    }
                }
            }
        }

        public c b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (c) ipChange.ipc$dispatch("685628e6", new Object[]{this});
            }
            if (this.c.isDisposed()) {
                return dlf.SHUTDOWN_THREAD_WORKER;
            }
            while (!this.b.isEmpty()) {
                c poll = this.b.poll();
                if (poll != null) {
                    return poll;
                }
            }
            c cVar = new c(dlf.WORKER_THREAD_FACTORY);
            this.c.add(cVar);
            return cVar;
        }

        public long c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("7ef9d451", new Object[]{this})).longValue();
            }
            return System.nanoTime();
        }

        public void d(c cVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b87eca4b", new Object[]{this, cVar});
                return;
            }
            cVar.setExpirationTime(c() + this.f17896a);
            this.b.offer(cVar);
        }

        public void e() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1b466fdd", new Object[]{this});
                return;
            }
            this.c.dispose();
            Future<?> future = this.e;
            if (future != null) {
                future.cancel(true);
            }
            ScheduledExecutorService scheduledExecutorService = this.d;
            if (scheduledExecutorService != null) {
                scheduledExecutorService.shutdownNow();
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                a();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class b extends fuo.c {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final a b;
        public final c c;
        public final AtomicBoolean d = new AtomicBoolean();

        /* renamed from: a  reason: collision with root package name */
        public final jd4 f17897a = new jd4();

        static {
            t2o.a(973078536);
        }

        public b(a aVar) {
            this.b = aVar;
            this.c = aVar.b();
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/virtual_thread/rxjava/schedulers/IoVirtualScheduler$EventLoopWorker");
        }

        public void dispose() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("226c8326", new Object[]{this});
            } else if (this.d.compareAndSet(false, true)) {
                this.f17897a.dispose();
                this.b.d(this.c);
            }
        }

        public boolean isDisposed() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("be7a7a", new Object[]{this})).booleanValue();
            }
            return this.d.get();
        }

        public Disposable schedule(Runnable runnable, long j, TimeUnit timeUnit) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Disposable) ipChange.ipc$dispatch("4603eaac", new Object[]{this, runnable, new Long(j), timeUnit});
            }
            if (this.f17897a.isDisposed()) {
                return EmptyDisposable.INSTANCE;
            }
            return this.c.scheduleActual(runnable, j, timeUnit, this.f17897a);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class c extends c2k {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public long c = 0;

        static {
            t2o.a(973078537);
        }

        public c(riw riwVar) {
            super(riwVar);
        }

        public static /* synthetic */ Object ipc$super(c cVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/virtual_thread/rxjava/schedulers/IoVirtualScheduler$ThreadWorker");
        }

        public long getExpirationTime() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("a7459a8d", new Object[]{this})).longValue();
            }
            return this.c;
        }

        public void setExpirationTime(long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8fb2eebf", new Object[]{this, new Long(j)});
            } else {
                this.c = j;
            }
        }
    }

    public dlf() {
        start();
    }

    public static /* synthetic */ Object ipc$super(dlf dlfVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/virtual_thread/rxjava/schedulers/IoVirtualScheduler");
    }

    public fuo.c createWorker() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (fuo.c) ipChange.ipc$dispatch("c24fc352", new Object[]{this});
        }
        return new b(this.f17895a.get());
    }

    public void shutdown() {
        a aVar;
        a aVar2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b466fdd", new Object[]{this});
            return;
        }
        do {
            aVar = this.f17895a.get();
            aVar2 = NONE;
            if (aVar == aVar2) {
                return;
            }
        } while (!sng.a(this.f17895a, aVar, aVar2));
        aVar.e();
    }

    public void start() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("810347e9", new Object[]{this});
            return;
        }
        a aVar = new a(60L, b);
        if (!sng.a(this.f17895a, NONE, aVar)) {
            aVar.e();
        }
    }

    static {
        t2o.a(973078534);
        a aVar = new a(0L, null);
        NONE = aVar;
        aVar.e();
        c cVar = new c(new wko("RxCachedThreadSchedulerShutdown"));
        SHUTDOWN_THREAD_WORKER = cVar;
        cVar.dispose();
        int max = Math.max(1, Math.min(10, Integer.getInteger("rx2.io-priority", 5).intValue()));
        WORKER_THREAD_FACTORY = new wko("RxCachedThreadScheduler", max);
        EVICTOR_THREAD_FACTORY = new wko("RxCachedWorkerPoolEvictor", max);
    }
}
