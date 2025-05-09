package tb;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class dt4 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public interface a<T> {
        T a(Object obj);
    }

    static {
        t2o.a(912262760);
    }

    public static <T> ArrayList<T> a(JSONArray jSONArray, a<T> aVar) {
        T t;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("50afacf3", new Object[]{jSONArray, aVar});
        }
        if (jSONArray == null) {
            return null;
        }
        ArrayList<T> arrayList = new ArrayList<>(jSONArray.size());
        Iterator<Object> it = jSONArray.iterator();
        while (it.hasNext()) {
            try {
                t = aVar.a(it.next());
            } catch (Throwable unused) {
                t = null;
            }
            if (t != null) {
                arrayList.add(t);
            }
        }
        return arrayList;
    }

    public static <V> Map<String, V> b(JSONObject jSONObject, a<V> aVar) {
        V v;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("11e867b0", new Object[]{jSONObject, aVar});
        }
        if (jSONObject == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        for (Map.Entry<String, Object> entry : jSONObject.entrySet()) {
            String key = entry.getKey();
            try {
                v = aVar.a(entry.getValue());
            } catch (Throwable unused) {
                v = null;
            }
            if (v != null) {
                hashMap.put(key, v);
            }
        }
        return hashMap;
    }
}
