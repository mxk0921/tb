package tb;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.buy.toggle.AliBuyPerfSwitcher;
import com.taobao.android.ultron.common.utils.UnifyLog;
import com.ut.device.UTDevice;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.HashMap;
import java.util.Map;
import tb.vm0;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class lql {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(301990035);
    }

    public static Map<String, String> a(Context context, Map<String, String> map, Map<String, String> map2) {
        JSONObject jSONObject;
        String str;
        Map<String, Object> c;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("4c081881", new Object[]{context, map, map2});
        }
        if (map == null) {
            map = new HashMap<>();
        }
        String str2 = map.get("exParams");
        try {
            if (str2 != null) {
                jSONObject = JSON.parseObject(str2);
            } else {
                jSONObject = new JSONObject();
            }
        } catch (Exception unused) {
            UnifyLog.e("ParamsMaker", "exParams json 转换错误");
            jSONObject = null;
        }
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        try {
            str = context.getResources().getConfiguration().locale.toString();
        } catch (Exception unused2) {
            UnifyLog.e("ParamsMaker", "addExtraParams", "获取locale 参数报错");
            str = "";
        }
        if (!TextUtils.isEmpty(str)) {
            jSONObject.put("websiteLanguage", (Object) str);
        }
        Map<String, Object> aBTestParams = AliBuyPerfSwitcher.getABTestParams();
        if (aBTestParams != null) {
            jSONObject.putAll(aBTestParams);
        }
        if ("float".equals(map2.get("pageType")) && (c = ko0.c()) != null) {
            jSONObject.putAll(c);
        }
        jSONObject.put("umfVersions", (Object) c());
        jSONObject.putAll(map2);
        String l = l(context);
        if (!TextUtils.isEmpty(l)) {
            jSONObject.put("needNativeContainer", (Object) l);
        }
        m(map, "exParams", jSONObject.toJSONString());
        return map;
    }

    public static void b(Map<String, String> map) {
        String[] split;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a68ec8be", new Object[]{map});
            return;
        }
        String str = map.get("buyParam");
        String str2 = map.get("cartIds");
        map.put("itemNum", "1");
        if (TextUtils.isEmpty(str)) {
            str = str2;
        }
        if (!TextUtils.isEmpty(str) && (split = str.split(",")) != null) {
            map.put("itemNum", split.length + "");
        }
    }

    public static JSONObject c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("bc5770c6", new Object[0]);
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("version", (Object) "0.1.0");
        jSONObject.put("features", (Object) new JSONObject());
        return jSONObject;
    }

    public static Map<String, String> e(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("b868f5a4", new Object[]{intent});
        }
        if (rm0.b()) {
            return new HashMap();
        }
        return h(intent);
    }

    public static int f(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d4fea678", new Object[]{intent})).intValue();
        }
        return intent.getIntExtra("purchase_from", 3);
    }

    public static Map<String, String> g(Uri uri) {
        String str;
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("6059a90", new Object[]{uri});
        }
        if (uri == null || uri.isOpaque()) {
            return new HashMap();
        }
        String encodedQuery = uri.getEncodedQuery();
        if (encodedQuery == null) {
            return new HashMap();
        }
        HashMap hashMap = new HashMap();
        do {
            int indexOf = encodedQuery.indexOf(38, i);
            if (indexOf == -1) {
                indexOf = encodedQuery.length();
            }
            int indexOf2 = encodedQuery.indexOf(61, i);
            if (indexOf2 > indexOf || indexOf2 == -1) {
                indexOf2 = indexOf;
            }
            String substring = encodedQuery.substring(i, indexOf2);
            if (indexOf2 < indexOf) {
                str = encodedQuery.substring(indexOf2 + 1, indexOf);
            } else {
                str = "";
            }
            hashMap.put(Uri.decode(substring), Uri.decode(str));
            i = indexOf + 1;
        } while (i < encodedQuery.length());
        return hashMap;
    }

    public static Map<String, String> h(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("1f03166e", new Object[]{intent});
        }
        HashMap hashMap = new HashMap();
        if (intent == null) {
            vm0.d(vm0.a.a("buyFragment").message("intent is empty").tag("EMPTY_INTENT_FORM_(getPageParams)").sampling(1.0f));
            return hashMap;
        }
        String stringExtra = intent.getStringExtra("openFrom");
        String stringExtra2 = intent.getStringExtra("pageType");
        Uri data = intent.getData();
        if (data != null) {
            if (TextUtils.isEmpty(stringExtra)) {
                stringExtra = data.getQueryParameter("openFrom");
            }
            if (TextUtils.isEmpty(stringExtra2)) {
                stringExtra2 = data.getQueryParameter("pageType");
            }
        }
        if (!TextUtils.isEmpty(stringExtra)) {
            hashMap.put("openFrom", stringExtra);
        }
        if (!TextUtils.isEmpty(stringExtra2)) {
            hashMap.put("pageType", stringExtra2);
        }
        return hashMap;
    }

    public static void i(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f5b4dd54", new Object[]{map});
        } else if (map != null && !map.isEmpty()) {
            UnifyLog.m("purchase", "ParamsMaker", "logBuildOrderParams", map.toString());
        }
    }

    public static Map<String, String> k(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("5ab6afcc", new Object[]{context});
        }
        HashMap hashMap = new HashMap();
        String utdid = UTDevice.getUtdid(context);
        if (!TextUtils.isEmpty(utdid)) {
            hashMap.put("orderMarker", "v:utdid=" + utdid);
        }
        return hashMap;
    }

    public static String l(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f9bc3953", new Object[]{context});
        }
        Intent h = hh.h(context);
        if (h == null) {
            return null;
        }
        return h.getStringExtra("needNativeContainer");
    }

    public static void m(Map<String, String> map, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e286ceb9", new Object[]{map, str, str2});
        } else if (str2 != null) {
            map.put(str, str2);
        }
    }

    public static String n(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9e09c79", new Object[]{str});
        }
        if (str == null || !str.endsWith(",")) {
            return str;
        }
        return str.substring(0, str.length() - 1);
    }

    public static String o(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2495bf52", new Object[]{str});
        }
        if (str == null) {
            return null;
        }
        try {
            return URLDecoder.decode(str, "utf-8");
        } catch (UnsupportedEncodingException unused) {
            return null;
        }
    }

    public static String d(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("af581b92", new Object[]{intent});
        }
        if (intent == null) {
            vm0.d(vm0.a.a("buyFragment").message("intent is empty").tag("EMPTY_INTENT_FORM_(getOpenFrom)").sampling(1.0f));
            return "异常";
        }
        String str = h(intent).get("openFrom");
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        int f = f(intent);
        if (2 == f) {
            return "detail";
        }
        if (1 == f) {
            return "carts";
        }
        return "未知源";
    }

    public static Map<String, String> j(Context context, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("746d1df", new Object[]{context, intent});
        }
        HashMap hashMap = new HashMap();
        int intExtra = intent.getIntExtra("purchase_from", 3);
        if (intExtra == 1) {
            Map map = (Map) intent.getSerializableExtra("buildOrderParams");
            if (map != null) {
                b(map);
                return a(context, map, e(intent));
            }
            hashMap.put(go2.EVENT_TYPE, "false");
            m(hashMap, "cartIds", n(intent.getStringExtra("cartIds")));
            m(hashMap, "buyParam", intent.getStringExtra("buyParam"));
            m(hashMap, "bookingDate", intent.getStringExtra("bookingDate"));
            m(hashMap, "entranceDate", intent.getStringExtra("entranceDate"));
        } else if (intExtra != 2) {
            Map<String, String> g = g(intent.getData());
            b(g);
            return a(context, g, e(intent));
        } else {
            Map map2 = (Map) intent.getSerializableExtra("buildOrderParams");
            if (map2 != null) {
                i(map2);
                b(map2);
                return a(context, map2, e(intent));
            }
            hashMap.put(go2.EVENT_TYPE, "true");
            m(hashMap, "itemId", intent.getStringExtra("itemId"));
            m(hashMap, q2q.KEY_SKU_ID, intent.getStringExtra(q2q.KEY_SKU_ID));
            m(hashMap, "quantity", String.valueOf(intent.getIntExtra("quantity", 1)));
            m(hashMap, "tgKey", o(intent.getStringExtra("tgKey")));
            m(hashMap, "serviceId", intent.getStringExtra("serviceId"));
            m(hashMap, "bookingDate", intent.getStringExtra("bookingDate"));
            m(hashMap, "entranceDate", intent.getStringExtra("entranceDate"));
            m(hashMap, "exParams", intent.getStringExtra("exParams"));
        }
        i(hashMap);
        m(hashMap, "itemNum", "1");
        return a(context, hashMap, e(intent));
    }
}
