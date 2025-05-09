package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class ro5 extends nb5 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final Object DEFAULT_VALUE = null;
    public static final long DX_PARSER_NOTEQUAL = 4995563293267863121L;

    static {
        t2o.a(444596765);
    }

    public static /* synthetic */ Object ipc$super(ro5 ro5Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dinamicx/expression/ExepressionEvaluation/DXDataParserNotEqual");
    }

    @Override // tb.nb5, tb.evb
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        if (objArr != null) {
            try {
                if (objArr.length == 2) {
                    Object obj = objArr[0];
                    Object obj2 = objArr[1];
                    if (obj == null && obj2 == null) {
                        return Boolean.FALSE;
                    }
                    if (!(obj == null || obj2 == null)) {
                        if (obj.getClass().equals(obj2.getClass())) {
                            return Boolean.valueOf(!obj.equals(obj2));
                        }
                        if (!(obj instanceof Number) || !(obj2 instanceof Number)) {
                            return Boolean.valueOf(!obj.equals(obj2));
                        }
                        return Boolean.valueOf(!o66.a((Number) obj, (Number) obj2));
                    }
                    return Boolean.TRUE;
                }
            } catch (Throwable unused) {
                return DEFAULT_VALUE;
            }
        }
        return DEFAULT_VALUE;
    }

    @Override // tb.nb5, tb.wvb, tb.xwb
    public String getDxFunctionName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bc5916ec", new Object[]{this});
        }
        return "notEqual";
    }
}
