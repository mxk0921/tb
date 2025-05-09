package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class dk5 extends lv5 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_PARSER_DXEVENTPROP = -3357931786827536758L;

    static {
        t2o.a(444596729);
    }

    public static /* synthetic */ Object ipc$super(dk5 dk5Var, String str, Object... objArr) {
        if (str.hashCode() == -858210922) {
            return dk5Var.evalWithArgs((Object[]) objArr[0], (DXRuntimeContext) objArr[1]);
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dinamicx/expression/ExepressionEvaluation/DXDataParserDxEventProp");
    }

    public Object e(DXEvent dXEvent, Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("e62c7c91", new Object[]{this, dXEvent, objArr, dXRuntimeContext});
        }
        Object evalWithArgs = evalWithArgs(objArr, dXRuntimeContext);
        if (evalWithArgs != null) {
            return evalWithArgs;
        }
        if (objArr == null || objArr.length == 0 || !(objArr[0] instanceof String) || dXEvent == null) {
            return new JSONObject();
        }
        if (dXEvent.getArgs() == null || dXEvent.getArgs().isEmpty()) {
            jSONObject = srf.i(dXEvent, true, DXEvent.class);
        } else {
            jSONObject = new JSONObject();
            for (Map.Entry<String, mw5> entry : dXEvent.getArgs().entrySet()) {
                if (!(entry.getKey() == null || entry.getValue() == null)) {
                    jSONObject.put(entry.getKey(), entry.getValue().s());
                }
            }
        }
        return b((String) objArr[0], jSONObject, dXRuntimeContext);
    }

    @Override // tb.lv5, tb.nb5, tb.wvb, tb.xwb
    public String getDxFunctionName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bc5916ec", new Object[]{this});
        }
        return "dxEventProp";
    }
}
