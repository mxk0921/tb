package tb;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class nxh {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static volatile int f25016a = 0;
    public static volatile int b = 0;
    public static volatile float c = -1.0f;

    static {
        t2o.a(982516258);
    }

    public static float b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fb371fab", new Object[]{context})).floatValue();
        }
        if (c < 0.0f) {
            c = context.getResources().getDisplayMetrics().density;
        }
        return c;
    }

    public static int c(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bb976a8b", new Object[]{context})).intValue();
        }
        if (b == 0) {
            b = d(context);
        }
        return b;
    }

    @Deprecated
    public static int d(Context context) {
        boolean isInMultiWindowMode;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9383313c", new Object[]{context})).intValue();
        }
        WindowManager windowManager = (WindowManager) context.getSystemService(pg1.ATOM_EXT_window);
        if (windowManager != null) {
            int i = Build.VERSION.SDK_INT;
            DisplayMetrics displayMetrics = new DisplayMetrics();
            windowManager.getDefaultDisplay().getRealMetrics(displayMetrics);
            if ((context instanceof Activity) && i >= 28) {
                isInMultiWindowMode = ((Activity) context).isInMultiWindowMode();
                if (isInMultiWindowMode) {
                    return Math.max(displayMetrics.widthPixels, displayMetrics.heightPixels);
                }
            }
            return displayMetrics.heightPixels;
        } else if (context.getResources().getConfiguration().orientation == 2) {
            return context.getResources().getDisplayMetrics().widthPixels;
        } else {
            return context.getResources().getDisplayMetrics().heightPixels;
        }
    }

    public static int e(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b36f1410", new Object[]{context})).intValue();
        }
        if (f25016a == 0) {
            f25016a = f(context);
        }
        return f25016a;
    }

    @Deprecated
    public static int f(Context context) {
        boolean isInMultiWindowMode;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a67b817", new Object[]{context})).intValue();
        }
        WindowManager windowManager = (WindowManager) context.getSystemService(pg1.ATOM_EXT_window);
        if (windowManager != null) {
            int i = Build.VERSION.SDK_INT;
            DisplayMetrics displayMetrics = new DisplayMetrics();
            windowManager.getDefaultDisplay().getMetrics(displayMetrics);
            if ((context instanceof Activity) && i >= 28) {
                isInMultiWindowMode = ((Activity) context).isInMultiWindowMode();
                if (isInMultiWindowMode) {
                    return Math.min(displayMetrics.widthPixels, displayMetrics.heightPixels);
                }
            }
            return displayMetrics.widthPixels;
        } else if (context.getResources().getConfiguration().orientation == 2) {
            return context.getResources().getDisplayMetrics().heightPixels;
        } else {
            return context.getResources().getDisplayMetrics().widthPixels;
        }
    }

    public static int g(Context context) {
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

    public static void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("13781df6", new Object[0]);
        }
    }

    public static void i(int i, int i2, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b3d37eb", new Object[]{new Integer(i), new Integer(i2), new Float(f)});
            return;
        }
        f25016a = i;
        b = i2;
        c = f;
    }

    public static int j(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c8a63508", new Object[]{new Integer(i)})).intValue();
        }
        if (i == 1) {
            return 1073741824;
        }
        if (i != 2) {
            return 0;
        }
        return Integer.MIN_VALUE;
    }

    public static int a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b91d22e4", new Object[]{context})).intValue();
        }
        int identifier = context.getResources().getIdentifier("navigation_bar_height", "dimen", "android");
        if (identifier > 0) {
            return context.getResources().getDimensionPixelSize(identifier);
        }
        return 0;
    }
}
