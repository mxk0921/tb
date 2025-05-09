package com.taobao.tao.topmultitab.service.searchbar.impl.searchview;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRenderOptions;
import com.taobao.android.dinamicx.DXResult;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.dinamicx.template.download.DXTemplateItem;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.android.festival.FestivalMgr;
import com.taobao.tao.topmultitab.service.lifecycle.IHomePageLifecycleService;
import com.taobao.tao.topmultitab.service.view.IHomeViewService;
import tb.b0p;
import tb.b9b;
import tb.h5b;
import tb.n2b;
import tb.phg;
import tb.psl;
import tb.r5a;
import tb.t2o;
import tb.tit;
import tb.u3b;
import tb.uqa;
import tb.vqa;
import tb.wcc;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class SearchBarView extends FrameLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String STYLE = "style";
    public static final String S_ITEM = "item";
    private DXRootView mDxSearchView;
    private String mFestivalTag;
    private boolean mIsHudDevice;
    private IHomePageLifecycleService mLifecycleService;
    private psl mProcessor;
    private b0p mSearchBarAppearStatus;
    private JSONObject mSearchDataSection;
    private IHomeViewService mViewService;
    private boolean mIsScaleEnable = h5b.e().g();
    private final u3b mUiMonitor = new u3b();

    static {
        t2o.a(729810338);
    }

    public SearchBarView(Context context) {
        super(context);
        init();
    }

    private void checkCreateView(DXTemplateItem dXTemplateItem, DXTemplateItem dXTemplateItem2, DinamicXEngine dinamicXEngine, vqa vqaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5fcf3bfc", new Object[]{this, dXTemplateItem, dXTemplateItem2, dinamicXEngine, vqaVar});
        } else if (dXTemplateItem == null) {
        } else {
            if (!dXTemplateItem.equals(dXTemplateItem2) || this.mDxSearchView == null || isDxConfigChange(dinamicXEngine)) {
                String str = "null";
                vqa g = vqaVar.e("模板信息变了;").g("原来模板名称", dXTemplateItem2 == null ? str : dXTemplateItem2.f7343a);
                if (dXTemplateItem2 != null) {
                    str = dXTemplateItem2.b + "";
                }
                g.g("原来模板版本", str).g("新模板名称", dXTemplateItem.f7343a).g("新模板版本", dXTemplateItem.b + "");
                removeAllViews();
                phg.m("createView_" + getTemplateName(dXTemplateItem));
                DXResult<DXRootView> z0 = dinamicXEngine.z0(getContext(), dXTemplateItem);
                phg.l("createView_" + getTemplateName(dXTemplateItem));
                DXRootView dXRootView = z0.f7291a;
                this.mDxSearchView = dXRootView;
                addView(dXRootView);
                dinamicXEngine.U0(this.mDxSearchView, this.mSearchBarAppearStatus);
                vqaVar.e("dxEngine  preCreateSearchView finish");
            }
        }
    }

    private void checkRenderTemplate(JSONObject jSONObject, DinamicXEngine dinamicXEngine, DXTemplateItem dXTemplateItem, vqa vqaVar, wcc wccVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cec9ac35", new Object[]{this, jSONObject, dinamicXEngine, dXTemplateItem, vqaVar, wccVar});
        } else if (this.mDxSearchView == null || dXTemplateItem == null) {
            r5a.i("Page_Home", 19999, "HomeSearchBarInitError", "");
            this.mUiMonitor.f(dXTemplateItem);
        } else {
            this.mFestivalTag = FestivalMgr.i().l("global", FestivalMgr.KEY_GLOBAL_ACTIONBAR_BG);
            this.mSearchDataSection = jSONObject;
            phg.m("bindData_" + getTemplateName(dXTemplateItem));
            DXRenderOptions.b E = new DXRenderOptions.b().E(new n2b(wccVar, jSONObject));
            Context context = this.mDxSearchView.getContext();
            DXRootView dXRootView = this.mDxSearchView;
            dinamicXEngine.i1(context, dXRootView, dXRootView.getDxTemplateItem(), jSONObject, -1, E.q());
            phg.l("bindData_" + getTemplateName(dXTemplateItem));
            vqaVar.g("皮肤背景标记festivalTag", this.mFestivalTag).e("绑定searchBar数据");
            r5a.l(jSONObject);
        }
    }

    private DXWidgetNode findWidgetNodeById(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXWidgetNode) ipChange.ipc$dispatch("43c84261", new Object[]{this, str});
        }
        DXRootView dXRootView = this.mDxSearchView;
        if (dXRootView == null) {
            uqa.b("SearchBar", "findWidgetNodeById", "mDxSearchView == null");
            return null;
        }
        DXWidgetNode expandWidgetNode = dXRootView.getExpandWidgetNode();
        if (expandWidgetNode != null) {
            return expandWidgetNode.queryWidgetNodeByUserId(str);
        }
        uqa.b("SearchBar", "findWidgetNodeById", "expandWidgetNode == null");
        return null;
    }

    private JSONObject getTemplateData(boolean z, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("63ffa6bd", new Object[]{this, new Boolean(z), jSONObject});
        }
        if (jSONObject == null) {
            return null;
        }
        if (!z) {
            return jSONObject.getJSONObject("template");
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("style");
        if (jSONObject2 == null) {
            return null;
        }
        return jSONObject2.getJSONObject("template");
    }

    private String getTemplateName(DXTemplateItem dXTemplateItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("885e7435", new Object[]{this, dXTemplateItem});
        }
        if (dXTemplateItem != null) {
            return dXTemplateItem.e();
        }
        return "";
    }

    private void init() {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
            return;
        }
        setBackgroundColor(0);
        if (b9b.e() || b9b.h()) {
            z = true;
        }
        this.mIsHudDevice = z;
        this.mSearchBarAppearStatus = new b0p(this, this.mUiMonitor);
        this.mProcessor = new psl();
    }

    public static /* synthetic */ Object ipc$super(SearchBarView searchBarView, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/topmultitab/service/searchbar/impl/searchview/SearchBarView");
    }

    private boolean isDxConfigChange(DinamicXEngine dinamicXEngine) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8a84174c", new Object[]{this, dinamicXEngine})).booleanValue();
        }
        if (!this.mIsHudDevice || this.mIsScaleEnable == dinamicXEngine.d().v()) {
            z = false;
        }
        this.mIsScaleEnable = dinamicXEngine.d().v();
        return z;
    }

    public void destroy() {
        b0p b0pVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        IHomeViewService iHomeViewService = this.mViewService;
        if (!(iHomeViewService == null || (b0pVar = this.mSearchBarAppearStatus) == null)) {
            iHomeViewService.removeOnPageChangeListener(b0pVar);
        }
        IHomePageLifecycleService iHomePageLifecycleService = this.mLifecycleService;
        if (iHomePageLifecycleService != null && this.mSearchBarAppearStatus != null) {
            iHomePageLifecycleService.getPageLifeCycleRegister().b(this.mSearchBarAppearStatus);
        }
    }

    public DXRootView getDX3SearchView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXRootView) ipChange.ipc$dispatch("62c6355a", new Object[]{this});
        }
        return this.mDxSearchView;
    }

    public boolean isDX3SearchViewReady() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("71f603cc", new Object[]{this})).booleanValue();
        }
        DXRootView dXRootView = this.mDxSearchView;
        if (dXRootView == null || dXRootView.getParent() == null) {
            return false;
        }
        return true;
    }

    public void onDxSearchBarViewAppear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("715895f9", new Object[]{this});
        } else {
            h5b.e().d().t0(this.mDxSearchView);
        }
    }

    public void onDxSearchBarViewDisAppear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d0ca774d", new Object[]{this});
        } else {
            h5b.e().d().u0(this.mDxSearchView);
        }
    }

    public void partialRefreshWidgetNode(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d2f7eb1", new Object[]{this, str});
            return;
        }
        DXRootView dXRootView = this.mDxSearchView;
        if (dXRootView == null) {
            uqa.b("SearchBar", "partialRefreshWidgetNode", "mDxSearchView == null");
        } else {
            this.mProcessor.b(str, dXRootView);
        }
    }

    public void postDXEvent(DXEvent dXEvent, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f920c59", new Object[]{this, dXEvent, str});
            return;
        }
        DXWidgetNode findWidgetNodeById = findWidgetNodeById(str);
        if (findWidgetNodeById != null) {
            findWidgetNodeById.postEvent(dXEvent);
        }
    }

    public void refreshDxSearchBarView(JSONObject jSONObject, wcc wccVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f65ebdbb", new Object[]{this, jSONObject, wccVar, new Boolean(z)});
            return;
        }
        vqa j = vqa.k().i("SearchBar").j("refreshDxSearchBarView");
        tit.a b = tit.b(getTemplateData(z, jSONObject));
        if (b == null) {
            j.e("compatibleDinamicTemplate == null");
            return;
        }
        DXTemplateItem u = h5b.e().d().u(b.b());
        DXRootView dXRootView = this.mDxSearchView;
        DXTemplateItem dxTemplateItem = dXRootView != null ? dXRootView.getDxTemplateItem() : null;
        DinamicXEngine d = h5b.e().d();
        if (dxTemplateItem == null || !dxTemplateItem.equals(u) || this.mSearchDataSection != jSONObject || isDxConfigChange(d)) {
            this.mSearchBarAppearStatus.t();
            checkCreateView(u, dxTemplateItem, d, j);
            checkRenderTemplate(jSONObject, d, u, j, wccVar);
            this.mSearchBarAppearStatus.s();
            j.a();
            return;
        }
        vqa g = j.g("模板名称", dxTemplateItem.f7343a);
        g.g("模板版本", dxTemplateItem.b + "").e("数据和模板信息都没有变;").a();
    }

    public void setHomePageContext(wcc wccVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5b026d7", new Object[]{this, wccVar});
        } else if (wccVar != null) {
            IHomeViewService iHomeViewService = (IHomeViewService) wccVar.a(IHomeViewService.class);
            this.mViewService = iHomeViewService;
            if (iHomeViewService != null) {
                iHomeViewService.addOnPageChangeListener(this.mSearchBarAppearStatus);
            }
            IHomePageLifecycleService iHomePageLifecycleService = (IHomePageLifecycleService) wccVar.a(IHomePageLifecycleService.class);
            this.mLifecycleService = iHomePageLifecycleService;
            if (iHomePageLifecycleService != null) {
                iHomePageLifecycleService.getPageLifeCycleRegister().a(this.mSearchBarAppearStatus);
            }
        }
    }

    public void updateWhenFestivalChanged() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d6dadc00", new Object[]{this});
            return;
        }
        vqa j = vqa.k().i("SearchBar").j("updateWhenFestivalChanged");
        if (this.mDxSearchView == null || this.mSearchDataSection == null) {
            j.e("mDxSearchView == null");
            return;
        }
        String l = FestivalMgr.i().l("global", FestivalMgr.KEY_GLOBAL_ACTIONBAR_BG);
        String str = this.mFestivalTag;
        if (str == null || !str.equals(l)) {
            this.mFestivalTag = l;
            this.mSearchBarAppearStatus.t();
            h5b.e().d().j1(this.mDxSearchView, JSON.parseObject(this.mSearchDataSection.toJSONString()));
            this.mSearchBarAppearStatus.s();
            j.e("reRender").a();
            return;
        }
        j.e("actionBarBackgroundColor is not change.");
    }

    public SearchBarView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init();
    }

    public SearchBarView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init();
    }
}
