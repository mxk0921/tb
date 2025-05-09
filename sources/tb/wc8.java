package tb;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class wc8 extends ReplacementSpan {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final int f30610a;

    static {
        t2o.a(444597245);
    }

    public wc8(int i) {
        this.f30610a = i;
    }

    public static /* synthetic */ Object ipc$super(wc8 wc8Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dinamicx/view/richtext/span/EmptyPlaceSpan");
    }

    @Override // android.text.style.ReplacementSpan
    public void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e5acc076", new Object[]{this, canvas, charSequence, new Integer(i), new Integer(i2), new Float(f), new Integer(i3), new Integer(i4), new Integer(i5), paint});
        }
    }

    @Override // android.text.style.ReplacementSpan
    public int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("46263898", new Object[]{this, paint, charSequence, new Integer(i), new Integer(i2), fontMetricsInt})).intValue();
        }
        return this.f30610a;
    }
}
