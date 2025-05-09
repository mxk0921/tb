package tb;

import android.app.Activity;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.topmultitab.service.pulldown.IPullDownService;
import com.taobao.tao.topmultitab.service.shake.IShakeService;
import com.taobao.uikit.extend.component.refresh.TBRefreshHeader;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class j7p implements qsd {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final joq f21822a;
    public final wcc b;
    public final IPullDownService.a d;

    static {
        t2o.a(729810304);
        t2o.a(729810301);
    }

    public j7p(Activity activity, joq joqVar, wcc wccVar, IPullDownService.a aVar) {
        this.f21822a = joqVar;
        this.b = wccVar;
        this.d = aVar;
    }

    @Override // tb.qsd
    public boolean b(TBRefreshHeader.RefreshState refreshState, TBRefreshHeader.RefreshState refreshState2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e8a10f5b", new Object[]{this, refreshState, refreshState2})).booleanValue();
        }
        if (refreshState2 == TBRefreshHeader.RefreshState.SECOND_FLOOR_END) {
            return true;
        }
        return false;
    }

    public final void c(h7p h7pVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("103e04ca", new Object[]{this, h7pVar});
            return;
        }
        k7p.a();
        k7p.f(k7p.TARCK_KEY_PAGE_MINI_APP_HOME, h7pVar.e());
    }

    public final void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1dc7daab", new Object[]{this});
            return;
        }
        IShakeService iShakeService = (IShakeService) this.b.a(IShakeService.class);
        if (iShakeService != null) {
            iShakeService.stopShake();
        }
    }

    @Override // tb.qsd
    public void a(h7p h7pVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6028753c", new Object[]{this, h7pVar});
            return;
        }
        this.f21822a.j(0, "second_floor_commit_track", null);
        c(h7pVar);
        this.f21822a.s();
        d();
        this.d.onEnterPullSecondFloor();
        bqa.d("SecondFloorEndStatusProcessor", "当前在二楼");
    }
}
