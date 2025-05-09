package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.ad.impl.dx.view.flip.FlipLayout;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class s36 implements Runnable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ r36 f27776a;

    public s36(r36 r36Var) {
        this.f27776a = r36Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
        } else if (this.f27776a.getWRView() != null && (this.f27776a.getWRView().get() instanceof FlipLayout)) {
            v1.b("DXMMFoldPageViewWidgetNode", "onAppear start");
            ((FlipLayout) this.f27776a.getWRView().get()).start();
        }
    }
}
