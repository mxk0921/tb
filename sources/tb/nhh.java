package tb;

import android.text.TextUtils;
import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class nhh {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final String f24737a = "Analytics";
    public static boolean b = false;
    public static final boolean c = true;
    public static aoc d = null;

    static {
        t2o.a(962592993);
    }

    public static String a(String str, Map<String, String> map) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5ce719b7", new Object[]{str, map});
        }
        if (str == null && map == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        if (str == null) {
            str = "-";
        }
        sb.append("[" + str + "] ");
        if (map != null) {
            int size = map.size();
            for (Map.Entry<String, String> entry : map.entrySet()) {
                sb.append(entry.getKey() + " : " + entry.getValue());
                i++;
                if (i < size) {
                    sb.append(",");
                }
            }
        }
        return sb.toString();
    }

    public static String b(String str, Object... objArr) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fe17598b", new Object[]{str, objArr});
        }
        if (str == null && objArr == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        if (str == null) {
            str = "-";
        }
        sb.append("[" + str + "] ");
        if (objArr != null) {
            int length = objArr.length;
            while (true) {
                int i2 = i + 1;
                if (i2 >= objArr.length) {
                    break;
                }
                sb.append(j(objArr[i], objArr[i2]));
                if (i2 < length - 1) {
                    sb.append(",");
                }
                i += 2;
            }
            if (i == objArr.length - 1) {
                sb.append(objArr[i]);
            }
        }
        return sb.toString();
    }

    public static String c() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1c2bdbb5", new Object[0]);
        }
        if (!b) {
            return f24737a;
        }
        StackTraceElement k = k();
        String str2 = "";
        if (k != null) {
            String className = k.getClassName();
            if (!TextUtils.isEmpty(className)) {
                str2 = className.substring(className.lastIndexOf(46) + 1);
            }
            str = k.getMethodName();
        } else {
            str = str2;
        }
        return "Analytics." + str2 + "." + str;
    }

    public static void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[0]);
        } else if (p(4)) {
            d.logd(c(), b(null, new Object[0]));
        } else if (o()) {
            c();
            b(null, new Object[0]);
        }
    }

    public static void e(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("443f3af0", new Object[]{str, map});
        } else if (p(4)) {
            d.logd(c(), a(str, map));
        } else if (o()) {
            c();
            a(str, map);
        }
    }

    public static void f(String str, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("98f7bd1c", new Object[]{str, objArr});
        } else if (p(4)) {
            d.logd(c(), b(str, objArr));
        } else if (o()) {
            c();
            b(str, objArr);
        }
    }

    public static void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[0]);
        } else if (p(1)) {
            d.loge(c(), b(null, new Object[0]));
        } else if (o()) {
            Log.e(c(), b(null, new Object[0]));
        }
    }

    public static void h(String str, Throwable th, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("11662452", new Object[]{str, th, objArr});
        } else if (p(1)) {
            d.loge(c(), b(str, objArr), th);
        } else if (o()) {
            Log.e(c(), b(str, objArr), th);
        }
    }

    public static void i(String str, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a05cf23b", new Object[]{str, objArr});
        } else if (p(1)) {
            d.loge(c(), b(str, objArr));
        } else if (o()) {
            Log.e(c(), b(str, objArr));
        }
    }

    public static String j(Object obj, Object obj2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4425a33f", new Object[]{obj, obj2});
        }
        if (obj == null) {
            obj = "";
        }
        if (obj2 == null) {
            obj2 = "";
        }
        return String.format("%s:%s", obj, obj2);
    }

    public static StackTraceElement k() {
        StackTraceElement[] stackTrace;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (StackTraceElement) ipChange.ipc$dispatch("62bf0b00", new Object[0]);
        }
        if (!b) {
            return null;
        }
        try {
            for (StackTraceElement stackTraceElement : Thread.currentThread().getStackTrace()) {
                if (!stackTraceElement.isNativeMethod() && !stackTraceElement.getClassName().equals(Thread.class.getName()) && !stackTraceElement.getClassName().equals(nhh.class.getName())) {
                    return stackTraceElement;
                }
            }
        } catch (Throwable unused) {
        }
        return null;
    }

    public static void l(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2adc4a0b", new Object[]{str, map});
        } else if (p(3)) {
            d.logi(c(), a(str, map));
        } else if (o()) {
            c();
            a(str, map);
        }
    }

    public static void m(String str, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bdf1c6b7", new Object[]{str, objArr});
        } else if (p(3)) {
            d.logi(c(), b(str, objArr));
        } else if (o()) {
            c();
            b(str, objArr);
        }
    }

    public static boolean n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3a59fb54", new Object[0])).booleanValue();
        }
        return b;
    }

    public static boolean o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c81236fa", new Object[0])).booleanValue();
        }
        return b;
    }

    public static boolean p(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ac65d8c4", new Object[]{new Integer(i)})).booleanValue();
        }
        aoc aocVar = d;
        if (aocVar == null || !aocVar.isValid() || i >= d.getLogLevel()) {
            return false;
        }
        return true;
    }

    public static void q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c9d40258", new Object[0]);
        } else if (c) {
            d();
        }
    }

    public static void r(String str, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("955c7dcf", new Object[]{str, objArr});
        } else if (c) {
            f(str, objArr);
        }
    }

    public static void s(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("abe02abc", new Object[]{new Boolean(z)});
        } else {
            b = z;
        }
    }

    public static void t(aoc aocVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("169d3a57", new Object[]{aocVar});
        } else {
            d = aocVar;
        }
    }

    public static void u(String str, Throwable th, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("317d70e4", new Object[]{str, th, objArr});
        } else if (p(2)) {
            d.logw(c(), b(str, objArr), th);
        } else if (o()) {
            c();
            b(str, objArr);
        }
    }

    public static void v(String str, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("257aae69", new Object[]{str, objArr});
        } else if (p(2)) {
            d.logw(c(), b(str, objArr));
        } else if (o()) {
            c();
            b(str, objArr);
        }
    }
}
