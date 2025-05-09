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
public class vf7 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(706740232);
    }

    public static <T> ArrayList<T> a(JSONArray jSONArray, bg8<T> bg8Var) {
        T t;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("636bbdaa", new Object[]{jSONArray, bg8Var});
        }
        if (jSONArray == null) {
            return new ArrayList<>();
        }
        ArrayList<T> arrayList = new ArrayList<>(jSONArray.size());
        Iterator<Object> it = jSONArray.iterator();
        while (it.hasNext()) {
            try {
                t = bg8Var.a(it.next());
            } catch (Throwable unused) {
                t = null;
            }
            if (t != null) {
                arrayList.add(t);
            }
        }
        return arrayList;
    }

    public static <V> HashMap<String, V> b(JSONObject jSONObject, bg8<V> bg8Var) {
        String str;
        V v;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("6cc26c55", new Object[]{jSONObject, bg8Var});
        }
        if (jSONObject == null) {
            return new HashMap<>();
        }
        HashMap<String, V> hashMap = new HashMap<>();
        for (Map.Entry<String, Object> entry : jSONObject.entrySet()) {
            try {
                str = entry.getKey();
                v = bg8Var.a(entry.getValue());
            } catch (Throwable unused) {
                str = null;
                v = null;
            }
            if (v != null) {
                hashMap.put(str, v);
            }
        }
        return hashMap;
    }
}
