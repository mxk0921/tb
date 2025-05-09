package tb;

import android.graphics.Paint;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class v3w extends CharacterStyle implements Cloneable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(444597249);
        t2o.a(444597246);
    }

    public static /* synthetic */ Object ipc$super(v3w v3wVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dinamicx/view/richtext/span/VerticalDescentSpan");
    }

    public int a(Paint paint) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("362fac76", new Object[]{this, paint})).intValue();
        }
        Paint.FontMetricsInt fontMetricsInt = paint.getFontMetricsInt();
        return fontMetricsInt.descent - fontMetricsInt.bottom;
    }

    public Object clone() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("78b3604e", new Object[]{this});
        }
        return new v3w();
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
}
