package tb;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.TextPaint;
import android.text.style.ReplacementSpan;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class p3w extends ReplacementSpan {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final int f25863a;
    public final int b;

    static {
        t2o.a(912262615);
    }

    public p3w(int i, int i2) {
        this.f25863a = i;
        this.b = i2;
    }

    public static /* synthetic */ Object ipc$super(p3w p3wVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/ttdetail/skeleton/navbar/VerticalAlignTextSpan");
    }

    public final TextPaint a(Paint paint) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TextPaint) ipChange.ipc$dispatch("4eed7d30", new Object[]{this, paint});
        }
        TextPaint textPaint = new TextPaint(paint);
        textPaint.setTextSize(mr7.a(this.f25863a));
        textPaint.setColor(this.b);
        return textPaint;
    }

    @Override // android.text.style.ReplacementSpan
    public int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("46263898", new Object[]{this, paint, charSequence, new Integer(i), new Integer(i2), fontMetricsInt})).intValue();
        }
        ckf.h(paint, "paint");
        ckf.h(charSequence, "text");
        return (int) a(paint).measureText(charSequence, i, i2);
    }

    @Override // android.text.style.ReplacementSpan
    public void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e5acc076", new Object[]{this, canvas, charSequence, new Integer(i), new Integer(i2), new Float(f), new Integer(i3), new Integer(i4), new Integer(i5), paint});
            return;
        }
        ckf.h(canvas, "canvas");
        ckf.h(charSequence, "text");
        ckf.h(paint, "paint");
        TextPaint a2 = a(paint);
        Paint.FontMetricsInt fontMetricsInt = a2.getFontMetricsInt();
        canvas.drawText(charSequence, i, i2, f, i4 - (((((fontMetricsInt.ascent + i4) + i4) + fontMetricsInt.descent) / 2) - ((i3 + i5) / 2)), a2);
    }
}
