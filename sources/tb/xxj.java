package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class xxj {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(352321705);
    }

    public static <V> HashMap<String, V> a(JSONObject jSONObject, ag8<V> ag8Var) {
        String str;
        V v;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("486378b", new Object[]{jSONObject, ag8Var});
        }
        if (jSONObject == null) {
            return new HashMap<>();
        }
        HashMap<String, V> hashMap = new HashMap<>();
        for (Map.Entry<String, Object> entry : jSONObject.entrySet()) {
            try {
                str = entry.getKey();
                v = ag8Var.a(entry.getValue());
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
