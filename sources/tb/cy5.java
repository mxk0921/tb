package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.infoflow.protocol.subservice.framework.IContainerDataService;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class cy5 extends ob5 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_EVENT_GATEWAYREQUEST = 1327792775266732521L;

    static {
        t2o.a(491782585);
    }

    public static /* synthetic */ Object ipc$super(cy5 cy5Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/infoflow/taobao/subservice/biz/pop/dx/event/DXGatewayRequestEventHandler");
    }

    @Override // tb.ob5, tb.mvb
    public void handleEvent(DXEvent dXEvent, Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        cfc c;
        IContainerDataService iContainerDataService;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9db7b67", new Object[]{this, dXEvent, objArr, dXRuntimeContext});
        } else if (objArr != null && objArr.length >= 1 && objArr[0] != null && (c = j18.c(dXRuntimeContext)) != null && (iContainerDataService = (IContainerDataService) c.a(IContainerDataService.class)) != null) {
            String obj = objArr[0].toString();
            JSONObject jSONObject = new JSONObject();
            if (objArr.length > 1) {
                Object obj2 = objArr[1];
                if (obj2 instanceof JSONObject) {
                    jSONObject = (JSONObject) obj2;
                }
            }
            if (objArr.length > 2) {
                Object obj3 = objArr[2];
                if (obj3 instanceof JSONObject) {
                    jSONObject.putAll((JSONObject) obj3);
                }
            }
            iContainerDataService.triggerEvent(obj, jSONObject);
        }
    }
}
