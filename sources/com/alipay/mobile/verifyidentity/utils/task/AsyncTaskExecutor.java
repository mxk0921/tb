package com.alipay.mobile.verifyidentity.utils.task;

import com.alipay.mobile.verifyidentity.log.LoggerFactory;
import com.alipay.mobile.verifyidentity.log.VITraceLogger;
import com.alipay.mobile.verifyidentity.utils.task.pool.NamedRunnable;
import com.alipay.mobile.verifyidentity.utils.task.transaction.Transaction;
import com.alipay.mobile.verifyidentity.utils.task.transaction.TransactionExecutor;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import tb.f7l;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class AsyncTaskExecutor {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "AsyncTaskExecutor";
    public final ThreadPoolExecutor PARALLEL_EXECUTOR;
    public final ScheduledThreadPoolExecutor SCHEDULED_EXECUTOR;
    public final TransactionExecutor TRANSACTION_EXECUTOR = new TransactionExecutor();

    /* renamed from: a  reason: collision with root package name */
    public static final int f4479a = Runtime.getRuntime().availableProcessors() + 1;
    public static final ThreadFactory b = new ThreadFactory() { // from class: com.alipay.mobile.verifyidentity.utils.task.AsyncTaskExecutor.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final AtomicInteger f4480a = new AtomicInteger(0);

        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(Runnable runnable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Thread) ipChange.ipc$dispatch("d8079a58", new Object[]{this, runnable});
            }
            String str = "AsyncTaskExecutor_thread_" + this.f4480a.incrementAndGet();
            LoggerFactory.getTraceLogger().warn("AsyncTaskExecutor", "ThreadFactory.newThread(" + str + f7l.BRACKET_END_STR);
            return new Thread(runnable, str);
        }
    };
    public static AsyncTaskExecutor INSTANCE = new AsyncTaskExecutor();

    public AsyncTaskExecutor() {
        ThreadFactory threadFactory = b;
        ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) Executors.newCachedThreadPool(threadFactory);
        this.PARALLEL_EXECUTOR = threadPoolExecutor;
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = (ScheduledThreadPoolExecutor) Executors.newScheduledThreadPool(f4479a, threadFactory);
        this.SCHEDULED_EXECUTOR = scheduledThreadPoolExecutor;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        scheduledThreadPoolExecutor.setKeepAliveTime(60L, timeUnit);
        scheduledThreadPoolExecutor.allowCoreThreadTimeOut(true);
        scheduledThreadPoolExecutor.setRejectedExecutionHandler(new ThreadPoolExecutor.CallerRunsPolicy());
        threadPoolExecutor.setKeepAliveTime(5L, timeUnit);
        threadPoolExecutor.setRejectedExecutionHandler(new ThreadPoolExecutor.CallerRunsPolicy());
    }

    public static AsyncTaskExecutor getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AsyncTaskExecutor) ipChange.ipc$dispatch("fa0a43b9", new Object[0]);
        }
        return INSTANCE;
    }

    public String addTransaction(Transaction transaction) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("47b551e6", new Object[]{this, transaction});
        }
        return this.TRANSACTION_EXECUTOR.addTransaction(transaction);
    }

    public void execute(Runnable runnable, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("745a6d44", new Object[]{this, runnable, str});
            return;
        }
        try {
            VITraceLogger traceLogger = LoggerFactory.getTraceLogger();
            traceLogger.verbose("AsyncTaskExecutor", "AsyncTaskExecutor.execute(Runnable, threadName=" + str + f7l.BRACKET_END_STR);
            this.PARALLEL_EXECUTOR.execute(NamedRunnable.TASK_POOL.obtain(runnable, str));
        } catch (Throwable th) {
            VITraceLogger traceLogger2 = LoggerFactory.getTraceLogger();
            traceLogger2.verbose("AsyncTaskExecutor", "asyncTask execute error:" + th.getMessage());
        }
    }

    public final Executor getExecutor() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Executor) ipChange.ipc$dispatch("64056156", new Object[]{this});
        }
        return this.PARALLEL_EXECUTOR;
    }

    public void removeTransaction(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5d931acb", new Object[]{this, str});
        } else {
            this.TRANSACTION_EXECUTOR.removeTransaction(str);
        }
    }

    public ScheduledFuture<?> schedule(Runnable runnable, String str, long j, TimeUnit timeUnit) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ScheduledFuture) ipChange.ipc$dispatch("5a2783d3", new Object[]{this, runnable, str, new Long(j), timeUnit});
        }
        VITraceLogger traceLogger = LoggerFactory.getTraceLogger();
        traceLogger.verbose("AsyncTaskExecutor", "AsyncTaskExecutor.schedule(Runnable, threadName=" + str + f7l.BRACKET_END_STR);
        return this.SCHEDULED_EXECUTOR.schedule(NamedRunnable.TASK_POOL.obtain(runnable, str), j, timeUnit);
    }

    public ScheduledFuture<?> scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ScheduledFuture) ipChange.ipc$dispatch("6d910264", new Object[]{this, runnable, new Long(j), new Long(j2), timeUnit});
        }
        LoggerFactory.getTraceLogger().verbose("AsyncTaskExecutor", "AsyncTaskExecutor.scheduleAtFixedRate(Runnable)");
        return this.SCHEDULED_EXECUTOR.scheduleAtFixedRate(runnable, j, j2, timeUnit);
    }

    public ScheduledFuture<?> scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ScheduledFuture) ipChange.ipc$dispatch("953370c6", new Object[]{this, runnable, new Long(j), new Long(j2), timeUnit});
        }
        return this.SCHEDULED_EXECUTOR.scheduleWithFixedDelay(runnable, j, j2, timeUnit);
    }

    public void shutdown() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b466fdd", new Object[]{this});
            return;
        }
        this.TRANSACTION_EXECUTOR.shutdown();
        this.PARALLEL_EXECUTOR.shutdown();
        this.SCHEDULED_EXECUTOR.shutdown();
    }
}
