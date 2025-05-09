package tb;

import com.alibaba.mtl.appmonitor.AppMonitor;
import com.alibaba.mtl.appmonitor.model.DimensionSet;
import com.alibaba.mtl.appmonitor.model.DimensionValueSet;
import com.alibaba.mtl.appmonitor.model.MeasureSet;
import com.alibaba.mtl.appmonitor.model.MeasureValueSet;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.phenix.compat.stat.TBImageFlowMonitor;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class rrg {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String APP_LAUNCH = "AppLaunch";
    public static final String DOWNLOAD_STORAGE = "DownloadStorage";

    static {
        t2o.a(1030750343);
    }

    public static void a(long j, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee918b19", new Object[]{new Long(j), new Integer(i)});
        } else {
            AppMonitor.Stat.commit("BaichuanLink", DOWNLOAD_STORAGE, DimensionValueSet.create().setValue("fileNumber", String.valueOf(i)).setValue(TBImageFlowMonitor.SIZ_RANGE_DIMEN, d(j)), MeasureValueSet.create());
        }
    }

    public static void b(String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("426ed724", new Object[]{str, str2, str3, str4});
        } else {
            AppMonitor.Alarm.commitFail("BaichuanLink", str, str2, str3, str4);
        }
    }

    public static void c(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aeeeb8e7", new Object[]{str, str2});
        } else {
            AppMonitor.Alarm.commitSuccess("BaichuanLink", str, str2);
        }
    }

    public static String d(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5b6b9fe5", new Object[]{new Long(j)});
        }
        if (0 == j) {
            return "0";
        }
        if (j < 104857600) {
            return "<100M";
        }
        if (j < 209715200) {
            return "100M<n<200M";
        }
        if (j < 524288000) {
            return "200M<n<500M";
        }
        if (j < 838860800) {
            return "500M<n<800M";
        }
        int i = (j > 1073741824L ? 1 : (j == 1073741824L ? 0 : -1));
        if (i < 0) {
            return "800M<n<1G";
        }
        if (j < -2147483648L) {
            return "1G<n<2G";
        }
        if (j < -1073741824) {
            return "2G<n<3G";
        }
        if (j < 0) {
            return "3G<n<4G";
        }
        if (i < 0) {
            return "4G<n<5G";
        }
        return (j / 1048576) + "M";
    }

    public static void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dea9ecab", new Object[0]);
            return;
        }
        AppMonitor.register("BaichuanLink", DOWNLOAD_STORAGE, MeasureSet.create(), DimensionSet.create().addDimension("fileNumber").addDimension(TBImageFlowMonitor.SIZ_RANGE_DIMEN));
    }
}
