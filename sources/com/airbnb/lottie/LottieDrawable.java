package com.airbnb.lottie;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import com.airbnb.lottie.LottieDrawable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import tb.ayl;
import tb.e4g;
import tb.emh;
import tb.fmh;
import tb.h4i;
import tb.iu9;
import tb.ju9;
import tb.k6g;
import tb.kkh;
import tb.mig;
import tb.oie;
import tb.olh;
import tb.pie;
import tb.qdg;
import tb.uvi;
import tb.vkt;
import tb.ylh;
import tb.zhh;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class LottieDrawable extends Drawable implements Drawable.Callback, Animatable {
    public static final int INFINITE = -1;
    public static final int RESTART = 1;
    public static final int REVERSE = 2;
    public Canvas A;
    public Rect B;
    public RectF C;
    public Paint D;
    public Rect E;
    public Rect F;
    public RectF G;
    public RectF H;
    public Matrix I;
    public Matrix J;

    /* renamed from: a  reason: collision with root package name */
    public kkh f1843a;
    public final emh b;
    public final ValueAnimator.AnimatorUpdateListener h;
    public pie i;
    public String j;
    public oie k;
    public ju9 l;
    public iu9 m;
    public vkt n;
    public boolean o;
    public com.airbnb.lottie.model.layer.b r;
    public boolean t;
    public boolean u;
    public boolean v;
    public Bitmap z;
    public boolean c = true;
    public boolean d = false;
    public boolean e = false;
    public OnVisibleAction f = OnVisibleAction.NONE;
    public final ArrayList<b> g = new ArrayList<>();
    public boolean p = false;
    public boolean q = true;
    public int s = 255;
    public RenderMode w = RenderMode.AUTOMATIC;
    public boolean x = false;
    public final Matrix y = new Matrix();
    public boolean K = false;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public enum OnVisibleAction {
        NONE,
        PLAY,
        RESUME
    }

    /* compiled from: Taobao */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public @interface RepeatMode {
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class a implements ValueAnimator.AnimatorUpdateListener {
        public a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            if (LottieDrawable.this.r != null) {
                LottieDrawable.this.r.L(LottieDrawable.this.b.h());
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public interface b {
        void a(kkh kkhVar);
    }

    public LottieDrawable() {
        emh emhVar = new emh();
        this.b = emhVar;
        a aVar = new a();
        this.h = aVar;
        emhVar.addUpdateListener(aVar);
    }

    public final void A(Rect rect, RectF rectF) {
        rectF.set(rect.left, rect.top, rect.right, rect.bottom);
    }

    public void A0() {
        float f;
        if (this.r == null) {
            this.g.add(new b() { // from class: tb.hlh
                @Override // com.airbnb.lottie.LottieDrawable.b
                public final void a(kkh kkhVar) {
                    LottieDrawable.this.l0(kkhVar);
                }
            });
            return;
        }
        z();
        boolean v = v();
        emh emhVar = this.b;
        if (v || Y() == 0) {
            if (isVisible()) {
                emhVar.p();
            } else {
                this.f = OnVisibleAction.PLAY;
            }
        }
        if (!v()) {
            if (a0() < 0.0f) {
                f = U();
            } else {
                f = T();
            }
            P0((int) f);
            emhVar.g();
            if (!isVisible()) {
                this.f = OnVisibleAction.NONE;
            }
        }
    }

    public final void B(RectF rectF, Rect rect) {
        rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
    }

    public void B0() {
        this.b.removeAllListeners();
    }

    public void C0() {
        emh emhVar = this.b;
        emhVar.removeAllUpdateListeners();
        emhVar.addUpdateListener(this.h);
    }

    public final void D(Canvas canvas) {
        com.airbnb.lottie.model.layer.b bVar = this.r;
        kkh kkhVar = this.f1843a;
        if (bVar != null && kkhVar != null) {
            Matrix matrix = this.y;
            matrix.reset();
            Rect bounds = getBounds();
            if (!bounds.isEmpty()) {
                matrix.preScale(bounds.width() / kkhVar.b().width(), bounds.height() / kkhVar.b().height());
            }
            bVar.b(canvas, matrix, this.s);
        }
    }

    public void D0(Animator.AnimatorListener animatorListener) {
        this.b.removeListener(animatorListener);
    }

    public void E(boolean z) {
        if (this.o != z) {
            this.o = z;
            if (this.f1843a != null) {
                w();
            }
        }
    }

    public void E0(Animator.AnimatorPauseListener animatorPauseListener) {
        this.b.removePauseListener(animatorPauseListener);
    }

    public boolean F() {
        return this.o;
    }

    public void F0(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.b.removeUpdateListener(animatorUpdateListener);
    }

    public void G() {
        this.g.clear();
        this.b.g();
        if (!isVisible()) {
            this.f = OnVisibleAction.NONE;
        }
    }

    public final void G0(Canvas canvas, com.airbnb.lottie.model.layer.b bVar) {
        if (this.f1843a != null && bVar != null) {
            I();
            canvas.getMatrix(this.I);
            canvas.getClipBounds(this.B);
            A(this.B, this.C);
            this.I.mapRect(this.C);
            B(this.C, this.B);
            if (this.q) {
                this.H.set(0.0f, 0.0f, getIntrinsicWidth(), getIntrinsicHeight());
            } else {
                bVar.e(this.H, null, false);
            }
            this.I.mapRect(this.H);
            Rect bounds = getBounds();
            float width = bounds.width() / getIntrinsicWidth();
            float height = bounds.height() / getIntrinsicHeight();
            K0(this.H, width, height);
            if (!f0()) {
                RectF rectF = this.H;
                Rect rect = this.B;
                rectF.intersect(rect.left, rect.top, rect.right, rect.bottom);
            }
            int ceil = (int) Math.ceil(this.H.width());
            int ceil2 = (int) Math.ceil(this.H.height());
            if (ceil != 0 && ceil2 != 0) {
                H(ceil, ceil2);
                if (this.K) {
                    Matrix matrix = this.y;
                    matrix.set(this.I);
                    matrix.preScale(width, height);
                    RectF rectF2 = this.H;
                    matrix.postTranslate(-rectF2.left, -rectF2.top);
                    this.z.eraseColor(0);
                    bVar.b(this.A, matrix, this.s);
                    this.I.invert(this.J);
                    this.J.mapRect(this.G, this.H);
                    B(this.G, this.F);
                }
                this.E.set(0, 0, ceil, ceil2);
                canvas.drawBitmap(this.z, this.E, this.F, this.D);
            }
        }
    }

    public final void H(int i, int i2) {
        Bitmap bitmap = this.z;
        if (bitmap == null || bitmap.getWidth() < i || this.z.getHeight() < i2) {
            Bitmap createBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
            this.z = createBitmap;
            this.A.setBitmap(createBitmap);
            this.K = true;
        } else if (this.z.getWidth() > i || this.z.getHeight() > i2) {
            Bitmap createBitmap2 = Bitmap.createBitmap(this.z, 0, 0, i, i2);
            this.z = createBitmap2;
            this.A.setBitmap(createBitmap2);
            this.K = true;
        }
    }

    public List<e4g> H0(e4g e4gVar) {
        if (this.r == null) {
            zhh.d("Cannot resolve KeyPath. Composition is not set yet.");
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        this.r.d(e4gVar, 0, arrayList, new e4g(new String[0]));
        return arrayList;
    }

    public final void I() {
        if (this.A == null) {
            this.A = new Canvas();
            this.H = new RectF();
            this.I = new Matrix();
            this.J = new Matrix();
            this.B = new Rect();
            this.C = new RectF();
            this.D = new qdg();
            this.E = new Rect();
            this.F = new Rect();
            this.G = new RectF();
        }
    }

    public void I0() {
        float f;
        if (this.r == null) {
            this.g.add(new b() { // from class: tb.dlh
                @Override // com.airbnb.lottie.LottieDrawable.b
                public final void a(kkh kkhVar) {
                    LottieDrawable.this.m0(kkhVar);
                }
            });
            return;
        }
        z();
        boolean v = v();
        emh emhVar = this.b;
        if (v || Y() == 0) {
            if (isVisible()) {
                emhVar.t();
            } else {
                this.f = OnVisibleAction.RESUME;
            }
        }
        if (!v()) {
            if (a0() < 0.0f) {
                f = U();
            } else {
                f = T();
            }
            P0((int) f);
            emhVar.g();
            if (!isVisible()) {
                this.f = OnVisibleAction.NONE;
            }
        }
    }

    public Bitmap J(String str) {
        pie P = P();
        if (P != null) {
            return P.a(str);
        }
        return null;
    }

    public void J0() {
        this.b.u();
    }

    public boolean K() {
        return this.q;
    }

    public final void K0(RectF rectF, float f, float f2) {
        rectF.set(rectF.left * f, rectF.top * f2, rectF.right * f, rectF.bottom * f2);
    }

    public kkh L() {
        return this.f1843a;
    }

    public void L0(boolean z) {
        this.v = z;
    }

    public final Context M() {
        Drawable.Callback callback = getCallback();
        if (callback != null && (callback instanceof View)) {
            return ((View) callback).getContext();
        }
        return null;
    }

    public void M0(boolean z) {
        if (z != this.q) {
            this.q = z;
            com.airbnb.lottie.model.layer.b bVar = this.r;
            if (bVar != null) {
                bVar.Q(z);
            }
            invalidateSelf();
        }
    }

    public final ju9 N() {
        if (getCallback() == null) {
            return null;
        }
        if (this.l == null) {
            this.l = new ju9(getCallback(), this.m);
        }
        return this.l;
    }

    public boolean N0(kkh kkhVar) {
        if (this.f1843a == kkhVar) {
            return false;
        }
        this.K = true;
        y();
        this.f1843a = kkhVar;
        w();
        emh emhVar = this.b;
        emhVar.v(kkhVar);
        g1(emhVar.getAnimatedFraction());
        ArrayList<b> arrayList = this.g;
        Iterator it = new ArrayList(arrayList).iterator();
        while (it.hasNext()) {
            b bVar = (b) it.next();
            if (bVar != null) {
                bVar.a(kkhVar);
            }
            it.remove();
        }
        arrayList.clear();
        kkhVar.v(this.t);
        z();
        Drawable.Callback callback = getCallback();
        if (callback instanceof ImageView) {
            ImageView imageView = (ImageView) callback;
            imageView.setImageDrawable(null);
            imageView.setImageDrawable(this);
        }
        return true;
    }

    public int O() {
        return (int) this.b.i();
    }

    public void O0(iu9 iu9Var) {
        this.m = iu9Var;
        ju9 ju9Var = this.l;
        if (ju9Var != null) {
            ju9Var.c(iu9Var);
        }
    }

    public final pie P() {
        if (getCallback() == null) {
            return null;
        }
        pie pieVar = this.i;
        if (pieVar != null && !pieVar.b(M())) {
            this.i = null;
        }
        if (this.i == null) {
            this.i = new pie(getCallback(), this.j, this.k, this.f1843a.j());
        }
        return this.i;
    }

    public void P0(final int i) {
        if (this.f1843a == null) {
            this.g.add(new b() { // from class: tb.klh
                @Override // com.airbnb.lottie.LottieDrawable.b
                public final void a(kkh kkhVar) {
                    LottieDrawable.this.n0(i, kkhVar);
                }
            });
        } else {
            this.b.w(i);
        }
    }

    public String Q() {
        return this.j;
    }

    public void Q0(boolean z) {
        this.d = z;
    }

    public olh R(String str) {
        kkh kkhVar = this.f1843a;
        if (kkhVar == null) {
            return null;
        }
        return kkhVar.j().get(str);
    }

    public void R0(oie oieVar) {
        this.k = oieVar;
        pie pieVar = this.i;
        if (pieVar != null) {
            pieVar.d(oieVar);
        }
    }

    public boolean S() {
        return this.p;
    }

    public void S0(String str) {
        this.j = str;
    }

    public float T() {
        return this.b.k();
    }

    public void T0(boolean z) {
        this.p = z;
    }

    public float U() {
        return this.b.l();
    }

    public void U0(final int i) {
        if (this.f1843a == null) {
            this.g.add(new b() { // from class: tb.zkh
                @Override // com.airbnb.lottie.LottieDrawable.b
                public final void a(kkh kkhVar) {
                    LottieDrawable.this.p0(i, kkhVar);
                }
            });
            return;
        }
        this.b.x(i + 0.99f);
    }

    public ayl V() {
        kkh kkhVar = this.f1843a;
        if (kkhVar != null) {
            return kkhVar.n();
        }
        return null;
    }

    public void V0(final String str) {
        kkh kkhVar = this.f1843a;
        if (kkhVar == null) {
            this.g.add(new b() { // from class: tb.flh
                @Override // com.airbnb.lottie.LottieDrawable.b
                public final void a(kkh kkhVar2) {
                    LottieDrawable.this.o0(str, kkhVar2);
                }
            });
            return;
        }
        h4i l = kkhVar.l(str);
        if (l == null) {
            zhh.b("Cannot find marker with name " + str + ".");
            return;
        }
        U0((int) (l.b + l.c));
    }

    public float W() {
        return this.b.h();
    }

    public void W0(final float f) {
        kkh kkhVar = this.f1843a;
        if (kkhVar == null) {
            this.g.add(new b() { // from class: tb.clh
                @Override // com.airbnb.lottie.LottieDrawable.b
                public final void a(kkh kkhVar2) {
                    LottieDrawable.this.q0(f, kkhVar2);
                }
            });
        } else {
            U0((int) uvi.k(kkhVar.p(), this.f1843a.f(), f));
        }
    }

    public RenderMode X() {
        if (this.x) {
            return RenderMode.SOFTWARE;
        }
        return RenderMode.HARDWARE;
    }

    public void X0(final int i, final int i2) {
        if (this.f1843a == null) {
            this.g.add(new b() { // from class: tb.ykh
                @Override // com.airbnb.lottie.LottieDrawable.b
                public final void a(kkh kkhVar) {
                    LottieDrawable.this.t0(i, i2, kkhVar);
                }
            });
            return;
        }
        this.b.y(i, i2 + 0.99f);
    }

    public int Y() {
        return this.b.getRepeatCount();
    }

    public void Y0(final String str) {
        kkh kkhVar = this.f1843a;
        if (kkhVar == null) {
            this.g.add(new b() { // from class: tb.xkh
                @Override // com.airbnb.lottie.LottieDrawable.b
                public final void a(kkh kkhVar2) {
                    LottieDrawable.this.r0(str, kkhVar2);
                }
            });
            return;
        }
        h4i l = kkhVar.l(str);
        if (l == null) {
            zhh.b("Cannot find marker with name " + str + ".");
            return;
        }
        int i = (int) l.b;
        X0(i, ((int) l.c) + i);
    }

    public int Z() {
        return this.b.getRepeatMode();
    }

    public void Z0(final String str, final String str2, final boolean z) {
        float f;
        kkh kkhVar = this.f1843a;
        if (kkhVar == null) {
            this.g.add(new b() { // from class: tb.elh
                @Override // com.airbnb.lottie.LottieDrawable.b
                public final void a(kkh kkhVar2) {
                    LottieDrawable.this.s0(str, str2, z, kkhVar2);
                }
            });
            return;
        }
        h4i l = kkhVar.l(str);
        h4i l2 = this.f1843a.l(str2);
        if (l == null) {
            zhh.b("Cannot find marker with name " + str + ".");
        } else if (l2 == null) {
            zhh.b("Cannot find marker with name " + str2 + ".");
        } else {
            int i = (int) l.b;
            if (z) {
                f = 1.0f;
            } else {
                f = 0.0f;
            }
            X0(i, (int) (l2.b + f));
        }
    }

    public float a0() {
        return this.b.m();
    }

    public void a1(final float f, final float f2) {
        kkh kkhVar = this.f1843a;
        if (kkhVar == null) {
            this.g.add(new b() { // from class: tb.llh
                @Override // com.airbnb.lottie.LottieDrawable.b
                public final void a(kkh kkhVar2) {
                    LottieDrawable.this.u0(f, f2, kkhVar2);
                }
            });
        } else {
            X0((int) uvi.k(kkhVar.p(), this.f1843a.f(), f), (int) uvi.k(this.f1843a.p(), this.f1843a.f(), f2));
        }
    }

    public vkt b0() {
        return this.n;
    }

    public void b1(final int i) {
        if (this.f1843a == null) {
            this.g.add(new b() { // from class: tb.alh
                @Override // com.airbnb.lottie.LottieDrawable.b
                public final void a(kkh kkhVar) {
                    LottieDrawable.this.v0(i, kkhVar);
                }
            });
        } else {
            this.b.z(i);
        }
    }

    public Typeface c0(String str, String str2) {
        ju9 N = N();
        if (N != null) {
            return N.b(str, str2);
        }
        return null;
    }

    public void c1(final String str) {
        kkh kkhVar = this.f1843a;
        if (kkhVar == null) {
            this.g.add(new b() { // from class: tb.glh
                @Override // com.airbnb.lottie.LottieDrawable.b
                public final void a(kkh kkhVar2) {
                    LottieDrawable.this.w0(str, kkhVar2);
                }
            });
            return;
        }
        h4i l = kkhVar.l(str);
        if (l == null) {
            zhh.b("Cannot find marker with name " + str + ".");
            return;
        }
        b1((int) l.b);
    }

    public boolean d0() {
        com.airbnb.lottie.model.layer.b bVar = this.r;
        if (bVar == null || !bVar.O()) {
            return false;
        }
        return true;
    }

    public void d1(final float f) {
        kkh kkhVar = this.f1843a;
        if (kkhVar == null) {
            this.g.add(new b() { // from class: tb.ilh
                @Override // com.airbnb.lottie.LottieDrawable.b
                public final void a(kkh kkhVar2) {
                    LottieDrawable.this.x0(f, kkhVar2);
                }
            });
        } else {
            b1((int) uvi.k(kkhVar.p(), this.f1843a.f(), f));
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (this.e) {
            try {
                if (this.x) {
                    G0(canvas, this.r);
                } else {
                    D(canvas);
                }
            } catch (Throwable th) {
                zhh.c("Lottie crashed in draw!", th);
            }
        } else if (this.x) {
            G0(canvas, this.r);
        } else {
            D(canvas);
        }
        this.K = false;
        k6g.a("Drawable#draw");
    }

    public boolean e0() {
        com.airbnb.lottie.model.layer.b bVar = this.r;
        if (bVar == null || !bVar.P()) {
            return false;
        }
        return true;
    }

    public void e1(boolean z) {
        if (this.u != z) {
            this.u = z;
            com.airbnb.lottie.model.layer.b bVar = this.r;
            if (bVar != null) {
                bVar.J(z);
            }
        }
    }

    public final boolean f0() {
        Drawable.Callback callback = getCallback();
        if (!(callback instanceof View)) {
            return false;
        }
        ViewParent parent = ((View) callback).getParent();
        if (parent instanceof ViewGroup) {
            return !((ViewGroup) parent).getClipChildren();
        }
        return false;
    }

    public void f1(boolean z) {
        this.t = z;
        kkh kkhVar = this.f1843a;
        if (kkhVar != null) {
            kkhVar.v(z);
        }
    }

    public boolean g0() {
        emh emhVar = this.b;
        if (emhVar == null) {
            return false;
        }
        return emhVar.isRunning();
    }

    public void g1(final float f) {
        kkh kkhVar = this.f1843a;
        if (kkhVar == null) {
            this.g.add(new b() { // from class: tb.jlh
                @Override // com.airbnb.lottie.LottieDrawable.b
                public final void a(kkh kkhVar2) {
                    LottieDrawable.this.y0(f, kkhVar2);
                }
            });
            return;
        }
        this.b.w(kkhVar.h(f));
        k6g.a("Drawable#setProgress");
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.s;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        kkh kkhVar = this.f1843a;
        if (kkhVar == null) {
            return -1;
        }
        return kkhVar.b().height();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        kkh kkhVar = this.f1843a;
        if (kkhVar == null) {
            return -1;
        }
        return kkhVar.b().width();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    public boolean h0() {
        if (isVisible()) {
            return this.b.isRunning();
        }
        OnVisibleAction onVisibleAction = this.f;
        if (onVisibleAction == OnVisibleAction.PLAY || onVisibleAction == OnVisibleAction.RESUME) {
            return true;
        }
        return false;
    }

    public void h1(RenderMode renderMode) {
        this.w = renderMode;
        z();
    }

    public boolean i0() {
        return this.v;
    }

    public void i1(int i) {
        this.b.setRepeatCount(i);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        if (!this.K) {
            this.K = true;
            Drawable.Callback callback = getCallback();
            if (callback != null) {
                callback.invalidateDrawable(this);
            }
        }
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return g0();
    }

    public boolean j0() {
        return this.o;
    }

    public void j1(int i) {
        this.b.setRepeatMode(i);
    }

    public final /* synthetic */ void k0(e4g e4gVar, Object obj, fmh fmhVar, kkh kkhVar) {
        u(e4gVar, obj, fmhVar);
    }

    public void k1(boolean z) {
        this.e = z;
    }

    public final /* synthetic */ void l0(kkh kkhVar) {
        A0();
    }

    public void l1(float f) {
        this.b.A(f);
    }

    public final /* synthetic */ void m0(kkh kkhVar) {
        I0();
    }

    public void m1(Boolean bool) {
        this.c = bool.booleanValue();
    }

    public final /* synthetic */ void n0(int i, kkh kkhVar) {
        P0(i);
    }

    public void n1(vkt vktVar) {
        this.n = vktVar;
    }

    public final /* synthetic */ void o0(String str, kkh kkhVar) {
        V0(str);
    }

    public Bitmap o1(String str, Bitmap bitmap) {
        pie P = P();
        if (P == null) {
            zhh.d("Cannot update bitmap. Most likely the drawable is not added to a View which prevents Lottie from getting a Context.");
            return null;
        }
        Bitmap e = P.e(str, bitmap);
        invalidateSelf();
        return e;
    }

    public final /* synthetic */ void p0(int i, kkh kkhVar) {
        U0(i);
    }

    public boolean p1() {
        if (this.n != null || this.f1843a.c().size() <= 0) {
            return false;
        }
        return true;
    }

    public final /* synthetic */ void q0(float f, kkh kkhVar) {
        W0(f);
    }

    public void r(Animator.AnimatorListener animatorListener) {
        this.b.addListener(animatorListener);
    }

    public final /* synthetic */ void r0(String str, kkh kkhVar) {
        Y0(str);
    }

    public void s(Animator.AnimatorPauseListener animatorPauseListener) {
        this.b.addPauseListener(animatorPauseListener);
    }

    public final /* synthetic */ void s0(String str, String str2, boolean z, kkh kkhVar) {
        Z0(str, str2, z);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.s = i;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        zhh.d("Use addColorFilter instead.");
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        boolean isVisible = isVisible();
        boolean visible = super.setVisible(z, z2);
        if (z) {
            OnVisibleAction onVisibleAction = this.f;
            if (onVisibleAction == OnVisibleAction.PLAY) {
                A0();
            } else if (onVisibleAction == OnVisibleAction.RESUME) {
                I0();
            }
        } else if (this.b.isRunning()) {
            z0();
            this.f = OnVisibleAction.RESUME;
        } else if (isVisible) {
            this.f = OnVisibleAction.NONE;
        }
        return visible;
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        Drawable.Callback callback = getCallback();
        if ((callback instanceof View) && !((View) callback).isInEditMode()) {
            A0();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        G();
    }

    public void t(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.b.addUpdateListener(animatorUpdateListener);
    }

    public final /* synthetic */ void t0(int i, int i2, kkh kkhVar) {
        X0(i, i2);
    }

    public <T> void u(final e4g e4gVar, final T t, final fmh<T> fmhVar) {
        com.airbnb.lottie.model.layer.b bVar = this.r;
        if (bVar == null) {
            this.g.add(new b() { // from class: tb.blh
                @Override // com.airbnb.lottie.LottieDrawable.b
                public final void a(kkh kkhVar) {
                    LottieDrawable.this.k0(e4gVar, t, fmhVar, kkhVar);
                }
            });
            return;
        }
        boolean z = true;
        if (e4gVar == e4g.COMPOSITION) {
            bVar.a(t, fmhVar);
        } else if (e4gVar.d() != null) {
            e4gVar.d().a(t, fmhVar);
        } else {
            List<e4g> H0 = H0(e4gVar);
            for (int i = 0; i < H0.size(); i++) {
                H0.get(i).d().a(t, fmhVar);
            }
            z = true ^ H0.isEmpty();
        }
        if (z) {
            invalidateSelf();
            if (t == ylh.TIME_REMAP) {
                g1(W());
            }
        }
    }

    public final /* synthetic */ void u0(float f, float f2, kkh kkhVar) {
        a1(f, f2);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }

    public final boolean v() {
        if (this.c || this.d) {
            return true;
        }
        return false;
    }

    public final /* synthetic */ void v0(int i, kkh kkhVar) {
        b1(i);
    }

    public final void w() {
        kkh kkhVar = this.f1843a;
        if (kkhVar != null) {
            com.airbnb.lottie.model.layer.b bVar = new com.airbnb.lottie.model.layer.b(this, mig.b(kkhVar), kkhVar.k(), kkhVar);
            this.r = bVar;
            if (this.u) {
                bVar.J(true);
            }
            this.r.Q(this.q);
        }
    }

    public final /* synthetic */ void w0(String str, kkh kkhVar) {
        c1(str);
    }

    public void x() {
        this.g.clear();
        this.b.cancel();
        if (!isVisible()) {
            this.f = OnVisibleAction.NONE;
        }
    }

    public final /* synthetic */ void x0(float f, kkh kkhVar) {
        d1(f);
    }

    public void y() {
        emh emhVar = this.b;
        if (emhVar.isRunning()) {
            emhVar.cancel();
            if (!isVisible()) {
                this.f = OnVisibleAction.NONE;
            }
        }
        this.f1843a = null;
        this.r = null;
        this.i = null;
        emhVar.f();
        invalidateSelf();
    }

    public final /* synthetic */ void y0(float f, kkh kkhVar) {
        g1(f);
    }

    public final void z() {
        kkh kkhVar = this.f1843a;
        if (kkhVar != null) {
            this.x = this.w.useSoftwareRendering(Build.VERSION.SDK_INT, kkhVar.q(), kkhVar.m());
        }
    }

    public void z0() {
        this.g.clear();
        this.b.o();
        if (!isVisible()) {
            this.f = OnVisibleAction.NONE;
        }
    }

    @Deprecated
    public void C() {
    }
}
