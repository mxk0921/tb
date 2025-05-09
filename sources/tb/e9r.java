package tb;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Arrays;
import java.util.List;
import tb.ck;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class e9r {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final List<String> f18381a = Arrays.asList("B", "C");

    static {
        t2o.a(708837525);
    }

    public static String c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("931b1fe1", new Object[]{str});
        }
        if (str.startsWith("@data{")) {
            return str.substring(6, str.length() - 1);
        }
        return null;
    }

    public static Object g(JSONObject jSONObject, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("3f261a", new Object[]{jSONObject, str});
        }
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, "*")) {
            return jSONObject;
        }
        return gl.d(str.split("\\."), jSONObject);
    }

    public static void k(JSONObject jSONObject, JSONObject jSONObject2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f28bbe6e", new Object[]{jSONObject, jSONObject2});
            return;
        }
        for (String str : jSONObject.keySet()) {
            Object obj = jSONObject.get(str);
            if (obj instanceof String) {
                String c = c((String) obj);
                if (!TextUtils.isEmpty(c)) {
                    Object g = g(jSONObject2, c);
                    if (g == null) {
                        g = "";
                    }
                    jSONObject.put(str, g);
                }
            }
        }
    }

    public static void l(JSONObject jSONObject, JSONObject jSONObject2) {
        JSONObject jSONObject3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1294ff8d", new Object[]{jSONObject, jSONObject2});
            return;
        }
        for (String str : jSONObject.keySet()) {
            JSONObject jSONObject4 = jSONObject.getJSONObject(str);
            if (!(jSONObject4 == null || (jSONObject3 = jSONObject4.getJSONObject("fields")) == null)) {
                k(jSONObject3, jSONObject2);
            }
        }
    }

    public static JSONObject a(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("c3fa2d67", new Object[]{context, str});
        }
        Object b = ucu.a().b(str);
        if (!(b instanceof JSONObject)) {
            q8r.e(null, "PRELOAD_IDENTIFIER_EMPTY");
            return null;
        }
        try {
            JSONObject jSONObject = (JSONObject) b;
            if (!h(jSONObject)) {
                q8r.e(jSONObject, "PRELOAD_DATA_EMPTY");
                return null;
            } else if (e(jSONObject) != 1) {
                return null;
            } else {
                String d = d(jSONObject);
                if (d != null && f18381a.contains(d)) {
                    if (th.c()) {
                        ck.g().e("beforeFlowExecute", ck.b.b().l("TBBuyPreload").i("AURA/preload").g("preloadData", jSONObject.toJSONString()).a());
                    }
                    String f = f(jSONObject);
                    if (!TextUtils.isEmpty(f)) {
                        m8r.l(f, ai.a(90.0f), context);
                    }
                    i(jSONObject);
                    j(jSONObject);
                    dvm dvmVar = new dvm();
                    l(dvmVar.b(), jSONObject);
                    return dvmVar.e();
                }
                q8r.e(d, "PRELOAD_BIZ_NOT_REGISTER");
                return null;
            }
        } catch (Throwable th) {
            q8r.e(Log.getStackTraceString(th), "PRELOAD_DATA_PARSE_EXCEPTION");
            return null;
        }
    }

    public static JSONObject b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("9189f131", new Object[]{str});
        }
        Object b = ucu.a().b(str);
        if (!(b instanceof JSONObject)) {
            q8r.e(null, "PRELOAD_IDENTIFIER_EMPTY");
            return null;
        }
        try {
            JSONObject jSONObject = (JSONObject) b;
            if (!h(jSONObject)) {
                q8r.e(jSONObject, "PRELOAD_DATA_EMPTY");
                return null;
            } else if (e(jSONObject) != 1) {
                return null;
            } else {
                String d = d(jSONObject);
                if (d != null && f18381a.contains(d)) {
                    if (th.c()) {
                        ck.g().e("beforeFlowExecute", ck.b.b().l("TBBuyPreload").i("AURA/preload").g("preloadData", jSONObject.toJSONString()).a());
                    }
                    i(jSONObject);
                    j(jSONObject);
                    return jSONObject;
                }
                q8r.e(d, "PRELOAD_BIZ_NOT_REGISTER");
                return null;
            }
        } catch (Throwable th) {
            q8r.e(Log.getStackTraceString(th), "PRELOAD_DATA_PARSE_EXCEPTION");
            return null;
        }
    }

    public static String d(JSONObject jSONObject) {
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e958f9c1", new Object[]{jSONObject});
        }
        JSONArray jSONArray = jSONObject.getJSONArray("item");
        if (jSONArray == null || (jSONObject2 = jSONArray.getJSONObject(0).getJSONObject("fields")) == null) {
            return null;
        }
        return jSONObject2.getString("mutex");
    }

    public static int e(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a44ae3f6", new Object[]{jSONObject})).intValue();
        }
        JSONArray jSONArray = jSONObject.getJSONArray("item");
        if (jSONArray == null) {
            return 0;
        }
        return jSONArray.size();
    }

    public static String f(JSONObject jSONObject) {
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2ed38699", new Object[]{jSONObject});
        }
        JSONArray jSONArray = jSONObject.getJSONArray("item");
        if ((jSONArray != null || jSONArray.size() <= 1) && (jSONObject2 = jSONArray.getJSONObject(0).getJSONObject("fields")) != null) {
            return jSONObject2.getString("pic");
        }
        return null;
    }

    public static boolean h(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9a8b9eed", new Object[]{jSONObject})).booleanValue();
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("header");
        JSONArray jSONArray = jSONObject.getJSONArray("item");
        JSONObject jSONObject3 = jSONObject.getJSONObject("submit");
        if (jSONObject2 == null || jSONArray == null) {
            return false;
        }
        return (jSONObject3 != null) & (jSONArray.size() != 0);
    }

    public static void i(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6345700d", new Object[]{jSONObject});
            return;
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("header");
        if (jSONObject2 != null) {
            try {
                JSONObject jSONObject3 = jSONObject2.getJSONObject("fields");
                JSONArray jSONArray = jSONObject3.getJSONArray(mf6.TYPE_SELECTED);
                if (jSONArray == null || jSONArray.size() <= 0) {
                    String string = jSONObject2.getJSONObject("events").getJSONArray("addressClick").getJSONObject(0).getJSONObject("fields").getString("data");
                    String string2 = jSONObject3.getString("currentAddressId");
                    if (!TextUtils.isEmpty(string2)) {
                        JSONArray jSONArray2 = JSON.parseObject(string).getJSONArray("deliverAddrList");
                        for (int i = 0; i < jSONArray2.size(); i++) {
                            JSONObject jSONObject4 = jSONArray2.getJSONObject(i);
                            if (string2.equalsIgnoreCase(jSONObject4.getString(sf0.K_DELIVERY_ID))) {
                                jSONObject3.put("fullName", (Object) jSONObject4.getString("fullName"));
                                jSONObject3.put("mobile", (Object) jSONObject4.getString("mobile"));
                            } else {
                                return;
                            }
                        }
                        return;
                    }
                    return;
                }
                Object obj = jSONArray.get(0);
                if (obj instanceof JSONObject) {
                    jSONObject3.put("fullName", (Object) ((JSONObject) obj).getString("fullName"));
                    jSONObject3.put("mobile", (Object) ((JSONObject) obj).getString("mobile"));
                }
            } catch (Throwable unused) {
            }
        }
    }

    public static void j(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3488eb87", new Object[]{jSONObject});
            return;
        }
        JSONArray jSONArray = jSONObject.getJSONArray("item");
        if (jSONArray != null) {
            for (int i = 0; i < jSONArray.size(); i++) {
                JSONObject jSONObject2 = jSONArray.getJSONObject(i).getJSONObject("fields");
                JSONArray jSONArray2 = jSONObject2.getJSONArray("serviceIcons");
                if (jSONArray2 != null) {
                    JSONArray jSONArray3 = new JSONArray();
                    for (int i2 = 0; i2 < jSONArray2.size(); i2++) {
                        String string = jSONArray2.getJSONObject(i2).getString("text");
                        if (string != null) {
                            jSONArray3.add(string);
                        }
                    }
                    if (jSONArray3.size() != 0) {
                        jSONObject2.put("label", (Object) jSONArray3);
                    }
                }
            }
        }
    }
}
