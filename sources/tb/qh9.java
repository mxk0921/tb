package tb;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.model.layer.a;
import java.util.ArrayList;
import java.util.List;
import tb.pw1;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class qh9 implements ty7, pw1.b, g4g {

    /* renamed from: a  reason: collision with root package name */
    public final Path f26753a;
    public final a c;
    public final String d;
    public final boolean e;
    public final pw1<Integer, Integer> g;
    public final pw1<Integer, Integer> h;
    public pw1<ColorFilter, ColorFilter> i;
    public final LottieDrawable j;
    public pw1<Float, Float> k;
    public float l;
    public final g08 m;
    public final Paint b = new qdg(1);
    public final List<bul> f = new ArrayList();

    public qh9(LottieDrawable lottieDrawable, a aVar, ihp ihpVar) {
        Path path = new Path();
        this.f26753a = path;
        this.c = aVar;
        this.d = ihpVar.d();
        this.e = ihpVar.f();
        this.j = lottieDrawable;
        if (aVar.v() != null) {
            pw1<Float, Float> a2 = aVar.v().a().a();
            this.k = a2;
            a2.a(this);
            aVar.i(this.k);
        }
        if (aVar.x() != null) {
            this.m = new g08(this, aVar, aVar.x());
        }
        if (ihpVar.b() == null || ihpVar.e() == null) {
            this.g = null;
            this.h = null;
            return;
        }
        path.setFillType(ihpVar.c());
        pw1<Integer, Integer> a3 = ihpVar.b().a();
        this.g = a3;
        a3.a(this);
        aVar.i(a3);
        pw1<Integer, Integer> a4 = ihpVar.e().a();
        this.h = a4;
        a4.a(this);
        aVar.i(a4);
    }

    @Override // tb.f4g
    public <T> void a(T t, fmh<T> fmhVar) {
        if (t == ylh.COLOR) {
            this.g.n(fmhVar);
        } else if (t == ylh.OPACITY) {
            this.h.n(fmhVar);
        } else {
            ColorFilter colorFilter = ylh.COLOR_FILTER;
            a aVar = this.c;
            if (t == colorFilter) {
                pw1<ColorFilter, ColorFilter> pw1Var = this.i;
                if (pw1Var != null) {
                    aVar.G(pw1Var);
                }
                if (fmhVar == null) {
                    this.i = null;
                    return;
                }
                w1w w1wVar = new w1w(fmhVar);
                this.i = w1wVar;
                w1wVar.a(this);
                aVar.i(this.i);
            } else if (t == ylh.BLUR_RADIUS) {
                pw1<Float, Float> pw1Var2 = this.k;
                if (pw1Var2 != null) {
                    pw1Var2.n(fmhVar);
                    return;
                }
                w1w w1wVar2 = new w1w(fmhVar);
                this.k = w1wVar2;
                w1wVar2.a(this);
                aVar.i(this.k);
            } else {
                Integer num = ylh.DROP_SHADOW_COLOR;
                g08 g08Var = this.m;
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

    @Override // tb.ty7
    public void b(Canvas canvas, Matrix matrix, int i) {
        if (!this.e) {
            int p = ((u04) this.g).p();
            Paint paint = this.b;
            int i2 = 0;
            paint.setColor((uvi.d((int) ((((i / 255.0f) * this.h.h().intValue()) / 100.0f) * 255.0f), 0, 255) << 24) | (p & 16777215));
            pw1<ColorFilter, ColorFilter> pw1Var = this.i;
            if (pw1Var != null) {
                paint.setColorFilter(pw1Var.h());
            }
            pw1<Float, Float> pw1Var2 = this.k;
            if (pw1Var2 != null) {
                float floatValue = pw1Var2.h().floatValue();
                if (floatValue == 0.0f) {
                    paint.setMaskFilter(null);
                } else if (floatValue != this.l) {
                    paint.setMaskFilter(this.c.w(floatValue));
                }
                this.l = floatValue;
            }
            g08 g08Var = this.m;
            if (g08Var != null) {
                g08Var.a(paint);
            }
            Path path = this.f26753a;
            path.reset();
            while (true) {
                ArrayList arrayList = (ArrayList) this.f;
                if (i2 < arrayList.size()) {
                    path.addPath(((bul) arrayList.get(i2)).getPath(), matrix);
                    i2++;
                } else {
                    canvas.drawPath(path, paint);
                    k6g.a("FillContent#draw");
                    return;
                }
            }
        }
    }

    @Override // tb.fo4
    public void c(List<fo4> list, List<fo4> list2) {
        for (int i = 0; i < list2.size(); i++) {
            fo4 fo4Var = list2.get(i);
            if (fo4Var instanceof bul) {
                ((ArrayList) this.f).add((bul) fo4Var);
            }
        }
    }

    @Override // tb.f4g
    public void d(e4g e4gVar, int i, List<e4g> list, e4g e4gVar2) {
        uvi.m(e4gVar, i, list, e4gVar2, this);
    }

    @Override // tb.ty7
    public void e(RectF rectF, Matrix matrix, boolean z) {
        Path path = this.f26753a;
        path.reset();
        int i = 0;
        while (true) {
            ArrayList arrayList = (ArrayList) this.f;
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

    @Override // tb.pw1.b
    public void g() {
        this.j.invalidateSelf();
    }

    @Override // tb.fo4
    public String getName() {
        return this.d;
    }
}
