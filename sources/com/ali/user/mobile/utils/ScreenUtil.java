package com.ali.user.mobile.utils;

import android.content.Context;
import android.telephony.TelephonyManager;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import com.android.alibaba.ip.runtime.IpChange;
import tb.pg1;
import tb.t2o;
import tb.vu3;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class ScreenUtil {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static int sPad = -1;
    private static int sFoldScreen = -1;

    static {
        t2o.a(68157650);
    }

    public static int dip2px(Context context, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8536afc1", new Object[]{context, new Float(f)})).intValue();
        }
        return (int) ((f * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    public static double getScreenInches(Context context) {
        WindowManager windowManager;
        Display defaultDisplay;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9e48e2d5", new Object[]{context})).doubleValue();
        }
        if (context == null || (windowManager = (WindowManager) context.getSystemService(pg1.ATOM_EXT_window)) == null || (defaultDisplay = windowManager.getDefaultDisplay()) == null) {
            return vu3.b.GEO_NOT_SUPPORT;
        }
        DisplayMetrics displayMetrics = new DisplayMetrics();
        defaultDisplay.getMetrics(displayMetrics);
        float f = displayMetrics.xdpi;
        return (f <= 0.0f || displayMetrics.ydpi <= 0.0f) ? vu3.b.GEO_NOT_SUPPORT : Math.sqrt(Math.pow(displayMetrics.widthPixels / f, 2.0d) + Math.pow(displayMetrics.heightPixels / displayMetrics.ydpi, 2.0d));
    }

    public static boolean isPad(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b55c22bc", new Object[]{context})).booleanValue();
        }
        if (sPad == -1) {
            boolean isPadBySystemProperties = isPadBySystemProperties();
            if (!isPadBySystemProperties) {
                isPadBySystemProperties = isPadByPhoneType(context);
            }
            if (!isPadBySystemProperties) {
                isPadBySystemProperties = isPadBySize(context);
            }
            if (isPadBySystemProperties && DeviceUtils.isFoldDevice(context)) {
                isPadBySystemProperties = false;
            }
            if (!isPadBySystemProperties) {
                sPad = 0;
            } else {
                sPad = 1;
            }
        }
        if (sPad == 1) {
            return true;
        }
        return false;
    }

    public static boolean isPadByGoogle(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7476682c", new Object[]{context})).booleanValue();
        }
        if ((context.getResources().getConfiguration().screenLayout & 15) >= 3) {
            return true;
        }
        return false;
    }

    private static boolean isPadBySize(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f431c364", new Object[]{context})).booleanValue();
        }
        if (!isPadByGoogle(context)) {
            return false;
        }
        double screenInches = getScreenInches(context);
        if (screenInches <= vu3.b.GEO_NOT_SUPPORT || screenInches < 8.0d) {
            return false;
        }
        return true;
    }

    public static int pxTodip(Context context, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ba36d7ba", new Object[]{context, new Float(f)})).intValue();
        }
        return (int) ((f / context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    public static boolean isPadByPhoneType(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5fff41bd", new Object[]{context})).booleanValue();
        }
        return ((TelephonyManager) context.getSystemService("phone")).getPhoneType() == 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x002b, code lost:
        if (r2.equalsIgnoreCase("tablet") != false) goto L_0x0031;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean isPadBySystemProperties() {
        /*
            r0 = 1
            r1 = 0
            java.lang.String r2 = "android.os.SystemProperties"
            java.lang.Class r2 = java.lang.Class.forName(r2)     // Catch: Exception -> 0x002e
            java.lang.String r3 = "get"
            java.lang.Class[] r4 = new java.lang.Class[r0]     // Catch: Exception -> 0x002e
            java.lang.Class<java.lang.String> r5 = java.lang.String.class
            r4[r1] = r5     // Catch: Exception -> 0x002e
            java.lang.reflect.Method r3 = r2.getMethod(r3, r4)     // Catch: Exception -> 0x002e
            java.lang.Object[] r4 = new java.lang.Object[r0]     // Catch: Exception -> 0x002e
            java.lang.String r5 = "ro.build.characteristics"
            r4[r1] = r5     // Catch: Exception -> 0x002e
            java.lang.Object r2 = r3.invoke(r2, r4)     // Catch: Exception -> 0x002e
            java.lang.String r2 = (java.lang.String) r2     // Catch: Exception -> 0x002e
            if (r2 == 0) goto L_0x0030
            java.lang.String r3 = "tablet"
            boolean r2 = r2.equalsIgnoreCase(r3)     // Catch: Exception -> 0x002e
            if (r2 == 0) goto L_0x0030
            goto L_0x0031
        L_0x002e:
            r0 = move-exception
            goto L_0x0033
        L_0x0030:
            r0 = 0
        L_0x0031:
            r1 = r0
            goto L_0x0036
        L_0x0033:
            r0.printStackTrace()
        L_0x0036:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ali.user.mobile.utils.ScreenUtil.isPadBySystemProperties():boolean");
    }
}
