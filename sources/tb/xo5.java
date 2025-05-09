package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.infoflow.protocol.subservice.base.IConfigService;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class xo5 extends nb5 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_PARSER_ORANGE = 9860385864900610L;

    static {
        t2o.a(486539385);
    }

    public static /* synthetic */ Object ipc$super(xo5 xo5Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/infoflow/core/subservice/base/item/dxservice/impl/dinamic3/parser/DXDataParserOrange");
    }

    public final IConfigService a(DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IConfigService) ipChange.ipc$dispatch("5ee5adde", new Object[]{this, dXRuntimeContext});
        }
        if (dXRuntimeContext == null) {
            fve.e("DXDataParserOrange", "dxRuntimeContext == null");
            return null;
        }
        cfc c = j18.c(dXRuntimeContext);
        if (c != null) {
            return (IConfigService) c.a(IConfigService.class);
        }
        fve.e("DXDataParserOrange", "infoFlowContext == null");
        return null;
    }

    @Override // tb.nb5, tb.evb
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IConfigService a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        if (objArr == null || objArr.length < 2 || (a2 = a(dXRuntimeContext)) == null) {
            return null;
        }
        try {
            return a2.getConfig((String) objArr[0], (String) objArr[1], objArr.length > 2 ? (String) objArr[2] : null);
        } catch (Throwable th) {
            fve.c("DXDataParserOrange", "解析参数异常", th);
            return null;
        }
    }
}
