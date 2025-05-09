package tb;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.basic.TMSLogger;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.JvmStatic;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class arf {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final arf INSTANCE = new arf();

    static {
        t2o.a(839909954);
    }

    @JvmStatic
    public static final JSONArray g(String str) {
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

    @JvmStatic
    public static final <T> List<T> h(String str, Class<T> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("8d952fa6", new Object[]{str, cls});
        }
        ckf.g(cls, "clazz");
        try {
            return JSON.parseArray(str, cls);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @JvmStatic
    public static final JSONObject i(String str) {
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

    public final JSONArray a(List<? extends Object> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONArray) ipChange.ipc$dispatch("9616ef43", new Object[]{this, list});
        }
        JSONArray jSONArray = new JSONArray();
        if (list != null) {
            for (Object obj : list) {
                jSONArray.add(obj);
            }
        }
        return jSONArray;
    }

    public final Integer c(JSONObject jSONObject, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Integer) ipChange.ipc$dispatch("8bda4e78", new Object[]{this, jSONObject, str});
        }
        ckf.g(jSONObject, "<this>");
        ckf.g(str, "key");
        try {
            return jSONObject.getInteger(str);
        } catch (Exception e) {
            TMSLogger.c("JSONExt", e.getMessage(), e);
            return null;
        }
    }

    public final JSONArray d(JSONObject jSONObject, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONArray) ipChange.ipc$dispatch("966446c0", new Object[]{this, jSONObject, str});
        }
        ckf.g(jSONObject, "<this>");
        ckf.g(str, "key");
        try {
            return jSONObject.getJSONArray(str);
        } catch (Exception e) {
            TMSLogger.c("JSONExt", e.getMessage(), e);
            return null;
        }
    }

    public final JSONObject e(JSONObject jSONObject, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("74d4cfbc", new Object[]{this, jSONObject, str});
        }
        ckf.g(jSONObject, "<this>");
        ckf.g(str, "key");
        try {
            return jSONObject.getJSONObject(str);
        } catch (Exception e) {
            TMSLogger.c("JSONExt", e.getMessage(), e);
            return null;
        }
    }

    public final List<String> f(JSONObject jSONObject, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("b8b8053", new Object[]{this, jSONObject, str});
        }
        ckf.g(jSONObject, "<this>");
        ckf.g(str, "key");
        JSONArray<Object> d = d(jSONObject, str);
        if (d == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(zz3.q(d, 10));
        for (Object obj : d) {
            arrayList.add(obj.toString());
        }
        return arrayList;
    }

    @JvmStatic
    public static final JSONObject b(Pair<String, ? extends Object>... pairArr) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("958d4e0", new Object[]{pairArr});
        }
        ckf.g(pairArr, "pairs");
        JSONObject jSONObject = new JSONObject();
        int length = pairArr.length;
        while (i < length) {
            Pair<String, ? extends Object> pair = pairArr[i];
            i++;
            jSONObject.put((JSONObject) pair.getFirst(), (String) pair.getSecond());
        }
        return jSONObject;
    }
}
