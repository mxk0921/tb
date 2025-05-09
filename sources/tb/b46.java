package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.expression.expr_v2.DXExprFunctionError;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class b46 extends uu {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(444597823);
    }

    public static /* synthetic */ Object ipc$super(b46 b46Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dinamicx_v4/expr/fuction/math/DXMaxFunction");
    }

    @Override // tb.xwb
    public uw5 execute(DXRuntimeContext dXRuntimeContext, uw5 uw5Var, int i, uw5[] uw5VarArr, Map map) throws DXExprFunctionError {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (uw5) ipChange.ipc$dispatch("5d66b176", new Object[]{this, dXRuntimeContext, uw5Var, new Integer(i), uw5VarArr, map});
        }
        if (uw5VarArr == null || uw5VarArr.length != 2 || uw5Var == null) {
            return uw5.S(0L);
        }
        try {
            uw5 uw5Var2 = uw5VarArr[0];
            uw5 uw5Var3 = uw5VarArr[1];
            if (uw5Var2.D() && uw5Var3.D()) {
                return uw5.P(Math.max(uw5Var2.q(), uw5Var3.q()));
            }
            if (uw5Var2.D()) {
                return uw5.P(Math.max(uw5Var2.q(), uw5Var3.s()));
            }
            if (uw5Var3.D()) {
                return uw5.P(Math.max(uw5Var2.s(), uw5Var3.q()));
            }
            return uw5.S(Math.max(uw5Var2.s(), uw5Var3.s()));
        } catch (Exception e) {
            throw new DXExprFunctionError(e);
        }
    }

    @Override // tb.xwb
    public String getDxFunctionName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bc5916ec", new Object[]{this});
        }
        return "max";
    }
}
