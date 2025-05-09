package com.google.android.material.shape;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import androidx.core.graphics.drawable.TintAwareDrawable;
import androidx.core.util.ObjectsCompat;
import com.google.android.material.shape.a;
import com.google.android.material.shape.b;
import com.google.android.material.shape.c;
import com.taobao.taobao.R;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.BitSet;
import tb.bg0;
import tb.hu4;
import tb.l7i;
import tb.ngp;
import tb.qwn;
import tb.uhp;
import tb.za8;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class MaterialShapeDrawable extends Drawable implements TintAwareDrawable, uhp {
    public static final int SHADOW_COMPAT_MODE_ALWAYS = 2;
    public static final int SHADOW_COMPAT_MODE_DEFAULT = 0;
    public static final int SHADOW_COMPAT_MODE_NEVER = 1;
    public static final Paint w = new Paint(1);

    /* renamed from: a  reason: collision with root package name */
    public c f5116a;
    public final c.g[] b;
    public final c.g[] c;
    public final BitSet d;
    public boolean e;
    public final Matrix f;
    public final Path g;
    public final Path h;
    public final RectF i;
    public final RectF j;
    public final Region k;
    public final Region l;
    public com.google.android.material.shape.a m;
    public final Paint n;
    public final Paint o;
    public final ngp p;
    public final b.a q;
    public final com.google.android.material.shape.b r;
    public PorterDuffColorFilter s;
    public PorterDuffColorFilter t;
    public final RectF u;
    public boolean v;

    /* compiled from: Taobao */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public @interface CompatibilityShadowMode {
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class a implements b.a {
        public a() {
        }

        public void a(com.google.android.material.shape.c cVar, Matrix matrix, int i) {
            MaterialShapeDrawable materialShapeDrawable = MaterialShapeDrawable.this;
            BitSet bitSet = materialShapeDrawable.d;
            cVar.getClass();
            bitSet.set(i, false);
            materialShapeDrawable.b[i] = cVar.e(matrix);
        }

        public void b(com.google.android.material.shape.c cVar, Matrix matrix, int i) {
            MaterialShapeDrawable materialShapeDrawable = MaterialShapeDrawable.this;
            cVar.getClass();
            materialShapeDrawable.d.set(i + 4, false);
            materialShapeDrawable.c[i] = cVar.e(matrix);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class b implements a.c {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ float f5118a;

        public b(MaterialShapeDrawable materialShapeDrawable, float f) {
            this.f5118a = f;
        }

        @Override // com.google.android.material.shape.a.c
        public hu4 a(hu4 hu4Var) {
            if (hu4Var instanceof qwn) {
                return hu4Var;
            }
            return new bg0(this.f5118a, hu4Var);
        }
    }

    public /* synthetic */ MaterialShapeDrawable(c cVar, a aVar) {
        this(cVar);
    }

    public static int R(int i, int i2) {
        return (i * (i2 + (i2 >>> 7))) >>> 8;
    }

    public static MaterialShapeDrawable m(Context context, float f) {
        int b2 = l7i.b(context, R.attr.colorSurface, MaterialShapeDrawable.class.getSimpleName());
        MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable();
        materialShapeDrawable.M(context);
        materialShapeDrawable.W(ColorStateList.valueOf(b2));
        materialShapeDrawable.V(f);
        return materialShapeDrawable;
    }

    public int A() {
        c cVar = this.f5116a;
        return (int) (cVar.r * Math.sin(Math.toRadians(cVar.s)));
    }

    public int B() {
        c cVar = this.f5116a;
        return (int) (cVar.r * Math.cos(Math.toRadians(cVar.s)));
    }

    public int C() {
        return this.f5116a.q;
    }

    public final float D() {
        if (L()) {
            return this.o.getStrokeWidth() / 2.0f;
        }
        return 0.0f;
    }

    public ColorStateList E() {
        return this.f5116a.f;
    }

    public float F() {
        return this.f5116a.f5119a.r().a(u());
    }

    public float G() {
        return this.f5116a.f5119a.t().a(u());
    }

    public float H() {
        return this.f5116a.o;
    }

    public float I() {
        return w() + H();
    }

    public final boolean J() {
        c cVar = this.f5116a;
        int i = cVar.p;
        if (i == 1 || cVar.q <= 0 || (i != 2 && !T())) {
            return false;
        }
        return true;
    }

    public final boolean K() {
        Paint.Style style = this.f5116a.u;
        if (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.FILL) {
            return true;
        }
        return false;
    }

    public final boolean L() {
        Paint.Style style = this.f5116a.u;
        if ((style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.STROKE) && this.o.getStrokeWidth() > 0.0f) {
            return true;
        }
        return false;
    }

    public void M(Context context) {
        this.f5116a.b = new za8(context);
        l0();
    }

    public final void N() {
        super.invalidateSelf();
    }

    public boolean O() {
        za8 za8Var = this.f5116a.b;
        if (za8Var == null || !za8Var.d()) {
            return false;
        }
        return true;
    }

    public boolean P() {
        return this.f5116a.f5119a.u(u());
    }

    public final void Q(Canvas canvas) {
        if (J()) {
            canvas.save();
            S(canvas);
            if (!this.v) {
                n(canvas);
                canvas.restore();
                return;
            }
            RectF rectF = this.u;
            int width = (int) (rectF.width() - getBounds().width());
            int height = (int) (rectF.height() - getBounds().height());
            if (width < 0 || height < 0) {
                throw new IllegalStateException("Invalid shadow bounds. Check that the treatments result in a valid path.");
            }
            Bitmap createBitmap = Bitmap.createBitmap(((int) rectF.width()) + (this.f5116a.q * 2) + width, ((int) rectF.height()) + (this.f5116a.q * 2) + height, Bitmap.Config.ARGB_8888);
            Canvas canvas2 = new Canvas(createBitmap);
            float f = (getBounds().left - this.f5116a.q) - width;
            float f2 = (getBounds().top - this.f5116a.q) - height;
            canvas2.translate(-f, -f2);
            n(canvas2);
            canvas.drawBitmap(createBitmap, f, f2, (Paint) null);
            createBitmap.recycle();
            canvas.restore();
        }
    }

    public final void S(Canvas canvas) {
        canvas.translate(A(), B());
    }

    public boolean T() {
        int i = Build.VERSION.SDK_INT;
        if (P() || this.g.isConvex() || i >= 29) {
            return false;
        }
        return true;
    }

    public void U(float f) {
        setShapeAppearanceModel(this.f5116a.f5119a.w(f));
    }

    public void V(float f) {
        c cVar = this.f5116a;
        if (cVar.n != f) {
            cVar.n = f;
            l0();
        }
    }

    public void W(ColorStateList colorStateList) {
        c cVar = this.f5116a;
        if (cVar.c != colorStateList) {
            cVar.c = colorStateList;
            onStateChange(getState());
        }
    }

    public void X(float f) {
        c cVar = this.f5116a;
        if (cVar.j != f) {
            cVar.j = f;
            this.e = true;
            invalidateSelf();
        }
    }

    public void Y(int i, int i2, int i3, int i4) {
        c cVar = this.f5116a;
        if (cVar.h == null) {
            cVar.h = new Rect();
        }
        this.f5116a.h.set(i, i2, i3, i4);
        invalidateSelf();
    }

    public void Z(Paint.Style style) {
        this.f5116a.u = style;
        N();
    }

    public void a() {
        invalidateSelf();
    }

    public void a0(float f) {
        c cVar = this.f5116a;
        if (cVar.m != f) {
            cVar.m = f;
            l0();
        }
    }

    public void b0(boolean z) {
        this.v = z;
    }

    public void c0(int i) {
        this.p.d(i);
        this.f5116a.t = false;
        N();
    }

    public void d0(int i) {
        c cVar = this.f5116a;
        if (cVar.p != i) {
            cVar.p = i;
            N();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Paint paint = this.n;
        paint.setColorFilter(this.s);
        int alpha = paint.getAlpha();
        paint.setAlpha(R(alpha, this.f5116a.l));
        Paint paint2 = this.o;
        paint2.setColorFilter(this.t);
        paint2.setStrokeWidth(this.f5116a.k);
        int alpha2 = paint2.getAlpha();
        paint2.setAlpha(R(alpha2, this.f5116a.l));
        if (this.e) {
            i();
            g(u(), this.g);
            this.e = false;
        }
        Q(canvas);
        if (K()) {
            o(canvas);
        }
        if (L()) {
            r(canvas);
        }
        paint.setAlpha(alpha);
        paint2.setAlpha(alpha2);
    }

    public void e0(int i) {
        c cVar = this.f5116a;
        if (cVar.r != i) {
            cVar.r = i;
            N();
        }
    }

    public final PorterDuffColorFilter f(Paint paint, boolean z) {
        int color;
        int l;
        if (!z || (l = l((color = paint.getColor()))) == color) {
            return null;
        }
        return new PorterDuffColorFilter(l, PorterDuff.Mode.SRC_IN);
    }

    public void f0(float f, int i) {
        i0(f);
        h0(ColorStateList.valueOf(i));
    }

    public final void g(RectF rectF, Path path) {
        h(rectF, path);
        if (this.f5116a.i != 1.0f) {
            Matrix matrix = this.f;
            matrix.reset();
            float f = this.f5116a.i;
            matrix.setScale(f, f, rectF.width() / 2.0f, rectF.height() / 2.0f);
            path.transform(matrix);
        }
        path.computeBounds(this.u, true);
    }

    public void g0(float f, ColorStateList colorStateList) {
        i0(f);
        h0(colorStateList);
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        return this.f5116a;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        if (this.f5116a.p != 2) {
            if (P()) {
                outline.setRoundRect(getBounds(), F() * this.f5116a.j);
                return;
            }
            RectF u = u();
            Path path = this.g;
            g(u, path);
            if (path.isConvex() || Build.VERSION.SDK_INT >= 29) {
                try {
                    outline.setConvexPath(path);
                } catch (IllegalArgumentException unused) {
                }
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        Rect rect2 = this.f5116a.h;
        if (rect2 == null) {
            return super.getPadding(rect);
        }
        rect.set(rect2);
        return true;
    }

    @Override // tb.uhp
    public com.google.android.material.shape.a getShapeAppearanceModel() {
        return this.f5116a.f5119a;
    }

    @Override // android.graphics.drawable.Drawable
    public Region getTransparentRegion() {
        Rect bounds = getBounds();
        Region region = this.k;
        region.set(bounds);
        RectF u = u();
        Path path = this.g;
        g(u, path);
        Region region2 = this.l;
        region2.setPath(path, region);
        region.op(region2, Region.Op.DIFFERENCE);
        return region;
    }

    public final void h(RectF rectF, Path path) {
        c cVar = this.f5116a;
        this.r.e(cVar.f5119a, cVar.j, rectF, this.q, path);
    }

    public void h0(ColorStateList colorStateList) {
        c cVar = this.f5116a;
        if (cVar.d != colorStateList) {
            cVar.d = colorStateList;
            onStateChange(getState());
        }
    }

    public final void i() {
        com.google.android.material.shape.a x = getShapeAppearanceModel().x(new b(this, -D()));
        this.m = x;
        this.r.d(x, this.f5116a.j, v(), this.h);
    }

    public void i0(float f) {
        this.f5116a.k = f;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        this.e = true;
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        ColorStateList colorStateList3;
        ColorStateList colorStateList4;
        if (super.isStateful() || (((colorStateList = this.f5116a.f) != null && colorStateList.isStateful()) || (((colorStateList2 = this.f5116a.e) != null && colorStateList2.isStateful()) || (((colorStateList3 = this.f5116a.d) != null && colorStateList3.isStateful()) || ((colorStateList4 = this.f5116a.c) != null && colorStateList4.isStateful()))))) {
            return true;
        }
        return false;
    }

    public final PorterDuffColorFilter j(ColorStateList colorStateList, PorterDuff.Mode mode, boolean z) {
        int colorForState = colorStateList.getColorForState(getState(), 0);
        if (z) {
            colorForState = l(colorForState);
        }
        return new PorterDuffColorFilter(colorForState, mode);
    }

    public final boolean j0(int[] iArr) {
        boolean z;
        Paint paint;
        int color;
        int colorForState;
        Paint paint2;
        int color2;
        int colorForState2;
        if (this.f5116a.c == null || color2 == (colorForState2 = this.f5116a.c.getColorForState(iArr, (color2 = (paint2 = this.n).getColor())))) {
            z = false;
        } else {
            paint2.setColor(colorForState2);
            z = true;
        }
        if (this.f5116a.d == null || color == (colorForState = this.f5116a.d.getColorForState(iArr, (color = (paint = this.o).getColor())))) {
            return z;
        }
        paint.setColor(colorForState);
        return true;
    }

    public final PorterDuffColorFilter k(ColorStateList colorStateList, PorterDuff.Mode mode, Paint paint, boolean z) {
        if (colorStateList == null || mode == null) {
            return f(paint, z);
        }
        return j(colorStateList, mode, z);
    }

    public final boolean k0() {
        PorterDuffColorFilter porterDuffColorFilter = this.s;
        PorterDuffColorFilter porterDuffColorFilter2 = this.t;
        c cVar = this.f5116a;
        this.s = k(cVar.f, cVar.g, this.n, true);
        c cVar2 = this.f5116a;
        this.t = k(cVar2.e, cVar2.g, this.o, false);
        c cVar3 = this.f5116a;
        if (cVar3.t) {
            this.p.d(cVar3.f.getColorForState(getState(), 0));
        }
        if (!ObjectsCompat.equals(porterDuffColorFilter, this.s) || !ObjectsCompat.equals(porterDuffColorFilter2, this.t)) {
            return true;
        }
        return false;
    }

    public final int l(int i) {
        float I = I() + z();
        za8 za8Var = this.f5116a.b;
        if (za8Var != null) {
            return za8Var.c(i, I);
        }
        return i;
    }

    public final void l0() {
        float I = I();
        this.f5116a.q = (int) Math.ceil(0.75f * I);
        this.f5116a.r = (int) Math.ceil(I * 0.25f);
        k0();
        N();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        this.f5116a = new c(this.f5116a);
        return this;
    }

    public final void n(Canvas canvas) {
        this.d.cardinality();
        int i = this.f5116a.r;
        Path path = this.g;
        ngp ngpVar = this.p;
        if (i != 0) {
            canvas.drawPath(path, ngpVar.c());
        }
        for (int i2 = 0; i2 < 4; i2++) {
            this.b[i2].b(ngpVar, this.f5116a.q, canvas);
            this.c[i2].b(ngpVar, this.f5116a.q, canvas);
        }
        if (this.v) {
            int A = A();
            int B = B();
            canvas.translate(-A, -B);
            canvas.drawPath(path, w);
            canvas.translate(A, B);
        }
    }

    public final void o(Canvas canvas) {
        q(canvas, this.n, this.g, this.f5116a.f5119a, u());
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        this.e = true;
        super.onBoundsChange(rect);
    }

    @Override // android.graphics.drawable.Drawable, tb.ykt.b
    public boolean onStateChange(int[] iArr) {
        boolean z;
        boolean j0 = j0(iArr);
        boolean k0 = k0();
        if (j0 || k0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            invalidateSelf();
        }
        return z;
    }

    public void p(Canvas canvas, Paint paint, Path path, RectF rectF) {
        q(canvas, paint, path, this.f5116a.f5119a, rectF);
    }

    public final void q(Canvas canvas, Paint paint, Path path, com.google.android.material.shape.a aVar, RectF rectF) {
        if (aVar.u(rectF)) {
            float a2 = aVar.t().a(rectF) * this.f5116a.j;
            canvas.drawRoundRect(rectF, a2, a2, paint);
            return;
        }
        canvas.drawPath(path, paint);
    }

    public final void r(Canvas canvas) {
        q(canvas, this.o, this.h, this.m, v());
    }

    public float s() {
        return this.f5116a.f5119a.j().a(u());
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        c cVar = this.f5116a;
        if (cVar.l != i) {
            cVar.l = i;
            N();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f5116a.getClass();
        N();
    }

    @Override // tb.uhp
    public void setShapeAppearanceModel(com.google.android.material.shape.a aVar) {
        this.f5116a.f5119a = aVar;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.TintAwareDrawable
    public void setTint(int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.TintAwareDrawable
    public void setTintList(ColorStateList colorStateList) {
        this.f5116a.f = colorStateList;
        k0();
        N();
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.TintAwareDrawable
    public void setTintMode(PorterDuff.Mode mode) {
        c cVar = this.f5116a;
        if (cVar.g != mode) {
            cVar.g = mode;
            k0();
            N();
        }
    }

    public float t() {
        return this.f5116a.f5119a.l().a(u());
    }

    public RectF u() {
        RectF rectF = this.i;
        rectF.set(getBounds());
        return rectF;
    }

    public final RectF v() {
        RectF rectF = this.j;
        rectF.set(u());
        float D = D();
        rectF.inset(D, D);
        return rectF;
    }

    public float w() {
        return this.f5116a.n;
    }

    public ColorStateList x() {
        return this.f5116a.c;
    }

    public float y() {
        return this.f5116a.j;
    }

    public float z() {
        return this.f5116a.m;
    }

    public MaterialShapeDrawable() {
        this(new com.google.android.material.shape.a());
    }

    public MaterialShapeDrawable(Context context, AttributeSet attributeSet, int i, int i2) {
        this(com.google.android.material.shape.a.e(context, attributeSet, i, i2).m());
    }

    public MaterialShapeDrawable(com.google.android.material.shape.a aVar) {
        this(new c(aVar, null));
    }

    public MaterialShapeDrawable(c cVar) {
        this.b = new c.g[4];
        this.c = new c.g[4];
        this.d = new BitSet(8);
        this.f = new Matrix();
        this.g = new Path();
        this.h = new Path();
        this.i = new RectF();
        this.j = new RectF();
        this.k = new Region();
        this.l = new Region();
        Paint paint = new Paint(1);
        this.n = paint;
        Paint paint2 = new Paint(1);
        this.o = paint2;
        this.p = new ngp();
        this.r = new com.google.android.material.shape.b();
        this.u = new RectF();
        this.v = true;
        this.f5116a = cVar;
        paint2.setStyle(Paint.Style.STROKE);
        paint.setStyle(Paint.Style.FILL);
        Paint paint3 = w;
        paint3.setColor(-1);
        paint3.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        k0();
        j0(getState());
        this.q = new a();
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class c extends Drawable.ConstantState {

        /* renamed from: a  reason: collision with root package name */
        public com.google.android.material.shape.a f5119a;
        public za8 b;
        public ColorStateList c;
        public ColorStateList d;
        public final ColorStateList e;
        public ColorStateList f;
        public PorterDuff.Mode g;
        public Rect h;
        public final float i;
        public float j;
        public float k;
        public int l;
        public float m;
        public float n;
        public final float o;
        public int p;
        public int q;
        public int r;
        public final int s;
        public boolean t;
        public Paint.Style u;

        public c(com.google.android.material.shape.a aVar, za8 za8Var) {
            this.c = null;
            this.d = null;
            this.e = null;
            this.f = null;
            this.g = PorterDuff.Mode.SRC_IN;
            this.h = null;
            this.i = 1.0f;
            this.j = 1.0f;
            this.l = 255;
            this.m = 0.0f;
            this.n = 0.0f;
            this.o = 0.0f;
            this.p = 0;
            this.q = 0;
            this.r = 0;
            this.s = 0;
            this.t = false;
            this.u = Paint.Style.FILL_AND_STROKE;
            this.f5119a = aVar;
            this.b = za8Var;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable(this, null);
            materialShapeDrawable.e = true;
            return materialShapeDrawable;
        }

        public c(c cVar) {
            this.c = null;
            this.d = null;
            this.e = null;
            this.f = null;
            this.g = PorterDuff.Mode.SRC_IN;
            this.h = null;
            this.i = 1.0f;
            this.j = 1.0f;
            this.l = 255;
            this.m = 0.0f;
            this.n = 0.0f;
            this.o = 0.0f;
            this.p = 0;
            this.q = 0;
            this.r = 0;
            this.s = 0;
            this.t = false;
            this.u = Paint.Style.FILL_AND_STROKE;
            this.f5119a = cVar.f5119a;
            this.b = cVar.b;
            this.k = cVar.k;
            this.c = cVar.c;
            this.d = cVar.d;
            this.g = cVar.g;
            this.f = cVar.f;
            this.l = cVar.l;
            this.i = cVar.i;
            this.r = cVar.r;
            this.p = cVar.p;
            this.t = cVar.t;
            this.j = cVar.j;
            this.m = cVar.m;
            this.n = cVar.n;
            this.o = cVar.o;
            this.q = cVar.q;
            this.s = cVar.s;
            this.e = cVar.e;
            this.u = cVar.u;
            if (cVar.h != null) {
                this.h = new Rect(cVar.h);
            }
        }
    }
}
