package tb;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.StringTokenizer;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class lr8 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(487587971);
    }

    public static Object a(Object obj, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("f669ebca", new Object[]{obj, str});
        }
        if (!(obj == null || str == null)) {
            if (obj instanceof JSONObject) {
                return ((JSONObject) obj).get(str);
            }
            if (obj instanceof JSONArray) {
                try {
                    return ((JSONArray) obj).get(Integer.parseInt(str));
                } catch (Exception e) {
                    i65.b("ExpressionParser", "ExpressionParser list index is not number", e);
                }
            }
        }
        return null;
    }

    public static Object b(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("acbcdf66", new Object[]{str, obj});
        }
        StringTokenizer stringTokenizer = new StringTokenizer(str, " .[]", false);
        while (stringTokenizer.hasMoreTokens()) {
            obj = a(obj, stringTokenizer.nextToken());
        }
        return obj;
    }
}
