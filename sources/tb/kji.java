package tb;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.alibaba.ability.hub.AbilityHubAdapter;
import com.alibaba.ability.result.ExecuteResult;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.data.meta.Item;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class kji {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String PARAMS_ITEM_ID = "itemId";
    public static final String PARAMS_POP_ID = "popId";
    public static final String PARAMS_URL = "url";

    static {
        t2o.a(912262814);
    }

    public static Map<String, String> a(ze7 ze7Var, String str) {
        Item item;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("88e45f51", new Object[]{ze7Var, str});
        }
        HashMap hashMap = new HashMap();
        hashMap.put("token", ze7Var.i().b());
        hashMap.put("bizId", "tbDetail");
        hashMap.put("popId", str);
        hashMap.put("itemId", ze7Var.i().c("requestItemId"));
        if (vbl.b() && (item = (Item) ze7Var.e().f(Item.class)) != null) {
            hashMap.put("subItemId", item.getSubItemId());
        }
        return hashMap;
    }

    public static JSONObject b(ze7 ze7Var, String str, String str2, String str3, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("ab3b2ff0", new Object[]{ze7Var, str, str2, str3, jSONObject});
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("popId", (Object) str2);
        jSONObject2.put("bizId", (Object) "tbDetail");
        if (!TextUtils.isEmpty(str3)) {
            JSONObject parseObject = JSON.parseObject(str3);
            if (nj7.i(ze7Var.c())) {
                parseObject.put("maxHeight", (Object) "1.0");
                parseObject.put("maxWidth", (Object) "0.5");
            }
            jSONObject2.put(h9.KEY_POP_CONFIG, (Object) parseObject);
        }
        JSONObject jSONObject3 = new JSONObject();
        Map<String, String> a2 = a(ze7Var, str2);
        if (vbl.G()) {
            str = jov.a(str, a2);
        } else {
            jSONObject3.putAll(a2);
            jSONObject2.put("queryParams", (Object) jSONObject3);
        }
        jSONObject2.put("url", (Object) str);
        if (jSONObject != null) {
            jSONObject2.putAll(jSONObject);
        }
        return jSONObject2;
    }

    public static ExecuteResult c(Context context, View view, String str, String str2, JSONObject jSONObject, s2d s2dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ExecuteResult) ipChange.ipc$dispatch("c97b7243", new Object[]{context, view, str, str2, jSONObject, s2dVar});
        }
        return new AbilityHubAdapter(new zq("detail", "detail").a(context)).z(str, str2, new xq().p(view), jSONObject, s2dVar);
    }
}
