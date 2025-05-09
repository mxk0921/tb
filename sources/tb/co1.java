package tb;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.style.ImageSpan;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class co1 extends ImageSpan {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Context f17192a;
    public final String b;

    static {
        t2o.a(295698582);
    }

    public co1(Context context, Drawable drawable, String str) {
        super(drawable);
        this.f17192a = context;
        this.b = str;
    }

    public static /* synthetic */ Object ipc$super(co1 co1Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/atype/flexalocal/comments/chat/view/BackgroundImageSpan");
    }

    @Override // android.text.style.DynamicDrawableSpan, android.text.style.ReplacementSpan
    public void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        float f2;
        int b;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e5acc076", new Object[]{this, canvas, charSequence, new Integer(i), new Integer(i2), new Float(f), new Integer(i3), new Integer(i4), new Integer(i5), paint});
            return;
        }
        Paint.FontMetricsInt fontMetricsInt = paint.getFontMetricsInt();
        Drawable drawable = getDrawable();
        canvas.save();
        canvas.translate(f, i4 + (((fontMetricsInt.descent + fontMetricsInt.ascent) - drawable.getBounds().bottom) / 2));
        drawable.draw(canvas);
        canvas.restore();
        paint.setTextSize(hw0.b(this.f17192a, 10.0f));
        float b2 = hw0.b(this.f17192a, 18.0f) + f;
        if (this.b.length() == 1) {
            b = hw0.b(this.f17192a, 26.0f);
        } else if (this.b.length() == 2) {
            b = hw0.b(this.f17192a, 22.0f);
        } else {
            f2 = b2;
            canvas.drawText(charSequence, i, i2, f2, i4 - hw0.b(this.f17192a, 1.0f), paint);
        }
        f2 = f + b;
        canvas.drawText(charSequence, i, i2, f2, i4 - hw0.b(this.f17192a, 1.0f), paint);
    }

    @Override // android.text.style.DynamicDrawableSpan, android.text.style.ReplacementSpan
    public int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("46263898", new Object[]{this, paint, charSequence, new Integer(i), new Integer(i2), fontMetricsInt})).intValue();
        }
        Rect bounds = getDrawable().getBounds();
        if (fontMetricsInt != null) {
            Paint.FontMetricsInt fontMetricsInt2 = paint.getFontMetricsInt();
            int i3 = fontMetricsInt2.bottom - fontMetricsInt2.top;
            int i4 = (bounds.bottom - bounds.top) / 2;
            int i5 = i3 / 4;
            int i6 = i4 - i5;
            int i7 = -(i4 + i5);
            fontMetricsInt.ascent = i7;
            fontMetricsInt.top = i7;
            fontMetricsInt.bottom = i6;
            fontMetricsInt.descent = i6;
        }
        return bounds.right;
    }
}
