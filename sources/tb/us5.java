package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import tb.vu3;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class us5 extends nb5 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_PARSER_TODOUBLE = 6762231815649095238L;

    static {
        t2o.a(444596788);
    }

    public static /* synthetic */ Object ipc$super(us5 us5Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dinamicx/expression/ExepressionEvaluation/DXDataParserToDouble");
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
                        return Double.valueOf(((Number) obj).doubleValue());
                    }
                    if (obj instanceof String) {
                        return Double.valueOf(Double.parseDouble((String) obj));
                    }
                    return Double.valueOf((double) vu3.b.GEO_NOT_SUPPORT);
                }
            } catch (Exception unused) {
                return Double.valueOf((double) vu3.b.GEO_NOT_SUPPORT);
            }
        }
        return Double.valueOf((double) vu3.b.GEO_NOT_SUPPORT);
    }

    @Override // tb.nb5, tb.wvb, tb.xwb
    public String getDxFunctionName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bc5916ec", new Object[]{this});
        }
        return "toDouble";
    }
}
