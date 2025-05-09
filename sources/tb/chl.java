package tb;

import android.animation.ValueAnimator;
import com.alibaba.triver.triver_shop.newShop.view.component.OverseaShop;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class chl implements ValueAnimator.AnimatorUpdateListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f17062a;
    public final /* synthetic */ OverseaShop b;

    public chl(int i, OverseaShop overseaShop) {
        this.f17062a = i;
        this.b = overseaShop;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator});
            return;
        }
        Object animatedValue = valueAnimator.getAnimatedValue();
        if (animatedValue != null) {
            float floatValue = ((Float) animatedValue).floatValue();
            if (this.f17062a > 0) {
                OverseaShop.b1(this.b).d(-((int) floatValue));
            } else {
                OverseaShop.b1(this.b).d(this.f17062a - ((int) floatValue));
            }
            OverseaShop.b1(this.b).b();
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Float");
    }
}
