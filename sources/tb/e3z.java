package tb;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.style.ReplacementSpan;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class e3z extends ReplacementSpan {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Typeface f18251a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;

    static {
        t2o.a(912261233);
    }

    public e3z(Typeface typeface, int i, int i2, int i3, int i4) {
        ckf.h(typeface, "typeface");
        this.f18251a = typeface;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
    }

    public static /* synthetic */ Object ipc$super(e3z e3zVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/ttdetail/animation/priceAnimation/CustomTypefaceSpan");
    }

    @Override // android.text.style.ReplacementSpan
    public void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        CharSequence subSequence;
        String obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e5acc076", new Object[]{this, canvas, charSequence, new Integer(i), new Integer(i2), new Float(f), new Integer(i3), new Integer(i4), new Integer(i5), paint});
            return;
        }
        ckf.h(canvas, "canvas");
        ckf.h(paint, "paint");
        if (charSequence != null && (subSequence = charSequence.subSequence(i, i2)) != null && (obj = subSequence.toString()) != null) {
            paint.setTypeface(this.f18251a);
            paint.setColor(this.b);
            paint.setTextSize(this.c);
            canvas.drawText(obj, f + this.d, i4 + this.e, paint);
        }
    }

    @Override // android.text.style.ReplacementSpan
    public int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        String str;
        CharSequence subSequence;
        Paint.FontMetrics fontMetrics;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("46263898", new Object[]{this, paint, charSequence, new Integer(i), new Integer(i2), fontMetricsInt})).intValue();
        }
        ckf.h(paint, "paint");
        paint.setTypeface(this.f18251a);
        paint.setTextSize(this.c);
        if (!(fontMetricsInt == null || (fontMetrics = paint.getFontMetrics()) == null)) {
            fontMetricsInt.ascent = (int) fontMetrics.ascent;
            fontMetricsInt.descent = (int) fontMetrics.descent;
            fontMetricsInt.top = (int) fontMetrics.top;
            fontMetricsInt.bottom = (int) fontMetrics.bottom;
        }
        if (charSequence == null || (subSequence = charSequence.subSequence(i, i2)) == null || (str = subSequence.toString()) == null) {
            str = "";
        }
        return ((int) paint.measureText(str)) + this.d;
    }
}
