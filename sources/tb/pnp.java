package tb;

import android.animation.ValueAnimator;
import com.alibaba.triver.triver_shop.shop2023.nativeview.Shop2023TopNavBarNativeComponent;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class pnp implements ValueAnimator.AnimatorUpdateListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f26204a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Shop2023TopNavBarNativeComponent c;
    public final /* synthetic */ ValueAnimator d;

    public pnp(int i, int i2, Shop2023TopNavBarNativeComponent shop2023TopNavBarNativeComponent, ValueAnimator valueAnimator) {
        this.f26204a = i;
        this.b = i2;
        this.c = shop2023TopNavBarNativeComponent;
        this.d = valueAnimator;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i = 1;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator});
            return;
        }
        if (this.f26204a - this.b <= 0) {
            i = -1;
        }
        Shop2023TopNavBarNativeComponent shop2023TopNavBarNativeComponent = this.c;
        float f = i;
        Object animatedValue = this.d.getAnimatedValue();
        if (animatedValue != null) {
            float floatValue = f * ((Float) animatedValue).floatValue();
            int i2 = this.b;
            Shop2023TopNavBarNativeComponent.b(shop2023TopNavBarNativeComponent, floatValue, i2, Math.abs(this.f26204a - i2));
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Float");
    }
}
