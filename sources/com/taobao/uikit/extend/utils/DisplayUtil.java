package com.taobao.uikit.extend.utils;

import android.content.Context;
import android.util.DisplayMetrics;
import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class DisplayUtil {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static DisplayMetrics mDisplayMetrics = null;

    static {
        t2o.a(932184193);
    }

    public static DisplayMetrics getDisplayMetrics(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DisplayMetrics) ipChange.ipc$dispatch("aeee540d", new Object[]{context});
        }
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        mDisplayMetrics = displayMetrics;
        return displayMetrics;
    }

    public static float getScreenDensity(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fb371fab", new Object[]{context})).floatValue();
        }
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        mDisplayMetrics = displayMetrics;
        return displayMetrics.density;
    }

    public static int getScreenHeight(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bb976a8b", new Object[]{context})).intValue();
        }
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        mDisplayMetrics = displayMetrics;
        return displayMetrics.heightPixels;
    }

    public static int getScreenWidth(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b36f1410", new Object[]{context})).intValue();
        }
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        mDisplayMetrics = displayMetrics;
        return displayMetrics.widthPixels;
    }
}
