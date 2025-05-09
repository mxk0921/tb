package tb;

import android.animation.ValueAnimator;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.avplayer.DWVideoViewController;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class ma5 implements ValueAnimator.AnimatorUpdateListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ DWVideoViewController f23884a;

    public ma5(DWVideoViewController dWVideoViewController) {
        this.f23884a = dWVideoViewController;
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
        layoutParams.width = (int) (DWVideoViewController.Q(this.f23884a).mWidth + (((DWVideoViewController.w(this.f23884a) - DWVideoViewController.Q(this.f23884a).mWidth) * floatValue) / 90.0f));
        layoutParams.height = (int) (DWVideoViewController.Q(this.f23884a).mHeight + (((DWVideoViewController.x(this.f23884a) - DWVideoViewController.Q(this.f23884a).mHeight) * floatValue) / 90.0f));
        DWVideoViewController.v(this.f23884a).setLayoutParams(layoutParams);
    }
}
