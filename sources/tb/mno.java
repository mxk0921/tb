package tb;

import android.content.Context;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class mno {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(481296407);
    }

    public static boolean a(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("266c5e7d", new Object[]{context, str})).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return context.getSharedPreferences("IMAGE_SEARCH_APP", 0).getBoolean("COMMON_".concat(str), false);
    }

    public static int b(Context context, String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e5363a64", new Object[]{context, str, new Integer(i)})).intValue();
        }
        if (TextUtils.isEmpty(str)) {
            return i;
        }
        return context.getSharedPreferences("IMAGE_SEARCH_APP", 0).getInt("COMMON_".concat(str), i);
    }

    public static String c(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("44e9ea5c", new Object[]{context, str});
        }
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        return context.getSharedPreferences("IMAGE_SEARCH_APP", 0).getString("COMMON_".concat(str), "");
    }

    public static void d(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca52d5be", new Object[]{context, str});
        } else if (!TextUtils.isEmpty(str)) {
            context.getSharedPreferences("IMAGE_SEARCH_APP", 0).edit().remove("COMMON_".concat(str)).apply();
        }
    }

    public static void e(Context context, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("423d38ef", new Object[]{context, str, new Boolean(z)});
        } else if (!TextUtils.isEmpty(str)) {
            context.getSharedPreferences("IMAGE_SEARCH_APP", 0).edit().putBoolean("COMMON_".concat(str), z).apply();
        }
    }

    public static void f(Context context, String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1e8029e5", new Object[]{context, str, new Integer(i)});
        } else if (!TextUtils.isEmpty(str)) {
            context.getSharedPreferences("IMAGE_SEARCH_APP", 0).edit().putInt("COMMON_".concat(str), i).apply();
        }
    }

    public static void g(Context context, String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b236d77", new Object[]{context, str, new Long(j)});
        } else if (!TextUtils.isEmpty(str)) {
            context.getSharedPreferences("IMAGE_SEARCH_APP", 0).edit().putLong("COMMON_".concat(str), j).apply();
        }
    }

    public static void h(Context context, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a5f9902", new Object[]{context, str, str2});
        } else if (!TextUtils.isEmpty(str)) {
            context.getSharedPreferences("IMAGE_SEARCH_APP", 0).edit().putString("COMMON_".concat(str), str2).apply();
        }
    }
}
