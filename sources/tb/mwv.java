package tb;

import android.content.Context;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.mrt.task.MRTRuntimeException;
import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Vector;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class mwv {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(577765451);
    }

    public static boolean a(Object obj) throws MRTRuntimeException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9e1f8189", new Object[]{obj})).booleanValue();
        }
        if (obj != null && (obj instanceof String)) {
            return true;
        }
        throw new MRTRuntimeException(82, "config error");
    }

    public static void b(Closeable... closeableArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e368a0db", new Object[]{closeableArr});
        } else if (closeableArr != null) {
            for (Closeable closeable : closeableArr) {
                if (closeable != null) {
                    try {
                        closeable.close();
                    } catch (IOException e) {
                        kgh.d("Util", e.getMessage(), e);
                    }
                }
            }
        }
    }

    public static boolean c(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4c026001", new Object[]{context})).booleanValue();
        }
        try {
            if ((context.getApplicationInfo().flags & 2) != 0) {
                return true;
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    public static Map<String, Object> d(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("81a0d939", new Object[]{jSONObject});
        }
        HashMap hashMap = new HashMap();
        for (String str : jSONObject.keySet()) {
            Object obj = jSONObject.get(str);
            if (obj instanceof JSONArray) {
                ArrayList arrayList = new ArrayList();
                Iterator<Object> it = ((JSONArray) obj).iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    if (next instanceof JSONObject) {
                        arrayList.add(d((JSONObject) next));
                    } else {
                        arrayList.add(next);
                    }
                }
                hashMap.put(str.toString(), arrayList);
            } else if (obj instanceof JSONObject) {
                hashMap.put(h(str), d((JSONObject) obj));
            } else {
                hashMap.put(str.toString(), obj);
            }
        }
        return hashMap;
    }

    public static HashMap<String, Object> e(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("5084d64a", new Object[]{jSONObject});
        }
        HashMap<String, Object> hashMap = new HashMap<>();
        for (String str : jSONObject.keySet()) {
            Object obj = jSONObject.get(str);
            if (obj instanceof JSONArray) {
                Vector vector = new Vector();
                Iterator<Object> it = ((JSONArray) obj).iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    if (next instanceof JSONObject) {
                        vector.add(e((JSONObject) next));
                    } else {
                        vector.add(next);
                    }
                }
                hashMap.put(str.toString(), vector);
            } else if (obj instanceof JSONObject) {
                hashMap.put(h(str), e((JSONObject) obj));
            } else {
                hashMap.put(str.toString(), obj);
            }
        }
        return hashMap;
    }

    public static Map<String, Object> f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("7a34c3dc", new Object[]{str});
        }
        return d(JSON.parseObject(str));
    }

    public static HashMap<String, Object> g(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("9863c885", new Object[]{str});
        }
        return e(JSON.parseObject(str));
    }

    public static String h(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3cf5fa71", new Object[]{obj});
        }
        if (obj == null) {
            return null;
        }
        return "" + obj;
    }
}
