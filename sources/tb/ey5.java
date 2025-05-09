package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.expression.expr_v2.DXExprFunctionError;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class ey5 extends uu {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(444597781);
    }

    public static /* synthetic */ Object ipc$super(ey5 ey5Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dinamicx_v4/expr/fuction/DXGetObjForKeyPathFunction");
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
        StringTokenizer stringTokenizer = new StringTokenizer(uw5VarArr[1].w(), " .[]", false);
        Object z = uw5VarArr[0].z();
        while (stringTokenizer.hasMoreElements()) {
            try {
                String nextToken = stringTokenizer.nextToken();
                if (z instanceof Map) {
                    z = ((Map) z).get(nextToken);
                } else if (z instanceof List) {
                    z = ((List) z).get(Integer.parseInt(nextToken));
                }
            } catch (Exception e) {
                throw new DXExprFunctionError(e);
            }
        }
        if (z == null) {
            return uw5.V();
        }
        return uw5.T(z);
    }

    @Override // tb.xwb
    public String getDxFunctionName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bc5916ec", new Object[]{this});
        }
        return rvb.CONST_FUNC_GET_OBJ_FOR_KEY_PATH;
    }
}
