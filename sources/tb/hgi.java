package tb;

import android.animation.ValueAnimator;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class hgi implements ValueAnimator.AnimatorUpdateListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ yfi f20626a;

    public hgi(yfi yfiVar) {
        this.f20626a = yfiVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator});
            return;
        }
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) yfi.C(this.f20626a).getLayoutParams();
        layoutParams.width = (int) (yfi.m(this.f20626a) + (((yfi.n(this.f20626a) - yfi.m(this.f20626a)) * floatValue) / 90.0f));
        layoutParams.height = (int) (yfi.y(this.f20626a) + (((yfi.B(this.f20626a) - yfi.y(this.f20626a)) * floatValue) / 90.0f));
        yfi.C(this.f20626a).requestLayout();
    }
}
