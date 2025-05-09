package com.taobao.android.xsearchplugin.muise;

import android.app.Activity;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.chitu.TBSearchChiTuJSBridge;
import com.taobao.android.searchbaseframe.datasource.impl.BaseSearchResult;
import com.taobao.android.searchbaseframe.nx3.bean.MuiseBean;
import com.taobao.android.searchbaseframe.nx3.bean.MuiseCellBean;
import com.taobao.android.searchbaseframe.util.ListStyle;
import com.taobao.android.weex_framework.a;
import com.taobao.android.weex_framework.module.builtin.WXStorageModule;
import com.taobao.search.musie.list.horizontal.HorizontalXslComponent;
import java.util.HashMap;
import java.util.Map;
import tb.acx;
import tb.asi;
import tb.c4p;
import tb.cnx;
import tb.ej4;
import tb.enx;
import tb.f64;
import tb.j8j;
import tb.o02;
import tb.p1p;
import tb.ree;
import tb.t2o;
import tb.ude;
import tb.upx;
import tb.vdc;
import tb.wg3;
import tb.yj4;
import tb.yw1;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class BaseMuiseCellViewHolder<MODEL extends acx<? extends o02<? extends BaseSearchResult, ?>>> extends AbsMuiseViewHolder<MuiseCellBean, MODEL> implements wg3, cnx, a.AbstractC0518a, ree {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ACTION_CLOSE_PRE_FILTER = "closePreFilterPanel";
    public final Map<String, String> C = new HashMap();
    public String D = "";
    public MuiseCellBean E;

    static {
        t2o.a(993002132);
        t2o.a(993001706);
        t2o.a(993002201);
        t2o.a(982516017);
        t2o.a(993002142);
    }

    public BaseMuiseCellViewHolder(Activity activity, MODEL model, ude udeVar, ListStyle listStyle, ViewGroup viewGroup, int i) {
        super(activity, udeVar, listStyle, viewGroup, i, model);
        I1();
        this.l.Z(this);
    }

    public static RecyclerView.ItemDecoration D1(RecyclerView recyclerView) {
        RecyclerView.ItemDecoration itemDecorationAt;
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecyclerView.ItemDecoration) ipChange.ipc$dispatch("76fde24e", new Object[]{recyclerView});
        }
        do {
            itemDecorationAt = recyclerView.getItemDecorationAt(i);
            i++;
            if (itemDecorationAt == null) {
                return null;
            }
        } while (itemDecorationAt instanceof vdc);
        return itemDecorationAt;
    }

    public static /* synthetic */ Object ipc$super(BaseMuiseCellViewHolder baseMuiseCellViewHolder, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -2135663108:
                super.u0(((Number) objArr[0]).intValue(), objArr[1]);
                return null;
            case -1774438353:
                super.onRefreshSuccess((a) objArr[0]);
                return null;
            case -1743784140:
                return super.f0();
            case -1653535408:
                super.d1();
                return null;
            case -1261951496:
                return baseMuiseCellViewHolder.l0();
            case -871865884:
                super.onRefreshFailed((a) objArr[0], ((Number) objArr[1]).intValue(), (String) objArr[2], ((Boolean) objArr[3]).booleanValue());
                return null;
            case -871580117:
                super.onRenderFailed((a) objArr[0], ((Number) objArr[1]).intValue(), (String) objArr[2], ((Boolean) objArr[3]).booleanValue());
                return null;
            case 724233032:
                super.onRenderSuccess((a) objArr[0]);
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/xsearchplugin/muise/BaseMuiseCellViewHolder");
        }
    }

    public String B1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8b73db1e", new Object[]{this});
        }
        return C1(this.itemView, j0(), true);
    }

    @Override // tb.wg3
    public void E() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bdc6270b", new Object[]{this});
        } else {
            S1("videostatus", "stop");
        }
    }

    /* renamed from: E1 */
    public boolean S0(MuiseCellBean muiseCellBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7e407f4a", new Object[]{this, muiseCellBean})).booleanValue();
        }
        if (muiseCellBean == null || (!muiseCellBean.mStorageUpdated && !muiseCellBean.forceUpdate)) {
            return false;
        }
        return true;
    }

    /* renamed from: F1 */
    public boolean U0(ListStyle listStyle, MuiseCellBean muiseCellBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("32aae128", new Object[]{this, listStyle, muiseCellBean})).booleanValue();
        }
        ListStyle listStyle2 = ListStyle.LIST;
        if (listStyle == listStyle2) {
            return true;
        }
        if (muiseCellBean != null) {
            if (muiseCellBean.isSection || muiseCellBean.isFullspan || muiseCellBean.comboFullSpan) {
                return true;
            }
            asi asiVar = muiseCellBean.combo;
            if (asiVar != null && asiVar.p() == listStyle2) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: G1 */
    public void u0(int i, MuiseCellBean muiseCellBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61c07aa7", new Object[]{this, new Integer(i), muiseCellBean});
            return;
        }
        muiseCellBean.requestLayout = true;
        super.u0(i, muiseCellBean);
    }

    public void I1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65ec3138", new Object[]{this});
            return;
        }
        j8j j8jVar = new j8j(getActivity(), c0(), (acx) l0(), this, this);
        j8jVar.c0(this);
        q1(j8jVar);
    }

    /* renamed from: J1 */
    public MuiseBean c1(MuiseCellBean muiseCellBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MuiseBean) ipChange.ipc$dispatch("2b69a998", new Object[]{this, muiseCellBean});
        }
        return muiseCellBean.mMuiseBean;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x0038, code lost:
        if (r7.equals(com.taobao.android.xsearchplugin.muise.BaseMuiseCellViewHolder.ACTION_CLOSE_PRE_FILTER) == false) goto L_0x0032;
     */
    @Override // tb.cnx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean K(java.lang.String r7, com.alibaba.fastjson.JSONObject r8, tb.f64.a r9, tb.f64.a r10) {
        /*
            r6 = this;
            java.lang.String r0 = "closePreFilterPanel"
            r1 = 2
            r2 = 1
            r3 = 0
            com.android.alibaba.ip.runtime.IpChange r4 = com.taobao.android.xsearchplugin.muise.BaseMuiseCellViewHolder.$ipChange
            boolean r5 = r4 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r5 == 0) goto L_0x0027
            java.lang.String r0 = "1f36856c"
            r5 = 5
            java.lang.Object[] r5 = new java.lang.Object[r5]
            r5[r3] = r6
            r5[r2] = r7
            r5[r1] = r8
            r7 = 3
            r5[r7] = r9
            r7 = 4
            r5[r7] = r10
            java.lang.Object r7 = r4.ipc$dispatch(r0, r5)
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            return r7
        L_0x0027:
            r7.hashCode()
            r10 = -1
            int r4 = r7.hashCode()
            switch(r4) {
                case -725085627: goto L_0x0047;
                case 914742642: goto L_0x003b;
                case 980325089: goto L_0x0034;
                default: goto L_0x0032;
            }
        L_0x0032:
            r1 = -1
            goto L_0x0052
        L_0x0034:
            boolean r7 = r7.equals(r0)
            if (r7 != 0) goto L_0x0052
            goto L_0x0032
        L_0x003b:
            java.lang.String r1 = "updateStorage"
            boolean r7 = r7.equals(r1)
            if (r7 != 0) goto L_0x0045
            goto L_0x0032
        L_0x0045:
            r1 = 1
            goto L_0x0052
        L_0x0047:
            java.lang.String r1 = "requestLostFocus"
            boolean r7 = r7.equals(r1)
            if (r7 != 0) goto L_0x0051
            goto L_0x0032
        L_0x0051:
            r1 = 0
        L_0x0052:
            switch(r1) {
                case 0: goto L_0x0070;
                case 1: goto L_0x0062;
                case 2: goto L_0x0056;
                default: goto L_0x0055;
            }
        L_0x0055:
            return r3
        L_0x0056:
            tb.fw r7 = r6.l
            com.taobao.android.weex_framework.a r7 = r7.x()
            java.lang.String r8 = ""
            r7.fireNativeEvent(r0, r8)
            return r2
        L_0x0062:
            java.lang.Object r7 = r6.l0()
            tb.acx r7 = (tb.acx) r7
            tb.o02 r7 = r7.e()
            tb.enx.c(r7, r8)
            return r2
        L_0x0070:
            tb.q5i.b(r9)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.xsearchplugin.muise.BaseMuiseCellViewHolder.K(java.lang.String, com.alibaba.fastjson.JSONObject, tb.f64$a, tb.f64$a):boolean");
    }

    /* renamed from: L1 */
    public void e1(MuiseCellBean muiseCellBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f57c8e5", new Object[]{this, muiseCellBean});
            return;
        }
        this.E = muiseCellBean;
        muiseCellBean.invisibleCell = false;
    }

    @Override // com.taobao.android.xsearchplugin.muise.AbsMuiseViewHolder
    public int M0(MuiseBean muiseBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("81ae34c", new Object[]{this, muiseBean})).intValue();
        }
        int cachedHeight = muiseBean.getCachedHeight(ListStyle.LIST);
        if (cachedHeight > 0) {
            return cachedHeight;
        }
        return c0().f().b().f21076a;
    }

    public void M1(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c1252e30", new Object[]{this, str});
            return;
        }
        yw1 yw1Var = getParent() instanceof yw1 ? (yw1) getParent() : null;
        if (yw1Var != null) {
            if (TextUtils.equals(str, "finish")) {
                yw1Var.q0(this, i0());
            } else if (TextUtils.equals(str, "start")) {
                yw1Var.g(this, i0());
            }
        }
    }

    @Override // tb.wg3
    public void N() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c78bc13d", new Object[]{this});
        } else {
            S1("videostatus", "play");
        }
    }

    public void N1(Map<String, Object> map, MuiseCellBean muiseCellBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3f01763c", new Object[]{this, map, muiseCellBean});
        }
    }

    /* renamed from: O1 */
    public void l1(MuiseCellBean muiseCellBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb579d1f", new Object[]{this, muiseCellBean});
            return;
        }
        muiseCellBean.mStorageUpdated = false;
        muiseCellBean.forceUpdate = false;
    }

    @Override // tb.dxc
    public void P(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f30030f", new Object[]{this, aVar});
            return;
        }
        aVar.registerNativeEventCallback("videocallback", this);
        if (!this.C.isEmpty()) {
            for (Map.Entry<String, String> entry : this.C.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                aVar.updateNativeState(key, value);
                P1(aVar, key, value);
            }
            this.C.clear();
        }
    }

    @Override // com.taobao.android.xsearchplugin.muise.AbsMuiseViewHolder
    public int P0(MuiseBean muiseBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c9a68e3b", new Object[]{this, muiseBean})).intValue();
        }
        int cachedHeight = muiseBean.getCachedHeight(ListStyle.WATERFALL);
        if (cachedHeight > 0) {
            return cachedHeight;
        }
        return c0().f().b().b;
    }

    public void P1(a aVar, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c2ee89e3", new Object[]{this, aVar, str, str2});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(str, (Object) str2);
        aVar.sendInstanceMessage("MUISE", "nativestatus", jSONObject);
    }

    public final void Q1() {
        yw1 yw1Var;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("827392af", new Object[]{this});
            return;
        }
        if (getParent() instanceof yw1) {
            yw1Var = (yw1) getParent();
        } else {
            yw1Var = null;
        }
        if (yw1Var != null) {
            yw1Var.Q();
        }
    }

    public final void R1(View view, ListStyle listStyle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3898e06e", new Object[]{this, view, listStyle});
            return;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof StaggeredGridLayoutManager.LayoutParams) {
            ((StaggeredGridLayoutManager.LayoutParams) layoutParams).setFullSpan(U0(listStyle, getData()));
        }
    }

    public final void S1(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("820dbf4c", new Object[]{this, str, str2});
            return;
        }
        a x = this.l.x();
        if (x != null) {
            x.updateNativeState(str, str2);
            P1(x, str, str2);
            return;
        }
        this.C.put(str, str2);
    }

    @Override // tb.wg3
    public boolean Y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6b6d36ed", new Object[]{this})).booleanValue();
        }
        if (getData() == null || !getData().videoPlayable) {
            return false;
        }
        return true;
    }

    @Override // com.taobao.android.xsearchplugin.muise.AbsMuiseViewHolder
    public void d1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d710d50", new Object[]{this});
            return;
        }
        super.d1();
        MuiseCellBean muiseCellBean = this.E;
        muiseCellBean.layoutCalcDone = true;
        muiseCellBean.invisibleCell = true;
    }

    @Override // com.taobao.android.xsearchplugin.muise.AbsMuiseViewHolder, com.taobao.android.searchbaseframe.list.WidgetViewHolder
    public JSONObject f0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("980ff734", new Object[]{this});
        }
        JSONObject f0 = super.f0();
        if (Y()) {
            JSONObject jSONObject = new JSONObject();
            a x = this.l.x();
            String str = "null";
            jSONObject.put("videostatus", (Object) (x == null ? str : x.getNativeState("videostatus")));
            if (x != null) {
                str = x.getNativeState("visibility");
            }
            jSONObject.put("visibility", (Object) str);
            f0.put("播放状态", (Object) jSONObject);
        }
        return f0;
    }

    @Override // com.taobao.android.searchbaseframe.list.WidgetViewHolder
    public String k0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("55d7c1cd", new Object[]{this});
        }
        return "BaseSrpListMuiseCellView";
    }

    @Override // tb.cnx
    public boolean m2(String str, JSONObject jSONObject, f64.a aVar, f64.a aVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9ac25dbb", new Object[]{this, str, jSONObject, aVar, aVar2})).booleanValue();
        }
        A0(f64.a(str, jSONObject, aVar, aVar2));
        return true;
    }

    @Override // com.taobao.android.weex_framework.a.AbstractC0518a
    public void onNativeEvent(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("55d43f7f", new Object[]{this, str, str2});
        } else if ("videocallback".equals(str)) {
            M1(str2);
        }
    }

    @Override // com.taobao.android.xsearchplugin.muise.AbsMuiseViewHolder, tb.npc
    public void onRefreshFailed(a aVar, int i, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cc0861e4", new Object[]{this, aVar, new Integer(i), str, new Boolean(z)});
            return;
        }
        super.onRefreshFailed(aVar, i, str, z);
        this.E.layoutCalcDone = true;
    }

    @Override // com.taobao.android.xsearchplugin.muise.AbsMuiseViewHolder, tb.npc
    public void onRefreshSuccess(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("963c382f", new Object[]{this, aVar});
            return;
        }
        super.onRefreshSuccess(aVar);
        this.E.layoutCalcDone = true;
        Q1();
    }

    @Override // com.taobao.android.xsearchplugin.muise.AbsMuiseViewHolder, tb.npc
    public void onRenderFailed(a aVar, int i, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cc0cbe2b", new Object[]{this, aVar, new Integer(i), str, new Boolean(z)});
            return;
        }
        super.onRenderFailed(aVar, i, str, z);
        this.E.layoutCalcDone = true;
    }

    @Override // com.taobao.android.xsearchplugin.muise.AbsMuiseViewHolder, tb.npc
    public void onRenderSuccess(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b2aeb48", new Object[]{this, aVar});
            return;
        }
        super.onRenderSuccess(aVar);
        this.E.layoutCalcDone = true;
        Q1();
    }

    @Override // com.taobao.android.xsearchplugin.muise.AbsMuiseViewHolder
    public void r1(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("59eb07fe", new Object[]{this, view});
            return;
        }
        Integer c = ((acx) l0()).c().c();
        if (c != null) {
            view.setBackgroundColor(c.intValue());
        } else {
            view.setBackgroundColor(c0().f().b().c);
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

    public String C1(View view, ListStyle listStyle, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("edf95409", new Object[]{this, view, listStyle, new Boolean(z)});
        }
        if (this.B == 0 || (view.getMeasuredWidth() > 0 && this.B != view.getMeasuredWidth())) {
            if (view.getMeasuredWidth() > 0 && z) {
                this.B = view.getMeasuredWidth();
            } else if (getParent() instanceof yw1) {
                RecyclerView A2 = ((yw1) getParent()).A2();
                Rect rect = new Rect();
                try {
                    RecyclerView.ItemDecoration D1 = D1(A2);
                    if (D1 == null || z) {
                        A2.getLayoutManager().calculateItemDecorationsForChild(view, rect);
                    } else {
                        D1.getItemOffsets(rect, view, A2, null);
                    }
                } catch (Exception unused) {
                    c0().l().d("BaseSrpListMuiseCellView", "Exception while getting ContainerWidth, please override getItemOffset in your Decoration, don't call super.getItemOffset");
                    rect.set(0, 0, 0, 0);
                }
                if (U0(listStyle, getData())) {
                    this.B = (A2.getMeasuredWidth() - (rect.left + rect.right)) - (A2.getPaddingRight() + A2.getPaddingLeft());
                } else {
                    int spanCount = ((StaggeredGridLayoutManager) A2.getLayoutManager()).getSpanCount();
                    this.B = ((A2.getMeasuredWidth() - ((rect.left + rect.right) * spanCount)) - (A2.getPaddingRight() + A2.getPaddingLeft())) / spanCount;
                    c4p.D("ms.containerWidth", "rvWidth:" + A2.getMeasuredWidth() + ",spanCount:" + spanCount + ", rvPadding:" + A2.getPaddingRight() + "," + A2.getPaddingLeft(), new Object[0]);
                }
            } else if (view.getLayoutParams().width > 0) {
                this.B = view.getLayoutParams().width;
            } else {
                c0().l().d("BaseSrpListMuiseCellView", "Parent Is Not BaseListWidget");
                this.B = ej4.f18611a;
            }
        }
        c4p.D("ms.containerWidth", "width:" + this.B + ", useViewWidth:" + z, new Object[0]);
        return String.valueOf(p1p.d(this.B));
    }

    /* renamed from: H1 */
    public Map<String, Object> a1(MuiseCellBean muiseCellBean, int i, boolean z, ListStyle listStyle) {
        float f;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("2dc570c6", new Object[]{this, muiseCellBean, new Integer(i), new Boolean(z), listStyle});
        }
        if (z) {
            f = ej4.f18611a;
        } else {
            f = (ej4.f18611a - (this.e * 2)) / ((acx) l0()).e().getPageColumn();
        }
        HashMap hashMap = new HashMap();
        hashMap.put("width", Float.valueOf(p1p.c(f)));
        hashMap.put(upx.PAGE_NUMBER, Integer.valueOf(muiseCellBean.pageNo));
        hashMap.put("page", Integer.valueOf(muiseCellBean.pageNo));
        hashMap.put("layoutStyle", Integer.valueOf(ListStyle.toNum(listStyle)));
        hashMap.put("listLayoutStyle", Integer.valueOf(ListStyle.toNum(listStyle)));
        hashMap.put("index", Integer.valueOf(i));
        hashMap.put("keyword", ((acx) l0()).e().getKeyword());
        hashMap.put(yj4.PARAM_SEARCH_KEYWORD_RN, muiseCellBean.rn);
        hashMap.put("bucketId", muiseCellBean.abtest);
        hashMap.put("pageType", muiseCellBean.pageType);
        hashMap.put(TBSearchChiTuJSBridge.ABTEST, muiseCellBean.abtest);
        if (((acx) l0()).e().getExtraStatus() != null) {
            for (String str : ((acx) l0()).e().getExtraStatus().keySet()) {
                hashMap.put(str, ((acx) l0()).e().getExtraStatus().get(str));
            }
        }
        MuiseBean muiseBean = muiseCellBean.mMuiseBean;
        JSONObject jSONObject = muiseBean.pageInfoExtraStatus;
        if (jSONObject != null) {
            hashMap.put(HorizontalXslComponent.ATTR_PAGE_INFO, jSONObject);
        }
        N1(hashMap, muiseCellBean);
        try {
            Map<String, Object> map = muiseCellBean.extraStatus;
            if (map != null) {
                hashMap.putAll(map);
            }
        } catch (Exception unused) {
        }
        Map<String, Object> map2 = muiseCellBean.extraStatus;
        if (map2 == null || !map2.containsKey("layoutStyle")) {
            hashMap.put("containerWidth", B1());
        } else {
            try {
                String valueOf = String.valueOf(muiseCellBean.extraStatus.get("layoutStyle"));
                if (!TextUtils.equals(valueOf, this.D)) {
                    this.B = 0;
                    R1(this.itemView, ListStyle.fromNumString(valueOf));
                }
                this.D = valueOf;
                hashMap.put("containerWidth", C1(this.itemView, ListStyle.fromNumString(valueOf), false));
            } catch (Exception unused2) {
                hashMap.put("containerWidth", B1());
            }
        }
        HashMap hashMap2 = new HashMap();
        hashMap2.putAll(muiseCellBean.mStorage);
        hashMap2.put(enx.INDEX_KEY, Integer.valueOf(muiseCellBean.beanId));
        HashMap hashMap3 = new HashMap();
        hashMap3.put("__nxType__", muiseBean.type);
        hashMap3.put("model", muiseBean.model);
        hashMap3.put("status", hashMap);
        hashMap3.put(WXStorageModule.NAME, hashMap2);
        return hashMap3;
    }

    public BaseMuiseCellViewHolder(Activity activity, View view, ude udeVar, ListStyle listStyle, int i, MODEL model) {
        super(activity, view, udeVar, listStyle, i, model);
        I1();
        this.l.Z(this);
    }
}
