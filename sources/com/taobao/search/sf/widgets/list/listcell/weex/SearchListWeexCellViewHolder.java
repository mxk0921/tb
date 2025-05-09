package com.taobao.search.sf.widgets.list.listcell.weex;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.ScaleAnimation;
import android.widget.FrameLayout;
import androidx.collection.ArrayMap;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.datasource.impl.BaseSearchResult;
import com.taobao.android.searchbaseframe.nx3.bean.TemplateBean;
import com.taobao.android.searchbaseframe.nx3.bean.WeexCellBean;
import com.taobao.android.searchbaseframe.util.ListStyle;
import com.taobao.android.xsearchplugin.weex.biz.srp.BaseSrpListWeexCellViewHolder;
import com.taobao.search.jarvis.bean.DynamicCardBean;
import com.taobao.search.sf.datasource.CommonBaseDatasource;
import com.taobao.search.sf.datasource.CommonSearchResult;
import com.taobao.search.sf.realtimetag.IRealTimeTagContainer;
import com.taobao.taobao.R;
import java.util.Map;
import tb.acx;
import tb.amo;
import tb.c2v;
import tb.c4p;
import tb.f1p;
import tb.f64;
import tb.h19;
import tb.h1p;
import tb.lib;
import tb.o02;
import tb.o4p;
import tb.oen;
import tb.pkn;
import tb.qkn;
import tb.r4p;
import tb.sif;
import tb.t2o;
import tb.ude;
import tb.x6a;
import tb.zvr;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class SearchListWeexCellViewHolder extends BaseSrpListWeexCellViewHolder<acx<? extends o02<? extends BaseSearchResult, ?>>> implements IRealTimeTagContainer, GestureDetector.OnGestureListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public FrameLayout B;
    public GestureDetector C;
    public WeexCellBean y;
    public String z = "";
    public String A = "";

    static {
        t2o.a(815793657);
        t2o.a(815793651);
        t2o.a(993002193);
        t2o.a(815793449);
    }

    public SearchListWeexCellViewHolder(Activity activity, acx<? extends o02<? extends BaseSearchResult, ?>> acxVar, ude udeVar, ListStyle listStyle, ViewGroup viewGroup, int i) {
        super(activity, G0(activity, viewGroup), udeVar, listStyle, i, acxVar);
    }

    public static View G0(Context context, ViewGroup viewGroup) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("5159ec40", new Object[]{context, viewGroup});
        }
        if (o4p.z1()) {
            i = R.layout.tbsearch_item_weex_cell_intercept;
        } else {
            i = R.layout.tbsearch_item_weex_cell;
        }
        return LayoutInflater.from(context).inflate(i, viewGroup, false);
    }

    public static /* synthetic */ Object ipc$super(SearchListWeexCellViewHolder searchListWeexCellViewHolder, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -2135663108:
                super.u0(((Number) objArr[0]).intValue(), objArr[1]);
                return null;
            case -1313914308:
                super.H0();
                return null;
            case -1200140924:
                return super.Q0((WeexCellBean) objArr[0], ((Number) objArr[1]).intValue(), ((Boolean) objArr[2]).booleanValue(), (ListStyle) objArr[3]);
            case 19361223:
                return new Boolean(super.M0((ListStyle) objArr[0]));
            case 217607196:
                super.r();
                return null;
            case 299066517:
                super.w0();
                return null;
            case 523666796:
                return new Boolean(super.K((String) objArr[0], (JSONObject) objArr[1], (f64.a) objArr[2], (f64.a) objArr[3]));
            case 1626033557:
                super.t0();
                return null;
            case 1802319597:
                return new Boolean(super.Y());
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/sf/widgets/list/listcell/weex/SearchListWeexCellViewHolder");
        }
    }

    @Override // com.taobao.android.xsearchplugin.weex.list.AbsWeexViewHolder
    public void H0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b1af423c", new Object[]{this});
            return;
        }
        super.H0();
        this.B = (FrameLayout) this.itemView.findViewById(R.id.fl_inner_card_container);
        if (this.itemView instanceof sif) {
            this.C = new GestureDetector(getActivity().getApplicationContext(), this);
            ((sif) this.itemView).setOnInterceptTouchEventListener(new x6a(this.C));
        }
    }

    @Override // com.taobao.android.xsearchplugin.weex.biz.srp.BaseSrpListWeexCellViewHolder, com.taobao.android.xsearchplugin.weex.list.AbsWeexViewHolder
    public boolean M0(ListStyle listStyle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1276dc7", new Object[]{this, listStyle})).booleanValue();
        }
        if (super.M0(listStyle) || s1()) {
            return true;
        }
        return false;
    }

    @Override // com.taobao.android.xsearchplugin.weex.biz.srp.BaseSrpListWeexCellViewHolder, tb.wg3
    public boolean Y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6b6d36ed", new Object[]{this})).booleanValue();
        }
        if (!f1p.e(((acx) l0()).e())) {
            return false;
        }
        return super.Y();
    }

    @Override // com.taobao.search.sf.realtimetag.IRealTimeTagContainer
    public void clearTag() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a22e8814", new Object[]{this});
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

    @Override // com.taobao.android.xsearchplugin.weex.biz.srp.BaseSrpListWeexCellViewHolder
    /* renamed from: k1 */
    public Map<String, Object> Q0(WeexCellBean weexCellBean, int i, boolean z, ListStyle listStyle) {
        CommonSearchResult commonSearchResult;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("b8774d84", new Object[]{this, weexCellBean, new Integer(i), new Boolean(z), listStyle});
        }
        Map<String, Object> k1 = super.Q0(weexCellBean, i, z, listStyle);
        if ((((acx) l0()).e().getLastSearchResult() instanceof CommonSearchResult) && (commonSearchResult = (CommonSearchResult) ((acx) l0()).e().getLastSearchResult()) != null) {
            k1.put("iconData", commonSearchResult.nxRawIcon);
            Object obj = weexCellBean.mExtraObj.get("iconStyle");
            if (obj instanceof String) {
                k1.put("iconStyle", obj);
            }
        }
        return k1;
    }

    @Override // com.taobao.android.xsearchplugin.weex.biz.srp.BaseSrpListWeexCellViewHolder
    public void n1(Map<String, Object> map, WeexCellBean weexCellBean) {
        CommonSearchResult commonSearchResult;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dc7e2bc", new Object[]{this, map, weexCellBean});
            return;
        }
        map.put("pageName", c2v.getInstance().getCurrentPageName());
        map.put("rainbow", oen.j());
        ArrayMap arrayMap = new ArrayMap();
        arrayMap.put(amo.DIMENSION_BUSINESS_NAME, zvr.v());
        arrayMap.put("tItemType", this.z);
        arrayMap.put("sversion", r4p.SERVER_VERSION_VALUE);
        arrayMap.put(amo.DIMENSION_JSVERSION, this.A);
        try {
            String str = this.z;
            arrayMap.put("rainbow", oen.n("tbAndroid" + str + "EnableLT"));
        } catch (Exception unused) {
            c4p.n("SearchListWeexCellVH", "getBucketIdFail");
        }
        map.put("hubbleInfo", arrayMap);
        if ((((acx) l0()).e().getTotalSearchResult() instanceof CommonSearchResult) && (commonSearchResult = (CommonSearchResult) ((acx) l0()).e().getTotalSearchResult()) != null) {
            if (commonSearchResult.getMainInfo().pageTraceArgs != null) {
                map.put("spm", commonSearchResult.getMainInfo().pageTraceArgs.get("spm-cnt"));
            }
            map.put(h1p.a.PARAM_KEY_FIRST_RN, commonSearchResult.getMainInfo().rn);
        }
        WeexCellBean weexCellBean2 = this.y;
        if (weexCellBean2 != null) {
            map.put("srp_seq", String.valueOf(weexCellBean2.pageNo));
            map.put("srp_pos", String.valueOf(this.y.pagePos));
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
            qkn.d(getData(), null, getActivity(), i0(), ((acx) l0()).e());
        }
        return false;
    }

    public final void q1(JSONObject jSONObject) {
        JSONArray c;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fc56a8f6", new Object[]{this, jSONObject});
        } else if (jSONObject != null && (c = h19.c(jSONObject, "keys")) != null) {
            for (int i = 0; i < c.size(); i++) {
                String string = c.getString(i);
                if (!TextUtils.isEmpty(string)) {
                    r1().clearParam(string);
                }
            }
        }
    }

    @Override // com.taobao.android.xsearchplugin.weex.list.AbsWeexViewHolder, com.taobao.android.searchbaseframe.list.WidgetViewHolder
    public void r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf86c1c", new Object[]{this});
            return;
        }
        super.r();
        if (o4p.L0()) {
            this.l.H();
        }
    }

    public final CommonBaseDatasource r1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CommonBaseDatasource) ipChange.ipc$dispatch("ca6da478", new Object[]{this});
        }
        return (CommonBaseDatasource) ((acx) l0()).e();
    }

    public final boolean s1() {
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

    @Override // com.taobao.android.xsearchplugin.weex.list.AbsWeexViewHolder, com.taobao.android.searchbaseframe.list.WidgetViewHolder
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

    /* renamed from: t1 */
    public void u0(int i, WeexCellBean weexCellBean) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b83124f1", new Object[]{this, new Integer(i), weexCellBean});
            return;
        }
        this.y = weexCellBean;
        String str2 = "";
        if (weexCellBean != null) {
            str = weexCellBean.type;
        } else {
            str = str2;
        }
        this.z = str;
        TemplateBean q = this.l.q(R0(weexCellBean));
        if (q != null) {
            str2 = q.version;
        }
        this.A = str2;
        this.l.q(R0(this.y));
        super.u0(i, weexCellBean);
        v1(weexCellBean);
    }

    public final void v1(WeexCellBean weexCellBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f3f1b51", new Object[]{this, weexCellBean});
            return;
        }
        Object obj = weexCellBean.mExtraObj.get("dynamicCardBean");
        if (!(obj instanceof DynamicCardBean)) {
            this.B.removeAllViews();
            return;
        }
        DynamicCardBean dynamicCardBean = (DynamicCardBean) obj;
        View view = pkn.b(this, getActivity(), dynamicCardBean, i0()).itemView;
        this.B.addView(view);
        if (dynamicCardBean.firstRender) {
            ScaleAnimation scaleAnimation = new ScaleAnimation(1.0f, 1.0f, 0.0f, 1.0f);
            scaleAnimation.setDuration(300L);
            view.startAnimation(scaleAnimation);
            dynamicCardBean.firstRender = false;
        }
    }

    @Override // com.taobao.android.xsearchplugin.weex.list.AbsWeexViewHolder, com.taobao.android.searchbaseframe.list.WidgetViewHolder
    public void w0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("11d36495", new Object[]{this});
            return;
        }
        super.w0();
        if (o4p.L0()) {
            this.l.I();
        }
    }

    public final void x1(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("285787c1", new Object[]{this, jSONObject});
        } else if (jSONObject != null) {
            for (Map.Entry<String, Object> entry : jSONObject.entrySet()) {
                r1().setParam(entry.getKey(), entry.getValue().toString());
            }
        }
    }

    public final void p1(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("54883a22", new Object[]{this, jSONObject});
        } else if (jSONObject != null) {
            JSONArray c = h19.c(jSONObject, "params");
            for (int i = 0; i < c.size(); i++) {
                JSONObject jSONObject2 = c.getJSONObject(i);
                if (jSONObject2 != null) {
                    r1().addParam(jSONObject2.getString("key"), jSONObject2.getString("value"));
                }
            }
        }
    }

    public final void u1(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b886ca5f", new Object[]{this, jSONObject});
        } else if (jSONObject != null) {
            JSONArray c = h19.c(jSONObject, "params");
            for (int i = 0; i < c.size(); i++) {
                JSONObject jSONObject2 = c.getJSONObject(i);
                if (jSONObject2 != null) {
                    r1().removeParam(jSONObject2.getString("key"), jSONObject2.getString("value"));
                }
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x003f, code lost:
        if (r9.equals("removeSelf") == false) goto L_0x0036;
     */
    @Override // com.taobao.android.xsearchplugin.weex.biz.srp.BaseSrpListWeexCellViewHolder, tb.cnx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean K(java.lang.String r9, com.alibaba.fastjson.JSONObject r10, tb.f64.a r11, tb.f64.a r12) {
        /*
            r8 = this;
            r0 = 4
            r1 = 3
            r2 = 2
            r3 = 0
            r4 = 1
            com.android.alibaba.ip.runtime.IpChange r5 = com.taobao.search.sf.widgets.list.listcell.weex.SearchListWeexCellViewHolder.$ipChange
            boolean r6 = r5 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r6 == 0) goto L_0x0025
            java.lang.String r6 = "1f36856c"
            r7 = 5
            java.lang.Object[] r7 = new java.lang.Object[r7]
            r7[r3] = r8
            r7[r4] = r9
            r7[r2] = r10
            r7[r1] = r11
            r7[r0] = r12
            java.lang.Object r9 = r5.ipc$dispatch(r6, r7)
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            return r9
        L_0x0025:
            boolean r11 = super.K(r9, r10, r11, r12)
            if (r11 != 0) goto L_0x0087
            r9.hashCode()
            r12 = -1
            int r5 = r9.hashCode()
            switch(r5) {
                case -1688932813: goto L_0x0065;
                case -956863702: goto L_0x0059;
                case -102588025: goto L_0x004e;
                case 485970056: goto L_0x0042;
                case 1098537456: goto L_0x0038;
                default: goto L_0x0036;
            }
        L_0x0036:
            r0 = -1
            goto L_0x006f
        L_0x0038:
            java.lang.String r1 = "removeSelf"
            boolean r9 = r9.equals(r1)
            if (r9 != 0) goto L_0x006f
            goto L_0x0036
        L_0x0042:
            java.lang.String r0 = "setParams"
            boolean r9 = r9.equals(r0)
            if (r9 != 0) goto L_0x004c
            goto L_0x0036
        L_0x004c:
            r0 = 3
            goto L_0x006f
        L_0x004e:
            java.lang.String r0 = "addParams"
            boolean r9 = r9.equals(r0)
            if (r9 != 0) goto L_0x0057
            goto L_0x0036
        L_0x0057:
            r0 = 2
            goto L_0x006f
        L_0x0059:
            java.lang.String r0 = "removeParams"
            boolean r9 = r9.equals(r0)
            if (r9 != 0) goto L_0x0063
            goto L_0x0036
        L_0x0063:
            r0 = 1
            goto L_0x006f
        L_0x0065:
            java.lang.String r0 = "clearParams"
            boolean r9 = r9.equals(r0)
            if (r9 != 0) goto L_0x006e
            goto L_0x0036
        L_0x006e:
            r0 = 0
        L_0x006f:
            switch(r0) {
                case 0: goto L_0x0083;
                case 1: goto L_0x007f;
                case 2: goto L_0x007b;
                case 3: goto L_0x0077;
                case 4: goto L_0x0073;
                default: goto L_0x0072;
            }
        L_0x0072:
            goto L_0x0087
        L_0x0073:
            r8.destroyAndRemoveFromParent()
            goto L_0x0088
        L_0x0077:
            r8.x1(r10)
            goto L_0x0088
        L_0x007b:
            r8.p1(r10)
            goto L_0x0088
        L_0x007f:
            r8.u1(r10)
            goto L_0x0088
        L_0x0083:
            r8.q1(r10)
            goto L_0x0088
        L_0x0087:
            r4 = r11
        L_0x0088:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.search.sf.widgets.list.listcell.weex.SearchListWeexCellViewHolder.K(java.lang.String, com.alibaba.fastjson.JSONObject, tb.f64$a, tb.f64$a):boolean");
    }
}
