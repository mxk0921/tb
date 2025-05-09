package tb;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class ya {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(497025025);
    }

    public static PendingIntent a(Context context, int i, Intent[] intentArr, int i2) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PendingIntent) ipChange.ipc$dispatch("171b0071", new Object[]{context, new Integer(i), intentArr, new Integer(i2)});
        }
        if ((i2 & AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL) == 0) {
            z = false;
        }
        if ((33554432 & i2) != 0 || z) {
            return PendingIntent.getActivities(context, i, intentArr, i2);
        }
        if (Build.VERSION.SDK_INT > 30) {
            return PendingIntent.getActivities(context, i, intentArr, i2 | AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL);
        }
        return PendingIntent.getActivities(context, i, intentArr, i2);
    }

    public static PendingIntent b(Context context, int i, Intent[] intentArr, int i2, Bundle bundle) {
        boolean z;
        boolean z2 = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PendingIntent) ipChange.ipc$dispatch("87f4061b", new Object[]{context, new Integer(i), intentArr, new Integer(i2), bundle});
        }
        if ((i2 & AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL) != 0) {
            z = true;
        } else {
            z = false;
        }
        if ((33554432 & i2) == 0) {
            z2 = false;
        }
        int i3 = Build.VERSION.SDK_INT;
        if (z2 || z) {
            return PendingIntent.getActivities(context, i, intentArr, i2, bundle);
        }
        if (i3 > 30) {
            return PendingIntent.getActivities(context, i, intentArr, i2 | AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL, bundle);
        }
        return PendingIntent.getActivities(context, i, intentArr, i2, bundle);
    }

    public static PendingIntent c(Context context, int i, Intent intent, int i2) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PendingIntent) ipChange.ipc$dispatch("5ece0ddc", new Object[]{context, new Integer(i), intent, new Integer(i2)});
        }
        if ((i2 & AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL) == 0) {
            z = false;
        }
        if ((33554432 & i2) != 0 || z) {
            return PendingIntent.getActivity(context, i, intent, i2);
        }
        if (Build.VERSION.SDK_INT > 30) {
            return PendingIntent.getActivity(context, i, intent, i2 | AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL);
        }
        return PendingIntent.getActivity(context, i, intent, i2);
    }

    public static PendingIntent d(Context context, int i, Intent intent, int i2, Bundle bundle) {
        boolean z;
        boolean z2 = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PendingIntent) ipChange.ipc$dispatch("cde872d0", new Object[]{context, new Integer(i), intent, new Integer(i2), bundle});
        }
        if ((i2 & AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL) != 0) {
            z = true;
        } else {
            z = false;
        }
        if ((33554432 & i2) == 0) {
            z2 = false;
        }
        int i3 = Build.VERSION.SDK_INT;
        if (z2 || z) {
            return PendingIntent.getActivity(context, i, intent, i2, bundle);
        }
        if (i3 > 30) {
            return PendingIntent.getActivity(context, i, intent, i2 | AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL, bundle);
        }
        return PendingIntent.getActivity(context, i, intent, i2, bundle);
    }

    public static PendingIntent e(Context context, int i, Intent intent, int i2) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PendingIntent) ipChange.ipc$dispatch("d06ca6d4", new Object[]{context, new Integer(i), intent, new Integer(i2)});
        }
        if ((i2 & AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL) == 0) {
            z = false;
        }
        if ((33554432 & i2) != 0 || z) {
            return PendingIntent.getBroadcast(context, i, intent, i2);
        }
        if (Build.VERSION.SDK_INT > 30) {
            return PendingIntent.getBroadcast(context, i, intent, i2 | AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL);
        }
        return PendingIntent.getBroadcast(context, i, intent, i2);
    }

    public static PendingIntent f(Context context, int i, Intent intent, int i2) {
        boolean z;
        PendingIntent foregroundService;
        PendingIntent foregroundService2;
        PendingIntent foregroundService3;
        boolean z2 = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PendingIntent) ipChange.ipc$dispatch("affaf6c3", new Object[]{context, new Integer(i), intent, new Integer(i2)});
        }
        if ((i2 & AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL) != 0) {
            z = true;
        } else {
            z = false;
        }
        if ((33554432 & i2) == 0) {
            z2 = false;
        }
        int i3 = Build.VERSION.SDK_INT;
        if (i3 < 26) {
            return null;
        }
        if (z2 || z) {
            foregroundService = PendingIntent.getForegroundService(context, i, intent, i2);
            return foregroundService;
        } else if (i3 > 30) {
            foregroundService3 = PendingIntent.getForegroundService(context, i, intent, i2 | AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL);
            return foregroundService3;
        } else {
            foregroundService2 = PendingIntent.getForegroundService(context, i, intent, i2);
            return foregroundService2;
        }
    }

    public static PendingIntent g(Context context, int i, Intent intent, int i2) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PendingIntent) ipChange.ipc$dispatch("5becc4a0", new Object[]{context, new Integer(i), intent, new Integer(i2)});
        }
        if ((i2 & AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL) == 0) {
            z = false;
        }
        if ((33554432 & i2) != 0 || z) {
            return PendingIntent.getService(context, i, intent, i2);
        }
        if (Build.VERSION.SDK_INT > 30) {
            return PendingIntent.getService(context, i, intent, i2 | AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL);
        }
        return PendingIntent.getService(context, i, intent, i2);
    }
}
