package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.DinamicXEngine;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class ts5 extends nb5 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_PARSER_TOBINDINGXUNIT = 6677129169796262308L;

    static {
        t2o.a(444596787);
    }

    public static /* synthetic */ Object ipc$super(ts5 ts5Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dinamicx/expression/ExepressionEvaluation/DXDataParserToBindingXUnit");
    }

    @Override // tb.nb5, tb.wvb, tb.xwb
    public String getDxFunctionName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bc5916ec", new Object[]{this});
        }
        return "toBindingXUnit";
    }

    @Override // tb.nb5, tb.evb
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        if (objArr != null) {
            try {
                if (objArr.length == 1) {
                    Object obj = objArr[0];
                    if (obj instanceof Number) {
                        return Integer.valueOf(pb6.d(dXRuntimeContext.r(), DinamicXEngine.x(), ((Number) obj).floatValue()));
                    }
                    if (!(obj instanceof String)) {
                        return 0;
                    }
                    String str = (String) obj;
                    if (str.endsWith("ap")) {
                        i = pb6.d(dXRuntimeContext.r(), DinamicXEngine.x(), Float.parseFloat(str.substring(0, str.length() - 2)));
                    } else if (!str.endsWith("np")) {
                        return Integer.valueOf(pb6.d(dXRuntimeContext.r(), DinamicXEngine.x(), Float.valueOf(str).floatValue()));
                    } else {
                        i = pb6.f(DinamicXEngine.x(), Float.parseFloat(str.substring(0, str.length() - 2)));
                    }
                    return Integer.valueOf(i);
                }
            } catch (Throwable unused) {
                return 0;
            }
        }
        return 0;
    }
}
