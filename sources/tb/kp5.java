package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.infoflow.core.exception.InfoFlowRuntimeException;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class kp5 extends nb5 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_PARSER_RTOJSON = 5284242828433939926L;

    static {
        t2o.a(486539386);
    }

    public static /* synthetic */ Object ipc$super(kp5 kp5Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/infoflow/core/subservice/base/item/dxservice/impl/dinamic3/parser/DXDataParserRToJson");
    }

    @Override // tb.nb5, tb.evb
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        JSONObject jSONObject = null;
        if (!(objArr == null || objArr.length == 0)) {
            if (objArr.length % 2 == 0) {
                jSONObject = new JSONObject();
                for (int i = 0; i < objArr.length; i += 2) {
                    jSONObject.put((String) objArr[i], objArr[i + 1]);
                }
            } else if (!eue.b()) {
                return null;
            } else {
                throw new InfoFlowRuntimeException("illegal operationList");
            }
        }
        return jSONObject;
    }
}
