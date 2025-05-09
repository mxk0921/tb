package tb;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.infoflow.multitab.viewprovider.tablayout.panel.PanelStyleModel;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class qpl implements o7d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final epl f26870a;
    public final fpl b;
    public final ipl c = new ipl();
    public final taj d;
    public final fuq e;
    public boolean f;
    public View g;

    static {
        t2o.a(729809555);
        t2o.a(729809552);
    }

    public qpl(taj tajVar, fuq fuqVar) {
        this.d = tajVar;
        this.e = fuqVar;
        epl eplVar = new epl(this);
        this.f26870a = eplVar;
        this.b = new fpl(eplVar);
    }

    public static /* synthetic */ String a(qpl qplVar, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b531237e", new Object[]{qplVar, jSONObject});
        }
        return qplVar.j(jSONObject);
    }

    public static /* synthetic */ fpl b(qpl qplVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (fpl) ipChange.ipc$dispatch("2710e114", new Object[]{qplVar});
        }
        return qplVar.b;
    }

    public static /* synthetic */ View c(qpl qplVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("9326c212", new Object[]{qplVar});
        }
        return qplVar.g;
    }

    public static /* synthetic */ View d(qpl qplVar, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("33b82302", new Object[]{qplVar, view});
        }
        qplVar.g = view;
        return view;
    }

    public static /* synthetic */ fuq e(qpl qplVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (fuq) ipChange.ipc$dispatch("202443b1", new Object[]{qplVar});
        }
        return qplVar.e;
    }

    public static /* synthetic */ ipl g(qpl qplVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ipl) ipChange.ipc$dispatch("111470da", new Object[]{qplVar});
        }
        return qplVar.c;
    }

    public static /* synthetic */ epl h(qpl qplVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (epl) ipChange.ipc$dispatch("979e4c1d", new Object[]{qplVar});
        }
        return qplVar.f26870a;
    }

    @Override // tb.o7d
    public boolean D() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1f9887f3", new Object[]{this})).booleanValue();
        }
        return this.f26870a.D();
    }

    @Override // tb.o7d
    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e85541df", new Object[]{this});
        } else {
            this.b.f();
        }
    }

    public View i(JSONObject jSONObject, Context context, JSONObject jSONObject2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("7b1bd092", new Object[]{this, jSONObject, context, jSONObject2});
        }
        PanelStyleModel i = hpl.i(jSONObject);
        if (i == null) {
            return new View(context);
        }
        ViewGroup d = this.f26870a.d(context);
        View d2 = this.b.d(jSONObject, i, context, this.e.o());
        d.addView(d2);
        d.addView(this.f26870a.e(context, i));
        if (jSONObject2 == null) {
            return d;
        }
        d9j.c("PanelViewManager", "panelGuidePopView createPopView");
        n(jSONObject2, d, d2);
        return d;
    }

    public final String j(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fcd6abdc", new Object[]{this, jSONObject});
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("ext");
        if (jSONObject2 == null) {
            return null;
        }
        return jSONObject2.getString(vaj.KEY_TAB_ID);
    }

    public void k(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b0f28a0", new Object[]{this, str});
        } else if (TextUtils.isEmpty(str)) {
            d9j.c("PanelViewManager", "naviToTabId tabId为null");
        } else {
            com.taobao.tao.infoflow.multitab.viewprovider.tablayout.a aVar = (com.taobao.tao.infoflow.multitab.viewprovider.tablayout.a) this.d.b(com.taobao.tao.infoflow.multitab.viewprovider.tablayout.a.KEY);
            int u = this.e.u(str);
            int o = this.e.o();
            d9j.c("PanelViewManager", "naviToTabId currentPosition:" + o + "naviToTab :" + str + ",position:" + u);
            if (u != -1 && aVar != null && o != u) {
                d9j.c("PanelViewManager", "naviToTabId tabIndex  :" + u);
                this.e.H(u);
                aVar.h(str);
                d9j.c("PanelViewManager", "naviToTabId 视图未创建重刷");
                ((com.taobao.tao.infoflow.multitab.viewprovider.viewpager.a) this.d.b(com.taobao.tao.infoflow.multitab.viewprovider.viewpager.a.KEY)).n(u, true);
            }
        }
    }

    public final void l(JSONObject jSONObject, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7ff3a89", new Object[]{this, jSONObject, new Boolean(z)});
        } else if (!this.f) {
            d9j.c("PanelViewManager", "notifyUiRefresh 未编辑不刷新 ");
        } else {
            d9j.c("PanelViewManager", "notifyUiRefresh  currentTabRemoved " + z);
            List<JSONObject> x = vaj.x(jSONObject);
            ((com.taobao.tao.infoflow.multitab.viewprovider.viewpager.a) this.d.b(com.taobao.tao.infoflow.multitab.viewprovider.viewpager.a.KEY)).r(jSONObject, x, z);
            ((com.taobao.tao.infoflow.multitab.viewprovider.tablayout.a) this.d.b(com.taobao.tao.infoflow.multitab.viewprovider.tablayout.a.KEY)).r(jSONObject, x, z);
        }
    }

    @Override // tb.o7d
    public void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f4fcc21e", new Object[]{this});
            return;
        }
        View view = this.g;
        if (view != null) {
            view.setVisibility(8);
        }
    }

    public final void n(JSONObject jSONObject, ViewGroup viewGroup, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd507331", new Object[]{this, jSONObject, viewGroup, view});
        } else {
            view.post(new a(jSONObject, viewGroup));
        }
    }

    @Override // tb.o7d
    public void v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("901b9a6e", new Object[]{this});
        } else {
            this.b.v();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ JSONObject f26871a;
        public final /* synthetic */ ViewGroup b;

        public a(JSONObject jSONObject, ViewGroup viewGroup) {
            this.f26871a = jSONObject;
            this.b = viewGroup;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (this.f26871a != null) {
                d9j.c("PanelViewManager", "panelGuidePopView createPopView");
                String a2 = qpl.a(qpl.this, this.f26871a);
                if (!TextUtils.isEmpty(a2)) {
                    int[] g = qpl.b(qpl.this).g(a2);
                    if (g[0] != 0 && g[1] != 0) {
                        qpl qplVar = qpl.this;
                        qpl.d(qplVar, qpl.g(qplVar).h(this.b.getContext(), this.f26871a, qpl.e(qpl.this).u(a2)));
                        if (qpl.c(qpl.this) != null) {
                            qpl.g(qpl.this).l(g);
                            qpl.h(qpl.this).f();
                            qpl.b(qpl.this).f();
                            this.b.addView(qpl.c(qpl.this));
                        }
                    }
                }
            }
        }
    }

    @Override // tb.o7d
    public void onClose() {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e155e360", new Object[]{this});
            return;
        }
        d9j.c("PanelViewManager", "onClose categoryViewProvider :");
        this.b.onClose();
        boolean h = this.b.h();
        this.f = h;
        if (h) {
            yyj.e().F();
        }
        JSONObject h2 = hpl.h();
        if (h2 == null) {
            d9j.c("PanelViewManager", "缓存tabs数据异常");
            return;
        }
        JSONObject k = hpl.k(h2);
        if (k == null) {
            d9j.c("PanelViewManager", "缓存tabItemData数据异常");
            return;
        }
        String str = "";
        for (Map.Entry<String, Boolean> entry : o(k).entrySet()) {
            str = entry.getKey();
            z = entry.getValue().booleanValue();
        }
        k(str);
        l(h2, z);
    }

    public final Map<String, Boolean> o(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("6a90ac67", new Object[]{this, jSONObject});
        }
        HashMap hashMap = new HashMap(1);
        int o = this.e.o();
        String t = this.e.t(o);
        d9j.c("PanelViewManager", "updateCurrentRemovedAndNavId selectTabId :" + t + ",selectPosition:" + o);
        int n = this.e.n();
        boolean z = true;
        for (int i = 0; i < jSONObject.size(); i++) {
            JSONObject jSONObject2 = jSONObject.getJSONObject(String.valueOf(i));
            if (jSONObject2 != null) {
                String f = hpl.f(jSONObject2);
                if (!TextUtils.isEmpty(f)) {
                    this.e.N(f, i, jSONObject2);
                    if (TextUtils.equals(t, f)) {
                        z = false;
                    }
                    JSONObject jSONObject3 = jSONObject2.getJSONObject("content");
                    if (jSONObject3 != null && jSONObject3.getBooleanValue(hpl.IS_CLICK)) {
                        jSONObject3.remove(hpl.IS_CLICK);
                        d9j.c("PanelViewManager", "updateCurrentRemovedAndNavId 点击 naviTabId :" + f);
                        t = f;
                        z = false;
                    }
                }
            }
        }
        d9j.c("PanelViewManager", "updateCurrentRemovedAndNavId mCurrentTabRemoved " + z);
        if (z) {
            t = this.e.t(n);
            d9j.c("PanelViewManager", "updateCurrentRemovedAndNavId 当前tab被移除跳转推荐");
        }
        d9j.c("PanelViewManager", "updateCurrentRemovedAndNavId finalNaviId :" + t + ",currentTabRemove:" + z);
        hashMap.put(t, Boolean.valueOf(z));
        return hashMap;
    }
}
