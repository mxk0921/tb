package tb;

import android.content.Context;
import android.content.SharedPreferences;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class gaq {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_RESOURCE_CHECK_TIME = "resource_check_time";

    static {
        t2o.a(782237726);
    }

    public static long a(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b0b35120", new Object[]{context, str})).longValue();
        }
        return context.getSharedPreferences("TaopaiDataCore", 0).getLong(str, 0L);
    }

    public static void b(Context context, String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ade4d38c", new Object[]{context, str, new Long(j)});
            return;
        }
        SharedPreferences.Editor edit = context.getSharedPreferences("TaopaiDataCore", 0).edit();
        edit.putLong(str, j);
        edit.apply();
    }
}
