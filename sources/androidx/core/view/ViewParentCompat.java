package androidx.core.view;

import android.util.Log;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public final class ViewParentCompat {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "ViewParentCompat";
    private static int[] sTempNestedScrollConsumed;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class Api21Impl {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        private Api21Impl() {
        }

        public static boolean onNestedFling(ViewParent viewParent, View view, float f, float f2, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("ab5762a1", new Object[]{viewParent, view, new Float(f), new Float(f2), new Boolean(z)})).booleanValue();
            }
            return viewParent.onNestedFling(view, f, f2, z);
        }

        public static boolean onNestedPreFling(ViewParent viewParent, View view, float f, float f2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("89dfd5e4", new Object[]{viewParent, view, new Float(f), new Float(f2)})).booleanValue();
            }
            return viewParent.onNestedPreFling(view, f, f2);
        }

        public static void onNestedPreScroll(ViewParent viewParent, View view, int i, int i2, int[] iArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("dc3583b9", new Object[]{viewParent, view, new Integer(i), new Integer(i2), iArr});
            } else {
                viewParent.onNestedPreScroll(view, i, i2, iArr);
            }
        }

        public static void onNestedScroll(ViewParent viewParent, View view, int i, int i2, int i3, int i4) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("759d5874", new Object[]{viewParent, view, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            } else {
                viewParent.onNestedScroll(view, i, i2, i3, i4);
            }
        }

        public static void onNestedScrollAccepted(ViewParent viewParent, View view, View view2, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("dfead96c", new Object[]{viewParent, view, view2, new Integer(i)});
            } else {
                viewParent.onNestedScrollAccepted(view, view2, i);
            }
        }

        public static boolean onStartNestedScroll(ViewParent viewParent, View view, View view2, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("c4f5400d", new Object[]{viewParent, view, view2, new Integer(i)})).booleanValue();
            }
            return viewParent.onStartNestedScroll(view, view2, i);
        }

        public static void onStopNestedScroll(ViewParent viewParent, View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("dfb42f56", new Object[]{viewParent, view});
            } else {
                viewParent.onStopNestedScroll(view);
            }
        }
    }

    private ViewParentCompat() {
    }

    private static int[] getTempNestedScrollConsumed() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (int[]) ipChange.ipc$dispatch("3309b0e7", new Object[0]);
        }
        int[] iArr = sTempNestedScrollConsumed;
        if (iArr == null) {
            sTempNestedScrollConsumed = new int[2];
        } else {
            iArr[0] = 0;
            iArr[1] = 0;
        }
        return sTempNestedScrollConsumed;
    }

    public static void notifySubtreeAccessibilityStateChanged(ViewParent viewParent, View view, View view2, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2e8c81fe", new Object[]{viewParent, view, view2, new Integer(i)});
        } else {
            viewParent.notifySubtreeAccessibilityStateChanged(view, view2, i);
        }
    }

    public static boolean onNestedFling(ViewParent viewParent, View view, float f, float f2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ab5762a1", new Object[]{viewParent, view, new Float(f), new Float(f2), new Boolean(z)})).booleanValue();
        }
        try {
            return Api21Impl.onNestedFling(viewParent, view, f, f2, z);
        } catch (AbstractMethodError e) {
            Log.e(TAG, "ViewParent " + viewParent + " does not implement interface method onNestedFling", e);
            return false;
        }
    }

    public static boolean onNestedPreFling(ViewParent viewParent, View view, float f, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("89dfd5e4", new Object[]{viewParent, view, new Float(f), new Float(f2)})).booleanValue();
        }
        try {
            return Api21Impl.onNestedPreFling(viewParent, view, f, f2);
        } catch (AbstractMethodError e) {
            Log.e(TAG, "ViewParent " + viewParent + " does not implement interface method onNestedPreFling", e);
            return false;
        }
    }

    public static void onNestedPreScroll(ViewParent viewParent, View view, int i, int i2, int[] iArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc3583b9", new Object[]{viewParent, view, new Integer(i), new Integer(i2), iArr});
        } else {
            onNestedPreScroll(viewParent, view, i, i2, iArr, 0);
        }
    }

    public static void onNestedScroll(ViewParent viewParent, View view, int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("759d5874", new Object[]{viewParent, view, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
        } else {
            onNestedScroll(viewParent, view, i, i2, i3, i4, 0, getTempNestedScrollConsumed());
        }
    }

    public static void onNestedScrollAccepted(ViewParent viewParent, View view, View view2, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dfead96c", new Object[]{viewParent, view, view2, new Integer(i)});
        } else {
            onNestedScrollAccepted(viewParent, view, view2, i, 0);
        }
    }

    public static boolean onStartNestedScroll(ViewParent viewParent, View view, View view2, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("c4f5400d", new Object[]{viewParent, view, view2, new Integer(i)})).booleanValue() : onStartNestedScroll(viewParent, view, view2, i, 0);
    }

    public static void onStopNestedScroll(ViewParent viewParent, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dfb42f56", new Object[]{viewParent, view});
        } else {
            onStopNestedScroll(viewParent, view, 0);
        }
    }

    @Deprecated
    public static boolean requestSendAccessibilityEvent(ViewParent viewParent, View view, AccessibilityEvent accessibilityEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("880aba9a", new Object[]{viewParent, view, accessibilityEvent})).booleanValue();
        }
        return viewParent.requestSendAccessibilityEvent(view, accessibilityEvent);
    }

    public static void onNestedPreScroll(ViewParent viewParent, View view, int i, int i2, int[] iArr, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa7b666a", new Object[]{viewParent, view, new Integer(i), new Integer(i2), iArr, new Integer(i3)});
        } else if (viewParent instanceof NestedScrollingParent2) {
            ((NestedScrollingParent2) viewParent).onNestedPreScroll(view, i, i2, iArr, i3);
        } else if (i3 == 0) {
            try {
                Api21Impl.onNestedPreScroll(viewParent, view, i, i2, iArr);
            } catch (AbstractMethodError e) {
                Log.e(TAG, "ViewParent " + viewParent + " does not implement interface method onNestedPreScroll", e);
            }
        }
    }

    public static void onNestedScrollAccepted(ViewParent viewParent, View view, View view2, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1d70c717", new Object[]{viewParent, view, view2, new Integer(i), new Integer(i2)});
        } else if (viewParent instanceof NestedScrollingParent2) {
            ((NestedScrollingParent2) viewParent).onNestedScrollAccepted(view, view2, i, i2);
        } else if (i2 == 0) {
            try {
                Api21Impl.onNestedScrollAccepted(viewParent, view, view2, i);
            } catch (AbstractMethodError e) {
                Log.e(TAG, "ViewParent " + viewParent + " does not implement interface method onNestedScrollAccepted", e);
            }
        }
    }

    public static boolean onStartNestedScroll(ViewParent viewParent, View view, View view2, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d9b3341e", new Object[]{viewParent, view, view2, new Integer(i), new Integer(i2)})).booleanValue();
        }
        if (viewParent instanceof NestedScrollingParent2) {
            return ((NestedScrollingParent2) viewParent).onStartNestedScroll(view, view2, i, i2);
        }
        if (i2 == 0) {
            try {
                return Api21Impl.onStartNestedScroll(viewParent, view, view2, i);
            } catch (AbstractMethodError e) {
                Log.e(TAG, "ViewParent " + viewParent + " does not implement interface method onStartNestedScroll", e);
            }
        }
        return false;
    }

    public static void onStopNestedScroll(ViewParent viewParent, View view, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("16d22e6d", new Object[]{viewParent, view, new Integer(i)});
        } else if (viewParent instanceof NestedScrollingParent2) {
            ((NestedScrollingParent2) viewParent).onStopNestedScroll(view, i);
        } else if (i == 0) {
            try {
                Api21Impl.onStopNestedScroll(viewParent, view);
            } catch (AbstractMethodError e) {
                Log.e(TAG, "ViewParent " + viewParent + " does not implement interface method onStopNestedScroll", e);
            }
        }
    }

    public static void onNestedScroll(ViewParent viewParent, View view, int i, int i2, int i3, int i4, int i5) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e0e290f", new Object[]{viewParent, view, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5)});
        } else {
            onNestedScroll(viewParent, view, i, i2, i3, i4, i5, getTempNestedScrollConsumed());
        }
    }

    public static void onNestedScroll(ViewParent viewParent, View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f33eb05d", new Object[]{viewParent, view, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), iArr});
        } else if (viewParent instanceof NestedScrollingParent3) {
            ((NestedScrollingParent3) viewParent).onNestedScroll(view, i, i2, i3, i4, i5, iArr);
        } else {
            iArr[0] = iArr[0] + i3;
            iArr[1] = iArr[1] + i4;
            if (viewParent instanceof NestedScrollingParent2) {
                ((NestedScrollingParent2) viewParent).onNestedScroll(view, i, i2, i3, i4, i5);
            } else if (i5 == 0) {
                try {
                    Api21Impl.onNestedScroll(viewParent, view, i, i2, i3, i4);
                } catch (AbstractMethodError e) {
                    Log.e(TAG, "ViewParent " + viewParent + " does not implement interface method onNestedScroll", e);
                }
            }
        }
    }
}
