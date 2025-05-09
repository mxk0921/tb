package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.dinamicx.expression.expr_v2.DXExprFunctionError;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class hn5 extends nb5 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(444596751);
    }

    public static /* synthetic */ Object ipc$super(hn5 hn5Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dinamicx/expression/ExepressionEvaluation/DXDataParserIsRtl");
    }

    public final boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("37f1416b", new Object[]{this})).booleanValue();
        }
        if (DinamicXEngine.x().getResources().getConfiguration().getLayoutDirection() == 1) {
            return true;
        }
        return false;
    }

    @Override // tb.nb5, tb.evb
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        return Boolean.valueOf(a());
    }

    @Override // tb.nb5, tb.xwb
    public uw5 execute(DXRuntimeContext dXRuntimeContext, uw5 uw5Var, int i, uw5[] uw5VarArr, Map map) throws DXExprFunctionError {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (uw5) ipChange.ipc$dispatch("5d66b176", new Object[]{this, dXRuntimeContext, uw5Var, new Integer(i), uw5VarArr, map});
        }
        if (DinamicXEngine.x().getResources().getConfiguration().getLayoutDirection() == 1) {
            return uw5.O(true);
        }
        return uw5.O(false);
    }

    @Override // tb.nb5, tb.wvb, tb.xwb
    public String getDxFunctionName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bc5916ec", new Object[]{this});
        }
        return "isRTL";
    }
}
