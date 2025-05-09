package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* compiled from: Taobao */
@Deprecated
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class fxf {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(806356593);
    }

    public static Map<String, String> a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("462d3410", new Object[]{jSONObject});
        }
        return m3s.b(jSONObject);
    }

    public static Map<String, String> b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("bf456ef4", new Object[]{str});
        }
        return m3s.c(str);
    }

    public static Map<String, Object> c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("51d47f5f", new Object[]{str});
        }
        return m3s.e(str);
    }
}
