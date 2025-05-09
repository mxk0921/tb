package com.taobao.login4android.api;

import android.os.Looper;
import android.os.Process;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.Field;
import java.util.Comparator;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class Coordinator {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final int CORE_POOL_SIZE = 4;
    private static final int KEEP_ALIVE = 4;
    private static final int MAXIMUM_POOL_SIZE = 32;
    public static final int QUEUE_PRIORITY_NORMAL = 30;
    public static final String TAG = "Coordinator";
    public static final BlockingQueue<Runnable> mPoolWorkQueue;
    private static final ThreadFactory sThreadFactory;
    public static CoordThreadPoolExecutor sThreadPoolExecutor;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class CoordThreadPoolExecutor extends ThreadPoolExecutor {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(512753668);
        }

        public CoordThreadPoolExecutor(int i, int i2, long j, TimeUnit timeUnit, BlockingQueue<Runnable> blockingQueue, ThreadFactory threadFactory, RejectedExecutionHandler rejectedExecutionHandler) {
            super(i, i2, j, timeUnit, blockingQueue, threadFactory, rejectedExecutionHandler);
            try {
                allowCoreThreadTimeOut(true);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }

        public static /* synthetic */ Object ipc$super(CoordThreadPoolExecutor coordThreadPoolExecutor, String str, Object... objArr) {
            int hashCode = str.hashCode();
            if (hashCode == 452660730) {
                super.execute((Runnable) objArr[0]);
                return null;
            } else if (hashCode == 1173060588) {
                super.beforeExecute((Thread) objArr[0], (Runnable) objArr[1]);
                return null;
            } else if (hashCode == 1179322935) {
                super.afterExecute((Runnable) objArr[0], (Throwable) objArr[1]);
                return null;
            } else {
                int hashCode2 = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/login4android/api/Coordinator$CoordThreadPoolExecutor");
            }
        }

        @Override // java.util.concurrent.ThreadPoolExecutor
        public void afterExecute(Runnable runnable, Throwable th) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("464b0a37", new Object[]{this, runnable, th});
            } else {
                super.afterExecute(runnable, th);
            }
        }

        @Override // java.util.concurrent.ThreadPoolExecutor
        public void beforeExecute(Thread thread, Runnable runnable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("45eb7bec", new Object[]{this, thread, runnable});
                return;
            }
            super.beforeExecute(thread, runnable);
            if (runnable instanceof StandaloneTask) {
                thread.setName(((StandaloneTask) runnable).mRunnable + "");
                return;
            }
            thread.setName(runnable + "");
        }

        public void execute(Runnable runnable, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("44672449", new Object[]{this, runnable, new Integer(i)});
                return;
            }
            try {
                if (runnable instanceof StandaloneTask) {
                    super.execute(runnable);
                } else {
                    StandaloneTask standaloneTask = new StandaloneTask(runnable);
                    if (i < 1) {
                        i = 1;
                    }
                    standaloneTask.mPriorityQueue = i;
                    super.execute(standaloneTask);
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class PriorityComparator<Runnable> implements Comparator<Runnable> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(512753670);
        }

        @Override // java.util.Comparator
        public int compare(Runnable runnable, Runnable runnable2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("6a9be197", new Object[]{this, runnable, runnable2})).intValue();
            }
            if ((runnable instanceof StandaloneTask) && (runnable2 instanceof StandaloneTask)) {
                StandaloneTask standaloneTask = (StandaloneTask) runnable;
                StandaloneTask standaloneTask2 = (StandaloneTask) runnable2;
                if (standaloneTask.getQueuePriority() > standaloneTask2.getQueuePriority()) {
                    return 1;
                }
                if (standaloneTask.getQueuePriority() < standaloneTask2.getQueuePriority()) {
                    return -1;
                }
            }
            return 0;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public interface PriorityQueue {
        int getQueuePriority();
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class StandaloneTask implements Runnable, PriorityQueue {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public int mPriorityQueue = 30;
        public final Runnable mRunnable;

        static {
            t2o.a(512753672);
            t2o.a(512753671);
        }

        public StandaloneTask(Runnable runnable) {
            this.mRunnable = runnable;
        }

        @Override // com.taobao.login4android.api.Coordinator.PriorityQueue
        public int getQueuePriority() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("c0056f19", new Object[]{this})).intValue();
            }
            Runnable runnable = this.mRunnable;
            if (runnable instanceof PriorityQueue) {
                return ((PriorityQueue) runnable).getQueuePriority();
            }
            return this.mPriorityQueue;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                Coordinator.runWithTiming(this.mRunnable);
            }
        }
    }

    static {
        t2o.a(512753666);
        PriorityBlockingQueue priorityBlockingQueue = new PriorityBlockingQueue(100, new PriorityComparator());
        mPoolWorkQueue = priorityBlockingQueue;
        ThreadFactory threadFactory = new ThreadFactory() { // from class: com.taobao.login4android.api.Coordinator.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.util.concurrent.ThreadFactory
            public Thread newThread(Runnable runnable) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (Thread) ipChange.ipc$dispatch("d8079a58", new Object[]{this, runnable});
                }
                return new Thread(runnable, "login#".concat(runnable.getClass().getName()));
            }
        };
        sThreadFactory = threadFactory;
        sThreadPoolExecutor = new CoordThreadPoolExecutor(4, 32, 4L, TimeUnit.SECONDS, priorityBlockingQueue, threadFactory, new CoordinatorRejectHandler());
    }

    public static void execute(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1afb0dfa", new Object[]{runnable});
        } else {
            sThreadPoolExecutor.execute(runnable, 30);
        }
    }

    public static Object getOuterClass(Object obj) {
        try {
            Field declaredField = obj.getClass().getDeclaredField("this$0");
            declaredField.setAccessible(true);
            return declaredField.get(obj);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
            return obj;
        } catch (IllegalArgumentException e2) {
            e2.printStackTrace();
            return obj;
        } catch (NoSuchFieldException e3) {
            e3.printStackTrace();
            return obj;
        }
    }

    public static void runWithTiming(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c83b0a20", new Object[]{runnable});
            return;
        }
        if (Looper.getMainLooper() != Looper.myLooper()) {
            Process.setThreadPriority(10);
        }
        try {
            runnable.run();
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class CoordinatorRejectHandler implements RejectedExecutionHandler {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(512753669);
        }

        @Override // java.util.concurrent.RejectedExecutionHandler
        public void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("bf6566d1", new Object[]{this, runnable, threadPoolExecutor});
                return;
            }
            Object[] array = Coordinator.mPoolWorkQueue.toArray();
            StringBuilder sb = new StringBuilder("[");
            for (Object obj : array) {
                if (obj.getClass().isAnonymousClass()) {
                    sb.append(Coordinator.getOuterClass(obj));
                    sb.append("~ ");
                } else {
                    sb.append(obj);
                    sb.append("> ");
                }
            }
            sb.append(']');
            throw new RejectedExecutionException("Task " + runnable.toString() + " rejected from " + threadPoolExecutor.toString() + " in " + sb.toString());
        }
    }
}
