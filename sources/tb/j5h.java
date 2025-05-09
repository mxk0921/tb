package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Collection;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class j5h {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(806355499);
    }

    public static boolean a(Object obj, Object obj2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7b37c282", new Object[]{obj, obj2})).booleanValue();
        }
        if (obj == obj2) {
            return true;
        }
        if (obj == null || !obj.equals(obj2)) {
            return false;
        }
        return true;
    }

    public static boolean b(Collection collection) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("90b05181", new Object[]{collection})).booleanValue();
        }
        if (collection == null || collection.isEmpty()) {
            return true;
        }
        return false;
    }

    public static JSONObject c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("bd1e3825", new Object[]{str});
        }
        JSONObject jSONObject = new JSONObject();
        if (!orq.a(str)) {
            try {
                for (String str2 : str.split(",")) {
                    String[] split = str2.split("=");
                    if (2 == split.length) {
                        jSONObject.put(split[0], (Object) split[1]);
                    }
                }
            } catch (Exception unused) {
            }
        }
        return jSONObject;
    }
}
