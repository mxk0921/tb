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
public class ka5 implements Runnable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ DWVideoViewController f22509a;

    public ka5(DWVideoViewController dWVideoViewController) {
        this.f22509a = dWVideoViewController;
    }

    @Override // java.lang.Runnable
    public void run() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
        } else if (DWVideoViewController.v(this.f22509a).getParent() != DWVideoViewController.I(this.f22509a)) {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
            layoutParams.gravity = 17;
            DWVideoViewController.v(this.f22509a).requestLayout();
            DWVideoViewController.v(this.f22509a).setTranslationX(0.0f);
            DWVideoViewController.v(this.f22509a).setTranslationY(0.0f);
            if (DWVideoViewController.v(this.f22509a).getParent() != null && (DWVideoViewController.v(this.f22509a).getParent() instanceof ViewGroup)) {
                ((ViewGroup) DWVideoViewController.v(this.f22509a).getParent()).removeView(DWVideoViewController.v(this.f22509a));
                DWVideoViewController.I(this.f22509a).addView(DWVideoViewController.v(this.f22509a), layoutParams);
            }
            if (DWVideoViewController.Q(this.f22509a).getVideo().getVideoState() == 4) {
                DWVideoViewController.B(this.f22509a).h0(this.f22509a.getDuration(), false);
            }
            DWVideoViewController dWVideoViewController = this.f22509a;
            DWVideoScreenType2 dWVideoScreenType2 = DWVideoScreenType2.NORMAL;
            DWVideoViewController.S(dWVideoViewController, dWVideoScreenType2);
            DWContext Q = DWVideoViewController.Q(this.f22509a);
            DWVideoScreenType dWVideoScreenType = DWVideoScreenType.NORMAL;
            Q.setVideoScreenType(dWVideoScreenType);
            DWVideoViewController.U(this.f22509a, dWVideoScreenType2);
            DWVideoViewController.B(this.f22509a).T(dWVideoScreenType);
            if (DWVideoViewController.Q(this.f22509a) != null && !DWVideoViewController.Q(this.f22509a).mHookKeyBackToggleEvent) {
                DWVideoViewController.Q(this.f22509a).unregisterKeyBackEventListener(this.f22509a);
            }
            DWVideoViewController.v(this.f22509a).setLayerType(0, null);
            DWVideoViewController.C(this.f22509a, false);
        }
    }
}
