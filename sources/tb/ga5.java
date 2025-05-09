package tb;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.WindowManager;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.avplayer.DWVideoViewController;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class ga5 implements ValueAnimator.AnimatorUpdateListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ DWVideoViewController f19829a;

    public ga5(DWVideoViewController dWVideoViewController) {
        this.f19829a = dWVideoViewController;
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
        layoutParams.width = (int) (DWVideoViewController.Q(this.f19829a).mWidth + (((DWVideoViewController.w(this.f19829a) - DWVideoViewController.Q(this.f19829a).mWidth) * abs) / 90.0f));
        layoutParams.height = (int) (DWVideoViewController.Q(this.f19829a).mHeight + (((DWVideoViewController.x(this.f19829a) - DWVideoViewController.Q(this.f19829a).mHeight) * abs) / 90.0f));
        layoutParams.topMargin = DWVideoViewController.G(this.f19829a)[1];
        layoutParams.leftMargin = DWVideoViewController.G(this.f19829a)[0];
        DWVideoViewController.v(this.f19829a).setLayoutParams(layoutParams);
        if (abs > 20.0f && Build.VERSION.SDK_INT >= 28 && !DWVideoViewController.y(this.f19829a)) {
            WindowManager.LayoutParams attributes = DWVideoViewController.Q(this.f19829a).getActivity().getWindow().getAttributes();
            attributes.layoutInDisplayCutoutMode = 1;
            DWVideoViewController.Q(this.f19829a).getActivity().getWindow().setAttributes(attributes);
            DWVideoViewController.z(this.f19829a, true);
        }
    }
}
