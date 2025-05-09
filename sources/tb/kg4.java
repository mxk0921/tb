package tb;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.ut.mini.UTAnalytics;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class kg4 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final List<y7d> f22648a;
    public final List<y7d> b;
    public final List<y7d> c;
    public final List<y7d> d;
    public final List<y7d> e;
    public final List<y7d> f;
    public final Map<String, List<y7d>> g;
    public final Map<String, List<y7d>> h;
    public final Map<String, List<y7d>> i;
    public final JSONArray j;

    static {
        t2o.a(404750490);
    }

    public kg4(JSONObject jSONObject) {
        if (jSONObject != null && jSONObject.size() > 0) {
            this.b = xk8.a(jSONObject.getJSONArray("sceneNIn"));
            this.c = xk8.a(jSONObject.getJSONArray("sceneIn"));
            this.f22648a = xk8.a(jSONObject.getJSONArray("actionTypeIn"));
            this.d = xk8.a(jSONObject.getJSONArray("actionNameIn"));
            this.e = xk8.a(jSONObject.getJSONArray("arg2in"));
            this.f = xk8.a(jSONObject.getJSONArray("arg3in"));
            this.g = xk8.b(jSONObject.getJSONObject("bizArgsIn"));
            this.h = xk8.b(jSONObject.getJSONObject("bizArgsNIn"));
            jSONObject.getJSONArray("taskType");
            this.j = jSONObject.getJSONArray("taskArray");
        }
    }

    public static boolean a(Map<?, ?> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5a421221", new Object[]{map})).booleanValue();
        }
        if (map == null || map.isEmpty()) {
            return true;
        }
        return false;
    }

    public static boolean b(Map<String, List<y7d>> map, Map map2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a0efabcc", new Object[]{map, map2})).booleanValue();
        }
        if (map.containsKey("_afc_id")) {
            if (map2 == null) {
                map2 = new HashMap();
            }
            map2.put("_afc_id", UTAnalytics.getInstance().getDefaultTracker().getGlobalProperty("_afc_id"));
        }
        if (a(map2)) {
            return false;
        }
        if (map2 != null) {
            if (map.size() > map2.size()) {
                return false;
            }
            for (Map.Entry<String, List<y7d>> entry : map.entrySet()) {
                List<y7d> value = entry.getValue();
                if (!(xk8.c(value) || xk8.e(value, (String) map2.get(entry.getKey())))) {
                    return false;
                }
            }
        }
        return true;
    }

    public JSONArray c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONArray) ipChange.ipc$dispatch("9a6456f9", new Object[]{this});
        }
        return this.j;
    }

    public boolean d(f6i f6iVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4ec40218", new Object[]{this, f6iVar})).booleanValue();
        }
        if (!xk8.c(this.b) && xk8.e(this.b, f6iVar.f19049a)) {
            return false;
        }
        if (!xk8.c(this.c) && !xk8.e(this.c, f6iVar.f19049a)) {
            return false;
        }
        if (!xk8.c(this.d) && !xk8.e(this.d, f6iVar.c)) {
            return false;
        }
        if (!xk8.c(this.f22648a) && !xk8.e(this.f22648a, f6iVar.b)) {
            return false;
        }
        if (!xk8.c(this.e) && !xk8.e(this.e, f6iVar.d)) {
            return false;
        }
        if (!xk8.c(this.f) && !xk8.e(this.f, f6iVar.e)) {
            return false;
        }
        if (!xk8.d(this.g) && !b(this.g, f6iVar.g())) {
            return false;
        }
        if (!xk8.d(this.h) && b(this.h, f6iVar.g())) {
            return false;
        }
        if (xk8.d(this.i) || b(this.i, f6iVar.f())) {
            return true;
        }
        return false;
    }

    public kg4(JSONArray jSONArray, JSONArray jSONArray2, JSONArray jSONArray3, JSONArray jSONArray4, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        this.b = xk8.a(jSONArray2);
        this.c = xk8.a(jSONArray);
        this.f22648a = xk8.a(jSONArray3);
        this.d = xk8.a(jSONArray4);
        this.g = xk8.b(jSONObject);
        this.h = xk8.b(jSONObject2);
        this.i = xk8.b(jSONObject3);
    }
}
