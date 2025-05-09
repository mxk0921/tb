package com.taobao.android.virtual_thread;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.AbstractQueuedSynchronizer;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class VirtualThreadPoolExecutor extends AbstractExecutorService {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final int CAPACITY = 536870911;
    private static final int COUNT_BITS = 29;
    private static final boolean ONLY_ONE = true;
    private static final String TAG = "VThreadPool";
    private static final int V_RUNNING = -536870912;
    private static final int V_SHUTDOWN = 0;
    private static final int V_STOP = 536870912;
    private static final int V_TERMINATED = 1610612736;
    private static final int V_TIDYING = 1073741824;
    public static final VRejectedExecutionHandler defaultHandler = new a();
    private volatile boolean allowCoreThreadTimeOut;
    private long completedTaskCount;
    private volatile int corePoolSize;
    private final AtomicInteger ctl;
    private volatile VRejectedExecutionHandler handler;
    private final BlockingQueue<Worker> idleWorkers;
    private volatile long keepAliveTime;
    private int largestPoolSize;
    private final ReentrantLock mainLock;
    private volatile int maximumPoolSize;
    private final Condition termination;
    private volatile ThreadFactory threadFactory;
    private final BlockingQueue<Runnable> workQueue;
    private final AtomicInteger workerCount;
    private final HashSet<Worker> workers;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class a implements VRejectedExecutionHandler {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(969932819);
            t2o.a(969932810);
        }

        @Override // com.taobao.android.virtual_thread.VRejectedExecutionHandler
        public void vRejectedExecution(Runnable runnable, ExecutorService executorService) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5354de2e", new Object[]{this, runnable, executorService});
                return;
            }
            throw new RejectedExecutionException("Task " + runnable.toString() + " rejected from " + executorService.toString());
        }
    }

    static {
        t2o.a(969932818);
    }

    public VirtualThreadPoolExecutor(int i, int i2, long j, TimeUnit timeUnit, BlockingQueue<Runnable> blockingQueue) {
        this(i, i2, j, timeUnit, blockingQueue, VirtualExecutors.defaultThreadFactory(), defaultHandler);
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x00c2, code lost:
        return false;
     */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0097 A[Catch: all -> 0x009b, TRY_LEAVE, TryCatch #3 {all -> 0x009b, blocks: (B:22:0x005b, B:24:0x005f, B:37:0x0092, B:39:0x0097, B:25:0x0064, B:31:0x0077, B:33:0x007d, B:35:0x008c, B:41:0x009d, B:42:0x00a2), top: B:56:0x005b }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00aa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean addWorker(java.lang.Runnable r7, boolean r8) {
        /*
            r6 = this;
            r0 = 1
            r1 = 0
            com.android.alibaba.ip.runtime.IpChange r2 = com.taobao.android.virtual_thread.VirtualThreadPoolExecutor.$ipChange
            boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r3 == 0) goto L_0x0024
            java.lang.Boolean r3 = new java.lang.Boolean
            r3.<init>(r8)
            r8 = 3
            java.lang.Object[] r8 = new java.lang.Object[r8]
            r8[r1] = r6
            r8[r0] = r7
            r7 = 2
            r8[r7] = r3
            java.lang.String r7 = "22101f54"
            java.lang.Object r7 = r2.ipc$dispatch(r7, r8)
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            return r7
        L_0x0024:
            java.util.concurrent.atomic.AtomicInteger r2 = r6.ctl
            int r2 = r2.get()
            int r3 = runStateOf(r2)
            if (r3 < 0) goto L_0x003d
            if (r3 != 0) goto L_0x003c
            if (r7 != 0) goto L_0x003c
            java.util.concurrent.BlockingQueue<java.lang.Runnable> r4 = r6.workQueue
            boolean r4 = r4.isEmpty()
            if (r4 == 0) goto L_0x003d
        L_0x003c:
            return r1
        L_0x003d:
            int r4 = workerCountOf(r2)
            r5 = 536870911(0x1fffffff, float:1.0842021E-19)
            if (r4 >= r5) goto L_0x00c2
            if (r8 == 0) goto L_0x004b
            int r5 = r6.corePoolSize
            goto L_0x004d
        L_0x004b:
            int r5 = r6.maximumPoolSize
        L_0x004d:
            if (r4 < r5) goto L_0x0051
            goto L_0x00c2
        L_0x0051:
            boolean r2 = r6.compareAndIncrementWorkerCount(r2)
            if (r2 == 0) goto L_0x00b4
            com.taobao.android.virtual_thread.VirtualThreadPoolExecutor$Worker r8 = r6.createWorker(r7)     // Catch: all -> 0x00ae
            com.taobao.android.virtual_thread.VThread r2 = r8.vThread     // Catch: all -> 0x009b
            if (r2 == 0) goto L_0x00a7
            java.util.concurrent.locks.ReentrantLock r3 = r6.mainLock     // Catch: all -> 0x009b
            r3.lock()     // Catch: all -> 0x009b
            java.util.concurrent.atomic.AtomicInteger r4 = r6.ctl     // Catch: all -> 0x008f
            int r4 = r4.get()     // Catch: all -> 0x008f
            int r4 = runStateOf(r4)     // Catch: all -> 0x008f
            if (r4 < 0) goto L_0x0077
            if (r4 != 0) goto L_0x0075
            if (r7 != 0) goto L_0x0075
            goto L_0x0077
        L_0x0075:
            r7 = 0
            goto L_0x0092
        L_0x0077:
            boolean r7 = r2.isAlive()     // Catch: all -> 0x008f
            if (r7 != 0) goto L_0x009d
            java.util.HashSet<com.taobao.android.virtual_thread.VirtualThreadPoolExecutor$Worker> r7 = r6.workers     // Catch: all -> 0x008f
            r7.add(r8)     // Catch: all -> 0x008f
            java.util.HashSet<com.taobao.android.virtual_thread.VirtualThreadPoolExecutor$Worker> r7 = r6.workers     // Catch: all -> 0x008f
            int r7 = r7.size()     // Catch: all -> 0x008f
            int r4 = r6.largestPoolSize     // Catch: all -> 0x008f
            if (r7 <= r4) goto L_0x0091
            r6.largestPoolSize = r7     // Catch: all -> 0x008f
            goto L_0x0091
        L_0x008f:
            r7 = move-exception
            goto L_0x00a3
        L_0x0091:
            r7 = 1
        L_0x0092:
            r3.unlock()     // Catch: all -> 0x009b
            if (r7 == 0) goto L_0x00a7
            r2.start()     // Catch: all -> 0x009b
            goto L_0x00a8
        L_0x009b:
            r7 = move-exception
            goto L_0x00b0
        L_0x009d:
            java.lang.IllegalThreadStateException r7 = new java.lang.IllegalThreadStateException     // Catch: all -> 0x008f
            r7.<init>()     // Catch: all -> 0x008f
            throw r7     // Catch: all -> 0x008f
        L_0x00a3:
            r3.unlock()     // Catch: all -> 0x009b
            throw r7     // Catch: all -> 0x009b
        L_0x00a7:
            r0 = 0
        L_0x00a8:
            if (r0 != 0) goto L_0x00ad
            r6.addWorkerFailed(r8)
        L_0x00ad:
            return r0
        L_0x00ae:
            r7 = move-exception
            r8 = 0
        L_0x00b0:
            r6.addWorkerFailed(r8)
            throw r7
        L_0x00b4:
            java.util.concurrent.atomic.AtomicInteger r2 = r6.ctl
            int r2 = r2.get()
            int r4 = runStateOf(r2)
            if (r4 == r3) goto L_0x003d
            goto L_0x0024
        L_0x00c2:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.virtual_thread.VirtualThreadPoolExecutor.addWorker(java.lang.Runnable, boolean):boolean");
    }

    private void addWorkerFailed(Worker worker) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("514d0296", new Object[]{this, worker});
            return;
        }
        ReentrantLock reentrantLock = this.mainLock;
        reentrantLock.lock();
        if (worker != null) {
            try {
                this.workers.remove(worker);
            } catch (Throwable th) {
                reentrantLock.unlock();
                throw th;
            }
        }
        decrementWorkerCount();
        tryTerminate();
        reentrantLock.unlock();
    }

    private void advanceRunState(int i) {
        int i2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a5cfcf4", new Object[]{this, new Integer(i)});
            return;
        }
        do {
            i2 = this.ctl.get();
            if (runStateAtLeast(i2, i)) {
                return;
            }
        } while (!this.ctl.compareAndSet(i2, ctlOf(i, workerCountOf(i2))));
    }

    private boolean compareAndDecrementWorkerCount(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c8bc01f0", new Object[]{this, new Integer(i)})).booleanValue();
        }
        return this.ctl.compareAndSet(i, i - 1);
    }

    private boolean compareAndIncrementWorkerCount(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("39bb88cc", new Object[]{this, new Integer(i)})).booleanValue();
        }
        return this.ctl.compareAndSet(i, 1 + i);
    }

    private Worker createWorker(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Worker) ipChange.ipc$dispatch("c0a93ca", new Object[]{this, runnable});
        }
        Worker poll = this.idleWorkers.poll();
        if (poll != null) {
            return new Worker(runnable, poll);
        }
        return new Worker(runnable);
    }

    private static int ctlOf(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("45a48aec", new Object[]{new Integer(i), new Integer(i2)})).intValue();
        }
        return i | i2;
    }

    private void decrementWorkerCount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee406325", new Object[]{this});
        } else {
            do {
            } while (!compareAndDecrementWorkerCount(this.ctl.get()));
        }
    }

    private List<Runnable> drainQueue() {
        Runnable[] runnableArr;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("21b78847", new Object[]{this});
        }
        BlockingQueue<Runnable> blockingQueue = this.workQueue;
        ArrayList arrayList = new ArrayList();
        blockingQueue.drainTo(arrayList);
        if (!blockingQueue.isEmpty()) {
            for (Runnable runnable : (Runnable[]) blockingQueue.toArray(new Runnable[0])) {
                if (blockingQueue.remove(runnable)) {
                    arrayList.add(runnable);
                }
            }
        }
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0074, code lost:
        r7.idleWorkers.add(r8);
        decrementWorkerCount();
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x007c, code lost:
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:?, code lost:
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private java.lang.Runnable getTask(com.taobao.android.virtual_thread.VirtualThreadPoolExecutor.Worker r8) {
        /*
            r7 = this;
            r0 = 1
            r1 = 0
            com.android.alibaba.ip.runtime.IpChange r2 = com.taobao.android.virtual_thread.VirtualThreadPoolExecutor.$ipChange
            boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r3 == 0) goto L_0x0018
            java.lang.String r3 = "eb16167f"
            r4 = 2
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r4[r1] = r7
            r4[r0] = r8
            java.lang.Object r8 = r2.ipc$dispatch(r3, r4)
            java.lang.Runnable r8 = (java.lang.Runnable) r8
            return r8
        L_0x0018:
            r2 = 0
        L_0x0019:
            java.util.concurrent.atomic.AtomicInteger r3 = r7.ctl
            int r3 = r3.get()
            int r4 = runStateOf(r3)
            r5 = 0
            if (r4 < 0) goto L_0x003b
            r6 = 536870912(0x20000000, float:1.0842022E-19)
            if (r4 >= r6) goto L_0x0032
            java.util.concurrent.BlockingQueue<java.lang.Runnable> r4 = r7.workQueue
            boolean r4 = r4.isEmpty()
            if (r4 == 0) goto L_0x003b
        L_0x0032:
            java.util.concurrent.BlockingQueue<com.taobao.android.virtual_thread.VirtualThreadPoolExecutor$Worker> r0 = r7.idleWorkers
            r0.add(r8)
            r7.decrementWorkerCount()
            return r5
        L_0x003b:
            int r3 = workerCountOf(r3)
            int r4 = r7.maximumPoolSize
            if (r3 > r4) goto L_0x0045
            if (r2 == 0) goto L_0x0050
        L_0x0045:
            if (r3 > r0) goto L_0x0074
            java.util.concurrent.BlockingQueue<java.lang.Runnable> r2 = r7.workQueue
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L_0x0050
            goto L_0x0074
        L_0x0050:
            java.util.concurrent.BlockingQueue<java.lang.Runnable> r2 = r7.workQueue     // Catch: InterruptedException -> 0x0061
            boolean r2 = r2.isEmpty()     // Catch: InterruptedException -> 0x0061
            if (r2 == 0) goto L_0x0063
            java.util.concurrent.BlockingQueue<java.lang.Runnable> r2 = r7.workQueue     // Catch: InterruptedException -> 0x0061
            java.lang.Object r2 = r2.poll()     // Catch: InterruptedException -> 0x0061
            java.lang.Runnable r2 = (java.lang.Runnable) r2     // Catch: InterruptedException -> 0x0061
            goto L_0x006f
        L_0x0061:
            goto L_0x0018
        L_0x0063:
            java.util.concurrent.BlockingQueue<java.lang.Runnable> r2 = r7.workQueue     // Catch: InterruptedException -> 0x0061
            long r3 = r7.keepAliveTime     // Catch: InterruptedException -> 0x0061
            java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.NANOSECONDS     // Catch: InterruptedException -> 0x0061
            java.lang.Object r2 = r2.poll(r3, r5)     // Catch: InterruptedException -> 0x0061
            java.lang.Runnable r2 = (java.lang.Runnable) r2     // Catch: InterruptedException -> 0x0061
        L_0x006f:
            if (r2 == 0) goto L_0x0072
            return r2
        L_0x0072:
            r2 = 1
            goto L_0x0019
        L_0x0074:
            java.util.concurrent.BlockingQueue<com.taobao.android.virtual_thread.VirtualThreadPoolExecutor$Worker> r0 = r7.idleWorkers
            r0.add(r8)
            r7.decrementWorkerCount()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.virtual_thread.VirtualThreadPoolExecutor.getTask(com.taobao.android.virtual_thread.VirtualThreadPoolExecutor$Worker):java.lang.Runnable");
    }

    private void interruptIdleWorkers(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8e2e0e0f", new Object[]{this, new Boolean(z)});
            return;
        }
        ReentrantLock reentrantLock = this.mainLock;
        reentrantLock.lock();
        try {
            Iterator<Worker> it = this.workers.iterator();
            while (it.hasNext()) {
                Worker next = it.next();
                VThread vThread = next.vThread;
                if (!vThread.isInterrupted() && next.tryLock()) {
                    try {
                        vThread.interrupt();
                    } catch (SecurityException unused) {
                    } catch (Throwable th) {
                        next.unlock();
                        throw th;
                    }
                    next.unlock();
                    continue;
                }
                if (z) {
                    break;
                }
            }
            reentrantLock.unlock();
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    private void interruptWorkers() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b7eec59", new Object[]{this});
            return;
        }
        ReentrantLock reentrantLock = this.mainLock;
        reentrantLock.lock();
        try {
            Iterator<Worker> it = this.workers.iterator();
            while (it.hasNext()) {
                it.next().interruptIfStarted();
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    public static /* synthetic */ Object ipc$super(VirtualThreadPoolExecutor virtualThreadPoolExecutor, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/virtual_thread/VirtualThreadPoolExecutor");
    }

    private static boolean isRunning(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1de1b4b", new Object[]{new Integer(i)})).booleanValue();
        }
        if (i < 0) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Finally extract failed */
    private void processWorkerExit(Worker worker, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb2e2aef", new Object[]{this, worker, new Boolean(z)});
            return;
        }
        if (z) {
            decrementWorkerCount();
        }
        ReentrantLock reentrantLock = this.mainLock;
        reentrantLock.lock();
        try {
            this.completedTaskCount += worker.completedTasks;
            this.workers.remove(worker);
            reentrantLock.unlock();
            tryTerminate();
            int i = this.ctl.get();
            if (!runStateLessThan(i, 536870912)) {
                return;
            }
            if (z || workerCountOf(i) < (!this.workQueue.isEmpty() ? 1 : 0)) {
                addWorker(null, false);
            }
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    private static boolean runStateAtLeast(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2ea0317b", new Object[]{new Integer(i), new Integer(i2)})).booleanValue();
        }
        if (i >= i2) {
            return true;
        }
        return false;
    }

    private static boolean runStateLessThan(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("766bb4eb", new Object[]{new Integer(i), new Integer(i2)})).booleanValue();
        }
        if (i < i2) {
            return true;
        }
        return false;
    }

    private static int runStateOf(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6efbd432", new Object[]{new Integer(i)})).intValue();
        }
        return i & V_RUNNING;
    }

    private static int workerCountOf(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b159a267", new Object[]{new Integer(i)})).intValue();
        }
        return i & CAPACITY;
    }

    public void afterExecute(Runnable runnable, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("464b0a37", new Object[]{this, runnable, th});
        }
    }

    @Deprecated
    public void allowCoreThreadTimeOut(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("55cd25e", new Object[]{this, new Boolean(z)});
        } else if (z && this.keepAliveTime <= 0) {
            throw new IllegalArgumentException("Core threads must have nonzero keep alive times");
        } else if (z != this.allowCoreThreadTimeOut) {
            this.allowCoreThreadTimeOut = z;
        }
    }

    public boolean allowsCoreThreadTimeOut() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("39c53ed9", new Object[]{this})).booleanValue();
        }
        return this.allowCoreThreadTimeOut;
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean awaitTermination(long j, TimeUnit timeUnit) throws InterruptedException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("db874a4d", new Object[]{this, new Long(j), timeUnit})).booleanValue();
        }
        long nanos = timeUnit.toNanos(j);
        ReentrantLock reentrantLock = this.mainLock;
        reentrantLock.lock();
        while (!runStateAtLeast(this.ctl.get(), V_TERMINATED)) {
            try {
                if (nanos <= 0) {
                    return false;
                }
                nanos = this.termination.awaitNanos(nanos);
            } finally {
                reentrantLock.unlock();
            }
        }
        return true;
    }

    public void beforeExecute(Thread thread, Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("45eb7bec", new Object[]{this, thread, runnable});
        }
    }

    public void ensurePrestart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e2276004", new Object[]{this});
            return;
        }
        int workerCountOf = workerCountOf(this.ctl.get());
        if (workerCountOf < this.corePoolSize) {
            addWorker(null, true);
        } else if (workerCountOf == 0) {
            addWorker(null, false);
        }
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1afb0dfa", new Object[]{this, runnable});
            return;
        }
        runnable.getClass();
        int i = this.ctl.get();
        if (workerCountOf(i) < this.corePoolSize) {
            if (!addWorker(runnable, true)) {
                i = this.ctl.get();
            } else {
                return;
            }
        }
        if (isRunning(i) && this.workQueue.offer(runnable)) {
            int i2 = this.ctl.get();
            int workerCountOf = workerCountOf(i2);
            if (!isRunning(i2) && remove(runnable)) {
                reject(runnable);
            } else if (workerCountOf == 0) {
                addWorker(null, false);
            }
        } else if (!addWorker(runnable, false)) {
            reject(runnable);
        }
    }

    public void finalize() throws Throwable {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a35321a5", new Object[]{this});
            return;
        }
        if (!isShutdown()) {
            shutdown();
        }
        super.finalize();
    }

    public int getActiveCount() {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4edbaf6d", new Object[]{this})).intValue();
        }
        ReentrantLock reentrantLock = this.mainLock;
        reentrantLock.lock();
        try {
            Iterator<Worker> it = this.workers.iterator();
            while (it.hasNext()) {
                if (it.next().isLocked()) {
                    i++;
                }
            }
            return i;
        } finally {
            reentrantLock.unlock();
        }
    }

    public long getCompletedTaskCount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("17d58870", new Object[]{this})).longValue();
        }
        ReentrantLock reentrantLock = this.mainLock;
        reentrantLock.lock();
        try {
            long j = this.completedTaskCount;
            Iterator<Worker> it = this.workers.iterator();
            while (it.hasNext()) {
                j += it.next().completedTasks;
            }
            return j;
        } finally {
            reentrantLock.unlock();
        }
    }

    public int getCorePoolSize() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2d8190ec", new Object[]{this})).intValue();
        }
        return this.corePoolSize;
    }

    public long getKeepAliveTime(TimeUnit timeUnit) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("400a96e6", new Object[]{this, timeUnit})).longValue();
        }
        return timeUnit.convert(this.keepAliveTime, TimeUnit.NANOSECONDS);
    }

    public int getLargestPoolSize() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e7e649fd", new Object[]{this})).intValue();
        }
        ReentrantLock reentrantLock = this.mainLock;
        reentrantLock.lock();
        try {
            return this.largestPoolSize;
        } finally {
            reentrantLock.unlock();
        }
    }

    public int getMaximumPoolSize() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("69b15341", new Object[]{this})).intValue();
        }
        return this.maximumPoolSize;
    }

    public int getPoolSize() {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fccf2ead", new Object[]{this})).intValue();
        }
        ReentrantLock reentrantLock = this.mainLock;
        reentrantLock.lock();
        try {
            if (!runStateAtLeast(this.ctl.get(), 1073741824)) {
                i = this.workers.size();
            }
            return i;
        } finally {
            reentrantLock.unlock();
        }
    }

    public BlockingQueue<Runnable> getQueue() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BlockingQueue) ipChange.ipc$dispatch("e2cf35bf", new Object[]{this});
        }
        return this.workQueue;
    }

    public VRejectedExecutionHandler getRejectedExecutionHandler() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (VRejectedExecutionHandler) ipChange.ipc$dispatch("2c1c3c76", new Object[]{this});
        }
        return this.handler;
    }

    public long getTaskCount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("806ec24f", new Object[]{this})).longValue();
        }
        ReentrantLock reentrantLock = this.mainLock;
        reentrantLock.lock();
        try {
            long j = this.completedTaskCount;
            Iterator<Worker> it = this.workers.iterator();
            while (it.hasNext()) {
                Worker next = it.next();
                j += next.completedTasks;
                if (next.isLocked()) {
                    j++;
                }
            }
            long size = j + this.workQueue.size();
            reentrantLock.unlock();
            return size;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public ThreadFactory getThreadFactory() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ThreadFactory) ipChange.ipc$dispatch("2fa31d0c", new Object[]{this});
        }
        return this.threadFactory;
    }

    public final boolean isRunningOrShutdown(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("478df383", new Object[]{this, new Boolean(z)})).booleanValue();
        }
        int runStateOf = runStateOf(this.ctl.get());
        if (runStateOf == V_RUNNING) {
            return true;
        }
        if (runStateOf != 0 || !z) {
            return false;
        }
        return true;
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isShutdown() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ede5622b", new Object[]{this})).booleanValue();
        }
        return true ^ isRunning(this.ctl.get());
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isTerminated() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d97450f8", new Object[]{this})).booleanValue();
        }
        return runStateAtLeast(this.ctl.get(), V_TERMINATED);
    }

    public boolean isTerminating() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3ce51ddf", new Object[]{this})).booleanValue();
        }
        int i = this.ctl.get();
        if (isRunning(i) || !runStateLessThan(i, V_TERMINATED)) {
            return false;
        }
        return true;
    }

    public void onShutdown() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9088fb5c", new Object[]{this});
        }
    }

    public int prestartAllCoreThreads() {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("240f24a2", new Object[]{this})).intValue();
        }
        while (addWorker(null, true)) {
            i++;
        }
        return i;
    }

    public boolean prestartCoreThread() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ed2b1813", new Object[]{this})).booleanValue();
        }
        if (workerCountOf(this.ctl.get()) >= this.corePoolSize || !addWorker(null, true)) {
            return false;
        }
        return true;
    }

    public void purge() {
        Object[] array;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9bc867b2", new Object[]{this});
            return;
        }
        BlockingQueue<Runnable> blockingQueue = this.workQueue;
        try {
            Iterator<Runnable> it = blockingQueue.iterator();
            while (it.hasNext()) {
                Runnable next = it.next();
                if ((next instanceof Future) && ((Future) next).isCancelled()) {
                    it.remove();
                }
            }
        } catch (ConcurrentModificationException unused) {
            for (Object obj : blockingQueue.toArray()) {
                if ((obj instanceof Future) && ((Future) obj).isCancelled()) {
                    blockingQueue.remove(obj);
                }
            }
        }
        tryTerminate();
    }

    public final void reject(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("77242c24", new Object[]{this, runnable});
        } else {
            this.handler.vRejectedExecution(runnable, this);
        }
    }

    public boolean remove(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("eb0e920d", new Object[]{this, runnable})).booleanValue();
        }
        boolean remove = this.workQueue.remove(runnable);
        tryTerminate();
        return remove;
    }

    public final void runWorker(Worker worker) {
        boolean z = true;
        boolean z2 = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            Object[] objArr = new Object[2];
            objArr[z2 ? 1 : 0] = this;
            objArr[z ? 1 : 0] = worker;
            ipChange.ipc$dispatch("1f5782e3", objArr);
            return;
        }
        Thread currentCarrierThread = VThread.currentCarrierThread();
        Runnable runnable = worker.firstTask;
        worker.firstTask = null;
        worker.unlock();
        while (true) {
            if (runnable == null) {
                try {
                    runnable = getTask(worker);
                    if (runnable == null) {
                        return;
                    }
                } finally {
                    processWorkerExit(worker, z);
                }
            }
            worker.lock();
            if ((runStateAtLeast(this.ctl.get(), 536870912) || (Thread.interrupted() && runStateAtLeast(this.ctl.get(), 536870912))) && !currentCarrierThread.isInterrupted()) {
                currentCarrierThread.interrupt();
            }
            beforeExecute(VThread.currentVirtualThread(), runnable);
            try {
                runnable.run();
                afterExecute(runnable, null);
                worker.completedTasks++;
                worker.unlock();
                runnable = null;
            } catch (RuntimeException e) {
                throw e;
            }
        }
    }

    public void setCorePoolSize(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e470d9e", new Object[]{this, new Integer(i)});
        } else if (i >= 0) {
            int i2 = i - this.corePoolSize;
            this.corePoolSize = i;
            if (workerCountOf(this.ctl.get()) > i) {
                interruptIdleWorkers();
            } else if (i2 > 0) {
                int min = Math.min(i2, this.workQueue.size());
                while (true) {
                    int i3 = min - 1;
                    if (min > 0 && addWorker(null, true) && !this.workQueue.isEmpty()) {
                        min = i3;
                    } else {
                        return;
                    }
                }
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    public void setKeepAliveTime(long j, TimeUnit timeUnit) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f8065ee", new Object[]{this, new Long(j), timeUnit});
            return;
        }
        int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        if (i < 0) {
            throw new IllegalArgumentException();
        } else if (i != 0 || !allowsCoreThreadTimeOut()) {
            this.keepAliveTime = timeUnit.toNanos(j);
        } else {
            throw new IllegalArgumentException("Core threads must have nonzero keep alive times");
        }
    }

    public void setMaximumPoolSize(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("46ccb881", new Object[]{this, new Integer(i)});
        } else if (i <= 0 || i < this.corePoolSize) {
            throw new IllegalArgumentException();
        } else {
            this.maximumPoolSize = i;
            if (workerCountOf(this.ctl.get()) > i) {
                interruptIdleWorkers();
            }
        }
    }

    public void setRejectedExecutionHandler(VRejectedExecutionHandler vRejectedExecutionHandler) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2817b340", new Object[]{this, vRejectedExecutionHandler});
            return;
        }
        vRejectedExecutionHandler.getClass();
        this.handler = vRejectedExecutionHandler;
    }

    public void setThreadFactory(ThreadFactory threadFactory) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a3bb42c", new Object[]{this, threadFactory});
            return;
        }
        threadFactory.getClass();
        this.threadFactory = threadFactory;
    }

    /* JADX WARN: Finally extract failed */
    @Override // java.util.concurrent.ExecutorService
    public void shutdown() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b466fdd", new Object[]{this});
            return;
        }
        ReentrantLock reentrantLock = this.mainLock;
        reentrantLock.lock();
        try {
            advanceRunState(0);
            interruptIdleWorkers();
            onShutdown();
            reentrantLock.unlock();
            tryTerminate();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    /* JADX WARN: Finally extract failed */
    @Override // java.util.concurrent.ExecutorService
    public List<Runnable> shutdownNow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("eb98c640", new Object[]{this});
        }
        ReentrantLock reentrantLock = this.mainLock;
        reentrantLock.lock();
        try {
            advanceRunState(536870912);
            interruptWorkers();
            List<Runnable> drainQueue = drainQueue();
            reentrantLock.unlock();
            tryTerminate();
            return drainQueue;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public void terminated() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("32c8c92a", new Object[]{this});
        }
    }

    /* JADX WARN: Finally extract failed */
    public String toString() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        ReentrantLock reentrantLock = this.mainLock;
        reentrantLock.lock();
        try {
            long j = this.completedTaskCount;
            int size = this.workers.size();
            Iterator<Worker> it = this.workers.iterator();
            int i = 0;
            while (it.hasNext()) {
                Worker next = it.next();
                j += next.completedTasks;
                if (next.isLocked()) {
                    i++;
                }
            }
            reentrantLock.unlock();
            int i2 = this.ctl.get();
            if (runStateLessThan(i2, 0)) {
                str = "Running";
            } else if (runStateAtLeast(i2, V_TERMINATED)) {
                str = "Terminated";
            } else {
                str = "Shutting down";
            }
            return super.toString() + "[" + str + ", pool size = " + size + ", active threads = " + i + ", queued tasks = " + this.workQueue.size() + ", completed tasks = " + j + "]";
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final void tryTerminate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e279806d", new Object[]{this});
            return;
        }
        while (true) {
            int i = this.ctl.get();
            if (!isRunning(i) && !runStateAtLeast(i, 1073741824)) {
                if (runStateOf(i) == 0 && !this.workQueue.isEmpty()) {
                    return;
                }
                if (workerCountOf(i) != 0) {
                    interruptIdleWorkers(true);
                    return;
                }
                ReentrantLock reentrantLock = this.mainLock;
                reentrantLock.lock();
                try {
                    if (this.ctl.compareAndSet(i, ctlOf(1073741824, 0))) {
                        terminated();
                        this.ctl.set(ctlOf(V_TERMINATED, 0));
                        this.termination.signalAll();
                        return;
                    }
                } finally {
                    reentrantLock.unlock();
                }
            } else {
                return;
            }
        }
    }

    public VirtualThreadPoolExecutor(int i, int i2, long j, TimeUnit timeUnit, BlockingQueue<Runnable> blockingQueue, ThreadFactory threadFactory) {
        this(i, i2, j, timeUnit, blockingQueue, threadFactory, defaultHandler);
    }

    public VirtualThreadPoolExecutor(int i, int i2, long j, TimeUnit timeUnit, BlockingQueue<Runnable> blockingQueue, VRejectedExecutionHandler vRejectedExecutionHandler) {
        this(i, i2, j, timeUnit, blockingQueue, VirtualExecutors.defaultThreadFactory(), vRejectedExecutionHandler);
    }

    public VirtualThreadPoolExecutor(int i, int i2, long j, TimeUnit timeUnit, BlockingQueue<Runnable> blockingQueue, ThreadFactory threadFactory, VRejectedExecutionHandler vRejectedExecutionHandler) {
        this.ctl = new AtomicInteger(ctlOf(V_RUNNING, 0));
        ReentrantLock reentrantLock = new ReentrantLock();
        this.mainLock = reentrantLock;
        this.workers = new HashSet<>();
        this.idleWorkers = new LinkedBlockingQueue();
        this.workerCount = new AtomicInteger(0);
        this.termination = reentrantLock.newCondition();
        if (i < 0 || i2 <= 0 || i2 < i || j < 0) {
            throw new IllegalArgumentException();
        } else if (blockingQueue == null || threadFactory == null || vRejectedExecutionHandler == null) {
            throw null;
        } else {
            this.corePoolSize = i;
            this.maximumPoolSize = i2;
            this.workQueue = blockingQueue;
            this.keepAliveTime = timeUnit.toNanos(j);
            this.threadFactory = threadFactory;
            this.handler = vRejectedExecutionHandler;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public final class Worker extends AbstractQueuedSynchronizer implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        private static final long serialVersionUID = 6138294804551838833L;
        public volatile long completedTasks;
        public Runnable firstTask;
        public VThread vThread;
        public final Thread virtualThread;

        static {
            t2o.a(969932823);
        }

        public Worker(Runnable runnable) {
            setState(-1);
            this.firstTask = runnable;
            Thread newThread = VirtualThreadPoolExecutor.this.getThreadFactory().newThread(this);
            this.virtualThread = newThread;
            this.vThread = createVirtual(newThread);
        }

        private VThread createVirtual(Thread thread) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (VThread) ipChange.ipc$dispatch("ccbcf616", new Object[]{this, thread});
            }
            if (thread == null) {
                return null;
            }
            if (thread instanceof VirtualThread) {
                return ((VirtualThread) thread).reVirtual(this);
            }
            return new VThread(thread, this);
        }

        public static /* synthetic */ Object ipc$super(Worker worker, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/virtual_thread/VirtualThreadPoolExecutor$Worker");
        }

        public void interruptIfStarted() {
            VThread vThread;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("aed8d88", new Object[]{this});
            } else if (getState() >= 0 && (vThread = this.vThread) != null && !vThread.isInterrupted()) {
                try {
                    vThread.interrupt();
                } catch (SecurityException unused) {
                }
            }
        }

        @Override // java.util.concurrent.locks.AbstractQueuedSynchronizer
        public boolean isHeldExclusively() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("6f849237", new Object[]{this})).booleanValue();
            }
            if (getState() != 0) {
                return true;
            }
            return false;
        }

        public boolean isLocked() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("d4521f5f", new Object[]{this})).booleanValue();
            }
            return isHeldExclusively();
        }

        public void lock() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("71bbbc32", new Object[]{this});
            } else {
                acquire(1);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                VirtualThreadPoolExecutor.this.runWorker(this);
            }
        }

        @Override // java.util.concurrent.locks.AbstractQueuedSynchronizer
        public boolean tryAcquire(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("13289a5", new Object[]{this, new Integer(i)})).booleanValue();
            }
            if (!compareAndSetState(0, 1)) {
                return false;
            }
            setExclusiveOwnerThread(VThread.currentCarrierThread());
            return true;
        }

        public boolean tryLock() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("ca43f711", new Object[]{this})).booleanValue();
            }
            return tryAcquire(1);
        }

        @Override // java.util.concurrent.locks.AbstractQueuedSynchronizer
        public boolean tryRelease(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("99ee9914", new Object[]{this, new Integer(i)})).booleanValue();
            }
            setExclusiveOwnerThread(null);
            setState(0);
            return true;
        }

        public void unlock() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ccb421cb", new Object[]{this});
            } else {
                release(1);
            }
        }

        public Worker(Runnable runnable, Worker worker) {
            setState(-1);
            this.firstTask = runnable;
            Thread thread = worker.virtualThread;
            this.virtualThread = thread;
            this.vThread = createVirtual(thread);
        }
    }

    private void interruptIdleWorkers() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f6cd165", new Object[]{this});
        } else {
            interruptIdleWorkers(false);
        }
    }
}
