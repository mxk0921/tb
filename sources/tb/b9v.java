package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.adam.common.Util;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import java.util.ArrayList;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class b9v implements ggc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(350224418);
        t2o.a(350224413);
    }

    @Override // tb.ggc
    public wao a(rmb rmbVar, DXEvent dXEvent, Object[] objArr, jh3 jh3Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (wao) ipChange.ipc$dispatch("eecb2af8", new Object[]{this, rmbVar, dXEvent, objArr, jh3Var});
        }
        if (jh3Var == null || jh3Var.a() == null) {
            return ((z08) rmbVar).a(dXEvent, objArr, jh3Var);
        }
        DXRuntimeContext a2 = jh3Var.a();
        Map<String, Object> b = jh3Var.b();
        JSONObject jSONObject = (JSONObject) b.get("event_adam_config");
        if (jSONObject == null) {
            jSONObject = new JSONObject();
            b.put("event_adam_config", jSONObject);
        }
        String[] strArr = (String[]) jSONObject.get("componentKeys");
        if (strArr == null || strArr.length <= 0) {
            return wao.a();
        }
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            JSONObject g = Util.g(str, a2);
            if (g != null) {
                arrayList.add(g);
            }
        }
        b.put("templates", arrayList);
        return ((z08) rmbVar).a(dXEvent, objArr, jh3Var);
    }
}
