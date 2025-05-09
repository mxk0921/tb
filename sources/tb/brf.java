package tb;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.LinkedHashMap;
import kotlin.Pair;
import kotlin.Result;
import kotlin.b;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class brf {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(766509494);
    }

    public static final boolean c(JSONArray jSONArray, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7f4027c6", new Object[]{jSONArray, new Integer(i)})).booleanValue();
        }
        ckf.g(jSONArray, "<this>");
        if (i >= jSONArray.size()) {
            return true;
        }
        return false;
    }

    public static final String d(JSONObject jSONObject, String str) {
        String string;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c6e85f20", new Object[]{jSONObject, str});
        }
        if (jSONObject == null || (string = jSONObject.getString(str)) == null) {
            return "";
        }
        return string;
    }

    public static final Object e(JSONArray jSONArray, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("b3b76e47", new Object[]{jSONArray, new Integer(i)});
        }
        ckf.g(jSONArray, "<this>");
        if (c(jSONArray, i)) {
            return null;
        }
        return jSONArray.get(i);
    }

    public static final JSONArray f(JSONArray jSONArray, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONArray) ipChange.ipc$dispatch("ef1e8072", new Object[]{jSONArray, new Integer(i)});
        }
        ckf.g(jSONArray, "<this>");
        if (c(jSONArray, i)) {
            return null;
        }
        return jSONArray.getJSONArray(i);
    }

    public static final JSONObject g(JSONArray jSONArray, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("8c9ddcc4", new Object[]{jSONArray, new Integer(i)});
        }
        ckf.g(jSONArray, "<this>");
        if (c(jSONArray, i)) {
            return null;
        }
        return jSONArray.getJSONObject(i);
    }

    public static final JSONObject h(JSONObject jSONObject, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("b5d8aa63", new Object[]{jSONObject, str});
        }
        if (jSONObject == null) {
            return null;
        }
        return jSONObject.getJSONObject(str);
    }

    public static final String i(JSONObject jSONObject, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b3349027", new Object[]{jSONObject, str});
        }
        if (jSONObject == null) {
            return null;
        }
        return jSONObject.getString(str);
    }

    public static final JSONArray j(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONArray) ipChange.ipc$dispatch("2b8dac82", new Object[]{str});
        }
        try {
            return JSON.parseArray(str);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static final JSONObject k(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("21ef97de", new Object[]{str});
        }
        try {
            return JSON.parseObject(str);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static final JSONObject l(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("ddca16db", new Object[]{bArr});
        }
        return k(r54.K(bArr));
    }

    public static final <T> T m(JSONObject jSONObject, Class<T> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("77bd58d6", new Object[]{jSONObject, cls});
        }
        ckf.g(cls, "clazz");
        Object obj = null;
        if (jSONObject != null) {
            try {
                obj = jSONObject.toJavaObject(cls);
            } catch (Throwable th) {
                Result.m1108constructorimpl(b.a(th));
            }
        }
        Result.m1108constructorimpl(xhv.INSTANCE);
        return (T) obj;
    }

    public static final JSONObject a(Pair<String, ? extends Object>... pairArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("958d4e0", new Object[]{pairArr});
        }
        ckf.g(pairArr, "pairs");
        JSONObject jSONObject = new JSONObject();
        for (Pair<String, ? extends Object> pair : pairArr) {
            jSONObject.put((JSONObject) pair.getFirst(), (String) pair.getSecond());
        }
        return jSONObject;
    }

    public static final JSONObject b(Pair<String, ? extends Object>... pairArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("3b4d9847", new Object[]{pairArr});
        }
        ckf.g(pairArr, "pairs");
        JSONObject jSONObject = new JSONObject(new LinkedHashMap());
        for (Pair<String, ? extends Object> pair : pairArr) {
            jSONObject.put((JSONObject) pair.getFirst(), (String) pair.getSecond());
        }
        return jSONObject;
    }
}
