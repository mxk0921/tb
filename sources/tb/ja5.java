package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.avplayer.DWContext;
import com.taobao.avplayer.DWVideoScreenType;
import com.taobao.avplayer.DWVideoScreenType2;
import com.taobao.avplayer.DWVideoViewController;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class ja5 implements Runnable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ boolean f21862a;
    public final /* synthetic */ DWVideoViewController b;

    public ja5(DWVideoViewController dWVideoViewController, boolean z) {
        this.b = dWVideoViewController;
        this.f21862a = z;
    }

    @Override // java.lang.Runnable
    public void run() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
            return;
        }
        DWVideoViewController.v(this.b).requestLayout();
        DWContext Q = DWVideoViewController.Q(this.b);
        DWVideoScreenType dWVideoScreenType = DWVideoScreenType.LANDSCAPE_FULL_SCREEN;
        Q.setVideoScreenType(dWVideoScreenType);
        if (this.f21862a) {
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
