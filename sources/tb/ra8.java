package tb;

import android.app.ActivityManager;
import android.app.ActivityThread;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class ra8 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static volatile String f27226a;
    public static ActivityManager b;
    public static volatile Boolean c;
    public static final Map<String, Class<?>> d = new ConcurrentHashMap();
    public static final Map<String, Method> e = new ConcurrentHashMap();

    public static String a(Class<?> cls, String str, Class<?>[] clsArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("33d9ef01", new Object[]{cls, str, clsArr});
        }
        StringBuilder sb = new StringBuilder(cls.getName());
        sb.append("#");
        sb.append(str);
        if (clsArr != null) {
            for (Class<?> cls2 : clsArr) {
                sb.append(",");
                sb.append(cls2.getName());
            }
        }
        return sb.toString();
    }

    public static String b(Context context) {
        String processName;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("cdc92c4b", new Object[]{context});
        }
        if (TextUtils.isEmpty(f27226a)) {
            String b2 = pa8.b();
            if (!TextUtils.isEmpty(b2)) {
                f27226a = b2;
            } else if (Build.VERSION.SDK_INT >= 28) {
                processName = Application.getProcessName();
                f27226a = processName;
            } else {
                f27226a = ActivityThread.currentProcessName();
            }
            if (TextUtils.isEmpty(f27226a)) {
                f27226a = c(context, Process.myPid());
            }
        }
        return f27226a;
    }

    public static String c(Context context, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6ec675fa", new Object[]{context, new Integer(i)});
        }
        try {
            if (b == null) {
                b = (ActivityManager) context.getSystemService("activity");
            }
            List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = b.getRunningAppProcesses();
            if (runningAppProcesses == null || runningAppProcesses.size() <= 0) {
                return "";
            }
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                if (runningAppProcessInfo.pid == i) {
                    return runningAppProcessInfo.processName;
                }
            }
            return "";
        } catch (Exception unused) {
            return "";
        }
    }

    public static Object d(String str, String str2, Class<?>[] clsArr, Object... objArr) throws Exception {
        Method declaredMethod;
        if (str == null || str2 == null) {
            throw new IllegalArgumentException("className and methodName cannot be null");
        }
        Map<String, Class<?>> map = d;
        Class<?> cls = (Class) ((ConcurrentHashMap) map).get(str);
        if (cls == null) {
            try {
                cls = Class.forName(str);
                ((ConcurrentHashMap) map).put(str, cls);
            } catch (ClassNotFoundException e2) {
                throw new RuntimeException("Class not found: ".concat(str), e2);
            }
        }
        String a2 = a(cls, str2, clsArr);
        Map<String, Method> map2 = e;
        Method method = (Method) ((ConcurrentHashMap) map2).get(a2);
        if (method == null) {
            try {
                if (clsArr != null) {
                    declaredMethod = cls.getDeclaredMethod(str2, clsArr);
                } else {
                    declaredMethod = cls.getDeclaredMethod(str2, new Class[0]);
                }
                method = declaredMethod;
                ((ConcurrentHashMap) map2).put(a2, method);
            } catch (NoSuchMethodException e3) {
                throw new RuntimeException("Method not found: " + a2, e3);
            }
        }
        method.setAccessible(true);
        if (objArr != null) {
            return method.invoke(null, objArr);
        }
        return method.invoke(null, new Object[0]);
    }

    public static boolean e(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("42bb9b9", new Object[]{context})).booleanValue();
        }
        if (context == null) {
            return true;
        }
        if (c != null) {
            return c.booleanValue();
        }
        c = Boolean.valueOf(context.getPackageName().equals(b(context)));
        return c.booleanValue();
    }

    public static void f(String str, String str2, Class<?>[] clsArr) {
        Method method;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("912396c1", new Object[]{str, str2, clsArr});
            return;
        }
        Map<String, Class<?>> map = d;
        Class<?> cls = (Class) ((ConcurrentHashMap) map).get(str);
        if (cls == null) {
            try {
                cls = Class.forName(str);
                ((ConcurrentHashMap) map).put(str, cls);
            } catch (Exception e2) {
                la8.b("elastic.Utils", "[putStaticMethod] clazz error.", e2, new Object[0]);
                return;
            }
        }
        String a2 = a(cls, str2, clsArr);
        Map<String, Method> map2 = e;
        if (((Method) ((ConcurrentHashMap) map2).get(a2)) == null) {
            try {
                if (clsArr != null) {
                    method = cls.getDeclaredMethod(str2, clsArr);
                } else {
                    method = cls.getDeclaredMethod(str2, new Class[0]);
                }
                ((ConcurrentHashMap) map2).put(a2, method);
            } catch (Exception e3) {
                la8.b("elastic.Utils", "[putStaticMethod] method error.", e3, new Object[0]);
            }
        }
    }
}
