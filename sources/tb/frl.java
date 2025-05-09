package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.expression.expr_v2.DXExprFunctionError;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class frl implements wvb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(444596847);
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
            int i2 = 10;
            if (mw5Var2.E()) {
                str = mw5Var2.p();
                if (str.startsWith("0x") || str.startsWith("0X")) {
                    i2 = 16;
                }
            } else {
                str = String.valueOf((long) Math.floor(mw5Var2.b()));
            }
            if (i == 2) {
                mw5 mw5Var3 = mw5VarArr[1];
                if (mw5Var3 == null || !mw5Var3.y()) {
                    throw new DXExprFunctionError("args[1] not int");
                }
                i2 = (int) mw5Var3.m();
            }
            return mw5.K(Long.parseLong(str, i2));
        }
    }

    @Override // tb.wvb, tb.xwb
    public String getDxFunctionName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bc5916ec", new Object[]{this});
        }
        return pg1.ATOM_EXT_parseInt;
    }
}
