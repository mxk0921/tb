package tb;

import android.text.TextUtils;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class wrf {

    /* renamed from: a  reason: collision with root package name */
    public static final awf f30871a = new awf();

    public static <T> T a(JSONObject jSONObject, T t, List<Field> list) {
        if (!(jSONObject == null || t == null)) {
            Class<?> cls = t.getClass();
            awf awfVar = f30871a;
            etx a2 = awfVar.a(cls);
            if (a2 == null) {
                a2 = new etx(cls);
                awfVar.b(cls, a2);
            }
            List<Field> list2 = a2.b;
            if (list2 != null) {
                ArrayList arrayList = (ArrayList) list2;
                if (arrayList.size() > 0) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        Field field = (Field) it.next();
                        ywx a3 = a2.a(field.getName());
                        if (a3 == null) {
                            a3 = new ywx(field);
                            a2.b(field.getName(), a3);
                        }
                        if (!a3.c) {
                            String str = a3.f32399a;
                            if (jSONObject.has(str)) {
                                if (a3.a()) {
                                    m(field, str, jSONObject, t);
                                } else if (a3.c()) {
                                    try {
                                        field.setAccessible(true);
                                        pxf pxfVar = (pxf) a3.b.newInstance();
                                        Object opt = jSONObject.opt(str);
                                        if (opt instanceof JSONObject) {
                                            pxfVar.fromJson((JSONObject) opt);
                                        } else if (opt instanceof String) {
                                            pxfVar.fromJson(new JSONObject(String.valueOf(opt)));
                                        }
                                        field.set(t, pxfVar);
                                        field = null;
                                    } catch (Exception e) {
                                        e.printStackTrace();
                                    }
                                }
                            }
                            if (!(field == null || list == null)) {
                                list.add(field);
                            }
                        }
                    }
                }
            }
        }
        return t;
    }

    public static <T> T b(JSONObject jSONObject, swf<T> swfVar, List<Field> list) {
        T newInstance = swfVar.newInstance();
        if (!(newInstance instanceof pxf)) {
            return (T) a(jSONObject, newInstance, list);
        }
        ((pxf) newInstance).fromJson(jSONObject);
        return newInstance;
    }

    public static boolean c(Class<?> cls) {
        if (Boolean.TYPE.equals(cls) || Boolean.class.equals(cls) || boolean[].class.equals(cls) || Boolean[].class.equals(cls)) {
            return true;
        }
        return false;
    }

    public static boolean d(Class<?> cls) {
        if (Byte.TYPE.equals(cls) || Byte.class.equals(cls) || byte[].class.equals(cls) || Byte[].class.equals(cls) || Character.TYPE.equals(cls) || Character.class.equals(cls) || char[].class.equals(cls) || Character[].class.equals(cls)) {
            return true;
        }
        return false;
    }

    public static boolean e(Class<?> cls) {
        if (Integer.TYPE.equals(cls) || Integer.class.equals(cls) || int[].class.equals(cls) || Integer[].class.equals(cls) || Short.TYPE.equals(cls) || Short.class.equals(cls) || short[].class.equals(cls) || Short[].class.equals(cls) || Long.TYPE.equals(cls) || Long.class.equals(cls) || long[].class.equals(cls) || Long[].class.equals(cls) || Float.TYPE.equals(cls) || Float.class.equals(cls) || float[].class.equals(cls) || Float[].class.equals(cls) || Double.TYPE.equals(cls) || Double.class.equals(cls) || double[].class.equals(cls) || Double[].class.equals(cls)) {
            return true;
        }
        return false;
    }

    public static boolean f(Class<?> cls) {
        if (String.class.equals(cls) || StringBuilder.class.equals(cls) || String[].class.equals(cls) || StringBuilder[].class.equals(cls) || StringBuffer.class.equals(cls) || CharSequence.class.equals(cls) || StringBuffer[].class.equals(cls) || CharSequence[].class.equals(cls)) {
            return true;
        }
        return false;
    }

    public static Map<String, Integer> g(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.length() <= 0) {
                return null;
            }
            HashMap hashMap = new HashMap(jSONObject.length());
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                hashMap.put(next, Integer.valueOf(jSONObject.getInt(next)));
            }
            return hashMap;
        } catch (JSONException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static Map<String, String> h(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        try {
            if (jSONObject.length() <= 0) {
                return null;
            }
            HashMap hashMap = new HashMap(jSONObject.length());
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                hashMap.put(next, jSONObject.getString(next));
            }
            return hashMap;
        } catch (JSONException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static <T extends pxf> JSONArray i(Collection<T> collection) {
        JSONArray jSONArray = new JSONArray();
        if (collection != null && collection.size() > 0) {
            for (T t : collection) {
                jSONArray.put(t.toJson());
            }
        }
        return jSONArray;
    }

    public static <T extends pxf> JSONArray j(List<T> list) {
        return i(list);
    }

    public static <T extends pxf> List<T> k(String str, swf<T> swfVar) {
        try {
            return l(new JSONArray(str), swfVar);
        } catch (JSONException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static <T extends pxf> List<T> l(JSONArray jSONArray, swf<T> swfVar) {
        if (jSONArray == null) {
            return null;
        }
        try {
            int length = jSONArray.length();
            if (length <= 0) {
                return null;
            }
            ArrayList arrayList = new ArrayList(length);
            for (int i = 0; i < length; i++) {
                String string = jSONArray.getString(i);
                if (!TextUtils.isEmpty(string)) {
                    JSONObject jSONObject = new JSONObject(string);
                    T newInstance = swfVar.newInstance();
                    newInstance.fromJson(jSONObject);
                    arrayList.add(newInstance);
                }
            }
            return arrayList;
        } catch (JSONException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static boolean m(Field field, String str, JSONObject jSONObject, Object obj) {
        Object valueOf;
        try {
            field.setAccessible(true);
            Class<?> type = field.getType();
            if (String.class.equals(type)) {
                valueOf = jSONObject.optString(str);
            } else {
                if (!Boolean.TYPE.equals(type) && !Boolean.class.equals(type)) {
                    if (!Integer.TYPE.equals(type) && !Integer.class.equals(type)) {
                        if (!Long.TYPE.equals(type) && !Long.class.equals(type)) {
                            if (!Double.TYPE.equals(type) && !Double.class.equals(type)) {
                                valueOf = jSONObject.opt(str);
                            }
                            valueOf = Double.valueOf(jSONObject.optDouble(str));
                        }
                        valueOf = Long.valueOf(jSONObject.optLong(str));
                    }
                    valueOf = Integer.valueOf(jSONObject.optInt(str));
                }
                valueOf = Boolean.valueOf(jSONObject.optBoolean(str));
            }
            field.set(obj, valueOf);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public static JSONObject n(Object obj, List<Field> list) {
        return o(obj, list, false);
    }

    public static JSONObject o(Object obj, List<Field> list, boolean z) {
        JSONObject json;
        JSONObject jSONObject = new JSONObject();
        Class<?> cls = obj.getClass();
        awf awfVar = f30871a;
        etx a2 = awfVar.a(cls);
        if (a2 == null) {
            a2 = new etx(cls);
            awfVar.b(cls, a2);
        }
        List<Field> list2 = a2.b;
        if (list2 != null) {
            ArrayList arrayList = (ArrayList) list2;
            if (arrayList.size() > 0) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    Field field = (Field) it.next();
                    ywx a3 = a2.a(field.getName());
                    if (a3 == null) {
                        a3 = new ywx(field);
                        a2.b(field.getName(), a3);
                    }
                    if (!a3.c) {
                        boolean a4 = a3.a();
                        String str = a3.f32399a;
                        if (a4) {
                            try {
                                field.setAccessible(true);
                                Object obj2 = field.get(obj);
                                if (!z || obj2 != null) {
                                    jSONObject.put(str, obj2);
                                }
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                        } else {
                            if (a3.c()) {
                                field.setAccessible(true);
                                pxf pxfVar = (pxf) field.get(obj);
                                if (pxfVar != null && ((json = pxfVar.toJson()) != null || !z)) {
                                    jSONObject.put(str, json);
                                }
                            }
                            if (field != null && list != null) {
                                list.add(field);
                            }
                        }
                        field = null;
                        if (field != null) {
                            list.add(field);
                        }
                    }
                }
            }
        }
        return jSONObject;
    }
}
