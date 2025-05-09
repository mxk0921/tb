package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.expression.expr_v2.DXExprFunctionError;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class ruq implements wvb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(444596848);
        t2o.a(444596839);
    }

    @Override // tb.wvb, tb.xwb
    public String getDxFunctionName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bc5916ec", new Object[]{this});
        }
        return pg1.ATOM_EXT_substring;
    }

    @Override // tb.wvb
    public mw5 call(DXRuntimeContext dXRuntimeContext, mw5 mw5Var, int i, mw5[] mw5VarArr, by5 by5Var) throws DXExprFunctionError {
        mw5 mw5Var2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mw5) ipChange.ipc$dispatch("adf07d76", new Object[]{this, dXRuntimeContext, mw5Var, new Integer(i), mw5VarArr, by5Var});
        }
        if (i == 0) {
            throw new DXExprFunctionError("argc == 0");
        } else if (mw5Var == null || !mw5Var.E() || mw5Var.p() == null) {
            throw new DXExprFunctionError("self is not string");
        } else if (mw5VarArr == null || mw5VarArr.length != i) {
            throw new DXExprFunctionError("args == null || args.length != argc");
        } else {
            mw5 mw5Var3 = mw5VarArr[0];
            if (mw5Var3 == null || !mw5Var3.y()) {
                throw new DXExprFunctionError("start index is not int");
            }
            String p = mw5Var.p();
            long m = mw5Var3.m();
            long length = p.length();
            if (i == 2 && (mw5Var2 = mw5VarArr[1]) != null && mw5Var2.y()) {
                length = mw5Var2.m();
            }
            if (length <= m) {
                m = length;
                length = m;
            }
            if (m < 0) {
                m = 0;
            }
            if (m >= p.length()) {
                return mw5.O("");
            }
            if (length > p.length()) {
                return mw5.O(p.substring((int) m));
            }
            return mw5.O(p.substring((int) m, (int) length));
        }
    }
}
