package tb;

import android.os.SystemClock;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.subservice.biz.IPullRefreshService;
import com.taobao.infoflow.protocol.subservice.biz.IPullSecondFloorService;
import com.taobao.infoflow.protocol.subservice.framework.IContainerDataService;
import com.taobao.infoflow.protocol.subservice.framework.IMainFeedsViewService;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class y4n implements hed {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final cfc f31849a;

    static {
        t2o.a(486539590);
        t2o.a(488636449);
    }

    public y4n(cfc cfcVar) {
        this.f31849a = cfcVar;
    }

    public final void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8e730ad9", new Object[]{this});
            return;
        }
        IPullRefreshService iPullRefreshService = (IPullRefreshService) this.f31849a.a(IPullRefreshService.class);
        if (iPullRefreshService != null) {
            iPullRefreshService.onRefresh();
        }
    }

    @Override // tb.hed
    public boolean isEnablePullReFresh() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b20c9b34", new Object[]{this})).booleanValue();
        }
        IMainFeedsViewService iMainFeedsViewService = (IMainFeedsViewService) this.f31849a.a(IMainFeedsViewService.class);
        if (iMainFeedsViewService == null) {
            return true;
        }
        return iMainFeedsViewService.isReachTopEdge();
    }

    @Override // tb.hed
    public boolean isEnableToSecondFloor() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8c45f0bb", new Object[]{this})).booleanValue();
        }
        return false;
    }

    @Override // tb.hed
    public void onEnterPullSecondFloor() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("11729e81", new Object[]{this});
            return;
        }
        IPullSecondFloorService iPullSecondFloorService = (IPullSecondFloorService) this.f31849a.a(IPullSecondFloorService.class);
        if (iPullSecondFloorService != null) {
            iPullSecondFloorService.onEnterPullSecondFloor();
        }
    }

    @Override // tb.hed
    public void onExitPullSecondFloor() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e74a49d", new Object[]{this});
            return;
        }
        IPullSecondFloorService iPullSecondFloorService = (IPullSecondFloorService) this.f31849a.a(IPullSecondFloorService.class);
        if (iPullSecondFloorService != null) {
            iPullSecondFloorService.onExitPullSecondFloor();
        }
    }

    @Override // tb.hed
    public void onPullDistance(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2dcc8a23", new Object[]{this, new Integer(i)});
            return;
        }
        IPullRefreshService iPullRefreshService = (IPullRefreshService) this.f31849a.a(IPullRefreshService.class);
        if (iPullRefreshService != null) {
            iPullRefreshService.onPullDistance(i);
        }
    }

    @Override // tb.hed
    public void onPullRefresh() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24224e7e", new Object[]{this});
            return;
        }
        IContainerDataService iContainerDataService = (IContainerDataService) this.f31849a.a(IContainerDataService.class);
        if (iContainerDataService == null) {
            fve.e("PullDownRefreshInvokerImpl", "onPullRefresh dataService == null");
            return;
        }
        iContainerDataService.triggerEvent("PullToRefresh", null, new sve("PullToRefresh" + SystemClock.uptimeMillis()));
        a();
        uve.a(this.f31849a.getContainerType().a(), 2101, "Page_Home_Button-Refresh-down", "", "", null);
    }

    @Override // tb.hed
    public void onRefreshStateChanged(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("645061a", new Object[]{this, str, str2});
            return;
        }
        IPullRefreshService iPullRefreshService = (IPullRefreshService) this.f31849a.a(IPullRefreshService.class);
        if (iPullRefreshService != null) {
            iPullRefreshService.onRefreshStateChanged(str, str2);
        }
    }
}
