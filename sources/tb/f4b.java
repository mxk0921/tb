package tb;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class f4b {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ORANGE_GROUP_NAME = "homepage_switch";

    static {
        t2o.a(473956398);
    }

    public static String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f97d512d", new Object[0]);
        }
        return h("afterBuyPopSceneWhiteList", "Page_OrderList,Page_ShoppingCart,Page_OrderDetail,Page_Logistic,Page_PaySuccess");
    }

    public static int c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2466c42f", new Object[0])).intValue();
        }
        return i("needClickItemIdCountForAlgorithm", 100);
    }

    public static double d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("25f8a060", new Object[0])).doubleValue();
        }
        String h = h("homeLocationRefreshDistance", "500");
        if (!TextUtils.isEmpty(h)) {
            try {
                return Double.valueOf(h).doubleValue();
            } catch (Throwable unused) {
                Log.e("HomeSwitchCenter", "distance NumberFormatException");
            }
        }
        return 500.0d;
    }

    public static double e(String str, double d) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5dcb64b2", new Object[]{str, new Double(d)})).doubleValue();
        }
        try {
            return Double.valueOf(h(str, d + "")).doubleValue();
        } catch (Throwable unused) {
            return d;
        }
    }

    public static String f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("688b7b23", new Object[0]);
        }
        return h("enableHomePageOverlayPageList", "");
    }

    public static String g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("dc02a6a9", new Object[0]);
        }
        return h("enableWindVanePageList", "");
    }

    public static String h(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("300562ce", new Object[]{str, str2});
        }
        try {
            String b = qy8.d().b(str, str2);
            bqa.a("HomeSwitchCenter", str + "=" + b);
            return b;
        } catch (Exception e) {
            e.printStackTrace();
            return str2;
        }
    }

    public static int i(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("dd78aaca", new Object[]{str, new Integer(i)})).intValue();
        }
        try {
            return Integer.valueOf(h(str, i + "")).intValue();
        } catch (Throwable unused) {
            return i;
        }
    }

    public static int j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8e73a343", new Object[0])).intValue();
        }
        return i("needItemIdCountForCardRepeat", 100);
    }

    public static int k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f5536efd", new Object[0])).intValue();
        }
        String h = h("home_location_interval_switch", "12");
        if (!TextUtils.isEmpty(h)) {
            try {
                return Integer.valueOf(h).intValue();
            } catch (Throwable unused) {
                Log.e("HomeSwitchCenter", "time limit NumberFormatException");
            }
        }
        return 12;
    }

    public static String l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e6d2bc54", new Object[0]);
        }
        return h("enableSecondFloorWhiteList", "coldStart,pullRefresh,hotStart");
    }

    public static boolean n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8ce6b294", new Object[0])).booleanValue();
        }
        return true;
    }

    public static boolean b(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1c9dc565", new Object[]{str, new Boolean(z)})).booleanValue();
        }
        String h = h(str, z + "");
        return TextUtils.isEmpty(h) ? z : h.trim().toLowerCase().equals("true");
    }

    public static boolean m(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("417ba79", new Object[]{context})).booleanValue();
        }
        int i = i("mediaAutoPlayLimitScore", 20);
        return i > 0 ? qp0.c() > ((float) i) : c21.g().getInt(ai7.KEY_OLD_SCORE, -1) >= 40;
    }
}
