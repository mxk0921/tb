package tb;

import android.text.TextUtils;
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
public class h4q {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final vwc f20407a;
    public final SearchBarView b;
    public uwc c;
    public JSONObject d;
    public kkc e;
    public final wcc f;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ JSONObject f20408a;
        public final /* synthetic */ boolean b;

        /* compiled from: Taobao */
        /* renamed from: tb.h4q$a$a  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
        public class RunnableC0937a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public RunnableC0937a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    h4q.d(h4q.this).partialRefreshWidgetNode("searchContainer");
                }
            }
        }

        public a(JSONObject jSONObject, boolean z) {
            this.f20408a = jSONObject;
            this.b = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            h4q h4qVar = h4q.this;
            h4q.b(h4qVar, h4q.c(h4qVar, this.f20408a, this.b));
            if (h4q.a(h4q.this) == null) {
                fve.e("SlimRefreshSearchBoxProcessor", "mCurrentHomeSearchBarData == null");
            } else {
                m5a.a().i(new RunnableC0937a());
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class b implements uwc {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
        public class a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ kkc f20411a;
            public final /* synthetic */ String b;

            public a(kkc kkcVar, String str) {
                this.f20411a = kkcVar;
                this.b = str;
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                DXRootView dX3SearchView = h4q.d(h4q.this).getDX3SearchView();
                if (dX3SearchView != null) {
                    h4q h4qVar = h4q.this;
                    h4q.b(h4qVar, h4q.f(h4qVar, this.f20411a, dX3SearchView.getData()));
                    fve.e("SlimRefreshSearchBoxProcessor", "切tab局部刷新,currentType:" + this.b);
                    h4q.d(h4q.this).partialRefreshWidgetNode("searchContainer");
                }
            }
        }

        public b() {
        }

        @Override // tb.uwc
        public void selectMultiTab(String str, kkc kkcVar, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ca4828d0", new Object[]{this, str, kkcVar, new Integer(i)});
            } else if (kkcVar == null) {
                fve.e("SlimRefreshSearchBoxProcessor", "分类数据为空");
            } else {
                h4q.e(h4q.this, kkcVar);
                m5a.a().g(new a(kkcVar, str), 0L);
            }
        }
    }

    static {
        t2o.a(729810343);
    }

    public h4q(wcc wccVar, SearchBarView searchBarView) {
        this.b = searchBarView;
        this.f = wccVar;
        vwc m = m(wccVar);
        this.f20407a = m;
        w(m);
    }

    public static /* synthetic */ JSONObject a(h4q h4qVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("3f2ac634", new Object[]{h4qVar});
        }
        return h4qVar.d;
    }

    public static /* synthetic */ JSONObject b(h4q h4qVar, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("1ef2b03a", new Object[]{h4qVar, jSONObject});
        }
        h4qVar.d = jSONObject;
        return jSONObject;
    }

    public static /* synthetic */ JSONObject c(h4q h4qVar, JSONObject jSONObject, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("c0915d59", new Object[]{h4qVar, jSONObject, new Boolean(z)});
        }
        return h4qVar.h(jSONObject, z);
    }

    public static /* synthetic */ SearchBarView d(h4q h4qVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SearchBarView) ipChange.ipc$dispatch("dea9c20e", new Object[]{h4qVar});
        }
        return h4qVar.b;
    }

    public static /* synthetic */ kkc e(h4q h4qVar, kkc kkcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (kkc) ipChange.ipc$dispatch("5d2f4aef", new Object[]{h4qVar, kkcVar});
        }
        h4qVar.e = kkcVar;
        return kkcVar;
    }

    public static /* synthetic */ JSONObject f(h4q h4qVar, kkc kkcVar, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("7dfd22ac", new Object[]{h4qVar, kkcVar, jSONObject});
        }
        return h4qVar.g(kkcVar, jSONObject);
    }

    public final JSONObject g(kkc kkcVar, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("8bdc2fb6", new Object[]{this, kkcVar, jSONObject});
        }
        if (jSONObject == null) {
            return new JSONObject();
        }
        if (kkcVar == null || !kkcVar.b()) {
            return q(jSONObject, kkcVar);
        }
        fve.e("SlimRefreshSearchBoxProcessor", "切tab，需要组装自己的数据");
        return p(jSONObject, kkcVar);
    }

    public final JSONObject h(JSONObject jSONObject, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("e46c446e", new Object[]{this, jSONObject, new Boolean(z)});
        }
        DXRootView dX3SearchView = this.b.getDX3SearchView();
        if (dX3SearchView == null || jSONObject == null) {
            fve.e("SlimRefreshSearchBoxProcessor", "refreshSearchBox dxSearchView == null || newSearchBarData == null");
            return null;
        } else if (z) {
            fve.e("SlimRefreshSearchBoxProcessor", "首页请求回来调用局部刷新,需要询问内部要数据");
            return u(jSONObject, this.e, dX3SearchView.getData());
        } else {
            fve.e("SlimRefreshSearchBoxProcessor", "外部调用局部刷新");
            return v(jSONObject, this.e, dX3SearchView.getData());
        }
    }

    public final uwc i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (uwc) ipChange.ipc$dispatch("a778d208", new Object[]{this});
        }
        return new b();
    }

    public void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
        } else {
            x(this.f20407a);
        }
    }

    public JSONObject k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("7a1403c", new Object[]{this});
        }
        return this.d;
    }

    public final IHomeSubTabController l() {
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

    public final vwc m(wcc wccVar) {
        IHomePageLifecycleService iHomePageLifecycleService;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (vwc) ipChange.ipc$dispatch("c84e2428", new Object[]{this, wccVar});
        }
        if (wccVar == null || (iHomePageLifecycleService = (IHomePageLifecycleService) wccVar.a(IHomePageLifecycleService.class)) == null) {
            return null;
        }
        return iHomePageLifecycleService.getTabLifeCycleRegister();
    }

    public final JSONObject n(JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("ad3d18ba", new Object[]{this, jSONObject, jSONObject2, jSONObject3});
        }
        JSONObject jSONObject4 = jSONObject.getJSONObject("content");
        if (jSONObject4 == null) {
            fve.e("SlimRefreshSearchBoxProcessor", "mergeTabComponentData subSection == null");
            return jSONObject;
        }
        if (jSONObject2 != null) {
            s("leftComponent", jSONObject2.getJSONObject("content"), jSONObject4);
            s("navUrl", jSONObject2.getString("targetUrl"), jSONObject4);
        }
        if (jSONObject3 != null) {
            s("rightComponent", jSONObject3.getJSONObject("content"), jSONObject4);
            s("navUrl", jSONObject3.getString("targetUrl"), jSONObject4);
        }
        return jSONObject;
    }

    public final JSONObject o(kkc kkcVar, JSONObject jSONObject, JSONObject jSONObject2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("ed8d5bda", new Object[]{this, kkcVar, jSONObject, jSONObject2});
        }
        JSONObject q = q(jSONObject, kkcVar);
        JSONObject jSONObject3 = jSONObject2.getJSONObject("content");
        JSONObject jSONObject4 = jSONObject2.getJSONObject("track");
        JSONObject jSONObject5 = q.getJSONObject("track");
        JSONObject jSONObject6 = q.getJSONObject("content");
        if (!(jSONObject6 == null || jSONObject3 == null)) {
            jSONObject6.putAll(jSONObject3);
        }
        if (!(jSONObject4 == null || jSONObject5 == null)) {
            jSONObject5.putAll(jSONObject4);
        }
        return q;
    }

    public final JSONObject p(JSONObject jSONObject, kkc kkcVar) {
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("1bbf1a4b", new Object[]{this, jSONObject, kkcVar});
        }
        IHomeSubTabController l = l();
        if (l != null) {
            jSONObject2 = e0p.p(l.getSubTabSearchBoxData());
        } else {
            jSONObject2 = null;
        }
        if (jSONObject2 == null) {
            return jSONObject;
        }
        return o(kkcVar, JSON.parseObject(jSONObject.toJSONString()), jSONObject2);
    }

    public final JSONObject q(JSONObject jSONObject, kkc kkcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("dc693bbd", new Object[]{this, jSONObject, kkcVar});
        }
        if (jSONObject == null) {
            fve.e("SlimRefreshSearchBoxProcessor", "mergeTabComponentData searchBarData == null");
            return new JSONObject();
        } else if (kkcVar == null) {
            fve.e("SlimRefreshSearchBoxProcessor", "mergeTabComponentData uiConfig == null");
            return jSONObject;
        } else {
            JSONObject a2 = kkcVar.a();
            JSONObject c = kkcVar.c();
            return r(n(jSONObject, a2, c), a2, c);
        }
    }

    public final JSONObject r(JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("459e6f0c", new Object[]{this, jSONObject, jSONObject2, jSONObject3});
        }
        JSONObject jSONObject4 = jSONObject.getJSONObject("track");
        if (jSONObject4 == null) {
            return jSONObject;
        }
        JSONObject jSONObject5 = new JSONObject();
        if (jSONObject2 != null) {
            s("clickParam", jSONObject2.getJSONObject("clickParam"), jSONObject5);
            s(i2b.TRACK_EXPOSURE_PARAM, jSONObject2.getJSONObject(i2b.TRACK_EXPOSURE_PARAM), jSONObject5);
            s("leftComponent", jSONObject5, jSONObject4);
        }
        JSONObject jSONObject6 = new JSONObject();
        if (jSONObject3 != null) {
            s("clickParam", jSONObject3.getJSONObject("clickParam"), jSONObject6);
            s(i2b.TRACK_EXPOSURE_PARAM, jSONObject3.getJSONObject(i2b.TRACK_EXPOSURE_PARAM), jSONObject6);
            s("rightComponent", jSONObject6, jSONObject4);
        }
        return jSONObject;
    }

    public final void s(String str, Object obj, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26504bd2", new Object[]{this, str, obj, jSONObject});
        } else if (obj != null && !TextUtils.isEmpty(str)) {
            jSONObject.put(str, obj);
        }
    }

    public void t(JSONObject jSONObject, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("feeedd13", new Object[]{this, jSONObject, new Boolean(z)});
        } else {
            m5a.a().e(new a(jSONObject, z));
        }
    }

    public final JSONObject u(JSONObject jSONObject, kkc kkcVar, JSONObject jSONObject2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("21985d2c", new Object[]{this, jSONObject, kkcVar, jSONObject2});
        }
        if (jSONObject2 == null) {
            fve.e("SlimRefreshSearchBoxProcessor", "refreshSearchBoxByHomeRequest dxSearchBarData == null");
            return new JSONObject();
        } else if (kkcVar == null || !kkcVar.b()) {
            return o(kkcVar, jSONObject2, jSONObject);
        } else {
            fve.e("SlimRefreshSearchBoxProcessor", "refreshSearchBoxByHomeRequest 需要组装自己的搜索框");
            return p(jSONObject2, kkcVar);
        }
    }

    public final JSONObject v(JSONObject jSONObject, kkc kkcVar, JSONObject jSONObject2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("278f94f2", new Object[]{this, jSONObject, kkcVar, jSONObject2});
        }
        if (jSONObject2 != null && jSONObject != null) {
            return o(kkcVar, JSON.parseObject(jSONObject2.toJSONString()), jSONObject);
        }
        fve.e("SlimRefreshSearchBoxProcessor", "refreshSearchBoxBySelf dxSearchBarData == null || searchBoxDataFromSelf == null");
        return jSONObject2;
    }

    public final void w(vwc vwcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b561262b", new Object[]{this, vwcVar});
        } else if (vwcVar != null) {
            uwc i = i();
            this.c = i;
            vwcVar.b(i);
        }
    }

    public final void x(vwc vwcVar) {
        uwc uwcVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ebe170a4", new Object[]{this, vwcVar});
        } else if (vwcVar != null && (uwcVar = this.c) != null) {
            this.f20407a.a(uwcVar);
        }
    }

    public void y(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23bf0496", new Object[]{this, jSONObject});
            return;
        }
        fve.e("SlimRefreshSearchBoxProcessor", "重新渲染搜索栏");
        this.d = g(this.e, jSONObject);
    }
}
