package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.expression.expr_v2.DXExprFunctionError;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class gai implements xvb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(444596845);
        t2o.a(444596840);
    }

    public final mw5 b(mw5[] mw5VarArr) throws DXExprFunctionError {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mw5) ipChange.ipc$dispatch("c8c9f5a", new Object[]{this, mw5VarArr});
        }
        mw5 mw5Var = mw5VarArr[0];
        if (mw5Var == null || !mw5Var.B()) {
            throw new DXExprFunctionError("args[0] not number");
        } else if (mw5Var.y()) {
            return mw5.K(Math.abs(mw5Var.m()));
        } else {
            return mw5.I(Math.abs(mw5Var.k()));
        }
    }

    public final mw5 c(mw5[] mw5VarArr) throws DXExprFunctionError {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mw5) ipChange.ipc$dispatch("4be4c2ed", new Object[]{this, mw5VarArr});
        }
        mw5 mw5Var = mw5VarArr[0];
        if (mw5Var != null && mw5Var.B()) {
            return mw5.K((int) Math.ceil(mw5Var.b()));
        }
        throw new DXExprFunctionError("args[0] not number");
    }

    public final mw5 d(mw5[] mw5VarArr) throws DXExprFunctionError {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mw5) ipChange.ipc$dispatch("874cdc05", new Object[]{this, mw5VarArr});
        }
        mw5 mw5Var = mw5VarArr[0];
        if (mw5Var != null && mw5Var.B()) {
            return mw5.I(Math.exp(mw5Var.b()));
        }
        throw new DXExprFunctionError("args[0] not number");
    }

    public final mw5 e(mw5[] mw5VarArr) throws DXExprFunctionError {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mw5) ipChange.ipc$dispatch("cf71e4f4", new Object[]{this, mw5VarArr});
        }
        mw5 mw5Var = mw5VarArr[0];
        if (mw5Var != null && mw5Var.B()) {
            return mw5.K((int) Math.floor(mw5Var.b()));
        }
        throw new DXExprFunctionError("args[0] not number");
    }

    public final mw5 f(int i, mw5[] mw5VarArr) throws DXExprFunctionError {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mw5) ipChange.ipc$dispatch("3b655a59", new Object[]{this, new Integer(i), mw5VarArr});
        }
        mw5 mw5Var = null;
        for (int i2 = 0; i2 < i; i2++) {
            mw5 mw5Var2 = mw5VarArr[i2];
            if (mw5Var2 == null || !mw5Var2.B()) {
                throw new DXExprFunctionError("args[" + i2 + "] not number");
            }
            if (mw5Var == null || mw5Var.b() < mw5Var2.b()) {
                mw5Var = mw5Var2;
            }
        }
        return mw5Var;
    }

    public final mw5 g(int i, mw5[] mw5VarArr) throws DXExprFunctionError {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mw5) ipChange.ipc$dispatch("6bf1492b", new Object[]{this, new Integer(i), mw5VarArr});
        }
        mw5 mw5Var = null;
        for (int i2 = 0; i2 < i; i2++) {
            mw5 mw5Var2 = mw5VarArr[i2];
            if (mw5Var2 == null || !mw5Var2.B()) {
                throw new DXExprFunctionError("args[" + i2 + "] not number");
            }
            if (mw5Var == null || mw5Var.b() > mw5Var2.b()) {
                mw5Var = mw5Var2;
            }
        }
        return mw5Var;
    }

    public final mw5 h(mw5[] mw5VarArr) throws DXExprFunctionError {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mw5) ipChange.ipc$dispatch("b300f476", new Object[]{this, mw5VarArr});
        }
        mw5 mw5Var = mw5VarArr[0];
        if (mw5Var != null && mw5Var.B()) {
            return mw5.K(Math.round(mw5Var.b()));
        }
        throw new DXExprFunctionError("args[0] not number");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x004d, code lost:
        if (r14.equals(tb.pg1.ATOM_EXT_round) == false) goto L_0x0044;
     */
    @Override // tb.xvb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public tb.mw5 a(com.taobao.android.dinamicx.DXRuntimeContext r10, tb.mw5 r11, int r12, tb.mw5[] r13, java.lang.String r14, tb.by5 r15) throws com.taobao.android.dinamicx.expression.expr_v2.DXExprFunctionError {
        /*
            Method dump skipped, instructions count: 270
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.gai.a(com.taobao.android.dinamicx.DXRuntimeContext, tb.mw5, int, tb.mw5[], java.lang.String, tb.by5):tb.mw5");
    }
}
