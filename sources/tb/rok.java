package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.tao.topmultitab.service.controller.IHomeControllerService;
import com.taobao.tao.topmultitab.service.searchbar.impl.searchview.SearchBarView;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class rok implements snd {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final SearchBarView f27500a;
    public final nvq b = new nvq();
    public final cvn c;

    static {
        t2o.a(729810349);
        t2o.a(729810348);
    }

    public rok(wcc wccVar, SearchBarView searchBarView) {
        this.f27500a = searchBarView;
        searchBarView.setHomePageContext(wccVar);
        this.c = new cvn(wccVar, searchBarView);
    }

    @Override // tb.snd
    public void b(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ff2ea91", new Object[]{this, jSONObject});
        } else {
            this.c.o(e0p.i(jSONObject), true);
        }
    }

    @Override // tb.snd
    public void c(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb0f0d65", new Object[]{this, jSONObject});
        } else {
            this.c.o(jSONObject, false);
        }
    }

    @Override // tb.snd
    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d6dadc00", new Object[]{this});
        } else {
            this.f27500a.updateWhenFestivalChanged();
        }
    }

    @Override // tb.snd
    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
        } else {
            this.c.g();
        }
    }

    @Override // tb.snd
    public DXRootView getDX3SearchView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXRootView) ipChange.ipc$dispatch("62c6355a", new Object[]{this});
        }
        return this.f27500a.getDX3SearchView();
    }

    @Override // tb.snd
    public Object getValueFromSearchBarData(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("2ad6f931", new Object[]{this, str});
        }
        JSONObject h = this.c.h();
        if (h == null) {
            return null;
        }
        return a3b.k(h, str);
    }

    @Override // tb.snd
    public boolean isDX3SearchViewReady() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("71f603cc", new Object[]{this})).booleanValue();
        }
        return this.f27500a.isDX3SearchViewReady();
    }

    @Override // tb.snd
    public void partialRefreshWidgetNode(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d2f7eb1", new Object[]{this, str});
        } else {
            this.f27500a.partialRefreshWidgetNode(str);
        }
    }

    @Override // tb.snd
    public void a(JSONObject jSONObject, wcc wccVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("adc45d9e", new Object[]{this, jSONObject, wccVar});
            return;
        }
        vqa e = vqa.k().i("SearchBar").j("refreshDxSearchBar").e("OldProtoSearchBarViewController.setSearchSection");
        IHomeControllerService iHomeControllerService = (IHomeControllerService) wccVar.a(IHomeControllerService.class);
        if (iHomeControllerService != null ? iHomeControllerService.hotSwitchContainer(jSONObject) : false) {
            uqa.b("OverseaTopMultiTab", "OldProtoSearchBarViewController", "发生单/多TAB热切，直接返回");
            return;
        }
        if (e(jSONObject)) {
            jSONObject = e0p.e();
            e.e("参数不合法，使用预置数据").e("使用预置数据");
        }
        if (!tit.b(jSONObject.getJSONObject("template")).h()) {
            e.e("不支持dx3，使用预置数据;");
            jSONObject = e0p.e();
        }
        JSONObject a2 = this.b.a(jSONObject);
        this.c.t(a2);
        this.f27500a.refreshDxSearchBarView(a2, wccVar, false);
        e.e("刷新搜索栏");
        e.a();
    }

    public final boolean e(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7965a907", new Object[]{this, jSONObject})).booleanValue();
        }
        return jSONObject == null || !jSONObject.containsKey("template") || e0p.j(jSONObject) == null;
    }
}
