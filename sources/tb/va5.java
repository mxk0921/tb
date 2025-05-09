package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.avplayer.DWContext;
import com.taobao.avplayer.DWVideoScreenType;
import com.taobao.avplayer.DWVideoScreenType2;
import com.taobao.avplayer.DWVideoViewController;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class va5 implements Runnable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ DWVideoViewController f29886a;

    public va5(DWVideoViewController dWVideoViewController) {
        this.f29886a = dWVideoViewController;
    }

    @Override // java.lang.Runnable
    public void run() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
            return;
        }
        DWVideoViewController.v(this.f29886a).requestLayout();
        DWContext Q = DWVideoViewController.Q(this.f29886a);
        DWVideoScreenType dWVideoScreenType = DWVideoScreenType.PORTRAIT_FULL_SCREEN;
        Q.setVideoScreenType(dWVideoScreenType);
        DWVideoViewController.B(this.f29886a).T(dWVideoScreenType);
        DWVideoViewController dWVideoViewController = this.f29886a;
        DWVideoScreenType2 dWVideoScreenType2 = DWVideoScreenType2.PORTRAIT_FULL_SCREEN;
        DWVideoViewController.U(dWVideoViewController, dWVideoScreenType2);
        DWVideoViewController.S(this.f29886a, dWVideoScreenType2);
        if (DWVideoViewController.Q(this.f29886a) != null && !DWVideoViewController.Q(this.f29886a).mHookKeyBackToggleEvent) {
            DWVideoViewController.Q(this.f29886a).registerKeyBackEventListener(this.f29886a);
        }
        DWVideoViewController.v(this.f29886a).setLayerType(0, null);
        DWVideoViewController.C(this.f29886a, false);
    }
}
