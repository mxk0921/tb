package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.subservice.biz.ISceneService;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class w51 implements kgb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final ISceneService f30467a;

    static {
        t2o.a(486539314);
        t2o.a(488636435);
    }

    public w51(cfc cfcVar, ISceneService iSceneService) {
        this.f30467a = iSceneService;
    }

    @Override // tb.mgb
    public void onAppToBackground() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("938dadf2", new Object[]{this});
        } else {
            this.f30467a.onAppToBackground();
        }
    }

    @Override // tb.mgb
    public void onAppToFront() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c0c238d3", new Object[]{this});
        } else {
            this.f30467a.onAppToFront();
        }
    }
}
