package tb;

import android.content.SharedPreferences;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class z3s {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(806356519);
    }

    public static boolean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("685f8107", new Object[]{str})).booleanValue();
        }
        return b(str, false);
    }

    public static boolean b(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a3915235", new Object[]{str, new Boolean(z)})).booleanValue();
        }
        return g().getBoolean(str, z);
    }

    public static int c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c755427d", new Object[]{str})).intValue();
        }
        return d(str, 0);
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
            return (SharedPreferences) ipChange.ipc$dispatch("75ba1678", new Object[0]);
        }
        return v2s.o().f().getApplication().getSharedPreferences("taolive", 0);
    }

    public static String h(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ba42c148", new Object[]{str});
        }
        return i(str, "");
    }

    public static String i(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7e264abe", new Object[]{str, str2});
        }
        return g().getString(str, str2);
    }

    public static void j(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89ae223d", new Object[]{str, new Boolean(z)});
            return;
        }
        SharedPreferences.Editor edit = g().edit();
        edit.putBoolean(str, z);
        edit.apply();
    }

    public static void k(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("131237c5", new Object[]{str, new Integer(i)});
        } else {
            g().edit().putInt(str, i).commit();
        }
    }

    public static void l(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c007ba95", new Object[]{str, new Long(j)});
            return;
        }
        SharedPreferences.Editor edit = g().edit();
        edit.putLong(str, j);
        edit.apply();
    }

    public static void m(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d492a2e", new Object[]{str, str2});
            return;
        }
        SharedPreferences.Editor edit = g().edit();
        edit.putString(str, str2);
        edit.apply();
    }
}
