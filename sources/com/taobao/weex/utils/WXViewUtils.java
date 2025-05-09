package com.taobao.weex.utils;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.view.WindowManager;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.weex.WXEnvironment;
import tb.pg1;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class WXViewUtils {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static int f14153a;
    public static int b = -1;
    public static int c;

    static {
        t2o.a(985661839);
    }

    public static int dip2px(float f) {
        float f2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("777b781d", new Object[]{new Float(f)})).intValue();
        }
        try {
            f2 = WXEnvironment.getApplication().getResources().getDisplayMetrics().density;
        } catch (Exception e) {
            WXLogUtils.e("[WXViewUtils] dip2px:", e);
            f2 = 2.0f;
        }
        float f3 = (f * f2) + 0.5f;
        if (f3 <= 0.0f || f3 >= 1.0f) {
            return (int) f3;
        }
        return 1;
    }

    public static int getFullScreenHeight(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("59ff1fbc", new Object[]{context})).intValue();
        }
        if (context != null) {
            Resources resources = context.getResources();
            WindowManager windowManager = (WindowManager) context.getSystemService(pg1.ATOM_EXT_window);
            if (windowManager == null || windowManager.getDefaultDisplay() == null) {
                c = context.getResources().getDisplayMetrics().heightPixels;
            } else {
                Point point = new Point();
                windowManager.getDefaultDisplay().getRealSize(point);
                c = point.y;
            }
            if (WXEnvironment.SETTING_FORCE_VERTICAL_SCREEN) {
                int i = resources.getDisplayMetrics().widthPixels;
                f14153a = i;
                int i2 = c;
                if (i2 > i) {
                    i = i2;
                }
                c = i;
            }
        }
        return c;
    }

    @Deprecated
    public static float getRealPxByWidth(float f) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("a42f8b16", new Object[]{new Float(f)})).floatValue() : getRealPxByWidth(f, 750);
    }

    @Deprecated
    public static float getRealSubPxByWidth(float f) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5e7b328e", new Object[]{new Float(f)})).floatValue() : getRealSubPxByWidth(f, 750);
    }

    @Deprecated
    public static int getScreenHeight() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("3d9e9723", new Object[0])).intValue() : getScreenHeight(WXEnvironment.sApplication);
    }

    @Deprecated
    public static int getScreenWidth() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("43d49fe", new Object[0])).intValue() : getScreenWidth(WXEnvironment.sApplication);
    }

    public static int getStatusBarHeight(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("226dbd42", new Object[]{context})).intValue();
        }
        Resources resources = context.getResources();
        int identifier = resources.getIdentifier("status_bar_height", "dimen", "android");
        if (identifier > 0) {
            return resources.getDimensionPixelSize(identifier);
        }
        return -1;
    }

    @Deprecated
    public static float getWebPxByWidth(float f) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("ab7eba0", new Object[]{new Float(f)})).floatValue() : getWebPxByWidth(f, 750);
    }

    @Deprecated
    public static float getWeexPxByReal(float f) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("62085835", new Object[]{new Float(f)})).floatValue() : getWeexPxByReal(f, 750);
    }

    public static void setWindowHeight(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2aef1843", new Object[]{new Integer(i)});
        }
    }

    public static void setWindowWidth(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dbd585e8", new Object[]{new Integer(i)});
        } else {
            b = i;
        }
    }

    @Deprecated
    public static float getRealPxByWidth(float f, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e1c24c8d", new Object[]{new Float(f), new Integer(i)})).floatValue();
        }
        if (Float.isNaN(f)) {
            return f;
        }
        float screenWidth = (f * getScreenWidth()) / i;
        double d = screenWidth;
        if (d <= 0.005d || screenWidth >= 1.0f) {
            return (float) Math.rint(d);
        }
        return 1.0f;
    }

    @Deprecated
    public static float getRealSubPxByWidth(float f, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("70eb9415", new Object[]{new Float(f), new Integer(i)})).floatValue();
        }
        if (Float.isNaN(f)) {
            return f;
        }
        float screenWidth = (f * getScreenWidth()) / i;
        if (screenWidth <= 0.005d || screenWidth >= 1.0f) {
            return screenWidth;
        }
        return 1.0f;
    }

    @Deprecated
    public static int getScreenHeight(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bb976a8b", new Object[]{context})).intValue();
        }
        if (context != null) {
            Resources resources = context.getResources();
            c = resources.getDisplayMetrics().heightPixels;
            if (WXEnvironment.SETTING_FORCE_VERTICAL_SCREEN) {
                int i = resources.getDisplayMetrics().widthPixels;
                f14153a = i;
                int i2 = c;
                if (i2 > i) {
                    i = i2;
                }
                c = i;
            }
        }
        return c;
    }

    public static int getScreenWidth(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b36f1410", new Object[]{context})).intValue();
        }
        int i = b;
        if (i > 0) {
            return i;
        }
        if (context != null) {
            Resources resources = context.getResources();
            f14153a = resources.getDisplayMetrics().widthPixels;
            if (WXEnvironment.SETTING_FORCE_VERTICAL_SCREEN) {
                int i2 = resources.getDisplayMetrics().heightPixels;
                c = i2;
                int i3 = f14153a;
                if (i2 > i3) {
                    i2 = i3;
                }
                f14153a = i2;
            }
        }
        return f14153a;
    }

    @Deprecated
    public static float getWebPxByWidth(float f, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4c45fd43", new Object[]{new Float(f), new Integer(i)})).floatValue();
        }
        double d = f;
        if (d < -1.9999d && d > -2.005d) {
            return Float.NaN;
        }
        float screenWidth = (f * i) / getScreenWidth();
        if (screenWidth <= 0.005d || screenWidth >= 1.0f) {
            return screenWidth;
        }
        return 1.0f;
    }

    @Deprecated
    public static float getWeexPxByReal(float f, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("df03234e", new Object[]{new Float(f), new Integer(i)})).floatValue() : Float.isNaN(f) ? f : (f * i) / getScreenWidth();
    }
}
