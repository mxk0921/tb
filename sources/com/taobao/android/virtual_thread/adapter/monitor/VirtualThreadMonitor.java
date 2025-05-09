package com.taobao.android.virtual_thread.adapter.monitor;

import com.alibaba.mtl.appmonitor.AppMonitor;
import com.alibaba.mtl.appmonitor.model.DimensionSet;
import com.alibaba.mtl.appmonitor.model.DimensionValueSet;
import com.alibaba.mtl.appmonitor.model.MeasureSet;
import com.alibaba.mtl.appmonitor.model.MeasureValueSet;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.m;
import com.taobao.android.virtual_thread.VirtualExecutors;
import com.taobao.android.virtual_thread.VirtualThread;
import com.taobao.android.virtual_thread.adapter.monitor.MonitorUtils;
import com.taobao.android.virtual_thread.adapter.monitor.VirtualThreadMonitor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadFactory;
import tb.t2o;
import tb.v4s;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class VirtualThreadMonitor {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String MODULE = "virtual_thread2";
    private static final String MODULE_POINT = "statics";
    private static volatile boolean registered = false;

    static {
        t2o.a(970981392);
    }

    public static void commit(boolean z, String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b8225b4", new Object[]{new Boolean(z), str, str2, str3});
        } else if (registered) {
            AppMonitor.Stat.commit(MODULE, "statics", DimensionValueSet.create().setValue("fromThread", str).setValue(m.THREAD_NAME, str2).setValue(v4s.PARAM_UPLOAD_STAGE, str3).setValue("isVirtual", String.valueOf(z)), MeasureValueSet.create());
        }
    }

    public static void doRegister() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("496191d5", new Object[0]);
            return;
        }
        AppMonitor.register(MODULE, "statics", MeasureSet.create(), DimensionSet.create().addDimension("fromThread").addDimension(m.THREAD_NAME).addDimension(v4s.PARAM_UPLOAD_STAGE).addDimension("isVirtual"));
        final ExecutorService newSingleVirtualThreadExecutor = VirtualExecutors.newSingleVirtualThreadExecutor(new ThreadFactory() { // from class: tb.wiw
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                Thread lambda$doRegister$0;
                lambda$doRegister$0 = VirtualThreadMonitor.lambda$doRegister$0(runnable);
                return lambda$doRegister$0;
            }
        });
        MonitorUtils.d(new MonitorUtils.MonitorListener() { // from class: tb.xiw
            @Override // com.taobao.android.virtual_thread.adapter.monitor.MonitorUtils.MonitorListener
            public final void onMonitor(boolean z, String str, String str2) {
                VirtualThreadMonitor.lambda$doRegister$2(newSingleVirtualThreadExecutor, z, str, str2);
            }
        });
        registered = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Thread lambda$doRegister$0(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Thread) ipChange.ipc$dispatch("c3b2a1ab", new Object[]{runnable});
        }
        return new VirtualThread(runnable, "vt-monitor");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$doRegister$2(ExecutorService executorService, final boolean z, final String str, final String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e899ce3", new Object[]{executorService, new Boolean(z), str, str2});
            return;
        }
        final String name = Thread.currentThread().getName();
        if (!str.startsWith("AppMonitor:")) {
            executorService.execute(new Runnable() { // from class: tb.viw
                @Override // java.lang.Runnable
                public final void run() {
                    VirtualThreadMonitor.lambda$null$1(z, name, str, str2);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$null$1(boolean z, String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e4cdeda", new Object[]{new Boolean(z), str, str2, str3});
        } else {
            commit(z, str, str2, str3);
        }
    }
}
