package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.homepage.page.weexv2.WeexSecondFloorFragment;
import com.taobao.tao.TBMainHost;
import com.taobao.tao.homepage.HomepageFragment;
import com.taobao.uikit.extend.component.refresh.TBRefreshHeader;
import com.taobao.uikit.extend.component.refresh.TBSwipeRefreshLayout;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class z4n implements TBSwipeRefreshLayout.OnPullRefreshListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final lem f32533a;

    static {
        t2o.a(729810272);
        t2o.a(932184133);
    }

    public z4n(wcc wccVar) {
        this.f32533a = new lem(wccVar);
    }

    public final void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a7e511e8", new Object[]{this});
            return;
        }
        this.f32533a.c(WeexSecondFloorFragment.class.getSimpleName());
        this.f32533a.e(WeexSecondFloorFragment.class.getName(), "", null);
    }

    public final void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec6539a3", new Object[]{this});
            return;
        }
        this.f32533a.c(lem.POP_LAYER_RECOMMEND_TAB_NAME);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("actionType", (Object) "backToHome");
        this.f32533a.e(kng.RECOMMEND_SCENE, "", jSONObject);
    }

    @Override // com.taobao.uikit.extend.component.refresh.TBSwipeRefreshLayout.OnPullRefreshListener
    public void onPullDistance(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2dcc8a23", new Object[]{this, new Integer(i)});
        }
    }

    @Override // com.taobao.uikit.extend.component.refresh.TBSwipeRefreshLayout.OnPullRefreshListener
    public void onRefresh() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c9cbba83", new Object[]{this});
        }
    }

    @Override // com.taobao.uikit.extend.component.refresh.TBSwipeRefreshLayout.OnPullRefreshListener
    public void onRefreshStateChanged(TBRefreshHeader.RefreshState refreshState, TBRefreshHeader.RefreshState refreshState2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f1ba5ae", new Object[]{this, refreshState, refreshState2});
            return;
        }
        TBRefreshHeader.RefreshState refreshState3 = TBRefreshHeader.RefreshState.SECOND_FLOOR_END;
        if (refreshState2 == refreshState3) {
            sfh.d("PopLayer_And_ucp_trigger", "进入二楼了触发pop隐藏");
            a();
        }
        if (refreshState == refreshState3 && refreshState2 == TBRefreshHeader.RefreshState.NONE && (TBMainHost.b().getCurrentFragment() instanceof HomepageFragment)) {
            sfh.d("PopLayer_And_ucp_trigger", "进入二楼了触发pop展示");
            b();
        }
    }
}
