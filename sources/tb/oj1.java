package tb;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.TypeCastException;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class oj1 implements ggc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(350224399);
        t2o.a(350224413);
    }

    public final JSONObject b(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("51057c04", new Object[]{this, jSONObject});
        }
        if (jSONObject == null) {
            return null;
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put((JSONObject) "name", (String) jSONObject.get("code"));
        jSONObject2.put((JSONObject) "version", (String) jSONObject.get("version"));
        jSONObject2.put((JSONObject) "url", (String) jSONObject.get("url"));
        return jSONObject2;
    }

    public final List<JSONObject> c(JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("8b662e6a", new Object[]{this, jSONArray});
        }
        ArrayList arrayList = new ArrayList();
        if (jSONArray == null) {
            return arrayList;
        }
        Iterator<Object> it = jSONArray.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (next != null) {
                arrayList.add(b((JSONObject) next));
            } else {
                throw new TypeCastException("null cannot be cast to non-null type com.alibaba.fastjson.JSONObject");
            }
        }
        return arrayList;
    }

    @Override // tb.ggc
    public wao a(rmb rmbVar, DXEvent dXEvent, Object[] objArr, jh3 jh3Var) {
        JSONObject b;
        JSONObject b2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (wao) ipChange.ipc$dispatch("eecb2af8", new Object[]{this, rmbVar, dXEvent, objArr, jh3Var});
        }
        ckf.h(rmbVar, "next");
        Object obj = null;
        if ((jh3Var != null ? jh3Var.a() : null) == null || jh3Var.b() == null) {
            wao a2 = ((z08) rmbVar).a(dXEvent, objArr, jh3Var);
            ckf.c(a2, "next.executeChain(event, args, chainContext)");
            return a2;
        }
        Map<String, Object> b3 = jh3Var.b();
        Object obj2 = b3.get("event_adam_config");
        if (!(obj2 instanceof JSONObject)) {
            obj2 = null;
        }
        JSONObject jSONObject = (JSONObject) obj2;
        Object obj3 = jSONObject != null ? jSONObject.get("componentKeys") : null;
        if (!(obj3 instanceof String[])) {
            obj3 = null;
        }
        Object obj4 = (String[]) obj3;
        Object obj5 = b3.get("global_adam_config");
        if (!(obj5 instanceof JSONObject)) {
            obj5 = null;
        }
        JSONObject jSONObject2 = (JSONObject) obj5;
        if (!(obj4 instanceof String[])) {
            obj4 = jSONObject2 != null ? jSONObject2.get("sourceCode") : null;
        }
        Object obj6 = b3.get("auraTemplates");
        if (obj6 instanceof JSONArray) {
            obj = obj6;
        }
        JSONArray jSONArray = (JSONArray) obj;
        if (jSONArray == null || jSONArray.isEmpty()) {
            wao a3 = wao.a();
            ckf.c(a3, "Result.failedResult()");
            return a3;
        }
        if (obj4 != null) {
            ArrayList arrayList = new ArrayList();
            boolean z = obj4 instanceof JSONArray;
            boolean z2 = obj4 instanceof Object[];
            Iterator<Object> it = jSONArray.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if (z) {
                    it = it;
                    JSONArray jSONArray2 = (JSONArray) obj4;
                    if (next != null) {
                        JSONObject jSONObject3 = (JSONObject) next;
                        if (jSONArray2.contains(jSONObject3.get("code")) && (b2 = b(jSONObject3)) != null) {
                            arrayList.add(b2);
                        }
                    } else {
                        throw new TypeCastException("null cannot be cast to non-null type com.alibaba.fastjson.JSONObject");
                    }
                } else {
                    it = it;
                    if (z2) {
                        String[] strArr = (String[]) obj4;
                        if (next != null) {
                            JSONObject jSONObject4 = (JSONObject) next;
                            if (ic1.B(strArr, jSONObject4.get("code")) && (b = b(jSONObject4)) != null) {
                                arrayList.add(b);
                            }
                        } else {
                            throw new TypeCastException("null cannot be cast to non-null type com.alibaba.fastjson.JSONObject");
                        }
                    } else {
                        continue;
                    }
                }
            }
            b3.put("templates", arrayList);
        } else {
            b3.put("templates", c(jSONArray));
        }
        wao a4 = ((z08) rmbVar).a(dXEvent, objArr, jh3Var);
        ckf.c(a4, "next.executeChain(event, args, chainContext)");
        return a4;
    }
}
