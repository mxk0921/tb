package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.expression.expr_v2.DXExprFunctionError;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class b16 extends za6 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(444597794);
    }

    public static /* synthetic */ Object ipc$super(b16 b16Var, String str, Object... objArr) {
        if (str.hashCode() == 1567011190) {
            return super.execute((DXRuntimeContext) objArr[0], (uw5) objArr[1], ((Number) objArr[2]).intValue(), (uw5[]) objArr[3], (Map) objArr[4]);
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dinamicx_v4/expr/fuction/animation/DXInfiniteRepeatableFunction");
    }

    @Override // tb.za6, tb.xwb
    public uw5 execute(DXRuntimeContext dXRuntimeContext, uw5 uw5Var, int i, uw5[] uw5VarArr, Map map) throws DXExprFunctionError {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (uw5) ipChange.ipc$dispatch("5d66b176", new Object[]{this, dXRuntimeContext, uw5Var, new Integer(i), uw5VarArr, map});
        }
        uw5 execute = super.execute(dXRuntimeContext, uw5Var, i, uw5VarArr, map);
        if (!(execute == null || !execute.H() || (jSONObject = execute.v().getJSONObject("params")) == null)) {
            jSONObject.put(cc5.ITERATIONS, (Object) (-1));
        }
        return execute;
    }

    @Override // tb.za6, tb.xwb
    public String getDxFunctionName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bc5916ec", new Object[]{this});
        }
        return "infiniteRepeatable";
    }
}
