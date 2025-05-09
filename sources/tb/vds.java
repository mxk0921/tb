package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.adapter.IUserTrackerAdapter;
import com.taobao.themis.kernel.solution.TMSSolutionType;
import tb.s4e;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class vds implements s4e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(839909589);
        t2o.a(839909578);
    }

    @Override // tb.t4c
    public void N(bbs bbsVar) {
        IUserTrackerAdapter iUserTrackerAdapter;
        IUserTrackerAdapter iUserTrackerAdapter2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dc73485", new Object[]{this, bbsVar});
            return;
        }
        ckf.g(bbsVar, "instance");
        s4e.a.a(this, bbsVar);
        if (!(bbsVar.a0() == TMSSolutionType.WEB_SINGLE_PAGE || (iUserTrackerAdapter2 = (IUserTrackerAdapter) p8s.b(IUserTrackerAdapter.class)) == null)) {
            iUserTrackerAdapter2.skipPage(bbsVar.I());
        }
        if (bbsVar.a0() == TMSSolutionType.UNIAPP && !bbsVar.c0().isFragmentContainer() && (iUserTrackerAdapter = (IUserTrackerAdapter) p8s.b(IUserTrackerAdapter.class)) != null) {
            iUserTrackerAdapter.pvWithRouterIndex(bbsVar.I());
        }
    }

    @Override // tb.t4c
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("896696a2", new Object[]{this});
        } else {
            s4e.a.b(this);
        }
    }
}
