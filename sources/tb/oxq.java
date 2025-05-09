package tb;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.Region;
import android.os.Build;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.Log;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowManager;
import com.alipay.mobile.common.transport.monitor.RPCDataItems;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class oxq {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;

    /* renamed from: a  reason: collision with root package name */
    public static String f25735a = "";
    public static boolean b;
    public static int c;
    public static Region d;
    public static int e;

    public static Region a(Context context, int[] iArr) {
        int i;
        int i2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Region) ipChange.ipc$dispatch("e2750929", new Object[]{context, iArr});
        }
        if (iArr == null || (i = iArr[0]) <= 0 || (i2 = iArr[1]) <= 0) {
            return null;
        }
        int i3 = context.getResources().getDisplayMetrics().widthPixels / 2;
        int i4 = i / 2;
        return new Region(new Rect(i3 - i4, 0, i3 + i4, i2));
    }

    public static boolean b(Dialog dialog) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a531c49c", new Object[]{dialog})).booleanValue();
        }
        if (dialog == null) {
            return false;
        }
        return c(dialog.getContext(), dialog.getWindow());
    }

    public static boolean c(Context context, Window window) {
        Field field;
        if (context == null || window == null) {
            return false;
        }
        try {
            if (Build.VERSION.SDK_INT >= 27) {
                try {
                    WindowManager.LayoutParams attributes = window.getAttributes();
                    Class<?> cls = attributes.getClass();
                    Field field2 = cls.getField("layoutInDisplayCutoutMode");
                    try {
                        field = cls.getField("LAYOUT_IN_DISPLAY_CUTOUT_MODE_ALWAYS");
                    } catch (NoSuchFieldException unused) {
                        field = cls.getField("LAYOUT_IN_DISPLAY_CUTOUT_MODE_SHORT_EDGES");
                    }
                    field2.setInt(attributes, field.getInt(attributes));
                    window.setAttributes(attributes);
                    return true;
                } catch (NoSuchFieldException unused2) {
                    Log.e("SupportDisplayCutout", "fullScreenDisplayInCutout NoSuchField");
                }
            }
            if (d(window) || e(window)) {
                return true;
            }
            if (n(context.getPackageName())) {
                return true;
            }
            return false;
        } catch (Exception e2) {
            Log.e("SupportDisplayCutout", "fullScreenDisplayInCutout exception:", e2);
            return false;
        }
    }

    public static boolean e(Window window) {
        if (window == null) {
            return false;
        }
        if (p(window.getContext())) {
            try {
                Window.class.getMethod("clearExtraFlags ", Integer.TYPE).invoke(window, 1792);
                return false;
            } catch (Exception unused) {
            }
        }
        try {
            Window.class.getMethod("addExtraFlags", Integer.TYPE).invoke(window, 1792);
            return true;
        } catch (Exception unused2) {
            return false;
        }
    }

    public static Region f(Context context, WindowInsets windowInsets) {
        Object l;
        Region region = d;
        if (region != null) {
            return region;
        }
        Region region2 = null;
        try {
            if (Build.VERSION.SDK_INT >= 27 && (l = l(windowInsets)) != null) {
                try {
                    try {
                        try {
                            Object invoke = l.getClass().getMethod("getBounds", new Class[0]).invoke(l, new Object[0]);
                            if (invoke != null && (invoke instanceof Region)) {
                                region2 = (Region) invoke;
                            }
                        } catch (NoSuchMethodException unused) {
                            Log.e("SupportDisplayCutout", "getCutoutBounds NoSuchMethod");
                        }
                    } catch (IllegalAccessException unused2) {
                        Log.e("SupportDisplayCutout", "getCutoutBounds IllegalAccess");
                    }
                } catch (Exception e2) {
                    Log.e("SupportDisplayCutout", "getCutoutBounds exception", e2);
                }
            }
            if (region2 == null && (region2 = h(context)) == null && (region2 = i()) == null && (region2 = k(context)) == null) {
                region2 = j(context, OrangeConfig.getInstance().getConfig("displaycutoutsupport", "cutoutphonelist", ""));
            }
        } catch (Exception e3) {
            Log.e("SupportDisplayCutout", "getCutoutBounds Exception", e3);
        }
        if (region2 != null) {
            d = region2;
        }
        return region2;
    }

    public static int g(Context context, WindowInsets windowInsets) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f1a0318c", new Object[]{context, windowInsets})).intValue();
        }
        int i = c;
        if (i > 0) {
            return i;
        }
        Region f = f(context, windowInsets);
        if (f == null) {
            return 0;
        }
        int i2 = f.getBounds().bottom - f.getBounds().top;
        c = i2;
        return i2;
    }

    public static Region h(Context context) {
        try {
            Class<?> loadClass = context.getClassLoader().loadClass("com.huawei.android.util.HwNotchSizeUtil");
            int[] iArr = (int[]) loadClass.getMethod("getNotchSize", new Class[0]).invoke(loadClass, new Object[0]);
            if (iArr.length != 2 || iArr[0] <= 0 || iArr[1] <= 0) {
                return null;
            }
            StringBuilder sb = new StringBuilder("getCutoutInfoByHuawei:");
            sb.append(iArr[0]);
            sb.append(",");
            sb.append(iArr[1]);
            return a(context, iArr);
        } catch (ClassNotFoundException unused) {
            Log.e("SupportDisplayCutout", "getCutoutInfoByHuawei ClassNotFound");
            return null;
        } catch (Exception e2) {
            Log.e("SupportDisplayCutout", "getCutoutInfoByHuawei exception:", e2);
            return null;
        }
    }

    public static Object l(WindowInsets windowInsets) {
        if (windowInsets == null) {
            return null;
        }
        try {
            return windowInsets.getClass().getMethod("getDisplayCutout", new Class[0]).invoke(windowInsets, new Object[0]);
        } catch (NoSuchMethodException unused) {
            Log.e("SupportDisplayCutout", "getDisplayCutoutByGoogle NoSuchMethod");
            return null;
        } catch (Exception e2) {
            Log.e("SupportDisplayCutout", "getDisplayCutoutByGoogle exception:", e2);
            return null;
        }
    }

    public static String m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a78b0366", new Object[0]);
        }
        if (TextUtils.isEmpty(f25735a)) {
            f25735a = Build.MODEL;
        }
        return f25735a;
    }

    public static boolean p(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("846b35ce", new Object[]{context})).booleanValue();
        }
        if (context == null) {
            return false;
        }
        try {
            if (Settings.Global.getInt(context.getContentResolver(), "force_black", 0) == 1) {
                return true;
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0034 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean q(android.content.Context r5, android.view.WindowInsets r6) {
        /*
            r0 = 1
            r1 = 0
            com.android.alibaba.ip.runtime.IpChange r2 = tb.oxq.$ipChange
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
            boolean r2 = tb.oxq.b
            if (r2 == 0) goto L_0x0021
            return r0
        L_0x0021:
            int r2 = android.os.Build.VERSION.SDK_INT     // Catch: Exception -> 0x002f
            r3 = 27
            if (r2 < r3) goto L_0x0031
            java.lang.Object r6 = l(r6)     // Catch: Exception -> 0x002f
            if (r6 == 0) goto L_0x0031
            r6 = 1
            goto L_0x0032
        L_0x002f:
            r5 = move-exception
            goto L_0x0066
        L_0x0031:
            r6 = 0
        L_0x0032:
            if (r6 != 0) goto L_0x006f
            boolean r2 = r(r5)     // Catch: Exception -> 0x0049
            if (r2 != 0) goto L_0x004c
            boolean r5 = s(r5)     // Catch: Exception -> 0x0049
            if (r5 != 0) goto L_0x004c
            boolean r5 = u()     // Catch: Exception -> 0x0049
            if (r5 == 0) goto L_0x0047
            goto L_0x004c
        L_0x0047:
            r0 = 0
            goto L_0x004c
        L_0x0049:
            r5 = move-exception
            r1 = r6
            goto L_0x0066
        L_0x004c:
            if (r0 != 0) goto L_0x0064
            com.taobao.orange.OrangeConfig r5 = com.taobao.orange.OrangeConfig.getInstance()     // Catch: Exception -> 0x0061
            java.lang.String r6 = "displaycutoutsupport"
            java.lang.String r1 = "cutoutphonelist"
            java.lang.String r2 = ""
            java.lang.String r5 = r5.getConfig(r6, r1, r2)     // Catch: Exception -> 0x0061
            boolean r6 = t(r5)     // Catch: Exception -> 0x0061
            goto L_0x006f
        L_0x0061:
            r5 = move-exception
            r1 = r0
            goto L_0x0066
        L_0x0064:
            r6 = r0
            goto L_0x006f
        L_0x0066:
            java.lang.String r6 = "SupportDisplayCutout"
            java.lang.String r0 = "isCutoutScreen exception:"
            android.util.Log.e(r6, r0, r5)
            r6 = r1
        L_0x006f:
            tb.oxq.b = r6
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.oxq.q(android.content.Context, android.view.WindowInsets):boolean");
    }

    public static boolean r(Context context) {
        boolean z = false;
        try {
            Class<?> loadClass = context.getClassLoader().loadClass("com.huawei.android.util.HwNotchSizeUtil");
            z = ((Boolean) loadClass.getMethod("hasNotchInScreen", new Class[0]).invoke(loadClass, new Object[0])).booleanValue();
            new StringBuilder("isCutoutScreenByHuawei:").append(z);
            return z;
        } catch (ClassNotFoundException unused) {
            Log.e("SupportDisplayCutout", "isCutoutScreenByHuawei ClassNotFound");
            return z;
        } catch (Exception e2) {
            Log.e("SupportDisplayCutout", "isCutoutScreenByHuawei exception:", e2);
            return z;
        }
    }

    public static boolean s(Context context) {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("831344ec", new Object[]{context})).booleanValue();
        }
        try {
            z = context.getPackageManager().hasSystemFeature("com.oppo.feature.screen.heteromorphism");
            new StringBuilder("isCutoutScreenByOppo:").append(z);
            return z;
        } catch (Exception e2) {
            Log.e("SupportDisplayCutout", "isCutoutScreenByOppo exception:", e2);
            return z;
        }
    }

    public static Region k(Context context) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Region) ipChange.ipc$dispatch("daef7858", new Object[]{context});
        }
        try {
            int identifier = context.getResources().getIdentifier("notch_height", "dimen", "android");
            int dimensionPixelSize = identifier > 0 ? context.getResources().getDimensionPixelSize(identifier) : 0;
            int identifier2 = context.getResources().getIdentifier("notch_width", "dimen", "android");
            if (identifier2 > 0) {
                i = context.getResources().getDimensionPixelSize(identifier2);
            }
            if (dimensionPixelSize <= 0 || i <= 0) {
                return null;
            }
            return a(context, new int[]{i, dimensionPixelSize});
        } catch (Exception e2) {
            Log.e("SupportDisplayCutout", "getCutoutInfoByXiaoMi exception:", e2);
            return null;
        }
    }

    public static int o(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7b698891", new Object[]{context})).intValue();
        }
        int i = e;
        if (i > 0) {
            return i;
        }
        if (context != null) {
            try {
                int identifier = context.getResources().getIdentifier("status_bar_height", "dimen", "android");
                if (identifier > 0) {
                    e = context.getResources().getDimensionPixelSize(identifier);
                    new StringBuilder("getSystemStatusBarHeight:").append(e);
                    return e;
                }
            } catch (Exception e2) {
                Log.e("SupportDisplayCutout", "getSystemStatusBarHeight exception:", e2);
            }
        }
        return 0;
    }

    public static boolean d(Window window) {
        if (window != null) {
            try {
                WindowManager.LayoutParams attributes = window.getAttributes();
                Class<?> cls = Class.forName("com.huawei.android.view.LayoutParamsEx");
                cls.getMethod("addHwFlags", Integer.TYPE).invoke(cls.getConstructor(WindowManager.LayoutParams.class).newInstance(attributes), 65536);
                return true;
            } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException unused) {
                Log.e("SupportDisplayCutout", "hw notch screen flag api error");
            } catch (Exception unused2) {
                Log.e("SupportDisplayCutout", "other Exception");
            }
        }
        return false;
    }

    public static Region j(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Region) ipChange.ipc$dispatch("6bc369af", new Object[]{context, str});
        }
        new StringBuilder("getCutoutInfoByOrange, origin s:").append(str);
        try {
        } catch (Exception e2) {
            Log.e("SupportDisplayCutout", "getCutoutInfoByOrange exception:", e2);
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONArray jSONArray = new JSONArray(str);
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject optJSONObject = jSONArray.optJSONObject(i);
            if (optJSONObject != null) {
                String optString = optJSONObject.optString("model");
                int optInt = optJSONObject.optInt("w");
                int optInt2 = optJSONObject.optInt("h");
                if (optString.equals(m())) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("getCutoutInfoByOrange w:");
                    sb.append(optInt);
                    sb.append(",h:");
                    sb.append(optInt2);
                    return a(context, new int[]{optInt, optInt2});
                }
            }
        }
        return null;
    }

    public static boolean n(String str) {
        try {
        } catch (ClassNotFoundException unused) {
            Log.e("SupportDisplayCutout", "getOppoSwitchStatus ClassNotFound");
        } catch (IllegalAccessException unused2) {
            Log.e("SupportDisplayCutout", "getOppoSwitchStatus IllegalAccess");
        } catch (NoSuchMethodException unused3) {
            Log.e("SupportDisplayCutout", "getOppoSwitchStatus NoSuchMethod");
        } catch (Exception e2) {
            Log.e("SupportDisplayCutout", "getOppoSwitchStatus exception", e2);
        }
        if (TextUtils.isEmpty(str)) {
            Log.e(RPCDataItems.SWITCH_TAG_LOG, "pkgName can't be null");
            return false;
        }
        Class<?> cls = Class.forName("com.color.util.ColorDisplayCompatUtils");
        Object invoke = cls.getMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
        Method method = cls.getMethod("shouldNonImmersiveAdjustForPkg", String.class);
        if (method != null) {
            boolean booleanValue = ((Boolean) method.invoke(invoke, str)).booleanValue();
            StringBuilder sb = new StringBuilder("switch is open :");
            sb.append(!booleanValue);
            Log.e("SupportDisplayCutout", sb.toString());
            return !booleanValue;
        }
        return true;
    }

    public static boolean t(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("be823a7c", new Object[]{str})).booleanValue();
        }
        new StringBuilder("isCutoutScreenByOrange, config s:").append(str);
        try {
        } catch (Exception e2) {
            Log.e("SupportDisplayCutout", "isCutoutScreenByOrange exception:", e2);
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        JSONArray jSONArray = new JSONArray(str);
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject optJSONObject = jSONArray.optJSONObject(i);
            if (optJSONObject != null && optJSONObject.optString("model").equals(m())) {
                return true;
            }
        }
        return false;
    }

    public static Region i() {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            String str = (String) cls.getMethod("get", String.class, String.class).invoke(cls, "ro.oppo.screen.heteromorphism", "");
            new StringBuilder("getCutoutInfoByOppo property:").append(str);
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            new StringBuilder("getCutoutInfoByOppo :").append(str);
            String[] split = str.split(":");
            if (split.length != 2) {
                return null;
            }
            String[] split2 = split[0].split(",");
            String[] split3 = split[1].split(",");
            if (split2.length != 2 || split3.length != 2) {
                return null;
            }
            int intValue = Integer.valueOf(split2[0]).intValue();
            int intValue2 = Integer.valueOf(split2[1]).intValue();
            int intValue3 = Integer.valueOf(split3[0]).intValue();
            int intValue4 = Integer.valueOf(split3[1]).intValue();
            if (intValue3 - intValue <= 0 || intValue4 - intValue2 <= 0) {
                return null;
            }
            Region region = new Region(intValue, intValue2, intValue3, intValue4);
            new StringBuilder("getCutoutInfoByOppo region :").append(region.toString());
            return region;
        } catch (Exception e2) {
            Log.e("SupportDisplayCutout", "getCutoutInfoByOppo exception:", e2);
            return null;
        }
    }

    public static boolean u() {
        Exception e2;
        boolean z = true;
        boolean z2 = false;
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            if (((Integer) cls.getMethod("getInt", String.class, Integer.TYPE).invoke(cls, "ro.miui.notch", 0)).intValue() != 1) {
                z = false;
            }
            try {
                new StringBuilder("isCutoutScreenByXiaomi:").append(z);
                return z;
            } catch (ClassNotFoundException unused) {
                z2 = z;
                Log.e("SupportDisplayCutout", "isCutoutScreenByXiaomi ClassNotFound");
                return z2;
            } catch (Exception e3) {
                e2 = e3;
                z2 = z;
                Log.e("SupportDisplayCutout", "isCutoutScreenByXiaomi exception:", e2);
                return z2;
            }
        } catch (ClassNotFoundException unused2) {
        } catch (Exception e4) {
            e2 = e4;
        }
    }
}
