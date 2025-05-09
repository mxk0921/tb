package com.taobao.search.musie;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.ScaleAnimation;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.collection.ArrayMap;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nav.Nav;
import com.taobao.android.searchbaseframe.business.srp.list.uikit.PartnerRecyclerView;
import com.taobao.android.searchbaseframe.chitu.TBSearchChiTuJSBridge;
import com.taobao.android.searchbaseframe.datasource.impl.BaseSearchResult;
import com.taobao.android.searchbaseframe.datasource.impl.bean.ResultMainInfoBean;
import com.taobao.android.searchbaseframe.datasource.impl.cell.BaseCellBean;
import com.taobao.android.searchbaseframe.datasource.param.SearchParamImpl;
import com.taobao.android.searchbaseframe.list.AbsListAdapter;
import com.taobao.android.searchbaseframe.list.WidgetViewHolder;
import com.taobao.android.searchbaseframe.nx3.bean.MuiseBean;
import com.taobao.android.searchbaseframe.nx3.bean.MuiseCellBean;
import com.taobao.android.searchbaseframe.nx3.bean.TemplateBean;
import com.taobao.android.searchbaseframe.util.ListStyle;
import com.taobao.android.xsearchplugin.muise.BaseMuiseCellViewHolder;
import com.taobao.search.jarvis.bean.DynamicCardBean;
import com.taobao.search.musie.list.horizontal.HorizontalXslComponent;
import com.taobao.search.refactor.MSController;
import com.taobao.search.sf.InshopResultActivity;
import com.taobao.search.sf.context.CommonSearchContext;
import com.taobao.search.sf.datasource.CommonBaseDatasource;
import com.taobao.search.sf.datasource.CommonSearchResult;
import com.taobao.search.sf.realtimetag.IRealTimeTagContainer;
import com.taobao.taobao.R;
import com.taobao.uikit.feature.view.TRecyclerView;
import java.util.HashMap;
import java.util.Map;
import org.android.agoo.common.AgooConstants;
import tb.acx;
import tb.amo;
import tb.arj;
import tb.ay4;
import tb.ayf;
import tb.b1p;
import tb.bqg;
import tb.bv9;
import tb.c2v;
import tb.c4p;
import tb.cvr;
import tb.drj;
import tb.f1p;
import tb.f64;
import tb.frh;
import tb.fw;
import tb.g1i;
import tb.g54;
import tb.gnh;
import tb.gy;
import tb.h19;
import tb.h1p;
import tb.h3p;
import tb.j3p;
import tb.jrh;
import tb.jtf;
import tb.k1p;
import tb.l1c;
import tb.l3p;
import tb.lib;
import tb.ls7;
import tb.mh1;
import tb.o02;
import tb.o1p;
import tb.o4p;
import tb.oen;
import tb.og3;
import tb.okn;
import tb.oxb;
import tb.pba;
import tb.peq;
import tb.pim;
import tb.pkn;
import tb.qkn;
import tb.r4p;
import tb.rj9;
import tb.rv6;
import tb.sif;
import tb.t2o;
import tb.tnd;
import tb.tt3;
import tb.ude;
import tb.vyd;
import tb.w02;
import tb.wyd;
import tb.x2;
import tb.x6a;
import tb.xno;
import tb.y4p;
import tb.y5p;
import tb.ye0;
import tb.yj4;
import tb.yqj;
import tb.zno;
import tb.zvr;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class SearchMuiseViewHolder extends BaseMuiseCellViewHolder<acx<? extends o02<? extends BaseSearchResult, ?>>> implements IRealTimeTagContainer, GestureDetector.OnGestureListener, l1c {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final ay4<w02, SearchMuiseViewHolder> CREATOR = new a();
    public MuiseCellBean H;
    public long I;
    public FrameLayout J;
    public TextView K;
    public GestureDetector M;
    public WidgetViewHolder N;
    public final RecyclerView O;
    public String F = "";
    public String G = "";
    public arj L = null;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements ay4<w02, SearchMuiseViewHolder> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: b */
        public SearchMuiseViewHolder a(w02 w02Var) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (SearchMuiseViewHolder) ipChange.ipc$dispatch("7ad01682", new Object[]{this, w02Var});
            }
            return new SearchMuiseViewHolder(w02Var.f31046a, w02Var.c, w02Var.b, w02Var.g, w02Var.d, w02Var.f);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class b implements arj.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f11577a;
        public final /* synthetic */ arj.b b;

        public b(String str, arj.b bVar) {
            this.f11577a = str;
            this.b = bVar;
        }

        @Override // tb.arj.a
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e5e4c7a", new Object[]{this});
                return;
            }
            Nav.from(SearchMuiseViewHolder.this.getActivity()).toUri(this.f11577a);
            SearchMuiseViewHolder.T1(SearchMuiseViewHolder.this, true, true);
        }

        @Override // tb.arj.a
        public void b(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7a5fb516", new Object[]{this, jSONObject});
                return;
            }
            drj.c(this.b, Integer.valueOf(SearchMuiseViewHolder.this.i0()), SearchMuiseViewHolder.U1(SearchMuiseViewHolder.this), jSONObject, Integer.valueOf(SearchMuiseViewHolder.this.itemView.getHeight()), Integer.valueOf(ListStyle.toNum(SearchMuiseViewHolder.V1(SearchMuiseViewHolder.this))));
            if (SearchMuiseViewHolder.W1(SearchMuiseViewHolder.this) != null) {
                SearchMuiseViewHolder.W1(SearchMuiseViewHolder.this).invalidateItemDecorations();
            }
        }

        @Override // tb.arj.a
        public void cancel() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("707fe601", new Object[]{this});
            } else {
                SearchMuiseViewHolder.T1(SearchMuiseViewHolder.this, false, true);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                SearchMuiseViewHolder.T1(SearchMuiseViewHolder.this, true, true);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class d implements Animation.AnimationListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public d() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("724c33d", new Object[]{this, animation});
            } else if (SearchMuiseViewHolder.X1(SearchMuiseViewHolder.this) != null) {
                ((FrameLayout) SearchMuiseViewHolder.X1(SearchMuiseViewHolder.this).getView()).clearAnimation();
                SearchMuiseViewHolder.X1(SearchMuiseViewHolder.this).destroyAndRemoveFromParent();
                SearchMuiseViewHolder.Z1(SearchMuiseViewHolder.this, null);
            }
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8f2883e7", new Object[]{this, animation});
            }
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f2d146c4", new Object[]{this, animation});
            }
        }
    }

    static {
        t2o.a(815792671);
        t2o.a(815793651);
        t2o.a(815793449);
        t2o.a(815793448);
    }

    public SearchMuiseViewHolder(Activity activity, acx<? extends o02<? extends BaseSearchResult, ?>> acxVar, ude udeVar, ListStyle listStyle, ViewGroup viewGroup, int i) {
        super(activity, I0(activity, viewGroup), udeVar, listStyle, i, acxVar);
        if (viewGroup instanceof RecyclerView) {
            this.O = (RecyclerView) viewGroup;
        }
    }

    public static void C2(Map<String, Object> map, Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb6e5d1", new Object[]{map, activity});
        } else if (activity instanceof wyd) {
            wyd wydVar = (wyd) activity;
            if (wydVar.l()) {
                map.put("styleConfig", g54.INSTANCE.f());
                map.put(r4p.KEY_TB_2024, "true");
                map.put("tb2024Style", "0");
                return;
            }
            if (TextUtils.equals(wydVar.S1(), "enable2")) {
                map.put("tb2024Style", "1");
            } else {
                map.put("tb2024Style", "2");
            }
            map.put(r4p.KEY_TB_2024, "false");
        }
    }

    public static View I0(Context context, ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("5159ec40", new Object[]{context, viewGroup});
        }
        return new MuiseContainer(context);
    }

    public static /* synthetic */ void T1(SearchMuiseViewHolder searchMuiseViewHolder, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b6fc040a", new Object[]{searchMuiseViewHolder, new Boolean(z), new Boolean(z2)});
        } else {
            searchMuiseViewHolder.d2(z, z2);
        }
    }

    public static /* synthetic */ MuiseCellBean U1(SearchMuiseViewHolder searchMuiseViewHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MuiseCellBean) ipChange.ipc$dispatch("e3c489e0", new Object[]{searchMuiseViewHolder});
        }
        return searchMuiseViewHolder.H;
    }

    public static /* synthetic */ ListStyle V1(SearchMuiseViewHolder searchMuiseViewHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ListStyle) ipChange.ipc$dispatch("770f6c45", new Object[]{searchMuiseViewHolder});
        }
        return searchMuiseViewHolder.j0();
    }

    public static /* synthetic */ RecyclerView W1(SearchMuiseViewHolder searchMuiseViewHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecyclerView) ipChange.ipc$dispatch("9710114e", new Object[]{searchMuiseViewHolder});
        }
        return searchMuiseViewHolder.O;
    }

    public static /* synthetic */ arj X1(SearchMuiseViewHolder searchMuiseViewHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (arj) ipChange.ipc$dispatch("5b31040", new Object[]{searchMuiseViewHolder});
        }
        return searchMuiseViewHolder.L;
    }

    public static /* synthetic */ arj Z1(SearchMuiseViewHolder searchMuiseViewHolder, arj arjVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (arj) ipChange.ipc$dispatch("af5fbf40", new Object[]{searchMuiseViewHolder, arjVar});
        }
        searchMuiseViewHolder.L = arjVar;
        return arjVar;
    }

    public static /* synthetic */ Object ipc$super(SearchMuiseViewHolder searchMuiseViewHolder, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1774438353:
                super.onRefreshSuccess((com.taobao.android.weex_framework.a) objArr[0]);
                return null;
            case -1743784140:
                return searchMuiseViewHolder.f0();
            case -1698538053:
                return new Boolean(super.m2((String) objArr[0], (JSONObject) objArr[1], (f64.a) objArr[2], (f64.a) objArr[3]));
            case -1642141702:
                super.W0();
                return null;
            case -1313914308:
                super.K0();
                return null;
            case -211767613:
                super.v0();
                return null;
            case 523240207:
                super.P((com.taobao.android.weex_framework.a) objArr[0]);
                return null;
            case 523666796:
                return new Boolean(super.K((String) objArr[0], (JSONObject) objArr[1], (f64.a) objArr[2], (f64.a) objArr[3]));
            case 578085726:
                super.X0();
                return null;
            case 724233032:
                super.onRenderSuccess((com.taobao.android.weex_framework.a) objArr[0]);
                return null;
            case 767914182:
                return super.a1((MuiseCellBean) objArr[0], ((Number) objArr[1]).intValue(), ((Boolean) objArr[2]).booleanValue(), (ListStyle) objArr[3]);
            case 850059560:
                return new Boolean(super.U0((ListStyle) objArr[0], (MuiseCellBean) objArr[1]));
            case 949399698:
                super.x0();
                return null;
            case 1154091729:
                super.q1((fw) objArr[0]);
                return null;
            case 1508575230:
                super.r1((View) objArr[0]);
                return null;
            case 1626033557:
                super.t0();
                return null;
            case 1640004263:
                super.u0(((Number) objArr[0]).intValue(), (MuiseCellBean) objArr[1]);
                return null;
            case 1802319597:
                return new Boolean(super.Y());
            case 1849556539:
                super.y0();
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/musie/SearchMuiseViewHolder");
        }
    }

    public void A2(Map<String, Object> map, MuiseBean muiseBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("40ee8a0d", new Object[]{this, map, muiseBean});
            return;
        }
        JSONObject jSONObject = muiseBean.pageInfoExtraStatus;
        if (jSONObject != null) {
            JSONObject jSONObject2 = new JSONObject(jSONObject);
            jSONObject2.put("pageName", (Object) c2v.getInstance().getCurrentPageName());
            map.put(HorizontalXslComponent.ATTR_PAGE_INFO, jSONObject2);
        }
    }

    public final void D2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("11bcbb7f", new Object[]{this});
            return;
        }
        WidgetViewHolder widgetViewHolder = this.N;
        if (widgetViewHolder != null) {
            this.J.removeView(widgetViewHolder.itemView);
            this.N.e0();
            this.N = null;
        }
    }

    public void E2(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1dd3c784", new Object[]{this, str, str2});
            return;
        }
        if (k2() != null) {
            k2().removeParamSetValue(str, str2);
            if (y2()) {
                return;
            }
        }
        q2().removeParam(str, str2);
    }

    @Override // com.taobao.android.xsearchplugin.muise.BaseMuiseCellViewHolder
    /* renamed from: F1 */
    public boolean U0(ListStyle listStyle, MuiseCellBean muiseCellBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("32aae128", new Object[]{this, listStyle, muiseCellBean})).booleanValue();
        }
        if (super.U0(listStyle, muiseCellBean) || x2()) {
            return true;
        }
        return false;
    }

    @Override // com.taobao.android.xsearchplugin.muise.BaseMuiseCellViewHolder
    /* renamed from: G1 */
    public void u0(int i, MuiseCellBean muiseCellBean) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61c07aa7", new Object[]{this, new Integer(i), muiseCellBean});
        } else if (muiseCellBean.removed) {
            c4p.n("SearchMuiseViewHolder", "cell at " + i + " has been removed, skip render");
            this.itemView.getLayoutParams().height = 0;
        } else {
            if (i == 0) {
                Q2();
            }
            this.H = muiseCellBean;
            this.F = muiseCellBean.type;
            TemplateBean y = this.l.y(c1(muiseCellBean));
            if (y != null) {
                str = y.version;
            } else {
                str = "";
            }
            this.G = str;
            Activity activity = this.f9341a;
            if ((activity instanceof gnh) && y != null) {
                ((gnh) activity).T2(y.templateName, y.version, this.l);
            }
            super.u0(i, muiseCellBean);
            I2();
            if (b1p.INSTANCE.a(j3p.g())) {
                H2(muiseCellBean);
            }
            J2(muiseCellBean);
        }
    }

    public final void G2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e7f16677", new Object[]{this});
            return;
        }
        this.itemView.getLayoutParams().height = 0;
        this.itemView.requestLayout();
        RecyclerView recyclerView = this.O;
        if (recyclerView != null) {
            recyclerView.invalidateItemDecorations();
        }
        this.H.removed = true;
    }

    @Override // com.taobao.android.xsearchplugin.muise.BaseMuiseCellViewHolder
    /* renamed from: H1 */
    public Map<String, Object> a1(MuiseCellBean muiseCellBean, int i, boolean z, ListStyle listStyle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("2dc570c6", new Object[]{this, muiseCellBean, new Integer(i), new Boolean(z), listStyle});
        }
        Map<String, Object> H1 = super.a1(muiseCellBean, i, z, listStyle);
        BaseSearchResult baseSearchResult = (BaseSearchResult) ((acx) l0()).e().getLastSearchResult();
        if (baseSearchResult instanceof CommonSearchResult) {
            H1.put("iconData", ((CommonSearchResult) baseSearchResult).nxRawIcon);
        }
        A2(H1, muiseCellBean.mMuiseBean);
        return H1;
    }

    public void I2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("651c6480", new Object[]{this});
        } else if (this.H != null) {
            D2();
            this.J.removeAllViews();
            Object obj = this.H.mExtraObj.get("dynamicCardBean");
            if (obj instanceof DynamicCardBean) {
                DynamicCardBean dynamicCardBean = (DynamicCardBean) obj;
                WidgetViewHolder c2 = pkn.c(this, getActivity(), dynamicCardBean, i0(), this.H.mMuiseBean.model);
                this.J.addView(c2.itemView);
                if (dynamicCardBean.firstRender) {
                    ScaleAnimation scaleAnimation = new ScaleAnimation(1.0f, 1.0f, 0.0f, 1.0f);
                    scaleAnimation.setDuration(300L);
                    c2.itemView.startAnimation(scaleAnimation);
                    dynamicCardBean.firstRender = false;
                }
                this.N = c2;
            }
        }
    }

    public final void J2(MuiseCellBean muiseCellBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c8054a32", new Object[]{this, muiseCellBean});
        } else if (((acx) l0()).e() instanceof CommonBaseDatasource) {
            L2();
        }
    }

    @Override // com.taobao.android.xsearchplugin.muise.AbsMuiseViewHolder
    public void K0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b1af423c", new Object[]{this});
            return;
        }
        super.K0();
        View view = this.itemView;
        if (view instanceof MuiseContainer) {
            this.J = ((MuiseContainer) view).getInnerCardContainer();
        } else {
            this.J = (FrameLayout) view.findViewById(R.id.fl_inner_card_container);
        }
        if (this.itemView instanceof sif) {
            this.M = new GestureDetector(getActivity().getApplicationContext(), this);
            ((sif) this.itemView).setOnInterceptTouchEventListener(new x6a(this.M));
        }
    }

    public final void K2(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d398bfdb", new Object[]{this, jSONObject});
            return;
        }
        o02 e = ((acx) l0()).e();
        if (e instanceof CommonBaseDatasource) {
            drj.d(getActivity(), ((CommonBaseDatasource) e).n(), jSONObject, ((acx) l0()).f().getBooleanParam(r4p.KEY_SEARCH_ELDER_HOME_OPEN));
        }
    }

    public final void L2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e9c38bf3", new Object[]{this});
            return;
        }
        this.itemView.setBackgroundDrawable(null);
        this.itemView.setClipToOutline(false);
        this.itemView.setOutlineProvider(null);
    }

    public void M2(String str, String str2, boolean z, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("49be1191", new Object[]{this, str, str2, new Boolean(z), map});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("itemId", str);
        v2(hashMap);
        hashMap.putAll(map);
        qkn.c(str2, hashMap, getActivity(), t2(), z, ((g1i) ((acx) l0()).e()).u());
    }

    public final void N2(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dcce78ec", new Object[]{this, str});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put(yj4.PARAM_SEARCH_KEYWORD_POS, String.valueOf(t2()));
        hashMap.put("page", String.valueOf(this.H.pageNo));
        hashMap.put("trigger_item_id", str);
        hashMap.put("pv_pos", String.valueOf(getData().pagePos));
        hashMap.put(yj4.PARAM_SEARCH_KEYWORD_RN, this.H.rn);
        hashMap.put("pv_size", String.valueOf(getData().pageSize));
        hashMap.put("below_p4p", String.valueOf(w2()));
        hashMap.put("below_pos", String.valueOf(p2()));
        try {
            hashMap.put("bottom", String.valueOf(o1p.e(this.itemView.getBottom())));
            hashMap.put("screen_height", String.valueOf(o1p.e(((ViewGroup) this.itemView.getParent()).getHeight())));
            c2(hashMap);
        } catch (Throwable unused) {
        }
        B0(new jtf(str, hashMap), "childPageWidget");
    }

    public final void O2(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("285787c1", new Object[]{this, jSONObject});
        } else if (jSONObject != null) {
            for (Map.Entry<String, Object> entry : jSONObject.entrySet()) {
                setParam(entry.getKey(), entry.getValue().toString());
            }
        }
    }

    public final void Q2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("35fe6bb4", new Object[]{this});
            return;
        }
        y5p firstRequestPerf = ((acx) l0()).e().getFirstRequestPerf();
        if (firstRequestPerf != null && !firstRequestPerf.f31873a && firstRequestPerf.A == 0) {
            firstRequestPerf.A = System.currentTimeMillis();
            xno srpLifeCycleWatcher = q2().getSrpLifeCycleWatcher();
            if (srpLifeCycleWatcher != null) {
                srpLifeCycleWatcher.c(zno.SPAN_CELL);
            }
        }
    }

    public final void R2(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("716ce15e", new Object[]{this, str});
        } else if (((acx) l0()).e().getTotalSearchResult() instanceof CommonSearchResult) {
            x2.Companion.b(str, getActivity(), (CommonSearchResult) ((acx) l0()).e().getTotalSearchResult(), i0());
        }
    }

    public final void S2(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("77c2f7b6", new Object[]{this, str});
        } else if (((acx) l0()).e().getTotalSearchResult() instanceof CommonSearchResult) {
            x2.Companion.c(str, getActivity(), (CommonSearchResult) ((acx) l0()).e().getTotalSearchResult(), (jrh) ((acx) l0()).e(), i0());
        }
    }

    @Override // com.taobao.android.xsearchplugin.muise.AbsMuiseViewHolder
    public void W0() {
        o02 o02Var;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1ee7fa", new Object[]{this});
            return;
        }
        super.W0();
        if (getData() != null) {
            if (!getData().isExposed) {
                S2(getData().itemId);
            }
            getData().isExposed = true;
        }
        this.I = System.currentTimeMillis();
        if (l0() != 0) {
            o02Var = ((acx) l0()).e();
        } else {
            o02Var = null;
        }
        if (getParent() instanceof og3) {
            ((og3) getParent()).n1(i0(), getData(), (BaseSearchResult) o02Var.getTotalSearchResult(), o02Var);
        }
        if ((((acx) l0()).e() instanceof jrh) && getData() != null) {
            pba.INSTANCE.a(getData());
        }
    }

    @Override // com.taobao.android.xsearchplugin.muise.AbsMuiseViewHolder
    public void X0() {
        o02 o02Var;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2274e35e", new Object[]{this});
            return;
        }
        super.X0();
        if (l0() != 0) {
            o02Var = ((acx) l0()).e();
        } else {
            o02Var = null;
        }
        if (o02Var != null && (getParent() instanceof og3)) {
            ((og3) getParent()).u0(i0(), getData(), System.currentTimeMillis() - this.I, (BaseSearchResult) o02Var.getTotalSearchResult(), o02Var);
        }
    }

    @Override // com.taobao.android.xsearchplugin.muise.BaseMuiseCellViewHolder, tb.wg3
    public boolean Y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6b6d36ed", new Object[]{this})).booleanValue();
        }
        if (getData() == null) {
            return false;
        }
        if (getData().videoForcePlay) {
            return true;
        }
        if (!super.Y() || !f1p.e(((acx) l0()).e())) {
            return false;
        }
        return true;
    }

    public void a2(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bf385287", new Object[]{this, str, str2});
            return;
        }
        if (k2() != null) {
            k2().addParamSetValue(str, str2);
            if (y2()) {
                return;
            }
        }
        q2().addParam(str, str2);
    }

    public final void c2(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bf9acec", new Object[]{this, map});
            return;
        }
        ViewParent parent = this.itemView.getParent();
        if (parent instanceof PartnerRecyclerView) {
            PartnerRecyclerView partnerRecyclerView = (PartnerRecyclerView) parent;
            int headerViewsCount = partnerRecyclerView.getHeaderViewsCount();
            View childAt = partnerRecyclerView.getChildAt(partnerRecyclerView.getChildCount() - 1);
            int layoutPosition = partnerRecyclerView.getChildViewHolder(childAt).getLayoutPosition() - headerViewsCount;
            int e = o1p.e(childAt.getTop());
            View childAt2 = partnerRecyclerView.getChildAt(partnerRecyclerView.getChildCount() - 2);
            int layoutPosition2 = partnerRecyclerView.getChildViewHolder(childAt2).getLayoutPosition() - headerViewsCount;
            int e2 = o1p.e(childAt2.getTop());
            map.put("last_expose_pos_list", layoutPosition2 + "," + layoutPosition);
            map.put("last_expose_top_height_list", e2 + "," + e);
        }
    }

    @Override // com.taobao.search.sf.realtimetag.IRealTimeTagContainer
    public void clearTag() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a22e8814", new Object[]{this});
        }
    }

    public final void d2(boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac6e37c4", new Object[]{this, new Boolean(z), new Boolean(z2)});
            return;
        }
        arj arjVar = this.L;
        if (arjVar != null) {
            if (z) {
                ((FrameLayout) arjVar.getView()).clearAnimation();
                if (z2) {
                    this.L.destroyAndRemoveFromParent();
                }
                this.L = null;
            } else if (arjVar.getView() != 0 && ((FrameLayout) this.L.getView()).getAnimation() == null) {
                AlphaAnimation b2 = drj.b(false);
                b2.setAnimationListener(new d());
                ((FrameLayout) this.L.getView()).startAnimation(b2);
            }
        }
    }

    public final void e2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd07aa41", new Object[]{this});
            return;
        }
        if (k2() != null) {
            k2().removeAllParams();
        }
        q2().removeAllParams();
        tnd f = ((acx) l0()).f();
        if (f instanceof CommonSearchContext) {
            q2().setParams(((CommonSearchContext) f).getOtherTabParams());
        }
    }

    public void f2(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a1864d1", new Object[]{this, str});
            return;
        }
        if (k2() != null) {
            k2().removeParam(str);
            if (y2()) {
                return;
            }
        }
        q2().clearParam(str);
    }

    public final void g2(JSONObject jSONObject) {
        JSONArray c2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fc56a8f6", new Object[]{this, jSONObject});
        } else if (jSONObject != null && (c2 = h19.c(jSONObject, "keys")) != null) {
            for (int i = 0; i < c2.size(); i++) {
                String string = c2.getString(i);
                if (!TextUtils.isEmpty(string)) {
                    f2(string);
                }
            }
        }
    }

    @Override // com.taobao.search.sf.realtimetag.IRealTimeTagContainer
    public ListStyle getContainerListStyle() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ListStyle) ipChange.ipc$dispatch("1c77b9ec", new Object[]{this});
        }
        return j0();
    }

    public final void i2(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("135ec81d", new Object[]{this, jSONObject});
        } else if (jSONObject != null && !jSONObject.isEmpty()) {
            String string = jSONObject.getString("itemId");
            if (!TextUtils.isEmpty(string)) {
                N2(string);
            }
        }
    }

    public final SearchParamImpl k2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SearchParamImpl) ipChange.ipc$dispatch("cec8a20f", new Object[]{this});
        }
        if (getData().combo != null) {
            return getData().combo.r();
        }
        return null;
    }

    public final MSController l2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MSController) ipChange.ipc$dispatch("44eed38f", new Object[]{this});
        }
        return (MSController) ((acx) l0()).d().h("controller");
    }

    @Override // com.taobao.android.xsearchplugin.muise.BaseMuiseCellViewHolder, tb.cnx
    public boolean m2(String str, JSONObject jSONObject, f64.a aVar, f64.a aVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9ac25dbb", new Object[]{this, str, jSONObject, aVar, aVar2})).booleanValue();
        }
        if ("negativeFeedbackPop".equals(str)) {
            B2(jSONObject);
            return true;
        } else if ("clickInShopAuction".equals(str)) {
            u2(jSONObject);
            return true;
        } else if (!"negativeFeedbackOptionClick".equals(str)) {
            return super.m2(str, jSONObject, aVar, aVar2);
        } else {
            K2(jSONObject);
            return true;
        }
    }

    public arj.b n2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (arj.b) ipChange.ipc$dispatch("8967d4da", new Object[]{this});
        }
        return new peq((CommonBaseDatasource) ((acx) l0()).a(), getData(), l2());
    }

    public final String o2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("98390fa", new Object[]{this});
        }
        if (!(getActivity() instanceof InshopResultActivity)) {
            String paramStr = ((acx) l0()).e().getParamStr("shopAuctionSpmCnt");
            return !TextUtils.isEmpty(paramStr) ? paramStr : "a2141.7631671";
        } else if ("category".equals(((acx) l0()).e().getParamValue("from"))) {
            return "a2141.7631684";
        } else {
            return "a2141.11319901";
        }
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onDown(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("22fe0341", new Object[]{this, motionEvent})).booleanValue();
        }
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f2b37f32", new Object[]{this, motionEvent, motionEvent2, new Float(f), new Float(f2)})).booleanValue();
        }
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public void onLongPress(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8638ede4", new Object[]{this, motionEvent});
        }
    }

    @Override // com.taobao.android.xsearchplugin.muise.BaseMuiseCellViewHolder, com.taobao.android.xsearchplugin.muise.AbsMuiseViewHolder, tb.npc
    public void onRefreshSuccess(com.taobao.android.weex_framework.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("963c382f", new Object[]{this, aVar});
            return;
        }
        super.onRefreshSuccess(aVar);
        if (i0() == 0) {
            P2();
        }
    }

    @Override // com.taobao.android.xsearchplugin.muise.BaseMuiseCellViewHolder, com.taobao.android.xsearchplugin.muise.AbsMuiseViewHolder, tb.npc
    public void onRenderSuccess(com.taobao.android.weex_framework.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b2aeb48", new Object[]{this, aVar});
            return;
        }
        super.onRenderSuccess(aVar);
        if (i0() == 0) {
            P2();
        }
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("12546941", new Object[]{this, motionEvent, motionEvent2, new Float(f), new Float(f2)})).booleanValue();
        }
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public void onShowPress(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b398c1c3", new Object[]{this, motionEvent});
        }
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onSingleTapUp(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5de27077", new Object[]{this, motionEvent})).booleanValue();
        }
        if (!TextUtils.equals(getData().cardType, "item") && o4p.z1()) {
            qkn.d(getData(), null, getActivity(), t2(), ((acx) l0()).e());
        }
        return false;
    }

    public final int p2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("79e9dc4c", new Object[]{this})).intValue();
        }
        int t2 = t2();
        if (j0() == ListStyle.LIST) {
            return t2 + 1;
        }
        return t2 + 2;
    }

    public final gy q2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (gy) ipChange.ipc$dispatch("1ca610f8", new Object[]{this});
        }
        return ((acx) l0()).e();
    }

    @Override // com.taobao.android.xsearchplugin.muise.BaseMuiseCellViewHolder, com.taobao.android.xsearchplugin.muise.AbsMuiseViewHolder
    public void r1(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("59eb07fe", new Object[]{this, view});
            return;
        }
        super.r1(view);
        Activity activity = this.f9341a;
        if ((activity instanceof oxb) && ((oxb) activity).E1()) {
            view.setBackgroundResource(R.color.tbsearch_main_card_bg_night);
        }
    }

    public Map<String, String> s2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("cb8ab540", new Object[]{this});
        }
        CommonBaseDatasource commonBaseDatasource = (CommonBaseDatasource) ((acx) l0()).e();
        if (!commonBaseDatasource.isMetaMode() || getData() == null || getData().combo == null) {
            return commonBaseDatasource.getLatestParamsSnapshot();
        }
        return commonBaseDatasource.l((frh) getData().combo);
    }

    public void setParam(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc6ab466", new Object[]{this, str, str2});
            return;
        }
        if (k2() != null) {
            k2().setParam(str, str2);
            if (y2()) {
                return;
            }
        }
        q2().setParam(str, str2);
    }

    @Override // com.taobao.android.xsearchplugin.muise.AbsMuiseViewHolder, com.taobao.android.searchbaseframe.list.WidgetViewHolder
    public void t0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60eb4d95", new Object[]{this});
            return;
        }
        super.t0();
        if (getParent() instanceof lib) {
            ((lib) getParent()).l();
        }
    }

    public final int t2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c923e81e", new Object[]{this})).intValue();
        }
        return i0();
    }

    public final void u2(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ad59019", new Object[]{this, jSONObject});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put(yj4.PARAM_SEARCH_KEYWORD_RN, getData().rn);
        hashMap.put(TBSearchChiTuJSBridge.ABTEST, getData().abtest);
        hashMap.put(ls7.INFO_PAGE_NUMBER, String.valueOf(getData().pageNo));
        hashMap.put("pagePos", String.valueOf(getData().pagePos));
        String str = o2() + ".itemlist." + i0();
        JSONObject jSONObject2 = jSONObject.getJSONObject("model");
        if (jSONObject2 != null) {
            ayf.h(jSONObject2, getActivity(), (CommonBaseDatasource) ((acx) l0()).a(), j0(), hashMap, str);
        }
    }

    @Override // com.taobao.android.xsearchplugin.muise.AbsMuiseViewHolder, com.taobao.android.searchbaseframe.list.WidgetViewHolder
    public void v0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f360aec3", new Object[]{this});
            return;
        }
        super.v0();
        D2();
    }

    public final boolean w2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e2a345a4", new Object[]{this})).booleanValue();
        }
        CommonSearchResult commonSearchResult = (CommonSearchResult) ((acx) l0()).e().getTotalSearchResult();
        int p2 = p2();
        if (commonSearchResult == null || p2 >= commonSearchResult.getCellsCount()) {
            return false;
        }
        return commonSearchResult.getCell(p2).isP4p;
    }

    @Override // com.taobao.android.xsearchplugin.muise.AbsMuiseViewHolder, com.taobao.android.searchbaseframe.list.WidgetViewHolder
    public void x0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3896b092", new Object[]{this});
            return;
        }
        super.x0();
        new Handler(Looper.getMainLooper()).post(new c());
    }

    public final boolean x2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b6008501", new Object[]{this})).booleanValue();
        }
        if (getData() == null) {
            return false;
        }
        Object obj = getData().mExtraObj.get("fullSpan");
        if (!(obj instanceof Boolean) || !((Boolean) obj).booleanValue()) {
            return false;
        }
        return true;
    }

    @Override // com.taobao.android.searchbaseframe.list.WidgetViewHolder
    public void y0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e3dfe3b", new Object[]{this});
            return;
        }
        super.y0();
        D2();
    }

    public boolean y2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c8ade1aa", new Object[]{this})).booleanValue();
        }
        return false;
    }

    @Override // tb.l1c
    public WidgetViewHolder z(BaseCellBean baseCellBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WidgetViewHolder) ipChange.ipc$dispatch("63271ec7", new Object[]{this, baseCellBean});
        }
        RecyclerView recyclerView = this.O;
        if (recyclerView == null) {
            return null;
        }
        AbsListAdapter absListAdapter = (AbsListAdapter) ((TRecyclerView.HeaderViewAdapter) recyclerView.getAdapter()).getWrappedAdapter();
        return absListAdapter.createViewHolder(this.O, absListAdapter.V(baseCellBean));
    }

    public final void H2(MuiseCellBean muiseCellBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("debf81d5", new Object[]{this, muiseCellBean});
        } else if (rv6.a()) {
            if (this.K == null) {
                TextView textView = new TextView(getActivity());
                this.K = textView;
                textView.setTextColor(-16711936);
                if (this.n.getParent() instanceof ViewGroup) {
                    ((ViewGroup) this.n.getParent()).addView(this.K);
                }
            }
            try {
                String substring = this.H.rn.substring(0, 8);
                if (!TextUtils.isEmpty(this.H.mMuiseBean.model.getJSONObject("utLogMap").getString("replaced_nid"))) {
                    substring = substring + " reRanked";
                }
                this.K.setText(substring);
            } catch (Throwable unused) {
            }
        }
    }

    public final void P2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2ef9e52f", new Object[]{this});
            return;
        }
        y5p firstRequestPerf = ((acx) l0()).e().getFirstRequestPerf();
        if (firstRequestPerf != null && !firstRequestPerf.f31873a && firstRequestPerf.z != 0 && firstRequestPerf.B == 0) {
            firstRequestPerf.B = System.currentTimeMillis();
            firstRequestPerf.f31873a = true;
            rj9.a(firstRequestPerf);
            xno srpLifeCycleWatcher = q2().getSrpLifeCycleWatcher();
            if (srpLifeCycleWatcher != null) {
                srpLifeCycleWatcher.d(zno.SPAN_CELL, null);
                HashMap hashMap = new HashMap();
                hashMap.put("isPassiveLaunch", Boolean.valueOf(bqg.b(getActivity().getIntent())));
                hashMap.put("apm_time", Long.valueOf(SystemClock.uptimeMillis()));
                hashMap.put("isPreloadRequest", Boolean.valueOf(y4p.g()));
                srpLifeCycleWatcher.a("search_render_finish", hashMap);
            }
        }
    }

    public void j2(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f6b0815", new Object[]{this, jSONObject});
        } else if (jSONObject != null && !jSONObject.isEmpty()) {
            JSONObject jSONObject2 = jSONObject.getJSONObject("optionParams");
            boolean e = h19.e(jSONObject2, "enableJarvis", false);
            JSONObject jSONObject3 = jSONObject.getJSONObject("requestParams");
            JSONObject jSONObject4 = jSONObject.getJSONObject("jarvisParams");
            String i = h19.i(jSONObject2, "appId", y4p.b());
            Map<String, String> b2 = h19.b(jSONObject3);
            v2(b2);
            okn u = ((g1i) ((acx) l0()).e()).u();
            if (u != null) {
                u.p(i, "", b2, t2(), e, jSONObject4);
            }
        }
    }

    @Override // com.taobao.android.xsearchplugin.muise.AbsMuiseViewHolder
    public void q1(fw fwVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44ca0ad1", new Object[]{this, fwVar});
            return;
        }
        super.q1(fwVar);
        new bv9().a(fwVar, ((acx) l0()).f().getBooleanParam(r4p.KEY_SEARCH_ELDER_HOME_OPEN));
        fwVar.b0(true ^ l3p.INSTANCE.d());
    }

    public final void F2(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b886ca5f", new Object[]{this, jSONObject});
        } else if (jSONObject != null) {
            JSONArray c2 = h19.c(jSONObject, "params");
            for (int i = 0; i < c2.size(); i++) {
                JSONObject jSONObject2 = c2.getJSONObject(i);
                if (jSONObject2 != null) {
                    E2(jSONObject2.getString("key"), jSONObject2.getString("value"));
                }
            }
        }
    }

    @Override // com.taobao.android.xsearchplugin.muise.BaseMuiseCellViewHolder
    public void N1(Map<String, Object> map, MuiseCellBean muiseCellBean) {
        CommonSearchResult commonSearchResult;
        CommonBaseDatasource commonBaseDatasource;
        String str;
        String str2;
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3f01763c", new Object[]{this, map, muiseCellBean});
            return;
        }
        String currentPageName = c2v.getInstance().getCurrentPageName();
        map.put("pageName", currentPageName);
        map.put("rainbow", oen.j());
        map.put("hasDynamicCard", String.valueOf(this.H.mExtraObj.get("dynamicCardBean") != null));
        ArrayMap arrayMap = new ArrayMap();
        arrayMap.put(amo.DIMENSION_BUSINESS_NAME, zvr.BIZ_TBSEARCH);
        arrayMap.put("tItemType", this.F);
        arrayMap.put("sversion", r4p.SERVER_VERSION_VALUE);
        arrayMap.put(amo.DIMENSION_JSVERSION, this.G);
        try {
            arrayMap.put("rainbow", oen.n("tbAndroid" + this.F + "EnableLT"));
        } catch (Exception unused) {
            c4p.n("SearchMuiseViewHolder", "getBucketIdFail");
        }
        map.put("hubbleInfo", arrayMap);
        String str3 = null;
        if (((acx) l0()).e() instanceof CommonBaseDatasource) {
            commonBaseDatasource = (CommonBaseDatasource) ((acx) l0()).e();
            commonSearchResult = (CommonSearchResult) commonBaseDatasource.getTotalSearchResult();
            if (commonSearchResult != null) {
                Map<String, String> map2 = commonSearchResult.getMainInfo().pageTraceArgs;
                if (map2 != null) {
                    str3 = map2.get("spm-cnt");
                    map.put("spm", str3 == null ? "" : str3);
                }
                map.put(h1p.a.PARAM_KEY_FIRST_RN, commonSearchResult.getMainInfo().rn);
                map.put("switches", commonSearchResult.switches);
            }
            map.put("srpKey", String.valueOf(commonBaseDatasource.hashCode()));
        } else {
            commonBaseDatasource = null;
            commonSearchResult = null;
        }
        MuiseCellBean muiseCellBean2 = this.H;
        if (muiseCellBean2 != null) {
            map.put("srp_seq", String.valueOf(muiseCellBean2.pageNo));
            map.put("srp_pos", String.valueOf(this.H.pagePos));
            map.put("pageSize", String.valueOf(this.H.pageSize));
            Object obj = this.H.mExtraObj.get("iconStyle");
            if (obj != null) {
                map.put("iconStyle", obj);
            }
            Object obj2 = this.H.mExtraObj.get("negFeedbackActions");
            if (obj2 != null) {
                map.put("negFeedbackActions", obj2);
            }
            Object obj3 = this.H.mExtraObj.get("pageData");
            if (obj3 != null) {
                map.put("pageData", obj3);
            }
        }
        if (commonSearchResult instanceof CommonSearchResult) {
            Object obj4 = map.get(HorizontalXslComponent.ATTR_PAGE_INFO);
            if (obj4 instanceof JSONObject) {
                JSONObject jSONObject = (JSONObject) obj4;
                jSONObject.put("pageName", (Object) currentPageName);
                if (!TextUtils.isEmpty(str3)) {
                    jSONObject.put("spm", (Object) str3);
                }
                ResultMainInfoBean mainInfo = commonSearchResult.getMainInfo();
                jSONObject.put("pageTraceArgs", (Object) mainInfo.originalPageTraceArgs);
                jSONObject.put("pageSize", (Object) Integer.valueOf(mainInfo.pageSize));
                jSONObject.put("page", (Object) Integer.valueOf(mainInfo.page));
                jSONObject.put("totalPage", (Object) Integer.valueOf(mainInfo.totalPage));
                jSONObject.put("totalResults", (Object) Integer.valueOf(mainInfo.totalResult));
                jSONObject.put("pageTraceName", (Object) mainInfo.pageTraceName);
                jSONObject.put("sessionid", (Object) mainInfo.sessionid);
                jSONObject.put("rootPageName", (Object) currentPageName);
                jSONObject.put("style", (Object) ((acx) l0()).e().getUIListStyle().getValue());
                jSONObject.put("RN", (Object) muiseCellBean.rn);
            }
        }
        if (commonBaseDatasource != null) {
            map.put("isJiaGou", String.valueOf(commonBaseDatasource.z()));
        }
        map.put(r4p.KEY_EDITION_CODE, k1p.c());
        map.put("elderHome", String.valueOf(cvr.INSTANCE.c()));
        boolean booleanParam = ((acx) l0()).f().getBooleanParam(r4p.KEY_SEARCH_ELDER_HOME_OPEN);
        map.put("fontSizeLevel", Integer.valueOf(h3p.a(booleanParam)));
        map.put(r4p.KEY_GRAY_HAIR, String.valueOf(booleanParam));
        if (commonSearchResult == null || !commonSearchResult.isUpdateUtparam) {
            z = false;
        }
        map.put("updateUtparam", String.valueOf(z));
        tnd f = ((acx) l0()).f();
        if (f != null) {
            map.put("sellerId", f.getParam("sellerId"));
        }
        if (commonBaseDatasource != null && commonBaseDatasource.C()) {
            JSONObject jSONObject2 = new JSONObject();
            if (getActivity() instanceof InshopResultActivity) {
                str2 = "search";
            } else {
                str2 = "allauc";
            }
            jSONObject2.put("inshops", (Object) str2);
            jSONObject2.put(r4p.KEY_MINI_APP, (Object) commonBaseDatasource.getParamValue(r4p.KEY_MINI_APP));
            jSONObject2.put("shopId", (Object) commonBaseDatasource.getParamValue("shopId"));
            jSONObject2.put("sellerId", (Object) f.getParam("sellerId"));
            map.put("inshopAttributes", jSONObject2);
            map.put("spm", o2() + ".0.0");
        }
        if (((acx) l0()).e().getTotalSearchResult() instanceof CommonSearchResult) {
            if (((CommonSearchResult) ((acx) l0()).e().getTotalSearchResult()).hasTopHeader) {
                str = "1";
            } else {
                str = "0";
            }
            map.put(r4p.KEY_HAS_TOP_HEADER, str);
        }
        map.put("lowDevice", String.valueOf(l3p.INSTANCE.c()));
        C2(map, getActivity());
    }

    @Override // com.taobao.android.xsearchplugin.muise.BaseMuiseCellViewHolder, tb.dxc
    public void P(com.taobao.android.weex_framework.a aVar) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f30030f", new Object[]{this, aVar});
            return;
        }
        super.P(aVar);
        if (!(getActivity() instanceof vyd) || !((vyd) getActivity()).Q()) {
            z = false;
        }
        aVar.addInstanceEnv("tb2021", String.valueOf(z));
    }

    public final void b2(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("54883a22", new Object[]{this, jSONObject});
        } else if (jSONObject != null) {
            JSONArray c2 = h19.c(jSONObject, "params");
            for (int i = 0; i < c2.size(); i++) {
                JSONObject jSONObject2 = c2.getJSONObject(i);
                if (jSONObject2 != null) {
                    a2(jSONObject2.getString("key"), jSONObject2.getString("value"));
                }
            }
        }
    }

    public void h2(JSONObject jSONObject) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e98a50ed", new Object[]{this, jSONObject});
        } else if (jSONObject != null && !jSONObject.isEmpty()) {
            String string = jSONObject.getString("itemId");
            if (!TextUtils.isEmpty(string)) {
                R2(string);
                boolean equals = "true".equals(h19.i(jSONObject, "needBackInsertCard", "true"));
                Map<String, String> b2 = h19.b(h19.d(jSONObject, "clickTraceParams"));
                if (this.H.mExtraObj.get("dynamicCardBean") == null) {
                    z = false;
                }
                b2.put("hasDynamicCard", String.valueOf(z));
                String string2 = jSONObject.getString(mh1.CLICK_TRACE);
                if (!TextUtils.isEmpty(string2)) {
                    M2(string, string2, equals, b2);
                }
                N2(string);
                tt3.d().f(((acx) l0()).e().getTab(), string, String.valueOf(System.currentTimeMillis()));
            }
        }
    }

    public final void v2(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4aad678b", new Object[]{this, map});
            return;
        }
        g1i g1iVar = (g1i) ((acx) l0()).e();
        CommonSearchResult commonSearchResult = (CommonSearchResult) g1iVar.getTotalSearchResult();
        map.put("tab", g1iVar.getTab());
        map.put(yj4.PARAM_SEARCH_KEYWORD_RN, getData().rn);
        map.put(r4p.KEY_EDITION_CODE, k1p.c());
        map.put("elderHome", String.valueOf(cvr.INSTANCE.c()));
        map.put(r4p.KEY_GRAY_HAIR, String.valueOf(((acx) l0()).f().getBooleanParam(r4p.KEY_SEARCH_ELDER_HOME_OPEN)));
        int t2 = t2();
        if (commonSearchResult != null) {
            int min = Math.min(commonSearchResult.getCellsCount(), t2 + 10);
            StringBuilder sb = new StringBuilder();
            for (int max = Math.max(0, t2 - 10); max < min; max++) {
                BaseCellBean cell = commonSearchResult.getCell(max);
                if (TextUtils.equals("item", cell.cardType)) {
                    if (sb.length() > 0) {
                        sb.append(",");
                    }
                    sb.append(cell.itemId);
                }
            }
            map.put("nearbyItems", sb.toString());
            CommonSearchResult commonSearchResult2 = (CommonSearchResult) g1iVar.getTotalSearchResult();
            int i = 1 + t2;
            String str = "";
            String str2 = commonSearchResult2.getCellsCount() > i ? commonSearchResult2.getCell(i).type : str;
            int i2 = t2 + 2;
            if (commonSearchResult2.getCellsCount() > i2) {
                str = commonSearchResult2.getCell(i2).type;
            }
            map.put("nextItemsType", str2 + "," + str);
            map.put("sessionid", commonSearchResult.getMainInfo().rn);
            if (!TextUtils.isEmpty(commonSearchResult.sessionId)) {
                map.put("sessionId", commonSearchResult.sessionId);
            }
            if (!TextUtils.isEmpty(commonSearchResult.spClientSession)) {
                map.put("sp_client_session", commonSearchResult.spClientSession);
            }
            map.put("jarvis_dynamic_card", String.valueOf(false));
            map.put("max_page", String.valueOf(g1iVar.getCurrentPage()));
            g1iVar.Z(map, null);
            map.put(r4p.KEY_P4P_S, String.valueOf(g1iVar.f0()));
            map.put(r4p.KEY_ITEM_S, String.valueOf(g1iVar.e0()));
            map.put("bottom", String.valueOf(o1p.e(this.itemView.getBottom())));
            map.put("screenHeight", String.valueOf(o1p.e(((ViewGroup) this.itemView.getParent()).getHeight())));
        }
    }

    public SearchMuiseViewHolder(Activity activity, View view, acx<? extends o02<? extends BaseSearchResult, ?>> acxVar, ude udeVar, ListStyle listStyle, ViewGroup viewGroup, int i) {
        super(activity, view, udeVar, listStyle, i, acxVar);
    }

    public final void B2(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9587afce", new Object[]{this, jSONObject});
        } else if (o4p.v1() && jSONObject != null && this.L == null) {
            String string = jSONObject.getString("jumpToSimilarUrl");
            String string2 = jSONObject.getString("tItemType");
            TemplateBean template = ((acx) l0()).e().getTemplate(string2);
            if (template == null) {
                Nav.from(getActivity()).toUri(string);
                return;
            }
            arj.b n2 = n2();
            A0(new yqj());
            b bVar = new b(string, n2);
            if (TextUtils.equals(jSONObject.getString("type"), AgooConstants.MESSAGE_POPUP)) {
                this.L = new pim(getActivity(), getParent(), (acx) l0(), template, (ViewGroup) this.itemView, null, Integer.valueOf(i0()), this.H.mExtraObj.get("negFeedbackActions"), bVar, n2, this.itemView, j0());
            } else {
                this.L = new arj(getActivity(), getParent(), (acx) l0(), template, (ViewGroup) this.itemView, new ye0((ViewGroup) this.itemView), Integer.valueOf(i0()), this.H.mExtraObj.get("negFeedbackActions"), bVar, n2);
            }
            MuiseCellBean data = getData();
            this.L.bindWithData(drj.a(string2, data.rn, data.abtest, data.pageType, data.mMuiseBean.model));
            if (this.L.getView() != 0) {
                this.itemView.performHapticFeedback(0);
                ((FrameLayout) this.L.getView()).startAnimation(drj.b(true));
                this.L.attachToContainer();
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x007c, code lost:
        if (r10.equals("commitAuctionClick") == false) goto L_0x0036;
     */
    @Override // com.taobao.android.xsearchplugin.muise.BaseMuiseCellViewHolder, tb.cnx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean K(java.lang.String r10, com.alibaba.fastjson.JSONObject r11, tb.f64.a r12, tb.f64.a r13) {
        /*
            Method dump skipped, instructions count: 324
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.search.musie.SearchMuiseViewHolder.K(java.lang.String, com.alibaba.fastjson.JSONObject, tb.f64$a, tb.f64$a):boolean");
    }
}
