package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.expression.expr_v2.DXExprFunctionError;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class od6 extends uu {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(444597787);
    }

    public static /* synthetic */ Object ipc$super(od6 od6Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dinamicx_v4/expr/fuction/DXSubStringFunction");
    }

    @Override // tb.xwb
    public uw5 execute(DXRuntimeContext dXRuntimeContext, uw5 uw5Var, int i, uw5[] uw5VarArr, Map map) throws DXExprFunctionError {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (uw5) ipChange.ipc$dispatch("5d66b176", new Object[]{this, dXRuntimeContext, uw5Var, new Integer(i), uw5VarArr, map});
        }
        if (uw5VarArr == null || uw5VarArr.length <= 0 || uw5Var == null) {
            return uw5.V();
        }
        if (!uw5Var.M()) {
            return uw5.V();
        }
        int s = uw5VarArr[0].s();
        if (uw5VarArr.length == 1) {
            return uw5.W(uw5Var.toString().substring(s));
        }
        return uw5.W(uw5Var.toString().substring(s, uw5VarArr[1].s()));
    }

    @Override // tb.xwb
    public String getDxFunctionName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bc5916ec", new Object[]{this});
        }
        return pg1.ATOM_EXT_substring;
    }
}
