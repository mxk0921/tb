package mtopsdk.mtop.util;

import android.os.Build;
import android.os.Process;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.huawei.hms.android.SystemUtils;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import mtopsdk.common.util.RemoteConfig;
import mtopsdk.common.util.StringUtils;
import mtopsdk.common.util.TBSdkLog;
import mtopsdk.mtop.global.SwitchConfig;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class MtopSDKThreadPoolExecutorFactory {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final int CALLBACK_CORE_POOL_SIZE = 2;
    private static final int CALLBACK_KEEP_ALIVE_TIME = 10;
    private static final int DEFAULT_CORE_POOL_SIZE = 3;
    private static final int KEEP_ALIVE_TIME = 120;
    private static final int QUEENSIZE = 128;
    private static final int REQUEST_CORE_POOL_SIZE = 4;
    private static final int STREAM_REQUEST_CORE_POOL_SIZE = 2;
    private static final String TAG = "mtopsdk.MtopSDKThreadPoolExecutorFactory";
    private static volatile ThreadPoolExecutor callbackExecutors;
    private static volatile ExecutorService[] callbackOldExecutors;
    private static volatile ThreadPoolExecutor requestExecutor;
    private static volatile ThreadPoolExecutor ssrCallbackExecutors;
    private static volatile ScheduledThreadPoolExecutor ssrTimeoutCallbackExecutors;
    private static volatile ThreadPoolExecutor streamCallbackExecutors;
    private static volatile ThreadPoolExecutor streamParseExecutors;
    private static volatile ThreadPoolExecutor[] streamRequestExecutor;
    private static volatile ThreadPoolExecutor threadPoolExecutor;
    private static int priority = 10;
    private static int sKeepLiveTime = 0;

    static {
        t2o.a(589299999);
    }

    public static ThreadPoolExecutor getDefaultThreadPoolExecutor() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ThreadPoolExecutor) ipChange.ipc$dispatch("3ea91c0b", new Object[0]);
        }
        if (threadPoolExecutor == null) {
            synchronized (MtopSDKThreadPoolExecutorFactory.class) {
                try {
                    if (threadPoolExecutor == null) {
                        threadPoolExecutor = createExecutor(3, 3, getKeepAliveTime(), 128, new MtopSDKThreadFactory(priority));
                        TBSdkLog.e(TAG, "[getDefaultThreadPoolExecutor] keepLiveTime = " + sKeepLiveTime);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return threadPoolExecutor;
    }

    private static int getKeepAliveTime() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ce2db479", new Object[0])).intValue();
        }
        if (sKeepLiveTime == 0) {
            if (!SwitchConfig.getInstance().isOptThreadAliveTime()) {
                String str = Build.BRAND;
                if (!TextUtils.equals(str, SystemUtils.PRODUCT_HUAWEI) && !TextUtils.equals(str, SystemUtils.PRODUCT_HONOR)) {
                    sKeepLiveTime = 120;
                }
            }
            sKeepLiveTime = 5;
        }
        return sKeepLiveTime;
    }

    public static ThreadPoolExecutor getRequestThreadPoolExecutor() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ThreadPoolExecutor) ipChange.ipc$dispatch("c6d583d9", new Object[0]);
        }
        if (requestExecutor == null) {
            synchronized (MtopSDKThreadPoolExecutorFactory.class) {
                try {
                    if (requestExecutor == null) {
                        requestExecutor = createExecutor(4, 4, getKeepAliveTime(), 0, new MtopSDKThreadFactory(priority, "RequestPool"));
                        TBSdkLog.e(TAG, "[getRequestThreadPoolExecutor] keepLiveTime = " + sKeepLiveTime);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return requestExecutor;
    }

    public static ExecutorService getSsrCallbackExecutorService() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ExecutorService) ipChange.ipc$dispatch("73027733", new Object[0]);
        }
        if (ssrCallbackExecutors == null) {
            synchronized (MtopSDKThreadPoolExecutorFactory.class) {
                try {
                    if (ssrCallbackExecutors == null) {
                        ssrCallbackExecutors = createExecutor(1, 1, getKeepAliveTime(), 0, new MtopSDKThreadFactory(priority, "SsrCallbackPool"));
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return ssrCallbackExecutors;
    }

    public static ScheduledThreadPoolExecutor getSsrScheduledExecutorService() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ScheduledThreadPoolExecutor) ipChange.ipc$dispatch("f693813f", new Object[0]);
        }
        if (ssrTimeoutCallbackExecutors == null) {
            synchronized (MtopSDKThreadPoolExecutorFactory.class) {
                try {
                    if (ssrTimeoutCallbackExecutors == null) {
                        ssrTimeoutCallbackExecutors = new ScheduledThreadPoolExecutor(1, new MtopSDKThreadFactory(priority, "SsrTimeoutCallbackPool"));
                        ssrTimeoutCallbackExecutors.setKeepAliveTime(10L, TimeUnit.MILLISECONDS);
                        ssrTimeoutCallbackExecutors.allowCoreThreadTimeOut(true);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return ssrTimeoutCallbackExecutors;
    }

    public static ExecutorService getStreamCallbackExecutorService() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ExecutorService) ipChange.ipc$dispatch("d0fcaacd", new Object[0]);
        }
        if (streamCallbackExecutors == null) {
            synchronized (MtopSDKThreadPoolExecutorFactory.class) {
                try {
                    if (streamCallbackExecutors == null) {
                        streamCallbackExecutors = createExecutor(1, 1, getKeepAliveTime(), 0, new MtopSDKThreadFactory(priority, "StreamCallbackPool"));
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return streamCallbackExecutors;
    }

    public static ThreadPoolExecutor getStreamParseThreadPoolExecutor() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ThreadPoolExecutor) ipChange.ipc$dispatch("2caa185d", new Object[0]);
        }
        if (streamParseExecutors == null) {
            synchronized (MtopSDKThreadPoolExecutorFactory.class) {
                try {
                    if (streamParseExecutors == null) {
                        streamParseExecutors = createExecutor(2, 6, getKeepAliveTime(), 0, new MtopSDKThreadFactory(priority, "StreamParserPool"));
                        TBSdkLog.e(TAG, "[getStreamParseThreadPoolExecutor] keepLiveTime = " + sKeepLiveTime);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return streamParseExecutors;
    }

    public static ThreadPoolExecutor[] getStreamRequestThreadPoolExecutor() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ThreadPoolExecutor[]) ipChange.ipc$dispatch("c2f14818", new Object[0]);
        }
        if (streamRequestExecutor == null) {
            synchronized (MtopSDKThreadPoolExecutorFactory.class) {
                try {
                    if (streamRequestExecutor == null) {
                        streamRequestExecutor = new ThreadPoolExecutor[2];
                        for (int i = 0; i < 2; i++) {
                            streamRequestExecutor[i] = createExecutor(1, 1, getKeepAliveTime(), 0, new MtopSDKThreadFactory(priority, "StreamRequestPool"));
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return streamRequestExecutor;
    }

    public static void setCallbackExecutorServices(ExecutorService[] executorServiceArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2074ab3b", new Object[]{executorServiceArr});
        } else if (executorServiceArr != null && executorServiceArr.length > 0) {
            if (RemoteConfig.getInstance().enableNewExecutor) {
                callbackExecutors = (ThreadPoolExecutor) executorServiceArr[0];
            } else {
                callbackOldExecutors = executorServiceArr;
            }
        }
    }

    public static void setDefaultThreadPoolExecutor(ThreadPoolExecutor threadPoolExecutor2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4aab6ff1", new Object[]{threadPoolExecutor2});
        } else if (threadPoolExecutor2 != null) {
            threadPoolExecutor = threadPoolExecutor2;
        }
    }

    public static void setRequestThreadPoolExecutor(ThreadPoolExecutor threadPoolExecutor2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c80c01e3", new Object[]{threadPoolExecutor2});
        } else if (threadPoolExecutor2 != null) {
            requestExecutor = threadPoolExecutor2;
        }
    }

    public static Future<?> submit(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Future) ipChange.ipc$dispatch("b4a21fb3", new Object[]{runnable});
        }
        try {
            return getDefaultThreadPoolExecutor().submit(runnable);
        } catch (Throwable th) {
            TBSdkLog.e(TAG, "[submit]submit runnable to Mtop Default ThreadPool error ---" + th.toString());
            return null;
        }
    }

    public static Future<?> submitRequestTask(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Future) ipChange.ipc$dispatch("25d45b17", new Object[]{runnable});
        }
        try {
            return getRequestThreadPoolExecutor().submit(runnable);
        } catch (Throwable th) {
            TBSdkLog.e(TAG, "[submitRequestTask]submit runnable to Mtop Request ThreadPool error ---" + th.toString());
            return null;
        }
    }

    public static Future<?> submitSsrCallbackTask(int i, Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Future) ipChange.ipc$dispatch("2294c38c", new Object[]{new Integer(i), runnable});
        }
        try {
            return getSsrCallbackExecutorService().submit(runnable);
        } catch (Throwable th) {
            TBSdkLog.e(TAG, "[submitSsrCallbackTask]submit runnable to SSR Callback ThreadPool error ---" + th.toString());
            return null;
        }
    }

    public static Future<?> submitStreamCallbackTask(int i, Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Future) ipChange.ipc$dispatch("a86bf46e", new Object[]{new Integer(i), runnable});
        }
        try {
            return getStreamCallbackExecutorService().submit(runnable);
        } catch (Throwable th) {
            TBSdkLog.e(TAG, "[submitCallbackTask]submit runnable to Mtop Callback ThreadPool error ---" + th.toString());
            return null;
        }
    }

    public static Future<?> submitStreamParseTask(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Future) ipChange.ipc$dispatch("a76ff39b", new Object[]{runnable});
        }
        try {
            return getStreamParseThreadPoolExecutor().submit(runnable);
        } catch (Throwable th) {
            TBSdkLog.e(TAG, "[submitStreamParseTask]submit runnable to Mtop StreamParse ThreadPool error ---" + th.toString());
            return null;
        }
    }

    public static Future<?> submitStreamRequestTask(int i, Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Future) ipChange.ipc$dispatch("bec3f214", new Object[]{new Integer(i), runnable});
        }
        try {
            ThreadPoolExecutor[] streamRequestThreadPoolExecutor = getStreamRequestThreadPoolExecutor();
            return streamRequestThreadPoolExecutor[Math.abs(i % streamRequestThreadPoolExecutor.length)].submit(runnable);
        } catch (Throwable th) {
            TBSdkLog.e(TAG, "[submitStreamRequestTask]submit runnable to Mtop Request ThreadPool error ---" + th.toString());
            return null;
        }
    }

    public static ThreadPoolExecutor createExecutor(int i, int i2, int i3, int i4, ThreadFactory threadFactory) {
        LinkedBlockingQueue linkedBlockingQueue;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ThreadPoolExecutor) ipChange.ipc$dispatch("d514e25d", new Object[]{new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), threadFactory});
        }
        if (i4 > 0) {
            linkedBlockingQueue = new LinkedBlockingQueue(i4);
        } else {
            linkedBlockingQueue = new LinkedBlockingQueue();
        }
        ThreadPoolExecutor threadPoolExecutor2 = new ThreadPoolExecutor(i, i2, i3, TimeUnit.SECONDS, linkedBlockingQueue, threadFactory);
        if (i3 > 0) {
            threadPoolExecutor2.allowCoreThreadTimeOut(true);
        }
        return threadPoolExecutor2;
    }

    public static ExecutorService[] getCallbackExecutorServices() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ExecutorService[]) ipChange.ipc$dispatch("12cd033d", new Object[0]);
        }
        if (RemoteConfig.getInstance().enableNewExecutor) {
            if (callbackExecutors == null) {
                synchronized (MtopSDKThreadPoolExecutorFactory.class) {
                    try {
                        if (callbackExecutors == null) {
                            callbackExecutors = createExecutor(2, 2, getKeepAliveTime(), 0, new MtopSDKThreadFactory(priority, "CallbackPool"));
                        }
                    } finally {
                    }
                }
            }
            return new ExecutorService[]{callbackExecutors};
        }
        if (callbackOldExecutors == null) {
            synchronized (MtopSDKThreadPoolExecutorFactory.class) {
                try {
                    if (callbackOldExecutors == null) {
                        ExecutorService[] executorServiceArr = new ExecutorService[2];
                        for (int i = 0; i < 2; i++) {
                            int keepAliveTime = getKeepAliveTime();
                            int i2 = priority;
                            executorServiceArr[i] = createExecutor(1, 1, keepAliveTime, 0, new MtopSDKThreadFactory(i2, "CallbackPool" + i));
                            TBSdkLog.e(TAG, "[getCallbackExecutorServices] keepLiveTime = " + sKeepLiveTime);
                        }
                        callbackOldExecutors = executorServiceArr;
                    }
                } finally {
                }
            }
        }
        return callbackOldExecutors;
    }

    public static Future<?> submitCallbackTask(int i, Runnable runnable) {
        Future<?> future;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Future) ipChange.ipc$dispatch("90958a0e", new Object[]{new Integer(i), runnable});
        }
        try {
            if (RemoteConfig.getInstance().enableNewExecutor) {
                future = getCallbackExecutorServices()[0].submit(runnable);
            } else {
                ExecutorService[] callbackExecutorServices = getCallbackExecutorServices();
                future = callbackExecutorServices[Math.abs(i % callbackExecutorServices.length)].submit(runnable);
            }
            return future;
        } catch (Throwable th) {
            TBSdkLog.e(TAG, "[submitCallbackTask]submit runnable to Mtop Callback ThreadPool error ---" + th.toString());
            return null;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class MtopSDKThreadFactory implements ThreadFactory {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private final AtomicInteger mCount;
        public int priority;
        private String type;

        static {
            t2o.a(589300000);
        }

        public MtopSDKThreadFactory(int i) {
            this.priority = 10;
            this.mCount = new AtomicInteger();
            this.type = "";
            this.priority = i;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Thread) ipChange.ipc$dispatch("d8079a58", new Object[]{this, runnable});
            }
            StringBuilder sb = new StringBuilder(32);
            sb.append("MTOPSDK ");
            if (StringUtils.isNotBlank(this.type)) {
                sb.append(this.type);
                sb.append(" ");
            } else {
                sb.append("DefaultPool ");
            }
            sb.append("Thread:");
            sb.append(this.mCount.getAndIncrement());
            return new Thread(runnable, sb.toString()) { // from class: mtopsdk.mtop.util.MtopSDKThreadPoolExecutorFactory.MtopSDKThreadFactory.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public static /* synthetic */ Object ipc$super(AnonymousClass1 r2, String str, Object... objArr) {
                    if (str.hashCode() == 1548812690) {
                        super.run();
                        return null;
                    }
                    int hashCode = str.hashCode();
                    throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in mtopsdk/mtop/util/MtopSDKThreadPoolExecutorFactory$MtopSDKThreadFactory$1");
                }

                @Override // java.lang.Thread, java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    try {
                        Process.setThreadPriority(MtopSDKThreadFactory.this.priority);
                    } catch (Throwable th) {
                        TBSdkLog.e(MtopSDKThreadPoolExecutorFactory.TAG, "[run]Thread set thread priority error ---" + th.toString());
                    }
                    try {
                        super.run();
                    } catch (Throwable th2) {
                        TBSdkLog.e(MtopSDKThreadPoolExecutorFactory.TAG, "[run]Thread run error ---" + th2.toString());
                    }
                }
            };
        }

        public MtopSDKThreadFactory(int i, String str) {
            this.priority = 10;
            this.mCount = new AtomicInteger();
            this.priority = i;
            this.type = str;
        }
    }
}
