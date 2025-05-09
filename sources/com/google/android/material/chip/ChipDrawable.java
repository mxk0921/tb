package com.google.android.material.chip;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.graphics.drawable.TintAwareDrawable;
import androidx.core.text.BidiFormatter;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.taobao.taobao.R;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import tb.d33;
import tb.hkt;
import tb.i1j;
import tb.u9i;
import tb.xot;
import tb.ykt;
import tb.zeo;
import tb.zx7;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class ChipDrawable extends MaterialShapeDrawable implements TintAwareDrawable, Drawable.Callback, ykt.b {
    public static final int[] G0 = {16842910};
    public static final ShapeDrawable H0 = new ShapeDrawable(new OvalShape());
    public ColorStateList A0;
    public ColorStateList B;
    public float C;
    public TextUtils.TruncateAt C0;
    public ColorStateList D;
    public int E0;
    public boolean F;
    public boolean F0;
    public Drawable G;
    public ColorStateList H;
    public float I;
    public boolean J;
    public boolean K;
    public Drawable L;
    public Drawable M;
    public ColorStateList N;
    public float O;
    public CharSequence P;
    public boolean Q;
    public boolean R;
    public Drawable S;
    public ColorStateList T;
    public i1j U;
    public i1j V;
    public float W;
    public float X;
    public float Y;
    public float Z;
    public float a0;
    public float b0;
    public float c0;
    public float d0;
    public final Context e0;
    public final ykt k0;
    public int l0;
    public int m0;
    public int n0;
    public int o0;
    public int p0;
    public int q0;
    public boolean r0;
    public int s0;
    public ColorFilter u0;
    public PorterDuffColorFilter v0;
    public ColorStateList w0;
    public ColorStateList x;
    public ColorStateList y;
    public int[] y0;
    public float z;
    public boolean z0;
    public float A = -1.0f;
    public final Paint f0 = new Paint(1);
    public final Paint.FontMetrics g0 = new Paint.FontMetrics();
    public final RectF h0 = new RectF();
    public final PointF i0 = new PointF();
    public final Path j0 = new Path();
    public int t0 = 255;
    public PorterDuff.Mode x0 = PorterDuff.Mode.SRC_IN;
    public WeakReference<a> B0 = new WeakReference<>(null);
    public CharSequence E = "";
    public boolean D0 = true;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public interface a {
        void onChipDrawableSizeChange();
    }

    public ChipDrawable(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        M(context);
        this.e0 = context;
        ykt yktVar = new ykt(this);
        this.k0 = yktVar;
        yktVar.e().density = context.getResources().getDisplayMetrics().density;
        int[] iArr = G0;
        setState(iArr);
        l2(iArr);
        if (zeo.USE_FRAMEWORK_RIPPLE) {
            H0.setTint(-1);
        }
    }

    public static boolean l1(int[] iArr, int i) {
        if (iArr == null) {
            return false;
        }
        for (int i2 : iArr) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }

    public static boolean r1(ColorStateList colorStateList) {
        if (colorStateList == null || !colorStateList.isStateful()) {
            return false;
        }
        return true;
    }

    public static boolean s1(Drawable drawable) {
        if (drawable == null || !drawable.isStateful()) {
            return false;
        }
        return true;
    }

    public static boolean t1(hkt hktVar) {
        ColorStateList colorStateList;
        if (hktVar == null || (colorStateList = hktVar.b) == null || !colorStateList.isStateful()) {
            return false;
        }
        return true;
    }

    public static ChipDrawable w0(Context context, AttributeSet attributeSet, int i, int i2) {
        ChipDrawable chipDrawable = new ChipDrawable(context, attributeSet, i, i2);
        chipDrawable.u1(attributeSet, i, i2);
        return chipDrawable;
    }

    public final void A0(Canvas canvas, Rect rect) {
        if (this.C > 0.0f && !this.F0) {
            Paint paint = this.f0;
            paint.setColor(this.o0);
            paint.setStyle(Paint.Style.STROKE);
            if (!this.F0) {
                paint.setColorFilter(j1());
            }
            RectF rectF = this.h0;
            float f = this.C;
            rectF.set(rect.left + (f / 2.0f), rect.top + (f / 2.0f), rect.right - (f / 2.0f), rect.bottom - (f / 2.0f));
            float f2 = this.A - (this.C / 2.0f);
            canvas.drawRoundRect(rectF, f2, f2, paint);
        }
    }

    public void A1(int i) {
        z1(AppCompatResources.getDrawable(this.e0, i));
    }

    public void A2(boolean z) {
        this.D0 = z;
    }

    public final void B0(Canvas canvas, Rect rect) {
        if (!this.F0) {
            Paint paint = this.f0;
            paint.setColor(this.l0);
            paint.setStyle(Paint.Style.FILL);
            RectF rectF = this.h0;
            rectF.set(rect);
            canvas.drawRoundRect(rectF, I0(), I0(), paint);
        }
    }

    public void B1(ColorStateList colorStateList) {
        if (this.T != colorStateList) {
            this.T = colorStateList;
            if (v0()) {
                DrawableCompat.setTintList(this.S, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public void B2(i1j i1jVar) {
        this.U = i1jVar;
    }

    public final void C0(Canvas canvas, Rect rect) {
        if (O2()) {
            RectF rectF = this.h0;
            p0(rect, rectF);
            float f = rectF.left;
            float f2 = rectF.top;
            canvas.translate(f, f2);
            this.L.setBounds(0, 0, (int) rectF.width(), (int) rectF.height());
            if (zeo.USE_FRAMEWORK_RIPPLE) {
                this.M.setBounds(this.L.getBounds());
                this.M.jumpToCurrentState();
                this.M.draw(canvas);
            } else {
                this.L.draw(canvas);
            }
            canvas.translate(-f, -f2);
        }
    }

    public void C1(int i) {
        B1(AppCompatResources.getColorStateList(this.e0, i));
    }

    public void C2(int i) {
        B2(i1j.d(this.e0, i));
    }

    public final void D0(Canvas canvas, Rect rect) {
        Paint paint = this.f0;
        paint.setColor(this.p0);
        paint.setStyle(Paint.Style.FILL);
        RectF rectF = this.h0;
        rectF.set(rect);
        if (!this.F0) {
            canvas.drawRoundRect(rectF, I0(), I0(), paint);
            return;
        }
        RectF rectF2 = new RectF(rect);
        Path path = this.j0;
        h(rectF2, path);
        p(canvas, paint, path, u());
    }

    public void D1(int i) {
        E1(this.e0.getResources().getBoolean(i));
    }

    public void D2(CharSequence charSequence) {
        if (charSequence == null) {
            charSequence = "";
        }
        if (!TextUtils.equals(this.E, charSequence)) {
            this.E = charSequence;
            this.k0.i(true);
            invalidateSelf();
            v1();
        }
    }

    public final void E0(Canvas canvas, Rect rect) {
        boolean z;
        if (this.E != null) {
            PointF pointF = this.i0;
            Paint.Align u0 = u0(rect, pointF);
            RectF rectF = this.h0;
            s0(rect, rectF);
            ykt yktVar = this.k0;
            if (yktVar.d() != null) {
                yktVar.e().drawableState = getState();
                yktVar.j(this.e0);
            }
            yktVar.e().setTextAlign(u0);
            int i = 0;
            if (Math.round(yktVar.f(f1().toString())) > Math.round(rectF.width())) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                i = canvas.save();
                canvas.clipRect(rectF);
            }
            CharSequence charSequence = this.E;
            if (z && this.C0 != null) {
                charSequence = TextUtils.ellipsize(charSequence, yktVar.e(), rectF.width(), this.C0);
            }
            canvas.drawText(charSequence, 0, charSequence.length(), pointF.x, pointF.y, yktVar.e());
            if (z) {
                canvas.restoreToCount(i);
            }
        }
    }

    public void E1(boolean z) {
        if (this.R != z) {
            boolean M2 = M2();
            this.R = z;
            boolean M22 = M2();
            if (M2 != M22) {
                if (M22) {
                    m0(this.S);
                } else {
                    P2(this.S);
                }
                invalidateSelf();
                v1();
            }
        }
    }

    public void E2(hkt hktVar) {
        this.k0.h(hktVar, this.e0);
    }

    public Drawable F0() {
        return this.S;
    }

    public void F1(ColorStateList colorStateList) {
        if (this.y != colorStateList) {
            this.y = colorStateList;
            onStateChange(getState());
        }
    }

    public void F2(int i) {
        E2(new hkt(this.e0, i));
    }

    public ColorStateList G0() {
        return this.T;
    }

    public void G1(int i) {
        F1(AppCompatResources.getColorStateList(this.e0, i));
    }

    public void G2(float f) {
        if (this.a0 != f) {
            this.a0 = f;
            invalidateSelf();
            v1();
        }
    }

    public ColorStateList H0() {
        return this.y;
    }

    @Deprecated
    public void H1(float f) {
        if (this.A != f) {
            this.A = f;
            setShapeAppearanceModel(getShapeAppearanceModel().w(f));
        }
    }

    public void H2(int i) {
        G2(this.e0.getResources().getDimension(i));
    }

    public float I0() {
        if (this.F0) {
            return F();
        }
        return this.A;
    }

    @Deprecated
    public void I1(int i) {
        H1(this.e0.getResources().getDimension(i));
    }

    public void I2(float f) {
        if (this.Z != f) {
            this.Z = f;
            invalidateSelf();
            v1();
        }
    }

    public float J0() {
        return this.d0;
    }

    public void J1(float f) {
        if (this.d0 != f) {
            this.d0 = f;
            invalidateSelf();
            v1();
        }
    }

    public void J2(int i) {
        I2(this.e0.getResources().getDimension(i));
    }

    public Drawable K0() {
        Drawable drawable = this.G;
        if (drawable != null) {
            return DrawableCompat.unwrap(drawable);
        }
        return null;
    }

    public void K1(int i) {
        J1(this.e0.getResources().getDimension(i));
    }

    public void K2(boolean z) {
        if (this.z0 != z) {
            this.z0 = z;
            Q2();
            onStateChange(getState());
        }
    }

    public float L0() {
        return this.I;
    }

    public void L1(Drawable drawable) {
        Drawable drawable2;
        Drawable K0 = K0();
        if (K0 != drawable) {
            float o0 = o0();
            if (drawable != null) {
                drawable2 = DrawableCompat.wrap(drawable).mutate();
            } else {
                drawable2 = null;
            }
            this.G = drawable2;
            float o02 = o0();
            P2(K0);
            if (N2()) {
                m0(this.G);
            }
            invalidateSelf();
            if (o0 != o02) {
                v1();
            }
        }
    }

    public boolean L2() {
        return this.D0;
    }

    public ColorStateList M0() {
        return this.H;
    }

    public void M1(int i) {
        L1(AppCompatResources.getDrawable(this.e0, i));
    }

    public final boolean M2() {
        if (!this.R || this.S == null || !this.r0) {
            return false;
        }
        return true;
    }

    public float N0() {
        return this.z;
    }

    public void N1(float f) {
        if (this.I != f) {
            float o0 = o0();
            this.I = f;
            float o02 = o0();
            invalidateSelf();
            if (o0 != o02) {
                v1();
            }
        }
    }

    public final boolean N2() {
        if (!this.F || this.G == null) {
            return false;
        }
        return true;
    }

    public float O0() {
        return this.W;
    }

    public void O1(int i) {
        N1(this.e0.getResources().getDimension(i));
    }

    public final boolean O2() {
        if (!this.K || this.L == null) {
            return false;
        }
        return true;
    }

    public ColorStateList P0() {
        return this.B;
    }

    public void P1(ColorStateList colorStateList) {
        this.J = true;
        if (this.H != colorStateList) {
            this.H = colorStateList;
            if (N2()) {
                DrawableCompat.setTintList(this.G, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void P2(Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback(null);
        }
    }

    public float Q0() {
        return this.C;
    }

    public void Q1(int i) {
        P1(AppCompatResources.getColorStateList(this.e0, i));
    }

    public final void Q2() {
        ColorStateList colorStateList;
        if (this.z0) {
            colorStateList = zeo.d(this.D);
        } else {
            colorStateList = null;
        }
        this.A0 = colorStateList;
    }

    public Drawable R0() {
        Drawable drawable = this.L;
        if (drawable != null) {
            return DrawableCompat.unwrap(drawable);
        }
        return null;
    }

    public void R1(int i) {
        S1(this.e0.getResources().getBoolean(i));
    }

    public final void R2() {
        this.M = new RippleDrawable(zeo.d(d1()), this.L, H0);
    }

    public CharSequence S0() {
        return this.P;
    }

    public void S1(boolean z) {
        if (this.F != z) {
            boolean N2 = N2();
            this.F = z;
            boolean N22 = N2();
            if (N2 != N22) {
                if (N22) {
                    m0(this.G);
                } else {
                    P2(this.G);
                }
                invalidateSelf();
                v1();
            }
        }
    }

    public float T0() {
        return this.c0;
    }

    public void T1(float f) {
        if (this.z != f) {
            this.z = f;
            invalidateSelf();
            v1();
        }
    }

    public float U0() {
        return this.O;
    }

    public void U1(int i) {
        T1(this.e0.getResources().getDimension(i));
    }

    public float V0() {
        return this.b0;
    }

    public void V1(float f) {
        if (this.W != f) {
            this.W = f;
            invalidateSelf();
            v1();
        }
    }

    public int[] W0() {
        return this.y0;
    }

    public void W1(int i) {
        V1(this.e0.getResources().getDimension(i));
    }

    public ColorStateList X0() {
        return this.N;
    }

    public void X1(ColorStateList colorStateList) {
        if (this.B != colorStateList) {
            this.B = colorStateList;
            if (this.F0) {
                h0(colorStateList);
            }
            onStateChange(getState());
        }
    }

    public void Y0(RectF rectF) {
        q0(getBounds(), rectF);
    }

    public void Y1(int i) {
        X1(AppCompatResources.getColorStateList(this.e0, i));
    }

    public TextUtils.TruncateAt Z0() {
        return this.C0;
    }

    public void Z1(float f) {
        if (this.C != f) {
            this.C = f;
            this.f0.setStrokeWidth(f);
            if (this.F0) {
                i0(f);
            }
            invalidateSelf();
        }
    }

    @Override // com.google.android.material.shape.MaterialShapeDrawable, tb.ykt.b
    public void a() {
        v1();
        invalidateSelf();
    }

    public i1j a1() {
        return this.V;
    }

    public void a2(int i) {
        Z1(this.e0.getResources().getDimension(i));
    }

    public float b1() {
        return this.Y;
    }

    public final void b2(ColorStateList colorStateList) {
        if (this.x != colorStateList) {
            this.x = colorStateList;
            onStateChange(getState());
        }
    }

    public float c1() {
        return this.X;
    }

    public void c2(Drawable drawable) {
        Drawable drawable2;
        Drawable R0 = R0();
        if (R0 != drawable) {
            float r0 = r0();
            if (drawable != null) {
                drawable2 = DrawableCompat.wrap(drawable).mutate();
            } else {
                drawable2 = null;
            }
            this.L = drawable2;
            if (zeo.USE_FRAMEWORK_RIPPLE) {
                R2();
            }
            float r02 = r0();
            P2(R0);
            if (O2()) {
                m0(this.L);
            }
            invalidateSelf();
            if (r0 != r02) {
                v1();
            }
        }
    }

    public ColorStateList d1() {
        return this.D;
    }

    public void d2(CharSequence charSequence) {
        if (this.P != charSequence) {
            this.P = BidiFormatter.getInstance().unicodeWrap(charSequence);
            invalidateSelf();
        }
    }

    @Override // com.google.android.material.shape.MaterialShapeDrawable, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        int i;
        Rect bounds = getBounds();
        if (!bounds.isEmpty() && getAlpha() != 0) {
            int i2 = this.t0;
            if (i2 < 255) {
                i = d33.a(canvas, bounds.left, bounds.top, bounds.right, bounds.bottom, i2);
            } else {
                i = 0;
            }
            B0(canvas, bounds);
            y0(canvas, bounds);
            if (this.F0) {
                super.draw(canvas);
            }
            A0(canvas, bounds);
            D0(canvas, bounds);
            z0(canvas, bounds);
            x0(canvas, bounds);
            if (this.D0) {
                E0(canvas, bounds);
            }
            C0(canvas, bounds);
            if (this.t0 < 255) {
                canvas.restoreToCount(i);
            }
        }
    }

    public i1j e1() {
        return this.U;
    }

    public void e2(float f) {
        if (this.c0 != f) {
            this.c0 = f;
            invalidateSelf();
            if (O2()) {
                v1();
            }
        }
    }

    public CharSequence f1() {
        return this.E;
    }

    public void f2(int i) {
        e2(this.e0.getResources().getDimension(i));
    }

    public hkt g1() {
        return this.k0.d();
    }

    public void g2(int i) {
        c2(AppCompatResources.getDrawable(this.e0, i));
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.t0;
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        return this.u0;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return (int) this.z;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return Math.min(Math.round(this.W + o0() + this.Z + this.k0.f(f1().toString()) + this.a0 + r0() + this.d0), this.E0);
    }

    @Override // com.google.android.material.shape.MaterialShapeDrawable, android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // com.google.android.material.shape.MaterialShapeDrawable, android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        if (this.F0) {
            super.getOutline(outline);
            return;
        }
        Rect bounds = getBounds();
        if (!bounds.isEmpty()) {
            outline.setRoundRect(bounds, this.A);
        } else {
            outline.setRoundRect(0, 0, getIntrinsicWidth(), getIntrinsicHeight(), this.A);
        }
        outline.setAlpha(getAlpha() / 255.0f);
    }

    public float h1() {
        return this.a0;
    }

    public void h2(float f) {
        if (this.O != f) {
            this.O = f;
            invalidateSelf();
            if (O2()) {
                v1();
            }
        }
    }

    public float i1() {
        return this.Z;
    }

    public void i2(int i) {
        h2(this.e0.getResources().getDimension(i));
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // com.google.android.material.shape.MaterialShapeDrawable, android.graphics.drawable.Drawable
    public boolean isStateful() {
        if (r1(this.x) || r1(this.y) || r1(this.B) || ((this.z0 && r1(this.A0)) || t1(this.k0.d()) || v0() || s1(this.G) || s1(this.S) || r1(this.w0))) {
            return true;
        }
        return false;
    }

    public final ColorFilter j1() {
        ColorFilter colorFilter = this.u0;
        if (colorFilter != null) {
            return colorFilter;
        }
        return this.v0;
    }

    public void j2(float f) {
        if (this.b0 != f) {
            this.b0 = f;
            invalidateSelf();
            if (O2()) {
                v1();
            }
        }
    }

    public boolean k1() {
        return this.z0;
    }

    public void k2(int i) {
        j2(this.e0.getResources().getDimension(i));
    }

    public boolean l2(int[] iArr) {
        if (Arrays.equals(this.y0, iArr)) {
            return false;
        }
        this.y0 = iArr;
        if (O2()) {
            return w1(getState(), iArr);
        }
        return false;
    }

    public final void m0(Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback(this);
            DrawableCompat.setLayoutDirection(drawable, DrawableCompat.getLayoutDirection(this));
            drawable.setLevel(getLevel());
            drawable.setVisible(isVisible(), false);
            if (drawable == this.L) {
                if (drawable.isStateful()) {
                    drawable.setState(W0());
                }
                DrawableCompat.setTintList(drawable, this.N);
                return;
            }
            if (drawable.isStateful()) {
                drawable.setState(getState());
            }
            Drawable drawable2 = this.G;
            if (drawable == drawable2 && this.J) {
                DrawableCompat.setTintList(drawable2, this.H);
            }
        }
    }

    public boolean m1() {
        return this.Q;
    }

    public void m2(ColorStateList colorStateList) {
        if (this.N != colorStateList) {
            this.N = colorStateList;
            if (O2()) {
                DrawableCompat.setTintList(this.L, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void n0(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (N2() || M2()) {
            float f = this.W + this.X;
            if (DrawableCompat.getLayoutDirection(this) == 0) {
                float f2 = rect.left + f;
                rectF.left = f2;
                rectF.right = f2 + this.I;
            } else {
                float f3 = rect.right - f;
                rectF.right = f3;
                rectF.left = f3 - this.I;
            }
            float exactCenterY = rect.exactCenterY();
            float f4 = this.I;
            float f5 = exactCenterY - (f4 / 2.0f);
            rectF.top = f5;
            rectF.bottom = f5 + f4;
        }
    }

    public boolean n1() {
        return this.R;
    }

    public void n2(int i) {
        m2(AppCompatResources.getColorStateList(this.e0, i));
    }

    public float o0() {
        if (N2() || M2()) {
            return this.X + this.I + this.Y;
        }
        return 0.0f;
    }

    public boolean o1() {
        return this.F;
    }

    public void o2(boolean z) {
        if (this.K != z) {
            boolean O2 = O2();
            this.K = z;
            boolean O22 = O2();
            if (O2 != O22) {
                if (O22) {
                    m0(this.L);
                } else {
                    P2(this.L);
                }
                invalidateSelf();
                v1();
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLayoutDirectionChanged(int i) {
        boolean onLayoutDirectionChanged = super.onLayoutDirectionChanged(i);
        if (N2()) {
            onLayoutDirectionChanged |= DrawableCompat.setLayoutDirection(this.G, i);
        }
        if (M2()) {
            onLayoutDirectionChanged |= DrawableCompat.setLayoutDirection(this.S, i);
        }
        if (O2()) {
            onLayoutDirectionChanged |= DrawableCompat.setLayoutDirection(this.L, i);
        }
        if (!onLayoutDirectionChanged) {
            return true;
        }
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLevelChange(int i) {
        boolean onLevelChange = super.onLevelChange(i);
        if (N2()) {
            onLevelChange |= this.G.setLevel(i);
        }
        if (M2()) {
            onLevelChange |= this.S.setLevel(i);
        }
        if (O2()) {
            onLevelChange |= this.L.setLevel(i);
        }
        if (onLevelChange) {
            invalidateSelf();
        }
        return onLevelChange;
    }

    @Override // com.google.android.material.shape.MaterialShapeDrawable, android.graphics.drawable.Drawable, tb.ykt.b
    public boolean onStateChange(int[] iArr) {
        if (this.F0) {
            super.onStateChange(iArr);
        }
        return w1(iArr, W0());
    }

    public final void p0(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (O2()) {
            float f = this.d0 + this.c0;
            if (DrawableCompat.getLayoutDirection(this) == 0) {
                float f2 = rect.right - f;
                rectF.right = f2;
                rectF.left = f2 - this.O;
            } else {
                float f3 = rect.left + f;
                rectF.left = f3;
                rectF.right = f3 + this.O;
            }
            float exactCenterY = rect.exactCenterY();
            float f4 = this.O;
            float f5 = exactCenterY - (f4 / 2.0f);
            rectF.top = f5;
            rectF.bottom = f5 + f4;
        }
    }

    public boolean p1() {
        return s1(this.L);
    }

    public void p2(a aVar) {
        this.B0 = new WeakReference<>(aVar);
    }

    public final void q0(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (O2()) {
            float f = this.d0 + this.c0 + this.O + this.b0 + this.a0;
            if (DrawableCompat.getLayoutDirection(this) == 0) {
                float f2 = rect.right;
                rectF.right = f2;
                rectF.left = f2 - f;
            } else {
                int i = rect.left;
                rectF.left = i;
                rectF.right = i + f;
            }
            rectF.top = rect.top;
            rectF.bottom = rect.bottom;
        }
    }

    public boolean q1() {
        return this.K;
    }

    public void q2(TextUtils.TruncateAt truncateAt) {
        this.C0 = truncateAt;
    }

    public float r0() {
        if (O2()) {
            return this.b0 + this.O + this.c0;
        }
        return 0.0f;
    }

    public void r2(i1j i1jVar) {
        this.V = i1jVar;
    }

    public final void s0(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (this.E != null) {
            float o0 = this.W + o0() + this.Z;
            float r0 = this.d0 + r0() + this.a0;
            if (DrawableCompat.getLayoutDirection(this) == 0) {
                rectF.left = rect.left + o0;
                rectF.right = rect.right - r0;
            } else {
                rectF.left = rect.left + r0;
                rectF.right = rect.right - o0;
            }
            rectF.top = rect.top;
            rectF.bottom = rect.bottom;
        }
    }

    public void s2(int i) {
        r2(i1j.d(this.e0, i));
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j);
        }
    }

    @Override // com.google.android.material.shape.MaterialShapeDrawable, android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        if (this.t0 != i) {
            this.t0 = i;
            invalidateSelf();
        }
    }

    @Override // com.google.android.material.shape.MaterialShapeDrawable, android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        if (this.u0 != colorFilter) {
            this.u0 = colorFilter;
            invalidateSelf();
        }
    }

    @Override // com.google.android.material.shape.MaterialShapeDrawable, android.graphics.drawable.Drawable, androidx.core.graphics.drawable.TintAwareDrawable
    public void setTintList(ColorStateList colorStateList) {
        if (this.w0 != colorStateList) {
            this.w0 = colorStateList;
            onStateChange(getState());
        }
    }

    @Override // com.google.android.material.shape.MaterialShapeDrawable, android.graphics.drawable.Drawable, androidx.core.graphics.drawable.TintAwareDrawable
    public void setTintMode(PorterDuff.Mode mode) {
        if (this.x0 != mode) {
            this.x0 = mode;
            this.v0 = zx7.b(this, this.w0, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        if (N2()) {
            visible |= this.G.setVisible(z, z2);
        }
        if (M2()) {
            visible |= this.S.setVisible(z, z2);
        }
        if (O2()) {
            visible |= this.L.setVisible(z, z2);
        }
        if (visible) {
            invalidateSelf();
        }
        return visible;
    }

    public final float t0() {
        TextPaint e = this.k0.e();
        Paint.FontMetrics fontMetrics = this.g0;
        e.getFontMetrics(fontMetrics);
        return (fontMetrics.descent + fontMetrics.ascent) / 2.0f;
    }

    public void t2(float f) {
        if (this.Y != f) {
            float o0 = o0();
            this.Y = f;
            float o02 = o0();
            invalidateSelf();
            if (o0 != o02) {
                v1();
            }
        }
    }

    public Paint.Align u0(Rect rect, PointF pointF) {
        pointF.set(0.0f, 0.0f);
        Paint.Align align = Paint.Align.LEFT;
        if (this.E != null) {
            float o0 = this.W + o0() + this.Z;
            if (DrawableCompat.getLayoutDirection(this) == 0) {
                pointF.x = rect.left + o0;
            } else {
                pointF.x = rect.right - o0;
                align = Paint.Align.RIGHT;
            }
            pointF.y = rect.centerY() - t0();
        }
        return align;
    }

    public final void u1(AttributeSet attributeSet, int i, int i2) {
        TypedArray h = xot.h(this.e0, attributeSet, R.styleable.Chip, i, i2, new int[0]);
        this.F0 = h.hasValue(R.styleable.Chip_shapeAppearance);
        int i3 = R.styleable.Chip_chipSurfaceColor;
        Context context = this.e0;
        b2(u9i.a(context, h, i3));
        F1(u9i.a(context, h, R.styleable.Chip_chipBackgroundColor));
        T1(h.getDimension(R.styleable.Chip_chipMinHeight, 0.0f));
        int i4 = R.styleable.Chip_chipCornerRadius;
        if (h.hasValue(i4)) {
            H1(h.getDimension(i4, 0.0f));
        }
        X1(u9i.a(context, h, R.styleable.Chip_chipStrokeColor));
        Z1(h.getDimension(R.styleable.Chip_chipStrokeWidth, 0.0f));
        y2(u9i.a(context, h, R.styleable.Chip_rippleColor));
        D2(h.getText(R.styleable.Chip_android_text));
        E2(u9i.f(context, h, R.styleable.Chip_android_textAppearance));
        int i5 = h.getInt(R.styleable.Chip_android_ellipsize, 0);
        if (i5 == 1) {
            q2(TextUtils.TruncateAt.START);
        } else if (i5 == 2) {
            q2(TextUtils.TruncateAt.MIDDLE);
        } else if (i5 == 3) {
            q2(TextUtils.TruncateAt.END);
        }
        S1(h.getBoolean(R.styleable.Chip_chipIconVisible, false));
        if (!(attributeSet == null || attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconEnabled") == null || attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconVisible") != null)) {
            S1(h.getBoolean(R.styleable.Chip_chipIconEnabled, false));
        }
        L1(u9i.d(context, h, R.styleable.Chip_chipIcon));
        int i6 = R.styleable.Chip_chipIconTint;
        if (h.hasValue(i6)) {
            P1(u9i.a(context, h, i6));
        }
        N1(h.getDimension(R.styleable.Chip_chipIconSize, 0.0f));
        o2(h.getBoolean(R.styleable.Chip_closeIconVisible, false));
        if (!(attributeSet == null || attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconEnabled") == null || attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconVisible") != null)) {
            o2(h.getBoolean(R.styleable.Chip_closeIconEnabled, false));
        }
        c2(u9i.d(context, h, R.styleable.Chip_closeIcon));
        m2(u9i.a(context, h, R.styleable.Chip_closeIconTint));
        h2(h.getDimension(R.styleable.Chip_closeIconSize, 0.0f));
        x1(h.getBoolean(R.styleable.Chip_android_checkable, false));
        E1(h.getBoolean(R.styleable.Chip_checkedIconVisible, false));
        if (!(attributeSet == null || attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconEnabled") == null || attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconVisible") != null)) {
            E1(h.getBoolean(R.styleable.Chip_checkedIconEnabled, false));
        }
        z1(u9i.d(context, h, R.styleable.Chip_checkedIcon));
        int i7 = R.styleable.Chip_checkedIconTint;
        if (h.hasValue(i7)) {
            B1(u9i.a(context, h, i7));
        }
        B2(i1j.c(context, h, R.styleable.Chip_showMotionSpec));
        r2(i1j.c(context, h, R.styleable.Chip_hideMotionSpec));
        V1(h.getDimension(R.styleable.Chip_chipStartPadding, 0.0f));
        v2(h.getDimension(R.styleable.Chip_iconStartPadding, 0.0f));
        t2(h.getDimension(R.styleable.Chip_iconEndPadding, 0.0f));
        I2(h.getDimension(R.styleable.Chip_textStartPadding, 0.0f));
        G2(h.getDimension(R.styleable.Chip_textEndPadding, 0.0f));
        j2(h.getDimension(R.styleable.Chip_closeIconStartPadding, 0.0f));
        e2(h.getDimension(R.styleable.Chip_closeIconEndPadding, 0.0f));
        J1(h.getDimension(R.styleable.Chip_chipEndPadding, 0.0f));
        x2(h.getDimensionPixelSize(R.styleable.Chip_android_maxWidth, Integer.MAX_VALUE));
        h.recycle();
    }

    public void u2(int i) {
        t2(this.e0.getResources().getDimension(i));
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }

    public final boolean v0() {
        if (!this.R || this.S == null || !this.Q) {
            return false;
        }
        return true;
    }

    public void v1() {
        a aVar = this.B0.get();
        if (aVar != null) {
            aVar.onChipDrawableSizeChange();
        }
    }

    public void v2(float f) {
        if (this.X != f) {
            float o0 = o0();
            this.X = f;
            float o02 = o0();
            invalidateSelf();
            if (o0 != o02) {
                v1();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:71:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0146  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean w1(int[] r7, int[] r8) {
        /*
            Method dump skipped, instructions count: 330
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.ChipDrawable.w1(int[], int[]):boolean");
    }

    public void w2(int i) {
        v2(this.e0.getResources().getDimension(i));
    }

    public final void x0(Canvas canvas, Rect rect) {
        if (M2()) {
            RectF rectF = this.h0;
            n0(rect, rectF);
            float f = rectF.left;
            float f2 = rectF.top;
            canvas.translate(f, f2);
            this.S.setBounds(0, 0, (int) rectF.width(), (int) rectF.height());
            this.S.draw(canvas);
            canvas.translate(-f, -f2);
        }
    }

    public void x1(boolean z) {
        if (this.Q != z) {
            this.Q = z;
            float o0 = o0();
            if (!z && this.r0) {
                this.r0 = false;
            }
            float o02 = o0();
            invalidateSelf();
            if (o0 != o02) {
                v1();
            }
        }
    }

    public void x2(int i) {
        this.E0 = i;
    }

    public final void y0(Canvas canvas, Rect rect) {
        if (!this.F0) {
            Paint paint = this.f0;
            paint.setColor(this.m0);
            paint.setStyle(Paint.Style.FILL);
            paint.setColorFilter(j1());
            RectF rectF = this.h0;
            rectF.set(rect);
            canvas.drawRoundRect(rectF, I0(), I0(), paint);
        }
    }

    public void y1(int i) {
        x1(this.e0.getResources().getBoolean(i));
    }

    public void y2(ColorStateList colorStateList) {
        if (this.D != colorStateList) {
            this.D = colorStateList;
            Q2();
            onStateChange(getState());
        }
    }

    public final void z0(Canvas canvas, Rect rect) {
        if (N2()) {
            RectF rectF = this.h0;
            n0(rect, rectF);
            float f = rectF.left;
            float f2 = rectF.top;
            canvas.translate(f, f2);
            this.G.setBounds(0, 0, (int) rectF.width(), (int) rectF.height());
            this.G.draw(canvas);
            canvas.translate(-f, -f2);
        }
    }

    public void z1(Drawable drawable) {
        if (this.S != drawable) {
            float o0 = o0();
            this.S = drawable;
            float o02 = o0();
            P2(this.S);
            m0(this.S);
            invalidateSelf();
            if (o0 != o02) {
                v1();
            }
        }
    }

    public void z2(int i) {
        y2(AppCompatResources.getColorStateList(this.e0, i));
    }
}
