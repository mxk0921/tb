package com.taobao.search.m3.widget;

import android.app.Activity;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.view.animation.ScaleAnimation;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.triver.triver_shop.newShop.event.broadcast.a;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.meta.structure.childpage.MetaChildPageWidget;
import com.taobao.android.nav.Nav;
import com.taobao.android.searchbaseframe.datasource.impl.BaseSearchResult;
import com.taobao.android.searchbaseframe.list.WidgetViewHolder;
import com.taobao.android.searchbaseframe.util.ListStyle;
import com.taobao.android.task.Coordinator;
import com.taobao.schedule.ViewProxy;
import com.taobao.search.jarvis.bean.DynamicCardBean;
import com.taobao.search.m3.M3CellBean;
import com.taobao.search.m3.widget.BaseM3CellWidget;
import com.taobao.search.refactor.MSController;
import com.taobao.search.searchdoor.sf.config.TbSearchStyle;
import com.taobao.search.sf.datasource.CommonBaseDatasource;
import com.taobao.search.sf.datasource.CommonSearchResult;
import com.taobao.search.sf.realtimetag.IRealTimeTagContainer;
import com.ut.mini.UTAnalytics;
import com.ut.mini.internal.UTOriginalCustomHitBuilder;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Observable;
import java.util.Observer;
import java.util.Set;
import tb.acx;
import tb.asi;
import tb.c2v;
import tb.cca;
import tb.ckf;
import tb.dif;
import tb.drj;
import tb.eif;
import tb.f1p;
import tb.f4m;
import tb.f64;
import tb.g54;
import tb.g6p;
import tb.gf0;
import tb.h1p;
import tb.h6p;
import tb.hh1;
import tb.hhf;
import tb.jrh;
import tb.jx1;
import tb.jyf;
import tb.ktk;
import tb.lsk;
import tb.mfe;
import tb.mh1;
import tb.n4m;
import tb.o4m;
import tb.og3;
import tb.ohb;
import tb.p59;
import tb.pba;
import tb.peq;
import tb.pkn;
import tb.q5i;
import tb.qzp;
import tb.r4p;
import tb.rj9;
import tb.rp7;
import tb.ruk;
import tb.sen;
import tb.soc;
import tb.t2o;
import tb.toj;
import tb.tqk;
import tb.ude;
import tb.vop;
import tb.wg3;
import tb.wsq;
import tb.wuk;
import tb.wxi;
import tb.wyd;
import tb.xfe;
import tb.y4p;
import tb.y5p;
import tb.yj4;
import tb.yw1;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class BaseM3CellWidget extends WidgetViewHolder<M3CellBean, acx<CommonBaseDatasource>> implements eif, ruk, wuk, IRealTimeTagContainer, tqk, lsk, ktk, wg3, soc, mfe {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public long l;
    public WidgetViewHolder<?, ?> m;
    public M3CellBean n;
    public final Observer o;
    public final e p;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static final class e implements o4m {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ View b;

        public e(View view) {
            this.b = view;
        }

        @Override // tb.o4m
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("858d1c2b", new Object[]{this});
                return;
            }
            M3CellBean H0 = BaseM3CellWidget.H0(BaseM3CellWidget.this);
            if (H0 != null) {
                View view = this.b;
                ckf.e(view, "null cannot be cast to non-null type com.taobao.search.m3.widget.IAuctionView");
                boolean P0 = BaseM3CellWidget.this.P0(H0);
                BaseM3CellWidget baseM3CellWidget = BaseM3CellWidget.this;
                ((ohb) view).addMoreButton(true, P0, H0, baseM3CellWidget, baseM3CellWidget.U0(H0));
            }
        }

        @Override // tb.o4m
        public void b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b5eccb65", new Object[]{this});
                return;
            }
            M3CellBean H0 = BaseM3CellWidget.H0(BaseM3CellWidget.this);
            if (H0 != null) {
                View view = this.b;
                ckf.e(view, "null cannot be cast to non-null type com.taobao.search.m3.widget.IAuctionView");
                boolean P0 = BaseM3CellWidget.this.P0(H0);
                BaseM3CellWidget baseM3CellWidget = BaseM3CellWidget.this;
                ((ohb) view).addMoreButton(false, P0, H0, baseM3CellWidget, baseM3CellWidget.U0(H0));
            }
        }
    }

    static {
        t2o.a(815792475);
        t2o.a(815792409);
        t2o.a(815792447);
        t2o.a(815792452);
        t2o.a(815793449);
        t2o.a(815792360);
        t2o.a(815792417);
        t2o.a(815792332);
        t2o.a(993001706);
        t2o.a(815792465);
        t2o.a(815792378);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseM3CellWidget(View view, Activity activity, ude udeVar, ListStyle listStyle, int i, acx<CommonBaseDatasource> acxVar) {
        super(view, activity, udeVar, listStyle, i, acxVar);
        ckf.g(view, "itemView");
        ckf.g(activity, "activity");
        ckf.g(udeVar, a.MSG_SOURCE_PARENT);
        ckf.g(listStyle, "style");
        new Observer() { // from class: tb.zyy
            @Override // java.util.Observer
            public final void update(Observable observable, Object obj) {
                BaseM3CellWidget.o(BaseM3CellWidget.this, observable, obj);
            }
        };
        this.p = new e(view);
        ViewProxy.setOnLongClickListener(view, new View.OnLongClickListener() { // from class: tb.azy
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view2) {
                boolean j;
                j = BaseM3CellWidget.j(BaseM3CellWidget.this, view2);
                return j;
            }
        });
        ViewProxy.setOnClickListener(view, new View.OnClickListener() { // from class: tb.bzy
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                BaseM3CellWidget.k(BaseM3CellWidget.this, view2);
            }
        });
    }

    public static final /* synthetic */ M3CellBean H0(BaseM3CellWidget baseM3CellWidget) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (M3CellBean) ipChange.ipc$dispatch("b1711886", new Object[]{baseM3CellWidget});
        }
        return baseM3CellWidget.n;
    }

    public static /* synthetic */ void c1(BaseM3CellWidget baseM3CellWidget, boolean z, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4380fe63", new Object[]{baseM3CellWidget, new Boolean(z), new Integer(i), obj});
        } else if (obj == null) {
            if ((i & 1) != 0) {
                z = true;
            }
            baseM3CellWidget.b1(z);
        } else {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: recycleDynamicHolder");
        }
    }

    public static /* synthetic */ Object ipc$super(BaseM3CellWidget baseM3CellWidget, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -211767613:
                super.v0();
                return null;
            case 217607196:
                super.r();
                return null;
            case 949399698:
                super.x0();
                return null;
            case 1626033557:
                super.t0();
                return null;
            case 1849556539:
                super.y0();
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/m3/widget/BaseM3CellWidget");
        }
    }

    public static final void k(BaseM3CellWidget baseM3CellWidget, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("21c9185", new Object[]{baseM3CellWidget, view});
            return;
        }
        ckf.g(baseM3CellWidget, "this$0");
        baseM3CellWidget.X0();
    }

    public static final void l(BaseM3CellWidget baseM3CellWidget) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cbef4202", new Object[]{baseM3CellWidget});
            return;
        }
        ckf.g(baseM3CellWidget, "this$0");
        baseM3CellWidget.h1();
    }

    public static final void n(hh1 hh1Var, M3CellBean m3CellBean, BaseM3CellWidget baseM3CellWidget, hhf hhfVar, int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e47743b", new Object[]{hh1Var, m3CellBean, baseM3CellWidget, hhfVar, new Integer(i), str});
            return;
        }
        ckf.g(hh1Var, "$helper");
        ckf.g(m3CellBean, "$bean");
        ckf.g(baseM3CellWidget, "this$0");
        ckf.g(hhfVar, "$tag");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put((JSONObject) "spm", hh1Var.y());
        jSONObject.put((JSONObject) "itemId", m3CellBean.itemId);
        jSONObject.put((JSONObject) "q", baseM3CellWidget.l0().e().getKeyword());
        jSONObject.put((JSONObject) yj4.PARAM_SEARCH_KEYWORD_RN, m3CellBean.rn);
        String K0 = baseM3CellWidget.K0(hhfVar);
        if (hhfVar.a()) {
            jSONObject.put((JSONObject) "from", "hanging_query");
            jSONObject.put((JSONObject) "tags", K0);
            jSONObject.put((JSONObject) "subtype", "text");
        } else {
            jSONObject.put((JSONObject) "ic_exp", K0);
            jSONObject.put((JSONObject) "index", String.valueOf(i));
        }
        HashMap hashMap = new HashMap();
        hashMap.put("utLogMap", g6p.d(jSONObject.toJSONString()));
        sen.k(str, "Search-TagExposure", hashMap);
    }

    @Override // tb.mfe
    public void C(List<xfe> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("896eba54", new Object[]{this, list});
            return;
        }
        ckf.g(list, "displayed");
        M3CellBean m3CellBean = this.n;
        if (m3CellBean != null) {
            new hh1(m3CellBean, this, i0(), Q0(m3CellBean), N0(m3CellBean), M0(m3CellBean), S0(m3CellBean)).J(list);
        }
    }

    @Override // tb.soc
    public void D(boolean z) {
        yw1 yw1Var;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3888fd5e", new Object[]{this, new Boolean(z)});
        } else if (z) {
            ude parent = getParent();
            if (parent instanceof yw1) {
                yw1Var = (yw1) parent;
            } else {
                yw1Var = null;
            }
            if (yw1Var != null) {
                yw1Var.q0(this, i0());
            }
        }
    }

    @Override // tb.wg3
    public void E() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bdc6270b", new Object[]{this});
            return;
        }
        View view = this.itemView;
        ckf.e(view, "null cannot be cast to non-null type com.taobao.search.m3.widget.IAuctionView");
        ((ohb) view).stop();
    }

    @Override // tb.eif
    public void G(final hhf hhfVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5adfd67", new Object[]{this, hhfVar});
            return;
        }
        ckf.g(hhfVar, "tag");
        final String currentPageName = c2v.getInstance().getCurrentPageName();
        final M3CellBean m3CellBean = this.n;
        if (m3CellBean != null) {
            final hh1 hh1Var = new hh1(m3CellBean, this, i0(), Q0(m3CellBean), N0(m3CellBean), M0(m3CellBean), S0(m3CellBean));
            final int i0 = i0();
            Coordinator.execute(new Runnable() { // from class: tb.xyy
                @Override // java.lang.Runnable
                public final void run() {
                    BaseM3CellWidget.n(hh1.this, m3CellBean, this, hhfVar, i0, currentPageName);
                }
            });
        }
    }

    @Override // tb.ruk
    public void I(vop vopVar) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d27a51e7", new Object[]{this, vopVar});
            return;
        }
        ckf.g(vopVar, "info");
        M3CellBean m3CellBean = this.n;
        if (m3CellBean != null) {
            if (TextUtils.isEmpty(vopVar.e())) {
                str = toj.NAV_URL_SHOP;
            } else {
                str = vopVar.e();
                ckf.d(str);
            }
            if (wsq.Y(str, "m.duanqu.com", 0, false, 6, null) >= 0) {
                Nav.from(getActivity()).toUri(str);
                return;
            }
            hh1 hh1Var = new hh1(m3CellBean, this, i0(), Q0(m3CellBean), N0(m3CellBean), M0(m3CellBean), S0(m3CellBean));
            Uri.Builder appendQueryParameter = Uri.parse(str).buildUpon().appendQueryParameter("from", "search").appendQueryParameter(h1p.LIST_TYPE_KEY, "search");
            Uri.Builder appendQueryParameter2 = appendQueryParameter.appendQueryParameter(h1p.LIST_PARAM_KEY, l0().e().getKeyword() + '_' + m3CellBean.abtest + '_' + m3CellBean.rn).appendQueryParameter("spm", hh1Var.y());
            String str2 = m3CellBean.getAuctionBean().userId;
            if (str2 != null) {
                appendQueryParameter2.appendQueryParameter("userId", str2);
            }
            hh1Var.N();
            if (m3CellBean.isP4p || m3CellBean.getX_qzt_ad() > 0) {
                ckf.d(appendQueryParameter2);
                hh1Var.g(m3CellBean, appendQueryParameter2);
            }
            Nav.from(getActivity()).toUri(appendQueryParameter2.build());
        }
    }

    public final void J0(M3CellBean m3CellBean, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b7ca228f", new Object[]{this, m3CellBean, new Boolean(z)});
            return;
        }
        ckf.g(m3CellBean, "bean");
        View view = this.itemView;
        ckf.e(view, "null cannot be cast to non-null type com.taobao.search.m3.widget.IAuctionView");
        ((ohb) view).addMoreButton(R0(), P0(m3CellBean), m3CellBean, this, z);
    }

    public final String K0(hhf hhfVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d1577fca", new Object[]{this, hhfVar});
        }
        List<dif> c = hhfVar.c();
        StringBuilder sb = new StringBuilder();
        for (dif difVar : c) {
            if (!TextUtils.isEmpty(difVar.g())) {
                if (sb.length() > 0) {
                    sb.append(";");
                }
                sb.append(difVar.g());
            }
        }
        String sb2 = sb.toString();
        ckf.f(sb2, "let(...)");
        return sb2;
    }

    public final MSController L0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MSController) ipChange.ipc$dispatch("44eed38f", new Object[]{this});
        }
        Object h = l0().d().h("controller");
        ckf.e(h, "null cannot be cast to non-null type com.taobao.search.refactor.MSController");
        return (MSController) h;
    }

    public String M0(M3CellBean m3CellBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2451d5cc", new Object[]{this, m3CellBean});
        }
        ckf.g(m3CellBean, "bean");
        return m3CellBean.getPicPath();
    }

    @Override // tb.wg3
    public void N() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c78bc13d", new Object[]{this});
            return;
        }
        View view = this.itemView;
        ckf.e(view, "null cannot be cast to non-null type com.taobao.search.m3.widget.IAuctionView");
        ((ohb) view).play();
    }

    public String N0(M3CellBean m3CellBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b416cca", new Object[]{this, m3CellBean});
        }
        ckf.g(m3CellBean, "bean");
        return null;
    }

    @Override // tb.tqk
    public void O(String str) {
        Map<String, String> map;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1273b36d", new Object[]{this, str});
            return;
        }
        ckf.g(str, "from");
        M3CellBean m3CellBean = this.n;
        if (m3CellBean != null && !TextUtils.isEmpty(m3CellBean.getPltSimilarUrl())) {
            hh1 hh1Var = new hh1(m3CellBean, this, i0(), Q0(m3CellBean), N0(m3CellBean), M0(m3CellBean), S0(m3CellBean));
            int hashCode = str.hashCode();
            String str2 = "ItemLongPress";
            if (hashCode != -178026168) {
                if (hashCode == 116216604) {
                    str.equals("zszxs");
                } else if (hashCode == 480522904 && str.equals("zszxs_more")) {
                    str2 = "ItemMoreClick";
                }
            } else if (str.equals("zszxs_feedback")) {
                str2 = "FindSimilar";
            }
            hh1Var.L(str2);
            String paramValueIncludingGlobal = l0().e().getParamValueIncludingGlobal("channelSrp");
            String str3 = TextUtils.isEmpty(paramValueIncludingGlobal) ? str : str + '-' + paramValueIncludingGlobal;
            try {
                HashMap hashMap = new HashMap();
                Uri parse = Uri.parse(m3CellBean.getPltSimilarUrl());
                for (String str4 : parse.getQueryParameterNames()) {
                    if (str4 != null) {
                        hashMap.put(str4, parse.getQueryParameter(str4));
                    }
                }
                hashMap.put("pssource", str3);
                hashMap.put(wxi.KEY_PHOTO_FROM, str);
                Uri.Builder clearQuery = Uri.parse(m3CellBean.getPltSimilarUrl()).buildUpon().clearQuery();
                CommonSearchResult commonSearchResult = (CommonSearchResult) l0().e().getTotalSearchResult();
                if (!(commonSearchResult == null || (map = commonSearchResult.getMainInfo().pageTraceArgs) == null)) {
                    String str5 = map.get("spm-cnt");
                    if (str5 == null) {
                        str5 = "";
                    }
                    hashMap.put("spm", str5);
                }
                for (Object obj : hashMap.entrySet()) {
                    ckf.f(obj, "next(...)");
                    Map.Entry entry = (Map.Entry) obj;
                    clearQuery.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
                }
                Nav.from(getActivity()).toUri(clearQuery.build());
            } catch (Exception unused) {
            }
        }
    }

    public final TbSearchStyle O0(M3CellBean m3CellBean) {
        wyd wydVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TbSearchStyle) ipChange.ipc$dispatch("c48de870", new Object[]{this, m3CellBean});
        }
        Activity activity = getActivity();
        if (activity instanceof wyd) {
            wydVar = (wyd) activity;
        } else {
            wydVar = null;
        }
        if (wydVar == null || !wydVar.l()) {
            return null;
        }
        return g54.INSTANCE.g();
    }

    public final boolean P0(M3CellBean m3CellBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9d753c77", new Object[]{this, m3CellBean})).booleanValue();
        }
        ckf.g(m3CellBean, "bean");
        if (m3CellBean.getJiaGouSupport() == null) {
            return l0().e().z();
        }
        Boolean jiaGouSupport = m3CellBean.getJiaGouSupport();
        ckf.d(jiaGouSupport);
        return jiaGouSupport.booleanValue();
    }

    public boolean Q0(M3CellBean m3CellBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("47a235f9", new Object[]{this, m3CellBean})).booleanValue();
        }
        ckf.g(m3CellBean, "bean");
        return false;
    }

    public final boolean R0() {
        n4m n4mVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3fdab9ba", new Object[]{this})).booleanValue();
        }
        Activity activity = getActivity();
        if (activity instanceof n4m) {
            n4mVar = (n4m) activity;
        } else {
            n4mVar = null;
        }
        if (n4mVar == null || !n4mVar.Q2()) {
            return false;
        }
        return true;
    }

    public boolean S0(M3CellBean m3CellBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("84473294", new Object[]{this, m3CellBean})).booleanValue();
        }
        ckf.g(m3CellBean, "bean");
        return true;
    }

    public boolean T0(M3CellBean m3CellBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("64255216", new Object[]{this, m3CellBean})).booleanValue();
        }
        ckf.g(m3CellBean, "bean");
        return false;
    }

    @Override // tb.ktk
    public void U(String str, String str2) {
        rp7 discountInfo;
        Set<String> c;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d94dd0e1", new Object[]{this, str, str2});
            return;
        }
        ckf.g(str2, "code");
        M3CellBean data = getData();
        if (!(data == null || (discountInfo = data.getDiscountInfo()) == null || (c = discountInfo.c()) == null)) {
            List<String> z0 = wsq.z0(str2, new String[]{","}, false, 0, 6, null);
            if (!z0.isEmpty()) {
                HashSet hashSet = new HashSet(c);
                for (String str3 : z0) {
                    hashSet.remove(str3);
                }
                if (hashSet.isEmpty()) {
                    if (!TextUtils.isEmpty(discountInfo.e())) {
                        str = discountInfo.e();
                    }
                    discountInfo.l(str);
                } else if (hashSet.size() < c.size()) {
                    discountInfo.l(discountInfo.d());
                } else {
                    discountInfo.l(discountInfo.h());
                }
                discountInfo.k(true);
                W0(i0(), data, O0(data));
            }
        }
    }

    public final boolean U0(M3CellBean m3CellBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fd253b19", new Object[]{this, m3CellBean})).booleanValue();
        }
        ckf.g(m3CellBean, "bean");
        TbSearchStyle O0 = O0(m3CellBean);
        if (O0 == null || !O0.isTb2024) {
            return false;
        }
        return true;
    }

    /* renamed from: V0 */
    public void u0(int i, M3CellBean m3CellBean) {
        n4m n4mVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b1a3ebd4", new Object[]{this, new Integer(i), m3CellBean});
            return;
        }
        ckf.g(m3CellBean, "bean");
        if (i == 0) {
            i1();
            this.itemView.post(new Runnable() { // from class: tb.yyy
                @Override // java.lang.Runnable
                public final void run() {
                    BaseM3CellWidget.l(BaseM3CellWidget.this);
                }
            });
        }
        Activity activity = getActivity();
        if (activity instanceof n4m) {
            n4mVar = (n4m) activity;
        } else {
            n4mVar = null;
        }
        if (n4mVar != null) {
            n4mVar.S2(this.p);
        }
        if (!ckf.b(this.n, m3CellBean)) {
            TbSearchStyle O0 = O0(m3CellBean);
            k1();
            this.n = m3CellBean;
            vop shopInfo = m3CellBean.getShopInfo();
            if (shopInfo != null && shopInfo.c() && O0 != null && O0.isTb2024) {
                vop shopInfo2 = m3CellBean.getShopInfo();
                ckf.d(shopInfo2);
                shopInfo2.f(false);
            }
            W0(i, m3CellBean, O0);
        }
        e1(i, m3CellBean);
        jyf.a aVar = jyf.Companion;
        Activity activity2 = getActivity();
        ckf.f(activity2, "getActivity(...)");
        String str = m3CellBean.itemId;
        ckf.f(str, "itemId");
        aVar.b(activity2, str, this);
    }

    public void W0(int i, M3CellBean m3CellBean, TbSearchStyle tbSearchStyle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("51497a08", new Object[]{this, new Integer(i), m3CellBean, tbSearchStyle});
        } else {
            ckf.g(m3CellBean, "bean");
        }
    }

    public void X0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("470a949d", new Object[]{this});
            return;
        }
        M3CellBean m3CellBean = this.n;
        if (m3CellBean != null) {
            if (!m3CellBean.isClicked()) {
                m3CellBean.setClicked(true);
                View view = this.itemView;
                ckf.e(view, "null cannot be cast to non-null type com.taobao.search.m3.widget.IAuctionView");
                ((ohb) view).updateTitle(m3CellBean, O0(m3CellBean));
            }
            j1();
            hh1 hh1Var = new hh1(m3CellBean, this, i0(), Q0(m3CellBean), N0(m3CellBean), M0(m3CellBean), S0(m3CellBean));
            View view2 = this.itemView;
            ckf.e(view2, "null cannot be cast to non-null type com.taobao.search.m3.widget.IAuctionView");
            hh1Var.C((ohb) view2);
        }
    }

    @Override // tb.wg3
    public boolean Y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6b6d36ed", new Object[]{this})).booleanValue();
        }
        M3CellBean m3CellBean = this.n;
        if (m3CellBean == null) {
            return false;
        }
        View view = this.itemView;
        ckf.e(view, "null cannot be cast to non-null type com.taobao.search.m3.widget.IAuctionView");
        if ((!((ohb) view).canPlay() || !m3CellBean.getVideoAutoPlay() || !f1p.e(l0().e())) && !m3CellBean.getVideoForcePlay()) {
            return false;
        }
        return true;
    }

    public void Y0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e6d0f54", new Object[]{this});
            return;
        }
        M3CellBean m3CellBean = this.n;
        if (m3CellBean != null) {
            new hh1(m3CellBean, this, i0(), Q0(m3CellBean), N0(m3CellBean), M0(m3CellBean), S0(m3CellBean)).p();
            int feedbackType = m3CellBean.getFeedbackType();
            if (feedbackType == 3 || feedbackType == 4) {
                O("zszxs");
                return;
            }
            f1();
            View view = this.itemView;
            ckf.e(view, "null cannot be cast to non-null type com.taobao.search.m3.widget.IAuctionView");
            ((ohb) view).updateFeedback(m3CellBean, this, O0(m3CellBean), T0(m3CellBean));
            g1();
        }
    }

    @Override // tb.wuk
    public void b(qzp qzpVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f4064fea", new Object[]{this, qzpVar});
            return;
        }
        ckf.g(qzpVar, "info");
        Nav.from(getActivity()).toUri(qzpVar.h());
    }

    public final void b1(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("25db6735", new Object[]{this, new Boolean(z)});
            return;
        }
        if (z) {
            WidgetViewHolder<?, ?> widgetViewHolder = this.m;
            if (widgetViewHolder != null) {
                widgetViewHolder.destroyAndRemoveFromParent();
            }
        } else {
            WidgetViewHolder<?, ?> widgetViewHolder2 = this.m;
            if (widgetViewHolder2 != null) {
                widgetViewHolder2.e0();
            }
        }
        this.m = null;
    }

    @Override // com.taobao.search.sf.realtimetag.IRealTimeTagContainer
    public void clearTag() {
        ohb ohbVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a22e8814", new Object[]{this});
            return;
        }
        View view = this.itemView;
        if (view instanceof ohb) {
            ohbVar = (ohb) view;
        } else {
            ohbVar = null;
        }
        if (ohbVar != null) {
            ohbVar.removeDynamicCard();
        }
    }

    public final void d1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c947551", new Object[]{this});
        }
    }

    public final void e1(int i, M3CellBean m3CellBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d5edbd1", new Object[]{this, new Integer(i), m3CellBean});
            return;
        }
        ckf.g(m3CellBean, "bean");
        ohb ohbVar = null;
        c1(this, false, 1, null);
        clearTag();
        DynamicCardBean dynamicCardBean = m3CellBean.getDynamicCardBean();
        if (dynamicCardBean != null) {
            WidgetViewHolder<?, ?> c = pkn.c(this, getActivity(), dynamicCardBean, i, m3CellBean.getOriginData());
            if (dynamicCardBean.firstRender) {
                ScaleAnimation scaleAnimation = new ScaleAnimation(1.0f, 1.0f, 0.0f, 1.0f);
                scaleAnimation.setDuration(300L);
                c.itemView.startAnimation(scaleAnimation);
                dynamicCardBean.firstRender = false;
            }
            View view = this.itemView;
            if (view instanceof ohb) {
                ohbVar = (ohb) view;
            }
            if (ohbVar != null) {
                View view2 = c.itemView;
                ckf.f(view2, "itemView");
                ohbVar.addDynamicCard(view2, false);
            }
            this.m = c;
        }
    }

    public final void f1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("10da4b90", new Object[]{this});
        } else {
            q5i.b(new jx1(this));
        }
    }

    public final void g1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f9db558", new Object[]{this});
            return;
        }
        M3CellBean m3CellBean = this.n;
        if (m3CellBean != null) {
            new hh1(m3CellBean, this, i0(), Q0(m3CellBean), N0(m3CellBean), M0(m3CellBean), S0(m3CellBean)).H();
        }
    }

    @Override // com.taobao.search.sf.realtimetag.IRealTimeTagContainer
    public ListStyle getContainerListStyle() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ListStyle) ipChange.ipc$dispatch("1c77b9ec", new Object[]{this});
        }
        ListStyle j0 = j0();
        ckf.f(j0, "getListStyle(...)");
        return j0;
    }

    public final void h1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2ef9e52f", new Object[]{this});
            return;
        }
        CommonBaseDatasource e2 = l0().e();
        ckf.f(e2, "getScopeDatasource(...)");
        y5p firstRequestPerf = e2.getFirstRequestPerf();
        if (firstRequestPerf != null && !firstRequestPerf.f31873a && firstRequestPerf.z != 0 && firstRequestPerf.B == 0) {
            firstRequestPerf.B = System.currentTimeMillis();
            firstRequestPerf.f31873a = true;
            rj9.a(firstRequestPerf);
        }
    }

    public final void i1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("35fe6bb4", new Object[]{this});
            return;
        }
        CommonBaseDatasource e2 = l0().e();
        ckf.f(e2, "getScopeDatasource(...)");
        y5p firstRequestPerf = e2.getFirstRequestPerf();
        if (firstRequestPerf != null && !firstRequestPerf.f31873a && firstRequestPerf.A == 0) {
            firstRequestPerf.A = System.currentTimeMillis();
        }
    }

    public final void j1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f02dccb", new Object[]{this});
            return;
        }
        M3CellBean data = getData();
        if (data != null && data.getDiscountInfo() != null) {
            rp7 discountInfo = data.getDiscountInfo();
            ckf.d(discountInfo);
            if (discountInfo.c() != null) {
                jyf.a aVar = jyf.Companion;
                Activity activity = getActivity();
                ckf.f(activity, "getActivity(...)");
                aVar.c(activity, this);
            }
        }
    }

    @Override // com.taobao.android.searchbaseframe.list.WidgetViewHolder
    public String k0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("55d7c1cd", new Object[]{this});
        }
        return "m3";
    }

    public final void k1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("53d9343", new Object[]{this});
            return;
        }
        M3CellBean m3CellBean = this.n;
        if (m3CellBean != null) {
            jyf.a aVar = jyf.Companion;
            Activity activity = getActivity();
            ckf.f(activity, "getActivity(...)");
            String str = m3CellBean.itemId;
            ckf.f(str, "itemId");
            aVar.e(activity, str);
        }
    }

    public boolean l1(M3CellBean m3CellBean, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6311d774", new Object[]{this, m3CellBean, new Boolean(z)})).booleanValue();
        }
        ckf.g(m3CellBean, "bean");
        View view = this.itemView;
        ckf.e(view, "null cannot be cast to non-null type com.taobao.search.m3.widget.IAuctionView");
        ohb ohbVar = (ohb) view;
        if (ohbVar.updateInteractiveTag(m3CellBean, this, z) || ohbVar.updateComment(m3CellBean, z) || ohbVar.updateComposite(m3CellBean, z) || ohbVar.updateSingleRow(m3CellBean, this, z) || ohbVar.updateProperty(m3CellBean, z) || ohbVar.updateSummaryTips(m3CellBean, z)) {
            return true;
        }
        return false;
    }

    @Override // com.taobao.android.searchbaseframe.list.WidgetViewHolder
    public void r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf86c1c", new Object[]{this});
            return;
        }
        super.r();
        d1();
    }

    @Override // tb.ktk
    public void t(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64ac10ce", new Object[]{this, jSONObject});
            return;
        }
        ckf.g(jSONObject, "extDetailParams");
        M3CellBean m3CellBean = this.n;
        if (m3CellBean != null) {
            m3CellBean.setExtDetailParams(jSONObject);
        }
    }

    @Override // com.taobao.android.searchbaseframe.list.WidgetViewHolder
    public void t0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60eb4d95", new Object[]{this});
            return;
        }
        super.t0();
        M3CellBean m3CellBean = this.n;
        if (m3CellBean != null) {
            if (l0().e() instanceof jrh) {
                pba.INSTANCE.a(m3CellBean);
            }
            new hh1(m3CellBean, this, i0(), Q0(m3CellBean), N0(m3CellBean), M0(m3CellBean), S0(m3CellBean)).r();
            this.l = System.currentTimeMillis();
            h6p.b(m3CellBean.getAuctionBean(), i0(), l0().e(), this.itemView);
            if ((getParent() instanceof og3) && getData() != null) {
                ude parent = getParent();
                ckf.e(parent, "null cannot be cast to non-null type com.taobao.android.searchbaseframe.datasource.CellExposeListener");
                ((og3) parent).n1(i0(), getData(), (BaseSearchResult) l0().e().getTotalSearchResult(), l0().e());
            }
        }
    }

    @Override // tb.wg3
    public boolean u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4d2c9ffd", new Object[]{this})).booleanValue();
        }
        return false;
    }

    @Override // com.taobao.android.searchbaseframe.list.WidgetViewHolder
    public void v0() {
        n4m n4mVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f360aec3", new Object[]{this});
            return;
        }
        super.v0();
        E();
        b1(false);
        Activity activity = getActivity();
        if (activity instanceof n4m) {
            n4mVar = (n4m) activity;
        } else {
            n4mVar = null;
        }
        if (n4mVar != null) {
            n4mVar.D(this.p);
        }
        d1();
    }

    @Override // com.taobao.android.searchbaseframe.list.WidgetViewHolder
    public void x0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3896b092", new Object[]{this});
            return;
        }
        super.x0();
        M3CellBean m3CellBean = this.n;
        if (m3CellBean != null) {
            h6p.e(m3CellBean.getAuctionBean(), this.itemView);
            if ((getParent() instanceof og3) && getData() != null) {
                ude parent = getParent();
                ckf.e(parent, "null cannot be cast to non-null type com.taobao.android.searchbaseframe.datasource.CellExposeListener");
                ((og3) parent).u0(i0(), getData(), System.currentTimeMillis() - this.l, (BaseSearchResult) l0().e().getTotalSearchResult(), l0().e());
            }
        }
    }

    @Override // com.taobao.android.searchbaseframe.list.WidgetViewHolder
    public void y0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e3dfe3b", new Object[]{this});
            return;
        }
        super.y0();
        n4m n4mVar = null;
        this.n = null;
        c1(this, false, 1, null);
        k1();
        Activity activity = getActivity();
        if (activity instanceof n4m) {
            n4mVar = (n4m) activity;
        }
        if (n4mVar != null) {
            n4mVar.D(this.p);
        }
    }

    public static final boolean j(BaseM3CellWidget baseM3CellWidget, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c93c30ea", new Object[]{baseM3CellWidget, view})).booleanValue();
        }
        ckf.g(baseM3CellWidget, "this$0");
        baseM3CellWidget.Y0();
        return true;
    }

    public static final void o(BaseM3CellWidget baseM3CellWidget, Observable observable, Object obj) {
        JSONObject jSONObject;
        p59 feedback;
        String string;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f94f2f50", new Object[]{baseM3CellWidget, observable, obj});
            return;
        }
        ckf.g(baseM3CellWidget, "this$0");
        M3CellBean m3CellBean = baseM3CellWidget.n;
        if (m3CellBean != null) {
            JSONObject jSONObject2 = obj instanceof JSONObject ? (JSONObject) obj : null;
            if (jSONObject2 != null && (jSONObject = jSONObject2.getJSONObject("data")) != null && (feedback = m3CellBean.getFeedback()) != null && (string = jSONObject.getString(m3CellBean.itemId)) != null) {
                JSONArray jSONArray = feedback.b().getJSONArray("actions");
                if (jSONArray != null) {
                    int size = jSONArray.size();
                    int i = 0;
                    while (true) {
                        if (i >= size) {
                            break;
                        }
                        JSONObject jSONObject3 = jSONArray.getJSONObject(i);
                        JSONObject jSONObject4 = jSONObject3.getJSONObject("param");
                        if (ckf.b(jSONObject4 != null ? jSONObject4.getString("feedbackType") : null, string)) {
                            baseM3CellWidget.X(jSONObject4, jSONObject3.getJSONObject("coverInfo"), false);
                            break;
                        }
                        i++;
                    }
                }
                cca ccaVar = cca.INSTANCE;
                String str = m3CellBean.itemId;
                ckf.f(str, "itemId");
                ccaVar.b("PltNegFeedbackOption", str);
            }
        }
    }

    @Override // tb.tqk
    public void X(JSONObject jSONObject, JSONObject jSONObject2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("40a2b509", new Object[]{this, jSONObject, jSONObject2, new Boolean(z)});
            return;
        }
        M3CellBean m3CellBean = this.n;
        if (m3CellBean != null) {
            p59 feedback = m3CellBean.getFeedback();
            ckf.d(feedback);
            feedback.e(true);
            p59 feedback2 = m3CellBean.getFeedback();
            ckf.d(feedback2);
            feedback2.d(jSONObject2);
            if (y4p.h()) {
                asi asiVar = m3CellBean.combo;
                if (asiVar != null) {
                    asiVar.z(m3CellBean);
                }
                MSController L0 = L0();
                CommonBaseDatasource e2 = l0().e();
                ckf.e(e2, "null cannot be cast to non-null type com.taobao.search.refactor.MSDataSource");
                MetaChildPageWidget q = L0.q((jrh) e2);
                if (q != null) {
                    q.f3(false);
                }
            } else {
                View view = this.itemView;
                ckf.e(view, "null cannot be cast to non-null type com.taobao.search.m3.widget.BaseAuctionView");
                ((BaseAuctionView) view).updateFeedback(m3CellBean, this, O0(m3CellBean), T0(m3CellBean));
            }
            this.itemView.performHapticFeedback(0);
            peq peqVar = new peq(l0().a(), getData(), L0());
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put((JSONObject) "query", l0().e().getKeyword());
            CommonSearchResult commonSearchResult = (CommonSearchResult) l0().e().getTotalSearchResult();
            if (commonSearchResult != null) {
                jSONObject3.put((JSONObject) "firstRn", commonSearchResult.getMainInfo().rn);
            }
            jSONObject3.put((JSONObject) "index", (String) Integer.valueOf(i0()));
            jSONObject3.put((JSONObject) "source", "find_similar_layer");
            jSONObject3.put((JSONObject) "title", m3CellBean.getTitle());
            jSONObject3.put((JSONObject) "tItemType", "");
            jSONObject3.put((JSONObject) "feedbackTime", (String) Long.valueOf(System.currentTimeMillis()));
            jSONObject3.put((JSONObject) "itemId", m3CellBean.itemId);
            jSONObject3.put((JSONObject) gf0.K_DELIVERY_ID, "");
            try {
                jSONObject3.put((JSONObject) "sellerId", Uri.parse(m3CellBean.getPltSimilarUrl()).getQueryParameter("seller_id"));
            } catch (Exception unused) {
            }
            p59 feedback3 = m3CellBean.getFeedback();
            ckf.d(feedback3);
            JSONObject jSONObject4 = feedback3.b().getJSONObject("commonParams");
            if (jSONObject4 != null) {
                jSONObject3.putAll(jSONObject4);
            }
            jSONObject3.put((JSONObject) yj4.PARAM_SEARCH_KEYWORD_POS, String.valueOf(i0()));
            jSONObject3.put((JSONObject) "page", String.valueOf(m3CellBean.pageNo));
            jSONObject3.put((JSONObject) yj4.PARAM_SEARCH_KEYWORD_RN, m3CellBean.rn);
            if (jSONObject != null) {
                jSONObject3.putAll(jSONObject);
            }
            jSONObject3.put((JSONObject) mh1.PRD_IS_P4P, String.valueOf(m3CellBean.isP4p));
            if (jSONObject2 != null) {
                jSONObject3.put((JSONObject) "coverInfo", (String) jSONObject2);
            }
            drj.d(getActivity(), peqVar.b(), jSONObject3, l0().f().getBooleanParam(r4p.KEY_SEARCH_ELDER_HOME_OPEN));
            if (z) {
                new hh1(m3CellBean, this, i0(), Q0(m3CellBean), N0(m3CellBean), M0(m3CellBean), S0(m3CellBean)).G(jSONObject != null ? jSONObject.getString("feedbackType") : null, jSONObject2);
            }
        }
    }

    public final void a1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7effe9b", new Object[]{this});
            return;
        }
        this.itemView.performHapticFeedback(0);
        M3CellBean m3CellBean = this.n;
        if (m3CellBean != null) {
            int feedbackType = m3CellBean.getFeedbackType();
            if (feedbackType == 1 || feedbackType == 3) {
                f1();
                View view = this.itemView;
                ckf.e(view, "null cannot be cast to non-null type com.taobao.search.m3.widget.IAuctionView");
                ((ohb) view).updateFeedback(m3CellBean, this, O0(m3CellBean), T0(m3CellBean));
                g1();
                return;
            }
            O("zszxs_more");
        }
    }

    @Override // tb.lsk
    public void q(int i) {
        f4m pkInfo;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("361047c8", new Object[]{this, new Integer(i)});
        } else if (i == 1) {
            M3CellBean m3CellBean = this.n;
            if (m3CellBean != null && (pkInfo = m3CellBean.getPkInfo()) != null) {
                pkInfo.e(!pkInfo.c());
                View view = this.itemView;
                ckf.e(view, "null cannot be cast to non-null type com.taobao.search.m3.widget.IAuctionView");
                ((ohb) view).addMoreButton(true, P0(m3CellBean), m3CellBean, this, U0(m3CellBean));
                Activity activity = getActivity();
                n4m n4mVar = activity instanceof n4m ? (n4m) activity : null;
                if (n4mVar != null) {
                    n4mVar.x1(m3CellBean, pkInfo.c());
                }
            }
        } else if (i == 2) {
            M3CellBean m3CellBean2 = this.n;
            if (m3CellBean2 != null) {
                hh1 hh1Var = new hh1(m3CellBean2, this, i0(), Q0(m3CellBean2), N0(m3CellBean2), M0(m3CellBean2), S0(m3CellBean2));
                Map<String, String> l = hh1Var.l(true);
                l.put("spm-cnt", hh1Var.y());
                UTAnalytics.getInstance().getDefaultTracker().send(new UTOriginalCustomHitBuilder(c2v.getInstance().getCurrentPageName(), 2101, "/wxcart.list.add_to_cart", "", "", l).build());
                new hh1(m3CellBean2, this, i0(), Q0(m3CellBean2), N0(m3CellBean2), M0(m3CellBean2), S0(m3CellBean2)).h();
            }
        } else if (i == 3) {
            a1();
        }
    }

    /* JADX WARN: Type inference failed for: r3v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object] */
    @Override // tb.eif
    public void Q(dif difVar, hhf hhfVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("54bbfa86", new Object[]{this, difVar, hhfVar});
            return;
        }
        ckf.g(difVar, "tag");
        ckf.g(hhfVar, "interactiveInfo");
        M3CellBean m3CellBean = this.n;
        if (m3CellBean != null) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put((JSONObject) "q", difVar.d());
            jSONObject.put((JSONObject) "showKeyword", difVar.d());
            JSONObject c = difVar.c();
            if (c == null) {
                c = null;
            } else if (difVar.b() != null) {
                c.put((JSONObject) difVar.b(), difVar.g());
            }
            jSONObject.put((JSONObject) "params", (String) c);
            hh1 hh1Var = new hh1(m3CellBean, this, i0(), Q0(m3CellBean), N0(m3CellBean), M0(m3CellBean), S0(m3CellBean));
            Map<String, String> k = hh1Var.k();
            Map<String, String> n = hh1Var.n();
            if (!TextUtils.isEmpty(difVar.g())) {
                if (hhfVar.a()) {
                    try {
                        String g = difVar.g();
                        ckf.d(g);
                        for (String str : wsq.z0(g, new String[]{";"}, false, 0, 6, null)) {
                            List z0 = wsq.z0(str, new String[]{":"}, false, 0, 6, null);
                            n.put(z0.get(0), z0.get(1));
                        }
                    } catch (Exception unused) {
                    }
                } else {
                    n.put(K0(hhfVar), difVar.g());
                }
            }
            k.put("utLogMap", g6p.d(JSON.toJSONString(n)));
            sen.m(c2v.getInstance().getCurrentPageName(), c2v.getInstance().getCurrentPageName() + "_jhtag", 2101, k);
            if (hhfVar.a()) {
                Nav.from(getActivity()).toUri("https://s.m.taobao.com/h5?q=" + difVar.d() + "&from=hanging_query");
                return;
            }
            A0(f64.a("tagSearch", jSONObject, null, null));
        }
    }
}
