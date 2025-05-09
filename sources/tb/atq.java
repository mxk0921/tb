package tb;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.model.content.ShapeStroke;
import com.airbnb.lottie.model.layer.a;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class atq extends f12 {
    public final a r;
    public final String s;
    public final boolean t;
    public final pw1<Integer, Integer> u;
    public pw1<ColorFilter, ColorFilter> v;

    public atq(LottieDrawable lottieDrawable, a aVar, ShapeStroke shapeStroke) {
        super(lottieDrawable, aVar, shapeStroke.b().toPaintCap(), shapeStroke.e().toPaintJoin(), shapeStroke.g(), shapeStroke.i(), shapeStroke.j(), shapeStroke.f(), shapeStroke.d());
        this.r = aVar;
        this.s = shapeStroke.h();
        this.t = shapeStroke.k();
        pw1<Integer, Integer> a2 = shapeStroke.c().a();
        this.u = a2;
        a2.a(this);
        aVar.i(a2);
    }

    @Override // tb.f12, tb.f4g
    public <T> void a(T t, fmh<T> fmhVar) {
        super.a(t, fmhVar);
        Integer num = ylh.STROKE_COLOR;
        pw1<Integer, Integer> pw1Var = this.u;
        if (t == num) {
            pw1Var.n(fmhVar);
        } else if (t == ylh.COLOR_FILTER) {
            pw1<ColorFilter, ColorFilter> pw1Var2 = this.v;
            a aVar = this.r;
            if (pw1Var2 != null) {
                aVar.G(pw1Var2);
            }
            if (fmhVar == null) {
                this.v = null;
                return;
            }
            w1w w1wVar = new w1w(fmhVar);
            this.v = w1wVar;
            w1wVar.a(this);
            aVar.i(pw1Var);
        }
    }

    @Override // tb.f12, tb.ty7
    public void b(Canvas canvas, Matrix matrix, int i) {
        if (!this.t) {
            Paint paint = this.i;
            paint.setColor(((u04) this.u).p());
            pw1<ColorFilter, ColorFilter> pw1Var = this.v;
            if (pw1Var != null) {
                paint.setColorFilter(pw1Var.h());
            }
            super.b(canvas, matrix, i);
        }
    }

    @Override // tb.fo4
    public String getName() {
        return this.s;
    }
}
