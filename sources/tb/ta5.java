package tb;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.WindowManager;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.avplayer.DWVideoViewController;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class ta5 implements ValueAnimator.AnimatorUpdateListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ DWVideoViewController f28587a;

    public ta5(DWVideoViewController dWVideoViewController) {
        this.f28587a = dWVideoViewController;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator});
            return;
        }
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) DWVideoViewController.v(this.f28587a).getLayoutParams();
        layoutParams.width = (int) (DWVideoViewController.Q(this.f28587a).mWidth + (((DWVideoViewController.w(this.f28587a) - DWVideoViewController.Q(this.f28587a).mWidth) * floatValue) / 90.0f));
        layoutParams.height = (int) (DWVideoViewController.Q(this.f28587a).mHeight + (((DWVideoViewController.x(this.f28587a) - DWVideoViewController.Q(this.f28587a).mHeight) * floatValue) / 90.0f));
        DWVideoViewController.v(this.f28587a).requestLayout();
        if (floatValue > 20.0f && Build.VERSION.SDK_INT >= 28 && !DWVideoViewController.y(this.f28587a)) {
            WindowManager.LayoutParams attributes = DWVideoViewController.Q(this.f28587a).getActivity().getWindow().getAttributes();
            attributes.layoutInDisplayCutoutMode = 1;
            DWVideoViewController.Q(this.f28587a).getActivity().getWindow().setAttributes(attributes);
            DWVideoViewController.z(this.f28587a, true);
        }
    }
}
