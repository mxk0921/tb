package tb;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class aq8 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(295699206);
    }

    public static Object a(JSONObject jSONObject, Object obj, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("e50914b7", new Object[]{jSONObject, obj, new Boolean(z)});
        }
        if (obj == null) {
            return null;
        }
        if (obj instanceof String) {
            return qq8.d(jSONObject, (String) obj);
        }
        if (obj instanceof JSONObject) {
            JSONObject jSONObject2 = (JSONObject) obj;
            for (Map.Entry<String, Object> entry : jSONObject2.entrySet()) {
                entry.setValue(a(jSONObject, entry.getValue(), z));
            }
            return jSONObject2;
        } else if (obj instanceof JSONArray) {
            JSONArray jSONArray = (JSONArray) obj;
            ArrayList arrayList = new ArrayList();
            Iterator<Object> it = jSONArray.iterator();
            while (it.hasNext()) {
                Object a2 = a(jSONObject, it.next(), z);
                if (a2 != null) {
                    arrayList.add(a2);
                }
            }
            jSONArray.clear();
            jSONArray.addAll(arrayList);
            return jSONArray;
        } else if (z) {
            return obj;
        } else {
            return null;
        }
    }
}
