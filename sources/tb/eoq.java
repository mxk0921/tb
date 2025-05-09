package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class eoq {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(982516177);
    }

    public static Map<String, Object> b(String str) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("6dc67d0c", new Object[]{str});
        }
        JSONObject jSONObject = new JSONObject(4);
        if (str != null) {
            str2 = "success";
        } else {
            str2 = "failed";
        }
        jSONObject.put((JSONObject) "result", str2);
        if (str == null) {
            str = "undefined";
        }
        jSONObject.put((JSONObject) "data", str);
        return jSONObject;
    }

    public static Map<String, Object> c(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("6610f0d9", new Object[]{new Long(j)});
        }
        JSONObject jSONObject = new JSONObject(4);
        jSONObject.put((JSONObject) "result", "success");
        jSONObject.put((JSONObject) "data", (String) Long.valueOf(j));
        return jSONObject;
    }

    public static void d(f4x f4xVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("31053e53", new Object[]{f4xVar});
        } else {
            e(f4xVar, "failed", "invalid_param");
        }
    }

    public static Map<String, Object> f(boolean z) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("6682256e", new Object[]{new Boolean(z)});
        }
        JSONObject jSONObject = new JSONObject(4);
        if (z) {
            str = "success";
        } else {
            str = "failed";
        }
        jSONObject.put((JSONObject) "result", str);
        jSONObject.put((JSONObject) "data", "undefined");
        return jSONObject;
    }

    public static Map<String, Object> g(boolean z) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("af031650", new Object[]{new Boolean(z)});
        }
        JSONObject jSONObject = new JSONObject(4);
        if (z) {
            str = "success";
        } else {
            str = "failed";
        }
        jSONObject.put((JSONObject) "result", str);
        jSONObject.put((JSONObject) "data", "undefined");
        return jSONObject;
    }

    public static Map<String, Object> a(List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("27dac889", new Object[]{list});
        }
        if (list == null) {
            list = new ArrayList<>(1);
        }
        JSONObject jSONObject = new JSONObject(4);
        jSONObject.put((JSONObject) "result", "success");
        jSONObject.put((JSONObject) "data", (String) list);
        return jSONObject;
    }

    public static void e(f4x f4xVar, String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("309d1100", new Object[]{f4xVar, str, obj});
        } else if (f4xVar != null) {
            JSONObject jSONObject = new JSONObject(4);
            jSONObject.put((JSONObject) "result", str);
            jSONObject.put((JSONObject) "data", (String) obj);
            f4xVar.b(jSONObject);
        }
    }
}
