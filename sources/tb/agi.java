package tb;

import android.animation.ValueAnimator;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class agi implements ValueAnimator.AnimatorUpdateListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ yfi f15726a;

    public agi(yfi yfiVar) {
        this.f15726a = yfiVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator});
            return;
        }
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.width = (int) (yfi.m(this.f15726a) + (((yfi.n(this.f15726a) - yfi.m(this.f15726a)) * floatValue) / 90.0f));
        layoutParams.height = (int) (yfi.y(this.f15726a) + (((yfi.B(this.f15726a) - yfi.y(this.f15726a)) * floatValue) / 90.0f));
        yfi.C(this.f15726a).setLayoutParams(layoutParams);
    }
}
