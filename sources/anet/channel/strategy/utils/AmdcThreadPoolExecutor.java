package anet.channel.strategy.utils;

import anet.channel.AwcnConfig;
import anet.channel.thread.ThreadPoolExecutorFactory;
import anet.channel.util.ALog;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class AmdcThreadPoolExecutor {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "awcn.AmdcThreadPoolExecutor";
    private static AtomicInteger seq = new AtomicInteger(0);
    private static ScheduledThreadPoolExecutor threadPoolExecutor = null;
    private static ScheduledThreadPoolExecutor localDnsThreadPoolExecutor = null;

    static {
        t2o.a(607125913);
    }

    private static ScheduledThreadPoolExecutor getThreadPool(ScheduledThreadPoolExecutor scheduledThreadPoolExecutor, int i, final String str) {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ScheduledThreadPoolExecutor) ipChange.ipc$dispatch("c26efe6e", new Object[]{scheduledThreadPoolExecutor, new Integer(i), str});
        }
        if (!AwcnConfig.isUseVirtualThread()) {
            scheduledThreadPoolExecutor2 = new ScheduledThreadPoolExecutor(i, new ThreadFactory() { // from class: anet.channel.strategy.utils.AmdcThreadPoolExecutor.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.util.concurrent.ThreadFactory
                public Thread newThread(Runnable runnable) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return (Thread) ipChange2.ipc$dispatch("d8079a58", new Object[]{this, runnable});
                    }
                    Thread thread = new Thread(runnable, str);
                    ALog.i("awcn.AmdcThreadPoolExecutor", "thread created!", null, "name", thread.getName());
                    thread.setPriority(5);
                    return thread;
                }
            });
        } else {
            scheduledThreadPoolExecutor2 = ThreadPoolExecutorFactory.newScheduledThreadPool(i, str);
        }
        scheduledThreadPoolExecutor2.setKeepAliveTime(60L, TimeUnit.SECONDS);
        scheduledThreadPoolExecutor2.allowCoreThreadTimeOut(true);
        return scheduledThreadPoolExecutor2;
    }

    public static void scheduleTask(Runnable runnable, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("38f834a3", new Object[]{runnable, new Long(j)});
            return;
        }
        try {
            getThreadPoolExecutor().schedule(runnable, j, TimeUnit.MILLISECONDS);
        } catch (Exception e) {
            ALog.e("awcn.AmdcThreadPoolExecutor", "schedule task failed", null, e, new Object[0]);
        }
    }

    public static void submitLocalDnsTask(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5fe6c120", new Object[]{runnable});
            return;
        }
        try {
            getLocalDnsThreadPoolExecutor().submit(runnable);
        } catch (Exception e) {
            ALog.e("awcn.AmdcThreadPoolExecutor", "submitLocalDnsTask failed", null, e, new Object[0]);
        }
    }

    public static void submitTask(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bfdbdc42", new Object[]{runnable});
            return;
        }
        try {
            getThreadPoolExecutor().submit(runnable);
        } catch (Exception e) {
            ALog.e("awcn.AmdcThreadPoolExecutor", "submit task failed", null, e, new Object[0]);
        }
    }

    public static ScheduledThreadPoolExecutor getLocalDnsThreadPoolExecutor() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ScheduledThreadPoolExecutor) ipChange.ipc$dispatch("72281123", new Object[0]);
        }
        synchronized (AmdcThreadPoolExecutor.class) {
            try {
                if (localDnsThreadPoolExecutor == null) {
                    String str = "AMDC_LOCAL" + seq.incrementAndGet();
                    ALog.e("awcn.AmdcThreadPoolExecutor", "[test] local thread created!", null, "name", str);
                    localDnsThreadPoolExecutor = getThreadPool(null, 2, str);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return localDnsThreadPoolExecutor;
    }

    public static ScheduledThreadPoolExecutor getThreadPoolExecutor() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ScheduledThreadPoolExecutor) ipChange.ipc$dispatch("871c36c1", new Object[0]);
        }
        synchronized (AmdcThreadPoolExecutor.class) {
            try {
                if (threadPoolExecutor == null) {
                    String str = "AMDC" + seq.incrementAndGet();
                    ALog.e("awcn.AmdcThreadPoolExecutor", "[test] amdc thread created!", null, "name", str);
                    threadPoolExecutor = getThreadPool(null, 2, str);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return threadPoolExecutor;
    }
}
