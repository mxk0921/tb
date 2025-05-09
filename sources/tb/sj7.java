package tb;

import android.app.Activity;
import android.content.Context;
import android.graphics.Point;
import android.os.Build;
import android.text.TextUtils;
import android.view.Display;
import android.view.DisplayCutout;
import android.view.WindowInsets;
import android.view.WindowManager;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.autosize.TBDeviceUtils;
import com.taobao.tao.Globals;
import java.lang.reflect.Method;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: Taobao */
@Deprecated
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class sj7 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_DEVICELEVEL_SP = "taoLiveHomeDeviceLevel";
    public static volatile boolean d;
    public static volatile boolean e;

    /* renamed from: a  reason: collision with root package name */
    public static String f28085a = "";
    public static boolean b = false;
    public static int c = 0;
    public static volatile Point[] f = new Point[2];

    static {
        t2o.a(806355491);
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d95eb37b", new Object[0])).booleanValue();
        }
        if (2 == c()) {
            return true;
        }
        return false;
    }

    public static int b(Context context, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8536afc1", new Object[]{context, new Float(f2)})).intValue();
        }
        return (int) ((f2 * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    public static int c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3cec5212", new Object[0])).intValue();
        }
        String c2 = nwg.c(Globals.getApplication(), "taoLiveHomeDeviceLevel");
        if (!orq.a(c2) && !c2.equals("-1")) {
            return Integer.parseInt(c2);
        }
        int b2 = qp0.b();
        nwg.e(Globals.getApplication(), "taoLiveHomeDeviceLevel", String.valueOf(b2));
        return b2;
    }

    public static Object d(WindowInsets windowInsets) {
        if (windowInsets == null) {
            return null;
        }
        try {
            return windowInsets.getClass().getMethod("getDisplayCutout", new Class[0]).invoke(windowInsets, new Object[0]);
        } catch (NoSuchMethodException | Exception unused) {
            return null;
        }
    }

    public static int e(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("24b6df79", new Object[]{context})).intValue();
        }
        if (context == null) {
            return 0;
        }
        if (!l(context)) {
            return g(context);
        }
        return h(context);
    }

    public static String f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a78b0366", new Object[0]);
        }
        if (TextUtils.isEmpty(f28085a)) {
            f28085a = Build.MODEL;
        }
        return f28085a;
    }

    public static int g(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bb976a8b", new Object[]{context})).intValue();
        }
        if (context != null) {
            return context.getResources().getDisplayMetrics().heightPixels;
        }
        return 0;
    }

    public static int i(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("226dbd42", new Object[]{context})).intValue();
        }
        return w2s.h(context);
    }

    public static String j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7ae5d73e", new Object[0]);
        }
        return w2s.e();
    }

    public static boolean k(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8812ea60", new Object[]{context})).booleanValue();
        }
        if (i(context) + g(context) < h(context)) {
            return true;
        }
        return false;
    }

    public static boolean m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e4ce30c6", new Object[0])).booleanValue();
        }
        return w2s.j();
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0032 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean n(android.content.Context r5, android.view.WindowInsets r6) {
        /*
            r0 = 1
            r1 = 0
            com.android.alibaba.ip.runtime.IpChange r2 = tb.sj7.$ipChange
            boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r3 == 0) goto L_0x001c
            java.lang.String r3 = "f375a1b6"
            r4 = 2
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r4[r1] = r5
            r4[r0] = r6
            java.lang.Object r5 = r2.ipc$dispatch(r3, r4)
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            return r5
        L_0x001c:
            boolean r2 = tb.sj7.b
            if (r2 == 0) goto L_0x0021
            return r0
        L_0x0021:
            int r2 = android.os.Build.VERSION.SDK_INT     // Catch: Exception -> 0x005e
            r3 = 27
            if (r2 < r3) goto L_0x002f
            java.lang.Object r6 = d(r6)     // Catch: Exception -> 0x005e
            if (r6 == 0) goto L_0x002f
            r6 = 1
            goto L_0x0030
        L_0x002f:
            r6 = 0
        L_0x0030:
            if (r6 != 0) goto L_0x005f
            boolean r2 = o(r5)     // Catch: Exception -> 0x004d
            if (r2 != 0) goto L_0x004f
            boolean r5 = p(r5)     // Catch: Exception -> 0x004d
            if (r5 != 0) goto L_0x004f
            boolean r5 = r()     // Catch: Exception -> 0x004d
            if (r5 != 0) goto L_0x004f
            boolean r5 = y()     // Catch: Exception -> 0x004d
            if (r5 == 0) goto L_0x004b
            goto L_0x004f
        L_0x004b:
            r0 = 0
            goto L_0x004f
        L_0x004d:
            r1 = r6
            goto L_0x005e
        L_0x004f:
            if (r0 != 0) goto L_0x005c
            java.lang.String r5 = tb.e2h.r()     // Catch: Exception -> 0x005a
            boolean r6 = q(r5)     // Catch: Exception -> 0x005a
            goto L_0x005f
        L_0x005a:
            r1 = r0
            goto L_0x005e
        L_0x005c:
            r6 = r0
            goto L_0x005f
        L_0x005e:
            r6 = r1
        L_0x005f:
            tb.sj7.b = r6
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.sj7.n(android.content.Context, android.view.WindowInsets):boolean");
    }

    public static boolean o(Context context) {
        try {
            Class<?> loadClass = context.getClassLoader().loadClass("com.huawei.android.util.HwNotchSizeUtil");
            return ((Boolean) loadClass.getMethod("hasNotchInScreen", new Class[0]).invoke(loadClass, new Object[0])).booleanValue();
        } catch (ClassNotFoundException | Exception unused) {
            return false;
        }
    }

    public static boolean p(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("831344ec", new Object[]{context})).booleanValue();
        }
        try {
            return context.getPackageManager().hasSystemFeature("com.oppo.feature.screen.heteromorphism");
        } catch (Exception unused) {
            return false;
        }
    }

    public static boolean s(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("afe54a44", new Object[]{context})).booleanValue();
        }
        if (context == null) {
            return false;
        }
        return TBDeviceUtils.p(context);
    }

    public static boolean t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b5d2f9", new Object[0])).booleanValue();
        }
        int c2 = c();
        if (c2 == 1 || c2 == 2) {
            return false;
        }
        return true;
    }

    public static boolean u(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fe4c5214", new Object[]{context})).booleanValue();
        }
        if (context == null) {
            return false;
        }
        return v6t.a().b(context);
    }

    public static boolean v(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a28a2397", new Object[]{context})).booleanValue();
        }
        if (w(context) || (s(context) && u(context))) {
            return true;
        }
        return false;
    }

    public static boolean w(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bc1a5af5", new Object[]{context})).booleanValue();
        }
        if (context == null) {
            return false;
        }
        return TBDeviceUtils.P(context);
    }

    public static void x(Context context) {
        int i;
        WindowInsets rootWindowInsets;
        WindowInsets rootWindowInsets2;
        WindowInsets rootWindowInsets3;
        DisplayCutout displayCutout;
        WindowInsets rootWindowInsets4;
        DisplayCutout displayCutout2;
        int safeInsetBottom;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b6912c7d", new Object[]{context});
            return;
        }
        if ((context instanceof Activity) && (i = Build.VERSION.SDK_INT) >= 23) {
            Activity activity = (Activity) context;
            if (activity.getWindow().getDecorView() != null) {
                rootWindowInsets = activity.getWindow().getDecorView().getRootWindowInsets();
                if (rootWindowInsets != null && !"EVA-AL00".equals(f())) {
                    if (i >= 28) {
                        rootWindowInsets3 = activity.getWindow().getDecorView().getRootWindowInsets();
                        displayCutout = rootWindowInsets3.getDisplayCutout();
                        if (displayCutout != null) {
                            rootWindowInsets4 = activity.getWindow().getDecorView().getRootWindowInsets();
                            displayCutout2 = rootWindowInsets4.getDisplayCutout();
                            safeInsetBottom = displayCutout2.getSafeInsetBottom();
                            c = safeInsetBottom;
                            return;
                        }
                    }
                    rootWindowInsets2 = activity.getWindow().getDecorView().getRootWindowInsets();
                    c = rootWindowInsets2.getSystemWindowInsetBottom();
                    return;
                }
            }
        }
        c = 0;
    }

    public static boolean y() {
        try {
            Method method = Class.forName("android.util.FtFeature").getMethod("isFeatureSupport", Integer.TYPE);
            if (method != null) {
                return ((Boolean) method.invoke(null, 32)).booleanValue();
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    public static int h(Context context) {
        char c2 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f59d750d", new Object[]{context})).intValue();
        }
        if (context.getResources().getConfiguration().orientation != 1) {
            c2 = 1;
        }
        if (f[c2] == null) {
            WindowManager windowManager = (WindowManager) context.getSystemService(pg1.ATOM_EXT_window);
            if (windowManager == null) {
                return g(context);
            }
            Display defaultDisplay = windowManager.getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getRealSize(point);
            f[c2] = point;
        }
        return f[c2].y;
    }

    public static boolean l(Context context) {
        float f2;
        float f3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c4a8b02c", new Object[]{context})).booleanValue();
        }
        if (d) {
            return e;
        }
        d = true;
        e = false;
        WindowManager windowManager = (WindowManager) context.getSystemService(pg1.ATOM_EXT_window);
        if (windowManager != null) {
            Display defaultDisplay = windowManager.getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getRealSize(point);
            int i = point.x;
            int i2 = point.y;
            if (i < i2) {
                f2 = i;
                f3 = i2;
            } else {
                f2 = i2;
                f3 = i;
            }
            if (f3 / f2 >= 1.97f) {
                e = true;
            }
        }
        return e;
    }

    public static boolean q(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("be823a7c", new Object[]{str})).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        JSONArray jSONArray = new JSONArray(str);
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject optJSONObject = jSONArray.optJSONObject(i);
            if (optJSONObject != null && optJSONObject.optString("model").equals(f())) {
                return true;
            }
        }
        return false;
    }

    public static boolean r() {
        boolean z = true;
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            if (((Integer) cls.getMethod("getInt", String.class, Integer.TYPE).invoke(cls, "ro.miui.notch", 0)).intValue() != 1) {
                z = false;
            }
            return z;
        } catch (ClassNotFoundException | Exception unused) {
            return false;
        }
    }
}
