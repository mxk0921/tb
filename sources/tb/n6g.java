package tb;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class n6g {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_LBS = "LBS";

    /* renamed from: a  reason: collision with root package name */
    public static String f24538a;

    static {
        t2o.a(745538193);
    }

    public static String a(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e0b3825a", new Object[]{context, str});
        }
        if (TextUtils.isEmpty(str) || !"LBS".equals(str) || context == null) {
            return null;
        }
        if (f24538a == null) {
            f24538a = c(context).getString("tb_homepage_clientCache_lbs", null);
        }
        return f24538a;
    }

    public static String b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fdcd6015", new Object[]{context});
        }
        return a(context, "LBS");
    }

    public static SharedPreferences c(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SharedPreferences) ipChange.ipc$dispatch("684fc578", new Object[]{context});
        }
        return context.getSharedPreferences("homepage_common", 0);
    }
}
