package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXDarkModeCenter;
import com.taobao.android.dinamicx.DXRuntimeContext;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class bt5 extends nb5 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_PARSER_TRANSFORMEDDESIGNTOKEN = -3169321930677834474L;

    static {
        t2o.a(444596794);
    }

    public static /* synthetic */ Object ipc$super(bt5 bt5Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dinamicx/expression/ExepressionEvaluation/DXDataParserTransformedDesignToken");
    }

    @Override // tb.nb5, tb.evb
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        int length;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        if (objArr != null && (length = objArr.length) >= 1 && Integer.parseInt(String.valueOf(objArr[0])) >= 1) {
            if (length < 3) {
                h36.c("dxDesignToken  传入的token不合法，解析不出来对应的值");
            } else if (DXDarkModeCenter.c(dXRuntimeContext)) {
                return objArr[2];
            } else {
                return objArr[1];
            }
        }
        return null;
    }
}
