package tb;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class o6g {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_LBS = "LBS";

    /* renamed from: a  reason: collision with root package name */
    public static String f25165a;

    static {
        t2o.a(479199581);
    }

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("de885fa2", new Object[0]);
        } else {
            f25165a = null;
        }
    }

    public static String b(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e0b3825a", new Object[]{context, str});
        }
        if (TextUtils.isEmpty(str) || !"LBS".equals(str) || context == null) {
            return null;
        }
        if (f25165a == null) {
            f25165a = d(context).getString("tb_homepage_clientCache_lbs", null);
        }
        return f25165a;
    }

    public static String c(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fdcd6015", new Object[]{context});
        }
        return b(context, "LBS");
    }

    public static SharedPreferences d(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SharedPreferences) ipChange.ipc$dispatch("684fc578", new Object[]{context});
        }
        return context.getSharedPreferences("homepage_common", 0);
    }
}
