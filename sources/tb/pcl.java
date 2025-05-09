package tb;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.order.bundle.constants.CoreConstants;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class pcl {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static Context f26012a;
    public static final String b = "tborder";
    public static final String c = k75.VIDEOCONFIG_API_VERSION_3;

    public static String a() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("92150ca3", new Object[0]);
        }
        SharedPreferences c2 = c();
        if (c2 != null) {
            str = c2.getString(CoreConstants.ORDER_APP_NAME_KEY, null);
        } else {
            str = "";
        }
        if (TextUtils.isEmpty(str)) {
            str = b;
        }
        lor.c("OrderCore", "getAppName", "appName = " + str);
        return str;
    }

    public static String b() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("65f009ac", new Object[0]);
        }
        SharedPreferences c2 = c();
        if (c2 != null) {
            str = c2.getString(CoreConstants.ORDER_APP_V_KEY, null);
        } else {
            str = "";
        }
        if (TextUtils.isEmpty(str)) {
            str = c;
        }
        lor.c("OrderCore", "getAppVersion", "appV = " + str);
        return str;
    }

    public static SharedPreferences c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SharedPreferences) ipChange.ipc$dispatch("75ba1678", new Object[0]);
        }
        Context context = f26012a;
        if (context != null) {
            return context.getSharedPreferences("trade_debug_order", 32768);
        }
        return null;
    }

    public static void d(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("609fd211", new Object[]{context});
        } else {
            f26012a = context;
        }
    }

    static {
        t2o.a(713031751);
    }
}
