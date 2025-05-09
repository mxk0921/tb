package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.List;
import tb.g5a;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class j5a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(475004937);
    }

    public static Object a(String str, Object obj, i5a i5aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("26d19943", new Object[]{str, obj, i5aVar});
        }
        return e5a.b(str, new g5a.b().i(obj).h(i5aVar).g(f5a.a()).f());
    }

    public static void b(List list, Object obj, i5a i5aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88b19c54", new Object[]{list, obj, i5aVar});
        } else if (list != null) {
            HashMap hashMap = new HashMap();
            for (Object obj2 : list) {
                if (obj2 instanceof JSONObject) {
                    c((JSONObject) obj2, obj, i5aVar);
                } else if (obj2 instanceof List) {
                    b((List) obj2, obj, i5aVar);
                } else if (obj2 instanceof String) {
                    hashMap.put(obj2, a((String) obj2, obj, i5aVar));
                }
            }
            if (!hashMap.isEmpty()) {
                for (Object obj3 : hashMap.keySet()) {
                    int indexOf = list.indexOf(obj3);
                    if (indexOf >= 0) {
                        list.set(indexOf, hashMap.get(obj3));
                    }
                }
            }
        }
    }

    public static void c(JSONObject jSONObject, Object obj, i5a i5aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("630b5692", new Object[]{jSONObject, obj, i5aVar});
        } else if (jSONObject != null) {
            HashMap hashMap = new HashMap();
            for (String str : jSONObject.keySet()) {
                Object obj2 = jSONObject.get(str);
                if (obj2 instanceof JSONObject) {
                    c((JSONObject) obj2, obj, i5aVar);
                } else if (obj2 instanceof List) {
                    b((List) obj2, obj, i5aVar);
                } else if (obj2 instanceof String) {
                    hashMap.put(str, a((String) obj2, obj, i5aVar));
                }
            }
            if (!hashMap.isEmpty()) {
                jSONObject.putAll(hashMap);
            }
        }
    }
}
