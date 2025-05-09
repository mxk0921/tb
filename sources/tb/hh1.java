package tb;

import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.core.app.NotificationCompat;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alimama.AlimamaAdvertising;
import com.taobao.android.behavir.util.UtUtils;
import com.taobao.android.msoa.callback.MSOAServiceListener;
import com.taobao.android.nav.Nav;
import com.taobao.android.searchbaseframe.business.srp.list.uikit.PartnerRecyclerView;
import com.taobao.android.searchbaseframe.datasource.impl.cell.BaseCellBean;
import com.taobao.android.searchbaseframe.uikit.screentype.ScreenType;
import com.taobao.android.searchbaseframe.util.ListStyle;
import com.taobao.search.m3.M3CellBean;
import com.taobao.search.m3.widget.BaseM3CellWidget;
import com.taobao.search.sf.datasource.CommonBaseDatasource;
import com.taobao.search.sf.datasource.CommonSearchResult;
import com.taobao.tao.util.Constants;
import com.taobao.weex.ui.component.WXBasicComponentType;
import com.ut.mini.UTAnalytics;
import com.ut.mini.internal.UTOriginalCustomHitBuilder;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import tb.h1p;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class hh1 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);
    public static final HashMap<String, String> j;
    public static final HashSet<String> k;

    /* renamed from: a  reason: collision with root package name */
    public final M3CellBean f20635a;
    public final BaseM3CellWidget b;
    public final int c;
    public final boolean d;
    public final String e;
    public final boolean f;
    public final String g = c2v.getInstance().getCurrentPageName();
    public final acx<CommonBaseDatasource> h;
    public final ListStyle i;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static final class a {
        static {
            t2o.a(815792471);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static final class b implements MSOAServiceListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // com.taobao.android.msoa.callback.MSOAServiceListener
        public void onFail(String str, String str2, boolean z, Map<String, ? extends Object> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("684c28e9", new Object[]{this, str, str2, new Boolean(z), map});
                return;
            }
            ckf.g(str, "errCode");
            ckf.g(str2, "errMsg");
            ckf.g(map, "map");
        }

        @Override // com.taobao.android.msoa.callback.MSOAServiceListener
        public void onSuccess(Map<String, ? extends Object> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("93e51c7a", new Object[]{this, map});
            } else {
                ckf.g(map, "map");
            }
        }
    }

    public hh1(M3CellBean m3CellBean, BaseM3CellWidget baseM3CellWidget, int i, boolean z, String str, String str2, boolean z2) {
        ckf.g(m3CellBean, "bean");
        ckf.g(baseM3CellWidget, "widget");
        this.f20635a = m3CellBean;
        this.b = baseM3CellWidget;
        this.c = i;
        this.d = z;
        this.e = str;
        this.f = z2;
        this.h = baseM3CellWidget.l0();
        this.i = baseM3CellWidget.getContainerListStyle();
    }

    public static final void c(hh1 hh1Var, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70ab0f15", new Object[]{hh1Var, str});
            return;
        }
        ckf.g(hh1Var, "this$0");
        hh1Var.s(str);
    }

    public static final void d(hh1 hh1Var, List list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("13f9b79e", new Object[]{hh1Var, list});
            return;
        }
        ckf.g(hh1Var, "this$0");
        ckf.g(list, "$icons");
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        hashMap2.put(m09.ICON_RENDER, hh1Var.m(list));
        hashMap2.put("item_id", hh1Var.f20635a.itemId);
        hashMap2.put("index", String.valueOf(hh1Var.c));
        hashMap2.put("q", hh1Var.h.e().getKeyword());
        hashMap2.put(yj4.PARAM_SEARCH_KEYWORD_RN, hh1Var.f20635a.rn);
        hashMap2.put(mh1.PRD_IS_P4P, String.valueOf(hh1Var.f20635a.isP4p));
        hashMap.put("utLogMap", g6p.d(JSON.toJSONString(hashMap2)));
        sen.m(hh1Var.g, "search_itemcard_icon_exposure", 2201, hashMap);
    }

    public final boolean B() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e2a345a4", new Object[]{this})).booleanValue();
        }
        CommonSearchResult commonSearchResult = (CommonSearchResult) this.h.e().getTotalSearchResult();
        int x = x();
        if (commonSearchResult == null || x >= commonSearchResult.getCellsCount()) {
            return false;
        }
        return commonSearchResult.getCell(x).isP4p;
    }

    public final void C(ohb ohbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa3a30d6", new Object[]{this, ohbVar});
            return;
        }
        ckf.g(ohbVar, "view");
        q(this.f20635a);
        o(this.f20635a);
        I(ohbVar);
        E();
        try {
            A(this.f20635a);
        } catch (Exception unused) {
        }
    }

    public final void D(M3CellBean m3CellBean, String str, String str2, boolean z, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("34355a6d", new Object[]{this, m3CellBean, str, str2, new Boolean(z), map});
            return;
        }
        CommonBaseDatasource e = this.h.e();
        ckf.e(e, "null cannot be cast to non-null type com.taobao.search.sf.datasource.mainsearch.MainSearchDatasource");
        HashMap hashMap = new HashMap();
        hashMap.put("itemId", str);
        z(m3CellBean, hashMap);
        ckf.d(map);
        hashMap.putAll(map);
        qkn.c(str2, hashMap, this.b.getActivity(), this.c, z, ((g1i) e).u());
    }

    public final void G(String str, JSONObject jSONObject) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee5e59c4", new Object[]{this, str, jSONObject});
            return;
        }
        Map<String, String> v = v();
        p59 feedback = this.f20635a.getFeedback();
        ckf.d(feedback);
        JSONObject jSONObject2 = feedback.b().getJSONObject("commonParams");
        if (jSONObject2 != null) {
            for (Map.Entry<String, Object> entry : jSONObject2.entrySet()) {
                ckf.f(entry, "next(...)");
                Map.Entry<String, Object> entry2 = entry;
                String key = entry2.getKey();
                if (!TextUtils.isEmpty(key)) {
                    Object value = entry2.getValue();
                    if (value != null) {
                        str2 = value.toString();
                    } else {
                        str2 = null;
                    }
                    if (!TextUtils.isEmpty(str2)) {
                        v.put(key, str2);
                    }
                }
            }
        }
        v.put("feedback", str);
        if (jSONObject != null) {
            v.put("coverInfo", g6p.d(jSONObject.toJSONString()));
        }
        String str3 = this.g;
        sen.m(str3, this.g + "_ItemFeedbackClick", 2101, v);
    }

    public final void H() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f9db558", new Object[]{this});
            return;
        }
        sen.l(this.g + "_ItemFeedbackExposure", v());
    }

    public final void I(ohb ohbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("80090108", new Object[]{this, ohbVar});
            return;
        }
        Map<String, String> k2 = k();
        Map<String, String> n = n();
        List<xfe> displayIcons = ohbVar.getDisplayIcons();
        if (displayIcons != null && !displayIcons.isEmpty()) {
            n.put(m09.ICON_RENDER, m(displayIcons));
            k2.put("utLogMap", g6p.d(JSON.toJSONString(n)));
            sen.m(this.g, "search_itemcard_icon_click", 2101, k2);
        }
    }

    public final void J(final List<xfe> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b88ee3d", new Object[]{this, list});
            return;
        }
        ckf.g(list, m09.ICON_RENDER);
        if (!list.isEmpty()) {
            le1.b().post(new Runnable() { // from class: tb.acn
                @Override // java.lang.Runnable
                public final void run() {
                    hh1.d(hh1.this, list);
                }
            });
        }
    }

    public final void K(M3CellBean m3CellBean, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("74840fdc", new Object[]{this, m3CellBean, str});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put(yj4.PARAM_SEARCH_KEYWORD_POS, String.valueOf(this.c));
        hashMap.put("page", String.valueOf(m3CellBean.pageNo));
        hashMap.put("trigger_item_id", str);
        hashMap.put("pv_pos", String.valueOf(m3CellBean.pagePos));
        String str2 = m3CellBean.rn;
        if (str2 == null) {
            str2 = "";
        }
        hashMap.put(yj4.PARAM_SEARCH_KEYWORD_RN, str2);
        hashMap.put("pv_size", String.valueOf(m3CellBean.pageSize));
        hashMap.put("below_p4p", String.valueOf(B()));
        hashMap.put("below_pos", String.valueOf(x()));
        try {
            hashMap.put("bottom", String.valueOf(o1p.e(this.b.itemView.getBottom())));
            ViewParent parent = this.b.itemView.getParent();
            ckf.e(parent, "null cannot be cast to non-null type android.view.ViewGroup");
            hashMap.put("screen_height", String.valueOf(o1p.e(((ViewGroup) parent).getHeight())));
            j(hashMap);
        } catch (Throwable unused) {
        }
        this.b.B0(new jtf(str, hashMap), "childPageWidget");
    }

    public final void L(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("130fcad6", new Object[]{this, str});
            return;
        }
        ckf.g(str, "arg1");
        String str2 = this.g;
        sen.m(str2, this.g + '_' + str, 2101, l(false));
    }

    public final void N() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb18fb12", new Object[]{this});
            return;
        }
        Map<String, String> n = n();
        n.put(pg1.ATOM_EXT_column, "0");
        n.put("style", this.i.getValue());
        UTAnalytics.getInstance().getDefaultTracker().updateNextPageUtparam(JSON.toJSONString(n));
    }

    public final void g(M3CellBean m3CellBean, Uri.Builder builder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b069782d", new Object[]{this, m3CellBean, builder});
            return;
        }
        ckf.g(m3CellBean, "bean");
        ckf.g(builder, NotificationCompat.MessagingStyle.Message.KEY_DATA_URI);
        String str = m3CellBean.getAuctionBean().p4pPid;
        if (str == null) {
            if (this.c == 0) {
                str = "430042_1006";
            } else {
                str = "430043_1006";
            }
        }
        i(builder, js0.E_URL, m3CellBean.getClickUrl());
        if (!TextUtils.isEmpty(m3CellBean.getEtype())) {
            i(builder, "etype", m3CellBean.getEtype());
        } else {
            i(builder, "etype", "1");
        }
        i(builder, "epid", str);
    }

    public final void i(Uri.Builder builder, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2655f2ec", new Object[]{this, builder, str, str2});
        } else if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            builder.appendQueryParameter(str, str2);
        }
    }

    public final void j(Map<String, Object> map) {
        PartnerRecyclerView partnerRecyclerView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bf9acec", new Object[]{this, map});
            return;
        }
        ViewParent parent = this.b.itemView.getParent();
        if (parent instanceof PartnerRecyclerView) {
            partnerRecyclerView = (PartnerRecyclerView) parent;
        } else {
            partnerRecyclerView = null;
        }
        if (partnerRecyclerView != null) {
            int headerViewsCount = partnerRecyclerView.getHeaderViewsCount();
            View childAt = partnerRecyclerView.getChildAt(partnerRecyclerView.getChildCount() - 1);
            int layoutPosition = partnerRecyclerView.getChildViewHolder(childAt).getLayoutPosition() - headerViewsCount;
            int e = o1p.e(childAt.getTop());
            View childAt2 = partnerRecyclerView.getChildAt(partnerRecyclerView.getChildCount() - 2);
            int layoutPosition2 = partnerRecyclerView.getChildViewHolder(childAt2).getLayoutPosition() - headerViewsCount;
            int e2 = o1p.e(childAt2.getTop());
            StringBuilder sb = new StringBuilder();
            sb.append(layoutPosition2);
            sb.append(',');
            sb.append(layoutPosition);
            map.put("last_expose_pos_list", sb.toString());
            StringBuilder sb2 = new StringBuilder();
            sb2.append(e2);
            sb2.append(',');
            sb2.append(e);
            map.put("last_expose_top_height_list", sb2.toString());
        }
    }

    public final Map<String, String> k() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("59719e27", new Object[]{this});
        }
        HashMap hashMap = new HashMap();
        hashMap.put("tItemType", this.f20635a.type);
        hashMap.put(yj4.PARAM_SEARCH_KEYWORD_RN, this.f20635a.rn);
        hashMap.put(yj4.PARAM_PVID, this.f20635a.rn);
        CommonSearchResult commonSearchResult = (CommonSearchResult) this.h.e().getTotalSearchResult();
        if (commonSearchResult != null) {
            hashMap.put("sessionid", commonSearchResult.getMainInfo().rn);
            hashMap.put("spm", y());
        }
        hashMap.put("item_id", this.f20635a.itemId);
        hashMap.put("page", String.valueOf(this.f20635a.pageNo));
        hashMap.put(yj4.PARAM_SEARCH_KEYWORD_POS, String.valueOf(this.c));
        hashMap.put("pagePos", String.valueOf(this.f20635a.pagePos));
        hashMap.put("pageSize", String.valueOf(this.f20635a.pageSize));
        hashMap.put("q", this.h.e().getKeyword());
        if (ckf.b(this.i.getValue(), "wf")) {
            str = WXBasicComponentType.WATERFALL;
        } else {
            str = "list";
        }
        hashMap.put("style", str);
        hashMap.put("longPicture", String.valueOf(this.d));
        hashMap.put("business", "all");
        if (this.i == ListStyle.LIST) {
            hashMap.put("videoId", this.f20635a.getAuctionBean().videoId);
        } else {
            hashMap.put("videoId", this.f20635a.getAuctionBean().wfVideoId);
        }
        hashMap.put("xs_uuid", UUID.randomUUID().toString());
        return hashMap;
    }

    public final Map<String, String> l(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("39026e73", new Object[]{this, new Boolean(z)});
        }
        Map<String, String> k2 = k();
        Map<String, String> n = n();
        if (z) {
            n.remove("for_bts");
        }
        k2.put("utLogMap", g6p.d(JSON.toJSONString(n)));
        return k2;
    }

    public final String m(List<xfe> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ec66de5c", new Object[]{this, list});
        }
        StringBuilder sb = new StringBuilder();
        for (xfe xfeVar : list) {
            if (sb.length() > 0) {
                sb.append(",");
            }
            sb.append(xfeVar.b());
        }
        String sb2 = sb.toString();
        ckf.f(sb2, "toString(...)");
        return sb2;
    }

    public Map<String, String> n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("1729d4f", new Object[]{this});
        }
        HashMap hashMap = new HashMap();
        hashMap.put("tItemType", this.f20635a.type);
        hashMap.put("x_object_type", "item");
        hashMap.put("srp_seq", String.valueOf(this.f20635a.pageNo));
        hashMap.put("srp_pos", String.valueOf(this.f20635a.pagePos));
        hashMap.put("index", String.valueOf(this.c));
        hashMap.put("ShopIsShow", String.valueOf(this.f));
        CommonSearchResult commonSearchResult = (CommonSearchResult) this.h.e().getTotalSearchResult();
        if (commonSearchResult != null) {
            hashMap.put(h1p.a.PARAM_KEY_FIRST_RN, commonSearchResult.getMainInfo().rn);
        }
        hashMap.put("rainbow", oen.j());
        String str = this.e;
        if (str != null) {
            hashMap.put("picRatio", str);
        }
        JSONObject utLogMap = this.f20635a.getUtLogMap();
        if (utLogMap != null) {
            t(utLogMap, hashMap, null);
        }
        JSONObject pageInfo = this.f20635a.getPageInfo();
        if (pageInfo != null) {
            t(pageInfo, hashMap, k);
        }
        hashMap.put("pageName", this.g);
        hhf interactiveInfo = this.f20635a.getInteractiveInfo();
        if (interactiveInfo != null) {
            StringBuilder sb = new StringBuilder();
            for (dif difVar : interactiveInfo.c()) {
                if (!TextUtils.isEmpty(difVar.g())) {
                    if (sb.length() > 0) {
                        sb.append("|");
                    }
                    String g = difVar.g();
                    ckf.d(g);
                    sb.append(g);
                }
            }
            if (sb.length() > 0) {
                hashMap.put("jhss_tag_new", sb.toString());
            }
        }
        return hashMap;
    }

    public final void p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("35548914", new Object[]{this});
            return;
        }
        String str = this.f20635a.itemId;
        String currentPageName = c2v.getInstance().getCurrentPageName();
        Map<String, String> k2 = k();
        k2.put("utLogMap", JSON.toJSONString(n()));
        String[] a2 = h6p.a(k2);
        cqv.u(currentPageName, "Page_SearchItemList_Button-longpress", "", str, (String[]) Arrays.copyOf(a2, a2.length));
    }

    public final void q(M3CellBean m3CellBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7b7d8b9", new Object[]{this, m3CellBean});
            return;
        }
        String str = m3CellBean.itemId;
        String currentPageName = c2v.getInstance().getCurrentPageName();
        Map<String, String> k2 = k();
        k2.put("utLogMap", JSON.toJSONString(n()));
        String[] a2 = h6p.a(k2);
        cqv.u(currentPageName, "Search-ItemClick", "", str, (String[]) Arrays.copyOf(a2, a2.length));
    }

    public final void r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d47164b", new Object[]{this});
            return;
        }
        this.f20635a.isExposed = true;
        if (o4p.H0()) {
            final String currentPageName = c2v.getInstance().getCurrentPageName();
            le1.b().post(new Runnable() { // from class: tb.bcn
                @Override // java.lang.Runnable
                public final void run() {
                    hh1.c(hh1.this, currentPageName);
                }
            });
            return;
        }
        try {
            s(this.g);
        } catch (Exception unused) {
        }
    }

    public final void s(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc380795", new Object[]{this, str});
            return;
        }
        if (TextUtils.isEmpty(str)) {
            str = "Page_SearchItemList";
        }
        boolean exposed = this.f20635a.getExposed();
        boolean exposed2 = this.f20635a.getExposed();
        this.f20635a.setExposed(true);
        if (!exposed2) {
            kp8.c(this.f20635a.getAuctionBean());
        }
        if (exposed) {
            sen.m(str, "Search-ItemExposure-Again", UtUtils.CHANGED_UPP_EVENT_ID, l(true));
            return;
        }
        sen.k(str, "Search-ItemExposure", l(false));
        ckf.d(str);
        F(str);
    }

    public final void t(JSONObject jSONObject, Map<String, String> map, Set<String> set) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fdbc09a", new Object[]{this, jSONObject, map, set});
            return;
        }
        for (Map.Entry<String, Object> entry : jSONObject.entrySet()) {
            ckf.f(entry, "next(...)");
            Map.Entry<String, Object> entry2 = entry;
            String key = entry2.getKey();
            if (!TextUtils.isEmpty(key) && (set == null || !set.contains(key))) {
                Object value = entry2.getValue();
                if (value != null) {
                    str = value.toString();
                } else {
                    str = null;
                }
                if (!TextUtils.isEmpty(str)) {
                    map.put(key, str);
                }
            }
        }
    }

    public final Uri u(M3CellBean m3CellBean, String str, Map<String, String> map, Map<String, String> map2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Uri) ipChange.ipc$dispatch("3d797aec", new Object[]{this, m3CellBean, str, map, map2, new Boolean(z)});
        }
        Uri.Builder buildUpon = Uri.parse(str).buildUpon();
        ckf.d(buildUpon);
        i(buildUpon, "from", "search");
        i(buildUpon, h1p.LIST_TYPE_KEY, "search");
        i(buildUpon, Constants.KEY_SEARCH_KEYWORD, this.h.e().getKeyword());
        i(buildUpon, "store_id", m3CellBean.getAuctionBean().o2oShopId);
        i(buildUpon, h1p.LIST_PARAM_KEY, this.h.e().getKeyword() + '_' + m3CellBean.abtest + '_' + m3CellBean.rn);
        i(buildUpon, q2q.KEY_SKU_ID, m3CellBean.getAuctionBean().skuId);
        i(buildUpon, "spm", y());
        i(buildUpon, r4p.KEY_LOC_TYPE, m3CellBean.getAuctionBean().locType);
        for (Map.Entry<String, String> entry : map.entrySet()) {
            i(buildUpon, entry.getKey(), entry.getValue());
        }
        for (Map.Entry<String, String> entry2 : map2.entrySet()) {
            i(buildUpon, entry2.getKey(), entry2.getValue());
        }
        if (z) {
            g(m3CellBean, buildUpon);
        }
        Uri build = buildUpon.build();
        ckf.f(build, "build(...)");
        return build;
    }

    public final Map<String, String> v() {
        Map<String, String> map;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("7daa2ed3", new Object[]{this});
        }
        HashMap hashMap = new HashMap();
        hashMap.put("title", this.f20635a.getTitle());
        HashMap hashMap2 = new HashMap();
        hashMap2.put("index", String.valueOf(this.c));
        CommonSearchResult commonSearchResult = (CommonSearchResult) this.h.e().getTotalSearchResult();
        if (commonSearchResult != null) {
            hashMap2.put(h1p.a.PARAM_KEY_FIRST_RN, commonSearchResult.getMainInfo().rn);
        }
        hashMap2.put("s_isEl", "0");
        hashMap.put(mh1.PRD_IS_P4P, String.valueOf(this.f20635a.isP4p));
        hashMap.put("index", String.valueOf(this.c));
        hashMap.put("query", this.h.e().getKeyword());
        CommonSearchResult commonSearchResult2 = (CommonSearchResult) this.h.e().getTotalSearchResult();
        if (!(commonSearchResult2 == null || (map = commonSearchResult2.getMainInfo().pageTraceArgs) == null)) {
            String str = map.get("spm-cnt");
            if (!TextUtils.isEmpty(str)) {
                hashMap.put("spm", str);
            }
        }
        hashMap.put("itemId", this.f20635a.itemId);
        hashMap.put(yj4.PARAM_SEARCH_KEYWORD_RN, this.f20635a.rn);
        hashMap.put("page", String.valueOf(this.f20635a.pageNo));
        hashMap.put("utLogMap", g6p.d(JSON.toJSONString(hashMap2)));
        hashMap.put("tItemType", "ms_tb-webb-widget_goods_n_feedback_widget");
        String similarSameUrl = this.f20635a.getSimilarSameUrl();
        if (similarSameUrl != null) {
            String queryParameter = Uri.parse(similarSameUrl).getQueryParameter("sellerId");
            if (!TextUtils.isEmpty(queryParameter)) {
                hashMap.put("sellerId", queryParameter);
            }
        }
        return hashMap;
    }

    public final om1 w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (om1) ipChange.ipc$dispatch("a4b48d1f", new Object[]{this});
        }
        View view = this.b.itemView;
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        float width = (view.getWidth() / 2.0f) + iArr[0];
        float height = (view.getHeight() / 2.0f) + iArr[1];
        om1 om1Var = new om1();
        om1Var.c = view.getWidth();
        om1Var.d = view.getHeight();
        om1Var.f25484a = width;
        om1Var.b = height;
        return om1Var;
    }

    public final int x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("79e9dc4c", new Object[]{this})).intValue();
        }
        int i = this.c;
        if (this.i == ListStyle.LIST) {
            return i + 1;
        }
        return i + 2;
    }

    public final void E() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("483510f4", new Object[]{this});
        } else if (p4p.d() && !ScreenType.IS_PAD && !ScreenType.IS_FOLDABLE) {
            Map<String, String> l = l(true);
            if (this.b.h0() == 0) {
                str = "left";
            } else {
                str = "right";
            }
            l.put("cardPosition", str);
            l.put("slideGesture", g6p.d(JSON.toJSONString(u6a.v(w()))));
            UTAnalytics.getInstance().getDefaultTracker().send(new UTOriginalCustomHitBuilder(this.g, 19997, "Search-ItemClick-bxGesture", "", "", l).build());
        }
    }

    public final void F(String str) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("35a0ebb2", new Object[]{this, str});
        } else if (p4p.d() && !ScreenType.IS_PAD && !ScreenType.IS_FOLDABLE) {
            Map<String, String> l = l(true);
            if (this.b.h0() == 0) {
                str2 = "left";
            } else {
                str2 = "right";
            }
            l.put("cardPosition", str2);
            l.put("slideGestureHands", u6a.t());
            UTAnalytics.getInstance().getDefaultTracker().send(new UTOriginalCustomHitBuilder(str, 19997, "Search-ItemExpose-bxGesture", "", "", l).build());
        }
    }

    public void o(M3CellBean m3CellBean) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e65e73f1", new Object[]{this, m3CellBean});
            return;
        }
        ckf.g(m3CellBean, "bean");
        String str2 = m3CellBean.itemId;
        if (!TextUtils.isEmpty(str2)) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put((JSONObject) "itemId", str2);
            String str3 = m3CellBean.clickTrace;
            if (str3 == null) {
                str3 = "";
            }
            jSONObject.put((JSONObject) mh1.CLICK_TRACE, str3);
            JSONObject jSONObject2 = new JSONObject();
            if (m3CellBean.getBackCardRqParams() != null) {
                JSONObject backCardRqParams = m3CellBean.getBackCardRqParams();
                ckf.d(backCardRqParams);
                jSONObject2.putAll(backCardRqParams);
            }
            if (m3CellBean.getClickBackParams() != null) {
                JSONObject clickBackParams = m3CellBean.getClickBackParams();
                ckf.d(clickBackParams);
                jSONObject2.putAll(clickBackParams);
            }
            jSONObject2.put((JSONObject) "style", this.i.getValue());
            if (this.i == ListStyle.LIST) {
                str = m3CellBean.getPicPath();
            } else {
                str = m3CellBean.getUprightImage();
            }
            if (TextUtils.isEmpty(str)) {
                str = m3CellBean.getPicPath();
            }
            jSONObject2.put((JSONObject) mh1.PRD_PICURL, str);
            jSONObject2.put((JSONObject) yj4.PARAM_SEARCH_KEYWORD_RN, m3CellBean.rn);
            jSONObject2.put((JSONObject) "itemId", str2);
            jSONObject2.put((JSONObject) "page", String.valueOf(m3CellBean.pageNo));
            jSONObject2.put((JSONObject) "pagePos", String.valueOf(m3CellBean.pagePos));
            jSONObject.put((JSONObject) "clickTraceParams", (String) jSONObject2);
            if (m3CellBean.getBackCardRqParams() != null) {
                jSONObject.put((JSONObject) "uniqParams", (String) m3CellBean.getBackCardRqParams());
            }
            boolean b2 = ckf.b("true", h19.i(jSONObject, "needBackInsertCard", "true"));
            Map<String, String> b3 = h19.b(h19.d(jSONObject, "clickTraceParams"));
            ckf.f(b3, "convertJSONObjectToStringMap(...)");
            String string = jSONObject.getString(mh1.CLICK_TRACE);
            if (!TextUtils.isEmpty(string)) {
                ckf.d(str2);
                D(m3CellBean, str2, string, b2, b3);
            }
            ckf.d(str2);
            K(m3CellBean, str2);
            tt3.d().f(this.h.e().getTab(), str2, String.valueOf(System.currentTimeMillis()));
            sen.d("Item", l(false));
        }
    }

    public final void M() {
        String str;
        String str2;
        boolean z;
        String str3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c9e19c28", new Object[]{this});
            return;
        }
        M3CellBean m3CellBean = this.f20635a;
        if (m3CellBean.isP4p || m3CellBean.getX_qzt_ad() > 0) {
            if (!this.f20635a.getUseAuctionURL() || TextUtils.isEmpty(this.f20635a.getAuctionURL())) {
                str = pv8.DETAIL_URL_PRE_1s;
            } else {
                str = this.f20635a.getAuctionURL();
                ckf.d(str);
            }
            HashMap hashMap = new HashMap();
            hashMap.put("id", this.f20635a.itemId);
            hashMap.put("itemId", this.f20635a.itemId);
            String title = this.f20635a.getTitle();
            String str4 = "";
            if (title == null) {
                title = str4;
            }
            hashMap.put("title", title);
            pwm priceInfo = this.f20635a.getPriceInfo();
            if (priceInfo == null || (str2 = priceInfo.i()) == null) {
                str2 = str4;
            }
            hashMap.put("price", str2);
            String picPath = this.f20635a.getPicPath();
            hashMap.put(mh1.PRD_PICURL, picPath != null ? tsq.E(picPath, "_60x60.jpg", "", false, 4, null) : str4);
            String prefetchImgRatio = this.f20635a.getPrefetchImgRatio();
            if (prefetchImgRatio != null) {
                hashMap.put("prefetchImgRatio", prefetchImgRatio);
                if (ckf.b(prefetchImgRatio, "1:1")) {
                    str3 = this.f20635a.getPicPath();
                } else {
                    str3 = this.f20635a.getUprightImage();
                }
                if (str3 != null) {
                    str4 = str3;
                }
                hashMap.put("prefetchImg", str4);
            }
            JSONArray extraParams = this.f20635a.getExtraParams();
            if (extraParams != null) {
                int size = extraParams.size();
                for (int i = 0; i < size; i++) {
                    JSONObject jSONObject = extraParams.getJSONObject(i);
                    if (jSONObject != null) {
                        String string = jSONObject.getString("key");
                        String string2 = jSONObject.getString("value");
                        if (!TextUtils.isEmpty(string) && !TextUtils.isEmpty(string2)) {
                            hashMap.put(string, string2);
                        }
                    }
                }
            }
            JSONObject extDetailParams = this.f20635a.getExtDetailParams();
            if (extDetailParams != null) {
                for (Map.Entry<String, Object> entry : extDetailParams.entrySet()) {
                    ckf.f(entry, "next(...)");
                    Map.Entry<String, Object> entry2 = entry;
                    if (!(entry2.getKey() == null || entry2.getValue() == null)) {
                        hashMap.put(entry2.getKey(), entry2.getValue().toString());
                    }
                }
            }
            M3CellBean m3CellBean2 = this.f20635a;
            HashMap hashMap2 = new HashMap();
            if (TextUtils.isEmpty(this.f20635a.getAuctionBean().p4pContentUrl)) {
                M3CellBean m3CellBean3 = this.f20635a;
                if (!m3CellBean3.isP4p && m3CellBean3.getX_qzt_ad() <= 0) {
                    z = false;
                    AlimamaAdvertising.instance().handleAdUrlForClickid(u(m3CellBean2, str, hashMap, hashMap2, z).toString(), false);
                }
            }
            z = true;
            AlimamaAdvertising.instance().handleAdUrlForClickid(u(m3CellBean2, str, hashMap, hashMap2, z).toString(), false);
        }
    }

    public final void h() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c63f1b68", new Object[]{this});
        } else if (!TextUtils.isEmpty(this.f20635a.itemId)) {
            if (o4p.r0() && this.f20635a.getJiaGouUt()) {
                M();
            }
            HashMap hashMap = new HashMap();
            hashMap.put("itemId", this.f20635a.itemId);
            hashMap.put("bizName", "taobao_main_search");
            String skuSourceType = this.f20635a.getSkuSourceType();
            if (skuSourceType == null || (str = j.get(skuSourceType)) == null) {
                str = "0";
            }
            hashMap.put("sourceType", str);
            JSONObject jSONObject = new JSONObject();
            hashMap.put("exParams", jSONObject);
            StringBuilder sb = new StringBuilder();
            if (!TextUtils.isEmpty(this.f20635a.getAuctionBean().locType)) {
                jSONObject.put((JSONObject) r4p.KEY_LOC_TYPE, this.f20635a.getAuctionBean().locType);
                sb.append(r4p.KEY_LOC_TYPE);
            }
            jSONObject.put((JSONObject) "bizName", (String) hashMap.get("bizName"));
            JSONArray extraParams = this.f20635a.getExtraParams();
            if (extraParams != null) {
                int size = extraParams.size();
                for (int i = 0; i < size; i++) {
                    JSONObject jSONObject2 = extraParams.getJSONObject(i);
                    if (jSONObject2 != null) {
                        String string = jSONObject2.getString("key");
                        if (!TextUtils.isEmpty(string)) {
                            String string2 = jSONObject2.getString("value");
                            if (!TextUtils.isEmpty(string2)) {
                                jSONObject.put((JSONObject) string, string2);
                                if (sb.length() > 0) {
                                    sb.append(",");
                                }
                                sb.append(string);
                            }
                        }
                    }
                }
            }
            try {
                rrh.e().o(new vrh("msoa.taobao.cart.sdk", "msoa.taobao.detail.showsku", "2.0", "msoa.taobao.search", hashMap), new b());
            } catch (Exception unused) {
            }
        }
    }

    public final String y() {
        Map<String, String> map;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8bf3b984", new Object[]{this});
        }
        CommonSearchResult commonSearchResult = (CommonSearchResult) this.h.e().getTotalSearchResult();
        if (commonSearchResult == null || (map = commonSearchResult.getMainInfo().pageTraceArgs) == null) {
            return "";
        }
        String str = map.get("spm-cnt");
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        ckf.d(str);
        List z0 = wsq.z0(str, new String[]{"."}, false, 0, 6, null);
        if (z0.size() < 2) {
            return "";
        }
        return ((String) z0.get(0)) + '.' + ((String) z0.get(1)) + ".itemlist." + this.c;
    }

    static {
        t2o.a(815792470);
        HashMap<String, String> hashMap = new HashMap<>();
        j = hashMap;
        HashSet<String> hashSet = new HashSet<>();
        k = hashSet;
        hashMap.put("s_btn_addcart", "5");
        hashMap.put("s_btn_buy", "6");
        hashMap.put("double_btn", "0");
        hashMap.put("normal", "0");
        hashSet.add("page");
        hashSet.add("pageSize");
        hashSet.add("pageTraceArgs");
        hashSet.add("pageTraceName");
        hashSet.add("rootPageName");
        hashSet.add("sessionid");
        hashSet.add("style");
        hashSet.add("totalResults");
        hashSet.add("totalPage");
    }

    public final void z(M3CellBean m3CellBean, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c835e3cb", new Object[]{this, m3CellBean, map});
            return;
        }
        CommonBaseDatasource e = this.h.e();
        ckf.e(e, "null cannot be cast to non-null type com.taobao.search.sf.datasource.mainsearch.MainSearchDatasource");
        g1i g1iVar = (g1i) e;
        CommonSearchResult commonSearchResult = (CommonSearchResult) g1iVar.getTotalSearchResult();
        if (commonSearchResult != null) {
            map.put("tab", g1iVar.getTab());
            map.put(yj4.PARAM_SEARCH_KEYWORD_RN, m3CellBean.rn);
            map.put(r4p.KEY_EDITION_CODE, k1p.c());
            map.put("elderHome", String.valueOf(cvr.INSTANCE.c()));
            map.put(r4p.KEY_GRAY_HAIR, String.valueOf(this.h.f().getBooleanParam(r4p.KEY_SEARCH_ELDER_HOME_OPEN)));
            int i = this.c;
            int f = hfn.f(commonSearchResult.getCellsCount(), i + 10);
            StringBuilder sb = new StringBuilder();
            for (int c = hfn.c(0, i - 10); c < f; c++) {
                BaseCellBean cell = commonSearchResult.getCell(c);
                if (TextUtils.equals("item", cell.cardType)) {
                    if (sb.length() > 0) {
                        sb.append(",");
                    }
                    sb.append(cell.itemId);
                }
            }
            map.put("nearbyItems", sb.toString());
            int i2 = 1 + i;
            String str = "";
            String str2 = commonSearchResult.getCellsCount() > i2 ? commonSearchResult.getCell(i2).type : str;
            ckf.d(str2);
            int i3 = i + 2;
            if (commonSearchResult.getCellsCount() > i3) {
                str = commonSearchResult.getCell(i3).type;
            }
            ckf.d(str);
            map.put("nextItemsType", str2 + ',' + str);
            map.put("sessionid", commonSearchResult.getMainInfo().rn);
            if (!TextUtils.isEmpty(commonSearchResult.sessionId)) {
                map.put("sessionId", commonSearchResult.sessionId);
            }
            if (!TextUtils.isEmpty(commonSearchResult.spClientSession)) {
                map.put("sp_client_session", commonSearchResult.spClientSession);
            }
            map.put("jarvis_dynamic_card", "false");
            map.put("max_page", String.valueOf(g1iVar.getCurrentPage()));
            g1iVar.Z(map, null);
            map.put(r4p.KEY_P4P_S, String.valueOf(g1iVar.f0()));
            map.put(r4p.KEY_ITEM_S, String.valueOf(g1iVar.e0()));
            map.put("bottom", String.valueOf(o1p.e(this.b.itemView.getBottom())));
            ViewParent parent = this.b.itemView.getParent();
            ckf.e(parent, "null cannot be cast to non-null type android.view.ViewGroup");
            map.put("screenHeight", String.valueOf(o1p.e(((ViewGroup) parent).getHeight())));
        }
    }

    public final void A(M3CellBean m3CellBean) {
        String str;
        String str2;
        String str3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57177a2", new Object[]{this, m3CellBean});
            return;
        }
        HashMap hashMap = new HashMap();
        if (!TextUtils.isEmpty(m3CellBean.getAuctionBean().p4pContentUrl)) {
            str = m3CellBean.getAuctionBean().p4pContentUrl;
        } else if (!TextUtils.isEmpty(m3CellBean.getFinalTargetUrl())) {
            Uri.Builder buildUpon = Uri.parse(m3CellBean.getFinalTargetUrl()).buildUpon();
            if (m3CellBean.isP4p || m3CellBean.getX_qzt_ad() > 0) {
                ckf.d(buildUpon);
                g(m3CellBean, buildUpon);
            }
            try {
                buildUpon.appendQueryParameter("spm", y()).toString();
            } catch (Exception unused) {
            }
            N();
            Nav.from(this.b.getActivity()).toUri(buildUpon.build());
            return;
        } else {
            if (!m3CellBean.getUseAuctionURL() || TextUtils.isEmpty(m3CellBean.getAuctionURL())) {
                str = pv8.DETAIL_URL_PRE_1s;
            } else {
                str = m3CellBean.getAuctionURL();
                ckf.d(str);
            }
            hashMap.put("id", m3CellBean.itemId);
            hashMap.put("itemId", m3CellBean.itemId);
            String title = m3CellBean.getTitle();
            String str4 = "";
            if (title == null) {
                title = str4;
            }
            hashMap.put("title", title);
            pwm priceInfo = m3CellBean.getPriceInfo();
            if (priceInfo == null || (str2 = priceInfo.i()) == null) {
                str2 = str4;
            }
            hashMap.put("price", str2);
            String picPath = m3CellBean.getPicPath();
            hashMap.put(mh1.PRD_PICURL, picPath != null ? tsq.E(picPath, "_60x60.jpg", "", false, 4, null) : str4);
            String prefetchImgRatio = m3CellBean.getPrefetchImgRatio();
            if (prefetchImgRatio != null) {
                hashMap.put("prefetchImgRatio", prefetchImgRatio);
                if (ckf.b(prefetchImgRatio, "1:1")) {
                    str3 = m3CellBean.getPicPath();
                } else {
                    str3 = m3CellBean.getUprightImage();
                }
                if (str3 != null) {
                    str4 = str3;
                }
                hashMap.put("prefetchImg", str4);
            }
            JSONArray extraParams = m3CellBean.getExtraParams();
            if (extraParams != null) {
                int size = extraParams.size();
                for (int i = 0; i < size; i++) {
                    JSONObject jSONObject = extraParams.getJSONObject(i);
                    if (jSONObject != null) {
                        String string = jSONObject.getString("key");
                        String string2 = jSONObject.getString("value");
                        if (!TextUtils.isEmpty(string) && !TextUtils.isEmpty(string2)) {
                            hashMap.put(string, string2);
                        }
                    }
                }
            }
            JSONObject extDetailParams = m3CellBean.getExtDetailParams();
            if (extDetailParams != null) {
                for (Map.Entry<String, Object> entry : extDetailParams.entrySet()) {
                    ckf.f(entry, "next(...)");
                    Map.Entry<String, Object> entry2 = entry;
                    if (!(entry2.getKey() == null || entry2.getValue() == null)) {
                        hashMap.put(entry2.getKey(), entry2.getValue().toString());
                    }
                }
            }
        }
        if (!TextUtils.isEmpty(str)) {
            Uri u = u(m3CellBean, str, hashMap, new HashMap(), !TextUtils.isEmpty(m3CellBean.getAuctionBean().p4pContentUrl) || m3CellBean.isP4p || m3CellBean.getX_qzt_ad() > 0);
            N();
            Nav.from(this.b.getActivity()).toUri(u);
        }
    }
}
