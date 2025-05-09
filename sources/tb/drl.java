package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.expression.expr_v2.DXExprFunctionError;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class drl implements wvb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(444596846);
        t2o.a(444596839);
    }

    @Override // tb.wvb
    public mw5 call(DXRuntimeContext dXRuntimeContext, mw5 mw5Var, int i, mw5[] mw5VarArr, by5 by5Var) throws DXExprFunctionError {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mw5) ipChange.ipc$dispatch("adf07d76", new Object[]{this, dXRuntimeContext, mw5Var, new Integer(i), mw5VarArr, by5Var});
        }
        if (i == 0) {
            throw new DXExprFunctionError("argc == 0");
        } else if (mw5VarArr == null || mw5VarArr.length != i) {
            throw new DXExprFunctionError("args == null || args.length != argc");
        } else {
            mw5 mw5Var2 = mw5VarArr[0];
            if (mw5Var2 == null || (!mw5Var2.E() && !mw5Var2.B())) {
                throw new DXExprFunctionError("args[0] not string or number");
            }
            if (mw5Var2.E()) {
                str = mw5Var2.p();
            } else {
                str = String.valueOf(mw5Var2.b());
            }
            return mw5.I(Double.parseDouble(str));
        }
    }

    @Override // tb.wvb, tb.xwb
    public String getDxFunctionName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bc5916ec", new Object[]{this});
        }
        return pg1.ATOM_EXT_parseFloat;
    }
}
