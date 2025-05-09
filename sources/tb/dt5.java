package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import tb.f46;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class dt5 extends pb5 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(444596796);
    }

    public static /* synthetic */ Object ipc$super(dt5 dt5Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dinamicx/expression/ExepressionEvaluation/DXDataParserTriple");
    }

    @Override // tb.pb5
    public Object a(Object[] objArr, DXRuntimeContext dXRuntimeContext, f46.a aVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("5ef83ee9", new Object[]{this, objArr, dXRuntimeContext, aVar, new Integer(i)});
        }
        if (dXRuntimeContext != null && dXRuntimeContext.a0() && i == 0) {
            if (o66.d(objArr[0])) {
                return null;
            }
            aVar.f18991a = false;
            aVar.b = 1;
        }
        if (i < 1) {
            return null;
        }
        if (i != 1) {
            aVar.f18991a = true;
            if (i == 2) {
                return objArr[2];
            }
            return null;
        } else if (!o66.d(objArr[0])) {
            return null;
        } else {
            aVar.f18991a = true;
            return objArr[1];
        }
    }

    @Override // tb.nb5, tb.wvb, tb.xwb
    public String getDxFunctionName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bc5916ec", new Object[]{this});
        }
        return "triple";
    }
}
