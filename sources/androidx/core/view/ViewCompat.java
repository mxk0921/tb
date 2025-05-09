package androidx.core.view;

import android.app.Activity;
import android.content.ClipData;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.ContentInfo;
import android.view.Display;
import android.view.KeyEvent;
import android.view.OnReceiveContentListener;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowInsetsController;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeProvider;
import android.view.autofill.AutofillId;
import android.view.contentcapture.ContentCaptureSession;
import androidx.collection.SimpleArrayMap;
import androidx.core.util.Preconditions;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.ContentInfoCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsAnimationCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.view.accessibility.AccessibilityNodeProviderCompat;
import androidx.core.view.accessibility.AccessibilityViewCommand;
import androidx.core.view.autofill.AutofillIdCompat;
import androidx.core.view.contentcapture.ContentCaptureSessionCompat;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;
import tb.qdw;
import tb.zo4;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class ViewCompat {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int ACCESSIBILITY_LIVE_REGION_ASSERTIVE = 2;
    public static final int ACCESSIBILITY_LIVE_REGION_NONE = 0;
    public static final int ACCESSIBILITY_LIVE_REGION_POLITE = 1;
    @Deprecated
    public static final int IMPORTANT_FOR_ACCESSIBILITY_AUTO = 0;
    @Deprecated
    public static final int IMPORTANT_FOR_ACCESSIBILITY_NO = 2;
    @Deprecated
    public static final int IMPORTANT_FOR_ACCESSIBILITY_NO_HIDE_DESCENDANTS = 4;
    @Deprecated
    public static final int IMPORTANT_FOR_ACCESSIBILITY_YES = 1;
    public static final int IMPORTANT_FOR_CONTENT_CAPTURE_AUTO = 0;
    public static final int IMPORTANT_FOR_CONTENT_CAPTURE_NO = 2;
    public static final int IMPORTANT_FOR_CONTENT_CAPTURE_NO_EXCLUDE_DESCENDANTS = 8;
    public static final int IMPORTANT_FOR_CONTENT_CAPTURE_YES = 1;
    public static final int IMPORTANT_FOR_CONTENT_CAPTURE_YES_EXCLUDE_DESCENDANTS = 4;
    @Deprecated
    public static final int LAYER_TYPE_HARDWARE = 2;
    @Deprecated
    public static final int LAYER_TYPE_NONE = 0;
    @Deprecated
    public static final int LAYER_TYPE_SOFTWARE = 1;
    @Deprecated
    public static final int LAYOUT_DIRECTION_INHERIT = 2;
    @Deprecated
    public static final int LAYOUT_DIRECTION_LOCALE = 3;
    @Deprecated
    public static final int LAYOUT_DIRECTION_LTR = 0;
    @Deprecated
    public static final int LAYOUT_DIRECTION_RTL = 1;
    @Deprecated
    public static final int MEASURED_HEIGHT_STATE_SHIFT = 16;
    @Deprecated
    public static final int MEASURED_SIZE_MASK = 16777215;
    @Deprecated
    public static final int MEASURED_STATE_MASK = -16777216;
    @Deprecated
    public static final int MEASURED_STATE_TOO_SMALL = 16777216;
    @Deprecated
    public static final int OVER_SCROLL_ALWAYS = 0;
    @Deprecated
    public static final int OVER_SCROLL_IF_CONTENT_SCROLLS = 1;
    @Deprecated
    public static final int OVER_SCROLL_NEVER = 2;
    public static final int SCROLL_AXIS_HORIZONTAL = 1;
    public static final int SCROLL_AXIS_NONE = 0;
    public static final int SCROLL_AXIS_VERTICAL = 2;
    public static final int SCROLL_INDICATOR_BOTTOM = 2;
    public static final int SCROLL_INDICATOR_END = 32;
    public static final int SCROLL_INDICATOR_LEFT = 4;
    public static final int SCROLL_INDICATOR_RIGHT = 8;
    public static final int SCROLL_INDICATOR_START = 16;
    public static final int SCROLL_INDICATOR_TOP = 1;
    private static final String TAG = "ViewCompat";
    public static final int TYPE_NON_TOUCH = 1;
    public static final int TYPE_TOUCH = 0;
    private static boolean sAccessibilityDelegateCheckFailed;
    private static Field sAccessibilityDelegateField;
    private static Method sChildrenDrawingOrderMethod;
    private static Method sDispatchFinishTemporaryDetach;
    private static Method sDispatchStartTemporaryDetach;
    private static boolean sTempDetachBound;
    private static ThreadLocal<Rect> sThreadLocalRect;
    private static WeakHashMap<View, String> sTransitionNameMap;
    private static WeakHashMap<View, ViewPropertyAnimatorCompat> sViewPropertyAnimatorMap;
    private static final int[] ACCESSIBILITY_ACTIONS_RESOURCE_IDS = {R.id.accessibility_custom_action_0, R.id.accessibility_custom_action_1, R.id.accessibility_custom_action_2, R.id.accessibility_custom_action_3, R.id.accessibility_custom_action_4, R.id.accessibility_custom_action_5, R.id.accessibility_custom_action_6, R.id.accessibility_custom_action_7, R.id.accessibility_custom_action_8, R.id.accessibility_custom_action_9, R.id.accessibility_custom_action_10, R.id.accessibility_custom_action_11, R.id.accessibility_custom_action_12, R.id.accessibility_custom_action_13, R.id.accessibility_custom_action_14, R.id.accessibility_custom_action_15, R.id.accessibility_custom_action_16, R.id.accessibility_custom_action_17, R.id.accessibility_custom_action_18, R.id.accessibility_custom_action_19, R.id.accessibility_custom_action_20, R.id.accessibility_custom_action_21, R.id.accessibility_custom_action_22, R.id.accessibility_custom_action_23, R.id.accessibility_custom_action_24, R.id.accessibility_custom_action_25, R.id.accessibility_custom_action_26, R.id.accessibility_custom_action_27, R.id.accessibility_custom_action_28, R.id.accessibility_custom_action_29, R.id.accessibility_custom_action_30, R.id.accessibility_custom_action_31};
    private static final OnReceiveContentViewBehavior NO_OP_ON_RECEIVE_CONTENT_VIEW_BEHAVIOR = new OnReceiveContentViewBehavior() { // from class: tb.rdw
        @Override // androidx.core.view.OnReceiveContentViewBehavior
        public final ContentInfoCompat onReceiveContent(ContentInfoCompat contentInfoCompat) {
            ContentInfoCompat lambda$static$0;
            lambda$static$0 = ViewCompat.lambda$static$0(contentInfoCompat);
            return lambda$static$0;
        }
    };
    private static final AccessibilityPaneVisibilityManager sAccessibilityPaneVisibilityManager = new AccessibilityPaneVisibilityManager();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static abstract class AccessibilityViewProperty<T> {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private final int mContentChangeType;
        private final int mFrameworkMinimumSdk;
        private final int mTagKey;
        private final Class<T> mType;

        public AccessibilityViewProperty(int i, Class<T> cls, int i2) {
            this(i, cls, 0, i2);
        }

        private boolean frameworkAvailable() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("70a16d76", new Object[]{this})).booleanValue();
            }
            if (Build.VERSION.SDK_INT >= this.mFrameworkMinimumSdk) {
                return true;
            }
            return false;
        }

        public boolean booleanNullToFalseEquals(Boolean bool, Boolean bool2) {
            boolean z;
            boolean z2;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("22df8fe3", new Object[]{this, bool, bool2})).booleanValue();
            }
            if (bool == null || !bool.booleanValue()) {
                z = false;
            } else {
                z = true;
            }
            if (bool2 == null || !bool2.booleanValue()) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (z == z2) {
                return true;
            }
            return false;
        }

        public abstract T frameworkGet(View view);

        public abstract void frameworkSet(View view, T t);

        public T get(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (T) ipChange.ipc$dispatch("9ba3eafd", new Object[]{this, view});
            }
            if (frameworkAvailable()) {
                return frameworkGet(view);
            }
            T t = (T) view.getTag(this.mTagKey);
            if (this.mType.isInstance(t)) {
                return t;
            }
            return null;
        }

        public void set(View view, T t) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b8c685e5", new Object[]{this, view, t});
            } else if (frameworkAvailable()) {
                frameworkSet(view, t);
            } else if (shouldUpdate(get(view), t)) {
                ViewCompat.ensureAccessibilityDelegateCompat(view);
                view.setTag(this.mTagKey, t);
                ViewCompat.notifyViewAccessibilityStateChangedIfNeeded(view, this.mContentChangeType);
            }
        }

        public boolean shouldUpdate(T t, T t2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("c2498a1f", new Object[]{this, t, t2})).booleanValue();
            }
            return !t2.equals(t);
        }

        public AccessibilityViewProperty(int i, Class<T> cls, int i2, int i3) {
            this.mTagKey = i;
            this.mType = cls;
            this.mContentChangeType = i2;
            this.mFrameworkMinimumSdk = i3;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class Api20Impl {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        private Api20Impl() {
        }

        public static WindowInsets dispatchApplyWindowInsets(View view, WindowInsets windowInsets) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (WindowInsets) ipChange.ipc$dispatch("e439fbc1", new Object[]{view, windowInsets});
            }
            return view.dispatchApplyWindowInsets(windowInsets);
        }

        public static WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (WindowInsets) ipChange.ipc$dispatch("6a50307c", new Object[]{view, windowInsets});
            }
            return view.onApplyWindowInsets(windowInsets);
        }

        public static void requestApplyInsets(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1489f56", new Object[]{view});
            } else {
                view.requestApplyInsets();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class Api21Impl {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        private Api21Impl() {
        }

        public static void callCompatInsetAnimationCallback(WindowInsets windowInsets, View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("df4e494", new Object[]{windowInsets, view});
                return;
            }
            View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = (View.OnApplyWindowInsetsListener) view.getTag(R.id.tag_window_insets_animation_callback);
            if (onApplyWindowInsetsListener != null) {
                onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
            }
        }

        public static WindowInsetsCompat computeSystemWindowInsets(View view, WindowInsetsCompat windowInsetsCompat, Rect rect) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (WindowInsetsCompat) ipChange.ipc$dispatch("b9830ba8", new Object[]{view, windowInsetsCompat, rect});
            }
            WindowInsets windowInsets = windowInsetsCompat.toWindowInsets();
            if (windowInsets != null) {
                return WindowInsetsCompat.toWindowInsetsCompat(view.computeSystemWindowInsets(windowInsets, rect), view);
            }
            rect.setEmpty();
            return windowInsetsCompat;
        }

        public static boolean dispatchNestedFling(View view, float f, float f2, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("1eba4818", new Object[]{view, new Float(f), new Float(f2), new Boolean(z)})).booleanValue();
            }
            return view.dispatchNestedFling(f, f2, z);
        }

        public static boolean dispatchNestedPreFling(View view, float f, float f2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("ed7653c5", new Object[]{view, new Float(f), new Float(f2)})).booleanValue();
            }
            return view.dispatchNestedPreFling(f, f2);
        }

        public static boolean dispatchNestedPreScroll(View view, int i, int i2, int[] iArr, int[] iArr2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("668b4fcc", new Object[]{view, new Integer(i), new Integer(i2), iArr, iArr2})).booleanValue();
            }
            return view.dispatchNestedPreScroll(i, i2, iArr, iArr2);
        }

        public static boolean dispatchNestedScroll(View view, int i, int i2, int i3, int i4, int[] iArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("a1642cff", new Object[]{view, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), iArr})).booleanValue();
            }
            return view.dispatchNestedScroll(i, i2, i3, i4, iArr);
        }

        public static ColorStateList getBackgroundTintList(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ColorStateList) ipChange.ipc$dispatch("a4630c06", new Object[]{view});
            }
            return view.getBackgroundTintList();
        }

        public static PorterDuff.Mode getBackgroundTintMode(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (PorterDuff.Mode) ipChange.ipc$dispatch("30366658", new Object[]{view});
            }
            return view.getBackgroundTintMode();
        }

        public static float getElevation(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("6c17554", new Object[]{view})).floatValue();
            }
            return view.getElevation();
        }

        public static WindowInsetsCompat getRootWindowInsets(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (WindowInsetsCompat) ipChange.ipc$dispatch("f02305b6", new Object[]{view});
            }
            return WindowInsetsCompat.Api21ReflectionHolder.getRootWindowInsets(view);
        }

        public static String getTransitionName(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("575f0f8b", new Object[]{view});
            }
            return view.getTransitionName();
        }

        public static float getTranslationZ(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("17133bc", new Object[]{view})).floatValue();
            }
            return view.getTranslationZ();
        }

        public static float getZ(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("61356897", new Object[]{view})).floatValue();
            }
            return view.getZ();
        }

        public static boolean hasNestedScrollingParent(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("3b9f8aa1", new Object[]{view})).booleanValue();
            }
            return view.hasNestedScrollingParent();
        }

        public static boolean isImportantForAccessibility(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("f3b5fb12", new Object[]{view})).booleanValue();
            }
            return view.isImportantForAccessibility();
        }

        public static boolean isNestedScrollingEnabled(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("a331cde2", new Object[]{view})).booleanValue();
            }
            return view.isNestedScrollingEnabled();
        }

        public static void setBackgroundTintList(View view, ColorStateList colorStateList) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("71613ac0", new Object[]{view, colorStateList});
            } else {
                view.setBackgroundTintList(colorStateList);
            }
        }

        public static void setBackgroundTintMode(View view, PorterDuff.Mode mode) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("76b9e1a8", new Object[]{view, mode});
            } else {
                view.setBackgroundTintMode(mode);
            }
        }

        public static void setElevation(View view, float f) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("44644350", new Object[]{view, new Float(f)});
            } else {
                view.setElevation(f);
            }
        }

        public static void setNestedScrollingEnabled(View view, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1c286dee", new Object[]{view, new Boolean(z)});
            } else {
                view.setNestedScrollingEnabled(z);
            }
        }

        public static void setOnApplyWindowInsetsListener(final View view, final OnApplyWindowInsetsListener onApplyWindowInsetsListener) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fbf0aa0a", new Object[]{view, onApplyWindowInsetsListener});
                return;
            }
            if (Build.VERSION.SDK_INT < 30) {
                view.setTag(R.id.tag_on_apply_window_listener, onApplyWindowInsetsListener);
            }
            if (onApplyWindowInsetsListener == null) {
                view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) view.getTag(R.id.tag_window_insets_animation_callback));
            } else {
                view.setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: androidx.core.view.ViewCompat.Api21Impl.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;
                    public WindowInsetsCompat mLastInsets = null;

                    @Override // android.view.View.OnApplyWindowInsetsListener
                    public WindowInsets onApplyWindowInsets(View view2, WindowInsets windowInsets) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            return (WindowInsets) ipChange2.ipc$dispatch("6a50307c", new Object[]{this, view2, windowInsets});
                        }
                        WindowInsetsCompat windowInsetsCompat = WindowInsetsCompat.toWindowInsetsCompat(windowInsets, view2);
                        int i = Build.VERSION.SDK_INT;
                        if (i < 30) {
                            Api21Impl.callCompatInsetAnimationCallback(windowInsets, view);
                            if (windowInsetsCompat.equals(this.mLastInsets)) {
                                return onApplyWindowInsetsListener.onApplyWindowInsets(view2, windowInsetsCompat).toWindowInsets();
                            }
                        }
                        this.mLastInsets = windowInsetsCompat;
                        WindowInsetsCompat onApplyWindowInsets = onApplyWindowInsetsListener.onApplyWindowInsets(view2, windowInsetsCompat);
                        if (i >= 30) {
                            return onApplyWindowInsets.toWindowInsets();
                        }
                        ViewCompat.requestApplyInsets(view2);
                        return onApplyWindowInsets.toWindowInsets();
                    }
                });
            }
        }

        public static void setTransitionName(View view, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d46081b3", new Object[]{view, str});
            } else {
                view.setTransitionName(str);
            }
        }

        public static void setTranslationZ(View view, float f) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("98c14480", new Object[]{view, new Float(f)});
            } else {
                view.setTranslationZ(f);
            }
        }

        public static void setZ(View view, float f) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f446c6d", new Object[]{view, new Float(f)});
            } else {
                view.setZ(f);
            }
        }

        public static boolean startNestedScroll(View view, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("379631a2", new Object[]{view, new Integer(i)})).booleanValue();
            }
            return view.startNestedScroll(i);
        }

        public static void stopNestedScroll(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1739a65", new Object[]{view});
            } else {
                view.stopNestedScroll();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class Api23Impl {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        private Api23Impl() {
        }

        public static WindowInsetsCompat getRootWindowInsets(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (WindowInsetsCompat) ipChange.ipc$dispatch("f02305b6", new Object[]{view});
            }
            WindowInsets rootWindowInsets = view.getRootWindowInsets();
            if (rootWindowInsets == null) {
                return null;
            }
            WindowInsetsCompat windowInsetsCompat = WindowInsetsCompat.toWindowInsetsCompat(rootWindowInsets);
            windowInsetsCompat.setRootWindowInsets(windowInsetsCompat);
            windowInsetsCompat.copyRootViewBounds(view.getRootView());
            return windowInsetsCompat;
        }

        public static int getScrollIndicators(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("146b2a97", new Object[]{view})).intValue();
            }
            return view.getScrollIndicators();
        }

        public static void setScrollIndicators(View view, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("380bcdeb", new Object[]{view, new Integer(i)});
            } else {
                view.setScrollIndicators(i);
            }
        }

        public static void setScrollIndicators(View view, int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c96e6278", new Object[]{view, new Integer(i), new Integer(i2)});
            } else {
                view.setScrollIndicators(i, i2);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class Api24Impl {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        private Api24Impl() {
        }

        public static void cancelDragAndDrop(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("84596733", new Object[]{view});
            } else {
                view.cancelDragAndDrop();
            }
        }

        public static void dispatchFinishTemporaryDetach(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d2378f34", new Object[]{view});
            } else {
                view.dispatchFinishTemporaryDetach();
            }
        }

        public static void dispatchStartTemporaryDetach(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("288d454f", new Object[]{view});
            } else {
                view.dispatchStartTemporaryDetach();
            }
        }

        public static void setPointerIcon(View view, PointerIcon pointerIcon) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4c02d61a", new Object[]{view, pointerIcon});
            } else {
                view.setPointerIcon(pointerIcon);
            }
        }

        public static boolean startDragAndDrop(View view, ClipData clipData, View.DragShadowBuilder dragShadowBuilder, Object obj, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("3219a036", new Object[]{view, clipData, dragShadowBuilder, obj, new Integer(i)})).booleanValue();
            }
            return view.startDragAndDrop(clipData, dragShadowBuilder, obj, i);
        }

        public static void updateDragShadow(View view, View.DragShadowBuilder dragShadowBuilder) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f0cedf41", new Object[]{view, dragShadowBuilder});
            } else {
                view.updateDragShadow(dragShadowBuilder);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class Api26Impl {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        private Api26Impl() {
        }

        public static void addKeyboardNavigationClusters(View view, Collection<View> collection, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5024971c", new Object[]{view, collection, new Integer(i)});
            } else {
                view.addKeyboardNavigationClusters(collection, i);
            }
        }

        public static AutofillId getAutofillId(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (AutofillId) ipChange.ipc$dispatch("3d24ea9d", new Object[]{view});
            }
            return view.getAutofillId();
        }

        public static int getImportantForAutofill(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("d4bf216f", new Object[]{view})).intValue();
            }
            return view.getImportantForAutofill();
        }

        public static int getNextClusterForwardId(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("4555688f", new Object[]{view})).intValue();
            }
            return view.getNextClusterForwardId();
        }

        public static boolean hasExplicitFocusable(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("9084198b", new Object[]{view})).booleanValue();
            }
            return view.hasExplicitFocusable();
        }

        public static boolean isFocusedByDefault(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("36defad2", new Object[]{view})).booleanValue();
            }
            return view.isFocusedByDefault();
        }

        public static boolean isImportantForAutofill(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("dd3bc72c", new Object[]{view})).booleanValue();
            }
            return view.isImportantForAutofill();
        }

        public static boolean isKeyboardNavigationCluster(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("17360b3a", new Object[]{view})).booleanValue();
            }
            return view.isKeyboardNavigationCluster();
        }

        public static View keyboardNavigationClusterSearch(View view, View view2, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (View) ipChange.ipc$dispatch("5b645d7", new Object[]{view, view2, new Integer(i)});
            }
            return view.keyboardNavigationClusterSearch(view2, i);
        }

        public static boolean restoreDefaultFocus(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("abf7a28a", new Object[]{view})).booleanValue();
            }
            return view.restoreDefaultFocus();
        }

        public static void setAutofillHints(View view, String... strArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("15a8d94c", new Object[]{view, strArr});
            } else {
                view.setAutofillHints(strArr);
            }
        }

        public static void setFocusedByDefault(View view, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("107128fe", new Object[]{view, new Boolean(z)});
            } else {
                view.setFocusedByDefault(z);
            }
        }

        public static void setImportantForAutofill(View view, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("44df4c13", new Object[]{view, new Integer(i)});
            } else {
                view.setImportantForAutofill(i);
            }
        }

        public static void setKeyboardNavigationCluster(View view, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4b569626", new Object[]{view, new Boolean(z)});
            } else {
                view.setKeyboardNavigationCluster(z);
            }
        }

        public static void setNextClusterForwardId(View view, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e711e8f3", new Object[]{view, new Integer(i)});
            } else {
                view.setNextClusterForwardId(i);
            }
        }

        public static void setTooltipText(View view, CharSequence charSequence) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d88f64c1", new Object[]{view, charSequence});
            } else {
                view.setTooltipText(charSequence);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class Api28Impl {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        private Api28Impl() {
        }

        public static void addOnUnhandledKeyEventListener(View view, final OnUnhandledKeyEventListenerCompat onUnhandledKeyEventListenerCompat) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3e0dc1b0", new Object[]{view, onUnhandledKeyEventListenerCompat});
                return;
            }
            int i = R.id.tag_unhandled_key_listeners;
            SimpleArrayMap simpleArrayMap = (SimpleArrayMap) view.getTag(i);
            if (simpleArrayMap == null) {
                simpleArrayMap = new SimpleArrayMap();
                view.setTag(i, simpleArrayMap);
            }
            Objects.requireNonNull(onUnhandledKeyEventListenerCompat);
            View.OnUnhandledKeyEventListener sdwVar = new View.OnUnhandledKeyEventListener() { // from class: tb.sdw
                @Override // android.view.View.OnUnhandledKeyEventListener
                public final boolean onUnhandledKeyEvent(View view2, KeyEvent keyEvent) {
                    return ViewCompat.OnUnhandledKeyEventListenerCompat.this.onUnhandledKeyEvent(view2, keyEvent);
                }
            };
            simpleArrayMap.put(onUnhandledKeyEventListenerCompat, sdwVar);
            view.addOnUnhandledKeyEventListener(sdwVar);
        }

        public static CharSequence getAccessibilityPaneTitle(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (CharSequence) ipChange.ipc$dispatch("9068187", new Object[]{view});
            }
            return view.getAccessibilityPaneTitle();
        }

        public static boolean isAccessibilityHeading(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("bbc97611", new Object[]{view})).booleanValue();
            }
            return view.isAccessibilityHeading();
        }

        public static boolean isScreenReaderFocusable(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("8b398136", new Object[]{view})).booleanValue();
            }
            return view.isScreenReaderFocusable();
        }

        public static void removeOnUnhandledKeyEventListener(View view, OnUnhandledKeyEventListenerCompat onUnhandledKeyEventListenerCompat) {
            View.OnUnhandledKeyEventListener onUnhandledKeyEventListener;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f3d25ced", new Object[]{view, onUnhandledKeyEventListenerCompat});
                return;
            }
            SimpleArrayMap simpleArrayMap = (SimpleArrayMap) view.getTag(R.id.tag_unhandled_key_listeners);
            if (simpleArrayMap != null && (onUnhandledKeyEventListener = (View.OnUnhandledKeyEventListener) simpleArrayMap.get(onUnhandledKeyEventListenerCompat)) != null) {
                view.removeOnUnhandledKeyEventListener(onUnhandledKeyEventListener);
            }
        }

        public static <T> T requireViewById(View view, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (T) ipChange.ipc$dispatch("d604259e", new Object[]{view, new Integer(i)});
            }
            return (T) view.requireViewById(i);
        }

        public static void setAccessibilityHeading(View view, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3807b99f", new Object[]{view, new Boolean(z)});
            } else {
                view.setAccessibilityHeading(z);
            }
        }

        public static void setAccessibilityPaneTitle(View view, CharSequence charSequence) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("96e63eeb", new Object[]{view, charSequence});
            } else {
                view.setAccessibilityPaneTitle(charSequence);
            }
        }

        public static void setAutofillId(View view, AutofillIdCompat autofillIdCompat) {
            AutofillId autofillId;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("990be9ff", new Object[]{view, autofillIdCompat});
                return;
            }
            if (autofillIdCompat == null) {
                autofillId = null;
            } else {
                autofillId = autofillIdCompat.toAutofillId();
            }
            view.setAutofillId(autofillId);
        }

        public static void setScreenReaderFocusable(View view, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b58d03aa", new Object[]{view, new Boolean(z)});
            } else {
                view.setScreenReaderFocusable(z);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class Api29Impl {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        private Api29Impl() {
        }

        public static View.AccessibilityDelegate getAccessibilityDelegate(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (View.AccessibilityDelegate) ipChange.ipc$dispatch("ed66ac1", new Object[]{view});
            }
            return view.getAccessibilityDelegate();
        }

        public static ContentCaptureSession getContentCaptureSession(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ContentCaptureSession) ipChange.ipc$dispatch("e501c3f8", new Object[]{view});
            }
            return view.getContentCaptureSession();
        }

        public static List<Rect> getSystemGestureExclusionRects(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (List) ipChange.ipc$dispatch("a2e839a1", new Object[]{view});
            }
            return view.getSystemGestureExclusionRects();
        }

        public static void saveAttributeDataForStyleable(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("40b293", new Object[]{view, context, iArr, attributeSet, typedArray, new Integer(i), new Integer(i2)});
            } else {
                view.saveAttributeDataForStyleable(context, iArr, attributeSet, typedArray, i, i2);
            }
        }

        public static void setContentCaptureSession(View view, ContentCaptureSessionCompat contentCaptureSessionCompat) {
            ContentCaptureSession contentCaptureSession;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3d46ac94", new Object[]{view, contentCaptureSessionCompat});
                return;
            }
            if (contentCaptureSessionCompat == null) {
                contentCaptureSession = null;
            } else {
                contentCaptureSession = contentCaptureSessionCompat.toContentCaptureSession();
            }
            view.setContentCaptureSession(contentCaptureSession);
        }

        public static void setSystemGestureExclusionRects(View view, List<Rect> list) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e4abcae3", new Object[]{view, list});
            } else {
                view.setSystemGestureExclusionRects(list);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class Api30Impl {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        private Api30Impl() {
        }

        public static int getImportantForContentCapture(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("9d5caff4", new Object[]{view})).intValue();
            }
            return view.getImportantForContentCapture();
        }

        public static CharSequence getStateDescription(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (CharSequence) ipChange.ipc$dispatch("77a6f6d0", new Object[]{view});
            }
            return view.getStateDescription();
        }

        public static WindowInsetsControllerCompat getWindowInsetsController(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (WindowInsetsControllerCompat) ipChange.ipc$dispatch("538ac740", new Object[]{view});
            }
            WindowInsetsController windowInsetsController = view.getWindowInsetsController();
            if (windowInsetsController != null) {
                return WindowInsetsControllerCompat.toWindowInsetsControllerCompat(windowInsetsController);
            }
            return null;
        }

        public static boolean isImportantForContentCapture(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("47b964b1", new Object[]{view})).booleanValue();
            }
            return view.isImportantForContentCapture();
        }

        public static void setImportantForContentCapture(View view, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("acfa152e", new Object[]{view, new Integer(i)});
            } else {
                view.setImportantForContentCapture(i);
            }
        }

        public static void setStateDescription(View view, CharSequence charSequence) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("db0e59c2", new Object[]{view, charSequence});
            } else {
                view.setStateDescription(charSequence);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static final class Api31Impl {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        private Api31Impl() {
        }

        public static String[] getReceiveContentMimeTypes(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String[]) ipChange.ipc$dispatch("aed05b21", new Object[]{view});
            }
            return view.getReceiveContentMimeTypes();
        }

        public static ContentInfoCompat performReceiveContent(View view, ContentInfoCompat contentInfoCompat) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ContentInfoCompat) ipChange.ipc$dispatch("9f678c62", new Object[]{view, contentInfoCompat});
            }
            ContentInfo contentInfo = contentInfoCompat.toContentInfo();
            ContentInfo performReceiveContent = view.performReceiveContent(contentInfo);
            if (performReceiveContent == null) {
                return null;
            }
            if (performReceiveContent == contentInfo) {
                return contentInfoCompat;
            }
            return ContentInfoCompat.toContentInfoCompat(performReceiveContent);
        }

        public static void setOnReceiveContentListener(View view, String[] strArr, OnReceiveContentListener onReceiveContentListener) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("38d16fd9", new Object[]{view, strArr, onReceiveContentListener});
            } else if (onReceiveContentListener == null) {
                view.setOnReceiveContentListener(strArr, null);
            } else {
                view.setOnReceiveContentListener(strArr, new OnReceiveContentListenerAdapter(onReceiveContentListener));
            }
        }
    }

    /* compiled from: Taobao */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public @interface FocusDirection {
    }

    /* compiled from: Taobao */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public @interface FocusRealDirection {
    }

    /* compiled from: Taobao */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public @interface FocusRelativeDirection {
    }

    /* compiled from: Taobao */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public @interface NestedScrollType {
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static final class OnReceiveContentListenerAdapter implements OnReceiveContentListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private final OnReceiveContentListener mJetpackListener;

        public OnReceiveContentListenerAdapter(OnReceiveContentListener onReceiveContentListener) {
            this.mJetpackListener = onReceiveContentListener;
        }

        public ContentInfo onReceiveContent(View view, ContentInfo contentInfo) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return zo4.a(ipChange.ipc$dispatch("178d88e0", new Object[]{this, view, contentInfo}));
            }
            ContentInfoCompat contentInfoCompat = ContentInfoCompat.toContentInfoCompat(contentInfo);
            ContentInfoCompat onReceiveContent = this.mJetpackListener.onReceiveContent(view, contentInfoCompat);
            if (onReceiveContent == null) {
                return null;
            }
            if (onReceiveContent == contentInfoCompat) {
                return contentInfo;
            }
            return onReceiveContent.toContentInfo();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public interface OnUnhandledKeyEventListenerCompat {
        boolean onUnhandledKeyEvent(View view, KeyEvent keyEvent);
    }

    /* compiled from: Taobao */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public @interface ScrollAxis {
    }

    /* compiled from: Taobao */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public @interface ScrollIndicators {
    }

    private static AccessibilityViewProperty<Boolean> accessibilityHeadingProperty() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AccessibilityViewProperty) ipChange.ipc$dispatch("27d9096", new Object[0]);
        }
        return new AccessibilityViewProperty<Boolean>(R.id.tag_accessibility_heading, Boolean.class, 28) { // from class: androidx.core.view.ViewCompat.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass4 r2, String str, Object... objArr) {
                str.hashCode();
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/core/view/ViewCompat$4");
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // androidx.core.view.ViewCompat.AccessibilityViewProperty
            public Boolean frameworkGet(View view) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? (Boolean) ipChange2.ipc$dispatch("f122f830", new Object[]{this, view}) : Boolean.valueOf(Api28Impl.isAccessibilityHeading(view));
            }

            public void frameworkSet(View view, Boolean bool) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("195bdd06", new Object[]{this, view, bool});
                } else {
                    Api28Impl.setAccessibilityHeading(view, bool.booleanValue());
                }
            }

            public boolean shouldUpdate(Boolean bool, Boolean bool2) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ((Boolean) ipChange2.ipc$dispatch("e943b787", new Object[]{this, bool, bool2})).booleanValue() : !booleanNullToFalseEquals(bool, bool2);
            }
        };
    }

    public static int addAccessibilityAction(View view, CharSequence charSequence, AccessibilityViewCommand accessibilityViewCommand) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7730f6cf", new Object[]{view, charSequence, accessibilityViewCommand})).intValue();
        }
        int availableActionIdFromResources = getAvailableActionIdFromResources(view, charSequence);
        if (availableActionIdFromResources != -1) {
            addAccessibilityAction(view, new AccessibilityNodeInfoCompat.AccessibilityActionCompat(availableActionIdFromResources, charSequence, accessibilityViewCommand));
        }
        return availableActionIdFromResources;
    }

    public static void addKeyboardNavigationClusters(View view, Collection<View> collection, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5024971c", new Object[]{view, collection, new Integer(i)});
        } else if (Build.VERSION.SDK_INT >= 26) {
            Api26Impl.addKeyboardNavigationClusters(view, collection, i);
        }
    }

    public static void addOnUnhandledKeyEventListener(View view, OnUnhandledKeyEventListenerCompat onUnhandledKeyEventListenerCompat) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e0dc1b0", new Object[]{view, onUnhandledKeyEventListenerCompat});
        } else if (Build.VERSION.SDK_INT >= 28) {
            Api28Impl.addOnUnhandledKeyEventListener(view, onUnhandledKeyEventListenerCompat);
        } else {
            int i = R.id.tag_unhandled_key_listeners;
            ArrayList arrayList = (ArrayList) view.getTag(i);
            if (arrayList == null) {
                arrayList = new ArrayList();
                view.setTag(i, arrayList);
            }
            arrayList.add(onUnhandledKeyEventListenerCompat);
            if (arrayList.size() == 1) {
                UnhandledKeyEventManager.registerListeningView(view);
            }
        }
    }

    @Deprecated
    public static ViewPropertyAnimatorCompat animate(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewPropertyAnimatorCompat) ipChange.ipc$dispatch("ac45f438", new Object[]{view});
        }
        if (sViewPropertyAnimatorMap == null) {
            sViewPropertyAnimatorMap = new WeakHashMap<>();
        }
        ViewPropertyAnimatorCompat viewPropertyAnimatorCompat = sViewPropertyAnimatorMap.get(view);
        if (viewPropertyAnimatorCompat != null) {
            return viewPropertyAnimatorCompat;
        }
        ViewPropertyAnimatorCompat viewPropertyAnimatorCompat2 = new ViewPropertyAnimatorCompat(view);
        sViewPropertyAnimatorMap.put(view, viewPropertyAnimatorCompat2);
        return viewPropertyAnimatorCompat2;
    }

    private static void bindTempDetach() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b96432b", new Object[0]);
            return;
        }
        try {
            sDispatchStartTemporaryDetach = View.class.getDeclaredMethod("dispatchStartTemporaryDetach", new Class[0]);
            sDispatchFinishTemporaryDetach = View.class.getDeclaredMethod("dispatchFinishTemporaryDetach", new Class[0]);
        } catch (NoSuchMethodException e) {
            Log.e(TAG, "Couldn't find method", e);
        }
        sTempDetachBound = true;
    }

    @Deprecated
    public static boolean canScrollHorizontally(View view, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fc947d8a", new Object[]{view, new Integer(i)})).booleanValue();
        }
        return view.canScrollHorizontally(i);
    }

    @Deprecated
    public static boolean canScrollVertically(View view, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5a89699c", new Object[]{view, new Integer(i)})).booleanValue();
        }
        return view.canScrollVertically(i);
    }

    public static void cancelDragAndDrop(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84596733", new Object[]{view});
        } else if (Build.VERSION.SDK_INT >= 24) {
            Api24Impl.cancelDragAndDrop(view);
        }
    }

    @Deprecated
    public static int combineMeasuredStates(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9c972161", new Object[]{new Integer(i), new Integer(i2)})).intValue();
        }
        return View.combineMeasuredStates(i, i2);
    }

    private static void compatOffsetLeftAndRight(View view, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a4d5779", new Object[]{view, new Integer(i)});
            return;
        }
        view.offsetLeftAndRight(i);
        if (view.getVisibility() == 0) {
            tickleInvalidationFlag(view);
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                tickleInvalidationFlag((View) parent);
            }
        }
    }

    private static void compatOffsetTopAndBottom(View view, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a3ba1da", new Object[]{view, new Integer(i)});
            return;
        }
        view.offsetTopAndBottom(i);
        if (view.getVisibility() == 0) {
            tickleInvalidationFlag(view);
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                tickleInvalidationFlag((View) parent);
            }
        }
    }

    public static WindowInsetsCompat computeSystemWindowInsets(View view, WindowInsetsCompat windowInsetsCompat, Rect rect) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WindowInsetsCompat) ipChange.ipc$dispatch("b9830ba8", new Object[]{view, windowInsetsCompat, rect});
        }
        return Api21Impl.computeSystemWindowInsets(view, windowInsetsCompat, rect);
    }

    public static WindowInsetsCompat dispatchApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WindowInsetsCompat) ipChange.ipc$dispatch("68869a51", new Object[]{view, windowInsetsCompat});
        }
        WindowInsets windowInsets = windowInsetsCompat.toWindowInsets();
        if (windowInsets != null) {
            WindowInsets dispatchApplyWindowInsets = Api20Impl.dispatchApplyWindowInsets(view, windowInsets);
            if (!dispatchApplyWindowInsets.equals(windowInsets)) {
                return WindowInsetsCompat.toWindowInsetsCompat(dispatchApplyWindowInsets, view);
            }
        }
        return windowInsetsCompat;
    }

    public static void dispatchFinishTemporaryDetach(View view) {
        if (Build.VERSION.SDK_INT >= 24) {
            Api24Impl.dispatchFinishTemporaryDetach(view);
            return;
        }
        if (!sTempDetachBound) {
            bindTempDetach();
        }
        Method method = sDispatchFinishTemporaryDetach;
        if (method != null) {
            try {
                method.invoke(view, new Object[0]);
            } catch (Exception unused) {
            }
        } else {
            view.onFinishTemporaryDetach();
        }
    }

    public static boolean dispatchNestedFling(View view, float f, float f2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1eba4818", new Object[]{view, new Float(f), new Float(f2), new Boolean(z)})).booleanValue();
        }
        return Api21Impl.dispatchNestedFling(view, f, f2, z);
    }

    public static boolean dispatchNestedPreFling(View view, float f, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ed7653c5", new Object[]{view, new Float(f), new Float(f2)})).booleanValue();
        }
        return Api21Impl.dispatchNestedPreFling(view, f, f2);
    }

    public static boolean dispatchNestedPreScroll(View view, int i, int i2, int[] iArr, int[] iArr2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("668b4fcc", new Object[]{view, new Integer(i), new Integer(i2), iArr, iArr2})).booleanValue() : Api21Impl.dispatchNestedPreScroll(view, i, i2, iArr, iArr2);
    }

    public static boolean dispatchNestedScroll(View view, int i, int i2, int i3, int i4, int[] iArr) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a1642cff", new Object[]{view, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), iArr})).booleanValue() : Api21Impl.dispatchNestedScroll(view, i, i2, i3, i4, iArr);
    }

    public static void dispatchStartTemporaryDetach(View view) {
        if (Build.VERSION.SDK_INT >= 24) {
            Api24Impl.dispatchStartTemporaryDetach(view);
            return;
        }
        if (!sTempDetachBound) {
            bindTempDetach();
        }
        Method method = sDispatchStartTemporaryDetach;
        if (method != null) {
            try {
                method.invoke(view, new Object[0]);
            } catch (Exception unused) {
            }
        } else {
            view.onStartTemporaryDetach();
        }
    }

    public static boolean dispatchUnhandledKeyEventBeforeCallback(View view, KeyEvent keyEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1e90c93d", new Object[]{view, keyEvent})).booleanValue();
        }
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        return UnhandledKeyEventManager.at(view).dispatch(view, keyEvent);
    }

    public static boolean dispatchUnhandledKeyEventBeforeHierarchy(View view, KeyEvent keyEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("70ca307", new Object[]{view, keyEvent})).booleanValue();
        }
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        return UnhandledKeyEventManager.at(view).preDispatch(keyEvent);
    }

    public static void enableAccessibleClickableSpanSupport(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d9ad54f", new Object[]{view});
        } else {
            ensureAccessibilityDelegateCompat(view);
        }
    }

    public static void ensureAccessibilityDelegateCompat(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d8dcbd4", new Object[]{view});
            return;
        }
        AccessibilityDelegateCompat accessibilityDelegate = getAccessibilityDelegate(view);
        if (accessibilityDelegate == null) {
            accessibilityDelegate = new AccessibilityDelegateCompat();
        }
        setAccessibilityDelegate(view, accessibilityDelegate);
    }

    @Deprecated
    public static int generateViewId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6ed9c66f", new Object[0])).intValue();
        }
        return View.generateViewId();
    }

    public static AccessibilityDelegateCompat getAccessibilityDelegate(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AccessibilityDelegateCompat) ipChange.ipc$dispatch("179a98c2", new Object[]{view});
        }
        View.AccessibilityDelegate accessibilityDelegateInternal = getAccessibilityDelegateInternal(view);
        if (accessibilityDelegateInternal == null) {
            return null;
        }
        if (accessibilityDelegateInternal instanceof AccessibilityDelegateCompat.AccessibilityDelegateAdapter) {
            return ((AccessibilityDelegateCompat.AccessibilityDelegateAdapter) accessibilityDelegateInternal).mCompat;
        }
        return new AccessibilityDelegateCompat(accessibilityDelegateInternal);
    }

    private static View.AccessibilityDelegate getAccessibilityDelegateInternal(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View.AccessibilityDelegate) ipChange.ipc$dispatch("2b458544", new Object[]{view});
        }
        if (Build.VERSION.SDK_INT >= 29) {
            return Api29Impl.getAccessibilityDelegate(view);
        }
        return getAccessibilityDelegateThroughReflection(view);
    }

    private static View.AccessibilityDelegate getAccessibilityDelegateThroughReflection(View view) {
        if (sAccessibilityDelegateCheckFailed) {
            return null;
        }
        if (sAccessibilityDelegateField == null) {
            try {
                Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                sAccessibilityDelegateField = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable unused) {
                sAccessibilityDelegateCheckFailed = true;
                return null;
            }
        }
        try {
            Object obj = sAccessibilityDelegateField.get(view);
            if (obj instanceof View.AccessibilityDelegate) {
                return (View.AccessibilityDelegate) obj;
            }
            return null;
        } catch (Throwable unused2) {
            sAccessibilityDelegateCheckFailed = true;
            return null;
        }
    }

    @Deprecated
    public static int getAccessibilityLiveRegion(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ff6e1326", new Object[]{view})).intValue();
        }
        return view.getAccessibilityLiveRegion();
    }

    public static AccessibilityNodeProviderCompat getAccessibilityNodeProvider(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AccessibilityNodeProviderCompat) ipChange.ipc$dispatch("3aefb3a3", new Object[]{view});
        }
        AccessibilityNodeProvider accessibilityNodeProvider = view.getAccessibilityNodeProvider();
        if (accessibilityNodeProvider != null) {
            return new AccessibilityNodeProviderCompat(accessibilityNodeProvider);
        }
        return null;
    }

    public static CharSequence getAccessibilityPaneTitle(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CharSequence) ipChange.ipc$dispatch("9068187", new Object[]{view});
        }
        return paneTitleProperty().get(view);
    }

    private static List<AccessibilityNodeInfoCompat.AccessibilityActionCompat> getActionList(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("7b76ce66", new Object[]{view});
        }
        int i = R.id.tag_accessibility_actions;
        ArrayList arrayList = (ArrayList) view.getTag(i);
        if (arrayList != null) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        view.setTag(i, arrayList2);
        return arrayList2;
    }

    @Deprecated
    public static float getAlpha(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d0f74c33", new Object[]{view})).floatValue();
        }
        return view.getAlpha();
    }

    public static AutofillIdCompat getAutofillId(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AutofillIdCompat) ipChange.ipc$dispatch("30c6efd1", new Object[]{view});
        }
        if (Build.VERSION.SDK_INT >= 26) {
            return AutofillIdCompat.toAutofillIdCompat(Api26Impl.getAutofillId(view));
        }
        return null;
    }

    private static int getAvailableActionIdFromResources(View view, CharSequence charSequence) {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("cb0006cb", new Object[]{view, charSequence})).intValue();
        }
        List<AccessibilityNodeInfoCompat.AccessibilityActionCompat> actionList = getActionList(view);
        for (int i = 0; i < actionList.size(); i++) {
            if (TextUtils.equals(charSequence, actionList.get(i).getLabel())) {
                return actionList.get(i).getId();
            }
        }
        int i2 = 0;
        int i3 = -1;
        while (true) {
            int[] iArr = ACCESSIBILITY_ACTIONS_RESOURCE_IDS;
            if (i2 >= iArr.length || i3 != -1) {
                break;
            }
            int i4 = iArr[i2];
            boolean z2 = true;
            for (int i5 = 0; i5 < actionList.size(); i5++) {
                if (actionList.get(i5).getId() != i4) {
                    z = true;
                } else {
                    z = false;
                }
                z2 &= z;
            }
            if (z2) {
                i3 = i4;
            }
            i2++;
        }
        return i3;
    }

    public static ColorStateList getBackgroundTintList(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ColorStateList) ipChange.ipc$dispatch("a4630c06", new Object[]{view});
        }
        return Api21Impl.getBackgroundTintList(view);
    }

    public static PorterDuff.Mode getBackgroundTintMode(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PorterDuff.Mode) ipChange.ipc$dispatch("30366658", new Object[]{view});
        }
        return Api21Impl.getBackgroundTintMode(view);
    }

    @Deprecated
    public static Rect getClipBounds(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Rect) ipChange.ipc$dispatch("b719edb9", new Object[]{view});
        }
        return view.getClipBounds();
    }

    public static ContentCaptureSessionCompat getContentCaptureSession(View view) {
        ContentCaptureSession contentCaptureSession;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ContentCaptureSessionCompat) ipChange.ipc$dispatch("b2736780", new Object[]{view});
        }
        if (Build.VERSION.SDK_INT < 29 || (contentCaptureSession = Api29Impl.getContentCaptureSession(view)) == null) {
            return null;
        }
        return ContentCaptureSessionCompat.toContentCaptureSessionCompat(contentCaptureSession, view);
    }

    @Deprecated
    public static Display getDisplay(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Display) ipChange.ipc$dispatch("b27a78ae", new Object[]{view});
        }
        return view.getDisplay();
    }

    public static float getElevation(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6c17554", new Object[]{view})).floatValue();
        }
        return Api21Impl.getElevation(view);
    }

    private static Rect getEmptyTempRect() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Rect) ipChange.ipc$dispatch("1a41925f", new Object[0]);
        }
        if (sThreadLocalRect == null) {
            sThreadLocalRect = new ThreadLocal<>();
        }
        Rect rect = sThreadLocalRect.get();
        if (rect == null) {
            rect = new Rect();
            sThreadLocalRect.set(rect);
        }
        rect.setEmpty();
        return rect;
    }

    private static OnReceiveContentViewBehavior getFallback(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (OnReceiveContentViewBehavior) ipChange.ipc$dispatch("4482aaf8", new Object[]{view});
        }
        if (view instanceof OnReceiveContentViewBehavior) {
            return (OnReceiveContentViewBehavior) view;
        }
        return NO_OP_ON_RECEIVE_CONTENT_VIEW_BEHAVIOR;
    }

    @Deprecated
    public static boolean getFitsSystemWindows(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("13177433", new Object[]{view})).booleanValue();
        }
        return view.getFitsSystemWindows();
    }

    @Deprecated
    public static int getImportantForAccessibility(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5991f52d", new Object[]{view})).intValue();
        }
        return view.getImportantForAccessibility();
    }

    public static int getImportantForContentCapture(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9d5caff4", new Object[]{view})).intValue();
        }
        if (Build.VERSION.SDK_INT >= 30) {
            return Api30Impl.getImportantForContentCapture(view);
        }
        return 0;
    }

    @Deprecated
    public static int getLabelFor(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8f0571d3", new Object[]{view})).intValue();
        }
        return view.getLabelFor();
    }

    @Deprecated
    public static int getLayerType(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c2b8b3c9", new Object[]{view})).intValue();
        }
        return view.getLayerType();
    }

    @Deprecated
    public static int getLayoutDirection(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c5625cbf", new Object[]{view})).intValue();
        }
        return view.getLayoutDirection();
    }

    @Deprecated
    public static Matrix getMatrix(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Matrix) ipChange.ipc$dispatch("83ffa6e0", new Object[]{view});
        }
        return view.getMatrix();
    }

    @Deprecated
    public static int getMeasuredHeightAndState(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8790e1a1", new Object[]{view})).intValue();
        }
        return view.getMeasuredHeightAndState();
    }

    @Deprecated
    public static int getMeasuredState(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("88514f89", new Object[]{view})).intValue();
        }
        return view.getMeasuredState();
    }

    @Deprecated
    public static int getMeasuredWidthAndState(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c611ba5a", new Object[]{view})).intValue();
        }
        return view.getMeasuredWidthAndState();
    }

    @Deprecated
    public static int getMinimumHeight(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e6e726df", new Object[]{view})).intValue();
        }
        return view.getMinimumHeight();
    }

    @Deprecated
    public static int getMinimumWidth(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c3f8a050", new Object[]{view})).intValue();
        }
        return view.getMinimumWidth();
    }

    public static int getNextClusterForwardId(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4555688f", new Object[]{view})).intValue();
        }
        if (Build.VERSION.SDK_INT >= 26) {
            return Api26Impl.getNextClusterForwardId(view);
        }
        return -1;
    }

    public static String[] getOnReceiveContentMimeTypes(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("b4466fa0", new Object[]{view});
        }
        if (Build.VERSION.SDK_INT >= 31) {
            return Api31Impl.getReceiveContentMimeTypes(view);
        }
        return (String[]) view.getTag(R.id.tag_on_receive_content_mime_types);
    }

    @Deprecated
    public static int getOverScrollMode(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2ffcb4a4", new Object[]{view})).intValue();
        }
        return view.getOverScrollMode();
    }

    @Deprecated
    public static int getPaddingEnd(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b7fb19de", new Object[]{view})).intValue();
        }
        return view.getPaddingEnd();
    }

    @Deprecated
    public static int getPaddingStart(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a148b3b7", new Object[]{view})).intValue();
        }
        return view.getPaddingStart();
    }

    @Deprecated
    public static ViewParent getParentForAccessibility(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewParent) ipChange.ipc$dispatch("478339fe", new Object[]{view});
        }
        return view.getParentForAccessibility();
    }

    @Deprecated
    public static float getPivotX(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("dfa16c0f", new Object[]{view})).floatValue();
        }
        return view.getPivotX();
    }

    @Deprecated
    public static float getPivotY(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("dba2faee", new Object[]{view})).floatValue();
        }
        return view.getPivotY();
    }

    public static WindowInsetsCompat getRootWindowInsets(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WindowInsetsCompat) ipChange.ipc$dispatch("f02305b6", new Object[]{view});
        }
        if (Build.VERSION.SDK_INT >= 23) {
            return Api23Impl.getRootWindowInsets(view);
        }
        return Api21Impl.getRootWindowInsets(view);
    }

    @Deprecated
    public static float getRotation(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("557e2167", new Object[]{view})).floatValue();
        }
        return view.getRotation();
    }

    @Deprecated
    public static float getRotationX(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1e4c8e77", new Object[]{view})).floatValue();
        }
        return view.getRotationX();
    }

    @Deprecated
    public static float getRotationY(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1a4e1d56", new Object[]{view})).floatValue();
        }
        return view.getRotationY();
    }

    @Deprecated
    public static float getScaleX(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3ea41117", new Object[]{view})).floatValue();
        }
        return view.getScaleX();
    }

    @Deprecated
    public static float getScaleY(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3aa59ff6", new Object[]{view})).floatValue();
        }
        return view.getScaleY();
    }

    public static int getScrollIndicators(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("146b2a97", new Object[]{view})).intValue();
        }
        if (Build.VERSION.SDK_INT >= 23) {
            return Api23Impl.getScrollIndicators(view);
        }
        return 0;
    }

    public static CharSequence getStateDescription(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CharSequence) ipChange.ipc$dispatch("77a6f6d0", new Object[]{view});
        }
        return stateDescriptionProperty().get(view);
    }

    public static List<Rect> getSystemGestureExclusionRects(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("a2e839a1", new Object[]{view});
        }
        if (Build.VERSION.SDK_INT >= 29) {
            return Api29Impl.getSystemGestureExclusionRects(view);
        }
        return Collections.emptyList();
    }

    public static String getTransitionName(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("575f0f8b", new Object[]{view});
        }
        return Api21Impl.getTransitionName(view);
    }

    @Deprecated
    public static float getTranslationX(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("96e15fe", new Object[]{view})).floatValue();
        }
        return view.getTranslationX();
    }

    @Deprecated
    public static float getTranslationY(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("56fa4dd", new Object[]{view})).floatValue();
        }
        return view.getTranslationY();
    }

    public static float getTranslationZ(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("17133bc", new Object[]{view})).floatValue();
        }
        return Api21Impl.getTranslationZ(view);
    }

    @Deprecated
    public static WindowInsetsControllerCompat getWindowInsetsController(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WindowInsetsControllerCompat) ipChange.ipc$dispatch("538ac740", new Object[]{view});
        }
        if (Build.VERSION.SDK_INT >= 30) {
            return Api30Impl.getWindowInsetsController(view);
        }
        for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                Window window = ((Activity) context).getWindow();
                if (window != null) {
                    return WindowCompat.getInsetsController(window, view);
                }
                return null;
            }
        }
        return null;
    }

    @Deprecated
    public static int getWindowSystemUiVisibility(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b92d6863", new Object[]{view})).intValue();
        }
        return view.getWindowSystemUiVisibility();
    }

    @Deprecated
    public static float getX(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("69324ad9", new Object[]{view})).floatValue();
        }
        return view.getX();
    }

    @Deprecated
    public static float getY(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6533d9b8", new Object[]{view})).floatValue();
        }
        return view.getY();
    }

    public static float getZ(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("61356897", new Object[]{view})).floatValue();
        }
        return Api21Impl.getZ(view);
    }

    public static boolean hasAccessibilityDelegate(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cac87256", new Object[]{view})).booleanValue();
        }
        if (getAccessibilityDelegateInternal(view) != null) {
            return true;
        }
        return false;
    }

    public static boolean hasExplicitFocusable(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9084198b", new Object[]{view})).booleanValue();
        }
        if (Build.VERSION.SDK_INT >= 26) {
            return Api26Impl.hasExplicitFocusable(view);
        }
        return view.hasFocusable();
    }

    public static boolean hasNestedScrollingParent(View view) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3b9f8aa1", new Object[]{view})).booleanValue() : Api21Impl.hasNestedScrollingParent(view);
    }

    @Deprecated
    public static boolean hasOnClickListeners(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("703cbedf", new Object[]{view})).booleanValue();
        }
        return view.hasOnClickListeners();
    }

    @Deprecated
    public static boolean hasOverlappingRendering(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5642042", new Object[]{view})).booleanValue();
        }
        return view.hasOverlappingRendering();
    }

    @Deprecated
    public static boolean hasTransientState(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8957c26e", new Object[]{view})).booleanValue();
        }
        return view.hasTransientState();
    }

    public static boolean isAccessibilityHeading(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bbc97611", new Object[]{view})).booleanValue();
        }
        Boolean bool = accessibilityHeadingProperty().get(view);
        if (bool == null || !bool.booleanValue()) {
            return false;
        }
        return true;
    }

    @Deprecated
    public static boolean isAttachedToWindow(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3974c376", new Object[]{view})).booleanValue();
        }
        return view.isAttachedToWindow();
    }

    public static boolean isFocusedByDefault(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("36defad2", new Object[]{view})).booleanValue();
        }
        if (Build.VERSION.SDK_INT >= 26) {
            return Api26Impl.isFocusedByDefault(view);
        }
        return false;
    }

    public static boolean isImportantForAccessibility(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3b5fb12", new Object[]{view})).booleanValue();
        }
        return Api21Impl.isImportantForAccessibility(view);
    }

    public static boolean isImportantForContentCapture(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("47b964b1", new Object[]{view})).booleanValue();
        }
        if (Build.VERSION.SDK_INT >= 30) {
            return Api30Impl.isImportantForContentCapture(view);
        }
        return false;
    }

    @Deprecated
    public static boolean isInLayout(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2665ecd6", new Object[]{view})).booleanValue();
        }
        return view.isInLayout();
    }

    public static boolean isKeyboardNavigationCluster(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("17360b3a", new Object[]{view})).booleanValue();
        }
        if (Build.VERSION.SDK_INT >= 26) {
            return Api26Impl.isKeyboardNavigationCluster(view);
        }
        return false;
    }

    @Deprecated
    public static boolean isLaidOut(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("898e971b", new Object[]{view})).booleanValue();
        }
        return view.isLaidOut();
    }

    @Deprecated
    public static boolean isLayoutDirectionResolved(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cf4f9b8c", new Object[]{view})).booleanValue();
        }
        return view.isLayoutDirectionResolved();
    }

    public static boolean isNestedScrollingEnabled(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a331cde2", new Object[]{view})).booleanValue();
        }
        return Api21Impl.isNestedScrollingEnabled(view);
    }

    @Deprecated
    public static boolean isOpaque(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("73e652a4", new Object[]{view})).booleanValue();
        }
        return view.isOpaque();
    }

    @Deprecated
    public static boolean isPaddingRelative(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3a62241c", new Object[]{view})).booleanValue();
        }
        return view.isPaddingRelative();
    }

    public static boolean isScreenReaderFocusable(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8b398136", new Object[]{view})).booleanValue();
        }
        Boolean bool = screenReaderFocusableProperty().get(view);
        if (bool == null || !bool.booleanValue()) {
            return false;
        }
        return true;
    }

    @Deprecated
    public static void jumpDrawablesToCurrentState(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a1423011", new Object[]{view});
        } else {
            view.jumpDrawablesToCurrentState();
        }
    }

    public static View keyboardNavigationClusterSearch(View view, View view2, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("5b645d7", new Object[]{view, view2, new Integer(i)});
        }
        if (Build.VERSION.SDK_INT >= 26) {
            return Api26Impl.keyboardNavigationClusterSearch(view, view2, i);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ ContentInfoCompat lambda$static$0(ContentInfoCompat contentInfoCompat) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ContentInfoCompat) ipChange.ipc$dispatch("cf02ce98", new Object[]{contentInfoCompat}) : contentInfoCompat;
    }

    public static void notifyViewAccessibilityStateChangedIfNeeded(View view, int i) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("74d51c2d", new Object[]{view, new Integer(i)});
            return;
        }
        AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled()) {
            if (getAccessibilityPaneTitle(view) == null || !view.isShown() || view.getWindowVisibility() != 0) {
                z = false;
            }
            int i2 = 32;
            if (view.getAccessibilityLiveRegion() != 0 || z) {
                AccessibilityEvent obtain = AccessibilityEvent.obtain();
                if (!z) {
                    i2 = 2048;
                }
                obtain.setEventType(i2);
                obtain.setContentChangeTypes(i);
                if (z) {
                    obtain.getText().add(getAccessibilityPaneTitle(view));
                    setImportantForAccessibilityIfNeeded(view);
                }
                view.sendAccessibilityEventUnchecked(obtain);
            } else if (i == 32) {
                AccessibilityEvent obtain2 = AccessibilityEvent.obtain();
                view.onInitializeAccessibilityEvent(obtain2);
                obtain2.setEventType(32);
                obtain2.setContentChangeTypes(i);
                obtain2.setSource(view);
                view.onPopulateAccessibilityEvent(obtain2);
                obtain2.getText().add(getAccessibilityPaneTitle(view));
                accessibilityManager.sendAccessibilityEvent(obtain2);
            } else if (view.getParent() != null) {
                try {
                    view.getParent().notifySubtreeAccessibilityStateChanged(view, view, i);
                } catch (AbstractMethodError e) {
                    Log.e(TAG, view.getParent().getClass().getSimpleName().concat(" does not fully implement ViewParent"), e);
                }
            }
        }
    }

    public static void offsetLeftAndRight(View view, int i) {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("822a4a57", new Object[]{view, new Integer(i)});
        } else if (Build.VERSION.SDK_INT >= 23) {
            view.offsetLeftAndRight(i);
        } else {
            Rect emptyTempRect = getEmptyTempRect();
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                View view2 = (View) parent;
                emptyTempRect.set(view2.getLeft(), view2.getTop(), view2.getRight(), view2.getBottom());
                z = !emptyTempRect.intersects(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            }
            compatOffsetLeftAndRight(view, i);
            if (z && emptyTempRect.intersect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom())) {
                ((View) parent).invalidate(emptyTempRect);
            }
        }
    }

    public static WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WindowInsetsCompat) ipChange.ipc$dispatch("eb890e0c", new Object[]{view, windowInsetsCompat});
        }
        WindowInsets windowInsets = windowInsetsCompat.toWindowInsets();
        if (windowInsets != null) {
            WindowInsets onApplyWindowInsets = Api20Impl.onApplyWindowInsets(view, windowInsets);
            if (!onApplyWindowInsets.equals(windowInsets)) {
                return WindowInsetsCompat.toWindowInsetsCompat(onApplyWindowInsets, view);
            }
        }
        return windowInsetsCompat;
    }

    @Deprecated
    public static void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e316cc3a", new Object[]{view, accessibilityEvent});
        } else {
            view.onInitializeAccessibilityEvent(accessibilityEvent);
        }
    }

    @Deprecated
    public static void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d7e7420c", new Object[]{view, accessibilityNodeInfoCompat});
        } else {
            view.onInitializeAccessibilityNodeInfo(accessibilityNodeInfoCompat.unwrap());
        }
    }

    @Deprecated
    public static void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a3b02f54", new Object[]{view, accessibilityEvent});
        } else {
            view.onPopulateAccessibilityEvent(accessibilityEvent);
        }
    }

    private static AccessibilityViewProperty<CharSequence> paneTitleProperty() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AccessibilityViewProperty) ipChange.ipc$dispatch("ddb5a192", new Object[0]);
        }
        return new AccessibilityViewProperty<CharSequence>(R.id.tag_accessibility_pane_title, CharSequence.class, 8, 28) { // from class: androidx.core.view.ViewCompat.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass2 r2, String str, Object... objArr) {
                str.hashCode();
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/core/view/ViewCompat$2");
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // androidx.core.view.ViewCompat.AccessibilityViewProperty
            public CharSequence frameworkGet(View view) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? (CharSequence) ipChange2.ipc$dispatch("7fe278e7", new Object[]{this, view}) : Api28Impl.getAccessibilityPaneTitle(view);
            }

            public void frameworkSet(View view, CharSequence charSequence) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("33fc828b", new Object[]{this, view, charSequence});
                } else {
                    Api28Impl.setAccessibilityPaneTitle(view, charSequence);
                }
            }

            public boolean shouldUpdate(CharSequence charSequence, CharSequence charSequence2) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ((Boolean) ipChange2.ipc$dispatch("f33e8a2f", new Object[]{this, charSequence, charSequence2})).booleanValue() : !TextUtils.equals(charSequence, charSequence2);
            }
        };
    }

    @Deprecated
    public static boolean performAccessibilityAction(View view, int i, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a7f83a7d", new Object[]{view, new Integer(i), bundle})).booleanValue();
        }
        return view.performAccessibilityAction(i, bundle);
    }

    public static boolean performHapticFeedback(View view, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("adacf979", new Object[]{view, new Integer(i)})).booleanValue();
        }
        int feedbackConstantOrFallback = HapticFeedbackConstantsCompat.getFeedbackConstantOrFallback(i);
        if (feedbackConstantOrFallback == -1) {
            return false;
        }
        return view.performHapticFeedback(feedbackConstantOrFallback);
    }

    public static ContentInfoCompat performReceiveContent(View view, ContentInfoCompat contentInfoCompat) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ContentInfoCompat) ipChange.ipc$dispatch("9f678c62", new Object[]{view, contentInfoCompat});
        }
        if (Log.isLoggable(TAG, 3)) {
            Objects.toString(contentInfoCompat);
            view.getClass();
            view.getId();
        }
        if (Build.VERSION.SDK_INT >= 31) {
            return Api31Impl.performReceiveContent(view, contentInfoCompat);
        }
        OnReceiveContentListener onReceiveContentListener = (OnReceiveContentListener) view.getTag(R.id.tag_on_receive_content_listener);
        if (onReceiveContentListener == null) {
            return getFallback(view).onReceiveContent(contentInfoCompat);
        }
        ContentInfoCompat onReceiveContent = onReceiveContentListener.onReceiveContent(view, contentInfoCompat);
        if (onReceiveContent == null) {
            return null;
        }
        return getFallback(view).onReceiveContent(onReceiveContent);
    }

    @Deprecated
    public static void postInvalidateOnAnimation(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("55cc6241", new Object[]{view});
        } else {
            view.postInvalidateOnAnimation();
        }
    }

    @Deprecated
    public static void postOnAnimation(View view, Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("db044f24", new Object[]{view, runnable});
        } else {
            view.postOnAnimation(runnable);
        }
    }

    @Deprecated
    public static void postOnAnimationDelayed(View view, Runnable runnable, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1697f678", new Object[]{view, runnable, new Long(j)});
        } else {
            view.postOnAnimationDelayed(runnable, j);
        }
    }

    public static void removeAccessibilityAction(View view, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1ed1a178", new Object[]{view, new Integer(i)});
            return;
        }
        removeActionWithId(i, view);
        notifyViewAccessibilityStateChangedIfNeeded(view, 0);
    }

    public static void removeOnUnhandledKeyEventListener(View view, OnUnhandledKeyEventListenerCompat onUnhandledKeyEventListenerCompat) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3d25ced", new Object[]{view, onUnhandledKeyEventListenerCompat});
        } else if (Build.VERSION.SDK_INT >= 28) {
            Api28Impl.removeOnUnhandledKeyEventListener(view, onUnhandledKeyEventListenerCompat);
        } else {
            ArrayList arrayList = (ArrayList) view.getTag(R.id.tag_unhandled_key_listeners);
            if (arrayList != null) {
                arrayList.remove(onUnhandledKeyEventListenerCompat);
                if (arrayList.size() == 0) {
                    UnhandledKeyEventManager.unregisterListeningView(view);
                }
            }
        }
    }

    public static void replaceAccessibilityAction(View view, AccessibilityNodeInfoCompat.AccessibilityActionCompat accessibilityActionCompat, CharSequence charSequence, AccessibilityViewCommand accessibilityViewCommand) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e17b627b", new Object[]{view, accessibilityActionCompat, charSequence, accessibilityViewCommand});
        } else if (accessibilityViewCommand == null && charSequence == null) {
            removeAccessibilityAction(view, accessibilityActionCompat.getId());
        } else {
            addAccessibilityAction(view, accessibilityActionCompat.createReplacementAction(charSequence, accessibilityViewCommand));
        }
    }

    public static void requestApplyInsets(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1489f56", new Object[]{view});
        } else {
            Api20Impl.requestApplyInsets(view);
        }
    }

    public static <T extends View> T requireViewById(View view, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ((View) ipChange.ipc$dispatch("1a935756", new Object[]{view, new Integer(i)}));
        }
        if (Build.VERSION.SDK_INT >= 28) {
            return (T) ((View) Api28Impl.requireViewById(view, i));
        }
        T t = (T) view.findViewById(i);
        if (t != null) {
            return t;
        }
        throw new IllegalArgumentException("ID does not reference a View inside this View");
    }

    @Deprecated
    public static int resolveSizeAndState(int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8d425ea8", new Object[]{new Integer(i), new Integer(i2), new Integer(i3)})).intValue();
        }
        return View.resolveSizeAndState(i, i2, i3);
    }

    public static boolean restoreDefaultFocus(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("abf7a28a", new Object[]{view})).booleanValue();
        }
        if (Build.VERSION.SDK_INT >= 26) {
            return Api26Impl.restoreDefaultFocus(view);
        }
        return view.requestFocus();
    }

    public static void saveAttributeDataForStyleable(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("40b293", new Object[]{view, context, iArr, attributeSet, typedArray, new Integer(i), new Integer(i2)});
        } else if (Build.VERSION.SDK_INT >= 29) {
            Api29Impl.saveAttributeDataForStyleable(view, context, iArr, attributeSet, typedArray, i, i2);
        }
    }

    private static AccessibilityViewProperty<Boolean> screenReaderFocusableProperty() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AccessibilityViewProperty) ipChange.ipc$dispatch("87a37ae5", new Object[0]);
        }
        return new AccessibilityViewProperty<Boolean>(R.id.tag_screen_reader_focusable, Boolean.class, 28) { // from class: androidx.core.view.ViewCompat.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass1 r2, String str, Object... objArr) {
                str.hashCode();
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/core/view/ViewCompat$1");
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // androidx.core.view.ViewCompat.AccessibilityViewProperty
            public Boolean frameworkGet(View view) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? (Boolean) ipChange2.ipc$dispatch("f122f830", new Object[]{this, view}) : Boolean.valueOf(Api28Impl.isScreenReaderFocusable(view));
            }

            public void frameworkSet(View view, Boolean bool) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("195bdd06", new Object[]{this, view, bool});
                } else {
                    Api28Impl.setScreenReaderFocusable(view, bool.booleanValue());
                }
            }

            public boolean shouldUpdate(Boolean bool, Boolean bool2) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ((Boolean) ipChange2.ipc$dispatch("e943b787", new Object[]{this, bool, bool2})).booleanValue() : !booleanNullToFalseEquals(bool, bool2);
            }
        };
    }

    public static void setAccessibilityDelegate(View view, AccessibilityDelegateCompat accessibilityDelegateCompat) {
        View.AccessibilityDelegate accessibilityDelegate;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("96303014", new Object[]{view, accessibilityDelegateCompat});
            return;
        }
        if (accessibilityDelegateCompat == null && (getAccessibilityDelegateInternal(view) instanceof AccessibilityDelegateCompat.AccessibilityDelegateAdapter)) {
            accessibilityDelegateCompat = new AccessibilityDelegateCompat();
        }
        setImportantForAccessibilityIfNeeded(view);
        if (accessibilityDelegateCompat == null) {
            accessibilityDelegate = null;
        } else {
            accessibilityDelegate = accessibilityDelegateCompat.getBridge();
        }
        view.setAccessibilityDelegate(accessibilityDelegate);
    }

    public static void setAccessibilityHeading(View view, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3807b99f", new Object[]{view, new Boolean(z)});
        } else {
            accessibilityHeadingProperty().set(view, Boolean.valueOf(z));
        }
    }

    @Deprecated
    public static void setAccessibilityLiveRegion(View view, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42488fa4", new Object[]{view, new Integer(i)});
        } else {
            view.setAccessibilityLiveRegion(i);
        }
    }

    public static void setAccessibilityPaneTitle(View view, CharSequence charSequence) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("96e63eeb", new Object[]{view, charSequence});
            return;
        }
        paneTitleProperty().set(view, charSequence);
        if (charSequence != null) {
            sAccessibilityPaneVisibilityManager.addAccessibilityPane(view);
        } else {
            sAccessibilityPaneVisibilityManager.removeAccessibilityPane(view);
        }
    }

    @Deprecated
    public static void setActivated(View view, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("72580dd8", new Object[]{view, new Boolean(z)});
        } else {
            view.setActivated(z);
        }
    }

    @Deprecated
    public static void setAlpha(View view, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b035a251", new Object[]{view, new Float(f)});
        } else {
            view.setAlpha(f);
        }
    }

    public static void setAutofillHints(View view, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("15a8d94c", new Object[]{view, strArr});
        } else if (Build.VERSION.SDK_INT >= 26) {
            Api26Impl.setAutofillHints(view, strArr);
        }
    }

    public static void setAutofillId(View view, AutofillIdCompat autofillIdCompat) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("990be9ff", new Object[]{view, autofillIdCompat});
        } else if (Build.VERSION.SDK_INT >= 28) {
            Api28Impl.setAutofillId(view, autofillIdCompat);
        }
    }

    @Deprecated
    public static void setBackground(View view, Drawable drawable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("142cf15f", new Object[]{view, drawable});
        } else {
            view.setBackground(drawable);
        }
    }

    public static void setBackgroundTintList(View view, ColorStateList colorStateList) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("71613ac0", new Object[]{view, colorStateList});
            return;
        }
        int i = Build.VERSION.SDK_INT;
        Api21Impl.setBackgroundTintList(view, colorStateList);
        if (i == 21) {
            Drawable background = view.getBackground();
            if (Api21Impl.getBackgroundTintList(view) == null && Api21Impl.getBackgroundTintMode(view) == null) {
                z = false;
            }
            if (background != null && z) {
                if (background.isStateful()) {
                    background.setState(view.getDrawableState());
                }
                view.setBackground(background);
            }
        }
    }

    public static void setBackgroundTintMode(View view, PorterDuff.Mode mode) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("76b9e1a8", new Object[]{view, mode});
            return;
        }
        int i = Build.VERSION.SDK_INT;
        Api21Impl.setBackgroundTintMode(view, mode);
        if (i == 21) {
            Drawable background = view.getBackground();
            if (Api21Impl.getBackgroundTintList(view) == null && Api21Impl.getBackgroundTintMode(view) == null) {
                z = false;
            }
            if (background != null && z) {
                if (background.isStateful()) {
                    background.setState(view.getDrawableState());
                }
                view.setBackground(background);
            }
        }
    }

    @Deprecated
    public static void setClipBounds(View view, Rect rect) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8553d35", new Object[]{view, rect});
        } else {
            view.setClipBounds(rect);
        }
    }

    public static void setContentCaptureSession(View view, ContentCaptureSessionCompat contentCaptureSessionCompat) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3d46ac94", new Object[]{view, contentCaptureSessionCompat});
        } else if (Build.VERSION.SDK_INT >= 29) {
            Api29Impl.setContentCaptureSession(view, contentCaptureSessionCompat);
        }
    }

    public static void setElevation(View view, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44644350", new Object[]{view, new Float(f)});
        } else {
            Api21Impl.setElevation(view, f);
        }
    }

    @Deprecated
    public static void setFitsSystemWindows(View view, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("72ecb4f9", new Object[]{view, new Boolean(z)});
        } else {
            view.setFitsSystemWindows(z);
        }
    }

    public static void setFocusedByDefault(View view, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("107128fe", new Object[]{view, new Boolean(z)});
        } else if (Build.VERSION.SDK_INT >= 26) {
            Api26Impl.setFocusedByDefault(view, z);
        }
    }

    @Deprecated
    public static void setHasTransientState(View view, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a7bf768", new Object[]{view, new Boolean(z)});
        } else {
            view.setHasTransientState(z);
        }
    }

    @Deprecated
    public static void setImportantForAccessibility(View view, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fed4617d", new Object[]{view, new Integer(i)});
        } else {
            view.setImportantForAccessibility(i);
        }
    }

    private static void setImportantForAccessibilityIfNeeded(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("744917b4", new Object[]{view});
        } else if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
        }
    }

    public static void setImportantForAutofill(View view, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44df4c13", new Object[]{view, new Integer(i)});
        } else if (Build.VERSION.SDK_INT >= 26) {
            Api26Impl.setImportantForAutofill(view, i);
        }
    }

    public static void setImportantForContentCapture(View view, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("acfa152e", new Object[]{view, new Integer(i)});
        } else if (Build.VERSION.SDK_INT >= 30) {
            Api30Impl.setImportantForContentCapture(view, i);
        }
    }

    public static void setKeyboardNavigationCluster(View view, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b569626", new Object[]{view, new Boolean(z)});
        } else if (Build.VERSION.SDK_INT >= 26) {
            Api26Impl.setKeyboardNavigationCluster(view, z);
        }
    }

    @Deprecated
    public static void setLabelFor(View view, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23d23a2f", new Object[]{view, new Integer(i)});
        } else {
            view.setLabelFor(i);
        }
    }

    @Deprecated
    public static void setLayerPaint(View view, Paint paint) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a7b22091", new Object[]{view, paint});
        } else {
            view.setLayerPaint(paint);
        }
    }

    @Deprecated
    public static void setLayerType(View view, int i, Paint paint) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("da6e9376", new Object[]{view, new Integer(i), paint});
        } else {
            view.setLayerType(i, paint);
        }
    }

    @Deprecated
    public static void setLayoutDirection(View view, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3fa82d2b", new Object[]{view, new Integer(i)});
        } else {
            view.setLayoutDirection(i);
        }
    }

    public static void setNestedScrollingEnabled(View view, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c286dee", new Object[]{view, new Boolean(z)});
        } else {
            Api21Impl.setNestedScrollingEnabled(view, z);
        }
    }

    public static void setNextClusterForwardId(View view, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e711e8f3", new Object[]{view, new Integer(i)});
        } else if (Build.VERSION.SDK_INT >= 26) {
            Api26Impl.setNextClusterForwardId(view, i);
        }
    }

    public static void setOnApplyWindowInsetsListener(View view, OnApplyWindowInsetsListener onApplyWindowInsetsListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fbf0aa0a", new Object[]{view, onApplyWindowInsetsListener});
        } else {
            Api21Impl.setOnApplyWindowInsetsListener(view, onApplyWindowInsetsListener);
        }
    }

    public static void setOnReceiveContentListener(View view, String[] strArr, OnReceiveContentListener onReceiveContentListener) {
        boolean z;
        boolean z2 = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("38d16fd9", new Object[]{view, strArr, onReceiveContentListener});
        } else if (Build.VERSION.SDK_INT >= 31) {
            Api31Impl.setOnReceiveContentListener(view, strArr, onReceiveContentListener);
        } else {
            if (strArr == null || strArr.length == 0) {
                strArr = null;
            }
            if (onReceiveContentListener != null) {
                if (strArr != null) {
                    z = true;
                } else {
                    z = false;
                }
                Preconditions.checkArgument(z, "When the listener is set, MIME types must also be set");
            }
            if (strArr != null) {
                int length = strArr.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        break;
                    } else if (strArr[i].startsWith("*")) {
                        z2 = true;
                        break;
                    } else {
                        i++;
                    }
                }
                Preconditions.checkArgument(!z2, "A MIME type set here must not start with *: " + Arrays.toString(strArr));
            }
            view.setTag(R.id.tag_on_receive_content_mime_types, strArr);
            view.setTag(R.id.tag_on_receive_content_listener, onReceiveContentListener);
        }
    }

    @Deprecated
    public static void setOverScrollMode(View view, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("671c587e", new Object[]{view, new Integer(i)});
        } else {
            view.setOverScrollMode(i);
        }
    }

    @Deprecated
    public static void setPaddingRelative(View view, int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bbcfaa10", new Object[]{view, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
        } else {
            view.setPaddingRelative(i, i2, i3, i4);
        }
    }

    @Deprecated
    public static void setPivotX(View view, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("faa94f8d", new Object[]{view, new Float(f)});
        } else {
            view.setPivotX(f);
        }
    }

    @Deprecated
    public static void setPivotY(View view, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ed99c8e", new Object[]{view, new Float(f)});
        } else {
            view.setPivotY(f);
        }
    }

    public static void setPointerIcon(View view, PointerIconCompat pointerIconCompat) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d4203b4e", new Object[]{view, pointerIconCompat});
        } else if (Build.VERSION.SDK_INT >= 24) {
            Api24Impl.setPointerIcon(view, qdw.a(pointerIconCompat != null ? pointerIconCompat.getPointerIcon() : null));
        }
    }

    @Deprecated
    public static void setRotation(View view, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c6f7235", new Object[]{view, new Float(f)});
        } else {
            view.setRotation(f);
        }
    }

    @Deprecated
    public static void setRotationX(View view, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1e3c4e8d", new Object[]{view, new Float(f)});
        } else {
            view.setRotationX(f);
        }
    }

    @Deprecated
    public static void setRotationY(View view, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a26c9b8e", new Object[]{view, new Float(f)});
        } else {
            view.setRotationY(f);
        }
    }

    @Deprecated
    public static void setSaveFromParentEnabled(View view, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ece1f5b7", new Object[]{view, new Boolean(z)});
        } else {
            view.setSaveFromParentEnabled(z);
        }
    }

    @Deprecated
    public static void setScaleX(View view, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7bfb4b85", new Object[]{view, new Float(f)});
        } else {
            view.setScaleX(f);
        }
    }

    @Deprecated
    public static void setScaleY(View view, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b9886", new Object[]{view, new Float(f)});
        } else {
            view.setScaleY(f);
        }
    }

    public static void setScreenReaderFocusable(View view, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b58d03aa", new Object[]{view, new Boolean(z)});
        } else {
            screenReaderFocusableProperty().set(view, Boolean.valueOf(z));
        }
    }

    public static void setScrollIndicators(View view, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("380bcdeb", new Object[]{view, new Integer(i)});
        } else if (Build.VERSION.SDK_INT >= 23) {
            Api23Impl.setScrollIndicators(view, i);
        }
    }

    public static void setStateDescription(View view, CharSequence charSequence) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("db0e59c2", new Object[]{view, charSequence});
        } else {
            stateDescriptionProperty().set(view, charSequence);
        }
    }

    public static void setSystemGestureExclusionRects(View view, List<Rect> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e4abcae3", new Object[]{view, list});
        } else if (Build.VERSION.SDK_INT >= 29) {
            Api29Impl.setSystemGestureExclusionRects(view, list);
        }
    }

    public static void setTooltipText(View view, CharSequence charSequence) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d88f64c1", new Object[]{view, charSequence});
        } else if (Build.VERSION.SDK_INT >= 26) {
            Api26Impl.setTooltipText(view, charSequence);
        }
    }

    public static void setTransitionName(View view, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d46081b3", new Object[]{view, str});
        } else {
            Api21Impl.setTransitionName(view, str);
        }
    }

    @Deprecated
    public static void setTranslationX(View view, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9060aa7e", new Object[]{view, new Float(f)});
        } else {
            view.setTranslationX(f);
        }
    }

    @Deprecated
    public static void setTranslationY(View view, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1490f77f", new Object[]{view, new Float(f)});
        } else {
            view.setTranslationY(f);
        }
    }

    public static void setTranslationZ(View view, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("98c14480", new Object[]{view, new Float(f)});
        } else {
            Api21Impl.setTranslationZ(view, f);
        }
    }

    public static void setWindowInsetsAnimationCallback(View view, WindowInsetsAnimationCompat.Callback callback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea4e51ce", new Object[]{view, callback});
        } else {
            WindowInsetsAnimationCompat.setCallback(view, callback);
        }
    }

    @Deprecated
    public static void setX(View view, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e3d26b", new Object[]{view, new Float(f)});
        } else {
            view.setX(f);
        }
    }

    @Deprecated
    public static void setY(View view, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8b141f6c", new Object[]{view, new Float(f)});
        } else {
            view.setY(f);
        }
    }

    public static void setZ(View view, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f446c6d", new Object[]{view, new Float(f)});
        } else {
            Api21Impl.setZ(view, f);
        }
    }

    public static boolean startDragAndDrop(View view, ClipData clipData, View.DragShadowBuilder dragShadowBuilder, Object obj, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3219a036", new Object[]{view, clipData, dragShadowBuilder, obj, new Integer(i)})).booleanValue();
        }
        if (Build.VERSION.SDK_INT >= 24) {
            return Api24Impl.startDragAndDrop(view, clipData, dragShadowBuilder, obj, i);
        }
        return view.startDrag(clipData, dragShadowBuilder, obj, i);
    }

    public static boolean startNestedScroll(View view, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("379631a2", new Object[]{view, new Integer(i)})).booleanValue() : Api21Impl.startNestedScroll(view, i);
    }

    private static AccessibilityViewProperty<CharSequence> stateDescriptionProperty() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AccessibilityViewProperty) ipChange.ipc$dispatch("586046ed", new Object[0]);
        }
        return new AccessibilityViewProperty<CharSequence>(R.id.tag_state_description, CharSequence.class, 64, 30) { // from class: androidx.core.view.ViewCompat.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass3 r2, String str, Object... objArr) {
                str.hashCode();
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/core/view/ViewCompat$3");
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // androidx.core.view.ViewCompat.AccessibilityViewProperty
            public CharSequence frameworkGet(View view) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? (CharSequence) ipChange2.ipc$dispatch("7fe278e7", new Object[]{this, view}) : Api30Impl.getStateDescription(view);
            }

            public void frameworkSet(View view, CharSequence charSequence) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("33fc828b", new Object[]{this, view, charSequence});
                } else {
                    Api30Impl.setStateDescription(view, charSequence);
                }
            }

            public boolean shouldUpdate(CharSequence charSequence, CharSequence charSequence2) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ((Boolean) ipChange2.ipc$dispatch("f33e8a2f", new Object[]{this, charSequence, charSequence2})).booleanValue() : !TextUtils.equals(charSequence, charSequence2);
            }
        };
    }

    public static void stopNestedScroll(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1739a65", new Object[]{view});
        } else {
            Api21Impl.stopNestedScroll(view);
        }
    }

    private static void tickleInvalidationFlag(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("16dca10b", new Object[]{view});
            return;
        }
        float translationY = view.getTranslationY();
        view.setTranslationY(1.0f + translationY);
        view.setTranslationY(translationY);
    }

    public static void updateDragShadow(View view, View.DragShadowBuilder dragShadowBuilder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f0cedf41", new Object[]{view, dragShadowBuilder});
        } else if (Build.VERSION.SDK_INT >= 24) {
            Api24Impl.updateDragShadow(view, dragShadowBuilder);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class AccessibilityPaneVisibilityManager implements ViewTreeObserver.OnGlobalLayoutListener, View.OnAttachStateChangeListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private final WeakHashMap<View, Boolean> mPanesToVisible = new WeakHashMap<>();

        private void registerForLayoutCallback(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("95c92af6", new Object[]{this, view});
            } else {
                view.getViewTreeObserver().addOnGlobalLayoutListener(this);
            }
        }

        private void unregisterForLayoutCallback(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d572438f", new Object[]{this, view});
            } else {
                view.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            }
        }

        public void addAccessibilityPane(View view) {
            boolean z = true;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6b13616", new Object[]{this, view});
                return;
            }
            WeakHashMap<View, Boolean> weakHashMap = this.mPanesToVisible;
            if (!view.isShown() || view.getWindowVisibility() != 0) {
                z = false;
            }
            weakHashMap.put(view, Boolean.valueOf(z));
            view.addOnAttachStateChangeListener(this);
            if (view.isAttachedToWindow()) {
                registerForLayoutCallback(view);
            }
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("df7e7eb3", new Object[]{this});
            } else if (Build.VERSION.SDK_INT < 28) {
                for (Map.Entry<View, Boolean> entry : this.mPanesToVisible.entrySet()) {
                    checkPaneVisibility(entry);
                }
            }
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3d337638", new Object[]{this, view});
            } else {
                registerForLayoutCallback(view);
            }
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7f64d55b", new Object[]{this, view});
            }
        }

        public void removeAccessibilityPane(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3955d6f9", new Object[]{this, view});
                return;
            }
            this.mPanesToVisible.remove(view);
            view.removeOnAttachStateChangeListener(this);
            unregisterForLayoutCallback(view);
        }

        private void checkPaneVisibility(Map.Entry<View, Boolean> entry) {
            boolean z = true;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f89564ae", new Object[]{this, entry});
                return;
            }
            View key = entry.getKey();
            boolean booleanValue = entry.getValue().booleanValue();
            if (!key.isShown() || key.getWindowVisibility() != 0) {
                z = false;
            }
            if (booleanValue != z) {
                ViewCompat.notifyViewAccessibilityStateChangedIfNeeded(key, z ? 16 : 32);
                entry.setValue(Boolean.valueOf(z));
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class UnhandledKeyEventManager {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private static final ArrayList<WeakReference<View>> sViewsWithListeners = new ArrayList<>();
        private WeakHashMap<View, Boolean> mViewsContainingListeners = null;
        private SparseArray<WeakReference<View>> mCapturedKeys = null;
        private WeakReference<KeyEvent> mLastDispatchedPreViewKeyEvent = null;

        public static UnhandledKeyEventManager at(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (UnhandledKeyEventManager) ipChange.ipc$dispatch("4394a221", new Object[]{view});
            }
            int i = R.id.tag_unhandled_key_event_manager;
            UnhandledKeyEventManager unhandledKeyEventManager = (UnhandledKeyEventManager) view.getTag(i);
            if (unhandledKeyEventManager != null) {
                return unhandledKeyEventManager;
            }
            UnhandledKeyEventManager unhandledKeyEventManager2 = new UnhandledKeyEventManager();
            view.setTag(i, unhandledKeyEventManager2);
            return unhandledKeyEventManager2;
        }

        private View dispatchInOrder(View view, KeyEvent keyEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (View) ipChange.ipc$dispatch("48a950c2", new Object[]{this, view, keyEvent});
            }
            WeakHashMap<View, Boolean> weakHashMap = this.mViewsContainingListeners;
            if (weakHashMap != null && weakHashMap.containsKey(view)) {
                if (view instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view;
                    for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                        View dispatchInOrder = dispatchInOrder(viewGroup.getChildAt(childCount), keyEvent);
                        if (dispatchInOrder != null) {
                            return dispatchInOrder;
                        }
                    }
                }
                if (onUnhandledKeyEvent(view, keyEvent)) {
                    return view;
                }
            }
            return null;
        }

        private SparseArray<WeakReference<View>> getCapturedKeys() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (SparseArray) ipChange.ipc$dispatch("38aa506a", new Object[]{this});
            }
            if (this.mCapturedKeys == null) {
                this.mCapturedKeys = new SparseArray<>();
            }
            return this.mCapturedKeys;
        }

        private boolean onUnhandledKeyEvent(View view, KeyEvent keyEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("1a711434", new Object[]{this, view, keyEvent})).booleanValue();
            }
            ArrayList arrayList = (ArrayList) view.getTag(R.id.tag_unhandled_key_listeners);
            if (arrayList != null) {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    if (((OnUnhandledKeyEventListenerCompat) arrayList.get(size)).onUnhandledKeyEvent(view, keyEvent)) {
                        return true;
                    }
                }
            }
            return false;
        }

        private void recalcViewsWithUnhandled() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("909452be", new Object[]{this});
                return;
            }
            WeakHashMap<View, Boolean> weakHashMap = this.mViewsContainingListeners;
            if (weakHashMap != null) {
                weakHashMap.clear();
            }
            ArrayList<WeakReference<View>> arrayList = sViewsWithListeners;
            if (!arrayList.isEmpty()) {
                synchronized (arrayList) {
                    try {
                        if (this.mViewsContainingListeners == null) {
                            this.mViewsContainingListeners = new WeakHashMap<>();
                        }
                        for (int size = arrayList.size() - 1; size >= 0; size--) {
                            ArrayList<WeakReference<View>> arrayList2 = sViewsWithListeners;
                            View view = arrayList2.get(size).get();
                            if (view == null) {
                                arrayList2.remove(size);
                            } else {
                                this.mViewsContainingListeners.put(view, Boolean.TRUE);
                                for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
                                    this.mViewsContainingListeners.put((View) parent, Boolean.TRUE);
                                }
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }

        public static void registerListeningView(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7b4b942e", new Object[]{view});
                return;
            }
            ArrayList<WeakReference<View>> arrayList = sViewsWithListeners;
            synchronized (arrayList) {
                try {
                    Iterator<WeakReference<View>> it = arrayList.iterator();
                    while (it.hasNext()) {
                        if (it.next().get() == view) {
                            return;
                        }
                    }
                    sViewsWithListeners.add(new WeakReference<>(view));
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public static void unregisterListeningView(View view) {
            int i = 0;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b002e147", new Object[]{view});
                return;
            }
            synchronized (sViewsWithListeners) {
                while (true) {
                    try {
                        ArrayList<WeakReference<View>> arrayList = sViewsWithListeners;
                        if (i >= arrayList.size()) {
                            return;
                        }
                        if (arrayList.get(i).get() == view) {
                            arrayList.remove(i);
                            return;
                        }
                        i++;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }

        public boolean dispatch(View view, KeyEvent keyEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("f9149a6f", new Object[]{this, view, keyEvent})).booleanValue();
            }
            if (keyEvent.getAction() == 0) {
                recalcViewsWithUnhandled();
            }
            View dispatchInOrder = dispatchInOrder(view, keyEvent);
            if (keyEvent.getAction() == 0) {
                int keyCode = keyEvent.getKeyCode();
                if (dispatchInOrder != null && !KeyEvent.isModifierKey(keyCode)) {
                    getCapturedKeys().put(keyCode, new WeakReference<>(dispatchInOrder));
                }
            }
            return dispatchInOrder != null;
        }

        public boolean preDispatch(KeyEvent keyEvent) {
            WeakReference<View> weakReference;
            int indexOfKey;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("db0cc1fc", new Object[]{this, keyEvent})).booleanValue();
            }
            WeakReference<KeyEvent> weakReference2 = this.mLastDispatchedPreViewKeyEvent;
            if (weakReference2 != null && weakReference2.get() == keyEvent) {
                return false;
            }
            this.mLastDispatchedPreViewKeyEvent = new WeakReference<>(keyEvent);
            SparseArray<WeakReference<View>> capturedKeys = getCapturedKeys();
            if (keyEvent.getAction() != 1 || (indexOfKey = capturedKeys.indexOfKey(keyEvent.getKeyCode())) < 0) {
                weakReference = null;
            } else {
                weakReference = capturedKeys.valueAt(indexOfKey);
                capturedKeys.removeAt(indexOfKey);
            }
            if (weakReference == null) {
                weakReference = capturedKeys.get(keyEvent.getKeyCode());
            }
            if (weakReference == null) {
                return false;
            }
            View view = weakReference.get();
            if (view != null && view.isAttachedToWindow()) {
                onUnhandledKeyEvent(view, keyEvent);
            }
            return true;
        }
    }

    public static boolean dispatchNestedPreScroll(View view, int i, int i2, int[] iArr, int[] iArr2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6adf1c3f", new Object[]{view, new Integer(i), new Integer(i2), iArr, iArr2, new Integer(i3)})).booleanValue();
        }
        if (view instanceof NestedScrollingChild2) {
            return ((NestedScrollingChild2) view).dispatchNestedPreScroll(i, i2, iArr, iArr2, i3);
        }
        if (i3 == 0) {
            return dispatchNestedPreScroll(view, i, i2, iArr, iArr2);
        }
        return false;
    }

    public static void dispatchNestedScroll(View view, int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a54ba76", new Object[]{view, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), iArr, new Integer(i5), iArr2});
        } else if (view instanceof NestedScrollingChild3) {
            ((NestedScrollingChild3) view).dispatchNestedScroll(i, i2, i3, i4, iArr, i5, iArr2);
        } else {
            dispatchNestedScroll(view, i, i2, i3, i4, iArr, i5);
        }
    }

    public static int getImportantForAutofill(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d4bf216f", new Object[]{view})).intValue();
        }
        if (Build.VERSION.SDK_INT >= 26) {
            return Api26Impl.getImportantForAutofill(view);
        }
        return 0;
    }

    public static boolean hasNestedScrollingParent(View view, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("38523c0a", new Object[]{view, new Integer(i)})).booleanValue();
        }
        if (view instanceof NestedScrollingChild2) {
            ((NestedScrollingChild2) view).hasNestedScrollingParent(i);
        } else if (i == 0) {
            return hasNestedScrollingParent(view);
        }
        return false;
    }

    public static boolean isImportantForAutofill(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("dd3bc72c", new Object[]{view})).booleanValue();
        }
        if (Build.VERSION.SDK_INT >= 26) {
            return Api26Impl.isImportantForAutofill(view);
        }
        return true;
    }

    @Deprecated
    public static void postInvalidateOnAnimation(View view, int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2e658281", new Object[]{view, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
        } else {
            view.postInvalidateOnAnimation(i, i2, i3, i4);
        }
    }

    public static boolean startNestedScroll(View view, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bb307529", new Object[]{view, new Integer(i), new Integer(i2)})).booleanValue();
        }
        if (view instanceof NestedScrollingChild2) {
            return ((NestedScrollingChild2) view).startNestedScroll(i, i2);
        }
        if (i2 == 0) {
            return startNestedScroll(view, i);
        }
        return false;
    }

    public static void stopNestedScroll(View view, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d00253e", new Object[]{view, new Integer(i)});
        } else if (view instanceof NestedScrollingChild2) {
            ((NestedScrollingChild2) view).stopNestedScroll(i);
        } else if (i == 0) {
            stopNestedScroll(view);
        }
    }

    public static void offsetTopAndBottom(View view, int i) {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e21894b8", new Object[]{view, new Integer(i)});
        } else if (Build.VERSION.SDK_INT >= 23) {
            view.offsetTopAndBottom(i);
        } else {
            Rect emptyTempRect = getEmptyTempRect();
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                View view2 = (View) parent;
                emptyTempRect.set(view2.getLeft(), view2.getTop(), view2.getRight(), view2.getBottom());
                z = !emptyTempRect.intersects(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            }
            compatOffsetTopAndBottom(view, i);
            if (z && emptyTempRect.intersect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom())) {
                ((View) parent).invalidate(emptyTempRect);
            }
        }
    }

    public static boolean performHapticFeedback(View view, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7f2a832", new Object[]{view, new Integer(i), new Integer(i2)})).booleanValue();
        }
        int feedbackConstantOrFallback = HapticFeedbackConstantsCompat.getFeedbackConstantOrFallback(i);
        if (feedbackConstantOrFallback == -1) {
            return false;
        }
        return view.performHapticFeedback(feedbackConstantOrFallback, i2);
    }

    private static void removeActionWithId(int i, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe2013f1", new Object[]{new Integer(i), view});
            return;
        }
        List<AccessibilityNodeInfoCompat.AccessibilityActionCompat> actionList = getActionList(view);
        for (int i2 = 0; i2 < actionList.size(); i2++) {
            if (actionList.get(i2).getId() == i) {
                actionList.remove(i2);
                return;
            }
        }
    }

    @Deprecated
    public static void setChildrenDrawingOrderEnabled(ViewGroup viewGroup, boolean z) {
        if (sChildrenDrawingOrderMethod == null) {
            try {
                sChildrenDrawingOrderMethod = ViewGroup.class.getDeclaredMethod("setChildrenDrawingOrderEnabled", Boolean.TYPE);
            } catch (NoSuchMethodException e) {
                Log.e(TAG, "Unable to find childrenDrawingOrderEnabled", e);
            }
            sChildrenDrawingOrderMethod.setAccessible(true);
        }
        try {
            sChildrenDrawingOrderMethod.invoke(viewGroup, Boolean.valueOf(z));
        } catch (IllegalAccessException e2) {
            Log.e(TAG, "Unable to invoke childrenDrawingOrderEnabled", e2);
        } catch (IllegalArgumentException e3) {
            Log.e(TAG, "Unable to invoke childrenDrawingOrderEnabled", e3);
        } catch (InvocationTargetException e4) {
            Log.e(TAG, "Unable to invoke childrenDrawingOrderEnabled", e4);
        }
    }

    public static void setScrollIndicators(View view, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c96e6278", new Object[]{view, new Integer(i), new Integer(i2)});
        } else if (Build.VERSION.SDK_INT >= 23) {
            Api23Impl.setScrollIndicators(view, i, i2);
        }
    }

    private static void addAccessibilityAction(View view, AccessibilityNodeInfoCompat.AccessibilityActionCompat accessibilityActionCompat) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66ad6436", new Object[]{view, accessibilityActionCompat});
            return;
        }
        ensureAccessibilityDelegateCompat(view);
        removeActionWithId(accessibilityActionCompat.getId(), view);
        getActionList(view).add(accessibilityActionCompat);
        notifyViewAccessibilityStateChangedIfNeeded(view, 0);
    }

    public static boolean dispatchNestedScroll(View view, int i, int i2, int i3, int i4, int[] iArr, int i5) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8b21e56c", new Object[]{view, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), iArr, new Integer(i5)})).booleanValue();
        }
        if (view instanceof NestedScrollingChild2) {
            return ((NestedScrollingChild2) view).dispatchNestedScroll(i, i2, i3, i4, iArr, i5);
        }
        if (i5 == 0) {
            return dispatchNestedScroll(view, i, i2, i3, i4, iArr);
        }
        return false;
    }
}
