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
public class vh5 extends uu {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(444597798);
    }

    public static /* synthetic */ Object ipc$super(vh5 vh5Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dinamicx_v4/expr/fuction/data/DXDataFunction");
    }

    public Object a(DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("6c6f84d4", new Object[]{this, dXRuntimeContext});
        }
        return dXRuntimeContext.i();
    }

    @Override // tb.xwb
    public uw5 execute(DXRuntimeContext dXRuntimeContext, uw5 uw5Var, int i, uw5[] uw5VarArr, Map map) throws DXExprFunctionError {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (uw5) ipChange.ipc$dispatch("5d66b176", new Object[]{this, dXRuntimeContext, uw5Var, new Integer(i), uw5VarArr, map});
        }
        Object a2 = a(dXRuntimeContext);
        if (i != 1 && a2 != null) {
            return uw5.T(a2);
        }
        StringTokenizer stringTokenizer = new StringTokenizer(String.valueOf(uw5VarArr[0]), " .[]", false);
        while (stringTokenizer.hasMoreElements()) {
            try {
                String nextToken = stringTokenizer.nextToken();
                if (a2 instanceof Map) {
                    a2 = ((Map) a2).get(nextToken);
                } else if (a2 instanceof List) {
                    a2 = ((List) a2).get(Integer.parseInt(nextToken));
                }
            } catch (Exception e) {
                throw new DXExprFunctionError(e);
            }
        }
        if (a2 == null) {
            return uw5.V();
        }
        return uw5.T(a2);
    }

    @Override // tb.xwb
    public String getDxFunctionName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bc5916ec", new Object[]{this});
        }
        return "data";
    }
}
