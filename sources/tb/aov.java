package tb;

import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class aov {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(912262562);
    }

    public static String a(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5d96f18d", new Object[]{str, str2, str3});
        }
        return new vnv(str).a(str2, str3).toString();
    }

    public static String b(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ffe650cc", new Object[]{str, map});
        }
        if (map == null) {
            return str;
        }
        String str2 = map.get("id");
        if (str2 != null) {
            str = a(str, "id", str2);
        }
        String jSONString = JSON.toJSONString(map);
        if (jSONString.length() < 512) {
            return a(str, "exParams", jSONString);
        }
        return str;
    }
}
