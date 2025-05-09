package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.avplayer.DWVideoViewController;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class ha5 implements Runnable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ DWVideoViewController f20497a;

    public ha5(DWVideoViewController dWVideoViewController) {
        this.f20497a = dWVideoViewController;
    }

    @Override // java.lang.Runnable
    public void run() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
            return;
        }
        DWVideoViewController.p(this.f20497a);
        DWVideoViewController.B(this.f20497a).q0(DWVideoViewController.q(this.f20497a) * ((DWVideoViewController.e(this.f20497a) * 0.2f) + 0.2f));
        if (DWVideoViewController.e(this.f20497a) < 4) {
            DWVideoViewController.P(this.f20497a).postDelayed(DWVideoViewController.M(this.f20497a), 500L);
        }
    }
}
