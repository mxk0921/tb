package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.expression.expr_v2.DXExprFunctionError;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class t9h implements wvb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    @Override // tb.wvb
    public mw5 call(DXRuntimeContext dXRuntimeContext, mw5 mw5Var, int i, mw5[] mw5VarArr, by5 by5Var) throws DXExprFunctionError {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mw5) ipChange.ipc$dispatch("adf07d76", new Object[]{this, dXRuntimeContext, mw5Var, new Integer(i), mw5VarArr, by5Var});
        }
        if (i >= 2) {
            mw5 mw5Var2 = mw5VarArr[0];
            mw5 mw5Var3 = mw5VarArr[1];
            if (mw5Var2 == null || !mw5Var2.E()) {
                throw new DXExprFunctionError("args[0] not string");
            } else if (mw5Var3 == null || !mw5Var3.E()) {
                throw new DXExprFunctionError("args[1] not string");
            } else {
                qpc g = uvh.f().g();
                if (g != null) {
                    g.f(mw5Var2.p(), mw5Var3.p(), null);
                }
                return null;
            }
        } else {
            throw new DXExprFunctionError("argc < 2");
        }
    }

    @Override // tb.wvb, tb.xwb
    public String getDxFunctionName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bc5916ec", new Object[]{this});
        }
        return "setItem";
    }
}
