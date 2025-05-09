package tb;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.model.layer.Layer;
import com.airbnb.lottie.model.layer.a;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class tle extends a {
    public final Paint D = new qdg(3);
    public final Rect E = new Rect();
    public final Rect F = new Rect();
    public final olh G;
    public pw1<ColorFilter, ColorFilter> H;
    public pw1<Bitmap, Bitmap> I;

    public tle(LottieDrawable lottieDrawable, Layer layer) {
        super(lottieDrawable, layer);
        this.G = lottieDrawable.R(layer.m());
    }

    public final Bitmap O() {
        Bitmap h;
        pw1<Bitmap, Bitmap> pw1Var = this.I;
        if (pw1Var != null && (h = pw1Var.h()) != null) {
            return h;
        }
        Bitmap J = this.p.J(this.q.m());
        if (J != null) {
            return J;
        }
        olh olhVar = this.G;
        if (olhVar != null) {
            return olhVar.a();
        }
        return null;
    }

    @Override // com.airbnb.lottie.model.layer.a, tb.f4g
    public <T> void a(T t, fmh<T> fmhVar) {
        super.a(t, fmhVar);
        if (t == ylh.COLOR_FILTER) {
            if (fmhVar == null) {
                this.H = null;
            } else {
                this.H = new w1w(fmhVar);
            }
        } else if (t != ylh.IMAGE) {
        } else {
            if (fmhVar == null) {
                this.I = null;
            } else {
                this.I = new w1w(fmhVar);
            }
        }
    }

    @Override // com.airbnb.lottie.model.layer.a, tb.ty7
    public void e(RectF rectF, Matrix matrix, boolean z) {
        super.e(rectF, matrix, z);
        olh olhVar = this.G;
        if (olhVar != null) {
            float e = fxv.e();
            rectF.set(0.0f, 0.0f, olhVar.e() * e, olhVar.c() * e);
            this.o.mapRect(rectF);
        }
    }

    @Override // com.airbnb.lottie.model.layer.a
    public void t(Canvas canvas, Matrix matrix, int i) {
        olh olhVar;
        Bitmap O = O();
        if (O != null && !O.isRecycled() && (olhVar = this.G) != null) {
            float e = fxv.e();
            Paint paint = this.D;
            paint.setAlpha(i);
            pw1<ColorFilter, ColorFilter> pw1Var = this.H;
            if (pw1Var != null) {
                paint.setColorFilter(pw1Var.h());
            }
            canvas.save();
            canvas.concat(matrix);
            int width = O.getWidth();
            int height = O.getHeight();
            Rect rect = this.E;
            rect.set(0, 0, width, height);
            boolean S = this.p.S();
            Rect rect2 = this.F;
            if (S) {
                rect2.set(0, 0, (int) (olhVar.e() * e), (int) (olhVar.c() * e));
            } else {
                rect2.set(0, 0, (int) (O.getWidth() * e), (int) (O.getHeight() * e));
            }
            canvas.drawBitmap(O, rect, rect2, paint);
            canvas.restore();
        }
    }
}
