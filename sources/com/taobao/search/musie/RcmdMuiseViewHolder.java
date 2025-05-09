package com.taobao.search.musie;

import android.app.Activity;
import android.text.TextUtils;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ViewGroup;
import androidx.collection.ArrayMap;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.business.srp.list.uikit.PartnerRecyclerView;
import com.taobao.android.searchbaseframe.datasource.impl.BaseSearchResult;
import com.taobao.android.searchbaseframe.nx3.bean.MuiseBean;
import com.taobao.android.searchbaseframe.nx3.bean.MuiseCellBean;
import com.taobao.android.searchbaseframe.nx3.bean.TemplateBean;
import com.taobao.android.searchbaseframe.util.ListStyle;
import com.taobao.android.searchbaseframe.xsl.module.XslDatasource;
import com.taobao.android.xsearchplugin.muise.BaseMuiseCellViewHolder;
import com.taobao.android.xsearchplugin.muise.MuiseHolderContainer;
import com.taobao.uikit.feature.view.TRecyclerView;
import java.util.Map;
import tb.acx;
import tb.amo;
import tb.ay4;
import tb.bv9;
import tb.c2v;
import tb.c4p;
import tb.cvr;
import tb.f1p;
import tb.f64;
import tb.fw;
import tb.gy;
import tb.h19;
import tb.h1p;
import tb.h3p;
import tb.k1p;
import tb.ng3;
import tb.o02;
import tb.o4p;
import tb.oen;
import tb.qkn;
import tb.r4p;
import tb.sg3;
import tb.sif;
import tb.t2o;
import tb.ude;
import tb.v5h;
import tb.w02;
import tb.x6a;
import tb.y5p;
import tb.yw1;
import tb.znd;
import tb.zvr;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class RcmdMuiseViewHolder extends BaseMuiseCellViewHolder<acx<? extends o02<? extends BaseSearchResult, ?>>> implements MuiseHolderContainer.a, GestureDetector.OnGestureListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final ay4<w02, RcmdMuiseViewHolder> CREATOR = new a();
    public String F = "";
    public String G = "";
    public MuiseCellBean H;
    public final MuiseHolderContainer I;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements ay4<w02, RcmdMuiseViewHolder> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: b */
        public RcmdMuiseViewHolder a(w02 w02Var) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (RcmdMuiseViewHolder) ipChange.ipc$dispatch("8a6ba122", new Object[]{this, w02Var});
            }
            return new RcmdMuiseViewHolder(w02Var.f31046a, w02Var.c, w02Var.b, w02Var.g, w02Var.d, w02Var.f);
        }
    }

    static {
        t2o.a(815792665);
        t2o.a(993002145);
    }

    public RcmdMuiseViewHolder(Activity activity, acx<? extends o02<? extends BaseSearchResult, ?>> acxVar, ude udeVar, ListStyle listStyle, ViewGroup viewGroup, int i) {
        super(activity, acxVar, udeVar, listStyle, viewGroup, i);
        MuiseHolderContainer muiseHolderContainer = (MuiseHolderContainer) this.itemView;
        this.I = muiseHolderContainer;
        muiseHolderContainer.setHeightChangeListener(this);
        if (o4p.z1()) {
            ((sif) this.itemView).setOnInterceptTouchEventListener(new x6a(new GestureDetector(getActivity().getApplicationContext(), this)));
        }
    }

    public static /* synthetic */ Object ipc$super(RcmdMuiseViewHolder rcmdMuiseViewHolder, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1774438353:
                super.onRefreshSuccess((com.taobao.android.weex_framework.a) objArr[0]);
                return null;
            case -1653535408:
                super.d1();
                return null;
            case -1202724490:
                return new Integer(super.Y0((MuiseBean) objArr[0], objArr[1]));
            case -1151548859:
                super.Q0((MuiseBean) objArr[0], objArr[1]);
                return null;
            case -1016341398:
                super.k1(objArr[0], ((Number) objArr[1]).intValue());
                return null;
            case -328221082:
                return new Integer(super.N0((MuiseBean) objArr[0], objArr[1]));
            case 289767154:
                return new Integer(super.L0((MuiseBean) objArr[0], objArr[1]));
            case 523240207:
                super.P((com.taobao.android.weex_framework.a) objArr[0]);
                return null;
            case 523666796:
                return new Boolean(super.K((String) objArr[0], (JSONObject) objArr[1], (f64.a) objArr[2], (f64.a) objArr[3]));
            case 724233032:
                super.onRenderSuccess((com.taobao.android.weex_framework.a) objArr[0]);
                return null;
            case 806061328:
                return super.O0((MuiseBean) objArr[0], objArr[1]);
            case 850059560:
                return new Boolean(super.U0((ListStyle) objArr[0], (MuiseCellBean) objArr[1]));
            case 1154091729:
                super.q1((fw) objArr[0]);
                return null;
            case 1640004263:
                super.u0(((Number) objArr[0]).intValue(), (MuiseCellBean) objArr[1]);
                return null;
            case 1802319597:
                return new Boolean(super.Y());
            case 1832166136:
                super.f1(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue());
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/musie/RcmdMuiseViewHolder");
        }
    }

    @Override // com.taobao.android.xsearchplugin.muise.BaseMuiseCellViewHolder
    /* renamed from: F1 */
    public boolean U0(ListStyle listStyle, MuiseCellBean muiseCellBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("32aae128", new Object[]{this, listStyle, muiseCellBean})).booleanValue();
        }
        if (super.U0(listStyle, muiseCellBean) || d2()) {
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
            return;
        }
        if (i == 0) {
            k2();
        }
        this.H = muiseCellBean;
        String str2 = "";
        if (muiseCellBean != null) {
            str = muiseCellBean.type;
        } else {
            str = str2;
        }
        this.F = str;
        TemplateBean y = this.l.y(c1(muiseCellBean));
        if (y != null) {
            str2 = y.version;
        }
        this.G = str2;
        super.u0(i, muiseCellBean);
    }

    @Override // com.taobao.android.xsearchplugin.muise.BaseMuiseCellViewHolder
    public void N1(Map<String, Object> map, MuiseCellBean muiseCellBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3f01763c", new Object[]{this, map, muiseCellBean});
            return;
        }
        map.put("pageName", c2v.getInstance().getCurrentPageName());
        map.put("rainbow", oen.j());
        ArrayMap arrayMap = new ArrayMap();
        arrayMap.put(amo.DIMENSION_BUSINESS_NAME, zvr.BIZ_TBSEARCH);
        arrayMap.put("tItemType", this.F);
        arrayMap.put("sversion", r4p.SERVER_VERSION_VALUE);
        arrayMap.put(amo.DIMENSION_JSVERSION, this.G);
        try {
            String str = this.F;
            arrayMap.put("rainbow", oen.n("tbAndroid" + str + "EnableLT"));
        } catch (Exception unused) {
            c4p.n("RcmdMuiseViewHolder", "getBucketIdFail");
        }
        map.put("hubbleInfo", arrayMap);
        BaseSearchResult baseSearchResult = (BaseSearchResult) ((acx) l0()).e().getTotalSearchResult();
        if (baseSearchResult != null) {
            Map<String, String> map2 = baseSearchResult.getMainInfo().pageTraceArgs;
            if (map2 != null) {
                String str2 = map2.get("spm-cnt");
                if (str2 == null) {
                    str2 = "";
                }
                map.put("spm", str2);
            }
            map.put(h1p.a.PARAM_KEY_FIRST_RN, baseSearchResult.getMainInfo().rn);
        }
        MuiseCellBean muiseCellBean2 = this.H;
        if (muiseCellBean2 != null) {
            map.put("srp_seq", String.valueOf(muiseCellBean2.pageNo));
            map.put("srp_pos", String.valueOf(this.H.pagePos));
        }
        map.put(r4p.KEY_EDITION_CODE, k1p.c());
        map.put("elderHome", String.valueOf(cvr.INSTANCE.c()));
        boolean booleanParam = ((acx) l0()).f().getBooleanParam(r4p.KEY_SEARCH_ELDER_HOME_OPEN);
        map.put("fontSizeLevel", Integer.valueOf(h3p.a(booleanParam)));
        map.put(r4p.KEY_GRAY_HAIR, String.valueOf(booleanParam));
    }

    @Override // com.taobao.android.xsearchplugin.muise.BaseMuiseCellViewHolder, tb.dxc
    public void P(com.taobao.android.weex_framework.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f30030f", new Object[]{this, aVar});
            return;
        }
        super.P(aVar);
        aVar.addInstanceEnv("tb2021", "true");
    }

    public final void U1(JSONObject jSONObject) {
        JSONArray c;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fc56a8f6", new Object[]{this, jSONObject});
        } else if (jSONObject != null && (c = h19.c(jSONObject, "keys")) != null) {
            for (int i = 0; i < c.size(); i++) {
                String string = c.getString(i);
                if (!TextUtils.isEmpty(string)) {
                    X1().clearParam(string);
                }
            }
        }
    }

    /* renamed from: V1 */
    public int L0(MuiseBean muiseBean, MuiseCellBean muiseCellBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a5818f7", new Object[]{this, muiseBean, muiseCellBean})).intValue();
        }
        if (o4p.x1()) {
            return super.L0(muiseBean, muiseCellBean);
        }
        if (muiseBean != null) {
            return muiseBean.getCachedHeight(O0(muiseBean, muiseCellBean));
        }
        return -1;
    }

    @Override // com.taobao.android.xsearchplugin.muise.AbsMuiseViewHolder
    public void W0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1ee7fa", new Object[]{this});
        } else if (getData() != null && (getData() instanceof MuiseCellBean) && (X1() instanceof XslDatasource)) {
            int i0 = i0();
            XslDatasource xslDatasource = (XslDatasource) X1();
            A0(ng3.a(xslDatasource.getCurrentTabIndex(), i0));
            e2(i0, xslDatasource.getCurrentTabIndex(), getData().mMuiseBean.id);
        }
    }

    public final PartnerRecyclerView W1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PartnerRecyclerView) ipChange.ipc$dispatch("b123680c", new Object[]{this});
        }
        ViewGroup viewGroup = (ViewGroup) this.itemView.getParent();
        if (viewGroup instanceof PartnerRecyclerView) {
            return (PartnerRecyclerView) viewGroup;
        }
        return null;
    }

    @Override // com.taobao.android.xsearchplugin.muise.AbsMuiseViewHolder
    public void X0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2274e35e", new Object[]{this});
        } else if (getData() != null && (getData() instanceof MuiseCellBean) && (X1() instanceof XslDatasource)) {
            A0(ng3.b(((XslDatasource) X1()).getCurrentTabIndex(), i0()));
        }
    }

    public final gy X1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (gy) ipChange.ipc$dispatch("1ca610f8", new Object[]{this});
        }
        if (l0() == 0) {
            return null;
        }
        return ((acx) l0()).e();
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

    /* renamed from: Z1 */
    public int N0(MuiseBean muiseBean, MuiseCellBean muiseCellBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("885ccc03", new Object[]{this, muiseBean, muiseCellBean})).intValue();
        }
        if (o4p.x1()) {
            return super.N0(muiseBean, muiseCellBean);
        }
        if (O0(muiseBean, muiseCellBean) == ListStyle.LIST) {
            return M0(muiseBean);
        }
        return P0(muiseBean);
    }

    /* renamed from: a2 */
    public ListStyle O0(MuiseBean muiseBean, MuiseCellBean muiseCellBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ListStyle) ipChange.ipc$dispatch("fa65c4ad", new Object[]{this, muiseBean, muiseCellBean});
        }
        if (o4p.x1()) {
            return super.O0(muiseBean, muiseCellBean);
        }
        ListStyle O0 = super.O0(muiseBean, muiseCellBean);
        if (U0(O0, muiseCellBean)) {
            return ListStyle.LIST;
        }
        return O0;
    }

    public final int b2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c923e81e", new Object[]{this})).intValue();
        }
        try {
            return getLayoutPosition() - ((TRecyclerView) ((yw1) getParent()).A2()).getHeaderViewsCount();
        } catch (Throwable unused) {
            return getLayoutPosition();
        }
    }

    /* renamed from: c2 */
    public void Q0(MuiseBean muiseBean, MuiseCellBean muiseCellBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e8b4bc7e", new Object[]{this, muiseBean, muiseCellBean});
            return;
        }
        this.I.setObserveHeightChange(false);
        super.Q0(muiseBean, muiseCellBean);
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

    public final boolean d2() {
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

    public final void e2(int i, int i2, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e9a14439", new Object[]{this, new Integer(i), new Integer(i2), new Long(j)});
            return;
        }
        PartnerRecyclerView W1 = W1();
        if (W1 != null && W1.isScrollDown()) {
            A0(new v5h(W1.getScrollSpeed(), i2, i, j));
        }
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

    /* renamed from: f2 */
    public int Y0(MuiseBean muiseBean, MuiseCellBean muiseCellBean) {
        TemplateBean y;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e5135af3", new Object[]{this, muiseBean, muiseCellBean})).intValue();
        }
        if (o4p.x1()) {
            return super.Y0(muiseBean, muiseCellBean);
        }
        if (muiseBean == null || (y = this.l.y(muiseBean)) == null) {
            return 0;
        }
        if (U0(O0(muiseBean, muiseCellBean), muiseCellBean)) {
            return y.listHeight;
        }
        return y.midHeight;
    }

    /* renamed from: h2 */
    public void k1(MuiseCellBean muiseCellBean, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("526d40b9", new Object[]{this, muiseCellBean, new Integer(i)});
            return;
        }
        this.I.setObserveHeightChange(false);
        super.k1(muiseCellBean, i);
    }

    public final void i2(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("285787c1", new Object[]{this, jSONObject});
        } else if (jSONObject != null) {
            for (Map.Entry<String, Object> entry : jSONObject.entrySet()) {
                X1().setParam(entry.getKey(), entry.getValue().toString());
            }
        }
    }

    public final void j2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2ef9e52f", new Object[]{this});
            return;
        }
        o02 e = ((acx) l0()).e();
        y5p firstRequestPerf = e.getFirstRequestPerf();
        if (firstRequestPerf != null && !firstRequestPerf.f31873a) {
            firstRequestPerf.B = System.currentTimeMillis();
            firstRequestPerf.f31873a = true;
            znd zndVar = e.perfStaticsCallback;
            if (zndVar != null) {
                zndVar.a(firstRequestPerf.a());
            }
        }
    }

    public final void k2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("35fe6bb4", new Object[]{this});
            return;
        }
        y5p firstRequestPerf = ((acx) l0()).e().getFirstRequestPerf();
        if (firstRequestPerf != null && !firstRequestPerf.f31873a) {
            firstRequestPerf.A = System.currentTimeMillis();
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
        this.I.setObserveHeightChange(true);
        super.onRefreshSuccess(aVar);
    }

    @Override // com.taobao.android.xsearchplugin.muise.BaseMuiseCellViewHolder, com.taobao.android.xsearchplugin.muise.AbsMuiseViewHolder, tb.npc
    public void onRenderSuccess(com.taobao.android.weex_framework.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b2aeb48", new Object[]{this, aVar});
            return;
        }
        this.I.setObserveHeightChange(true);
        super.onRenderSuccess(aVar);
        if (i0() == 0) {
            j2();
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
        if (o4p.z1()) {
            qkn.d(getData(), null, getActivity(), b2(), ((acx) l0()).e());
        }
        return false;
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

    public final void T1(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("54883a22", new Object[]{this, jSONObject});
        } else if (jSONObject != null) {
            JSONArray c = h19.c(jSONObject, "params");
            for (int i = 0; i < c.size(); i++) {
                JSONObject jSONObject2 = c.getJSONObject(i);
                if (jSONObject2 != null) {
                    X1().addParam(jSONObject2.getString("key"), jSONObject2.getString("value"));
                }
            }
        }
    }

    public final void g2(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b886ca5f", new Object[]{this, jSONObject});
        } else if (jSONObject != null) {
            JSONArray c = h19.c(jSONObject, "params");
            for (int i = 0; i < c.size(); i++) {
                JSONObject jSONObject2 = c.getJSONObject(i);
                if (jSONObject2 != null) {
                    X1().removeParam(jSONObject2.getString("key"), jSONObject2.getString("value"));
                }
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x003f, code lost:
        if (r8.equals("setParams") == false) goto L_0x0036;
     */
    @Override // com.taobao.android.xsearchplugin.muise.BaseMuiseCellViewHolder, tb.cnx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean K(java.lang.String r8, com.alibaba.fastjson.JSONObject r9, tb.f64.a r10, tb.f64.a r11) {
        /*
            r7 = this;
            r0 = 3
            r1 = 2
            r2 = 0
            r3 = 1
            com.android.alibaba.ip.runtime.IpChange r4 = com.taobao.search.musie.RcmdMuiseViewHolder.$ipChange
            boolean r5 = r4 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r5 == 0) goto L_0x0025
            java.lang.String r5 = "1f36856c"
            r6 = 5
            java.lang.Object[] r6 = new java.lang.Object[r6]
            r6[r2] = r7
            r6[r3] = r8
            r6[r1] = r9
            r6[r0] = r10
            r8 = 4
            r6[r8] = r11
            java.lang.Object r8 = r4.ipc$dispatch(r5, r6)
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            return r8
        L_0x0025:
            boolean r10 = super.K(r8, r9, r10, r11)
            if (r10 != 0) goto L_0x0077
            r8.hashCode()
            r11 = -1
            int r4 = r8.hashCode()
            switch(r4) {
                case -1688932813: goto L_0x0059;
                case -956863702: goto L_0x004d;
                case -102588025: goto L_0x0042;
                case 485970056: goto L_0x0038;
                default: goto L_0x0036;
            }
        L_0x0036:
            r0 = -1
            goto L_0x0063
        L_0x0038:
            java.lang.String r1 = "setParams"
            boolean r8 = r8.equals(r1)
            if (r8 != 0) goto L_0x0063
            goto L_0x0036
        L_0x0042:
            java.lang.String r0 = "addParams"
            boolean r8 = r8.equals(r0)
            if (r8 != 0) goto L_0x004b
            goto L_0x0036
        L_0x004b:
            r0 = 2
            goto L_0x0063
        L_0x004d:
            java.lang.String r0 = "removeParams"
            boolean r8 = r8.equals(r0)
            if (r8 != 0) goto L_0x0057
            goto L_0x0036
        L_0x0057:
            r0 = 1
            goto L_0x0063
        L_0x0059:
            java.lang.String r0 = "clearParams"
            boolean r8 = r8.equals(r0)
            if (r8 != 0) goto L_0x0062
            goto L_0x0036
        L_0x0062:
            r0 = 0
        L_0x0063:
            switch(r0) {
                case 0: goto L_0x0073;
                case 1: goto L_0x006f;
                case 2: goto L_0x006b;
                case 3: goto L_0x0067;
                default: goto L_0x0066;
            }
        L_0x0066:
            goto L_0x0077
        L_0x0067:
            r7.i2(r9)
            goto L_0x0078
        L_0x006b:
            r7.T1(r9)
            goto L_0x0078
        L_0x006f:
            r7.g2(r9)
            goto L_0x0078
        L_0x0073:
            r7.U1(r9)
            goto L_0x0078
        L_0x0077:
            r3 = r10
        L_0x0078:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.search.musie.RcmdMuiseViewHolder.K(java.lang.String, com.alibaba.fastjson.JSONObject, tb.f64$a, tb.f64$a):boolean");
    }
}
