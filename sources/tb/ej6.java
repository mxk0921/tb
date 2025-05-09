package tb;

import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.expression.expr_v2.DXExprFunctionError;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class ej6 extends uu {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(444597802);
    }

    public static /* synthetic */ Object ipc$super(ej6 ej6Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dinamicx_v4/expr/fuction/json/DXToJSONStringFunction");
    }

    @Override // tb.xwb
    public String getDxFunctionName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bc5916ec", new Object[]{this});
        }
        return "toJSONString";
    }

    @Override // tb.xwb
    public uw5 execute(DXRuntimeContext dXRuntimeContext, uw5 uw5Var, int i, uw5[] uw5VarArr, Map map) throws DXExprFunctionError {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (uw5) ipChange.ipc$dispatch("5d66b176", new Object[]{this, dXRuntimeContext, uw5Var, new Integer(i), uw5VarArr, map});
        }
        if (uw5Var == null || uw5Var.I()) {
            if (!(uw5VarArr == null || uw5VarArr.length == 0)) {
                Object z = uw5VarArr[0].z();
                if ((z instanceof Map) || (z instanceof List)) {
                    return uw5.W(JSON.toJSONString(z));
                }
            }
            return uw5.V();
        }
        try {
            int x = uw5Var.x();
            if (x == 6) {
                return uw5.W(uw5Var.n().toJSONString());
            }
            if (x == 7) {
                return uw5.W(uw5Var.v().toJSONString());
            }
            throw new DXExprFunctionError("type has not toJSONString func type:" + x);
        } catch (Exception e) {
            throw new DXExprFunctionError(e);
        }
    }
}
