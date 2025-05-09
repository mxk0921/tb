package com.alibaba.security.realidentity;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class b5 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static void a(Activity activity, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cabb0489", new Object[]{activity, new Integer(i)});
            return;
        }
        Window window = activity.getWindow();
        window.clearFlags(AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL);
        window.addFlags(Integer.MIN_VALUE);
        window.setStatusBarColor(i);
        window.getDecorView().setSystemUiVisibility(0);
        View childAt = ((ViewGroup) window.findViewById(16908290)).getChildAt(0);
        if (childAt != null) {
            childAt.setFitsSystemWindows(false);
            ViewCompat.requestApplyInsets(childAt);
        }
    }

    public static void a(Activity activity, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cabb445a", new Object[]{activity, new Boolean(z)});
            return;
        }
        Window window = activity.getWindow();
        window.addFlags(Integer.MIN_VALUE);
        if (z) {
            window.clearFlags(AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL);
            window.setStatusBarColor(0);
            window.getDecorView().setSystemUiVisibility(1280);
        } else {
            window.addFlags(AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL);
            window.getDecorView().setSystemUiVisibility(0);
        }
        View childAt = ((ViewGroup) window.findViewById(16908290)).getChildAt(0);
        if (childAt != null) {
            childAt.setFitsSystemWindows(false);
            ViewCompat.requestApplyInsets(childAt);
        }
    }

    public static int a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9e1d6453", new Object[]{context})).intValue();
        }
        int identifier = context.getResources().getIdentifier("status_bar_height", "dimen", "android");
        if (identifier > 0) {
            return context.getResources().getDimensionPixelOffset(identifier);
        }
        return 0;
    }
}
