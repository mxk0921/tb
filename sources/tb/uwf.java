package tb;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.parser.Feature;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class uwf {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(961544374);
    }

    public static <T> T a(String str, Class<T> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("dfabad98", new Object[]{str, cls});
        }
        try {
            return (T) JSON.parseObject(str, cls);
        } catch (Exception e) {
            ogh.h("JsonUtil", "json can not convert to ".concat(cls.getName()), e);
            return null;
        }
    }

    public static Map<String, Object> c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("93812ab8", new Object[]{str});
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> keys = jSONObject.keys();
            HashMap hashMap = new HashMap();
            while (keys.hasNext()) {
                String next = keys.next();
                hashMap.put(next, jSONObject.get(next));
            }
            return hashMap;
        } catch (Exception e) {
            ogh.h("JsonUtil", "json can not convert to map", e);
            return new HashMap();
        }
    }

    public static <T> String d(T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1d0dc6fa", new Object[]{t});
        }
        return JSON.toJSONString(t);
    }

    public static <T> String e(List<T> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("78a88c05", new Object[]{list});
        }
        return JSON.toJSONString(list);
    }

    public static String f(Map<String, ?> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("161d0c5", new Object[]{map});
        }
        return JSON.toJSONString(map);
    }

    public static <T> T b(String str, Type type) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("9066ab40", new Object[]{str, type});
        }
        try {
            return (T) JSON.parseObject(str, type, new Feature[0]);
        } catch (Exception e) {
            ogh.h("JsonUtil", "json can not convert to ".concat(type.getClass().getName()), e);
            return null;
        }
    }
}
