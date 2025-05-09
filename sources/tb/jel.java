package tb;

import android.content.Context;
import android.view.View;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRenderOptions;
import com.taobao.android.dinamicx.DXResult;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.dinamicx.s;
import com.taobao.android.dinamicx.template.download.DXTemplateItem;
import com.taobao.android.order.constants.OrderBizCode;
import com.taobao.android.order.map.model.OrderMapBubbleModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class jel {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(713031827);
    }

    public static List<OrderMapBubbleModel> a(u55 u55Var) {
        JSONObject r;
        ConcurrentHashMap<String, JSONObject> N;
        String str;
        JSONObject jSONObject;
        String string;
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("6131492", new Object[]{u55Var});
        }
        if (u55Var == null) {
            return null;
        }
        try {
            JSONArray jSONArray = u55Var.A().getJSONObject("structure").getJSONArray(pg1.ATOM_EXT_bubbles);
            if (jSONArray == null || (r = u55Var.r()) == null || (N = u55Var.N()) == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            Iterator<Object> it = jSONArray.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if (!(!(next instanceof String) || (jSONObject = r.getJSONObject((str = (String) next))) == null || (string = jSONObject.getString("type")) == null || (jSONObject2 = N.get(string)) == null)) {
                    OrderMapBubbleModel orderMapBubbleModel = new OrderMapBubbleModel(str, jSONObject2);
                    orderMapBubbleModel.h(jSONObject.getJSONObject("fields"));
                    orderMapBubbleModel.g(jSONObject.getJSONObject("events"));
                    arrayList.add(orderMapBubbleModel);
                }
            }
            return arrayList;
        } catch (Exception e) {
            idl.d(OrderBizCode.logisticsDetail, "bundle#getOrderMapBubbleModels", e.getMessage());
            return null;
        }
    }

    public static View b(Context context, OrderMapBubbleModel orderMapBubbleModel, s sVar, icl iclVar) {
        long j;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("daba1b3b", new Object[]{context, orderMapBubbleModel, sVar, iclVar});
        }
        if (sVar == null) {
            idl.d(OrderBizCode.logisticsDetail, "showBubbleError", "dxEngineRouter is null");
            return null;
        }
        JSONObject d = orderMapBubbleModel.d();
        String string = d.getString("name");
        if (!"dinamicx".equals(d.getString("containerType"))) {
            idl.d(OrderBizCode.logisticsDetail, "showBubbleError", "不是DX组件,name:" + string);
            return null;
        }
        try {
            j = Long.parseLong(d.getString("version"));
        } catch (Exception unused) {
            j = -1;
        }
        DXTemplateItem dXTemplateItem = new DXTemplateItem();
        dXTemplateItem.b = j;
        dXTemplateItem.c = d.getString("url");
        dXTemplateItem.f7343a = string;
        DXTemplateItem i = sVar.i(dXTemplateItem);
        if (i == null) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(dXTemplateItem);
            sVar.h(arrayList);
            idl.d(OrderBizCode.logisticsDetail, "showBubbleError", "获取模板失败，开始下载,name:" + string + ",version:" + j);
            return null;
        }
        DXResult<DXRootView> g = sVar.g(context, null, i);
        if (g == null || g.d()) {
            idl.d(OrderBizCode.logisticsDetail, "showBubbleError", "创建View出错,name:" + string + ",version:" + j);
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        JSONObject f = orderMapBubbleModel.f();
        if (f != null) {
            jSONObject.put("fields", (Object) f);
        }
        JSONObject e = orderMapBubbleModel.e();
        if (e != null) {
            jSONObject.put("events", (Object) e);
        }
        DXResult<DXRootView> w = sVar.w(context, jSONObject, g.f7291a, -1, iclVar == null ? null : new DXRenderOptions.b().E(iclVar.f21239a).q());
        if (w != null && !w.d()) {
            return w.f7291a;
        }
        idl.d(OrderBizCode.logisticsDetail, "showBubbleError", "渲染View出错,name:" + string + ",version:" + j);
        return null;
    }
}
