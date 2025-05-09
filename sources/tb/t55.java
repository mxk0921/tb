package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.model.IDMComponent;
import com.taobao.android.ultron.common.model.LinkageType;
import com.taobao.android.ultron.common.utils.UnifyLog;
import com.taobao.android.ultron.datamodel.imp.DMComponent;
import com.taobao.android.ultron.datamodel.imp.DMEvent;
import com.taobao.android.ultron.datamodel.imp.ExtendBlock;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class t55 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "DMContextAction";

    static {
        t2o.a(83886153);
    }

    public static void b(u55 u55Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7774c63c", new Object[]{u55Var});
            return;
        }
        Map<String, DMComponent> p = u55Var.p();
        JSONArray J = u55Var.J();
        if (J == null) {
            J = new JSONArray();
            u55Var.C().put("request", (Object) J);
        }
        Iterator<Object> it = J.iterator();
        while (it.hasNext()) {
            DMComponent dMComponent = p.get((String) it.next());
            if (dMComponent != null) {
                dMComponent.setLinkageType(LinkageType.REQUEST);
            }
        }
    }

    public static List<IDMComponent> c(u55 u55Var, String str) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("6f3daf3", new Object[]{u55Var, str});
        }
        try {
            List<IDMComponent> h = h(u55Var, str, null);
            if (h == null || h.isEmpty()) {
                UnifyLog.m(u55.LOG_TAG, TAG, "getComponentsByRoot output is empty", "rootComponentKey:" + str);
            } else {
                f6l.g(h);
                b(u55Var);
            }
            return h;
        } catch (Throwable th) {
            if (u55Var == null) {
                str2 = "Ultron";
            } else {
                str2 = u55Var.getBizName();
            }
            lbq.c(str2, "DMComponentUtils.getComponentsByRoot", th);
            return null;
        }
    }

    public static String d(u55 u55Var, String str) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9d3bf22", new Object[]{u55Var, str});
        }
        if (str == null || (jSONObject = u55Var.N().get(str)) == null) {
            return "native";
        }
        return jSONObject.getString("containerType");
    }

    public static boolean e(v55 v55Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6b4b7e08", new Object[]{v55Var})).booleanValue();
        }
        if (v55Var == null) {
            return true;
        }
        return v55Var.i();
    }

    public static gsb f(u55 u55Var, JSONObject jSONObject) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (gsb) ipChange.ipc$dispatch("7909254f", new Object[]{u55Var, jSONObject});
        }
        List<IDMComponent> list = null;
        if (jSONObject == null || jSONObject.isEmpty() || u55Var == null) {
            return null;
        }
        String string = jSONObject.getString("type");
        JSONObject jSONObject2 = jSONObject.getJSONObject("fields");
        if (jSONObject2 == null) {
            str = "";
        } else {
            str = jSONObject2.getString("nextRenderRoot");
        }
        v55 v = u55Var.v();
        if (!TextUtils.isEmpty(str) && e(v)) {
            list = c(u55Var, str);
        }
        return new DMEvent(string, jSONObject2, list, jSONObject.getIntValue("option"));
    }

    public static Map<String, List<gsb>> g(u55 u55Var, JSONObject jSONObject) {
        gsb f;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("296cba8b", new Object[]{u55Var, jSONObject});
        }
        if (jSONObject == null || jSONObject.isEmpty() || u55Var == null) {
            return null;
        }
        HashMap hashMap = new HashMap(jSONObject.size());
        for (Map.Entry<String, Object> entry : jSONObject.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            if (!TextUtils.isEmpty(key) && (value instanceof JSONArray)) {
                JSONArray jSONArray = (JSONArray) value;
                ArrayList arrayList = new ArrayList(jSONArray.size());
                Iterator<Object> it = jSONArray.iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    if ((next instanceof JSONObject) && (f = f(u55Var, (JSONObject) next)) != null) {
                        arrayList.add(f);
                    }
                }
                hashMap.put(key, arrayList);
            }
        }
        return hashMap;
    }

    public static List<IDMComponent> h(u55 u55Var, String str, DMComponent dMComponent) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("9d91efcc", new Object[]{u55Var, str, dMComponent});
        }
        ExtendBlock extendBlock = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        JSONObject r = u55Var.r();
        JSONObject M = u55Var.M();
        JSONObject jSONObject = r != null ? r.getJSONObject(str) : null;
        Map<String, DMComponent> p = u55Var.p();
        Map<String, DMComponent> I = u55Var.I();
        DMComponent dMComponent2 = p.get(str);
        dMComponent2 = (jSONObject == null || u55Var.T("data")) ? dMComponent2 : null;
        if (!u55Var.Q() || jSONObject == null || dMComponent2 == null || !jSONObject.equals(dMComponent2.getData())) {
        }
        if (dMComponent2 == null) {
            try {
                dMComponent2 = a(u55Var, jSONObject, str);
            } catch (Throwable th) {
                UnifyLog.m(u55Var.getBizName(), TAG, "createDMComponent error", th.getMessage());
                if (TextUtils.isEmpty(u55Var.getBizName())) {
                    str2 = "ultron";
                } else {
                    str2 = u55Var.getBizName();
                }
                lbq.c(str2, "DMComponentUtils.resolve", th);
            }
        } else {
            dMComponent2.getChildren().clear();
        }
        if (dMComponent2 != null) {
            dMComponent2.setParent(dMComponent);
            p.put(str, dMComponent2);
            I.put(str, dMComponent2);
        }
        String a2 = f6l.a(dMComponent2, dMComponent);
        String f = f6l.f(dMComponent2, dMComponent);
        if (dMComponent2 != null && dMComponent2.isExtendBlock()) {
            extendBlock = u55Var.w(str);
            if (extendBlock == null) {
                extendBlock = new ExtendBlock(dMComponent2);
                u55Var.J0(str, extendBlock);
            } else {
                extendBlock.updateExtendBlock(dMComponent2);
            }
        }
        JSONArray jSONArray = M.getJSONArray(str);
        if (jSONArray != null) {
            Iterator<Object> it = jSONArray.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if (dMComponent2 != null) {
                    String str3 = (String) next;
                    dMComponent2.setComponentCardGroupTag(a2);
                    dMComponent2.setComponentPosition(f);
                    List<IDMComponent> h = h(u55Var, str3, dMComponent2);
                    if (extendBlock != null) {
                        extendBlock.addBlock(str3, h);
                        extendBlock.addHierarchy(str3, u55Var);
                    }
                    if (h != null) {
                        if (extendBlock == null) {
                            arrayList.addAll(h);
                        }
                        DMComponent dMComponent3 = p.get(str3);
                        if (dMComponent3 != null) {
                            dMComponent2.addChild(dMComponent3);
                        }
                    }
                }
            }
            if (extendBlock != null) {
                arrayList.addAll(extendBlock.getblockComponentList());
            }
        } else if (!(dMComponent2 == null || dMComponent2.getFields() == null)) {
            arrayList.add(dMComponent2);
            dMComponent2.setComponentCardGroupTag(a2);
            dMComponent2.setComponentPosition(f);
        }
        return arrayList;
    }

    public static DMComponent a(u55 u55Var, JSONObject jSONObject, String str) {
        boolean z;
        String[] b;
        String str2;
        String F;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DMComponent) ipChange.ipc$dispatch("7e90a31b", new Object[]{u55Var, jSONObject, str});
        }
        if (jSONObject == null || u55Var == null) {
            return null;
        }
        try {
            F = u55Var.F();
        } catch (Exception e) {
            UnifyLog.m("Ultron-sdk", TAG, "parseComponents exception", e.getMessage());
            if (TextUtils.isEmpty(u55Var.getBizName())) {
                str2 = "ultron";
            } else {
                str2 = u55Var.getBizName();
            }
            lbq.c(str2, "DMComponentUtils.createDMComponent", e);
        }
        if (F != null) {
            z = o1n.a(new BigInteger(F), o1n.FEATURE_TAG_ID);
            if (str != null && z && (b = f6l.b(str)) != null && b.length == 2) {
                jSONObject.put("tag", (Object) b[0]);
                jSONObject.put("id", (Object) b[1]);
            }
            String string = jSONObject.getString("type");
            jSONObject.getString("tag");
            DMComponent dMComponent = new DMComponent(jSONObject, d(u55Var, string), u55Var.N().get(string), g(u55Var, jSONObject.getJSONObject("events")));
            dMComponent.setComponentKey(str);
            return dMComponent;
        }
        z = false;
        if (str != null) {
            jSONObject.put("tag", (Object) b[0]);
            jSONObject.put("id", (Object) b[1]);
        }
        String string2 = jSONObject.getString("type");
        jSONObject.getString("tag");
        DMComponent dMComponent2 = new DMComponent(jSONObject, d(u55Var, string2), u55Var.N().get(string2), g(u55Var, jSONObject.getJSONObject("events")));
        dMComponent2.setComponentKey(str);
        return dMComponent2;
    }
}
