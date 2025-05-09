package com.alibaba.ariver.kernel.common.utils;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import com.alibaba.ariver.kernel.common.RVProxy;
import com.alibaba.ariver.kernel.common.service.RVEnvironmentService;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class ProcessUtils {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ACTIVITY_THREAD = "android.app.ActivityThread";
    public static final String CURRENT_ACTIVITY_THREAD = "currentActivityThread";
    public static final String GET_PROCESS_NAME = "getProcessName";

    /* renamed from: a  reason: collision with root package name */
    public static Boolean f2440a;
    public static Boolean b;
    public static Context c;
    public static String d;

    public static Context getContext() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("e1727078", new Object[0]);
        }
        Context context = c;
        if (context != null) {
            return context;
        }
        RVEnvironmentService rVEnvironmentService = (RVEnvironmentService) RVProxy.get(RVEnvironmentService.class);
        if (rVEnvironmentService != null) {
            return rVEnvironmentService.getApplicationContext();
        }
        return null;
    }

    public static int getPid() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1b4ab44f", new Object[0])).intValue();
        }
        return Process.myPid();
    }

    public static String getProcessName() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("62fd1115", new Object[0]);
        }
        try {
            str = d;
        } catch (Exception e) {
            RVLogger.e("AriverKernel", "getProcessName error", e);
        }
        if (str != null && str.length() > 0) {
            return d;
        }
        d = (String) ReflectUtils.invokeMethod(ReflectUtils.invokeMethod(ACTIVITY_THREAD, CURRENT_ACTIVITY_THREAD), GET_PROCESS_NAME);
        RVLogger.d("AriverKernel", "getProcessName from ActivityThread: " + d);
        if (d == null) {
            Context context = getContext();
            if (context == null) {
                return null;
            }
            int myPid = Process.myPid();
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : ((ActivityManager) context.getSystemService("activity")).getRunningAppProcesses()) {
                if (runningAppProcessInfo.pid == myPid) {
                    d = runningAppProcessInfo.processName;
                }
            }
        }
        return d;
    }

    public static boolean isInTestProcess() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3ecc0f99", new Object[0])).booleanValue();
        }
        return "robolectric".equalsIgnoreCase(Build.MODEL);
    }

    public static boolean isMainProcess() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("97b74977", new Object[0])).booleanValue();
        }
        if (isInTestProcess()) {
            return true;
        }
        if (f2440a == null) {
            Context context = getContext();
            if (context == null) {
                RVLogger.w("AriverKernel", "Context is null in isMainProcess()");
                return true;
            }
            String processName = getProcessName();
            f2440a = Boolean.valueOf(TextUtils.equals(processName, context.getPackageName()));
            RVLogger.d("AriverKernel", "isMainProcess " + f2440a + " processName: " + processName + " stack: " + Log.getStackTraceString(new Throwable("Just Print!")));
        }
        return f2440a.booleanValue();
    }

    public static boolean isTinyProcess() {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("18d6b9d0", new Object[0])).booleanValue();
        }
        if (b == null) {
            String processName = getProcessName();
            if (!TextUtils.isEmpty(processName) && processName.contains("lite")) {
                z = true;
            }
            b = Boolean.valueOf(z);
        }
        return b.booleanValue();
    }

    public static void setAppContext(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff0c5cd1", new Object[]{context});
        } else {
            c = context;
        }
    }
}
