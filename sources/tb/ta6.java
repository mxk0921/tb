package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.expression.expr_v2.DXExprFunctionError;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class ta6 extends uu {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(444597784);
    }

    public static /* synthetic */ Object ipc$super(ta6 ta6Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dinamicx_v4/expr/fuction/DXRemoveFunction");
    }

    @Override // tb.xwb
    public String getDxFunctionName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bc5916ec", new Object[]{this});
        }
        return "remove";
    }

    @Override // tb.xwb
    public uw5 execute(DXRuntimeContext dXRuntimeContext, uw5 uw5Var, int i, uw5[] uw5VarArr, Map map) throws DXExprFunctionError {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (uw5) ipChange.ipc$dispatch("5d66b176", new Object[]{this, dXRuntimeContext, uw5Var, new Integer(i), uw5VarArr, map});
        }
        if (uw5VarArr == null || uw5VarArr.length != 1 || uw5Var == null) {
            return uw5.V();
        }
        try {
            uw5 uw5Var2 = uw5VarArr[0];
            int x = uw5Var.x();
            if (x == 6) {
                return uw5.T(Boolean.valueOf(uw5Var.n().remove(uw5Var2.z())));
            }
            if (x == 7) {
                Object remove = uw5Var.v().remove(uw5Var2.w());
                if (remove == null) {
                    return uw5.V();
                }
                return uw5.T(remove);
            }
            throw new DXExprFunctionError("remove type has not size func type:" + x);
        } catch (Exception e) {
            throw new DXExprFunctionError(e);
        }
    }
}
