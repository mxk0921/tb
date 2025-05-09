package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class ah6 extends l10 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_EVENT_TBLIVESENDDYNAMICMESSAGE = -1436568498127284814L;

    static {
        t2o.a(295698944);
    }

    public static /* synthetic */ Object ipc$super(ah6 ah6Var, String str, Object... objArr) {
        if (str.hashCode() == 1785185506) {
            super.prepareBindEventWithArgs((Object[]) objArr[0], (DXRuntimeContext) objArr[1]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/atype/flexalocal/good/dx/DXTbliveSendDynamicMessageEventHandler");
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
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("86174a8b", new Object[]{this, dXEvent, objArr, dXRuntimeContext, xeaVar});
        } else if (objArr != null && objArr.length != 0 && (objArr[0] instanceof JSONObject) && kkr.i().d() != null) {
            JSONObject jSONObject = (JSONObject) objArr[0];
            beb d = kkr.i().d();
            ux9 q = xeaVar == null ? null : xeaVar.q();
            JSONObject jSONObject2 = jSONObject.getJSONObject("clientInteracts");
            if (!yga.N() || "true".equals(jSONObject.getString("platformCouponNewEntranceDegrade"))) {
                z = false;
            }
            d.k(q, jSONObject2, z);
            if (kkr.i().o() != null) {
                kkr.i().o().c("entryquanyi", new HashMap<>());
            }
        }
    }
}
