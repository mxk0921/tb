package com.taobao.android.behavir.util;

import androidx.collection.ArrayMap;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.parser.ParserConfig;
import com.alibaba.fastjson.util.TypeUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final JSONObject EMPTY_JSON = new JSONObject(Collections.emptyMap());

    /* compiled from: Taobao */
    /* renamed from: com.taobao.android.behavir.util.a$a  reason: collision with other inner class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class C0336a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final JSONObject f6447a = new JSONObject(a.f(16));

        static {
            t2o.a(404750422);
        }

        public JSONObject a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (JSONObject) ipChange.ipc$dispatch("d1d5fb15", new Object[]{this});
            }
            return this.f6447a;
        }

        public C0336a b(String str, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (C0336a) ipChange.ipc$dispatch("a2b4eee3", new Object[]{this, str, obj});
            }
            this.f6447a.put(str, obj);
            return this;
        }
    }

    static {
        t2o.a(404750421);
    }

    public static void a(JSON json, JSONObject jSONObject, Set<String> set) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cbfba256", new Object[]{json, jSONObject, set});
        } else if (jSONObject.size() < set.size()) {
            if (json instanceof JSONObject) {
                for (Map.Entry<String, Object> entry : ((JSONObject) json).entrySet()) {
                    String key = entry.getKey();
                    Object value = entry.getValue();
                    if (set.contains(key) && !jSONObject.containsKey(key)) {
                        jSONObject.put(key, value);
                    }
                    if (value instanceof JSON) {
                        a((JSON) value, jSONObject, set);
                    }
                }
            } else if (json instanceof JSONArray) {
                Iterator<Object> it = ((JSONArray) json).iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    if (next instanceof JSON) {
                        a((JSON) next, jSONObject, set);
                    }
                }
            }
        }
    }

    public static JSONObject b(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("a7d4859a", new Object[]{str, obj});
        }
        JSONObject jSONObject = new JSONObject(f(1));
        jSONObject.put(str, obj);
        return jSONObject;
    }

    public static JSONObject c(String str, Object obj, String str2, Object obj2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("fba633c0", new Object[]{str, obj, str2, obj2});
        }
        JSONObject jSONObject = new JSONObject(f(2));
        jSONObject.put(str, obj);
        jSONObject.put(str2, obj2);
        return jSONObject;
    }

    public static JSONObject d(String str, Object obj, String str2, Object obj2, String str3, Object obj3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("77a246e6", new Object[]{str, obj, str2, obj2, str3, obj3});
        }
        JSONObject jSONObject = new JSONObject(f(3));
        jSONObject.put(str, obj);
        jSONObject.put(str2, obj2);
        jSONObject.put(str3, obj3);
        return jSONObject;
    }

    public static JSONObject e(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("1dbc7dcf", new Object[]{str, obj});
        }
        return new JSONObject(Collections.singletonMap(str, obj));
    }

    public static <K, V> Map<K, V> f(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("5084f23b", new Object[]{new Integer(i)});
        }
        return new ArrayMap(i);
    }

    public static C0336a g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (C0336a) ipChange.ipc$dispatch("e9986013", new Object[0]);
        }
        return new C0336a();
    }

    public static int h(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6ab504bb", new Object[]{new Integer(i)})).intValue();
        }
        return (int) Math.ceil(i / 0.75d);
    }

    public static JSONObject i(JSON json, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("29c53e4f", new Object[]{json, strArr});
        }
        if (json == null) {
            return EMPTY_JSON;
        }
        JSONObject jSONObject = new JSONObject(h(strArr.length));
        a(json, jSONObject, new HashSet(Arrays.asList(strArr)));
        return jSONObject;
    }

    public static JSONObject j(Map<String, ?> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("5c1f107b", new Object[]{map});
        }
        if (map == null) {
            return EMPTY_JSON;
        }
        if (map instanceof JSONObject) {
            return (JSONObject) map;
        }
        return new JSONObject(new HashMap(map));
    }

    public static <T> List<T> k(JSONArray jSONArray, Class<T> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("4c51a714", new Object[]{jSONArray, cls});
        }
        if (jSONArray == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(jSONArray.size());
        ParserConfig globalInstance = ParserConfig.getGlobalInstance();
        Iterator<Object> it = jSONArray.iterator();
        while (it.hasNext()) {
            arrayList.add(TypeUtils.cast(it.next(), (Class<Object>) cls, globalInstance));
        }
        return arrayList;
    }
}
