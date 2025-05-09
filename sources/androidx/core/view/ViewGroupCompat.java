package androidx.core.view;

import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public final class ViewGroupCompat {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int LAYOUT_MODE_CLIP_BOUNDS = 0;
    public static final int LAYOUT_MODE_OPTICAL_BOUNDS = 1;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class Api21Impl {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        private Api21Impl() {
        }

        public static int getNestedScrollAxes(ViewGroup viewGroup) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("d1ac4698", new Object[]{viewGroup})).intValue();
            }
            return viewGroup.getNestedScrollAxes();
        }

        public static boolean isTransitionGroup(ViewGroup viewGroup) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("d219336a", new Object[]{viewGroup})).booleanValue();
            }
            return viewGroup.isTransitionGroup();
        }

        public static void setTransitionGroup(ViewGroup viewGroup, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ebafa766", new Object[]{viewGroup, new Boolean(z)});
            } else {
                viewGroup.setTransitionGroup(z);
            }
        }
    }

    private ViewGroupCompat() {
    }

    public static int getLayoutMode(ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("682ea51c", new Object[]{viewGroup})).intValue();
        }
        return viewGroup.getLayoutMode();
    }

    public static int getNestedScrollAxes(ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d1ac4698", new Object[]{viewGroup})).intValue();
        }
        return Api21Impl.getNestedScrollAxes(viewGroup);
    }

    public static boolean isTransitionGroup(ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d219336a", new Object[]{viewGroup})).booleanValue();
        }
        return Api21Impl.isTransitionGroup(viewGroup);
    }

    @Deprecated
    public static boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9a0bfd46", new Object[]{viewGroup, view, accessibilityEvent})).booleanValue();
        }
        return viewGroup.onRequestSendAccessibilityEvent(view, accessibilityEvent);
    }

    public static void setLayoutMode(ViewGroup viewGroup, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f664f06e", new Object[]{viewGroup, new Integer(i)});
        } else {
            viewGroup.setLayoutMode(i);
        }
    }

    @Deprecated
    public static void setMotionEventSplittingEnabled(ViewGroup viewGroup, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("135e8db3", new Object[]{viewGroup, new Boolean(z)});
        } else {
            viewGroup.setMotionEventSplittingEnabled(z);
        }
    }

    public static void setTransitionGroup(ViewGroup viewGroup, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ebafa766", new Object[]{viewGroup, new Boolean(z)});
        } else {
            Api21Impl.setTransitionGroup(viewGroup, z);
        }
    }
}
