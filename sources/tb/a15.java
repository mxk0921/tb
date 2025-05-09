package tb;

import android.graphics.Paint;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class a15 extends MetricAffectingSpan {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final float f15474a;

    static {
        t2o.a(486539438);
    }

    public a15(float f) {
        this.f15474a = f;
    }

    public static /* synthetic */ Object ipc$super(a15 a15Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/infoflow/core/subservice/base/item/dxservice/impl/dinamic3/view/span/CustomLetterSpacingSpan");
    }

    public final void a(Paint paint) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd95da0a", new Object[]{this, paint});
        } else {
            paint.setLetterSpacing(this.f15474a);
        }
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c21f6b6b", new Object[]{this, textPaint});
        } else {
            a(textPaint);
        }
    }

    @Override // android.text.style.MetricAffectingSpan
    public void updateMeasureState(TextPaint textPaint) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("77906dc3", new Object[]{this, textPaint});
        } else {
            a(textPaint);
        }
    }
}
