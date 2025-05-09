package tb;

import com.alibaba.fastjson.JSONArray;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.expression.expr_v2.DXExprFunctionError;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class rb1 implements wvb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(444596842);
        t2o.a(444596839);
    }

    @Override // tb.wvb, tb.xwb
    public String getDxFunctionName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bc5916ec", new Object[]{this});
        }
        return pg1.ATOM_EXT_slice;
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
        } else if (mw5Var == null || !mw5Var.t() || mw5Var.h() == null) {
            throw new DXExprFunctionError("self is not array");
        } else if (mw5VarArr == null || mw5VarArr.length != i) {
            throw new DXExprFunctionError("args == null || args.length != argc");
        } else {
            mw5 mw5Var3 = mw5VarArr[0];
            if (mw5Var3 == null || !mw5Var3.y()) {
                throw new DXExprFunctionError("start index is not int");
            }
            JSONArray h = mw5Var.h();
            long m = mw5Var3.m();
            if (m >= h.size() || m < 0) {
                return mw5.F(new JSONArray());
            }
            long size = h.size();
            if (i == 2 && (mw5Var2 = mw5VarArr[1]) != null && mw5Var2.y()) {
                size = mw5Var2.m();
            }
            if (size <= m) {
                return mw5.F(new JSONArray());
            }
            if (size > h.size()) {
                return mw5.F(new JSONArray(h.subList((int) m, h.size())));
            }
            return mw5.F(new JSONArray(h.subList((int) m, (int) size)));
        }
    }
}
