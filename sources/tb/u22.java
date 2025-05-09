package tb;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.ultron.common.model.IDMComponent;
import com.taobao.android.ultron.datamodel.imp.DMEvent;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public abstract class u22 extends l6v {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_BIZ_PARAMS = "bizParams";
    public static final String j = u22.class.getSimpleName();

    static {
        t2o.a(295699193);
    }

    public static /* synthetic */ Object ipc$super(u22 u22Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/atype/flexalocal/good/ultron/events/BaseUltronSubscriber");
    }

    @Override // tb.l6v
    public void t(b8v b8vVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("827a7510", new Object[]{this, b8vVar});
            return;
        }
        try {
            DMEvent dMEvent = (DMEvent) b8vVar.f();
            b8vVar.r(new DMEvent(dMEvent.getType(), d8v.a(z(b8vVar), b8vVar.d().getData(), (DXRuntimeContext) b8vVar.c(sj8.PARSER_KEY_DX_RUNTIMECONTEXT)), dMEvent.getComponents(), dMEvent.getOption()));
        } catch (Throwable th) {
            v7t.d(j, th.toString());
        }
    }

    public final void x(String str, JSONObject jSONObject, b8v b8vVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("73ad9297", new Object[]{this, str, jSONObject, b8vVar});
        } else if (b8vVar == null || b8vVar.n() == null) {
            v7t.d(j, "ultron instance is null");
        } else {
            f8v eventHandler = b8vVar.n().getEventHandler();
            b8v e = eventHandler.e();
            e.u("bizParams", b8vVar.i("bizParams"));
            e.u("triggerView", b8vVar.i("triggerView"));
            e.p(b8vVar.d());
            e.o(b8vVar.j());
            e.r(new DMEvent(str, jSONObject, new ArrayList()));
            e.t(str);
            eventHandler.k(e);
        }
    }

    public void y(b8v b8vVar, String str, JSONObject jSONObject, JSONObject jSONObject2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4804c9", new Object[]{this, b8vVar, str, jSONObject, jSONObject2});
            return;
        }
        IDMComponent d = b8vVar.d();
        if (d == null) {
            v7t.d(j, "component is null!");
            return;
        }
        JSONObject data = d.getData();
        if (data == null) {
            v7t.d(j, "component data is null!");
            return;
        }
        data.put("currentOutput", (Object) jSONObject2);
        JSONObject jSONObject3 = data.getJSONObject("events");
        if (jSONObject3 == null) {
            v7t.d(j, "events is null!");
            return;
        }
        JSONArray jSONArray = jSONObject3.getJSONArray(jSONObject.getString(str));
        if (jSONArray != null) {
            Iterator<Object> it = jSONArray.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if (next instanceof JSONObject) {
                    JSONObject a2 = i9v.a((JSONObject) next);
                    JSONObject jSONObject4 = null;
                    String string = a2 != null ? a2.getString("type") : null;
                    if (a2 != null) {
                        jSONObject4 = a2.getJSONObject("fields");
                    }
                    if (string != null) {
                        x(string, jSONObject4, b8vVar);
                    }
                }
            }
        } else {
            String str2 = j;
            v7t.d(str2, "events doesn't contains " + str);
        }
        data.remove("currentOutput");
    }

    public JSONObject z(b8v b8vVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("91965a42", new Object[]{this, b8vVar});
        }
        DMEvent dMEvent = (DMEvent) b8vVar.f();
        if (dMEvent != null) {
            return JSON.parseObject(dMEvent.getFields().toJSONString());
        }
        return null;
    }
}
