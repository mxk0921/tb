package tb;

import android.animation.ValueAnimator;
import com.android.alibaba.ip.runtime.IpChange;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import com.taobao.uikit.extend.feature.view.TUrlImageView;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class vmf implements ValueAnimator.AnimatorUpdateListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ umf f30103a;

    public vmf(umf umfVar) {
        this.f30103a = umfVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator});
            return;
        }
        ckf.g(valueAnimator, AdvanceSetting.NETWORK_TYPE);
        Object animatedValue = valueAnimator.getAnimatedValue();
        if (animatedValue != null) {
            Float f = (Float) animatedValue;
            float floatValue = f.floatValue();
            agh.h(umf.TAG, ckf.p("onAnimationUpdate: ", f));
            TUrlImageView k0 = umf.k0(this.f30103a);
            if (k0 != null) {
                k0.setTranslationY(floatValue);
            } else {
                ckf.y("mScanLine");
                throw null;
            }
        } else {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Float");
        }
    }
}
