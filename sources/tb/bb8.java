package tb;

import android.graphics.Path;
import android.graphics.PointF;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.model.content.ShapeTrimPath;
import com.airbnb.lottie.model.layer.a;
import java.util.List;
import tb.pw1;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class bb8 implements bul, pw1.b, g4g {
    public final String b;
    public final LottieDrawable c;
    public final pw1<?, PointF> d;
    public final pw1<?, PointF> e;
    public final is3 f;
    public boolean h;

    /* renamed from: a  reason: collision with root package name */
    public final Path f16293a = new Path();
    public final ce4 g = new ce4();

    public bb8(LottieDrawable lottieDrawable, a aVar, is3 is3Var) {
        this.b = is3Var.b();
        this.c = lottieDrawable;
        pw1<PointF, PointF> a2 = is3Var.d().a();
        this.d = a2;
        pw1<PointF, PointF> a3 = is3Var.c().a();
        this.e = a3;
        this.f = is3Var;
        aVar.i(a2);
        aVar.i(a3);
        a2.a(this);
        a3.a(this);
    }

    @Override // tb.f4g
    public <T> void a(T t, fmh<T> fmhVar) {
        if (t == ylh.ELLIPSE_SIZE) {
            this.d.n(fmhVar);
        } else if (t == ylh.POSITION) {
            this.e.n(fmhVar);
        }
    }

    @Override // tb.fo4
    public void c(List<fo4> list, List<fo4> list2) {
        for (int i = 0; i < list.size(); i++) {
            fo4 fo4Var = list.get(i);
            if (fo4Var instanceof pgu) {
                pgu pguVar = (pgu) fo4Var;
                if (pguVar.j() == ShapeTrimPath.Type.SIMULTANEOUSLY) {
                    this.g.a(pguVar);
                    pguVar.a(this);
                }
            }
        }
    }

    @Override // tb.f4g
    public void d(e4g e4gVar, int i, List<e4g> list, e4g e4gVar2) {
        uvi.m(e4gVar, i, list, e4gVar2, this);
    }

    public final void f() {
        this.h = false;
        this.c.invalidateSelf();
    }

    @Override // tb.pw1.b
    public void g() {
        f();
    }

    @Override // tb.fo4
    public String getName() {
        return this.b;
    }

    @Override // tb.bul
    public Path getPath() {
        boolean z = this.h;
        Path path = this.f16293a;
        if (z) {
            return path;
        }
        path.reset();
        is3 is3Var = this.f;
        if (is3Var.e()) {
            this.h = true;
            return path;
        }
        PointF h = this.d.h();
        float f = h.x / 2.0f;
        float f2 = h.y / 2.0f;
        float f3 = f * 0.55228f;
        float f4 = f2 * 0.55228f;
        path.reset();
        if (is3Var.f()) {
            float f5 = -f2;
            path.moveTo(0.0f, f5);
            float f6 = 0.0f - f3;
            float f7 = -f;
            float f8 = 0.0f - f4;
            path.cubicTo(f6, f5, f7, f8, f7, 0.0f);
            float f9 = f4 + 0.0f;
            path.cubicTo(f7, f9, f6, f2, 0.0f, f2);
            float f10 = f3 + 0.0f;
            path.cubicTo(f10, f2, f, f9, f, 0.0f);
            path.cubicTo(f, f8, f10, f5, 0.0f, f5);
        } else {
            float f11 = -f2;
            path.moveTo(0.0f, f11);
            float f12 = f3 + 0.0f;
            float f13 = 0.0f - f4;
            path.cubicTo(f12, f11, f, f13, f, 0.0f);
            float f14 = f4 + 0.0f;
            path.cubicTo(f, f14, f12, f2, 0.0f, f2);
            float f15 = 0.0f - f3;
            float f16 = -f;
            path.cubicTo(f15, f2, f16, f14, f16, 0.0f);
            path.cubicTo(f16, f13, f15, f11, 0.0f, f11);
        }
        PointF h2 = this.e.h();
        path.offset(h2.x, h2.y);
        path.close();
        this.g.b(path);
        this.h = true;
        return path;
    }
}
