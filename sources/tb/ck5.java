package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.IDXHardwareInterface;
import com.taobao.android.dinamicx.g;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class ck5 extends nb5 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_PARSER_DXDEVICELEVEL = 3863236816138429745L;
    public static final String PARAM_LEVEL_HIGH = "high";
    public static final String PARAM_LEVEL_LOW = "low";
    public static final String PARAM_LEVEL_MEDIUM = "medium";
    public static final String PARAM_LEVEL_UNKNOWN = "unknown";

    static {
        t2o.a(444596728);
    }

    public static /* synthetic */ Object ipc$super(ck5 ck5Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dinamicx/expression/ExepressionEvaluation/DXDataParserDxDeviceLevel");
    }

    @Override // tb.nb5, tb.wvb, tb.xwb
    public String getDxFunctionName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bc5916ec", new Object[]{this});
        }
        return "deviceLevel";
    }

    @Override // tb.nb5, tb.evb
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        if (objArr == null || objArr.length == 0) {
            return Boolean.FALSE;
        }
        IDXHardwareInterface e = g.e();
        if (e == null) {
            return Boolean.FALSE;
        }
        Object obj = objArr[0];
        if (!(obj instanceof String)) {
            return Boolean.FALSE;
        }
        String lowerCase = ((String) obj).toLowerCase();
        try {
            int deviceLevel = e.getDeviceLevel();
            if ("low".equals(lowerCase)) {
                if (deviceLevel != 2) {
                    z = false;
                }
                return Boolean.valueOf(z);
            } else if ("medium".equals(lowerCase)) {
                if (deviceLevel != 1) {
                    z = false;
                }
                return Boolean.valueOf(z);
            } else if ("high".equals(lowerCase)) {
                if (deviceLevel != 0) {
                    z = false;
                }
                return Boolean.valueOf(z);
            } else if (!"unknown".equals(lowerCase)) {
                return Boolean.FALSE;
            } else {
                if (deviceLevel != -1) {
                    z = false;
                }
                return Boolean.valueOf(z);
            }
        } catch (Throwable unused) {
            return Boolean.FALSE;
        }
    }
}
