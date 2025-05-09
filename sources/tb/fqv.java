package tb;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.TypeReference;
import com.alibaba.fastjson.parser.Feature;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class fqv {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class a extends TypeReference<Map<String, String>> {
    }

    static {
        t2o.a(491782864);
    }

    public static Map<String, String> a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("8a101e92", new Object[]{jSONObject});
        }
        if (jSONObject == null) {
            return new HashMap();
        }
        return (Map) JSON.parseObject(jSONObject.toJSONString(), new a(), new Feature[0]);
    }

    public static String[] b(JSONObject jSONObject) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("133ef0c0", new Object[]{jSONObject});
        }
        if (jSONObject == null || jSONObject.size() == 0) {
            return null;
        }
        String[] strArr = new String[jSONObject.size()];
        for (String str : jSONObject.keySet()) {
            String string = jSONObject.getString(str);
            if (string != null) {
                strArr[i] = str + "=" + string;
                i++;
            }
        }
        return strArr;
    }
}
