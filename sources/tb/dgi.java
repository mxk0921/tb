package tb;

import android.animation.ValueAnimator;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class dgi implements ValueAnimator.AnimatorUpdateListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ yfi f17796a;

    public dgi(yfi yfiVar) {
        this.f17796a = yfiVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator});
            return;
        }
        float abs = Math.abs(((Float) valueAnimator.getAnimatedValue()).floatValue());
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.width = (int) (yfi.m(this.f17796a) + (((yfi.n(this.f17796a) - yfi.m(this.f17796a)) * abs) / 90.0f));
        layoutParams.height = (int) (yfi.y(this.f17796a) + (((yfi.B(this.f17796a) - yfi.y(this.f17796a)) * abs) / 90.0f));
        layoutParams.gravity = 17;
        yfi.C(this.f17796a).setLayoutParams(layoutParams);
    }
}
