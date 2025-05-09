package com.alipay.mobile.common.transport.utils;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class NetworkAsyncTaskExecutor {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final ThreadPoolExecutor f4149a;
    public static final ThreadPoolExecutor b;
    public static final ThreadPoolExecutor c;
    public static final ThreadPoolExecutor d;
    public static final ThreadPoolExecutor e;
    public static final ThreadPoolExecutor f;
    public static final ThreadPoolExecutor g;
    public static final ScheduledThreadPoolExecutor h;
    public static volatile int i = 0;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static class NetworkCallable<V> implements Callable<V> {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public Callable<V> callable;

        public NetworkCallable(Callable<V> callable) {
            this.callable = callable;
        }

        @Override // java.util.concurrent.Callable
        public V call() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (V) ipChange.ipc$dispatch("6d249ded", new Object[]{this});
            }
            int i = -1;
            try {
                try {
                    if (NetworkAsyncTaskExecutor.access$200() >= Integer.MAX_VALUE) {
                        NetworkAsyncTaskExecutor.access$202(0);
                    }
                    i = NetworkAsyncTaskExecutor.access$204();
                    LogCatUtil.debug("NetworkRunnable", "taskId=[" + i + "] start execute. class=[" + this.callable.getClass().getName() + "]");
                    V call = this.callable.call();
                    LogCatUtil.debugOrLose("NetworkRunnable", "taskId=[" + i + "] execute finish.");
                    return call;
                } catch (Exception e) {
                    LogCatUtil.error("NetworkRunnable", "taskId=[" + i + "] call exception. " + e.toString());
                    throw e;
                }
            } catch (Throwable th) {
                LogCatUtil.debugOrLose("NetworkRunnable", "taskId=[" + i + "] execute finish.");
                throw th;
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static class NetworkRunnable implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public Runnable runnable;

        private NetworkRunnable(Runnable runnable) {
            this.runnable = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            StringBuilder sb;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            Thread.currentThread().setPriority(5);
            int i = -1;
            try {
            } catch (Throwable th) {
                try {
                    LogCatUtil.error("NetworkRunnable", "taskId=[-1] run exception. ", th);
                    sb = new StringBuilder("taskId=[");
                } catch (Throwable th2) {
                    LogCatUtil.debugOrLose("NetworkRunnable", "taskId=[-1] execute finish.");
                    throw th2;
                }
            }
            if (this.runnable == null) {
                LogCatUtil.error("NetworkRunnable", " this.runnable is null !");
                LogCatUtil.debugOrLose("NetworkRunnable", "taskId=[-1] execute finish.");
                return;
            }
            if (NetworkAsyncTaskExecutor.access$200() >= Integer.MAX_VALUE) {
                NetworkAsyncTaskExecutor.access$202(0);
            }
            i = NetworkAsyncTaskExecutor.access$204();
            LogCatUtil.debug("NetworkRunnable", "taskId=[" + i + "] start execute. class=[" + this.runnable.getClass().getName() + "]");
            this.runnable.run();
            sb = new StringBuilder("taskId=[");
            sb.append(i);
            sb.append("] execute finish.");
            LogCatUtil.debugOrLose("NetworkRunnable", sb.toString());
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static class NetworkThreadFactory implements ThreadFactory {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public String name;
        public ThreadPoolExecutor threadPoolExecutor;

        public NetworkThreadFactory(String str, ThreadPoolExecutor threadPoolExecutor) {
            this.name = str;
            this.threadPoolExecutor = threadPoolExecutor;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Thread) ipChange.ipc$dispatch("d8079a58", new Object[]{this, runnable});
            }
            StringBuilder sb = new StringBuilder();
            sb.append(this.name);
            if (this.threadPoolExecutor != null) {
                sb.append("#" + (this.threadPoolExecutor.getActiveCount() + 1));
            }
            return new Thread(runnable, sb.toString());
        }
    }

    static {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(7, Integer.MAX_VALUE, 2L, timeUnit, new SynchronousQueue(), new ThreadPoolExecutor.DiscardOldestPolicy());
        f4149a = threadPoolExecutor;
        ThreadPoolExecutor threadPoolExecutor2 = new ThreadPoolExecutor(4, 6, 10L, timeUnit, new LinkedBlockingQueue(60), new ThreadPoolExecutor.DiscardOldestPolicy());
        b = threadPoolExecutor2;
        ThreadPoolExecutor threadPoolExecutor3 = new ThreadPoolExecutor(1, 1, 30L, timeUnit, new LinkedBlockingQueue(60), new ThreadPoolExecutor.DiscardOldestPolicy());
        c = threadPoolExecutor3;
        ThreadPoolExecutor threadPoolExecutor4 = new ThreadPoolExecutor(3, 6, 10L, timeUnit, new LinkedBlockingQueue(60), new ThreadPoolExecutor.DiscardOldestPolicy());
        d = threadPoolExecutor4;
        ThreadPoolExecutor threadPoolExecutor5 = new ThreadPoolExecutor(3, 3, 10L, timeUnit, new LinkedBlockingQueue(60), new ThreadPoolExecutor.DiscardOldestPolicy());
        e = threadPoolExecutor5;
        ThreadPoolExecutor threadPoolExecutor6 = new ThreadPoolExecutor(1, 1, 30L, timeUnit, new LinkedBlockingQueue(60), new ThreadPoolExecutor.DiscardOldestPolicy());
        f = threadPoolExecutor6;
        ThreadPoolExecutor threadPoolExecutor7 = new ThreadPoolExecutor(1, 1, 30L, timeUnit, new LinkedBlockingQueue(60), new ThreadPoolExecutor.DiscardOldestPolicy());
        g = threadPoolExecutor7;
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1);
        h = scheduledThreadPoolExecutor;
        threadPoolExecutor.setThreadFactory(new NetworkThreadFactory("NetworkThread", threadPoolExecutor));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        scheduledThreadPoolExecutor.setThreadFactory(new NetworkThreadFactory("NetworkSchedule", scheduledThreadPoolExecutor));
        scheduledThreadPoolExecutor.setKeepAliveTime(6L, timeUnit);
        scheduledThreadPoolExecutor.allowCoreThreadTimeOut(true);
        threadPoolExecutor3.setThreadFactory(new NetworkThreadFactory("SeriNetworkThread", threadPoolExecutor3));
        threadPoolExecutor3.allowCoreThreadTimeOut(true);
        threadPoolExecutor7.setThreadFactory(new NetworkThreadFactory("HSeriNetworkThread", threadPoolExecutor7));
        threadPoolExecutor7.allowCoreThreadTimeOut(true);
        threadPoolExecutor2.setThreadFactory(new NetworkThreadFactory("IONetworkThread", threadPoolExecutor2));
        threadPoolExecutor2.allowCoreThreadTimeOut(true);
        threadPoolExecutor4.setThreadFactory(new NetworkThreadFactory("LowPriNetworkThread", threadPoolExecutor4));
        threadPoolExecutor4.allowCoreThreadTimeOut(true);
        threadPoolExecutor5.setThreadFactory(new NetworkThreadFactory("LazyNetworkThread", threadPoolExecutor5));
        threadPoolExecutor5.allowCoreThreadTimeOut(true);
        threadPoolExecutor6.setThreadFactory(new NetworkThreadFactory("DispatchNetworkThread", threadPoolExecutor6));
        threadPoolExecutor6.allowCoreThreadTimeOut(true);
    }

    public static /* synthetic */ int access$200() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("26a27dec", new Object[0])).intValue();
        }
        return i;
    }

    public static /* synthetic */ int access$202(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b117655b", new Object[]{new Integer(i2)})).intValue();
        }
        i = i2;
        return i2;
    }

    public static /* synthetic */ int access$204() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("26dadbf0", new Object[0])).intValue();
        }
        int i2 = i + 1;
        i = i2;
        return i2;
    }

    public static final void execute(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1afb0dfa", new Object[]{runnable});
            return;
        }
        try {
            f4149a.execute(new NetworkRunnable(runnable));
        } catch (Throwable th) {
            LogCatUtil.warn("NetworkAsyncTaskExecutor", "execute fail", th);
        }
    }

    public static final void executeDispatch(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac03c394", new Object[]{runnable});
            return;
        }
        try {
            f.execute(new NetworkRunnable(runnable));
        } catch (Throwable th) {
            LogCatUtil.warn("NetworkAsyncTaskExecutor", "executeDispatch fail", th);
        }
    }

    public static final void executeHighSerial(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ea40010", new Object[]{runnable});
            return;
        }
        try {
            g.execute(new NetworkRunnable(runnable));
        } catch (Throwable th) {
            LogCatUtil.warn("NetworkAsyncTaskExecutor", "executeHighSerial fail", th);
        }
    }

    public static final void executeIO(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dbb33be0", new Object[]{runnable});
            return;
        }
        try {
            b.execute(new NetworkRunnable(runnable));
        } catch (Throwable th) {
            LogCatUtil.warn("NetworkAsyncTaskExecutor", "executeIO fail", th);
        }
    }

    public static final void executeLazy(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("33c3570e", new Object[]{runnable});
            return;
        }
        try {
            e.execute(new NetworkRunnable(runnable));
        } catch (Throwable th) {
            LogCatUtil.warn("NetworkAsyncTaskExecutor", "executeLazy fail", th);
        }
    }

    public static final void executeLowPri(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("de336c0d", new Object[]{runnable});
            return;
        }
        try {
            d.execute(new NetworkRunnable(runnable));
        } catch (Throwable th) {
            LogCatUtil.warn("NetworkAsyncTaskExecutor", "executeLowPri fail", th);
        }
    }

    public static final void executeSerial(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("97c5104e", new Object[]{runnable});
            return;
        }
        try {
            c.execute(new NetworkRunnable(runnable));
        } catch (Throwable th) {
            LogCatUtil.warn("NetworkAsyncTaskExecutor", "executeSerial fail", th);
        }
    }

    public static ScheduledFuture<?> schedule(Runnable runnable, long j, TimeUnit timeUnit) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ScheduledFuture) ipChange.ipc$dispatch("7e00205d", new Object[]{runnable, new Long(j), timeUnit}) : h.schedule(new NetworkRunnable(runnable), j, timeUnit);
    }

    public static ScheduledFuture<?> scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ScheduledFuture) ipChange.ipc$dispatch("6d910264", new Object[]{runnable, new Long(j), new Long(j2), timeUnit});
        }
        return h.scheduleAtFixedRate(new NetworkRunnable(runnable), j, j2, timeUnit);
    }

    public static ScheduledFuture<?> scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ScheduledFuture) ipChange.ipc$dispatch("953370c6", new Object[]{runnable, new Long(j), new Long(j2), timeUnit});
        }
        return h.scheduleWithFixedDelay(new NetworkRunnable(runnable), j, j2, timeUnit);
    }

    public static final Future<?> submit(Runnable runnable) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Future) ipChange.ipc$dispatch("b4a21fb3", new Object[]{runnable}) : f4149a.submit(new NetworkRunnable(runnable));
    }

    public static final Future<?> submitLazy(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Future) ipChange.ipc$dispatch("bbcf7947", new Object[]{runnable});
        }
        return e.submit(new NetworkRunnable(runnable));
    }

    public static final Future<?> submitSerial(Runnable runnable) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Future) ipChange.ipc$dispatch("353875c7", new Object[]{runnable}) : c.submit(new NetworkRunnable(runnable));
    }

    public static <V> ScheduledFuture<V> schedule(Callable<V> callable, long j, TimeUnit timeUnit) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ScheduledFuture) ipChange.ipc$dispatch("b810b526", new Object[]{callable, new Long(j), timeUnit}) : h.schedule(new NetworkCallable(callable), j, timeUnit);
    }

    public static <T> Future<T> submit(Callable<T> callable) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Future) ipChange.ipc$dispatch("b2277828", new Object[]{callable}) : f4149a.submit(new NetworkCallable(callable));
    }

    public static <T> Future<T> submitSerial(Callable<T> callable) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Future) ipChange.ipc$dispatch("5f404d94", new Object[]{callable}) : c.submit(new NetworkCallable(callable));
    }
}
