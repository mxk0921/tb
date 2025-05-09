package tb;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.sku.utils.SkuLogUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class jr8 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(442499264);
    }

    public static Object a(JSONObject jSONObject, List list, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("f54c7f07", new Object[]{jSONObject, list, obj});
        }
        if (cjz.a()) {
            SkuLogUtils.x("ExpressionParser.parseExpression");
        }
        if ((jSONObject == null && list == null) || obj == null) {
            return obj;
        }
        if (jSONObject == null && list.size() < 1) {
            return obj;
        }
        if (obj instanceof String) {
            return pq8.a(jSONObject, list, (String) obj);
        }
        if (obj instanceof JSONObject) {
            JSONObject jSONObject2 = (JSONObject) obj;
            for (Map.Entry<String, Object> entry : jSONObject2.entrySet()) {
                entry.setValue(a(jSONObject, list, entry.getValue()));
            }
            return jSONObject2;
        }
        boolean z = obj instanceof JSONArray;
        JSONArray jSONArray = obj;
        if (z) {
            JSONArray jSONArray2 = (JSONArray) obj;
            ArrayList arrayList = new ArrayList();
            Iterator<Object> it = jSONArray2.iterator();
            while (it.hasNext()) {
                Object a2 = a(jSONObject, list, it.next());
                if (a2 != null) {
                    arrayList.add(a2);
                }
            }
            jSONArray2.clear();
            jSONArray2.addAll(arrayList);
            jSONArray = jSONArray2;
        }
        return jSONArray;
    }
}
