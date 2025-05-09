package tb;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.tao.topmultitab.protocol.IHomeSubTabController;
import com.taobao.tao.topmultitab.service.controller.IHomeControllerService;
import com.taobao.tao.topmultitab.service.lifecycle.IHomePageLifecycleService;
import com.taobao.tao.topmultitab.service.searchbar.impl.searchview.SearchBarView;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class cvn {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String SUB_SECTION_HOME = "home";

    /* renamed from: a  reason: collision with root package name */
    public final vwc f17354a;
    public final SearchBarView b;
    public uwc c;
    public JSONObject d;
    public kkc e;
    public final wcc f;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements uwc {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* compiled from: Taobao */
        /* renamed from: tb.cvn$a$a  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
        public class RunnableC0893a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ kkc f17356a;
            public final /* synthetic */ String b;

            public RunnableC0893a(kkc kkcVar, String str) {
                this.f17356a = kkcVar;
                this.b = str;
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                DXRootView dX3SearchView = cvn.b(cvn.this).getDX3SearchView();
                if (dX3SearchView != null) {
                    cvn cvnVar = cvn.this;
                    cvn.c(cvnVar, cvn.d(cvnVar, this.f17356a, dX3SearchView.getData()));
                    fve.e("RefreshSearchBarComponent", "切tab局部刷新,currentType:" + this.b);
                    cvn.b(cvn.this).partialRefreshWidgetNode("searchContainer");
                }
            }
        }

        public a() {
        }

        @Override // tb.uwc
        public void selectMultiTab(String str, kkc kkcVar, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ca4828d0", new Object[]{this, str, kkcVar, new Integer(i)});
            } else if (kkcVar == null) {
                fve.e("RefreshSearchBarComponent", "分类数据为空");
            } else {
                cvn.a(cvn.this, kkcVar);
                m5a.a().g(new RunnableC0893a(kkcVar, str), 0L);
            }
        }
    }

    static {
        t2o.a(729810340);
    }

    public cvn(wcc wccVar, SearchBarView searchBarView) {
        this.b = searchBarView;
        this.f = wccVar;
        vwc j = j((IHomePageLifecycleService) wccVar.a(IHomePageLifecycleService.class));
        this.f17354a = j;
        r(j);
    }

    public static /* synthetic */ kkc a(cvn cvnVar, kkc kkcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (kkc) ipChange.ipc$dispatch("a1fa88cf", new Object[]{cvnVar, kkcVar});
        }
        cvnVar.e = kkcVar;
        return kkcVar;
    }

    public static /* synthetic */ SearchBarView b(cvn cvnVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SearchBarView) ipChange.ipc$dispatch("bb2a362c", new Object[]{cvnVar});
        }
        return cvnVar.b;
    }

    public static /* synthetic */ JSONObject c(cvn cvnVar, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("6376a135", new Object[]{cvnVar, jSONObject});
        }
        cvnVar.d = jSONObject;
        return jSONObject;
    }

    public static /* synthetic */ JSONObject d(cvn cvnVar, kkc kkcVar, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("dc64904e", new Object[]{cvnVar, kkcVar, jSONObject});
        }
        return cvnVar.e(kkcVar, jSONObject);
    }

    public final JSONObject e(kkc kkcVar, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("8bdc2fb6", new Object[]{this, kkcVar, jSONObject});
        }
        if (jSONObject == null) {
            return new JSONObject();
        }
        if (kkcVar == null || !kkcVar.b()) {
            return m(jSONObject, kkcVar);
        }
        fve.e("RefreshSearchBarComponent", "切tab，需要组装自己的数据");
        return l(jSONObject, kkcVar);
    }

    public final uwc f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (uwc) ipChange.ipc$dispatch("a778d208", new Object[]{this});
        }
        return new a();
    }

    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
        } else {
            s(this.f17354a);
        }
    }

    public JSONObject h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("7a1403c", new Object[]{this});
        }
        return this.d;
    }

    public final IHomeSubTabController i() {
        IHomeControllerService iHomeControllerService;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IHomeSubTabController) ipChange.ipc$dispatch("7c3a56ec", new Object[]{this});
        }
        wcc wccVar = this.f;
        if (wccVar == null || (iHomeControllerService = (IHomeControllerService) wccVar.a(IHomeControllerService.class)) == null) {
            return null;
        }
        return iHomeControllerService.getCurrentSubTabController();
    }

    public final vwc j(IHomePageLifecycleService iHomePageLifecycleService) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (vwc) ipChange.ipc$dispatch("8e9d170f", new Object[]{this, iHomePageLifecycleService});
        }
        if (iHomePageLifecycleService == null) {
            return null;
        }
        return iHomePageLifecycleService.getTabLifeCycleRegister();
    }

    public final JSONObject k(kkc kkcVar, JSONObject jSONObject, JSONObject jSONObject2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("ed8d5bda", new Object[]{this, kkcVar, jSONObject, jSONObject2});
        }
        JSONObject m = m(jSONObject, kkcVar);
        JSONObject jSONObject3 = m.getJSONObject("subSection");
        if (jSONObject3 == null) {
            fve.e("RefreshSearchBarComponent", "mergeSearchBoxAndComponentData subSection == null");
            return m;
        }
        JSONObject jSONObject4 = jSONObject3.getJSONObject(cpj.SEARCH_BOX);
        if (!(jSONObject2 == null || jSONObject4 == null)) {
            jSONObject4.putAll(jSONObject2);
        }
        return m;
    }

    public final JSONObject l(JSONObject jSONObject, kkc kkcVar) {
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("1bbf1a4b", new Object[]{this, jSONObject, kkcVar});
        }
        IHomeSubTabController i = i();
        if (i != null) {
            jSONObject2 = i.getSubTabSearchBoxData();
        } else {
            jSONObject2 = null;
        }
        return k(kkcVar, JSON.parseObject(jSONObject.toJSONString()), jSONObject2);
    }

    public final JSONObject m(JSONObject jSONObject, kkc kkcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("dc693bbd", new Object[]{this, jSONObject, kkcVar});
        }
        if (jSONObject == null) {
            fve.e("RefreshSearchBarComponent", "mergeTabComponentData searchBarData == null");
            return new JSONObject();
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("subSection");
        if (jSONObject2 == null) {
            fve.e("RefreshSearchBarComponent", "mergeTabComponentData subSection == null");
            return new JSONObject();
        }
        JSONObject jSONObject3 = jSONObject2.getJSONObject("home");
        if (jSONObject3 == null) {
            fve.e("RefreshSearchBarComponent", "mergeTabComponentData，合并数据失败");
            return new JSONObject();
        } else if (kkcVar != null) {
            return n(jSONObject3, kkcVar);
        } else {
            fve.e("RefreshSearchBarComponent", "mergeTabComponentData，不是分类tab，不需要处理左右图标");
            return jSONObject3;
        }
    }

    public final JSONObject n(JSONObject jSONObject, kkc kkcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("a3166a6e", new Object[]{this, jSONObject, kkcVar});
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("subSection");
        if (jSONObject2 == null) {
            fve.e("RefreshSearchBarComponent", "mergeSearchHomeData，subSection为空");
            return jSONObject;
        }
        JSONObject a2 = kkcVar.a();
        JSONObject c = kkcVar.c();
        jSONObject2.put("leftComponent", (Object) a2);
        jSONObject2.put("rightComponent", (Object) c);
        return jSONObject;
    }

    public void o(JSONObject jSONObject, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("feeedd13", new Object[]{this, jSONObject, new Boolean(z)});
            return;
        }
        DXRootView dX3SearchView = this.b.getDX3SearchView();
        if (dX3SearchView == null) {
            fve.e("RefreshSearchBarComponent", "refreshSearchBox dxSearchView == null");
            return;
        }
        if (z) {
            fve.e("RefreshSearchBarComponent", "首页请求回来调用局部刷新,需要询问内部要数据");
            this.d = p(jSONObject, this.e, dX3SearchView.getData());
        } else {
            fve.e("RefreshSearchBarComponent", "外部调用局部刷新");
            this.d = q(jSONObject, this.e, dX3SearchView.getData());
        }
        this.b.partialRefreshWidgetNode("searchContainer");
    }

    public final JSONObject p(JSONObject jSONObject, kkc kkcVar, JSONObject jSONObject2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("21985d2c", new Object[]{this, jSONObject, kkcVar, jSONObject2});
        }
        if (jSONObject2 == null) {
            fve.e("RefreshSearchBarComponent", "refreshSearchBoxByHomeRequest dxSearchBarData == null");
            return new JSONObject();
        } else if (kkcVar == null || !kkcVar.b()) {
            return k(kkcVar, jSONObject2, jSONObject);
        } else {
            fve.e("RefreshSearchBarComponent", "refreshSearchBoxByHomeRequest 需要组装自己的搜索框");
            return l(jSONObject2, kkcVar);
        }
    }

    public final JSONObject q(JSONObject jSONObject, kkc kkcVar, JSONObject jSONObject2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("278f94f2", new Object[]{this, jSONObject, kkcVar, jSONObject2});
        }
        if (jSONObject2 == null || jSONObject == null) {
            fve.e("RefreshSearchBarComponent", "refreshSearchBoxBySelf dxSearchBarData == null || searchBoxDataFromSelf == null");
            return new JSONObject();
        }
        JSONObject m = m(JSON.parseObject(jSONObject2.toJSONString()), kkcVar);
        JSONObject jSONObject3 = m.getJSONObject("subSection");
        if (jSONObject3 == null) {
            fve.e("RefreshSearchBarComponent", "refreshSearchBoxBySelf subSection == null");
            return m;
        }
        JSONObject jSONObject4 = jSONObject3.getJSONObject(cpj.SEARCH_BOX);
        if (jSONObject4 != null) {
            fve.e("RefreshSearchBarComponent", "更新搜索框数据");
            jSONObject4.putAll(jSONObject);
        }
        return m;
    }

    public final void r(vwc vwcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b561262b", new Object[]{this, vwcVar});
        } else if (vwcVar != null) {
            uwc f = f();
            this.c = f;
            vwcVar.b(f);
        }
    }

    public final void s(vwc vwcVar) {
        uwc uwcVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ebe170a4", new Object[]{this, vwcVar});
        } else if (vwcVar != null && (uwcVar = this.c) != null) {
            this.f17354a.a(uwcVar);
        }
    }

    public void t(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23bf0496", new Object[]{this, jSONObject});
            return;
        }
        fve.e("RefreshSearchBarComponent", "重新渲染搜索栏");
        this.d = e(this.e, jSONObject);
    }
}
