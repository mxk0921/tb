package tb;

import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.model.content.ShapeTrimPath;
import com.airbnb.lottie.model.layer.a;
import java.util.List;
import tb.pw1;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class krn implements pw1.b, g4g, bul {
    public final String c;
    public final boolean d;
    public final LottieDrawable e;
    public final pw1<?, PointF> f;
    public final pw1<?, PointF> g;
    public final pw1<?, Float> h;
    public boolean k;

    /* renamed from: a  reason: collision with root package name */
    public final Path f22868a = new Path();
    public final RectF b = new RectF();
    public final ce4 i = new ce4();
    public pw1<Float, Float> j = null;

    public krn(LottieDrawable lottieDrawable, a aVar, nrn nrnVar) {
        this.c = nrnVar.c();
        this.d = nrnVar.f();
        this.e = lottieDrawable;
        pw1<PointF, PointF> a2 = nrnVar.d().a();
        this.f = a2;
        pw1<PointF, PointF> a3 = nrnVar.e().a();
        this.g = a3;
        pw1<Float, Float> a4 = nrnVar.b().a();
        this.h = a4;
        aVar.i(a2);
        aVar.i(a3);
        aVar.i(a4);
        a2.a(this);
        a3.a(this);
        a4.a(this);
    }

    @Override // tb.f4g
    public <T> void a(T t, fmh<T> fmhVar) {
        if (t == ylh.RECTANGLE_SIZE) {
            this.g.n(fmhVar);
        } else if (t == ylh.POSITION) {
            this.f.n(fmhVar);
        } else if (t == ylh.CORNER_RADIUS) {
            this.h.n(fmhVar);
        }
    }

    @Override // tb.fo4
    public void c(List<fo4> list, List<fo4> list2) {
        for (int i = 0; i < list.size(); i++) {
            fo4 fo4Var = list.get(i);
            if (fo4Var instanceof pgu) {
                pgu pguVar = (pgu) fo4Var;
                if (pguVar.j() == ShapeTrimPath.Type.SIMULTANEOUSLY) {
                    this.i.a(pguVar);
                    pguVar.a(this);
                }
            }
            if (fo4Var instanceof vgo) {
                this.j = ((vgo) fo4Var).f();
            }
        }
    }

    @Override // tb.f4g
    public void d(e4g e4gVar, int i, List<e4g> list, e4g e4gVar2) {
        uvi.m(e4gVar, i, list, e4gVar2, this);
    }

    public final void f() {
        this.k = false;
        this.e.invalidateSelf();
    }

    @Override // tb.pw1.b
    public void g() {
        f();
    }

    @Override // tb.fo4
    public String getName() {
        return this.c;
    }

    @Override // tb.bul
    public Path getPath() {
        float f;
        pw1<Float, Float> pw1Var;
        boolean z = this.k;
        Path path = this.f22868a;
        if (z) {
            return path;
        }
        path.reset();
        if (this.d) {
            this.k = true;
            return path;
        }
        PointF h = this.g.h();
        float f2 = h.x / 2.0f;
        float f3 = h.y / 2.0f;
        pw1<?, Float> pw1Var2 = this.h;
        if (pw1Var2 == null) {
            f = 0.0f;
        } else {
            f = ((hn9) pw1Var2).p();
        }
        if (f == 0.0f && (pw1Var = this.j) != null) {
            f = Math.min(pw1Var.h().floatValue(), Math.min(f2, f3));
        }
        float min = Math.min(f2, f3);
        if (f > min) {
            f = min;
        }
        PointF h2 = this.f.h();
        path.moveTo(h2.x + f2, (h2.y - f3) + f);
        path.lineTo(h2.x + f2, (h2.y + f3) - f);
        RectF rectF = this.b;
        int i = (f > 0.0f ? 1 : (f == 0.0f ? 0 : -1));
        if (i > 0) {
            float f4 = h2.x + f2;
            float f5 = f * 2.0f;
            float f6 = h2.y + f3;
            rectF.set(f4 - f5, f6 - f5, f4, f6);
            path.arcTo(rectF, 0.0f, 90.0f, false);
        }
        path.lineTo((h2.x - f2) + f, h2.y + f3);
        if (i > 0) {
            float f7 = h2.x - f2;
            float f8 = h2.y + f3;
            float f9 = f * 2.0f;
            rectF.set(f7, f8 - f9, f9 + f7, f8);
            path.arcTo(rectF, 90.0f, 90.0f, false);
        }
        path.lineTo(h2.x - f2, (h2.y - f3) + f);
        if (i > 0) {
            float f10 = h2.x - f2;
            float f11 = h2.y - f3;
            float f12 = f * 2.0f;
            rectF.set(f10, f11, f10 + f12, f12 + f11);
            path.arcTo(rectF, 180.0f, 90.0f, false);
        }
        path.lineTo((h2.x + f2) - f, h2.y - f3);
        if (i > 0) {
            float f13 = h2.x + f2;
            float f14 = f * 2.0f;
            float f15 = h2.y - f3;
            rectF.set(f13 - f14, f15, f13, f14 + f15);
            path.arcTo(rectF, 270.0f, 90.0f, false);
        }
        path.close();
        this.i.b(path);
        this.k = true;
        return path;
    }
}
