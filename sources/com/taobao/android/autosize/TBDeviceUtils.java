package com.taobao.android.autosize;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.os.Build;
import android.provider.Settings;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.huawei.hms.android.SystemUtils;
import com.taobao.tao.flexbox.layoutmanager.player.videodecide.VideoControllerManager;
import com.taobao.tao.log.TLog;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;
import tb.ab0;
import tb.f7l;
import tb.ig4;
import tb.lqo;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class TBDeviceUtils {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String HN_MANUFACTURE_LOWER_CASE = "honor";
    public static final String HW_MANUFACTURE_LOWER_CASE = "huawei";
    public static final String LENOVO_MANUFACTURE_LOWER_CASE = "lenovo";
    public static final String MI_MANUFACTURE_LOWER_CASE = "xiaomi";
    public static final String OP_MANUFACTURE_LOWER_CASE = "oppo";
    public static final String REDMI_MANUFACTURE_LOWER_CASE = "redmi";
    public static final String SS_MANUFACTURE_LOWER_CASE = "samsung";
    public static final String VV_MANUFACTURE_LOWER_CASE = "vivo";

    /* renamed from: a  reason: collision with root package name */
    public static final List<String> f6421a = new ArrayList<String>() { // from class: com.taobao.android.autosize.TBDeviceUtils.1
        {
            add("unknownRLI");
            add("HWTAH");
            add("TAH-AN00m");
            add("HWTAH-C");
            add("RHA-AN00m");
            add("unknownRHA");
            add("HGS-AL10");
        }
    };
    public static final List<String> b = new ArrayList<String>() { // from class: com.taobao.android.autosize.TBDeviceUtils.2
        {
            add("SM-F9000");
            add("SM-W2020");
            add("SM-F9160");
            add("SM-W2021");
            add("SM-F9260");
            add("SM-W2022");
            add("SM-F9360");
            add("SM-F9460");
            add("SM-W9023");
        }
    };
    public static final List<String> c = new ArrayList<String>() { // from class: com.taobao.android.autosize.TBDeviceUtils.3
        {
            add("cetus");
            add("zizhan");
        }
    };
    public static final List<String> d = new ArrayList<String>() { // from class: com.taobao.android.autosize.TBDeviceUtils.4
        {
            add("M2011J18C");
            add("22061218C");
            add("2308CPXD0C");
        }
    };
    public static final List<String> e = new ArrayList<String>() { // from class: com.taobao.android.autosize.TBDeviceUtils.5
        {
            add("PGT110");
            add("BAL-AL00");
            add("BAL-AL60");
            add("BAL-AL80");
            add("BAL-L49");
        }
    };
    public static final List<String> f = new ArrayList<String>() { // from class: com.taobao.android.autosize.TBDeviceUtils.6
        {
            add("ELS-AN00");
            add("ANA-AN00");
            add("TAS-AN00");
            add("NOH-AN00");
            add("LIO-AN00");
            add("SEA-AL10");
            add("M2012K11AC");
            add("FNE-AN00");
            add("2211133C");
            add("23013RK75C");
            add("RVL-AL09");
            add("Mi 10");
            add("23116PN5BC");
            add("M2102J2SC");
            add("M2104K10AC");
            add("M2011K2C");
            add("XT2201-2");
            add("23049RAD8C");
            add("M2012K10C");
            add("22041211AC");
            add("Mi 10 Pro");
            add("M2012K11C");
            add("M2102K1AC");
            add("2304FPN6DC");
            add("M2007J1SC");
            add("XT2175-2");
            add("LIO-AL00");
            add("23127PN0CC");
            add("SM-N975U1");
            add("Pixel 7 Pro");
            add("XT2153-1");
            add("21091116C");
            add("ALT-L29");
            add("2210132C");
            add("M2102K1C");
            add("SM-N950N");
            add("22011211C");
            add("Pixel 6 Pro");
            add("2106118C");
            add("22127RK46C");
            add("SM-S908E");
            add("22041216C");
            add("LIO-AN00m");
            add("Pixel 6");
            add("XQ-DQ72");
            add("Pixel 7");
            add("EDI-AL10");
            add("M2007J17C");
            add("2201122C");
            add("XQ-BC72");
            add("RVL-AL09");
            add("2206122SC");
            add("XT2241-1");
            add("Redmi Note 8 Pro");
            add("2203121C");
            add("M2007J22C");
            add("XT2301-5");
            add("MI 9");
            add("ASUS_I005DA");
            add("22021211RC");
            add("XT2243-2");
            add("Redmi K30 Pro");
        }
    };
    public static volatile int g = -1;
    public static volatile int h = -1;
    public static volatile int i = -1;
    public static volatile int j = -1;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final Pattern f6422a = Pattern.compile("([a-z]+)-\\[(\\d+),(\\d+),(\\d+),(\\d+)]-?(flat|half-opened)?");

        public static /* synthetic */ Pattern a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Pattern) ipChange.ipc$dispatch("d6fe7a40", new Object[0]);
            }
            return f6422a;
        }
    }

    public static boolean B(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bbaebb7f", new Object[]{context})).booleanValue();
        }
        return "foldPhone".equals(d(context));
    }

    public static boolean F(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e2cf822e", new Object[]{activity})).booleanValue();
        }
        return activity.getResources().getConfiguration().toString().contains("zui-magic-windows");
    }

    public static boolean K(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6f1e089b", new Object[]{activity})).booleanValue();
        }
        return activity.getResources().getConfiguration().toString().contains("oplus-magic-windows");
    }

    public static boolean N() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("da268fbe", new Object[0])).booleanValue();
        }
        return f("SEC_FLOATING_FEATURE_FRAMEWORK_SUPPORT_FOLDABLE_TYPE_FLIP").equals("TRUE");
    }

    public static boolean U(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("99d887a7", new Object[]{activity})).booleanValue();
        }
        return activity.getResources().getConfiguration().toString().contains("multi-landscape");
    }

    public static boolean X() {
        if (!"vivo".equalsIgnoreCase(Build.BRAND)) {
            return false;
        }
        try {
            Class<?> cls = Class.forName("android.util.FtDeviceInfo");
            return "tablet".equals(cls.getMethod("getDeviceType", new Class[0]).invoke(cls, new Object[0]));
        } catch (Exception e2) {
            TLog.loge("TBDeviceUtils", "isVivoTablet: ", e2);
            return false;
        }
    }

    public static boolean Y(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1fb2f9b6", new Object[]{activity})).booleanValue();
        }
        return activity.getResources().getConfiguration().toString().contains("miui-magic-windows");
    }

    public static int g(Context context) {
        Configuration configuration = context.getResources().getConfiguration();
        try {
            Field declaredField = configuration.getClass().getDeclaredField("semDisplayDeviceType");
            declaredField.setAccessible(true);
            int intValue = ((Integer) declaredField.get(configuration)).intValue();
            if (intValue != 0) {
                return intValue != 5 ? -1 : 2;
            }
            return 0;
        } catch (IllegalAccessException e2) {
            TLog.loge("TBDeviceUtils", "getSamsungFoldDisplayType: ", e2);
            return -1;
        } catch (NoSuchFieldException e3) {
            TLog.loge("TBDeviceUtils", "getSamsungFoldDisplayType: ", e3);
            return -1;
        }
    }

    public static boolean j(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8757e0eb", new Object[]{activity})).booleanValue();
        }
        ab0 d2 = lqo.d();
        if (d2 == null || !d2.b(activity)) {
            return false;
        }
        return true;
    }

    public static boolean n(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bb5bf99b", new Object[]{context})).booleanValue();
        }
        List<String> list = e;
        String str = Build.MODEL;
        if (((ArrayList) list).contains(str)) {
            return true;
        }
        if (((ArrayList) f).contains(str) || ig4.m().k(context).contains(str) || ig4.m().p(context).contains(str)) {
            return false;
        }
        if (ig4.m().j(context).contains(str)) {
            return true;
        }
        if (ig4.m().o(context).contains(str)) {
            return false;
        }
        return o(context);
    }

    public static boolean r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cff45419", new Object[0])).booleanValue();
        }
        if ("Xiaomi".equalsIgnoreCase(Build.MANUFACTURER)) {
            if (((ArrayList) c).contains(Build.DEVICE)) {
                if (((ArrayList) d).contains(Build.MODEL)) {
                    TLog.loge("TBDeviceUtils", "is XIAOMI Fold Device");
                    return true;
                }
            }
        }
        String str = Build.BRAND;
        if ("samsung".equalsIgnoreCase(str)) {
            if (((ArrayList) b).contains(Build.MODEL)) {
                TLog.loge("TBDeviceUtils", "is SAMSUNG Fold Device");
                return true;
            }
        }
        if (SystemUtils.PRODUCT_HUAWEI.equalsIgnoreCase(str)) {
            if (((ArrayList) f6421a).contains(Build.DEVICE)) {
                TLog.loge("TBDeviceUtils", "is HUAWEI Fold Device");
                return true;
            }
        }
        return false;
    }

    public static boolean u(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4d625b11", new Object[]{activity})).booleanValue();
        }
        return activity.getResources().getConfiguration().toString().contains("magic-windows");
    }

    public static boolean z(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5a0c20c9", new Object[]{context})).booleanValue();
        }
        return "flipPhone".equals(d(context));
    }

    public static boolean G(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8057cadc", new Object[]{context})).booleanValue();
        }
        if (!SystemUtils.PRODUCT_HUAWEI.equalsIgnoreCase(Build.BRAND) || !((ArrayList) f6421a).contains(Build.DEVICE)) {
            return A(context);
        }
        TLog.loge("TBDeviceUtils", "is HUAWEI Fold Device");
        return true;
    }

    public static boolean V() {
        try {
            Class<?> cls = Class.forName("android.util.FtDeviceInfo");
            return "filp".equals((String) cls.getMethod("getDeviceType", new Class[0]).invoke(cls, new Object[0]));
        } catch (Exception e2) {
            TLog.loge("TBDeviceUtils", "isVivoFlipDevice: ", e2);
            return false;
        }
    }

    public static boolean W(Context context) {
        try {
            return "foldable".equals((String) Class.forName("android.util.FtDeviceInfo").getMethod("getDeviceType", new Class[0]).invoke(null, new Object[0]));
        } catch (Throwable th) {
            TLog.loge("TBDeviceUtils", "is not vivo fold device", th);
            return false;
        }
    }

    public static boolean Z() {
        try {
            Class<?> cls = Class.forName("miui.util.MiuiMultiDisplayTypeInfo");
            Object invoke = cls.getMethod("isFlipDevice", new Class[0]).invoke(cls, new Object[0]);
            if (invoke instanceof Boolean) {
                return ((Boolean) invoke).booleanValue();
            }
            return false;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static boolean A(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6edc561b", new Object[]{context})).booleanValue();
        }
        if (context == null) {
            return false;
        }
        PackageManager packageManager = context.getPackageManager();
        if (!SystemUtils.PRODUCT_HUAWEI.equalsIgnoreCase(Build.MANUFACTURER) || packageManager == null || !packageManager.hasSystemFeature("com.huawei.hardware.sensor.posture")) {
            TLog.loge("TBDeviceUtils", "isHwFoldableDevice: false");
            return false;
        }
        TLog.loge("TBDeviceUtils", "isHwFoldableDevice: true");
        return true;
    }

    public static boolean C(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f5974990", new Object[]{activity})).booleanValue();
        }
        String configuration = activity.getResources().getConfiguration().toString();
        return configuration.contains("mWindowingMode=hwMultiwindow-primary") || configuration.contains("mWindowingMode=hwMultiwindow-freeform");
    }

    public static boolean D(Activity activity) {
        boolean z;
        boolean z2 = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("387284ae", new Object[]{activity})).booleanValue();
        }
        if (activity == null) {
            return false;
        }
        String lowerCase = Build.MANUFACTURER.toLowerCase();
        lowerCase.hashCode();
        char c2 = 65535;
        switch (lowerCase.hashCode()) {
            case -1206476313:
                if (lowerCase.equals("huawei")) {
                    c2 = 0;
                    break;
                }
                break;
            case -1106355917:
                if (lowerCase.equals("lenovo")) {
                    c2 = 1;
                    break;
                }
                break;
            case -759499589:
                if (lowerCase.equals("xiaomi")) {
                    c2 = 2;
                    break;
                }
                break;
            case 3418016:
                if (lowerCase.equals("oppo")) {
                    c2 = 3;
                    break;
                }
                break;
            case 3620012:
                if (lowerCase.equals("vivo")) {
                    c2 = 4;
                    break;
                }
                break;
            case 99462250:
                if (lowerCase.equals("honor")) {
                    c2 = 5;
                    break;
                }
                break;
            case 108389869:
                if (lowerCase.equals(REDMI_MANUFACTURE_LOWER_CASE)) {
                    c2 = 6;
                    break;
                }
                break;
            case 1864941562:
                if (lowerCase.equals("samsung")) {
                    c2 = 7;
                    break;
                }
                break;
        }
        switch (c2) {
            case 0:
                z = x(activity);
                break;
            case 1:
                z = F(activity);
                break;
            case 2:
            case 6:
                z = Y(activity);
                break;
            case 3:
                z = K(activity);
                break;
            case 4:
                z = U(activity);
                break;
            case 5:
                z = u(activity);
                break;
            case 7:
                z = M(activity);
                break;
            default:
                z = false;
                break;
        }
        TLog.loge("TBDeviceUtils", "manufacture: isInMagicWindowMode=" + z + " configuration=" + activity.getResources().getConfiguration());
        if (z || j(activity)) {
            z2 = true;
        }
        TLog.loge("TBDeviceUtils", "isActivityEmbedded=" + z2 + " activity=" + activity);
        return z2;
    }

    public static boolean E(Activity activity) {
        boolean isInMultiWindowMode;
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9849da3a", new Object[]{activity})).booleanValue();
        }
        if (activity == null) {
            return false;
        }
        if (Build.VERSION.SDK_INT >= 24) {
            isInMultiWindowMode = activity.isInMultiWindowMode();
            if (isInMultiWindowMode) {
                TLog.loge("TBDeviceUtils", "isInMultiWindowMode=true  activity=" + activity);
                return true;
            }
        }
        if (("huawei".equals(Build.MANUFACTURER.toLowerCase()) ? C(activity) : false) || H(activity)) {
            z = true;
        }
        TLog.loge("TBDeviceUtils", "isInMultiWindowMode=" + z + " activity=" + activity + VideoControllerManager.ARRAY_KEY_CONFIGURATION + activity.getResources().getConfiguration());
        return z;
    }

    public static boolean H(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9e8f6de2", new Object[]{activity})).booleanValue();
        }
        String configuration = activity.getResources().getConfiguration().toString();
        return configuration.contains("mWindowingMode=multi-window") || configuration.contains("mWindowingMode=freeform");
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0057, code lost:
        if (((java.lang.Boolean) r4).booleanValue() == false) goto L_0x0063;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean I() {
        /*
            r0 = 1
            r1 = 0
            java.lang.String r2 = "isOPPOFoldableDeviceV2: "
            java.lang.String r3 = "TBDeviceUtils"
            java.lang.String r4 = "com.oplus.content.OplusFeatureConfigManager"
            java.lang.Class r4 = java.lang.Class.forName(r4)     // Catch: IllegalAccessException -> 0x005a, InvocationTargetException -> 0x005c, NoSuchMethodException -> 0x005e, ClassNotFoundException -> 0x0060
            java.lang.String r5 = "getInstance"
            java.lang.Class[] r6 = new java.lang.Class[r1]     // Catch: IllegalAccessException -> 0x005a, InvocationTargetException -> 0x005c, NoSuchMethodException -> 0x005e, ClassNotFoundException -> 0x0060
            java.lang.reflect.Method r5 = r4.getMethod(r5, r6)     // Catch: IllegalAccessException -> 0x005a, InvocationTargetException -> 0x005c, NoSuchMethodException -> 0x005e, ClassNotFoundException -> 0x0060
            java.lang.Object[] r6 = new java.lang.Object[r1]     // Catch: IllegalAccessException -> 0x005a, InvocationTargetException -> 0x005c, NoSuchMethodException -> 0x005e, ClassNotFoundException -> 0x0060
            r7 = 0
            java.lang.Object r5 = r5.invoke(r7, r6)     // Catch: IllegalAccessException -> 0x005a, InvocationTargetException -> 0x005c, NoSuchMethodException -> 0x005e, ClassNotFoundException -> 0x0060
            java.lang.String r6 = "hasFeature"
            java.lang.Class[] r7 = new java.lang.Class[r0]     // Catch: IllegalAccessException -> 0x005a, InvocationTargetException -> 0x005c, NoSuchMethodException -> 0x005e, ClassNotFoundException -> 0x0060
            java.lang.Class<java.lang.String> r8 = java.lang.String.class
            r7[r1] = r8     // Catch: IllegalAccessException -> 0x005a, InvocationTargetException -> 0x005c, NoSuchMethodException -> 0x005e, ClassNotFoundException -> 0x0060
            java.lang.reflect.Method r4 = r4.getDeclaredMethod(r6, r7)     // Catch: IllegalAccessException -> 0x005a, InvocationTargetException -> 0x005c, NoSuchMethodException -> 0x005e, ClassNotFoundException -> 0x0060
            java.lang.Object[] r6 = new java.lang.Object[r0]     // Catch: IllegalAccessException -> 0x005a, InvocationTargetException -> 0x005c, NoSuchMethodException -> 0x005e, ClassNotFoundException -> 0x0060
            java.lang.String r7 = "oplus.hardware.type.fold"
            r6[r1] = r7     // Catch: IllegalAccessException -> 0x005a, InvocationTargetException -> 0x005c, NoSuchMethodException -> 0x005e, ClassNotFoundException -> 0x0060
            java.lang.Object r6 = r4.invoke(r5, r6)     // Catch: IllegalAccessException -> 0x005a, InvocationTargetException -> 0x005c, NoSuchMethodException -> 0x005e, ClassNotFoundException -> 0x0060
            java.lang.Object[] r7 = new java.lang.Object[r0]     // Catch: IllegalAccessException -> 0x005a, InvocationTargetException -> 0x005c, NoSuchMethodException -> 0x005e, ClassNotFoundException -> 0x0060
            java.lang.String r8 = "oplus.software.fold_remap_display_disabled"
            r7[r1] = r8     // Catch: IllegalAccessException -> 0x005a, InvocationTargetException -> 0x005c, NoSuchMethodException -> 0x005e, ClassNotFoundException -> 0x0060
            java.lang.Object r4 = r4.invoke(r5, r7)     // Catch: IllegalAccessException -> 0x005a, InvocationTargetException -> 0x005c, NoSuchMethodException -> 0x005e, ClassNotFoundException -> 0x0060
            boolean r5 = r6 instanceof java.lang.Boolean     // Catch: IllegalAccessException -> 0x005a, InvocationTargetException -> 0x005c, NoSuchMethodException -> 0x005e, ClassNotFoundException -> 0x0060
            if (r5 == 0) goto L_0x0074
            boolean r5 = r4 instanceof java.lang.Boolean     // Catch: IllegalAccessException -> 0x005a, InvocationTargetException -> 0x005c, NoSuchMethodException -> 0x005e, ClassNotFoundException -> 0x0060
            if (r5 == 0) goto L_0x0074
            java.lang.Boolean r6 = (java.lang.Boolean) r6     // Catch: IllegalAccessException -> 0x005a, InvocationTargetException -> 0x005c, NoSuchMethodException -> 0x005e, ClassNotFoundException -> 0x0060
            boolean r5 = r6.booleanValue()     // Catch: IllegalAccessException -> 0x005a, InvocationTargetException -> 0x005c, NoSuchMethodException -> 0x005e, ClassNotFoundException -> 0x0060
            if (r5 == 0) goto L_0x0062
            java.lang.Boolean r4 = (java.lang.Boolean) r4     // Catch: IllegalAccessException -> 0x005a, InvocationTargetException -> 0x005c, NoSuchMethodException -> 0x005e, ClassNotFoundException -> 0x0060
            boolean r2 = r4.booleanValue()     // Catch: IllegalAccessException -> 0x005a, InvocationTargetException -> 0x005c, NoSuchMethodException -> 0x005e, ClassNotFoundException -> 0x0060
            if (r2 != 0) goto L_0x0062
            goto L_0x0063
        L_0x005a:
            r0 = move-exception
            goto L_0x0065
        L_0x005c:
            r0 = move-exception
            goto L_0x0069
        L_0x005e:
            r0 = move-exception
            goto L_0x006d
        L_0x0060:
            r0 = move-exception
            goto L_0x0071
        L_0x0062:
            r0 = 0
        L_0x0063:
            r1 = r0
            goto L_0x0074
        L_0x0065:
            com.taobao.tao.log.TLog.loge(r3, r2, r0)
            goto L_0x0074
        L_0x0069:
            com.taobao.tao.log.TLog.loge(r3, r2, r0)
            goto L_0x0074
        L_0x006d:
            com.taobao.tao.log.TLog.loge(r3, r2, r0)
            goto L_0x0074
        L_0x0071:
            com.taobao.tao.log.TLog.loge(r3, r2, r0)
        L_0x0074:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.autosize.TBDeviceUtils.I():boolean");
    }

    public static boolean J() {
        try {
            Class<?> cls = Class.forName("com.oplus.content.OplusFeatureConfigManager");
            Object invoke = cls.getDeclaredMethod("hasFeature", String.class).invoke(cls.getMethod("getInstance", new Class[0]).invoke(null, new Object[0]), "oplus.hardware.type.tablet");
            if (invoke instanceof Boolean) {
                return ((Boolean) invoke).booleanValue();
            }
            return false;
        } catch (ClassNotFoundException e2) {
            TLog.loge("TBDeviceUtils", "isOPPOTablet: ", e2);
            return false;
        } catch (IllegalAccessException e3) {
            TLog.loge("TBDeviceUtils", "isOPPOTablet: ", e3);
            return false;
        } catch (NoSuchMethodException e4) {
            TLog.loge("TBDeviceUtils", "isOPPOTablet: ", e4);
            return false;
        } catch (InvocationTargetException e5) {
            TLog.loge("TBDeviceUtils", "isOPPOTablet: ", e5);
            return false;
        }
    }

    public static boolean L() {
        try {
            Class<?> cls = Class.forName("com.oplus.content.OplusFeatureConfigManager");
            Object invoke = cls.getDeclaredMethod("hasFeature", String.class).invoke(cls.getMethod("getInstance", new Class[0]).invoke(null, new Object[0]), "oplus.software.fold_remap_display_disabled");
            if (invoke instanceof Boolean) {
                return ((Boolean) invoke).booleanValue();
            }
            return false;
        } catch (ClassNotFoundException e2) {
            TLog.loge("TBDeviceUtils", "isOppoFlipDevice: ", e2);
            return false;
        } catch (IllegalAccessException e3) {
            TLog.loge("TBDeviceUtils", "isOppoFlipDevice: ", e3);
            return false;
        } catch (NoSuchMethodException e4) {
            TLog.loge("TBDeviceUtils", "isOppoFlipDevice: ", e4);
            return false;
        } catch (InvocationTargetException e5) {
            TLog.loge("TBDeviceUtils", "isOppoFlipDevice: ", e5);
            return false;
        }
    }

    public static boolean M(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5e44121", new Object[]{activity})).booleanValue();
        }
        try {
            String configuration = activity.getResources().getConfiguration().toString();
            int indexOf = configuration.indexOf("mBounds=Rect(");
            String substring = configuration.substring(indexOf + 13, configuration.indexOf(f7l.BRACKET_END_STR, indexOf));
            int indexOf2 = configuration.indexOf("mMaxBounds=Rect(");
            String substring2 = configuration.substring(indexOf2 + 16, configuration.indexOf(f7l.BRACKET_END_STR, indexOf2));
            boolean z = !TextUtils.isEmpty(configuration) && configuration.contains("mWindowingMode=freeform");
            TLog.loge("TBDeviceUtils", "bound=" + substring + " max=" + substring2 + " freeformMode=" + z);
            if (z || TextUtils.isEmpty(substring2)) {
                return false;
            }
            return !TextUtils.equals(substring2, substring);
        } catch (Exception e2) {
            TLog.loge("TBDeviceUtils", "isSamsungEasyGoOpen: ", e2);
            return false;
        }
    }

    public static boolean O(Context context) {
        String str;
        try {
            Class<?> cls = Class.forName("com.samsung.android.feature.SemFloatingFeature");
            str = (String) cls.getDeclaredMethod("getString", String.class).invoke(cls.getMethod("getInstance", new Class[0]).invoke(null, new Object[0]), "SEC_FLOATING_FEATURE_FRAMEWORK_SUPPORT_FOLDABLE_TYPE_FOLD");
        } catch (Throwable th) {
            TLog.loge("TBDeviceUtils", "isSamsungFoldableDevice: ", th);
            str = "";
        }
        return TextUtils.equals(str, "TRUE");
    }

    public static boolean P(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bc1a5af5", new Object[]{context})).booleanValue();
        }
        if (i == -1) {
            if (T(context)) {
                i = 0;
            } else {
                i = 1;
            }
            StringBuilder sb = new StringBuilder("isTablet=");
            sb.append(i == 0);
            TLog.loge("TBDeviceUtils", sb.toString());
        }
        return i == 0;
    }

    public static boolean Q(Context context) {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7574cc14", new Object[]{context})).booleanValue();
        }
        int i2 = context.getResources().getConfiguration().screenLayout & 15;
        if (i2 >= 3) {
            z = true;
        }
        if (z) {
            TLog.loge("TBDeviceUtils", "isTabletByLayout: tablet, screenLayout=" + i2);
        }
        return z;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x003f, code lost:
        if (r4.equals("oppo") == false) goto L_0x002a;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean R(android.content.Context r4) {
        /*
            r0 = 1
            r1 = 0
            com.android.alibaba.ip.runtime.IpChange r2 = com.taobao.android.autosize.TBDeviceUtils.$ipChange
            boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r3 == 0) goto L_0x0019
            java.lang.String r3 = "12eca9cb"
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r0[r1] = r4
            java.lang.Object r4 = r2.ipc$dispatch(r3, r0)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            return r4
        L_0x0019:
            java.lang.String r4 = android.os.Build.MANUFACTURER
            java.lang.String r4 = r4.toLowerCase()
            r4.hashCode()
            r2 = -1
            int r3 = r4.hashCode()
            switch(r3) {
                case -1206476313: goto L_0x0042;
                case 3418016: goto L_0x0038;
                case 3620012: goto L_0x002c;
                default: goto L_0x002a;
            }
        L_0x002a:
            r0 = -1
            goto L_0x004d
        L_0x002c:
            java.lang.String r0 = "vivo"
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto L_0x0036
            goto L_0x002a
        L_0x0036:
            r0 = 2
            goto L_0x004d
        L_0x0038:
            java.lang.String r3 = "oppo"
            boolean r4 = r4.equals(r3)
            if (r4 != 0) goto L_0x004d
            goto L_0x002a
        L_0x0042:
            java.lang.String r0 = "huawei"
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto L_0x004c
            goto L_0x002a
        L_0x004c:
            r0 = 0
        L_0x004d:
            switch(r0) {
                case 0: goto L_0x005b;
                case 1: goto L_0x0056;
                case 2: goto L_0x0051;
                default: goto L_0x0050;
            }
        L_0x0050:
            goto L_0x005f
        L_0x0051:
            boolean r1 = X()
            goto L_0x005f
        L_0x0056:
            boolean r1 = J()
            goto L_0x005f
        L_0x005b:
            boolean r1 = w()
        L_0x005f:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r0 = "isTabletByExt: manufacture result = "
            r4.<init>(r0)
            r4.append(r1)
            java.lang.String r4 = r4.toString()
            java.lang.String r0 = "TBDeviceUtils"
            com.taobao.tao.log.TLog.loge(r0, r4)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.autosize.TBDeviceUtils.R(android.content.Context):boolean");
    }

    public static boolean S() {
        boolean z = true;
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            String str = (String) cls.getMethod("get", String.class).invoke(cls, "ro.build.characteristics");
            TLog.loge("TBDeviceUtils", "isTabletBySystemProperties: " + str);
            if (str == null || !str.equalsIgnoreCase("tablet")) {
                z = (str == null || !str.contains(",")) ? false : Arrays.asList(str.split(",")).contains("tablet");
            }
            return z;
        } catch (Exception e2) {
            TLog.loge("TBDeviceUtils", "isTabletBySystemProperties: ", e2);
            return false;
        }
    }

    public static boolean T(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6605c938", new Object[]{context})).booleanValue();
        }
        List<String> list = f;
        String str = Build.MODEL;
        if (((ArrayList) list).contains(str)) {
            TLog.loge("TBDeviceUtils", "isTabletInternal: PHONE_DEVICES, local result = false");
            return false;
        } else if (ig4.m().k(context).contains(str)) {
            TLog.loge("TBDeviceUtils", "isTabletInternal: FoldDeviceList, orange result = false");
            return false;
        } else if (ig4.m().p(context).contains(str)) {
            TLog.loge("TBDeviceUtils", "isTabletInternal: TabletDeviceList, orange result = true");
            return true;
        } else if (ig4.m().j(context).contains(str)) {
            TLog.loge("TBDeviceUtils", "isTabletInternal: FlipDeviceList, orange result = false");
            return false;
        } else if (!ig4.m().o(context).contains(str)) {
            return ig4.m().H(context) ? (R(context) || S() || Q(context)) && !p(context) : (R(context) || S()) && !p(context);
        } else {
            TLog.loge("TBDeviceUtils", "isTabletInternal: PhoneDeviceList, orange result = false");
            return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0086 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00cb A[Catch: Exception -> 0x0075, TryCatch #0 {Exception -> 0x0075, blocks: (B:13:0x0052, B:17:0x005b, B:22:0x006a, B:27:0x0078, B:33:0x0088, B:35:0x0090, B:37:0x00cb, B:39:0x00d1, B:41:0x00e1, B:45:0x00ea, B:50:0x00f9, B:53:0x0104), top: B:63:0x0052 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0104 A[Catch: Exception -> 0x0075, TRY_LEAVE, TryCatch #0 {Exception -> 0x0075, blocks: (B:13:0x0052, B:17:0x005b, B:22:0x006a, B:27:0x0078, B:33:0x0088, B:35:0x0090, B:37:0x00cb, B:39:0x00d1, B:41:0x00e1, B:45:0x00ea, B:50:0x00f9, B:53:0x0104), top: B:63:0x0052 }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0116 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int b(android.content.Context r12) {
        /*
            Method dump skipped, instructions count: 297
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.autosize.TBDeviceUtils.b(android.content.Context):int");
    }

    public static int c(Context context) {
        int i2 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("31c9c14d", new Object[]{context})).intValue();
        }
        try {
            int i3 = Settings.Global.getInt(context.getContentResolver(), "hn_fold_screen_state", 0);
            if (i3 != 1) {
                i2 = 2;
                if (i3 != 2) {
                    return i3 != 3 ? -1 : 1;
                }
            }
            return i2;
        } catch (Exception e2) {
            TLog.loge("TBDeviceUtils", "getHonorFoldStatus: ", e2);
            return -1;
        }
    }

    public static int e(Context context) {
        int i2 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ca422fdc", new Object[]{context})).intValue();
        }
        try {
            int i3 = Settings.Global.getInt(context.getContentResolver(), "hw_fold_display_mode_prepare");
            if (i3 != 1) {
                i2 = 2;
                if (i3 != 2) {
                    return i3 != 3 ? -1 : 1;
                }
            }
            return i2;
        } catch (Settings.SettingNotFoundException e2) {
            TLog.loge("TBDeviceUtils", "getHwFoldStatus: ", e2);
            return -1;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0081  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String f(java.lang.String r9) {
        /*
            r0 = 1
            r1 = 0
            java.lang.String r2 = "getSamsungFeature: featureTagName="
            java.lang.String r3 = "TBDeviceUtils"
            java.lang.String r4 = "com.samsung.android.feature.SemFloatingFeature"
            java.lang.Class r4 = java.lang.Class.forName(r4)     // Catch: IllegalAccessException -> 0x0036, InvocationTargetException -> 0x0038, NoSuchMethodException -> 0x003a, ClassNotFoundException -> 0x003c
            java.lang.String r5 = "getInstance"
            java.lang.Class[] r6 = new java.lang.Class[r1]     // Catch: IllegalAccessException -> 0x0036, InvocationTargetException -> 0x0038, NoSuchMethodException -> 0x003a, ClassNotFoundException -> 0x003c
            java.lang.reflect.Method r5 = r4.getMethod(r5, r6)     // Catch: IllegalAccessException -> 0x0036, InvocationTargetException -> 0x0038, NoSuchMethodException -> 0x003a, ClassNotFoundException -> 0x003c
            java.lang.Object[] r6 = new java.lang.Object[r1]     // Catch: IllegalAccessException -> 0x0036, InvocationTargetException -> 0x0038, NoSuchMethodException -> 0x003a, ClassNotFoundException -> 0x003c
            r7 = 0
            java.lang.Object r5 = r5.invoke(r7, r6)     // Catch: IllegalAccessException -> 0x0036, InvocationTargetException -> 0x0038, NoSuchMethodException -> 0x003a, ClassNotFoundException -> 0x003c
            java.lang.String r6 = "getString"
            java.lang.Class[] r7 = new java.lang.Class[r0]     // Catch: IllegalAccessException -> 0x0036, InvocationTargetException -> 0x0038, NoSuchMethodException -> 0x003a, ClassNotFoundException -> 0x003c
            java.lang.Class<java.lang.String> r8 = java.lang.String.class
            r7[r1] = r8     // Catch: IllegalAccessException -> 0x0036, InvocationTargetException -> 0x0038, NoSuchMethodException -> 0x003a, ClassNotFoundException -> 0x003c
            java.lang.reflect.Method r4 = r4.getDeclaredMethod(r6, r7)     // Catch: IllegalAccessException -> 0x0036, InvocationTargetException -> 0x0038, NoSuchMethodException -> 0x003a, ClassNotFoundException -> 0x003c
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch: IllegalAccessException -> 0x0036, InvocationTargetException -> 0x0038, NoSuchMethodException -> 0x003a, ClassNotFoundException -> 0x003c
            r0[r1] = r9     // Catch: IllegalAccessException -> 0x0036, InvocationTargetException -> 0x0038, NoSuchMethodException -> 0x003a, ClassNotFoundException -> 0x003c
            java.lang.Object r0 = r4.invoke(r5, r0)     // Catch: IllegalAccessException -> 0x0036, InvocationTargetException -> 0x0038, NoSuchMethodException -> 0x003a, ClassNotFoundException -> 0x003c
            java.lang.String r0 = (java.lang.String) r0     // Catch: IllegalAccessException -> 0x0036, InvocationTargetException -> 0x0038, NoSuchMethodException -> 0x003a, ClassNotFoundException -> 0x003c
            goto L_0x007f
        L_0x0036:
            r0 = move-exception
            goto L_0x003e
        L_0x0038:
            r0 = move-exception
            goto L_0x004e
        L_0x003a:
            r0 = move-exception
            goto L_0x005e
        L_0x003c:
            r0 = move-exception
            goto L_0x006e
        L_0x003e:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r2)
            r1.append(r9)
            java.lang.String r9 = r1.toString()
            com.taobao.tao.log.TLog.loge(r3, r9, r0)
            goto L_0x007d
        L_0x004e:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r2)
            r1.append(r9)
            java.lang.String r9 = r1.toString()
            com.taobao.tao.log.TLog.loge(r3, r9, r0)
            goto L_0x007d
        L_0x005e:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r2)
            r1.append(r9)
            java.lang.String r9 = r1.toString()
            com.taobao.tao.log.TLog.loge(r3, r9, r0)
            goto L_0x007d
        L_0x006e:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r2)
            r1.append(r9)
            java.lang.String r9 = r1.toString()
            com.taobao.tao.log.TLog.loge(r3, r9, r0)
        L_0x007d:
            java.lang.String r0 = ""
        L_0x007f:
            if (r0 == 0) goto L_0x0087
            boolean r9 = r0.isEmpty()
            if (r9 == 0) goto L_0x008a
        L_0x0087:
            java.lang.String r0 = "unknown"
        L_0x008a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.autosize.TBDeviceUtils.f(java.lang.String):java.lang.String");
    }

    public static int h(Context context) {
        int i2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1c73af1f", new Object[]{context})).intValue();
        }
        try {
            i2 = Settings.Global.getInt(context.getContentResolver(), "device_posture", 0);
        } catch (Exception e2) {
            TLog.loge("TBDeviceUtils", "getVivoFoldStatus: ", e2);
        }
        if (i2 == -1) {
            return 2;
        }
        if (i2 != 2) {
            return i2 != 3 ? -1 : 0;
        }
        return 1;
    }

    public static int i(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f0c589b0", new Object[]{context})).intValue();
        }
        try {
            int i2 = Settings.Global.getInt(context.getContentResolver(), "device_posture", 0);
            if (i2 == 1) {
                return 2;
            }
            if (i2 != 2) {
                return i2 != 3 ? -1 : 0;
            }
            return 1;
        } catch (Exception e2) {
            TLog.loge("TBDeviceUtils", "getXiaomiFoldStatus: ", e2);
            return -1;
        }
    }

    public static boolean k(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8f5022ab", new Object[]{context})).booleanValue();
        }
        if (context == null) {
            TLog.loge("TBDeviceUtils", "isEasyGoSupported=false context=null");
            return false;
        }
        if (j == -1) {
            if (l(context)) {
                j = 0;
            } else {
                j = 1;
            }
        }
        StringBuilder sb = new StringBuilder("isEasyGoSupported=");
        sb.append(j == 0);
        TLog.loge("TBDeviceUtils", sb.toString());
        return j == 0;
    }

    public static boolean l(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cf2b7aee", new Object[]{context})).booleanValue();
        }
        return p(context) || w() || X() || J();
    }

    public static boolean m(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c3ec9e58", new Object[]{context})).booleanValue();
        }
        if (h == -1) {
            if (context == null) {
                TLog.loge("TBDeviceUtils", "isFlipDevice=false context=null");
                return false;
            }
            if (n(context)) {
                h = 0;
            } else {
                h = 1;
            }
            StringBuilder sb = new StringBuilder("isFlipDevice=");
            sb.append(h == 0);
            TLog.loge("TBDeviceUtils", sb.toString());
        }
        return h == 0;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0056, code lost:
        if (r2.equals("oppo") == false) goto L_0x0035;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean o(android.content.Context r5) {
        /*
            r0 = 1
            r1 = 0
            com.android.alibaba.ip.runtime.IpChange r2 = com.taobao.android.autosize.TBDeviceUtils.$ipChange
            boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r3 == 0) goto L_0x0019
            java.lang.String r3 = "638325d5"
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r0[r1] = r5
            java.lang.Object r5 = r2.ipc$dispatch(r3, r0)
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            return r5
        L_0x0019:
            if (r5 != 0) goto L_0x0024
            java.lang.String r5 = "TBDeviceUtils"
            java.lang.String r0 = "isFlipDeviceInternal: input context is empty, exit!"
            com.taobao.tao.log.TLog.loge(r5, r0)
            return r1
        L_0x0024:
            java.lang.String r2 = android.os.Build.MANUFACTURER
            java.lang.String r2 = r2.toLowerCase()
            r2.hashCode()
            r3 = -1
            int r4 = r2.hashCode()
            switch(r4) {
                case -1206476313: goto L_0x0059;
                case 3418016: goto L_0x004f;
                case 3620012: goto L_0x0043;
                case 1864941562: goto L_0x0037;
                default: goto L_0x0035;
            }
        L_0x0035:
            r0 = -1
            goto L_0x0064
        L_0x0037:
            java.lang.String r0 = "samsung"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L_0x0041
            goto L_0x0035
        L_0x0041:
            r0 = 3
            goto L_0x0064
        L_0x0043:
            java.lang.String r0 = "vivo"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L_0x004d
            goto L_0x0035
        L_0x004d:
            r0 = 2
            goto L_0x0064
        L_0x004f:
            java.lang.String r4 = "oppo"
            boolean r2 = r2.equals(r4)
            if (r2 != 0) goto L_0x0064
            goto L_0x0035
        L_0x0059:
            java.lang.String r0 = "huawei"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L_0x0063
            goto L_0x0035
        L_0x0063:
            r0 = 0
        L_0x0064:
            switch(r0) {
                case 0: goto L_0x0077;
                case 1: goto L_0x0072;
                case 2: goto L_0x006d;
                case 3: goto L_0x0068;
                default: goto L_0x0067;
            }
        L_0x0067:
            goto L_0x007b
        L_0x0068:
            boolean r1 = N()
            goto L_0x007b
        L_0x006d:
            boolean r1 = V()
            goto L_0x007b
        L_0x0072:
            boolean r1 = L()
            goto L_0x007b
        L_0x0077:
            boolean r1 = z(r5)
        L_0x007b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.autosize.TBDeviceUtils.o(android.content.Context):boolean");
    }

    public static boolean p(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("afe54a44", new Object[]{context})).booleanValue();
        }
        if (g == -1) {
            if (context == null) {
                return false;
            }
            if (q(context)) {
                g = 0;
            } else {
                g = 1;
            }
            StringBuilder sb = new StringBuilder("isFoldDevice=");
            sb.append(g == 0);
            TLog.loge("TBDeviceUtils", sb.toString());
        }
        return g == 0;
    }

    public static boolean q(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("948ff987", new Object[]{context})).booleanValue();
        }
        if (r()) {
            TLog.loge("TBDeviceUtils", "isFoldDeviceInternal: isFoldEnableByDeviceModel, local result = true");
            return true;
        }
        List<String> list = f;
        String str = Build.MODEL;
        if (((ArrayList) list).contains(str)) {
            TLog.loge("TBDeviceUtils", "isFoldDeviceInternal: PHONE_DEVICES, local result = false");
            return false;
        } else if (ig4.m().k(context).contains(str)) {
            TLog.loge("TBDeviceUtils", "isFoldDeviceInternal: FoldDeviceList, orange result = true");
            return true;
        } else if (ig4.m().p(context).contains(str)) {
            TLog.loge("TBDeviceUtils", "isFoldDeviceInternal: TabletDeviceList, orange result = false");
            return false;
        } else if (ig4.m().j(context).contains(str)) {
            TLog.loge("TBDeviceUtils", "isFoldDeviceInternal: FlipDeviceList, orange result = false");
            return false;
        } else if (ig4.m().o(context).contains(str)) {
            TLog.loge("TBDeviceUtils", "isFoldDeviceInternal: FlipDeviceList, orange result = false");
            return false;
        } else {
            String lowerCase = Build.MANUFACTURER.toLowerCase();
            if (!ig4.m().J(context) || ((!TextUtils.equals(lowerCase, "xiaomi") && !TextUtils.equals(lowerCase, REDMI_MANUFACTURE_LOWER_CASE)) || !Z())) {
                return s(context) && !m(context);
            }
            TLog.loge("TBDeviceUtils", "isFoldDeviceInternal: is " + lowerCase + " and is flip, local result = true");
            return true;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x007b, code lost:
        if (r3.equals("xiaomi") == false) goto L_0x0036;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean s(android.content.Context r6) {
        /*
            r0 = 1
            r1 = 0
            com.android.alibaba.ip.runtime.IpChange r2 = com.taobao.android.autosize.TBDeviceUtils.$ipChange
            boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r3 == 0) goto L_0x001a
            java.lang.String r3 = "d85b0256"
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r0[r1] = r6
            java.lang.Object r6 = r2.ipc$dispatch(r3, r0)
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            return r6
        L_0x001a:
            java.lang.String r2 = "TBDeviceUtils"
            if (r6 != 0) goto L_0x0025
            java.lang.String r6 = "isFolderEnableByExt: input context is empty, exit!"
            com.taobao.tao.log.TLog.loge(r2, r6)
            return r1
        L_0x0025:
            java.lang.String r3 = android.os.Build.MANUFACTURER
            java.lang.String r3 = r3.toLowerCase()
            r3.hashCode()
            r4 = -1
            int r5 = r3.hashCode()
            switch(r5) {
                case -1206476313: goto L_0x007e;
                case -759499589: goto L_0x0074;
                case 3418016: goto L_0x0068;
                case 3620012: goto L_0x005c;
                case 99462250: goto L_0x0050;
                case 108389869: goto L_0x0044;
                case 1864941562: goto L_0x0038;
                default: goto L_0x0036;
            }
        L_0x0036:
            r0 = -1
            goto L_0x0089
        L_0x0038:
            java.lang.String r0 = "samsung"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L_0x0042
            goto L_0x0036
        L_0x0042:
            r0 = 6
            goto L_0x0089
        L_0x0044:
            java.lang.String r0 = "redmi"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L_0x004e
            goto L_0x0036
        L_0x004e:
            r0 = 5
            goto L_0x0089
        L_0x0050:
            java.lang.String r0 = "honor"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L_0x005a
            goto L_0x0036
        L_0x005a:
            r0 = 4
            goto L_0x0089
        L_0x005c:
            java.lang.String r0 = "vivo"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L_0x0066
            goto L_0x0036
        L_0x0066:
            r0 = 3
            goto L_0x0089
        L_0x0068:
            java.lang.String r0 = "oppo"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L_0x0072
            goto L_0x0036
        L_0x0072:
            r0 = 2
            goto L_0x0089
        L_0x0074:
            java.lang.String r5 = "xiaomi"
            boolean r3 = r3.equals(r5)
            if (r3 != 0) goto L_0x0089
            goto L_0x0036
        L_0x007e:
            java.lang.String r0 = "huawei"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L_0x0088
            goto L_0x0036
        L_0x0088:
            r0 = 0
        L_0x0089:
            switch(r0) {
                case 0: goto L_0x00a6;
                case 1: goto L_0x00a1;
                case 2: goto L_0x009c;
                case 3: goto L_0x0097;
                case 4: goto L_0x0092;
                case 5: goto L_0x00a1;
                case 6: goto L_0x008d;
                default: goto L_0x008c;
            }
        L_0x008c:
            goto L_0x00aa
        L_0x008d:
            boolean r1 = O(r6)
            goto L_0x00aa
        L_0x0092:
            boolean r1 = v(r6)
            goto L_0x00aa
        L_0x0097:
            boolean r1 = W(r6)
            goto L_0x00aa
        L_0x009c:
            boolean r1 = I()
            goto L_0x00aa
        L_0x00a1:
            boolean r1 = a0(r6)
            goto L_0x00aa
        L_0x00a6:
            boolean r1 = B(r6)
        L_0x00aa:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r0 = "isFolderEnableByExt: manufacture result = "
            r6.<init>(r0)
            r6.append(r1)
            java.lang.String r6 = r6.toString()
            com.taobao.tao.log.TLog.loge(r2, r6)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.autosize.TBDeviceUtils.s(android.content.Context):boolean");
    }

    public static boolean t(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c856eb0a", new Object[]{context})).booleanValue();
        }
        if (!"samsung".equalsIgnoreCase(Build.BRAND) || !((ArrayList) b).contains(Build.MODEL)) {
            TLog.loge("TBDeviceUtils", "is not isGalaxyFold");
            return false;
        }
        TLog.loge("TBDeviceUtils", "is isGalaxyFold");
        return true;
    }

    public static boolean v(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7aa5e234", new Object[]{context})).booleanValue();
        }
        if (context == null) {
            return false;
        }
        PackageManager packageManager = context.getPackageManager();
        if (!SystemUtils.PRODUCT_HONOR.equalsIgnoreCase(Build.MANUFACTURER) || packageManager == null || !packageManager.hasSystemFeature("com.hihonor.hardware.sensor.posture")) {
            TLog.loge("TBDeviceUtils", "isHonorFoldableDevice: false");
            return false;
        }
        TLog.loge("TBDeviceUtils", "isHonorFoldableDevice: true");
        return true;
    }

    public static boolean w() {
        if (!"huawei".equalsIgnoreCase(Build.BRAND)) {
            return false;
        }
        try {
            Class<?> cls = Class.forName("com.huawei.android.os.SystemPropertiesEx");
            return "tablet".equals(cls.getMethod("get", String.class, String.class).invoke(cls.newInstance(), "ro.build.characteristics", ""));
        } catch (Throwable th) {
            TLog.loge("TBDeviceUtils", "isHvPad: with exception ", th);
            return false;
        }
    }

    public static boolean x(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d70b6d0a", new Object[]{activity})).booleanValue();
        }
        return y(activity.getResources().getConfiguration()) || y(activity.getApplication().getResources().getConfiguration());
    }

    public static boolean y(Configuration configuration) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("aaf1c8c0", new Object[]{configuration})).booleanValue();
        }
        String configuration2 = configuration.toString();
        return configuration2.contains("hwMultiwindow-magic") || configuration2.contains("hw-magic-windows");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0085, code lost:
        if (r3.equals("huawei") == false) goto L_0x0034;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int a(android.content.Context r5) {
        /*
            r0 = -1
            r1 = 0
            r2 = 1
            com.android.alibaba.ip.runtime.IpChange r3 = com.taobao.android.autosize.TBDeviceUtils.$ipChange
            boolean r4 = r3 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r4 == 0) goto L_0x001a
            java.lang.String r0 = "72fa726b"
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r2[r1] = r5
            java.lang.Object r5 = r3.ipc$dispatch(r0, r2)
            java.lang.Number r5 = (java.lang.Number) r5
            int r5 = r5.intValue()
            return r5
        L_0x001a:
            if (r5 != 0) goto L_0x001d
            return r0
        L_0x001d:
            boolean r3 = p(r5)
            if (r3 != 0) goto L_0x0024
            return r0
        L_0x0024:
            java.lang.String r3 = android.os.Build.MANUFACTURER
            java.lang.String r3 = r3.toLowerCase()
            r3.hashCode()
            int r4 = r3.hashCode()
            switch(r4) {
                case -1206476313: goto L_0x007e;
                case -759499589: goto L_0x0072;
                case 3418016: goto L_0x0066;
                case 3620012: goto L_0x005a;
                case 99462250: goto L_0x004e;
                case 108389869: goto L_0x0042;
                case 1864941562: goto L_0x0036;
                default: goto L_0x0034;
            }
        L_0x0034:
            r1 = -1
            goto L_0x0088
        L_0x0036:
            java.lang.String r1 = "samsung"
            boolean r1 = r3.equals(r1)
            if (r1 != 0) goto L_0x0040
            goto L_0x0034
        L_0x0040:
            r1 = 6
            goto L_0x0088
        L_0x0042:
            java.lang.String r1 = "redmi"
            boolean r1 = r3.equals(r1)
            if (r1 != 0) goto L_0x004c
            goto L_0x0034
        L_0x004c:
            r1 = 5
            goto L_0x0088
        L_0x004e:
            java.lang.String r1 = "honor"
            boolean r1 = r3.equals(r1)
            if (r1 != 0) goto L_0x0058
            goto L_0x0034
        L_0x0058:
            r1 = 4
            goto L_0x0088
        L_0x005a:
            java.lang.String r1 = "vivo"
            boolean r1 = r3.equals(r1)
            if (r1 != 0) goto L_0x0064
            goto L_0x0034
        L_0x0064:
            r1 = 3
            goto L_0x0088
        L_0x0066:
            java.lang.String r1 = "oppo"
            boolean r1 = r3.equals(r1)
            if (r1 != 0) goto L_0x0070
            goto L_0x0034
        L_0x0070:
            r1 = 2
            goto L_0x0088
        L_0x0072:
            java.lang.String r1 = "xiaomi"
            boolean r1 = r3.equals(r1)
            if (r1 != 0) goto L_0x007c
            goto L_0x0034
        L_0x007c:
            r1 = 1
            goto L_0x0088
        L_0x007e:
            java.lang.String r2 = "huawei"
            boolean r2 = r3.equals(r2)
            if (r2 != 0) goto L_0x0088
            goto L_0x0034
        L_0x0088:
            switch(r1) {
                case 0: goto L_0x00b4;
                case 1: goto L_0x00af;
                case 2: goto L_0x00aa;
                case 3: goto L_0x00a5;
                case 4: goto L_0x00a0;
                case 5: goto L_0x00af;
                case 6: goto L_0x009b;
                default: goto L_0x008b;
            }
        L_0x008b:
            int r5 = b(r5)
            if (r5 == r0) goto L_0x0092
            return r5
        L_0x0092:
            tb.xxa r5 = tb.xxa.g()
            int r5 = r5.f()
            return r5
        L_0x009b:
            int r5 = g(r5)
            return r5
        L_0x00a0:
            int r5 = c(r5)
            return r5
        L_0x00a5:
            int r5 = h(r5)
            return r5
        L_0x00aa:
            int r5 = b(r5)
            return r5
        L_0x00af:
            int r5 = i(r5)
            return r5
        L_0x00b4:
            int r5 = e(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.autosize.TBDeviceUtils.a(android.content.Context):int");
    }

    public static boolean a0(Context context) {
        try {
            return ((Integer) Class.forName("android.os.SystemProperties").getMethod("getInt", String.class, Integer.TYPE).invoke(null, "persist.sys.muiltdisplay_type", 0)).intValue() == 2;
        } catch (ClassNotFoundException e2) {
            TLog.loge("TBDeviceUtils", "isXiaomiFoldableDevice: ", e2);
            return false;
        } catch (IllegalAccessException e3) {
            e3.printStackTrace();
            TLog.loge("TBDeviceUtils", "isXiaomiFoldableDevice: ", e3);
            return false;
        } catch (NoSuchMethodException e4) {
            TLog.loge("TBDeviceUtils", "isXiaomiFoldableDevice: ", e4);
            return false;
        } catch (InvocationTargetException e5) {
            TLog.loge("TBDeviceUtils", "isXiaomiFoldableDevice: ", e5);
            return false;
        }
    }

    public static String d(Context context) {
        try {
            return (String) Class.forName("android.os.SystemProperties").getMethod("get", String.class, String.class).invoke(null, "hw_sc.build.os.phonetype", "not getProp by key");
        } catch (Exception e2) {
            String message = e2.getMessage();
            TLog.loge("TBDeviceUtils", "getHwDeviceType: ", e2);
            return message;
        }
    }
}
