package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class kk5 extends nb5 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_PARSER_FLOOR = 17607284869383L;

    static {
        t2o.a(444596734);
    }

    public static /* synthetic */ Object ipc$super(kk5 kk5Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dinamicx/expression/ExepressionEvaluation/DXDataParserFloor");
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
                    if (obj instanceof Number) {
                        return Double.valueOf(Math.floor(((Number) obj).doubleValue()));
                    }
                    if (obj instanceof String) {
                        return Double.valueOf(Math.floor(Double.parseDouble((String) obj)));
                    }
                    return 0L;
                }
            } catch (Throwable unused) {
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
        return pg1.ATOM_EXT_floor;
    }
}
