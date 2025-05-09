package tb;

import android.graphics.Paint;
import android.graphics.Rect;
import android.text.TextPaint;
import android.text.style.LineHeightSpan;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class jva implements LineHeightSpan.WithDensity {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static float b = 0.0f;

    /* renamed from: a  reason: collision with root package name */
    public final int f22239a;

    static {
        t2o.a(503317357);
    }

    public jva(int i) {
        this.f22239a = i;
    }

    @Override // android.text.style.LineHeightSpan
    public void chooseHeight(CharSequence charSequence, int i, int i2, int i3, int i4, Paint.FontMetricsInt fontMetricsInt) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("646418b3", new Object[]{this, charSequence, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), fontMetricsInt});
        } else {
            chooseHeight(charSequence, i, i2, i3, i4, fontMetricsInt, null);
        }
    }

    @Override // android.text.style.LineHeightSpan.WithDensity
    public void chooseHeight(CharSequence charSequence, int i, int i2, int i3, int i4, Paint.FontMetricsInt fontMetricsInt, TextPaint textPaint) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ab9aeb3", new Object[]{this, charSequence, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), fontMetricsInt, textPaint});
            return;
        }
        int i5 = this.f22239a;
        if (textPaint != null) {
            i5 = (int) (i5 * textPaint.density);
        }
        int i6 = fontMetricsInt.bottom;
        if (i6 - fontMetricsInt.top < i5) {
            fontMetricsInt.top = i6 - i5;
            fontMetricsInt.ascent = fontMetricsInt.descent - i5;
            return;
        }
        if (b == 0.0f) {
            Paint paint = new Paint();
            paint.setTextSize(100.0f);
            Rect rect = new Rect();
            paint.getTextBounds("ABCDEFG", 0, 7, rect);
            b = rect.top / paint.ascent();
        }
        int ceil = (int) Math.ceil((-fontMetricsInt.top) * b);
        int i7 = fontMetricsInt.descent;
        if (i5 - i7 >= ceil) {
            fontMetricsInt.top = fontMetricsInt.bottom - i5;
            fontMetricsInt.ascent = i7 - i5;
        } else if (i5 >= ceil) {
            int i8 = -ceil;
            fontMetricsInt.ascent = i8;
            fontMetricsInt.top = i8;
            int i9 = i8 + i5;
            fontMetricsInt.descent = i9;
            fontMetricsInt.bottom = i9;
        } else {
            int i10 = -i5;
            fontMetricsInt.ascent = i10;
            fontMetricsInt.top = i10;
            fontMetricsInt.descent = 0;
            fontMetricsInt.bottom = 0;
        }
    }
}
