package tb;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class wr8 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(81789096);
        }
    }

    static {
        t2o.a(81789095);
    }

    public static Object a(JSONObject jSONObject, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("a3944a39", new Object[]{jSONObject, obj});
        }
        return b(jSONObject, obj, null);
    }

    public static Object b(JSONObject jSONObject, Object obj, a... aVarArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("b31a6761", new Object[]{jSONObject, obj, aVarArr});
        }
        if ((jSONObject == null && aVarArr == null) || obj == null) {
            return obj;
        }
        if (obj instanceof String) {
            String str = (String) obj;
            Object d = nq8.d(jSONObject, str);
            if (str.startsWith("$") && str.equals(d) && aVarArr != null) {
                for (a aVar : aVarArr) {
                }
            }
            return d;
        } else if (obj instanceof JSONObject) {
            JSONObject jSONObject2 = (JSONObject) obj;
            for (Map.Entry<String, Object> entry : jSONObject2.entrySet()) {
                entry.setValue(b(jSONObject, entry.getValue(), aVarArr));
            }
            return jSONObject2;
        } else {
            boolean z = obj instanceof JSONArray;
            JSONArray jSONArray = obj;
            if (z) {
                JSONArray jSONArray2 = (JSONArray) obj;
                ArrayList arrayList = new ArrayList();
                Iterator<Object> it = jSONArray2.iterator();
                while (it.hasNext()) {
                    Object b = b(jSONObject, it.next(), aVarArr);
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
}
