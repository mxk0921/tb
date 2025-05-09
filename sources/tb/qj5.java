package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class qj5 extends nb5 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_PARSER_DXVERSION_GREATERTHANOREQUALTO = 87712825513562832L;

    static {
        t2o.a(444596723);
    }

    public static /* synthetic */ Object ipc$super(qj5 qj5Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dinamicx/expression/ExepressionEvaluation/DXDataParserDXVersionGreaterThanOrEqualTo");
    }

    @Override // tb.nb5, tb.evb
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        if (objArr == null || objArr.length != 1) {
            return Boolean.FALSE;
        }
        if (!(objArr[0] instanceof String)) {
            return Boolean.FALSE;
        }
        String[] split = "4.1.35.3".split("\\.");
        String[] split2 = ((String) objArr[0]).split("\\.");
        if (split.length == 4 && split2.length == 4) {
            for (int i = 0; i < 4; i++) {
                String str = split[i];
                String str2 = split2[i];
                if (i == 3) {
                    try {
                        if (str.contains("-")) {
                            str = str.split("-")[0];
                        }
                        if (str2.contains("-")) {
                            str2 = str2.split("-")[0];
                        }
                    } catch (Exception unused) {
                        return Boolean.FALSE;
                    }
                }
                int parseInt = Integer.parseInt(str);
                int parseInt2 = Integer.parseInt(str2);
                if (parseInt2 > parseInt) {
                    return Boolean.TRUE;
                }
                if (parseInt2 < parseInt) {
                    return Boolean.FALSE;
                }
                if (i == 3) {
                    return Boolean.TRUE;
                }
            }
        }
        return Boolean.FALSE;
    }

    @Override // tb.nb5, tb.wvb, tb.xwb
    public String getDxFunctionName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bc5916ec", new Object[]{this});
        }
        return "DXVersion_GreaterThanOrEqualTo";
    }
}
