package tb;

import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.search.sf.util.tlog.TLogTracker;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class thh {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("V", 5);
        hashMap.put(TLogTracker.LEVEL_DEBUG, 4);
        hashMap.put(TLogTracker.LEVEL_INFO, 3);
        hashMap.put("W", 2);
        hashMap.put("E", 1);
        hashMap.put("L", 0);
    }

    public static String a(String str, Object... objArr) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fe17598b", new Object[]{str, objArr});
        }
        String str2 = "";
        if (str == null && objArr == null) {
            return str2;
        }
        StringBuilder sb = new StringBuilder();
        StackTraceElement g = g();
        if (g != null) {
            str2 = g.getMethodName();
        }
        sb.append("[" + str2 + "]");
        if (str != null) {
            sb.append(" ");
            sb.append(str);
        }
        if (objArr != null) {
            while (true) {
                int i2 = i + 1;
                if (i2 >= objArr.length) {
                    break;
                }
                sb.append(",");
                sb.append(f(objArr[i], objArr[i2]));
                i += 2;
            }
            if (i == objArr.length - 1) {
                sb.append(",");
                sb.append(objArr[i]);
            }
        }
        return sb.toString();
    }

    public static String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1c2bdbb5", new Object[0]);
        }
        return c("Analytics.ut4aplus.");
    }

    public static String c(String str) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("774883eb", new Object[]{str});
        }
        if (TextUtils.isEmpty(str)) {
            str = "Analytics.ut4aplus";
        }
        StackTraceElement g = g();
        if (g != null) {
            String className = g.getClassName();
            if (!TextUtils.isEmpty(className)) {
                str2 = className.substring(className.lastIndexOf(46) + 1);
                return str + str2 + "." + String.valueOf(Process.myPid()) + "." + (Thread.currentThread().getId() + "");
            }
        }
        str2 = "";
        return str + str2 + "." + String.valueOf(Process.myPid()) + "." + (Thread.currentThread().getId() + "");
    }

    public static void d(String str, Object... objArr) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("98f7bd1c", new Object[]{str, objArr});
        } else if (i()) {
            try {
                String a2 = a(str, objArr);
                if (TextUtils.isEmpty(a2) || a2.length() <= 2048) {
                    b();
                } else {
                    int length = a2.length();
                    int i2 = 2048;
                    while (true) {
                        b();
                        a2.substring(i, i2);
                        int i3 = i2 + 2048;
                        if (i3 > length) {
                            i3 = length;
                        }
                        if (i2 == i3) {
                            break;
                        }
                        i2 = i3;
                        i = i2;
                    }
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    public static void e(String str, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a05cf23b", new Object[]{str, objArr});
        } else if (i()) {
            Log.e(b(), a(str, objArr));
        }
    }

    public static String f(Object obj, Object obj2) {
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

    public static StackTraceElement g() {
        StackTraceElement[] stackTrace;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (StackTraceElement) ipChange.ipc$dispatch("62bf0b00", new Object[0]);
        }
        for (StackTraceElement stackTraceElement : Thread.currentThread().getStackTrace()) {
            if (!stackTraceElement.isNativeMethod() && !stackTraceElement.getClassName().equals(Thread.class.getName()) && !stackTraceElement.getClassName().equals(thh.class.getName())) {
                return stackTraceElement;
            }
        }
        return null;
    }

    public static void h(String str, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bdf1c6b7", new Object[]{str, objArr});
        } else if (i()) {
            b();
            a(str, objArr);
        }
    }

    public static boolean i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3a59fb54", new Object[0])).booleanValue();
        }
        return false;
    }

    public static void j(String str, Throwable th, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("317d70e4", new Object[]{str, th, objArr});
        } else if (i()) {
            b();
            a(str, objArr);
        }
    }

    public static void k(String str, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("257aae69", new Object[]{str, objArr});
        } else if (i()) {
            b();
            a(str, objArr);
        }
    }
}
