package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class eno {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(481297697);
    }

    public static void a(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9cb11abe", new Object[]{context, str});
        } else {
            context.getSharedPreferences("IMAGE_SEARCH_APP", 0).edit().putString("COMMON_".concat(str), "").apply();
        }
    }

    public static boolean b(Context context, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a720237f", new Object[]{context, str, new Boolean(z)})).booleanValue();
        }
        return context.getSharedPreferences("IMAGE_SEARCH_APP", 0).getBoolean("COMMON_".concat(str), z);
    }

    public static long c(Context context, String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7b2f6e5f", new Object[]{context, str, new Long(j)})).longValue();
        }
        return context.getSharedPreferences("IMAGE_SEARCH_APP", 0).getLong("COMMON_".concat(str), j);
    }

    public static String d(Context context, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a804d6d2", new Object[]{context, str, str2});
        }
        return context.getSharedPreferences("IMAGE_SEARCH_APP", 0).getString("COMMON_".concat(str), str2);
    }

    public static void e(Context context, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("423d38ef", new Object[]{context, str, new Boolean(z)});
        } else {
            context.getSharedPreferences("IMAGE_SEARCH_APP", 0).edit().putBoolean("COMMON_".concat(str), z).apply();
        }
    }

    public static void f(Context context, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a5f9902", new Object[]{context, str, str2});
        } else {
            context.getSharedPreferences("IMAGE_SEARCH_APP", 0).edit().putString("COMMON_".concat(str), str2).apply();
        }
    }
}
