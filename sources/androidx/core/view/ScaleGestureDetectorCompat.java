package androidx.core.view;

import android.view.ScaleGestureDetector;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public final class ScaleGestureDetectorCompat {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    private ScaleGestureDetectorCompat() {
    }

    @Deprecated
    public static boolean isQuickScaleEnabled(Object obj) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d066ae41", new Object[]{obj})).booleanValue() : isQuickScaleEnabled((ScaleGestureDetector) obj);
    }

    @Deprecated
    public static void setQuickScaleEnabled(Object obj, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a7dfe36f", new Object[]{obj, new Boolean(z)});
        } else {
            setQuickScaleEnabled((ScaleGestureDetector) obj, z);
        }
    }

    public static boolean isQuickScaleEnabled(ScaleGestureDetector scaleGestureDetector) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("b36d07b5", new Object[]{scaleGestureDetector})).booleanValue() : scaleGestureDetector.isQuickScaleEnabled();
    }

    public static void setQuickScaleEnabled(ScaleGestureDetector scaleGestureDetector, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b7fee10b", new Object[]{scaleGestureDetector, new Boolean(z)});
        } else {
            scaleGestureDetector.setQuickScaleEnabled(z);
        }
    }
}
