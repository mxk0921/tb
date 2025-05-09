package tb;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.util.LruCache;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.Method;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class a0y {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(921698322);
    }

    public static Object a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("bd3407ca", new Object[0]);
        }
        return new LruCache(16);
    }

    public static String b(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8a5b32dc", new Object[]{obj});
        }
        return ((Context) obj).getApplicationInfo().dataDir;
    }

    public static String c(Object obj, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("93e4ff52", new Object[]{obj, str});
        }
        try {
            return ((Context) obj).getPackageManager().getPackageInfo(str, 0).versionName;
        } catch (Throwable th) {
            th.printStackTrace();
            return "<unknown>";
        }
    }

    public static void d(Object obj, Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("81f832c2", new Object[]{obj, runnable});
        } else {
            ((Handler) obj).post(runnable);
        }
    }

    public static void e(Object obj, Runnable runnable, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd0e9c42", new Object[]{obj, runnable, new Long(j)});
        } else if (j == 0) {
            ((Handler) obj).post(runnable);
        } else {
            ((Handler) obj).postDelayed(runnable, j);
        }
    }

    public static void f(Object obj, String str, Method method) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1d9b4b6", new Object[]{obj, str, method});
        } else {
            ((LruCache) obj).put(str, method);
        }
    }

    public static void g(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{str});
        }
    }

    public static boolean h(Object obj, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("53ab618a", new Object[]{obj, str, new Boolean(z)})).booleanValue();
        }
        return ((Bundle) obj).getBoolean(str, z);
    }

    public static Object i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("43b9c269", new Object[0]);
        }
        Looper myLooper = Looper.myLooper();
        if (myLooper != null) {
            return new Handler(myLooper);
        }
        return null;
    }

    public static String j(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e17923bb", new Object[]{obj});
        }
        return ((Context) obj).getApplicationInfo().nativeLibraryDir;
    }

    public static Method k(Object obj, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Method) ipChange.ipc$dispatch("b5a58f4f", new Object[]{obj, str});
        }
        return (Method) ((LruCache) obj).get(str);
    }

    public static void l(Object obj, Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6739a183", new Object[]{obj, runnable});
        } else {
            ((Handler) obj).removeCallbacks(runnable);
        }
    }

    public static void m(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{str});
        }
    }

    public static String n(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3897149a", new Object[]{obj});
        }
        return ((Context) obj).getPackageName();
    }

    public static void o(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88097eb4", new Object[]{str});
        } else {
            Log.e("jsi", str);
        }
    }

    public static boolean p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[0])).booleanValue();
        }
        if (Build.VERSION.SDK_INT < 23) {
            return true;
        }
        return false;
    }

    public static boolean q(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("84b9de0b", new Object[]{obj})).booleanValue();
        }
        if (obj != null && ((Handler) obj).getLooper() == Looper.myLooper()) {
            return true;
        }
        return false;
    }
}
