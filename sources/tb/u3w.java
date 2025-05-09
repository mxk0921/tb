package tb;

import android.graphics.Paint;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class u3w extends CharacterStyle implements Cloneable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final int f29125a;
    public final int b;
    public final int c;

    static {
        t2o.a(444597248);
        t2o.a(444597246);
    }

    public u3w(int i, int i2) {
        this.f29125a = i;
        this.b = i2;
    }

    public static /* synthetic */ Object ipc$super(u3w u3wVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dinamicx/view/richtext/span/VerticalCenterSpan");
    }

    public int a(Paint paint) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("362fac76", new Object[]{this, paint})).intValue();
        }
        int i = this.b;
        int i2 = (((i - this.f29125a) / 2) - i) + this.c;
        Paint.FontMetrics fontMetrics = paint.getFontMetrics();
        return (int) ((((fontMetrics.descent - fontMetrics.ascent) / 2.0f) - fontMetrics.bottom) - i2);
    }

    public Object clone() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("78b3604e", new Object[]{this});
        }
        return new u3w(this.f29125a, this.b);
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c21f6b6b", new Object[]{this, textPaint});
        } else {
            textPaint.baselineShift = a(textPaint);
        }
    }

    public u3w(int i, int i2, int i3) {
        this.f29125a = i;
        this.b = i2;
        this.c = i3;
    }
}
