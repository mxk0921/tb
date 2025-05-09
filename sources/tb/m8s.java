package tb;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.ut.monitor.DataReceiveMonitor;
import com.taobao.android.dinamicx.DXEngineConfig;
import com.taobao.android.dinamicx.DXResult;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.dinamicx.template.download.DXTemplateItem;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.android.dinamicx.widget.DXWidgetRefreshOption;
import com.taobao.android.riverlogger.RVLLevel;
import com.taobao.themis.kernel.metaInfo.manifest.TabBar;
import com.taobao.themis.kernel.metaInfo.manifest.TabBarItem;
import com.taobao.themis.open.ability.calendar.TMSCalendarBridge;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import tb.lxd;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Ltb/m8s;", "Ltb/lxd;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "themis_taobao_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class m8s implements lxd {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Context f23852a;
    public DinamicXEngine c;
    public DXTemplateItem d;
    public DXRootView e;
    public final FrameLayout g;
    public int h;
    public boolean i;
    public final JSONObject b = new JSONObject();
    public final e06 f = new e06();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class a implements lxd.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ lxd.b f23853a;

        public a(lxd.b bVar) {
            this.f23853a = bVar;
        }

        @Override // tb.lxd.b
        public void D(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("75f7b8aa", new Object[]{this, new Integer(i)});
            } else {
                this.f23853a.D(i);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class b implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public static final b INSTANCE = new b();

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            }
        }
    }

    static {
        t2o.a(847249553);
        t2o.a(839909523);
    }

    public m8s(Context context) {
        ckf.g(context, "context");
        this.f23852a = context;
        this.g = new FrameLayout(context);
    }

    public final void a() {
        xhv xhvVar;
        View childAt;
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ddb696e", new Object[]{this});
            return;
        }
        try {
            DXRootView dXRootView = this.e;
            if (dXRootView == null) {
                xhvVar = null;
            } else {
                int childCount = dXRootView.getChildCount();
                while (i < childCount) {
                    int i2 = i + 1;
                    DXRootView dXRootView2 = this.e;
                    if (!(dXRootView2 == null || (childAt = dXRootView2.getChildAt(i)) == null)) {
                        childAt.setElevation(xcs.a(childAt.getContext(), 15.0f));
                    }
                    i = i2;
                }
                xhvVar = xhv.INSTANCE;
            }
            Result.m1108constructorimpl(xhvVar);
        } catch (Throwable th) {
            Result.m1108constructorimpl(kotlin.b.a(th));
        }
    }

    public final boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("73ed61af", new Object[]{this})).booleanValue();
        }
        return q9s.b3("themis_common_config", "enableAdaptPadAndFold", Boolean.TRUE);
    }

    public final boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bf5e1c93", new Object[]{this})).booleanValue();
        }
        return q9s.b3("themis_common_config", "enableFixClickEventPropagation", Boolean.TRUE);
    }

    public final boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e1e4703b", new Object[]{this})).booleanValue();
        }
        return q9s.b3("themis_common_config", "enableFixTabBarShadow", Boolean.TRUE);
    }

    @Override // tb.lxd
    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("51a9b4a2", new Object[]{this});
        } else {
            this.g.setVisibility(0);
        }
    }

    public final String f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1440f45e", new Object[]{this});
        }
        return q9s.J3("themis_common_config", "actTabBarTemplateUrl", "");
    }

    public final long g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a1e3e95f", new Object[]{this})).longValue();
        }
        return q9s.r3("themis_common_config", "actTabBarTemplateVersion", 6);
    }

    @Override // tb.lxd
    public View getContentView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("ce219891", new Object[]{this});
        }
        return this.g;
    }

    @Override // tb.lxd
    public int getHeight() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4703e217", new Object[]{this})).intValue();
        }
        if (this.e == null) {
            return 0;
        }
        return 64;
    }

    @Override // tb.lxd
    public void k(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d7c9afde", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        int h = h();
        if (i >= 0 && i2 >= 0 && i < h && i2 < h) {
            Object obj = this.b.get("items");
            JSONArray jSONArray = obj instanceof JSONArray ? (JSONArray) obj : null;
            if (jSONArray != null) {
                Object obj2 = jSONArray.get(i);
                jSONArray.set(i, jSONArray.get(i2));
                jSONArray.set(i2, obj2);
                int i3 = this.h;
                if (i3 == i) {
                    r(i2);
                } else if (i3 == i2) {
                    r(i);
                } else {
                    l();
                }
            }
        }
    }

    @Override // tb.lxd
    public void o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("beee64a7", new Object[]{this});
        } else {
            this.g.setVisibility(8);
        }
    }

    @Override // tb.lxd
    public void r(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("210663ed", new Object[]{this, new Integer(i)});
        } else if (i >= 0 && i < h()) {
            this.b.put((JSONObject) "currentIndex", (String) Integer.valueOf(i));
            this.h = i;
            l();
        }
    }

    @Override // tb.lxd
    public boolean removeTabBarBadge(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c312d1f", new Object[]{this, new Integer(i)})).booleanValue();
        }
        return false;
    }

    @Override // tb.lxd
    public void t(lxd.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("da89bb4b", new Object[]{this, bVar});
            return;
        }
        ckf.g(bVar, DataReceiveMonitor.CB_LISTENER);
        this.f.a(new a(bVar));
    }

    @Override // tb.lxd
    public boolean u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1afa86f6", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public final int h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("19fa3502", new Object[]{this})).intValue();
        }
        Object obj = this.b.get("items");
        JSONArray jSONArray = obj instanceof JSONArray ? (JSONArray) obj : null;
        if (jSONArray == null) {
            return 0;
        }
        return jSONArray.size();
    }

    @Override // tb.lxd
    public boolean i(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d084b58", new Object[]{this, str})).booleanValue();
        }
        ckf.g(str, "mode");
        return false;
    }

    @Override // tb.lxd
    public boolean q(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fd19b287", new Object[]{this, new Integer(i), str})).booleanValue();
        }
        ckf.g(str, "text");
        return false;
    }

    @Override // tb.lxd
    public boolean j(int i, TabBarItem tabBarItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a83744cc", new Object[]{this, new Integer(i), tabBarItem})).booleanValue();
        }
        ckf.g(tabBarItem, "tabBarItemModel");
        if (i >= 0 && i < h()) {
            try {
                Object obj = this.b.get("items");
                JSONArray jSONArray = obj instanceof JSONArray ? (JSONArray) obj : null;
                if (jSONArray != null) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("iconNormal", (Object) tabBarItem.getIconNormal());
                    jSONObject.put("iconSelected", (Object) tabBarItem.getIconSelected());
                    xhv xhvVar = xhv.INSTANCE;
                    jSONArray.set(i, jSONObject);
                    l();
                }
                return true;
            } catch (Exception unused) {
            }
        }
        return false;
    }

    public final void l() {
        DXWidgetNode expandWidgetNode;
        DXWidgetNode queryRootWidgetNode;
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b12a895", new Object[]{this});
            return;
        }
        DXRootView dXRootView = this.e;
        if (!(dXRootView == null || (expandWidgetNode = dXRootView.getExpandWidgetNode()) == null || (queryRootWidgetNode = expandWidgetNode.queryRootWidgetNode()) == null)) {
            DXWidgetRefreshOption a2 = new DXWidgetRefreshOption.a().d(true).g(true).c(1).a();
            DinamicXEngine dinamicXEngine = this.c;
            if (dinamicXEngine != null) {
                dinamicXEngine.I0(queryRootWidgetNode, 0, a2);
            }
        }
        if (!this.i && d()) {
            DXRootView dXRootView2 = this.e;
            if (dXRootView2 != null && dXRootView2.getChildCount() == 2) {
                z = true;
            }
            this.i = z;
            lcn.a(RVLLevel.Error, "Themis/TMSActTabBar").j("updateShadow").a("updateShadowSuccess", Boolean.valueOf(this.i)).f();
            a();
        }
    }

    @Override // tb.lxd
    public boolean m(int i, TabBarItem tabBarItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b2b87fff", new Object[]{this, new Integer(i), tabBarItem})).booleanValue();
        }
        ckf.g(tabBarItem, "tabBarItemModel");
        Object obj = this.b.get("items");
        JSONArray jSONArray = obj instanceof JSONArray ? (JSONArray) obj : null;
        if (jSONArray == null || jSONArray.size() >= 5 || i < 0 || i > jSONArray.size()) {
            return false;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("iconNormal", (Object) tabBarItem.getIconNormal());
        jSONObject.put("iconSelected", (Object) tabBarItem.getIconSelected());
        xhv xhvVar = xhv.INSTANCE;
        jSONArray.add(i, jSONObject);
        int i2 = this.h;
        if (i <= i2) {
            i2++;
        }
        r(i2);
        return true;
    }

    @Override // tb.lxd
    public void s(TabBar tabBar) {
        DXEngineConfig dXEngineConfig;
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b9e055f", new Object[]{this, tabBar});
            return;
        }
        ckf.g(tabBar, "tabBar");
        boolean invisible = tabBar.getInvisible();
        this.b.put((JSONObject) "background", "#FFFFFFFF");
        this.b.put((JSONObject) "currentIndex", (String) 0);
        JSONArray jSONArray = new JSONArray();
        List<TabBarItem> items = tabBar.getItems();
        if (items != null) {
            for (TabBarItem tabBarItem : items) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put((JSONObject) "iconNormal", tabBarItem.getIconNormal());
                jSONObject.put((JSONObject) "iconSelected", tabBarItem.getIconSelected());
                jSONArray.add(jSONObject);
            }
        }
        this.b.put((JSONObject) "items", (String) jSONArray);
        boolean z = b() && o9s.j(this.f23852a);
        if (z) {
            dXEngineConfig = new DXEngineConfig.b(TMSCalendarBridge.namespace).h0(true).U(true).F();
        } else {
            dXEngineConfig = new DXEngineConfig.b(TMSCalendarBridge.namespace).F();
        }
        if (z) {
            dXEngineConfig.b(true, true);
        }
        lcn.f(RVLLevel.Info, "Themis/TMSActTabBar", ckf.p("adaptPadAndFold = ", Boolean.valueOf(z)));
        DinamicXEngine dinamicXEngine = new DinamicXEngine(dXEngineConfig);
        dinamicXEngine.W0(34696035233L, this.f);
        this.c = dinamicXEngine;
        DXTemplateItem dXTemplateItem = new DXTemplateItem();
        dXTemplateItem.f7343a = "uniapp_act_tabbar";
        dXTemplateItem.b = g();
        String f = f();
        if (!TextUtils.isEmpty(f)) {
            dXTemplateItem.c = f;
        }
        if (z) {
            dXTemplateItem.g = true;
        }
        xhv xhvVar = xhv.INSTANCE;
        DXTemplateItem u = dinamicXEngine.u(dXTemplateItem);
        this.d = u;
        if (u == null) {
            lcn.a(RVLLevel.Error, "Themis/TMSActTabBar").a("fetchTemplate", "dxTemplateItem is null").f();
            return;
        }
        StringBuilder sb = new StringBuilder("version is ");
        DXTemplateItem dXTemplateItem2 = this.d;
        DXResult<DXRootView> dXResult = null;
        sb.append(dXTemplateItem2 == null ? null : Long.valueOf(dXTemplateItem2.b));
        sb.append(", url: ");
        DXTemplateItem dXTemplateItem3 = this.d;
        sb.append((Object) (dXTemplateItem3 == null ? null : dXTemplateItem3.c));
        lcn.g("Themis/TMSActTabBar", "fetchTemplate", sb.toString());
        DinamicXEngine dinamicXEngine2 = this.c;
        if (dinamicXEngine2 != null) {
            dXResult = dinamicXEngine2.o(this.f23852a, this.d);
        }
        if (dXResult == null) {
            lcn.a(RVLLevel.Error, "Themis/TMSActTabBar").a("createView", "createViewResult is null").f();
            return;
        }
        DXRootView dXRootView = dXResult.f7291a;
        this.e = dXRootView;
        if (dXRootView == null) {
            lcn.a(RVLLevel.Error, "Themis/TMSActTabBar").a("createView", "dxRootView is null").f();
            return;
        }
        DinamicXEngine dinamicXEngine3 = this.c;
        if (dinamicXEngine3 == null) {
            lcn.a(RVLLevel.Error, "Themis/TMSActTabBar").a("createView", "engine is null").f();
            return;
        }
        DXResult<DXRootView> j1 = dinamicXEngine3.j1(dXRootView, this.b);
        if (j1 != null && j1.d()) {
            lcn.a(RVLLevel.Error, "Themis/TMSActTabBar").a("createView", "renderResult is null").f();
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, xcs.a(this.f23852a, 64.0f));
        DXRootView dXRootView2 = this.e;
        if (dXRootView2 != null) {
            dXRootView2.setClipChildren(false);
            dXRootView2.setClipToPadding(false);
        }
        FrameLayout frameLayout = this.g;
        frameLayout.setClipChildren(false);
        frameLayout.setClipToPadding(false);
        if (c()) {
            frameLayout.setOnClickListener(b.INSTANCE);
        }
        if (!d()) {
            a();
        }
        layoutParams.bottomMargin = xcs.a(frameLayout.getContext(), 25.0f);
        frameLayout.addView(this.e, layoutParams);
        if (invisible) {
            i = 8;
        }
        frameLayout.setVisibility(i);
    }

    @Override // tb.lxd
    public boolean removeTabItem(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fd32b6bc", new Object[]{this, new Integer(i)})).booleanValue();
        }
        try {
            Object obj = this.b.get("items");
            JSONArray jSONArray = obj instanceof JSONArray ? (JSONArray) obj : null;
            if (jSONArray != null && jSONArray.size() > 2 && i >= 0 && i < h()) {
                jSONArray.remove(i);
                int i2 = this.h;
                if (i < i2) {
                    i2--;
                }
                r(i2);
                return true;
            }
        } catch (Exception unused) {
        }
        return false;
    }
}
