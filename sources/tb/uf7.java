package tb;

import android.util.Log;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class uf7 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(912262483);
    }

    public static <T> ArrayList<T> a(JSONArray jSONArray, zf8<T> zf8Var) {
        T t;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("532652c2", new Object[]{jSONArray, zf8Var});
        }
        if (jSONArray == null) {
            return new ArrayList<>();
        }
        ArrayList<T> arrayList = new ArrayList<>(jSONArray.size());
        Iterator<Object> it = jSONArray.iterator();
        while (it.hasNext()) {
            try {
                t = zf8Var.a(it.next());
            } catch (Throwable th) {
                Log.e("DetailModel", "error", th);
                t = null;
            }
            if (t != null) {
                arrayList.add(t);
            }
        }
        return arrayList;
    }

    public static <V> HashMap<String, V> b(JSONObject jSONObject, zf8<V> zf8Var) {
        String str;
        V v;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("73fe70e9", new Object[]{jSONObject, zf8Var});
        }
        if (jSONObject == null) {
            return new HashMap<>();
        }
        HashMap<String, V> hashMap = new HashMap<>();
        for (Map.Entry<String, Object> entry : jSONObject.entrySet()) {
            try {
                str = entry.getKey();
                v = zf8Var.a(entry.getValue());
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

    public static String c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c8ed2fc4", new Object[]{str});
        }
        if (str == null) {
            return "";
        }
        return str;
    }
}
