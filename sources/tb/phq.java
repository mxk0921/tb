package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.topmultitab.service.bgcontainer.IBGContainerService;
import com.taobao.uikit.extend.component.refresh.TBRefreshHeader;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class phq implements qsd {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final joq f26106a;
    public final wcc b;

    static {
        t2o.a(729810306);
        t2o.a(729810301);
    }

    public phq(joq joqVar, wcc wccVar) {
        this.f26106a = joqVar;
        this.b = wccVar;
    }

    @Override // tb.qsd
    public void a(h7p h7pVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6028753c", new Object[]{this, h7pVar});
            return;
        }
        this.f26106a.r(h7pVar);
        IBGContainerService iBGContainerService = (IBGContainerService) this.b.a(IBGContainerService.class);
        if (iBGContainerService != null) {
            iBGContainerService.setBGContainerVisibility(4);
        }
        bqa.d("StartPullStatusProcessor", "开始下拉");
    }

    @Override // tb.qsd
    public boolean b(TBRefreshHeader.RefreshState refreshState, TBRefreshHeader.RefreshState refreshState2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e8a10f5b", new Object[]{this, refreshState, refreshState2})).booleanValue();
        }
        if (refreshState == TBRefreshHeader.RefreshState.NONE) {
            return true;
        }
        return false;
    }
}
