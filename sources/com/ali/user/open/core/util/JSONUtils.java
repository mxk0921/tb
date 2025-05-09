package com.ali.user.open.core.util;

import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class JSONUtils {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(71303244);
    }

    public static Boolean optBoolean(JSONObject jSONObject, String str) {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Boolean) ipChange.ipc$dispatch("82d2f309", new Object[]{jSONObject, str});
        }
        if (jSONObject.has(str)) {
            z = jSONObject.optBoolean(str);
        }
        return Boolean.valueOf(z);
    }

    public static Integer optInteger(JSONObject jSONObject, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Integer) ipChange.ipc$dispatch("a727235d", new Object[]{jSONObject, str});
        }
        if (jSONObject.has(str)) {
            return Integer.valueOf(jSONObject.optInt(str));
        }
        return null;
    }

    public static Long optLong(JSONObject jSONObject, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Long) ipChange.ipc$dispatch("28afe063", new Object[]{jSONObject, str});
        }
        if (jSONObject.has(str)) {
            return Long.valueOf(jSONObject.optLong(str));
        }
        return null;
    }

    public static String optString(JSONObject jSONObject, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9a315bc3", new Object[]{jSONObject, str});
        }
        if (jSONObject.has(str)) {
            return jSONObject.optString(str);
        }
        return null;
    }

    public static JSONArray toJsonArray(Object[] objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONArray) ipChange.ipc$dispatch("bc90fdbc", new Object[]{objArr});
        }
        JSONArray jSONArray = new JSONArray();
        for (Object obj : objArr) {
            if (obj instanceof Map) {
                jSONArray.put(toJsonObject((Map) obj));
            } else {
                jSONArray.put(obj);
            }
        }
        return jSONArray;
    }

    public static JSONObject toJsonObject(Map<String, ? extends Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("5fd030aa", new Object[]{map});
        }
        JSONObject jSONObject = new JSONObject();
        try {
            for (Map.Entry<String, ? extends Object> entry : map.entrySet()) {
                Object value = entry.getValue();
                if (value != null) {
                    if (value instanceof Map) {
                        jSONObject.put(entry.getKey(), toJsonObject((Map) value));
                    } else if (value instanceof List) {
                        jSONObject.put(entry.getKey(), toJsonArray((List) value));
                    } else if (value.getClass().isArray()) {
                        jSONObject.put(entry.getKey(), toJsonArray((Object[]) value));
                    } else {
                        jSONObject.put(entry.getKey(), value);
                    }
                }
            }
            return jSONObject;
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }

    public static List<Object> toList(JSONArray jSONArray) throws JSONException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("bee424ad", new Object[]{jSONArray});
        }
        if (jSONArray == null) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList(jSONArray.length());
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            Object obj = jSONArray.get(i);
            if (obj instanceof JSONObject) {
                arrayList.add(toMap((JSONObject) obj));
            } else if (obj instanceof JSONArray) {
                arrayList.add(toList((JSONArray) obj));
            } else {
                arrayList.add(jSONArray.get(i));
            }
        }
        return arrayList;
    }

    public static Map<String, Object> toMap(JSONObject jSONObject) throws JSONException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("27f0818b", new Object[]{jSONObject});
        }
        HashMap hashMap = new HashMap();
        if (jSONObject == null) {
            return hashMap;
        }
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            Object opt = jSONObject.opt(next);
            if (opt instanceof JSONObject) {
                hashMap.put(next, toMap((JSONObject) opt));
            } else if (opt instanceof JSONArray) {
                hashMap.put(next, toList((JSONArray) opt));
            } else {
                hashMap.put(next, opt);
            }
        }
        return hashMap;
    }

    public static <T> T toPOJO(JSONObject jSONObject, Class<T> cls) {
        Field[] fields;
        char c;
        Object obj;
        if (jSONObject == null || cls == null || cls == Void.TYPE) {
            return null;
        }
        try {
            T newInstance = cls.newInstance();
            for (Field field : cls.getFields()) {
                Class<?> type = field.getType();
                String name = field.getName();
                if (jSONObject.has(name)) {
                    if (!type.isPrimitive()) {
                        if (type == String.class) {
                            obj = jSONObject.getString(name);
                        } else {
                            if (!(type == Boolean.class || type == Integer.class || type == Short.class || type == Long.class || type == Double.class)) {
                                if (type.isArray()) {
                                    obj = toPOJOArray(jSONObject.getJSONArray(name), type.getComponentType());
                                } else if (Map.class.isAssignableFrom(type)) {
                                    obj = toMap(jSONObject.getJSONObject(name));
                                } else {
                                    obj = toPOJO(jSONObject.getJSONObject(name), type);
                                }
                            }
                            obj = jSONObject.get(name);
                        }
                        field.set(newInstance, obj);
                    } else if (type == Boolean.TYPE) {
                        field.setBoolean(newInstance, jSONObject.getBoolean(name));
                    } else if (type == Byte.TYPE) {
                        field.setByte(newInstance, (byte) jSONObject.getInt(name));
                    } else if (type == Character.TYPE) {
                        String string = jSONObject.getString(name);
                        if (!(string == null || string.length() == 0)) {
                            c = string.charAt(0);
                            field.setChar(newInstance, c);
                        }
                        c = 0;
                        field.setChar(newInstance, c);
                    } else if (type == Short.TYPE) {
                        field.setShort(newInstance, (short) jSONObject.getInt(name));
                    } else if (type == Integer.TYPE) {
                        field.setInt(newInstance, jSONObject.getInt(name));
                    } else if (type == Long.TYPE) {
                        field.setLong(newInstance, jSONObject.getLong(name));
                    } else if (type == Float.TYPE) {
                        field.setFloat(newInstance, (float) jSONObject.getDouble(name));
                    } else if (type == Double.TYPE) {
                        field.setDouble(newInstance, jSONObject.getDouble(name));
                    }
                }
            }
            return newInstance;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static <T> T[] toPOJOArray(JSONArray jSONArray, Class<T> cls) {
        char c;
        Object obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T[]) ((Object[]) ipChange.ipc$dispatch("b29b97c3", new Object[]{jSONArray, cls}));
        }
        if (jSONArray == null || cls == null || cls == Void.TYPE) {
            return null;
        }
        Object newInstance = Array.newInstance((Class<?>) cls, jSONArray.length());
        for (int i = 0; i < jSONArray.length(); i++) {
            try {
                if (!cls.isPrimitive()) {
                    if (cls == String.class) {
                        obj = jSONArray.getString(i);
                    } else {
                        if (!(cls == Boolean.class || cls == Integer.class || cls == Short.class || cls == Long.class || cls == Double.class)) {
                            if (cls.isArray()) {
                                obj = toPOJOArray(jSONArray.getJSONArray(i), cls.getComponentType());
                            } else if (Map.class.isAssignableFrom(cls)) {
                                obj = toMap(jSONArray.getJSONObject(i));
                            } else {
                                obj = toPOJO(jSONArray.getJSONObject(i), cls);
                            }
                        }
                        obj = jSONArray.get(i);
                    }
                    Array.set(newInstance, i, obj);
                } else if (cls == Boolean.TYPE) {
                    Array.setBoolean(newInstance, i, jSONArray.getBoolean(i));
                } else if (cls == Byte.TYPE) {
                    Array.setByte(newInstance, i, (byte) jSONArray.getInt(i));
                } else if (cls == Character.TYPE) {
                    String string = jSONArray.getString(i);
                    if (!(string == null || string.length() == 0)) {
                        c = string.charAt(0);
                        Array.setChar(newInstance, i, c);
                    }
                    c = 0;
                    Array.setChar(newInstance, i, c);
                } else if (cls == Short.TYPE) {
                    Array.setShort(newInstance, i, (short) jSONArray.getInt(i));
                } else if (cls == Integer.TYPE) {
                    Array.setInt(newInstance, i, jSONArray.getInt(i));
                } else if (cls == Long.TYPE) {
                    Array.setLong(newInstance, i, jSONArray.getLong(i));
                } else if (cls == Float.TYPE) {
                    Array.setFloat(newInstance, i, (float) jSONArray.getDouble(i));
                } else if (cls == Double.TYPE) {
                    Array.setDouble(newInstance, i, jSONArray.getDouble(i));
                }
            } catch (JSONException e) {
                throw new RuntimeException(e);
            }
        }
        return (T[]) ((Object[]) newInstance);
    }

    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2, types: [T] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Byte[]] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Character[], T] */
    /* JADX WARN: Unknown variable types count: 2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static <T> T parseStringValue(java.lang.String r10, java.lang.Class<T> r11) {
        /*
            Method dump skipped, instructions count: 424
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ali.user.open.core.util.JSONUtils.parseStringValue(java.lang.String, java.lang.Class):java.lang.Object");
    }

    public static JSONArray toJsonArray(List<Object> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONArray) ipChange.ipc$dispatch("6c9bd62", new Object[]{list});
        }
        JSONArray jSONArray = new JSONArray();
        for (Object obj : list) {
            if (obj instanceof Map) {
                jSONArray.put(toJsonObject((Map) obj));
            } else {
                jSONArray.put(obj);
            }
        }
        return jSONArray;
    }
}
