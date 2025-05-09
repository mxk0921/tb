package tb;

import android.animation.ValueAnimator;
import com.alibaba.triver.triver_shop.shop2023.FarmShop;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class t09 implements ValueAnimator.AnimatorUpdateListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f28386a;
    public final /* synthetic */ FarmShop b;

    public t09(int i, FarmShop farmShop) {
        this.f28386a = i;
        this.b = farmShop;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        inp n1;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator});
            return;
        }
        float f = this.f28386a;
        Object animatedValue = valueAnimator.getAnimatedValue();
        if (animatedValue != null) {
            float floatValue = f - ((Float) animatedValue).floatValue();
            if (!FarmShop.w1(this.b) && (n1 = FarmShop.n1(this.b)) != null) {
                n1.G((int) floatValue);
            }
            FarmShop.d1(this.b, floatValue);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Float");
    }
}
