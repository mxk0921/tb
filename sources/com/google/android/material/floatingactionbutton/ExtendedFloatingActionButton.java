package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.ViewCompat;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.button.MaterialButton;
import com.taobao.taobao.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import tb.i1j;
import tb.qd7;
import tb.uz0;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class ExtendedFloatingActionButton extends MaterialButton implements CoordinatorLayout.AttachedBehavior {
    private static final int ANIM_STATE_HIDING = 1;
    private static final int ANIM_STATE_NONE = 0;
    private static final int ANIM_STATE_SHOWING = 2;
    private int animState;
    private final CoordinatorLayout.Behavior<ExtendedFloatingActionButton> behavior;
    private final uz0 changeVisibilityTracker;
    private final com.google.android.material.floatingactionbutton.c extendStrategy;
    private final com.google.android.material.floatingactionbutton.c hideStrategy;
    private boolean isExtended;
    private final com.google.android.material.floatingactionbutton.c showStrategy;
    private final com.google.android.material.floatingactionbutton.c shrinkStrategy;
    private static final int DEF_STYLE_RES = R.style.Widget_MaterialComponents_ExtendedFloatingActionButton_Icon;
    static final Property<View, Float> WIDTH = new d(Float.class, "width");
    static final Property<View, Float> HEIGHT = new e(Float.class, "height");

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class a implements j {
        public a() {
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.j
        public ViewGroup.LayoutParams a() {
            return new ViewGroup.LayoutParams(-2, -2);
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.j
        public int getHeight() {
            return ExtendedFloatingActionButton.this.getMeasuredHeight();
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.j
        public int getWidth() {
            return ExtendedFloatingActionButton.this.getMeasuredWidth();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class b implements j {
        public b() {
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.j
        public ViewGroup.LayoutParams a() {
            return new ViewGroup.LayoutParams(getWidth(), getHeight());
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.j
        public int getHeight() {
            return ExtendedFloatingActionButton.this.getCollapsedSize();
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.j
        public int getWidth() {
            return ExtendedFloatingActionButton.this.getCollapsedSize();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class c extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ com.google.android.material.floatingactionbutton.c f5088a;

        public c(ExtendedFloatingActionButton extendedFloatingActionButton, com.google.android.material.floatingactionbutton.c cVar, h hVar) {
            this.f5088a = cVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f5088a.c();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f5088a.onAnimationEnd();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            this.f5088a.onAnimationStart(animator);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class d extends Property<View, Float> {
        public d(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public Float get(View view) {
            return Float.valueOf(view.getLayoutParams().width);
        }

        /* renamed from: b */
        public void set(View view, Float f) {
            view.getLayoutParams().width = f.intValue();
            view.requestLayout();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class e extends Property<View, Float> {
        public e(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public Float get(View view) {
            return Float.valueOf(view.getLayoutParams().height);
        }

        /* renamed from: b */
        public void set(View view, Float f) {
            view.getLayoutParams().height = f.intValue();
            view.requestLayout();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class g extends com.google.android.material.floatingactionbutton.a {
        public boolean g;

        public g(uz0 uz0Var) {
            super(ExtendedFloatingActionButton.this, uz0Var);
        }

        @Override // com.google.android.material.floatingactionbutton.c
        public boolean a() {
            return ExtendedFloatingActionButton.this.isOrWillBeHidden();
        }

        @Override // com.google.android.material.floatingactionbutton.c
        public int b() {
            return R.animator.mtrl_extended_fab_hide_motion_spec;
        }

        @Override // com.google.android.material.floatingactionbutton.a, com.google.android.material.floatingactionbutton.c
        public void c() {
            super.c();
            this.g = true;
        }

        @Override // com.google.android.material.floatingactionbutton.c
        public void e() {
            ExtendedFloatingActionButton.this.setVisibility(8);
        }

        @Override // com.google.android.material.floatingactionbutton.a, com.google.android.material.floatingactionbutton.c
        public void onAnimationEnd() {
            super.onAnimationEnd();
            ExtendedFloatingActionButton extendedFloatingActionButton = ExtendedFloatingActionButton.this;
            extendedFloatingActionButton.animState = 0;
            if (!this.g) {
                extendedFloatingActionButton.setVisibility(8);
            }
        }

        @Override // com.google.android.material.floatingactionbutton.a, com.google.android.material.floatingactionbutton.c
        public void onAnimationStart(Animator animator) {
            super.onAnimationStart(animator);
            this.g = false;
            ExtendedFloatingActionButton extendedFloatingActionButton = ExtendedFloatingActionButton.this;
            extendedFloatingActionButton.setVisibility(0);
            extendedFloatingActionButton.animState = 1;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static abstract class h {
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class i extends com.google.android.material.floatingactionbutton.a {
        public i(uz0 uz0Var) {
            super(ExtendedFloatingActionButton.this, uz0Var);
        }

        @Override // com.google.android.material.floatingactionbutton.c
        public boolean a() {
            return ExtendedFloatingActionButton.this.isOrWillBeShown();
        }

        @Override // com.google.android.material.floatingactionbutton.c
        public int b() {
            return R.animator.mtrl_extended_fab_show_motion_spec;
        }

        @Override // com.google.android.material.floatingactionbutton.c
        public void e() {
            ExtendedFloatingActionButton extendedFloatingActionButton = ExtendedFloatingActionButton.this;
            extendedFloatingActionButton.setVisibility(0);
            extendedFloatingActionButton.setAlpha(1.0f);
            extendedFloatingActionButton.setScaleY(1.0f);
            extendedFloatingActionButton.setScaleX(1.0f);
        }

        @Override // com.google.android.material.floatingactionbutton.a, com.google.android.material.floatingactionbutton.c
        public void onAnimationEnd() {
            super.onAnimationEnd();
            ExtendedFloatingActionButton.this.animState = 0;
        }

        @Override // com.google.android.material.floatingactionbutton.a, com.google.android.material.floatingactionbutton.c
        public void onAnimationStart(Animator animator) {
            super.onAnimationStart(animator);
            ExtendedFloatingActionButton extendedFloatingActionButton = ExtendedFloatingActionButton.this;
            extendedFloatingActionButton.setVisibility(0);
            extendedFloatingActionButton.animState = 2;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public interface j {
        ViewGroup.LayoutParams a();

        int getHeight();

        int getWidth();
    }

    public ExtendedFloatingActionButton(Context context) {
        this(context, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isOrWillBeHidden() {
        if (getVisibility() == 0) {
            if (this.animState == 1) {
                return true;
            }
            return false;
        } else if (this.animState != 2) {
            return true;
        } else {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isOrWillBeShown() {
        if (getVisibility() != 0) {
            if (this.animState == 2) {
                return true;
            }
            return false;
        } else if (this.animState != 1) {
            return true;
        } else {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void performMotion(com.google.android.material.floatingactionbutton.c cVar, h hVar) {
        if (!cVar.a()) {
            if (!shouldAnimateVisibilityChange()) {
                cVar.e();
                return;
            }
            measure(0, 0);
            AnimatorSet d2 = cVar.d();
            d2.addListener(new c(this, cVar, hVar));
            Iterator it = ((ArrayList) ((com.google.android.material.floatingactionbutton.a) cVar).i()).iterator();
            while (it.hasNext()) {
                d2.addListener((Animator.AnimatorListener) it.next());
            }
            d2.start();
        }
    }

    private boolean shouldAnimateVisibilityChange() {
        if (!ViewCompat.isLaidOut(this) || isInEditMode()) {
            return false;
        }
        return true;
    }

    public void addOnExtendAnimationListener(Animator.AnimatorListener animatorListener) {
        ((com.google.android.material.floatingactionbutton.a) this.extendStrategy).f(animatorListener);
    }

    public void addOnHideAnimationListener(Animator.AnimatorListener animatorListener) {
        ((com.google.android.material.floatingactionbutton.a) this.hideStrategy).f(animatorListener);
    }

    public void addOnShowAnimationListener(Animator.AnimatorListener animatorListener) {
        ((com.google.android.material.floatingactionbutton.a) this.showStrategy).f(animatorListener);
    }

    public void addOnShrinkAnimationListener(Animator.AnimatorListener animatorListener) {
        ((com.google.android.material.floatingactionbutton.a) this.shrinkStrategy).f(animatorListener);
    }

    public void extend() {
        performMotion(this.extendStrategy, null);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AttachedBehavior
    public CoordinatorLayout.Behavior<ExtendedFloatingActionButton> getBehavior() {
        return this.behavior;
    }

    public int getCollapsedSize() {
        return (Math.min(ViewCompat.getPaddingStart(this), ViewCompat.getPaddingEnd(this)) * 2) + getIconSize();
    }

    public i1j getExtendMotionSpec() {
        return ((com.google.android.material.floatingactionbutton.a) this.extendStrategy).j();
    }

    public i1j getHideMotionSpec() {
        return ((com.google.android.material.floatingactionbutton.a) this.hideStrategy).j();
    }

    public i1j getShowMotionSpec() {
        return ((com.google.android.material.floatingactionbutton.a) this.showStrategy).j();
    }

    public i1j getShrinkMotionSpec() {
        return ((com.google.android.material.floatingactionbutton.a) this.shrinkStrategy).j();
    }

    public void hide() {
        performMotion(this.hideStrategy, null);
    }

    public final boolean isExtended() {
        return this.isExtended;
    }

    @Override // com.google.android.material.button.MaterialButton, android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.isExtended && TextUtils.isEmpty(getText()) && getIcon() != null) {
            this.isExtended = false;
            this.shrinkStrategy.e();
        }
    }

    public void removeOnExtendAnimationListener(Animator.AnimatorListener animatorListener) {
        ((com.google.android.material.floatingactionbutton.a) this.extendStrategy).k(animatorListener);
    }

    public void removeOnHideAnimationListener(Animator.AnimatorListener animatorListener) {
        ((com.google.android.material.floatingactionbutton.a) this.hideStrategy).k(animatorListener);
    }

    public void removeOnShowAnimationListener(Animator.AnimatorListener animatorListener) {
        ((com.google.android.material.floatingactionbutton.a) this.showStrategy).k(animatorListener);
    }

    public void removeOnShrinkAnimationListener(Animator.AnimatorListener animatorListener) {
        ((com.google.android.material.floatingactionbutton.a) this.shrinkStrategy).k(animatorListener);
    }

    public void setExtendMotionSpec(i1j i1jVar) {
        ((com.google.android.material.floatingactionbutton.a) this.extendStrategy).l(i1jVar);
    }

    public void setExtendMotionSpecResource(int i2) {
        setExtendMotionSpec(i1j.d(getContext(), i2));
    }

    public void setExtended(boolean z) {
        com.google.android.material.floatingactionbutton.c cVar;
        if (this.isExtended != z) {
            if (z) {
                cVar = this.extendStrategy;
            } else {
                cVar = this.shrinkStrategy;
            }
            if (!cVar.a()) {
                cVar.e();
            }
        }
    }

    public void setHideMotionSpec(i1j i1jVar) {
        ((com.google.android.material.floatingactionbutton.a) this.hideStrategy).l(i1jVar);
    }

    public void setHideMotionSpecResource(int i2) {
        setHideMotionSpec(i1j.d(getContext(), i2));
    }

    public void setShowMotionSpec(i1j i1jVar) {
        ((com.google.android.material.floatingactionbutton.a) this.showStrategy).l(i1jVar);
    }

    public void setShowMotionSpecResource(int i2) {
        setShowMotionSpec(i1j.d(getContext(), i2));
    }

    public void setShrinkMotionSpec(i1j i1jVar) {
        ((com.google.android.material.floatingactionbutton.a) this.shrinkStrategy).l(i1jVar);
    }

    public void setShrinkMotionSpecResource(int i2) {
        setShrinkMotionSpec(i1j.d(getContext(), i2));
    }

    public void show() {
        performMotion(this.showStrategy, null);
    }

    public void shrink() {
        performMotion(this.shrinkStrategy, null);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class f extends com.google.android.material.floatingactionbutton.a {
        public final j g;
        public final boolean h;

        public f(uz0 uz0Var, j jVar, boolean z) {
            super(ExtendedFloatingActionButton.this, uz0Var);
            this.g = jVar;
            this.h = z;
        }

        @Override // com.google.android.material.floatingactionbutton.c
        public boolean a() {
            ExtendedFloatingActionButton extendedFloatingActionButton = ExtendedFloatingActionButton.this;
            if (this.h == extendedFloatingActionButton.isExtended || extendedFloatingActionButton.getIcon() == null || TextUtils.isEmpty(extendedFloatingActionButton.getText())) {
                return true;
            }
            return false;
        }

        @Override // com.google.android.material.floatingactionbutton.c
        public int b() {
            return R.animator.mtrl_extended_fab_change_size_motion_spec;
        }

        @Override // com.google.android.material.floatingactionbutton.c
        public void e() {
            ExtendedFloatingActionButton extendedFloatingActionButton = ExtendedFloatingActionButton.this;
            extendedFloatingActionButton.isExtended = this.h;
            ViewGroup.LayoutParams layoutParams = extendedFloatingActionButton.getLayoutParams();
            if (layoutParams != null) {
                j jVar = this.g;
                layoutParams.width = jVar.a().width;
                layoutParams.height = jVar.a().height;
                extendedFloatingActionButton.requestLayout();
            }
        }

        @Override // com.google.android.material.floatingactionbutton.a, com.google.android.material.floatingactionbutton.c
        public void onAnimationEnd() {
            super.onAnimationEnd();
            ExtendedFloatingActionButton extendedFloatingActionButton = ExtendedFloatingActionButton.this;
            extendedFloatingActionButton.setHorizontallyScrolling(false);
            ViewGroup.LayoutParams layoutParams = extendedFloatingActionButton.getLayoutParams();
            if (layoutParams != null) {
                j jVar = this.g;
                layoutParams.width = jVar.a().width;
                layoutParams.height = jVar.a().height;
            }
        }

        @Override // com.google.android.material.floatingactionbutton.a, com.google.android.material.floatingactionbutton.c
        public void onAnimationStart(Animator animator) {
            super.onAnimationStart(animator);
            ExtendedFloatingActionButton extendedFloatingActionButton = ExtendedFloatingActionButton.this;
            extendedFloatingActionButton.isExtended = this.h;
            extendedFloatingActionButton.setHorizontallyScrolling(true);
        }

        @Override // com.google.android.material.floatingactionbutton.a, com.google.android.material.floatingactionbutton.c
        public AnimatorSet d() {
            i1j h = h();
            boolean j = h.j("width");
            j jVar = this.g;
            ExtendedFloatingActionButton extendedFloatingActionButton = ExtendedFloatingActionButton.this;
            if (j) {
                PropertyValuesHolder[] g = h.g("width");
                g[0].setFloatValues(extendedFloatingActionButton.getWidth(), jVar.getWidth());
                h.l("width", g);
            }
            if (h.j("height")) {
                PropertyValuesHolder[] g2 = h.g("height");
                g2[0].setFloatValues(extendedFloatingActionButton.getHeight(), jVar.getHeight());
                h.l("height", g2);
            }
            return g(h);
        }
    }

    public ExtendedFloatingActionButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.extendedFloatingActionButtonStyle);
    }

    public void extend(h hVar) {
        performMotion(this.extendStrategy, hVar);
    }

    public void hide(h hVar) {
        performMotion(this.hideStrategy, hVar);
    }

    public void show(h hVar) {
        performMotion(this.showStrategy, hVar);
    }

    public void shrink(h hVar) {
        performMotion(this.shrinkStrategy, hVar);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static class ExtendedFloatingActionButtonBehavior<T extends ExtendedFloatingActionButton> extends CoordinatorLayout.Behavior<T> {

        /* renamed from: a  reason: collision with root package name */
        public Rect f5085a;
        public final boolean b;
        public final boolean c;

        public ExtendedFloatingActionButtonBehavior() {
            this.b = false;
            this.c = true;
        }

        public static boolean c(View view) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof CoordinatorLayout.LayoutParams) {
                return ((CoordinatorLayout.LayoutParams) layoutParams).getBehavior() instanceof BottomSheetBehavior;
            }
            return false;
        }

        public void a(ExtendedFloatingActionButton extendedFloatingActionButton) {
            extendedFloatingActionButton.performMotion(this.c ? extendedFloatingActionButton.extendStrategy : extendedFloatingActionButton.showStrategy, null);
        }

        /* renamed from: b */
        public boolean getInsetDodgeRect(CoordinatorLayout coordinatorLayout, ExtendedFloatingActionButton extendedFloatingActionButton, Rect rect) {
            return super.getInsetDodgeRect(coordinatorLayout, extendedFloatingActionButton, rect);
        }

        public boolean d(CoordinatorLayout coordinatorLayout, ExtendedFloatingActionButton extendedFloatingActionButton, View view) {
            if (view instanceof AppBarLayout) {
                h(coordinatorLayout, (AppBarLayout) view, extendedFloatingActionButton);
                return false;
            } else if (!c(view)) {
                return false;
            } else {
                i(view, extendedFloatingActionButton);
                return false;
            }
        }

        public boolean e(CoordinatorLayout coordinatorLayout, ExtendedFloatingActionButton extendedFloatingActionButton, int i) {
            List<View> dependencies = coordinatorLayout.getDependencies(extendedFloatingActionButton);
            int size = dependencies.size();
            for (int i2 = 0; i2 < size; i2++) {
                View view = dependencies.get(i2);
                if (!(view instanceof AppBarLayout)) {
                    if (c(view) && i(view, extendedFloatingActionButton)) {
                        break;
                    }
                } else if (h(coordinatorLayout, (AppBarLayout) view, extendedFloatingActionButton)) {
                    break;
                }
            }
            coordinatorLayout.onLayoutChild(extendedFloatingActionButton, i);
            return true;
        }

        public final boolean f(View view, ExtendedFloatingActionButton extendedFloatingActionButton) {
            CoordinatorLayout.LayoutParams layoutParams = (CoordinatorLayout.LayoutParams) extendedFloatingActionButton.getLayoutParams();
            if ((this.b || this.c) && layoutParams.getAnchorId() == view.getId()) {
                return true;
            }
            return false;
        }

        public void g(ExtendedFloatingActionButton extendedFloatingActionButton) {
            extendedFloatingActionButton.performMotion(this.c ? extendedFloatingActionButton.shrinkStrategy : extendedFloatingActionButton.hideStrategy, null);
        }

        public final boolean h(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, ExtendedFloatingActionButton extendedFloatingActionButton) {
            if (!f(appBarLayout, extendedFloatingActionButton)) {
                return false;
            }
            if (this.f5085a == null) {
                this.f5085a = new Rect();
            }
            Rect rect = this.f5085a;
            qd7.a(coordinatorLayout, appBarLayout, rect);
            if (rect.bottom <= appBarLayout.getMinimumHeightForVisibleOverlappingContent()) {
                g(extendedFloatingActionButton);
                return true;
            }
            a(extendedFloatingActionButton);
            return true;
        }

        public final boolean i(View view, ExtendedFloatingActionButton extendedFloatingActionButton) {
            if (!f(view, extendedFloatingActionButton)) {
                return false;
            }
            if (view.getTop() < (extendedFloatingActionButton.getHeight() / 2) + ((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.LayoutParams) extendedFloatingActionButton.getLayoutParams())).topMargin) {
                g(extendedFloatingActionButton);
                return true;
            }
            a(extendedFloatingActionButton);
            return true;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public void onAttachedToLayoutParams(CoordinatorLayout.LayoutParams layoutParams) {
            if (layoutParams.dodgeInsetEdges == 0) {
                layoutParams.dodgeInsetEdges = 80;
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public /* bridge */ /* synthetic */ boolean onDependentViewChanged(CoordinatorLayout coordinatorLayout, View view, View view2) {
            d(coordinatorLayout, (ExtendedFloatingActionButton) view, view2);
            return false;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public /* bridge */ /* synthetic */ boolean onLayoutChild(CoordinatorLayout coordinatorLayout, View view, int i) {
            e(coordinatorLayout, (ExtendedFloatingActionButton) view, i);
            return true;
        }

        public ExtendedFloatingActionButtonBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.ExtendedFloatingActionButton_Behavior_Layout);
            this.b = obtainStyledAttributes.getBoolean(R.styleable.ExtendedFloatingActionButton_Behavior_Layout_behavior_autoHide, false);
            this.c = obtainStyledAttributes.getBoolean(R.styleable.ExtendedFloatingActionButton_Behavior_Layout_behavior_autoShrink, true);
            obtainStyledAttributes.recycle();
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public ExtendedFloatingActionButton(android.content.Context r17, android.util.AttributeSet r18, int r19) {
        /*
            r16 = this;
            r0 = r16
            r7 = r18
            r8 = r19
            int r9 = com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.DEF_STYLE_RES
            r1 = r17
            android.content.Context r1 = tb.bai.c(r1, r7, r8, r9)
            r0.<init>(r1, r7, r8)
            r10 = 0
            r0.animState = r10
            tb.uz0 r1 = new tb.uz0
            r1.<init>()
            r0.changeVisibilityTracker = r1
            com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$i r11 = new com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$i
            r11.<init>(r1)
            r0.showStrategy = r11
            com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$g r12 = new com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$g
            r12.<init>(r1)
            r0.hideStrategy = r12
            r13 = 1
            r0.isExtended = r13
            android.content.Context r14 = r16.getContext()
            com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$ExtendedFloatingActionButtonBehavior r1 = new com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$ExtendedFloatingActionButtonBehavior
            r1.<init>(r14, r7)
            r0.behavior = r1
            int[] r3 = com.taobao.taobao.R.styleable.ExtendedFloatingActionButton
            int[] r6 = new int[r10]
            r1 = r14
            r2 = r18
            r4 = r19
            r5 = r9
            android.content.res.TypedArray r1 = tb.xot.h(r1, r2, r3, r4, r5, r6)
            int r2 = com.taobao.taobao.R.styleable.ExtendedFloatingActionButton_showMotionSpec
            tb.i1j r2 = tb.i1j.c(r14, r1, r2)
            int r3 = com.taobao.taobao.R.styleable.ExtendedFloatingActionButton_hideMotionSpec
            tb.i1j r3 = tb.i1j.c(r14, r1, r3)
            int r4 = com.taobao.taobao.R.styleable.ExtendedFloatingActionButton_extendMotionSpec
            tb.i1j r4 = tb.i1j.c(r14, r1, r4)
            int r5 = com.taobao.taobao.R.styleable.ExtendedFloatingActionButton_shrinkMotionSpec
            tb.i1j r5 = tb.i1j.c(r14, r1, r5)
            tb.uz0 r6 = new tb.uz0
            r6.<init>()
            com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$f r15 = new com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$f
            com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$a r10 = new com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$a
            r10.<init>()
            r15.<init>(r6, r10, r13)
            r0.extendStrategy = r15
            com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$f r10 = new com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$f
            com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$b r13 = new com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$b
            r13.<init>()
            r7 = 0
            r10.<init>(r6, r13, r7)
            r0.shrinkStrategy = r10
            r11.l(r2)
            r12.l(r3)
            r15.l(r4)
            r10.l(r5)
            r1.recycle()
            tb.hu4 r1 = com.google.android.material.shape.a.PILL
            r2 = r18
            com.google.android.material.shape.a$b r1 = com.google.android.material.shape.a.g(r14, r2, r8, r9, r1)
            com.google.android.material.shape.a r1 = r1.m()
            r0.setShapeAppearanceModel(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }
}
