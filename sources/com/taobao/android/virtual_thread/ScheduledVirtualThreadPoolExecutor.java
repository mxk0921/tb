package com.taobao.android.virtual_thread;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.AbstractQueue;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.Delayed;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.RunnableScheduledFuture;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import tb.t2o;
import tb.w08;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class ScheduledVirtualThreadPoolExecutor extends VirtualThreadPoolExecutor implements ScheduledExecutorService {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final AtomicLong sequencer = new AtomicLong();
    private volatile boolean continueExistingPeriodicTasksAfterShutdown;
    private volatile boolean executeExistingDelayedTasksAfterShutdown = true;
    private volatile boolean removeOnCancel = false;

    static {
        t2o.a(969932805);
    }

    public ScheduledVirtualThreadPoolExecutor(int i) {
        super(i, Integer.MAX_VALUE, 10L, TimeUnit.MILLISECONDS, new a());
    }

    public static /* synthetic */ AtomicLong access$000() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AtomicLong) ipChange.ipc$dispatch("46b3f4db", new Object[0]);
        }
        return sequencer;
    }

    public static /* synthetic */ boolean access$100(ScheduledVirtualThreadPoolExecutor scheduledVirtualThreadPoolExecutor) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d9775ff6", new Object[]{scheduledVirtualThreadPoolExecutor})).booleanValue();
        }
        return scheduledVirtualThreadPoolExecutor.removeOnCancel;
    }

    private void delayedExecute(RunnableScheduledFuture<?> runnableScheduledFuture) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9940b80e", new Object[]{this, runnableScheduledFuture});
        } else if (isShutdown()) {
            reject(runnableScheduledFuture);
        } else {
            super.getQueue().add(runnableScheduledFuture);
            if (!isShutdown() || canRunInCurrentRunState(runnableScheduledFuture.isPeriodic()) || !remove(runnableScheduledFuture)) {
                ensurePrestart();
            } else {
                runnableScheduledFuture.cancel(false);
            }
        }
    }

    public static /* synthetic */ Object ipc$super(ScheduledVirtualThreadPoolExecutor scheduledVirtualThreadPoolExecutor, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -489736769) {
            return super.getQueue();
        }
        if (hashCode == -342309312) {
            return super.shutdownNow();
        }
        if (hashCode == 457600989) {
            super.shutdown();
            return null;
        }
        int hashCode2 = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/android/virtual_thread/ScheduledVirtualThreadPoolExecutor");
    }

    private long overflowFree(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ba725e43", new Object[]{this, new Long(j)})).longValue();
        }
        Delayed delayed = (Delayed) super.getQueue().peek();
        if (delayed == null) {
            return j;
        }
        long delay = delayed.getDelay(TimeUnit.NANOSECONDS);
        if (delay >= 0 || j - delay >= 0) {
            return j;
        }
        return Long.MAX_VALUE + delay;
    }

    private long triggerTime(long j, TimeUnit timeUnit) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("91ad8794", new Object[]{this, new Long(j), timeUnit})).longValue();
        }
        if (j < 0) {
            j = 0;
        }
        return triggerTime(timeUnit.toNanos(j));
    }

    public boolean canRunInCurrentRunState(boolean z) {
        boolean z2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("204bd472", new Object[]{this, new Boolean(z)})).booleanValue();
        }
        if (z) {
            z2 = this.continueExistingPeriodicTasksAfterShutdown;
        } else {
            z2 = this.executeExistingDelayedTasksAfterShutdown;
        }
        return isRunningOrShutdown(z2);
    }

    public <V> RunnableScheduledFuture<V> decorateTask(Runnable runnable, RunnableScheduledFuture<V> runnableScheduledFuture) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (RunnableScheduledFuture) ipChange.ipc$dispatch("bf71133f", new Object[]{this, runnable, runnableScheduledFuture}) : runnableScheduledFuture;
    }

    @Override // com.taobao.android.virtual_thread.VirtualThreadPoolExecutor, java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1afb0dfa", new Object[]{this, runnable});
        } else {
            schedule(runnable, 0L, TimeUnit.NANOSECONDS);
        }
    }

    public boolean getContinueExistingPeriodicTasksAfterShutdownPolicy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("55beba64", new Object[]{this})).booleanValue();
        }
        return this.continueExistingPeriodicTasksAfterShutdown;
    }

    public boolean getExecuteExistingDelayedTasksAfterShutdownPolicy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("95453f79", new Object[]{this})).booleanValue();
        }
        return this.executeExistingDelayedTasksAfterShutdown;
    }

    @Override // com.taobao.android.virtual_thread.VirtualThreadPoolExecutor
    public BlockingQueue<Runnable> getQueue() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BlockingQueue) ipChange.ipc$dispatch("e2cf35bf", new Object[]{this});
        }
        return super.getQueue();
    }

    public boolean getRemoveOnCancelPolicy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b4fb5bf0", new Object[]{this})).booleanValue();
        }
        return this.removeOnCancel;
    }

    public final long now() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7ef9d451", new Object[]{this})).longValue();
        }
        return System.nanoTime();
    }

    @Override // com.taobao.android.virtual_thread.VirtualThreadPoolExecutor
    public void onShutdown() {
        Object[] array;
        Object[] array2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9088fb5c", new Object[]{this});
            return;
        }
        BlockingQueue<Runnable> queue = super.getQueue();
        boolean executeExistingDelayedTasksAfterShutdownPolicy = getExecuteExistingDelayedTasksAfterShutdownPolicy();
        boolean continueExistingPeriodicTasksAfterShutdownPolicy = getContinueExistingPeriodicTasksAfterShutdownPolicy();
        if (executeExistingDelayedTasksAfterShutdownPolicy || continueExistingPeriodicTasksAfterShutdownPolicy) {
            for (Object obj : queue.toArray()) {
                if (obj instanceof RunnableScheduledFuture) {
                    RunnableScheduledFuture runnableScheduledFuture = (RunnableScheduledFuture) obj;
                    if (!runnableScheduledFuture.isPeriodic() ? executeExistingDelayedTasksAfterShutdownPolicy : continueExistingPeriodicTasksAfterShutdownPolicy) {
                        if (!runnableScheduledFuture.isCancelled()) {
                        }
                    }
                    if (queue.remove(runnableScheduledFuture)) {
                        runnableScheduledFuture.cancel(false);
                    }
                }
            }
        } else {
            for (Object obj2 : queue.toArray()) {
                if (obj2 instanceof RunnableScheduledFuture) {
                    ((RunnableScheduledFuture) obj2).cancel(false);
                }
            }
            queue.clear();
        }
        tryTerminate();
    }

    public void reExecutePeriodic(RunnableScheduledFuture<?> runnableScheduledFuture) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("124bd058", new Object[]{this, runnableScheduledFuture});
        } else if (canRunInCurrentRunState(true)) {
            super.getQueue().add(runnableScheduledFuture);
            if (canRunInCurrentRunState(true) || !remove(runnableScheduledFuture)) {
                ensurePrestart();
            } else {
                runnableScheduledFuture.cancel(false);
            }
        }
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture<?> schedule(Runnable runnable, long j, TimeUnit timeUnit) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ScheduledFuture) ipChange.ipc$dispatch("7e00205d", new Object[]{this, runnable, new Long(j), timeUnit});
        }
        if (runnable == null || timeUnit == null) {
            throw null;
        }
        RunnableScheduledFuture<?> decorateTask = decorateTask(runnable, new b(runnable, null, triggerTime(j, timeUnit)));
        delayedExecute(decorateTask);
        return decorateTask;
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture<?> scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ScheduledFuture) ipChange.ipc$dispatch("6d910264", new Object[]{this, runnable, new Long(j), new Long(j2), timeUnit});
        }
        if (runnable == null || timeUnit == null) {
            throw null;
        } else if (j2 > 0) {
            b bVar = new b(runnable, null, triggerTime(j, timeUnit), timeUnit.toNanos(j2));
            RunnableScheduledFuture<V> decorateTask = decorateTask(runnable, bVar);
            bVar.d = decorateTask;
            delayedExecute(decorateTask);
            return decorateTask;
        } else {
            throw new IllegalArgumentException();
        }
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture<?> scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ScheduledFuture) ipChange.ipc$dispatch("953370c6", new Object[]{this, runnable, new Long(j), new Long(j2), timeUnit});
        }
        if (runnable == null || timeUnit == null) {
            throw null;
        } else if (j2 > 0) {
            b bVar = new b(runnable, null, triggerTime(j, timeUnit), -timeUnit.toNanos(j2));
            RunnableScheduledFuture<V> decorateTask = decorateTask(runnable, bVar);
            bVar.d = decorateTask;
            delayedExecute(decorateTask);
            return decorateTask;
        } else {
            throw new IllegalArgumentException();
        }
    }

    public void setContinueExistingPeriodicTasksAfterShutdownPolicy(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70a526e8", new Object[]{this, new Boolean(z)});
            return;
        }
        this.continueExistingPeriodicTasksAfterShutdown = z;
        if (!z && isShutdown()) {
            onShutdown();
        }
    }

    public void setExecuteExistingDelayedTasksAfterShutdownPolicy(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4cad5173", new Object[]{this, new Boolean(z)});
            return;
        }
        this.executeExistingDelayedTasksAfterShutdown = z;
        if (!z && isShutdown()) {
            onShutdown();
        }
    }

    public void setRemoveOnCancelPolicy(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("343d2cdc", new Object[]{this, new Boolean(z)});
        } else {
            this.removeOnCancel = z;
        }
    }

    @Override // com.taobao.android.virtual_thread.VirtualThreadPoolExecutor, java.util.concurrent.ExecutorService
    public void shutdown() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b466fdd", new Object[]{this});
        } else {
            super.shutdown();
        }
    }

    @Override // com.taobao.android.virtual_thread.VirtualThreadPoolExecutor, java.util.concurrent.ExecutorService
    public List<Runnable> shutdownNow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("eb98c640", new Object[]{this});
        }
        return super.shutdownNow();
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public Future<?> submit(Runnable runnable) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Future) ipChange.ipc$dispatch("b4a21fb3", new Object[]{this, runnable}) : schedule(runnable, 0L, TimeUnit.NANOSECONDS);
    }

    public <V> RunnableScheduledFuture<V> decorateTask(Callable<V> callable, RunnableScheduledFuture<V> runnableScheduledFuture) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (RunnableScheduledFuture) ipChange.ipc$dispatch("eb7f6d1e", new Object[]{this, callable, runnableScheduledFuture}) : runnableScheduledFuture;
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public <T> Future<T> submit(Runnable runnable, T t) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Future) ipChange.ipc$dispatch("f26f004f", new Object[]{this, runnable, t}) : schedule(Executors.callable(runnable, t), 0L, TimeUnit.NANOSECONDS);
    }

    public long triggerTime(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("eab1a18c", new Object[]{this, new Long(j)})).longValue();
        }
        long now = now();
        if (j >= w08.MAX_MILLIS) {
            j = overflowFree(j);
        }
        return now + j;
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public <T> Future<T> submit(Callable<T> callable) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Future) ipChange.ipc$dispatch("b2277828", new Object[]{this, callable}) : schedule(callable, 0L, TimeUnit.NANOSECONDS);
    }

    public ScheduledVirtualThreadPoolExecutor(int i, ThreadFactory threadFactory) {
        super(i, Integer.MAX_VALUE, 10L, TimeUnit.MILLISECONDS, new a(), threadFactory);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class a extends AbstractQueue<Runnable> implements BlockingQueue<Runnable> {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final ReentrantLock b;
        public final Condition e;

        /* renamed from: a  reason: collision with root package name */
        public RunnableScheduledFuture<?>[] f9880a = new RunnableScheduledFuture[16];
        public int c = 0;
        public Thread d = null;

        /* compiled from: Taobao */
        /* renamed from: com.taobao.android.virtual_thread.ScheduledVirtualThreadPoolExecutor$a$a  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
        public class C0513a implements Iterator<Runnable> {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final RunnableScheduledFuture<?>[] f9881a;
            public int b = 0;
            public int c = -1;

            static {
                t2o.a(969932807);
            }

            public C0513a(RunnableScheduledFuture<?>[] runnableScheduledFutureArr) {
                this.f9881a = runnableScheduledFutureArr;
            }

            /* renamed from: a */
            public Runnable next() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (Runnable) ipChange.ipc$dispatch("9bfa815a", new Object[]{this});
                }
                int i = this.b;
                RunnableScheduledFuture<?>[] runnableScheduledFutureArr = this.f9881a;
                if (i < runnableScheduledFutureArr.length) {
                    this.c = i;
                    this.b = 1 + i;
                    return runnableScheduledFutureArr[i];
                }
                throw new NoSuchElementException();
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Boolean) ipChange.ipc$dispatch("291ab8", new Object[]{this})).booleanValue();
                }
                if (this.b < this.f9881a.length) {
                    return true;
                }
                return false;
            }

            @Override // java.util.Iterator
            public void remove() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("41689b0b", new Object[]{this});
                    return;
                }
                int i = this.c;
                if (i >= 0) {
                    a.this.remove(this.f9881a[i]);
                    this.c = -1;
                    return;
                }
                throw new IllegalStateException();
            }
        }

        static {
            t2o.a(969932806);
        }

        public a() {
            ReentrantLock reentrantLock = new ReentrantLock();
            this.b = reentrantLock;
            this.e = reentrantLock.newCondition();
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/virtual_thread/ScheduledVirtualThreadPoolExecutor$DelayedWorkQueue");
        }

        /* renamed from: a */
        public boolean add(Runnable runnable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("bdcb2a", new Object[]{this, runnable})).booleanValue();
            }
            return offer(runnable);
        }

        public final RunnableScheduledFuture<?> b(RunnableScheduledFuture<?> runnableScheduledFuture) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (RunnableScheduledFuture) ipChange.ipc$dispatch("4420dd3d", new Object[]{this, runnableScheduledFuture});
            }
            int i = this.c - 1;
            this.c = i;
            RunnableScheduledFuture<?>[] runnableScheduledFutureArr = this.f9880a;
            RunnableScheduledFuture<?> runnableScheduledFuture2 = runnableScheduledFutureArr[i];
            runnableScheduledFutureArr[i] = null;
            if (i != 0) {
                l(0, runnableScheduledFuture2);
            }
            k(runnableScheduledFuture, -1);
            return runnableScheduledFuture;
        }

        public final void c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1e2bcf1a", new Object[]{this});
                return;
            }
            RunnableScheduledFuture<?>[] runnableScheduledFutureArr = this.f9880a;
            int length = runnableScheduledFutureArr.length;
            int i = length + (length >> 1);
            if (i < 0) {
                i = Integer.MAX_VALUE;
            }
            this.f9880a = (RunnableScheduledFuture[]) Arrays.copyOf(runnableScheduledFutureArr, i);
        }

        @Override // java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection
        public void clear() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b42d4c54", new Object[]{this});
                return;
            }
            ReentrantLock reentrantLock = this.b;
            reentrantLock.lock();
            for (int i = 0; i < this.c; i++) {
                try {
                    RunnableScheduledFuture<?>[] runnableScheduledFutureArr = this.f9880a;
                    RunnableScheduledFuture<?> runnableScheduledFuture = runnableScheduledFutureArr[i];
                    if (runnableScheduledFuture != null) {
                        runnableScheduledFutureArr[i] = null;
                        k(runnableScheduledFuture, -1);
                    }
                } catch (Throwable th) {
                    reentrantLock.unlock();
                    throw th;
                }
            }
            this.c = 0;
            reentrantLock.unlock();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.concurrent.BlockingQueue
        public boolean contains(Object obj) {
            boolean z = true;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("b06c8586", new Object[]{this, obj})).booleanValue();
            }
            ReentrantLock reentrantLock = this.b;
            reentrantLock.lock();
            try {
                if (indexOf(obj) == -1) {
                    z = false;
                }
                return z;
            } finally {
                reentrantLock.unlock();
            }
        }

        /* renamed from: d */
        public boolean offer(Runnable runnable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("38bdabe5", new Object[]{this, runnable})).booleanValue();
            }
            runnable.getClass();
            RunnableScheduledFuture<?> runnableScheduledFuture = (RunnableScheduledFuture) runnable;
            ReentrantLock reentrantLock = this.b;
            reentrantLock.lock();
            try {
                int i = this.c;
                if (i >= this.f9880a.length) {
                    c();
                }
                this.c = i + 1;
                if (i == 0) {
                    this.f9880a[0] = runnableScheduledFuture;
                    k(runnableScheduledFuture, 0);
                } else {
                    m(i, runnableScheduledFuture);
                }
                if (this.f9880a[0] == runnableScheduledFuture) {
                    this.d = null;
                    this.e.signal();
                }
                reentrantLock.unlock();
                return true;
            } catch (Throwable th) {
                reentrantLock.unlock();
                throw th;
            }
        }

        @Override // java.util.concurrent.BlockingQueue
        public int drainTo(Collection<? super Runnable> collection) {
            int i = 0;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("baa627be", new Object[]{this, collection})).intValue();
            }
            collection.getClass();
            if (collection != this) {
                ReentrantLock reentrantLock = this.b;
                reentrantLock.lock();
                while (true) {
                    try {
                        RunnableScheduledFuture<?> g = g();
                        if (g == null) {
                            return i;
                        }
                        collection.add(g);
                        b(g);
                        i++;
                    } finally {
                        reentrantLock.unlock();
                    }
                }
            } else {
                throw new IllegalArgumentException();
            }
        }

        /* renamed from: e */
        public boolean offer(Runnable runnable, long j, TimeUnit timeUnit) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("99fcf4d9", new Object[]{this, runnable, new Long(j), timeUnit})).booleanValue();
            }
            return offer(runnable);
        }

        /* renamed from: f */
        public RunnableScheduledFuture<?> peek() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (RunnableScheduledFuture) ipChange.ipc$dispatch("48c25888", new Object[]{this});
            }
            ReentrantLock reentrantLock = this.b;
            reentrantLock.lock();
            try {
                return this.f9880a[0];
            } finally {
                reentrantLock.unlock();
            }
        }

        public final RunnableScheduledFuture<?> g() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (RunnableScheduledFuture) ipChange.ipc$dispatch("cb842079", new Object[]{this});
            }
            RunnableScheduledFuture<?> runnableScheduledFuture = this.f9880a[0];
            if (runnableScheduledFuture == null || runnableScheduledFuture.getDelay(TimeUnit.NANOSECONDS) > 0) {
                return null;
            }
            return runnableScheduledFuture;
        }

        /* renamed from: h */
        public RunnableScheduledFuture<?> poll() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (RunnableScheduledFuture) ipChange.ipc$dispatch("ddafd6a4", new Object[]{this});
            }
            ReentrantLock reentrantLock = this.b;
            reentrantLock.lock();
            try {
                RunnableScheduledFuture<?> runnableScheduledFuture = this.f9880a[0];
                if (runnableScheduledFuture != null && runnableScheduledFuture.getDelay(TimeUnit.NANOSECONDS) <= 0) {
                    return b(runnableScheduledFuture);
                }
                reentrantLock.unlock();
                return null;
            } finally {
                reentrantLock.unlock();
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:23:0x0058, code lost:
            r9 = b(r1);
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x005e, code lost:
            if (r8.d != null) goto L_0x006b;
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x0064, code lost:
            if (r8.f9880a[0] == null) goto L_0x006b;
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x0066, code lost:
            r8.e.signal();
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x006b, code lost:
            r11.unlock();
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x006e, code lost:
            return r9;
         */
        /* renamed from: i */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public java.util.concurrent.RunnableScheduledFuture<?> poll(long r9, java.util.concurrent.TimeUnit r11) throws java.lang.InterruptedException {
            /*
                r8 = this;
                r0 = 0
                com.android.alibaba.ip.runtime.IpChange r1 = com.taobao.android.virtual_thread.ScheduledVirtualThreadPoolExecutor.a.$ipChange
                boolean r2 = r1 instanceof com.android.alibaba.ip.runtime.IpChange
                if (r2 == 0) goto L_0x0020
                java.lang.Long r2 = new java.lang.Long
                r2.<init>(r9)
                r9 = 3
                java.lang.Object[] r9 = new java.lang.Object[r9]
                r9[r0] = r8
                r10 = 1
                r9[r10] = r2
                r10 = 2
                r9[r10] = r11
                java.lang.String r10 = "16b4de30"
                java.lang.Object r9 = r1.ipc$dispatch(r10, r9)
                java.util.concurrent.RunnableScheduledFuture r9 = (java.util.concurrent.RunnableScheduledFuture) r9
                return r9
            L_0x0020:
                long r9 = r11.toNanos(r9)
                java.util.concurrent.locks.ReentrantLock r11 = r8.b
                r11.lockInterruptibly()
            L_0x0029:
                java.util.concurrent.RunnableScheduledFuture<?>[] r1 = r8.f9880a     // Catch: all -> 0x004c
                r1 = r1[r0]     // Catch: all -> 0x004c
                r2 = 0
                r4 = 0
                if (r1 != 0) goto L_0x004e
                int r5 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
                if (r5 > 0) goto L_0x0045
                java.lang.Thread r9 = r8.d
                if (r9 != 0) goto L_0x0041
                if (r1 == 0) goto L_0x0041
                java.util.concurrent.locks.Condition r9 = r8.e
                r9.signal()
            L_0x0041:
                r11.unlock()
                return r4
            L_0x0045:
                java.util.concurrent.locks.Condition r1 = r8.e     // Catch: all -> 0x004c
                long r9 = r1.awaitNanos(r9)     // Catch: all -> 0x004c
                goto L_0x0029
            L_0x004c:
                r9 = move-exception
                goto L_0x00b4
            L_0x004e:
                java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.NANOSECONDS     // Catch: all -> 0x004c
                long r5 = r1.getDelay(r5)     // Catch: all -> 0x004c
                int r7 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
                if (r7 > 0) goto L_0x006f
                java.util.concurrent.RunnableScheduledFuture r9 = r8.b(r1)     // Catch: all -> 0x004c
                java.lang.Thread r10 = r8.d
                if (r10 != 0) goto L_0x006b
                java.util.concurrent.RunnableScheduledFuture<?>[] r10 = r8.f9880a
                r10 = r10[r0]
                if (r10 == 0) goto L_0x006b
                java.util.concurrent.locks.Condition r10 = r8.e
                r10.signal()
            L_0x006b:
                r11.unlock()
                return r9
            L_0x006f:
                int r1 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
                if (r1 > 0) goto L_0x0086
                java.lang.Thread r9 = r8.d
                if (r9 != 0) goto L_0x0082
                java.util.concurrent.RunnableScheduledFuture<?>[] r9 = r8.f9880a
                r9 = r9[r0]
                if (r9 == 0) goto L_0x0082
                java.util.concurrent.locks.Condition r9 = r8.e
                r9.signal()
            L_0x0082:
                r11.unlock()
                return r4
            L_0x0086:
                int r1 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
                if (r1 < 0) goto L_0x00ac
                java.lang.Thread r1 = r8.d     // Catch: all -> 0x004c
                if (r1 == 0) goto L_0x008f
                goto L_0x00ac
            L_0x008f:
                java.lang.Thread r1 = java.lang.Thread.currentThread()     // Catch: all -> 0x004c
                r8.d = r1     // Catch: all -> 0x004c
                java.util.concurrent.locks.Condition r2 = r8.e     // Catch: all -> 0x00a4
                long r2 = r2.awaitNanos(r5)     // Catch: all -> 0x00a4
                long r5 = r5 - r2
                long r9 = r9 - r5
                java.lang.Thread r2 = r8.d     // Catch: all -> 0x004c
                if (r2 != r1) goto L_0x0029
                r8.d = r4     // Catch: all -> 0x004c
                goto L_0x0029
            L_0x00a4:
                r9 = move-exception
                java.lang.Thread r10 = r8.d     // Catch: all -> 0x004c
                if (r10 != r1) goto L_0x00ab
                r8.d = r4     // Catch: all -> 0x004c
            L_0x00ab:
                throw r9     // Catch: all -> 0x004c
            L_0x00ac:
                java.util.concurrent.locks.Condition r1 = r8.e     // Catch: all -> 0x004c
                long r9 = r1.awaitNanos(r9)     // Catch: all -> 0x004c
                goto L_0x0029
            L_0x00b4:
                java.lang.Thread r10 = r8.d
                if (r10 != 0) goto L_0x00c3
                java.util.concurrent.RunnableScheduledFuture<?>[] r10 = r8.f9880a
                r10 = r10[r0]
                if (r10 == 0) goto L_0x00c3
                java.util.concurrent.locks.Condition r10 = r8.e
                r10.signal()
            L_0x00c3:
                r11.unlock()
                throw r9
            */
            throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.virtual_thread.ScheduledVirtualThreadPoolExecutor.a.poll(long, java.util.concurrent.TimeUnit):java.util.concurrent.RunnableScheduledFuture");
        }

        public final int indexOf(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("5e3a7a1f", new Object[]{this, obj})).intValue();
            }
            if (obj == null) {
                return -1;
            }
            if (obj instanceof b) {
                int i = ((b) obj).e;
                if (i < 0 || i >= this.c || this.f9880a[i] != obj) {
                    return -1;
                }
                return i;
            }
            for (int i2 = 0; i2 < this.c; i2++) {
                if (obj.equals(this.f9880a[i2])) {
                    return i2;
                }
            }
            return -1;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("f187dd4e", new Object[]{this})).booleanValue();
            }
            if (size() == 0) {
                return true;
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<Runnable> iterator() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Iterator) ipChange.ipc$dispatch("8f345362", new Object[]{this});
            }
            return new C0513a((RunnableScheduledFuture[]) Arrays.copyOf(this.f9880a, this.c));
        }

        /* renamed from: j */
        public void put(Runnable runnable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("bef11b94", new Object[]{this, runnable});
            } else {
                offer(runnable);
            }
        }

        public final void k(RunnableScheduledFuture<?> runnableScheduledFuture, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f1f123b8", new Object[]{this, runnableScheduledFuture, new Integer(i)});
            } else if (runnableScheduledFuture instanceof b) {
                ((b) runnableScheduledFuture).e = i;
            }
        }

        public final void l(int i, RunnableScheduledFuture<?> runnableScheduledFuture) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4982cb0a", new Object[]{this, new Integer(i), runnableScheduledFuture});
                return;
            }
            int i2 = this.c >>> 1;
            while (i < i2) {
                int i3 = i << 1;
                int i4 = i3 + 1;
                RunnableScheduledFuture<?>[] runnableScheduledFutureArr = this.f9880a;
                RunnableScheduledFuture<?> runnableScheduledFuture2 = runnableScheduledFutureArr[i4];
                int i5 = i3 + 2;
                if (i5 >= this.c || runnableScheduledFuture2.compareTo(runnableScheduledFutureArr[i5]) <= 0) {
                    i5 = i4;
                } else {
                    runnableScheduledFuture2 = this.f9880a[i5];
                }
                if (runnableScheduledFuture.compareTo(runnableScheduledFuture2) <= 0) {
                    break;
                }
                this.f9880a[i] = runnableScheduledFuture2;
                k(runnableScheduledFuture2, i);
                i = i5;
            }
            this.f9880a[i] = runnableScheduledFuture;
            k(runnableScheduledFuture, i);
        }

        public final void m(int i, RunnableScheduledFuture<?> runnableScheduledFuture) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6f6aa771", new Object[]{this, new Integer(i), runnableScheduledFuture});
                return;
            }
            while (i > 0) {
                int i2 = (i - 1) >>> 1;
                RunnableScheduledFuture<?> runnableScheduledFuture2 = this.f9880a[i2];
                if (runnableScheduledFuture.compareTo(runnableScheduledFuture2) >= 0) {
                    break;
                }
                this.f9880a[i] = runnableScheduledFuture2;
                k(runnableScheduledFuture2, i);
                i = i2;
            }
            this.f9880a[i] = runnableScheduledFuture;
            k(runnableScheduledFuture, i);
        }

        /* renamed from: n */
        public RunnableScheduledFuture<?> take() throws InterruptedException {
            RunnableScheduledFuture<?> runnableScheduledFuture;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (RunnableScheduledFuture) ipChange.ipc$dispatch("b19382dc", new Object[]{this});
            }
            ReentrantLock reentrantLock = this.b;
            reentrantLock.lockInterruptibly();
            while (true) {
                try {
                    runnableScheduledFuture = this.f9880a[0];
                    if (runnableScheduledFuture == null) {
                        this.e.await();
                    } else {
                        long delay = runnableScheduledFuture.getDelay(TimeUnit.NANOSECONDS);
                        if (delay <= 0) {
                            break;
                        } else if (this.d != null) {
                            this.e.await();
                        } else {
                            Thread currentThread = Thread.currentThread();
                            this.d = currentThread;
                            this.e.awaitNanos(delay);
                            if (this.d == currentThread) {
                                this.d = null;
                            }
                        }
                    }
                } catch (Throwable th) {
                    if (this.d == null && this.f9880a[0] != null) {
                        this.e.signal();
                    }
                    reentrantLock.unlock();
                    throw th;
                }
            }
            RunnableScheduledFuture<?> b = b(runnableScheduledFuture);
            if (this.d == null && this.f9880a[0] != null) {
                this.e.signal();
            }
            reentrantLock.unlock();
            return b;
        }

        @Override // java.util.concurrent.BlockingQueue
        public int remainingCapacity() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("148e6d4a", new Object[]{this})).intValue();
            }
            return Integer.MAX_VALUE;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.concurrent.BlockingQueue
        public boolean remove(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("ec2dfe2b", new Object[]{this, obj})).booleanValue();
            }
            ReentrantLock reentrantLock = this.b;
            reentrantLock.lock();
            try {
                int indexOf = indexOf(obj);
                if (indexOf < 0) {
                    return false;
                }
                k(this.f9880a[indexOf], -1);
                int i = this.c - 1;
                this.c = i;
                RunnableScheduledFuture<?>[] runnableScheduledFutureArr = this.f9880a;
                RunnableScheduledFuture<?> runnableScheduledFuture = runnableScheduledFutureArr[i];
                runnableScheduledFutureArr[i] = null;
                if (i != indexOf) {
                    l(indexOf, runnableScheduledFuture);
                    if (this.f9880a[indexOf] == runnableScheduledFuture) {
                        m(indexOf, runnableScheduledFuture);
                    }
                }
                return true;
            } finally {
                reentrantLock.unlock();
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("32697bfb", new Object[]{this})).intValue();
            }
            ReentrantLock reentrantLock = this.b;
            reentrantLock.lock();
            try {
                return this.c;
            } finally {
                reentrantLock.unlock();
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public Object[] toArray() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Object[]) ipChange.ipc$dispatch("a69fe546", new Object[]{this});
            }
            ReentrantLock reentrantLock = this.b;
            reentrantLock.lock();
            try {
                return Arrays.copyOf(this.f9880a, this.c, Object[].class);
            } finally {
                reentrantLock.unlock();
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (T[]) ((Object[]) ipChange.ipc$dispatch("800a0c4d", new Object[]{this, tArr}));
            }
            ReentrantLock reentrantLock = this.b;
            reentrantLock.lock();
            try {
                int length = tArr.length;
                int i = this.c;
                if (length < i) {
                    return (T[]) Arrays.copyOf(this.f9880a, i, tArr.getClass());
                }
                System.arraycopy(this.f9880a, 0, tArr, 0, i);
                int length2 = tArr.length;
                int i2 = this.c;
                if (length2 > i2) {
                    tArr[i2] = null;
                }
                return tArr;
            } finally {
                reentrantLock.unlock();
            }
        }

        @Override // java.util.concurrent.BlockingQueue
        public int drainTo(Collection<? super Runnable> collection, int i) {
            int i2 = 0;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("9a1f448b", new Object[]{this, collection, new Integer(i)})).intValue();
            }
            collection.getClass();
            if (collection == this) {
                throw new IllegalArgumentException();
            } else if (i <= 0) {
                return 0;
            } else {
                ReentrantLock reentrantLock = this.b;
                reentrantLock.lock();
                while (i2 < i) {
                    try {
                        RunnableScheduledFuture<?> g = g();
                        if (g == null) {
                            break;
                        }
                        collection.add(g);
                        b(g);
                        i2++;
                    } finally {
                        reentrantLock.unlock();
                    }
                }
                return i2;
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class b<V> extends FutureTask<V> implements RunnableScheduledFuture<V> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private final long f9882a;
        private long b;
        private final long c;
        public RunnableScheduledFuture<V> d;
        public int e;

        static {
            t2o.a(969932808);
        }

        public b(Runnable runnable, V v, long j) {
            super(runnable, v);
            this.d = this;
            this.b = j;
            this.c = 0L;
            this.f9882a = ScheduledVirtualThreadPoolExecutor.access$000().getAndIncrement();
        }

        public static /* synthetic */ void b(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("26593de3", new Object[]{bVar});
            } else {
                super.run();
            }
        }

        public static /* synthetic */ boolean d(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("561071e8", new Object[]{bVar})).booleanValue();
            }
            return super.runAndReset();
        }

        private void f() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b21a4eca", new Object[]{this});
                return;
            }
            long j = this.c;
            if (j > 0) {
                this.b += j;
            } else {
                this.b = ScheduledVirtualThreadPoolExecutor.this.triggerTime(-j);
            }
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            int hashCode = str.hashCode();
            if (hashCode == -1619161865) {
                return new Boolean(super.cancel(((Boolean) objArr[0]).booleanValue()));
            }
            if (hashCode == 91209838) {
                return new Boolean(super.runAndReset());
            }
            if (hashCode == 1548812690) {
                super.run();
                return null;
            }
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/android/virtual_thread/ScheduledVirtualThreadPoolExecutor$ScheduledFutureTask");
        }

        @Override // java.util.concurrent.FutureTask, java.util.concurrent.Future
        public boolean cancel(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("9f7d8cf7", new Object[]{this, new Boolean(z)})).booleanValue();
            }
            boolean cancel = super.cancel(z);
            if (cancel && ScheduledVirtualThreadPoolExecutor.access$100(ScheduledVirtualThreadPoolExecutor.this) && this.e >= 0) {
                ScheduledVirtualThreadPoolExecutor.this.remove(this);
            }
            return cancel;
        }

        /* renamed from: e */
        public int compareTo(Delayed delayed) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("46db6d7f", new Object[]{this, delayed})).intValue();
            }
            if (delayed == this) {
                return 0;
            }
            if (delayed instanceof b) {
                b bVar = (b) delayed;
                int i = ((this.b - bVar.b) > 0L ? 1 : ((this.b - bVar.b) == 0L ? 0 : -1));
                if (i < 0) {
                    return -1;
                }
                if (i <= 0 && this.f9882a < bVar.f9882a) {
                    return -1;
                }
                return 1;
            }
            TimeUnit timeUnit = TimeUnit.NANOSECONDS;
            int i2 = ((getDelay(timeUnit) - delayed.getDelay(timeUnit)) > 0L ? 1 : ((getDelay(timeUnit) - delayed.getDelay(timeUnit)) == 0L ? 0 : -1));
            if (i2 < 0) {
                return -1;
            }
            if (i2 > 0) {
                return 1;
            }
            return 0;
        }

        @Override // java.util.concurrent.Delayed
        public long getDelay(TimeUnit timeUnit) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("12d66bd8", new Object[]{this, timeUnit})).longValue();
            }
            return timeUnit.convert(this.b - ScheduledVirtualThreadPoolExecutor.this.now(), TimeUnit.NANOSECONDS);
        }

        @Override // java.util.concurrent.RunnableScheduledFuture
        public boolean isPeriodic() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("f49ec7f0", new Object[]{this})).booleanValue();
            }
            if (this.c != 0) {
                return true;
            }
            return false;
        }

        @Override // java.util.concurrent.FutureTask, java.util.concurrent.RunnableFuture, java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            boolean isPeriodic = isPeriodic();
            if (!ScheduledVirtualThreadPoolExecutor.this.canRunInCurrentRunState(isPeriodic)) {
                cancel(false);
            } else if (!isPeriodic) {
                b(this);
            } else if (d(this)) {
                f();
                ScheduledVirtualThreadPoolExecutor.this.reExecutePeriodic(this.d);
            }
        }

        public b(Runnable runnable, V v, long j, long j2) {
            super(runnable, v);
            this.d = this;
            this.b = j;
            this.c = j2;
            this.f9882a = ScheduledVirtualThreadPoolExecutor.access$000().getAndIncrement();
        }

        public b(Callable<V> callable, long j) {
            super(callable);
            this.d = this;
            this.b = j;
            this.c = 0L;
            this.f9882a = ScheduledVirtualThreadPoolExecutor.access$000().getAndIncrement();
        }
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public <V> ScheduledFuture<V> schedule(Callable<V> callable, long j, TimeUnit timeUnit) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ScheduledFuture) ipChange.ipc$dispatch("b810b526", new Object[]{this, callable, new Long(j), timeUnit});
        }
        if (callable == null || timeUnit == null) {
            throw null;
        }
        RunnableScheduledFuture<V> decorateTask = decorateTask(callable, new b(callable, triggerTime(j, timeUnit)));
        delayedExecute(decorateTask);
        return decorateTask;
    }

    public ScheduledVirtualThreadPoolExecutor(int i, VRejectedExecutionHandler vRejectedExecutionHandler) {
        super(i, Integer.MAX_VALUE, 10L, TimeUnit.MILLISECONDS, new a(), vRejectedExecutionHandler);
    }

    public ScheduledVirtualThreadPoolExecutor(int i, ThreadFactory threadFactory, VRejectedExecutionHandler vRejectedExecutionHandler) {
        super(i, Integer.MAX_VALUE, 10L, TimeUnit.MILLISECONDS, new a(), threadFactory, vRejectedExecutionHandler);
    }
}
