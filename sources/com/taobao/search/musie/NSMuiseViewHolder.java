package com.taobao.search.musie;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.datasource.impl.BaseSearchResult;
import com.taobao.android.searchbaseframe.datasource.impl.cell.BaseCellBean;
import com.taobao.android.searchbaseframe.nx3.bean.MuiseBean;
import com.taobao.android.searchbaseframe.nx3.bean.MuiseCellBean;
import com.taobao.android.searchbaseframe.nx3.bean.TemplateBean;
import com.taobao.android.searchbaseframe.util.ListStyle;
import com.taobao.android.xsearchplugin.muise.MuiseHolderContainer;
import com.taobao.schedule.ViewProxy;
import com.taobao.search.musie.list.horizontal.HorizontalXslComponent;
import com.taobao.search.refactor.MSController;
import com.taobao.search.sf.datasource.CommonBaseDatasource;
import com.taobao.search.sf.datasource.CommonSearchResult;
import com.taobao.taobao.R;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import tb.acx;
import tb.arj;
import tb.asi;
import tb.ay4;
import tb.f64;
import tb.frh;
import tb.fw;
import tb.h1p;
import tb.o02;
import tb.oad;
import tb.r4p;
import tb.rhj;
import tb.sg3;
import tb.t2o;
import tb.thj;
import tb.ude;
import tb.w02;
import tb.whj;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class NSMuiseViewHolder extends SearchMuiseViewHolder implements MuiseHolderContainer.a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ACTION_LIST_SCROLL = "listScroll";
    public static final String ACTION_START_SCROLL = "startScroll";
    public static final String ACTION_STOP_SCROLL = "stopScroll";
    public static final ay4<w02, NSMuiseViewHolder> CREATOR = new a();
    public final RecyclerView.OnScrollListener P = new RecyclerView.OnScrollListener() { // from class: com.taobao.search.musie.NSMuiseViewHolder.2
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(AnonymousClass2 r5, String str, Object... objArr) {
            int hashCode = str.hashCode();
            if (hashCode == -1177043419) {
                super.onScrolled((RecyclerView) objArr[0], ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue());
                return null;
            } else if (hashCode == 1361287682) {
                super.onScrollStateChanged((RecyclerView) objArr[0], ((Number) objArr[1]).intValue());
                return null;
            } else {
                int hashCode2 = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/search/musie/NSMuiseViewHolder$2");
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b9d7be25", new Object[]{this, recyclerView, new Integer(i), new Integer(i2)});
                return;
            }
            super.onScrolled(recyclerView, i, i2);
            NSMuiseViewHolder.T2(NSMuiseViewHolder.this, NSMuiseViewHolder.ACTION_LIST_SCROLL);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("51239a02", new Object[]{this, recyclerView, new Integer(i)});
                return;
            }
            super.onScrollStateChanged(recyclerView, i);
            if (i == 0) {
                NSMuiseViewHolder.T2(NSMuiseViewHolder.this, NSMuiseViewHolder.ACTION_STOP_SCROLL);
            } else if (i == 1) {
                NSMuiseViewHolder.T2(NSMuiseViewHolder.this, NSMuiseViewHolder.ACTION_START_SCROLL);
            }
        }
    };
    public boolean Q = false;
    public final MuiseHolderContainer R;
    public Boolean S;
    public final RecyclerView T;
    public whj U;
    public MuiseCellBean V;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements ay4<w02, NSMuiseViewHolder> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: b */
        public NSMuiseViewHolder a(w02 w02Var) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (NSMuiseViewHolder) ipChange.ipc$dispatch("e2e90dff", new Object[]{this, w02Var});
            }
            return new NSMuiseViewHolder(w02Var.f31046a, w02Var.c, w02Var.b, w02Var.g, w02Var.d, w02Var.f);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class b implements View.OnTouchListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b(NSMuiseViewHolder nSMuiseViewHolder) {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("d4aa3aa4", new Object[]{this, view, motionEvent})).booleanValue();
            }
            if (motionEvent.getAction() == 0) {
                return true;
            }
            return false;
        }
    }

    static {
        t2o.a(815792655);
        t2o.a(993002145);
    }

    public NSMuiseViewHolder(Activity activity, acx<? extends o02<? extends BaseSearchResult, ?>> acxVar, ude udeVar, ListStyle listStyle, ViewGroup viewGroup, int i) {
        super(activity, I0(activity, viewGroup), acxVar, udeVar, listStyle, viewGroup, i);
        MuiseHolderContainer muiseHolderContainer = (MuiseHolderContainer) this.itemView;
        this.R = muiseHolderContainer;
        muiseHolderContainer.setHeightChangeListener(this);
        if (viewGroup instanceof RecyclerView) {
            this.T = (RecyclerView) viewGroup;
        }
        ViewProxy.setOnTouchListener(this.itemView, new b(this));
    }

    public static View I0(Context context, ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("5159ec40", new Object[]{context, viewGroup});
        }
        return LayoutInflater.from(context).inflate(R.layout.tbsearch_ns_muise_cell, viewGroup, false);
    }

    public static /* synthetic */ void T2(NSMuiseViewHolder nSMuiseViewHolder, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("37430bd1", new Object[]{nSMuiseViewHolder, str});
        } else {
            nSMuiseViewHolder.U2(str);
        }
    }

    public static /* synthetic */ Object ipc$super(NSMuiseViewHolder nSMuiseViewHolder, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1955341538:
                return super.B1();
            case -1774438353:
                super.onRefreshSuccess((com.taobao.android.weex_framework.a) objArr[0]);
                return null;
            case -1698538053:
                return new Boolean(super.m2((String) objArr[0], (JSONObject) objArr[1], (f64.a) objArr[2], (f64.a) objArr[3]));
            case -1653535408:
                super.d1();
                return null;
            case -1151548859:
                super.Q0((MuiseBean) objArr[0], objArr[1]);
                return null;
            case -1016341398:
                super.k1(objArr[0], ((Number) objArr[1]).intValue());
                return null;
            case -332792321:
                super.r0();
                return null;
            case -286593412:
                super.s0();
                return null;
            case -49430959:
                return new Boolean(super.V0(((Number) objArr[0]).intValue(), objArr[1]));
            case 523666796:
                return new Boolean(super.K((String) objArr[0], (JSONObject) objArr[1], (f64.a) objArr[2], (f64.a) objArr[3]));
            case 724233032:
                super.onRenderSuccess((com.taobao.android.weex_framework.a) objArr[0]);
                return null;
            case 806061328:
                return super.O0((MuiseBean) objArr[0], objArr[1]);
            case 1057060412:
                super.N1((Map) objArr[0], (MuiseCellBean) objArr[1]);
                return null;
            case 1640004263:
                super.u0(((Number) objArr[0]).intValue(), (MuiseCellBean) objArr[1]);
                return null;
            case 1832166136:
                super.f1(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue());
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/musie/NSMuiseViewHolder");
        }
    }

    @Override // com.taobao.android.xsearchplugin.muise.BaseMuiseCellViewHolder
    public String B1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8b73db1e", new Object[]{this});
        }
        if (getData() == null) {
            return super.B1();
        }
        ListStyle c3 = O0(getData().mMuiseBean, getData());
        boolean F1 = U0(c3, getData());
        Boolean bool = this.S;
        if (!(bool == null || F1 == bool.booleanValue())) {
            this.B = 0;
        }
        this.S = Boolean.valueOf(F1);
        return C1(this.itemView, c3, false);
    }

    @Override // com.taobao.search.musie.SearchMuiseViewHolder, com.taobao.android.xsearchplugin.muise.BaseMuiseCellViewHolder
    /* renamed from: G1 */
    public void u0(int i, MuiseCellBean muiseCellBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61c07aa7", new Object[]{this, new Integer(i), muiseCellBean});
            return;
        }
        super.u0(i, muiseCellBean);
        this.V = muiseCellBean;
    }

    @Override // com.taobao.search.musie.SearchMuiseViewHolder, com.taobao.android.xsearchplugin.muise.BaseMuiseCellViewHolder
    public void N1(Map<String, Object> map, MuiseCellBean muiseCellBean) {
        asi asiVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3f01763c", new Object[]{this, map, muiseCellBean});
            return;
        }
        super.N1(map, muiseCellBean);
        CommonBaseDatasource commonBaseDatasource = (CommonBaseDatasource) ((acx) l0()).e();
        CommonSearchResult commonSearchResult = (CommonSearchResult) commonBaseDatasource.getTotalSearchResult();
        if (!(commonSearchResult == null || !commonSearchResult.newSearch || (asiVar = muiseCellBean.combo) == null)) {
            rhj rhjVar = (rhj) asiVar;
            map.put(h1p.a.PARAM_KEY_FIRST_RN, rhjVar.T().rn);
            map.put("native", "true");
            if (commonSearchResult.guideSearch) {
                map.put("guideSearch", "true");
            }
            map.put(r4p.VALUE_BIZ_TYPE_NEW_SEARCH, "true");
            map.put("comboId", String.valueOf(rhjVar.k()));
            map.put("comboStyle", rhjVar.p().getValue());
            MSController Y2 = Y2();
            int d1 = rhjVar.d1();
            if (((acx) l0()).e() == ((acx) l0()).b() && d1 > 0) {
                map.put("tab", rhjVar.J0());
            }
            map.put("comboBizType", rhjVar.J0());
            map.put(h1p.a.PARAM_KEY_FIRST_RN, rhjVar.T().rn);
            map.put("comboHeaderCount", String.valueOf(rhjVar.P0().size() + rhjVar.N0().size()));
            map.put("indexInCombo", String.valueOf(muiseCellBean.comboIndex));
            map.put("comboType", muiseCellBean.comboType);
            map.put("tabIndex", String.valueOf(commonBaseDatasource.getIndex()));
            JSONObject jSONObject = commonSearchResult.pageInfo;
            Map<String, String> map2 = commonSearchResult.getMainInfo().pageTraceArgs;
            String str = commonSearchResult.getMainInfo().pageTraceName;
            if (((acx) l0()).e() != ((acx) l0()).b()) {
                jSONObject = rhjVar.Y0();
                map2 = rhjVar.T().pageTraceArgs;
                str = rhjVar.T().pageTraceName;
            }
            if (((CommonSearchResult) ((CommonBaseDatasource) ((acx) l0()).e()).getTotalSearchResult()).guideSearch) {
                jSONObject = rhjVar.Y0();
            }
            Map<String, String> k3 = k3(rhjVar);
            if (!(k3 == null || jSONObject == null)) {
                jSONObject = (JSONObject) jSONObject.clone();
                jSONObject.putAll(k3);
            }
            if (jSONObject != null) {
                map.put(HorizontalXslComponent.ATTR_PAGE_INFO, jSONObject);
            }
            map.put("isJiaGou", String.valueOf(commonSearchResult.isAddCartSupported));
            if (map2 != null) {
                map.put("spm", map2.get("spm-cnt"));
            }
            String n0 = Y2.n0();
            if (n0 != null) {
                map.put("show_tabs", n0);
            }
            map.put("floor_info", rhjVar.J0() + "_" + rhjVar.k());
            map.put("pageName", str);
        }
        V2(map);
    }

    @Override // com.taobao.android.xsearchplugin.muise.AbsMuiseViewHolder
    public boolean T0(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ac4ba603", new Object[]{this, new Integer(i)})).booleanValue();
        }
        if (i >= 0) {
            return true;
        }
        return false;
    }

    public final void U2(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e8a477e", new Object[]{this, str});
            return;
        }
        fw fwVar = this.l;
        if (fwVar != null && fwVar.x() != null) {
            this.l.x().fireNativeEvent(str, "");
        }
    }

    public final void V2(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1788afc4", new Object[]{this, map});
        } else if (((acx) l0()).e() instanceof CommonBaseDatasource) {
            CommonSearchResult commonSearchResult = (CommonSearchResult) ((CommonBaseDatasource) ((acx) l0()).e()).getTotalSearchResult();
            if (commonSearchResult.guideSearch) {
                map.put("pageName", commonSearchResult.getMainInfo().pageName);
            }
        }
    }

    /* renamed from: W2 */
    public int L0(MuiseBean muiseBean, MuiseCellBean muiseCellBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a5818f7", new Object[]{this, muiseBean, muiseCellBean})).intValue();
        }
        if (muiseBean != null) {
            return muiseBean.getCachedHeight(O0(muiseBean, muiseCellBean));
        }
        return -1;
    }

    public final int X2(rhj rhjVar) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e20f6f7e", new Object[]{this, rhjVar})).intValue();
        }
        if (rhjVar == null) {
            return 0;
        }
        Iterator<BaseCellBean> it = rhjVar.N0().iterator();
        while (it.hasNext()) {
            i += ((MuiseCellBean) it.next()).mMuiseBean.getCachedHeight(ListStyle.LIST);
        }
        return i;
    }

    public final MSController Y2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MSController) ipChange.ipc$dispatch("44eed38f", new Object[]{this});
        }
        return (MSController) ((acx) l0()).d().h("controller");
    }

    public JSONObject Z2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("147a1312", new Object[]{this});
        }
        Map<String, String> paramsSnapShot = ((CommonBaseDatasource) ((acx) l0()).e()).getParamsSnapShot();
        if (paramsSnapShot == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.putAll(paramsSnapShot);
        return jSONObject;
    }

    /* renamed from: b3 */
    public int N0(MuiseBean muiseBean, MuiseCellBean muiseCellBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("885ccc03", new Object[]{this, muiseBean, muiseCellBean})).intValue();
        }
        if (O0(muiseBean, muiseCellBean) == ListStyle.LIST) {
            return M0(muiseBean);
        }
        return P0(muiseBean);
    }

    /* renamed from: c3 */
    public ListStyle O0(MuiseBean muiseBean, MuiseCellBean muiseCellBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ListStyle) ipChange.ipc$dispatch("fa65c4ad", new Object[]{this, muiseBean, muiseCellBean});
        }
        ListStyle O0 = super.O0(muiseBean, muiseCellBean);
        if (U0(O0, muiseCellBean)) {
            return ListStyle.LIST;
        }
        return O0;
    }

    @Override // com.taobao.android.xsearchplugin.muise.BaseMuiseCellViewHolder, com.taobao.android.xsearchplugin.muise.AbsMuiseViewHolder
    public void d1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d710d50", new Object[]{this});
            return;
        }
        super.d1();
        ((acx) l0()).e().postEvent(new sg3());
    }

    public final void d3(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5586f4ff", new Object[]{this, jSONObject});
            return;
        }
        whj whjVar = this.U;
        if (whjVar != null) {
            whjVar.i(jSONObject);
        }
    }

    /* renamed from: e3 */
    public void Q0(MuiseBean muiseBean, MuiseCellBean muiseCellBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e8b4bc7e", new Object[]{this, muiseBean, muiseCellBean});
            return;
        }
        this.R.setObserveHeightChange(false);
        super.Q0(muiseBean, muiseCellBean);
    }

    @Override // com.taobao.android.xsearchplugin.muise.AbsMuiseViewHolder
    public void f1(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6d34a2f8", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        super.f1(i, i2);
        if (i != i2) {
            ((acx) l0()).e().postEvent(new sg3());
        }
    }

    public final void f3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("76efbae7", new Object[]{this});
        } else if (this.U == null && (getActivity() instanceof oad)) {
            this.U = ((oad) getActivity()).y0();
        }
    }

    /* renamed from: g3 */
    public boolean V0(int i, MuiseCellBean muiseCellBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2878e97a", new Object[]{this, new Integer(i), muiseCellBean})).booleanValue();
        }
        if (muiseCellBean.forceUpdate) {
            return false;
        }
        return super.V0(i, muiseCellBean);
    }

    /* renamed from: h3 */
    public int Y0(MuiseBean muiseBean, MuiseCellBean muiseCellBean) {
        TemplateBean y;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e5135af3", new Object[]{this, muiseBean, muiseCellBean})).intValue();
        }
        if (muiseBean == null || (y = this.l.y(muiseBean)) == null) {
            return 0;
        }
        if (U0(O0(muiseBean, muiseCellBean), muiseCellBean)) {
            return y.listHeight;
        }
        return y.midHeight;
    }

    /* renamed from: j3 */
    public void k1(MuiseCellBean muiseCellBean, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("526d40b9", new Object[]{this, muiseCellBean, new Integer(i)});
            return;
        }
        this.R.setObserveHeightChange(false);
        super.k1(muiseCellBean, i);
    }

    public final void l3(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("31cb98fa", new Object[]{this, jSONObject});
            return;
        }
        f3();
        this.U.l(jSONObject.getJSONObject("options"), jSONObject.getJSONObject("data"), getParent(), this, this);
    }

    @Override // com.taobao.search.musie.SearchMuiseViewHolder
    public arj.b n2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (arj.b) ipChange.ipc$dispatch("8967d4da", new Object[]{this});
        }
        return new thj(getData(), U0(getData().combo.p(), getData()), (CommonBaseDatasource) ((acx) l0()).e(), Y2());
    }

    @Override // com.taobao.search.musie.SearchMuiseViewHolder, com.taobao.android.xsearchplugin.muise.BaseMuiseCellViewHolder, com.taobao.android.xsearchplugin.muise.AbsMuiseViewHolder, tb.npc
    public void onRefreshSuccess(com.taobao.android.weex_framework.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("963c382f", new Object[]{this, aVar});
            return;
        }
        this.R.setObserveHeightChange(true);
        super.onRefreshSuccess(aVar);
    }

    @Override // com.taobao.search.musie.SearchMuiseViewHolder, com.taobao.android.xsearchplugin.muise.BaseMuiseCellViewHolder, com.taobao.android.xsearchplugin.muise.AbsMuiseViewHolder, tb.npc
    public void onRenderSuccess(com.taobao.android.weex_framework.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b2aeb48", new Object[]{this, aVar});
            return;
        }
        this.R.setObserveHeightChange(true);
        super.onRenderSuccess(aVar);
    }

    @Override // com.taobao.android.xsearchplugin.muise.AbsMuiseViewHolder, com.taobao.android.searchbaseframe.list.WidgetViewHolder
    public void r0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec29fdff", new Object[]{this});
            return;
        }
        super.r0();
        if (!this.Q) {
            RecyclerView recyclerView = this.T;
            if (recyclerView != null) {
                recyclerView.addOnScrollListener(this.P);
            }
            this.Q = true;
        }
    }

    @Override // com.taobao.android.xsearchplugin.muise.AbsMuiseViewHolder, com.taobao.android.searchbaseframe.list.WidgetViewHolder
    public void s0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eeeaee7c", new Object[]{this});
            return;
        }
        super.s0();
        if (this.Q) {
            RecyclerView recyclerView = this.T;
            if (recyclerView != null) {
                recyclerView.removeOnScrollListener(this.P);
            }
            this.Q = false;
        }
    }

    @Override // com.taobao.android.xsearchplugin.muise.MuiseHolderContainer.a
    public void y(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ccdade6", new Object[]{this, new Integer(i)});
        } else {
            x1();
        }
    }

    @Override // com.taobao.search.musie.SearchMuiseViewHolder
    public boolean y2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c8ade1aa", new Object[]{this})).booleanValue();
        }
        return true;
    }

    public final void i3(boolean z) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cbb62f9a", new Object[]{this, new Boolean(z)});
            return;
        }
        CommonBaseDatasource commonBaseDatasource = (CommonBaseDatasource) ((acx) l0()).e();
        HashMap hashMap = new HashMap();
        if (z) {
            str = "all";
        } else {
            str = "auction";
        }
        hashMap.put("searchType", str);
        commonBaseDatasource.doNewSearch((frh) getData().combo, false, hashMap);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.util.Map<java.lang.String, java.lang.String>] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.util.HashMap, java.lang.Object] */
    /* JADX WARN: Unknown variable types count: 1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.Map<java.lang.String, java.lang.String> k3(tb.rhj r9) {
        /*
            r8 = this;
            r0 = 1
            r1 = 0
            com.android.alibaba.ip.runtime.IpChange r2 = com.taobao.search.musie.NSMuiseViewHolder.$ipChange
            boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r3 == 0) goto L_0x0018
            java.lang.String r3 = "f3158f36"
            r4 = 2
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r4[r1] = r8
            r4[r0] = r9
            java.lang.Object r9 = r2.ipc$dispatch(r3, r4)
            java.util.Map r9 = (java.util.Map) r9
            return r9
        L_0x0018:
            if (r9 != 0) goto L_0x001c
            r9 = 0
            return r9
        L_0x001c:
            java.util.HashMap r2 = r9.M0()
            java.lang.String r3 = "whiteListParams"
            java.lang.Object r2 = r2.get(r3)
            java.util.Map r2 = (java.util.Map) r2
            if (r2 != 0) goto L_0x0055
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            java.util.HashMap r9 = r9.M0()
            r9.put(r3, r2)
            java.lang.String[] r9 = tb.o4p.K()
            java.util.Map r3 = r8.s2()
            int r4 = r9.length
        L_0x0040:
            if (r1 >= r4) goto L_0x0055
            r5 = r9[r1]
            java.lang.Object r6 = r3.get(r5)
            java.lang.String r6 = (java.lang.String) r6
            boolean r7 = android.text.TextUtils.isEmpty(r6)
            if (r7 != 0) goto L_0x0053
            r2.put(r5, r6)
        L_0x0053:
            int r1 = r1 + r0
            goto L_0x0040
        L_0x0055:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.search.musie.NSMuiseViewHolder.k3(tb.rhj):java.util.Map");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x0039, code lost:
        if (r7.equals("refreshAuction") == false) goto L_0x0030;
     */
    @Override // com.taobao.search.musie.SearchMuiseViewHolder, com.taobao.android.xsearchplugin.muise.BaseMuiseCellViewHolder, tb.cnx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean m2(java.lang.String r7, com.alibaba.fastjson.JSONObject r8, tb.f64.a r9, tb.f64.a r10) {
        /*
            r6 = this;
            r0 = 2
            r1 = 1
            r2 = 0
            com.android.alibaba.ip.runtime.IpChange r3 = com.taobao.search.musie.NSMuiseViewHolder.$ipChange
            boolean r4 = r3 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r4 == 0) goto L_0x0025
            java.lang.String r4 = "9ac25dbb"
            r5 = 5
            java.lang.Object[] r5 = new java.lang.Object[r5]
            r5[r2] = r6
            r5[r1] = r7
            r5[r0] = r8
            r7 = 3
            r5[r7] = r9
            r7 = 4
            r5[r7] = r10
            java.lang.Object r7 = r3.ipc$dispatch(r4, r5)
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            return r7
        L_0x0025:
            r7.hashCode()
            r3 = -1
            int r4 = r7.hashCode()
            switch(r4) {
                case -72204429: goto L_0x0048;
                case 2161725: goto L_0x003c;
                case 2014054120: goto L_0x0032;
                default: goto L_0x0030;
            }
        L_0x0030:
            r0 = -1
            goto L_0x0053
        L_0x0032:
            java.lang.String r4 = "refreshAuction"
            boolean r4 = r7.equals(r4)
            if (r4 != 0) goto L_0x0053
            goto L_0x0030
        L_0x003c:
            java.lang.String r0 = "searchOption"
            boolean r0 = r7.equals(r0)
            if (r0 != 0) goto L_0x0046
            goto L_0x0030
        L_0x0046:
            r0 = 1
            goto L_0x0053
        L_0x0048:
            java.lang.String r0 = "refreshCombo"
            boolean r0 = r7.equals(r0)
            if (r0 != 0) goto L_0x0052
            goto L_0x0030
        L_0x0052:
            r0 = 0
        L_0x0053:
            switch(r0) {
                case 0: goto L_0x007c;
                case 1: goto L_0x005f;
                case 2: goto L_0x005b;
                default: goto L_0x0056;
            }
        L_0x0056:
            boolean r7 = super.m2(r7, r8, r9, r10)
            return r7
        L_0x005b:
            r6.i3(r2)
            return r1
        L_0x005f:
            tb.fw r7 = r6.l
            if (r7 == 0) goto L_0x0078
            com.taobao.android.weex_framework.a r7 = r7.x()
            if (r7 == 0) goto L_0x0078
            tb.fw r7 = r6.l
            com.taobao.android.weex_framework.a r7 = r7.x()
            java.lang.String r8 = "paramsChange"
            r9 = 0
            java.lang.String r10 = "MUISE"
            r7.sendInstanceMessage(r10, r8, r9)
        L_0x0078:
            r6.i3(r2)
            return r1
        L_0x007c:
            r6.i3(r1)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.search.musie.NSMuiseViewHolder.m2(java.lang.String, com.alibaba.fastjson.JSONObject, tb.f64$a, tb.f64$a):boolean");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x006d, code lost:
        if (r11.equals("setListStyle") == false) goto L_0x0033;
     */
    @Override // com.taobao.search.musie.SearchMuiseViewHolder, com.taobao.android.xsearchplugin.muise.BaseMuiseCellViewHolder, tb.cnx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean K(java.lang.String r11, com.alibaba.fastjson.JSONObject r12, tb.f64.a r13, tb.f64.a r14) {
        /*
            Method dump skipped, instructions count: 782
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.search.musie.NSMuiseViewHolder.K(java.lang.String, com.alibaba.fastjson.JSONObject, tb.f64$a, tb.f64$a):boolean");
    }
}
