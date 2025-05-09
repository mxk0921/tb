package tb;

import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class ynm {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(352321710);
    }

    public static String a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3b488813", new Object[]{str, str2});
        }
        byj.d0();
        if (!byj.g0 || TextUtils.isEmpty(str2)) {
            return str;
        }
        return str2 + "_" + str;
    }

    public static String b(Map<String, String> map, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("14d973eb", new Object[]{map, str});
        }
        if (map == null) {
            return str;
        }
        byj.d0();
        if (!byj.g0) {
            return str;
        }
        String str2 = map.get(str);
        if (TextUtils.isEmpty(str2)) {
            return str;
        }
        return str2;
    }

    public static String c(Intent intent) {
        Uri data;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("930dee2f", new Object[]{intent});
        }
        if (intent == null || (data = intent.getData()) == null) {
            return "";
        }
        return data.getQueryParameter("newDetailChannel");
    }

    public static String d(Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9b5d100d", new Object[]{uri});
        }
        if (uri == null) {
            return "";
        }
        return uri.getQueryParameter("newDetailChannel");
    }

    public static String e(String str) {
        Uri parse;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2dd38c2", new Object[]{str});
        }
        if (!TextUtils.isEmpty(str) && (parse = Uri.parse(str)) != null) {
            return parse.getQueryParameter("newDetailChannel");
        }
        return "";
    }

    public static JSONObject f(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("315d6658", new Object[]{str, str2});
        }
        btm a2 = ltm.a("new_detail").a(str);
        if (a2 == null) {
            txj.e(txj.TAG_RENDER, "getDeliverCacheData" + str2 + "阶段取到" + str + "对应cacheData为空");
            return null;
        } else if (!"deliver".equals(a2.b)) {
            txj.e(txj.TAG_RENDER, "getDeliverCacheData" + str2 + "阶段取到" + str + "对应cacheType: " + a2.b + ", 非透传数据");
            return null;
        } else {
            JSONObject jSONObject = (JSONObject) a2.e;
            if (jSONObject != null) {
                return jSONObject;
            }
            txj.e(txj.TAG_RENDER, "getDeliverCacheData" + str2 + "阶段取到" + str + "对应cacheData.data为空");
            return null;
        }
    }

    public static JSONObject g(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("7e251545", new Object[]{str, str2});
        }
        btm a2 = ltm.a("new_detail").a(str);
        if (a2 == null) {
            txj.e(txj.TAG_RENDER, str2 + "阶段取到" + str + "对应cacheData为空");
            return null;
        } else if (!"preload".equals(a2.b)) {
            txj.e(txj.TAG_RENDER, str2 + "阶段取到" + str + "对应cacheType: " + a2.b + ", 非预请求数据");
            return null;
        } else {
            JSONObject jSONObject = (JSONObject) a2.e;
            if (jSONObject != null) {
                return jSONObject;
            }
            txj.e(txj.TAG_RENDER, str2 + "阶段取到" + str + "对应cacheData.data为空");
            return null;
        }
    }

    public static String h(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("23cc765a", new Object[]{str});
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        Uri parse = Uri.parse(str);
        if (!"N".equals(parse.getQueryParameter("isSjjsd"))) {
            return null;
        }
        String l = l(parse);
        String d = d(parse);
        if (TextUtils.isEmpty(l) || TextUtils.isEmpty(d)) {
            return null;
        }
        return i(l, d);
    }

    public static String i(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e4879f50", new Object[]{str, str2});
        }
        return str2 + "_" + str;
    }

    public static String j(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("de9fc550", new Object[]{intent});
        }
        if (intent == null) {
            return "";
        }
        return String.valueOf(intent.getLongExtra(kxj.KEY_NAV_LONG_TOKEN, -1L));
    }

    public static String k(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7059398", new Object[]{intent});
        }
        if (intent == null) {
            return "";
        }
        return l(intent.getData());
    }

    public static String l(Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("34fcbec4", new Object[]{uri});
        }
        if (uri == null) {
            return "";
        }
        return uri.getQueryParameter("newType");
    }

    public static JSONObject m(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("c6517b72", new Object[]{str, str2, str3});
        }
        btm g = ltm.a("new_detail_random").g(str, str2);
        if (g == null) {
            txj.e(txj.TAG_RENDER, "getPreRequestCacheDataRandom" + str3 + "阶段取到" + str + "对应cacheData为空");
            return null;
        } else if (!"preload".equals(g.b)) {
            txj.e(txj.TAG_RENDER, "getPreRequestCacheDataRandom" + str3 + "阶段取到" + str + "对应cacheType: " + g.b + ", 非预请求数据");
            return null;
        } else {
            JSONObject jSONObject = (JSONObject) g.e;
            if (jSONObject != null) {
                return jSONObject;
            }
            txj.e(txj.TAG_RENDER, "getPreRequestCacheDataRandom" + str3 + "阶段取到" + str + "对应cacheData.data为空");
            return null;
        }
    }

    public static boolean n(Intent intent) {
        Uri data;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1eff13c2", new Object[]{intent})).booleanValue();
        }
        if (intent == null || (data = intent.getData()) == null) {
            return true;
        }
        return !"N".equals(data.getQueryParameter("isSjjsd"));
    }
}
