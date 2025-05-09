package tb;

import android.app.Activity;
import android.content.Context;
import android.os.Looper;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.view.WindowManager;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class s56 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(444597688);
    }

    public static int a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8d14ea0a", new Object[]{context})).intValue();
        }
        if (context == null) {
            return -1;
        }
        DisplayMetrics displayMetrics = new DisplayMetrics();
        ((WindowManager) context.getSystemService(pg1.ATOM_EXT_window)).getDefaultDisplay().getRealMetrics(displayMetrics);
        return displayMetrics.heightPixels - b(context);
    }

    public static int b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d2a21ed1", new Object[]{context})).intValue();
        }
        if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
            return c(context);
        }
        if (e(context)) {
            return c(context);
        }
        return 0;
    }

    public static boolean e(Context context) {
        View view;
        int visibility;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ce30ace9", new Object[]{context})).booleanValue();
        }
        Activity a2 = bew.a(context);
        if (a2 != null) {
            view = a2.findViewById(16908336);
        } else {
            view = null;
        }
        if (view == null || (visibility = view.getVisibility()) == 8 || visibility == 4) {
            return false;
        }
        return true;
    }

    public static int c(Context context) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b91d22e4", new Object[]{context})).intValue();
        }
        if (context == null) {
            return 0;
        }
        int identifier = context.getResources().getIdentifier("navigation_bar_height", "dimen", "android");
        if (identifier > 0) {
            i = context.getResources().getDimensionPixelSize(identifier);
        }
        h36.g("shandian", "navigationBarHeight " + i);
        return i;
    }

    public static int d(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("226dbd42", new Object[]{context})).intValue();
        }
        if (context == null) {
            return 0;
        }
        try {
            return context.getResources().getDimensionPixelSize(context.getResources().getIdentifier("status_bar_height", "dimen", "android"));
        } catch (Exception e) {
            Log.e("CommonUtils", "getStatusBarHeight error", e);
            return 0;
        }
    }
}
