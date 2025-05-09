package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.dinamicx.expression.expr_v2.DXExprFunctionError;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public abstract class ob5 implements mvb, wvb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(444596470);
        t2o.a(444596616);
        t2o.a(444596839);
    }

    @Override // tb.wvb
    public mw5 call(DXRuntimeContext dXRuntimeContext, mw5 mw5Var, int i, mw5[] mw5VarArr, by5 by5Var) throws DXExprFunctionError {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mw5) ipChange.ipc$dispatch("adf07d76", new Object[]{this, dXRuntimeContext, mw5Var, new Integer(i), mw5VarArr, by5Var});
        }
        if (i >= 0) {
            Object[] objArr = new Object[i];
            for (int i2 = 0; i2 < i; i2++) {
                objArr[i2] = mw5.Q(mw5VarArr[i2]);
            }
            if (by5Var.a() == null || !by5Var.a().isPrepareBind()) {
                handleEvent(by5Var.a(), objArr, dXRuntimeContext);
            } else {
                prepareBindEventWithArgs(objArr, dXRuntimeContext);
            }
            return mw5.d(null);
        }
        if (by5Var.a() == null || !by5Var.a().isPrepareBind()) {
            handleEvent(by5Var.a(), null, dXRuntimeContext);
        } else {
            prepareBindEventWithArgs(null, dXRuntimeContext);
        }
        return mw5.M();
    }

    public String getDxFunctionName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bc5916ec", new Object[]{this});
        }
        return null;
    }

    @Override // tb.mvb
    public abstract void handleEvent(DXEvent dXEvent, Object[] objArr, DXRuntimeContext dXRuntimeContext);

    @Override // tb.mvb
    public void prepareBindEventWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a67c4e2", new Object[]{this, objArr, dXRuntimeContext});
        }
    }
}
