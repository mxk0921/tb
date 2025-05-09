package androidx.core.view;

import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.DisplayCutout;
import android.view.View;
import android.view.WindowInsets;
import androidx.core.graphics.Insets;
import androidx.core.util.ObjectsCompat;
import androidx.core.util.Preconditions;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Objects;
import tb.ngx;
import tb.ogx;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class WindowInsetsCompat {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final WindowInsetsCompat CONSUMED;
    private static final String TAG = "WindowInsetsCompat";
    private final Impl mImpl;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class Api21ReflectionHolder {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private static Field sContentInsets;
        private static boolean sReflectionSucceeded;
        private static Field sStableInsets;
        private static Field sViewAttachInfoField;

        static {
            try {
                Field declaredField = View.class.getDeclaredField("mAttachInfo");
                sViewAttachInfoField = declaredField;
                declaredField.setAccessible(true);
                Class<?> cls = Class.forName("android.view.View$AttachInfo");
                Field declaredField2 = cls.getDeclaredField("mStableInsets");
                sStableInsets = declaredField2;
                declaredField2.setAccessible(true);
                Field declaredField3 = cls.getDeclaredField("mContentInsets");
                sContentInsets = declaredField3;
                declaredField3.setAccessible(true);
                sReflectionSucceeded = true;
            } catch (ReflectiveOperationException e) {
                new StringBuilder("Failed to get visible insets from AttachInfo ").append(e.getMessage());
            }
        }

        private Api21ReflectionHolder() {
        }

        public static WindowInsetsCompat getRootWindowInsets(View view) {
            if (sReflectionSucceeded && view.isAttachedToWindow()) {
                try {
                    Object obj = sViewAttachInfoField.get(view.getRootView());
                    if (obj != null) {
                        Rect rect = (Rect) sStableInsets.get(obj);
                        Rect rect2 = (Rect) sContentInsets.get(obj);
                        if (!(rect == null || rect2 == null)) {
                            WindowInsetsCompat build = new Builder().setStableInsets(Insets.of(rect)).setSystemWindowInsets(Insets.of(rect2)).build();
                            build.setRootWindowInsets(build);
                            build.copyRootViewBounds(view.getRootView());
                            return build;
                        }
                    }
                } catch (IllegalAccessException e) {
                    new StringBuilder("Failed to get insets from AttachInfo. ").append(e.getMessage());
                }
            }
            return null;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class BuilderImpl {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private final WindowInsetsCompat mInsets;
        public Insets[] mInsetsTypeMask;

        public BuilderImpl() {
            this(new WindowInsetsCompat((WindowInsetsCompat) null));
        }

        public final void applyInsetTypes() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3a2c5ef1", new Object[]{this});
                return;
            }
            Insets[] insetsArr = this.mInsetsTypeMask;
            if (insetsArr != null) {
                Insets insets = insetsArr[Type.indexOf(1)];
                Insets insets2 = this.mInsetsTypeMask[Type.indexOf(2)];
                if (insets2 == null) {
                    insets2 = this.mInsets.getInsets(2);
                }
                if (insets == null) {
                    insets = this.mInsets.getInsets(1);
                }
                setSystemWindowInsets(Insets.max(insets, insets2));
                Insets insets3 = this.mInsetsTypeMask[Type.indexOf(16)];
                if (insets3 != null) {
                    setSystemGestureInsets(insets3);
                }
                Insets insets4 = this.mInsetsTypeMask[Type.indexOf(32)];
                if (insets4 != null) {
                    setMandatorySystemGestureInsets(insets4);
                }
                Insets insets5 = this.mInsetsTypeMask[Type.indexOf(64)];
                if (insets5 != null) {
                    setTappableElementInsets(insets5);
                }
            }
        }

        public WindowInsetsCompat build() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (WindowInsetsCompat) ipChange.ipc$dispatch("e3bcf0fe", new Object[]{this});
            }
            applyInsetTypes();
            return this.mInsets;
        }

        public void setDisplayCutout(DisplayCutoutCompat displayCutoutCompat) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f3349c92", new Object[]{this, displayCutoutCompat});
            }
        }

        public void setInsets(int i, Insets insets) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4240140d", new Object[]{this, new Integer(i), insets});
                return;
            }
            if (this.mInsetsTypeMask == null) {
                this.mInsetsTypeMask = new Insets[9];
            }
            for (int i2 = 1; i2 <= 256; i2 <<= 1) {
                if ((i & i2) != 0) {
                    this.mInsetsTypeMask[Type.indexOf(i2)] = insets;
                }
            }
        }

        public void setInsetsIgnoringVisibility(int i, Insets insets) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d6316c2e", new Object[]{this, new Integer(i), insets});
            } else if (i == 8) {
                throw new IllegalArgumentException("Ignoring visibility inset not available for IME");
            }
        }

        public void setMandatorySystemGestureInsets(Insets insets) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9e3d6a51", new Object[]{this, insets});
            }
        }

        public void setStableInsets(Insets insets) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a4737b17", new Object[]{this, insets});
            }
        }

        public void setSystemGestureInsets(Insets insets) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9c20e4dc", new Object[]{this, insets});
            }
        }

        public void setSystemWindowInsets(Insets insets) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ef461153", new Object[]{this, insets});
            }
        }

        public void setTappableElementInsets(Insets insets) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6a6199e1", new Object[]{this, insets});
            }
        }

        public void setVisible(int i, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("422f94a8", new Object[]{this, new Integer(i), new Boolean(z)});
            }
        }

        public BuilderImpl(WindowInsetsCompat windowInsetsCompat) {
            this.mInsets = windowInsetsCompat;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class BuilderImpl30 extends BuilderImpl29 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public BuilderImpl30() {
        }

        public static /* synthetic */ Object ipc$super(BuilderImpl30 builderImpl30, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/core/view/WindowInsetsCompat$BuilderImpl30");
        }

        @Override // androidx.core.view.WindowInsetsCompat.BuilderImpl
        public void setInsets(int i, Insets insets) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4240140d", new Object[]{this, new Integer(i), insets});
            } else {
                this.mPlatBuilder.setInsets(TypeImpl30.toPlatformType(i), insets.toPlatformInsets());
            }
        }

        @Override // androidx.core.view.WindowInsetsCompat.BuilderImpl
        public void setInsetsIgnoringVisibility(int i, Insets insets) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d6316c2e", new Object[]{this, new Integer(i), insets});
            } else {
                this.mPlatBuilder.setInsetsIgnoringVisibility(TypeImpl30.toPlatformType(i), insets.toPlatformInsets());
            }
        }

        @Override // androidx.core.view.WindowInsetsCompat.BuilderImpl
        public void setVisible(int i, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("422f94a8", new Object[]{this, new Integer(i), new Boolean(z)});
            } else {
                this.mPlatBuilder.setVisible(TypeImpl30.toPlatformType(i), z);
            }
        }

        public BuilderImpl30(WindowInsetsCompat windowInsetsCompat) {
            super(windowInsetsCompat);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class Impl {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public static final WindowInsetsCompat CONSUMED = new Builder().build().consumeDisplayCutout().consumeStableInsets().consumeSystemWindowInsets();
        public final WindowInsetsCompat mHost;

        public Impl(WindowInsetsCompat windowInsetsCompat) {
            this.mHost = windowInsetsCompat;
        }

        public WindowInsetsCompat consumeDisplayCutout() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (WindowInsetsCompat) ipChange.ipc$dispatch("ff9f2422", new Object[]{this});
            }
            return this.mHost;
        }

        public WindowInsetsCompat consumeStableInsets() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (WindowInsetsCompat) ipChange.ipc$dispatch("308863fd", new Object[]{this});
            }
            return this.mHost;
        }

        public WindowInsetsCompat consumeSystemWindowInsets() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (WindowInsetsCompat) ipChange.ipc$dispatch("725396c1", new Object[]{this});
            }
            return this.mHost;
        }

        public void copyRootViewBounds(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c6f31aba", new Object[]{this, view});
            }
        }

        public void copyWindowDataInto(WindowInsetsCompat windowInsetsCompat) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8aa8f643", new Object[]{this, windowInsetsCompat});
            }
        }

        public boolean equals(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
            }
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Impl)) {
                return false;
            }
            Impl impl = (Impl) obj;
            if (isRound() != impl.isRound() || isConsumed() != impl.isConsumed() || !ObjectsCompat.equals(getSystemWindowInsets(), impl.getSystemWindowInsets()) || !ObjectsCompat.equals(getStableInsets(), impl.getStableInsets()) || !ObjectsCompat.equals(getDisplayCutout(), impl.getDisplayCutout())) {
                return false;
            }
            return true;
        }

        public DisplayCutoutCompat getDisplayCutout() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (DisplayCutoutCompat) ipChange.ipc$dispatch("e046d216", new Object[]{this});
            }
            return null;
        }

        public Insets getInsets(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Insets) ipChange.ipc$dispatch("300d3191", new Object[]{this, new Integer(i)});
            }
            return Insets.NONE;
        }

        public Insets getInsetsIgnoringVisibility(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Insets) ipChange.ipc$dispatch("d8978650", new Object[]{this, new Integer(i)});
            }
            if ((i & 8) == 0) {
                return Insets.NONE;
            }
            throw new IllegalArgumentException("Unable to query the maximum insets for IME");
        }

        public Insets getMandatorySystemGestureInsets() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Insets) ipChange.ipc$dispatch("45c55335", new Object[]{this});
            }
            return getSystemWindowInsets();
        }

        public Insets getStableInsets() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Insets) ipChange.ipc$dispatch("2a4d79af", new Object[]{this});
            }
            return Insets.NONE;
        }

        public Insets getSystemGestureInsets() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Insets) ipChange.ipc$dispatch("580098e2", new Object[]{this});
            }
            return getSystemWindowInsets();
        }

        public Insets getSystemWindowInsets() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Insets) ipChange.ipc$dispatch("1e7064f3", new Object[]{this});
            }
            return Insets.NONE;
        }

        public Insets getTappableElementInsets() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Insets) ipChange.ipc$dispatch("3d717c3d", new Object[]{this});
            }
            return getSystemWindowInsets();
        }

        public int hashCode() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
            }
            return ObjectsCompat.hash(Boolean.valueOf(isRound()), Boolean.valueOf(isConsumed()), getSystemWindowInsets(), getStableInsets(), getDisplayCutout());
        }

        public WindowInsetsCompat inset(int i, int i2, int i3, int i4) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (WindowInsetsCompat) ipChange.ipc$dispatch("aa29a7ad", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            }
            return CONSUMED;
        }

        public boolean isConsumed() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("9fa8c6bd", new Object[]{this})).booleanValue();
            }
            return false;
        }

        public boolean isRound() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("45de010f", new Object[]{this})).booleanValue();
            }
            return false;
        }

        public boolean isVisible(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("c1a6f878", new Object[]{this, new Integer(i)})).booleanValue();
            }
            return true;
        }

        public void setOverriddenInsets(Insets[] insetsArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c511208f", new Object[]{this, insetsArr});
            }
        }

        public void setRootViewData(Insets insets) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fbab4a37", new Object[]{this, insets});
            }
        }

        public void setRootWindowInsets(WindowInsetsCompat windowInsetsCompat) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("96a811e8", new Object[]{this, windowInsetsCompat});
            }
        }

        public void setStableInsets(Insets insets) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a4737b17", new Object[]{this, insets});
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class Impl20 extends Impl {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private static Class<?> sAttachInfoClass;
        private static Field sAttachInfoField;
        private static Method sGetViewRootImplMethod;
        private static Field sVisibleInsetsField;
        private static boolean sVisibleRectReflectionFetched;
        private Insets[] mOverriddenInsets;
        public final WindowInsets mPlatformInsets;
        public Insets mRootViewVisibleInsets;
        private WindowInsetsCompat mRootWindowInsets;
        private Insets mSystemWindowInsets;

        public Impl20(WindowInsetsCompat windowInsetsCompat, WindowInsets windowInsets) {
            super(windowInsetsCompat);
            this.mSystemWindowInsets = null;
            this.mPlatformInsets = windowInsets;
        }

        private Insets getRootStableInsets() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Insets) ipChange.ipc$dispatch("54f7a031", new Object[]{this});
            }
            WindowInsetsCompat windowInsetsCompat = this.mRootWindowInsets;
            if (windowInsetsCompat != null) {
                return windowInsetsCompat.getStableInsets();
            }
            return Insets.NONE;
        }

        private Insets getVisibleInsets(View view) {
            if (Build.VERSION.SDK_INT < 30) {
                if (!sVisibleRectReflectionFetched) {
                    loadReflectionField();
                }
                Method method = sGetViewRootImplMethod;
                if (!(method == null || sAttachInfoClass == null || sVisibleInsetsField == null)) {
                    try {
                        Object invoke = method.invoke(view, new Object[0]);
                        if (invoke == null) {
                            return null;
                        }
                        Rect rect = (Rect) sVisibleInsetsField.get(sAttachInfoField.get(invoke));
                        if (rect != null) {
                            return Insets.of(rect);
                        }
                        return null;
                    } catch (ReflectiveOperationException e) {
                        Log.e(WindowInsetsCompat.TAG, "Failed to get visible insets. (Reflection error). " + e.getMessage(), e);
                    }
                }
                return null;
            }
            throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
        }

        public static /* synthetic */ Object ipc$super(Impl20 impl20, String str, Object... objArr) {
            if (str.hashCode() == 1814730534) {
                return new Boolean(super.equals(objArr[0]));
            }
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/core/view/WindowInsetsCompat$Impl20");
        }

        private static void loadReflectionField() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ee81e9d0", new Object[0]);
                return;
            }
            try {
                sGetViewRootImplMethod = View.class.getDeclaredMethod("getViewRootImpl", new Class[0]);
                Class<?> cls = Class.forName("android.view.View$AttachInfo");
                sAttachInfoClass = cls;
                sVisibleInsetsField = cls.getDeclaredField("mVisibleInsets");
                sAttachInfoField = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
                sVisibleInsetsField.setAccessible(true);
                sAttachInfoField.setAccessible(true);
            } catch (ReflectiveOperationException e) {
                Log.e(WindowInsetsCompat.TAG, "Failed to get visible insets. (Reflection error). " + e.getMessage(), e);
            }
            sVisibleRectReflectionFetched = true;
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        public void copyRootViewBounds(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c6f31aba", new Object[]{this, view});
                return;
            }
            Insets visibleInsets = getVisibleInsets(view);
            if (visibleInsets == null) {
                visibleInsets = Insets.NONE;
            }
            setRootViewData(visibleInsets);
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        public void copyWindowDataInto(WindowInsetsCompat windowInsetsCompat) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8aa8f643", new Object[]{this, windowInsetsCompat});
                return;
            }
            windowInsetsCompat.setRootWindowInsets(this.mRootWindowInsets);
            windowInsetsCompat.setRootViewData(this.mRootViewVisibleInsets);
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        public boolean equals(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
            }
            if (!super.equals(obj)) {
                return false;
            }
            return Objects.equals(this.mRootViewVisibleInsets, ((Impl20) obj).mRootViewVisibleInsets);
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        public Insets getInsets(int i) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Insets) ipChange.ipc$dispatch("300d3191", new Object[]{this, new Integer(i)}) : getInsets(i, false);
        }

        public Insets getInsetsForType(int i, boolean z) {
            int i2;
            DisplayCutoutCompat displayCutoutCompat;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Insets) ipChange.ipc$dispatch("a2fb1a30", new Object[]{this, new Integer(i), new Boolean(z)});
            }
            if (i != 1) {
                Insets insets = null;
                if (i != 2) {
                    if (i == 8) {
                        Insets[] insetsArr = this.mOverriddenInsets;
                        if (insetsArr != null) {
                            insets = insetsArr[Type.indexOf(8)];
                        }
                        if (insets != null) {
                            return insets;
                        }
                        Insets systemWindowInsets = getSystemWindowInsets();
                        Insets rootStableInsets = getRootStableInsets();
                        int i3 = systemWindowInsets.bottom;
                        if (i3 > rootStableInsets.bottom) {
                            return Insets.of(0, 0, 0, i3);
                        }
                        Insets insets2 = this.mRootViewVisibleInsets;
                        if (insets2 == null || insets2.equals(Insets.NONE) || (i2 = this.mRootViewVisibleInsets.bottom) <= rootStableInsets.bottom) {
                            return Insets.NONE;
                        }
                        return Insets.of(0, 0, 0, i2);
                    } else if (i == 16) {
                        return getSystemGestureInsets();
                    } else {
                        if (i == 32) {
                            return getMandatorySystemGestureInsets();
                        }
                        if (i == 64) {
                            return getTappableElementInsets();
                        }
                        if (i != 128) {
                            return Insets.NONE;
                        }
                        WindowInsetsCompat windowInsetsCompat = this.mRootWindowInsets;
                        if (windowInsetsCompat != null) {
                            displayCutoutCompat = windowInsetsCompat.getDisplayCutout();
                        } else {
                            displayCutoutCompat = getDisplayCutout();
                        }
                        if (displayCutoutCompat != null) {
                            return Insets.of(displayCutoutCompat.getSafeInsetLeft(), displayCutoutCompat.getSafeInsetTop(), displayCutoutCompat.getSafeInsetRight(), displayCutoutCompat.getSafeInsetBottom());
                        }
                        return Insets.NONE;
                    }
                } else if (z) {
                    Insets rootStableInsets2 = getRootStableInsets();
                    Insets stableInsets = getStableInsets();
                    return Insets.of(Math.max(rootStableInsets2.left, stableInsets.left), 0, Math.max(rootStableInsets2.right, stableInsets.right), Math.max(rootStableInsets2.bottom, stableInsets.bottom));
                } else {
                    Insets systemWindowInsets2 = getSystemWindowInsets();
                    WindowInsetsCompat windowInsetsCompat2 = this.mRootWindowInsets;
                    if (windowInsetsCompat2 != null) {
                        insets = windowInsetsCompat2.getStableInsets();
                    }
                    int i4 = systemWindowInsets2.bottom;
                    if (insets != null) {
                        i4 = Math.min(i4, insets.bottom);
                    }
                    return Insets.of(systemWindowInsets2.left, 0, systemWindowInsets2.right, i4);
                }
            } else if (z) {
                return Insets.of(0, Math.max(getRootStableInsets().top, getSystemWindowInsets().top), 0, 0);
            } else {
                return Insets.of(0, getSystemWindowInsets().top, 0, 0);
            }
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        public final Insets getSystemWindowInsets() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Insets) ipChange.ipc$dispatch("1e7064f3", new Object[]{this});
            }
            if (this.mSystemWindowInsets == null) {
                this.mSystemWindowInsets = Insets.of(this.mPlatformInsets.getSystemWindowInsetLeft(), this.mPlatformInsets.getSystemWindowInsetTop(), this.mPlatformInsets.getSystemWindowInsetRight(), this.mPlatformInsets.getSystemWindowInsetBottom());
            }
            return this.mSystemWindowInsets;
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        public WindowInsetsCompat inset(int i, int i2, int i3, int i4) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (WindowInsetsCompat) ipChange.ipc$dispatch("aa29a7ad", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            }
            Builder builder = new Builder(WindowInsetsCompat.toWindowInsetsCompat(this.mPlatformInsets));
            builder.setSystemWindowInsets(WindowInsetsCompat.insetInsets(getSystemWindowInsets(), i, i2, i3, i4));
            builder.setStableInsets(WindowInsetsCompat.insetInsets(getStableInsets(), i, i2, i3, i4));
            return builder.build();
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        public boolean isRound() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("45de010f", new Object[]{this})).booleanValue();
            }
            return this.mPlatformInsets.isRound();
        }

        public boolean isTypeVisible(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("3c439fd2", new Object[]{this, new Integer(i)})).booleanValue();
            }
            if (!(i == 1 || i == 2)) {
                if (i == 4) {
                    return false;
                }
                if (!(i == 8 || i == 128)) {
                    return true;
                }
            }
            return !getInsetsForType(i, false).equals(Insets.NONE);
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        public boolean isVisible(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("c1a6f878", new Object[]{this, new Integer(i)})).booleanValue();
            }
            for (int i2 = 1; i2 <= 256; i2 <<= 1) {
                if ((i & i2) != 0 && !isTypeVisible(i2)) {
                    return false;
                }
            }
            return true;
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        public void setOverriddenInsets(Insets[] insetsArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c511208f", new Object[]{this, insetsArr});
            } else {
                this.mOverriddenInsets = insetsArr;
            }
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        public void setRootViewData(Insets insets) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fbab4a37", new Object[]{this, insets});
            } else {
                this.mRootViewVisibleInsets = insets;
            }
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        public void setRootWindowInsets(WindowInsetsCompat windowInsetsCompat) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("96a811e8", new Object[]{this, windowInsetsCompat});
            } else {
                this.mRootWindowInsets = windowInsetsCompat;
            }
        }

        private Insets getInsets(int i, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Insets) ipChange.ipc$dispatch("38e30585", new Object[]{this, new Integer(i), new Boolean(z)});
            }
            Insets insets = Insets.NONE;
            for (int i2 = 1; i2 <= 256; i2 <<= 1) {
                if ((i & i2) != 0) {
                    insets = Insets.max(insets, getInsetsForType(i2, z));
                }
            }
            return insets;
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        public Insets getInsetsIgnoringVisibility(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Insets) ipChange.ipc$dispatch("d8978650", new Object[]{this, new Integer(i)});
            }
            return getInsets(i, true);
        }

        public Impl20(WindowInsetsCompat windowInsetsCompat, Impl20 impl20) {
            this(windowInsetsCompat, new WindowInsets(impl20.mPlatformInsets));
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class Impl28 extends Impl21 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public Impl28(WindowInsetsCompat windowInsetsCompat, WindowInsets windowInsets) {
            super(windowInsetsCompat, windowInsets);
        }

        public static /* synthetic */ Object ipc$super(Impl28 impl28, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/core/view/WindowInsetsCompat$Impl28");
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        public WindowInsetsCompat consumeDisplayCutout() {
            WindowInsets consumeDisplayCutout;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (WindowInsetsCompat) ipChange.ipc$dispatch("ff9f2422", new Object[]{this});
            }
            consumeDisplayCutout = this.mPlatformInsets.consumeDisplayCutout();
            return WindowInsetsCompat.toWindowInsetsCompat(consumeDisplayCutout);
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl20, androidx.core.view.WindowInsetsCompat.Impl
        public boolean equals(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
            }
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Impl28)) {
                return false;
            }
            Impl28 impl28 = (Impl28) obj;
            if (!Objects.equals(this.mPlatformInsets, impl28.mPlatformInsets) || !Objects.equals(this.mRootViewVisibleInsets, impl28.mRootViewVisibleInsets)) {
                return false;
            }
            return true;
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        public DisplayCutoutCompat getDisplayCutout() {
            DisplayCutout displayCutout;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (DisplayCutoutCompat) ipChange.ipc$dispatch("e046d216", new Object[]{this});
            }
            displayCutout = this.mPlatformInsets.getDisplayCutout();
            return DisplayCutoutCompat.wrap(displayCutout);
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        public int hashCode() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
            }
            return this.mPlatformInsets.hashCode();
        }

        public Impl28(WindowInsetsCompat windowInsetsCompat, Impl28 impl28) {
            super(windowInsetsCompat, impl28);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class Impl30 extends Impl29 {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public static final WindowInsetsCompat CONSUMED;

        static {
            WindowInsets windowInsets;
            windowInsets = WindowInsets.CONSUMED;
            CONSUMED = WindowInsetsCompat.toWindowInsetsCompat(windowInsets);
        }

        public Impl30(WindowInsetsCompat windowInsetsCompat, WindowInsets windowInsets) {
            super(windowInsetsCompat, windowInsets);
        }

        public static /* synthetic */ Object ipc$super(Impl30 impl30, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/core/view/WindowInsetsCompat$Impl30");
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl20, androidx.core.view.WindowInsetsCompat.Impl
        public final void copyRootViewBounds(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c6f31aba", new Object[]{this, view});
            }
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl20, androidx.core.view.WindowInsetsCompat.Impl
        public Insets getInsets(int i) {
            android.graphics.Insets insets;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Insets) ipChange.ipc$dispatch("300d3191", new Object[]{this, new Integer(i)});
            }
            insets = this.mPlatformInsets.getInsets(TypeImpl30.toPlatformType(i));
            return Insets.toCompatInsets(insets);
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl20, androidx.core.view.WindowInsetsCompat.Impl
        public Insets getInsetsIgnoringVisibility(int i) {
            android.graphics.Insets insetsIgnoringVisibility;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Insets) ipChange.ipc$dispatch("d8978650", new Object[]{this, new Integer(i)});
            }
            insetsIgnoringVisibility = this.mPlatformInsets.getInsetsIgnoringVisibility(TypeImpl30.toPlatformType(i));
            return Insets.toCompatInsets(insetsIgnoringVisibility);
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl20, androidx.core.view.WindowInsetsCompat.Impl
        public boolean isVisible(int i) {
            boolean isVisible;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("c1a6f878", new Object[]{this, new Integer(i)})).booleanValue();
            }
            isVisible = this.mPlatformInsets.isVisible(TypeImpl30.toPlatformType(i));
            return isVisible;
        }

        public Impl30(WindowInsetsCompat windowInsetsCompat, Impl30 impl30) {
            super(windowInsetsCompat, impl30);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static final class TypeImpl30 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        private TypeImpl30() {
        }

        public static int toPlatformType(int i) {
            int statusBars;
            int i2 = 0;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("72a083e7", new Object[]{new Integer(i)})).intValue();
            }
            for (int i3 = 1; i3 <= 256; i3 <<= 1) {
                if ((i & i3) != 0) {
                    if (i3 == 1) {
                        statusBars = WindowInsets.Type.statusBars();
                    } else if (i3 == 2) {
                        statusBars = WindowInsets.Type.navigationBars();
                    } else if (i3 == 4) {
                        statusBars = WindowInsets.Type.captionBar();
                    } else if (i3 == 8) {
                        statusBars = WindowInsets.Type.ime();
                    } else if (i3 == 16) {
                        statusBars = WindowInsets.Type.systemGestures();
                    } else if (i3 == 32) {
                        statusBars = WindowInsets.Type.mandatorySystemGestures();
                    } else if (i3 == 64) {
                        statusBars = WindowInsets.Type.tappableElement();
                    } else if (i3 == 128) {
                        statusBars = WindowInsets.Type.displayCutout();
                    }
                    i2 |= statusBars;
                }
            }
            return i2;
        }
    }

    static {
        if (Build.VERSION.SDK_INT >= 30) {
            CONSUMED = Impl30.CONSUMED;
        } else {
            CONSUMED = Impl.CONSUMED;
        }
    }

    private WindowInsetsCompat(WindowInsets windowInsets) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            this.mImpl = new Impl30(this, windowInsets);
        } else if (i >= 29) {
            this.mImpl = new Impl29(this, windowInsets);
        } else if (i >= 28) {
            this.mImpl = new Impl28(this, windowInsets);
        } else {
            this.mImpl = new Impl21(this, windowInsets);
        }
    }

    public static Insets insetInsets(Insets insets, int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Insets) ipChange.ipc$dispatch("75b3cbd8", new Object[]{insets, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
        }
        int max = Math.max(0, insets.left - i);
        int max2 = Math.max(0, insets.top - i2);
        int max3 = Math.max(0, insets.right - i3);
        int max4 = Math.max(0, insets.bottom - i4);
        if (max == i && max2 == i2 && max3 == i3 && max4 == i4) {
            return insets;
        }
        return Insets.of(max, max2, max3, max4);
    }

    public static WindowInsetsCompat toWindowInsetsCompat(WindowInsets windowInsets) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (WindowInsetsCompat) ipChange.ipc$dispatch("2fb3c810", new Object[]{windowInsets}) : toWindowInsetsCompat(windowInsets, null);
    }

    @Deprecated
    public WindowInsetsCompat consumeDisplayCutout() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WindowInsetsCompat) ipChange.ipc$dispatch("ff9f2422", new Object[]{this});
        }
        return this.mImpl.consumeDisplayCutout();
    }

    @Deprecated
    public WindowInsetsCompat consumeStableInsets() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WindowInsetsCompat) ipChange.ipc$dispatch("308863fd", new Object[]{this});
        }
        return this.mImpl.consumeStableInsets();
    }

    @Deprecated
    public WindowInsetsCompat consumeSystemWindowInsets() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WindowInsetsCompat) ipChange.ipc$dispatch("725396c1", new Object[]{this});
        }
        return this.mImpl.consumeSystemWindowInsets();
    }

    public void copyRootViewBounds(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c6f31aba", new Object[]{this, view});
        } else {
            this.mImpl.copyRootViewBounds(view);
        }
    }

    public boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WindowInsetsCompat)) {
            return false;
        }
        return ObjectsCompat.equals(this.mImpl, ((WindowInsetsCompat) obj).mImpl);
    }

    public DisplayCutoutCompat getDisplayCutout() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DisplayCutoutCompat) ipChange.ipc$dispatch("e046d216", new Object[]{this});
        }
        return this.mImpl.getDisplayCutout();
    }

    public Insets getInsets(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Insets) ipChange.ipc$dispatch("300d3191", new Object[]{this, new Integer(i)});
        }
        return this.mImpl.getInsets(i);
    }

    public Insets getInsetsIgnoringVisibility(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Insets) ipChange.ipc$dispatch("d8978650", new Object[]{this, new Integer(i)});
        }
        return this.mImpl.getInsetsIgnoringVisibility(i);
    }

    @Deprecated
    public Insets getMandatorySystemGestureInsets() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Insets) ipChange.ipc$dispatch("45c55335", new Object[]{this});
        }
        return this.mImpl.getMandatorySystemGestureInsets();
    }

    @Deprecated
    public int getStableInsetBottom() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("423c0fb1", new Object[]{this})).intValue();
        }
        return this.mImpl.getStableInsets().bottom;
    }

    @Deprecated
    public int getStableInsetLeft() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ebb8fa8d", new Object[]{this})).intValue();
        }
        return this.mImpl.getStableInsets().left;
    }

    @Deprecated
    public int getStableInsetRight() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c8ced88a", new Object[]{this})).intValue();
        }
        return this.mImpl.getStableInsets().right;
    }

    @Deprecated
    public int getStableInsetTop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c88c0043", new Object[]{this})).intValue();
        }
        return this.mImpl.getStableInsets().top;
    }

    @Deprecated
    public Insets getStableInsets() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Insets) ipChange.ipc$dispatch("2a4d79af", new Object[]{this});
        }
        return this.mImpl.getStableInsets();
    }

    @Deprecated
    public Insets getSystemGestureInsets() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Insets) ipChange.ipc$dispatch("580098e2", new Object[]{this});
        }
        return this.mImpl.getSystemGestureInsets();
    }

    @Deprecated
    public int getSystemWindowInsetBottom() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ef8a9fed", new Object[]{this})).intValue();
        }
        return this.mImpl.getSystemWindowInsets().bottom;
    }

    @Deprecated
    public int getSystemWindowInsetLeft() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9ea669c9", new Object[]{this})).intValue();
        }
        return this.mImpl.getSystemWindowInsets().left;
    }

    @Deprecated
    public int getSystemWindowInsetRight() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("738f50ce", new Object[]{this})).intValue();
        }
        return this.mImpl.getSystemWindowInsets().right;
    }

    @Deprecated
    public int getSystemWindowInsetTop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ded5b987", new Object[]{this})).intValue();
        }
        return this.mImpl.getSystemWindowInsets().top;
    }

    @Deprecated
    public Insets getSystemWindowInsets() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Insets) ipChange.ipc$dispatch("1e7064f3", new Object[]{this});
        }
        return this.mImpl.getSystemWindowInsets();
    }

    @Deprecated
    public Insets getTappableElementInsets() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Insets) ipChange.ipc$dispatch("3d717c3d", new Object[]{this});
        }
        return this.mImpl.getTappableElementInsets();
    }

    public boolean hasInsets() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("65f852bb", new Object[]{this})).booleanValue();
        }
        Insets insets = getInsets(Type.all());
        Insets insets2 = Insets.NONE;
        if (!insets.equals(insets2) || !getInsetsIgnoringVisibility(Type.all() ^ Type.ime()).equals(insets2) || getDisplayCutout() != null) {
            return true;
        }
        return false;
    }

    @Deprecated
    public boolean hasStableInsets() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b29418d6", new Object[]{this})).booleanValue();
        }
        return true ^ this.mImpl.getStableInsets().equals(Insets.NONE);
    }

    @Deprecated
    public boolean hasSystemWindowInsets() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3702d01a", new Object[]{this})).booleanValue();
        }
        return true ^ this.mImpl.getSystemWindowInsets().equals(Insets.NONE);
    }

    public int hashCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
        }
        Impl impl = this.mImpl;
        if (impl == null) {
            return 0;
        }
        return impl.hashCode();
    }

    public WindowInsetsCompat inset(Insets insets) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (WindowInsetsCompat) ipChange.ipc$dispatch("58efd856", new Object[]{this, insets}) : inset(insets.left, insets.top, insets.right, insets.bottom);
    }

    public boolean isConsumed() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9fa8c6bd", new Object[]{this})).booleanValue();
        }
        return this.mImpl.isConsumed();
    }

    public boolean isRound() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("45de010f", new Object[]{this})).booleanValue();
        }
        return this.mImpl.isRound();
    }

    public boolean isVisible(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c1a6f878", new Object[]{this, new Integer(i)})).booleanValue();
        }
        return this.mImpl.isVisible(i);
    }

    @Deprecated
    public WindowInsetsCompat replaceSystemWindowInsets(int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (WindowInsetsCompat) ipChange.ipc$dispatch("83736a39", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)}) : new Builder(this).setSystemWindowInsets(Insets.of(i, i2, i3, i4)).build();
    }

    public void setOverriddenInsets(Insets[] insetsArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c511208f", new Object[]{this, insetsArr});
        } else {
            this.mImpl.setOverriddenInsets(insetsArr);
        }
    }

    public void setRootViewData(Insets insets) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fbab4a37", new Object[]{this, insets});
        } else {
            this.mImpl.setRootViewData(insets);
        }
    }

    public void setRootWindowInsets(WindowInsetsCompat windowInsetsCompat) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("96a811e8", new Object[]{this, windowInsetsCompat});
        } else {
            this.mImpl.setRootWindowInsets(windowInsetsCompat);
        }
    }

    public void setStableInsets(Insets insets) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4737b17", new Object[]{this, insets});
        } else {
            this.mImpl.setStableInsets(insets);
        }
    }

    public WindowInsets toWindowInsets() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WindowInsets) ipChange.ipc$dispatch("96737f29", new Object[]{this});
        }
        Impl impl = this.mImpl;
        if (impl instanceof Impl20) {
            return ((Impl20) impl).mPlatformInsets;
        }
        return null;
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class BuilderImpl20 extends BuilderImpl {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private static Constructor<WindowInsets> sConstructor;
        private static boolean sConstructorFetched;
        private static Field sConsumedField;
        private static boolean sConsumedFieldFetched;
        private WindowInsets mPlatformInsets;
        private Insets mStableInsets;

        public BuilderImpl20() {
            this.mPlatformInsets = createWindowInsetsInstance();
        }

        private static WindowInsets createWindowInsetsInstance() {
            if (!sConsumedFieldFetched) {
                try {
                    sConsumedField = WindowInsets.class.getDeclaredField("CONSUMED");
                } catch (ReflectiveOperationException unused) {
                }
                sConsumedFieldFetched = true;
            }
            Field field = sConsumedField;
            if (field != null) {
                try {
                    WindowInsets windowInsets = (WindowInsets) field.get(null);
                    if (windowInsets != null) {
                        return new WindowInsets(windowInsets);
                    }
                } catch (ReflectiveOperationException unused2) {
                }
            }
            if (!sConstructorFetched) {
                try {
                    sConstructor = WindowInsets.class.getConstructor(Rect.class);
                } catch (ReflectiveOperationException unused3) {
                }
                sConstructorFetched = true;
            }
            Constructor<WindowInsets> constructor = sConstructor;
            if (constructor != null) {
                try {
                    return constructor.newInstance(new Rect());
                } catch (ReflectiveOperationException unused4) {
                }
            }
            return null;
        }

        public static /* synthetic */ Object ipc$super(BuilderImpl20 builderImpl20, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/core/view/WindowInsetsCompat$BuilderImpl20");
        }

        @Override // androidx.core.view.WindowInsetsCompat.BuilderImpl
        public WindowInsetsCompat build() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (WindowInsetsCompat) ipChange.ipc$dispatch("e3bcf0fe", new Object[]{this});
            }
            applyInsetTypes();
            WindowInsetsCompat windowInsetsCompat = WindowInsetsCompat.toWindowInsetsCompat(this.mPlatformInsets);
            windowInsetsCompat.setOverriddenInsets(this.mInsetsTypeMask);
            windowInsetsCompat.setStableInsets(this.mStableInsets);
            return windowInsetsCompat;
        }

        @Override // androidx.core.view.WindowInsetsCompat.BuilderImpl
        public void setStableInsets(Insets insets) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a4737b17", new Object[]{this, insets});
            } else {
                this.mStableInsets = insets;
            }
        }

        @Override // androidx.core.view.WindowInsetsCompat.BuilderImpl
        public void setSystemWindowInsets(Insets insets) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ef461153", new Object[]{this, insets});
                return;
            }
            WindowInsets windowInsets = this.mPlatformInsets;
            if (windowInsets != null) {
                this.mPlatformInsets = windowInsets.replaceSystemWindowInsets(insets.left, insets.top, insets.right, insets.bottom);
            }
        }

        public BuilderImpl20(WindowInsetsCompat windowInsetsCompat) {
            super(windowInsetsCompat);
            this.mPlatformInsets = windowInsetsCompat.toWindowInsets();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class BuilderImpl29 extends BuilderImpl {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final WindowInsets.Builder mPlatBuilder;

        public BuilderImpl29() {
            this.mPlatBuilder = ogx.a();
        }

        public static /* synthetic */ Object ipc$super(BuilderImpl29 builderImpl29, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/core/view/WindowInsetsCompat$BuilderImpl29");
        }

        @Override // androidx.core.view.WindowInsetsCompat.BuilderImpl
        public WindowInsetsCompat build() {
            WindowInsets build;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (WindowInsetsCompat) ipChange.ipc$dispatch("e3bcf0fe", new Object[]{this});
            }
            applyInsetTypes();
            build = this.mPlatBuilder.build();
            WindowInsetsCompat windowInsetsCompat = WindowInsetsCompat.toWindowInsetsCompat(build);
            windowInsetsCompat.setOverriddenInsets(this.mInsetsTypeMask);
            return windowInsetsCompat;
        }

        @Override // androidx.core.view.WindowInsetsCompat.BuilderImpl
        public void setDisplayCutout(DisplayCutoutCompat displayCutoutCompat) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f3349c92", new Object[]{this, displayCutoutCompat});
            } else {
                this.mPlatBuilder.setDisplayCutout(displayCutoutCompat != null ? displayCutoutCompat.unwrap() : null);
            }
        }

        @Override // androidx.core.view.WindowInsetsCompat.BuilderImpl
        public void setMandatorySystemGestureInsets(Insets insets) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9e3d6a51", new Object[]{this, insets});
            } else {
                this.mPlatBuilder.setMandatorySystemGestureInsets(insets.toPlatformInsets());
            }
        }

        @Override // androidx.core.view.WindowInsetsCompat.BuilderImpl
        public void setStableInsets(Insets insets) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a4737b17", new Object[]{this, insets});
            } else {
                this.mPlatBuilder.setStableInsets(insets.toPlatformInsets());
            }
        }

        @Override // androidx.core.view.WindowInsetsCompat.BuilderImpl
        public void setSystemGestureInsets(Insets insets) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9c20e4dc", new Object[]{this, insets});
            } else {
                this.mPlatBuilder.setSystemGestureInsets(insets.toPlatformInsets());
            }
        }

        @Override // androidx.core.view.WindowInsetsCompat.BuilderImpl
        public void setSystemWindowInsets(Insets insets) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ef461153", new Object[]{this, insets});
            } else {
                this.mPlatBuilder.setSystemWindowInsets(insets.toPlatformInsets());
            }
        }

        @Override // androidx.core.view.WindowInsetsCompat.BuilderImpl
        public void setTappableElementInsets(Insets insets) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6a6199e1", new Object[]{this, insets});
            } else {
                this.mPlatBuilder.setTappableElementInsets(insets.toPlatformInsets());
            }
        }

        public BuilderImpl29(WindowInsetsCompat windowInsetsCompat) {
            super(windowInsetsCompat);
            WindowInsets.Builder builder;
            WindowInsets windowInsets = windowInsetsCompat.toWindowInsets();
            if (windowInsets != null) {
                builder = ngx.a(windowInsets);
            } else {
                builder = ogx.a();
            }
            this.mPlatBuilder = builder;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class Impl21 extends Impl20 {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private Insets mStableInsets;

        public Impl21(WindowInsetsCompat windowInsetsCompat, WindowInsets windowInsets) {
            super(windowInsetsCompat, windowInsets);
            this.mStableInsets = null;
        }

        public static /* synthetic */ Object ipc$super(Impl21 impl21, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/core/view/WindowInsetsCompat$Impl21");
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        public WindowInsetsCompat consumeStableInsets() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (WindowInsetsCompat) ipChange.ipc$dispatch("308863fd", new Object[]{this});
            }
            return WindowInsetsCompat.toWindowInsetsCompat(this.mPlatformInsets.consumeStableInsets());
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        public WindowInsetsCompat consumeSystemWindowInsets() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (WindowInsetsCompat) ipChange.ipc$dispatch("725396c1", new Object[]{this});
            }
            return WindowInsetsCompat.toWindowInsetsCompat(this.mPlatformInsets.consumeSystemWindowInsets());
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        public final Insets getStableInsets() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Insets) ipChange.ipc$dispatch("2a4d79af", new Object[]{this});
            }
            if (this.mStableInsets == null) {
                this.mStableInsets = Insets.of(this.mPlatformInsets.getStableInsetLeft(), this.mPlatformInsets.getStableInsetTop(), this.mPlatformInsets.getStableInsetRight(), this.mPlatformInsets.getStableInsetBottom());
            }
            return this.mStableInsets;
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        public boolean isConsumed() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("9fa8c6bd", new Object[]{this})).booleanValue();
            }
            return this.mPlatformInsets.isConsumed();
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        public void setStableInsets(Insets insets) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a4737b17", new Object[]{this, insets});
            } else {
                this.mStableInsets = insets;
            }
        }

        public Impl21(WindowInsetsCompat windowInsetsCompat, Impl21 impl21) {
            super(windowInsetsCompat, impl21);
            this.mStableInsets = null;
            this.mStableInsets = impl21.mStableInsets;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static final class Type {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        public static final int CAPTION_BAR = 4;
        public static final int DISPLAY_CUTOUT = 128;
        public static final int FIRST = 1;
        public static final int IME = 8;
        public static final int LAST = 256;
        public static final int MANDATORY_SYSTEM_GESTURES = 32;
        public static final int NAVIGATION_BARS = 2;
        public static final int SIZE = 9;
        public static final int STATUS_BARS = 1;
        public static final int SYSTEM_GESTURES = 16;
        public static final int TAPPABLE_ELEMENT = 64;
        public static final int WINDOW_DECOR = 256;

        /* compiled from: Taobao */
        @Retention(RetentionPolicy.SOURCE)
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
        public @interface InsetsType {
        }

        private Type() {
        }

        public static int all() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("c98f459b", new Object[0])).intValue();
            }
            return -1;
        }

        public static int captionBar() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("fb8dee47", new Object[0])).intValue();
            }
            return 4;
        }

        public static int displayCutout() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("a1f116a8", new Object[0])).intValue();
            }
            return 128;
        }

        public static int ime() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("721353bb", new Object[0])).intValue();
            }
            return 8;
        }

        public static int mandatorySystemGestures() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("550f954c", new Object[0])).intValue();
            }
            return 32;
        }

        public static int navigationBars() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("e6f1456e", new Object[0])).intValue();
            }
            return 2;
        }

        public static int statusBars() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("c87c4d4c", new Object[0])).intValue();
            }
            return 1;
        }

        public static int systemBars() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("3d576289", new Object[0])).intValue();
            }
            return 7;
        }

        public static int systemGestures() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("abc29393", new Object[0])).intValue();
            }
            return 16;
        }

        public static int tappableElement() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("5d8706ef", new Object[0])).intValue();
            }
            return 64;
        }

        public static int indexOf(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("c314bea6", new Object[]{new Integer(i)})).intValue();
            }
            if (i == 1) {
                return 0;
            }
            if (i == 2) {
                return 1;
            }
            if (i == 4) {
                return 2;
            }
            if (i == 8) {
                return 3;
            }
            if (i == 16) {
                return 4;
            }
            if (i == 32) {
                return 5;
            }
            if (i == 64) {
                return 6;
            }
            if (i == 128) {
                return 7;
            }
            if (i == 256) {
                return 8;
            }
            throw new IllegalArgumentException("type needs to be >= FIRST and <= LAST, type=" + i);
        }
    }

    public static WindowInsetsCompat toWindowInsetsCompat(WindowInsets windowInsets, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WindowInsetsCompat) ipChange.ipc$dispatch("9726b174", new Object[]{windowInsets, view});
        }
        WindowInsetsCompat windowInsetsCompat = new WindowInsetsCompat((WindowInsets) Preconditions.checkNotNull(windowInsets));
        if (view != null && view.isAttachedToWindow()) {
            windowInsetsCompat.setRootWindowInsets(ViewCompat.getRootWindowInsets(view));
            windowInsetsCompat.copyRootViewBounds(view.getRootView());
        }
        return windowInsetsCompat;
    }

    public WindowInsetsCompat inset(int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (WindowInsetsCompat) ipChange.ipc$dispatch("aa29a7ad", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)}) : this.mImpl.inset(i, i2, i3, i4);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class Impl29 extends Impl28 {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private Insets mSystemGestureInsets = null;
        private Insets mMandatorySystemGestureInsets = null;
        private Insets mTappableElementInsets = null;

        public Impl29(WindowInsetsCompat windowInsetsCompat, WindowInsets windowInsets) {
            super(windowInsetsCompat, windowInsets);
        }

        public static /* synthetic */ Object ipc$super(Impl29 impl29, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/core/view/WindowInsetsCompat$Impl29");
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        public Insets getMandatorySystemGestureInsets() {
            android.graphics.Insets mandatorySystemGestureInsets;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Insets) ipChange.ipc$dispatch("45c55335", new Object[]{this});
            }
            if (this.mMandatorySystemGestureInsets == null) {
                mandatorySystemGestureInsets = this.mPlatformInsets.getMandatorySystemGestureInsets();
                this.mMandatorySystemGestureInsets = Insets.toCompatInsets(mandatorySystemGestureInsets);
            }
            return this.mMandatorySystemGestureInsets;
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        public Insets getSystemGestureInsets() {
            android.graphics.Insets systemGestureInsets;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Insets) ipChange.ipc$dispatch("580098e2", new Object[]{this});
            }
            if (this.mSystemGestureInsets == null) {
                systemGestureInsets = this.mPlatformInsets.getSystemGestureInsets();
                this.mSystemGestureInsets = Insets.toCompatInsets(systemGestureInsets);
            }
            return this.mSystemGestureInsets;
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        public Insets getTappableElementInsets() {
            android.graphics.Insets tappableElementInsets;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Insets) ipChange.ipc$dispatch("3d717c3d", new Object[]{this});
            }
            if (this.mTappableElementInsets == null) {
                tappableElementInsets = this.mPlatformInsets.getTappableElementInsets();
                this.mTappableElementInsets = Insets.toCompatInsets(tappableElementInsets);
            }
            return this.mTappableElementInsets;
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl20, androidx.core.view.WindowInsetsCompat.Impl
        public WindowInsetsCompat inset(int i, int i2, int i3, int i4) {
            WindowInsets inset;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (WindowInsetsCompat) ipChange.ipc$dispatch("aa29a7ad", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            }
            inset = this.mPlatformInsets.inset(i, i2, i3, i4);
            return WindowInsetsCompat.toWindowInsetsCompat(inset);
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl21, androidx.core.view.WindowInsetsCompat.Impl
        public void setStableInsets(Insets insets) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a4737b17", new Object[]{this, insets});
            }
        }

        public Impl29(WindowInsetsCompat windowInsetsCompat, Impl29 impl29) {
            super(windowInsetsCompat, impl29);
        }
    }

    @Deprecated
    public WindowInsetsCompat replaceSystemWindowInsets(Rect rect) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (WindowInsetsCompat) ipChange.ipc$dispatch("bbd8e1f2", new Object[]{this, rect}) : new Builder(this).setSystemWindowInsets(Insets.of(rect)).build();
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static final class Builder {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private final BuilderImpl mImpl;

        public Builder() {
            int i = Build.VERSION.SDK_INT;
            if (i >= 30) {
                this.mImpl = new BuilderImpl30();
            } else if (i >= 29) {
                this.mImpl = new BuilderImpl29();
            } else {
                this.mImpl = new BuilderImpl20();
            }
        }

        public WindowInsetsCompat build() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (WindowInsetsCompat) ipChange.ipc$dispatch("e3bcf0fe", new Object[]{this});
            }
            return this.mImpl.build();
        }

        public Builder setDisplayCutout(DisplayCutoutCompat displayCutoutCompat) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("75312fe4", new Object[]{this, displayCutoutCompat});
            }
            this.mImpl.setDisplayCutout(displayCutoutCompat);
            return this;
        }

        public Builder setInsets(int i, Insets insets) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("6274c81f", new Object[]{this, new Integer(i), insets});
            }
            this.mImpl.setInsets(i, insets);
            return this;
        }

        public Builder setInsetsIgnoringVisibility(int i, Insets insets) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("da8b0e80", new Object[]{this, new Integer(i), insets});
            }
            this.mImpl.setInsetsIgnoringVisibility(i, insets);
            return this;
        }

        @Deprecated
        public Builder setMandatorySystemGestureInsets(Insets insets) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("88fdc763", new Object[]{this, insets});
            }
            this.mImpl.setMandatorySystemGestureInsets(insets);
            return this;
        }

        @Deprecated
        public Builder setStableInsets(Insets insets) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("9f916da9", new Object[]{this, insets});
            }
            this.mImpl.setStableInsets(insets);
            return this;
        }

        @Deprecated
        public Builder setSystemGestureInsets(Insets insets) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("b12e86ae", new Object[]{this, insets});
            }
            this.mImpl.setSystemGestureInsets(insets);
            return this;
        }

        @Deprecated
        public Builder setSystemWindowInsets(Insets insets) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("e5ee7ae5", new Object[]{this, insets});
            }
            this.mImpl.setSystemWindowInsets(insets);
            return this;
        }

        @Deprecated
        public Builder setTappableElementInsets(Insets insets) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("37dd3af3", new Object[]{this, insets});
            }
            this.mImpl.setTappableElementInsets(insets);
            return this;
        }

        public Builder setVisible(int i, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("c39717a", new Object[]{this, new Integer(i), new Boolean(z)});
            }
            this.mImpl.setVisible(i, z);
            return this;
        }

        public Builder(WindowInsetsCompat windowInsetsCompat) {
            int i = Build.VERSION.SDK_INT;
            if (i >= 30) {
                this.mImpl = new BuilderImpl30(windowInsetsCompat);
            } else if (i >= 29) {
                this.mImpl = new BuilderImpl29(windowInsetsCompat);
            } else {
                this.mImpl = new BuilderImpl20(windowInsetsCompat);
            }
        }
    }

    public WindowInsetsCompat(WindowInsetsCompat windowInsetsCompat) {
        if (windowInsetsCompat != null) {
            Impl impl = windowInsetsCompat.mImpl;
            int i = Build.VERSION.SDK_INT;
            if (i >= 30 && (impl instanceof Impl30)) {
                this.mImpl = new Impl30(this, (Impl30) impl);
            } else if (i >= 29 && (impl instanceof Impl29)) {
                this.mImpl = new Impl29(this, (Impl29) impl);
            } else if (i >= 28 && (impl instanceof Impl28)) {
                this.mImpl = new Impl28(this, (Impl28) impl);
            } else if (impl instanceof Impl21) {
                this.mImpl = new Impl21(this, (Impl21) impl);
            } else if (impl instanceof Impl20) {
                this.mImpl = new Impl20(this, (Impl20) impl);
            } else {
                this.mImpl = new Impl(this);
            }
            impl.copyWindowDataInto(this);
            return;
        }
        this.mImpl = new Impl(this);
    }
}
