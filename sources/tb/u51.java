package tb;

import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.os.Build;
import android.os.PowerManager;
import android.os.Process;
import android.text.TextUtils;
import com.alibaba.ariver.kernel.common.utils.ProcessUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class u51 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static Boolean f29147a = null;
    public static String b = null;
    public static Map<String, String> c = null;

    static {
        t2o.a(962592971);
    }

    public static String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c9396be5", new Object[0]);
        }
        return o2w.k().d();
    }

    public static String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3babe84c", new Object[0]);
        }
        return o2w.k().e();
    }

    public static String c(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("19e68b08", new Object[]{context});
        }
        Map<String, String> f = f(context);
        if (f != null) {
            return f.get("preLoad_Channel2");
        }
        return null;
    }

    public static String d(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("86b9d1cf", new Object[]{context});
        }
        String str = b;
        if (str != null) {
            return str;
        }
        if (context == null) {
            return "";
        }
        String g = g(context);
        b = g;
        return g;
    }

    public static String e() throws Throwable {
        Method declaredMethod = Class.forName(ProcessUtils.ACTIVITY_THREAD, false, Application.class.getClassLoader()).getDeclaredMethod("currentProcessName", new Class[0]);
        declaredMethod.setAccessible(true);
        Object invoke = declaredMethod.invoke(null, new Object[0]);
        if (invoke instanceof String) {
            return (String) invoke;
        }
        return null;
    }

    public static String g(Context context) {
        String processName;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f6192cca", new Object[]{context});
        }
        if (Build.VERSION.SDK_INT >= 28) {
            processName = Application.getProcessName();
            return processName;
        }
        try {
            try {
                return e();
            } catch (Throwable unused) {
                return h(context);
            }
        } catch (Throwable unused2) {
            return "";
        }
    }

    public static String h(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("28b891ab", new Object[]{context});
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

    public static String i(Context context, String str) {
        int identifier;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("44e9ea5c", new Object[]{context, str});
        }
        if (context == null) {
            return null;
        }
        try {
            Resources resources = context.getResources();
            if (!(resources == null || (identifier = resources.getIdentifier(str, "string", context.getPackageName())) == 0)) {
                return context.getString(identifier);
            }
        } catch (Throwable unused) {
        }
        return null;
    }

    public static boolean k(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d915192f", new Object[]{context})).booleanValue();
        }
        String d = d(context);
        if (d == null || !d.endsWith(":channel")) {
            return false;
        }
        return true;
    }

    public static boolean l(Context context) {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("42bb9b9", new Object[]{context})).booleanValue();
        }
        Boolean bool = f29147a;
        if (bool != null) {
            return bool.booleanValue();
        }
        if (context == null) {
            return true;
        }
        try {
            String str = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).applicationInfo.processName;
            String d = d(context);
            if (TextUtils.isEmpty(str) || TextUtils.isEmpty(d)) {
                z = true;
            } else {
                z = d.equalsIgnoreCase(str);
            }
            Boolean valueOf = Boolean.valueOf(z);
            f29147a = valueOf;
            return valueOf.booleanValue();
        } catch (Throwable unused) {
            return true;
        }
    }

    public static boolean m(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3f415db5", new Object[]{context})).booleanValue();
        }
        if (context == null) {
            return false;
        }
        try {
            String packageName = context.getPackageName();
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : ((ActivityManager) context.getSystemService("activity")).getRunningAppProcesses()) {
                nhh.f("AppInfoUtil", "appProcess.processName", runningAppProcessInfo.processName);
                if (runningAppProcessInfo.processName.equals(packageName)) {
                    return false;
                }
            }
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static Map<String, String> f(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("d82f20f8", new Object[]{context});
        }
        Map<String, String> map = c;
        if (map != null) {
            return map;
        }
        if (context == null) {
            nhh.i("AppInfoUtil", "getInfoForPreApk context is null");
            return null;
        }
        c = new HashMap();
        try {
            SharedPreferences sharedPreferences = context.getSharedPreferences("manufacture_config", 0);
            boolean z = sharedPreferences.getBoolean(a7m.PRE_LOAD, false);
            String string = sharedPreferences.getString("preLoad_VersionName", "");
            String string2 = sharedPreferences.getString("preLoad_Channel1", "");
            String string3 = sharedPreferences.getString("preLoad_Channel2", "");
            if (z) {
                c.put(a7m.PRE_LOAD, "true");
                c.put("preLoad_VersionName", string);
                c.put("preLoad_Channel1", string2);
                c.put("preLoad_Channel2", string3);
            }
        } catch (Exception e) {
            nhh.h("AppInfoUtil", e, new Object[0]);
        }
        nhh.f("AppInfoUtil", "getInfoForPreApk preInfoMap", c);
        return c;
    }

    @Deprecated
    public static boolean j(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2e58450c", new Object[]{context})).booleanValue();
        }
        if (context == null) {
            return false;
        }
        try {
            PowerManager powerManager = (PowerManager) context.getSystemService("power");
            String packageName = context.getPackageName();
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : ((ActivityManager) context.getSystemService("activity")).getRunningAppProcesses()) {
                nhh.f("AppInfoUtil", "appProcess.processName", runningAppProcessInfo.processName, "appProcess.importance", Integer.valueOf(runningAppProcessInfo.importance));
                if (runningAppProcessInfo.processName.equals(packageName)) {
                    int i = runningAppProcessInfo.importance;
                    if (!(i == 400 || i == 125)) {
                        if (powerManager.isScreenOn()) {
                            return true;
                        }
                    }
                    return false;
                }
            }
        } catch (Throwable unused) {
        }
        return true;
    }
}
