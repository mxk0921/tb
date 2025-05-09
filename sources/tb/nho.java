package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class nho {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(993001626);
    }

    public static JSONObject a(int i, String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("50c607a9", new Object[]{new Integer(i), str, obj});
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("code", (Object) Integer.valueOf(i));
        if (!TextUtils.isEmpty(str)) {
            jSONObject.put("message", (Object) str);
        }
        if (obj != null) {
            jSONObject.put("data", obj);
        }
        return jSONObject;
    }

    public static JSONObject b(int i, String str, String str2, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("881ab163", new Object[]{new Integer(i), str, str2, obj});
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("jsonrpc", (Object) "2.0");
        jSONObject.put("id", (Object) str);
        jSONObject.put("error", (Object) a(i, str2, obj));
        return jSONObject;
    }

    public static JSONObject c(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("9c0e00b1", new Object[]{str, obj});
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("jsonrpc", (Object) "2.0");
        jSONObject.put("id", (Object) str);
        jSONObject.put("result", obj);
        return jSONObject;
    }
}
