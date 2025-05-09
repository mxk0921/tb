package tb;

import android.content.Context;
import android.content.SharedPreferences;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class lg7 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String PREFERENCE_FILE_NAME = "TB_Detail";

    static {
        t2o.a(912262778);
    }

    public static boolean a(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("266c5e7d", new Object[]{context, str})).booleanValue();
        }
        return b(context, str, false);
    }

    public static boolean b(Context context, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a720237f", new Object[]{context, str, new Boolean(z)})).booleanValue();
        }
        return context.getApplicationContext().getSharedPreferences("TB_Detail", 0).getBoolean(str, z);
    }

    public static int c(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e65c92c5", new Object[]{context, str})).intValue();
        }
        return d(context, str, -1);
    }

    public static int d(Context context, String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e5363a64", new Object[]{context, str, new Integer(i)})).intValue();
        }
        return context.getApplicationContext().getSharedPreferences("TB_Detail", 0).getInt(str, i);
    }

    public static long e(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5ecff76d", new Object[]{context, str})).longValue();
        }
        return f(context, str, -1L);
    }

    public static long f(Context context, String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7b2f6e5f", new Object[]{context, str, new Long(j)})).longValue();
        }
        return context.getApplicationContext().getSharedPreferences("TB_Detail", 0).getLong(str, j);
    }

    public static String g(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("44e9ea5c", new Object[]{context, str});
        }
        return h(context, str, null);
    }

    public static String h(Context context, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a804d6d2", new Object[]{context, str, str2});
        }
        return context.getApplicationContext().getSharedPreferences("TB_Detail", 0).getString(str, str2);
    }

    public static void i(Context context, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f4b683a2", new Object[]{context, str, new Boolean(z)});
            return;
        }
        SharedPreferences.Editor edit = context.getApplicationContext().getSharedPreferences("TB_Detail", 0).edit();
        edit.putBoolean(str, z);
        edit.apply();
    }

    public static void j(Context context, String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a3d8c618", new Object[]{context, str, new Integer(i)});
            return;
        }
        SharedPreferences.Editor edit = context.getApplicationContext().getSharedPreferences("TB_Detail", 0).edit();
        edit.putInt(str, i);
        edit.apply();
    }

    public static void k(Context context, String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90de57a4", new Object[]{context, str, new Long(j)});
            return;
        }
        SharedPreferences.Editor edit = context.getApplicationContext().getSharedPreferences("TB_Detail", 0).edit();
        edit.putLong(str, j);
        edit.apply();
    }

    public static void l(Context context, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5bcb1db5", new Object[]{context, str, str2});
            return;
        }
        SharedPreferences.Editor edit = context.getApplicationContext().getSharedPreferences("TB_Detail", 0).edit();
        edit.putString(str, str2);
        edit.apply();
    }
}
