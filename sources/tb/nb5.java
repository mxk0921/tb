package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.dinamicx.expression.expr_v2.DXExprFunctionError;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public abstract class nb5 implements evb, wvb, xwb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(444596850);
        t2o.a(444596865);
        t2o.a(444596839);
        t2o.a(444598023);
    }

    @Override // tb.wvb
    public mw5 call(DXRuntimeContext dXRuntimeContext, mw5 mw5Var, int i, mw5[] mw5VarArr, by5 by5Var) throws DXExprFunctionError {
        Object obj;
        Object obj2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mw5) ipChange.ipc$dispatch("adf07d76", new Object[]{this, dXRuntimeContext, mw5Var, new Integer(i), mw5VarArr, by5Var});
        }
        if (i >= 0) {
            Object[] objArr = new Object[i];
            for (int i2 = 0; i2 < i; i2++) {
                objArr[i2] = mw5.Q(mw5VarArr[i2]);
            }
            if (this instanceof dk5) {
                obj2 = ((dk5) this).e(by5Var.a(), objArr, dXRuntimeContext);
            } else {
                obj2 = evalWithArgs(objArr, dXRuntimeContext);
            }
            return mw5.d(obj2);
        }
        if (this instanceof dk5) {
            obj = ((dk5) this).e(by5Var.a(), null, dXRuntimeContext);
        } else {
            obj = evalWithArgs(null, dXRuntimeContext);
        }
        return mw5.d(obj);
    }

    @Override // tb.evb
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        return null;
    }

    public uw5 execute(DXRuntimeContext dXRuntimeContext, uw5 uw5Var, int i, uw5[] uw5VarArr, Map map) throws DXExprFunctionError {
        Object obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (uw5) ipChange.ipc$dispatch("5d66b176", new Object[]{this, dXRuntimeContext, uw5Var, new Integer(i), uw5VarArr, map});
        }
        DXEvent dXEvent = null;
        Object[] objArr = null;
        for (int i2 = 0; i2 < i; i2++) {
            if (objArr == null) {
                objArr = new Object[i];
            }
            objArr[i2] = uw5.a0(uw5VarArr[i2]);
        }
        if (map != null) {
            Object obj2 = map.get(xwb.EXTRA_PARAMS_EVENT);
            if (obj2 instanceof DXEvent) {
                dXEvent = (DXEvent) obj2;
            }
        }
        if (this instanceof dk5) {
            obj = ((dk5) this).e(dXEvent, objArr, dXRuntimeContext);
        } else {
            obj = evalWithArgs(objArr, dXRuntimeContext);
        }
        return uw5.T(obj);
    }

    public String getDxFunctionName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bc5916ec", new Object[]{this});
        }
        return null;
    }
}
