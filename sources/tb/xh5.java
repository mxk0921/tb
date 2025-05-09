package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class xh5 extends nb5 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_PARSER_ABS = 516202497;

    static {
        t2o.a(444596710);
    }

    public static /* synthetic */ Object ipc$super(xh5 xh5Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dinamicx/expression/ExepressionEvaluation/DXDataParserAbs");
    }

    @Override // tb.nb5, tb.evb
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        if (objArr != null) {
            try {
                if (objArr.length == 1) {
                    Object obj = objArr[0];
                    if (!(obj instanceof Long) && !(obj instanceof Integer)) {
                        if (o66.c(obj)) {
                            return Double.valueOf(Math.abs(((Number) obj).doubleValue()));
                        }
                        if (!(obj instanceof String)) {
                            return 0L;
                        }
                        String str = (String) obj;
                        if (o66.b(str)) {
                            return Double.valueOf(Math.abs(Double.valueOf(str).doubleValue()));
                        }
                        return Long.valueOf(Math.abs(Long.valueOf(str).longValue()));
                    }
                    return Long.valueOf(Math.abs(((Number) obj).longValue()));
                }
            } catch (Throwable th) {
                xv5.b(th);
                return 0L;
            }
        }
        return 0L;
    }

    @Override // tb.nb5, tb.wvb, tb.xwb
    public String getDxFunctionName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bc5916ec", new Object[]{this});
        }
        return pg1.ATOM_EXT_abs;
    }
}
