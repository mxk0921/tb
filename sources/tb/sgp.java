package tb;

import com.alibaba.mtl.appmonitor.AppMonitor;
import com.alibaba.mtl.appmonitor.model.DimensionSet;
import com.alibaba.mtl.appmonitor.model.DimensionValueSet;
import com.alibaba.mtl.appmonitor.model.MeasureSet;
import com.alibaba.mtl.appmonitor.model.MeasureValueSet;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class sgp {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a94f6649", new Object[]{str});
            return;
        }
        xgp.a("SubScribeBundleLoadMonitor", "installFailed: " + str);
        b(false, "loading", 0L, -1, str);
    }

    public static void b(boolean z, String str, long j, int i, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84a01975", new Object[]{new Boolean(z), str, new Long(j), new Integer(i), str2});
        } else {
            AppMonitor.Stat.commit("Shake", "shake_remote_bundle", DimensionValueSet.create().setValue("stat", str).setValue("success", String.valueOf(z)).setValue("errorCode", String.valueOf(i)).setValue("errorMsg", str2), MeasureValueSet.create().setValue("cost", j));
        }
    }

    static {
        t2o.a(763363344);
        AppMonitor.register("Shake", "shake_remote_bundle", MeasureSet.create().addMeasure("cost"), DimensionSet.create().addDimension("stat").addDimension("success").addDimension("errorCode").addDimension("errorMsg"));
    }
}
