package com.alipay.mobile.common.logging.util;

import com.alipay.mobile.common.logging.api.LoggerFactory;
import com.alipay.mobile.common.logging.api.trace.TraceLogger;
import com.alipay.mobile.framework.MpaasClassInfo;
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
@MpaasClassInfo(BundleName = "android-phone-mobilesdk-logging", ExportJarName = "unknown", Level = "lib", Product = ":android-phone-mobilesdk-logging")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class LoggingAsyncTaskExecutor {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final ThreadPoolExecutor f3990a;
    public static final ThreadPoolExecutor b;
    public static final ThreadPoolExecutor c;
    public static final ThreadPoolExecutor d;
    public static final ThreadPoolExecutor e;
    public static final ThreadPoolExecutor f;
    public static final ThreadPoolExecutor g;
    public static final ThreadPoolExecutor h;
    public static final ScheduledThreadPoolExecutor i;
    public static volatile int j = 0;

    /* compiled from: Taobao */
    @MpaasClassInfo(BundleName = "android-phone-mobilesdk-logging", ExportJarName = "unknown", Level = "lib", Product = ":android-phone-mobilesdk-logging")
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static class LoggingThreadFactory implements ThreadFactory {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public String name;
        public ThreadPoolExecutor threadPoolExecutor;

        public LoggingThreadFactory(String str, ThreadPoolExecutor threadPoolExecutor) {
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

    /* compiled from: Taobao */
    @MpaasClassInfo(BundleName = "android-phone-mobilesdk-logging", ExportJarName = "unknown", Level = "lib", Product = ":android-phone-mobilesdk-logging")
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
                if (LoggingAsyncTaskExecutor.access$200() >= Integer.MAX_VALUE) {
                    LoggingAsyncTaskExecutor.access$202(0);
                }
                i = LoggingAsyncTaskExecutor.access$204();
                return this.callable.call();
            } catch (Exception e) {
                TraceLogger traceLogger = LoggerFactory.getTraceLogger();
                traceLogger.error("LoggingAsyncTaskExecutor", "taskId=[" + i + "] call ex:" + e.toString());
                throw e;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* compiled from: Taobao */
    @MpaasClassInfo(BundleName = "android-phone-mobilesdk-logging", ExportJarName = "unknown", Level = "lib", Product = ":android-phone-mobilesdk-logging")
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static class NetworkRunnable implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public Runnable runnable;

        private NetworkRunnable(Runnable runnable) {
            this.runnable = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            int i = -1;
            try {
                if (this.runnable != null) {
                    if (LoggingAsyncTaskExecutor.access$200() >= Integer.MAX_VALUE) {
                        LoggingAsyncTaskExecutor.access$202(0);
                    }
                    i = LoggingAsyncTaskExecutor.access$204();
                    this.runnable.run();
                }
            } catch (Throwable th) {
                TraceLogger traceLogger = LoggerFactory.getTraceLogger();
                traceLogger.error("LoggingAsyncTaskExecutor", "taskId=[" + i + "] run ex:" + th.toString());
            }
        }
    }

    static {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(3, Integer.MAX_VALUE, 6L, timeUnit, new SynchronousQueue(), new ThreadPoolExecutor.DiscardOldestPolicy());
        f3990a = threadPoolExecutor;
        ThreadPoolExecutor threadPoolExecutor2 = new ThreadPoolExecutor(6, 8, 10L, timeUnit, new LinkedBlockingQueue(60), new ThreadPoolExecutor.DiscardOldestPolicy());
        b = threadPoolExecutor2;
        ThreadPoolExecutor threadPoolExecutor3 = new ThreadPoolExecutor(1, 1, 10L, timeUnit, new LinkedBlockingQueue(60), new ThreadPoolExecutor.DiscardOldestPolicy());
        c = threadPoolExecutor3;
        ThreadPoolExecutor threadPoolExecutor4 = new ThreadPoolExecutor(3, 3, 10L, timeUnit, new LinkedBlockingQueue(60), new ThreadPoolExecutor.DiscardOldestPolicy());
        d = threadPoolExecutor4;
        ThreadPoolExecutor threadPoolExecutor5 = new ThreadPoolExecutor(1, 1, 10L, timeUnit, new LinkedBlockingQueue(60), new ThreadPoolExecutor.DiscardOldestPolicy());
        e = threadPoolExecutor5;
        ThreadPoolExecutor threadPoolExecutor6 = new ThreadPoolExecutor(1, 1, 10L, timeUnit, new LinkedBlockingQueue(60), new ThreadPoolExecutor.DiscardOldestPolicy());
        f = threadPoolExecutor6;
        ThreadPoolExecutor threadPoolExecutor7 = new ThreadPoolExecutor(1, 1, 10L, timeUnit, new LinkedBlockingQueue(), new ThreadPoolExecutor.DiscardOldestPolicy());
        g = threadPoolExecutor7;
        ThreadPoolExecutor threadPoolExecutor8 = new ThreadPoolExecutor(1, 1, 10L, timeUnit, new LinkedBlockingQueue(), new ThreadPoolExecutor.DiscardOldestPolicy());
        h = threadPoolExecutor8;
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1);
        i = scheduledThreadPoolExecutor;
        threadPoolExecutor.setThreadFactory(new LoggingThreadFactory("LogThread", threadPoolExecutor));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        scheduledThreadPoolExecutor.setThreadFactory(new LoggingThreadFactory("LogSchedule", scheduledThreadPoolExecutor));
        scheduledThreadPoolExecutor.setKeepAliveTime(6L, timeUnit);
        scheduledThreadPoolExecutor.allowCoreThreadTimeOut(true);
        threadPoolExecutor3.setThreadFactory(new LoggingThreadFactory("SeriLogThread", threadPoolExecutor3));
        threadPoolExecutor3.allowCoreThreadTimeOut(true);
        threadPoolExecutor2.setThreadFactory(new LoggingThreadFactory("IOLogThread", threadPoolExecutor2));
        threadPoolExecutor2.allowCoreThreadTimeOut(true);
        threadPoolExecutor4.setThreadFactory(new LoggingThreadFactory("LowPriLogThread", threadPoolExecutor4));
        threadPoolExecutor4.allowCoreThreadTimeOut(true);
        threadPoolExecutor5.setThreadFactory(new LoggingThreadFactory("DispatchLogThread", threadPoolExecutor5));
        threadPoolExecutor5.allowCoreThreadTimeOut(true);
        threadPoolExecutor6.setThreadFactory(new LoggingThreadFactory("LogAppendDispatchThread", threadPoolExecutor6));
        threadPoolExecutor6.allowCoreThreadTimeOut(true);
        threadPoolExecutor7.setThreadFactory(new LoggingThreadFactory("HttpUpThread", threadPoolExecutor7));
        threadPoolExecutor7.allowCoreThreadTimeOut(true);
        threadPoolExecutor8.setThreadFactory(new LoggingThreadFactory("HttpUpThread2", threadPoolExecutor8));
        threadPoolExecutor8.allowCoreThreadTimeOut(true);
    }

    public static /* synthetic */ int access$200() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("26a27dec", new Object[0])).intValue();
        }
        return j;
    }

    public static /* synthetic */ int access$202(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b117655b", new Object[]{new Integer(i2)})).intValue();
        }
        j = i2;
        return i2;
    }

    public static /* synthetic */ int access$204() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("26dadbf0", new Object[0])).intValue();
        }
        int i2 = j + 1;
        j = i2;
        return i2;
    }

    public static final void execute(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1afb0dfa", new Object[]{runnable});
            return;
        }
        try {
            f3990a.execute(new NetworkRunnable(runnable));
        } catch (Throwable th) {
            TraceLogger traceLogger = LoggerFactory.getTraceLogger();
            traceLogger.error("LoggingAsyncTaskExecutor", "execute e:" + th.toString());
        }
    }

    public static final void executeDispatch(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac03c394", new Object[]{runnable});
            return;
        }
        try {
            e.execute(new NetworkRunnable(runnable));
        } catch (Throwable th) {
            TraceLogger traceLogger = LoggerFactory.getTraceLogger();
            traceLogger.error("LoggingAsyncTaskExecutor", "executeDispatch e:" + th.toString());
        }
    }

    public static final void executeHttpUpload(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91e88d83", new Object[]{runnable});
            return;
        }
        try {
            g.execute(new NetworkRunnable(runnable));
        } catch (Throwable th) {
            TraceLogger traceLogger = LoggerFactory.getTraceLogger();
            traceLogger.error("LoggingAsyncTaskExecutor", "executeHttpUpload e:" + th.toString());
        }
    }

    public static final void executeHttpUpload2(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aea34779", new Object[]{runnable});
            return;
        }
        try {
            h.execute(new NetworkRunnable(runnable));
        } catch (Throwable th) {
            TraceLogger traceLogger = LoggerFactory.getTraceLogger();
            traceLogger.error("LoggingAsyncTaskExecutor", "executeHttpUpload2 e:" + th.toString());
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
            TraceLogger traceLogger = LoggerFactory.getTraceLogger();
            traceLogger.error("LoggingAsyncTaskExecutor", "executeIO e:" + th.toString());
        }
    }

    public static final void executeLogAppendDispatch(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f94213a8", new Object[]{runnable});
            return;
        }
        try {
            f.execute(new NetworkRunnable(runnable));
        } catch (Throwable th) {
            TraceLogger traceLogger = LoggerFactory.getTraceLogger();
            traceLogger.error("LoggingAsyncTaskExecutor", "executeLogAppendDispatch e:" + th.toString());
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
            TraceLogger traceLogger = LoggerFactory.getTraceLogger();
            traceLogger.error("LoggingAsyncTaskExecutor", "executeLowPri e:" + th.toString());
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
            TraceLogger traceLogger = LoggerFactory.getTraceLogger();
            traceLogger.error("LoggingAsyncTaskExecutor", "executeSerial e:" + th.toString());
        }
    }

    public static ScheduledFuture<?> schedule(Runnable runnable, long j2, TimeUnit timeUnit) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ScheduledFuture) ipChange.ipc$dispatch("7e00205d", new Object[]{runnable, new Long(j2), timeUnit}) : i.schedule(new NetworkRunnable(runnable), j2, timeUnit);
    }

    public static ScheduledFuture<?> scheduleAtFixedRate(Runnable runnable, long j2, long j3, TimeUnit timeUnit) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ScheduledFuture) ipChange.ipc$dispatch("6d910264", new Object[]{runnable, new Long(j2), new Long(j3), timeUnit});
        }
        return i.scheduleAtFixedRate(new NetworkRunnable(runnable), j2, j3, timeUnit);
    }

    public static ScheduledFuture<?> scheduleWithFixedDelay(Runnable runnable, long j2, long j3, TimeUnit timeUnit) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ScheduledFuture) ipChange.ipc$dispatch("953370c6", new Object[]{runnable, new Long(j2), new Long(j3), timeUnit});
        }
        return i.scheduleWithFixedDelay(new NetworkRunnable(runnable), j2, j3, timeUnit);
    }

    public static final Future<?> submit(Runnable runnable) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Future) ipChange.ipc$dispatch("b4a21fb3", new Object[]{runnable}) : f3990a.submit(new NetworkRunnable(runnable));
    }

    public static final Future<?> submitSerial(Runnable runnable) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Future) ipChange.ipc$dispatch("353875c7", new Object[]{runnable}) : c.submit(new NetworkRunnable(runnable));
    }

    public static <V> ScheduledFuture<V> schedule(Callable<V> callable, long j2, TimeUnit timeUnit) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ScheduledFuture) ipChange.ipc$dispatch("b810b526", new Object[]{callable, new Long(j2), timeUnit}) : i.schedule(new NetworkCallable(callable), j2, timeUnit);
    }

    public static <T> Future<T> submit(Callable<T> callable) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Future) ipChange.ipc$dispatch("b2277828", new Object[]{callable}) : f3990a.submit(new NetworkCallable(callable));
    }

    public static <T> Future<T> submitSerial(Callable<T> callable) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Future) ipChange.ipc$dispatch("5f404d94", new Object[]{callable}) : c.submit(new NetworkCallable(callable));
    }
}
