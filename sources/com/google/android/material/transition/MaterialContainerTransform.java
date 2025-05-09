package com.google.android.material.transition;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import androidx.core.util.Preconditions;
import androidx.core.view.InputDeviceCompat;
import androidx.core.view.ViewCompat;
import androidx.transition.ArcMotion;
import androidx.transition.PathMotion;
import androidx.transition.Transition;
import androidx.transition.TransitionValues;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.transition.b;
import com.taobao.taobao.R;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import tb.dfw;
import tb.ogw;
import tb.pg1;
import tb.pz0;
import tb.seu;
import tb.tkt;
import tb.uhp;
import tb.uj9;
import tb.vj9;
import tb.vx8;
import tb.wx8;
import tb.yj9;
import tb.zx8;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class MaterialContainerTransform extends Transition {
    public static final int FADE_MODE_CROSS = 2;
    public static final int FADE_MODE_IN = 0;
    public static final int FADE_MODE_OUT = 1;
    public static final int FADE_MODE_THROUGH = 3;
    public static final int FIT_MODE_AUTO = 0;
    public static final int FIT_MODE_HEIGHT = 2;
    public static final int FIT_MODE_WIDTH = 1;
    public static final int TRANSITION_DIRECTION_AUTO = 0;
    public static final int TRANSITION_DIRECTION_ENTER = 1;
    public static final int TRANSITION_DIRECTION_RETURN = 2;
    public static final String[] h = {"materialContainerTransition:bounds", "materialContainerTransition:shapeAppearance"};
    public static final d i = new d(new c(0.0f, 0.25f), new c(0.0f, 1.0f), new c(0.0f, 1.0f), new c(0.0f, 0.75f), null);
    public static final d j = new d(new c(0.6f, 0.9f), new c(0.0f, 1.0f), new c(0.0f, 0.9f), new c(0.3f, 0.9f), null);
    public static final d k = new d(new c(0.1f, 0.4f), new c(0.1f, 1.0f), new c(0.1f, 1.0f), new c(0.1f, 0.9f), null);
    public static final d l = new d(new c(0.6f, 0.9f), new c(0.0f, 0.9f), new c(0.0f, 0.9f), new c(0.2f, 0.9f), null);

    /* renamed from: a  reason: collision with root package name */
    public final int f5195a = 16908290;
    public final int b = -1;
    public final int c = -1;
    public final int d = 1375731712;
    public final boolean e;
    public final float f;
    public final float g;

    /* compiled from: Taobao */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public @interface FadeMode {
    }

    /* compiled from: Taobao */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public @interface FitMode {
    }

    /* compiled from: Taobao */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public @interface TransitionDirection {
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class a implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f5196a;

        public a(e eVar) {
            this.f5196a = eVar;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.f5196a.o(valueAnimator.getAnimatedFraction());
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class b extends seu {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ View f5197a;
        public final /* synthetic */ e b;
        public final /* synthetic */ View c;
        public final /* synthetic */ View d;

        public b(View view, e eVar, View view2, View view3) {
            this.f5197a = view;
            this.b = eVar;
            this.c = view2;
            this.d = view3;
        }

        @Override // androidx.transition.Transition.TransitionListener
        public void onTransitionEnd(Transition transition) {
            MaterialContainerTransform materialContainerTransform = MaterialContainerTransform.this;
            materialContainerTransform.removeListener(this);
            materialContainerTransform.getClass();
            this.c.setAlpha(1.0f);
            this.d.setAlpha(1.0f);
            ((dfw) ogw.f(this.f5197a)).b(this.b);
        }

        @Override // androidx.transition.Transition.TransitionListener
        public void onTransitionStart(Transition transition) {
            ((dfw) ogw.f(this.f5197a)).a(this.b);
            this.c.setAlpha(0.0f);
            this.d.setAlpha(0.0f);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static class c {

        /* renamed from: a  reason: collision with root package name */
        public final float f5198a;
        public final float b;

        public c(float f, float f2) {
            this.f5198a = f;
            this.b = f2;
        }

        public float c() {
            return this.b;
        }

        public float d() {
            return this.f5198a;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static class d {

        /* renamed from: a  reason: collision with root package name */
        public final c f5199a;
        public final c b;
        public final c c;
        public final c d;

        public /* synthetic */ d(c cVar, c cVar2, c cVar3, c cVar4, a aVar) {
            this(cVar, cVar2, cVar3, cVar4);
        }

        public d(c cVar, c cVar2, c cVar3, c cVar4) {
            this.f5199a = cVar;
            this.b = cVar2;
            this.c = cVar3;
            this.d = cVar4;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class e extends Drawable {
        public final d A;
        public final vx8 B;
        public final uj9 C;
        public final boolean D;
        public final Paint E;
        public final Path F;
        public zx8 G;
        public yj9 H;
        public RectF I;
        public float J;
        public float K;
        public float L;

        /* renamed from: a  reason: collision with root package name */
        public final View f5200a;
        public final RectF b;
        public final com.google.android.material.shape.a c;
        public final float d;
        public final View e;
        public final RectF f;
        public final com.google.android.material.shape.a g;
        public final float h;
        public final Paint i;
        public final Paint j;
        public final Paint k;
        public final Paint l;
        public final Paint m;
        public final com.google.android.material.transition.a n;
        public final PathMeasure o;
        public final float p;
        public final float[] q;
        public final boolean r;
        public final float s;
        public final float t;
        public final boolean u;
        public final MaterialShapeDrawable v;
        public final RectF w;
        public final RectF x;
        public final RectF y;
        public final RectF z;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
        public class a implements b.c {
            public a() {
            }

            @Override // com.google.android.material.transition.b.c
            public void a(Canvas canvas) {
                e.this.f5200a.draw(canvas);
            }
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
        public class b implements b.c {
            public b() {
            }

            @Override // com.google.android.material.transition.b.c
            public void a(Canvas canvas) {
                e.this.e.draw(canvas);
            }
        }

        public /* synthetic */ e(PathMotion pathMotion, View view, RectF rectF, com.google.android.material.shape.a aVar, float f, View view2, RectF rectF2, com.google.android.material.shape.a aVar2, float f2, int i, int i2, int i3, int i4, boolean z, boolean z2, vx8 vx8Var, uj9 uj9Var, d dVar, boolean z3, a aVar3) {
            this(pathMotion, view, rectF, aVar, f, view2, rectF2, aVar2, f2, i, i2, i3, i4, z, z2, vx8Var, uj9Var, dVar, z3);
        }

        public static float d(RectF rectF, float f) {
            return ((rectF.centerX() / (f / 2.0f)) - 1.0f) * 0.3f;
        }

        public static float e(RectF rectF, float f) {
            return (rectF.centerY() / f) * 1.5f;
        }

        public static PointF m(RectF rectF) {
            return new PointF(rectF.centerX(), rectF.top);
        }

        @Override // android.graphics.drawable.Drawable
        public void draw(Canvas canvas) {
            int i;
            Paint paint = this.m;
            if (paint.getAlpha() > 0) {
                canvas.drawRect(getBounds(), paint);
            }
            boolean z = this.D;
            if (z) {
                i = canvas.save();
            } else {
                i = -1;
            }
            if (this.u && this.J > 0.0f) {
                h(canvas);
            }
            this.n.a(canvas);
            n(canvas, this.i);
            if (this.G.c) {
                l(canvas);
                k(canvas);
            } else {
                k(canvas);
                l(canvas);
            }
            if (z) {
                canvas.restoreToCount(i);
                RectF rectF = this.w;
                f(canvas, rectF, this.F, -65281);
                g(canvas, this.x, InputDeviceCompat.SOURCE_ANY);
                g(canvas, rectF, -16711936);
                g(canvas, this.z, -16711681);
                g(canvas, this.y, tkt.DEFAULT_LINK_COLOR);
            }
        }

        public final void f(Canvas canvas, RectF rectF, Path path, int i) {
            PointF m = m(rectF);
            if (this.L == 0.0f) {
                path.reset();
                path.moveTo(m.x, m.y);
                return;
            }
            path.lineTo(m.x, m.y);
            Paint paint = this.E;
            paint.setColor(i);
            canvas.drawPath(path, paint);
        }

        public final void g(Canvas canvas, RectF rectF, int i) {
            Paint paint = this.E;
            paint.setColor(i);
            canvas.drawRect(rectF, paint);
        }

        @Override // android.graphics.drawable.Drawable
        public int getOpacity() {
            return -3;
        }

        public final void h(Canvas canvas) {
            canvas.save();
            canvas.clipPath(this.n.d(), Region.Op.DIFFERENCE);
            if (Build.VERSION.SDK_INT > 28) {
                j(canvas);
            } else {
                i(canvas);
            }
            canvas.restore();
        }

        public final void i(Canvas canvas) {
            MaterialShapeDrawable materialShapeDrawable = this.v;
            RectF rectF = this.I;
            materialShapeDrawable.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
            materialShapeDrawable.V(this.J);
            materialShapeDrawable.e0((int) this.K);
            materialShapeDrawable.setShapeAppearanceModel(this.n.c());
            materialShapeDrawable.draw(canvas);
        }

        public final void j(Canvas canvas) {
            com.google.android.material.transition.a aVar = this.n;
            com.google.android.material.shape.a c = aVar.c();
            boolean u = c.u(this.I);
            Paint paint = this.l;
            if (u) {
                float a2 = c.r().a(this.I);
                canvas.drawRoundRect(this.I, a2, a2, paint);
                return;
            }
            canvas.drawPath(aVar.d(), paint);
        }

        public final void k(Canvas canvas) {
            n(canvas, this.k);
            Rect bounds = getBounds();
            RectF rectF = this.y;
            com.google.android.material.transition.b.o(canvas, bounds, rectF.left, rectF.top, this.H.b, this.G.b, new b());
        }

        public final void l(Canvas canvas) {
            n(canvas, this.j);
            Rect bounds = getBounds();
            RectF rectF = this.w;
            com.google.android.material.transition.b.o(canvas, bounds, rectF.left, rectF.top, this.H.f32126a, this.G.f33072a, new a());
        }

        public final void n(Canvas canvas, Paint paint) {
            if (paint.getColor() != 0 && paint.getAlpha() > 0) {
                canvas.drawRect(getBounds(), paint);
            }
        }

        public final void o(float f) {
            if (this.L != f) {
                p(f);
            }
        }

        public final void p(float f) {
            float f2;
            RectF rectF;
            this.L = f;
            if (this.r) {
                f2 = com.google.android.material.transition.b.j(0.0f, 255.0f, f);
            } else {
                f2 = com.google.android.material.transition.b.j(255.0f, 0.0f, f);
            }
            this.m.setAlpha((int) f2);
            PathMeasure pathMeasure = this.o;
            float[] fArr = this.q;
            pathMeasure.getPosTan(this.p * f, fArr, null);
            float f3 = fArr[0];
            float f4 = fArr[1];
            d dVar = this.A;
            float floatValue = ((Float) Preconditions.checkNotNull(Float.valueOf(dVar.b.f5198a))).floatValue();
            float floatValue2 = ((Float) Preconditions.checkNotNull(Float.valueOf(dVar.b.b))).floatValue();
            RectF rectF2 = this.b;
            float width = rectF2.width();
            float height = rectF2.height();
            RectF rectF3 = this.f;
            yj9 a2 = this.C.a(f, floatValue, floatValue2, width, height, rectF3.width(), rectF3.height());
            this.H = a2;
            float f5 = a2.c / 2.0f;
            RectF rectF4 = this.w;
            rectF4.set(f3 - f5, f4, f5 + f3, a2.d + f4);
            yj9 yj9Var = this.H;
            float f6 = yj9Var.e / 2.0f;
            RectF rectF5 = this.y;
            rectF5.set(f3 - f6, f4, f3 + f6, yj9Var.f + f4);
            RectF rectF6 = this.x;
            rectF6.set(rectF4);
            RectF rectF7 = this.z;
            rectF7.set(rectF5);
            float floatValue3 = ((Float) Preconditions.checkNotNull(Float.valueOf(dVar.c.f5198a))).floatValue();
            float floatValue4 = ((Float) Preconditions.checkNotNull(Float.valueOf(dVar.c.b))).floatValue();
            yj9 yj9Var2 = this.H;
            uj9 uj9Var = this.C;
            boolean c = uj9Var.c(yj9Var2);
            if (c) {
                rectF = rectF6;
            } else {
                rectF = rectF7;
            }
            float k = com.google.android.material.transition.b.k(0.0f, 1.0f, floatValue3, floatValue4, f);
            if (!c) {
                k = 1.0f - k;
            }
            uj9Var.b(rectF, k, this.H);
            this.I = new RectF(Math.min(rectF6.left, rectF7.left), Math.min(rectF6.top, rectF7.top), Math.max(rectF6.right, rectF7.right), Math.max(rectF6.bottom, rectF7.bottom));
            this.n.b(f, this.c, this.g, rectF4, rectF6, rectF7, dVar.d);
            this.J = com.google.android.material.transition.b.j(this.d, this.h, f);
            float d = d(this.I, this.s);
            float e = e(this.I, this.t);
            float f7 = this.J;
            float f8 = (int) (e * f7);
            this.K = f8;
            this.l.setShadowLayer(f7, (int) (d * f7), f8, 754974720);
            this.G = this.B.a(f, ((Float) Preconditions.checkNotNull(Float.valueOf(dVar.f5199a.f5198a))).floatValue(), ((Float) Preconditions.checkNotNull(Float.valueOf(dVar.f5199a.b))).floatValue());
            Paint paint = this.j;
            if (paint.getColor() != 0) {
                paint.setAlpha(this.G.f33072a);
            }
            Paint paint2 = this.k;
            if (paint2.getColor() != 0) {
                paint2.setAlpha(this.G.b);
            }
            invalidateSelf();
        }

        @Override // android.graphics.drawable.Drawable
        public void setAlpha(int i) {
            throw new UnsupportedOperationException("Setting alpha on is not supported");
        }

        @Override // android.graphics.drawable.Drawable
        public void setColorFilter(ColorFilter colorFilter) {
            throw new UnsupportedOperationException("Setting a color filter is not supported");
        }

        public e(PathMotion pathMotion, View view, RectF rectF, com.google.android.material.shape.a aVar, float f, View view2, RectF rectF2, com.google.android.material.shape.a aVar2, float f2, int i, int i2, int i3, int i4, boolean z, boolean z2, vx8 vx8Var, uj9 uj9Var, d dVar, boolean z3) {
            Paint paint = new Paint();
            this.i = paint;
            Paint paint2 = new Paint();
            this.j = paint2;
            Paint paint3 = new Paint();
            this.k = paint3;
            this.l = new Paint();
            Paint paint4 = new Paint();
            this.m = paint4;
            this.n = new com.google.android.material.transition.a();
            this.q = r7;
            MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable();
            this.v = materialShapeDrawable;
            Paint paint5 = new Paint();
            this.E = paint5;
            this.F = new Path();
            this.f5200a = view;
            this.b = rectF;
            this.c = aVar;
            this.d = f;
            this.e = view2;
            this.f = rectF2;
            this.g = aVar2;
            this.h = f2;
            this.r = z;
            this.u = z2;
            this.B = vx8Var;
            this.C = uj9Var;
            this.A = dVar;
            this.D = z3;
            DisplayMetrics displayMetrics = new DisplayMetrics();
            ((WindowManager) view.getContext().getSystemService(pg1.ATOM_EXT_window)).getDefaultDisplay().getMetrics(displayMetrics);
            this.s = displayMetrics.widthPixels;
            this.t = displayMetrics.heightPixels;
            paint.setColor(i);
            paint2.setColor(i2);
            paint3.setColor(i3);
            materialShapeDrawable.W(ColorStateList.valueOf(0));
            materialShapeDrawable.d0(2);
            materialShapeDrawable.b0(false);
            materialShapeDrawable.c0(tkt.DEFAULT_SHADOW_COLOR);
            RectF rectF3 = new RectF(rectF);
            this.w = rectF3;
            this.x = new RectF(rectF3);
            RectF rectF4 = new RectF(rectF3);
            this.y = rectF4;
            this.z = new RectF(rectF4);
            PointF m = m(rectF);
            PointF m2 = m(rectF2);
            PathMeasure pathMeasure = new PathMeasure(pathMotion.getPath(m.x, m.y, m2.x, m2.y), false);
            this.o = pathMeasure;
            this.p = pathMeasure.getLength();
            float[] fArr = {rectF.centerX(), rectF.top};
            paint4.setStyle(Paint.Style.FILL);
            paint4.setShader(com.google.android.material.transition.b.c(i4));
            paint5.setStyle(Paint.Style.STROKE);
            paint5.setStrokeWidth(10.0f);
            p(0.0f);
        }
    }

    public MaterialContainerTransform() {
        boolean z;
        if (Build.VERSION.SDK_INT >= 28) {
            z = true;
        } else {
            z = false;
        }
        this.e = z;
        this.f = -1.0f;
        this.g = -1.0f;
        setInterpolator(pz0.FAST_OUT_SLOW_IN_INTERPOLATOR);
    }

    public static RectF c(View view, View view2, float f, float f2) {
        if (view2 == null) {
            return new RectF(0.0f, 0.0f, view.getWidth(), view.getHeight());
        }
        RectF g = com.google.android.material.transition.b.g(view2);
        g.offset(f, f2);
        return g;
    }

    public static com.google.android.material.shape.a d(View view, RectF rectF, com.google.android.material.shape.a aVar) {
        return com.google.android.material.transition.b.b(g(view, aVar), rectF);
    }

    public static float f(float f, View view) {
        if (f != -1.0f) {
            return f;
        }
        return ViewCompat.getElevation(view);
    }

    public static com.google.android.material.shape.a g(View view, com.google.android.material.shape.a aVar) {
        if (aVar != null) {
            return aVar;
        }
        int i2 = R.id.mtrl_motion_snapshot_view;
        if (view.getTag(i2) instanceof com.google.android.material.shape.a) {
            return (com.google.android.material.shape.a) view.getTag(i2);
        }
        Context context = view.getContext();
        int i3 = i(context);
        if (i3 != -1) {
            return com.google.android.material.shape.a.b(context, i3, 0).m();
        }
        if (view instanceof uhp) {
            return ((uhp) view).getShapeAppearanceModel();
        }
        return com.google.android.material.shape.a.a().m();
    }

    public static int i(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(new int[]{R.attr.transitionShapeAppearance});
        int resourceId = obtainStyledAttributes.getResourceId(0, -1);
        obtainStyledAttributes.recycle();
        return resourceId;
    }

    public final d b(boolean z) {
        PathMotion pathMotion = getPathMotion();
        if ((pathMotion instanceof ArcMotion) || (pathMotion instanceof MaterialArcMotion)) {
            return h(z, k, l);
        }
        return h(z, i, j);
    }

    @Override // androidx.transition.Transition
    public void captureEndValues(TransitionValues transitionValues) {
        e(transitionValues, null, this.c, null);
    }

    @Override // androidx.transition.Transition
    public void captureStartValues(TransitionValues transitionValues) {
        e(transitionValues, null, this.b, null);
    }

    @Override // androidx.transition.Transition
    public String[] getTransitionProperties() {
        return h;
    }

    public final d h(boolean z, d dVar, d dVar2) {
        if (!z) {
            dVar = dVar2;
        }
        return new d((c) com.google.android.material.transition.b.d(null, dVar.f5199a), (c) com.google.android.material.transition.b.d(null, dVar.b), (c) com.google.android.material.transition.b.d(null, dVar.c), (c) com.google.android.material.transition.b.d(null, dVar.d), null);
    }

    public final boolean j(RectF rectF, RectF rectF2) {
        if (com.google.android.material.transition.b.a(rectF2) > com.google.android.material.transition.b.a(rectF)) {
            return true;
        }
        return false;
    }

    public static void e(TransitionValues transitionValues, View view, int i2, com.google.android.material.shape.a aVar) {
        RectF rectF;
        if (i2 != -1) {
            transitionValues.view = com.google.android.material.transition.b.f(transitionValues.view, i2);
        } else if (view != null) {
            transitionValues.view = view;
        } else {
            View view2 = transitionValues.view;
            int i3 = R.id.mtrl_motion_snapshot_view;
            if (view2.getTag(i3) instanceof View) {
                transitionValues.view.setTag(i3, null);
                transitionValues.view = (View) transitionValues.view.getTag(i3);
            }
        }
        View view3 = transitionValues.view;
        if (ViewCompat.isLaidOut(view3) || view3.getWidth() != 0 || view3.getHeight() != 0) {
            if (view3.getParent() == null) {
                rectF = com.google.android.material.transition.b.h(view3);
            } else {
                rectF = com.google.android.material.transition.b.g(view3);
            }
            transitionValues.values.put("materialContainerTransition:bounds", rectF);
            transitionValues.values.put("materialContainerTransition:shapeAppearance", d(view3, rectF, aVar));
        }
    }

    @Override // androidx.transition.Transition
    public Animator createAnimator(ViewGroup viewGroup, TransitionValues transitionValues, TransitionValues transitionValues2) {
        View view;
        if (!(transitionValues == null || transitionValues2 == null)) {
            RectF rectF = (RectF) transitionValues.values.get("materialContainerTransition:bounds");
            com.google.android.material.shape.a aVar = (com.google.android.material.shape.a) transitionValues.values.get("materialContainerTransition:shapeAppearance");
            if (!(rectF == null || aVar == null)) {
                RectF rectF2 = (RectF) transitionValues2.values.get("materialContainerTransition:bounds");
                com.google.android.material.shape.a aVar2 = (com.google.android.material.shape.a) transitionValues2.values.get("materialContainerTransition:shapeAppearance");
                if (!(rectF2 == null || aVar2 == null)) {
                    View view2 = transitionValues.view;
                    View view3 = transitionValues2.view;
                    View view4 = view3.getParent() != null ? view3 : view2;
                    int id = view4.getId();
                    int i2 = this.f5195a;
                    if (i2 == id) {
                        view = (View) view4.getParent();
                    } else {
                        view = com.google.android.material.transition.b.e(view4, i2);
                        view4 = null;
                    }
                    RectF g = com.google.android.material.transition.b.g(view);
                    float f = -g.left;
                    float f2 = -g.top;
                    RectF c2 = c(view, view4, f, f2);
                    rectF.offset(f, f2);
                    rectF2.offset(f, f2);
                    boolean j2 = j(rectF, rectF2);
                    e eVar = new e(getPathMotion(), view2, rectF, aVar, f(this.f, view2), view3, rectF2, aVar2, f(this.g, view3), 0, 0, 0, this.d, j2, this.e, wx8.a(0, j2), vj9.a(0, j2, rectF, rectF2), b(j2), false, null);
                    eVar.setBounds(Math.round(c2.left), Math.round(c2.top), Math.round(c2.right), Math.round(c2.bottom));
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    ofFloat.addUpdateListener(new a(eVar));
                    addListener(new b(view, eVar, view2, view3));
                    return ofFloat;
                }
            }
        }
        return null;
    }
}
