package tb;

import com.alibaba.mtl.appmonitor.AppMonitor;
import com.alibaba.mtl.appmonitor.model.DimensionSet;
import com.alibaba.mtl.appmonitor.model.DimensionValueSet;
import com.alibaba.mtl.appmonitor.model.MeasureSet;
import com.alibaba.mtl.appmonitor.model.MeasureValueSet;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.address.WeexPopContainer;
import com.taobao.android.remoteso.log.RSoLog;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class t6h {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        AppMonitor.register("remote", "remote_loading", MeasureSet.create().addMeasure("cost"), DimensionSet.create().addDimension("stat").addDimension(ru1.FEATURE_NAME).addDimension("success").addDimension("errorCode").addDimension("errorMsg"));
    }

    public static void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9edcefd3", new Object[]{str, str2});
            return;
        }
        RSoLog.d("remo,LoadingMonitor installFailed: " + str2);
        f(false, "loading", str, 0L, -1, str2);
    }

    public static void b(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("97f12963", new Object[]{str, new Long(j)});
            return;
        }
        RSoLog.d("remo,LoadingMonitor loadingDuration : " + j);
        f(true, "loading", str, j, 0, "");
    }

    public static void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24a8b72c", new Object[]{str});
            return;
        }
        RSoLog.d("remo,LoadingMonitor loadingLeave");
        f(true, "loading_Leave", str, 0L, 0, "");
    }

    public static void d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("97a09824", new Object[]{str});
            return;
        }
        RSoLog.d("remo,LoadingMonitor retryInstall");
        f(true, "retry_install", str, 0L, 0, "");
    }

    public static void e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bafc9e55", new Object[]{str});
            return;
        }
        RSoLog.d("remo,LoadingMonitor showLoadingView, feature=" + str);
        f(true, WeexPopContainer.PARAMS_SHOW_LOADING, str, 0L, 0, "");
    }

    public static void f(boolean z, String str, String str2, long j, int i, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7faf273f", new Object[]{new Boolean(z), str, str2, new Long(j), new Integer(i), str3});
        } else {
            AppMonitor.Stat.commit("remote", "remote_loading", DimensionValueSet.create().setValue("stat", str).setValue(ru1.FEATURE_NAME, str2).setValue("success", String.valueOf(z)).setValue("errorCode", String.valueOf(i)).setValue("errorMsg", str3), MeasureValueSet.create().setValue("cost", j));
        }
    }
}
