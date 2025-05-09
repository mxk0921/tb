package androidx.core.view;

import android.os.Build;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Collections;
import java.util.Map;
import java.util.WeakHashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public final class VelocityTrackerCompat {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static Map<VelocityTracker, VelocityTrackerFallback> sFallbackTrackers = Collections.synchronizedMap(new WeakHashMap());

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class Api34Impl {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        private Api34Impl() {
        }

        public static float getAxisVelocity(VelocityTracker velocityTracker, int i, int i2) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("8ad85c89", new Object[]{velocityTracker, new Integer(i), new Integer(i2)})).floatValue() : velocityTracker.getAxisVelocity(i, i2);
        }

        public static boolean isAxisSupported(VelocityTracker velocityTracker, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("7228ee5f", new Object[]{velocityTracker, new Integer(i)})).booleanValue();
            }
            return velocityTracker.isAxisSupported(i);
        }

        public static float getAxisVelocity(VelocityTracker velocityTracker, int i) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("80598b9a", new Object[]{velocityTracker, new Integer(i)})).floatValue() : velocityTracker.getAxisVelocity(i);
        }
    }

    /* compiled from: Taobao */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public @interface VelocityTrackableMotionEventAxis {
    }

    private VelocityTrackerCompat() {
    }

    public static void addMovement(VelocityTracker velocityTracker, MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("13e50baa", new Object[]{velocityTracker, motionEvent});
            return;
        }
        velocityTracker.addMovement(motionEvent);
        if (Build.VERSION.SDK_INT < 34 && motionEvent.getSource() == 4194304) {
            if (!sFallbackTrackers.containsKey(velocityTracker)) {
                sFallbackTrackers.put(velocityTracker, new VelocityTrackerFallback());
            }
            sFallbackTrackers.get(velocityTracker).addMovement(motionEvent);
        }
    }

    public static void clear(VelocityTracker velocityTracker) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("196f3472", new Object[]{velocityTracker});
            return;
        }
        velocityTracker.clear();
        removeFallbackForTracker(velocityTracker);
    }

    public static void computeCurrentVelocity(VelocityTracker velocityTracker, int i, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20029e01", new Object[]{velocityTracker, new Integer(i), new Float(f)});
            return;
        }
        velocityTracker.computeCurrentVelocity(i, f);
        VelocityTrackerFallback fallbackTrackerOrNull = getFallbackTrackerOrNull(velocityTracker);
        if (fallbackTrackerOrNull != null) {
            fallbackTrackerOrNull.computeCurrentVelocity(i, f);
        }
    }

    public static float getAxisVelocity(VelocityTracker velocityTracker, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("80598b9a", new Object[]{velocityTracker, new Integer(i)})).floatValue();
        }
        if (Build.VERSION.SDK_INT >= 34) {
            return Api34Impl.getAxisVelocity(velocityTracker, i);
        }
        if (i == 0) {
            return velocityTracker.getXVelocity();
        }
        if (i == 1) {
            return velocityTracker.getYVelocity();
        }
        VelocityTrackerFallback fallbackTrackerOrNull = getFallbackTrackerOrNull(velocityTracker);
        if (fallbackTrackerOrNull != null) {
            return fallbackTrackerOrNull.getAxisVelocity(i);
        }
        return 0.0f;
    }

    private static VelocityTrackerFallback getFallbackTrackerOrNull(VelocityTracker velocityTracker) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (VelocityTrackerFallback) ipChange.ipc$dispatch("1aee9019", new Object[]{velocityTracker});
        }
        return sFallbackTrackers.get(velocityTracker);
    }

    @Deprecated
    public static float getXVelocity(VelocityTracker velocityTracker, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("638030f", new Object[]{velocityTracker, new Integer(i)})).floatValue();
        }
        return velocityTracker.getXVelocity(i);
    }

    @Deprecated
    public static float getYVelocity(VelocityTracker velocityTracker, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c9246c6e", new Object[]{velocityTracker, new Integer(i)})).floatValue();
        }
        return velocityTracker.getYVelocity(i);
    }

    public static boolean isAxisSupported(VelocityTracker velocityTracker, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7228ee5f", new Object[]{velocityTracker, new Integer(i)})).booleanValue();
        }
        if (Build.VERSION.SDK_INT >= 34) {
            return Api34Impl.isAxisSupported(velocityTracker, i);
        }
        if (i == 26 || i == 0 || i == 1) {
            return true;
        }
        return false;
    }

    public static void recycle(VelocityTracker velocityTracker) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a72a5f38", new Object[]{velocityTracker});
            return;
        }
        velocityTracker.recycle();
        removeFallbackForTracker(velocityTracker);
    }

    private static void removeFallbackForTracker(VelocityTracker velocityTracker) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f6c4067a", new Object[]{velocityTracker});
        } else {
            sFallbackTrackers.remove(velocityTracker);
        }
    }

    public static void computeCurrentVelocity(VelocityTracker velocityTracker, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("95ad7d9f", new Object[]{velocityTracker, new Integer(i)});
        } else {
            computeCurrentVelocity(velocityTracker, i, Float.MAX_VALUE);
        }
    }

    public static float getAxisVelocity(VelocityTracker velocityTracker, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8ad85c89", new Object[]{velocityTracker, new Integer(i), new Integer(i2)})).floatValue();
        }
        if (Build.VERSION.SDK_INT >= 34) {
            return Api34Impl.getAxisVelocity(velocityTracker, i, i2);
        }
        if (i == 0) {
            return velocityTracker.getXVelocity(i2);
        }
        if (i == 1) {
            return velocityTracker.getYVelocity(i2);
        }
        return 0.0f;
    }
}
