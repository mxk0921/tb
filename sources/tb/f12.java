package tb;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.DashPathEffect;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.RectF;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.model.content.ShapeTrimPath;
import java.util.ArrayList;
import java.util.List;
import tb.pw1;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public abstract class f12 implements pw1.b, g4g, ty7 {
    public final LottieDrawable e;
    public final com.airbnb.lottie.model.layer.a f;
    public final float[] h;
    public final Paint i;
    public final pw1<?, Float> j;
    public final pw1<?, Integer> k;
    public final List<pw1<?, Float>> l;
    public final pw1<?, Float> m;
    public pw1<ColorFilter, ColorFilter> n;
    public pw1<Float, Float> o;
    public final g08 q;

    /* renamed from: a  reason: collision with root package name */
    public final PathMeasure f18932a = new PathMeasure();
    public final Path b = new Path();
    public final Path c = new Path();
    public final RectF d = new RectF();
    public final List<b> g = new ArrayList();
    public float p = 0.0f;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final List<bul> f18933a;
        public final pgu b;

        public b(pgu pguVar) {
            this.f18933a = new ArrayList();
            this.b = pguVar;
        }
    }

    public f12(LottieDrawable lottieDrawable, com.airbnb.lottie.model.layer.a aVar, Paint.Cap cap, Paint.Join join, float f, lx0 lx0Var, jx0 jx0Var, List<jx0> list, jx0 jx0Var2) {
        qdg qdgVar = new qdg(1);
        this.i = qdgVar;
        this.e = lottieDrawable;
        this.f = aVar;
        qdgVar.setStyle(Paint.Style.STROKE);
        qdgVar.setStrokeCap(cap);
        qdgVar.setStrokeJoin(join);
        qdgVar.setStrokeMiter(f);
        this.k = lx0Var.a();
        this.j = jx0Var.a();
        if (jx0Var2 == null) {
            this.m = null;
        } else {
            this.m = jx0Var2.a();
        }
        this.l = new ArrayList(list.size());
        this.h = new float[list.size()];
        for (int i = 0; i < list.size(); i++) {
            ((ArrayList) this.l).add(list.get(i).a());
        }
        aVar.i(this.k);
        aVar.i(this.j);
        for (int i2 = 0; i2 < ((ArrayList) this.l).size(); i2++) {
            aVar.i((pw1) ((ArrayList) this.l).get(i2));
        }
        pw1<?, Float> pw1Var = this.m;
        if (pw1Var != null) {
            aVar.i(pw1Var);
        }
        this.k.a(this);
        this.j.a(this);
        for (int i3 = 0; i3 < list.size(); i3++) {
            ((pw1) ((ArrayList) this.l).get(i3)).a(this);
        }
        pw1<?, Float> pw1Var2 = this.m;
        if (pw1Var2 != null) {
            pw1Var2.a(this);
        }
        if (aVar.v() != null) {
            pw1<Float, Float> a2 = aVar.v().a().a();
            this.o = a2;
            a2.a(this);
            aVar.i(this.o);
        }
        if (aVar.x() != null) {
            this.q = new g08(this, aVar, aVar.x());
        }
    }

    public <T> void a(T t, fmh<T> fmhVar) {
        if (t == ylh.OPACITY) {
            this.k.n(fmhVar);
        } else if (t == ylh.STROKE_WIDTH) {
            this.j.n(fmhVar);
        } else {
            ColorFilter colorFilter = ylh.COLOR_FILTER;
            com.airbnb.lottie.model.layer.a aVar = this.f;
            if (t == colorFilter) {
                pw1<ColorFilter, ColorFilter> pw1Var = this.n;
                if (pw1Var != null) {
                    aVar.G(pw1Var);
                }
                if (fmhVar == null) {
                    this.n = null;
                    return;
                }
                w1w w1wVar = new w1w(fmhVar);
                this.n = w1wVar;
                w1wVar.a(this);
                aVar.i(this.n);
            } else if (t == ylh.BLUR_RADIUS) {
                pw1<Float, Float> pw1Var2 = this.o;
                if (pw1Var2 != null) {
                    pw1Var2.n(fmhVar);
                    return;
                }
                w1w w1wVar2 = new w1w(fmhVar);
                this.o = w1wVar2;
                w1wVar2.a(this);
                aVar.i(this.o);
            } else {
                Integer num = ylh.DROP_SHADOW_COLOR;
                g08 g08Var = this.q;
                if (t == num && g08Var != null) {
                    g08Var.b(fmhVar);
                } else if (t == ylh.DROP_SHADOW_OPACITY && g08Var != null) {
                    g08Var.e(fmhVar);
                } else if (t == ylh.DROP_SHADOW_DIRECTION && g08Var != null) {
                    g08Var.c(fmhVar);
                } else if (t == ylh.DROP_SHADOW_DISTANCE && g08Var != null) {
                    g08Var.d(fmhVar);
                } else if (t == ylh.DROP_SHADOW_RADIUS && g08Var != null) {
                    g08Var.f(fmhVar);
                }
            }
        }
    }

    public void b(Canvas canvas, Matrix matrix, int i) {
        if (fxv.h(matrix)) {
            k6g.a("StrokeContent#draw");
            return;
        }
        Paint paint = this.i;
        int i2 = 0;
        paint.setAlpha(uvi.d((int) ((((i / 255.0f) * ((eef) this.k).p()) / 100.0f) * 255.0f), 0, 255));
        paint.setStrokeWidth(((hn9) this.j).p() * fxv.g(matrix));
        if (paint.getStrokeWidth() <= 0.0f) {
            k6g.a("StrokeContent#draw");
            return;
        }
        f(matrix);
        pw1<ColorFilter, ColorFilter> pw1Var = this.n;
        if (pw1Var != null) {
            paint.setColorFilter(pw1Var.h());
        }
        pw1<Float, Float> pw1Var2 = this.o;
        if (pw1Var2 != null) {
            float floatValue = pw1Var2.h().floatValue();
            if (floatValue == 0.0f) {
                paint.setMaskFilter(null);
            } else if (floatValue != this.p) {
                paint.setMaskFilter(this.f.w(floatValue));
            }
            this.p = floatValue;
        }
        g08 g08Var = this.q;
        if (g08Var != null) {
            g08Var.a(paint);
        }
        while (true) {
            ArrayList arrayList = (ArrayList) this.g;
            if (i2 < arrayList.size()) {
                b bVar = (b) arrayList.get(i2);
                if (bVar.b != null) {
                    i(canvas, bVar, matrix);
                } else {
                    Path path = this.b;
                    path.reset();
                    for (int size = ((ArrayList) bVar.f18933a).size() - 1; size >= 0; size--) {
                        path.addPath(((bul) ((ArrayList) bVar.f18933a).get(size)).getPath(), matrix);
                    }
                    k6g.a("StrokeContent#buildPath");
                    canvas.drawPath(path, paint);
                    k6g.a("StrokeContent#drawPath");
                }
                i2++;
            } else {
                k6g.a("StrokeContent#draw");
                return;
            }
        }
    }

    @Override // tb.fo4
    public void c(List<fo4> list, List<fo4> list2) {
        List<b> list3;
        pgu pguVar = null;
        for (int size = list.size() - 1; size >= 0; size--) {
            fo4 fo4Var = list.get(size);
            if (fo4Var instanceof pgu) {
                pgu pguVar2 = (pgu) fo4Var;
                if (pguVar2.j() == ShapeTrimPath.Type.INDIVIDUALLY) {
                    pguVar = pguVar2;
                }
            }
        }
        if (pguVar != null) {
            pguVar.a(this);
        }
        int size2 = list2.size() - 1;
        b bVar = null;
        while (true) {
            list3 = this.g;
            if (size2 < 0) {
                break;
            }
            fo4 fo4Var2 = list2.get(size2);
            if (fo4Var2 instanceof pgu) {
                pgu pguVar3 = (pgu) fo4Var2;
                if (pguVar3.j() == ShapeTrimPath.Type.INDIVIDUALLY) {
                    if (bVar != null) {
                        ((ArrayList) list3).add(bVar);
                    }
                    bVar = new b(pguVar3);
                    pguVar3.a(this);
                    size2--;
                }
            }
            if (fo4Var2 instanceof bul) {
                if (bVar == null) {
                    bVar = new b(pguVar);
                }
                ((ArrayList) bVar.f18933a).add((bul) fo4Var2);
            }
            size2--;
        }
        if (bVar != null) {
            ((ArrayList) list3).add(bVar);
        }
    }

    @Override // tb.f4g
    public void d(e4g e4gVar, int i, List<e4g> list, e4g e4gVar2) {
        uvi.m(e4gVar, i, list, e4gVar2, this);
    }

    @Override // tb.ty7
    public void e(RectF rectF, Matrix matrix, boolean z) {
        Path path = this.b;
        path.reset();
        int i = 0;
        while (true) {
            ArrayList arrayList = (ArrayList) this.g;
            if (i < arrayList.size()) {
                b bVar = (b) arrayList.get(i);
                for (int i2 = 0; i2 < ((ArrayList) bVar.f18933a).size(); i2++) {
                    path.addPath(((bul) ((ArrayList) bVar.f18933a).get(i2)).getPath(), matrix);
                }
                i++;
            } else {
                RectF rectF2 = this.d;
                path.computeBounds(rectF2, false);
                float p = ((hn9) this.j).p() / 2.0f;
                rectF2.set(rectF2.left - p, rectF2.top - p, rectF2.right + p, rectF2.bottom + p);
                rectF.set(rectF2);
                rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
                k6g.a("StrokeContent#getBounds");
                return;
            }
        }
    }

    public final void f(Matrix matrix) {
        float[] fArr;
        float f;
        ArrayList arrayList = (ArrayList) this.l;
        if (arrayList.isEmpty()) {
            k6g.a("StrokeContent#applyDashPattern");
            return;
        }
        float g = fxv.g(matrix);
        int i = 0;
        while (true) {
            int size = arrayList.size();
            fArr = this.h;
            if (i >= size) {
                break;
            }
            float floatValue = ((Float) ((pw1) arrayList.get(i)).h()).floatValue();
            fArr[i] = floatValue;
            if (i % 2 == 0) {
                if (floatValue < 1.0f) {
                    fArr[i] = 1.0f;
                }
            } else if (floatValue < 0.1f) {
                fArr[i] = 0.1f;
            }
            fArr[i] = fArr[i] * g;
            i++;
        }
        pw1<?, Float> pw1Var = this.m;
        if (pw1Var == null) {
            f = 0.0f;
        } else {
            f = g * pw1Var.h().floatValue();
        }
        this.i.setPathEffect(new DashPathEffect(fArr, f));
        k6g.a("StrokeContent#applyDashPattern");
    }

    @Override // tb.pw1.b
    public void g() {
        this.e.invalidateSelf();
    }

    public final void i(Canvas canvas, b bVar, Matrix matrix) {
        float f;
        float f2;
        float f3;
        f12 f12Var = this;
        if (bVar.b == null) {
            k6g.a("StrokeContent#applyTrimPath");
            return;
        }
        Path path = f12Var.b;
        path.reset();
        for (int size = ((ArrayList) bVar.f18933a).size() - 1; size >= 0; size--) {
            path.addPath(((bul) ((ArrayList) bVar.f18933a).get(size)).getPath(), matrix);
        }
        float floatValue = bVar.b.i().h().floatValue() / 100.0f;
        float floatValue2 = bVar.b.d().h().floatValue() / 100.0f;
        float floatValue3 = bVar.b.f().h().floatValue() / 360.0f;
        Paint paint = f12Var.i;
        if (floatValue >= 0.01f || floatValue2 <= 0.99f) {
            PathMeasure pathMeasure = f12Var.f18932a;
            boolean z = false;
            pathMeasure.setPath(path, false);
            float length = pathMeasure.getLength();
            while (pathMeasure.nextContour()) {
                length += pathMeasure.getLength();
            }
            float f4 = floatValue3 * length;
            float f5 = (floatValue * length) + f4;
            float min = Math.min((floatValue2 * length) + f4, (f5 + length) - 1.0f);
            int size2 = ((ArrayList) bVar.f18933a).size() - 1;
            float f6 = 0.0f;
            while (size2 >= 0) {
                Path path2 = f12Var.c;
                path2.set(((bul) ((ArrayList) bVar.f18933a).get(size2)).getPath());
                path2.transform(matrix);
                pathMeasure.setPath(path2, z);
                float length2 = pathMeasure.getLength();
                if (min > length) {
                    float f7 = min - length;
                    if (f7 < f6 + length2 && f6 < f7) {
                        if (f5 > length) {
                            f3 = (f5 - length) / length2;
                        } else {
                            f3 = 0.0f;
                        }
                        fxv.a(path2, f3, Math.min(f7 / length2, 1.0f), 0.0f);
                        canvas.drawPath(path2, paint);
                        f6 += length2;
                        size2--;
                        f12Var = this;
                        z = false;
                    }
                }
                float f8 = f6 + length2;
                if (f8 >= f5 && f6 <= min) {
                    if (f8 > min || f5 >= f6) {
                        if (f5 < f6) {
                            f = 0.0f;
                        } else {
                            f = (f5 - f6) / length2;
                        }
                        if (min > f8) {
                            f2 = 1.0f;
                        } else {
                            f2 = (min - f6) / length2;
                        }
                        fxv.a(path2, f, f2, 0.0f);
                        canvas.drawPath(path2, paint);
                    } else {
                        canvas.drawPath(path2, paint);
                    }
                }
                f6 += length2;
                size2--;
                f12Var = this;
                z = false;
            }
            k6g.a("StrokeContent#applyTrimPath");
            return;
        }
        canvas.drawPath(path, paint);
        k6g.a("StrokeContent#applyTrimPath");
    }
}
