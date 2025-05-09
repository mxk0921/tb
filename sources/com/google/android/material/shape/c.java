package com.google.android.material.shape;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.List;
import tb.ngp;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class c {
    @Deprecated

    /* renamed from: a  reason: collision with root package name */
    public float f5124a;
    @Deprecated
    public float b;
    @Deprecated
    public float c;
    @Deprecated
    public float d;
    @Deprecated
    public float e;
    @Deprecated
    public float f;
    public final List<f> g = new ArrayList();
    public final List<g> h = new ArrayList();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class a extends g {
        public final /* synthetic */ List b;
        public final /* synthetic */ Matrix c;

        public a(c cVar, List list, Matrix matrix) {
            this.b = list;
            this.c = matrix;
        }

        @Override // com.google.android.material.shape.c.g
        public void a(Matrix matrix, ngp ngpVar, int i, Canvas canvas) {
            for (g gVar : this.b) {
                gVar.a(this.c, ngpVar, i, canvas);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static class b extends g {
        public final d b;

        public b(d dVar) {
            this.b = dVar;
        }

        @Override // com.google.android.material.shape.c.g
        public void a(Matrix matrix, ngp ngpVar, int i, Canvas canvas) {
            d dVar = this.b;
            ngpVar.a(canvas, matrix, new RectF(dVar.k(), dVar.o(), dVar.l(), dVar.j()), i, dVar.m(), dVar.n());
        }
    }

    /* compiled from: Taobao */
    /* renamed from: com.google.android.material.shape.c$c  reason: collision with other inner class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static class C0255c extends g {
        public final e b;
        public final float c;
        public final float d;

        public C0255c(e eVar, float f, float f2) {
            this.b = eVar;
            this.c = f;
            this.d = f2;
        }

        @Override // com.google.android.material.shape.c.g
        public void a(Matrix matrix, ngp ngpVar, int i, Canvas canvas) {
            e eVar = this.b;
            float f = eVar.c;
            float f2 = this.d;
            float f3 = eVar.b;
            float f4 = this.c;
            RectF rectF = new RectF(0.0f, 0.0f, (float) Math.hypot(f - f2, f3 - f4), 0.0f);
            Matrix matrix2 = new Matrix(matrix);
            matrix2.preTranslate(f4, f2);
            matrix2.preRotate(c());
            ngpVar.b(canvas, matrix2, rectF, i);
        }

        public float c() {
            e eVar = this.b;
            return (float) Math.toDegrees(Math.atan((eVar.c - this.d) / (eVar.b - this.c)));
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static class d extends f {
        public static final RectF h = new RectF();
        @Deprecated
        public float b;
        @Deprecated
        public float c;
        @Deprecated
        public float d;
        @Deprecated
        public float e;
        @Deprecated
        public float f;
        @Deprecated
        public float g;

        public d(float f, float f2, float f3, float f4) {
            q(f);
            u(f2);
            r(f3);
            p(f4);
        }

        @Override // com.google.android.material.shape.c.f
        public void a(Matrix matrix, Path path) {
            Matrix matrix2 = this.f5125a;
            matrix.invert(matrix2);
            path.transform(matrix2);
            RectF rectF = h;
            rectF.set(k(), o(), l(), j());
            path.arcTo(rectF, m(), n(), false);
            path.transform(matrix);
        }

        public final float j() {
            return this.e;
        }

        public final float k() {
            return this.b;
        }

        public final float l() {
            return this.d;
        }

        public final float m() {
            return this.f;
        }

        public final float n() {
            return this.g;
        }

        public final float o() {
            return this.c;
        }

        public final void p(float f) {
            this.e = f;
        }

        public final void q(float f) {
            this.b = f;
        }

        public final void r(float f) {
            this.d = f;
        }

        public final void s(float f) {
            this.f = f;
        }

        public final void t(float f) {
            this.g = f;
        }

        public final void u(float f) {
            this.c = f;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static class e extends f {
        public float b;
        public float c;

        @Override // com.google.android.material.shape.c.f
        public void a(Matrix matrix, Path path) {
            Matrix matrix2 = this.f5125a;
            matrix.invert(matrix2);
            path.transform(matrix2);
            path.lineTo(this.b, this.c);
            path.transform(matrix);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static abstract class f {

        /* renamed from: a  reason: collision with root package name */
        public final Matrix f5125a = new Matrix();

        public abstract void a(Matrix matrix, Path path);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static abstract class g {

        /* renamed from: a  reason: collision with root package name */
        public static final Matrix f5126a = new Matrix();

        public abstract void a(Matrix matrix, ngp ngpVar, int i, Canvas canvas);

        public final void b(ngp ngpVar, int i, Canvas canvas) {
            a(f5126a, ngpVar, i, canvas);
        }
    }

    public c() {
        m(0.0f, 0.0f);
    }

    public void a(float f2, float f3, float f4, float f5, float f6, float f7) {
        boolean z;
        float f8;
        d dVar = new d(f2, f3, f4, f5);
        dVar.s(f6);
        dVar.t(f7);
        ((ArrayList) this.g).add(dVar);
        b bVar = new b(dVar);
        float f9 = f6 + f7;
        if (f7 < 0.0f) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            f6 = (f6 + 180.0f) % 360.0f;
        }
        if (z) {
            f8 = (180.0f + f9) % 360.0f;
        } else {
            f8 = f9;
        }
        c(bVar, f6, f8);
        double d2 = f9;
        q(((f2 + f4) * 0.5f) + (((f4 - f2) / 2.0f) * ((float) Math.cos(Math.toRadians(d2)))));
        r(((f3 + f5) * 0.5f) + (((f5 - f3) / 2.0f) * ((float) Math.sin(Math.toRadians(d2)))));
    }

    public final void b(float f2) {
        if (f() != f2) {
            float f3 = ((f2 - f()) + 360.0f) % 360.0f;
            if (f3 <= 180.0f) {
                d dVar = new d(h(), i(), h(), i());
                dVar.s(f());
                dVar.t(f3);
                ((ArrayList) this.h).add(new b(dVar));
                o(f2);
            }
        }
    }

    public final void c(g gVar, float f2, float f3) {
        b(f2);
        ((ArrayList) this.h).add(gVar);
        o(f3);
    }

    public void d(Matrix matrix, Path path) {
        ArrayList arrayList = (ArrayList) this.g;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((f) arrayList.get(i)).a(matrix, path);
        }
    }

    public g e(Matrix matrix) {
        b(g());
        return new a(this, new ArrayList(this.h), matrix);
    }

    public final float f() {
        return this.e;
    }

    public final float g() {
        return this.f;
    }

    public float h() {
        return this.c;
    }

    public float i() {
        return this.d;
    }

    public float j() {
        return this.f5124a;
    }

    public float k() {
        return this.b;
    }

    public void l(float f2, float f3) {
        e eVar = new e();
        eVar.b = f2;
        eVar.c = f3;
        ((ArrayList) this.g).add(eVar);
        C0255c cVar = new C0255c(eVar, h(), i());
        c(cVar, cVar.c() + 270.0f, cVar.c() + 270.0f);
        q(f2);
        r(f3);
    }

    public void m(float f2, float f3) {
        n(f2, f3, 270.0f, 0.0f);
    }

    public void n(float f2, float f3, float f4, float f5) {
        s(f2);
        t(f3);
        q(f2);
        r(f3);
        o(f4);
        p((f4 + f5) % 360.0f);
        ((ArrayList) this.g).clear();
        ((ArrayList) this.h).clear();
    }

    public final void o(float f2) {
        this.e = f2;
    }

    public final void p(float f2) {
        this.f = f2;
    }

    public final void q(float f2) {
        this.c = f2;
    }

    public final void r(float f2) {
        this.d = f2;
    }

    public final void s(float f2) {
        this.f5124a = f2;
    }

    public final void t(float f2) {
        this.b = f2;
    }
}
