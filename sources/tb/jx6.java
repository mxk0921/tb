package tb;

import android.animation.ValueAnimator;
import android.view.ViewGroup;
import com.alibaba.triver.triver_shop.shop2023.Default2023Shop;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class jx6 implements ValueAnimator.AnimatorUpdateListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Default2023Shop f22264a;

    public jx6(Default2023Shop default2023Shop) {
        this.f22264a = default2023Shop;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator});
            return;
        }
        ViewGroup h1 = Default2023Shop.h1(this.f22264a);
        if (h1 != null) {
            int height = Default2023Shop.A1(this.f22264a).getHeight();
            Object animatedValue = valueAnimator.getAnimatedValue();
            if (animatedValue != null) {
                kew.e(h1, height - ((Integer) animatedValue).intValue());
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
        }
        ckf.y("bigCardContainer");
        throw null;
    }
}
