package tb;

import android.content.Context;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class qi6 extends l10 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_EVENT_TLOPENINTERACTIVECOMPONENT = -43294902442974275L;

    static {
        t2o.a(295698965);
    }

    public static /* synthetic */ Object ipc$super(qi6 qi6Var, String str, Object... objArr) {
        if (str.hashCode() == 1785185506) {
            super.prepareBindEventWithArgs((Object[]) objArr[0], (DXRuntimeContext) objArr[1]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/atype/flexalocal/good/dx/DXTlOpenInteractiveComponentEventHandler");
    }

    @Override // tb.ob5, tb.mvb
    public void prepareBindEventWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a67c4e2", new Object[]{this, objArr, dXRuntimeContext});
        } else {
            super.prepareBindEventWithArgs(objArr, dXRuntimeContext);
        }
    }

    @Override // tb.l10
    public void c(DXEvent dXEvent, Object[] objArr, DXRuntimeContext dXRuntimeContext, xea xeaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("86174a8b", new Object[]{this, dXEvent, objArr, dXRuntimeContext, xeaVar});
        } else if (objArr != null && objArr.length > 2 && (objArr[0] instanceof String) && (objArr[1] instanceof String) && (objArr[2] instanceof JSONObject)) {
            Context h = dXRuntimeContext.h();
            String str = (String) objArr[0];
            String str2 = (String) objArr[1];
            JSONObject jSONObject = (JSONObject) objArr[2];
            if (kkr.i().d() != null) {
                kkr.i().d().n(xeaVar == null ? null : xeaVar.q(), h, str, str2, jSONObject);
                HashMap<String, String> hashMap = new HashMap<>();
                if (jSONObject != null) {
                    hashMap.put("surpriseData", jSONObject.toJSONString());
                    hashMap.put("dxAction", str);
                    hashMap.put("componentName", str2);
                }
                if (kkr.i().o() != null) {
                    kkr.i().o().c("interactivelayeraction", hashMap);
                }
            }
        }
    }
}
