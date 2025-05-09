package tb;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;
import tb.py8;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class ysl {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final Map<String, JSONObject> f32319a = new HashMap(4);

    static {
        t2o.a(487587997);
    }

    public static JSONObject a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("c1963ede", new Object[]{str});
        }
        try {
            JSONObject jSONObject = (JSONObject) ((HashMap) f32319a).get(str);
            if (jSONObject != null) {
                return jSONObject;
            }
            JSONObject parseObject = JSON.parseObject(py8.b.b("home_pass_params", "passParams_" + str, ""));
            if (parseObject != null) {
                if (!parseObject.isEmpty()) {
                    return parseObject;
                }
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void b(String str, JSONObject jSONObject) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec68e9ab", new Object[]{str, jSONObject});
            return;
        }
        ((HashMap) f32319a).put(str, jSONObject);
        String str3 = "passParams_" + str;
        if (jSONObject == null) {
            str2 = "";
        } else {
            str2 = jSONObject.toJSONString();
        }
        py8.b.d("home_pass_params", str3, str2);
    }
}
