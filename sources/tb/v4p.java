package tb;

import android.content.Context;
import android.content.SharedPreferences;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.Globals;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class v4p {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String SEARCH_PREFERENCE_NAME = "tbsearch_preference";

    static {
        t2o.a(815792247);
    }

    public static boolean a(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a3915235", new Object[]{str, new Boolean(z)})).booleanValue();
        }
        SharedPreferences b = b();
        if (b == null) {
            return z;
        }
        return b.getBoolean(str, z);
    }

    public static SharedPreferences b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SharedPreferences) ipChange.ipc$dispatch("3f2b49c8", new Object[0]);
        }
        return c(Globals.getApplication());
    }

    public static int d(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("235381ac", new Object[]{str, new Integer(i)})).intValue();
        }
        SharedPreferences b = b();
        if (b == null) {
            return i;
        }
        return b.getInt(str, i);
    }

    public static String e(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7e264abe", new Object[]{str, str2});
        }
        SharedPreferences b = b();
        if (b == null) {
            return str2;
        }
        return b.getString(str, str2);
    }

    public static void f(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("932aec2a", new Object[]{str, new Boolean(z)});
            return;
        }
        SharedPreferences b = b();
        if (b != null) {
            b.edit().putBoolean(str, z).apply();
        }
    }

    public static void g(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4330032", new Object[]{str, new Integer(i)});
            return;
        }
        SharedPreferences b = b();
        if (b != null) {
            b.edit().putInt(str, i).apply();
        }
    }

    public static void h(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb567a1b", new Object[]{str, str2});
            return;
        }
        SharedPreferences b = b();
        if (b != null) {
            b.edit().putString(str, str2).apply();
        }
    }

    public static SharedPreferences c(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SharedPreferences) ipChange.ipc$dispatch("4f77ec28", new Object[]{context});
        }
        if (context == null) {
            return null;
        }
        return context.getSharedPreferences("tbsearch_preference", 0);
    }
}
