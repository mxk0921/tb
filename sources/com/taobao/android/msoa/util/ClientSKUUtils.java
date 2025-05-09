package com.taobao.android.msoa.util;

import android.app.Activity;
import android.net.Uri;
import android.text.TextUtils;
import anet.channel.util.HttpConstant;
import com.alibaba.android.umbrella.link.UMLinkLogInterface;
import com.alibaba.ariver.kernel.common.utils.ProcessUtils;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.sku.utils.SkuLogUtils;
import com.taobao.weex.WXSDKInstance;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.hdv;
import tb.urh;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class ClientSKUUtils {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final List<String> f9005a = new ArrayList<String>() { // from class: com.taobao.android.msoa.util.ClientSKUUtils.1
        {
            add("cart");
            add("minidetail");
            add("taobaolive_msoa");
            add("tbshortvideo");
        }
    };
    public static String b = "Native_NULL";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final String f9006a;
        public final Map<String, Object> b;

        public a(String str, Map<String, Object> map) {
            this.f9006a = str;
            this.b = map;
        }
    }

    public static Map<String, Object> a(Map<String, Object> map, JSONObject jSONObject) {
        Object obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("de150064", new Object[]{map, jSONObject});
        }
        if (map == null) {
            return map;
        }
        Object obj2 = map.get("exParams");
        if (!(obj2 instanceof JSONObject)) {
            return map;
        }
        JSONObject jSONObject2 = (JSONObject) obj2;
        d(jSONObject, jSONObject2);
        String string = jSONObject2.getString("bizName");
        if (TextUtils.isEmpty(string) && (obj = map.get("bizName")) != null) {
            string = obj.toString();
        }
        if (jSONObject != null) {
            if (TextUtils.isEmpty(string)) {
                string = jSONObject.getString("bizName");
            }
            if (TextUtils.isEmpty(string)) {
                string = jSONObject.getString("sceneName");
            }
        }
        if (TextUtils.isEmpty(string)) {
            string = "null";
        }
        jSONObject2.put("bizName", (Object) string);
        return map;
    }

    public static void b(String str, Map<String, Object> map, WXSDKInstance wXSDKInstance) {
        Map j;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e025c02a", new Object[]{str, map, wXSDKInstance});
        } else if (!e(str, map) && (j = j(map)) != null) {
            j.put("_sku_weexUrl_", l(wXSDKInstance));
            j.put("_sku_unique_marker_", k(wXSDKInstance));
            j.put("_sku_actStack_", i());
        }
    }

    public static void c(String str, Map<String, Object> map) {
        Map j;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("62602a9e", new Object[]{str, map});
        } else if (!e(str, map) && (j = j(map)) != null && !j.containsKey("_sku_webviewUrl_") && !j.containsKey("_sku_unique_marker_") && !j.containsKey("_sku_weexUrl_") && !j.containsKey("_sku_actStack_") && !j.containsKey("_sku_codeStack_")) {
            j.put("_sku_actStack_", i());
            j.put("_sku_unique_marker_", b);
            j.put("_sku_codeStack_", h());
        }
    }

    public static void d(JSONObject jSONObject, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3f6f0bbe", new Object[]{jSONObject, map});
            return;
        }
        if (jSONObject != null) {
            try {
                long longValue = jSONObject.getLongValue("JSBRIDGE_START_UPTIME");
                if (longValue != 0) {
                    map.put("JSBRIDGE_START_UPTIME", Long.valueOf(longValue));
                }
            } catch (Throwable unused) {
            }
        }
        map.put("MSOA_START_UPTIME", Long.valueOf(System.currentTimeMillis()));
    }

    public static boolean e(String str, Map<String, Object> map) {
        Object obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("11dd8c60", new Object[]{str, map})).booleanValue();
        }
        if (!"msoa.taobao.detail.showsku".equalsIgnoreCase(str)) {
            return true;
        }
        if (map != null) {
            Object obj2 = map.get("exParams");
            if ((obj2 instanceof Map) && (obj = ((Map) obj2).get("bizName")) != null) {
                return ((ArrayList) f9005a).contains(obj.toString());
            }
        }
        return false;
    }

    public static urh f(urh urhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (urh) ipChange.ipc$dispatch("75b78c89", new Object[]{urhVar});
        }
        if ("msoa.taobao.detail.showsku".equals(urhVar.b)) {
            urhVar.c = "2.0";
            Map<String, Object> map = urhVar.f;
            if (map == null) {
                urhVar.f = new HashMap<String, Object>() { // from class: com.taobao.android.msoa.util.ClientSKUUtils.2
                    {
                        put("exParams", new JSONObject());
                    }
                };
            } else if (!(map.get("exParams") instanceof JSONObject)) {
                urhVar.f.put("exParams", new JSONObject());
            }
        }
        return urhVar;
    }

    public static a g(String str, String str2, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("a2b875f9", new Object[]{str, str2, map});
        }
        if (!"msoa.taobao.detail.showsku".equals(str)) {
            return new a(str2, map);
        }
        if (map == null) {
            map = new HashMap<String, Object>() { // from class: com.taobao.android.msoa.util.ClientSKUUtils.3
                {
                    put("exParams", new JSONObject());
                }
            };
        } else if (!(map.get("exParams") instanceof JSONObject)) {
            map.put("exParams", new JSONObject());
        }
        return new a("2.0", map);
    }

    public static String h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3a167e34", new Object[0]);
        }
        JSONArray jSONArray = new JSONArray();
        StackTraceElement[] stackTrace = new Throwable().getStackTrace();
        int length = stackTrace.length;
        if (length > 5) {
            length = 5;
        }
        for (int i = 0; i < length; i++) {
            jSONArray.add(stackTrace[i].toString());
        }
        return jSONArray.toJSONString();
    }

    public static String i() {
        String str;
        JSONArray jSONArray = new JSONArray();
        try {
            Class<?> cls = Class.forName(ProcessUtils.ACTIVITY_THREAD);
            Field declaredField = cls.getDeclaredField("mActivities");
            declaredField.setAccessible(true);
            for (Object obj : ((Map) declaredField.get(cls.getMethod(ProcessUtils.CURRENT_ACTIVITY_THREAD, new Class[0]).invoke(null, new Object[0]))).values()) {
                Field declaredField2 = obj.getClass().getDeclaredField("activity");
                declaredField2.setAccessible(true);
                Activity activity = (Activity) declaredField2.get(obj);
                String str2 = "" + activity.getClass().getCanonicalName();
                b = str2;
                if (activity.getIntent() != null) {
                    str = str2 + " : " + activity.getIntent().getDataString();
                } else {
                    str = str2 + " : NULL";
                }
                jSONArray.add(str);
            }
            if (TextUtils.isEmpty(b)) {
                b = "Native_NULL";
            }
            return jSONArray.toJSONString();
        } catch (Throwable unused) {
            if (TextUtils.isEmpty(b)) {
                b = "Native_Exception_NULL";
            }
            return jSONArray.toJSONString();
        }
    }

    public static Map j(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("da97ee24", new Object[]{map});
        }
        if (map == null) {
            return null;
        }
        Object obj = map.get("exParams");
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }

    public static String k(WXSDKInstance wXSDKInstance) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("cdddbe5a", new Object[]{wXSDKInstance});
        }
        String str = "";
        if (wXSDKInstance != null) {
            String bundleUrl = wXSDKInstance.getBundleUrl();
            try {
                Uri parse = Uri.parse(bundleUrl);
                return parse.getScheme() + HttpConstant.SCHEME_SPLIT + parse.getHost() + str + parse.getPath();
            } catch (Throwable unused) {
                str = bundleUrl;
            }
        }
        if (TextUtils.isEmpty(str)) {
            return "Weex_NULL";
        }
        return str;
    }

    public static String l(WXSDKInstance wXSDKInstance) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7ed9c2cf", new Object[]{wXSDKInstance});
        }
        if (wXSDKInstance != null) {
            str = wXSDKInstance.getBundleUrl();
        } else {
            str = "";
        }
        if (TextUtils.isEmpty(str)) {
            return "NULL";
        }
        return str;
    }

    public static void m(String str, String str2) {
        UMLinkLogInterface a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa57b968", new Object[]{str, str2});
        } else if ("msoa.taobao.detail.showsku".equalsIgnoreCase(str) && "1.0".equalsIgnoreCase(str2) && (a2 = hdv.a()) != null) {
            try {
                a2.commitFailure("Main", "sku1.0", "", "New_Sku", SkuLogUtils.DEFAULT_BIZ_NAME, new HashMap<String, String>() { // from class: com.taobao.android.msoa.util.ClientSKUUtils.4
                    {
                        put("errorMsg", "sku1.0");
                    }
                }, "UME_SKU_MSOA_SKU1.0", "sku1.0");
            } catch (Throwable unused) {
            }
        }
    }
}
