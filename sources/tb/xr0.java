package tb;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import java.util.regex.Pattern;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class xr0 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(301989955);
    }

    public static yr0 a(Map<String, Object> map, JSONArray jSONArray, JSONArray jSONArray2, JSONArray jSONArray3) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (yr0) ipChange.ipc$dispatch("66c98fbe", new Object[]{map, jSONArray, jSONArray2, jSONArray3});
        }
        for (int i = 0; i < jSONArray.size(); i++) {
            Object obj = jSONArray.get(i);
            Object obj2 = jSONArray3.get(i);
            Object obj3 = jSONArray2.get(i);
            if ((obj instanceof String) && (obj2 instanceof String) && (obj3 instanceof String)) {
                Object obj4 = map.get(obj);
                if (obj4 == null) {
                    return new yr0(false, (String) obj3);
                }
                if (!(obj4 instanceof String)) {
                    str = obj4.toString();
                } else {
                    str = (String) obj4;
                }
                if (!c((String) obj2, str)) {
                    return new yr0(false, (String) obj3);
                }
            }
        }
        return yr0.a();
    }

    public static JSONObject b(Object obj) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("379ad54f", new Object[]{obj});
        }
        if (!(obj instanceof JSONObject) || (jSONObject = ((JSONObject) obj).getJSONObject("linkage")) == null) {
            return null;
        }
        return jSONObject.getJSONObject("validate");
    }

    public static boolean c(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("11234ac7", new Object[]{str, str2})).booleanValue();
        }
        try {
            return Pattern.compile(str).matcher(str2).find();
        } catch (Throwable unused) {
            return false;
        }
    }

    public static yr0 d(Map<String, Object> map, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (yr0) ipChange.ipc$dispatch("eaa2c56", new Object[]{map, jSONObject});
        }
        if (map == null) {
            ck.g().d("inputFields is null !!");
            return yr0.a();
        } else if (jSONObject == null) {
            ck.g().d("validate is null !!");
            return yr0.a();
        } else {
            JSONArray jSONArray = jSONObject.getJSONArray("fields");
            if (bh.a(jSONArray)) {
                ck.g().d("fields is null !!");
                return yr0.a();
            }
            JSONArray jSONArray2 = jSONObject.getJSONArray("regex");
            if (bh.a(jSONArray2)) {
                ck.g().d("regs is null !!");
                return yr0.a();
            }
            JSONArray jSONArray3 = jSONObject.getJSONArray("msg");
            if (bh.a(jSONArray3)) {
                ck.g().d("msg is null !!");
                return yr0.a();
            } else if (jSONArray.size() == jSONArray2.size() && jSONArray2.size() == jSONArray3.size()) {
                return a(map, jSONArray, jSONArray3, jSONArray2);
            } else {
                ck.g().d("fields msg regs size is not equal !!");
                return yr0.a();
            }
        }
    }
}
