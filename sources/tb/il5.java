package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import tb.ql6;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class il5 extends nb5 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_PARSER_GET_SUB_VARIABLE = 8408886169094158494L;

    static {
        t2o.a(444596740);
    }

    public static /* synthetic */ Object ipc$super(il5 il5Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dinamicx/expression/ExepressionEvaluation/DXDataParserGetSubVariable");
    }

    @Override // tb.nb5, tb.evb
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        Object obj = null;
        if (!(objArr == null || objArr.length == 0)) {
            String valueOf = String.valueOf(objArr[0]);
            if (objArr.length == 2) {
                obj = objArr[1];
            }
            ql6 Q = dXRuntimeContext.Q();
            if (Q == null) {
                return obj;
            }
            Object d = Q.d(valueOf, dXRuntimeContext);
            if (d != null && !(d instanceof ql6.a)) {
                return d;
            }
        }
        return obj;
    }
}
