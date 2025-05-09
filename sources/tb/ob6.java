package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.expression.expr_v2.DXExprFunctionError;
import java.util.Map;
import tb.vu3;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class ob6 extends nb5 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_PARSER_SCREEN = 10147651446708230L;

    static {
        t2o.a(444597853);
    }

    public static /* synthetic */ Object ipc$super(ob6 ob6Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dinamicx_v4/expr/fuction/sys/DXScreenFunction");
    }

    @Override // tb.nb5, tb.wvb, tb.xwb
    public String getDxFunctionName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bc5916ec", new Object[]{this});
        }
        return "screen";
    }

    @Override // tb.nb5, tb.evb
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        if (objArr == null || objArr.length < 1 || !(objArr[0] instanceof String) || dXRuntimeContext.h() == null) {
            return Double.valueOf((double) vu3.b.GEO_NOT_SUPPORT);
        }
        String str = (String) objArr[0];
        Context h = dXRuntimeContext.h();
        if (str.equalsIgnoreCase("width")) {
            return Integer.valueOf(pb6.A(dXRuntimeContext.r(), h, pb6.s(h)));
        }
        if (str.equalsIgnoreCase("height")) {
            return Integer.valueOf(pb6.A(dXRuntimeContext.r(), h, pb6.r(h)));
        }
        return Double.valueOf((double) vu3.b.GEO_NOT_SUPPORT);
    }

    @Override // tb.nb5, tb.xwb
    public uw5 execute(DXRuntimeContext dXRuntimeContext, uw5 uw5Var, int i, uw5[] uw5VarArr, Map map) throws DXExprFunctionError {
        Context context;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (uw5) ipChange.ipc$dispatch("5d66b176", new Object[]{this, dXRuntimeContext, uw5Var, new Integer(i), uw5VarArr, map});
        }
        if (uw5VarArr == null || uw5VarArr.length < 1 || !uw5VarArr[0].M() || dXRuntimeContext.h() == null) {
            return uw5.P(vu3.b.GEO_NOT_SUPPORT);
        }
        String w = uw5VarArr[0].w();
        if (dXRuntimeContext.r().y() != null) {
            context = dXRuntimeContext.r().y();
        } else {
            context = dXRuntimeContext.h();
        }
        if (w.equalsIgnoreCase("width")) {
            return uw5.P(pb6.A(dXRuntimeContext.r(), context, pb6.s(context)));
        }
        if (w.equalsIgnoreCase("height")) {
            return uw5.P(pb6.A(dXRuntimeContext.r(), context, pb6.r(context)));
        }
        return uw5.P(vu3.b.GEO_NOT_SUPPORT);
    }
}
