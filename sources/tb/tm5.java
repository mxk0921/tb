package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import tb.f46;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class tm5 extends pb5 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(444596745);
    }

    public static /* synthetic */ Object ipc$super(tm5 tm5Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dinamicx/expression/ExepressionEvaluation/DXDataParserIf");
    }

    @Override // tb.pb5
    public Object a(Object[] objArr, DXRuntimeContext dXRuntimeContext, f46.a aVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("5ef83ee9", new Object[]{this, objArr, dXRuntimeContext, aVar, new Integer(i)});
        }
        if (i == 0) {
            aVar.f18991a = !o66.d(objArr[0]);
            return null;
        }
        aVar.f18991a = true;
        if (i == 1) {
            return objArr[1];
        }
        return null;
    }

    @Override // tb.nb5, tb.wvb, tb.xwb
    public String getDxFunctionName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bc5916ec", new Object[]{this});
        }
        return "if";
    }
}
