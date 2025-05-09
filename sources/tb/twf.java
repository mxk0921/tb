package tb;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class twf {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(156237890);
    }

    public static JSONArray a(JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONArray) ipChange.ipc$dispatch("5971b90f", new Object[]{jSONArray});
        }
        JSONArray jSONArray2 = new JSONArray();
        d(jSONArray2, jSONArray);
        return jSONArray2;
    }

    public static JSONObject b(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("84aaf891", new Object[]{jSONObject});
        }
        JSONObject jSONObject2 = new JSONObject();
        d(jSONObject2, jSONObject);
        return jSONObject2;
    }

    public static void c(JSONObject jSONObject, JSONObject jSONObject2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6d63b606", new Object[]{jSONObject, jSONObject2});
        } else if (jSONObject != null && jSONObject2 != null) {
            d(jSONObject, jSONObject2);
        }
    }

    public static void d(Object obj, Object obj2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb3d0aac", new Object[]{obj, obj2});
        } else if ((obj instanceof JSONObject) && (obj2 instanceof JSONObject)) {
            JSONObject jSONObject = (JSONObject) obj;
            for (Map.Entry<String, Object> entry : ((JSONObject) obj2).entrySet()) {
                Object value = entry.getValue();
                if (value instanceof JSONObject) {
                    if (jSONObject.get(entry.getKey()) instanceof JSONObject) {
                        d(jSONObject.getJSONObject(entry.getKey()), value);
                    } else {
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject.put(entry.getKey(), (Object) jSONObject2);
                        d(jSONObject2, value);
                    }
                } else if (value instanceof JSONArray) {
                    JSONArray jSONArray = new JSONArray();
                    jSONObject.put(entry.getKey(), (Object) jSONArray);
                    d(jSONArray, value);
                } else {
                    jSONObject.put(entry.getKey(), value);
                }
            }
        } else if ((obj instanceof JSONArray) && (obj2 instanceof JSONArray)) {
            JSONArray jSONArray2 = (JSONArray) obj;
            JSONArray jSONArray3 = (JSONArray) obj2;
            int size = jSONArray3.size();
            for (int i = 0; i < size; i++) {
                Object obj3 = jSONArray3.get(i);
                if (obj3 instanceof JSONObject) {
                    JSONObject jSONObject3 = new JSONObject();
                    jSONArray2.add(i, jSONObject3);
                    d(jSONObject3, obj3);
                } else if (obj3 instanceof JSONArray) {
                    JSONArray jSONArray4 = new JSONArray();
                    jSONArray2.add(i, jSONArray4);
                    d(jSONArray4, obj3);
                } else {
                    jSONArray2.add(i, obj3);
                }
            }
        }
    }

    public static void e(Object obj, JSONObject jSONObject, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7dfdddf", new Object[]{obj, jSONObject, str, str2});
        } else if (obj instanceof JSONObject) {
            JSONObject jSONObject2 = (JSONObject) obj;
            for (Map.Entry<String, Object> entry : jSONObject2.entrySet()) {
                if (str == null || !str.equals(entry.getKey())) {
                    Object value = entry.getValue();
                    if (value instanceof String) {
                        String str3 = (String) value;
                        if (nr8.c(str3) && (str2 == null || str2.equals("") || nr8.a(str3).equalsIgnoreCase(str2))) {
                            Object b = nr8.b(str3, jSONObject);
                            if (b instanceof JSONObject) {
                                jSONObject2.put(entry.getKey(), (Object) b((JSONObject) b));
                            } else if (b instanceof JSONArray) {
                                jSONObject2.put(entry.getKey(), (Object) a((JSONArray) b));
                            } else {
                                jSONObject2.put(entry.getKey(), b);
                            }
                        }
                    } else if (value instanceof JSONObject) {
                        e(value, jSONObject, str, str2);
                    } else if (value instanceof JSONArray) {
                        e(value, jSONObject, str, str2);
                    }
                }
            }
        } else if (obj instanceof JSONArray) {
            JSONArray jSONArray = (JSONArray) obj;
            int size = jSONArray.size();
            for (int i = 0; i < size; i++) {
                Object obj2 = jSONArray.get(i);
                if (obj2 instanceof String) {
                    String str4 = (String) obj2;
                    if (nr8.c(str4)) {
                        Object b2 = nr8.b(str4, jSONObject);
                        if (b2 instanceof JSONObject) {
                            jSONArray.set(i, b((JSONObject) b2));
                        } else if (b2 instanceof JSONArray) {
                            jSONArray.set(i, a((JSONArray) b2));
                        } else {
                            jSONArray.set(i, b2);
                        }
                    }
                } else if (obj2 instanceof JSONObject) {
                    e(obj2, jSONObject, str, str2);
                } else if (obj2 instanceof JSONArray) {
                    e(obj2, jSONObject, str, str2);
                }
            }
        }
    }

    public static void f(Object obj, JSONObject jSONObject, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42d84f78", new Object[]{obj, jSONObject, str});
        } else {
            g(obj, jSONObject, str, "");
        }
    }

    public static void g(Object obj, JSONObject jSONObject, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bba58b42", new Object[]{obj, jSONObject, str, str2});
        } else if (obj != null && jSONObject != null) {
            e(obj, jSONObject, str, str2);
        }
    }
}
