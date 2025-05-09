package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.huawei.hms.push.constant.RemoteMessageConst;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class p3n {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(845152382);
    }

    public static boolean a(Context context, String str, String str2, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9a154ced", new Object[]{context, str, str2, new Integer(i), new Integer(i2)})).booleanValue();
        }
        if (!q9s.q2()) {
            return false;
        }
        if (i == 0 || i2 == 0) {
            return true;
        }
        String str3 = "pub_add_guide_start_time_" + str + "_" + str2;
        String str4 = "pub_add_guide_times_" + str + "_" + str2;
        long b = wcs.b(context, str3, 0L);
        int a2 = wcs.a(context, str4, 0);
        if (b == 0 || System.currentTimeMillis() - b > i * RemoteMessageConst.DEFAULT_TTL * 1000) {
            wcs.h(context, str3, System.currentTimeMillis());
            wcs.h(context, str4, 0);
            return false;
        }
        int i3 = a2 + 1;
        wcs.h(context, str4, i3);
        return i3 >= i2;
    }

    public static boolean b(Context context, String str, String str2, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1239dcfd", new Object[]{context, str, str2, new Integer(i)})).booleanValue();
        }
        if (!q9s.q2()) {
            return false;
        }
        int a2 = wcs.a(context, "pubArea_enter_times_" + str + "_" + str2, 0);
        if (a2 >= i) {
            return true;
        }
        wcs.g(context, "pubArea_enter_times_" + str + "_" + str2, a2 + 1);
        return false;
    }
}
