package com.google.android.material.shape;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import com.google.android.material.shape.MaterialShapeDrawable;
import tb.e78;
import tb.hu4;
import tb.ju4;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class b {

    /* renamed from: a  reason: collision with root package name */
    public final c[] f5122a = new c[4];
    public final Matrix[] b = new Matrix[4];
    public final Matrix[] c = new Matrix[4];
    public final PointF d = new PointF();
    public final Path e = new Path();
    public final Path f = new Path();
    public final c g = new c();
    public final float[] h = new float[2];
    public final float[] i = new float[2];
    public final boolean j = true;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public interface a {
    }

    /* compiled from: Taobao */
    /* renamed from: com.google.android.material.shape.b$b  reason: collision with other inner class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class C0254b {

        /* renamed from: a  reason: collision with root package name */
        public final com.google.android.material.shape.a f5123a;
        public final Path b;
        public final RectF c;
        public final a d;
        public final float e;

        public C0254b(com.google.android.material.shape.a aVar, float f, RectF rectF, a aVar2, Path path) {
            this.d = aVar2;
            this.f5123a = aVar;
            this.e = f;
            this.c = rectF;
            this.b = path;
        }
    }

    public b() {
        for (int i = 0; i < 4; i++) {
            this.f5122a[i] = new c();
            this.b[i] = new Matrix();
            this.c[i] = new Matrix();
        }
    }

    public final float a(int i) {
        return (i + 1) * 90;
    }

    public final void b(C0254b bVar, int i) {
        c[] cVarArr = this.f5122a;
        float j = cVarArr[i].j();
        float[] fArr = this.h;
        fArr[0] = j;
        fArr[1] = cVarArr[i].k();
        Matrix[] matrixArr = this.b;
        matrixArr[i].mapPoints(fArr);
        if (i == 0) {
            bVar.b.moveTo(fArr[0], fArr[1]);
        } else {
            bVar.b.lineTo(fArr[0], fArr[1]);
        }
        cVarArr[i].d(matrixArr[i], bVar.b);
        a aVar = bVar.d;
        if (aVar != null) {
            ((MaterialShapeDrawable.a) aVar).a(cVarArr[i], matrixArr[i], i);
        }
    }

    public final void c(C0254b bVar, int i) {
        int i2 = (i + 1) % 4;
        c[] cVarArr = this.f5122a;
        float h = cVarArr[i].h();
        float[] fArr = this.h;
        fArr[0] = h;
        fArr[1] = cVarArr[i].i();
        Matrix[] matrixArr = this.b;
        matrixArr[i].mapPoints(fArr);
        float j = cVarArr[i2].j();
        float[] fArr2 = this.i;
        fArr2[0] = j;
        fArr2[1] = cVarArr[i2].k();
        matrixArr[i2].mapPoints(fArr2);
        float max = Math.max(((float) Math.hypot(fArr[0] - fArr2[0], fArr[1] - fArr2[1])) - 0.001f, 0.0f);
        float i3 = i(bVar.c, i);
        c cVar = this.g;
        cVar.m(0.0f, 0.0f);
        e78 j2 = j(i, bVar.f5123a);
        j2.b(max, i3, bVar.e, cVar);
        Path path = new Path();
        Matrix[] matrixArr2 = this.c;
        cVar.d(matrixArr2[i], path);
        if (!this.j || (!j2.a() && !k(path, i) && !k(path, i2))) {
            cVar.d(matrixArr2[i], bVar.b);
        } else {
            path.op(path, this.f, Path.Op.DIFFERENCE);
            fArr[0] = cVar.j();
            fArr[1] = cVar.k();
            matrixArr2[i].mapPoints(fArr);
            Path path2 = this.e;
            path2.moveTo(fArr[0], fArr[1]);
            cVar.d(matrixArr2[i], path2);
        }
        a aVar = bVar.d;
        if (aVar != null) {
            ((MaterialShapeDrawable.a) aVar).b(cVar, matrixArr2[i], i);
        }
    }

    public void d(com.google.android.material.shape.a aVar, float f, RectF rectF, Path path) {
        e(aVar, f, rectF, null, path);
    }

    public void e(com.google.android.material.shape.a aVar, float f, RectF rectF, a aVar2, Path path) {
        path.rewind();
        Path path2 = this.e;
        path2.rewind();
        Path path3 = this.f;
        path3.rewind();
        path3.addRect(rectF, Path.Direction.CW);
        C0254b bVar = new C0254b(aVar, f, rectF, aVar2, path);
        for (int i = 0; i < 4; i++) {
            l(bVar, i);
            m(i);
        }
        for (int i2 = 0; i2 < 4; i2++) {
            b(bVar, i2);
            c(bVar, i2);
        }
        path.close();
        path2.close();
        if (!path2.isEmpty()) {
            path.op(path2, Path.Op.UNION);
        }
    }

    public final void f(int i, RectF rectF, PointF pointF) {
        if (i == 1) {
            pointF.set(rectF.right, rectF.bottom);
        } else if (i == 2) {
            pointF.set(rectF.left, rectF.bottom);
        } else if (i != 3) {
            pointF.set(rectF.right, rectF.top);
        } else {
            pointF.set(rectF.left, rectF.top);
        }
    }

    public final hu4 g(int i, com.google.android.material.shape.a aVar) {
        if (i == 1) {
            return aVar.l();
        }
        if (i == 2) {
            return aVar.j();
        }
        if (i != 3) {
            return aVar.t();
        }
        return aVar.r();
    }

    public final ju4 h(int i, com.google.android.material.shape.a aVar) {
        if (i == 1) {
            return aVar.k();
        }
        if (i == 2) {
            return aVar.i();
        }
        if (i != 3) {
            return aVar.s();
        }
        return aVar.q();
    }

    public final float i(RectF rectF, int i) {
        c cVar = this.f5122a[i];
        float f = cVar.c;
        float[] fArr = this.h;
        fArr[0] = f;
        fArr[1] = cVar.d;
        this.b[i].mapPoints(fArr);
        if (i == 1 || i == 3) {
            return Math.abs(rectF.centerX() - fArr[0]);
        }
        return Math.abs(rectF.centerY() - fArr[1]);
    }

    public final e78 j(int i, com.google.android.material.shape.a aVar) {
        if (i == 1) {
            return aVar.h();
        }
        if (i == 2) {
            return aVar.n();
        }
        if (i != 3) {
            return aVar.o();
        }
        return aVar.p();
    }

    public final boolean k(Path path, int i) {
        Path path2 = new Path();
        this.f5122a[i].d(this.b[i], path2);
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        path2.computeBounds(rectF, true);
        path.op(path2, Path.Op.INTERSECT);
        path.computeBounds(rectF, true);
        if (!rectF.isEmpty()) {
            return true;
        }
        if (rectF.width() <= 1.0f || rectF.height() <= 1.0f) {
            return false;
        }
        return true;
    }

    public final void l(C0254b bVar, int i) {
        hu4 g = g(i, bVar.f5123a);
        h(i, bVar.f5123a).b(this.f5122a[i], 90.0f, bVar.e, bVar.c, g);
        float a2 = a(i);
        Matrix[] matrixArr = this.b;
        matrixArr[i].reset();
        PointF pointF = this.d;
        f(i, bVar.c, pointF);
        matrixArr[i].setTranslate(pointF.x, pointF.y);
        matrixArr[i].preRotate(a2);
    }

    public final void m(int i) {
        c[] cVarArr = this.f5122a;
        float h = cVarArr[i].h();
        float[] fArr = this.h;
        fArr[0] = h;
        fArr[1] = cVarArr[i].i();
        this.b[i].mapPoints(fArr);
        float a2 = a(i);
        Matrix[] matrixArr = this.c;
        matrixArr[i].reset();
        matrixArr[i].setTranslate(fArr[0], fArr[1]);
        matrixArr[i].preRotate(a2);
    }
}
