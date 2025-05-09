package com.taobao.android.msoa;

import android.app.Activity;
import android.net.Uri;
import android.taobao.windvane.webview.IWVWebView;
import android.text.TextUtils;
import anet.channel.util.HttpConstant;
import com.alibaba.ariver.kernel.common.utils.ProcessUtils;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class ServerSKUUtils {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final List<String> f9003a = new ArrayList<String>() { // from class: com.taobao.android.msoa.ServerSKUUtils.1
        {
            add("cart");
            add("minidetail");
            add("taobaolive_msoa");
            add("tbshortvideo");
        }
    };

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final String f9004a;
        public final Map<String, Object> b;

        public a(String str, Map<String, Object> map) {
            this.f9004a = str;
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
        c(jSONObject, jSONObject2);
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

    public static void b(String str, Map<String, Object> map, IWVWebView iWVWebView) {
        Map g;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b864ae8", new Object[]{str, map, iWVWebView});
        } else if (!d(str, map) && (g = g(map)) != null) {
            g.put("_sku_webviewUrl_", i(iWVWebView));
            g.put("_sku_unique_marker_", h(iWVWebView));
            g.put("_sku_actStack_", f());
        }
    }

    public static void c(JSONObject jSONObject, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3f6f0bbe", new Object[]{jSONObject, map});
        } else if (jSONObject != null) {
            try {
                long longValue = jSONObject.getLongValue("JSBRIDGE_START_UPTIME");
                if (longValue != 0) {
                    map.put("JSBRIDGE_START_UPTIME", Long.valueOf(longValue));
                }
            } catch (Throwable unused) {
            }
        }
    }

    public static boolean d(String str, Map<String, Object> map) {
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
                return ((ArrayList) f9003a).contains(obj.toString());
            }
        }
        return false;
    }

    public static a e(String str, String str2, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("9c966e5c", new Object[]{str, str2, map});
        }
        if (!"msoa.taobao.detail.showsku".equals(str)) {
            return new a(str2, map);
        }
        if (map == null) {
            map = new HashMap<String, Object>() { // from class: com.taobao.android.msoa.ServerSKUUtils.2
                {
                    put("exParams", new JSONObject());
                }
            };
        } else if (!(map.get("exParams") instanceof JSONObject)) {
            map.put("exParams", new JSONObject());
        }
        return new a("2.0", map);
    }

    public static String f() {
        Activity activity;
        String str;
        JSONArray jSONArray = new JSONArray();
        try {
            Class<?> cls = Class.forName(ProcessUtils.ACTIVITY_THREAD);
            Field declaredField = cls.getDeclaredField("mActivities");
            declaredField.setAccessible(true);
            for (Object obj : ((Map) declaredField.get(cls.getMethod(ProcessUtils.CURRENT_ACTIVITY_THREAD, new Class[0]).invoke(null, new Object[0]))).values()) {
                Field declaredField2 = obj.getClass().getDeclaredField("activity");
                declaredField2.setAccessible(true);
                String str2 = "" + activity.getClass().getCanonicalName();
                if (((Activity) declaredField2.get(obj)).getIntent() != null) {
                    str = str2 + " : " + activity.getIntent().getDataString();
                } else {
                    str = str2 + " : NULL";
                }
                jSONArray.add(str);
            }
            return jSONArray.toJSONString();
        } catch (Throwable unused) {
            return jSONArray.toJSONString();
        }
    }

    public static Map g(Map<String, Object> map) {
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

    public static String h(IWVWebView iWVWebView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9eee9094", new Object[]{iWVWebView});
        }
        String str = "";
        if (iWVWebView != null) {
            String url = iWVWebView.getUrl();
            try {
                Uri parse = Uri.parse(url);
                return parse.getScheme() + HttpConstant.SCHEME_SPLIT + parse.getHost() + str + parse.getPath();
            } catch (Throwable unused) {
                str = url;
            }
        }
        if (TextUtils.isEmpty(str)) {
            return "WebView_NULL";
        }
        return str;
    }

    public static String i(IWVWebView iWVWebView) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("38970949", new Object[]{iWVWebView});
        }
        if (iWVWebView != null) {
            str = iWVWebView.getUrl();
        } else {
            str = "";
        }
        if (TextUtils.isEmpty(str)) {
            return "NULL";
        }
        return str;
    }
}
