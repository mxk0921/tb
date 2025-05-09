package anet.channel.thread;

import anet.channel.AwcnConfig;
import anet.channel.status.NetworkFullLowLatency;
import anet.channel.util.ALog;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.virtual_thread.face.VExecutors;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import tb.qqt;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class ThreadPoolExecutorFactory {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "awcn.ThreadPoolExecutorFactory";
    private static ThreadPoolExecutor callbackExecutor;
    private static ThreadPoolExecutor cookieMonitorExecutor;
    private static ThreadPoolExecutor detectExecutor;
    private static ThreadPoolExecutor downloaderExecutor;
    private static ThreadPoolExecutor horseRaceExecutor;
    private static ThreadPoolExecutor lowExecutor;
    private static ThreadPoolExecutor midExecutor;
    private static ThreadPoolExecutor priorityRequestExecutor;
    private static ThreadPoolExecutor requestMonitorExecutor;
    private static ScheduledThreadPoolExecutor scheduledExecutor;
    private static ThreadPoolExecutor highExecutor = null;
    private static ThreadPoolExecutor backupExecutor = null;
    public static int highExecutorCount = 2;
    public static int backupExecutorCount = 32;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class ComparableTask implements Runnable, Comparable<ComparableTask> {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public long createTime;
        public int priority;
        public Runnable rawTask;

        static {
            t2o.a(607125921);
        }

        public ComparableTask(Runnable runnable, int i) {
            this.rawTask = null;
            this.priority = 0;
            this.createTime = System.currentTimeMillis();
            this.rawTask = runnable;
            this.priority = i;
            this.createTime = System.currentTimeMillis();
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                this.rawTask.run();
            }
        }

        public int compareTo(ComparableTask comparableTask) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("58109fd1", new Object[]{this, comparableTask})).intValue();
            }
            int i = this.priority;
            int i2 = comparableTask.priority;
            return i != i2 ? i - i2 : (int) (this.createTime - comparableTask.createTime);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class Priority {
        public static int HIGH = 0;
        public static int NORMAL = 1;
        public static int LOW = 9;

        static {
            t2o.a(607125923);
        }
    }

    static {
        t2o.a(607125919);
        scheduledExecutor = null;
        midExecutor = null;
        lowExecutor = null;
        detectExecutor = null;
        horseRaceExecutor = null;
        cookieMonitorExecutor = null;
        requestMonitorExecutor = null;
        callbackExecutor = null;
        priorityRequestExecutor = null;
        downloaderExecutor = null;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        midExecutor = new PriorityExecutor(16, 16, 60L, timeUnit, new PriorityBlockingQueue(), new Factory("AWCN Worker(M)"));
        priorityRequestExecutor = new PriorityExecutor(1, 1, 3L, timeUnit, new PriorityBlockingQueue(), new Factory("AWCN Worker(QoS)"));
        if (!AwcnConfig.isUseVirtualThread()) {
            threadInit();
        } else {
            try {
                scheduledExecutor = (ScheduledThreadPoolExecutor) VExecutors.newScheduledThreadPool(1, setThreadNameFactory("AWCN Scheduler"));
                lowExecutor = newFixedThreadPool(2, 60L, setThreadNameFactory("AWCN Worker(L)"));
                detectExecutor = newFixedThreadPool(1, 30L, setThreadNameFactory("AWCN Detector"));
                horseRaceExecutor = newFixedThreadPool(1, 30L, setThreadNameFactory("AWCN HR"));
                cookieMonitorExecutor = newFixedThreadPool(1, 30L, setThreadNameFactory("AWCN Cookie"));
                requestMonitorExecutor = newFixedThreadPool(1, 30L, setThreadNameFactory("AWCN Monitor"));
                callbackExecutor = newFixedThreadPool(1, 60L, setThreadNameFactory("AWCN Callback"));
                downloaderExecutor = newFixedThreadPool(1, 5L, setThreadNameFactory("AWCN Worker(ZstdDict)"));
            } catch (Exception e) {
                ALog.e(TAG, "VExecutors thread created fail!  error=" + e.toString(), null, new Object[0]);
                threadInit();
            }
        }
        midExecutor.allowCoreThreadTimeOut(true);
        lowExecutor.allowCoreThreadTimeOut(true);
        detectExecutor.allowCoreThreadTimeOut(true);
        horseRaceExecutor.allowCoreThreadTimeOut(true);
        cookieMonitorExecutor.allowCoreThreadTimeOut(true);
        requestMonitorExecutor.allowCoreThreadTimeOut(true);
        callbackExecutor.allowCoreThreadTimeOut(true);
        priorityRequestExecutor.allowCoreThreadTimeOut(true);
        downloaderExecutor.allowCoreThreadTimeOut(true);
    }

    public static void initScheduledPingExecutor() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("101cee09", new Object[0]);
            return;
        }
        if (!AwcnConfig.isUseVirtualThread()) {
            NetworkFullLowLatency.scheduledPingExecutor = new ScheduledThreadPoolExecutor(1, new Factory("AWCN Ping"));
        } else {
            NetworkFullLowLatency.scheduledPingExecutor = (ScheduledThreadPoolExecutor) VExecutors.newScheduledThreadPool(1, setThreadNameFactory("AWCN Ping"));
        }
        NetworkFullLowLatency.scheduledPingExecutor.allowCoreThreadTimeOut(true);
    }

    private static ThreadPoolExecutor newFixedThreadPool(int i, long j, qqt qqtVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ThreadPoolExecutor) ipChange.ipc$dispatch("c59eed70", new Object[]{new Integer(i), new Long(j), qqtVar});
        }
        return (ThreadPoolExecutor) VExecutors.getThreadPoolFactory().createExecutorService(i, i, j, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), qqtVar, new ThreadPoolExecutor.AbortPolicy());
    }

    private static ThreadPoolExecutor newPriorityThreadPool(int i, long j, qqt qqtVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ThreadPoolExecutor) ipChange.ipc$dispatch("11ec3720", new Object[]{new Integer(i), new Long(j), qqtVar});
        }
        return (ThreadPoolExecutor) VExecutors.getThreadPoolFactory().createExecutorService(i, i, j, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), qqtVar, new ThreadPoolExecutor.AbortPolicy());
    }

    public static ScheduledThreadPoolExecutor newScheduledThreadPool(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ScheduledThreadPoolExecutor) ipChange.ipc$dispatch("3ebaae4", new Object[]{new Integer(i), str});
        }
        return (ScheduledThreadPoolExecutor) VExecutors.newScheduledThreadPool(i, setThreadNameFactory(str));
    }

    public static void removeScheduleTask(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a90a84e5", new Object[]{runnable});
        } else {
            scheduledExecutor.remove(runnable);
        }
    }

    public static synchronized void setNormalExecutorPoolSize(int i) {
        synchronized (ThreadPoolExecutorFactory.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d3cfbcc3", new Object[]{new Integer(i)});
                return;
            }
            if (i < 6) {
                i = 6;
            }
            midExecutor.setCorePoolSize(i);
            midExecutor.setMaximumPoolSize(i);
        }
    }

    private static qqt setThreadNameFactory(final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (qqt) ipChange.ipc$dispatch("bf4deb40", new Object[]{str});
        }
        return new qqt() { // from class: anet.channel.thread.ThreadPoolExecutorFactory.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.qqt
            public String newThreadName() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return (String) ipChange2.ipc$dispatch("57dab4a4", new Object[]{this});
                }
                return str;
            }
        };
    }

    public static Future<?> submitBackupTask(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Future) ipChange.ipc$dispatch("f62dc6ba", new Object[]{runnable});
        }
        initBackupExecutor();
        return backupExecutor.submit(runnable);
    }

    public static Future<?> submitCookieMonitor(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Future) ipChange.ipc$dispatch("3e8f1b9", new Object[]{runnable});
        }
        return cookieMonitorExecutor.submit(runnable);
    }

    public static Future<?> submitDetectTask(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Future) ipChange.ipc$dispatch("b823609b", new Object[]{runnable});
        }
        return detectExecutor.submit(runnable);
    }

    public static Future<?> submitDownloaderExecutorTask(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Future) ipChange.ipc$dispatch("71c77e20", new Object[]{runnable});
        }
        return downloaderExecutor.submit(runnable);
    }

    public static Future<?> submitHRTask(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Future) ipChange.ipc$dispatch("36bfa1e2", new Object[]{runnable});
        }
        return horseRaceExecutor.submit(runnable);
    }

    public static Future<?> submitPriorityTaskEx(Runnable runnable, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Future) ipChange.ipc$dispatch("7dd83b20", new Object[]{runnable, new Integer(i)});
        }
        return priorityRequestExecutor.submit(new ComparableTask(runnable, i));
    }

    public static Future<?> submitRequestMonitorTask(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Future) ipChange.ipc$dispatch("5c841dc3", new Object[]{runnable});
        }
        return requestMonitorExecutor.submit(runnable);
    }

    public static Future<?> submitScheduledTask(Runnable runnable) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Future) ipChange.ipc$dispatch("faf62535", new Object[]{runnable}) : scheduledExecutor.submit(runnable);
    }

    public static Future<?> submitSessionCallbackTask(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Future) ipChange.ipc$dispatch("5207fd83", new Object[]{runnable});
        }
        return callbackExecutor.submit(runnable);
    }

    private static void threadInit() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f767a9c1", new Object[0]);
            return;
        }
        scheduledExecutor = new ScheduledThreadPoolExecutor(1, new Factory("AWCN Scheduler"));
        TimeUnit timeUnit = TimeUnit.SECONDS;
        lowExecutor = new ThreadPoolExecutor(2, 2, 60L, timeUnit, new LinkedBlockingDeque(), new Factory("AWCN Worker(L)"));
        detectExecutor = new ThreadPoolExecutor(1, 1, 30L, timeUnit, new LinkedBlockingDeque(), new Factory("AWCN Detector"));
        horseRaceExecutor = new ThreadPoolExecutor(1, 1, 30L, timeUnit, new LinkedBlockingDeque(), new Factory("AWCN HR"));
        cookieMonitorExecutor = new ThreadPoolExecutor(1, 1, 30L, timeUnit, new LinkedBlockingDeque(), new Factory("AWCN Cookie"));
        requestMonitorExecutor = new ThreadPoolExecutor(1, 1, 30L, timeUnit, new LinkedBlockingDeque(), new Factory("AWCN Monitor"));
        callbackExecutor = new ThreadPoolExecutor(1, 1, 60L, timeUnit, new LinkedBlockingDeque(), new Factory("AWCN Callback"));
        downloaderExecutor = new ThreadPoolExecutor(1, 1, 5L, timeUnit, new LinkedBlockingDeque(), new Factory("AWCN Worker(ZstdDict)"));
    }

    public static Future<?> submitScheduledTask(Runnable runnable, long j, TimeUnit timeUnit) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Future) ipChange.ipc$dispatch("890ac029", new Object[]{runnable, new Long(j), timeUnit}) : scheduledExecutor.schedule(runnable, j, timeUnit);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class Factory implements ThreadFactory {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public String name;
        public AtomicInteger seq = new AtomicInteger(0);

        static {
            t2o.a(607125922);
        }

        public Factory(String str) {
            this.name = str;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Thread) ipChange.ipc$dispatch("d8079a58", new Object[]{this, runnable});
            }
            Thread thread = new Thread(runnable, this.name + this.seq.incrementAndGet());
            ALog.i(ThreadPoolExecutorFactory.TAG, "thread created!", null, "name", thread.getName());
            thread.setPriority(5);
            return thread;
        }
    }

    public static synchronized void initBackupExecutor() {
        synchronized (ThreadPoolExecutorFactory.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("30780fec", new Object[0]);
            } else if (backupExecutor == null) {
                int i = 32;
                if (AwcnConfig.getWaitThreadCount() < 32) {
                    i = 32 - AwcnConfig.getWaitThreadCount();
                }
                backupExecutorCount = i;
                if (!AwcnConfig.isUseVirtualThread()) {
                    int i2 = backupExecutorCount;
                    backupExecutor = new ThreadPoolExecutor(i2, i2, 60L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new Factory("AWCN Worker(Backup)"));
                } else {
                    int i3 = backupExecutorCount;
                    backupExecutor = newFixedThreadPool(i3, i3, setThreadNameFactory("AWCN Worker(Backup)"));
                }
                backupExecutor.allowCoreThreadTimeOut(true);
                ALog.e(TAG, "initBackupExecutor!!", null, "backupExecutor", backupExecutor);
            }
        }
    }

    public static synchronized void initHighExecutor() {
        synchronized (ThreadPoolExecutorFactory.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6a6933cc", new Object[0]);
            } else if (highExecutor == null) {
                highExecutorCount = AwcnConfig.getWaitThreadCount();
                if (!AwcnConfig.isUseVirtualThread()) {
                    int i = highExecutorCount;
                    highExecutor = new ThreadPoolExecutor(i, i, 60L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new Factory("AWCN Worker(H)"));
                } else {
                    highExecutor = newFixedThreadPool(highExecutorCount, 60L, setThreadNameFactory("AWCN Worker(H)"));
                }
                highExecutor.allowCoreThreadTimeOut(true);
                ALog.e(TAG, "initHighExecutor!!", null, "highExecutorCount", Integer.valueOf(highExecutorCount));
            }
        }
    }

    public static Future<?> submitPriorityTask(Runnable runnable, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Future) ipChange.ipc$dispatch("93a8b1d3", new Object[]{runnable, new Integer(i)});
        }
        if (ALog.isPrintLog(1)) {
            ALog.d(TAG, "submit priority task", null, "priority", Integer.valueOf(i));
        }
        if (i < Priority.HIGH || i > Priority.LOW) {
            i = Priority.LOW;
        }
        if (i == Priority.HIGH) {
            initHighExecutor();
            return highExecutor.submit(runnable);
        } else if (i == Priority.LOW) {
            return lowExecutor.submit(runnable);
        } else {
            return midExecutor.submit(new ComparableTask(runnable, i));
        }
    }
}
