package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.expression.expr_v2.DXExprFunctionError;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class n2a implements wvb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final String f24463a;
    public final xvb b;

    static {
        t2o.a(444596843);
        t2o.a(444596839);
    }

    public n2a(xvb xvbVar, String str) {
        this.f24463a = str;
        this.b = xvbVar;
    }

    @Override // tb.wvb
    public mw5 call(DXRuntimeContext dXRuntimeContext, mw5 mw5Var, int i, mw5[] mw5VarArr, by5 by5Var) throws DXExprFunctionError {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mw5) ipChange.ipc$dispatch("adf07d76", new Object[]{this, dXRuntimeContext, mw5Var, new Integer(i), mw5VarArr, by5Var});
        }
        return this.b.a(dXRuntimeContext, mw5Var, i, mw5VarArr, this.f24463a, by5Var);
    }

    @Override // tb.wvb, tb.xwb
    public String getDxFunctionName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bc5916ec", new Object[]{this});
        }
        return this.f24463a;
    }
}
