package tb;

import android.app.ActivityManager;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.a;
import com.taobao.orange.util.OLog;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class cw0 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static String f17363a = "";
    public static String b = "";
    public static volatile long c = -1;

    static {
        t2o.a(613417111);
    }

    public static boolean a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("32c6e21e", new Object[]{context})).booleanValue();
        }
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : ((ActivityManager) context.getSystemService("activity")).getRunningAppProcesses()) {
            try {
            } catch (Throwable th) {
                OLog.e("AndroidUtil", "checkTaoChannelProcessAlive error", th, new Object[0]);
            }
            if ("com.taobao.taobao:channel".equals(runningAppProcessInfo.processName)) {
                a.e = true;
                return true;
            }
            continue;
        }
        return false;
    }

    public static String b(Context context, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6ec675fa", new Object[]{context, new Integer(i)});
        }
        String str = "";
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : ((ActivityManager) context.getSystemService("activity")).getRunningAppProcesses()) {
            try {
                if (runningAppProcessInfo.pid == i) {
                    str = runningAppProcessInfo.processName;
                }
                if (f17363a.equals(runningAppProcessInfo.processName)) {
                    a.c = true;
                    OLog.e("AndroidUtil", "getProcessName: " + a.c, new Object[0]);
                }
                if ("com.taobao.taobao:channel".equals(runningAppProcessInfo.processName)) {
                    a.e = true;
                }
            } catch (Exception unused) {
            }
        }
        return str;
    }

    public static long c() {
        long startUptimeMillis;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("333a0620", new Object[0])).longValue();
        }
        if (c != -1) {
            return c;
        }
        try {
            if (Build.VERSION.SDK_INT >= 24) {
                long currentTimeMillis = System.currentTimeMillis();
                long uptimeMillis = SystemClock.uptimeMillis();
                startUptimeMillis = Process.getStartUptimeMillis();
                c = currentTimeMillis - (uptimeMillis - startUptimeMillis);
            } else {
                c = c21.g().getLong("startProcessSystemTime", 0L);
            }
        } catch (Throwable th) {
            OLog.e("AndroidUtil", "getProcessStartSystemTime error", th, new Object[0]);
        }
        return c;
    }

    public static boolean e(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1e6e0580", new Object[]{context})).booleanValue();
        }
        if (context != null) {
            try {
                NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
                if (activeNetworkInfo != null) {
                    return activeNetworkInfo.isAvailable();
                }
            } catch (Throwable unused) {
            }
        }
        return false;
    }

    public static boolean f(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ea4adea1", new Object[]{context})).booleanValue();
        }
        return g(context, false);
    }

    public static boolean h(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f0c561b7", new Object[]{context})).booleanValue();
        }
        if (context == null) {
            return false;
        }
        String packageName = context.getPackageName();
        if ("com.taobao.taobao".equals(packageName) || "com.tmall.wireless".equals(packageName)) {
            return true;
        }
        return false;
    }

    public static void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1aee1357", new Object[0]);
            return;
        }
        try {
            Process.setThreadPriority(2);
        } catch (Throwable th) {
            OLog.e("AndroidUtil", "setThreadPriority", th, new Object[0]);
        }
    }

    public static boolean d(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("42bb9b9", new Object[]{context})).booleanValue();
        }
        if (context == null) {
            return true;
        }
        try {
            if (TextUtils.isEmpty(f17363a)) {
                String str = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).applicationInfo.processName;
                f17363a = str;
                OLog.d("AndroidUtil", "isMainProcess", "mainProcessName", str);
            }
            if (TextUtils.isEmpty(b)) {
                String b2 = b(context, Process.myPid());
                b = b2;
                OLog.d("AndroidUtil", "isMainProcess", "currentProcessName", b2);
            }
            if (TextUtils.isEmpty(f17363a) || TextUtils.isEmpty(b)) {
                return true;
            }
            return f17363a.equalsIgnoreCase(b);
        } catch (Throwable th) {
            OLog.e("AndroidUtil", "isMainProcess", th, new Object[0]);
            return true;
        }
    }

    public static boolean g(Context context, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5f11a7db", new Object[]{context, new Boolean(z)})).booleanValue();
        }
        try {
            if (TextUtils.isEmpty(f17363a) || z) {
                String str = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).applicationInfo.processName;
                f17363a = str;
                OLog.e("AndroidUtil", "isMainProcess", "mainProcessName", str);
            }
            if (TextUtils.isEmpty(b) || z) {
                b = b(context, Process.myPid());
                OLog.e("AndroidUtil", "currentProcess:" + b, new Object[0]);
            }
        } catch (Throwable th) {
            OLog.e("AndroidUtil", "isTaobaoChannelProcess", th.toString());
        }
        return "com.taobao.taobao:channel".equals(b);
    }
}
