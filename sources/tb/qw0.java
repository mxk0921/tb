package tb;

import android.app.Activity;
import android.content.Context;
import android.graphics.Point;
import android.os.Build;
import android.preference.PreferenceManager;
import android.taobao.mulitenv.EnvironmentSwitcher;
import android.view.Display;
import android.view.WindowInsets;
import android.view.WindowManager;
import anetwork.channel.monitor.NetworkQualityMonitor;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.Globals;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class qw0 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_DEVICELEVEL_SP = "taoLiveHomeDeviceLevel";

    /* renamed from: a  reason: collision with root package name */
    public static volatile boolean f26963a;
    public static volatile boolean b;
    public static volatile Point[] c = new Point[2];

    static {
        t2o.a(310378899);
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d95eb37b", new Object[0])).booleanValue();
        }
        if (2 == e()) {
            return true;
        }
        return false;
    }

    public static boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c0452506", new Object[0])).booleanValue();
        }
        if (1 == e()) {
            return true;
        }
        return false;
    }

    public static void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4cd996d6", new Object[0]);
            return;
        }
        f26963a = false;
        b = false;
        c = new Point[2];
    }

    public static int d(Context context, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8536afc1", new Object[]{context, new Float(f)})).intValue();
        }
        return (int) ((f * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    public static int e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3cec5212", new Object[0])).intValue();
        }
        String c2 = owg.c(Globals.getApplication(), "taoLiveHomeDeviceLevel");
        if (!lrq.a(c2) && !c2.equals("-1")) {
            return Integer.parseInt(c2);
        }
        int b2 = qp0.b();
        owg.e(Globals.getApplication(), "taoLiveHomeDeviceLevel", String.valueOf(b2));
        return b2;
    }

    public static int f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("deec0ab1", new Object[0])).intValue();
        }
        return PreferenceManager.getDefaultSharedPreferences(Globals.getApplication()).getInt(EnvironmentSwitcher.SPKEY_ENV, 0);
    }

    public static int g(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("24b6df79", new Object[]{context})).intValue();
        }
        if (context == null) {
            return 0;
        }
        if (!o(context)) {
            return j(context);
        }
        return k(context);
    }

    public static String h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6ea6a34f", new Object[0]);
        }
        int globalNetworkQuality = NetworkQualityMonitor.getGlobalNetworkQuality();
        if (globalNetworkQuality == 0) {
            return "unknown";
        }
        if (globalNetworkQuality == 1) {
            return "poor";
        }
        if (globalNetworkQuality == 2) {
            return "NORMAL";
        }
        if (globalNetworkQuality != 3) {
            return "normal";
        }
        return "excellent";
    }

    public static int j(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bb976a8b", new Object[]{context})).intValue();
        }
        if (context != null) {
            return context.getResources().getDisplayMetrics().heightPixels;
        }
        return 0;
    }

    public static int l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("43d49fe", new Object[0])).intValue();
        }
        return Globals.getApplication().getResources().getDisplayMetrics().widthPixels;
    }

    public static boolean n(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8812ea60", new Object[]{context})).booleanValue();
        }
        if (m(context) + j(context) < k(context)) {
            return true;
        }
        return false;
    }

    public static boolean p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c4aeae8b", new Object[0])).booleanValue();
        }
        try {
            if ((Globals.getApplication().getApplicationInfo().flags & 2) != 0) {
                return true;
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    public static boolean q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b5d2f9", new Object[0])).booleanValue();
        }
        int e = e();
        if (e == 1 || e == 2) {
            return false;
        }
        return true;
    }

    public static boolean r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e334f03d", new Object[0])).booleanValue();
        }
        String str = Build.MODEL;
        if ("MI 8".equals(str) || "MI 8 SE".equals(str)) {
            return true;
        }
        return false;
    }

    public static float s(Context context, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("64b9d353", new Object[]{context, new Integer(i)})).floatValue();
        }
        return (i / context.getResources().getDisplayMetrics().density) + 0.5f;
    }

    public static int t(Context context, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c6ba8779", new Object[]{context, new Float(f)})).intValue();
        }
        return (int) ((f / context.getResources().getDisplayMetrics().scaledDensity) + 0.5f);
    }

    public static int i(Activity activity) {
        int j;
        int m;
        WindowInsets rootWindowInsets;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4be743bd", new Object[]{activity})).intValue();
        }
        if (activity == null) {
            return 0;
        }
        String str = Build.MODEL;
        if ("vivo X6S A".equals(str) || "vivo Xplay5A".equals(str)) {
            return j(activity);
        }
        if ("Pixel 2 XL".equals(str)) {
            j = j(activity);
            m = m(activity);
        } else if (n(activity)) {
            if (Build.VERSION.SDK_INT >= 23) {
                rootWindowInsets = activity.getWindow().getDecorView().getRootWindowInsets();
                if (nxq.r(activity, rootWindowInsets)) {
                    j = j(activity);
                    m = m(activity);
                }
            }
            return j(activity);
        } else if (o(activity)) {
            return g(activity);
        } else {
            if (!sj7.s(activity)) {
                return j(activity);
            }
            j = j(activity);
            m = m(activity);
        }
        return j + m;
    }

    public static int m(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("226dbd42", new Object[]{context})).intValue();
        }
        int identifier = context.getResources().getIdentifier("status_bar_height", "dimen", "android");
        if (identifier > 0) {
            return context.getResources().getDimensionPixelSize(identifier);
        }
        return 0;
    }

    public static int k(Context context) {
        char c2 = 1;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f59d750d", new Object[]{context})).intValue();
        }
        if (context == null) {
            return 0;
        }
        if (context.getResources().getConfiguration().orientation == 1) {
            c2 = 0;
        }
        try {
            if (c[c2] == null) {
                WindowManager windowManager = (WindowManager) context.getSystemService(pg1.ATOM_EXT_window);
                if (windowManager == null) {
                    return j(context);
                }
                Display defaultDisplay = windowManager.getDefaultDisplay();
                Point point = new Point();
                defaultDisplay.getRealSize(point);
                c[c2] = point;
            }
            return c[c2].y;
        } catch (Exception unused) {
            return 0;
        }
    }

    public static boolean o(Context context) {
        float f;
        float f2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c4a8b02c", new Object[]{context})).booleanValue();
        }
        if (f26963a) {
            return b;
        }
        f26963a = true;
        b = false;
        WindowManager windowManager = (WindowManager) context.getSystemService(pg1.ATOM_EXT_window);
        if (windowManager != null) {
            Display defaultDisplay = windowManager.getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getRealSize(point);
            int i = point.x;
            int i2 = point.y;
            if (i < i2) {
                f = i;
                f2 = i2;
            } else {
                f = i2;
                f2 = i;
            }
            if (f2 / f >= 1.97f) {
                b = true;
            }
        }
        return b;
    }
}
