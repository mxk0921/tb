package tb;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class kxf {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(442499267);
    }

    public static Map<String, String> a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("d260a3c1", new Object[]{str});
        }
        HashMap hashMap = new HashMap();
        try {
            JSONObject parseObject = JSON.parseObject(str);
            for (String str2 : parseObject.keySet()) {
                Object obj = parseObject.get(str2);
                if (obj == null) {
                    hashMap.put(str2, "");
                } else {
                    hashMap.put(str2, String.valueOf(obj));
                }
            }
        } catch (Throwable unused) {
        }
        return hashMap;
    }

    public static JSONObject b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("3d0dacfd", new Object[]{str});
        }
        if (str == null) {
            return null;
        }
        try {
            return JSON.parseObject(str);
        } catch (Throwable unused) {
            return null;
        }
    }
}
