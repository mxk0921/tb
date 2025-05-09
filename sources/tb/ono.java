package tb;

import android.content.Context;
import android.content.SharedPreferences;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class ono {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_INACTIVE_CROWD = "inactive_crowd";
    public static final String KEY_WEEX_LOAD_URL = "weexLoadUrl";

    static {
        t2o.a(468713757);
    }

    public static boolean a(Context context, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a720237f", new Object[]{context, str, new Boolean(z)})).booleanValue();
        }
        return d(context).getBoolean(str, z);
    }

    public static int b(Context context, String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e5363a64", new Object[]{context, str, new Integer(i)})).intValue();
        }
        return d(context).getInt(str, i);
    }

    public static long c(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5ecff76d", new Object[]{context, str})).longValue();
        }
        return d(context).getLong(str, 0L);
    }

    public static SharedPreferences d(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SharedPreferences) ipChange.ipc$dispatch("684fc578", new Object[]{context});
        }
        return p91.a().getSharedPreferences("com.taobao.video", 0);
    }

    public static String e(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("44e9ea5c", new Object[]{context, str});
        }
        return f(context, str, "");
    }

    public static String f(Context context, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a804d6d2", new Object[]{context, str, str2});
        }
        return d(context).getString(str, str2);
    }

    public static void g(Context context, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("423d38ef", new Object[]{context, str, new Boolean(z)});
            return;
        }
        SharedPreferences.Editor edit = d(context).edit();
        edit.putBoolean(str, z);
        edit.apply();
    }

    public static void h(Context context, String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1e8029e5", new Object[]{context, str, new Integer(i)});
            return;
        }
        SharedPreferences.Editor edit = d(context).edit();
        edit.putInt(str, i);
        edit.apply();
    }

    public static void i(Context context, String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b236d77", new Object[]{context, str, new Long(j)});
            return;
        }
        SharedPreferences.Editor edit = d(context).edit();
        edit.putLong(str, j);
        edit.apply();
    }

    public static void j(Context context, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a5f9902", new Object[]{context, str, str2});
            return;
        }
        SharedPreferences.Editor edit = d(context).edit();
        edit.putString(str, str2);
        edit.apply();
    }
}
