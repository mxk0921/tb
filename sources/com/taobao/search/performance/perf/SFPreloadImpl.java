package com.taobao.search.performance.perf;

import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.datasource.impl.cell.BaseCellBean;
import com.taobao.android.searchbaseframe.nx3.bean.MuiseBean;
import com.taobao.android.searchbaseframe.nx3.bean.MuiseCellBean;
import com.taobao.android.searchbaseframe.nx3.bean.TemplateBean;
import com.taobao.android.searchbaseframe.util.ListStyle;
import com.taobao.android.weex_framework.a;
import com.taobao.android.weex_uikit.ui.MUSView;
import com.taobao.search.m3.widget.M3ListContainer;
import com.taobao.search.m3.widget.M3WfContainer;
import com.taobao.search.performance.perf.SFPreloadImpl;
import com.taobao.search.sf.DecorationProvider;
import com.taobao.search.sf.datasource.CommonSearchResult;
import com.taobao.tao.Globals;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import tb.a83;
import tb.abx;
import tb.acx;
import tb.b83;
import tb.bsh;
import tb.c4o;
import tb.ckf;
import tb.cpc;
import tb.d1a;
import tb.eno;
import tb.flo;
import tb.fnh;
import tb.fw;
import tb.jjt;
import tb.jrh;
import tb.kgw;
import tb.kld;
import tb.krm;
import tb.ksm;
import tb.mdd;
import tb.onh;
import tb.p1p;
import tb.pnh;
import tb.q0j;
import tb.rpc;
import tb.snl;
import tb.t2o;
import tb.tzd;
import tb.vxm;
import tb.xhv;
import tb.yak;
import tb.yko;
import tb.zuo;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class SFPreloadImpl implements kld, pnh, tzd {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Activity f11600a;
    public final fnh b = new fnh();
    public String c = "";
    public String d = "";
    public String e = "";
    public bsh f;
    public jrh g;
    public String h;
    public boolean i;
    public boolean j;
    public boolean k;

    static {
        t2o.a(815792837);
        t2o.a(815792815);
        t2o.a(815792831);
        t2o.a(993001762);
    }

    public SFPreloadImpl(Activity activity) {
        ckf.g(activity, "activity");
        this.f11600a = activity;
    }

    public static final xhv C(SFPreloadImpl sFPreloadImpl, MuiseBean muiseBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xhv) ipChange.ipc$dispatch("64bb9f6d", new Object[]{sFPreloadImpl, muiseBean});
        }
        ckf.g(sFPreloadImpl, "this$0");
        ckf.g(muiseBean, "$sortBean");
        ksm ksmVar = new ksm(sFPreloadImpl.e, sFPreloadImpl.f11600a, yak.f31939a, null, null, null, null);
        TemplateBean y = ksmVar.y(muiseBean);
        HashMap hashMap = new HashMap();
        hashMap.put("model", muiseBean.model);
        HashMap hashMap2 = new HashMap();
        hashMap2.put("containerWidth", "200");
        hashMap.put("status", hashMap2);
        ksmVar.L(muiseBean, hashMap);
        fnh fnhVar = sFPreloadImpl.b;
        ckf.d(y);
        fnhVar.d(y.templateName, y.version, ksmVar.x());
        Activity activity = sFPreloadImpl.f11600a;
        cpc cpcVar = activity instanceof cpc ? (cpc) activity : null;
        if (cpcVar == null) {
            return null;
        }
        a x = ksmVar.x();
        ckf.f(x, "getMUSInstance(...)");
        cpcVar.v0(x);
        return xhv.INSTANCE;
    }

    public static final xhv f(MuiseCellBean muiseCellBean, HashMap hashMap, krm krmVar, SFPreloadImpl sFPreloadImpl, TemplateBean templateBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xhv) ipChange.ipc$dispatch("4e201c15", new Object[]{muiseCellBean, hashMap, krmVar, sFPreloadImpl, templateBean});
        }
        ckf.g(muiseCellBean, "$bean");
        ckf.g(hashMap, "$status");
        ckf.g(krmVar, "$renderer");
        ckf.g(sFPreloadImpl, "this$0");
        HashMap hashMap2 = new HashMap();
        hashMap2.put("model", muiseCellBean.mMuiseBean.model);
        hashMap2.put("status", hashMap);
        krmVar.L(muiseCellBean.mMuiseBean, hashMap2);
        fnh fnhVar = sFPreloadImpl.b;
        ckf.d(templateBean);
        fnhVar.c(templateBean.templateName, templateBean.version, krmVar.x());
        Activity activity = sFPreloadImpl.f11600a;
        cpc cpcVar = activity instanceof cpc ? (cpc) activity : null;
        if (cpcVar == null) {
            return null;
        }
        a x = krmVar.x();
        ckf.f(x, "getMUSInstance(...)");
        cpcVar.v0(x);
        return xhv.INSTANCE;
    }

    public void A(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9ea50bad", new Object[]{this, view});
            return;
        }
        ckf.g(view, "view");
        this.b.n(view);
    }

    public void B() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("deb96e34", new Object[]{this});
        }
    }

    @Override // tb.tzd
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("38126c45", new Object[]{this});
        }
    }

    @Override // tb.pnh
    public void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c8268196", new Object[]{this, str});
        } else if (!this.k) {
            if (ckf.b(this.d, str)) {
                r();
            } else if (ckf.b(this.e, str)) {
                t();
            }
        }
    }

    @Override // tb.tzd
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6c779129", new Object[]{this});
            return;
        }
        jrh jrhVar = this.g;
        if (jrhVar != null) {
            h(jrhVar, false);
        }
    }

    public final void g(jrh jrhVar) {
        List<BaseCellBean> cells;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f3d49b8", new Object[]{this, jrhVar});
            return;
        }
        CommonSearchResult commonSearchResult = (CommonSearchResult) jrhVar.getTotalSearchResult();
        if (!(commonSearchResult == null || (cells = commonSearchResult.getCells()) == null)) {
            for (BaseCellBean baseCellBean : cells) {
                String str = baseCellBean.type;
                ckf.f(str, "type");
                if (ckf.b(str, a83.CARD_M3)) {
                    i(jrhVar, a83.CARD_M3);
                    eno.f(Globals.getApplication(), a83.KEY_MAIN_SEARCH_CARD_TYPE, a83.CARD_M3);
                    return;
                } else if (ckf.b(str, a83.CARD_NEW_M3)) {
                    i(jrhVar, a83.CARD_NEW_M3);
                    eno.f(Globals.getApplication(), a83.KEY_MAIN_SEARCH_CARD_TYPE, a83.CARD_NEW_M3);
                    return;
                }
            }
        }
        i(jrhVar, this.d);
    }

    public final void h(jrh jrhVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3836b1d4", new Object[]{this, jrhVar, new Boolean(z)});
        } else if (!i(jrhVar, this.e) && z) {
            String str = this.e;
            this.h = str;
            jrhVar.registerTemplateListener(str, this);
        }
    }

    public final boolean i(jrh jrhVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("72b0364c", new Object[]{this, jrhVar, str})).booleanValue();
        }
        TemplateBean template = jrhVar.getTemplate(str);
        if (template == null) {
            return true;
        }
        rpc.c templateFile = jrhVar.getTemplateFile(template.url);
        if (templateFile == null) {
            return false;
        }
        jjt.INSTANCE.e(str, templateFile, template);
        return true;
    }

    public void j() {
        jrh jrhVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        this.b.e();
        jjt.INSTANCE.m(this);
        if (!TextUtils.isEmpty(this.h) && (jrhVar = this.g) != null) {
            String str = this.h;
            ckf.d(str);
            jrhVar.unregisterTemplateListener(str, this);
        }
    }

    public void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("509c2de6", new Object[]{this});
        } else {
            this.b.o();
        }
    }

    public void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("77cea363", new Object[]{this});
        } else {
            this.b.f();
        }
    }

    public void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6378cbc3", new Object[]{this});
        } else {
            this.b.m(this.f11600a);
        }
    }

    public void n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc58df7c", new Object[]{this});
            return;
        }
        String a2 = flo.a(this.f11600a.getIntent());
        this.c = a2;
        a83 a83Var = a83.INSTANCE;
        this.d = a83Var.a(a2);
        this.e = a83Var.c(this.c);
        ArrayList arrayList = new ArrayList();
        jjt jjtVar = jjt.INSTANCE;
        if (!jjtVar.i(this.d)) {
            arrayList.add(this.d);
        } else {
            this.i = true;
        }
        if (a83Var.d(this.c)) {
            if (!jjtVar.i(this.e)) {
                arrayList.add(this.e);
            } else {
                this.j = true;
            }
        }
        if (!arrayList.isEmpty()) {
            jjtVar.l(this);
            Iterator it = arrayList.iterator();
            ckf.f(it, "iterator(...)");
            while (it.hasNext()) {
                Object next = it.next();
                ckf.f(next, "next(...)");
                jjt.INSTANCE.j((String) next);
            }
        }
    }

    public M3ListContainer o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (M3ListContainer) ipChange.ipc$dispatch("1a8c82be", new Object[]{this});
        }
        return this.b.g();
    }

    public M3WfContainer p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (M3WfContainer) ipChange.ipc$dispatch("b4aae6e7", new Object[]{this});
        }
        return this.b.h();
    }

    public boolean q(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("68fad86e", new Object[]{this, str, str2})).booleanValue();
        }
        ckf.g(str, "tItemType");
        ckf.g(str2, "version");
        return this.b.i(str, str2);
    }

    public final void s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bda5b6a2", new Object[]{this});
        } else if (!this.k) {
            if (this.i) {
                r();
            }
            if (this.j) {
                t();
            }
        }
    }

    public final void t() {
        final MuiseBean k;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab9318f8", new Object[]{this});
        } else if (!this.f11600a.isFinishing() && !kgw.b(this.f11600a) && a83.INSTANCE.d(this.c) && jjt.INSTANCE.g(this.e) != null && (k = b83.INSTANCE.k(this.e)) != null) {
            new d1a() { // from class: tb.mmz
                @Override // tb.d1a
                public final Object invoke() {
                    xhv C;
                    C = SFPreloadImpl.C(SFPreloadImpl.this, k);
                    return C;
                }
            }.invoke();
        }
    }

    public void u(jrh jrhVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4469299e", new Object[]{this, jrhVar, new Boolean(z)});
            return;
        }
        ckf.g(jrhVar, c4o.KEY_DATA_SOURCE);
        this.k = true;
        this.g = jrhVar;
        if (z) {
            g(jrhVar);
            h(jrhVar, jrhVar.V0());
            mdd b = vxm.b.b(snl.f28161a.f(this.f11600a).b());
            b.a(q0j.BIZ_CONTEXT_KEY_CARD_TYPE, this.d);
            b.a("channelSrp", this.c);
        }
    }

    public void v(abx abxVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("722e6e5a", new Object[]{this, abxVar});
            return;
        }
        fnh fnhVar = this.b;
        View decorView = this.f11600a.getWindow().getDecorView();
        ckf.e(decorView, "null cannot be cast to non-null type android.view.ViewGroup");
        fnhVar.j((ViewGroup) decorView);
        if (abxVar != null) {
            bsh bshVar = (bsh) abxVar;
            this.f = bshVar;
            z(bshVar);
        }
    }

    public void w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("315dbf7d", new Object[]{this});
        }
    }

    public void x(String str, String str2, fw fwVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fc53b73f", new Object[]{this, str, str2, fwVar});
        } else {
            this.b.l(str, str2, fwVar);
        }
    }

    public void y(String str, String str2, fw fwVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3de3522", new Object[]{this, str, str2, fwVar});
        } else {
            this.b.k(str, str2, fwVar);
        }
    }

    public final void z(bsh bshVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e4c1a1b", new Object[]{this, bshVar});
        } else {
            s();
        }
    }

    public final void r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("261f1e24", new Object[]{this});
        } else if (!this.f11600a.isFinishing()) {
            if (kgw.b(this.f11600a)) {
                onh.d().b();
                return;
            }
            final HashMap hashMap = new HashMap();
            hashMap.put("containerWidth", String.valueOf(p1p.d(DecorationProvider.Tb2021Decoration.d(ListStyle.WATERFALL, zuo.e()))));
            hashMap.put("layoutStyle", 1);
            hashMap.put("preload", "true");
            final MuiseCellBean j = b83.INSTANCE.j(this.d);
            if (!(j == null || jjt.INSTANCE.g(this.d) == null)) {
                int b = a83.INSTANCE.b();
                for (int i = 0; i < b; i++) {
                    a e = onh.d().e();
                    String str = this.d;
                    Activity activity = this.f11600a;
                    yko ykoVar = yak.f31939a;
                    bsh bshVar = this.f;
                    cpc cpcVar = null;
                    final krm krmVar = new krm(str, activity, ykoVar, bshVar != null ? (acx) bshVar.getModel() : null, null, null);
                    final TemplateBean y = krmVar.y(j.mMuiseBean);
                    if (e == null || e.isDestroyed()) {
                        new d1a() { // from class: tb.lmz
                            @Override // tb.d1a
                            public final Object invoke() {
                                xhv f;
                                f = SFPreloadImpl.f(MuiseCellBean.this, hashMap, krmVar, this, y);
                                return f;
                            }
                        }.invoke();
                    } else {
                        e.resetContext(this.f11600a);
                        if (e.getRenderRoot() instanceof MUSView) {
                            View renderRoot = e.getRenderRoot();
                            ckf.e(renderRoot, "null cannot be cast to non-null type com.taobao.android.weex_uikit.ui.MUSView");
                            ((MUSView) renderRoot).setMountContext(this.f11600a);
                        }
                        fnh fnhVar = this.b;
                        ckf.d(y);
                        fnhVar.c(y.templateName, y.version, e);
                        Activity activity2 = this.f11600a;
                        if (activity2 instanceof cpc) {
                            cpcVar = (cpc) activity2;
                        }
                        if (cpcVar != null) {
                            cpcVar.v0(e);
                        }
                    }
                }
                onh.d().b();
            }
        }
    }
}
