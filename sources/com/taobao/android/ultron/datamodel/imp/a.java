package com.taobao.android.ultron.datamodel.imp;

import android.text.TextUtils;
import com.alibaba.android.aura.taobao.adapter.extension.linkage.event.AURASubmitEvent;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.model.IDMComponent;
import com.taobao.android.ultron.common.utils.ErrorConstants;
import com.taobao.android.ultron.datamodel.imp.ParseResponseHelper;
import com.taobao.message.sp.framework.model.SimpleProfile;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import tb.ir0;
import tb.lbq;
import tb.ptd;
import tb.ro;
import tb.t2o;
import tb.u55;
import tb.x96;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class a implements ptd {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(83886211);
        t2o.a(83886130);
    }

    public final void b(u55 u55Var, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("40083070", new Object[]{this, u55Var, jSONObject});
        } else if (jSONObject != null) {
            JSONObject jSONObject2 = jSONObject.getJSONObject("meta");
            if (jSONObject2 == null) {
                jSONObject2 = new JSONObject();
                jSONObject.put("meta", (Object) jSONObject2);
            }
            Object remove = jSONObject2.remove("template");
            if (remove instanceof JSONObject) {
                JSONObject jSONObject3 = (JSONObject) remove;
                JSONArray jSONArray = new JSONArray();
                JSONObject jSONObject4 = new JSONObject();
                jSONObject4.put("id", jSONObject3.get("id"));
                jSONObject4.put("version", jSONObject3.get("version"));
                jSONArray.add(jSONObject4);
                jSONObject2.put("templates", (Object) jSONArray.toJSONString());
                return;
            }
            List<ParseResponseHelper.TemplateInfo> g = ParseResponseHelper.g(u55Var.q(), u55Var.getBizName());
            if (g != null) {
                jSONObject2.put("templates", (Object) JSON.toJSONString(g));
            }
        }
    }

    public final JSONObject c(u55 u55Var) {
        JSONObject C;
        JSONObject jSONObject;
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("d8f35d2f", new Object[]{this, u55Var});
        }
        if (u55Var == null || (C = u55Var.C()) == null || (jSONObject = C.getJSONObject("features")) == null || (jSONObject2 = jSONObject.getJSONObject(ro.SIMPLIFY_RULES)) == null) {
            return null;
        }
        return jSONObject2.getJSONObject("data");
    }

    public JSONObject d(u55 u55Var, Collection<?> collection, IDMComponent iDMComponent, boolean z) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("c59b8b", new Object[]{this, u55Var, collection, iDMComponent, new Boolean(z)});
        }
        JSONObject jSONObject2 = new JSONObject();
        boolean z2 = iDMComponent instanceof DMComponent;
        DMComponent dMComponent = z2 ? (DMComponent) iDMComponent : null;
        JSONObject c = c(u55Var);
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            DMComponent dMComponent2 = (DMComponent) it.next();
            if (!z) {
                jSONObject = dMComponent2.submitData();
            } else {
                jSONObject = dMComponent2.adjustData();
            }
            if (jSONObject != null) {
                if (c != null) {
                    jSONObject = ir0.c(dMComponent, c, dMComponent2, jSONObject);
                }
                jSONObject2.put(dMComponent2.getKey(), (Object) jSONObject);
            }
        }
        if (z2 && iDMComponent.getExtMap() != null && iDMComponent.getExtMap().containsKey("popupWindowNodes")) {
            Object obj = iDMComponent.getExtMap().get("popupWindowNodes");
            if (obj instanceof Map) {
                Map map = (Map) obj;
                for (String str : map.keySet()) {
                    jSONObject2.put(str, map.get(str));
                }
            }
        }
        JSONObject jSONObject3 = new JSONObject();
        JSONObject o = u55Var.o();
        if (o != null) {
            JSONObject jSONObject4 = new JSONObject();
            String string = o.getString("validateParams");
            boolean booleanValue = o.getBooleanValue("compress");
            if (!z) {
                String string2 = o.getString("submitParams");
                if (!(string2 == null && string == null)) {
                    if (string2 != null && !string2.isEmpty()) {
                        jSONObject4.put("submitParams", (Object) string2);
                    }
                    if (string != null && !string.isEmpty()) {
                        jSONObject4.put("validateParams", (Object) string);
                    }
                    jSONObject4.put("compress", (Object) Boolean.valueOf(booleanValue));
                    o = jSONObject4;
                }
                jSONObject3.put("common", (Object) o);
            } else {
                String string3 = o.getString("queryParams");
                if (!(string3 == null && string == null)) {
                    if (string3 != null && !string3.isEmpty()) {
                        jSONObject4.put("queryParams", (Object) string3);
                    }
                    if (string != null && !string.isEmpty()) {
                        jSONObject4.put("validateParams", (Object) string);
                    }
                    jSONObject4.put("compress", (Object) Boolean.valueOf(booleanValue));
                    o = jSONObject4;
                }
                jSONObject3.put("common", (Object) o);
            }
        }
        String string4 = u55Var.C().getString(SimpleProfile.KEY_SIGNATURE);
        if (string4 != null && !string4.isEmpty()) {
            jSONObject3.put(SimpleProfile.KEY_SIGNATURE, (Object) string4);
        }
        JSONObject jSONObject5 = new JSONObject();
        jSONObject5.put("structure", (Object) u55Var.M());
        JSONObject jSONObject6 = new JSONObject();
        jSONObject6.put("data", (Object) jSONObject2);
        jSONObject6.put("linkage", (Object) jSONObject3);
        jSONObject6.put("hierarchy", (Object) jSONObject5);
        JSONObject u = u55Var.u();
        b(u55Var, u);
        jSONObject6.put(AURASubmitEvent.RPC_ENDPOINT, (Object) u);
        if (iDMComponent != null) {
            jSONObject6.put(x96.PATH_OPERATOR, (Object) iDMComponent.getKey());
            boolean z3 = iDMComponent instanceof DMComponent;
            if (z3) {
                DMComponent dMComponent3 = (DMComponent) iDMComponent;
                if (!TextUtils.isEmpty(dMComponent3.getTriggerEvent())) {
                    jSONObject6.put("operatorEvent", (Object) dMComponent3.getTriggerEvent());
                }
            }
            if (z3 && !TextUtils.isEmpty(iDMComponent.getAdjustOperatorAction())) {
                jSONObject6.put("operatorAction", (Object) iDMComponent.getAdjustOperatorAction());
            }
            if (z3 && iDMComponent.getExtMap().containsKey("subOperator")) {
                jSONObject6.put("subOperator", iDMComponent.getExtMap().get("subOperator"));
            }
            jSONObject6.put("operatorTime", (Object) Long.valueOf(System.currentTimeMillis()));
        }
        return jSONObject6;
    }

    public JSONObject e(u55 u55Var) {
        Map<String, DMComponent> I;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("e311798e", new Object[]{this, u55Var});
        }
        if (u55Var == null || (I = u55Var.I()) == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(I.size());
        for (DMComponent dMComponent : I.values()) {
            if (dMComponent.shouldSubmit()) {
                arrayList.add(dMComponent);
            }
        }
        return d(u55Var, arrayList, null, false);
    }

    @Override // tb.ptd
    public JSONObject a(u55 u55Var, IDMComponent iDMComponent) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("bdca5e2", new Object[]{this, u55Var, iDMComponent});
        }
        if (u55Var == null) {
            return null;
        }
        try {
            Map<String, DMComponent> I = u55Var.I();
            if (I == null) {
                String bizName = u55Var.getBizName();
                ErrorConstants errorConstants = ErrorConstants.SUBMIT_COMPONENT_MAP_NULL;
                lbq.a(bizName, "SubmitModule.asyncRequestData", errorConstants.errorCode(), errorConstants.errorMessage());
                return null;
            }
            HashSet hashSet = new HashSet();
            if (iDMComponent != null) {
                hashSet.add(iDMComponent);
            }
            JSONArray B = u55Var.B();
            if (B != null && !B.isEmpty()) {
                Iterator<Object> it = B.iterator();
                while (it.hasNext()) {
                    String str2 = (String) it.next();
                    if (I.get(str2) != null) {
                        hashSet.add(I.get(str2));
                    }
                }
                return d(u55Var, hashSet, iDMComponent, true);
            }
            return d(u55Var, hashSet, iDMComponent, true);
        } catch (Throwable th) {
            if (TextUtils.isEmpty(u55Var.getBizName())) {
                str = "ultron";
            } else {
                str = u55Var.getBizName();
            }
            lbq.c(str, "SubmitModule.asyncRequestData", th);
            return null;
        }
    }
}
