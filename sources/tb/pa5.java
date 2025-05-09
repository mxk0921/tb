package tb;

import android.animation.ValueAnimator;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.avplayer.DWVideoViewController;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class pa5 implements ValueAnimator.AnimatorUpdateListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ DWVideoViewController f25974a;

    public pa5(DWVideoViewController dWVideoViewController) {
        this.f25974a = dWVideoViewController;
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
        layoutParams.width = (int) (DWVideoViewController.Q(this.f25974a).mWidth + (((DWVideoViewController.w(this.f25974a) - DWVideoViewController.Q(this.f25974a).mWidth) * abs) / 90.0f));
        layoutParams.height = (int) (DWVideoViewController.Q(this.f25974a).mHeight + (((DWVideoViewController.x(this.f25974a) - DWVideoViewController.Q(this.f25974a).mHeight) * abs) / 90.0f));
        layoutParams.gravity = 17;
        DWVideoViewController.v(this.f25974a).setLayoutParams(layoutParams);
    }
}
