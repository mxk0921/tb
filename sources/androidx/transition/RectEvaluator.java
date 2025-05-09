package androidx.transition;

import android.animation.TypeEvaluator;
import android.graphics.Rect;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class RectEvaluator implements TypeEvaluator<Rect> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private Rect mRect;

    public RectEvaluator() {
    }

    public RectEvaluator(Rect rect) {
        this.mRect = rect;
    }

    public Rect evaluate(float f, Rect rect, Rect rect2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Rect) ipChange.ipc$dispatch("5aa8fc49", new Object[]{this, new Float(f), rect, rect2});
        }
        int i = rect.left;
        int i2 = i + ((int) ((rect2.left - i) * f));
        int i3 = rect.top;
        int i4 = i3 + ((int) ((rect2.top - i3) * f));
        int i5 = rect.right;
        int i6 = i5 + ((int) ((rect2.right - i5) * f));
        int i7 = rect.bottom;
        int i8 = i7 + ((int) ((rect2.bottom - i7) * f));
        Rect rect3 = this.mRect;
        if (rect3 == null) {
            return new Rect(i2, i4, i6, i8);
        }
        rect3.set(i2, i4, i6, i8);
        return this.mRect;
    }
}
