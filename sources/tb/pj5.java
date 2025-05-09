package tb;

import android.content.pm.PackageManager;
import android.os.Build;
import androidx.core.app.NotificationManagerCompat;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class pj5 extends nb5 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_PARSER_DX_ENV = 9060459234603530L;

    static {
        t2o.a(444596722);
    }

    public static /* synthetic */ Object ipc$super(pj5 pj5Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dinamicx/expression/ExepressionEvaluation/DXDataParserDXEnv");
    }

    @Override // tb.nb5, tb.wvb, tb.xwb
    public String getDxFunctionName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bc5916ec", new Object[]{this});
        }
        return "dx_env";
    }

    @Override // tb.nb5, tb.evb
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        if (!(objArr == null || objArr.length == 0)) {
            Object obj = objArr[0];
            if (!(obj instanceof String)) {
                return null;
            }
            String lowerCase = ((String) obj).toLowerCase();
            if (lowerCase.equals("platform")) {
                return "1";
            }
            if (lowerCase.equals("platformdetail")) {
                return "-1";
            }
            if (lowerCase.equals("platformmodel")) {
                return Build.MODEL;
            }
            if (lowerCase.equals("osversion")) {
                return Build.VERSION.INCREMENTAL;
            }
            if (lowerCase.equals("systemnotifyenable")) {
                try {
                    return String.valueOf(NotificationManagerCompat.from(dXRuntimeContext.h()).areNotificationsEnabled());
                } catch (Exception unused) {
                    return "false";
                }
            } else if (lowerCase.equals("appversion")) {
                if (dXRuntimeContext == null || dXRuntimeContext.h() == null) {
                    return null;
                }
                try {
                    return dXRuntimeContext.h().getPackageManager().getPackageInfo(dXRuntimeContext.h().getPackageName(), 0).versionName;
                } catch (PackageManager.NameNotFoundException e) {
                    e.printStackTrace();
                    return null;
                }
            } else if (lowerCase.equals("sdkversion")) {
                return "4.1.35.3";
            } else {
                if (lowerCase.equals("systemtime")) {
                    return String.valueOf(System.currentTimeMillis());
                }
            }
        }
        return null;
    }
}
