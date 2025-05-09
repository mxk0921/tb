package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.triver.triver_shop.newShop.event.broadcast.a;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class r7v {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final Map<String, k5e> f27173a;

    static {
        t2o.a(83886238);
        HashMap hashMap = new HashMap();
        f27173a = hashMap;
        p7v p7vVar = new p7v();
        hashMap.put(p7vVar.b(), p7vVar);
        o7v o7vVar = new o7v();
        hashMap.put(o7vVar.b(), o7vVar);
        s7v s7vVar = new s7v();
        hashMap.put(s7vVar.b(), s7vVar);
        q7v q7vVar = new q7v();
        hashMap.put(q7vVar.b(), q7vVar);
    }

    public static void a(u55 u55Var, JSONObject jSONObject) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5bbbb1d9", new Object[]{u55Var, jSONObject});
            return;
        }
        if (u55Var.getBizName() == null) {
            str = "Ultron";
        } else {
            str = u55Var.getBizName();
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("hierarchy");
        if (jSONObject2 == null) {
            f9v.q(xh8.a(str).c("UltronDeltaParser").message("hierarchy is null"));
            return;
        }
        JSONArray jSONArray = jSONObject2.getJSONArray("delta");
        if (jSONArray == null || jSONArray.isEmpty()) {
            hav.b(str, "UltronDeltaParser", "deltaProtocol is empty");
            f9v.q(xh8.a(str).c("UltronDeltaParser").message("hierarchy is null"));
            return;
        }
        Iterator<Object> it = jSONArray.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (!(next instanceof JSONObject)) {
                f9v.q(xh8.a(str).c("UltronDeltaParser").message("deltaOptionObj is not JSONObject"));
            } else {
                JSONObject jSONObject3 = (JSONObject) next;
                String string = jSONObject3.getString("opType");
                if (!TextUtils.isEmpty(string)) {
                    String string2 = jSONObject3.getString("target");
                    if (!TextUtils.isEmpty(string2)) {
                        k5e k5eVar = (k5e) ((HashMap) f27173a).get(string);
                        if (k5eVar == null) {
                            xh8 c = xh8.a(str).c("UltronDeltaParser");
                            f9v.q(c.message("there is no delta parser for type:" + string));
                        } else {
                            try {
                                k5eVar.a(u55Var, jSONObject, jSONObject3, string2, jSONObject3.getString(a.MSG_SOURCE_PARENT), jSONObject3.getString("position"));
                            } catch (Exception e) {
                                f9v.q(xh8.a(str).c("UltronDeltaParser").message(e.getMessage()));
                            }
                            u55Var.f0(string2, string);
                        }
                    }
                }
            }
        }
    }
}
