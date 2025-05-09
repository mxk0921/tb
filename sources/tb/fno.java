package tb;

import android.content.Context;
import android.content.SharedPreferences;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class fno {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(511705648);
    }

    public static boolean a(Context context, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a720237f", new Object[]{context, str, new Boolean(z)})).booleanValue();
        }
        return b(str, z);
    }

    public static boolean b(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a3915235", new Object[]{str, new Boolean(z)})).booleanValue();
        }
        return g().getBoolean(str, z);
    }

    public static SharedPreferences.Editor c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SharedPreferences.Editor) ipChange.ipc$dispatch("4fdc14c7", new Object[0]);
        }
        return g().edit();
    }

    public static int d(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("235381ac", new Object[]{str, new Integer(i)})).intValue();
        }
        return g().getInt(str, i);
    }

    public static long e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7149c7f7", new Object[]{str})).longValue();
        }
        return f(str, 0L);
    }

    public static long f(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b7efaf15", new Object[]{str, new Long(j)})).longValue();
        }
        return g().getLong(str, j);
    }

    public static SharedPreferences g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SharedPreferences) ipChange.ipc$dispatch("25a999ae", new Object[0]);
        }
        return ia1.a().getSharedPreferences("sp_publisher", 0);
    }

    public static String h(Context context, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a804d6d2", new Object[]{context, str, str2});
        }
        return j(str, str2);
    }

    public static String i(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ba42c148", new Object[]{str});
        }
        return j(str, "");
    }

    public static String j(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7e264abe", new Object[]{str, str2});
        }
        return g().getString(str, str2);
    }

    public static void k(Context context, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f4b683a2", new Object[]{context, str, new Boolean(z)});
        } else {
            l(str, z);
        }
    }

    public static void l(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("932aec2a", new Object[]{str, new Boolean(z)});
        } else {
            c().putBoolean(str, z).apply();
        }
    }

    public static void m(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4330032", new Object[]{str, new Integer(i)});
        } else {
            c().putInt(str, i).apply();
        }
    }

    public static void n(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52ffffc8", new Object[]{str, new Long(j)});
        } else {
            c().putLong(str, j).apply();
        }
    }

    public static void o(Context context, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5bcb1db5", new Object[]{context, str, str2});
        } else {
            p(str, str2);
        }
    }

    public static void p(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb567a1b", new Object[]{str, str2});
        } else {
            c().putString(str, str2).apply();
        }
    }
}
