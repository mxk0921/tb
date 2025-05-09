package tb;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.widget.FrameLayout;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.behavix.service.BUFS;
import com.taobao.android.meta.structure.list.MetaListWidget;
import com.taobao.android.searchbaseframe.xsl.module.XslModule;
import com.taobao.android.weex_framework.c;
import com.taobao.search.common.util.ClientIntelligenceHelper;
import com.taobao.search.jarvis.bean.DynamicCardBean;
import com.taobao.search.sf.datasource.CommonBaseDatasource;
import com.taobao.search.sf.datasource.CommonSearchResult;
import com.taobao.tao.util.TaoHelper;
import java.util.LinkedHashMap;
import java.util.List;
import tb.h1p;
import tb.i5p;
import tb.k48;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class k48 extends ww1 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public j48 e;
    public DynamicCardBean f;
    public boolean g = true;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static final class b implements hk4<DynamicCardBean> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ jrh f22394a;
        public final /* synthetic */ k48 b;

        public b(jrh jrhVar, k48 k48Var) {
            this.f22394a = jrhVar;
            this.b = k48Var;
        }

        public static final void c(k48 k48Var, DynamicCardBean dynamicCardBean) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a68d710a", new Object[]{k48Var, dynamicCardBean});
                return;
            }
            ckf.g(k48Var, "this$0");
            ckf.g(dynamicCardBean, "$result");
            j48 p = k48.p(k48Var);
            if (p != null) {
                p.a(dynamicCardBean);
            }
        }

        /* renamed from: a */
        public void accept(final DynamicCardBean dynamicCardBean) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("36da71dc", new Object[]{this, dynamicCardBean});
                return;
            }
            ckf.g(dynamicCardBean, "result");
            if (dynamicCardBean.mTemplates != null) {
                c cVar = new c();
                cVar.q(this.f22394a.getBundleUrl());
                cVar.r(this.f22394a.getTrackingPageName());
                xjt.c(cVar, dynamicCardBean.mTemplates, XslModule.d(), this.f22394a.getTemplateFiles());
                this.f22394a.mergeTemplates(dynamicCardBean.mTemplates);
            }
            Handler handler = new Handler(Looper.getMainLooper());
            final k48 k48Var = this.b;
            handler.post(new Runnable() { // from class: tb.x5z
                @Override // java.lang.Runnable
                public final void run() {
                    k48.b.c(k48.this, dynamicCardBean);
                }
            });
        }
    }

    static {
        t2o.a(815792893);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k48(MetaListWidget metaListWidget) {
        super(metaListWidget);
        ckf.g(metaListWidget, "widget");
    }

    public static /* synthetic */ Object ipc$super(k48 k48Var, String str, Object... objArr) {
        if (str.hashCode() == 840752859) {
            super.b();
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/refactor/list/DynamicCardPlugin");
    }

    public static final void o(k48 k48Var, DynamicCardBean dynamicCardBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5533a9ae", new Object[]{k48Var, dynamicCardBean});
            return;
        }
        ckf.g(k48Var, "this$0");
        ckf.g(dynamicCardBean, "$insert");
        j48 j48Var = k48Var.e;
        if (j48Var != null) {
            j48Var.a(dynamicCardBean);
        }
    }

    public static final /* synthetic */ j48 p(k48 k48Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (j48) ipChange.ipc$dispatch("fed87396", new Object[]{k48Var});
        }
        return k48Var.e;
    }

    @Override // tb.ww1, tb.hsi
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("321cdedb", new Object[]{this});
            return;
        }
        super.b();
        final DynamicCardBean dynamicCardBean = this.f;
        if (dynamicCardBean != null) {
            this.f = null;
            ROOT_VIEW view = a().getView();
            ckf.d(view);
            ((FrameLayout) view).post(new Runnable() { // from class: tb.w5z
                @Override // java.lang.Runnable
                public final void run() {
                    k48.o(k48.this, dynamicCardBean);
                }
            });
        }
        if (!this.g) {
            s();
        }
        this.g = false;
    }

    @Override // tb.ww1
    public void n(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b8b693f8", new Object[]{this, new Boolean(z)});
        } else if (z) {
            ((acx) a().getModel()).e().subscribe(this);
            if (!m()) {
                MetaListWidget a2 = a();
                o02 e = ((acx) a().getModel()).e();
                ckf.e(e, "null cannot be cast to non-null type com.taobao.search.sf.datasource.CommonBaseDatasource");
                this.e = new j48(a2, (CommonBaseDatasource) e);
            }
        }
    }

    public final void onEventMainThread(DynamicCardBean dynamicCardBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7bf57a6", new Object[]{this, dynamicCardBean});
            return;
        }
        ckf.g(dynamicCardBean, "dynamicCardBean");
        if (o4p.b1() || l()) {
            j48 j48Var = this.e;
            if (j48Var != null) {
                j48Var.a(dynamicCardBean);
                return;
            }
            return;
        }
        this.f = dynamicCardBean;
    }

    public final void s() {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa357b9c", new Object[]{this});
        } else if (o4p.p0()) {
            o02 e = ((acx) a().getModel()).e();
            ckf.e(e, "null cannot be cast to non-null type com.taobao.search.refactor.MSDataSource");
            jrh jrhVar = (jrh) e;
            CommonSearchResult commonSearchResult = (CommonSearchResult) jrhVar.getTotalSearchResult();
            if (commonSearchResult != null && (jSONObject = commonSearchResult.pageData) != null && (jSONObject2 = jSONObject.getJSONObject("clickBackParams")) != null && !jSONObject2.isEmpty()) {
                String string = jSONObject2.getString("equitySubsidyBiz");
                if (!TextUtils.isEmpty(string)) {
                    String q = q();
                    c4p.m("BufsComparePrice", "getBufsFeature:" + q);
                    if (r(q)) {
                        ckf.d(string);
                        u(jrhVar, commonSearchResult, string);
                        t(string, q);
                    }
                }
            }
        }
    }

    public final void t(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1f3cffb", new Object[]{this, str, str2});
            return;
        }
        o02 e = ((acx) a().getModel()).e();
        ckf.e(e, "null cannot be cast to non-null type com.taobao.search.refactor.MSDataSource");
        jrh jrhVar = (jrh) e;
        CommonSearchResult commonSearchResult = (CommonSearchResult) jrhVar.getTotalSearchResult();
        if (commonSearchResult != null) {
            n8u n8uVar = new n8u("30219", r4p.VALUE_MODULE_DYNAMIC_CARD);
            n8uVar.b("code", "equity_pop");
            n8uVar.b("equitySubsidyBiz", str);
            n8uVar.b("changeApp", "true");
            n8uVar.b("q", jrhVar.getKeyword());
            n8uVar.b("ttid", TaoHelper.getTTID());
            n8uVar.b("vm", "nw");
            n8uVar.b("bufsFeature", str2);
            new i5p.c().c(n8uVar).b(new i48(commonSearchResult)).a().e().n(new b(jrhVar, this), new u0p("DynamicCardPlugin"));
        }
    }

    public final void u(jrh jrhVar, CommonSearchResult commonSearchResult, String str) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4fc13a", new Object[]{this, jrhVar, commonSearchResult, str});
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("query", jrhVar.getKeyword());
        JSONObject jSONObject = commonSearchResult.pageInfo;
        if (jSONObject == null || (str2 = jSONObject.getString("for_bts")) == null) {
            str2 = "";
        }
        linkedHashMap.put("for_bts", str2);
        linkedHashMap.put(h1p.a.PARAM_KEY_FIRST_RN, commonSearchResult.getMainInfo().rn);
        linkedHashMap.put("industry_biz", str);
        sen.a("Page_SearchItemList", "switchapp_dpbt", linkedHashMap);
    }

    public final String q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("97d0bd", new Object[]{this});
        }
        BUFS.QueryArgs queryArgs = new BUFS.QueryArgs();
        queryArgs.addFilter("triggerIds", yz3.m("1", "7"));
        queryArgs.addFilter("pageName", xz3.e("Page_SearchItemList"));
        String feature = BUFS.getFeature((List<BUFS.QueryArgs>) xz3.e(queryArgs), "search.request.compare_price", ClientIntelligenceHelper.BIZ_ID_MAIN_SRP, "Page_SearchItemList", false);
        ckf.f(feature, "getFeature(...)");
        return feature;
    }

    public final boolean r(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5c722a67", new Object[]{this, str})).booleanValue();
        }
        try {
            JSONArray jSONArray = JSON.parseObject(str).getJSONArray("tb_bc_all_compare_price_vstr");
            if (jSONArray != null && !jSONArray.isEmpty()) {
                int size = jSONArray.size();
                for (int i = 0; i < size; i++) {
                    if (!TextUtils.isEmpty(jSONArray.getJSONObject(i).getString("triggerIds"))) {
                        return true;
                    }
                }
            }
            return false;
        } catch (Throwable th) {
            c4p.C("DynamicCardPlugin", "failed to parse bufs feature", th);
            return false;
        }
    }
}
