package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.tao.topmultitab.protocol.IHomeSubTabController;
import com.taobao.tao.topmultitab.service.controller.IHomeControllerService;
import com.taobao.tao.topmultitab.service.searchbar.impl.searchview.SearchBarView;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class g4q implements snd {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final SearchBarView f19725a;
    public final h4q b;

    static {
        t2o.a(729810350);
        t2o.a(729810348);
    }

    public g4q(wcc wccVar, SearchBarView searchBarView) {
        this.f19725a = searchBarView;
        searchBarView.setHomePageContext(wccVar);
        this.b = new h4q(wccVar, searchBarView);
    }

    @Override // tb.snd
    public void b(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ff2ea91", new Object[]{this, jSONObject});
        } else {
            this.b.t(jSONObject, true);
        }
    }

    @Override // tb.snd
    public void c(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb0f0d65", new Object[]{this, jSONObject});
        } else {
            this.b.t(e0p.p(jSONObject), false);
        }
    }

    @Override // tb.snd
    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d6dadc00", new Object[]{this});
        } else {
            this.f19725a.updateWhenFestivalChanged();
        }
    }

    @Override // tb.snd
    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
        } else {
            this.b.j();
        }
    }

    public final JSONObject g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("bab9b3d1", new Object[]{this});
        }
        IHomeControllerService iHomeControllerService = (IHomeControllerService) c4b.i().h(IHomeControllerService.class);
        if (iHomeControllerService == null) {
            fve.e("SlimProtoSearchBarViewController", "controllerService == null");
            return null;
        }
        IHomeSubTabController homeSubTabController = iHomeControllerService.getHomeSubTabController("home");
        if (homeSubTabController != null) {
            return homeSubTabController.getSubTabSearchBarData();
        }
        fve.e("SlimProtoSearchBarViewController", "subTabController == null");
        return null;
    }

    @Override // tb.snd
    public DXRootView getDX3SearchView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXRootView) ipChange.ipc$dispatch("62c6355a", new Object[]{this});
        }
        return this.f19725a.getDX3SearchView();
    }

    @Override // tb.snd
    public Object getValueFromSearchBarData(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("2ad6f931", new Object[]{this, str});
        }
        JSONObject k = this.b.k();
        if (k != null) {
            return a3b.k(k, str);
        }
        fve.e("SlimProtoSearchBarViewController", "currentSearchData == null");
        return null;
    }

    @Override // tb.snd
    public boolean isDX3SearchViewReady() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("71f603cc", new Object[]{this})).booleanValue();
        }
        return this.f19725a.isDX3SearchViewReady();
    }

    @Override // tb.snd
    public void partialRefreshWidgetNode(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d2f7eb1", new Object[]{this, str});
        } else {
            this.f19725a.partialRefreshWidgetNode(str);
        }
    }

    @Override // tb.snd
    public void a(JSONObject jSONObject, wcc wccVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("adc45d9e", new Object[]{this, jSONObject, wccVar});
        } else if (h(jSONObject)) {
            fve.e("SlimProtoSearchBarViewController", "参数非法");
        } else {
            JSONObject g = g();
            if (g != null) {
                jSONObject = g;
            }
            this.b.y(jSONObject);
            fve.e("SlimProtoSearchBarViewController", "数组更新完成");
            this.f19725a.refreshDxSearchBarView(jSONObject, wccVar, true);
            fve.e("SlimProtoSearchBarViewController", "刷新导航栏");
        }
    }

    public final boolean h(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7965a907", new Object[]{this, jSONObject})).booleanValue();
        }
        if (jSONObject == null) {
            fve.e("SlimProtoSearchBarViewController", "section == null");
            return true;
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("style");
        if (jSONObject2 != null) {
            return jSONObject2.getJSONObject("template") == null;
        }
        fve.e("SlimProtoSearchBarViewController", "style == null");
        return true;
    }
}
