package com.alipay.android.msp.framework.taskscheduler;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.text.TextUtils;
import com.alipay.android.app.safepaylogv2.api.StatisticCollector;
import com.alipay.android.msp.framework.statisticsv2.value.ErrorType;
import com.alipay.android.msp.utils.LogUtil;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class TaskHelper {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static volatile TaskHelper b;
    public static ThreadPoolExecutor c;
    public static ThreadPoolExecutor g;
    public static final ThreadPoolExecutor h;
    public static final ThreadPoolExecutor j;

    /* renamed from: a  reason: collision with root package name */
    public final Handler f3676a = new SafeHandler(Looper.getMainLooper());
    public static final ConcurrentHashMap<String, Handler> d = new ConcurrentHashMap<>();
    public static final Object e = new Object();
    public static final RejectedExecutionHandler f = new RejectedExecutionHandler() { // from class: com.alipay.android.msp.framework.taskscheduler.TaskHelper.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // java.util.concurrent.RejectedExecutionHandler
        public void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("bf6566d1", new Object[]{this, runnable, threadPoolExecutor});
                return;
            }
            LogUtil.record(8, "TaskHelper:rejectedExecution", "coreSize=" + threadPoolExecutor.getCorePoolSize() + " activeCnt=" + threadPoolExecutor.getActiveCount() + " poolSize=" + threadPoolExecutor.getPoolSize());
            StatisticCollector.addError(StatisticCollector.GLOBAL_AGENT, "np", "ThreadPoolFull", "executorPool");
            synchronized (this) {
                try {
                    if (TaskHelper.access$000() == null) {
                        TaskHelper.access$002(new ThreadPoolExecutor(2, 2, 2L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactory() { // from class: com.alipay.android.msp.framework.taskscheduler.TaskHelper.1.1
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // java.util.concurrent.ThreadFactory
                            public Thread newThread(Runnable runnable2) {
                                IpChange ipChange2 = $ipChange;
                                if (ipChange2 instanceof IpChange) {
                                    return (Thread) ipChange2.ipc$dispatch("d8079a58", new Object[]{this, runnable2});
                                }
                                return new Thread(runnable2, "MspTaskHelper BP#" + System.currentTimeMillis());
                            }
                        }));
                        TaskHelper.access$000().allowCoreThreadTimeOut(true);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            TaskHelper.access$000().execute(runnable);
        }
    };
    public static int MAXIMUM_POOL_SIZE = 32;
    public static final ScheduledThreadPoolExecutor i = new ScheduledThreadPoolExecutor(2, new ThreadFactory() { // from class: com.alipay.android.msp.framework.taskscheduler.TaskHelper.5
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final AtomicInteger f3679a = new AtomicInteger(1);

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Thread) ipChange.ipc$dispatch("d8079a58", new Object[]{this, runnable});
            }
            return new Thread(runnable, "MspDelayThread #" + this.f3679a.getAndIncrement());
        }
    });

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public interface ThreadName {
        public static final String EventAction = "eventAction";
        public static final String UI_ACTIVITY = "uiActivity";
        public static final String UI_CONTEXT = "uiMspContext";
        public static final String UI_PAD = "uiPad";

        /* compiled from: Taobao */
        @Retention(RetentionPolicy.SOURCE)
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
        public @interface MspBziThreadName {
        }
    }

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(2, 2, 1L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new ThreadFactory() { // from class: com.alipay.android.msp.framework.taskscheduler.TaskHelper.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final AtomicInteger f3678a = new AtomicInteger(1);

            @Override // java.util.concurrent.ThreadFactory
            public Thread newThread(Runnable runnable) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (Thread) ipChange.ipc$dispatch("d8079a58", new Object[]{this, runnable});
                }
                return new Thread(runnable, "MspAIThread #" + this.f3678a.getAndIncrement());
            }
        }, new RejectedExecutionHandler() { // from class: com.alipay.android.msp.framework.taskscheduler.TaskHelper.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.util.concurrent.RejectedExecutionHandler
            public void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor2) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("bf6566d1", new Object[]{this, runnable, threadPoolExecutor2});
                    return;
                }
                LogUtil.record(8, "MspAIThread:rejectedExecution", "coreSize=" + threadPoolExecutor2.getCorePoolSize() + " activeCnt=" + threadPoolExecutor2.getActiveCount() + " poolSize=" + threadPoolExecutor2.getPoolSize());
                StatisticCollector.addError(StatisticCollector.GLOBAL_AGENT, ErrorType.DEFAULT, "ThreadPoolFull", "aiPool");
            }
        });
        h = threadPoolExecutor;
        ThreadPoolExecutor threadPoolExecutor2 = new ThreadPoolExecutor(1, 1, 1L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), new ThreadFactory() { // from class: com.alipay.android.msp.framework.taskscheduler.TaskHelper.6
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final AtomicInteger f3680a = new AtomicInteger(1);

            @Override // java.util.concurrent.ThreadFactory
            public Thread newThread(Runnable runnable) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (Thread) ipChange.ipc$dispatch("d8079a58", new Object[]{this, runnable});
                }
                return new Thread(runnable, "MspFixNumThread #" + this.f3680a.getAndIncrement());
            }
        });
        j = threadPoolExecutor2;
        try {
            ThreadPoolExecutor threadPoolExecutor3 = g;
            if (threadPoolExecutor3 != null) {
                threadPoolExecutor3.allowCoreThreadTimeOut(true);
            }
            threadPoolExecutor.allowCoreThreadTimeOut(true);
            threadPoolExecutor2.allowCoreThreadTimeOut(true);
        } catch (Throwable th) {
            LogUtil.printExceptionStackTrace(th);
        }
    }

    public static Handler a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Handler) ipChange.ipc$dispatch("b501270f", new Object[]{str});
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        ConcurrentHashMap<String, Handler> concurrentHashMap = d;
        Handler handler = concurrentHashMap.get(str);
        if (handler != null) {
            return handler;
        }
        synchronized (e) {
            try {
                if (!concurrentHashMap.containsKey(str)) {
                    HandlerThread handlerThread = new HandlerThread(str);
                    handlerThread.start();
                    concurrentHashMap.put(str, new Handler(handlerThread.getLooper()));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return concurrentHashMap.get(str);
    }

    public static /* synthetic */ ThreadPoolExecutor access$000() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ThreadPoolExecutor) ipChange.ipc$dispatch("b81d9757", new Object[0]);
        }
        return c;
    }

    public static /* synthetic */ ThreadPoolExecutor access$002(ThreadPoolExecutor threadPoolExecutor) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ThreadPoolExecutor) ipChange.ipc$dispatch("cff2d537", new Object[]{threadPoolExecutor});
        }
        c = threadPoolExecutor;
        return threadPoolExecutor;
    }

    public static ThreadPoolExecutor b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ThreadPoolExecutor) ipChange.ipc$dispatch("7c3c4f38", new Object[0]);
        }
        if (g == null) {
            synchronized (TaskHelper.class) {
                try {
                    if (g == null) {
                        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(4, MAXIMUM_POOL_SIZE, 2L, TimeUnit.SECONDS, new SynchronousQueue(), new ThreadFactory() { // from class: com.alipay.android.msp.framework.taskscheduler.TaskHelper.2
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            /* renamed from: a  reason: collision with root package name */
                            public final AtomicInteger f3677a = new AtomicInteger(1);

                            @Override // java.util.concurrent.ThreadFactory
                            public Thread newThread(Runnable runnable) {
                                IpChange ipChange2 = $ipChange;
                                if (ipChange2 instanceof IpChange) {
                                    return (Thread) ipChange2.ipc$dispatch("d8079a58", new Object[]{this, runnable});
                                }
                                LogUtil.record(8, "TaskHelper:new create", "coreSize=4 kat=2");
                                return new Thread(runnable, "MspTaskHelper NEW #" + this.f3677a.getAndIncrement());
                            }
                        }, f);
                        g = threadPoolExecutor;
                        threadPoolExecutor.allowCoreThreadTimeOut(true);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return g;
    }

    public static void execute(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1afb0dfa", new Object[]{runnable});
        } else {
            b().execute(runnable);
        }
    }

    public static void executeCursur(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d3f926a", new Object[]{runnable});
        } else {
            j.execute(runnable);
        }
    }

    public static void executeForAI(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("29f4f1c1", new Object[]{runnable});
        } else {
            h.execute(runnable);
        }
    }

    public static TaskHelper getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TaskHelper) ipChange.ipc$dispatch("9b0b764a", new Object[0]);
        }
        if (b == null) {
            synchronized (TaskHelper.class) {
                try {
                    if (b == null) {
                        b = new TaskHelper();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return b;
    }

    public static boolean isMainThread() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("83ffd3f8", new Object[0])).booleanValue();
        }
        if (Thread.currentThread() == getInstance().f3676a.getLooper().getThread()) {
            return true;
        }
        return false;
    }

    public static Handler provideMainHandler() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Handler) ipChange.ipc$dispatch("5a4fb6ef", new Object[0]);
        }
        return getInstance().f3676a;
    }

    public static void runOnUIThread(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f52770d", new Object[]{runnable});
        } else {
            getInstance().f3676a.post(runnable);
        }
    }

    public static void runOnUIThreadAsFast(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94cf02db", new Object[]{runnable});
        } else if (isMainThread()) {
            runnable.run();
        } else {
            getInstance().f3676a.post(runnable);
        }
    }

    public static <V> Future<V> submitTask(Callable<V> callable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Future) ipChange.ipc$dispatch("668d79e3", new Object[]{callable});
        }
        return b().submit(callable);
    }

    public void executeDelayed(Runnable runnable, long j2, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2603a39c", new Object[]{this, runnable, new Long(j2), str});
            return;
        }
        try {
            getInstance();
            Handler a2 = a(str);
            if (a2 == null) {
                LogUtil.record(8, "TaskHelper:execute", "handler null : ".concat(String.valueOf(str)));
            } else {
                a2.postDelayed(new MonitorRunnable(runnable, j2), j2);
            }
        } catch (Throwable th) {
            LogUtil.printExceptionStackTrace(th);
        }
    }

    public static void execute(Runnable runnable, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4467280a", new Object[]{runnable, new Long(j2)});
        } else if (!(runnable instanceof MonitorRunnable)) {
            i.schedule(new MonitorRunnable(runnable, j2), j2, TimeUnit.MILLISECONDS);
        } else {
            i.schedule(runnable, j2, TimeUnit.MILLISECONDS);
        }
    }

    public static void runOnUIThread(Runnable runnable, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9afd1d67", new Object[]{runnable, new Boolean(z)});
        } else if (!z) {
            getInstance().f3676a.post(runnable);
        } else if (isMainThread()) {
            runnable.run();
        } else {
            getInstance().f3676a.postAtFrontOfQueue(runnable);
        }
    }

    public static void runOnUIThread(Runnable runnable, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9afce157", new Object[]{runnable, new Long(j2)});
        } else {
            getInstance().f3676a.postDelayed(runnable, j2);
        }
    }
}
