package tb;

import android.content.Context;
import android.text.TextUtils;
import com.alibaba.android.aura.nodemodel.extend.AURAExtendModuleNodeModel;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.festival.jsbridge.AliFestivalWVPlugin;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import tb.ck;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class dh {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int ERROR_CODE_MAIN_CONFIG_EMPTY = 1000;
    public static final int ERROR_CODE_MAIN_CONFIG_NO_PLUGIN = 1001;

    /* renamed from: a  reason: collision with root package name */
    public final jj f17808a;

    static {
        t2o.a(79691838);
    }

    public dh(jj jjVar) {
        this.f17808a = jjVar;
    }

    public static void b(AURAExtendModuleNodeModel aURAExtendModuleNodeModel, List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88c2473b", new Object[]{aURAExtendModuleNodeModel, list});
        } else if (!list.contains(aURAExtendModuleNodeModel.name)) {
            list.add(aURAExtendModuleNodeModel.name);
        }
    }

    public final void a(Context context, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("32f82b7c", new Object[]{this, context, jSONObject});
        } else if (th.c()) {
            k(context, jSONObject);
            f(jSONObject);
        }
    }

    public final void c(JSONObject jSONObject, List<JSONObject> list, List<String> list2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9cda5684", new Object[]{this, jSONObject, list, list2});
            return;
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject(ku0.TRACK_PAGE_COUNTER_TYPE_PLUGIN);
        if (jSONObject2 == null) {
            ck.g().f("无效配置，没有plugin", ck.b.b().l("AURAConfigCombine").a());
            return;
        }
        if (!list.contains(jSONObject)) {
            list.add(jSONObject);
        }
        String string = jSONObject2.getString(AliFestivalWVPlugin.PARAMS_MODULE_NAME);
        if (!TextUtils.isEmpty(string) && !list2.contains(string)) {
            list2.add(string);
        }
    }

    public final void d(JSONObject jSONObject, JSONObject jSONObject2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b6479237", new Object[]{this, jSONObject, jSONObject2});
            return;
        }
        JSONObject jSONObject3 = jSONObject2.getJSONObject("aspectExtensions");
        if (!(jSONObject3 == null || jSONObject3.isEmpty())) {
            JSONObject jSONObject4 = jSONObject.getJSONObject("aspectExtensions");
            if (jSONObject4 == null) {
                jSONObject4 = new JSONObject();
                jSONObject.put("aspectExtensions", (Object) jSONObject4);
            }
            for (String str : jSONObject3.keySet()) {
                JSONArray jSONArray = jSONObject4.getJSONArray(str);
                if (jSONArray == null || jSONArray.isEmpty()) {
                    jSONObject4.put(str, (Object) jSONObject3.getJSONArray(str));
                } else {
                    h(jSONObject4, jSONObject3);
                }
            }
        }
    }

    public final void f(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a2f1a91d", new Object[]{this, jSONObject});
            return;
        }
        JSONArray jSONArray = jSONObject.getJSONArray("flows");
        if (!bh.a(jSONArray)) {
            JSONObject jSONObject2 = jSONObject.getJSONObject("commonExtensions");
            if (!bh.b(jSONObject2)) {
                Iterator<Object> it = jSONArray.iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    if (next instanceof JSONObject) {
                        JSONObject jSONObject3 = (JSONObject) next;
                        q(jSONObject3, jSONObject2);
                        p(jSONObject3, jSONObject2);
                    }
                }
                jSONObject.remove("commonExtensions");
            }
        }
    }

    public void g(Context context, String str, eh ehVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe24a91a", new Object[]{this, context, str, ehVar});
            return;
        }
        JSONObject i = fh.i(context, str);
        if (i == null || i.isEmpty()) {
            ehVar.a(1000, "主配置加载失败");
        } else {
            r(context, i, ehVar);
        }
    }

    public final void h(JSONObject jSONObject, JSONObject jSONObject2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c61bd3a", new Object[]{this, jSONObject, jSONObject2});
            return;
        }
        for (String str : jSONObject2.keySet()) {
            JSONArray jSONArray = jSONObject2.getJSONArray(str);
            if (jSONArray != null && !jSONArray.isEmpty()) {
                JSONArray jSONArray2 = jSONObject.getJSONArray(str);
                if (jSONArray2 == null || jSONArray2.isEmpty()) {
                    jSONObject.put(str, (Object) jSONArray);
                } else {
                    Iterator<Object> it = jSONArray.iterator();
                    while (it.hasNext()) {
                        Object next = it.next();
                        if (next instanceof JSONObject) {
                            JSONObject jSONObject3 = (JSONObject) next;
                            JSONObject e = fh.e(jSONArray2, fh.d(jSONObject3));
                            if (e == null) {
                                jSONArray2.add(next);
                            } else {
                                l(e, jSONObject3);
                                JSONObject jSONObject4 = jSONObject3.getJSONObject("extensions");
                                if (jSONObject4 != null && !jSONObject4.isEmpty()) {
                                    JSONObject jSONObject5 = e.getJSONObject("extensions");
                                    if (jSONObject5 == null) {
                                        jSONObject5 = new JSONObject();
                                        e.put("extensions", (Object) jSONObject5);
                                    }
                                    h(jSONObject5, jSONObject4);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public final void i(JSONObject jSONObject, JSONObject jSONObject2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("df5c7f4d", new Object[]{this, jSONObject, jSONObject2});
            return;
        }
        JSONArray jSONArray = jSONObject2.getJSONArray("flows");
        if (jSONArray != null && !jSONArray.isEmpty()) {
            JSONArray jSONArray2 = jSONObject.getJSONArray("flows");
            if (jSONArray2 == null) {
                jSONArray2 = new JSONArray();
                jSONObject.put("flows", (Object) jSONArray2);
            }
            Iterator<Object> it = jSONArray.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if (next instanceof JSONObject) {
                    JSONObject jSONObject3 = (JSONObject) next;
                    JSONObject f = fh.f(jSONArray2, fh.d(jSONObject3));
                    if (f != null) {
                        n(f, jSONObject3);
                        d(f, jSONObject3);
                    } else {
                        jSONArray2.add(next);
                    }
                }
            }
        }
    }

    public final void j(JSONObject jSONObject, JSONObject jSONObject2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b2c8a617", new Object[]{this, jSONObject, jSONObject2});
            return;
        }
        JSONArray jSONArray = jSONObject2.getJSONArray("functionModules");
        JSONArray jSONArray2 = jSONObject.getJSONArray("functionModules");
        if (!bh.a(jSONArray)) {
            if (jSONArray2 == null) {
                jSONArray2 = new JSONArray();
                jSONObject.put("functionModules", (Object) jSONArray2);
            }
            Iterator<Object> it = jSONArray.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if (next instanceof JSONObject) {
                    JSONObject jSONObject3 = (JSONObject) next;
                    String string = jSONObject3.getString("code");
                    if (TextUtils.isEmpty(string)) {
                        ck.g().f("combineFunctionModules#功能模块不合法，code为空", ck.b.b().l("AURAConfigCombine").a());
                    } else if (u(string, jSONArray2) == null) {
                        jSONArray2.add(jSONObject3);
                    }
                }
            }
        }
    }

    public final void k(Context context, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("386dffa9", new Object[]{this, context, jSONObject});
            return;
        }
        JSONArray jSONArray = jSONObject.getJSONArray("functionModules");
        if (!bh.a(jSONArray)) {
            JSONArray v = v(context, jSONObject);
            if (jSONObject.getJSONObject("commonExtensions") == null) {
                jSONObject.put("commonExtensions", (Object) new JSONObject());
            }
            Iterator<Object> it = jSONArray.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if (next instanceof JSONObject) {
                    JSONObject jSONObject2 = (JSONObject) next;
                    JSONObject jSONObject3 = jSONObject2.getJSONObject("commonExtensions");
                    if (bh.b(jSONObject3)) {
                        jSONObject3 = t(jSONObject2.getString("code"), v);
                    }
                    if (!bh.b(jSONObject3)) {
                        o(jSONObject, jSONObject3);
                    }
                    JSONObject jSONObject4 = jSONObject2.getJSONObject("extensions");
                    if (!bh.b(jSONObject4)) {
                        o(jSONObject, jSONObject4);
                    }
                }
            }
        }
    }

    public final void l(JSONObject jSONObject, JSONObject jSONObject2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9eacd574", new Object[]{this, jSONObject, jSONObject2});
            return;
        }
        JSONObject jSONObject3 = jSONObject2.getJSONObject("input");
        if (!bh.b(jSONObject3)) {
            JSONObject jSONObject4 = jSONObject.getJSONObject("input");
            if (jSONObject4 == null) {
                jSONObject.put("input", (Object) new JSONObject(jSONObject3));
            } else {
                jSONObject4.putAll(jSONObject3);
            }
        }
    }

    public final void m(JSONObject jSONObject, JSONObject jSONObject2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("97a9bc99", new Object[]{this, jSONObject, jSONObject2});
            return;
        }
        e(jSONObject, jSONObject2);
        j(jSONObject, jSONObject2);
        i(jSONObject, jSONObject2);
    }

    public final void o(JSONObject jSONObject, JSONObject jSONObject2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("696bc53a", new Object[]{this, jSONObject, jSONObject2});
        } else if (!bh.b(jSONObject2)) {
            JSONObject jSONObject3 = jSONObject.getJSONObject("commonExtensions");
            if (jSONObject3 == null) {
                jSONObject.put("commonExtensions", (Object) jSONObject2);
            } else {
                h(jSONObject3, jSONObject2);
            }
        }
    }

    public final void p(JSONObject jSONObject, JSONObject jSONObject2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c48d506", new Object[]{this, jSONObject, jSONObject2});
        } else if (!bh.b(jSONObject2)) {
            JSONObject jSONObject3 = jSONObject.getJSONObject("aspectExtensions");
            if (jSONObject3 == null) {
                jSONObject3 = new JSONObject();
                jSONObject.put("aspectExtensions", (Object) jSONObject3);
            }
            JSONObject jSONObject4 = new JSONObject();
            jSONObject4.put("code", hg.SERVICE_CODE);
            jSONObject4.put("type", "service");
            jSONObject4.put("extensions", (Object) jSONObject3);
            w(jSONObject4, jSONObject2);
            if (jSONObject3.isEmpty()) {
                jSONObject.remove("aspectExtensions");
            }
        }
    }

    public final void q(JSONObject jSONObject, JSONObject jSONObject2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9502aa76", new Object[]{this, jSONObject, jSONObject2});
        } else if (!bh.b(jSONObject2)) {
            JSONArray jSONArray = jSONObject.getJSONArray("nodes");
            if (!bh.a(jSONArray)) {
                Iterator<Object> it = jSONArray.iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    if (next instanceof JSONObject) {
                        w((JSONObject) next, jSONObject2);
                    }
                }
            }
        }
    }

    public final void r(Context context, JSONObject jSONObject, eh ehVar) {
        JSONObject jSONObject2;
        AURAExtendModuleNodeModel b;
        JSONObject s;
        JSONObject jSONObject3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f65fd75f", new Object[]{this, context, jSONObject, ehVar});
            return;
        }
        JSONObject jSONObject4 = jSONObject.getJSONObject(ku0.TRACK_PAGE_COUNTER_TYPE_PLUGIN);
        if (jSONObject4 == null) {
            ehVar.a(1001, "主配置加载失败，没有plugin节点");
            return;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        c(jSONObject, arrayList, arrayList2);
        JSONArray jSONArray = jSONObject4.getJSONArray("extendedModules");
        if (bh.a(jSONArray)) {
            a(context, jSONObject4);
            ehVar.b(jSONObject, arrayList, arrayList2);
            return;
        }
        Iterator<Object> it = jSONArray.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if ((next instanceof JSONObject) && (b = fh.b((jSONObject2 = (JSONObject) next))) != null) {
                b(b, arrayList2);
                if (!(!th.c() || (s = s(context, jSONObject2)) == null || (jSONObject3 = s.getJSONObject(ku0.TRACK_PAGE_COUNTER_TYPE_PLUGIN)) == null)) {
                    c(s, arrayList, arrayList2);
                    m(jSONObject4, jSONObject3);
                }
            }
        }
        a(context, jSONObject4);
        ehVar.b(jSONObject, arrayList, arrayList2);
    }

    public final JSONObject s(Context context, JSONObject jSONObject) {
        JSONObject i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("de1ba099", new Object[]{this, context, jSONObject});
        }
        AURAExtendModuleNodeModel b = fh.b(jSONObject);
        if (b == null || (i = fh.i(context, b.configPath)) == null || fh.a(b, i)) {
            return null;
        }
        return i;
    }

    public final JSONObject t(String str, JSONArray jSONArray) {
        JSONObject u;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("7dfcc626", new Object[]{this, str, jSONArray});
        }
        if (!bh.a(jSONArray) && (u = u(str, jSONArray)) != null) {
            return u.getJSONObject("commonExtensions");
        }
        return null;
    }

    public final JSONObject u(String str, JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("9e44f8b3", new Object[]{this, str, jSONArray});
        }
        if (bh.a(jSONArray)) {
            return null;
        }
        Iterator<Object> it = jSONArray.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (next instanceof JSONObject) {
                JSONObject jSONObject = (JSONObject) next;
                if (str.equals(jSONObject.getString("code"))) {
                    return jSONObject;
                }
            }
        }
        return null;
    }

    public final JSONArray v(Context context, JSONObject jSONObject) {
        JSONObject s;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONArray) ipChange.ipc$dispatch("9ee02cab", new Object[]{this, context, jSONObject});
        }
        JSONArray jSONArray = jSONObject.getJSONArray("functionModuleRepository");
        if (bh.a(jSONArray)) {
            return null;
        }
        JSONArray jSONArray2 = new JSONArray();
        Iterator<Object> it = jSONArray.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if ((next instanceof JSONObject) && (s = s(context, (JSONObject) next)) != null) {
                JSONObject jSONObject2 = s.getJSONObject(ku0.TRACK_PAGE_COUNTER_TYPE_PLUGIN);
                if (!bh.b(jSONObject2)) {
                    JSONArray jSONArray3 = jSONObject2.getJSONArray("functionModules");
                    if (!bh.a(jSONArray3)) {
                        jSONArray2.addAll(jSONArray3);
                    }
                }
            }
        }
        return jSONArray2;
    }

    public final void w(JSONObject jSONObject, JSONObject jSONObject2) {
        String key;
        List<String> e;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e459658", new Object[]{this, jSONObject, jSONObject2});
            return;
        }
        String string = jSONObject.getString("code");
        if (!TextUtils.isEmpty(string)) {
            JSONObject jSONObject3 = jSONObject.getJSONObject("extensions");
            if (jSONObject3 == null) {
                jSONObject3 = new JSONObject();
                jSONObject.put("extensions", (Object) jSONObject3);
            }
            JSONObject jSONObject4 = new JSONObject();
            for (Map.Entry<String, Object> entry : jSONObject2.entrySet()) {
                Object value = entry.getValue();
                if ((value instanceof JSONArray) && (e = this.f17808a.e((key = entry.getKey()))) != null && e.contains(string)) {
                    jSONObject4.clear();
                    jSONObject4.put(key, value);
                    h(jSONObject3, jSONObject4);
                }
            }
            if (jSONObject3.isEmpty()) {
                jSONObject.remove("extensions");
                return;
            }
            for (Object obj : jSONObject3.values()) {
                if (obj instanceof JSONArray) {
                    Iterator<Object> it = ((JSONArray) obj).iterator();
                    while (it.hasNext()) {
                        Object next = it.next();
                        if (next instanceof JSONObject) {
                            w((JSONObject) next, jSONObject2);
                        }
                    }
                }
            }
        }
    }

    public final void e(JSONObject jSONObject, JSONObject jSONObject2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bf78d1b6", new Object[]{this, jSONObject, jSONObject2});
            return;
        }
        JSONArray jSONArray = jSONObject.getJSONArray("branches");
        JSONArray jSONArray2 = jSONObject2.getJSONArray("branches");
        if (jSONArray2 != null && !jSONArray2.isEmpty()) {
            if (jSONArray == null) {
                jSONArray = new JSONArray();
                jSONObject.put("branches", (Object) jSONArray);
            }
            Iterator<Object> it = jSONArray2.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if (next instanceof JSONObject) {
                    String d = fh.d((JSONObject) next);
                    if (fh.h(jSONArray, d)) {
                        fh.c("主配置中已经存在这个Branch了【" + d + "】不可以覆盖", false);
                    } else {
                        jSONArray.add(next);
                    }
                }
            }
        }
    }

    public final void n(JSONObject jSONObject, JSONObject jSONObject2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab09a827", new Object[]{this, jSONObject, jSONObject2});
            return;
        }
        JSONArray jSONArray = jSONObject2.getJSONArray("nodes");
        if (jSONArray != null && !jSONArray.isEmpty()) {
            JSONArray jSONArray2 = jSONObject.getJSONArray("nodes");
            if (jSONArray2 == null) {
                jSONArray2 = new JSONArray();
                jSONObject.put("nodes", (Object) jSONArray2);
            }
            Iterator<Object> it = jSONArray.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if (next instanceof JSONObject) {
                    JSONObject jSONObject3 = (JSONObject) next;
                    JSONObject g = fh.g(jSONArray2, jSONObject3.getString("code"));
                    String d = fh.d(jSONObject3);
                    if (g == null) {
                        fh.c("不能添加一个新的服务【" + d + "】 到流程【" + fh.d(jSONObject) + "】", false);
                    } else {
                        l(g, jSONObject3);
                        JSONObject jSONObject4 = jSONObject3.getJSONObject("extensions");
                        if (jSONObject4 != null && !jSONObject4.isEmpty()) {
                            JSONObject jSONObject5 = g.getJSONObject("extensions");
                            if (jSONObject5 == null) {
                                jSONObject5 = new JSONObject();
                                g.put("extensions", (Object) jSONObject5);
                            }
                            h(jSONObject5, jSONObject4);
                        }
                    }
                }
            }
        }
    }
}
