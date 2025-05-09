package tb;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class axf {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(614465593);
    }

    public static JSONArray a(JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONArray) ipChange.ipc$dispatch("5971b90f", new Object[]{jSONArray});
        }
        return i19.a(jSONArray);
    }

    public static JSONObject b(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("84aaf891", new Object[]{jSONObject});
        }
        return i19.b(jSONObject);
    }

    public static void c(JSONObject jSONObject, JSONObject jSONObject2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6d63b606", new Object[]{jSONObject, jSONObject2});
        } else {
            i19.c(jSONObject, jSONObject2);
        }
    }

    public static void d(Object obj, JSONObject jSONObject, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6c69ff55", new Object[]{obj, jSONObject, str});
        } else if (obj instanceof JSONObject) {
            JSONObject jSONObject2 = (JSONObject) obj;
            for (Map.Entry<String, Object> entry : jSONObject2.entrySet()) {
                if (str == null || !str.equals(entry.getKey())) {
                    Object value = entry.getValue();
                    if (value instanceof String) {
                        String str2 = (String) value;
                        if (or8.b(str2)) {
                            Object a2 = or8.a(str2, jSONObject);
                            if (a2 instanceof JSONObject) {
                                jSONObject2.put(entry.getKey(), (Object) b((JSONObject) a2));
                            } else if (a2 instanceof JSONArray) {
                                jSONObject2.put(entry.getKey(), (Object) a((JSONArray) a2));
                            } else {
                                jSONObject2.put(entry.getKey(), a2);
                            }
                        }
                    } else if (value instanceof JSONObject) {
                        d(value, jSONObject, str);
                    } else if (value instanceof JSONArray) {
                        d(value, jSONObject, str);
                    }
                }
            }
        } else if (obj instanceof JSONArray) {
            JSONArray jSONArray = (JSONArray) obj;
            int size = jSONArray.size();
            for (int i = 0; i < size; i++) {
                Object obj2 = jSONArray.get(i);
                if (obj2 instanceof String) {
                    String str3 = (String) obj2;
                    if (or8.b(str3)) {
                        Object a3 = or8.a(str3, jSONObject);
                        if (a3 instanceof JSONObject) {
                            jSONArray.set(i, b((JSONObject) a3));
                        } else if (a3 instanceof JSONArray) {
                            jSONArray.set(i, a((JSONArray) a3));
                        } else {
                            jSONArray.set(i, a3);
                        }
                    }
                } else if (obj2 instanceof JSONObject) {
                    d(obj2, jSONObject, str);
                } else if (obj2 instanceof JSONArray) {
                    d(obj2, jSONObject, str);
                }
            }
        }
    }

    public static void e(Object obj, JSONObject jSONObject, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42d84f78", new Object[]{obj, jSONObject, str});
        } else if (obj != null && jSONObject != null) {
            d(obj, jSONObject, str);
        }
    }
}
