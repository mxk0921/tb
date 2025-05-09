package com.google.android.material.internal;

import android.animation.TimeInterpolator;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import androidx.core.math.MathUtils;
import androidx.core.text.TextDirectionHeuristicCompat;
import androidx.core.text.TextDirectionHeuristicsCompat;
import androidx.core.util.Preconditions;
import androidx.core.view.GravityCompat;
import androidx.core.view.ViewCompat;
import com.google.android.material.internal.StaticLayoutBuilderCompat;
import tb.hkt;
import tb.m23;
import tb.pz0;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class a {
    public Bitmap A;
    public float B;
    public float C;
    public int[] D;
    public boolean E;
    public final TextPaint F;
    public final TextPaint G;
    public TimeInterpolator H;
    public TimeInterpolator I;
    public float J;
    public float K;
    public float L;
    public ColorStateList M;
    public float N;
    public float O;
    public float P;
    public ColorStateList Q;
    public StaticLayout R;
    public float S;
    public float T;
    public float U;
    public CharSequence V;

    /* renamed from: a  reason: collision with root package name */
    public final View f5109a;
    public boolean b;
    public float c;
    public ColorStateList k;
    public ColorStateList l;
    public float m;
    public float n;
    public float o;
    public float p;
    public float q;
    public float r;
    public Typeface s;
    public Typeface t;
    public Typeface u;
    public m23 v;
    public m23 w;
    public CharSequence x;
    public CharSequence y;
    public boolean z;
    public int g = 16;
    public int h = 16;
    public float i = 15.0f;
    public float j = 15.0f;
    public int W = 1;
    public final Rect e = new Rect();
    public final Rect d = new Rect();
    public final RectF f = new RectF();

    /* compiled from: Taobao */
    /* renamed from: com.google.android.material.internal.a$a  reason: collision with other inner class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class C0252a implements m23.a {
        public C0252a() {
        }

        @Override // tb.m23.a
        public void a(Typeface typeface) {
            a.this.R(typeface);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class b implements m23.a {
        public b() {
        }

        @Override // tb.m23.a
        public void a(Typeface typeface) {
            a.this.a0(typeface);
        }
    }

    public a(View view) {
        this.f5109a = view;
        TextPaint textPaint = new TextPaint(129);
        this.F = textPaint;
        this.G = new TextPaint(textPaint);
    }

    public static boolean E(float f, float f2) {
        if (Math.abs(f - f2) < 0.001f) {
            return true;
        }
        return false;
    }

    public static float H(float f, float f2, float f3, TimeInterpolator timeInterpolator) {
        if (timeInterpolator != null) {
            f3 = timeInterpolator.getInterpolation(f3);
        }
        return pz0.a(f, f2, f3);
    }

    public static boolean K(Rect rect, int i, int i2, int i3, int i4) {
        if (rect.left == i && rect.top == i2 && rect.right == i3 && rect.bottom == i4) {
            return true;
        }
        return false;
    }

    public static int a(int i, int i2, float f) {
        float f2 = 1.0f - f;
        return Color.argb((int) ((Color.alpha(i) * f2) + (Color.alpha(i2) * f)), (int) ((Color.red(i) * f2) + (Color.red(i2) * f)), (int) ((Color.green(i) * f2) + (Color.green(i2) * f)), (int) ((Color.blue(i) * f2) + (Color.blue(i2) * f)));
    }

    public CharSequence A() {
        return this.x;
    }

    public final void B(TextPaint textPaint) {
        textPaint.setTextSize(this.j);
        textPaint.setTypeface(this.s);
    }

    public final void C(TextPaint textPaint) {
        textPaint.setTextSize(this.i);
        textPaint.setTypeface(this.t);
    }

    public final void D(float f) {
        RectF rectF = this.f;
        Rect rect = this.d;
        Rect rect2 = this.e;
        rectF.left = H(rect.left, rect2.left, f, this.H);
        rectF.top = H(this.m, this.n, f, this.H);
        rectF.right = H(rect.right, rect2.right, f, this.H);
        rectF.bottom = H(rect.bottom, rect2.bottom, f, this.H);
    }

    public final boolean F() {
        if (ViewCompat.getLayoutDirection(this.f5109a) == 1) {
            return true;
        }
        return false;
    }

    public final boolean G() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2 = this.l;
        if ((colorStateList2 == null || !colorStateList2.isStateful()) && ((colorStateList = this.k) == null || !colorStateList.isStateful())) {
            return false;
        }
        return true;
    }

    public void I() {
        boolean z;
        Rect rect = this.e;
        if (rect.width() > 0 && rect.height() > 0) {
            Rect rect2 = this.d;
            if (rect2.width() > 0 && rect2.height() > 0) {
                z = true;
                this.b = z;
            }
        }
        z = false;
        this.b = z;
    }

    public void J() {
        View view = this.f5109a;
        if (view.getHeight() > 0 && view.getWidth() > 0) {
            b();
            d();
        }
    }

    public void L(int i, int i2, int i3, int i4) {
        Rect rect = this.e;
        if (!K(rect, i, i2, i3, i4)) {
            rect.set(i, i2, i3, i4);
            this.E = true;
            I();
        }
    }

    public void M(Rect rect) {
        L(rect.left, rect.top, rect.right, rect.bottom);
    }

    public void N(int i) {
        View view = this.f5109a;
        hkt hktVar = new hkt(view.getContext(), i);
        ColorStateList colorStateList = hktVar.b;
        if (colorStateList != null) {
            this.l = colorStateList;
        }
        float f = hktVar.f20710a;
        if (f != 0.0f) {
            this.j = f;
        }
        ColorStateList colorStateList2 = hktVar.f;
        if (colorStateList2 != null) {
            this.M = colorStateList2;
        }
        this.K = hktVar.g;
        this.L = hktVar.h;
        this.J = hktVar.i;
        m23 m23Var = this.w;
        if (m23Var != null) {
            m23Var.c();
        }
        this.w = new m23(new C0252a(), hktVar.e());
        hktVar.g(view.getContext(), this.w);
        J();
    }

    public final void O(float f) {
        this.S = f;
        ViewCompat.postInvalidateOnAnimation(this.f5109a);
    }

    public void P(ColorStateList colorStateList) {
        if (this.l != colorStateList) {
            this.l = colorStateList;
            J();
        }
    }

    public void Q(int i) {
        if (this.h != i) {
            this.h = i;
            J();
        }
    }

    public void R(Typeface typeface) {
        if (S(typeface)) {
            J();
        }
    }

    public final boolean S(Typeface typeface) {
        m23 m23Var = this.w;
        if (m23Var != null) {
            m23Var.c();
        }
        if (this.s == typeface) {
            return false;
        }
        this.s = typeface;
        return true;
    }

    public void T(int i, int i2, int i3, int i4) {
        Rect rect = this.d;
        if (!K(rect, i, i2, i3, i4)) {
            rect.set(i, i2, i3, i4);
            this.E = true;
            I();
        }
    }

    public void U(Rect rect) {
        T(rect.left, rect.top, rect.right, rect.bottom);
    }

    public void V(int i) {
        View view = this.f5109a;
        hkt hktVar = new hkt(view.getContext(), i);
        ColorStateList colorStateList = hktVar.b;
        if (colorStateList != null) {
            this.k = colorStateList;
        }
        float f = hktVar.f20710a;
        if (f != 0.0f) {
            this.i = f;
        }
        ColorStateList colorStateList2 = hktVar.f;
        if (colorStateList2 != null) {
            this.Q = colorStateList2;
        }
        this.O = hktVar.g;
        this.P = hktVar.h;
        this.N = hktVar.i;
        m23 m23Var = this.v;
        if (m23Var != null) {
            m23Var.c();
        }
        this.v = new m23(new b(), hktVar.e());
        hktVar.g(view.getContext(), this.v);
        J();
    }

    public final void W(float f) {
        this.T = f;
        ViewCompat.postInvalidateOnAnimation(this.f5109a);
    }

    public void X(ColorStateList colorStateList) {
        if (this.k != colorStateList) {
            this.k = colorStateList;
            J();
        }
    }

    public void Y(int i) {
        if (this.g != i) {
            this.g = i;
            J();
        }
    }

    public void Z(float f) {
        if (this.i != f) {
            this.i = f;
            J();
        }
    }

    public void a0(Typeface typeface) {
        if (b0(typeface)) {
            J();
        }
    }

    public final void b() {
        float f;
        float f2;
        float f3;
        StaticLayout staticLayout;
        float f4 = this.C;
        g(this.j);
        CharSequence charSequence = this.y;
        TextPaint textPaint = this.F;
        if (!(charSequence == null || (staticLayout = this.R) == null)) {
            this.V = TextUtils.ellipsize(charSequence, textPaint, staticLayout.getWidth(), TextUtils.TruncateAt.END);
        }
        CharSequence charSequence2 = this.V;
        float f5 = 0.0f;
        if (charSequence2 != null) {
            f = textPaint.measureText(charSequence2, 0, charSequence2.length());
        } else {
            f = 0.0f;
        }
        int absoluteGravity = GravityCompat.getAbsoluteGravity(this.h, this.z ? 1 : 0);
        int i = absoluteGravity & 112;
        Rect rect = this.e;
        if (i == 48) {
            this.n = rect.top;
        } else if (i != 80) {
            this.n = rect.centerY() - ((textPaint.descent() - textPaint.ascent()) / 2.0f);
        } else {
            this.n = rect.bottom + textPaint.ascent();
        }
        int i2 = absoluteGravity & GravityCompat.RELATIVE_HORIZONTAL_GRAVITY_MASK;
        if (i2 == 1) {
            this.p = rect.centerX() - (f / 2.0f);
        } else if (i2 != 5) {
            this.p = rect.left;
        } else {
            this.p = rect.right - f;
        }
        g(this.i);
        StaticLayout staticLayout2 = this.R;
        if (staticLayout2 != null) {
            f2 = staticLayout2.getHeight();
        } else {
            f2 = 0.0f;
        }
        CharSequence charSequence3 = this.y;
        if (charSequence3 != null) {
            f3 = textPaint.measureText(charSequence3, 0, charSequence3.length());
        } else {
            f3 = 0.0f;
        }
        StaticLayout staticLayout3 = this.R;
        if (staticLayout3 != null && this.W > 1 && !this.z) {
            f3 = staticLayout3.getWidth();
        }
        StaticLayout staticLayout4 = this.R;
        if (staticLayout4 != null) {
            f5 = staticLayout4.getLineLeft(0);
        }
        this.U = f5;
        int absoluteGravity2 = GravityCompat.getAbsoluteGravity(this.g, this.z ? 1 : 0);
        int i3 = absoluteGravity2 & 112;
        Rect rect2 = this.d;
        if (i3 == 48) {
            this.m = rect2.top;
        } else if (i3 != 80) {
            this.m = rect2.centerY() - (f2 / 2.0f);
        } else {
            this.m = (rect2.bottom - f2) + textPaint.descent();
        }
        int i4 = absoluteGravity2 & GravityCompat.RELATIVE_HORIZONTAL_GRAVITY_MASK;
        if (i4 == 1) {
            this.o = rect2.centerX() - (f3 / 2.0f);
        } else if (i4 != 5) {
            this.o = rect2.left;
        } else {
            this.o = rect2.right - f3;
        }
        h();
        d0(f4);
    }

    public final boolean b0(Typeface typeface) {
        m23 m23Var = this.v;
        if (m23Var != null) {
            m23Var.c();
        }
        if (this.t == typeface) {
            return false;
        }
        this.t = typeface;
        return true;
    }

    public float c() {
        if (this.x == null) {
            return 0.0f;
        }
        TextPaint textPaint = this.G;
        B(textPaint);
        CharSequence charSequence = this.x;
        return textPaint.measureText(charSequence, 0, charSequence.length());
    }

    public void c0(float f) {
        float clamp = MathUtils.clamp(f, 0.0f, 1.0f);
        if (clamp != this.c) {
            this.c = clamp;
            d();
        }
    }

    public final void d() {
        f(this.c);
    }

    public final void d0(float f) {
        g(f);
        ViewCompat.postInvalidateOnAnimation(this.f5109a);
    }

    public final boolean e(CharSequence charSequence) {
        TextDirectionHeuristicCompat textDirectionHeuristicCompat;
        if (F()) {
            textDirectionHeuristicCompat = TextDirectionHeuristicsCompat.FIRSTSTRONG_RTL;
        } else {
            textDirectionHeuristicCompat = TextDirectionHeuristicsCompat.FIRSTSTRONG_LTR;
        }
        return textDirectionHeuristicCompat.isRtl(charSequence, 0, charSequence.length());
    }

    public void e0(int i) {
        if (i != this.W) {
            this.W = i;
            h();
            J();
        }
    }

    public final void f(float f) {
        D(f);
        this.q = H(this.o, this.p, f, this.H);
        this.r = H(this.m, this.n, f, this.H);
        d0(H(this.i, this.j, f, this.I));
        TimeInterpolator timeInterpolator = pz0.FAST_OUT_SLOW_IN_INTERPOLATOR;
        O(1.0f - H(0.0f, 1.0f, 1.0f - f, timeInterpolator));
        W(H(1.0f, 0.0f, f, timeInterpolator));
        ColorStateList colorStateList = this.l;
        ColorStateList colorStateList2 = this.k;
        TextPaint textPaint = this.F;
        if (colorStateList != colorStateList2) {
            textPaint.setColor(a(u(), s(), f));
        } else {
            textPaint.setColor(s());
        }
        textPaint.setShadowLayer(H(this.N, this.J, f, null), H(this.O, this.K, f, null), H(this.P, this.L, f, null), a(t(this.Q), t(this.M), f));
        ViewCompat.postInvalidateOnAnimation(this.f5109a);
    }

    public void f0(TimeInterpolator timeInterpolator) {
        this.H = timeInterpolator;
        J();
    }

    public final void g(float f) {
        float f2;
        boolean z;
        boolean z2;
        if (this.x != null) {
            float width = this.e.width();
            float width2 = this.d.width();
            boolean z3 = false;
            int i = 1;
            if (E(f, this.j)) {
                f2 = this.j;
                this.B = 1.0f;
                Typeface typeface = this.u;
                Typeface typeface2 = this.s;
                if (typeface != typeface2) {
                    this.u = typeface2;
                    z = true;
                } else {
                    z = false;
                }
            } else {
                float f3 = this.i;
                Typeface typeface3 = this.u;
                Typeface typeface4 = this.t;
                if (typeface3 != typeface4) {
                    this.u = typeface4;
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (E(f, f3)) {
                    this.B = 1.0f;
                } else {
                    this.B = f / this.i;
                }
                float f4 = this.j / this.i;
                if (width2 * f4 > width) {
                    width = Math.min(width / f4, width2);
                } else {
                    width = width2;
                }
                f2 = f3;
                z = z2;
            }
            if (width > 0.0f) {
                if (this.C != f2 || this.E || z) {
                    z = true;
                } else {
                    z = false;
                }
                this.C = f2;
                this.E = false;
            }
            if (this.y == null || z) {
                TextPaint textPaint = this.F;
                textPaint.setTextSize(this.C);
                textPaint.setTypeface(this.u);
                if (this.B != 1.0f) {
                    z3 = true;
                }
                textPaint.setLinearText(z3);
                this.z = e(this.x);
                if (k0()) {
                    i = this.W;
                }
                StaticLayout i2 = i(i, width, this.z);
                this.R = i2;
                this.y = i2.getText();
            }
        }
    }

    public final boolean g0(int[] iArr) {
        this.D = iArr;
        if (!G()) {
            return false;
        }
        J();
        return true;
    }

    public final void h() {
        Bitmap bitmap = this.A;
        if (bitmap != null) {
            bitmap.recycle();
            this.A = null;
        }
    }

    public void h0(CharSequence charSequence) {
        if (charSequence == null || !TextUtils.equals(this.x, charSequence)) {
            this.x = charSequence;
            this.y = null;
            h();
            J();
        }
    }

    public final StaticLayout i(int i, float f, boolean z) {
        StaticLayout staticLayout;
        try {
            StaticLayoutBuilderCompat c = StaticLayoutBuilderCompat.c(this.x, this.F, (int) f);
            c.e(TextUtils.TruncateAt.END);
            c.g(z);
            c.d(Layout.Alignment.ALIGN_NORMAL);
            c.f(false);
            c.h(i);
            staticLayout = c.a();
        } catch (StaticLayoutBuilderCompat.StaticLayoutBuilderCompatException e) {
            Log.e("CollapsingTextHelper", e.getCause().getMessage(), e);
            staticLayout = null;
        }
        return (StaticLayout) Preconditions.checkNotNull(staticLayout);
    }

    public void i0(TimeInterpolator timeInterpolator) {
        this.I = timeInterpolator;
        J();
    }

    public void j(Canvas canvas) {
        int save = canvas.save();
        if (this.y != null && this.b) {
            float lineLeft = (this.q + this.R.getLineLeft(0)) - (this.U * 2.0f);
            this.F.setTextSize(this.C);
            float f = this.q;
            float f2 = this.r;
            float f3 = this.B;
            if (f3 != 1.0f) {
                canvas.scale(f3, f3, f, f2);
            }
            if (k0()) {
                k(canvas, lineLeft, f2);
            } else {
                canvas.translate(f, f2);
                this.R.draw(canvas);
            }
            canvas.restoreToCount(save);
        }
    }

    public void j0(Typeface typeface) {
        boolean S = S(typeface);
        boolean b0 = b0(typeface);
        if (S || b0) {
            J();
        }
    }

    public final void k(Canvas canvas, float f, float f2) {
        TextPaint textPaint = this.F;
        int alpha = textPaint.getAlpha();
        canvas.translate(f, f2);
        float f3 = alpha;
        textPaint.setAlpha((int) (this.T * f3));
        this.R.draw(canvas);
        textPaint.setAlpha((int) (this.S * f3));
        int lineBaseline = this.R.getLineBaseline(0);
        CharSequence charSequence = this.V;
        float f4 = lineBaseline;
        canvas.drawText(charSequence, 0, charSequence.length(), 0.0f, f4, textPaint);
        String trim = this.V.toString().trim();
        if (trim.endsWith("…")) {
            trim = trim.substring(0, trim.length() - 1);
        }
        textPaint.setAlpha(alpha);
        canvas.drawText(trim, 0, Math.min(this.R.getLineEnd(0), trim.length()), 0.0f, f4, (Paint) textPaint);
    }

    public final boolean k0() {
        if (this.W <= 1 || this.z) {
            return false;
        }
        return true;
    }

    public void l(RectF rectF, int i, int i2) {
        this.z = e(this.x);
        rectF.left = p(i, i2);
        Rect rect = this.e;
        rectF.top = rect.top;
        rectF.right = q(rectF, i, i2);
        rectF.bottom = rect.top + o();
    }

    public ColorStateList m() {
        return this.l;
    }

    public int n() {
        return this.h;
    }

    public float o() {
        TextPaint textPaint = this.G;
        B(textPaint);
        return -textPaint.ascent();
    }

    public final float p(int i, int i2) {
        if (i2 == 17 || (i2 & 7) == 1) {
            return (i / 2.0f) - (c() / 2.0f);
        }
        int i3 = i2 & GravityCompat.END;
        Rect rect = this.e;
        if (i3 == 8388613 || (i2 & 5) == 5) {
            if (this.z) {
                return rect.left;
            }
            return rect.right - c();
        } else if (this.z) {
            return rect.right - c();
        } else {
            return rect.left;
        }
    }

    public final float q(RectF rectF, int i, int i2) {
        if (i2 == 17 || (i2 & 7) == 1) {
            return (i / 2.0f) + (c() / 2.0f);
        }
        int i3 = i2 & GravityCompat.END;
        Rect rect = this.e;
        if (i3 == 8388613 || (i2 & 5) == 5) {
            if (this.z) {
                return rectF.left + c();
            }
            return rect.right;
        } else if (this.z) {
            return rect.right;
        } else {
            return rectF.left + c();
        }
    }

    public Typeface r() {
        Typeface typeface = this.s;
        if (typeface != null) {
            return typeface;
        }
        return Typeface.DEFAULT;
    }

    public int s() {
        return t(this.l);
    }

    public final int t(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return 0;
        }
        int[] iArr = this.D;
        if (iArr != null) {
            return colorStateList.getColorForState(iArr, 0);
        }
        return colorStateList.getDefaultColor();
    }

    public final int u() {
        return t(this.k);
    }

    public int v() {
        return this.g;
    }

    public float w() {
        TextPaint textPaint = this.G;
        C(textPaint);
        return -textPaint.ascent();
    }

    public Typeface x() {
        Typeface typeface = this.t;
        if (typeface != null) {
            return typeface;
        }
        return Typeface.DEFAULT;
    }

    public float y() {
        return this.c;
    }

    public int z() {
        return this.W;
    }
}
