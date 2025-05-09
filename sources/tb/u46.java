package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.expression.event.DXEvent;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class u46 extends ob5 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(745538126);
    }

    public static /* synthetic */ Object ipc$super(u46 u46Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/mytaobao/ultron/event/DXMtbUtEventHandler");
    }

    @Override // tb.ob5, tb.mvb
    public void handleEvent(DXEvent dXEvent, Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9db7b67", new Object[]{this, dXEvent, objArr, dXRuntimeContext});
            return;
        }
        JSONObject jSONObject = null;
        Object L = objArr != null ? ic1.L(objArr, 0) : null;
        if (!(L instanceof JSONObject)) {
            L = null;
        }
        JSONObject jSONObject2 = (JSONObject) L;
        if (jSONObject2 != null) {
            Object L2 = objArr != null ? ic1.L(objArr, 1) : null;
            if (!(L2 instanceof JSONObject)) {
                L2 = null;
            }
            JSONObject jSONObject3 = (JSONObject) L2;
            Object remove = jSONObject3 != null ? jSONObject3.remove("args") : null;
            if (remove instanceof JSONObject) {
                jSONObject = remove;
            }
            JSONObject jSONObject4 = jSONObject;
            if (jSONObject3 != null) {
                jSONObject2.putAll(jSONObject3);
            }
            String string = jSONObject2.getString("page");
            int intValue = jSONObject2.getIntValue("eventId");
            String string2 = jSONObject2.getString("arg1");
            String string3 = jSONObject2.getString("arg2");
            String string4 = jSONObject2.getString("arg3");
            JSONObject jSONObject5 = jSONObject2.getJSONObject("args");
            if (jSONObject5 == null) {
                jSONObject5 = new JSONObject();
            }
            if (jSONObject4 != null) {
                jSONObject5.putAll(jSONObject4);
            }
            r4v.a(string, intValue, string2, string3, string4, jSONObject5);
        }
    }
}
