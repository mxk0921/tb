package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.subservice.framework.IMainFeedsViewService;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class k69 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final cfc f22430a;

    static {
        t2o.a(486539616);
    }

    public k69(cfc cfcVar) {
        this.f22430a = cfcVar;
    }

    public final void a(IMainFeedsViewService iMainFeedsViewService) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e7c41329", new Object[]{this, iMainFeedsViewService});
            return;
        }
        fve.f("ScrollToController", "scrollToTop to 0");
        iMainFeedsViewService.scrollToTop();
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a65a6ae", new Object[]{this});
            return;
        }
        IMainFeedsViewService iMainFeedsViewService = (IMainFeedsViewService) this.f22430a.a(IMainFeedsViewService.class);
        if (iMainFeedsViewService != null) {
            a(iMainFeedsViewService);
        }
    }
}
