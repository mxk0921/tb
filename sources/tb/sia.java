package tb;

import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import androidx.collection.LongSparseArray;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.model.content.GradientType;
import com.airbnb.lottie.model.layer.a;
import java.util.ArrayList;
import java.util.List;
import tb.pw1;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class sia implements ty7, pw1.b, g4g {

    /* renamed from: a  reason: collision with root package name */
    public final String f28072a;
    public final boolean b;
    public final a c;
    public final Path f;
    public final GradientType j;
    public final pw1<nia, nia> k;
    public final pw1<Integer, Integer> l;
    public final pw1<PointF, PointF> m;
    public final pw1<PointF, PointF> n;
    public pw1<ColorFilter, ColorFilter> o;
    public w1w p;
    public final LottieDrawable q;
    public final int r;
    public pw1<Float, Float> s;
    public final g08 u;
    public final LongSparseArray<LinearGradient> d = new LongSparseArray<>();
    public final LongSparseArray<RadialGradient> e = new LongSparseArray<>();
    public final Paint g = new qdg(1);
    public final RectF h = new RectF();
    public final List<bul> i = new ArrayList();
    public float t = 0.0f;

    public sia(LottieDrawable lottieDrawable, a aVar, ria riaVar) {
        Path path = new Path();
        this.f = path;
        this.c = aVar;
        this.f28072a = riaVar.f();
        this.b = riaVar.i();
        this.q = lottieDrawable;
        this.j = riaVar.e();
        path.setFillType(riaVar.c());
        this.r = (int) (lottieDrawable.L().d() / 32.0f);
        pw1<nia, nia> a2 = riaVar.d().a();
        this.k = a2;
        a2.a(this);
        aVar.i(a2);
        pw1<Integer, Integer> a3 = riaVar.g().a();
        this.l = a3;
        a3.a(this);
        aVar.i(a3);
        pw1<PointF, PointF> a4 = riaVar.h().a();
        this.m = a4;
        a4.a(this);
        aVar.i(a4);
        pw1<PointF, PointF> a5 = riaVar.b().a();
        this.n = a5;
        a5.a(this);
        aVar.i(a5);
        if (aVar.v() != null) {
            pw1<Float, Float> a6 = aVar.v().a().a();
            this.s = a6;
            a6.a(this);
            aVar.i(this.s);
        }
        if (aVar.x() != null) {
            this.u = new g08(this, aVar, aVar.x());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // tb.f4g
    public <T> void a(T t, fmh<T> fmhVar) {
        if (t == ylh.OPACITY) {
            this.l.n(fmhVar);
            return;
        }
        ColorFilter colorFilter = ylh.COLOR_FILTER;
        a aVar = this.c;
        if (t == colorFilter) {
            pw1<ColorFilter, ColorFilter> pw1Var = this.o;
            if (pw1Var != null) {
                aVar.G(pw1Var);
            }
            if (fmhVar == null) {
                this.o = null;
                return;
            }
            w1w w1wVar = new w1w(fmhVar);
            this.o = w1wVar;
            w1wVar.a(this);
            aVar.i(this.o);
        } else if (t == ylh.GRADIENT_COLOR) {
            w1w w1wVar2 = this.p;
            if (w1wVar2 != null) {
                aVar.G(w1wVar2);
            }
            if (fmhVar == null) {
                this.p = null;
                return;
            }
            this.d.clear();
            this.e.clear();
            w1w w1wVar3 = new w1w(fmhVar);
            this.p = w1wVar3;
            w1wVar3.a(this);
            aVar.i(this.p);
        } else if (t == ylh.BLUR_RADIUS) {
            pw1<Float, Float> pw1Var2 = this.s;
            if (pw1Var2 != null) {
                pw1Var2.n(fmhVar);
                return;
            }
            w1w w1wVar4 = new w1w(fmhVar);
            this.s = w1wVar4;
            w1wVar4.a(this);
            aVar.i(this.s);
        } else {
            Integer num = ylh.DROP_SHADOW_COLOR;
            g08 g08Var = this.u;
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

    @Override // tb.ty7
    public void b(Canvas canvas, Matrix matrix, int i) {
        Shader shader;
        if (!this.b) {
            Path path = this.f;
            path.reset();
            int i2 = 0;
            while (true) {
                ArrayList arrayList = (ArrayList) this.i;
                if (i2 >= arrayList.size()) {
                    break;
                }
                path.addPath(((bul) arrayList.get(i2)).getPath(), matrix);
                i2++;
            }
            path.computeBounds(this.h, false);
            if (this.j == GradientType.LINEAR) {
                shader = j();
            } else {
                shader = k();
            }
            shader.setLocalMatrix(matrix);
            Paint paint = this.g;
            paint.setShader(shader);
            pw1<ColorFilter, ColorFilter> pw1Var = this.o;
            if (pw1Var != null) {
                paint.setColorFilter(pw1Var.h());
            }
            pw1<Float, Float> pw1Var2 = this.s;
            if (pw1Var2 != null) {
                float floatValue = pw1Var2.h().floatValue();
                if (floatValue == 0.0f) {
                    paint.setMaskFilter(null);
                } else if (floatValue != this.t) {
                    paint.setMaskFilter(new BlurMaskFilter(floatValue, BlurMaskFilter.Blur.NORMAL));
                }
                this.t = floatValue;
            }
            g08 g08Var = this.u;
            if (g08Var != null) {
                g08Var.a(paint);
            }
            paint.setAlpha(uvi.d((int) ((((i / 255.0f) * this.l.h().intValue()) / 100.0f) * 255.0f), 0, 255));
            canvas.drawPath(path, paint);
            k6g.a("GradientFillContent#draw");
        }
    }

    @Override // tb.fo4
    public void c(List<fo4> list, List<fo4> list2) {
        for (int i = 0; i < list2.size(); i++) {
            fo4 fo4Var = list2.get(i);
            if (fo4Var instanceof bul) {
                ((ArrayList) this.i).add((bul) fo4Var);
            }
        }
    }

    @Override // tb.f4g
    public void d(e4g e4gVar, int i, List<e4g> list, e4g e4gVar2) {
        uvi.m(e4gVar, i, list, e4gVar2, this);
    }

    @Override // tb.ty7
    public void e(RectF rectF, Matrix matrix, boolean z) {
        Path path = this.f;
        path.reset();
        int i = 0;
        while (true) {
            ArrayList arrayList = (ArrayList) this.i;
            if (i < arrayList.size()) {
                path.addPath(((bul) arrayList.get(i)).getPath(), matrix);
                i++;
            } else {
                path.computeBounds(rectF, false);
                rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
                return;
            }
        }
    }

    public final int[] f(int[] iArr) {
        w1w w1wVar = this.p;
        if (w1wVar != null) {
            Integer[] numArr = (Integer[]) w1wVar.h();
            int i = 0;
            if (iArr.length == numArr.length) {
                while (i < iArr.length) {
                    iArr[i] = numArr[i].intValue();
                    i++;
                }
            } else {
                iArr = new int[numArr.length];
                while (i < numArr.length) {
                    iArr[i] = numArr[i].intValue();
                    i++;
                }
            }
        }
        return iArr;
    }

    @Override // tb.pw1.b
    public void g() {
        this.q.invalidateSelf();
    }

    @Override // tb.fo4
    public String getName() {
        return this.f28072a;
    }

    public final int i() {
        int i;
        float f = this.m.f();
        float f2 = this.r;
        int round = Math.round(f * f2);
        int round2 = Math.round(this.n.f() * f2);
        int round3 = Math.round(this.k.f() * f2);
        if (round != 0) {
            i = 527 * round;
        } else {
            i = 17;
        }
        if (round2 != 0) {
            i = i * 31 * round2;
        }
        if (round3 != 0) {
            return i * 31 * round3;
        }
        return i;
    }

    public final LinearGradient j() {
        int i = i();
        LongSparseArray<LinearGradient> longSparseArray = this.d;
        long j = i;
        LinearGradient linearGradient = longSparseArray.get(j);
        if (linearGradient != null) {
            return linearGradient;
        }
        PointF h = this.m.h();
        PointF h2 = this.n.h();
        nia h3 = this.k.h();
        LinearGradient linearGradient2 = new LinearGradient(h.x, h.y, h2.x, h2.y, f(h3.a()), h3.b(), Shader.TileMode.CLAMP);
        longSparseArray.put(j, linearGradient2);
        return linearGradient2;
    }

    public final RadialGradient k() {
        float f;
        int i = i();
        LongSparseArray<RadialGradient> longSparseArray = this.e;
        long j = i;
        RadialGradient radialGradient = longSparseArray.get(j);
        if (radialGradient != null) {
            return radialGradient;
        }
        PointF h = this.m.h();
        PointF h2 = this.n.h();
        nia h3 = this.k.h();
        int[] f2 = f(h3.a());
        float[] b = h3.b();
        float f3 = h.x;
        float f4 = h.y;
        float hypot = (float) Math.hypot(h2.x - f3, h2.y - f4);
        if (hypot <= 0.0f) {
            f = 0.001f;
        } else {
            f = hypot;
        }
        RadialGradient radialGradient2 = new RadialGradient(f3, f4, f, f2, b, Shader.TileMode.CLAMP);
        longSparseArray.put(j, radialGradient2);
        return radialGradient2;
    }
}
