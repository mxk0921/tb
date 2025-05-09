package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.infoflow.protocol.subservice.biz.ICacheReqBizParamsService;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class pz5 extends ob5 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_EVENT_HSETREQBIZPARAM = 9068808819005234401L;

    static {
        t2o.a(486539358);
    }

    public static /* synthetic */ Object ipc$super(pz5 pz5Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/infoflow/core/subservice/base/item/dxservice/impl/dinamic3/eventhandler/DXHSetReqBizParamEventHandler");
    }

    @Override // tb.ob5, tb.mvb
    public void handleEvent(DXEvent dXEvent, Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9db7b67", new Object[]{this, dXEvent, objArr, dXRuntimeContext});
        } else if (objArr != null && objArr.length >= 3) {
            try {
                String str = (String) objArr[0];
                String str2 = (String) objArr[1];
                String str3 = (String) objArr[2];
                String str4 = objArr.length >= 4 ? (String) objArr[3] : null;
                fve.e("DXHSetReqBizParamEventHandler", "handleEvent containerId : " + str + ",key : " + str2 + ",value : " + str3 + ",mode : " + str4);
                if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
                    cfc c = j18.c(dXRuntimeContext);
                    if (c == null) {
                        fve.e("DXHSetReqBizParamEventHandler", "infoFlowContext is null");
                        return;
                    }
                    ICacheReqBizParamsService iCacheReqBizParamsService = (ICacheReqBizParamsService) c.a(ICacheReqBizParamsService.class);
                    if (iCacheReqBizParamsService == null) {
                        fve.e("DXHSetReqBizParamEventHandler", "cacheReqBizParamsService is null");
                        return;
                    } else {
                        iCacheReqBizParamsService.saveReqBizParam(str2, str3, i38.a(str4));
                        return;
                    }
                }
                fve.e("DXHSetReqBizParamEventHandler", "参数异常！");
            } catch (Throwable th) {
                fve.e("DXHSetReqBizParamEventHandler", "handleEvent error : " + th.getMessage());
            }
        }
    }
}
