package tb;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.model.layer.Layer;
import com.airbnb.lottie.model.layer.a;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class q9q extends a {
    public final Paint E;
    public final Layer H;
    public pw1<ColorFilter, ColorFilter> I;
    public final RectF D = new RectF();
    public final float[] F = new float[8];
    public final Path G = new Path();

    public q9q(LottieDrawable lottieDrawable, Layer layer) {
        super(lottieDrawable, layer);
        qdg qdgVar = new qdg();
        this.E = qdgVar;
        this.H = layer;
        qdgVar.setAlpha(0);
        qdgVar.setStyle(Paint.Style.FILL);
        qdgVar.setColor(layer.o());
    }

    @Override // com.airbnb.lottie.model.layer.a, tb.f4g
    public <T> void a(T t, fmh<T> fmhVar) {
        super.a(t, fmhVar);
        if (t != ylh.COLOR_FILTER) {
            return;
        }
        if (fmhVar == null) {
            this.I = null;
        } else {
            this.I = new w1w(fmhVar);
        }
    }

    @Override // com.airbnb.lottie.model.layer.a, tb.ty7
    public void e(RectF rectF, Matrix matrix, boolean z) {
        super.e(rectF, matrix, z);
        RectF rectF2 = this.D;
        Layer layer = this.H;
        rectF2.set(0.0f, 0.0f, layer.q(), layer.p());
        this.o.mapRect(rectF2);
        rectF.set(rectF2);
    }

    @Override // com.airbnb.lottie.model.layer.a
    public void t(Canvas canvas, Matrix matrix, int i) {
        int i2;
        Layer layer = this.H;
        int alpha = Color.alpha(layer.o());
        if (alpha != 0) {
            aeu aeuVar = this.x;
            if (aeuVar.h() == null) {
                i2 = 100;
            } else {
                i2 = aeuVar.h().h().intValue();
            }
            int i3 = (int) ((i / 255.0f) * (((alpha / 255.0f) * i2) / 100.0f) * 255.0f);
            Paint paint = this.E;
            paint.setAlpha(i3);
            pw1<ColorFilter, ColorFilter> pw1Var = this.I;
            if (pw1Var != null) {
                paint.setColorFilter(pw1Var.h());
            }
            if (i3 > 0) {
                float[] fArr = this.F;
                fArr[0] = 0.0f;
                fArr[1] = 0.0f;
                fArr[2] = layer.q();
                fArr[3] = 0.0f;
                fArr[4] = layer.q();
                fArr[5] = layer.p();
                fArr[6] = 0.0f;
                fArr[7] = layer.p();
                matrix.mapPoints(fArr);
                Path path = this.G;
                path.reset();
                path.moveTo(fArr[0], fArr[1]);
                path.lineTo(fArr[2], fArr[3]);
                path.lineTo(fArr[4], fArr[5]);
                path.lineTo(fArr[6], fArr[7]);
                path.lineTo(fArr[0], fArr[1]);
                path.close();
                canvas.drawPath(path, paint);
            }
        }
    }
}
