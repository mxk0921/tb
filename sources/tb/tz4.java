package tb;

import android.content.SharedPreferences;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.cus.a;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class tz4 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String SP_KEY_IGNORE_NEXT_MTOP_TIME = "ignore_next_mtop_time";
    public static final String SP_KEY_LAST_DOWNLOAD_CONTEXT_GRAY = "last_download_context_gray";
    public static final String SP_KEY_LAST_DOWNLOAD_CONTEXT_PRE = "last_download_context_pre";
    public static final String SP_KEY_POP_EXPOSE_TIME = "last_pop_expose_time";
    public static final String SP_KEY_UPDATE_MODEL = "update_model";

    static {
        t2o.a(790626321);
    }

    public static boolean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c89a0851", new Object[]{str})).booleanValue();
        }
        try {
            SharedPreferences d = d();
            if (d == null) {
                return false;
            }
            return d.getBoolean(str, false);
        } catch (Throwable th) {
            wdm.h("UpdateSharePreference getBooleanData error.", th);
            return false;
        }
    }

    public static boolean b(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4aa7b42b", new Object[]{str, new Boolean(z)})).booleanValue();
        }
        try {
            SharedPreferences d = d();
            if (d == null) {
                return z;
            }
            return d.getBoolean(str, z);
        } catch (Throwable th) {
            wdm.h("UpdateSharePreference getBooleanData with defaultValue error.", th);
            return z;
        }
    }

    public static long c(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6c11910b", new Object[]{str, new Long(j)})).longValue();
        }
        try {
            SharedPreferences d = d();
            if (d == null) {
                return j;
            }
            return d.getLong(str, j);
        } catch (Throwable th) {
            wdm.h("UpdateSharePreference getLongData error.", th);
            return j;
        }
    }

    public static SharedPreferences d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SharedPreferences) ipChange.ipc$dispatch("75ba1678", new Object[0]);
        }
        if (a.q().g() == null) {
            return null;
        }
        return a.q().g().getSharedPreferences("update_sp", 0);
    }

    public static String e(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2e8e71b4", new Object[]{str, str2});
        }
        try {
            SharedPreferences d = d();
            if (d == null) {
                return str2;
            }
            return d.getString(str, str2);
        } catch (Throwable th) {
            wdm.h("UpdateSharePreference getStringData error.", th);
            return str2;
        }
    }

    public static void f(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("631a40da", new Object[]{str, new Boolean(z)});
            return;
        }
        try {
            SharedPreferences d = d();
            if (d != null) {
                d.edit().putBoolean(str, z).apply();
            }
        } catch (Throwable th) {
            wdm.h("UpdateSharePreference updateBooleanData error.", th);
        }
    }

    public static void g(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("662a7944", new Object[]{str, new Long(j)});
            return;
        }
        try {
            SharedPreferences d = d();
            if (d != null) {
                d.edit().putLong(str, j).apply();
            }
        } catch (Throwable th) {
            wdm.h("UpdateSharePreference updateLongData error.", th);
        }
    }

    public static void h(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9424af1f", new Object[]{str, str2});
            return;
        }
        try {
            SharedPreferences d = d();
            if (d != null) {
                d.edit().putString(str, str2).apply();
            }
        } catch (Throwable th) {
            wdm.h("UpdateSharePreference updateStringData error.", th);
        }
    }
}
