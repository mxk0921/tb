package tb;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import androidx.collection.LongSparseArray;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.model.content.GradientType;
import com.airbnb.lottie.model.layer.a;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class uia extends f12 {
    public final pw1<PointF, PointF> A;
    public w1w B;
    public final String r;
    public final boolean s;
    public final LongSparseArray<LinearGradient> t = new LongSparseArray<>();
    public final LongSparseArray<RadialGradient> u = new LongSparseArray<>();
    public final RectF v = new RectF();
    public final GradientType w;
    public final int x;
    public final pw1<nia, nia> y;
    public final pw1<PointF, PointF> z;

    public uia(LottieDrawable lottieDrawable, a aVar, com.airbnb.lottie.model.content.a aVar2) {
        super(lottieDrawable, aVar, aVar2.b().toPaintCap(), aVar2.g().toPaintJoin(), aVar2.i(), aVar2.k(), aVar2.m(), aVar2.h(), aVar2.c());
        this.r = aVar2.j();
        this.w = aVar2.f();
        this.s = aVar2.n();
        this.x = (int) (lottieDrawable.L().d() / 32.0f);
        pw1<nia, nia> a2 = aVar2.e().a();
        this.y = a2;
        a2.a(this);
        aVar.i(a2);
        pw1<PointF, PointF> a3 = aVar2.l().a();
        this.z = a3;
        a3.a(this);
        aVar.i(a3);
        pw1<PointF, PointF> a4 = aVar2.d().a();
        this.A = a4;
        a4.a(this);
        aVar.i(a4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // tb.f12, tb.f4g
    public <T> void a(T t, fmh<T> fmhVar) {
        super.a(t, fmhVar);
        if (t == ylh.GRADIENT_COLOR) {
            w1w w1wVar = this.B;
            a aVar = this.f;
            if (w1wVar != null) {
                aVar.G(w1wVar);
            }
            if (fmhVar == null) {
                this.B = null;
                return;
            }
            w1w w1wVar2 = new w1w(fmhVar);
            this.B = w1wVar2;
            w1wVar2.a(this);
            aVar.i(this.B);
        }
    }

    @Override // tb.f12, tb.ty7
    public void b(Canvas canvas, Matrix matrix, int i) {
        Shader shader;
        if (!this.s) {
            e(this.v, matrix, false);
            if (this.w == GradientType.LINEAR) {
                shader = l();
            } else {
                shader = m();
            }
            shader.setLocalMatrix(matrix);
            this.i.setShader(shader);
            super.b(canvas, matrix, i);
        }
    }

    @Override // tb.fo4
    public String getName() {
        return this.r;
    }

    public final int[] j(int[] iArr) {
        w1w w1wVar = this.B;
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

    public final int k() {
        int i;
        float f = this.z.f();
        float f2 = this.x;
        int round = Math.round(f * f2);
        int round2 = Math.round(this.A.f() * f2);
        int round3 = Math.round(this.y.f() * f2);
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

    public final LinearGradient l() {
        int k = k();
        LongSparseArray<LinearGradient> longSparseArray = this.t;
        long j = k;
        LinearGradient linearGradient = longSparseArray.get(j);
        if (linearGradient != null) {
            return linearGradient;
        }
        PointF h = this.z.h();
        PointF h2 = this.A.h();
        nia h3 = this.y.h();
        LinearGradient linearGradient2 = new LinearGradient(h.x, h.y, h2.x, h2.y, j(h3.a()), h3.b(), Shader.TileMode.CLAMP);
        longSparseArray.put(j, linearGradient2);
        return linearGradient2;
    }

    public final RadialGradient m() {
        float f;
        float f2;
        int k = k();
        LongSparseArray<RadialGradient> longSparseArray = this.u;
        long j = k;
        RadialGradient radialGradient = longSparseArray.get(j);
        if (radialGradient != null) {
            return radialGradient;
        }
        PointF h = this.z.h();
        PointF h2 = this.A.h();
        nia h3 = this.y.h();
        int[] j2 = j(h3.a());
        float[] b = h3.b();
        RadialGradient radialGradient2 = new RadialGradient(h.x, h.y, (float) Math.hypot(h2.x - f, h2.y - f2), j2, b, Shader.TileMode.CLAMP);
        longSparseArray.put(j, radialGradient2);
        return radialGradient2;
    }
}
