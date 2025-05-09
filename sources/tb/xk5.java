package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.DinamicXEngine;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class xk5 extends rw5 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(444596738);
    }

    public static /* synthetic */ Object ipc$super(xk5 xk5Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dinamicx/expression/ExepressionEvaluation/DXDataParserGetEngineStorage");
    }

    @Override // tb.rw5
    public Object a(DXRuntimeContext dXRuntimeContext) {
        DinamicXEngine f;
        qv5 H;
        y7 p;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("8dd225a", new Object[]{this, dXRuntimeContext});
        }
        av5 s = dXRuntimeContext.s();
        if (s == null || (f = s.f()) == null || (H = f.H()) == null || (p = H.p()) == null) {
            return null;
        }
        return p.e();
    }

    @Override // tb.nb5, tb.wvb, tb.xwb
    public String getDxFunctionName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bc5916ec", new Object[]{this});
        }
        return "getEngineStorage";
    }
}
