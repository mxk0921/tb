package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.Globals;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class rrs {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(729810406);
    }

    public static String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("49623dfc", new Object[0]);
        }
        return "home_" + b();
    }

    public static String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("160cc5d6", new Object[0]);
        }
        if (kbq.e(Globals.getApplication())) {
            return xti.AREA_OVERSEA;
        }
        return xti.AREA_MAINLAND;
    }

    public static String c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f400272a", new Object[]{str});
        }
        if (!TextUtils.equals("home", str)) {
            return str;
        }
        return a();
    }

    public static String d(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fb2be66", new Object[]{str, jSONObject});
        }
        if (TextUtils.equals("home", str) && jSONObject != null) {
            return a();
        }
        fve.e("TabTypeUtils", "getTransformSubTabType subTabType : " + str);
        return str;
    }

    public static String e(JSONObject jSONObject) {
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3ad58027", new Object[]{jSONObject});
        }
        if (jSONObject == null || jSONObject.isEmpty() || (jSONObject2 = jSONObject.getJSONObject("content")) == null) {
            return null;
        }
        return d(jSONObject2.getString("type"), jSONObject2);
    }

    public static boolean f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bf4ce7c2", new Object[]{str})).booleanValue();
        }
        for (String str2 : xti.HOME_MICROSERVICES_RECOMMEND_TAB_IDS) {
            if (str2.equals(str)) {
                return true;
            }
        }
        return false;
    }

    public static String g(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d04bcde1", new Object[]{str});
        }
        if (!f(str)) {
            return str;
        }
        return "home";
    }
}
