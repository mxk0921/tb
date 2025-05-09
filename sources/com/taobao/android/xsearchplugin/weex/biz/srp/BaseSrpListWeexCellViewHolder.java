package com.taobao.android.xsearchplugin.weex.biz.srp;

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
import com.taobao.android.searchbaseframe.nx3.bean.WeexBean;
import com.taobao.android.searchbaseframe.nx3.bean.WeexCellBean;
import com.taobao.android.searchbaseframe.util.ListStyle;
import com.taobao.android.searchbaseframe.xsl.module.XslDatasource;
import com.taobao.android.weex_framework.module.builtin.WXStorageModule;
import com.taobao.android.xsearchplugin.muise.BaseMuiseCellViewHolder;
import com.taobao.android.xsearchplugin.weex.list.AbsWeexViewHolder;
import com.taobao.search.musie.list.horizontal.HorizontalXslComponent;
import com.taobao.weex.WXSDKInstance;
import java.util.HashMap;
import java.util.Map;
import tb.acx;
import tb.bbk;
import tb.cbk;
import tb.cnx;
import tb.ej4;
import tb.enx;
import tb.f64;
import tb.k8x;
import tb.ng3;
import tb.o02;
import tb.p1p;
import tb.q5i;
import tb.t2o;
import tb.ude;
import tb.upx;
import tb.wg3;
import tb.yj4;
import tb.yw1;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class BaseSrpListWeexCellViewHolder<MODEL extends acx<? extends o02<? extends BaseSearchResult, ?>>> extends AbsWeexViewHolder<WeexCellBean, MODEL> implements wg3, cnx {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public int w = 0;
    public String x = "";

    static {
        t2o.a(993002181);
        t2o.a(993001706);
        t2o.a(993002201);
    }

    public BaseSrpListWeexCellViewHolder(Activity activity, MODEL model, ude udeVar, ListStyle listStyle, ViewGroup viewGroup, int i) {
        super(activity, udeVar, listStyle, viewGroup, i, model);
        l1();
    }

    public static /* synthetic */ Object ipc$super(BaseSrpListWeexCellViewHolder baseSrpListWeexCellViewHolder, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -912950620) {
            super.Y1((cbk) objArr[0]);
            return null;
        } else if (hashCode == 1373327421) {
            super.K1((cbk) objArr[0]);
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/android/xsearchplugin/weex/biz/srp/BaseSrpListWeexCellViewHolder");
        }
    }

    @Override // tb.wg3
    public void E() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bdc6270b", new Object[]{this});
            return;
        }
        WXSDKInstance r = this.l.r();
        if (r != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("status", "stop");
            r.B("videoStatus", hashMap);
        }
    }

    @Override // com.taobao.android.xsearchplugin.weex.list.AbsWeexViewHolder
    public int I0(WeexBean weexBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("64038bb6", new Object[]{this, weexBean})).intValue();
        }
        int cachedHeight = weexBean.getCachedHeight(ListStyle.LIST);
        if (cachedHeight > 0) {
            return cachedHeight;
        }
        return c0().f().b().f21076a;
    }

    @Override // com.taobao.android.xsearchplugin.weex.list.AbsWeexViewHolder
    public int K0(WeexBean weexBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1fef46e7", new Object[]{this, weexBean})).intValue();
        }
        int cachedHeight = weexBean.getCachedHeight(ListStyle.WATERFALL);
        if (cachedHeight > 0) {
            return cachedHeight;
        }
        return c0().f().b().b;
    }

    @Override // com.taobao.android.xsearchplugin.weex.list.AbsWeexViewHolder, tb.uz.d
    public void K1(cbk cbkVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("51db503d", new Object[]{this, cbkVar});
            return;
        }
        super.K1(cbkVar);
        if (this.p && (getParent() instanceof yw1)) {
            ((yw1) getParent()).j0(this, i0());
        }
    }

    @Override // com.taobao.android.xsearchplugin.weex.list.AbsWeexViewHolder
    public boolean M0(ListStyle listStyle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1276dc7", new Object[]{this, listStyle})).booleanValue();
        }
        if (listStyle == ListStyle.LIST) {
            return true;
        }
        if (getData() == null || (!getData().isSection && !getData().isFullspan && !getData().comboFullSpan)) {
            return false;
        }
        return true;
    }

    @Override // tb.wg3
    public void N() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c78bc13d", new Object[]{this});
            return;
        }
        WXSDKInstance r = this.l.r();
        if (r != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("status", "play");
            r.B("videoStatus", hashMap);
        }
    }

    @Override // com.taobao.android.xsearchplugin.weex.list.AbsWeexViewHolder
    public void N0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1ee7fa", new Object[]{this});
        } else if (getData() != null && (getData() instanceof WeexCellBean) && (j1() instanceof XslDatasource)) {
            A0(ng3.a(((XslDatasource) j1()).getCurrentTabIndex(), i0()));
        }
    }

    @Override // com.taobao.android.xsearchplugin.weex.list.AbsWeexViewHolder
    public void O0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2274e35e", new Object[]{this});
        } else if (getData() != null && (getData() instanceof WeexCellBean) && (j1() instanceof XslDatasource)) {
            A0(ng3.b(((XslDatasource) j1()).getCurrentTabIndex(), i0()));
        }
    }

    @Override // com.taobao.android.xsearchplugin.weex.list.AbsWeexViewHolder
    public void X0(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("59eb07fe", new Object[]{this, view});
        } else {
            view.setBackgroundColor(-1184275);
        }
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

    @Override // com.taobao.android.xsearchplugin.weex.list.AbsWeexViewHolder, tb.uz.d
    public void Y1(cbk cbkVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c9957aa4", new Object[]{this, cbkVar});
            return;
        }
        super.Y1(cbkVar);
        if (this.p && (getParent() instanceof yw1)) {
            ((yw1) getParent()).j0(this, i0());
        }
    }

    public String h1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8b73db1e", new Object[]{this});
        }
        return i1(this.itemView, j0(), true);
    }

    public String i1(View view, ListStyle listStyle, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("edf95409", new Object[]{this, view, listStyle, new Boolean(z)});
        }
        if (this.w == 0) {
            if (view.getMeasuredWidth() > 0 && z) {
                this.w = view.getMeasuredWidth();
            } else if (getParent() instanceof yw1) {
                RecyclerView A2 = ((yw1) getParent()).A2();
                Rect rect = new Rect();
                try {
                    RecyclerView.ItemDecoration D1 = BaseMuiseCellViewHolder.D1(A2);
                    if (D1 == null || z) {
                        A2.getLayoutManager().calculateItemDecorationsForChild(view, rect);
                    } else {
                        D1.getItemOffsets(rect, view, A2, null);
                    }
                } catch (Exception unused) {
                    c0().l().d("BaseSrpListWeexCellView", "Exception while getting ContainerWidth, please override getItemOffset in your Decoration, don't call super.getItemOffset");
                    rect.set(0, 0, 0, 0);
                }
                if (M0(listStyle)) {
                    this.w = (A2.getMeasuredWidth() - (rect.left + rect.right)) - (A2.getPaddingRight() + A2.getPaddingLeft());
                } else {
                    this.w = ((A2.getMeasuredWidth() - ((rect.left + rect.right) * 2)) - (A2.getPaddingRight() + A2.getPaddingLeft())) / 2;
                }
            } else {
                c0().l().d("BaseSrpListWeexCellView", "Parent Is Not BaseListWidget");
                this.w = ej4.f18611a;
            }
        }
        return String.valueOf(k8x.f(this.w));
    }

    public final o02 j1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (o02) ipChange.ipc$dispatch("ffa3208a", new Object[]{this});
        }
        if (l0() == 0) {
            return null;
        }
        return ((acx) l0()).e();
    }

    @Override // com.taobao.android.searchbaseframe.list.WidgetViewHolder
    public String k0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("55d7c1cd", new Object[]{this});
        }
        return "BaseSrpListWeexCellView";
    }

    public void l1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65ec3138", new Object[]{this});
            return;
        }
        bbk bbkVar = new bbk(getActivity(), c0(), (acx) l0(), this, this);
        bbkVar.J(this);
        Y0(bbkVar);
    }

    /* renamed from: m1 */
    public WeexBean R0(WeexCellBean weexCellBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WeexBean) ipChange.ipc$dispatch("fcffcc1e", new Object[]{this, weexCellBean});
        }
        return weexCellBean.mWeexBean;
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

    public void n1(Map<String, Object> map, WeexCellBean weexCellBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dc7e2bc", new Object[]{this, map, weexCellBean});
        }
    }

    public final void o1(View view, ListStyle listStyle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3898e06e", new Object[]{this, view, listStyle});
            return;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof StaggeredGridLayoutManager.LayoutParams) {
            ((StaggeredGridLayoutManager.LayoutParams) layoutParams).setFullSpan(M0(listStyle));
        }
    }

    @Override // tb.wg3
    public boolean u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4d2c9ffd", new Object[]{this})).booleanValue();
        }
        return true;
    }

    @Override // tb.cnx
    public boolean K(String str, JSONObject jSONObject, f64.a aVar, f64.a aVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1f36856c", new Object[]{this, str, jSONObject, aVar, aVar2})).booleanValue();
        }
        str.hashCode();
        if (str.equals("requestLostFocus")) {
            q5i.b(aVar);
            return true;
        } else if (!str.equals("updateStorage")) {
            return false;
        } else {
            enx.b(((acx) l0()).e(), jSONObject);
            return true;
        }
    }

    /* renamed from: k1 */
    public Map<String, Object> Q0(WeexCellBean weexCellBean, int i, boolean z, ListStyle listStyle) {
        float f;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("b8774d84", new Object[]{this, weexCellBean, new Integer(i), new Boolean(z), listStyle});
        }
        if (z) {
            f = ej4.f18611a;
        } else {
            f = (ej4.f18611a - (this.e * 2)) / ((acx) l0()).e().getPageColumn();
        }
        HashMap hashMap = new HashMap();
        hashMap.put("width", Float.valueOf(p1p.c(f)));
        hashMap.put(upx.PAGE_NUMBER, Integer.valueOf(weexCellBean.pageNo));
        hashMap.put("layoutStyle", Integer.valueOf(ListStyle.toNum(listStyle)));
        hashMap.put("index", Integer.valueOf(i));
        hashMap.put("keyword", ((acx) l0()).e().getKeyword());
        hashMap.put(yj4.PARAM_SEARCH_KEYWORD_RN, weexCellBean.rn);
        hashMap.put("bucketId", weexCellBean.abtest);
        hashMap.put("pageType", weexCellBean.pageType);
        hashMap.put(TBSearchChiTuJSBridge.ABTEST, weexCellBean.abtest);
        if (((acx) l0()).e().getExtraStatus() != null) {
            for (String str : ((acx) l0()).e().getExtraStatus().keySet()) {
                hashMap.put(str, ((acx) l0()).e().getExtraStatus().get(str));
            }
        }
        WeexBean weexBean = weexCellBean.mWeexBean;
        JSONObject jSONObject = weexBean.pageInfoExtraStatus;
        if (jSONObject != null) {
            hashMap.put(HorizontalXslComponent.ATTR_PAGE_INFO, jSONObject);
        }
        n1(hashMap, weexCellBean);
        Map<String, Object> map = weexCellBean.extraStatus;
        if (map != null) {
            hashMap.putAll(map);
        }
        Map<String, Object> map2 = weexCellBean.extraStatus;
        if (map2 == null || !map2.containsKey("layoutStyle")) {
            hashMap.put("containerWidth", h1());
        } else {
            try {
                String valueOf = String.valueOf(weexCellBean.extraStatus.get("layoutStyle"));
                if (!TextUtils.equals(valueOf, this.x)) {
                    this.w = 0;
                    o1(this.itemView, ListStyle.fromNumString(valueOf));
                }
                this.x = valueOf;
                hashMap.put("containerWidth", i1(this.itemView, ListStyle.fromNumString(valueOf), false));
            } catch (Exception unused) {
                hashMap.put("containerWidth", h1());
            }
        }
        HashMap hashMap2 = new HashMap();
        hashMap2.putAll(weexCellBean.mStorage);
        hashMap2.put(enx.INDEX_KEY, Integer.valueOf(i));
        HashMap hashMap3 = new HashMap();
        hashMap3.put("__nxType__", weexBean.type);
        hashMap3.put("model", weexBean.model);
        hashMap3.put("status", hashMap);
        hashMap3.put(WXStorageModule.NAME, hashMap2);
        return hashMap3;
    }

    public BaseSrpListWeexCellViewHolder(Activity activity, View view, ude udeVar, ListStyle listStyle, int i, MODEL model) {
        super(activity, view, udeVar, listStyle, i, model);
        l1();
    }
}
