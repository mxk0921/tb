package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.data.meta.Feature;
import com.taobao.android.detail.ttdetail.data.meta.Item;
import com.taobao.android.detail.ttdetail.request.callback.MainRequestCallback;
import com.taobao.android.detail.ttdetail.request.params.MainRequestParams;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class ywk {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(912262822);
    }

    public static Feature a(jns jnsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Feature) ipChange.ipc$dispatch("8c673e29", new Object[]{jnsVar});
        }
        if (jnsVar == null) {
            return null;
        }
        return (Feature) jnsVar.t(Feature.class);
    }

    public static Map<String, String> b(JSONObject jSONObject) {
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("8a4f4cc1", new Object[]{jSONObject});
        }
        if (jSONObject == null) {
            return null;
        }
        String string = jSONObject.getJSONObject("item").getString("itemId");
        JSONObject jSONObject3 = jSONObject.getJSONObject("skuCore");
        String str = "";
        String string2 = (jSONObject3 == null || (jSONObject2 = jSONObject3.getJSONObject("skuItem")) == null) ? str : jSONObject2.getString(q2q.KEY_SKU_ID);
        HashMap hashMap = new HashMap();
        hashMap.put("item_id", string);
        hashMap.put("id", string);
        hashMap.put("detail_item_id", string);
        if (string2 != null) {
            str = string2;
        }
        hashMap.put(q2q.KEY_SKU_ID, str);
        return hashMap;
    }

    public static String c(ze7 ze7Var, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d2e63fcd", new Object[]{ze7Var, str});
        }
        if (vbl.v()) {
            return str;
        }
        if (ze7Var == null) {
            return str;
        }
        jns jnsVar = (jns) ze7Var.e().e(kns.PARSER_ID);
        boolean g = g(jnsVar);
        boolean i = i(jnsVar);
        if (!g || i) {
            return str;
        }
        String d = d(jnsVar);
        if (!TextUtils.isEmpty(d) || !TextUtils.equals(str, d)) {
            return d;
        }
        return str;
    }

    public static String d(jns jnsVar) {
        Item item;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a4581f79", new Object[]{jnsVar});
        }
        if (jnsVar == null || (item = (Item) jnsVar.t(Item.class)) == null) {
            return null;
        }
        return item.getPlatformItemId();
    }

    public static String e(jns jnsVar) {
        Item item;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("263d61da", new Object[]{jnsVar});
        }
        if (jnsVar == null || (item = (Item) jnsVar.t(Item.class)) == null) {
            return null;
        }
        return item.getSubItemId();
    }

    public static void f(JSONObject jSONObject, MainRequestParams mainRequestParams, owc owcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1bbbdcc", new Object[]{jSONObject, mainRequestParams, owcVar});
        } else if (mainRequestParams != null && owcVar != null) {
            String itemId = mainRequestParams.getItemId();
            Map<String, String> b = b(jSONObject);
            mainRequestParams.updateRefreshParams(b);
            new y0i(mainRequestParams).q(new MainRequestCallback(mainRequestParams, owcVar)).c();
            j(itemId, b);
        }
    }

    public static boolean g(jns jnsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("358620f", new Object[]{jnsVar})).booleanValue();
        }
        Feature a2 = a(jnsVar);
        if (a2 == null || !a2.isOneProductMM()) {
            return false;
        }
        return true;
    }

    public static boolean i(jns jnsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3ab5223f", new Object[]{jnsVar})).booleanValue();
        }
        Feature a2 = a(jnsVar);
        if (a2 == null || !a2.isOneProductMMDegrade()) {
            return false;
        }
        return true;
    }

    public static void j(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e7963c1", new Object[]{str, map});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("platformItemId", str);
        if (map != null && !map.isEmpty()) {
            hashMap.putAll(map);
        }
        bw7.b(hashMap, -300015, "一品多商降级");
    }

    public static boolean h(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e4f69a0a", new Object[]{jSONObject})).booleanValue();
        }
        if (jSONObject == null) {
            return false;
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("feature");
        JSONObject jSONObject3 = jSONObject.getJSONObject("item");
        if (jSONObject2 == null || jSONObject3 == null) {
            return false;
        }
        return jSONObject2.getBooleanValue("oneProductMM") && jSONObject2.getBooleanValue("oneProductMMDegrade") && !TextUtils.isEmpty(jSONObject3.getString("itemId"));
    }
}
