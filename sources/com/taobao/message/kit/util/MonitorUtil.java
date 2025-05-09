package com.taobao.message.kit.util;

import com.alibaba.mtl.appmonitor.AppMonitor;
import com.alibaba.mtl.appmonitor.model.DimensionSet;
import com.alibaba.mtl.appmonitor.model.DimensionValueSet;
import com.alibaba.mtl.appmonitor.model.MeasureSet;
import com.alibaba.mtl.appmonitor.model.MeasureValueSet;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.virtual_thread.annotation.IgnoreVirtualThread;
import com.taobao.message.kit.threadpool.Coordinator;
import com.taobao.message.kit.util.MonitorUtil;
import com.taobao.message.uikit.util.ApplicationUtil;
import com.taobao.tao.log.TLog;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import tb.t2o;

/* compiled from: Taobao */
@IgnoreVirtualThread
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class MonitorUtil {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static ScheduledExecutorService sPool;

    public static void commitCount(final String str, final String str2, final double d) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aec33a6b", new Object[]{str, str2, new Double(d)});
        } else {
            sPool.schedule(new Runnable() { // from class: tb.j0j
                @Override // java.lang.Runnable
                public final void run() {
                    MonitorUtil.lambda$commitCount$4(str, str2, d);
                }
            }, 0L, TimeUnit.MILLISECONDS);
        }
    }

    public static void commitFail(final String str, final String str2, final String str3, final String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("426ed724", new Object[]{str, str2, str3, str4});
        } else {
            sPool.schedule(new Runnable() { // from class: tb.g0j
                @Override // java.lang.Runnable
                public final void run() {
                    MonitorUtil.lambda$commitFail$2(str, str2, str3, str4);
                }
            }, 0L, TimeUnit.MILLISECONDS);
        }
    }

    public static void commitStat(final String str, final String str2, final Map<String, String> map, final Map<String, Double> map2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("15d01226", new Object[]{str, str2, map, map2});
        } else {
            sPool.schedule(new Runnable() { // from class: tb.e0j
                @Override // java.lang.Runnable
                public final void run() {
                    MonitorUtil.lambda$commitStat$5(str, str2, map, map2);
                }
            }, 0L, TimeUnit.MILLISECONDS);
        }
    }

    public static void commitSuccess(final String str, final String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aeeeb8e7", new Object[]{str, str2});
        } else {
            sPool.schedule(new Runnable() { // from class: tb.i0j
                @Override // java.lang.Runnable
                public final void run() {
                    MonitorUtil.lambda$commitSuccess$0(str, str2);
                }
            }, 0L, TimeUnit.MILLISECONDS);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$commitCount$4(String str, String str2, double d) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4ff2b358", new Object[]{str, str2, new Double(d)});
        } else {
            AppMonitor.Counter.commit(str, str2, d);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$commitFail$2(String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("30dc93af", new Object[]{str, str2, str3, str4});
        } else {
            AppMonitor.Alarm.commitFail(str, str2, str3, str4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$commitFail$3(String str, String str2, String str3, String str4, String str5) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a820ffa", new Object[]{str, str2, str3, str4, str5});
        } else {
            AppMonitor.Alarm.commitFail(str, str2, str3, str4, str5);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$commitStat$5(String str, String str2, Map map, Map map2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("810b1734", new Object[]{str, str2, map, map2});
        } else {
            AppMonitor.Stat.commit(str, str2, DimensionValueSet.fromStringMap(map), MeasureValueSet.create(map2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$commitSuccess$0(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b6a6b896", new Object[]{str, str2});
        } else {
            AppMonitor.Alarm.commitSuccess(str, str2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$commitSuccess$1(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24b8f5a1", new Object[]{str, str2, str3});
        } else {
            AppMonitor.Alarm.commitSuccess(str, str2, str3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$register$6(String str, String str2, List list, List list2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c559f6f", new Object[]{str, str2, list, list2});
        } else {
            AppMonitor.register(str, str2, MeasureSet.create(list), DimensionSet.create(list2));
        }
    }

    public static void register(final String str, final String str2, final List<String> list, final List<String> list2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("62e171a0", new Object[]{str, str2, list, list2});
        } else {
            sPool.schedule(new Runnable() { // from class: tb.k0j
                @Override // java.lang.Runnable
                public final void run() {
                    MonitorUtil.lambda$register$6(str, str2, list2, list);
                }
            }, 0L, TimeUnit.MILLISECONDS);
        }
    }

    public static void commitFail(final String str, final String str2, final String str3, final String str4, final String str5) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("49c1ffee", new Object[]{str, str2, str3, str4, str5});
        } else {
            sPool.schedule(new Runnable() { // from class: tb.h0j
                @Override // java.lang.Runnable
                public final void run() {
                    MonitorUtil.lambda$commitFail$3(str, str2, str3, str4, str5);
                }
            }, 0L, TimeUnit.MILLISECONDS);
        }
    }

    public static void commitSuccess(final String str, final String str2, final String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d3416f1", new Object[]{str, str2, str3});
        } else {
            sPool.schedule(new Runnable() { // from class: tb.f0j
                @Override // java.lang.Runnable
                public final void run() {
                    MonitorUtil.lambda$commitSuccess$1(str, str2, str3);
                }
            }, 0L, TimeUnit.MILLISECONDS);
        }
    }

    static {
        ScheduledExecutorService scheduledExecutorService;
        t2o.a(529531009);
        if (Coordinator.isUseVThread()) {
            scheduledExecutorService = Coordinator.createScheduledExecutorService(1, "msg-async-monitor");
        } else {
            scheduledExecutorService = new ScheduledThreadPoolExecutor(1, new ThreadFactory() { // from class: com.taobao.message.kit.util.MonitorUtil.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.util.concurrent.ThreadFactory
                public Thread newThread(Runnable runnable) {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        return (Thread) ipChange.ipc$dispatch("d8079a58", new Object[]{this, runnable});
                    }
                    return new Thread(runnable, "msg-async-monitor:-0");
                }
            });
        }
        if (scheduledExecutorService instanceof ThreadPoolExecutor) {
            ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) scheduledExecutorService;
            threadPoolExecutor.setMaximumPoolSize(1);
            if (!(ApplicationUtil.getApplication() != null ? Coordinator.setupTimeout(scheduledExecutorService) : false)) {
                threadPoolExecutor.setKeepAliveTime(60000L, TimeUnit.MILLISECONDS);
                try {
                    ((ThreadPoolExecutor) scheduledExecutorService).allowCoreThreadTimeOut(true);
                } catch (IllegalArgumentException e) {
                    TLog.loge("MsgAsyncMonitor", e.toString());
                }
            }
        }
        sPool = scheduledExecutorService;
    }
}
