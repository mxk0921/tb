package com.taobao.uikit.extend.utils;

import android.app.Activity;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.WindowManager;
import com.android.alibaba.ip.runtime.IpChange;
import tb.pg1;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class NavigationBarUtils {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(932184194);
    }

    public static int getContentHeight(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("48145356", new Object[]{activity})).intValue();
        }
        DisplayMetrics displayMetrics = new DisplayMetrics();
        ((WindowManager) activity.getSystemService(pg1.ATOM_EXT_window)).getDefaultDisplay().getRealMetrics(displayMetrics);
        return displayMetrics.heightPixels - getCurrentNavigationBarHeight(activity);
    }

    public static int getCurrentNavigationBarHeight(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("882dabef", new Object[]{activity})).intValue();
        }
        if (isNavigationBarShown(activity)) {
            return getNavigationBarHeight(activity);
        }
        return 0;
    }

    public static boolean isNavigationBarShown(Activity activity) {
        int visibility;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c7263359", new Object[]{activity})).booleanValue();
        }
        View findViewById = activity.findViewById(16908336);
        if (findViewById == null || (visibility = findViewById.getVisibility()) == 8 || visibility == 4) {
            return false;
        }
        return true;
    }

    public static int getNavigationBarHeight(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a70058bc", new Object[]{activity})).intValue();
        }
        int identifier = activity.getResources().getIdentifier("navigation_bar_height", "dimen", "android");
        if (identifier > 0) {
            return activity.getResources().getDimensionPixelSize(identifier);
        }
        return 0;
    }
}
