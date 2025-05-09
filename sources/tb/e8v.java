package tb;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class e8v {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(157286488);
    }

    public void a(JSONObject jSONObject, JSONObject jSONObject2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("135a8109", new Object[]{this, jSONObject, jSONObject2});
        } else if (jSONObject != null && !jSONObject.isEmpty() && jSONObject2 != null) {
            for (Map.Entry<String, Object> entry : jSONObject.entrySet()) {
                entry.setValue(b(jSONObject2, entry.getValue()));
            }
        }
    }

    public final Object b(JSONObject jSONObject, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("a3944a39", new Object[]{this, jSONObject, obj});
        }
        if (obj == null) {
            return null;
        }
        if (obj instanceof String) {
            return qq8.e(jSONObject, (String) obj, false);
        }
        if (obj instanceof JSONObject) {
            JSONObject jSONObject2 = (JSONObject) obj;
            for (Map.Entry<String, Object> entry : jSONObject2.entrySet()) {
                entry.setValue(b(jSONObject, entry.getValue()));
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
                Object b = b(jSONObject, it.next());
                if (b != null) {
                    arrayList.add(b);
                }
            }
            jSONArray2.clear();
            jSONArray2.addAll(arrayList);
            jSONArray = jSONArray2;
        }
        return jSONArray;
    }
}
