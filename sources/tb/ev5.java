package tb;

import android.content.pm.PackageManager;
import android.os.Build;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXDarkModeCenter;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.dinamicx.expression.expr_v2.DXExprFunctionError;
import com.taobao.weex.utils.tools.TimeCalculator;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class ev5 extends uu {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(444597849);
    }

    public static /* synthetic */ Object ipc$super(ev5 ev5Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dinamicx_v4/expr/fuction/sys/DXEnvFunction");
    }

    @Override // tb.xwb
    public String getDxFunctionName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bc5916ec", new Object[]{this});
        }
        return "env";
    }

    @Override // tb.xwb
    public uw5 execute(DXRuntimeContext dXRuntimeContext, uw5 uw5Var, int i, uw5[] uw5VarArr, Map map) throws DXExprFunctionError {
        String str;
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (uw5) ipChange.ipc$dispatch("5d66b176", new Object[]{this, dXRuntimeContext, uw5Var, new Integer(i), uw5VarArr, map});
        }
        if (uw5VarArr == null || uw5VarArr.length == 0) {
            return uw5.V();
        }
        uw5 uw5Var2 = uw5VarArr[0];
        if (!uw5Var2.M()) {
            return uw5.V();
        }
        String w = uw5Var2.w();
        if (w.equals("platform")) {
            return uw5.W(TimeCalculator.PLATFORM_ANDROID);
        }
        if (w.equals("isDarkMode")) {
            if (!DXDarkModeCenter.d() || !DXDarkModeCenter.c(dXRuntimeContext)) {
                z = false;
            }
            return uw5.O(z);
        } else if (w.equals(em7.IS_ELDER)) {
            return uw5.O(vu5.f());
        } else {
            if (w.equals("platformdetail")) {
                return uw5.W("-1");
            }
            if (w.equals("platformmodel")) {
                return uw5.W(Build.MODEL);
            }
            if (w.equals("osversion")) {
                return uw5.W(Build.VERSION.INCREMENTAL);
            }
            if (w.equals("appversion")) {
                if (dXRuntimeContext == null) {
                    return uw5.V();
                }
                if (dXRuntimeContext.h() == null) {
                    return uw5.V();
                }
                try {
                    str = dXRuntimeContext.h().getPackageManager().getPackageInfo(dXRuntimeContext.h().getPackageName(), 0).versionName;
                } catch (PackageManager.NameNotFoundException e) {
                    e.printStackTrace();
                    str = null;
                }
                if (str == null) {
                    return uw5.V();
                }
                return uw5.W(str);
            } else if (w.equals("sdkversion")) {
                return uw5.W("4.1.35.3");
            } else {
                if (w.equals("systemtime")) {
                    return uw5.W(String.valueOf(System.currentTimeMillis()));
                }
                if (w.equals("deviceLevel")) {
                    return new hu5().execute(dXRuntimeContext, uw5Var, i, uw5VarArr, map);
                }
                if (!w.equals("isrtl")) {
                    return uw5.V();
                }
                if (DinamicXEngine.x().getResources().getConfiguration().getLayoutDirection() == 1) {
                    return uw5.O(true);
                }
                return uw5.O(false);
            }
        }
    }
}
