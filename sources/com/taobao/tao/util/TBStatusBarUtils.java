package com.taobao.tao.util;

import android.app.Activity;
import android.os.Build;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import androidx.recyclerview.widget.ItemTouchHelper;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class TBStatusBarUtils {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    private static boolean changeMeizuFlag(WindowManager.LayoutParams layoutParams, String str, boolean z) {
        try {
            Field declaredField = layoutParams.getClass().getDeclaredField(str);
            declaredField.setAccessible(true);
            int i = declaredField.getInt(layoutParams);
            Field declaredField2 = layoutParams.getClass().getDeclaredField("meizuFlags");
            declaredField2.setAccessible(true);
            int i2 = declaredField2.getInt(layoutParams);
            int i3 = z ? i | i2 : (~i) & i2;
            if (i2 == i3) {
                return false;
            }
            declaredField2.setInt(layoutParams, i3);
            return true;
        } catch (Throwable th) {
            th.printStackTrace();
            return false;
        }
    }

    public static boolean isBlackColor(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4fd4e819", new Object[]{new Integer(i), new Integer(i2)})).booleanValue();
        }
        if (toGrey(i) < i2) {
            return true;
        }
        return false;
    }

    public static boolean isLollipop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c053d360", new Object[0])).booleanValue();
        }
        return true;
    }

    public static boolean isMIUIDevice() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7df980db", new Object[0])).booleanValue();
        }
        return "Xiaomi".equals(Build.MANUFACTURER);
    }

    public static boolean isMeizuDevice() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bdedcb43", new Object[0])).booleanValue();
        }
        return "Meizu".endsWith(Build.MANUFACTURER);
    }

    public static void setStatusBarDarkIcon(Activity activity, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a040c9ed", new Object[]{activity, new Boolean(z)});
        } else {
            setStatusBarDarkIcon(activity, z, true);
        }
    }

    public static int toGrey(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("74a51395", new Object[]{new Integer(i)})).intValue();
        }
        return (((((i & ItemTouchHelper.ACTION_MODE_DRAG_MASK) >> 16) * 38) + (((65280 & i) >> 8) * 75)) + ((i & 255) * 15)) >> 7;
    }

    private static void setStatusBarDarkIcon(View view, boolean z) {
        try {
            int i = View.class.getField("SYSTEM_UI_FLAG_LIGHT_STATUS_BAR").getInt(null);
            int systemUiVisibility = view.getSystemUiVisibility();
            int i2 = z ? systemUiVisibility | i : (~i) & systemUiVisibility;
            if (i2 != systemUiVisibility) {
                view.setSystemUiVisibility(i2);
            }
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (NoSuchFieldException e2) {
            e2.printStackTrace();
        }
    }

    public static boolean miuiSetStatusBarLightMode(Activity activity, boolean z) {
        if (activity == null) {
            return false;
        }
        try {
            Window window = activity.getWindow();
            Class<?> cls = Class.forName("android.view.MiuiWindowManager$LayoutParams");
            int i = cls.getField("EXTRA_FLAG_STATUS_BAR_DARK_MODE").getInt(cls);
            Class<?> cls2 = window.getClass();
            Class<?> cls3 = Integer.TYPE;
            Method method = cls2.getMethod("setExtraFlags", cls3, cls3);
            if (z) {
                method.invoke(window, Integer.valueOf(i), Integer.valueOf(i));
            } else {
                method.invoke(window, 0, Integer.valueOf(i));
            }
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    private static void setStatusBarDarkIcon(Window window, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("93934242", new Object[]{window, new Boolean(z)});
        } else if (!isLollipop()) {
            changeMeizuFlag(window.getAttributes(), "MEIZU_FLAG_DARK_STATUS_BAR_ICON", z);
        } else {
            View decorView = window.getDecorView();
            if (decorView != null) {
                setStatusBarDarkIcon(decorView, z);
            }
        }
    }

    private static void setStatusBarDarkIcon(Activity activity, boolean z, boolean z2) {
        if (activity != null) {
            try {
                Method method = Activity.class.getMethod("setStatusBarDarkIcon", Boolean.TYPE);
                if (method != null) {
                    method.invoke(activity, Boolean.valueOf(z));
                } else if (z2) {
                    setStatusBarDarkIcon(activity.getWindow(), z);
                }
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (NoSuchMethodException e2) {
                e2.printStackTrace();
            } catch (InvocationTargetException e3) {
                e3.printStackTrace();
            }
        }
    }
}
