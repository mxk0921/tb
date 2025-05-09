package tb;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class hbs {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(849346573);
    }

    public static final Boolean a(JSONObject jSONObject, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Boolean) ipChange.ipc$dispatch("8745b4a4", new Object[]{jSONObject, str});
        }
        ckf.g(jSONObject, "<this>");
        ckf.g(str, "key");
        Object obj = jSONObject.get(str);
        if (obj instanceof Boolean) {
            return (Boolean) obj;
        }
        if (obj instanceof String) {
            return Boolean.valueOf(Boolean.parseBoolean((String) obj));
        }
        return null;
    }

    public static final boolean b(JSONObject jSONObject, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("866a58ae", new Object[]{jSONObject, str, new Boolean(z)})).booleanValue();
        }
        ckf.g(jSONObject, "<this>");
        ckf.g(str, "key");
        try {
            Boolean bool = jSONObject.getBoolean(str);
            return bool == null ? z : bool.booleanValue();
        } catch (Exception unused) {
            return z;
        }
    }

    public static final JSONObject d(JSONObject jSONObject, g1a<? super String, String> g1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("6768f7d9", new Object[]{jSONObject, g1aVar});
        }
        ckf.g(jSONObject, "<this>");
        ckf.g(g1aVar, "replacement");
        JSONObject jSONObject2 = new JSONObject();
        for (String str : jSONObject.keySet()) {
            ckf.f(str, "key");
            String invoke = g1aVar.invoke(str);
            Object obj = jSONObject.get(str);
            if (obj instanceof JSONObject) {
                jSONObject2.put((JSONObject) invoke, (String) d((JSONObject) obj, g1aVar));
            } else if (obj instanceof JSONArray) {
                jSONObject2.put((JSONObject) invoke, (String) c((JSONArray) obj, g1aVar));
            } else if (obj instanceof String) {
                jSONObject2.put((JSONObject) invoke, g1aVar.invoke(obj));
            } else {
                jSONObject2.put((JSONObject) invoke, g1aVar.invoke(String.valueOf(obj)));
            }
        }
        return jSONObject2;
    }

    public static final JSONArray c(JSONArray jSONArray, g1a<? super String, String> g1aVar) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONArray) ipChange.ipc$dispatch("b3262047", new Object[]{jSONArray, g1aVar});
        }
        ckf.g(jSONArray, "<this>");
        ckf.g(g1aVar, "replacement");
        JSONArray jSONArray2 = new JSONArray();
        int size = jSONArray.size();
        while (i < size) {
            i++;
            Object obj = jSONArray.get(i);
            if (obj instanceof JSONObject) {
                jSONArray2.add(d((JSONObject) obj, g1aVar));
            } else if (obj instanceof JSONArray) {
                jSONArray2.add(c((JSONArray) obj, g1aVar));
            } else if (obj instanceof String) {
                jSONArray2.add(g1aVar.invoke(obj));
            } else {
                jSONArray2.add(g1aVar.invoke(obj.toString()));
            }
        }
        return jSONArray2;
    }
}
