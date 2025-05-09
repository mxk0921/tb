package tb;

import android.content.Context;
import android.content.SharedPreferences;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class slp {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String SP_FILE_NAME = "homepage_location_sp";

    static {
        t2o.a(729808978);
    }

    public static boolean a(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a3915235", new Object[]{str, new Boolean(z)})).booleanValue();
        }
        return b(m0b.c()).getBoolean(str, z);
    }

    public static SharedPreferences b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SharedPreferences) ipChange.ipc$dispatch("684fc578", new Object[]{context});
        }
        return context.getSharedPreferences("homepage_location_sp", 0);
    }

    public static String c(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7e264abe", new Object[]{str, str2});
        }
        return b(m0b.c()).getString(str, str2);
    }

    public static void d(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("932aec2a", new Object[]{str, new Boolean(z)});
            return;
        }
        SharedPreferences.Editor edit = b(m0b.c()).edit();
        edit.putBoolean(str, z);
        edit.apply();
    }

    public static void e(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb567a1b", new Object[]{str, str2});
            return;
        }
        SharedPreferences.Editor edit = b(m0b.c()).edit();
        edit.putString(str, str2);
        edit.apply();
    }

    public static long f(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b7efaf15", new Object[]{str, new Long(j)})).longValue();
        }
        return b(m0b.c()).getLong(str, j);
    }

    public static void g(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52ffffc8", new Object[]{str, new Long(j)});
            return;
        }
        SharedPreferences.Editor edit = b(m0b.c()).edit();
        edit.putLong(str, j);
        edit.apply();
    }
}
