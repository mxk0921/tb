package androidx.core.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.WindowInsetsAnimation;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;
import androidx.core.graphics.Insets;
import androidx.core.view.WindowInsetsCompat;
import androidx.interpolator.view.animation.FastOutLinearInInterpolator;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import tb.ifx;
import tb.kfx;
import tb.lfx;
import tb.ufx;
import tb.vfx;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public final class WindowInsetsAnimationCompat {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final boolean DEBUG = false;
    private static final String TAG = "WindowInsetsAnimCompat";
    private Impl mImpl;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static abstract class Callback {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        public static final int DISPATCH_MODE_CONTINUE_ON_SUBTREE = 1;
        public static final int DISPATCH_MODE_STOP = 0;
        public WindowInsets mDispachedInsets;
        private final int mDispatchMode;

        /* compiled from: Taobao */
        @Retention(RetentionPolicy.SOURCE)
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
        public @interface DispatchMode {
        }

        public Callback(int i) {
            this.mDispatchMode = i;
        }

        public final int getDispatchMode() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("64c22aad", new Object[]{this})).intValue();
            }
            return this.mDispatchMode;
        }

        public void onEnd(WindowInsetsAnimationCompat windowInsetsAnimationCompat) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ff421d32", new Object[]{this, windowInsetsAnimationCompat});
            }
        }

        public void onPrepare(WindowInsetsAnimationCompat windowInsetsAnimationCompat) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6dceaade", new Object[]{this, windowInsetsAnimationCompat});
            }
        }

        public abstract WindowInsetsCompat onProgress(WindowInsetsCompat windowInsetsCompat, List<WindowInsetsAnimationCompat> list);

        public BoundsCompat onStart(WindowInsetsAnimationCompat windowInsetsAnimationCompat, BoundsCompat boundsCompat) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (BoundsCompat) ipChange.ipc$dispatch("55077263", new Object[]{this, windowInsetsAnimationCompat, boundsCompat});
            }
            return boundsCompat;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class Impl {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private float mAlpha;
        private final long mDurationMillis;
        private float mFraction;
        private final Interpolator mInterpolator;
        private final int mTypeMask;

        public Impl(int i, Interpolator interpolator, long j) {
            this.mTypeMask = i;
            this.mInterpolator = interpolator;
            this.mDurationMillis = j;
        }

        public float getAlpha() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("dbf8c81f", new Object[]{this})).floatValue();
            }
            return this.mAlpha;
        }

        public long getDurationMillis() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("dd7b2e6b", new Object[]{this})).longValue();
            }
            return this.mDurationMillis;
        }

        public float getFraction() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("2de107ef", new Object[]{this})).floatValue();
            }
            return this.mFraction;
        }

        public float getInterpolatedFraction() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("c927612", new Object[]{this})).floatValue();
            }
            Interpolator interpolator = this.mInterpolator;
            if (interpolator != null) {
                return interpolator.getInterpolation(this.mFraction);
            }
            return this.mFraction;
        }

        public Interpolator getInterpolator() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Interpolator) ipChange.ipc$dispatch("bf078b59", new Object[]{this});
            }
            return this.mInterpolator;
        }

        public int getTypeMask() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("b0d8e136", new Object[]{this})).intValue();
            }
            return this.mTypeMask;
        }

        public void setAlpha(float f) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d144f37d", new Object[]{this, new Float(f)});
            } else {
                this.mAlpha = f;
            }
        }

        public void setFraction(float f) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2116c615", new Object[]{this, new Float(f)});
            } else {
                this.mFraction = f;
            }
        }
    }

    public WindowInsetsAnimationCompat(int i, Interpolator interpolator, long j) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.mImpl = new Impl30(i, interpolator, j);
        } else {
            this.mImpl = new Impl21(i, interpolator, j);
        }
    }

    public static void setCallback(View view, Callback callback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("986fbc54", new Object[]{view, callback});
        } else if (Build.VERSION.SDK_INT >= 30) {
            Impl30.setCallback(view, callback);
        } else {
            Impl21.setCallback(view, callback);
        }
    }

    public static WindowInsetsAnimationCompat toWindowInsetsAnimationCompat(WindowInsetsAnimation windowInsetsAnimation) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WindowInsetsAnimationCompat) ipChange.ipc$dispatch("70eaa35e", new Object[]{windowInsetsAnimation});
        }
        return new WindowInsetsAnimationCompat(windowInsetsAnimation);
    }

    public float getAlpha() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("dbf8c81f", new Object[]{this})).floatValue();
        }
        return this.mImpl.getAlpha();
    }

    public long getDurationMillis() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("dd7b2e6b", new Object[]{this})).longValue();
        }
        return this.mImpl.getDurationMillis();
    }

    public float getFraction() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2de107ef", new Object[]{this})).floatValue();
        }
        return this.mImpl.getFraction();
    }

    public float getInterpolatedFraction() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c927612", new Object[]{this})).floatValue();
        }
        return this.mImpl.getInterpolatedFraction();
    }

    public Interpolator getInterpolator() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Interpolator) ipChange.ipc$dispatch("bf078b59", new Object[]{this});
        }
        return this.mImpl.getInterpolator();
    }

    public int getTypeMask() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b0d8e136", new Object[]{this})).intValue();
        }
        return this.mImpl.getTypeMask();
    }

    public void setAlpha(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d144f37d", new Object[]{this, new Float(f)});
        } else {
            this.mImpl.setAlpha(f);
        }
    }

    public void setFraction(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2116c615", new Object[]{this, new Float(f)});
        } else {
            this.mImpl.setFraction(f);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class Impl21 extends Impl {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private static final Interpolator SHOW_IME_INTERPOLATOR = new PathInterpolator(0.0f, 1.1f, 0.0f, 1.0f);
        private static final Interpolator HIDE_IME_INTERPOLATOR = new FastOutLinearInInterpolator();
        private static final Interpolator DEFAULT_INSET_INTERPOLATOR = new DecelerateInterpolator();

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
        public static class Impl21OnApplyWindowInsetsListener implements View.OnApplyWindowInsetsListener {
            public static volatile transient /* synthetic */ IpChange $ipChange = null;
            private static final int COMPAT_ANIMATION_DURATION = 160;
            public final Callback mCallback;
            private WindowInsetsCompat mLastInsets;

            public Impl21OnApplyWindowInsetsListener(View view, Callback callback) {
                WindowInsetsCompat windowInsetsCompat;
                this.mCallback = callback;
                WindowInsetsCompat rootWindowInsets = ViewCompat.getRootWindowInsets(view);
                if (rootWindowInsets != null) {
                    windowInsetsCompat = new WindowInsetsCompat.Builder(rootWindowInsets).build();
                } else {
                    windowInsetsCompat = null;
                }
                this.mLastInsets = windowInsetsCompat;
            }

            @Override // android.view.View.OnApplyWindowInsetsListener
            public WindowInsets onApplyWindowInsets(final View view, WindowInsets windowInsets) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (WindowInsets) ipChange.ipc$dispatch("6a50307c", new Object[]{this, view, windowInsets});
                }
                if (!view.isLaidOut()) {
                    this.mLastInsets = WindowInsetsCompat.toWindowInsetsCompat(windowInsets, view);
                    return Impl21.forwardToViewIfNeeded(view, windowInsets);
                }
                final WindowInsetsCompat windowInsetsCompat = WindowInsetsCompat.toWindowInsetsCompat(windowInsets, view);
                if (this.mLastInsets == null) {
                    this.mLastInsets = ViewCompat.getRootWindowInsets(view);
                }
                if (this.mLastInsets == null) {
                    this.mLastInsets = windowInsetsCompat;
                    return Impl21.forwardToViewIfNeeded(view, windowInsets);
                }
                Callback callback = Impl21.getCallback(view);
                if (callback != null && Objects.equals(callback.mDispachedInsets, windowInsets)) {
                    return Impl21.forwardToViewIfNeeded(view, windowInsets);
                }
                final int buildAnimationMask = Impl21.buildAnimationMask(windowInsetsCompat, this.mLastInsets);
                if (buildAnimationMask == 0) {
                    return Impl21.forwardToViewIfNeeded(view, windowInsets);
                }
                final WindowInsetsCompat windowInsetsCompat2 = this.mLastInsets;
                final WindowInsetsAnimationCompat windowInsetsAnimationCompat = new WindowInsetsAnimationCompat(buildAnimationMask, Impl21.createInsetInterpolator(buildAnimationMask, windowInsetsCompat, windowInsetsCompat2), 160L);
                windowInsetsAnimationCompat.setFraction(0.0f);
                final ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(windowInsetsAnimationCompat.getDurationMillis());
                final BoundsCompat computeAnimationBounds = Impl21.computeAnimationBounds(windowInsetsCompat, windowInsetsCompat2, buildAnimationMask);
                Impl21.dispatchOnPrepare(view, windowInsetsAnimationCompat, windowInsets, false);
                duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: androidx.core.view.WindowInsetsAnimationCompat.Impl21.Impl21OnApplyWindowInsetsListener.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public void onAnimationUpdate(ValueAnimator valueAnimator) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator});
                            return;
                        }
                        windowInsetsAnimationCompat.setFraction(valueAnimator.getAnimatedFraction());
                        Impl21.dispatchOnProgress(view, Impl21.interpolateInsets(windowInsetsCompat, windowInsetsCompat2, windowInsetsAnimationCompat.getInterpolatedFraction(), buildAnimationMask), Collections.singletonList(windowInsetsAnimationCompat));
                    }
                });
                duration.addListener(new AnimatorListenerAdapter() { // from class: androidx.core.view.WindowInsetsAnimationCompat.Impl21.Impl21OnApplyWindowInsetsListener.2
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    public static /* synthetic */ Object ipc$super(AnonymousClass2 r2, String str, Object... objArr) {
                        str.hashCode();
                        int hashCode = str.hashCode();
                        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/core/view/WindowInsetsAnimationCompat$Impl21$Impl21OnApplyWindowInsetsListener$2");
                    }

                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public void onAnimationEnd(Animator animator) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("8024e25a", new Object[]{this, animator});
                            return;
                        }
                        windowInsetsAnimationCompat.setFraction(1.0f);
                        Impl21.dispatchOnEnd(view, windowInsetsAnimationCompat);
                    }
                });
                OneShotPreDrawListener.add(view, new Runnable() { // from class: androidx.core.view.WindowInsetsAnimationCompat.Impl21.Impl21OnApplyWindowInsetsListener.3
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        Impl21.dispatchOnStart(view, windowInsetsAnimationCompat, computeAnimationBounds);
                        duration.start();
                    }
                });
                this.mLastInsets = windowInsetsCompat;
                return Impl21.forwardToViewIfNeeded(view, windowInsets);
            }
        }

        public Impl21(int i, Interpolator interpolator, long j) {
            super(i, interpolator, j);
        }

        public static BoundsCompat computeAnimationBounds(WindowInsetsCompat windowInsetsCompat, WindowInsetsCompat windowInsetsCompat2, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (BoundsCompat) ipChange.ipc$dispatch("dff15190", new Object[]{windowInsetsCompat, windowInsetsCompat2, new Integer(i)});
            }
            Insets insets = windowInsetsCompat.getInsets(i);
            Insets insets2 = windowInsetsCompat2.getInsets(i);
            return new BoundsCompat(Insets.of(Math.min(insets.left, insets2.left), Math.min(insets.top, insets2.top), Math.min(insets.right, insets2.right), Math.min(insets.bottom, insets2.bottom)), Insets.of(Math.max(insets.left, insets2.left), Math.max(insets.top, insets2.top), Math.max(insets.right, insets2.right), Math.max(insets.bottom, insets2.bottom)));
        }

        public static Interpolator createInsetInterpolator(int i, WindowInsetsCompat windowInsetsCompat, WindowInsetsCompat windowInsetsCompat2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Interpolator) ipChange.ipc$dispatch("35b8f469", new Object[]{new Integer(i), windowInsetsCompat, windowInsetsCompat2});
            }
            if ((i & 8) == 0) {
                return DEFAULT_INSET_INTERPOLATOR;
            }
            if (windowInsetsCompat.getInsets(WindowInsetsCompat.Type.ime()).bottom > windowInsetsCompat2.getInsets(WindowInsetsCompat.Type.ime()).bottom) {
                return SHOW_IME_INTERPOLATOR;
            }
            return HIDE_IME_INTERPOLATOR;
        }

        private static View.OnApplyWindowInsetsListener createProxyListener(View view, Callback callback) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (View.OnApplyWindowInsetsListener) ipChange.ipc$dispatch("349201d0", new Object[]{view, callback});
            }
            return new Impl21OnApplyWindowInsetsListener(view, callback);
        }

        public static void dispatchOnEnd(View view, WindowInsetsAnimationCompat windowInsetsAnimationCompat) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("72a740b8", new Object[]{view, windowInsetsAnimationCompat});
                return;
            }
            Callback callback = getCallback(view);
            if (callback != null) {
                callback.onEnd(windowInsetsAnimationCompat);
                if (callback.getDispatchMode() == 0) {
                    return;
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i = 0; i < viewGroup.getChildCount(); i++) {
                    dispatchOnEnd(viewGroup.getChildAt(i), windowInsetsAnimationCompat);
                }
            }
        }

        public static void dispatchOnPrepare(View view, WindowInsetsAnimationCompat windowInsetsAnimationCompat, WindowInsets windowInsets, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a8972baf", new Object[]{view, windowInsetsAnimationCompat, windowInsets, new Boolean(z)});
                return;
            }
            Callback callback = getCallback(view);
            if (callback != null) {
                callback.mDispachedInsets = windowInsets;
                if (!z) {
                    callback.onPrepare(windowInsetsAnimationCompat);
                    if (callback.getDispatchMode() == 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i = 0; i < viewGroup.getChildCount(); i++) {
                    dispatchOnPrepare(viewGroup.getChildAt(i), windowInsetsAnimationCompat, windowInsets, z);
                }
            }
        }

        public static void dispatchOnProgress(View view, WindowInsetsCompat windowInsetsCompat, List<WindowInsetsAnimationCompat> list) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("bd4ea885", new Object[]{view, windowInsetsCompat, list});
                return;
            }
            Callback callback = getCallback(view);
            if (callback != null) {
                windowInsetsCompat = callback.onProgress(windowInsetsCompat, list);
                if (callback.getDispatchMode() == 0) {
                    return;
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i = 0; i < viewGroup.getChildCount(); i++) {
                    dispatchOnProgress(viewGroup.getChildAt(i), windowInsetsCompat, list);
                }
            }
        }

        public static WindowInsets forwardToViewIfNeeded(View view, WindowInsets windowInsets) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (WindowInsets) ipChange.ipc$dispatch("f6f2cd3e", new Object[]{view, windowInsets});
            }
            return view.getTag(R.id.tag_on_apply_window_listener) != null ? windowInsets : view.onApplyWindowInsets(windowInsets);
        }

        public static Callback getCallback(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Callback) ipChange.ipc$dispatch("9f130e18", new Object[]{view});
            }
            Object tag = view.getTag(R.id.tag_window_insets_animation_callback);
            if (tag instanceof Impl21OnApplyWindowInsetsListener) {
                return ((Impl21OnApplyWindowInsetsListener) tag).mCallback;
            }
            return null;
        }

        public static WindowInsetsCompat interpolateInsets(WindowInsetsCompat windowInsetsCompat, WindowInsetsCompat windowInsetsCompat2, float f, int i) {
            WindowInsetsCompat.Builder builder;
            WindowInsetsCompat windowInsetsCompat3 = windowInsetsCompat;
            WindowInsetsCompat windowInsetsCompat4 = windowInsetsCompat2;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (WindowInsetsCompat) ipChange.ipc$dispatch("6ca42d8a", new Object[]{windowInsetsCompat3, windowInsetsCompat4, new Float(f), new Integer(i)});
            }
            WindowInsetsCompat.Builder builder2 = new WindowInsetsCompat.Builder(windowInsetsCompat3);
            int i2 = 1;
            while (i2 <= 256) {
                if ((i & i2) == 0) {
                    builder2.setInsets(i2, windowInsetsCompat3.getInsets(i2));
                    builder = builder2;
                } else {
                    Insets insets = windowInsetsCompat3.getInsets(i2);
                    Insets insets2 = windowInsetsCompat4.getInsets(i2);
                    float f2 = 1.0f - f;
                    builder = builder2;
                    builder.setInsets(i2, WindowInsetsCompat.insetInsets(insets, (int) (((insets.left - insets2.left) * f2) + 0.5d), (int) (((insets.top - insets2.top) * f2) + 0.5d), (int) (((insets.right - insets2.right) * f2) + 0.5d), (int) (((insets.bottom - insets2.bottom) * f2) + 0.5d)));
                }
                i2 <<= 1;
                windowInsetsCompat3 = windowInsetsCompat;
                builder2 = builder;
                windowInsetsCompat4 = windowInsetsCompat2;
            }
            return builder2.build();
        }

        public static /* synthetic */ Object ipc$super(Impl21 impl21, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/core/view/WindowInsetsAnimationCompat$Impl21");
        }

        public static void setCallback(View view, Callback callback) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("986fbc54", new Object[]{view, callback});
                return;
            }
            Object tag = view.getTag(R.id.tag_on_apply_window_listener);
            if (callback == null) {
                view.setTag(R.id.tag_window_insets_animation_callback, null);
                if (tag == null) {
                    view.setOnApplyWindowInsetsListener(null);
                    return;
                }
                return;
            }
            View.OnApplyWindowInsetsListener createProxyListener = createProxyListener(view, callback);
            view.setTag(R.id.tag_window_insets_animation_callback, createProxyListener);
            if (tag == null) {
                view.setOnApplyWindowInsetsListener(createProxyListener);
            }
        }

        public static int buildAnimationMask(WindowInsetsCompat windowInsetsCompat, WindowInsetsCompat windowInsetsCompat2) {
            int i = 0;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("e3f45e5c", new Object[]{windowInsetsCompat, windowInsetsCompat2})).intValue();
            }
            for (int i2 = 1; i2 <= 256; i2 <<= 1) {
                if (!windowInsetsCompat.getInsets(i2).equals(windowInsetsCompat2.getInsets(i2))) {
                    i |= i2;
                }
            }
            return i;
        }

        public static void dispatchOnStart(View view, WindowInsetsAnimationCompat windowInsetsAnimationCompat, BoundsCompat boundsCompat) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f7b2c895", new Object[]{view, windowInsetsAnimationCompat, boundsCompat});
                return;
            }
            Callback callback = getCallback(view);
            if (callback != null) {
                callback.onStart(windowInsetsAnimationCompat, boundsCompat);
                if (callback.getDispatchMode() == 0) {
                    return;
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i = 0; i < viewGroup.getChildCount(); i++) {
                    dispatchOnStart(viewGroup.getChildAt(i), windowInsetsAnimationCompat, boundsCompat);
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class Impl30 extends Impl {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private final WindowInsetsAnimation mWrapped;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
        public static class ProxyCallback extends WindowInsetsAnimation.Callback {
            public static volatile transient /* synthetic */ IpChange $ipChange;
            private final HashMap<WindowInsetsAnimation, WindowInsetsAnimationCompat> mAnimations = new HashMap<>();
            private final Callback mCompat;
            private List<WindowInsetsAnimationCompat> mRORunningAnimations;
            private ArrayList<WindowInsetsAnimationCompat> mTmpRunningAnimations;

            public ProxyCallback(Callback callback) {
                super(callback.getDispatchMode());
                this.mCompat = callback;
            }

            private WindowInsetsAnimationCompat getWindowInsetsAnimationCompat(WindowInsetsAnimation windowInsetsAnimation) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (WindowInsetsAnimationCompat) ipChange.ipc$dispatch("ff203f79", new Object[]{this, windowInsetsAnimation});
                }
                WindowInsetsAnimationCompat windowInsetsAnimationCompat = this.mAnimations.get(windowInsetsAnimation);
                if (windowInsetsAnimationCompat != null) {
                    return windowInsetsAnimationCompat;
                }
                WindowInsetsAnimationCompat windowInsetsAnimationCompat2 = WindowInsetsAnimationCompat.toWindowInsetsAnimationCompat(windowInsetsAnimation);
                this.mAnimations.put(windowInsetsAnimation, windowInsetsAnimationCompat2);
                return windowInsetsAnimationCompat2;
            }

            public static /* synthetic */ Object ipc$super(ProxyCallback proxyCallback, String str, Object... objArr) {
                str.hashCode();
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/core/view/WindowInsetsAnimationCompat$Impl30$ProxyCallback");
            }

            @Override // android.view.WindowInsetsAnimation.Callback
            public void onEnd(WindowInsetsAnimation windowInsetsAnimation) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("d941277e", new Object[]{this, windowInsetsAnimation});
                    return;
                }
                this.mCompat.onEnd(getWindowInsetsAnimationCompat(windowInsetsAnimation));
                this.mAnimations.remove(windowInsetsAnimation);
            }

            @Override // android.view.WindowInsetsAnimation.Callback
            public void onPrepare(WindowInsetsAnimation windowInsetsAnimation) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("153d72a", new Object[]{this, windowInsetsAnimation});
                } else {
                    this.mCompat.onPrepare(getWindowInsetsAnimationCompat(windowInsetsAnimation));
                }
            }

            @Override // android.view.WindowInsetsAnimation.Callback
            public WindowInsets onProgress(WindowInsets windowInsets, List<WindowInsetsAnimation> list) {
                float fraction;
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (WindowInsets) ipChange.ipc$dispatch("50fa2a70", new Object[]{this, windowInsets, list});
                }
                ArrayList<WindowInsetsAnimationCompat> arrayList = this.mTmpRunningAnimations;
                if (arrayList == null) {
                    ArrayList<WindowInsetsAnimationCompat> arrayList2 = new ArrayList<>(list.size());
                    this.mTmpRunningAnimations = arrayList2;
                    this.mRORunningAnimations = Collections.unmodifiableList(arrayList2);
                } else {
                    arrayList.clear();
                }
                for (int size = list.size() - 1; size >= 0; size--) {
                    WindowInsetsAnimation a2 = vfx.a(list.get(size));
                    WindowInsetsAnimationCompat windowInsetsAnimationCompat = getWindowInsetsAnimationCompat(a2);
                    fraction = a2.getFraction();
                    windowInsetsAnimationCompat.setFraction(fraction);
                    this.mTmpRunningAnimations.add(windowInsetsAnimationCompat);
                }
                return this.mCompat.onProgress(WindowInsetsCompat.toWindowInsetsCompat(windowInsets), this.mRORunningAnimations).toWindowInsets();
            }

            @Override // android.view.WindowInsetsAnimation.Callback
            public WindowInsetsAnimation.Bounds onStart(WindowInsetsAnimation windowInsetsAnimation, WindowInsetsAnimation.Bounds bounds) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ifx.a(ipChange.ipc$dispatch("82a67083", new Object[]{this, windowInsetsAnimation, bounds}));
                }
                return this.mCompat.onStart(getWindowInsetsAnimationCompat(windowInsetsAnimation), BoundsCompat.toBoundsCompat(bounds)).toBounds();
            }
        }

        public Impl30(WindowInsetsAnimation windowInsetsAnimation) {
            super(0, null, 0L);
            this.mWrapped = windowInsetsAnimation;
        }

        public static WindowInsetsAnimation.Bounds createPlatformBounds(BoundsCompat boundsCompat) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ifx.a(ipChange.ipc$dispatch("215c7907", new Object[]{boundsCompat}));
            }
            lfx.a();
            return kfx.a(boundsCompat.getLowerBound().toPlatformInsets(), boundsCompat.getUpperBound().toPlatformInsets());
        }

        public static Insets getHigherBounds(WindowInsetsAnimation.Bounds bounds) {
            android.graphics.Insets upperBound;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Insets) ipChange.ipc$dispatch("1a3f90fc", new Object[]{bounds});
            }
            upperBound = bounds.getUpperBound();
            return Insets.toCompatInsets(upperBound);
        }

        public static Insets getLowerBounds(WindowInsetsAnimation.Bounds bounds) {
            android.graphics.Insets lowerBound;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Insets) ipChange.ipc$dispatch("28a3d2b6", new Object[]{bounds});
            }
            lowerBound = bounds.getLowerBound();
            return Insets.toCompatInsets(lowerBound);
        }

        public static /* synthetic */ Object ipc$super(Impl30 impl30, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/core/view/WindowInsetsAnimationCompat$Impl30");
        }

        public static void setCallback(View view, Callback callback) {
            ProxyCallback proxyCallback;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("986fbc54", new Object[]{view, callback});
                return;
            }
            if (callback != null) {
                proxyCallback = new ProxyCallback(callback);
            } else {
                proxyCallback = null;
            }
            view.setWindowInsetsAnimationCallback(proxyCallback);
        }

        @Override // androidx.core.view.WindowInsetsAnimationCompat.Impl
        public long getDurationMillis() {
            long durationMillis;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("dd7b2e6b", new Object[]{this})).longValue();
            }
            durationMillis = this.mWrapped.getDurationMillis();
            return durationMillis;
        }

        @Override // androidx.core.view.WindowInsetsAnimationCompat.Impl
        public float getFraction() {
            float fraction;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("2de107ef", new Object[]{this})).floatValue();
            }
            fraction = this.mWrapped.getFraction();
            return fraction;
        }

        @Override // androidx.core.view.WindowInsetsAnimationCompat.Impl
        public float getInterpolatedFraction() {
            float interpolatedFraction;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("c927612", new Object[]{this})).floatValue();
            }
            interpolatedFraction = this.mWrapped.getInterpolatedFraction();
            return interpolatedFraction;
        }

        @Override // androidx.core.view.WindowInsetsAnimationCompat.Impl
        public Interpolator getInterpolator() {
            Interpolator interpolator;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Interpolator) ipChange.ipc$dispatch("bf078b59", new Object[]{this});
            }
            interpolator = this.mWrapped.getInterpolator();
            return interpolator;
        }

        @Override // androidx.core.view.WindowInsetsAnimationCompat.Impl
        public int getTypeMask() {
            int typeMask;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("b0d8e136", new Object[]{this})).intValue();
            }
            typeMask = this.mWrapped.getTypeMask();
            return typeMask;
        }

        @Override // androidx.core.view.WindowInsetsAnimationCompat.Impl
        public void setFraction(float f) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2116c615", new Object[]{this, new Float(f)});
            } else {
                this.mWrapped.setFraction(f);
            }
        }

        public Impl30(int i, Interpolator interpolator, long j) {
            this(ufx.a(i, interpolator, j));
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static final class BoundsCompat {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private final Insets mLowerBound;
        private final Insets mUpperBound;

        public BoundsCompat(Insets insets, Insets insets2) {
            this.mLowerBound = insets;
            this.mUpperBound = insets2;
        }

        public static BoundsCompat toBoundsCompat(WindowInsetsAnimation.Bounds bounds) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (BoundsCompat) ipChange.ipc$dispatch("aea16f79", new Object[]{bounds});
            }
            return new BoundsCompat(bounds);
        }

        public Insets getLowerBound() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Insets) ipChange.ipc$dispatch("f51f391b", new Object[]{this});
            }
            return this.mLowerBound;
        }

        public Insets getUpperBound() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Insets) ipChange.ipc$dispatch("80ebe85a", new Object[]{this});
            }
            return this.mUpperBound;
        }

        public BoundsCompat inset(Insets insets) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (BoundsCompat) ipChange.ipc$dispatch("da35b803", new Object[]{this, insets});
            }
            return new BoundsCompat(WindowInsetsCompat.insetInsets(this.mLowerBound, insets.left, insets.top, insets.right, insets.bottom), WindowInsetsCompat.insetInsets(this.mUpperBound, insets.left, insets.top, insets.right, insets.bottom));
        }

        public WindowInsetsAnimation.Bounds toBounds() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ifx.a(ipChange.ipc$dispatch("56d84763", new Object[]{this}));
            }
            return Impl30.createPlatformBounds(this);
        }

        public String toString() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
            }
            return "Bounds{lower=" + this.mLowerBound + " upper=" + this.mUpperBound + "}";
        }

        private BoundsCompat(WindowInsetsAnimation.Bounds bounds) {
            this.mLowerBound = Impl30.getLowerBounds(bounds);
            this.mUpperBound = Impl30.getHigherBounds(bounds);
        }
    }

    private WindowInsetsAnimationCompat(WindowInsetsAnimation windowInsetsAnimation) {
        this(0, null, 0L);
        if (Build.VERSION.SDK_INT >= 30) {
            this.mImpl = new Impl30(windowInsetsAnimation);
        }
    }
}
