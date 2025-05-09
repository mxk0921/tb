package tb;

import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.expression.expr_v2.DXExprFunctionError;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class zqf implements xvb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(444596844);
        t2o.a(444596840);
    }

    public mw5 b(mw5 mw5Var) throws DXExprFunctionError {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mw5) ipChange.ipc$dispatch("a0178e9c", new Object[]{this, mw5Var});
        }
        if (mw5Var != null && mw5Var.E()) {
            return mw5.N(JSON.parseObject(mw5Var.p()));
        }
        throw new DXExprFunctionError("args[0] not string");
    }

    public final mw5 c(mw5 mw5Var) throws DXExprFunctionError {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mw5) ipChange.ipc$dispatch("f9a50924", new Object[]{this, mw5Var});
        }
        if (mw5Var != null && mw5Var.C() && mw5Var.o() != null) {
            return mw5.O(mw5Var.o().toJSONString());
        }
        throw new DXExprFunctionError("args[0] not object");
    }

    @Override // tb.xvb
    public mw5 a(DXRuntimeContext dXRuntimeContext, mw5 mw5Var, int i, mw5[] mw5VarArr, String str, by5 by5Var) throws DXExprFunctionError {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mw5) ipChange.ipc$dispatch("83ca6dc0", new Object[]{this, dXRuntimeContext, mw5Var, new Integer(i), mw5VarArr, str, by5Var});
        }
        if (i == 0) {
            throw new DXExprFunctionError("argc == 0");
        } else if (mw5VarArr == null || mw5VarArr.length != i) {
            throw new DXExprFunctionError("args == null || args.length != argc");
        } else {
            mw5 mw5Var2 = mw5VarArr[0];
            str.hashCode();
            if (str.equals(pg1.ATOM_EXT_stringify)) {
                return c(mw5Var2);
            }
            if (str.equals("parse")) {
                return b(mw5Var2);
            }
            throw new DXExprFunctionError("can not find function on JSON:".concat(str));
        }
    }
}
