package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.tao.log.TLog;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class bz4 implements ggc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(350224410);
        t2o.a(350224413);
    }

    @Override // tb.ggc
    public wao a(rmb rmbVar, DXEvent dXEvent, Object[] objArr, jh3 jh3Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (wao) ipChange.ipc$dispatch("eecb2af8", new Object[]{this, rmbVar, dXEvent, objArr, jh3Var});
        }
        if (jh3Var == null || jh3Var.a() == null) {
            return wao.a();
        }
        if (!(jh3Var.b() == null || jh3Var.b().get("event_adam_config") == null)) {
            JSONObject jSONObject = (JSONObject) jh3Var.b().get("event_adam_config");
            if (jSONObject != null && "false".equals(jSONObject.get("readCurTemplate"))) {
                return ((z08) rmbVar).a(dXEvent, objArr, jh3Var);
            }
            JSONObject jSONObject2 = (JSONObject) jh3Var.b().get("global_adam_config");
            if (jSONObject2 != null && !Boolean.parseBoolean(jSONObject2.getString("readCurTemplate")) && (jSONObject == null || "false".equals(jSONObject.get("readCurTemplate")))) {
                return ((z08) rmbVar).a(dXEvent, objArr, jh3Var);
            }
        }
        if (!sj8.f(dXEvent, jh3Var.a(), objArr)) {
            return ((z08) rmbVar).a(dXEvent, objArr, jh3Var);
        }
        TLog.logi(null, "LOG_ADAM", "handle evChain by current template, eventName = " + objArr[0]);
        return wao.c();
    }
}
