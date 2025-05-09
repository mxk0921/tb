package tb;

import android.content.Context;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.adaemon.TriggerChannelService;
import com.taobao.android.dinamicx.monitor.DXTraceUtil;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class pxv {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(87031934);
    }

    public static Object a(Object obj) throws JSONException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("53698fd", new Object[]{obj});
        }
        if (obj == JSONObject.NULL) {
            return null;
        }
        if (obj instanceof JSONObject) {
            return o((JSONObject) obj);
        }
        if (obj instanceof JSONArray) {
            return n((JSONArray) obj);
        }
        return obj;
    }

    public static boolean b(Map<String, Object> map, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f9f0bacf", new Object[]{map, str, new Boolean(z)})).booleanValue();
        }
        if (map != null && !TextUtils.isEmpty(str)) {
            Object obj = map.get(str);
            if (obj == null) {
                return z;
            }
            if (obj instanceof Boolean) {
                return ((Boolean) obj).booleanValue();
            }
            if (obj instanceof String) {
                try {
                    return Boolean.parseBoolean((String) obj);
                } catch (Throwable unused) {
                }
            }
        }
        return z;
    }

    public static Map<String, fr8> c(Map<String, Object> map) {
        fr8 fr8Var;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("913b717e", new Object[]{map});
        }
        Object obj = map.get("interceptors");
        if (obj == null || !(obj instanceof Map)) {
            return null;
        }
        HashMap hashMap = new HashMap(8);
        for (Map.Entry entry : ((Map) obj).entrySet()) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            if ((key instanceof String) && (value instanceof Map)) {
                try {
                    fr8Var = e((Map) value, DXTraceUtil.TYPE_EXPRESSION_STRING);
                } catch (Exception unused) {
                    fr8Var = null;
                }
                if (fr8Var != null) {
                    hashMap.put((String) key, fr8Var);
                }
            }
        }
        return hashMap;
    }

    public static double d(Map<String, Object> map, String str, double d) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("94605e2e", new Object[]{map, str, new Double(d)})).doubleValue();
        }
        if (map != null && !TextUtils.isEmpty(str)) {
            Object obj = map.get(str);
            if (obj == null) {
                return d;
            }
            if (obj instanceof Double) {
                return ((Double) obj).doubleValue();
            }
            if (obj instanceof String) {
                try {
                    return Double.parseDouble((String) obj);
                } catch (Throwable unused) {
                    return d;
                }
            } else {
                try {
                    return Double.valueOf(obj.toString()).doubleValue();
                } catch (Throwable unused2) {
                }
            }
        }
        return d;
    }

    public static fr8 e(Map<String, Object> map, String str) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (fr8) ipChange.ipc$dispatch("d79cefc2", new Object[]{map, str});
        }
        Object obj = map.get(str);
        if (obj == null) {
            return null;
        }
        if (obj instanceof String) {
            return fr8.a(null, (String) obj);
        }
        if (!(obj instanceof Map)) {
            return null;
        }
        try {
            jSONObject = new JSONObject((Map) obj);
        } catch (Throwable th) {
            gfh.c("unexpected json parse error.", th);
            jSONObject = null;
        }
        if (jSONObject == null) {
            return fr8.a(null, null);
        }
        String optString = jSONObject.optString(TriggerChannelService.EXTRA_ORIGIN, null);
        Object opt = jSONObject.opt("transformed");
        if (opt == null) {
            return fr8.a(null, null);
        }
        if (opt instanceof JSONObject) {
            return fr8.b(optString, (JSONObject) opt);
        }
        if (opt instanceof String) {
            return fr8.a(optString, (String) opt);
        }
        return fr8.a(optString, String.valueOf(obj));
    }

    public static Map<String, Object> f(Map<String, Object> map, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("aa5275d2", new Object[]{map, str});
        }
        if (map == null || TextUtils.isEmpty(str)) {
            return Collections.emptyMap();
        }
        Object obj = map.get(str);
        if (obj == null) {
            return Collections.emptyMap();
        }
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return Collections.emptyMap();
    }

    public static List<Map<String, Object>> g(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("441281d7", new Object[]{map});
        }
        Object obj = map.get("props");
        if (obj == null) {
            return null;
        }
        try {
            return (List) obj;
        } catch (Exception unused) {
            return null;
        }
    }

    public static String h(Map<String, Object> map, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("25482262", new Object[]{map, str});
        }
        Object obj = map.get(str);
        if (obj == null) {
            return null;
        }
        if (obj instanceof String) {
            return (String) obj;
        }
        return obj.toString();
    }

    @SafeVarargs
    public static <E> ArrayList<E> i(E... eArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("3f5e60ed", new Object[]{eArr});
        }
        ArrayList<E> arrayList = new ArrayList<>(eArr.length);
        Collections.addAll(arrayList, eArr);
        return arrayList;
    }

    @SafeVarargs
    public static <E> HashSet<E> j(E... eArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashSet) ipChange.ipc$dispatch("398213b3", new Object[]{eArr});
        }
        HashSet<E> hashSet = new HashSet<>(eArr.length);
        Collections.addAll(hashSet, eArr);
        return hashSet;
    }

    public static float k(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2e30d13e", new Object[]{new Float(f)})).floatValue();
        }
        float f2 = f % 360.0f;
        int i = (f2 > 0.0f ? 1 : (f2 == 0.0f ? 0 : -1));
        if (i >= 0) {
            if (i < 0 || f2 > 180.0f) {
                return (f2 % 180.0f) - 180.0f;
            }
            return f2;
        } else if (f2 <= -180.0f || f2 >= 0.0f) {
            return (f2 % 180.0f) + 180.0f;
        } else {
            return f2;
        }
    }

    public static int l(Context context, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3ff5eaa1", new Object[]{context, new Integer(i)})).intValue();
        }
        return (int) (context.getApplicationContext().getResources().getDisplayMetrics().density * i * 5.0f);
    }

    public static List n(JSONArray jSONArray) throws JSONException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("bee424ad", new Object[]{jSONArray});
        }
        if (jSONArray == null) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            arrayList.add(a(jSONArray.get(i)));
        }
        return arrayList;
    }

    public static Map<String, Object> o(JSONObject jSONObject) throws JSONException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("27f0818b", new Object[]{jSONObject});
        }
        if (jSONObject == null) {
            return Collections.emptyMap();
        }
        HashMap hashMap = new HashMap();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            hashMap.put(next, a(jSONObject.get(next)));
        }
        return hashMap;
    }

    public static Pair<Float, Float> m(String str, View view) {
        int indexOf;
        float f;
        int height;
        int width;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Pair) ipChange.ipc$dispatch("5c7174cc", new Object[]{str, view});
        }
        if (!TextUtils.isEmpty(str) && (indexOf = str.indexOf(32)) != -1) {
            int i = indexOf;
            while (i < str.length() && str.charAt(i) == ' ') {
                i++;
            }
            if (i < str.length() && str.charAt(i) != ' ') {
                String trim = str.substring(0, indexOf).trim();
                String trim2 = str.substring(i, str.length()).trim();
                float f2 = 0.0f;
                if ("left".equals(trim)) {
                    f = 0.0f;
                } else {
                    if ("right".equals(trim)) {
                        width = view.getWidth();
                    } else if ("center".equals(trim)) {
                        width = view.getWidth() / 2;
                    } else {
                        width = view.getWidth() / 2;
                    }
                    f = width;
                }
                if (!"top".equals(trim2)) {
                    if ("bottom".equals(trim2)) {
                        height = view.getHeight();
                    } else if ("center".equals(trim2)) {
                        height = view.getHeight() / 2;
                    } else {
                        height = view.getHeight() / 2;
                    }
                    f2 = height;
                }
                return new Pair<>(Float.valueOf(f), Float.valueOf(f2));
            }
        }
        return null;
    }
}
