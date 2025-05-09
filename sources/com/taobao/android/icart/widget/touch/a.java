package com.taobao.android.icart.widget.touch;

import android.os.Build;
import android.view.View;
import com.alibaba.android.ultron.vfw.core.ViewEngine;
import com.alibaba.android.ultron.vfw.viewholder.RecyclerViewHolder;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.phone.iifaa.did.rpc.model.CredentialRpcData;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.android.icart.widget.touch.DragFloatLayer;
import com.taobao.android.ultron.common.model.IDMComponent;
import com.taobao.android.ultron.common.utils.UnifyLog;
import com.taobao.android.ultron.datamodel.imp.DMComponent;
import java.util.Map;
import tb.c9x;
import tb.kmb;
import tb.lbq;
import tb.mg8;
import tb.pg1;
import tb.rew;
import tb.t2o;
import tb.u55;
import tb.ub3;
import tb.v55;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(478151154);
    }

    public static void a(View view, String str, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cd4c086", new Object[]{view, str, new Float(f)});
        } else if ((view instanceof DXRootView) && Build.VERSION.SDK_INT >= 22) {
            View d = d(view, str);
            if (d != null) {
                d.setElevation(f);
            }
            View d2 = d(view, "sideBar");
            if (d2 != null) {
                d2.setElevation(f);
            }
        }
    }

    public static DragFloatLayer.e b(kmb kmbVar, JSONObject jSONObject) {
        DMComponent dMComponent;
        RecyclerViewHolder c;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DragFloatLayer.e) ipChange.ipc$dispatch("1dbfb960", new Object[]{kmbVar, jSONObject});
        }
        IDMComponent u = kmbVar.d().u("dragFolder");
        if (u == null) {
            return null;
        }
        if (kmbVar.j() instanceof u55) {
            u55 u55Var = (u55) kmbVar.j();
            v55 v = u55Var.v();
            JSONObject jSONObject2 = (JSONObject) u.getData().clone();
            jSONObject2.put("fields", (Object) new JSONObject());
            jSONObject2.put("status", (Object) "normal");
            dMComponent = v.d(u55Var, jSONObject2, u.getKey());
        } else {
            dMComponent = null;
        }
        if (dMComponent == null) {
            return null;
        }
        ViewEngine t = kmbVar.e().t();
        rew rewVar = (rew) t.a0(rew.class);
        if (rewVar == null || (c = rewVar.c(t.Z(), rewVar.f(dMComponent))) == null) {
            return null;
        }
        for (Map.Entry<String, Object> entry : jSONObject.entrySet()) {
            dMComponent.writeFields(entry.getKey(), entry.getValue());
        }
        dMComponent.writeFields("_dragFloat", "true");
        rewVar.b(c, dMComponent);
        a(c.itemView, "folderMain", 17.0f);
        a(c.itemView, "folderBk", 8.0f);
        View d = d(c.itemView, "folderMain");
        if (d == null) {
            d = c.itemView;
        }
        return new DragFloatLayer.e(c.itemView, d);
    }

    public static DragFloatLayer.e c(kmb kmbVar, IDMComponent iDMComponent) {
        DMComponent dMComponent;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DragFloatLayer.e) ipChange.ipc$dispatch("1dfb46e9", new Object[]{kmbVar, iDMComponent});
        }
        if (kmbVar.j() instanceof u55) {
            u55 u55Var = (u55) kmbVar.j();
            v55 v = u55Var.v();
            JSONObject jSONObject = (JSONObject) iDMComponent.getData().clone();
            jSONObject.put("fields", iDMComponent.getFields().clone());
            jSONObject.put("status", (Object) "normal");
            dMComponent = v.d(u55Var, jSONObject, iDMComponent.getKey());
        } else {
            dMComponent = null;
        }
        if (dMComponent == null) {
            return null;
        }
        ViewEngine t = kmbVar.e().t();
        rew rewVar = (rew) t.a0(rew.class);
        if (rewVar == null) {
            return null;
        }
        RecyclerViewHolder c = rewVar.c(t.Z(), rewVar.f(dMComponent));
        if (c == null) {
            UnifyLog.e("DragFloatViewCreator", "viewHolder is empty");
            lbq.a(c9x.CART_BIZ_NAME, "DragFloatViewCreator", mg8.EVENT_DRAG, "viewHolder 为null");
            return null;
        } else if (!(c.itemView instanceof DXRootView)) {
            UnifyLog.e("DragFloatViewCreator", "viewHolder is empty");
            lbq.a(c9x.CART_BIZ_NAME, "DragFloatViewCreator", mg8.EVENT_DRAG, "viewHolder item = " + c.itemView);
            return null;
        } else {
            dMComponent.writeFields("_dragFloat", "true");
            dMComponent.writeFields("cornerType", CredentialRpcData.ACTION_BOTH);
            rewVar.b(c, dMComponent);
            a(c.itemView, "main", 20.0f);
            e(c);
            View d = d(c.itemView, "main");
            if (d == null) {
                d = c.itemView;
            }
            return new DragFloatLayer.e(c.itemView, d);
        }
    }

    public static View d(View view, String str) {
        DXWidgetNode queryWidgetNodeByUserId;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("99930da9", new Object[]{view, str});
        }
        if (!(view instanceof DXRootView)) {
            ub3.g("DragFloatViewCreator/findDXInnerViewException", "itemView is not DXRootView," + view);
            return null;
        }
        DXRootView dXRootView = (DXRootView) view;
        if (dXRootView.getFlattenWidgetNode() == null || (queryWidgetNodeByUserId = dXRootView.getFlattenWidgetNode().queryWidgetNodeByUserId(str)) == null || queryWidgetNodeByUserId.getDXRuntimeContext() == null) {
            return null;
        }
        return queryWidgetNodeByUserId.getDXRuntimeContext().D();
    }

    public static void e(RecyclerViewHolder recyclerViewHolder) {
        DXWidgetNode flattenWidgetNode;
        DXWidgetNode queryWidgetNodeByUserId;
        View D;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b2186607", new Object[]{recyclerViewHolder});
            return;
        }
        View view = recyclerViewHolder.itemView;
        if ((view instanceof DXRootView) && (flattenWidgetNode = ((DXRootView) view).getFlattenWidgetNode()) != null && (queryWidgetNodeByUserId = flattenWidgetNode.queryWidgetNodeByUserId(pg1.ATOM_EXT_button)) != null && queryWidgetNodeByUserId.getDXRuntimeContext() != null && (D = queryWidgetNodeByUserId.getDXRuntimeContext().D()) != null) {
            D.setVisibility(8);
        }
    }
}
