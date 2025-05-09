package com.taobao.android.task;

import android.net.TrafficStats;
import android.os.AsyncTask;
import android.os.Debug;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.MessageQueue;
import android.os.Process;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.virtual_thread.VirtualThread;
import com.taobao.android.virtual_thread.stub.StubThreadPoolExecutor;
import java.lang.reflect.Field;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import tb.cw6;
import tb.riw;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class Coordinator {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int QUEUE_PRIORITY_DECODE_IMAGE = 27;
    public static final int QUEUE_PRIORITY_EMERGENCY = 10;
    public static final int QUEUE_PRIORITY_IMPORTANT = 20;
    public static final int QUEUE_PRIORITY_LOWER = 50;
    public static final int QUEUE_PRIORITY_NORMAL = 30;
    public static final int QUEUE_PRIORITY_NORMAL_DOWNLOAD = 35;
    public static final int QUEUE_PRIORITY_ON_IDLE = 100;
    public static final int QUEUE_PRIORITY_PATCH_DOWNLOAD = 21;
    public static final int QUEUE_PRIORITY_REQUEST_DATA = 23;
    public static final int QUEUE_PRIORITY_REQUEST_IMAGE = 28;
    public static final int QUEUE_PRIORITY_UNIMPORTANT = 90;
    public static final String TAG = "Coord";
    public static final Queue<TaggedRunnable> mIdleTasks = new LinkedList();
    public static final BlockingQueue<Runnable> mPoolWorkQueue;
    public static Field sOuterField;
    public static ThreadInfoListener sThreadInfoListener;
    public static final CoordThreadPoolExecutor sThreadPoolExecutor;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class PriorityComparator<Runnable> implements Comparator<Runnable> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(670040093);
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
            t2o.a(670040095);
            t2o.a(670040094);
        }

        public StandaloneTask(Runnable runnable) {
            this.mRunnable = runnable;
        }

        @Override // com.taobao.android.task.Coordinator.PriorityQueue
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

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public interface ThreadInfoListener {
        void threadInfo(int i, String str, long j, long j2, long j3, String str2, int i2, ThreadPoolExecutor threadPoolExecutor);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class WorkerHandlerHolder {
        public static final Handler workerHandler = new Handler(WorkerThreadHolder.workerThread.getLooper());

        static {
            t2o.a(670040098);
        }

        private WorkerHandlerHolder() {
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class WorkerThreadHolder {
        public static final HandlerThread workerThread;

        static {
            t2o.a(670040099);
            HandlerThread handlerThread = new HandlerThread("SKI_Worker");
            workerThread = handlerThread;
            handlerThread.start();
        }

        private WorkerThreadHolder() {
        }
    }

    static {
        t2o.a(670040087);
        PriorityBlockingQueue priorityBlockingQueue = new PriorityBlockingQueue(100, new PriorityComparator());
        mPoolWorkQueue = priorityBlockingQueue;
        CoordThreadPoolExecutor coordThreadPoolExecutor = new CoordThreadPoolExecutor(8, 16, 1L, TimeUnit.MINUTES, priorityBlockingQueue, new riw() { // from class: com.taobao.android.task.Coordinator.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass1 r2, String str, Object... objArr) {
                str.hashCode();
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/task/Coordinator$1");
            }

            @Override // tb.riw
            public VirtualThread newVirtualThread(Runnable runnable) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (VirtualThread) ipChange.ipc$dispatch("61b40e34", new Object[]{this, runnable});
                }
                return new VirtualThread(runnable, "ski_".concat(runnable.getClass().getName()));
            }
        }, new CoordinatorRejectHandler());
        sThreadPoolExecutor = coordThreadPoolExecutor;
        coordThreadPoolExecutor.allowCoreThreadTimeOut(true);
        SaturativeExecutor.installAsDefaultAsyncTaskExecutor(coordThreadPoolExecutor);
    }

    public static void dumpTask() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("da75d9a0", new Object[0]);
            return;
        }
        Object[] array = mPoolWorkQueue.toArray();
        StringBuilder sb = new StringBuilder("[");
        for (Object obj : array) {
            if (obj.getClass().isAnonymousClass()) {
                sb.append(getOuterClass(obj));
                sb.append("~ ");
            } else {
                sb.append(obj);
                sb.append("> ");
            }
        }
        sb.append(']');
        StringBuilder sb2 = new StringBuilder("Task size:");
        sb2.append(array.length);
        sb2.append(" --");
        sb2.append(sb.toString());
    }

    public static void execute(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1afb0dfa", new Object[]{runnable});
        } else {
            sThreadPoolExecutor.execute(runnable, 30);
        }
    }

    public static Executor getDefaultAsyncTaskExecutor() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Executor) ipChange.ipc$dispatch("a1a4ca56", new Object[0]);
        }
        return AsyncTask.SERIAL_EXECUTOR;
    }

    public static ThreadPoolExecutor getDefaultThreadPoolExecutor() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ThreadPoolExecutor) ipChange.ipc$dispatch("3ea91c0b", new Object[0]);
        }
        return sThreadPoolExecutor;
    }

    public static String getNormalTaskClassName(Runnable runnable) {
        String name = runnable.getClass().getName();
        try {
            if (!name.contains("AsyncTask$")) {
                return name;
            }
            if (sOuterField == null) {
                Field declaredField = runnable.getClass().getDeclaredField("this$0");
                sOuterField = declaredField;
                declaredField.setAccessible(true);
            }
            return sOuterField.get(runnable).getClass().getName();
        } catch (Exception unused) {
            return name;
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

    public static String getStandaloneTaskClassName(StandaloneTask standaloneTask) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("51f6f79c", new Object[]{standaloneTask});
        }
        Runnable runnable = standaloneTask.mRunnable;
        if (runnable instanceof TaggedRunnable) {
            return ((TaggedRunnable) runnable).toString();
        }
        return getNormalTaskClassName(runnable);
    }

    public static Looper getWorkerLooper() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Looper) ipChange.ipc$dispatch("ef71e9c1", new Object[0]);
        }
        return WorkerThreadHolder.workerThread.getLooper();
    }

    @Deprecated
    public static void postIdleTask(TaggedRunnable taggedRunnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("76c1227b", new Object[]{taggedRunnable});
        } else {
            mIdleTasks.add(taggedRunnable);
        }
    }

    @Deprecated
    public static void postTask(TaggedRunnable taggedRunnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("822d4487", new Object[]{taggedRunnable});
        } else {
            postTask(taggedRunnable, Priority.DEFAULT);
        }
    }

    public static void postTaskToHandler(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("efe4030f", new Object[]{runnable});
        } else {
            WorkerHandlerHolder.workerHandler.post(runnable);
        }
    }

    @Deprecated
    public static void removeDelayTask(TaggedRunnable taggedRunnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("756deec6", new Object[]{taggedRunnable});
        } else {
            WorkerHandlerHolder.workerHandler.removeMessages(taggedRunnable.hashCode());
        }
    }

    public static void removeTaskFromHandler(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91c438dc", new Object[]{runnable});
        } else {
            WorkerHandlerHolder.workerHandler.removeCallbacks(runnable);
        }
    }

    @Deprecated
    public static void runTask(TaggedRunnable taggedRunnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc253bf2", new Object[]{taggedRunnable});
        } else {
            runWithTiming(taggedRunnable);
        }
    }

    /* JADX WARN: Finally extract failed */
    public static void runWithTiming(Runnable runnable) {
        long j;
        long j2;
        int i;
        String normalTaskClassName;
        int i2;
        String normalTaskClassName2;
        int i3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c83b0a20", new Object[]{runnable});
            return;
        }
        if (sThreadInfoListener != null) {
            long currentTimeMillis = System.currentTimeMillis();
            j2 = Debug.threadCpuTimeNanos();
            j = currentTimeMillis;
        } else {
            j2 = 0;
            j = 0;
        }
        int myTid = Process.myTid();
        if (Looper.getMainLooper() != Looper.myLooper()) {
            if (runnable instanceof TaggedRunnable) {
                i3 = ((TaggedRunnable) runnable).mThreadPriority;
            } else {
                i3 = 10;
            }
            try {
                Process.setThreadPriority(i3);
            } catch (Throwable unused) {
            }
        }
        try {
            runnable.run();
            if (sThreadInfoListener != null) {
                long threadCpuTimeNanos = (Debug.threadCpuTimeNanos() - j2) / 1000000;
                long currentTimeMillis2 = System.currentTimeMillis() - j;
                if (sThreadInfoListener != null) {
                    if (runnable instanceof PriorityQueue) {
                        i2 = ((PriorityQueue) runnable).getQueuePriority();
                    } else {
                        i2 = 30;
                    }
                    if (runnable instanceof StandaloneTask) {
                        normalTaskClassName2 = getStandaloneTaskClassName((StandaloneTask) runnable);
                    } else {
                        normalTaskClassName2 = getNormalTaskClassName(runnable);
                    }
                    sThreadInfoListener.threadInfo(myTid, normalTaskClassName2, j, currentTimeMillis2, threadCpuTimeNanos, runnable.getClass().getName(), i2, sThreadPoolExecutor);
                }
            }
        } catch (Throwable th) {
            try {
                new StringBuilder("Throwable in ").append(runnable);
                throw th;
            } catch (Throwable th2) {
                if (sThreadInfoListener != null) {
                    long threadCpuTimeNanos2 = (Debug.threadCpuTimeNanos() - j2) / 1000000;
                    long currentTimeMillis3 = System.currentTimeMillis() - j;
                    if (sThreadInfoListener != null) {
                        if (runnable instanceof PriorityQueue) {
                            i = ((PriorityQueue) runnable).getQueuePriority();
                        } else {
                            i = 30;
                        }
                        if (runnable instanceof StandaloneTask) {
                            normalTaskClassName = getStandaloneTaskClassName((StandaloneTask) runnable);
                        } else {
                            normalTaskClassName = getNormalTaskClassName(runnable);
                        }
                        sThreadInfoListener.threadInfo(myTid, normalTaskClassName, j, currentTimeMillis3, threadCpuTimeNanos2, runnable.getClass().getName(), i, sThreadPoolExecutor);
                    }
                }
                throw th2;
            }
        }
    }

    @Deprecated
    public static void scheduleIdleTasks() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("af92c24a", new Object[0]);
        } else {
            Looper.myQueue().addIdleHandler(new MessageQueue.IdleHandler() { // from class: com.taobao.android.task.Coordinator.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.os.MessageQueue.IdleHandler
                public boolean queueIdle() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return ((Boolean) ipChange2.ipc$dispatch("b5e69690", new Object[]{this})).booleanValue();
                    }
                    Queue<TaggedRunnable> queue = Coordinator.mIdleTasks;
                    TaggedRunnable poll = queue.poll();
                    if (poll == null) {
                        return false;
                    }
                    Coordinator.postTask(poll);
                    return !queue.isEmpty();
                }
            });
        }
    }

    public static void setThreadInfoListener(ThreadInfoListener threadInfoListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("373b608d", new Object[]{threadInfoListener});
        } else if (cw6.b()) {
            sThreadInfoListener = threadInfoListener;
        } else {
            sThreadInfoListener = null;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class CoordinatorRejectHandler implements RejectedExecutionHandler {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(670040092);
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

    public static void execute(Runnable runnable, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44672449", new Object[]{runnable, new Integer(i)});
        } else {
            sThreadPoolExecutor.execute(runnable, i);
        }
    }

    @Deprecated
    public static void postTask(TaggedRunnable taggedRunnable, Priority priority) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("87959ebb", new Object[]{taggedRunnable, priority});
        } else {
            sThreadPoolExecutor.execute(new StandaloneTask(taggedRunnable));
        }
    }

    @Deprecated
    public static void execute(TaggedRunnable taggedRunnable, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42ccc857", new Object[]{taggedRunnable, new Integer(i), new Integer(i2)});
            return;
        }
        final StandaloneTask standaloneTask = new StandaloneTask(taggedRunnable);
        if (i < 1) {
            i = 1;
        }
        taggedRunnable.mQueuePriority = i;
        if (i2 > 0) {
            WorkerHandlerHolder.workerHandler.postDelayed(new Runnable() { // from class: com.taobao.android.task.Coordinator.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        Coordinator.sThreadPoolExecutor.execute(StandaloneTask.this);
                    }
                }
            }, i2);
        } else {
            sThreadPoolExecutor.execute(standaloneTask);
        }
    }

    @Deprecated
    public static void postTask(TaggedRunnable taggedRunnable, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c37bbf5c", new Object[]{taggedRunnable, new Integer(i)});
        } else {
            execute(taggedRunnable, 10, i);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class CoordThreadPoolExecutor extends StubThreadPoolExecutor {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(670040091);
        }

        public CoordThreadPoolExecutor(int i, int i2, long j, TimeUnit timeUnit, BlockingQueue<Runnable> blockingQueue, riw riwVar, RejectedExecutionHandler rejectedExecutionHandler) {
            super(i, i2, j, timeUnit, blockingQueue, riwVar, rejectedExecutionHandler);
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
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/android/task/Coordinator$CoordThreadPoolExecutor");
            }
        }

        @Override // com.taobao.android.virtual_thread.stub.StubThreadPoolExecutor, java.util.concurrent.ThreadPoolExecutor
        public void afterExecute(Runnable runnable, Throwable th) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("464b0a37", new Object[]{this, runnable, th});
                return;
            }
            super.afterExecute(runnable, th);
            if ((runnable instanceof StandaloneTask) && (((StandaloneTask) runnable).mRunnable instanceof TaggedRunnable)) {
                TrafficStats.clearThreadStatsTag();
            }
        }

        @Override // com.taobao.android.virtual_thread.stub.StubThreadPoolExecutor, java.util.concurrent.ThreadPoolExecutor
        public void beforeExecute(Thread thread, Runnable runnable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("45eb7bec", new Object[]{this, thread, runnable});
                return;
            }
            super.beforeExecute(thread, runnable);
            if (runnable instanceof StandaloneTask) {
                StandaloneTask standaloneTask = (StandaloneTask) runnable;
                Runnable runnable2 = standaloneTask.mRunnable;
                if (runnable2 instanceof TaggedRunnable) {
                    TaggedRunnable taggedRunnable = (TaggedRunnable) runnable2;
                    thread.setName("ski_" + taggedRunnable.toString());
                    TrafficStats.setThreadStatsTag(taggedRunnable.mTrafficTag);
                    return;
                }
                thread.setName("ski_" + standaloneTask.mRunnable.getClass().getName() + "");
                return;
            }
            thread.setName("ski_" + runnable.getClass().getName() + "");
        }

        public void execute(Runnable runnable, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("44672449", new Object[]{this, runnable, new Integer(i)});
            } else if (runnable instanceof StandaloneTask) {
                super.execute(runnable);
            } else {
                StandaloneTask standaloneTask = new StandaloneTask(runnable);
                if (i < 1) {
                    i = 1;
                }
                standaloneTask.mPriorityQueue = i;
                super.execute(standaloneTask);
            }
        }

        @Override // com.taobao.android.virtual_thread.stub.StubThreadPoolExecutor, java.util.concurrent.ThreadPoolExecutor, java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1afb0dfa", new Object[]{this, runnable});
            } else if (runnable instanceof StandaloneTask) {
                super.execute(runnable);
            } else {
                super.execute(new StandaloneTask(runnable));
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static abstract class TaggedRunnable implements Runnable, PriorityQueue {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final String mName;
        public int mQueuePriority;
        public int mThreadPriority;
        public int mTrafficTag;

        static {
            t2o.a(670040096);
            t2o.a(670040094);
        }

        public TaggedRunnable(String str) {
            this.mTrafficTag = 0;
            this.mQueuePriority = 30;
            this.mThreadPriority = 10;
            this.mName = str;
        }

        @Override // com.taobao.android.task.Coordinator.PriorityQueue
        public int getQueuePriority() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("c0056f19", new Object[]{this})).intValue();
            }
            return this.mQueuePriority;
        }

        public void setThreadPriority(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("42d4ca8c", new Object[]{this, new Integer(i)});
                return;
            }
            if (i < 1) {
                i = 1;
            }
            this.mThreadPriority = i;
        }

        public void setTrafficTag(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8709145d", new Object[]{this, new Integer(i)});
            } else {
                this.mTrafficTag = i;
            }
        }

        public String toString() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
            }
            String str = this.mName;
            if (str != null) {
                return str;
            }
            return getClass().getName() + '@' + this.mName;
        }

        public TaggedRunnable(String str, int i) {
            this.mTrafficTag = 0;
            this.mQueuePriority = 30;
            this.mThreadPriority = 10;
            this.mName = str;
            if (i < 0) {
                i = 0;
            } else if (i > 100) {
                i = 100;
            }
            this.mQueuePriority = i;
        }
    }

    @Deprecated
    public static void postTask(TaggedRunnable taggedRunnable, Priority priority, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b1eaba8", new Object[]{taggedRunnable, priority, new Integer(i)});
        } else {
            execute(taggedRunnable, 10, i);
        }
    }
}
