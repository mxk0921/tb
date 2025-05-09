package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class srf {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(444597073);
    }

    public static <T> T b(String str, JSONObject jSONObject, T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("2028fbcd", new Object[]{str, jSONObject, t});
        }
        if (!TextUtils.isEmpty(str) && jSONObject != null) {
            try {
                T t2 = (T) jSONObject.get(str);
                if (t2 == null) {
                    return t;
                }
                return t2;
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        return t;
    }

    public static Boolean c(String str, JSONObject jSONObject, Boolean bool) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Boolean) ipChange.ipc$dispatch("8393d5d", new Object[]{str, jSONObject, bool});
        }
        if (!TextUtils.isEmpty(str) && jSONObject != null) {
            try {
                Boolean bool2 = jSONObject.getBoolean(str);
                if (bool2 == null) {
                    return bool;
                }
                return bool2;
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        return bool;
    }

    public static float d(String str, JSONObject jSONObject, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("71de7fb7", new Object[]{str, jSONObject, new Float(f)})).floatValue();
        }
        if (!TextUtils.isEmpty(str) && jSONObject != null) {
            try {
                Float f2 = jSONObject.getFloat(str);
                if (f2 == null) {
                    return f;
                }
                return f2.floatValue();
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        return f;
    }

    public static int e(String str, JSONObject jSONObject, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6b75b610", new Object[]{str, jSONObject, new Integer(i)})).intValue();
        }
        if (!TextUtils.isEmpty(str) && jSONObject != null) {
            try {
                Integer integer = jSONObject.getInteger(str);
                if (integer == null) {
                    return i;
                }
                return integer.intValue();
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        return i;
    }

    public static JSONArray f(String str, JSONObject jSONObject, JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONArray) ipChange.ipc$dispatch("5b5e5f32", new Object[]{str, jSONObject, jSONArray});
        }
        if (!TextUtils.isEmpty(str) && jSONObject != null) {
            try {
                JSONArray jSONArray2 = jSONObject.getJSONArray(str);
                if (jSONArray2 == null) {
                    return jSONArray;
                }
                return jSONArray2;
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        return jSONArray;
    }

    public static JSONObject g(String str, JSONObject jSONObject, JSONObject jSONObject2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("d125b68e", new Object[]{str, jSONObject, jSONObject2});
        }
        if (!TextUtils.isEmpty(str) && jSONObject != null) {
            try {
                JSONObject jSONObject3 = jSONObject.getJSONObject(str);
                if (jSONObject3 == null) {
                    return jSONObject2;
                }
                return jSONObject3;
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        return jSONObject2;
    }

    public static String h(String str, JSONObject jSONObject, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6525b97e", new Object[]{str, jSONObject, str2});
        }
        if (!TextUtils.isEmpty(str) && jSONObject != null) {
            try {
                String string = jSONObject.getString(str);
                if (string == null) {
                    return str2;
                }
                return string;
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        return str2;
    }

    public static <T> JSONObject i(T t, boolean z, Class<? super T> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("c8498996", new Object[]{t, new Boolean(z), cls});
        }
        if (t == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        j(jSONObject, t.getClass(), t, z, cls);
        return jSONObject;
    }

    public static <T> void j(JSONObject jSONObject, Class<?> cls, T t, boolean z, Class<? super T> cls2) {
        Field[] declaredFields;
        if (cls != null && cls != Object.class) {
            try {
                for (Field field : cls.getDeclaredFields()) {
                    if (!z || !Modifier.isStatic(field.getModifiers())) {
                        field.setAccessible(true);
                        if (!jSONObject.containsKey(field.getName())) {
                            jSONObject.put(field.getName(), field.get(t));
                        }
                    }
                }
                if (!(cls2 == null || cls == cls2)) {
                    j(jSONObject, cls.getSuperclass(), t, z, cls2);
                }
            } catch (Exception e) {
                xv5.b(e);
            }
        }
    }

    public static void a(JSONObject jSONObject, JSONObject jSONObject2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6fcb9b9f", new Object[]{jSONObject, jSONObject2});
            return;
        }
        for (Map.Entry<String, Object> entry : jSONObject.entrySet()) {
            Object value = entry.getValue();
            if (value instanceof JSONObject) {
                JSONObject jSONObject3 = new JSONObject();
                a((JSONObject) value, jSONObject3);
                jSONObject2.put(entry.getKey(), (Object) jSONObject3);
            } else if (value instanceof JSONArray) {
                JSONArray jSONArray = (JSONArray) value;
                JSONArray jSONArray2 = new JSONArray();
                int size = jSONArray.size();
                for (int i = 0; i < size; i++) {
                    JSONObject jSONObject4 = new JSONObject();
                    Object obj = jSONArray.get(i);
                    if (obj instanceof JSONObject) {
                        a((JSONObject) obj, jSONObject4);
                        jSONArray2.add(jSONObject4);
                    } else if ((obj instanceof String) || (obj instanceof Number)) {
                        jSONArray2.add(obj);
                    } else {
                        String jSONString = JSON.toJSONString(obj);
                        jSONArray2.add(JSON.parse(jSONString));
                        la6.b("命中deepClone else逻辑" + jSONString);
                    }
                }
                jSONObject2.put(entry.getKey(), (Object) jSONArray2);
            } else if (entry.getValue() != null) {
                jSONObject2.put(entry.getKey(), entry.getValue());
            }
        }
    }
}
