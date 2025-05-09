package tb;

import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import android.text.TextUtils;
import com.alibaba.ariver.kernel.common.utils.ProcessUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.Method;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class d51 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static String a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7512d303", new Object[]{context});
        }
        int myPid = Process.myPid();
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        if (activityManager == null) {
            return "";
        }
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : activityManager.getRunningAppProcesses()) {
            if (runningAppProcessInfo.pid == myPid) {
                return runningAppProcessInfo.processName;
            }
        }
        return "";
    }

    public static String b(Context context) {
        try {
            Class<?> cls = Class.forName(ProcessUtils.ACTIVITY_THREAD);
            return (String) cls.getMethod(ProcessUtils.GET_PROCESS_NAME, new Class[0]).invoke(cls.getMethod(ProcessUtils.CURRENT_ACTIVITY_THREAD, new Class[0]).invoke(null, new Object[0]), new Object[0]);
        } catch (Exception unused) {
            return a(context);
        }
    }

    public static String c(Context context) {
        String processName;
        if (Build.VERSION.SDK_INT >= 28) {
            processName = Application.getProcessName();
            return processName;
        }
        try {
            Method declaredMethod = Class.forName(ProcessUtils.ACTIVITY_THREAD).getDeclaredMethod("currentProcessName", new Class[0]);
            declaredMethod.setAccessible(true);
            return (String) declaredMethod.invoke(null, new Object[0]);
        } catch (Throwable unused) {
            return a(context);
        }
    }

    public static boolean d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8b19de7c", new Object[]{str})).booleanValue();
        }
        if (TextUtils.isEmpty(str) || !str.endsWith(":fixdoat")) {
            return false;
        }
        return true;
    }

    public static boolean e() {
        try {
            Method declaredMethod = Process.class.getDeclaredMethod("isIsolated", new Class[0]);
            if (declaredMethod != null) {
                declaredMethod.setAccessible(true);
                Object invoke = declaredMethod.invoke(null, new Object[0]);
                if (invoke instanceof Boolean) {
                    return ((Boolean) invoke).booleanValue();
                }
            }
        } catch (Throwable unused) {
        }
        if (Process.myUid() % 100000 >= 99000) {
            return true;
        }
        return false;
    }

    public static void f(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb9682e8", new Object[]{runnable});
            return;
        }
        try {
            runnable.run();
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}
