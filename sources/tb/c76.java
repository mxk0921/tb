package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.expression.expr_v2.DXExprFunctionError;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class c76 extends uu {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(444597851);
    }

    public static /* synthetic */ Object ipc$super(c76 c76Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dinamicx_v4/expr/fuction/sys/DXOrangeFunction");
    }

    @Override // tb.xwb
    public String getDxFunctionName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bc5916ec", new Object[]{this});
        }
        return "orange";
    }

    @Override // tb.xwb
    public uw5 execute(DXRuntimeContext dXRuntimeContext, uw5 uw5Var, int i, uw5[] uw5VarArr, Map map) throws DXExprFunctionError {
        uw5 uw5Var2;
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (uw5) ipChange.ipc$dispatch("5d66b176", new Object[]{this, dXRuntimeContext, uw5Var, new Integer(i), uw5VarArr, map});
        }
        if (uw5VarArr == null || uw5VarArr.length < 2 || !uw5VarArr[0].M() || !uw5VarArr[1].M()) {
            la6.b("调用 orange 传入的参数不合法");
            return uw5.V();
        }
        ch5 ch5Var = new ch5();
        String w = uw5VarArr[0].w();
        if (TextUtils.isEmpty(w)) {
            return uw5.V();
        }
        String w2 = uw5VarArr[1].w();
        if (TextUtils.isEmpty(w2)) {
            return uw5.V();
        }
        if (uw5VarArr.length >= 3) {
            uw5Var2 = uw5VarArr[2];
        } else {
            uw5Var2 = uw5.V();
        }
        if (uw5Var2 == null) {
            str = "";
        } else {
            str = uw5Var2.w();
        }
        return uw5.W(ch5Var.getConfig(w, w2, str));
    }
}
