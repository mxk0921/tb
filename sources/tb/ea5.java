package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.avplayer.DWContext;
import com.taobao.avplayer.DWVideoScreenType;
import com.taobao.avplayer.DWVideoScreenType2;
import com.taobao.avplayer.DWVideoViewController;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class ea5 implements Runnable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ DWVideoViewController f18403a;

    public ea5(DWVideoViewController dWVideoViewController) {
        this.f18403a = dWVideoViewController;
    }

    @Override // java.lang.Runnable
    public void run() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
            return;
        }
        DWVideoViewController.v(this.f18403a).requestLayout();
        DWVideoViewController.U(this.f18403a, DWVideoScreenType2.PORTRAIT_FULL_SCREEN);
        DWContext Q = DWVideoViewController.Q(this.f18403a);
        DWVideoScreenType dWVideoScreenType = DWVideoScreenType.PORTRAIT_FULL_SCREEN;
        Q.setVideoScreenType(dWVideoScreenType);
        DWVideoViewController.B(this.f18403a).T(dWVideoScreenType);
        DWVideoViewController.v(this.f18403a).setLayerType(0, null);
        DWVideoViewController.C(this.f18403a, false);
    }
}
