package tb;

import com.alibaba.mtl.appmonitor.AppMonitor;
import com.alibaba.mtl.appmonitor.model.DimensionSet;
import com.alibaba.mtl.appmonitor.model.DimensionValueSet;
import com.alibaba.mtl.appmonitor.model.MeasureSet;
import com.alibaba.mtl.appmonitor.model.MeasureValueSet;
import com.android.alibaba.ip.runtime.IpChange;
import com.ut.mini.UTAnalytics;
import com.ut.mini.UTTracker;
import com.ut.mini.internal.UTOriginalCustomHitBuilder;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class lu0 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(1034944674);
    }

    public static void a(String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("426ed724", new Object[]{str, str2, str3, str4});
        } else {
            AppMonitor.Alarm.commitFail("DAI", str, str2, str3, str4);
        }
    }

    public static void b(String str, String str2, DimensionValueSet dimensionValueSet, MeasureValueSet measureValueSet) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70f8ffe0", new Object[]{str, str2, dimensionValueSet, measureValueSet});
        } else {
            AppMonitor.Stat.commit(str, str2, dimensionValueSet, measureValueSet);
        }
    }

    public static void c(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aeeeb8e7", new Object[]{str, str2});
        } else {
            AppMonitor.Alarm.commitSuccess("DAI", str, str2);
        }
    }

    public static void d(String str, int i, String str2, String str3, String str4, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a30ee7ab", new Object[]{str, new Integer(i), str2, str3, str4, map});
            return;
        }
        try {
            UTTracker defaultTracker = UTAnalytics.getInstance().getDefaultTracker();
            if (defaultTracker != null) {
                defaultTracker.send(new UTOriginalCustomHitBuilder(str, i, str2, str3, str4, map).build());
                kgh.a("Analytics", "pageName=" + str + " eventId=" + i + " arg1=" + str2 + " arg2=" + str3 + " arg3=" + str4 + " args=" + map);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static void e(String str, String str2, MeasureSet measureSet, DimensionSet dimensionSet) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("701c9b46", new Object[]{str, str2, measureSet, dimensionSet});
        } else {
            AppMonitor.register(str, str2, measureSet, dimensionSet);
        }
    }
}
