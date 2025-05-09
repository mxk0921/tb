package tb;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.vessel.utils.VesselType;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class uyv {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String DOWN_GRADE = "downgrade_url";
    public static final String HTTPS_SCHEMA = "https:";
    public static final String NATIVE = "vessel";
    public static final String WH_WEEX = "wh_weex";
    public static final String WH_WEEX_TRUE = "wh_weex=true";
    public static final String WX_TPL = "_wx_tpl";

    /* renamed from: a  reason: collision with root package name */
    public static final AtomicInteger f29684a = new AtomicInteger(2000);

    static {
        t2o.a(967835673);
    }

    public static String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1ffa6453", new Object[]{str});
        }
        if (TextUtils.isEmpty(str)) {
            return f4w.DEFAULT_URL;
        }
        Uri parse = Uri.parse(str);
        if (!TextUtils.isEmpty(parse.getQueryParameter(WX_TPL))) {
            Uri.Builder buildUpon = Uri.parse(parse.getQueryParameter(WX_TPL)).buildUpon();
            Set<String> queryParameterNames = parse.getQueryParameterNames();
            if (queryParameterNames != null && queryParameterNames.size() > 0) {
                for (String str2 : queryParameterNames) {
                    if (!WX_TPL.equals(str2)) {
                        buildUpon.appendQueryParameter(str2, parse.getQueryParameter(str2));
                    }
                }
            }
            return buildUpon.toString();
        } else if (TextUtils.equals("true", parse.getQueryParameter("wh_weex"))) {
            return parse.toString();
        } else {
            return null;
        }
    }

    public static boolean b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7f0ad042", new Object[]{context})).booleanValue();
        }
        if (context == null || !(context instanceof Activity)) {
            return true;
        }
        Activity activity = (Activity) context;
        if (!activity.isFinishing() && !activity.isDestroyed()) {
            return false;
        }
        return true;
    }

    public static boolean c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2892091a", new Object[]{str})).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return !TextUtils.isEmpty(Uri.parse(str).getScheme());
    }

    public static boolean d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8da1acb", new Object[]{str})).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (!c(str)) {
            str = q(str);
        }
        Uri parse = Uri.parse(str);
        if ("http".equals(parse.getScheme()) || "https".equals(parse.getScheme())) {
            return true;
        }
        return false;
    }

    public static boolean g(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4aead19e", new Object[]{str, str2})).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        Uri parse = Uri.parse(str);
        if (parse.isHierarchical()) {
            return !TextUtils.isEmpty(parse.getQueryParameter(str2));
        }
        return false;
    }

    public static void h(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b7b6a10", new Object[]{str, str2});
        } else {
            AppMonitor.Alarm.commitFail("vessel", "vessel", str, str2);
        }
    }

    public static int i() {
        AtomicInteger atomicInteger;
        int i;
        int i2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6ed9c66f", new Object[0])).intValue();
        }
        do {
            atomicInteger = f29684a;
            i = atomicInteger.get();
            i2 = i + 1;
            if (i2 > 16777215) {
                i2 = 1;
            }
        } while (!atomicInteger.compareAndSet(i, i2));
        return i;
    }

    public static String j(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e22b76ac", new Object[]{str});
        }
        if (str == null) {
            return str;
        }
        Uri parse = Uri.parse(str);
        if (parse != null) {
            return parse.getHost();
        }
        return null;
    }

    public static String k(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("396f7022", new Object[]{str});
        }
        if (str == null) {
            return str;
        }
        Uri parse = Uri.parse(str);
        if (parse != null) {
            return parse.getQueryParameter("classname");
        }
        return null;
    }

    public static String l(Map<String, Object> map) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("18255886", new Object[]{map});
        }
        if (map == null || map.isEmpty()) {
            str = "";
        } else {
            str = (String) map.get("bundleUrl");
        }
        return TextUtils.isEmpty(str) ? f4w.DEFAULT_URL : str;
    }

    public static VesselType m(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (VesselType) ipChange.ipc$dispatch("fe609b2d", new Object[]{str});
        }
        if (f(str)) {
            return VesselType.Weex;
        }
        if (d(str)) {
            return VesselType.Web;
        }
        if (e(str)) {
            return VesselType.Native;
        }
        return VesselType.Web;
    }

    public static String n(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3f8022d1", new Object[]{str});
        }
        if (str == null) {
            return str;
        }
        if (f(str)) {
            return a(str);
        }
        return str;
    }

    public static String o(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8eb71975", new Object[]{obj});
        }
        if (obj == null) {
            return f4w.DEFAULT_URL;
        }
        Map hashMap = new HashMap();
        if (obj instanceof Map) {
            hashMap = (Map) obj;
        }
        JSONObject jSONObject = new JSONObject();
        for (String str : hashMap.keySet()) {
            jSONObject.put(str, hashMap.get(str));
        }
        return JSON.toJSONString(jSONObject);
    }

    public static String p(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a0eb07e2", new Object[]{str});
        }
        if (!g(str, DOWN_GRADE)) {
            return null;
        }
        Uri parse = Uri.parse(str);
        Uri.Builder buildUpon = Uri.parse(parse.getQueryParameter(DOWN_GRADE)).buildUpon();
        Set<String> queryParameterNames = parse.getQueryParameterNames();
        if (queryParameterNames != null && queryParameterNames.size() > 0) {
            for (String str2 : queryParameterNames) {
                if (!WX_TPL.equals(str2)) {
                    buildUpon.appendQueryParameter(str2, parse.getQueryParameter(str2));
                }
            }
        }
        return buildUpon.toString();
    }

    public static String q(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c83f4ddc", new Object[]{str});
        }
        if (TextUtils.isEmpty(str) || !str.startsWith(itw.URL_SEPARATOR)) {
            return str;
        }
        return HTTPS_SCHEMA.concat(str);
    }

    public static boolean e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b97c099a", new Object[]{str})).booleanValue();
        }
        if (!c(str)) {
            return false;
        }
        Uri parse = Uri.parse(str);
        return parse.getScheme() != null && "vessel".equals(parse.getScheme());
    }

    public static boolean f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f336e184", new Object[]{str})).booleanValue();
        }
        if (!d(str)) {
            return false;
        }
        return g(str, WX_TPL) || str.contains("wh_weex=true");
    }
}
