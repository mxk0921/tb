package com.airbnb.lottie.model.layer;

import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.os.Build;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.model.content.Mask;
import com.airbnb.lottie.model.layer.Layer;
import com.airbnb.lottie.model.layer.a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import tb.aeu;
import tb.ag2;
import tb.e08;
import tb.e4g;
import tb.f4g;
import tb.fmh;
import tb.fo4;
import tb.fxv;
import tb.ghp;
import tb.hak;
import tb.hn9;
import tb.k6g;
import tb.kkh;
import tb.nhp;
import tb.o5i;
import tb.pw1;
import tb.q9q;
import tb.qdg;
import tb.qlt;
import tb.tle;
import tb.ty7;
import tb.zhh;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public abstract class a implements ty7, pw1.b, f4g {
    public Paint A;
    public BlurMaskFilter C;
    public final Paint e;
    public final Paint f;
    public final Paint g;
    public final String n;
    public final LottieDrawable p;
    public final Layer q;
    public final o5i r;
    public hn9 s;
    public a t;
    public a u;
    public List<a> v;
    public final aeu x;
    public boolean z;

    /* renamed from: a  reason: collision with root package name */
    public final Path f1855a = new Path();
    public final Matrix b = new Matrix();
    public final Matrix c = new Matrix();
    public final Paint d = new qdg(1);
    public final Paint h = new qdg(PorterDuff.Mode.CLEAR);
    public final RectF i = new RectF();
    public final RectF j = new RectF();
    public final RectF k = new RectF();
    public final RectF l = new RectF();
    public final RectF m = new RectF();
    public final Matrix o = new Matrix();
    public final List<pw1<?, ?>> w = new ArrayList();
    public boolean y = true;
    public float B = 0.0f;

    /* compiled from: Taobao */
    /* renamed from: com.airbnb.lottie.model.layer.a$a  reason: collision with other inner class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static /* synthetic */ class C0025a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f1856a;
        public static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[Mask.MaskMode.values().length];
            b = iArr;
            try {
                iArr[Mask.MaskMode.MASK_MODE_NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                b[Mask.MaskMode.MASK_MODE_SUBTRACT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                b[Mask.MaskMode.MASK_MODE_INTERSECT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                b[Mask.MaskMode.MASK_MODE_ADD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[Layer.LayerType.values().length];
            f1856a = iArr2;
            try {
                iArr2[Layer.LayerType.SHAPE.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f1856a[Layer.LayerType.PRE_COMP.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f1856a[Layer.LayerType.SOLID.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f1856a[Layer.LayerType.IMAGE.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f1856a[Layer.LayerType.NULL.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f1856a[Layer.LayerType.TEXT.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f1856a[Layer.LayerType.UNKNOWN.ordinal()] = 7;
            } catch (NoSuchFieldError unused11) {
            }
        }
    }

    public a(LottieDrawable lottieDrawable, Layer layer) {
        PorterDuff.Mode mode = PorterDuff.Mode.DST_IN;
        this.e = new qdg(1, mode);
        PorterDuff.Mode mode2 = PorterDuff.Mode.DST_OUT;
        this.f = new qdg(1, mode2);
        qdg qdgVar = new qdg(1);
        this.g = qdgVar;
        this.p = lottieDrawable;
        this.q = layer;
        this.n = layer.i() + "#draw";
        if (layer.h() == Layer.MatteType.INVERT) {
            qdgVar.setXfermode(new PorterDuffXfermode(mode2));
        } else {
            qdgVar.setXfermode(new PorterDuffXfermode(mode));
        }
        aeu b = layer.w().b();
        this.x = b;
        b.b(this);
        if (layer.g() != null && !layer.g().isEmpty()) {
            o5i o5iVar = new o5i(layer.g());
            this.r = o5iVar;
            Iterator it = ((ArrayList) o5iVar.a()).iterator();
            while (it.hasNext()) {
                ((pw1) it.next()).a(this);
            }
            Iterator it2 = ((ArrayList) this.r.c()).iterator();
            while (it2.hasNext()) {
                pw1<?, ?> pw1Var = (pw1) it2.next();
                i(pw1Var);
                pw1Var.a(this);
            }
        }
        N();
    }

    public static a u(b bVar, Layer layer, LottieDrawable lottieDrawable, kkh kkhVar) {
        switch (C0025a.f1856a[layer.f().ordinal()]) {
            case 1:
                return new nhp(lottieDrawable, layer, bVar);
            case 2:
                return new b(lottieDrawable, layer, kkhVar.o(layer.m()), kkhVar);
            case 3:
                return new q9q(lottieDrawable, layer);
            case 4:
                return new tle(lottieDrawable, layer);
            case 5:
                return new hak(lottieDrawable, layer);
            case 6:
                return new qlt(lottieDrawable, layer);
            default:
                zhh.b("Unknown layer type " + layer.f());
                return null;
        }
    }

    public boolean A() {
        if (this.t != null) {
            return true;
        }
        return false;
    }

    public final void B(RectF rectF, Matrix matrix) {
        RectF rectF2 = this.k;
        rectF2.set(0.0f, 0.0f, 0.0f, 0.0f);
        if (z()) {
            o5i o5iVar = this.r;
            int size = o5iVar.b().size();
            for (int i = 0; i < size; i++) {
                Mask mask = o5iVar.b().get(i);
                Path path = (Path) ((pw1) ((ArrayList) o5iVar.a()).get(i)).h();
                if (path != null) {
                    Path path2 = this.f1855a;
                    path2.set(path);
                    path2.transform(matrix);
                    int i2 = C0025a.b[mask.a().ordinal()];
                    if (i2 != 1 && i2 != 2) {
                        if ((i2 != 3 && i2 != 4) || !mask.d()) {
                            RectF rectF3 = this.m;
                            path2.computeBounds(rectF3, false);
                            if (i == 0) {
                                rectF2.set(rectF3);
                            } else {
                                rectF2.set(Math.min(rectF2.left, rectF3.left), Math.min(rectF2.top, rectF3.top), Math.max(rectF2.right, rectF3.right), Math.max(rectF2.bottom, rectF3.bottom));
                            }
                        } else {
                            return;
                        }
                    } else {
                        return;
                    }
                }
            }
            if (!rectF.intersect(rectF2)) {
                rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
            }
        }
    }

    public final void C(RectF rectF, Matrix matrix) {
        if (A() && this.q.h() != Layer.MatteType.INVERT) {
            RectF rectF2 = this.l;
            rectF2.set(0.0f, 0.0f, 0.0f, 0.0f);
            this.t.e(rectF2, matrix, true);
            if (!rectF.intersect(rectF2)) {
                rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
            }
        }
    }

    public final void D() {
        this.p.invalidateSelf();
    }

    public final /* synthetic */ void E() {
        boolean z;
        if (this.s.p() == 1.0f) {
            z = true;
        } else {
            z = false;
        }
        M(z);
    }

    public final void F(float f) {
        this.p.L().n().a(this.q.i(), f);
    }

    public void G(pw1<?, ?> pw1Var) {
        ((ArrayList) this.w).remove(pw1Var);
    }

    public void I(a aVar) {
        this.t = aVar;
    }

    public void J(boolean z) {
        if (z && this.A == null) {
            this.A = new qdg();
        }
        this.z = z;
    }

    public void K(a aVar) {
        this.u = aVar;
    }

    public void L(float f) {
        this.x.j(f);
        o5i o5iVar = this.r;
        int i = 0;
        if (o5iVar != null) {
            for (int i2 = 0; i2 < ((ArrayList) o5iVar.a()).size(); i2++) {
                ((pw1) ((ArrayList) o5iVar.a()).get(i2)).m(f);
            }
        }
        hn9 hn9Var = this.s;
        if (hn9Var != null) {
            hn9Var.m(f);
        }
        a aVar = this.t;
        if (aVar != null) {
            aVar.L(f);
        }
        while (true) {
            ArrayList arrayList = (ArrayList) this.w;
            if (i < arrayList.size()) {
                ((pw1) arrayList.get(i)).m(f);
                i++;
            } else {
                return;
            }
        }
    }

    public final void M(boolean z) {
        if (z != this.y) {
            this.y = z;
            D();
        }
    }

    public final void N() {
        Layer layer = this.q;
        boolean z = true;
        if (!layer.e().isEmpty()) {
            hn9 hn9Var = new hn9(layer.e());
            this.s = hn9Var;
            hn9Var.l();
            this.s.a(new pw1.b() { // from class: tb.qw1
                @Override // tb.pw1.b
                public final void g() {
                    a.this.E();
                }
            });
            if (this.s.h().floatValue() != 1.0f) {
                z = false;
            }
            M(z);
            i(this.s);
            return;
        }
        M(true);
    }

    @Override // tb.f4g
    public <T> void a(T t, fmh<T> fmhVar) {
        this.x.c(t, fmhVar);
    }

    @Override // tb.ty7
    public void b(Canvas canvas, Matrix matrix, int i) {
        int i2;
        Paint paint;
        boolean z = this.y;
        String str = this.n;
        if (!z || this.q.x()) {
            k6g.a(str);
            return;
        }
        r();
        Matrix matrix2 = this.b;
        matrix2.reset();
        matrix2.set(matrix);
        for (int size = this.v.size() - 1; size >= 0; size--) {
            matrix2.preConcat(this.v.get(size).x.f());
        }
        k6g.a("Layer#parentMatrix");
        aeu aeuVar = this.x;
        if (aeuVar.h() == null) {
            i2 = 100;
        } else {
            i2 = aeuVar.h().h().intValue();
        }
        int i3 = (int) ((((i / 255.0f) * i2) / 100.0f) * 255.0f);
        if (A() || z()) {
            RectF rectF = this.i;
            e(rectF, matrix2, false);
            C(rectF, matrix);
            matrix2.preConcat(aeuVar.f());
            B(rectF, matrix2);
            RectF rectF2 = this.j;
            rectF2.set(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight());
            Matrix matrix3 = this.c;
            canvas.getMatrix(matrix3);
            if (!matrix3.isIdentity()) {
                matrix3.invert(matrix3);
                matrix3.mapRect(rectF2);
            }
            if (!rectF.intersect(rectF2)) {
                rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
            }
            k6g.a("Layer#computeBounds");
            if (rectF.width() >= 1.0f && rectF.height() >= 1.0f) {
                Paint paint2 = this.d;
                paint2.setAlpha(255);
                fxv.m(canvas, rectF, paint2);
                k6g.a("Layer#saveLayer");
                s(canvas);
                t(canvas, matrix2, i3);
                k6g.a("Layer#drawLayer");
                if (z()) {
                    o(canvas, matrix2);
                }
                if (A()) {
                    fxv.n(canvas, rectF, this.g, 19);
                    k6g.a("Layer#saveLayer");
                    s(canvas);
                    this.t.b(canvas, matrix, i3);
                    canvas.restore();
                    k6g.a("Layer#restoreLayer");
                    k6g.a("Layer#drawMatte");
                }
                canvas.restore();
                k6g.a("Layer#restoreLayer");
            }
            if (this.z && (paint = this.A) != null) {
                paint.setStyle(Paint.Style.STROKE);
                this.A.setColor(-251901);
                this.A.setStrokeWidth(4.0f);
                canvas.drawRect(rectF, this.A);
                this.A.setStyle(Paint.Style.FILL);
                this.A.setColor(1357638635);
                canvas.drawRect(rectF, this.A);
            }
            k6g.a(str);
            F(0.0f);
            return;
        }
        matrix2.preConcat(aeuVar.f());
        t(canvas, matrix2, i3);
        k6g.a("Layer#drawLayer");
        k6g.a(str);
        F(0.0f);
    }

    @Override // tb.f4g
    public void d(e4g e4gVar, int i, List<e4g> list, e4g e4gVar2) {
        a aVar = this.t;
        if (aVar != null) {
            e4g a2 = e4gVar2.a(aVar.getName());
            if (e4gVar.c(this.t.getName(), i)) {
                list.add(a2.i(this.t));
            }
            if (e4gVar.h(getName(), i)) {
                this.t.H(e4gVar, e4gVar.e(this.t.getName(), i) + i, list, a2);
            }
        }
        if (e4gVar.g(getName(), i)) {
            if (!"__container".equals(getName())) {
                e4gVar2 = e4gVar2.a(getName());
                if (e4gVar.c(getName(), i)) {
                    list.add(e4gVar2.i(this));
                }
            }
            if (e4gVar.h(getName(), i)) {
                H(e4gVar, i + e4gVar.e(getName(), i), list, e4gVar2);
            }
        }
    }

    @Override // tb.ty7
    public void e(RectF rectF, Matrix matrix, boolean z) {
        this.i.set(0.0f, 0.0f, 0.0f, 0.0f);
        r();
        Matrix matrix2 = this.o;
        matrix2.set(matrix);
        if (z) {
            List<a> list = this.v;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    matrix2.preConcat(this.v.get(size).x.f());
                }
            } else {
                a aVar = this.u;
                if (aVar != null) {
                    matrix2.preConcat(aVar.x.f());
                }
            }
        }
        matrix2.preConcat(this.x.f());
    }

    @Override // tb.pw1.b
    public void g() {
        D();
    }

    @Override // tb.fo4
    public String getName() {
        return this.q.i();
    }

    public void i(pw1<?, ?> pw1Var) {
        if (pw1Var != null) {
            this.w.add(pw1Var);
        }
    }

    public final void j(Canvas canvas, Matrix matrix, pw1<ghp, Path> pw1Var, pw1<Integer, Integer> pw1Var2) {
        Path path = this.f1855a;
        path.set(pw1Var.h());
        path.transform(matrix);
        Paint paint = this.d;
        paint.setAlpha((int) (pw1Var2.h().intValue() * 2.55f));
        canvas.drawPath(path, paint);
    }

    public final void k(Canvas canvas, Matrix matrix, pw1<ghp, Path> pw1Var, pw1<Integer, Integer> pw1Var2) {
        fxv.m(canvas, this.i, this.e);
        Path path = this.f1855a;
        path.set(pw1Var.h());
        path.transform(matrix);
        Paint paint = this.d;
        paint.setAlpha((int) (pw1Var2.h().intValue() * 2.55f));
        canvas.drawPath(path, paint);
        canvas.restore();
    }

    public final void l(Canvas canvas, Matrix matrix, pw1<ghp, Path> pw1Var, pw1<Integer, Integer> pw1Var2) {
        RectF rectF = this.i;
        Paint paint = this.d;
        fxv.m(canvas, rectF, paint);
        canvas.drawRect(rectF, paint);
        Path path = this.f1855a;
        path.set(pw1Var.h());
        path.transform(matrix);
        paint.setAlpha((int) (pw1Var2.h().intValue() * 2.55f));
        canvas.drawPath(path, this.f);
        canvas.restore();
    }

    public final void m(Canvas canvas, Matrix matrix, pw1<ghp, Path> pw1Var, pw1<Integer, Integer> pw1Var2) {
        RectF rectF = this.i;
        fxv.m(canvas, rectF, this.e);
        canvas.drawRect(rectF, this.d);
        Paint paint = this.f;
        paint.setAlpha((int) (pw1Var2.h().intValue() * 2.55f));
        Path path = this.f1855a;
        path.set(pw1Var.h());
        path.transform(matrix);
        canvas.drawPath(path, paint);
        canvas.restore();
    }

    public final void n(Canvas canvas, Matrix matrix, pw1<ghp, Path> pw1Var, pw1<Integer, Integer> pw1Var2) {
        RectF rectF = this.i;
        Paint paint = this.f;
        fxv.m(canvas, rectF, paint);
        canvas.drawRect(rectF, this.d);
        paint.setAlpha((int) (pw1Var2.h().intValue() * 2.55f));
        Path path = this.f1855a;
        path.set(pw1Var.h());
        path.transform(matrix);
        canvas.drawPath(path, paint);
        canvas.restore();
    }

    public final void o(Canvas canvas, Matrix matrix) {
        RectF rectF = this.i;
        fxv.n(canvas, rectF, this.e, 19);
        if (Build.VERSION.SDK_INT < 28) {
            s(canvas);
        }
        k6g.a("Layer#saveLayer");
        int i = 0;
        while (true) {
            o5i o5iVar = this.r;
            if (i < o5iVar.b().size()) {
                Mask mask = o5iVar.b().get(i);
                pw1<ghp, Path> pw1Var = (pw1) ((ArrayList) o5iVar.a()).get(i);
                pw1<Integer, Integer> pw1Var2 = (pw1) ((ArrayList) o5iVar.c()).get(i);
                int i2 = C0025a.b[mask.a().ordinal()];
                Paint paint = this.d;
                if (i2 != 1) {
                    if (i2 == 2) {
                        if (i == 0) {
                            paint.setColor(-16777216);
                            paint.setAlpha(255);
                            canvas.drawRect(rectF, paint);
                        }
                        if (mask.d()) {
                            n(canvas, matrix, pw1Var, pw1Var2);
                        } else {
                            p(canvas, matrix, pw1Var);
                        }
                    } else if (i2 != 3) {
                        if (i2 == 4) {
                            if (mask.d()) {
                                l(canvas, matrix, pw1Var, pw1Var2);
                            } else {
                                j(canvas, matrix, pw1Var, pw1Var2);
                            }
                        }
                    } else if (mask.d()) {
                        m(canvas, matrix, pw1Var, pw1Var2);
                    } else {
                        k(canvas, matrix, pw1Var, pw1Var2);
                    }
                } else if (q()) {
                    paint.setAlpha(255);
                    canvas.drawRect(rectF, paint);
                }
                i++;
            } else {
                canvas.restore();
                k6g.a("Layer#restoreLayer");
                return;
            }
        }
    }

    public final void p(Canvas canvas, Matrix matrix, pw1<ghp, Path> pw1Var) {
        Path path = this.f1855a;
        path.set(pw1Var.h());
        path.transform(matrix);
        canvas.drawPath(path, this.f);
    }

    public final boolean q() {
        o5i o5iVar = this.r;
        if (((ArrayList) o5iVar.a()).isEmpty()) {
            return false;
        }
        for (int i = 0; i < o5iVar.b().size(); i++) {
            if (o5iVar.b().get(i).a() != Mask.MaskMode.MASK_MODE_NONE) {
                return false;
            }
        }
        return true;
    }

    public final void r() {
        if (this.v == null) {
            if (this.u == null) {
                this.v = Collections.emptyList();
                return;
            }
            this.v = new ArrayList();
            for (a aVar = this.u; aVar != null; aVar = aVar.u) {
                this.v.add(aVar);
            }
        }
    }

    public final void s(Canvas canvas) {
        RectF rectF = this.i;
        canvas.drawRect(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f, this.h);
        k6g.a("Layer#clearLayer");
    }

    public abstract void t(Canvas canvas, Matrix matrix, int i);

    public ag2 v() {
        return this.q.a();
    }

    public BlurMaskFilter w(float f) {
        if (this.B == f) {
            return this.C;
        }
        BlurMaskFilter blurMaskFilter = new BlurMaskFilter(f / 2.0f, BlurMaskFilter.Blur.NORMAL);
        this.C = blurMaskFilter;
        this.B = f;
        return blurMaskFilter;
    }

    public e08 x() {
        return this.q.c();
    }

    public Layer y() {
        return this.q;
    }

    public boolean z() {
        o5i o5iVar = this.r;
        if (o5iVar == null || ((ArrayList) o5iVar.a()).isEmpty()) {
            return false;
        }
        return true;
    }

    @Override // tb.fo4
    public void c(List<fo4> list, List<fo4> list2) {
    }

    public void H(e4g e4gVar, int i, List<e4g> list, e4g e4gVar2) {
    }
}
