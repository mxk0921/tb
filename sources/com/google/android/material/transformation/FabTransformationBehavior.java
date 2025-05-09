package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Pair;
import android.util.Property;
import android.view.View;
import android.view.ViewAnimationUtils;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.ViewCompat;
import com.google.android.material.circularreveal.CircularRevealHelper;
import com.google.android.material.circularreveal.b;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.taobao.taobao.R;
import java.util.ArrayList;
import java.util.List;
import tb.ex7;
import tb.hb1;
import tb.hjm;
import tb.i1j;
import tb.j1j;
import tb.lai;
import tb.nr3;
import tb.pz0;
import tb.tz0;

/* compiled from: Taobao */
@Deprecated
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public abstract class FabTransformationBehavior extends ExpandableTransformationBehavior {
    public final Rect c;
    public final RectF d;
    public final RectF e;
    public final int[] f;
    public float g;
    public float h;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class a extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ boolean f5189a;
        public final /* synthetic */ View b;
        public final /* synthetic */ View c;

        public a(FabTransformationBehavior fabTransformationBehavior, boolean z, View view, View view2) {
            this.f5189a = z;
            this.b = view;
            this.c = view2;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (!this.f5189a) {
                this.b.setVisibility(4);
                View view = this.c;
                view.setAlpha(1.0f);
                view.setVisibility(0);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            if (this.f5189a) {
                this.b.setVisibility(0);
                View view = this.c;
                view.setAlpha(0.0f);
                view.setVisibility(4);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class b implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ View f5190a;

        public b(View view) {
            this.f5190a = view;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.f5190a.invalidate();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class c extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ com.google.android.material.circularreveal.b f5191a;
        public final /* synthetic */ Drawable b;

        public c(FabTransformationBehavior fabTransformationBehavior, com.google.android.material.circularreveal.b bVar, Drawable drawable) {
            this.f5191a = bVar;
            this.b = drawable;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f5191a.setCircularRevealOverlayDrawable(null);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            this.f5191a.setCircularRevealOverlayDrawable(this.b);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class d extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ com.google.android.material.circularreveal.b f5192a;

        public d(FabTransformationBehavior fabTransformationBehavior, com.google.android.material.circularreveal.b bVar) {
            this.f5192a = bVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            com.google.android.material.circularreveal.b bVar = this.f5192a;
            b.e revealInfo = bVar.getRevealInfo();
            revealInfo.c = Float.MAX_VALUE;
            bVar.setRevealInfo(revealInfo);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static class e {

        /* renamed from: a  reason: collision with root package name */
        public i1j f5193a;
        public hjm b;
    }

    public FabTransformationBehavior() {
        this.c = new Rect();
        this.d = new RectF();
        this.e = new RectF();
        this.f = new int[2];
    }

    public abstract e A(Context context, boolean z);

    public final ViewGroup B(View view) {
        if (view instanceof ViewGroup) {
            return (ViewGroup) view;
        }
        return null;
    }

    @Override // com.google.android.material.transformation.ExpandableTransformationBehavior
    public AnimatorSet f(View view, View view2, boolean z, boolean z2) {
        e A = A(view2.getContext(), z);
        if (z) {
            this.g = view.getTranslationX();
            this.h = view.getTranslationY();
        }
        List<Animator> arrayList = new ArrayList<>();
        ArrayList arrayList2 = new ArrayList();
        t(view, view2, z, z2, A, arrayList, arrayList2);
        RectF rectF = this.d;
        y(view, view2, z, z2, A, arrayList, arrayList2, rectF);
        float width = rectF.width();
        float height = rectF.height();
        s(view, view2, z, A, arrayList);
        v(view, view2, z, z2, A, arrayList, arrayList2);
        u(view, view2, z, z2, A, width, height, arrayList, arrayList2);
        r(view, view2, z, z2, A, arrayList, arrayList2);
        q(view, view2, z, z2, A, arrayList, arrayList2);
        AnimatorSet animatorSet = new AnimatorSet();
        tz0.a(animatorSet, arrayList);
        animatorSet.addListener(new a(this, z, view2, view));
        int size = arrayList2.size();
        for (int i = 0; i < size; i++) {
            animatorSet.addListener((Animator.AnimatorListener) arrayList2.get(i));
        }
        return animatorSet;
    }

    public final ViewGroup g(View view) {
        View findViewById = view.findViewById(R.id.mtrl_child_content_container);
        if (findViewById != null) {
            return B(findViewById);
        }
        if ((view instanceof TransformationChildLayout) || (view instanceof TransformationChildCard)) {
            return B(((ViewGroup) view).getChildAt(0));
        }
        return B(view);
    }

    public final void h(View view, e eVar, j1j j1jVar, j1j j1jVar2, float f, float f2, float f3, float f4, RectF rectF) {
        float o = o(eVar, j1jVar, f, f3);
        float o2 = o(eVar, j1jVar2, f2, f4);
        Rect rect = this.c;
        view.getWindowVisibleDisplayFrame(rect);
        RectF rectF2 = this.d;
        rectF2.set(rect);
        RectF rectF3 = this.e;
        p(view, rectF3);
        rectF3.offset(o, o2);
        rectF3.intersect(rectF2);
        rectF.set(rectF3);
    }

    public final void i(View view, RectF rectF) {
        p(view, rectF);
        rectF.offset(this.g, this.h);
    }

    public final float k(View view, View view2, hjm hjmVar) {
        RectF rectF = this.d;
        RectF rectF2 = this.e;
        i(view, rectF);
        p(view2, rectF2);
        rectF2.offset(-m(view, view2, hjmVar), 0.0f);
        return rectF.centerX() - rectF2.left;
    }

    public final float l(View view, View view2, hjm hjmVar) {
        RectF rectF = this.d;
        RectF rectF2 = this.e;
        i(view, rectF);
        p(view2, rectF2);
        rectF2.offset(0.0f, -n(view, view2, hjmVar));
        return rectF.centerY() - rectF2.top;
    }

    @Override // com.google.android.material.transformation.ExpandableBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean layoutDependsOn(CoordinatorLayout coordinatorLayout, View view, View view2) {
        if (view.getVisibility() == 8) {
            throw new IllegalStateException("This behavior cannot be attached to a GONE view. Set the view to INVISIBLE instead.");
        } else if (!(view2 instanceof FloatingActionButton)) {
            return false;
        } else {
            int expandedComponentIdHint = ((FloatingActionButton) view2).getExpandedComponentIdHint();
            if (expandedComponentIdHint == 0 || expandedComponentIdHint == view.getId()) {
                return true;
            }
            return false;
        }
    }

    public final float m(View view, View view2, hjm hjmVar) {
        RectF rectF = this.d;
        RectF rectF2 = this.e;
        i(view, rectF);
        p(view2, rectF2);
        hjmVar.getClass();
        return (rectF2.centerX() - rectF.centerX()) + 0.0f;
    }

    public final float n(View view, View view2, hjm hjmVar) {
        RectF rectF = this.d;
        RectF rectF2 = this.e;
        i(view, rectF);
        p(view2, rectF2);
        hjmVar.getClass();
        return (rectF2.centerY() - rectF.centerY()) + 0.0f;
    }

    public final float o(e eVar, j1j j1jVar, float f, float f2) {
        long c2 = j1jVar.c();
        long d2 = j1jVar.d();
        j1j h = eVar.f5193a.h("expansion");
        return pz0.a(f, f2, j1jVar.e().getInterpolation(((float) (((h.c() + h.d()) + 17) - c2)) / ((float) d2)));
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public void onAttachedToLayoutParams(CoordinatorLayout.LayoutParams layoutParams) {
        if (layoutParams.dodgeInsetEdges == 0) {
            layoutParams.dodgeInsetEdges = 80;
        }
    }

    public final void p(View view, RectF rectF) {
        rectF.set(0.0f, 0.0f, view.getWidth(), view.getHeight());
        int[] iArr = this.f;
        view.getLocationInWindow(iArr);
        rectF.offsetTo(iArr[0], iArr[1]);
        rectF.offset((int) (-view.getTranslationX()), (int) (-view.getTranslationY()));
    }

    public final void q(View view, View view2, boolean z, boolean z2, e eVar, List<Animator> list, List<Animator.AnimatorListener> list2) {
        ViewGroup g;
        ObjectAnimator objectAnimator;
        if (view2 instanceof ViewGroup) {
            if ((!(view2 instanceof com.google.android.material.circularreveal.b) || CircularRevealHelper.STRATEGY != 0) && (g = g(view2)) != null) {
                if (z) {
                    if (!z2) {
                        nr3.CHILDREN_ALPHA.set(g, Float.valueOf(0.0f));
                    }
                    objectAnimator = ObjectAnimator.ofFloat(g, nr3.CHILDREN_ALPHA, 1.0f);
                } else {
                    objectAnimator = ObjectAnimator.ofFloat(g, nr3.CHILDREN_ALPHA, 0.0f);
                }
                eVar.f5193a.h("contentFade").a(objectAnimator);
                list.add(objectAnimator);
            }
        }
    }

    public final void r(View view, View view2, boolean z, boolean z2, e eVar, List<Animator> list, List<Animator.AnimatorListener> list2) {
        ObjectAnimator objectAnimator;
        if (view2 instanceof com.google.android.material.circularreveal.b) {
            com.google.android.material.circularreveal.b bVar = (com.google.android.material.circularreveal.b) view2;
            int z3 = z(view);
            int i = 16777215 & z3;
            if (z) {
                if (!z2) {
                    bVar.setCircularRevealScrimColor(z3);
                }
                objectAnimator = ObjectAnimator.ofInt(bVar, b.d.CIRCULAR_REVEAL_SCRIM_COLOR, i);
            } else {
                objectAnimator = ObjectAnimator.ofInt(bVar, b.d.CIRCULAR_REVEAL_SCRIM_COLOR, z3);
            }
            objectAnimator.setEvaluator(hb1.f20527a);
            eVar.f5193a.h("color").a(objectAnimator);
            list.add(objectAnimator);
        }
    }

    public final void s(View view, View view2, boolean z, e eVar, List<Animator> list) {
        float m = m(view, view2, eVar.b);
        float n = n(view, view2, eVar.b);
        Pair<j1j, j1j> j = j(m, n, z, eVar);
        j1j j1jVar = (j1j) j.first;
        j1j j1jVar2 = (j1j) j.second;
        Property property = View.TRANSLATION_X;
        if (!z) {
            m = this.g;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, property, m);
        Property property2 = View.TRANSLATION_Y;
        if (!z) {
            n = this.h;
        }
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, property2, n);
        j1jVar.a(ofFloat);
        j1jVar2.a(ofFloat2);
        list.add(ofFloat);
        list.add(ofFloat2);
    }

    public final void t(View view, View view2, boolean z, boolean z2, e eVar, List<Animator> list, List<Animator.AnimatorListener> list2) {
        ObjectAnimator objectAnimator;
        float elevation = ViewCompat.getElevation(view2) - ViewCompat.getElevation(view);
        if (z) {
            if (!z2) {
                view2.setTranslationZ(-elevation);
            }
            objectAnimator = ObjectAnimator.ofFloat(view2, View.TRANSLATION_Z, 0.0f);
        } else {
            objectAnimator = ObjectAnimator.ofFloat(view2, View.TRANSLATION_Z, -elevation);
        }
        eVar.f5193a.h("elevation").a(objectAnimator);
        list.add(objectAnimator);
    }

    public final void u(View view, View view2, boolean z, boolean z2, e eVar, float f, float f2, List<Animator> list, List<Animator.AnimatorListener> list2) {
        Animator animator;
        if (view2 instanceof com.google.android.material.circularreveal.b) {
            com.google.android.material.circularreveal.b bVar = (com.google.android.material.circularreveal.b) view2;
            float k = k(view, view2, eVar.b);
            float l = l(view, view2, eVar.b);
            Rect rect = this.c;
            ((FloatingActionButton) view).getContentRect(rect);
            float width = rect.width() / 2.0f;
            j1j h = eVar.f5193a.h("expansion");
            if (z) {
                if (!z2) {
                    bVar.setRevealInfo(new b.e(k, l, width));
                }
                if (z2) {
                    width = bVar.getRevealInfo().c;
                }
                animator = com.google.android.material.circularreveal.a.a(bVar, k, l, lai.b(k, l, 0.0f, 0.0f, f, f2));
                animator.addListener(new d(this, bVar));
                x(view2, h.c(), (int) k, (int) l, width, list);
            } else {
                float f3 = bVar.getRevealInfo().c;
                Animator a2 = com.google.android.material.circularreveal.a.a(bVar, k, l, width);
                int i = (int) k;
                int i2 = (int) l;
                x(view2, h.c(), i, i2, f3, list);
                w(view2, h.c(), h.d(), eVar.f5193a.i(), i, i2, width, list);
                animator = a2;
            }
            h.a(animator);
            list.add(animator);
            list2.add(com.google.android.material.circularreveal.a.b(bVar));
        }
    }

    public final void v(View view, View view2, boolean z, boolean z2, e eVar, List<Animator> list, List<Animator.AnimatorListener> list2) {
        ObjectAnimator objectAnimator;
        if ((view2 instanceof com.google.android.material.circularreveal.b) && (view instanceof ImageView)) {
            com.google.android.material.circularreveal.b bVar = (com.google.android.material.circularreveal.b) view2;
            Drawable drawable = ((ImageView) view).getDrawable();
            if (drawable != null) {
                drawable.mutate();
                if (z) {
                    if (!z2) {
                        drawable.setAlpha(255);
                    }
                    objectAnimator = ObjectAnimator.ofInt(drawable, ex7.DRAWABLE_ALPHA_COMPAT, 0);
                } else {
                    objectAnimator = ObjectAnimator.ofInt(drawable, ex7.DRAWABLE_ALPHA_COMPAT, 255);
                }
                objectAnimator.addUpdateListener(new b(view2));
                eVar.f5193a.h("iconFade").a(objectAnimator);
                list.add(objectAnimator);
                list2.add(new c(this, bVar, drawable));
            }
        }
    }

    public final void w(View view, long j, long j2, long j3, int i, int i2, float f, List<Animator> list) {
        long j4 = j + j2;
        if (j4 < j3) {
            Animator createCircularReveal = ViewAnimationUtils.createCircularReveal(view, i, i2, f, f);
            createCircularReveal.setStartDelay(j4);
            createCircularReveal.setDuration(j3 - j4);
            list.add(createCircularReveal);
        }
    }

    public final void x(View view, long j, int i, int i2, float f, List<Animator> list) {
        if (j > 0) {
            Animator createCircularReveal = ViewAnimationUtils.createCircularReveal(view, i, i2, f, f);
            createCircularReveal.setStartDelay(0L);
            createCircularReveal.setDuration(j);
            list.add(createCircularReveal);
        }
    }

    public final void y(View view, View view2, boolean z, boolean z2, e eVar, List<Animator> list, List<Animator.AnimatorListener> list2, RectF rectF) {
        ObjectAnimator objectAnimator;
        ObjectAnimator objectAnimator2;
        float m = m(view, view2, eVar.b);
        float n = n(view, view2, eVar.b);
        Pair<j1j, j1j> j = j(m, n, z, eVar);
        j1j j1jVar = (j1j) j.first;
        j1j j1jVar2 = (j1j) j.second;
        if (z) {
            if (!z2) {
                view2.setTranslationX(-m);
                view2.setTranslationY(-n);
            }
            objectAnimator2 = ObjectAnimator.ofFloat(view2, View.TRANSLATION_X, 0.0f);
            objectAnimator = ObjectAnimator.ofFloat(view2, View.TRANSLATION_Y, 0.0f);
            h(view2, eVar, j1jVar, j1jVar2, -m, -n, 0.0f, 0.0f, rectF);
        } else {
            objectAnimator2 = ObjectAnimator.ofFloat(view2, View.TRANSLATION_X, -m);
            objectAnimator = ObjectAnimator.ofFloat(view2, View.TRANSLATION_Y, -n);
        }
        j1jVar.a(objectAnimator2);
        j1jVar2.a(objectAnimator);
        list.add(objectAnimator2);
        list.add(objectAnimator);
    }

    public final int z(View view) {
        ColorStateList backgroundTintList = ViewCompat.getBackgroundTintList(view);
        if (backgroundTintList != null) {
            return backgroundTintList.getColorForState(view.getDrawableState(), backgroundTintList.getDefaultColor());
        }
        return 0;
    }

    public FabTransformationBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.c = new Rect();
        this.d = new RectF();
        this.e = new RectF();
        this.f = new int[2];
    }

    public final Pair<j1j, j1j> j(float f, float f2, boolean z, e eVar) {
        j1j j1jVar;
        j1j j1jVar2;
        int i;
        if (f == 0.0f || f2 == 0.0f) {
            j1jVar2 = eVar.f5193a.h("translationXLinear");
            j1jVar = eVar.f5193a.h("translationYLinear");
        } else if ((!z || f2 >= 0.0f) && (z || i <= 0)) {
            j1jVar2 = eVar.f5193a.h("translationXCurveDownwards");
            j1jVar = eVar.f5193a.h("translationYCurveDownwards");
        } else {
            j1jVar2 = eVar.f5193a.h("translationXCurveUpwards");
            j1jVar = eVar.f5193a.h("translationYCurveUpwards");
        }
        return new Pair<>(j1jVar2, j1jVar);
    }
}
