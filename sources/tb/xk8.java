package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class xk8 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(404750491);
    }

    public static List<y7d> a(JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("359c4248", new Object[]{jSONArray});
        }
        if (jSONArray == null || jSONArray.size() <= 0) {
            return null;
        }
        if (jSONArray.size() == 1) {
            return Collections.singletonList(jvl.a(jSONArray.getString(0)));
        }
        ArrayList arrayList = new ArrayList(jSONArray.size());
        Iterator<Object> it = jSONArray.iterator();
        while (it.hasNext()) {
            arrayList.add(jvl.a((String) it.next()));
        }
        return arrayList;
    }

    public static Map<String, List<y7d>> b(JSONObject jSONObject) {
        JSONArray jSONArray;
        List<y7d> a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("bf21234", new Object[]{jSONObject});
        }
        if (jSONObject == null || jSONObject.size() <= 0) {
            return null;
        }
        if (jSONObject.size() == 1) {
            String next = jSONObject.keySet().iterator().next();
            return Collections.singletonMap(next, a(jSONObject.getJSONArray(next)));
        }
        HashMap hashMap = new HashMap();
        for (Map.Entry<String, Object> entry : jSONObject.entrySet()) {
            if (!TextUtils.isEmpty(entry.getKey()) && (jSONArray = (JSONArray) entry.getValue()) != null && jSONArray.size() > 0 && (a2 = a(jSONArray)) != null && a2.size() > 0) {
                hashMap.put(entry.getKey(), a2);
            }
        }
        return hashMap;
    }

    public static boolean c(List<y7d> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cf56a55f", new Object[]{list})).booleanValue();
        }
        if (list == null || list.size() <= 0) {
            return true;
        }
        return false;
    }

    public static boolean d(Map<String, List<y7d>> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("caa5c045", new Object[]{map})).booleanValue();
        }
        if (map == null || map.size() <= 0) {
            return true;
        }
        return false;
    }

    public static boolean e(List<y7d> list, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("902c016b", new Object[]{list, str})).booleanValue();
        }
        for (y7d y7dVar : list) {
            if (y7dVar != null && y7dVar.match(str)) {
                return true;
            }
        }
        return false;
    }
}
