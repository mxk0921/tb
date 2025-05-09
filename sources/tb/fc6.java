package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.expression.expr_v2.DXExprFunctionError;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class fc6 extends uu {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(444597785);
    }

    public static /* synthetic */ Object ipc$super(fc6 fc6Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dinamicx_v4/expr/fuction/DXSetFunction");
    }

    @Override // tb.xwb
    public String getDxFunctionName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bc5916ec", new Object[]{this});
        }
        return "set";
    }

    @Override // tb.xwb
    public uw5 execute(DXRuntimeContext dXRuntimeContext, uw5 uw5Var, int i, uw5[] uw5VarArr, Map map) throws DXExprFunctionError {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (uw5) ipChange.ipc$dispatch("5d66b176", new Object[]{this, dXRuntimeContext, uw5Var, new Integer(i), uw5VarArr, map});
        }
        if (uw5VarArr == null || uw5VarArr.length != 2 || uw5Var == null) {
            return uw5.V();
        }
        try {
            uw5 uw5Var2 = uw5VarArr[0];
            uw5 uw5Var3 = uw5VarArr[1];
            int x = uw5Var.x();
            if (x == 6) {
                Object obj = uw5Var.n().set(uw5Var2.s(), uw5Var3.z());
                if (obj == null) {
                    return uw5.V();
                }
                return uw5.T(obj);
            } else if (x == 7) {
                Object put = uw5Var.v().put(uw5Var2.w(), uw5Var3.z());
                if (put == null) {
                    return uw5.V();
                }
                return uw5.T(put);
            } else {
                throw new DXExprFunctionError("set type has not size func type:" + x);
            }
        } catch (Exception e) {
            throw new DXExprFunctionError(e);
        }
    }
}
