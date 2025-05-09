package tb;

import android.content.Context;
import android.content.SharedPreferences;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class laq {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String SP_NAME = "ARanger_SDK";
    public static final String SP_ORI_NAME = "ARanger_SDK_ori";

    static {
        t2o.a(393216105);
    }

    public static Map<String, ?> a(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("6789a915", new Object[]{context, str});
        }
        if (context == null) {
            b5d.i("SpUtils", "getBoolean context null", new Object[0]);
            return null;
        }
        try {
            return context.getSharedPreferences(str, 4).getAll();
        } catch (Exception e) {
            b5d.h("SpUtils", "geAll fail:", e, new Object[0]);
            return null;
        }
    }

    public static boolean b(Context context, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a720237f", new Object[]{context, str, new Boolean(z)})).booleanValue();
        }
        if (context == null) {
            b5d.i("SpUtils", "getBoolean context null", new Object[0]);
            return z;
        }
        try {
            return Boolean.parseBoolean(context.getSharedPreferences(SP_NAME, 0).getString(str, String.valueOf(z)));
        } catch (Exception e) {
            b5d.h("SpUtils", "getBoolean fail:", e, "key", str);
            return z;
        }
    }

    public static String c(Context context, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a804d6d2", new Object[]{context, str, str2});
        }
        if (context == null) {
            b5d.i("SpUtils", "getString context null", new Object[0]);
            return str2;
        }
        try {
            return context.getSharedPreferences(SP_NAME, 0).getString(str, str2);
        } catch (Exception e) {
            b5d.h("SpUtils", "getString fail:", e, "key", str);
            return str2;
        }
    }

    public static void d(Context context, String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56ac1311", new Object[]{context, str, map});
        } else if (context == null) {
            b5d.i("SpUtils", "saveTLogOffToSP context null", new Object[0]);
        } else if (map == null || map.isEmpty()) {
            b5d.i("SpUtils", "map empty!", new Object[0]);
        } else {
            try {
                SharedPreferences.Editor edit = context.getSharedPreferences(str, 4).edit();
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    edit.putString(entry.getKey(), entry.getValue());
                }
                edit.apply();
                b5d.g("SpUtils", "saveConfigToSP", "spName", str, "map", map.toString());
            } catch (Exception e) {
                b5d.h("SpUtils", "saveConfigToSP fail:", e, new Object[0]);
            }
        }
    }
}
