package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.IDXHardwareInterface;
import com.taobao.android.dinamicx.expression.expr_v2.DXExprFunctionError;
import com.taobao.android.dinamicx.g;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class hu5 extends uu {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String PARAM_LEVEL_HIGH = "high";
    public static final String PARAM_LEVEL_LOW = "low";
    public static final String PARAM_LEVEL_MEDIUM = "medium";
    public static final String PARAM_LEVEL_UNKNOWN = "unknown";

    static {
        t2o.a(444597848);
    }

    public static /* synthetic */ Object ipc$super(hu5 hu5Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dinamicx_v4/expr/fuction/sys/DXDeviceLevelFunction");
    }

    @Override // tb.xwb
    public String getDxFunctionName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bc5916ec", new Object[]{this});
        }
        return "deviceLevel";
    }

    @Override // tb.xwb
    public uw5 execute(DXRuntimeContext dXRuntimeContext, uw5 uw5Var, int i, uw5[] uw5VarArr, Map map) throws DXExprFunctionError {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (uw5) ipChange.ipc$dispatch("5d66b176", new Object[]{this, dXRuntimeContext, uw5Var, new Integer(i), uw5VarArr, map});
        }
        if (uw5VarArr == null || uw5VarArr.length == 0) {
            return uw5.O(false);
        }
        IDXHardwareInterface e = g.e();
        if (e == null) {
            return uw5.O(false);
        }
        uw5 uw5Var2 = uw5VarArr[0];
        if (!uw5Var2.M()) {
            return uw5.O(false);
        }
        String lowerCase = uw5Var2.w().toLowerCase();
        try {
            int deviceLevel = e.getDeviceLevel();
            if ("low".equals(lowerCase)) {
                if (deviceLevel != 2) {
                    z = false;
                }
                return uw5.O(z);
            } else if ("medium".equals(lowerCase)) {
                if (deviceLevel != 1) {
                    z = false;
                }
                return uw5.O(z);
            } else if ("high".equals(lowerCase)) {
                if (deviceLevel != 0) {
                    z = false;
                }
                return uw5.O(z);
            } else if (!"unknown".equals(lowerCase)) {
                return uw5.O(false);
            } else {
                if (deviceLevel != -1) {
                    z = false;
                }
                return uw5.O(z);
            }
        } catch (Throwable unused) {
            return uw5.O(false);
        }
    }
}
