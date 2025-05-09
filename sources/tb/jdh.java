package tb;

import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Locale;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class jdh {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int ASSERT = 7;
    public static final int DEBUG = 3;
    public static final int ERROR = 6;
    public static final int INFO = 4;
    public static final int VERBOSE = 2;
    public static final int WARN = 5;

    public static void a(String str, String str2, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ddc61b1", new Object[]{str, str2, objArr});
            return;
        }
        String b = b(str2, objArr);
        Throwable e = e(objArr);
        if (e != null) {
            Log.e(str, b, e);
        } else {
            Log.e(str, b);
        }
    }

    public static String b(String str, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b7abe92d", new Object[]{str, objArr});
        }
        if (objArr == null || objArr.length == 0) {
            return str;
        }
        return String.format(Locale.US, str, objArr);
    }

    public static String c(String str, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("79c00b75", new Object[]{str, objArr});
        }
        return "[" + d() + "] " + b(str, objArr);
    }

    public static String d() {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c653741f", new Object[0]);
        }
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        String name = jdh.class.getName();
        while (true) {
            if (i >= stackTrace.length) {
                break;
            } else if (stackTrace[i].getClassName().equals(name)) {
                i += 4;
                break;
            } else {
                i++;
            }
        }
        return stackTrace[i].getFileName() + ":" + stackTrace[i].getLineNumber();
    }

    public static Throwable e(Object[] objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Throwable) ipChange.ipc$dispatch("a3022770", new Object[]{objArr});
        }
        if (objArr == null || objArr.length == 0) {
            return null;
        }
        Object obj = objArr[objArr.length - 1];
        if (!(obj instanceof Throwable)) {
            return null;
        }
        return (Throwable) obj;
    }

    public static void f(String str, String str2, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("25eb8f2d", new Object[]{str, str2, objArr});
            return;
        }
        b(str2, objArr);
        e(objArr);
    }

    public static boolean g(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("70d521ef", new Object[]{str, new Integer(i)})).booleanValue();
        }
        return Log.isLoggable(str, i);
    }

    public static void h(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("625b1491", new Object[]{str, str2});
        } else {
            l(str, str2, new Object[0]);
        }
    }

    public static void i(String str, String str2, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a403622d", new Object[]{str, str2, obj});
        } else {
            l(str, str2, obj);
        }
    }

    public static void j(String str, String str2, Object obj, Object obj2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ee600c9", new Object[]{str, str2, obj, obj2});
        } else {
            l(str, str2, obj, obj2);
        }
    }

    public static void k(String str, String str2, Object obj, Object obj2, Object obj3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6170b065", new Object[]{str, str2, obj, obj2, obj3});
        } else {
            l(str, str2, obj, obj2, obj3);
        }
    }

    public static void l(String str, String str2, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a5d5274", new Object[]{str, str2, objArr});
        } else if (g(str, 2)) {
            String c = c(str2, objArr);
            Throwable e = e(objArr);
            if (e != null) {
                Log.e(str, c, e);
            } else {
                Log.e(str, c);
            }
        }
    }

    public static void m(String str, String str2, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7a20ae5f", new Object[]{str, str2, objArr});
            return;
        }
        b(str2, objArr);
        e(objArr);
    }
}
