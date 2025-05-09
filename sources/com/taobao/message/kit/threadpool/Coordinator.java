package com.taobao.message.kit.threadpool;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.virtual_thread.face.VExecutors;
import com.taobao.message.kit.util.ConfigUtil;
import com.taobao.message.lab.comfrm.constant.Constants;
import com.taobao.tao.log.TLog;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import tb.qqt;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class Coordinator {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static ExceptionListener exceptionListener;
    private static volatile ExecutorService pool;
    private static volatile ExecutorService singlePool;
    private static String TAG = "Coordinator";
    private static List<CoordinatorThreadSubscriber> threadSubscribers = new CopyOnWriteArrayList();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public interface Action<T> {
        void action(T t);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public interface ExceptionListener {
        void onException(Throwable th);
    }

    static {
        t2o.a(529530959);
    }

    public static /* synthetic */ String access$000() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7022ea09", new Object[0]);
        }
        return TAG;
    }

    public static void addThreadSubscriber(CoordinatorThreadSubscriber coordinatorThreadSubscriber) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("99e4d81a", new Object[]{coordinatorThreadSubscriber});
        } else {
            threadSubscribers.add(coordinatorThreadSubscriber);
        }
    }

    public static ExecutorService createSaturateExecutorService(int i, int i2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ExecutorService) ipChange.ipc$dispatch("e9014cdd", new Object[]{new Integer(i), new Integer(i2)}) : createSaturateExecutorService(i, i2, "AmpSaturativeThread");
    }

    public static ScheduledExecutorService createScheduledExecutorService(int i, final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ScheduledExecutorService) ipChange.ipc$dispatch("885d1d59", new Object[]{new Integer(i), str});
        }
        return VExecutors.newScheduledThreadPool(i, new qqt() { // from class: com.taobao.message.kit.threadpool.Coordinator.3
            public static volatile transient /* synthetic */ IpChange $ipChange;
            private final AtomicInteger mCount = new AtomicInteger(1);

            @Override // tb.qqt
            public String newThreadName() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return (String) ipChange2.ipc$dispatch("57dab4a4", new Object[]{this});
                }
                return str + "-" + this.mCount.getAndIncrement();
            }
        });
    }

    public static ScheduledExecutorService createSingleExecutorService(final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ScheduledExecutorService) ipChange.ipc$dispatch("cc76ed53", new Object[]{str});
        }
        return VExecutors.newSingleThreadScheduledExecutor(new qqt() { // from class: com.taobao.message.kit.threadpool.Coordinator.4
            public static volatile transient /* synthetic */ IpChange $ipChange;
            private final AtomicInteger mCount = new AtomicInteger(1);

            @Override // tb.qqt
            public String newThreadName() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return (String) ipChange2.ipc$dispatch("57dab4a4", new Object[]{this});
                }
                return str + "-" + this.mCount.getAndIncrement();
            }
        });
    }

    public static void doBackGroundSerialTask(BaseRunnable baseRunnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8b60bfe5", new Object[]{baseRunnable});
            return;
        }
        if (singlePool == null) {
            synchronized (SaturativeExecutor.class) {
                try {
                    if (singlePool == null) {
                        singlePool = createSaturateExecutorService(1, 1);
                        setupTimeout(singlePool);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        singlePool.execute(baseRunnable);
    }

    public static void doBackGroundTask(BaseRunnable baseRunnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3bfab091", new Object[]{baseRunnable});
            return;
        }
        if (pool == null) {
            synchronized (SaturativeExecutor.class) {
                try {
                    if (pool == null) {
                        pool = createSaturateExecutorService(4, 8);
                        setupTimeout(pool);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        pool.execute(baseRunnable);
    }

    public static ExceptionListener getExceptionListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ExceptionListener) ipChange.ipc$dispatch("c5fd55cb", new Object[0]);
        }
        return exceptionListener;
    }

    public static Executor getExecutor() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Executor) ipChange.ipc$dispatch("64056156", new Object[0]);
        }
        if (pool == null) {
            synchronized (SaturativeExecutor.class) {
                try {
                    if (pool == null) {
                        pool = createSaturateExecutorService(4, 8);
                        setupTimeout(pool);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return pool;
    }

    public static boolean isUseVThread() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("43ed3e6e", new Object[0])).booleanValue();
        }
        return "1".equals(ConfigUtil.getValue(Constants.OrangeNS.CONTAINER, "messageSdkVThreadV2", "1"));
    }

    public static void removeThreadSubscriber(CoordinatorThreadSubscriber coordinatorThreadSubscriber) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("423da757", new Object[]{coordinatorThreadSubscriber});
        } else {
            threadSubscribers.remove(coordinatorThreadSubscriber);
        }
    }

    public static void setExceptionListener(ExceptionListener exceptionListener2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64b6037f", new Object[]{exceptionListener2});
        } else {
            exceptionListener = exceptionListener2;
        }
    }

    public static boolean setupTimeout(ExecutorService executorService) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c07f2b74", new Object[]{executorService})).booleanValue();
        }
        if (executorService instanceof ThreadPoolExecutor) {
            ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) executorService;
            threadPoolExecutor.setKeepAliveTime(3000L, TimeUnit.MILLISECONDS);
            try {
                threadPoolExecutor.allowCoreThreadTimeOut(true);
            } catch (IllegalArgumentException e) {
                TLog.loge("Coordinator", e.toString());
            }
        }
        return true;
    }

    public static void threadSubscribersIterate(Action<CoordinatorThreadSubscriber> action) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b987f410", new Object[]{action});
        } else if (threadSubscribers.size() != 0) {
            for (CoordinatorThreadSubscriber coordinatorThreadSubscriber : threadSubscribers) {
                action.action(coordinatorThreadSubscriber);
            }
        }
    }

    public static ExecutorService createSaturateExecutorService(int i, int i2, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ExecutorService) ipChange.ipc$dispatch("ada92cd3", new Object[]{new Integer(i), new Integer(i2), str}) : createSaturateExecutorService(i, i2, str, 60);
    }

    public static ExecutorService createSaturateExecutorService(int i, int i2, final String str, int i3) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ExecutorService) ipChange.ipc$dispatch("1efb2340", new Object[]{new Integer(i), new Integer(i2), str, new Integer(i3)}) : VExecutors.getThreadPoolFactory().createExecutorService(i, i2, i3, TimeUnit.SECONDS, new LinkedBlockingQueue(256), new qqt() { // from class: com.taobao.message.kit.threadpool.Coordinator.1
            public static volatile transient /* synthetic */ IpChange $ipChange;
            private final AtomicInteger mCount = new AtomicInteger(1);

            @Override // tb.qqt
            public String newThreadName() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return (String) ipChange2.ipc$dispatch("57dab4a4", new Object[]{this});
                }
                return str + "-" + this.mCount.getAndIncrement();
            }
        }, new ThreadPoolExecutor.DiscardOldestPolicy() { // from class: com.taobao.message.kit.threadpool.Coordinator.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass2 r2, String str2, Object... objArr) {
                if (str2.hashCode() == -1083873583) {
                    super.rejectedExecution((Runnable) objArr[0], (ThreadPoolExecutor) objArr[1]);
                    return null;
                }
                int hashCode = str2.hashCode();
                throw new InstantReloadException("String switch could not find '" + str2 + "' with hashcode " + hashCode + " in com/taobao/message/kit/threadpool/Coordinator$2");
            }

            @Override // java.util.concurrent.ThreadPoolExecutor.DiscardOldestPolicy, java.util.concurrent.RejectedExecutionHandler
            public void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("bf6566d1", new Object[]{this, runnable, threadPoolExecutor});
                    return;
                }
                super.rejectedExecution(runnable, threadPoolExecutor);
                TLog.loge(Coordinator.access$000(), "rejectedExecution write task");
            }
        });
    }

    public static void doBackGroundTask(BaseRunnable baseRunnable, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("435bd853", new Object[]{baseRunnable, new Long(j)});
            return;
        }
        if (pool == null) {
            synchronized (SaturativeExecutor.class) {
                try {
                    if (pool == null) {
                        pool = createSaturateExecutorService(4, 8);
                        setupTimeout(pool);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        pool.execute(baseRunnable);
    }
}
