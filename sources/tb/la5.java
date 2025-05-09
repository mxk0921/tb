package tb;

import android.os.Build;
import android.view.WindowManager;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.avplayer.DWContext;
import com.taobao.avplayer.DWVideoScreenType;
import com.taobao.avplayer.DWVideoScreenType2;
import com.taobao.avplayer.DWVideoViewController;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class la5 implements Runnable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ boolean f23205a;
    public final /* synthetic */ DWVideoViewController b;

    public la5(DWVideoViewController dWVideoViewController, boolean z) {
        this.b = dWVideoViewController;
        this.f23205a = z;
    }

    @Override // java.lang.Runnable
    public void run() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
            return;
        }
        if (Build.VERSION.SDK_INT >= 28) {
            WindowManager.LayoutParams attributes = DWVideoViewController.Q(this.b).getActivity().getWindow().getAttributes();
            attributes.layoutInDisplayCutoutMode = 1;
            DWVideoViewController.Q(this.b).getActivity().getWindow().setAttributes(attributes);
        }
        DWVideoViewController.v(this.b).setLayerType(2, null);
        if (DWVideoViewController.v(this.b).getParent() == DWVideoViewController.I(this.b)) {
            DWVideoViewController.I(this.b).removeView(DWVideoViewController.v(this.b));
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) DWVideoViewController.v(this.b).getLayoutParams();
            layoutParams.gravity = 17;
            layoutParams.width = -1;
            layoutParams.height = -1;
            DWVideoViewController.J(this.b).addView(DWVideoViewController.v(this.b), layoutParams);
            DWVideoViewController.v(this.b).requestLayout();
            if (DWVideoViewController.Q(this.b).getVideo().getVideoState() == 4) {
                DWVideoViewController.B(this.b).h0(this.b.getDuration(), false);
            }
        }
        DWContext Q = DWVideoViewController.Q(this.b);
        DWVideoScreenType dWVideoScreenType = DWVideoScreenType.LANDSCAPE_FULL_SCREEN;
        Q.setVideoScreenType(dWVideoScreenType);
        if (this.f23205a) {
            DWVideoViewController.U(this.b, DWVideoScreenType2.LANDSCAPE_FULL_SCREEN_270);
        } else {
            DWVideoViewController.U(this.b, DWVideoScreenType2.LANDSCAPE_FULL_SCREEN_90);
        }
        DWVideoViewController.B(this.b).T(dWVideoScreenType);
        if (DWVideoViewController.Q(this.b) != null && !DWVideoViewController.Q(this.b).mHookKeyBackToggleEvent) {
            DWVideoViewController.Q(this.b).registerKeyBackEventListener(this.b);
        }
        DWVideoViewController.v(this.b).setLayerType(0, null);
        DWVideoViewController.C(this.b, false);
    }
}
