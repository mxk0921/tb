package tb;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.util.DisplayMetrics;
import com.android.alibaba.ip.runtime.IpChange;
import com.huawei.hms.android.SystemUtils;
import com.taobao.android.autosize.TBDeviceUtils;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class i3s {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(806356514);
    }

    public static int a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3cec5212", new Object[0])).intValue();
        }
        kzb h = v2s.o().h();
        if (h == null) {
            return -1;
        }
        return h.getDeviceLevel();
    }

    public static Integer b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Integer) ipChange.ipc$dispatch("6766b276", new Object[]{context});
        }
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
            return null;
        }
        return Integer.valueOf(activeNetworkInfo.getType());
    }

    public static int c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3d9e9723", new Object[0])).intValue();
        }
        return v2s.o().f().getApplication().getResources().getDisplayMetrics().heightPixels;
    }

    public static int d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c3b9debe", new Object[0])).intValue();
        }
        DisplayMetrics displayMetrics = v2s.o().f().getApplication().getResources().getDisplayMetrics();
        return Math.max(displayMetrics.widthPixels, displayMetrics.heightPixels);
    }

    public static int e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e0010990", new Object[0])).intValue();
        }
        DisplayMetrics displayMetrics = v2s.o().f().getApplication().getResources().getDisplayMetrics();
        return Math.min(displayMetrics.widthPixels, displayMetrics.heightPixels);
    }

    public static int f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("43d49fe", new Object[0])).intValue();
        }
        return v2s.o().f().getApplication().getResources().getDisplayMetrics().widthPixels;
    }

    public static boolean g(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e343b18b", new Object[]{str})).booleanValue();
        }
        if (str == null) {
            return false;
        }
        if (str.contains("armeabi") || str.contains("arm64")) {
            return true;
        }
        return false;
    }

    public static boolean h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8f3bfb9a", new Object[0])).booleanValue();
        }
        for (String str : Build.SUPPORTED_ABIS) {
            if (g(str)) {
                return true;
            }
        }
        return false;
    }

    public static boolean i(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("764cd1d4", new Object[]{context})).booleanValue();
        }
        try {
            return TBDeviceUtils.G(context);
        } catch (Exception unused) {
            if (k() || l() || j()) {
                return true;
            }
            return false;
        }
    }

    public static boolean j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3c342706", new Object[0])).booleanValue();
        }
        return Build.BRAND.equals("samsung") && Build.MODEL.equals("SM-F9000");
    }

    public static boolean k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c5a504d", new Object[0])).booleanValue();
        }
        if (!SystemUtils.PRODUCT_HUAWEI.equalsIgnoreCase(Build.BRAND)) {
            return false;
        }
        String str = Build.DEVICE;
        return "unknownRLI".equalsIgnoreCase(str) || "HWTAH".equalsIgnoreCase(str);
    }

    public static boolean l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b746682", new Object[0])).booleanValue();
        }
        if (!SystemUtils.PRODUCT_HUAWEI.equalsIgnoreCase(Build.BRAND) || !"CMR-W09".equalsIgnoreCase(Build.MODEL)) {
            return false;
        }
        return true;
    }

    public static boolean m(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("abc285c0", new Object[]{context})).booleanValue();
        }
        if (b(context) != null) {
            return true;
        }
        return false;
    }

    public static boolean n(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ed9ac165", new Object[]{context})).booleanValue();
        }
        Integer b = b(context);
        if (b == null || b.intValue() != 0) {
            return false;
        }
        return true;
    }

    public static boolean o(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e5f4bc52", new Object[]{context})).booleanValue();
        }
        Integer b = b(context);
        if (b == null || b.intValue() != 1) {
            return false;
        }
        return true;
    }

    public static boolean p(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2a643a2", new Object[]{context})).booleanValue();
        }
        Integer b = b(context);
        if (b == null || b.intValue() != 0) {
            return true;
        }
        return false;
    }

    public static boolean q(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fef7dd75", new Object[]{context})).booleanValue();
        }
        if (i(context) && (context.getResources().getConfiguration().screenLayout & 15) >= 3) {
            return true;
        }
        return false;
    }
}
