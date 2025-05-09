package tb;

import android.text.TextUtils;
import com.alibaba.android.aura.taobao.adapter.extension.linkage.event.AURASubmitEvent;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Iterator;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class n1n {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(83886201);
    }

    public static void a(u55 u55Var, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aec2d1b3", new Object[]{u55Var, jSONObject});
        } else if (u55Var != null && jSONObject != null) {
            f(jSONObject, c(u55Var, jSONObject), true);
        }
    }

    public static JSONArray c(u55 u55Var, JSONObject jSONObject) {
        List<o58> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONArray) ipChange.ipc$dispatch("654ccdc3", new Object[]{u55Var, jSONObject});
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("container");
        if (jSONObject2 != null) {
            JSONArray jSONArray = jSONObject2.getJSONArray("data");
            if (jSONArray != null) {
                list = JSON.parseArray(jSONArray.toJSONString(), o58.class);
            } else {
                list = null;
            }
        } else {
            list = u55Var.h();
        }
        if (list != null) {
            for (o58 o58Var : list) {
                if (o58Var != null && "card".equalsIgnoreCase(o58Var.c)) {
                    return o58Var.f25148a;
                }
            }
        }
        return null;
    }

    public static void e(u55 u55Var, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3f2f3db", new Object[]{u55Var, jSONObject});
        } else if (u55Var != null && jSONObject != null && d(jSONObject.getJSONObject(AURASubmitEvent.RPC_ENDPOINT))) {
            f(jSONObject, c(u55Var, jSONObject), false);
            g(jSONObject);
        }
    }

    public static void f(JSONObject jSONObject, JSONArray jSONArray, boolean z) {
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("be394a07", new Object[]{jSONObject, jSONArray, new Boolean(z)});
            return;
        }
        JSONObject jSONObject3 = jSONObject.getJSONObject("data");
        if (jSONObject3 != null) {
            for (String str : jSONObject3.keySet()) {
                JSONObject jSONObject4 = jSONObject3.getJSONObject(str);
                if (jSONObject4 != null) {
                    if (!z) {
                        h(jSONObject4, str);
                    }
                    JSONObject jSONObject5 = jSONObject4.getJSONObject("features");
                    if (!(jSONObject5 == null || (jSONObject2 = jSONObject5.getJSONObject("linkage")) == null)) {
                        if (!z) {
                            JSONObject jSONObject6 = jSONObject.getJSONObject("linkage");
                            if (jSONObject6 == null) {
                                jSONObject.put("linkage", (Object) new JSONObject());
                            }
                            if (jSONObject6.getJSONArray("input") == null) {
                                jSONObject6.put("input", (Object) new JSONArray());
                            }
                            JSONArray jSONArray2 = jSONObject6.getJSONArray("input");
                            if (!jSONArray2.contains(str) && jSONObject2.getBooleanValue("input")) {
                                jSONArray2.add(str);
                            }
                        }
                        if (jSONObject2.getBooleanValue("submit")) {
                            jSONObject4.put("submit", "true");
                        }
                        if (jSONObject2.containsKey("ref")) {
                            jSONObject4.put("ref", (Object) jSONObject2.getString("ref"));
                        }
                        if (jSONObject2.containsKey("validate")) {
                            jSONObject4.put("validate", (Object) JSON.parseObject(jSONObject2.getJSONObject("validate").toJSONString()));
                        }
                        if (jSONObject2.containsKey("hidden")) {
                            jSONObject4.put("hidden", (Object) JSON.parseObject(jSONObject2.getJSONObject("hidden").toJSONString()));
                        }
                        h(jSONObject4, str);
                        if (jSONArray != null && jSONArray.contains(jSONObject4.getString("type"))) {
                            jSONObject4.put("cardGroup", "true");
                        }
                    }
                }
            }
        }
    }

    public static boolean b(JSONObject jSONObject, u55 u55Var) {
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("603b68a9", new Object[]{jSONObject, u55Var})).booleanValue();
        }
        if (jSONObject == null || u55Var == null || !u55Var.S()) {
            return false;
        }
        String string = jSONObject.getString("type");
        return !TextUtils.isEmpty(string) && (jSONObject2 = u55Var.N().get(string)) != null && "popup_window".equals(jSONObject2.getString("name"));
    }

    public static boolean d(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9ecae413", new Object[]{jSONObject})).booleanValue();
        }
        return jSONObject != null && !TextUtils.isEmpty(jSONObject.getString("protocolVersion")) && jSONObject.getString("protocolVersion").compareTo("4.0") >= 0 && jSONObject.getJSONObject("umfVersions") != null;
    }

    public static void g(JSONObject jSONObject) {
        JSONObject jSONObject2;
        JSONObject jSONObject3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3af5eae2", new Object[]{jSONObject});
            return;
        }
        JSONObject jSONObject4 = jSONObject.getJSONObject("hierarchy");
        if (!(jSONObject4 == null || (jSONObject2 = jSONObject4.getJSONObject("structure")) == null || TextUtils.isEmpty(jSONObject4.getString("root")) || (jSONObject3 = jSONObject.getJSONObject("data")) == null)) {
            for (String str : jSONObject2.keySet()) {
                JSONArray jSONArray = jSONObject2.getJSONArray(str);
                if (jSONArray != null) {
                    Iterator<Object> it = jSONArray.iterator();
                    while (it.hasNext()) {
                        Object next = it.next();
                        if (next instanceof String) {
                            String str2 = (String) next;
                            if (!jSONObject3.keySet().contains(str2)) {
                                JSONObject jSONObject5 = new JSONObject();
                                jSONObject5.put("tag", (Object) str2);
                                jSONObject5.put("id", (Object) str2);
                                String[] split = str2.split("_");
                                if (split != null && split.length <= 2) {
                                    if (split.length > 0) {
                                        jSONObject5.put("tag", (Object) split[0]);
                                    }
                                    if (split.length > 1) {
                                        jSONObject5.put("id", (Object) split[1]);
                                    }
                                }
                                jSONObject3.put(str2, (Object) jSONObject5);
                            }
                        }
                    }
                }
            }
        }
    }

    public static void h(JSONObject jSONObject, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c5aa99f2", new Object[]{jSONObject, str});
        } else if (TextUtils.isEmpty(jSONObject.getString("tag")) || TextUtils.isEmpty(jSONObject.getString("id"))) {
            jSONObject.put("tag", (Object) str);
            jSONObject.put("id", (Object) str);
            String[] split = str.split("_");
            if (split != null && split.length <= 2) {
                if (split.length > 0) {
                    jSONObject.put("tag", (Object) split[0]);
                }
                if (split.length > 1) {
                    jSONObject.put("id", (Object) split[1]);
                }
            }
        }
    }
}
