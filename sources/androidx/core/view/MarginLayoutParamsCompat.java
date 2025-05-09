package androidx.core.view;

import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
@Deprecated
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public final class MarginLayoutParamsCompat {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    private MarginLayoutParamsCompat() {
    }

    @Deprecated
    public static int getMarginEnd(ViewGroup.MarginLayoutParams marginLayoutParams) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9de3e5e4", new Object[]{marginLayoutParams})).intValue();
        }
        return marginLayoutParams.getMarginEnd();
    }

    @Deprecated
    public static int getMarginStart(ViewGroup.MarginLayoutParams marginLayoutParams) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a036c67d", new Object[]{marginLayoutParams})).intValue();
        }
        return marginLayoutParams.getMarginStart();
    }

    @Deprecated
    public static boolean isMarginRelative(ViewGroup.MarginLayoutParams marginLayoutParams) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("302c9d88", new Object[]{marginLayoutParams})).booleanValue();
        }
        return marginLayoutParams.isMarginRelative();
    }

    @Deprecated
    public static void resolveLayoutDirection(ViewGroup.MarginLayoutParams marginLayoutParams, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3f806584", new Object[]{marginLayoutParams, new Integer(i)});
        } else {
            marginLayoutParams.resolveLayoutDirection(i);
        }
    }

    @Deprecated
    public static void setLayoutDirection(ViewGroup.MarginLayoutParams marginLayoutParams, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4d5fb44e", new Object[]{marginLayoutParams, new Integer(i)});
        } else {
            marginLayoutParams.setLayoutDirection(i);
        }
    }

    @Deprecated
    public static void setMarginEnd(ViewGroup.MarginLayoutParams marginLayoutParams, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66c6d3a6", new Object[]{marginLayoutParams, new Integer(i)});
        } else {
            marginLayoutParams.setMarginEnd(i);
        }
    }

    @Deprecated
    public static void setMarginStart(ViewGroup.MarginLayoutParams marginLayoutParams, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("598fb92d", new Object[]{marginLayoutParams, new Integer(i)});
        } else {
            marginLayoutParams.setMarginStart(i);
        }
    }

    @Deprecated
    public static int getLayoutDirection(ViewGroup.MarginLayoutParams marginLayoutParams) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d964493c", new Object[]{marginLayoutParams})).intValue();
        }
        int layoutDirection = marginLayoutParams.getLayoutDirection();
        if (layoutDirection == 0 || layoutDirection == 1) {
            return layoutDirection;
        }
        return 0;
    }
}
