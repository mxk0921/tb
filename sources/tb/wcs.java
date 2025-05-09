package tb;

import android.content.Context;
import android.content.SharedPreferences;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.open.ability.calendar.TMSCalendarBridge;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class wcs {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(849346576);
    }

    public static String d(Context context, String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f486cc08", new Object[]{context, str, str2, str3});
        }
        if (context == null || context.getApplicationContext() == null) {
            return str3;
        }
        SharedPreferences sharedPreferences = context.getApplicationContext().getSharedPreferences(str, 0);
        if (sharedPreferences == null) {
            return str3;
        }
        return sharedPreferences.getString(str2, str3);
    }

    public static void f(Context context, String str, String str2) {
        SharedPreferences sharedPreferences;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f2e18db1", new Object[]{context, str, str2});
        } else if (context != null && context.getApplicationContext() != null && (sharedPreferences = context.getApplicationContext().getSharedPreferences(str, 0)) != null) {
            sharedPreferences.edit().remove(str2).apply();
        }
    }

    public static void j(Context context, String str, String str2, String str3) {
        SharedPreferences sharedPreferences;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("29ac096f", new Object[]{context, str, str2, str3});
        } else if (context != null && context.getApplicationContext() != null && (sharedPreferences = context.getApplicationContext().getSharedPreferences(str, 0)) != null) {
            sharedPreferences.edit().putString(str2, str3).apply();
        }
    }

    public static int a(Context context, String str, int i) {
        SharedPreferences sharedPreferences;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("618c824", new Object[]{context, str, new Integer(i)})).intValue();
        }
        if (context == null || context.getApplicationContext() == null || (sharedPreferences = context.getApplicationContext().getSharedPreferences(TMSCalendarBridge.namespace, 0)) == null) {
            return i;
        }
        try {
            return Integer.parseInt(sharedPreferences.getString(str, i + ""));
        } catch (Exception unused) {
            return i;
        }
    }

    public static long b(Context context, String str, long j) {
        SharedPreferences sharedPreferences;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("769e989f", new Object[]{context, str, new Long(j)})).longValue();
        }
        if (context == null || context.getApplicationContext() == null || (sharedPreferences = context.getApplicationContext().getSharedPreferences(TMSCalendarBridge.namespace, 0)) == null) {
            return j;
        }
        try {
            return Long.parseLong(sharedPreferences.getString(str, j + ""));
        } catch (Exception unused) {
            return j;
        }
    }

    public static String c(Context context, String str, String str2) {
        SharedPreferences sharedPreferences;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4a9be112", new Object[]{context, str, str2});
        }
        return (context == null || context.getApplicationContext() == null || (sharedPreferences = context.getApplicationContext().getSharedPreferences(TMSCalendarBridge.namespace, 0)) == null) ? str2 : sharedPreferences.getString(str, str2);
    }

    public static void e(Context context, String str) {
        SharedPreferences sharedPreferences;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("97b05fa7", new Object[]{context, str});
        } else if (context != null && context.getApplicationContext() != null && (sharedPreferences = context.getApplicationContext().getSharedPreferences(TMSCalendarBridge.namespace, 0)) != null) {
            sharedPreferences.edit().remove(str).apply();
        }
    }

    public static void g(Context context, String str, int i) {
        SharedPreferences sharedPreferences;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a7fb0f48", new Object[]{context, str, new Integer(i)});
        } else if (context != null && context.getApplicationContext() != null && (sharedPreferences = context.getApplicationContext().getSharedPreferences(TMSCalendarBridge.namespace, 0)) != null) {
            SharedPreferences.Editor edit = sharedPreferences.edit();
            edit.putString(str, i + "").apply();
        }
    }

    public static void h(Context context, String str, long j) {
        SharedPreferences sharedPreferences;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("11053474", new Object[]{context, str, new Long(j)});
        } else if (context != null && context.getApplicationContext() != null && (sharedPreferences = context.getApplicationContext().getSharedPreferences(TMSCalendarBridge.namespace, 0)) != null) {
            SharedPreferences.Editor edit = sharedPreferences.edit();
            edit.putString(str, j + "").apply();
        }
    }

    public static void i(Context context, String str, String str2) {
        SharedPreferences sharedPreferences;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f59ceee5", new Object[]{context, str, str2});
        } else if (context != null && context.getApplicationContext() != null && (sharedPreferences = context.getApplicationContext().getSharedPreferences(TMSCalendarBridge.namespace, 0)) != null) {
            sharedPreferences.edit().putString(str, str2).apply();
        }
    }
}
