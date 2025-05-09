package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.infoflow.protocol.subservice.biz.ICacheReqBizParamsService;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class bm5 extends nb5 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_PARSER_HGETREQBIZPARAM = -3327440748624871211L;

    static {
        t2o.a(486539379);
    }

    public static /* synthetic */ Object ipc$super(bm5 bm5Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/infoflow/core/subservice/base/item/dxservice/impl/dinamic3/parser/DXDataParserHGetReqBizParam");
    }

    @Override // tb.nb5, tb.evb
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        if (!(objArr == null || objArr.length == 0)) {
            try {
                String str = (String) objArr[0];
                String str2 = objArr.length >= 2 ? (String) objArr[1] : null;
                String str3 = objArr.length >= 3 ? (String) objArr[2] : null;
                fve.e("DXDataParserHGetReqBizParam", "handleEvent containerId : " + str + ",key : " + str2 + ",mode : " + str3);
                if (TextUtils.isEmpty(str2)) {
                    fve.e("DXDataParserHGetReqBizParam", "参数异常！");
                    return null;
                }
                cfc c = j18.c(dXRuntimeContext);
                if (c == null) {
                    fve.e("DXDataParserHGetReqBizParam", "infoFlowContext is null");
                    return null;
                }
                ICacheReqBizParamsService iCacheReqBizParamsService = (ICacheReqBizParamsService) c.a(ICacheReqBizParamsService.class);
                if (iCacheReqBizParamsService != null) {
                    return iCacheReqBizParamsService.readReqBizParam(str2, null, i38.a(str3));
                }
                fve.e("DXDataParserHGetReqBizParam", "cacheReqBizParamsService is null");
                return null;
            } catch (Throwable th) {
                fve.e("DXDataParserHGetReqBizParam", "handleEvent error : " + th.getMessage());
            }
        }
        return null;
    }
}
