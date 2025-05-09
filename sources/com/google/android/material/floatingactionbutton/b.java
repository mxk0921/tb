package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.FloatEvaluator;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.animation.TypeEvaluator;
import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.graphics.Matrix;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.os.Build;
import android.util.Property;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.util.Preconditions;
import androidx.core.view.ViewCompat;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.taobao.taobao.R;
import java.util.ArrayList;
import java.util.Iterator;
import tb.bjq;
import tb.i1j;
import tb.kp9;
import tb.lme;
import tb.mi2;
import tb.oai;
import tb.ogp;
import tb.pz0;
import tb.tz0;
import tb.uhp;
import tb.w9i;
import tb.zeo;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class b {
    public static final TimeInterpolator E = pz0.FAST_OUT_LINEAR_IN_INTERPOLATOR;
    public static final int[] F = {16842919, 16842910};
    public static final int[] G = {16843623, 16842908, 16842910};
    public static final int[] H = {16842908, 16842910};
    public static final int[] I = {16843623, 16842910};
    public static final int[] J = {16842910};
    public static final int[] K = new int[0];
    public ViewTreeObserver.OnPreDrawListener D;

    /* renamed from: a  reason: collision with root package name */
    public com.google.android.material.shape.a f5094a;
    public MaterialShapeDrawable b;
    public Drawable c;
    public mi2 d;
    public Drawable e;
    public boolean f;
    public float h;
    public float i;
    public float j;
    public int k;
    public i1j l;
    public i1j m;
    public Animator n;
    public i1j o;
    public i1j p;
    public float q;
    public int s;
    public ArrayList<Animator.AnimatorListener> u;
    public ArrayList<Animator.AnimatorListener> v;
    public ArrayList<i> w;
    public final FloatingActionButton x;
    public final ogp y;
    public boolean g = true;
    public float r = 1.0f;
    public int t = 0;
    public final Rect z = new Rect();
    public final RectF A = new RectF();
    public final RectF B = new RectF();
    public final Matrix C = new Matrix();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class a extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        public boolean f5095a;
        public final /* synthetic */ boolean b;
        public final /* synthetic */ j c;

        public a(boolean z, j jVar) {
            this.b = z;
            this.c = jVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f5095a = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            int i;
            b bVar = b.this;
            bVar.t = 0;
            bVar.n = null;
            if (!this.f5095a) {
                FloatingActionButton floatingActionButton = bVar.x;
                boolean z = this.b;
                if (z) {
                    i = 8;
                } else {
                    i = 4;
                }
                floatingActionButton.internalSetVisibility(i, z);
                j jVar = this.c;
                if (jVar != null) {
                    ((FloatingActionButton.a) jVar).a();
                }
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            b bVar = b.this;
            bVar.x.internalSetVisibility(0, this.b);
            bVar.t = 1;
            bVar.n = animator;
            this.f5095a = false;
        }
    }

    /* compiled from: Taobao */
    /* renamed from: com.google.android.material.floatingactionbutton.b$b  reason: collision with other inner class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class C0251b extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ boolean f5096a;
        public final /* synthetic */ j b;

        public C0251b(boolean z, j jVar) {
            this.f5096a = z;
            this.b = jVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            b bVar = b.this;
            bVar.t = 0;
            bVar.n = null;
            j jVar = this.b;
            if (jVar != null) {
                ((FloatingActionButton.a) jVar).b();
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            b bVar = b.this;
            bVar.x.internalSetVisibility(0, this.f5096a);
            bVar.t = 2;
            bVar.n = animator;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class c extends oai {
        public c() {
        }

        @Override // tb.oai
        public Matrix a(float f, Matrix matrix, Matrix matrix2) {
            b.this.r = f;
            return super.evaluate(f, matrix, matrix2);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class d implements TypeEvaluator<Float> {

        /* renamed from: a  reason: collision with root package name */
        public final FloatEvaluator f5097a = new FloatEvaluator();

        public d(b bVar) {
        }

        /* renamed from: a */
        public Float evaluate(float f, Float f2, Float f3) {
            float floatValue = this.f5097a.evaluate(f, (Number) f2, (Number) f3).floatValue();
            if (floatValue < 0.1f) {
                floatValue = 0.0f;
            }
            return Float.valueOf(floatValue);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class e implements ViewTreeObserver.OnPreDrawListener {
        public e() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            b.this.G();
            return true;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class f extends l {
        public f() {
            super(b.this, null);
        }

        @Override // com.google.android.material.floatingactionbutton.b.l
        public float a() {
            return 0.0f;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class g extends l {
        public g() {
            super(b.this, null);
        }

        @Override // com.google.android.material.floatingactionbutton.b.l
        public float a() {
            b bVar = b.this;
            return bVar.h + bVar.i;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class h extends l {
        public h() {
            super(b.this, null);
        }

        @Override // com.google.android.material.floatingactionbutton.b.l
        public float a() {
            b bVar = b.this;
            return bVar.h + bVar.j;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public interface i {
        void a();

        void b();
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public interface j {
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class k extends l {
        public k() {
            super(b.this, null);
        }

        @Override // com.google.android.material.floatingactionbutton.b.l
        public float a() {
            return b.this.h;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public abstract class l extends AnimatorListenerAdapter implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: collision with root package name */
        private boolean f5099a;
        private float b;
        private float c;

        private l() {
        }

        public abstract float a();

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            b.this.i0((int) this.c);
            this.f5099a = false;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float f;
            if (!this.f5099a) {
                MaterialShapeDrawable materialShapeDrawable = b.this.b;
                if (materialShapeDrawable == null) {
                    f = 0.0f;
                } else {
                    f = materialShapeDrawable.w();
                }
                this.b = f;
                this.c = a();
                this.f5099a = true;
            }
            b bVar = b.this;
            float f2 = this.b;
            bVar.i0((int) (f2 + ((this.c - f2) * valueAnimator.getAnimatedFraction())));
        }

        public /* synthetic */ l(b bVar, a aVar) {
            this();
        }
    }

    public b(FloatingActionButton floatingActionButton, ogp ogpVar) {
        this.x = floatingActionButton;
        this.y = ogpVar;
        bjq bjqVar = new bjq();
        bjqVar.a(F, i(new h()));
        bjqVar.a(G, i(new g()));
        bjqVar.a(H, i(new g()));
        bjqVar.a(I, i(new g()));
        bjqVar.a(J, i(new k()));
        bjqVar.a(K, i(new f()));
        this.q = floatingActionButton.getRotation();
    }

    public void A() {
        MaterialShapeDrawable materialShapeDrawable = this.b;
        FloatingActionButton floatingActionButton = this.x;
        if (materialShapeDrawable != null) {
            w9i.f(floatingActionButton, materialShapeDrawable);
        }
        if (M()) {
            floatingActionButton.getViewTreeObserver().addOnPreDrawListener(q());
        }
    }

    public void B() {
        throw null;
    }

    public void C() {
        ViewTreeObserver viewTreeObserver = this.x.getViewTreeObserver();
        ViewTreeObserver.OnPreDrawListener onPreDrawListener = this.D;
        if (onPreDrawListener != null) {
            viewTreeObserver.removeOnPreDrawListener(onPreDrawListener);
            this.D = null;
        }
    }

    public void D(int[] iArr) {
        throw null;
    }

    public void E(float f2, float f3, float f4) {
        throw null;
    }

    public void F(Rect rect) {
        Preconditions.checkNotNull(this.e, "Didn't initialize content background");
        boolean b0 = b0();
        ogp ogpVar = this.y;
        if (b0) {
            ((FloatingActionButton.c) ogpVar).b(new InsetDrawable(this.e, rect.left, rect.top, rect.right, rect.bottom));
            return;
        }
        ((FloatingActionButton.c) ogpVar).b(this.e);
    }

    public void G() {
        float rotation = this.x.getRotation();
        if (this.q != rotation) {
            this.q = rotation;
        }
    }

    public void H() {
        ArrayList<i> arrayList = this.w;
        if (arrayList != null) {
            Iterator<i> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().a();
            }
        }
    }

    public void I() {
        ArrayList<i> arrayList = this.w;
        if (arrayList != null) {
            Iterator<i> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().b();
            }
        }
    }

    public void J(Animator.AnimatorListener animatorListener) {
        ArrayList<Animator.AnimatorListener> arrayList = this.v;
        if (arrayList != null) {
            arrayList.remove(animatorListener);
        }
    }

    public void K(Animator.AnimatorListener animatorListener) {
        ArrayList<Animator.AnimatorListener> arrayList = this.u;
        if (arrayList != null) {
            arrayList.remove(animatorListener);
        }
    }

    public void L(i iVar) {
        ArrayList<i> arrayList = this.w;
        if (arrayList != null) {
            arrayList.remove(iVar);
        }
    }

    public boolean M() {
        return !(this instanceof kp9);
    }

    public void N(ColorStateList colorStateList) {
        MaterialShapeDrawable materialShapeDrawable = this.b;
        if (materialShapeDrawable != null) {
            materialShapeDrawable.setTintList(colorStateList);
        }
        mi2 mi2Var = this.d;
        if (mi2Var != null) {
            mi2Var.c(colorStateList);
        }
    }

    public void O(PorterDuff.Mode mode) {
        MaterialShapeDrawable materialShapeDrawable = this.b;
        if (materialShapeDrawable != null) {
            materialShapeDrawable.setTintMode(mode);
        }
    }

    public final void P(float f2) {
        if (this.h != f2) {
            this.h = f2;
            E(f2, this.i, this.j);
        }
    }

    public void Q(boolean z) {
        this.f = z;
    }

    public final void R(i1j i1jVar) {
        this.p = i1jVar;
    }

    public final void S(float f2) {
        if (this.i != f2) {
            this.i = f2;
            E(this.h, f2, this.j);
        }
    }

    public final void T(float f2) {
        this.r = f2;
        Matrix matrix = this.C;
        g(f2, matrix);
        this.x.setImageMatrix(matrix);
    }

    public final void U(int i2) {
        if (this.s != i2) {
            this.s = i2;
            g0();
        }
    }

    public void V(int i2) {
        this.k = i2;
    }

    public final void W(float f2) {
        if (this.j != f2) {
            this.j = f2;
            E(this.h, this.i, f2);
        }
    }

    public void X(ColorStateList colorStateList) {
        Drawable drawable = this.c;
        if (drawable != null) {
            DrawableCompat.setTintList(drawable, zeo.d(colorStateList));
        }
    }

    public void Y(boolean z) {
        this.g = z;
        h0();
    }

    public final void Z(com.google.android.material.shape.a aVar) {
        this.f5094a = aVar;
        MaterialShapeDrawable materialShapeDrawable = this.b;
        if (materialShapeDrawable != null) {
            materialShapeDrawable.setShapeAppearanceModel(aVar);
        }
        Drawable drawable = this.c;
        if (drawable instanceof uhp) {
            ((uhp) drawable).setShapeAppearanceModel(aVar);
        }
        mi2 mi2Var = this.d;
        if (mi2Var != null) {
            mi2Var.f(aVar);
        }
    }

    public final void a0(i1j i1jVar) {
        this.o = i1jVar;
    }

    public boolean b0() {
        throw null;
    }

    public final boolean c0() {
        FloatingActionButton floatingActionButton = this.x;
        if (!ViewCompat.isLaidOut(floatingActionButton) || floatingActionButton.isInEditMode()) {
            return false;
        }
        return true;
    }

    public void d(Animator.AnimatorListener animatorListener) {
        if (this.v == null) {
            this.v = new ArrayList<>();
        }
        this.v.add(animatorListener);
    }

    public final boolean d0() {
        if (!this.f || this.x.getSizeDimension() >= this.k) {
            return true;
        }
        return false;
    }

    public void e(Animator.AnimatorListener animatorListener) {
        if (this.u == null) {
            this.u = new ArrayList<>();
        }
        this.u.add(animatorListener);
    }

    public void e0(j jVar, boolean z) {
        if (!y()) {
            Animator animator = this.n;
            if (animator != null) {
                animator.cancel();
            }
            boolean c0 = c0();
            FloatingActionButton floatingActionButton = this.x;
            if (c0) {
                if (floatingActionButton.getVisibility() != 0) {
                    floatingActionButton.setAlpha(0.0f);
                    floatingActionButton.setScaleY(0.0f);
                    floatingActionButton.setScaleX(0.0f);
                    T(0.0f);
                }
                i1j i1jVar = this.o;
                if (i1jVar == null) {
                    i1jVar = l();
                }
                AnimatorSet h2 = h(i1jVar, 1.0f, 1.0f, 1.0f);
                h2.addListener(new C0251b(z, jVar));
                ArrayList<Animator.AnimatorListener> arrayList = this.u;
                if (arrayList != null) {
                    Iterator<Animator.AnimatorListener> it = arrayList.iterator();
                    while (it.hasNext()) {
                        h2.addListener(it.next());
                    }
                }
                h2.start();
                return;
            }
            floatingActionButton.internalSetVisibility(0, z);
            floatingActionButton.setAlpha(1.0f);
            floatingActionButton.setScaleY(1.0f);
            floatingActionButton.setScaleX(1.0f);
            T(1.0f);
            if (jVar != null) {
                ((FloatingActionButton.a) jVar).b();
            }
        }
    }

    public void f(i iVar) {
        if (this.w == null) {
            this.w = new ArrayList<>();
        }
        this.w.add(iVar);
    }

    public void f0() {
        throw null;
    }

    public final void g(float f2, Matrix matrix) {
        matrix.reset();
        Drawable drawable = this.x.getDrawable();
        if (drawable != null && this.s != 0) {
            RectF rectF = this.A;
            RectF rectF2 = this.B;
            rectF.set(0.0f, 0.0f, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
            int i2 = this.s;
            rectF2.set(0.0f, 0.0f, i2, i2);
            matrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.CENTER);
            int i3 = this.s;
            matrix.postScale(f2, f2, i3 / 2.0f, i3 / 2.0f);
        }
    }

    public final void g0() {
        T(this.r);
    }

    public final AnimatorSet h(i1j i1jVar, float f2, float f3, float f4) {
        ArrayList arrayList = new ArrayList();
        Property property = View.ALPHA;
        float[] fArr = {f2};
        FloatingActionButton floatingActionButton = this.x;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(floatingActionButton, property, fArr);
        i1jVar.h("opacity").a(ofFloat);
        arrayList.add(ofFloat);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(floatingActionButton, View.SCALE_X, f3);
        i1jVar.h("scale").a(ofFloat2);
        j0(ofFloat2);
        arrayList.add(ofFloat2);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(floatingActionButton, View.SCALE_Y, f3);
        i1jVar.h("scale").a(ofFloat3);
        j0(ofFloat3);
        arrayList.add(ofFloat3);
        Matrix matrix = this.C;
        g(f4, matrix);
        ObjectAnimator ofObject = ObjectAnimator.ofObject(floatingActionButton, new lme(), new c(), new Matrix(matrix));
        i1jVar.h("iconScale").a(ofObject);
        arrayList.add(ofObject);
        AnimatorSet animatorSet = new AnimatorSet();
        tz0.a(animatorSet, arrayList);
        return animatorSet;
    }

    public final void h0() {
        Rect rect = this.z;
        r(rect);
        F(rect);
        ((FloatingActionButton.c) this.y).c(rect.left, rect.top, rect.right, rect.bottom);
    }

    public final ValueAnimator i(l lVar) {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setInterpolator(E);
        valueAnimator.setDuration(100L);
        valueAnimator.addListener(lVar);
        valueAnimator.addUpdateListener(lVar);
        valueAnimator.setFloatValues(0.0f, 1.0f);
        return valueAnimator;
    }

    public void i0(float f2) {
        MaterialShapeDrawable materialShapeDrawable = this.b;
        if (materialShapeDrawable != null) {
            materialShapeDrawable.V(f2);
        }
    }

    public final Drawable j() {
        return this.e;
    }

    public final void j0(ObjectAnimator objectAnimator) {
        if (Build.VERSION.SDK_INT == 26) {
            objectAnimator.setEvaluator(new d(this));
        }
    }

    public final i1j k() {
        if (this.m == null) {
            this.m = i1j.d(this.x.getContext(), R.animator.design_fab_hide_motion_spec);
        }
        return (i1j) Preconditions.checkNotNull(this.m);
    }

    public final i1j l() {
        if (this.l == null) {
            this.l = i1j.d(this.x.getContext(), R.animator.design_fab_show_motion_spec);
        }
        return (i1j) Preconditions.checkNotNull(this.l);
    }

    public float m() {
        throw null;
    }

    public boolean n() {
        return this.f;
    }

    public final i1j o() {
        return this.p;
    }

    public float p() {
        return this.i;
    }

    public final ViewTreeObserver.OnPreDrawListener q() {
        if (this.D == null) {
            this.D = new e();
        }
        return this.D;
    }

    public void r(Rect rect) {
        int i2;
        float f2;
        if (this.f) {
            i2 = (this.k - this.x.getSizeDimension()) / 2;
        } else {
            i2 = 0;
        }
        if (this.g) {
            f2 = m() + this.j;
        } else {
            f2 = 0.0f;
        }
        int max = Math.max(i2, (int) Math.ceil(f2));
        int max2 = Math.max(i2, (int) Math.ceil(f2 * 1.5f));
        rect.set(max, max2, max, max2);
    }

    public float s() {
        return this.j;
    }

    public final com.google.android.material.shape.a t() {
        return this.f5094a;
    }

    public final i1j u() {
        return this.o;
    }

    public void v(j jVar, boolean z) {
        int i2;
        if (!x()) {
            Animator animator = this.n;
            if (animator != null) {
                animator.cancel();
            }
            if (c0()) {
                i1j i1jVar = this.p;
                if (i1jVar == null) {
                    i1jVar = k();
                }
                AnimatorSet h2 = h(i1jVar, 0.0f, 0.0f, 0.0f);
                h2.addListener(new a(z, jVar));
                ArrayList<Animator.AnimatorListener> arrayList = this.v;
                if (arrayList != null) {
                    Iterator<Animator.AnimatorListener> it = arrayList.iterator();
                    while (it.hasNext()) {
                        h2.addListener(it.next());
                    }
                }
                h2.start();
                return;
            }
            if (z) {
                i2 = 8;
            } else {
                i2 = 4;
            }
            this.x.internalSetVisibility(i2, z);
            if (jVar != null) {
                ((FloatingActionButton.a) jVar).a();
            }
        }
    }

    public void w(ColorStateList colorStateList, PorterDuff.Mode mode, ColorStateList colorStateList2, int i2) {
        throw null;
    }

    public boolean x() {
        if (this.x.getVisibility() == 0) {
            if (this.t == 1) {
                return true;
            }
            return false;
        } else if (this.t != 2) {
            return true;
        } else {
            return false;
        }
    }

    public boolean y() {
        if (this.x.getVisibility() != 0) {
            if (this.t == 2) {
                return true;
            }
            return false;
        } else if (this.t != 1) {
            return true;
        } else {
            return false;
        }
    }

    public void z() {
        throw null;
    }
}
