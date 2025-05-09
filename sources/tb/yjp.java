package tb;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.Globals;
import com.taobao.utils.Global;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class yjp {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(745538212);
    }

    public static boolean a(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("28f80dbe", new Object[]{str, new Boolean(z)})).booleanValue();
        }
        return PreferenceManager.getDefaultSharedPreferences(Global.getApplication()).getBoolean(str, z);
    }

    public static long b(String str, String str2, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6e2d0c94", new Object[]{str, str2, new Long(j)})).longValue();
        }
        return Globals.getApplication().getSharedPreferences(str, 0).getLong(str2, j);
    }

    public static String c(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fd05083d", new Object[]{str, str2, str3});
        }
        return Globals.getApplication().getSharedPreferences(str, 0).getString(str2, str3);
    }

    public static void d(String str, String str2, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa22a807", new Object[]{str, str2, new Long(j)});
        } else {
            Globals.getApplication().getSharedPreferences(str, 0).edit().putLong(str2, j).apply();
        }
    }

    public static void e(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8692ffc", new Object[]{str, str2, str3});
        } else {
            Globals.getApplication().getSharedPreferences(str, 0).edit().putString(str2, str3).apply();
        }
    }

    public static void f(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7b85fc6", new Object[]{str, new Boolean(z)});
            return;
        }
        SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(Global.getApplication()).edit();
        edit.putBoolean(str, z);
        edit.apply();
    }
}
