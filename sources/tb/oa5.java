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
public class oa5 implements Runnable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ DWVideoViewController f25243a;

    public oa5(DWVideoViewController dWVideoViewController) {
        this.f25243a = dWVideoViewController;
    }

    @Override // java.lang.Runnable
    public void run() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
            return;
        }
        if (DWVideoViewController.v(this.f25243a).getParent() != DWVideoViewController.I(this.f25243a)) {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
            layoutParams.gravity = 17;
            DWVideoViewController.v(this.f25243a).requestLayout();
            if (DWVideoViewController.v(this.f25243a).getParent() != null && (DWVideoViewController.v(this.f25243a).getParent() instanceof ViewGroup)) {
                ((ViewGroup) DWVideoViewController.v(this.f25243a).getParent()).removeView(DWVideoViewController.v(this.f25243a));
                DWVideoViewController.I(this.f25243a).addView(DWVideoViewController.v(this.f25243a), layoutParams);
            }
            if (DWVideoViewController.Q(this.f25243a).getVideo().getVideoState() == 4) {
                DWVideoViewController.B(this.f25243a).h0(this.f25243a.getDuration(), false);
            }
            DWVideoViewController.v(this.f25243a).setTranslationX(DWVideoViewController.L(this.f25243a));
            DWVideoViewController.v(this.f25243a).setTranslationY(DWVideoViewController.N(this.f25243a));
            DWVideoViewController.v(this.f25243a).requestLayout();
            DWVideoViewController.C(this.f25243a, false);
        }
        DWVideoViewController dWVideoViewController = this.f25243a;
        DWVideoScreenType2 dWVideoScreenType2 = DWVideoScreenType2.NORMAL;
        DWVideoViewController.S(dWVideoViewController, dWVideoScreenType2);
        DWContext Q = DWVideoViewController.Q(this.f25243a);
        DWVideoScreenType dWVideoScreenType = DWVideoScreenType.NORMAL;
        Q.setVideoScreenType(dWVideoScreenType);
        DWVideoViewController.U(this.f25243a, dWVideoScreenType2);
        DWVideoViewController.B(this.f25243a).T(dWVideoScreenType);
        DWVideoViewController.v(this.f25243a).setLayerType(0, null);
    }
}
