package com.google.android.material.snackbar;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Insets;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityManager;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.google.android.material.behavior.SwipeDismissBehavior;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.google.android.material.snackbar.a;
import com.taobao.taobao.R;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.List;
import tb.bai;
import tb.fq4;
import tb.l7i;
import tb.ogw;
import tb.pg1;
import tb.pz0;
import tb.u9i;
import tb.xot;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public abstract class BaseTransientBottomBar<B extends BaseTransientBottomBar<B>> {
    public static final int ANIMATION_MODE_FADE = 1;
    public static final int ANIMATION_MODE_SLIDE = 0;
    public static final int LENGTH_INDEFINITE = -2;
    public static final int LENGTH_LONG = 0;
    public static final int LENGTH_SHORT = -1;

    /* renamed from: a  reason: collision with root package name */
    public final ViewGroup f5129a;
    public final Context b;
    public final SnackbarBaseLayout c;
    public final fq4 d;
    public int e;
    public final Rect g;
    public int h;
    public int i;
    public int j;
    public int k;
    public final AccessibilityManager l;
    public static final int[] o = {R.attr.snackbarStyle};
    public static final Handler n = new Handler(Looper.getMainLooper(), new i());
    public final Runnable f = new j();
    public final a.b m = new m();

    /* compiled from: Taobao */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public @interface AnimationMode {
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static class Behavior extends SwipeDismissBehavior<View> {
        public final r i = new r(this);

        @Override // com.google.android.material.behavior.SwipeDismissBehavior
        public boolean a(View view) {
            return this.i.a(view);
        }

        public final void l(BaseTransientBottomBar<?> baseTransientBottomBar) {
            this.i.c(baseTransientBottomBar);
        }

        @Override // com.google.android.material.behavior.SwipeDismissBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public boolean onInterceptTouchEvent(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            this.i.b(coordinatorLayout, view, motionEvent);
            return super.onInterceptTouchEvent(coordinatorLayout, view, motionEvent);
        }
    }

    /* compiled from: Taobao */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public @interface Duration {
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static class SnackbarBaseLayout extends FrameLayout {
        private static final View.OnTouchListener consumeAllTouchListener = new a();
        private final float actionTextColorAlpha;
        private int animationMode;
        private final float backgroundOverlayColorAlpha;
        private ColorStateList backgroundTint;
        private PorterDuff.Mode backgroundTintMode;
        private s onAttachStateChangeListener;
        private t onLayoutChangeListener;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
        public class a implements View.OnTouchListener {
            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view, MotionEvent motionEvent) {
                return true;
            }
        }

        public SnackbarBaseLayout(Context context) {
            this(context, null);
        }

        private Drawable createThemedBackground() {
            float dimension = getResources().getDimension(R.dimen.mtrl_snackbar_background_corner_radius);
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(0);
            gradientDrawable.setCornerRadius(dimension);
            gradientDrawable.setColor(l7i.g(this, R.attr.colorSurface, R.attr.colorOnSurface, getBackgroundOverlayColorAlpha()));
            if (this.backgroundTint == null) {
                return DrawableCompat.wrap(gradientDrawable);
            }
            Drawable wrap = DrawableCompat.wrap(gradientDrawable);
            DrawableCompat.setTintList(wrap, this.backgroundTint);
            return wrap;
        }

        public float getActionTextColorAlpha() {
            return this.actionTextColorAlpha;
        }

        public int getAnimationMode() {
            return this.animationMode;
        }

        public float getBackgroundOverlayColorAlpha() {
            return this.backgroundOverlayColorAlpha;
        }

        @Override // android.view.ViewGroup, android.view.View
        public void onAttachedToWindow() {
            super.onAttachedToWindow();
            s sVar = this.onAttachStateChangeListener;
            if (sVar != null) {
                ((n) sVar).a(this);
            }
            ViewCompat.requestApplyInsets(this);
        }

        @Override // android.view.ViewGroup, android.view.View
        public void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            s sVar = this.onAttachStateChangeListener;
            if (sVar != null) {
                ((n) sVar).b(this);
            }
        }

        @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
        public void onLayout(boolean z, int i, int i2, int i3, int i4) {
            super.onLayout(z, i, i2, i3, i4);
            t tVar = this.onLayoutChangeListener;
            if (tVar != null) {
                ((o) tVar).a(this, i, i2, i3, i4);
            }
        }

        public void setAnimationMode(int i) {
            this.animationMode = i;
        }

        @Override // android.view.View
        public void setBackground(Drawable drawable) {
            setBackgroundDrawable(drawable);
        }

        @Override // android.view.View
        public void setBackgroundDrawable(Drawable drawable) {
            if (!(drawable == null || this.backgroundTint == null)) {
                drawable = DrawableCompat.wrap(drawable.mutate());
                DrawableCompat.setTintList(drawable, this.backgroundTint);
                DrawableCompat.setTintMode(drawable, this.backgroundTintMode);
            }
            super.setBackgroundDrawable(drawable);
        }

        @Override // android.view.View
        public void setBackgroundTintList(ColorStateList colorStateList) {
            this.backgroundTint = colorStateList;
            if (getBackground() != null) {
                Drawable wrap = DrawableCompat.wrap(getBackground().mutate());
                DrawableCompat.setTintList(wrap, colorStateList);
                DrawableCompat.setTintMode(wrap, this.backgroundTintMode);
                if (wrap != getBackground()) {
                    super.setBackgroundDrawable(wrap);
                }
            }
        }

        @Override // android.view.View
        public void setBackgroundTintMode(PorterDuff.Mode mode) {
            this.backgroundTintMode = mode;
            if (getBackground() != null) {
                Drawable wrap = DrawableCompat.wrap(getBackground().mutate());
                DrawableCompat.setTintMode(wrap, mode);
                if (wrap != getBackground()) {
                    super.setBackgroundDrawable(wrap);
                }
            }
        }

        public void setOnAttachStateChangeListener(s sVar) {
            this.onAttachStateChangeListener = sVar;
        }

        @Override // android.view.View
        public void setOnClickListener(View.OnClickListener onClickListener) {
            View.OnTouchListener onTouchListener;
            if (onClickListener != null) {
                onTouchListener = null;
            } else {
                onTouchListener = consumeAllTouchListener;
            }
            setOnTouchListener(onTouchListener);
            super.setOnClickListener(onClickListener);
        }

        public void setOnLayoutChangeListener(t tVar) {
            this.onLayoutChangeListener = tVar;
        }

        public SnackbarBaseLayout(Context context, AttributeSet attributeSet) {
            super(bai.c(context, attributeSet, 0, 0), attributeSet);
            Context context2 = getContext();
            TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, R.styleable.SnackbarLayout);
            int i = R.styleable.SnackbarLayout_elevation;
            if (obtainStyledAttributes.hasValue(i)) {
                ViewCompat.setElevation(this, obtainStyledAttributes.getDimensionPixelSize(i, 0));
            }
            this.animationMode = obtainStyledAttributes.getInt(R.styleable.SnackbarLayout_animationMode, 0);
            this.backgroundOverlayColorAlpha = obtainStyledAttributes.getFloat(R.styleable.SnackbarLayout_backgroundOverlayColorAlpha, 1.0f);
            setBackgroundTintList(u9i.a(context2, obtainStyledAttributes, R.styleable.SnackbarLayout_backgroundTint));
            setBackgroundTintMode(ogw.i(obtainStyledAttributes.getInt(R.styleable.SnackbarLayout_backgroundTintMode, -1), PorterDuff.Mode.SRC_IN));
            this.actionTextColorAlpha = obtainStyledAttributes.getFloat(R.styleable.SnackbarLayout_actionTextColorAlpha, 1.0f);
            obtainStyledAttributes.recycle();
            setOnTouchListener(consumeAllTouchListener);
            setFocusable(true);
            if (getBackground() == null) {
                ViewCompat.setBackground(this, createThemedBackground());
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class a extends AnimatorListenerAdapter {
        public a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            BaseTransientBottomBar.this.G();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class b extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f5131a;

        public b(int i) {
            this.f5131a = i;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            BaseTransientBottomBar.this.F(this.f5131a);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class c implements ValueAnimator.AnimatorUpdateListener {
        public c() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            BaseTransientBottomBar.this.c.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class d implements ValueAnimator.AnimatorUpdateListener {
        public d() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            BaseTransientBottomBar.this.c.setScaleX(floatValue);
            BaseTransientBottomBar.this.c.setScaleY(floatValue);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class e extends AnimatorListenerAdapter {
        public e() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            BaseTransientBottomBar.this.G();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            BaseTransientBottomBar.this.d.animateContentIn(70, 180);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class f implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: collision with root package name */
        private int f5135a;
        final /* synthetic */ int b;

        public f(int i) {
            this.b = i;
            this.f5135a = i;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            int i = BaseTransientBottomBar.ANIMATION_MODE_SLIDE;
            BaseTransientBottomBar.this.c.setTranslationY(intValue);
            this.f5135a = intValue;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class g extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f5136a;

        public g(int i) {
            this.f5136a = i;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            BaseTransientBottomBar.this.F(this.f5136a);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            BaseTransientBottomBar.this.d.animateContentOut(0, 180);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class h implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: collision with root package name */
        private int f5137a = 0;

        public h() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            int i = BaseTransientBottomBar.ANIMATION_MODE_SLIDE;
            BaseTransientBottomBar.this.c.setTranslationY(intValue);
            this.f5137a = intValue;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class i implements Handler.Callback {
        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i = message.what;
            if (i == 0) {
                ((BaseTransientBottomBar) message.obj).M();
                return true;
            } else if (i != 1) {
                return false;
            } else {
                ((BaseTransientBottomBar) message.obj).B(message.arg1);
                return true;
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class j implements Runnable {
        public j() {
        }

        @Override // java.lang.Runnable
        public void run() {
            int w;
            BaseTransientBottomBar baseTransientBottomBar = BaseTransientBottomBar.this;
            if (baseTransientBottomBar.c != null && baseTransientBottomBar.b != null && (w = (BaseTransientBottomBar.this.w() - BaseTransientBottomBar.this.z()) + ((int) BaseTransientBottomBar.this.c.getTranslationY())) < BaseTransientBottomBar.this.k) {
                ViewGroup.LayoutParams layoutParams = BaseTransientBottomBar.this.c.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin += BaseTransientBottomBar.this.k - w;
                    BaseTransientBottomBar.this.c.requestLayout();
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class k implements OnApplyWindowInsetsListener {
        public k() {
        }

        @Override // androidx.core.view.OnApplyWindowInsetsListener
        public WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
            int systemWindowInsetBottom = windowInsetsCompat.getSystemWindowInsetBottom();
            BaseTransientBottomBar baseTransientBottomBar = BaseTransientBottomBar.this;
            baseTransientBottomBar.h = systemWindowInsetBottom;
            baseTransientBottomBar.i = windowInsetsCompat.getSystemWindowInsetLeft();
            baseTransientBottomBar.j = windowInsetsCompat.getSystemWindowInsetRight();
            baseTransientBottomBar.S();
            return windowInsetsCompat;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class l extends AccessibilityDelegateCompat {
        public l() {
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
            accessibilityNodeInfoCompat.addAction(1048576);
            accessibilityNodeInfoCompat.setDismissable(true);
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public boolean performAccessibilityAction(View view, int i, Bundle bundle) {
            if (i != 1048576) {
                return super.performAccessibilityAction(view, i, bundle);
            }
            BaseTransientBottomBar.this.p();
            return true;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class m implements a.b {
        public m() {
        }

        @Override // com.google.android.material.snackbar.a.b
        public void dismiss(int i) {
            Handler handler = BaseTransientBottomBar.n;
            handler.sendMessage(handler.obtainMessage(1, i, 0, BaseTransientBottomBar.this));
        }

        @Override // com.google.android.material.snackbar.a.b
        public void show() {
            Handler handler = BaseTransientBottomBar.n;
            handler.sendMessage(handler.obtainMessage(0, BaseTransientBottomBar.this));
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class n implements s {

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                BaseTransientBottomBar.this.F(3);
            }
        }

        public n() {
        }

        public void a(View view) {
            WindowInsets rootWindowInsets;
            Insets mandatorySystemGestureInsets;
            int i;
            if (Build.VERSION.SDK_INT >= 29) {
                BaseTransientBottomBar baseTransientBottomBar = BaseTransientBottomBar.this;
                rootWindowInsets = baseTransientBottomBar.c.getRootWindowInsets();
                if (rootWindowInsets != null) {
                    mandatorySystemGestureInsets = rootWindowInsets.getMandatorySystemGestureInsets();
                    i = mandatorySystemGestureInsets.bottom;
                    baseTransientBottomBar.k = i;
                    baseTransientBottomBar.S();
                }
            }
        }

        public void b(View view) {
            if (BaseTransientBottomBar.this.D()) {
                BaseTransientBottomBar.n.post(new a());
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class o implements t {
        public o() {
        }

        public void a(View view, int i, int i2, int i3, int i4) {
            BaseTransientBottomBar baseTransientBottomBar = BaseTransientBottomBar.this;
            baseTransientBottomBar.c.setOnLayoutChangeListener(null);
            baseTransientBottomBar.N();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class p implements SwipeDismissBehavior.c {
        public p() {
        }

        public void a(View view) {
            view.setVisibility(8);
            BaseTransientBottomBar.this.q(0);
        }

        public void b(int i) {
            BaseTransientBottomBar baseTransientBottomBar = BaseTransientBottomBar.this;
            if (i == 0) {
                com.google.android.material.snackbar.a.c().l(baseTransientBottomBar.m);
            } else if (i == 1 || i == 2) {
                com.google.android.material.snackbar.a.c().k(baseTransientBottomBar.m);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class q implements Runnable {
        public q() {
        }

        @Override // java.lang.Runnable
        public void run() {
            SnackbarBaseLayout snackbarBaseLayout = BaseTransientBottomBar.this.c;
            if (snackbarBaseLayout != null) {
                snackbarBaseLayout.setVisibility(0);
                if (BaseTransientBottomBar.this.c.getAnimationMode() == 1) {
                    BaseTransientBottomBar.this.O();
                } else {
                    BaseTransientBottomBar.this.Q();
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static class r {

        /* renamed from: a  reason: collision with root package name */
        public a.b f5146a;

        public r(SwipeDismissBehavior<?> swipeDismissBehavior) {
            swipeDismissBehavior.h(0.1f);
            swipeDismissBehavior.f(0.6f);
            swipeDismissBehavior.i(0);
        }

        public boolean a(View view) {
            return view instanceof SnackbarBaseLayout;
        }

        public void b(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked != 0) {
                if (actionMasked == 1 || actionMasked == 3) {
                    com.google.android.material.snackbar.a.c().l(this.f5146a);
                }
            } else if (coordinatorLayout.isPointInChildBounds(view, (int) motionEvent.getX(), (int) motionEvent.getY())) {
                com.google.android.material.snackbar.a.c().k(this.f5146a);
            }
        }

        public void c(BaseTransientBottomBar<?> baseTransientBottomBar) {
            this.f5146a = baseTransientBottomBar.m;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public interface s {
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public interface t {
    }

    public BaseTransientBottomBar(ViewGroup viewGroup, View view, fq4 fq4Var) {
        if (viewGroup == null) {
            throw new IllegalArgumentException("Transient bottom bar must have non-null parent");
        } else if (view == null) {
            throw new IllegalArgumentException("Transient bottom bar must have non-null content");
        } else if (fq4Var != null) {
            this.f5129a = viewGroup;
            this.d = fq4Var;
            Context context = viewGroup.getContext();
            this.b = context;
            xot.a(context);
            SnackbarBaseLayout snackbarBaseLayout = (SnackbarBaseLayout) LayoutInflater.from(context).inflate(x(), viewGroup, false);
            this.c = snackbarBaseLayout;
            if (view instanceof SnackbarContentLayout) {
                ((SnackbarContentLayout) view).updateActionTextColorAlphaIfNeeded(snackbarBaseLayout.getActionTextColorAlpha());
            }
            snackbarBaseLayout.addView(view);
            ViewGroup.LayoutParams layoutParams = snackbarBaseLayout.getLayoutParams();
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                this.g = new Rect(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
            }
            ViewCompat.setAccessibilityLiveRegion(snackbarBaseLayout, 1);
            ViewCompat.setImportantForAccessibility(snackbarBaseLayout, 1);
            ViewCompat.setFitsSystemWindows(snackbarBaseLayout, true);
            ViewCompat.setOnApplyWindowInsetsListener(snackbarBaseLayout, new k());
            ViewCompat.setAccessibilityDelegate(snackbarBaseLayout, new l());
            this.l = (AccessibilityManager) context.getSystemService("accessibility");
        } else {
            throw new IllegalArgumentException("Transient bottom bar must have non-null callback");
        }
    }

    public boolean A() {
        TypedArray obtainStyledAttributes = this.b.obtainStyledAttributes(o);
        int resourceId = obtainStyledAttributes.getResourceId(0, -1);
        obtainStyledAttributes.recycle();
        if (resourceId != -1) {
            return true;
        }
        return false;
    }

    public final void B(int i2) {
        if (!J() || this.c.getVisibility() != 0) {
            F(i2);
        } else {
            o(i2);
        }
    }

    public boolean C() {
        return com.google.android.material.snackbar.a.c().e(this.m);
    }

    public boolean D() {
        return com.google.android.material.snackbar.a.c().f(this.m);
    }

    public final boolean E() {
        ViewGroup.LayoutParams layoutParams = this.c.getLayoutParams();
        if (!(layoutParams instanceof CoordinatorLayout.LayoutParams) || !(((CoordinatorLayout.LayoutParams) layoutParams).getBehavior() instanceof SwipeDismissBehavior)) {
            return false;
        }
        return true;
    }

    public void F(int i2) {
        com.google.android.material.snackbar.a.c().i(this.m);
        SnackbarBaseLayout snackbarBaseLayout = this.c;
        ViewParent parent = snackbarBaseLayout.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(snackbarBaseLayout);
        }
    }

    public void G() {
        com.google.android.material.snackbar.a.c().j(this.m);
    }

    public B H(int i2) {
        this.e = i2;
        return this;
    }

    public final void I(CoordinatorLayout.LayoutParams layoutParams) {
        SwipeDismissBehavior<? extends View> u = u();
        ((Behavior) u).l(this);
        u.g(new p());
        layoutParams.setBehavior(u);
        layoutParams.insetEdge = 80;
    }

    public boolean J() {
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList = this.l.getEnabledAccessibilityServiceList(1);
        if (enabledAccessibilityServiceList == null || !enabledAccessibilityServiceList.isEmpty()) {
            return false;
        }
        return true;
    }

    public final boolean K() {
        if (this.k <= 0 || !E()) {
            return false;
        }
        return true;
    }

    public void L() {
        com.google.android.material.snackbar.a.c().n(t(), this.m);
    }

    public final void M() {
        n nVar = new n();
        SnackbarBaseLayout snackbarBaseLayout = this.c;
        snackbarBaseLayout.setOnAttachStateChangeListener(nVar);
        if (snackbarBaseLayout.getParent() == null) {
            ViewGroup.LayoutParams layoutParams = snackbarBaseLayout.getLayoutParams();
            if (layoutParams instanceof CoordinatorLayout.LayoutParams) {
                I((CoordinatorLayout.LayoutParams) layoutParams);
            }
            S();
            snackbarBaseLayout.setVisibility(4);
            this.f5129a.addView(snackbarBaseLayout);
        }
        if (ViewCompat.isLaidOut(snackbarBaseLayout)) {
            N();
        } else {
            snackbarBaseLayout.setOnLayoutChangeListener(new o());
        }
    }

    public final void N() {
        if (J()) {
            n();
            return;
        }
        this.c.setVisibility(0);
        G();
    }

    public final void O() {
        ValueAnimator r2 = r(0.0f, 1.0f);
        ValueAnimator v = v(0.8f, 1.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(r2, v);
        animatorSet.setDuration(150L);
        animatorSet.addListener(new a());
        animatorSet.start();
    }

    public final void P(int i2) {
        ValueAnimator r2 = r(1.0f, 0.0f);
        r2.setDuration(75L);
        r2.addListener(new b(i2));
        r2.start();
    }

    public final void Q() {
        int y = y();
        this.c.setTranslationY(y);
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setIntValues(y, 0);
        valueAnimator.setInterpolator(pz0.FAST_OUT_SLOW_IN_INTERPOLATOR);
        valueAnimator.setDuration(250L);
        valueAnimator.addListener(new e());
        valueAnimator.addUpdateListener(new f(y));
        valueAnimator.start();
    }

    public final void R(int i2) {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setIntValues(0, y());
        valueAnimator.setInterpolator(pz0.FAST_OUT_SLOW_IN_INTERPOLATOR);
        valueAnimator.setDuration(250L);
        valueAnimator.addListener(new g(i2));
        valueAnimator.addUpdateListener(new h());
        valueAnimator.start();
    }

    public final void S() {
        Rect rect;
        SnackbarBaseLayout snackbarBaseLayout = this.c;
        ViewGroup.LayoutParams layoutParams = snackbarBaseLayout.getLayoutParams();
        if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (rect = this.g) != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.bottomMargin = rect.bottom + this.h;
            marginLayoutParams.leftMargin = rect.left + this.i;
            marginLayoutParams.rightMargin = rect.right + this.j;
            snackbarBaseLayout.requestLayout();
            if (Build.VERSION.SDK_INT >= 29 && K()) {
                Runnable runnable = this.f;
                snackbarBaseLayout.removeCallbacks(runnable);
                snackbarBaseLayout.post(runnable);
            }
        }
    }

    public void n() {
        this.c.post(new q());
    }

    public final void o(int i2) {
        if (this.c.getAnimationMode() == 1) {
            P(i2);
        } else {
            R(i2);
        }
    }

    public void p() {
        q(3);
    }

    public void q(int i2) {
        com.google.android.material.snackbar.a.c().b(this.m, i2);
    }

    public final ValueAnimator r(float... fArr) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
        ofFloat.setInterpolator(pz0.LINEAR_INTERPOLATOR);
        ofFloat.addUpdateListener(new c());
        return ofFloat;
    }

    public Context s() {
        return this.b;
    }

    public int t() {
        return this.e;
    }

    public SwipeDismissBehavior<? extends View> u() {
        return new Behavior();
    }

    public final ValueAnimator v(float... fArr) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
        ofFloat.setInterpolator(pz0.LINEAR_OUT_SLOW_IN_INTERPOLATOR);
        ofFloat.addUpdateListener(new d());
        return ofFloat;
    }

    public final int w() {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        ((WindowManager) this.b.getSystemService(pg1.ATOM_EXT_window)).getDefaultDisplay().getRealMetrics(displayMetrics);
        return displayMetrics.heightPixels;
    }

    public int x() {
        if (A()) {
            return R.layout.mtrl_layout_snackbar;
        }
        return R.layout.design_layout_snackbar;
    }

    public final int y() {
        SnackbarBaseLayout snackbarBaseLayout = this.c;
        int height = snackbarBaseLayout.getHeight();
        ViewGroup.LayoutParams layoutParams = snackbarBaseLayout.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return height + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
        }
        return height;
    }

    public final int z() {
        int[] iArr = new int[2];
        SnackbarBaseLayout snackbarBaseLayout = this.c;
        snackbarBaseLayout.getLocationOnScreen(iArr);
        return iArr[1] + snackbarBaseLayout.getHeight();
    }
}
