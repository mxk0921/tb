package tb;

import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.avplayer.DWContext;
import com.taobao.avplayer.DWVideoScreenType;
import com.taobao.avplayer.DWVideoScreenType2;
import com.taobao.avplayer.DWVideoViewController;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class ra5 implements Runnable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ DWVideoViewController f27225a;

    public ra5(DWVideoViewController dWVideoViewController) {
        this.f27225a = dWVideoViewController;
    }

    @Override // java.lang.Runnable
    public void run() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
            return;
        }
        if (DWVideoViewController.v(this.f27225a).getParent() != DWVideoViewController.I(this.f27225a)) {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
            layoutParams.gravity = 17;
            DWVideoViewController.v(this.f27225a).requestLayout();
            if (DWVideoViewController.v(this.f27225a).getParent() != null && (DWVideoViewController.v(this.f27225a).getParent() instanceof ViewGroup)) {
                ((ViewGroup) DWVideoViewController.v(this.f27225a).getParent()).removeView(DWVideoViewController.v(this.f27225a));
                DWVideoViewController.I(this.f27225a).addView(DWVideoViewController.v(this.f27225a), layoutParams);
            }
            if (DWVideoViewController.Q(this.f27225a).getVideo().getVideoState() == 4) {
                DWVideoViewController.B(this.f27225a).h0(this.f27225a.getDuration(), false);
            }
            DWVideoViewController.v(this.f27225a).setTranslationX(DWVideoViewController.L(this.f27225a));
            DWVideoViewController.v(this.f27225a).setTranslationY(DWVideoViewController.N(this.f27225a));
            DWVideoViewController.v(this.f27225a).requestLayout();
            DWVideoViewController.C(this.f27225a, false);
        }
        DWVideoViewController dWVideoViewController = this.f27225a;
        DWVideoScreenType2 dWVideoScreenType2 = DWVideoScreenType2.NORMAL;
        DWVideoViewController.S(dWVideoViewController, dWVideoScreenType2);
        DWContext Q = DWVideoViewController.Q(this.f27225a);
        DWVideoScreenType dWVideoScreenType = DWVideoScreenType.NORMAL;
        Q.setVideoScreenType(dWVideoScreenType);
        DWVideoViewController.U(this.f27225a, dWVideoScreenType2);
        DWVideoViewController.B(this.f27225a).T(dWVideoScreenType);
        DWVideoViewController.v(this.f27225a).setLayerType(0, null);
    }
}
