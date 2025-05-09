package tb;

import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.PathEffect;
import android.graphics.RectF;
import android.text.Spanned;
import android.text.style.ReplacementSpan;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class pgo extends ReplacementSpan {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int BORDER_TYPE_DASH = 1;
    public static final int BORDER_TYPE_NORMAL = 0;

    /* renamed from: a  reason: collision with root package name */
    public final int[] f26084a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int[] g;
    public final int h;
    public final int i;
    public final int j;
    public final int k;
    public final Integer l;
    public int m;

    static {
        t2o.a(444597247);
    }

    public pgo(Integer num, int[] iArr, int i, int i2, int i3, int i4, int i5, int[] iArr2, int i6, int i7, int i8, int i9) {
        this.f26084a = iArr;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
        this.f = i5;
        this.g = iArr2;
        this.h = i6;
        this.i = i7;
        this.j = i8;
        this.k = i9;
        this.l = num;
    }

    public static /* synthetic */ Object ipc$super(pgo pgoVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dinamicx/view/richtext/span/RoundedBackgroundReplacementSpan");
    }

    public final int a(Paint paint, CharSequence charSequence, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("72cc72da", new Object[]{this, paint, charSequence, new Integer(i), new Integer(i2)})).intValue();
        }
        if (!(charSequence instanceof Spanned)) {
            return 0;
        }
        Spanned spanned = (Spanned) charSequence;
        u3w[] u3wVarArr = (u3w[]) spanned.getSpans(i, i2, u3w.class);
        if (u3wVarArr != null && u3wVarArr.length > 0) {
            return u3wVarArr[0].a(paint);
        }
        b4w[] b4wVarArr = (b4w[]) spanned.getSpans(i, i2, b4w.class);
        if (b4wVarArr != null && b4wVarArr.length > 0) {
            return b4wVarArr[0].a(paint);
        }
        v3w[] v3wVarArr = (v3w[]) spanned.getSpans(i, i2, v3w.class);
        if (v3wVarArr == null || v3wVarArr.length <= 0) {
            return 0;
        }
        return v3wVarArr[0].a(paint);
    }

    public int b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6c84ce3e", new Object[]{this})).intValue();
        }
        return i33.m(this.f26084a);
    }

    public int c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e22cf113", new Object[]{this})).intValue();
        }
        return i33.o(this.f26084a);
    }

    public int d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("501c0237", new Object[]{this})).intValue();
        }
        return i33.q(this.f26084a);
    }

    @Override // android.text.style.ReplacementSpan
    public void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        int i6;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e5acc076", new Object[]{this, canvas, charSequence, new Integer(i), new Integer(i2), new Float(f), new Integer(i3), new Integer(i4), new Integer(i5), paint});
            return;
        }
        canvas.save();
        int a2 = a(paint, charSequence, i, i2);
        if (a2 != 0) {
            canvas.translate(0.0f, a2);
        }
        Paint.FontMetrics fontMetrics = paint.getFontMetrics();
        boolean isAntiAlias = paint.isAntiAlias();
        paint.setAntiAlias(true);
        if (this.f != 0) {
            int color = paint.getColor();
            paint.setColor(this.f);
            float f2 = i4;
            i33.j(canvas, paint, new RectF(f - Math.max(0, this.h), ((fontMetrics.ascent + f2) - (f() / 2.0f)) - Math.max(0, this.j), this.m + f + Math.max(0, this.i), f2 + fontMetrics.descent + (c() / 2.0f) + Math.max(0, this.k)), this.g);
            paint.setColor(color);
        }
        int color2 = paint.getColor();
        Integer num = this.l;
        if (num != null) {
            paint.setColor(num.intValue());
        }
        float f3 = i4;
        canvas.drawText(charSequence, i, i2, f + d(), f3, paint);
        paint.setColor(color2);
        int b = b();
        if (b > 0) {
            float strokeWidth = paint.getStrokeWidth();
            int color3 = paint.getColor();
            PathEffect pathEffect = paint.getPathEffect();
            paint.setStrokeWidth(b);
            paint.setColor(this.b);
            if (this.c != 1 || this.d <= 0) {
                i6 = 0;
            } else {
                i6 = 0;
                paint.setPathEffect(new DashPathEffect(new float[]{this.d, this.e}, 0.0f));
            }
            i33.k(canvas, paint, new RectF((f - Math.max(i6, this.h)) + (d() / 2.0f), ((fontMetrics.ascent + f3) - (f() / 2.0f)) - Math.max(0, this.j), ((this.m + f) + Math.max(0, this.i)) - (e() / 2.0f), f3 + fontMetrics.descent + (c() / 2.0f) + Math.max(0, this.k)), this.g, this.f26084a);
            paint.setStrokeWidth(strokeWidth);
            paint.setColor(color3);
            paint.setPathEffect(pathEffect);
        }
        paint.setAntiAlias(isAntiAlias);
        canvas.restore();
    }

    public int e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8d41b32e", new Object[]{this})).intValue();
        }
        return i33.t(this.f26084a);
    }

    public int f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1ba4e055", new Object[]{this})).intValue();
        }
        return i33.w(this.f26084a);
    }

    @Override // android.text.style.ReplacementSpan
    public int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("46263898", new Object[]{this, paint, charSequence, new Integer(i), new Integer(i2), fontMetricsInt})).intValue();
        }
        int measureText = ((int) paint.measureText(charSequence, i, i2)) + d() + e();
        this.m = measureText;
        return measureText;
    }
}
