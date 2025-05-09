package tb;

import android.animation.ValueAnimator;
import com.alibaba.triver.triver_shop.shop2023.FarmShop;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class s09 implements ValueAnimator.AnimatorUpdateListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ FarmShop f27711a;
    public final /* synthetic */ int b;

    public s09(FarmShop farmShop, int i) {
        this.f27711a = farmShop;
        this.b = i;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator});
            return;
        }
        FarmShop farmShop = this.f27711a;
        float f = this.b;
        Object animatedValue = valueAnimator.getAnimatedValue();
        if (animatedValue != null) {
            FarmShop.d1(farmShop, f - ((Float) animatedValue).floatValue());
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Float");
    }
}
