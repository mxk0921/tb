package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.topmultitab.service.bgcontainer.IBGContainerService;
import com.taobao.tao.topmultitab.service.searchbar.IHomeSearchBarService;
import com.taobao.uikit.extend.component.refresh.TBRefreshHeader;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class qnq implements qsd {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final joq f26840a;
    public final wcc b;

    static {
        t2o.a(729810307);
        t2o.a(729810301);
    }

    public qnq(joq joqVar, wcc wccVar) {
        this.f26840a = joqVar;
        this.b = wccVar;
    }

    @Override // tb.qsd
    public void a(h7p h7pVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6028753c", new Object[]{this, h7pVar});
            return;
        }
        d();
        this.f26840a.l();
        c();
        bqa.d("StopPullStatusProcessor", "回到静止状态");
    }

    @Override // tb.qsd
    public boolean b(TBRefreshHeader.RefreshState refreshState, TBRefreshHeader.RefreshState refreshState2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e8a10f5b", new Object[]{this, refreshState, refreshState2})).booleanValue();
        }
        if (refreshState2 == TBRefreshHeader.RefreshState.NONE) {
            return true;
        }
        return false;
    }

    public final void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f0da508", new Object[]{this});
            return;
        }
        wcc wccVar = this.b;
        if (wccVar == null) {
            bqa.d("StopPullStatusProcessor", "mHomePageContext == null");
            return;
        }
        IHomeSearchBarService iHomeSearchBarService = (IHomeSearchBarService) wccVar.a(IHomeSearchBarService.class);
        if (iHomeSearchBarService == null) {
            bqa.d("StopPullStatusProcessor", "service == null");
        } else {
            iHomeSearchBarService.setSearchBarAlpha(1.0f);
        }
    }

    public final void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("872153a6", new Object[]{this});
            return;
        }
        wcc wccVar = this.b;
        if (wccVar == null) {
            bqa.d("StopPullStatusProcessor", "mHomePageContext == null");
            return;
        }
        IBGContainerService iBGContainerService = (IBGContainerService) wccVar.a(IBGContainerService.class);
        if (iBGContainerService == null) {
            bqa.d("StopPullStatusProcessor", "bgContainerManager == null");
        } else {
            iBGContainerService.setBGContainerVisibility(0);
        }
    }
}
