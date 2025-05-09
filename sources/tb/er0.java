package tb;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class er0 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final JSONObject f18771a;
    public final List<fr0> b;

    static {
        t2o.a(83886272);
    }

    public er0(JSONObject jSONObject) {
        this.f18771a = jSONObject;
        this.b = e(jSONObject);
    }

    public final HashMap<String, String> a(JSONObject jSONObject) {
        Object obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("b5a16be5", new Object[]{this, jSONObject});
        }
        if (jSONObject == null) {
            return null;
        }
        HashMap<String, String> hashMap = new HashMap<>();
        for (String str : jSONObject.keySet()) {
            if (!(str == null || (obj = jSONObject.get(str)) == null)) {
                if (obj instanceof String) {
                    hashMap.put(str, (String) obj);
                } else {
                    hashMap.put(str, String.valueOf(obj));
                }
            }
        }
        return hashMap;
    }

    public Map<String, String> b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("8b2b7c5a", new Object[]{this});
        }
        JSONObject c = c(this.f18771a);
        if (c == null) {
            return null;
        }
        return a(c.getJSONObject("commonArgs"));
    }

    public final JSONObject c(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("77cbb8c5", new Object[]{this, jSONObject});
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("global");
        if (jSONObject2 == null) {
            return null;
        }
        return jSONObject2.getJSONObject("performanceStage");
    }

    public List<fr0> d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("e1c45fce", new Object[]{this});
        }
        return this.b;
    }

    public final List<fr0> e(JSONObject jSONObject) {
        JSONArray jSONArray;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("3ba655b3", new Object[]{this, jSONObject});
        }
        JSONObject c = c(jSONObject);
        if (!(c == null || (jSONArray = c.getJSONArray("stages")) == null || jSONArray.isEmpty())) {
            try {
                ArrayList arrayList = new ArrayList();
                Iterator<Object> it = jSONArray.iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    if (next instanceof JSONObject) {
                        JSONObject jSONObject2 = (JSONObject) next;
                        fr0 fr0Var = new fr0(jSONObject2.getString("stageName"), jSONObject2.getLongValue("startTimeMills"), jSONObject2.getLongValue("endTimeMills"));
                        fr0Var.e(a(jSONObject2.getJSONObject("args")));
                        arrayList.add(fr0Var);
                    }
                }
                return arrayList;
            } catch (Exception unused) {
            }
        }
        return null;
    }
}
