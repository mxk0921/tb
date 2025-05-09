package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class lxf {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(467664982);
    }

    public static Map<String, Object> a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("f6cb709a", new Object[]{jSONObject});
        }
        HashMap hashMap = new HashMap();
        if (jSONObject == null) {
            return hashMap;
        }
        try {
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                Object opt = jSONObject.opt(next);
                if (opt instanceof JSONObject) {
                    hashMap.put(next, a((JSONObject) opt));
                } else if (opt instanceof JSONArray) {
                    hashMap.put(next, b((JSONArray) opt));
                } else {
                    hashMap.put(next, opt);
                }
            }
        } catch (Exception unused) {
        }
        return hashMap;
    }

    public static List<Object> b(JSONArray jSONArray) throws JSONException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("bee424ad", new Object[]{jSONArray});
        }
        if (jSONArray == null) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList(jSONArray.length());
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            Object obj = jSONArray.get(i);
            if (obj instanceof JSONObject) {
                arrayList.add(a((JSONObject) obj));
            } else if (obj instanceof JSONArray) {
                arrayList.add(b((JSONArray) obj));
            } else {
                arrayList.add(jSONArray.get(i));
            }
        }
        return arrayList;
    }
}
