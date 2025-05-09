package tb;

import android.app.Activity;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.datasource.impl.cell.BaseCellBean;
import com.taobao.android.searchbaseframe.xsl.module.XslModule;
import com.taobao.search.common.util.LimitedLinkedList;
import com.taobao.search.jarvis.bean.DynamicCardBean;
import com.taobao.search.mmd.datasource.bean.AuctionBaseBean;
import com.taobao.search.sf.datasource.CommonBaseDatasource;
import com.taobao.search.sf.datasource.CommonSearchResult;
import com.taobao.search.sf.realtimetag.IRealTimeTagContainer;
import com.taobao.search.sf.widgets.list.listcell.baseauction.SFAuctionBaseCellBean;
import java.util.Map;
import org.json.JSONException;
import tb.i5p;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class okn {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final CommonBaseDatasource f25446a;
    public String b;
    public IRealTimeTagContainer c;
    public SFAuctionBaseCellBean d;
    public or7 g;
    public or7 h;
    public l48 i;
    public or7 k;
    public l48 l;
    public final StringBuilder e = new StringBuilder();
    public final LimitedLinkedList<String> f = new LimitedLinkedList<>(20);
    public boolean j = false;
    public boolean m = false;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements hk4<m4p> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a(okn oknVar) {
        }

        /* renamed from: a */
        public void accept(m4p m4pVar) throws Exception {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("63d045bb", new Object[]{this, m4pVar});
            } else {
                c4p.m("RealTimeTagManager", "send clickTrace success");
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class b implements hk4<DynamicCardBean> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f25447a;

        public b(int i) {
            this.f25447a = i;
        }

        /* renamed from: a */
        public void accept(DynamicCardBean dynamicCardBean) throws Exception {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("36da71dc", new Object[]{this, dynamicCardBean});
                return;
            }
            if (dynamicCardBean.mTemplates != null) {
                com.taobao.android.weex_framework.c cVar = new com.taobao.android.weex_framework.c();
                cVar.q(okn.a(okn.this).getBundleUrl());
                cVar.r(okn.a(okn.this).getTrackingPageName());
                xjt.c(cVar, dynamicCardBean.mTemplates, XslModule.d(), okn.a(okn.this).getTemplateFiles());
                okn.a(okn.this).mergeTemplates(dynamicCardBean.mTemplates);
            }
            BaseCellBean baseCellBean = dynamicCardBean.mDynamicCellBean;
            if (baseCellBean instanceof SFAuctionBaseCellBean) {
                SFAuctionBaseCellBean sFAuctionBaseCellBean = (SFAuctionBaseCellBean) baseCellBean;
                String string = dynamicCardBean.mOriginData.getString("cardRn");
                sFAuctionBaseCellBean.rn = string;
                AuctionBaseBean auctionBaseBean = sFAuctionBaseCellBean.auctionBaseBean;
                if (auctionBaseBean != null) {
                    auctionBaseBean.rn = string;
                }
            }
            okn.b(okn.this, this.f25447a, dynamicCardBean);
            okn.a(okn.this).postEvent(dynamicCardBean);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class c implements hk4<DynamicCardBean> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        /* renamed from: a */
        public void accept(DynamicCardBean dynamicCardBean) throws Exception {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("36da71dc", new Object[]{this, dynamicCardBean});
                return;
            }
            if (dynamicCardBean.mTemplates != null) {
                com.taobao.android.weex_framework.c cVar = new com.taobao.android.weex_framework.c();
                cVar.q(okn.a(okn.this).getBundleUrl());
                cVar.r(okn.a(okn.this).getTrackingPageName());
                xjt.c(cVar, dynamicCardBean.mTemplates, yak.f31939a, okn.a(okn.this).getTemplateFiles());
                okn.a(okn.this).mergeTemplates(dynamicCardBean.mTemplates);
            }
            okn oknVar = okn.this;
            okn.b(oknVar, okn.c(oknVar).g(), dynamicCardBean);
            okn.a(okn.this).postEvent(dynamicCardBean);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class d implements hk4<DynamicCardBean> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public d() {
        }

        /* renamed from: a */
        public void accept(DynamicCardBean dynamicCardBean) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("36da71dc", new Object[]{this, dynamicCardBean});
                return;
            }
            if (dynamicCardBean.mTemplates != null) {
                com.taobao.android.weex_framework.c cVar = new com.taobao.android.weex_framework.c();
                cVar.q(okn.a(okn.this).getBundleUrl());
                cVar.r(okn.a(okn.this).getTrackingPageName());
                xjt.c(cVar, dynamicCardBean.mTemplates, yak.f31939a, okn.a(okn.this).getTemplateFiles());
                okn.a(okn.this).mergeTemplates(dynamicCardBean.mTemplates);
            }
            okn.a(okn.this).postEvent(dynamicCardBean);
        }
    }

    static {
        t2o.a(815793450);
    }

    public okn(CommonBaseDatasource commonBaseDatasource) {
        this.f25446a = commonBaseDatasource;
    }

    public static /* synthetic */ CommonBaseDatasource a(okn oknVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CommonBaseDatasource) ipChange.ipc$dispatch("7c66551e", new Object[]{oknVar});
        }
        return oknVar.f25446a;
    }

    public static /* synthetic */ void b(okn oknVar, int i, DynamicCardBean dynamicCardBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8be6b16b", new Object[]{oknVar, new Integer(i), dynamicCardBean});
        } else {
            oknVar.u(i, dynamicCardBean);
        }
    }

    public static /* synthetic */ l48 c(okn oknVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (l48) ipChange.ipc$dispatch("75692246", new Object[]{oknVar});
        }
        return oknVar.i;
    }

    public void A(String str, Map<String, String> map, Activity activity, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d043f62", new Object[]{this, str, map, activity, new Integer(i)});
            return;
        }
        or7 or7Var = this.g;
        if (or7Var != null && !or7Var.isDisposed()) {
            this.g.dispose();
        }
        if (map != null) {
            this.b = map.get("itemId");
        }
        eu3 eu3Var = new eu3(str, map, i);
        eu3Var.h(this.e.toString());
        this.g = new i5p.c().c(eu3Var).a().d().n(new a(this), new u0p("RealTimeTagManager"));
    }

    public void d(String str, Map<String, String> map, Activity activity, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fca984b2", new Object[]{this, str, map, activity, new Integer(i)});
            return;
        }
        or7 or7Var = this.g;
        if (or7Var != null && !or7Var.isDisposed()) {
            this.g.dispose();
        }
        if (map != null) {
            this.b = map.get("itemId");
        }
        eu3 eu3Var = new eu3(str, map, i);
        eu3Var.h(this.e.toString());
        this.g = new i5p.c().c(eu3Var).b(new i48((CommonSearchResult) this.f25446a.getTotalSearchResult())).a().e().n(new b(i), new u0p("RealTimeTagManager"));
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        or7 or7Var = this.g;
        if (or7Var != null && !or7Var.isDisposed()) {
            this.g.dispose();
            this.g = null;
        }
        or7 or7Var2 = this.h;
        if (or7Var2 != null && !or7Var2.isDisposed()) {
            this.h.dispose();
            this.h = null;
        }
    }

    public String f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7b99223b", new Object[]{this});
        }
        return yuf.INSTANCE.a(this.f, ",");
    }

    public String g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("beb1faf5", new Object[]{this});
        }
        return this.b;
    }

    public JSONObject h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("236c23a8", new Object[]{this});
        }
        l48 l48Var = this.l;
        if (l48Var == null) {
            return null;
        }
        return l48Var.e;
    }

    public void i(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca3cf347", new Object[]{this, map});
            return;
        }
        l48 l48Var = this.l;
        if (l48Var != null) {
            l48Var.i(map);
        }
    }

    public void j(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac8b06", new Object[]{this, map});
            return;
        }
        l48 l48Var = this.i;
        if (l48Var != null) {
            l48Var.h(map);
        }
    }

    public void k(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f04140c", new Object[]{this, map});
            return;
        }
        l48 l48Var = this.i;
        if (l48Var != null) {
            l48Var.i(map);
        }
    }

    public boolean l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("511d9fad", new Object[]{this})).booleanValue();
        }
        return this.m;
    }

    public boolean m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7689b15b", new Object[]{this})).booleanValue();
        }
        return this.j;
    }

    public boolean n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e8aa4ddd", new Object[]{this})).booleanValue();
        }
        l48 l48Var = this.l;
        if (l48Var == null) {
            return false;
        }
        return l48Var.j();
    }

    public final org.json.JSONObject o(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (org.json.JSONObject) ipChange.ipc$dispatch("1758a9b4", new Object[]{this, str});
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return new org.json.JSONObject(str);
        } catch (JSONException e) {
            c4p.o("RealTimeTagManager", "parseJarvisResult", e);
            return null;
        }
    }

    public void p(String str, String str2, Map<String, String> map, int i, boolean z, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("74c61b27", new Object[]{this, str, str2, map, new Integer(i), new Boolean(z), jSONObject});
            return;
        }
        this.m = true;
        l48 l48Var = new l48(str, str2, map, i);
        this.l = l48Var;
        l48Var.n(jSONObject);
        this.l.l(z);
    }

    public void q(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("520fc82d", new Object[]{this, str, map});
            return;
        }
        this.b = str;
        this.j = true;
        map.put("clickItems", yuf.INSTANCE.a(this.f, ","));
        this.i = new l48("", map, 0);
    }

    public void r(String str, Map<String, String> map, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("efe9b076", new Object[]{this, str, map, new Integer(i)});
            return;
        }
        this.j = true;
        map.put("clickItems", yuf.INSTANCE.a(this.f, ","));
        this.i = new l48(str, map, i);
    }

    public void s(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("31e41e7b", new Object[]{this, str});
        } else if (!TextUtils.isEmpty(str)) {
            this.f.add(str);
        }
    }

    public void t(IRealTimeTagContainer iRealTimeTagContainer, SFAuctionBaseCellBean sFAuctionBaseCellBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f039dc9", new Object[]{this, iRealTimeTagContainer, sFAuctionBaseCellBean});
            return;
        }
        this.c = iRealTimeTagContainer;
        this.d = sFAuctionBaseCellBean;
    }

    public final void u(int i, DynamicCardBean dynamicCardBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fff3488c", new Object[]{this, new Integer(i), dynamicCardBean});
            return;
        }
        BaseCellBean baseCellBean = dynamicCardBean.mDynamicCellBean;
        if (baseCellBean != null) {
            if (this.e.length() > 0) {
                this.e.append(";");
            }
            StringBuilder sb = this.e;
            sb.append(i);
            sb.append("#");
            sb.append(baseCellBean.cardType);
        }
    }

    public void v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ad14c5c", new Object[]{this});
            return;
        }
        IRealTimeTagContainer iRealTimeTagContainer = this.c;
        if (iRealTimeTagContainer != null) {
            iRealTimeTagContainer.clearTag();
        }
        SFAuctionBaseCellBean sFAuctionBaseCellBean = this.d;
        if (sFAuctionBaseCellBean != null) {
            sFAuctionBaseCellBean.dynamicCardBean = null;
        }
    }

    public void w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a7bb043c", new Object[]{this});
        } else {
            x(null, null);
        }
    }

    public void x(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2aac6bb", new Object[]{this, str, str2});
        } else if (l()) {
            if (this.l == null) {
                this.m = false;
                return;
            }
            or7 or7Var = this.k;
            if (or7Var != null && !or7Var.isDisposed()) {
                this.k.dispose();
            }
            if (!TextUtils.isEmpty(str)) {
                this.l.o(str);
                org.json.JSONObject o = o(str2);
                if (o != null) {
                    String optString = o.optString(r4p.KEY_JARVIS_FEATURE);
                    if (!TextUtils.isEmpty(optString)) {
                        this.l.m(optString);
                    }
                }
            }
            this.k = new i5p.c().c(this.l).b(new i48((CommonSearchResult) this.f25446a.getTotalSearchResult())).a().e().n(new d(), new u0p("CommonDynamicCardRequest"));
            this.m = false;
        }
    }

    public void y(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1f3cffb", new Object[]{this, str, str2});
        } else if (m()) {
            if (this.i == null) {
                this.j = false;
                return;
            }
            or7 or7Var = this.h;
            if (or7Var != null && !or7Var.isDisposed()) {
                this.h.dispose();
            }
            this.i.o(str);
            this.i.k(this.e.toString());
            org.json.JSONObject o = o(str2);
            if (o != null) {
                String optString = o.optString("item_id");
                String optString2 = o.optString(r4p.KEY_JARVIS_FEATURE);
                if (TextUtils.equals(optString, this.b) && !TextUtils.isEmpty(optString2)) {
                    this.i.m(optString2);
                }
            }
            this.h = new i5p.c().c(this.i).b(new i48((CommonSearchResult) this.f25446a.getTotalSearchResult())).a().e().n(new c(), new u0p("DynamicCardRequest"));
            this.j = false;
        }
    }

    public void z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("788e6256", new Object[]{this});
            return;
        }
        StringBuilder sb = this.e;
        sb.delete(0, sb.length());
        this.f.clear();
    }
}
