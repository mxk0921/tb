package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.ad.impl.dx.view.CubeLayout;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class q36 implements Runnable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ p36 f26479a;

    public q36(p36 p36Var) {
        this.f26479a = p36Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
        } else if (this.f26479a.getWRView() != null && (this.f26479a.getWRView().get() instanceof CubeLayout)) {
            v1.b("DXMMCubePageViewWidgetNode", "onAppear startTick");
            ((CubeLayout) this.f26479a.getWRView().get()).startTick();
        }
    }
}
