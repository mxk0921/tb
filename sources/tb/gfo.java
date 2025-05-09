package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.subservice.biz.IRocketSubService;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class gfo implements vkd {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final cfc f19954a;

    static {
        t2o.a(486539591);
        t2o.a(488636451);
    }

    public gfo(cfc cfcVar) {
        this.f19954a = cfcVar;
    }

    @Override // tb.vkd
    public boolean isOnRocketState() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f6f1c3f", new Object[]{this})).booleanValue();
        }
        IRocketSubService iRocketSubService = (IRocketSubService) this.f19954a.a(IRocketSubService.class);
        if (iRocketSubService == null) {
            return false;
        }
        return iRocketSubService.isOnRocketState();
    }

    @Override // tb.vkd
    public void onClickRocket() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41ace924", new Object[]{this});
            return;
        }
        IRocketSubService iRocketSubService = (IRocketSubService) this.f19954a.a(IRocketSubService.class);
        if (iRocketSubService != null) {
            iRocketSubService.onClickRocket();
        }
    }
}
