package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Arrays;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class ib1 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(729809032);
    }

    public static JSONObject a(String[] strArr, String str, JSONObject jSONObject) {
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("833e5043", new Object[]{strArr, str, jSONObject});
        }
        Object k = a3b.k(jSONObject, str);
        if (!(k instanceof JSONObject)) {
            return null;
        }
        JSONObject jSONObject3 = (JSONObject) k;
        JSONObject jSONObject4 = new JSONObject();
        for (int length = strArr.length - 1; length > 0; length--) {
            Object k2 = a3b.k(jSONObject, TextUtils.join(".", Arrays.copyOf(strArr, length)));
            if (k2 instanceof JSONObject) {
                JSONObject jSONObject5 = (JSONObject) k2;
                if (jSONObject5.containsKey("commonArgs") && (jSONObject2 = jSONObject5.getJSONObject("commonArgs")) != null) {
                    jSONObject4.putAll(jSONObject2);
                }
            }
        }
        JSONObject jSONObject6 = jSONObject3.getJSONObject("args");
        if (jSONObject6 != null) {
            jSONObject4.putAll(jSONObject6);
        }
        jSONObject3.put("args", (Object) jSONObject4);
        return jSONObject3;
    }
}
