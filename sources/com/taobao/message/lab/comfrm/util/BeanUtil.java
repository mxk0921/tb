package com.taobao.message.lab.comfrm.util;

import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class BeanUtil {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final Map<Integer, Field> sMap = new ConcurrentHashMap();

    static {
        t2o.a(529531022);
    }

    public static Object get(Object obj, String str) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("19fb748f", new Object[]{obj, str});
        }
        List<String> split = split(str);
        for (int i2 = 0; i2 < split.size(); i2++) {
            if (obj == null) {
                return null;
            }
            String str2 = split.get(i2);
            if (str2.contains("]")) {
                try {
                    i = Integer.parseInt(str2.substring(0, str2.lastIndexOf(93)));
                } catch (Exception unused) {
                    i = -1;
                }
                if (i < 0) {
                    continue;
                } else if (obj instanceof List) {
                    List list = (List) obj;
                    if (i >= list.size()) {
                        return null;
                    }
                    obj = list.get(i);
                } else if (obj instanceof Object[]) {
                    Object[] objArr = (Object[]) obj;
                    if (i >= objArr.length) {
                        return null;
                    }
                    obj = objArr[i];
                } else if (obj instanceof JSONArray) {
                    JSONArray jSONArray = (JSONArray) obj;
                    if (i < jSONArray.length()) {
                        try {
                            obj = jSONArray.get(i);
                        } catch (JSONException unused2) {
                        }
                    }
                    return null;
                } else {
                    continue;
                }
            } else {
                obj = getRaw(obj, str2);
            }
        }
        return obj;
    }

    public static Field getField(Class<?> cls, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Field) ipChange.ipc$dispatch("90de8d19", new Object[]{cls, str});
        }
        if (cls == null) {
            return null;
        }
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            return getField(cls.getSuperclass(), str);
        }
    }

    public static Object getRaw(Object obj, String str) {
        if (obj instanceof Map) {
            return ((Map) obj).get(str);
        }
        if (obj instanceof JSONObject) {
            try {
                return ((JSONObject) obj).get(str);
            } catch (JSONException unused) {
                return null;
            }
        } else if (obj == null) {
            return obj;
        } else {
            int hashCode = obj.getClass().hashCode() + str.hashCode();
            Map<Integer, Field> map = sMap;
            Field field = map.get(Integer.valueOf(hashCode));
            if (field == null) {
                field = getField(obj.getClass(), str);
                if (field == null) {
                    return null;
                }
                field.setAccessible(true);
                map.put(Integer.valueOf(hashCode), field);
            }
            try {
                return field.get(obj);
            } catch (IllegalAccessException e) {
                e.printStackTrace();
                return obj;
            }
        }
    }

    private static List<String> split(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("6c2db0bc", new Object[]{str});
        }
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (int i2 = 0; i2 < str.length(); i2++) {
            char charAt = str.charAt(i2);
            if (charAt == '.' || charAt == '[') {
                if (i != i2) {
                    arrayList.add(str.substring(i, i2));
                }
                i = i2 + 1;
            }
        }
        if (i == 0) {
            arrayList.add(str);
        } else {
            arrayList.add(str.substring(i));
        }
        return arrayList;
    }
}
