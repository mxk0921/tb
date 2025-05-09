package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.virtual_thread.stub.StubExecutors;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.schedulers.ScheduledRunnable;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import tb.fuo;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class rzp extends fuo {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final ScheduledExecutorService SHUTDOWN;
    public static final wko SINGLE_THREAD_FACTORY = new wko("RxSingleScheduler", Math.max(1, Math.min(10, Integer.getInteger("rx2.single-priority", 5).intValue())));

    /* renamed from: a  reason: collision with root package name */
    public final AtomicReference<ScheduledExecutorService> f27699a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class a extends fuo.c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final ScheduledExecutorService f27700a;
        public final jd4 b = new jd4();
        public volatile boolean c;

        static {
            t2o.a(973078544);
        }

        public a(ScheduledExecutorService scheduledExecutorService) {
            this.f27700a = scheduledExecutorService;
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/virtual_thread/rxjava/schedulers/SingleScheduler$ScheduledWorker");
        }

        public void dispose() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("226c8326", new Object[]{this});
            } else if (!this.c) {
                this.c = true;
                this.b.dispose();
            }
        }

        public boolean isDisposed() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("be7a7a", new Object[]{this})).booleanValue();
            }
            return this.c;
        }

        public Disposable schedule(Runnable runnable, long j, TimeUnit timeUnit) {
            Future future;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Disposable) ipChange.ipc$dispatch("4603eaac", new Object[]{this, runnable, new Long(j), timeUnit});
            }
            if (this.c) {
                return EmptyDisposable.INSTANCE;
            }
            zjo.m(runnable);
            ScheduledRunnable scheduledRunnable = new ScheduledRunnable(runnable, this.b);
            this.b.add(scheduledRunnable);
            try {
                if (j <= 0) {
                    future = this.f27700a.submit((Callable) scheduledRunnable);
                } else {
                    future = this.f27700a.schedule((Callable) scheduledRunnable, j, timeUnit);
                }
                scheduledRunnable.setFuture(future);
                return scheduledRunnable;
            } catch (RejectedExecutionException e) {
                dispose();
                zjo.j(e);
                return EmptyDisposable.INSTANCE;
            }
        }
    }

    public rzp() {
        AtomicReference<ScheduledExecutorService> atomicReference = new AtomicReference<>();
        this.f27699a = atomicReference;
        atomicReference.lazySet(createExecutor());
    }

    public static ScheduledExecutorService createExecutor() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ScheduledExecutorService) ipChange.ipc$dispatch("9e06ee9a", new Object[0]);
        }
        return quo.a(SINGLE_THREAD_FACTORY);
    }

    public static /* synthetic */ Object ipc$super(rzp rzpVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/virtual_thread/rxjava/schedulers/SingleScheduler");
    }

    public fuo.c createWorker() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (fuo.c) ipChange.ipc$dispatch("c24fc352", new Object[]{this});
        }
        return new a(this.f27699a.get());
    }

    public Disposable scheduleDirect(Runnable runnable, long j, TimeUnit timeUnit) {
        Future<?> future;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Disposable) ipChange.ipc$dispatch("38285f5", new Object[]{this, runnable, new Long(j), timeUnit});
        }
        zjo.m(runnable);
        try {
            if (j <= 0) {
                future = this.f27699a.get().submit(runnable);
            } else {
                future = this.f27699a.get().schedule(runnable, j, timeUnit);
            }
            return io.reactivex.disposables.a.c(future);
        } catch (RejectedExecutionException e) {
            zjo.j(e);
            return EmptyDisposable.INSTANCE;
        }
    }

    public Disposable schedulePeriodicallyDirect(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Disposable) ipChange.ipc$dispatch("f7b7b3fc", new Object[]{this, runnable, new Long(j), new Long(j2), timeUnit});
        }
        zjo.m(runnable);
        try {
            return io.reactivex.disposables.a.c(this.f27699a.get().scheduleAtFixedRate(runnable, j, j2, timeUnit));
        } catch (RejectedExecutionException e) {
            zjo.j(e);
            return EmptyDisposable.INSTANCE;
        }
    }

    public void shutdown() {
        ScheduledExecutorService andSet;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b466fdd", new Object[]{this});
            return;
        }
        ScheduledExecutorService scheduledExecutorService = this.f27699a.get();
        ScheduledExecutorService scheduledExecutorService2 = SHUTDOWN;
        if (scheduledExecutorService != scheduledExecutorService2 && (andSet = this.f27699a.getAndSet(scheduledExecutorService2)) != scheduledExecutorService2) {
            andSet.shutdownNow();
        }
    }

    public void start() {
        ScheduledExecutorService scheduledExecutorService;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("810347e9", new Object[]{this});
            return;
        }
        ScheduledExecutorService scheduledExecutorService2 = null;
        do {
            scheduledExecutorService = this.f27699a.get();
            if (scheduledExecutorService != SHUTDOWN) {
                if (scheduledExecutorService2 != null) {
                    scheduledExecutorService2.shutdown();
                    return;
                }
                return;
            } else if (scheduledExecutorService2 == null) {
                scheduledExecutorService2 = createExecutor();
            }
        } while (!sng.a(this.f27699a, scheduledExecutorService, scheduledExecutorService2));
    }

    static {
        t2o.a(973078543);
        ScheduledExecutorService newScheduledThreadPool = StubExecutors.newScheduledThreadPool(0, new wko("Rx"));
        SHUTDOWN = newScheduledThreadPool;
        newScheduledThreadPool.shutdown();
    }
}
