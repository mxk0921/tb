package com.taobao.android.task;

import android.os.AsyncTask;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;
import java.io.FileFilter;
import java.lang.Thread;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.LockSupport;
import java.util.regex.Pattern;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class SaturativeExecutor extends ThreadPoolExecutor {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final boolean DEBUG = false;
    private static final int KEEP_ALIVE = 1;
    private static final int MAX_POOL_SIZE = 128;
    private static final int MIN_THREADS_BEFORE_SATURATION = 3;
    private static final int QUEUE_CAPACITY = 1024;
    public static final String TAG = "SatuExec";
    private static SaturationAwareBlockingQueue<Runnable> mQueue;
    private static final Pattern PATTERN_CPU_ENTRIES = Pattern.compile("cpu[0-9]+");
    private static final ThreadFactory sThreadFactory = new ThreadFactory() { // from class: com.taobao.android.task.SaturativeExecutor.2
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private final AtomicInteger mCount = new AtomicInteger(1);

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Thread) ipChange.ipc$dispatch("d8079a58", new Object[]{this, runnable});
            }
            Thread thread = new Thread(runnable, "SaturativeThread #" + this.mCount.getAndIncrement());
            SaturativeExecutor.collectThread(thread);
            return thread;
        }
    };
    private static final HashSet<Thread> mThreads = new HashSet<>();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class CountedTask implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public static final AtomicInteger mNumRunning = new AtomicInteger();
        public Runnable mRunnable;

        static {
            t2o.a(670040105);
        }

        public CountedTask(Runnable runnable) {
            this.mRunnable = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            AtomicInteger atomicInteger = mNumRunning;
            atomicInteger.incrementAndGet();
            try {
                this.mRunnable.run();
                atomicInteger.decrementAndGet();
            } catch (Throwable th) {
                mNumRunning.decrementAndGet();
                throw th;
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class SaturationAwareBlockingQueue<T> extends LinkedBlockingQueue<T> {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        private static final long serialVersionUID = 1;
        private SaturativeExecutor mExecutor;

        static {
            t2o.a(670040106);
        }

        public SaturationAwareBlockingQueue(int i) {
            super(i);
        }

        public static /* synthetic */ Object ipc$super(SaturationAwareBlockingQueue saturationAwareBlockingQueue, String str, Object... objArr) {
            int hashCode = str.hashCode();
            if (hashCode == 195222152) {
                return new Boolean(super.add(objArr[0]));
            }
            if (hashCode == 1107930627) {
                return new Boolean(super.offer(objArr[0]));
            }
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/android/task/SaturativeExecutor$SaturationAwareBlockingQueue");
        }

        @Override // java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection, java.util.Queue, java.util.concurrent.BlockingQueue
        public boolean add(T t) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("ba2da88", new Object[]{this, t})).booleanValue();
            }
            if (!this.mExecutor.isReallyUnsaturated()) {
                return super.add(t);
            }
            throw new IllegalStateException("Unsaturated");
        }

        @Override // java.util.concurrent.LinkedBlockingQueue, java.util.Queue, java.util.concurrent.BlockingQueue
        public boolean offer(T t) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("4209ae03", new Object[]{this, t})).booleanValue();
            }
            if (this.mExecutor.isReallyUnsaturated()) {
                return false;
            }
            return super.offer(t);
        }

        @Override // java.util.concurrent.LinkedBlockingQueue, java.util.concurrent.BlockingQueue
        public void put(T t) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("29ab6e72", new Object[]{this, t});
                return;
            }
            throw new UnsupportedOperationException();
        }

        public void setExecutor(SaturativeExecutor saturativeExecutor) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("251df7bf", new Object[]{this, saturativeExecutor});
            } else {
                this.mExecutor = saturativeExecutor;
            }
        }

        @Override // java.util.concurrent.LinkedBlockingQueue, java.util.concurrent.BlockingQueue
        public boolean offer(T t, long j, TimeUnit timeUnit) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("e208fef7", new Object[]{this, t, new Long(j), timeUnit})).booleanValue();
            }
            throw new UnsupportedOperationException();
        }
    }

    public SaturativeExecutor() {
        this(determineBestMinPoolSize());
    }

    public static /* synthetic */ Pattern access$000() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Pattern) ipChange.ipc$dispatch("d6fe7a40", new Object[0]);
        }
        return PATTERN_CPU_ENTRIES;
    }

    public static void collectThread(Thread thread) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("511e9acc", new Object[]{thread});
            return;
        }
        HashSet<Thread> hashSet = mThreads;
        synchronized (hashSet) {
            hashSet.add(thread);
        }
    }

    private static int countCpuCores() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("18d5d115", new Object[0])).intValue();
        }
        try {
            return new File("/sys/devices/system/cpu/").listFiles(new FileFilter() { // from class: com.taobao.android.task.SaturativeExecutor.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.io.FileFilter
                public boolean accept(File file) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return ((Boolean) ipChange2.ipc$dispatch("50e018ca", new Object[]{this, file})).booleanValue();
                    }
                    return SaturativeExecutor.access$000().matcher(file.getName()).matches();
                }
            }).length;
        } catch (Exception unused) {
            return 0;
        }
    }

    private static int determineBestMinPoolSize() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("483515d2", new Object[0])).intValue();
        }
        int countCpuCores = countCpuCores();
        if (countCpuCores > 0) {
            return countCpuCores;
        }
        return Runtime.getRuntime().availableProcessors() * 2;
    }

    public static /* synthetic */ Object ipc$super(SaturativeExecutor saturativeExecutor, String str, Object... objArr) {
        if (str.hashCode() == 452660730) {
            super.execute((Runnable) objArr[0]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/task/SaturativeExecutor");
    }

    @Override // java.util.concurrent.ThreadPoolExecutor, java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1afb0dfa", new Object[]{this, runnable});
        } else {
            super.execute(new CountedTask(runnable));
        }
    }

    public boolean isSaturated() {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("baab1096", new Object[]{this})).booleanValue();
        }
        if (getPoolSize() <= 3) {
            return false;
        }
        int corePoolSize = getCorePoolSize();
        int i2 = CountedTask.mNumRunning.get();
        HashSet<Thread> hashSet = mThreads;
        int size = hashSet.size();
        if (i2 < corePoolSize || i2 < size) {
            return true;
        }
        synchronized (hashSet) {
            try {
                Iterator<Thread> it = hashSet.iterator();
                i = 0;
                while (it.hasNext()) {
                    Thread.State state = it.next().getState();
                    if (!(state == Thread.State.RUNNABLE || state == Thread.State.NEW)) {
                        if (state == Thread.State.TERMINATED) {
                            it.remove();
                        }
                    }
                    i++;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (i >= corePoolSize) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public SaturativeExecutor(int r10) {
        /*
            r9 = this;
            java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.SECONDS
            com.taobao.android.task.SaturativeExecutor$SaturationAwareBlockingQueue r6 = new com.taobao.android.task.SaturativeExecutor$SaturationAwareBlockingQueue
            r0 = 1024(0x400, float:1.435E-42)
            r6.<init>(r0)
            com.taobao.android.task.SaturativeExecutor.mQueue = r6
            java.util.concurrent.ThreadFactory r7 = com.taobao.android.task.SaturativeExecutor.sThreadFactory
            java.util.concurrent.ThreadPoolExecutor$CallerRunsPolicy r8 = new java.util.concurrent.ThreadPoolExecutor$CallerRunsPolicy
            r8.<init>()
            r2 = 128(0x80, float:1.794E-43)
            r3 = 1
            r0 = r9
            r1 = r10
            r0.<init>(r1, r2, r3, r5, r6, r7, r8)
            java.util.concurrent.BlockingQueue r10 = r9.getQueue()
            com.taobao.android.task.SaturativeExecutor$SaturationAwareBlockingQueue r10 = (com.taobao.android.task.SaturativeExecutor.SaturationAwareBlockingQueue) r10
            r10.setExecutor(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.task.SaturativeExecutor.<init>(int):void");
    }

    public static final boolean installAsDefaultAsyncTaskExecutor(ThreadPoolExecutor threadPoolExecutor) {
        try {
            Field declaredField = AsyncTask.class.getDeclaredField("THREAD_POOL_EXECUTOR");
            declaredField.setAccessible(true);
            declaredField.set(null, threadPoolExecutor);
        } catch (Exception unused) {
        }
        try {
            try {
                try {
                    Method method = AsyncTask.class.getMethod("setDefaultExecutor", Executor.class);
                    method.setAccessible(true);
                    method.invoke(null, threadPoolExecutor);
                    return true;
                } catch (Exception unused2) {
                    Field declaredField2 = AsyncTask.class.getDeclaredField("sDefaultExecutor");
                    declaredField2.setAccessible(true);
                    declaredField2.set(null, threadPoolExecutor);
                    return true;
                }
            } catch (Exception unused3) {
                Field declaredField3 = AsyncTask.class.getDeclaredField("sExecutor");
                declaredField3.setAccessible(true);
                declaredField3.set(null, threadPoolExecutor);
                return true;
            }
        } catch (Exception unused4) {
            return false;
        }
    }

    public boolean isReallyUnsaturated() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e58b8172", new Object[]{this})).booleanValue();
        }
        if (isSaturated()) {
            return false;
        }
        LockSupport.parkNanos(10L);
        return !isSaturated();
    }

    static {
        t2o.a(670040102);
    }
}
