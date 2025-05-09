package tb;

import android.text.TextUtils;
import androidx.collection.ArrayMap;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class bwf {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(815793821);
    }

    public static ArrayMap<String, String> a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayMap) ipChange.ipc$dispatch("d19af474", new Object[]{jSONObject});
        }
        ArrayMap<String, String> arrayMap = new ArrayMap<>();
        if (jSONObject == null) {
            b4p.b("JsonParseUtil", "convertJsonToMap：jsonObject为空");
            return arrayMap;
        }
        for (String str : jSONObject.keySet()) {
            String string = jSONObject.getString(str);
            if (string != null) {
                arrayMap.put(str, string);
            }
        }
        return arrayMap;
    }

    public static ArrayMap<String, String> b(JSONObject jSONObject, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayMap) ipChange.ipc$dispatch("fd99e43c", new Object[]{jSONObject, str});
        }
        if (jSONObject == null) {
            b4p.b("JsonParseUtil", "getMapFromJson：jsonObject为空");
            return new ArrayMap<>();
        } else if (TextUtils.isEmpty(str)) {
            b4p.b("JsonParseUtil", "getMapFromJson：key为空");
            return new ArrayMap<>();
        } else {
            try {
                return a(jSONObject.getJSONObject(str));
            } catch (Exception unused) {
                b4p.b("JsonParseUtil", "getMapFromJson：类型错误");
                return new ArrayMap<>();
            }
        }
    }
}
