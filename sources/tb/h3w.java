package tb;

import com.alibaba.security.realidentity.o;
import com.android.alibaba.ip.runtime.IpChange;
import org.json.JSONObject;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class h3w {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(1034944558);
    }

    public static boolean a(JSONObject jSONObject, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fa73859", new Object[]{jSONObject, str})).booleanValue();
        }
        Object opt = jSONObject.opt("l");
        Object opt2 = jSONObject.opt(o.b);
        Object opt3 = jSONObject.opt("r");
        if (opt == null || opt2 == null || opt3 == null) {
            return false;
        }
        if (opt2.equals("&") || opt2.equals("|")) {
            boolean a2 = opt.getClass() == JSONObject.class ? a((JSONObject) opt, str) : false;
            boolean a3 = opt3.getClass() == JSONObject.class ? a((JSONObject) opt3, str) : false;
            return opt2.equals("&") ? a2 && a3 : a2 || a3;
        }
        if (opt.getClass().equals(String.class) && opt.equals("app_ver") && opt3.getClass().equals(String.class)) {
            long d = prl.d(str, 0);
            String str2 = (String) opt3;
            long d2 = prl.d(str2, 0);
            if ("=".equals(opt2)) {
                if (d == d2) {
                    return true;
                }
            } else if (">".equals(opt2)) {
                if (d > d2) {
                    return true;
                }
            } else if ("<".equals(opt2)) {
                if (d < d2) {
                    return true;
                }
            } else if (">=".equals(opt2)) {
                if (d >= d2) {
                    return true;
                }
            } else if ("<=".equals(opt2)) {
                if (d <= d2) {
                    return true;
                }
            } else if ("~=".equals(opt2)) {
                if (str.startsWith(str2)) {
                    return true;
                }
            } else if ("!=".equals(opt2)) {
                if (d != d2) {
                    return true;
                }
            } else if ("!~".equals(opt2) && !str.startsWith(str2)) {
                return true;
            }
        }
        return false;
    }
}
