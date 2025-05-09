package com.google.android.material.shape;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import com.taobao.taobao.R;
import tb.e78;
import tb.hu4;
import tb.ju4;
import tb.qwn;
import tb.r25;
import tb.tgo;
import tb.w9i;
import tb.zz;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class a {
    public static final hu4 PILL = new qwn(0.5f);

    /* renamed from: a  reason: collision with root package name */
    public final ju4 f5120a;
    public final ju4 b;
    public final ju4 c;
    public final ju4 d;
    public final hu4 e;
    public final hu4 f;
    public final hu4 g;
    public final hu4 h;
    public final e78 i;
    public final e78 j;
    public final e78 k;
    public final e78 l;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public interface c {
        hu4 a(hu4 hu4Var);
    }

    public static b a() {
        return new b();
    }

    public static b b(Context context, int i, int i2) {
        return c(context, i, i2, 0);
    }

    public static b c(Context context, int i, int i2, int i3) {
        return d(context, i, i2, new zz(i3));
    }

    public static b d(Context context, int i, int i2, hu4 hu4Var) {
        if (i2 != 0) {
            ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, i);
            i = i2;
            context = contextThemeWrapper;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, R.styleable.ShapeAppearance);
        try {
            int i3 = obtainStyledAttributes.getInt(R.styleable.ShapeAppearance_cornerFamily, 0);
            int i4 = obtainStyledAttributes.getInt(R.styleable.ShapeAppearance_cornerFamilyTopLeft, i3);
            int i5 = obtainStyledAttributes.getInt(R.styleable.ShapeAppearance_cornerFamilyTopRight, i3);
            int i6 = obtainStyledAttributes.getInt(R.styleable.ShapeAppearance_cornerFamilyBottomRight, i3);
            int i7 = obtainStyledAttributes.getInt(R.styleable.ShapeAppearance_cornerFamilyBottomLeft, i3);
            hu4 m = m(obtainStyledAttributes, R.styleable.ShapeAppearance_cornerSize, hu4Var);
            hu4 m2 = m(obtainStyledAttributes, R.styleable.ShapeAppearance_cornerSizeTopLeft, m);
            hu4 m3 = m(obtainStyledAttributes, R.styleable.ShapeAppearance_cornerSizeTopRight, m);
            hu4 m4 = m(obtainStyledAttributes, R.styleable.ShapeAppearance_cornerSizeBottomRight, m);
            hu4 m5 = m(obtainStyledAttributes, R.styleable.ShapeAppearance_cornerSizeBottomLeft, m);
            b bVar = new b();
            bVar.B(i4, m2);
            bVar.F(i5, m3);
            bVar.w(i6, m4);
            bVar.s(i7, m5);
            return bVar;
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public static b e(Context context, AttributeSet attributeSet, int i, int i2) {
        return f(context, attributeSet, i, i2, 0);
    }

    public static b f(Context context, AttributeSet attributeSet, int i, int i2, int i3) {
        return g(context, attributeSet, i, i2, new zz(i3));
    }

    public static b g(Context context, AttributeSet attributeSet, int i, int i2, hu4 hu4Var) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.MaterialShape, i, i2);
        int resourceId = obtainStyledAttributes.getResourceId(R.styleable.MaterialShape_shapeAppearance, 0);
        int resourceId2 = obtainStyledAttributes.getResourceId(R.styleable.MaterialShape_shapeAppearanceOverlay, 0);
        obtainStyledAttributes.recycle();
        return d(context, resourceId, resourceId2, hu4Var);
    }

    public static hu4 m(TypedArray typedArray, int i, hu4 hu4Var) {
        TypedValue peekValue = typedArray.peekValue(i);
        if (peekValue == null) {
            return hu4Var;
        }
        int i2 = peekValue.type;
        if (i2 == 5) {
            return new zz(TypedValue.complexToDimensionPixelSize(peekValue.data, typedArray.getResources().getDisplayMetrics()));
        }
        if (i2 == 6) {
            return new qwn(peekValue.getFraction(1.0f, 1.0f));
        }
        return hu4Var;
    }

    public e78 h() {
        return this.k;
    }

    public ju4 i() {
        return this.d;
    }

    public hu4 j() {
        return this.h;
    }

    public ju4 k() {
        return this.c;
    }

    public hu4 l() {
        return this.g;
    }

    public e78 n() {
        return this.l;
    }

    public e78 o() {
        return this.j;
    }

    public e78 p() {
        return this.i;
    }

    public ju4 q() {
        return this.f5120a;
    }

    public hu4 r() {
        return this.e;
    }

    public ju4 s() {
        return this.b;
    }

    public hu4 t() {
        return this.f;
    }

    public boolean u(RectF rectF) {
        boolean z;
        boolean z2;
        boolean z3;
        if (!this.l.getClass().equals(e78.class) || !this.j.getClass().equals(e78.class) || !this.i.getClass().equals(e78.class) || !this.k.getClass().equals(e78.class)) {
            z = false;
        } else {
            z = true;
        }
        float a2 = this.e.a(rectF);
        if (this.f.a(rectF) == a2 && this.h.a(rectF) == a2 && this.g.a(rectF) == a2) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!(this.b instanceof tgo) || !(this.f5120a instanceof tgo) || !(this.c instanceof tgo) || !(this.d instanceof tgo)) {
            z3 = false;
        } else {
            z3 = true;
        }
        if (!z || !z2 || !z3) {
            return false;
        }
        return true;
    }

    public b v() {
        return new b(this);
    }

    public a w(float f) {
        b v = v();
        v.o(f);
        return v.m();
    }

    public a x(c cVar) {
        b v = v();
        v.E(cVar.a(r()));
        v.I(cVar.a(t()));
        v.v(cVar.a(j()));
        v.z(cVar.a(l()));
        return v.m();
    }

    public a(b bVar) {
        this.f5120a = bVar.f5121a;
        this.b = bVar.b;
        this.c = bVar.c;
        this.d = bVar.d;
        this.e = bVar.e;
        this.f = bVar.f;
        this.g = bVar.g;
        this.h = bVar.h;
        this.i = bVar.i;
        this.j = bVar.j;
        this.k = bVar.k;
        this.l = bVar.l;
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public ju4 f5121a;
        public ju4 b;
        public ju4 c;
        public ju4 d;
        public hu4 e;
        public hu4 f;
        public hu4 g;
        public hu4 h;
        public e78 i;
        public final e78 j;
        public e78 k;
        public final e78 l;

        public b() {
            this.f5121a = w9i.b();
            this.b = w9i.b();
            this.c = w9i.b();
            this.d = w9i.b();
            this.e = new zz(0.0f);
            this.f = new zz(0.0f);
            this.g = new zz(0.0f);
            this.h = new zz(0.0f);
            this.i = w9i.c();
            this.j = w9i.c();
            this.k = w9i.c();
            this.l = w9i.c();
        }

        public static float n(ju4 ju4Var) {
            if (ju4Var instanceof tgo) {
                return ((tgo) ju4Var).f28711a;
            }
            if (ju4Var instanceof r25) {
                return ((r25) ju4Var).f27051a;
            }
            return -1.0f;
        }

        public b A(e78 e78Var) {
            this.i = e78Var;
            return this;
        }

        public b B(int i, hu4 hu4Var) {
            C(w9i.a(i));
            E(hu4Var);
            return this;
        }

        public b C(ju4 ju4Var) {
            this.f5121a = ju4Var;
            float n = n(ju4Var);
            if (n != -1.0f) {
                D(n);
            }
            return this;
        }

        public b D(float f) {
            this.e = new zz(f);
            return this;
        }

        public b E(hu4 hu4Var) {
            this.e = hu4Var;
            return this;
        }

        public b F(int i, hu4 hu4Var) {
            G(w9i.a(i));
            I(hu4Var);
            return this;
        }

        public b G(ju4 ju4Var) {
            this.b = ju4Var;
            float n = n(ju4Var);
            if (n != -1.0f) {
                H(n);
            }
            return this;
        }

        public b H(float f) {
            this.f = new zz(f);
            return this;
        }

        public b I(hu4 hu4Var) {
            this.f = hu4Var;
            return this;
        }

        public a m() {
            return new a(this);
        }

        public b o(float f) {
            D(f);
            H(f);
            y(f);
            u(f);
            return this;
        }

        public b p(int i, float f) {
            q(w9i.a(i));
            o(f);
            return this;
        }

        public b q(ju4 ju4Var) {
            C(ju4Var);
            G(ju4Var);
            x(ju4Var);
            t(ju4Var);
            return this;
        }

        public b r(e78 e78Var) {
            this.k = e78Var;
            return this;
        }

        public b s(int i, hu4 hu4Var) {
            t(w9i.a(i));
            v(hu4Var);
            return this;
        }

        public b t(ju4 ju4Var) {
            this.d = ju4Var;
            float n = n(ju4Var);
            if (n != -1.0f) {
                u(n);
            }
            return this;
        }

        public b u(float f) {
            this.h = new zz(f);
            return this;
        }

        public b v(hu4 hu4Var) {
            this.h = hu4Var;
            return this;
        }

        public b w(int i, hu4 hu4Var) {
            x(w9i.a(i));
            z(hu4Var);
            return this;
        }

        public b x(ju4 ju4Var) {
            this.c = ju4Var;
            float n = n(ju4Var);
            if (n != -1.0f) {
                y(n);
            }
            return this;
        }

        public b y(float f) {
            this.g = new zz(f);
            return this;
        }

        public b z(hu4 hu4Var) {
            this.g = hu4Var;
            return this;
        }

        public b(a aVar) {
            this.f5121a = w9i.b();
            this.b = w9i.b();
            this.c = w9i.b();
            this.d = w9i.b();
            this.e = new zz(0.0f);
            this.f = new zz(0.0f);
            this.g = new zz(0.0f);
            this.h = new zz(0.0f);
            this.i = w9i.c();
            this.j = w9i.c();
            this.k = w9i.c();
            this.l = w9i.c();
            this.f5121a = aVar.f5120a;
            this.b = aVar.b;
            this.c = aVar.c;
            this.d = aVar.d;
            this.e = aVar.e;
            this.f = aVar.f;
            this.g = aVar.g;
            this.h = aVar.h;
            this.i = aVar.i;
            this.j = aVar.j;
            this.k = aVar.k;
            this.l = aVar.l;
        }
    }

    public a() {
        this.f5120a = w9i.b();
        this.b = w9i.b();
        this.c = w9i.b();
        this.d = w9i.b();
        this.e = new zz(0.0f);
        this.f = new zz(0.0f);
        this.g = new zz(0.0f);
        this.h = new zz(0.0f);
        this.i = w9i.c();
        this.j = w9i.c();
        this.k = w9i.c();
        this.l = w9i.c();
    }
}
