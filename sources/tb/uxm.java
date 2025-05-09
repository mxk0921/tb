package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.chitu.TBSearchChiTuJSBridge;
import com.taobao.monitor.ProcedureGlobal;
import com.taobao.monitor.procedure.ProcedureImpl;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class uxm implements ProcedureImpl.b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final boolean f29661a;

    public uxm(boolean z) {
        this.f29661a = z;
    }

    public static JSONObject f(r1w r1wVar) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("ab10a64c", new Object[]{r1wVar});
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("X-timestamp", r1wVar.w()).put("X-appId", oua.f25661a).put("X-appKey", oua.b).put("X-appBuild", oua.c).put("X-appPatch", oua.e).put("X-channel", oua.f).put("X-utdid", oua.g).put("X-brand", oua.h).put("X-deviceModel", oua.i).put("X-os", oua.j).put("X-osVersion", oua.k).put("X-userId", oua.l).put("X-userNick", oua.m).put("X-session", oua.n).put("X-processName", oua.o).put("X-appVersion", oua.d).put("X-launcherMode", oua.p).put("X-packageTag", oua.q);
        return jSONObject;
    }

    public static void g(JSONObject jSONObject, Map<String, ?> map) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d5dccc33", new Object[]{jSONObject, map});
        } else {
            h(jSONObject, map, 2);
        }
    }

    public static void h(JSONObject jSONObject, Map<String, ?> map, int i) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e5bd2d30", new Object[]{jSONObject, map, new Integer(i)});
        } else if (map != null && i > 0) {
            for (Map.Entry<String, ?> entry : map.entrySet()) {
                j(jSONObject, entry.getKey(), entry.getValue(), i);
            }
        }
    }

    public static void i(JSONObject jSONObject, String str, Object obj) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b51f333", new Object[]{jSONObject, str, obj});
        } else {
            j(jSONObject, str, obj, 2);
        }
    }

    public static void j(JSONObject jSONObject, String str, Object obj, int i) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2eece630", new Object[]{jSONObject, str, obj, new Integer(i)});
        } else if (obj instanceof Integer) {
            jSONObject.put(str, ((Integer) obj).intValue());
        } else if (obj instanceof Long) {
            jSONObject.put(str, ((Long) obj).longValue());
        } else if (obj instanceof Float) {
            jSONObject.put(str, ((Float) obj).floatValue());
        } else if (obj instanceof Double) {
            jSONObject.put(str, ((Double) obj).doubleValue());
        } else if (obj instanceof Boolean) {
            jSONObject.put(str, ((Boolean) obj).booleanValue());
        } else if (obj instanceof Character) {
            jSONObject.put(str, (int) ((Character) obj).charValue());
        } else if (obj instanceof Short) {
            jSONObject.put(str, (int) ((Short) obj).shortValue());
        } else if (obj instanceof Map) {
            Map map = (Map) obj;
            if (map.size() != 0) {
                JSONObject jSONObject2 = new JSONObject();
                h(jSONObject2, map, i - 1);
                jSONObject.put(str, jSONObject2);
            }
        } else {
            jSONObject.put(str, obj);
        }
    }

    @Override // com.taobao.monitor.procedure.ProcedureImpl.b
    public void a(r1w r1wVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("50322ff2", new Object[]{this, r1wVar});
        }
    }

    @Override // com.taobao.monitor.procedure.ProcedureImpl.b
    public void b(r1w r1wVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1397a624", new Object[]{this, r1wVar});
        } else {
            luj.c().a(r1wVar.x(), e(r1wVar), this.f29661a);
        }
    }

    @Override // com.taobao.monitor.procedure.ProcedureImpl.b
    public void c(r1w r1wVar, cj8 cj8Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ece8aa82", new Object[]{this, r1wVar, cj8Var});
        }
    }

    @Override // com.taobao.monitor.procedure.ProcedureImpl.b
    public void d(r1w r1wVar, ugq ugqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2612f02", new Object[]{this, r1wVar, ugqVar});
        }
    }

    public static String e(r1w r1wVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e3eb111a", new Object[]{r1wVar});
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("version", "0.0.3");
            jSONObject.put("topic", r1wVar.x());
            jSONObject.put("headers", f(r1wVar));
            jSONObject.put("value", k(r1wVar, false));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return jSONObject.toString();
    }

    public static JSONObject k(r1w r1wVar, boolean z) throws Exception {
        boolean z2 = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("127935c0", new Object[]{r1wVar, new Boolean(z)});
        }
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        Map<String, Object> n = r1wVar.n();
        if (!(n == null || n.size() == 0)) {
            for (Map.Entry<String, Object> entry : n.entrySet()) {
                i(jSONObject2, entry.getKey(), entry.getValue());
            }
            if (!z) {
                i(jSONObject2, "utABTest", ProcedureGlobal.f().b());
            }
            z2 = true;
        }
        List<kd2> i = r1wVar.i();
        if (!(i == null || i.size() == 0)) {
            JSONObject jSONObject3 = new JSONObject();
            for (kd2 kd2Var : i) {
                Map<String, Object> f = kd2Var.f();
                JSONObject jSONObject4 = new JSONObject();
                if (!(f == null || f.size() == 0)) {
                    g(jSONObject4, f);
                }
                Map<String, Object> a2 = kd2Var.a();
                if (!(a2 == null || a2.size() == 0)) {
                    JSONObject jSONObject5 = new JSONObject();
                    g(jSONObject5, a2);
                    jSONObject4.put(TBSearchChiTuJSBridge.ABTEST, jSONObject5);
                }
                Map<String, Object> g = kd2Var.g();
                if (!(g == null || g.size() == 0)) {
                    JSONObject jSONObject6 = new JSONObject();
                    g(jSONObject6, g);
                    jSONObject4.put("stages", jSONObject6);
                }
                jSONObject3.put(kd2Var.e(), jSONObject4);
            }
            jSONObject2.put("bizTags", jSONObject3);
            z2 = true;
        }
        List<Map<String, Object>> t = r1wVar.t();
        JSONArray jSONArray = new JSONArray();
        if (!(t == null || t.size() == 0)) {
            for (Map<String, Object> map : t) {
                JSONObject jSONObject7 = new JSONObject();
                g(jSONObject7, map);
                jSONArray.put(jSONObject7);
            }
            jSONObject2.put("subtasks", jSONArray);
        }
        if (z2) {
            jSONObject.put(wua.KEY_PROPERTIES, jSONObject2);
        }
        Map<String, Object> s = r1wVar.s();
        JSONObject jSONObject8 = new JSONObject();
        if (!(s == null || s.size() == 0)) {
            g(jSONObject8, s);
        }
        Map<String, Integer> j = r1wVar.j();
        if (!(j == null || j.size() == 0)) {
            g(jSONObject8, j);
        }
        if (!(j.size() == 0 && s.size() == 0)) {
            jSONObject.put("stats", jSONObject8);
        }
        List<cj8> l = r1wVar.l();
        if (!(l == null || l.size() == 0)) {
            JSONArray jSONArray2 = new JSONArray();
            for (cj8 cj8Var : l) {
                JSONObject jSONObject9 = new JSONObject();
                jSONObject9.put("timestamp", cj8Var.c());
                jSONObject9.put("name", cj8Var.a());
                g(jSONObject9, cj8Var.b());
                jSONArray2.put(jSONObject9);
            }
            jSONObject.put("events", jSONArray2);
        }
        List<ugq> r = r1wVar.r();
        if (!(r == null || r.size() == 0)) {
            JSONObject jSONObject10 = new JSONObject();
            for (ugq ugqVar : r) {
                jSONObject10.put(ugqVar.a(), ugqVar.b());
            }
            jSONObject.put("stages", jSONObject10);
        }
        List<r1w> u = r1wVar.u();
        if (!(u == null || u.size() == 0)) {
            JSONArray jSONArray3 = new JSONArray();
            for (r1w r1wVar2 : u) {
                JSONObject k = k(r1wVar2, true);
                JSONObject jSONObject11 = new JSONObject();
                jSONObject11.put(r1wVar2.x(), k);
                jSONArray3.put(jSONObject11);
            }
            jSONObject.put("subProcedures", jSONArray3);
        }
        return jSONObject;
    }
}
