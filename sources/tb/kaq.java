package tb;

import android.content.Context;
import android.content.SharedPreferences;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class kaq {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(398458892);
    }

    public static Map<String, ?> a(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("6789a915", new Object[]{context, str});
        }
        if (context == null) {
            l2u.instance.e("SpUtils", "getAll context null", new Object[0]);
            return null;
        }
        try {
            return context.getSharedPreferences(str, 0).getAll();
        } catch (Exception e) {
            l2u.instance.d("SpUtils", "geAll fail:", e, new Object[0]);
            return null;
        }
    }

    public static boolean b(Context context, String str, String str2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4829f735", new Object[]{context, str, str2, new Boolean(z)})).booleanValue();
        }
        if (context == null) {
            l2u.instance.e("SpUtils", "getBoolean context null", new Object[0]);
            return z;
        }
        try {
            return Boolean.parseBoolean(context.getSharedPreferences(str, 0).getString(str2, String.valueOf(z)));
        } catch (Exception e) {
            l2u.instance.d("SpUtils", "getBoolean err", e, "key", str2);
            return z;
        }
    }

    public static void c(Context context, String str, String str2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d5dd3b98", new Object[]{context, str, str2, new Boolean(z)});
        } else if (context == null) {
            l2u.instance.e("SpUtils", "putBoolean context null", new Object[0]);
        } else {
            try {
                context.getSharedPreferences(str, 0).edit().putString(str2, String.valueOf(z)).apply();
            } catch (Exception e) {
                l2u.instance.d("SpUtils", "putBoolean err", e, "key", str2);
            }
        }
    }

    public static void d(Context context, String str, Map<String, ?> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d8ceb5e", new Object[]{context, str, map});
        } else if (context == null) {
            l2u.instance.e("SpUtils", "saveTLogOffToSP context null", new Object[0]);
        } else if (map == null || map.isEmpty()) {
            l2u.instance.e("SpUtils", "map empty!", new Object[0]);
        } else {
            try {
                SharedPreferences.Editor edit = context.getSharedPreferences(str, 0).edit();
                for (Map.Entry<String, ?> entry : map.entrySet()) {
                    edit.putString(entry.getKey(), String.valueOf(entry.getValue()));
                }
                edit.apply();
                if (cp.f()) {
                    l2u.instance.c("SpUtils", "saveConfigToSP", "spName", str, "map", map.toString());
                }
            } catch (Exception e) {
                l2u.instance.d("SpUtils", "saveConfigToSP err", e, new Object[0]);
            }
        }
    }
}
