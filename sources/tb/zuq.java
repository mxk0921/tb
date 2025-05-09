package tb;

import android.os.Bundle;
import android.text.TextUtils;
import com.alibaba.android.icart.core.data.model.CartGlobal;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.model.IDMComponent;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class zuq {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String BUY_PARAM = "buyParam";
    public static final String CARTIDS = "cartIds";
    public static final String PURCHASE_FROM = "purchase_from";
    public static final int PURCHASE_FROM_CART = 1;

    static {
        t2o.a(479199548);
    }

    public static HashMap<String, Object> b(fsb fsbVar, wd3 wd3Var, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("9c68b3a0", new Object[]{fsbVar, wd3Var, str});
        }
        HashMap<String, Object> hashMap = new HashMap<>();
        if (f(fsbVar)) {
            hashMap.put("buyParam", wd3Var.e());
            hashMap.put("isSettlementAlone", "true");
        } else {
            hashMap.put("cartIds", wd3Var.b());
        }
        if (str != null) {
            hashMap.put("exParams", "{\"novad\":\"" + str + "\"}");
        }
        return hashMap;
    }

    public static JSONObject c(zxb zxbVar, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("11ae02b2", new Object[]{zxbVar, new Boolean(z), new Boolean(z2)});
        }
        JSONObject jSONObject = new JSONObject();
        JSONObject m = sca.m(zxbVar);
        if (z) {
            jSONObject.put("cartIsLoading", (Object) Boolean.valueOf(z));
        }
        if (z2) {
            jSONObject.put("cartIsLocalCalculate", (Object) Boolean.valueOf(z2));
        }
        if (!(m == null || m.getString("traceId") == null)) {
            jSONObject.put("cartTraceId", (Object) m.getString("traceId"));
        }
        JSONObject c = sca.c(zxbVar);
        if (c != null) {
            jSONObject.putAll(c);
        }
        return jSONObject;
    }

    public static String d(String str, CartGlobal.ControlParas controlParas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1e012d0f", new Object[]{str, controlParas});
        }
        JSONObject orderByH5Urls = controlParas.getOrderByH5Urls();
        if (orderByH5Urls != null) {
            return orderByH5Urls.getString(str);
        }
        return null;
    }

    public static String e(String str, CartGlobal.ControlParas controlParas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9db72605", new Object[]{str, controlParas});
        }
        JSONObject orderByNative = controlParas.getOrderByNative();
        if (orderByNative != null) {
            return orderByNative.getString(str);
        }
        return null;
    }

    public static boolean f(fsb fsbVar) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("da2bcdad", new Object[]{fsbVar})).booleanValue();
        }
        if (vav.a(c9x.CART_BIZ_NAME, "forceIsSettlementAloneToTrue", true)) {
            return true;
        }
        if (fsbVar == null || fsbVar.i() == null || (jSONObject = fsbVar.i().getJSONObject("controlParas")) == null || !jSONObject.containsKey("isSettlementAlone")) {
            return false;
        }
        return jSONObject.getBoolean("isSettlementAlone").booleanValue();
    }

    public static boolean h(List<IDMComponent> list, zxb zxbVar) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ca4a650c", new Object[]{list, zxbVar})).booleanValue();
        }
        if (list.size() > sca.n(zxbVar)) {
            z = false;
        }
        if (z) {
            for (IDMComponent iDMComponent : list) {
                z = g(iDMComponent);
            }
        }
        return z;
    }

    public static jd3 i(zxb zxbVar, List<IDMComponent> list) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jd3) ipChange.ipc$dispatch("dd4b1600", new Object[]{zxbVar, list});
        }
        jd3 jd3Var = new jd3();
        jd3Var.f(false);
        CartGlobal w = zxbVar.w();
        if (w == null) {
            return jd3Var;
        }
        CartGlobal.ControlParas controlParas = w.getControlParas();
        if (!(controlParas == null || (controlParas.getOrderByH5Urls() == null && controlParas.getOrderByNative() == null))) {
            HashSet hashSet = new HashSet();
            if (list == null) {
                return jd3Var;
            }
            Iterator<IDMComponent> it = list.iterator();
            jd3 jd3Var2 = null;
            while (true) {
                if (it.hasNext()) {
                    IDMComponent next = it.next();
                    if (next != null) {
                        String str = (String) cb4.x(next, String.class, "exclude");
                        if (!TextUtils.isEmpty(str)) {
                            String d = d(str, controlParas);
                            String e = e(str, controlParas);
                            jd3 jd3Var3 = new jd3();
                            jd3Var3.f(false);
                            if (!(d == null && e == null)) {
                                jd3Var3.f(true);
                                jd3Var3.d(e);
                                jd3Var3.e(d);
                                jd3Var2 = jd3Var3;
                            }
                            if (hashSet.size() > 0 && !hashSet.contains(jd3Var3)) {
                                z = false;
                                break;
                            }
                            hashSet.add(jd3Var3);
                        } else {
                            continue;
                        }
                    }
                } else {
                    break;
                }
            }
            if (z) {
                if (jd3Var2 == null) {
                    return jd3Var;
                }
                return jd3Var2;
            }
        }
        return jd3Var;
    }

    public static Bundle a(fsb fsbVar, wd3 wd3Var, String str, JSONObject jSONObject) {
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bundle) ipChange.ipc$dispatch("24c7686f", new Object[]{fsbVar, wd3Var, str, jSONObject});
        }
        Bundle bundle = new Bundle();
        HashMap<String, Object> b = b(fsbVar, wd3Var, str);
        if (jSONObject != null) {
            Object obj = b.get("exParams");
            if (obj instanceof String) {
                jSONObject2 = JSON.parseObject((String) obj);
            } else {
                jSONObject2 = new JSONObject();
            }
            jSONObject2.putAll(jSONObject);
            b.put("exParams", jSONObject2.toJSONString());
        }
        bundle.putSerializable("buildOrderParams", b);
        bundle.putInt("purchase_from", 1);
        if (!TextUtils.isEmpty(wd3Var.c())) {
            bundle.putString("PRELOAD", wd3Var.c());
        }
        if (wd3Var.f()) {
            bundle.putString("pageType", "float");
            bundle.putString("openFrom", "carts");
        }
        return bundle;
    }

    public static boolean g(IDMComponent iDMComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcccff3", new Object[]{iDMComponent})).booleanValue();
        }
        return (iDMComponent == null || iDMComponent.getFields() == null || !iDMComponent.getFields().getBooleanValue("supportModalBuy")) ? false : true;
    }
}
