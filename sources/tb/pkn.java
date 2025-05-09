package tb;

import android.app.Activity;
import android.view.View;
import android.widget.FrameLayout;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.datasource.impl.cell.BaseCellBean;
import com.taobao.android.searchbaseframe.list.WidgetViewHolder;
import com.taobao.android.searchbaseframe.nx3.bean.MuiseCellBean;
import com.taobao.android.searchbaseframe.nx3.bean.WeexCellBean;
import com.taobao.android.xsearchplugin.weex.list.AbsWeexViewHolder;
import com.taobao.search.jarvis.bean.DynamicCardBean;
import com.taobao.search.musie.SearchMuiseViewHolder;
import com.taobao.search.sf.realtimetag.IRealTimeTagContainer;
import com.taobao.search.sf.widgets.list.listcell.weex.SearchDynamicCardViewHolder;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class pkn {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(815793455);
    }

    public static void a(JSONObject jSONObject, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d1d576e9", new Object[]{jSONObject, obj});
        } else if (!o4p.A1()) {
            jSONObject.put("outerBean", (Object) JSON.toJSONString(obj));
        } else if (obj instanceof JSONObject) {
            ((JSONObject) obj).remove(r4p.VALUE_MODULE_DYNAMIC_CARD);
            jSONObject.put("outerBean", obj);
            jSONObject.put("outerBeanIsObject", "true");
        }
    }

    public static WidgetViewHolder b(IRealTimeTagContainer iRealTimeTagContainer, Activity activity, DynamicCardBean dynamicCardBean, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WidgetViewHolder) ipChange.ipc$dispatch("84001947", new Object[]{iRealTimeTagContainer, activity, dynamicCardBean, new Integer(i)});
        }
        return c(iRealTimeTagContainer, activity, dynamicCardBean, i, null);
    }

    public static WidgetViewHolder c(IRealTimeTagContainer iRealTimeTagContainer, Activity activity, DynamicCardBean dynamicCardBean, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WidgetViewHolder) ipChange.ipc$dispatch("4d9366b", new Object[]{iRealTimeTagContainer, activity, dynamicCardBean, new Integer(i), obj});
        }
        if (!(iRealTimeTagContainer instanceof WidgetViewHolder)) {
            return null;
        }
        BaseCellBean baseCellBean = dynamicCardBean.mDynamicCellBean;
        if (baseCellBean instanceof WeexCellBean) {
            return e(iRealTimeTagContainer, activity, dynamicCardBean, i, obj);
        }
        if (baseCellBean instanceof MuiseCellBean) {
            return d(iRealTimeTagContainer, activity, dynamicCardBean, i, obj);
        }
        return null;
    }

    public static WidgetViewHolder e(IRealTimeTagContainer iRealTimeTagContainer, Activity activity, DynamicCardBean dynamicCardBean, int i, Object obj) {
        uz uzVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WidgetViewHolder) ipChange.ipc$dispatch("6d4ec4ed", new Object[]{iRealTimeTagContainer, activity, dynamicCardBean, new Integer(i), obj});
        }
        WidgetViewHolder widgetViewHolder = (WidgetViewHolder) iRealTimeTagContainer;
        View view = widgetViewHolder.itemView;
        int round = Math.round(o1p.g(view.getMeasuredWidth()));
        int round2 = Math.round(o1p.g(view.getMeasuredHeight()));
        WeexCellBean weexCellBean = (WeexCellBean) dynamicCardBean.mDynamicCellBean;
        JSONObject jSONObject = weexCellBean.mWeexBean.model;
        jSONObject.put("containerWidth", (Object) String.valueOf(round));
        jSONObject.put("containerHeight", (Object) String.valueOf(round2));
        if (obj != null && !jSONObject.containsKey("outerBean")) {
            a(jSONObject, obj);
        }
        AbsWeexViewHolder absWeexViewHolder = widgetViewHolder instanceof l1c ? (AbsWeexViewHolder) ((l1c) widgetViewHolder).z(weexCellBean) : null;
        AbsWeexViewHolder searchDynamicCardViewHolder = absWeexViewHolder == null ? new SearchDynamicCardViewHolder(activity, (b64) widgetViewHolder.l0(), widgetViewHolder.getParent(), iRealTimeTagContainer.getContainerListStyle(), new FrameLayout(activity), 0) : absWeexViewHolder;
        if (dynamicCardBean.mTemplates != null) {
            uzVar = new ebk(activity, yak.f31939a, searchDynamicCardViewHolder, searchDynamicCardViewHolder, dynamicCardBean.mTemplates, (acx) searchDynamicCardViewHolder.l0());
        } else {
            uzVar = new bbk(activity, yak.f31939a, (acx) searchDynamicCardViewHolder.l0(), searchDynamicCardViewHolder, searchDynamicCardViewHolder);
        }
        uzVar.J((cnx) searchDynamicCardViewHolder);
        searchDynamicCardViewHolder.Y0(uzVar);
        searchDynamicCardViewHolder.b0(i, weexCellBean);
        return searchDynamicCardViewHolder;
    }

    public static WidgetViewHolder d(IRealTimeTagContainer iRealTimeTagContainer, Activity activity, DynamicCardBean dynamicCardBean, int i, Object obj) {
        fw fwVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WidgetViewHolder) ipChange.ipc$dispatch("30fc9787", new Object[]{iRealTimeTagContainer, activity, dynamicCardBean, new Integer(i), obj});
        }
        WidgetViewHolder widgetViewHolder = (WidgetViewHolder) iRealTimeTagContainer;
        View view = widgetViewHolder.itemView;
        int round = Math.round(o1p.g(view.getMeasuredWidth()));
        int round2 = Math.round(o1p.g(view.getMeasuredHeight()));
        MuiseCellBean muiseCellBean = (MuiseCellBean) dynamicCardBean.mDynamicCellBean;
        JSONObject jSONObject = muiseCellBean.mMuiseBean.model;
        jSONObject.put("containerWidth", (Object) String.valueOf(round));
        jSONObject.put("containerHeight", (Object) String.valueOf(round2));
        if (obj != null && !jSONObject.containsKey("outerBean")) {
            a(jSONObject, obj);
        }
        SearchMuiseViewHolder searchMuiseViewHolder = widgetViewHolder instanceof l1c ? (SearchMuiseViewHolder) ((l1c) widgetViewHolder).z(muiseCellBean) : null;
        SearchMuiseViewHolder searchMuiseViewHolder2 = searchMuiseViewHolder == null ? new SearchMuiseViewHolder(activity, (acx) widgetViewHolder.l0(), widgetViewHolder.getParent(), iRealTimeTagContainer.getContainerListStyle(), new FrameLayout(activity), 0) : searchMuiseViewHolder;
        if (dynamicCardBean.mTemplates != null) {
            fwVar = new o8j(activity, widgetViewHolder.getCore(), searchMuiseViewHolder2, searchMuiseViewHolder2, dynamicCardBean.mTemplates.get(muiseCellBean.type), (acx) widgetViewHolder.l0());
        } else {
            fwVar = new j8j(activity, widgetViewHolder.getCore(), (acx) searchMuiseViewHolder2.l0(), searchMuiseViewHolder2, searchMuiseViewHolder2);
        }
        fwVar.Z(searchMuiseViewHolder2);
        searchMuiseViewHolder2.q1(fwVar);
        searchMuiseViewHolder2.r0();
        searchMuiseViewHolder2.b0(i, muiseCellBean);
        return searchMuiseViewHolder2;
    }
}
