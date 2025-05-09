package tb;

import android.text.TextUtils;
import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.search.sf.util.tlog.TLogTracker;
import com.taobao.tlog.adapter.AdapterForTLog;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class ogh {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static boolean f25375a = true;

    static {
        t2o.a(961544375);
    }

    public static String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a01b9a89", new Object[]{str});
        }
        return "EVO." + str;
    }

    public static boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e1018317", new Object[0])).booleanValue();
        }
        if (n.j().q() || n.j().r()) {
            return true;
        }
        return false;
    }

    public static boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("184f4e27", new Object[0])).booleanValue();
        }
        if (b()) {
            return true;
        }
        String logLevel = AdapterForTLog.getLogLevel("EVO");
        if (TextUtils.equals("L", logLevel) || TextUtils.equals("V", logLevel)) {
            return false;
        }
        return true;
    }

    public static void d(String str, String str2, String str3, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b1799e2c", new Object[]{str, str2, str3, th});
        } else if (TextUtils.equals(str, "V")) {
            if (b()) {
                a(str2);
            } else if (AdapterForTLog.isValid() && f25375a) {
                AdapterForTLog.logv(a(str2), str3);
            }
        } else if (TextUtils.equals(str, TLogTracker.LEVEL_DEBUG)) {
            if (b()) {
                a(str2);
            } else if (AdapterForTLog.isValid() && f25375a) {
                AdapterForTLog.logd(a(str2), str3);
            }
        } else if (TextUtils.equals(str, TLogTracker.LEVEL_INFO)) {
            if (b()) {
                a(str2);
            } else if (AdapterForTLog.isValid() && f25375a) {
                AdapterForTLog.logi(a(str2), str3);
            }
        } else if (TextUtils.equals(str, "W")) {
            if (b()) {
                a(str2);
            } else if (AdapterForTLog.isValid() && f25375a) {
                AdapterForTLog.logw(a(str2), str3, th);
            }
        } else if (!TextUtils.equals(str, "E")) {
        } else {
            if (b()) {
                Log.e(a(str2), str3, th);
            } else if (AdapterForTLog.isValid() && f25375a) {
                AdapterForTLog.loge(a(str2), str3, th);
            }
        }
    }

    public static void e(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("87e6879b", new Object[]{str, str2});
        } else {
            d(TLogTracker.LEVEL_DEBUG, str, str2, null);
        }
    }

    public static void f(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b212366", new Object[]{str, str2});
            return;
        }
        d(TLogTracker.LEVEL_DEBUG, str, str2, null);
        p("debug", "base", str, str2, null);
    }

    public static void g(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1486b29c", new Object[]{str, str2});
        } else {
            d("E", str, str2, null);
        }
    }

    public static void h(String str, String str2, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24f23ad9", new Object[]{str, str2, th});
        } else {
            d("E", str, str2, th);
        }
    }

    public static void i(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ccac985", new Object[]{str, str2});
            return;
        }
        d("E", str, str2, null);
        p("error", "base", str, str2, null);
    }

    public static void j(String str, String str2, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aceebf90", new Object[]{str, str2, th});
            return;
        }
        d("E", str, str2, th);
        p("error", "base", str, str2, th);
    }

    public static void k(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("72439a85", new Object[]{str, str2});
            return;
        }
        d("E", str, str2, null);
        p("debug", "result", str, str2, null);
    }

    public static void l(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7c9b8ae", new Object[]{str, str2});
        } else {
            d("W", str, str2, null);
        }
    }

    public static void m(String str, String str2, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91561407", new Object[]{str, str2, th});
        } else {
            d("W", str, str2, th);
        }
    }

    public static void n(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab877b3", new Object[]{str, str2});
            return;
        }
        d("W", str, str2, null);
        p("warn", "base", str, str2, null);
    }

    public static void o(String str, String str2, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6015a22", new Object[]{str, str2, th});
            return;
        }
        d("W", str, str2, th);
        p("warn", "base", str, str2, th);
    }

    public static void p(String str, String str2, String str3, String str4, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("992f636", new Object[]{str, str2, str3, str4, th});
        } else if (th != null) {
            iaj k = n.j().k();
            k.i(str, str2, str3, str4 + "\n" + Log.getStackTraceString(th));
        } else {
            n.j().k().i(str, str2, str3, str4);
        }
    }

    public static void q(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea1cb7e", new Object[]{new Boolean(z)});
        } else {
            f25375a = z;
        }
    }
}
