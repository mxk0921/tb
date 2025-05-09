package tb;

import com.alibaba.mtl.appmonitor.AppMonitor;
import com.alibaba.mtl.appmonitor.model.DimensionSet;
import com.alibaba.mtl.appmonitor.model.DimensionValueSet;
import com.alibaba.mtl.appmonitor.model.MeasureSet;
import com.alibaba.mtl.appmonitor.model.MeasureValueSet;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.cus.CusDataController;
import com.ut.mini.UTAnalytics;
import com.ut.mini.internal.UTOriginalCustomHitBuilder;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class uz4 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String MONITOR_POINT_CLEAR_FILES = "ClearApkFiles";
    public static final String MONITOR_POINT_FINISH = "PreDownloadFinish";
    public static final String MONITOR_POINT_FINISH_GRAY = "GrayDownloadFinish";
    public static final String MONITOR_POINT_GRAY_CLEAR_FILES = "GrayClearApkFiles";
    public static final String MONITOR_POINT_INSTALL_APK = "PreDownloadInstallApk";
    public static final String MONITOR_POINT_INSTALL_APK_GRAY = "GrayDownloadInstallApk";
    public static final String MONITOR_POINT_START = "PreDownloadStart";
    public static final String MONITOR_POINT_START_GRAY = "GrayDownloadStart";

    /* renamed from: a  reason: collision with root package name */
    public static boolean f29693a = false;

    static {
        t2o.a(790626326);
    }

    public static DimensionSet a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DimensionSet) ipChange.ipc$dispatch("51b30d4", new Object[0]);
        }
        return DimensionSet.create().addDimension("newAppVersion").addDimension("downloadUrl");
    }

    public static void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b816583", new Object[0]);
            return;
        }
        try {
            f29693a = true;
            AppMonitor.register("ApkUpdater", MONITOR_POINT_START, MeasureSet.create(), a().addDimension("errorCode").addDimension("success"), true);
            AppMonitor.register("ApkUpdater", MONITOR_POINT_FINISH, MeasureSet.create(), a().addDimension("errorCode").addDimension("success"), true);
            AppMonitor.register("ApkUpdater", MONITOR_POINT_INSTALL_APK, MeasureSet.create(), a().addDimension("errorCode"), true);
            AppMonitor.register("ApkUpdater", MONITOR_POINT_CLEAR_FILES, MeasureSet.create(), a().addDimension("fileName").addDimension("filePath"), true);
            AppMonitor.register("ApkUpdater", MONITOR_POINT_START_GRAY, MeasureSet.create(), a().addDimension("errorCode").addDimension("success"), true);
            AppMonitor.register("ApkUpdater", MONITOR_POINT_FINISH_GRAY, MeasureSet.create(), a().addDimension("errorCode").addDimension("success"), true);
            AppMonitor.register("ApkUpdater", MONITOR_POINT_GRAY_CLEAR_FILES, MeasureSet.create(), a().addDimension("fileName").addDimension("filePath"), true);
        } catch (Throwable th) {
            wdm.h("AppVersionUtils.registerAppMonitor.error.", th);
        }
    }

    public static void c(String str, CusDataController.ApkDownloadContext apkDownloadContext, Map<String, String> map) {
        String str2;
        String str3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3d505ef5", new Object[]{str, apkDownloadContext, map});
            return;
        }
        try {
            if (!f29693a) {
                b();
            }
            if (apkDownloadContext != null) {
                str2 = apkDownloadContext.appVersion;
            } else {
                str2 = "";
            }
            map.put("newAppVersion", str2);
            if (apkDownloadContext != null) {
                str3 = apkDownloadContext.downloadUrl;
            } else {
                str3 = "";
            }
            map.put("downloadUrl", str3);
            DimensionValueSet create = DimensionValueSet.create();
            create.setMap(map);
            AppMonitor.Stat.commit("ApkUpdater", str, create, MeasureValueSet.create());
            wdm.f("ApkUpdater", "", "[point]" + str + "-[arg]" + map);
        } catch (Throwable th) {
            wdm.h("AppVersionUtils.trackAM.error.", th);
        }
    }

    public static void d(String str, CusDataController.ApkDownloadContext apkDownloadContext, Map<String, String> map) {
        String str2;
        String str3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("977d4fa8", new Object[]{str, apkDownloadContext, map});
            return;
        }
        try {
            if (apkDownloadContext != null) {
                str2 = apkDownloadContext.appVersion;
            } else {
                str2 = "";
            }
            if (apkDownloadContext != null) {
                str3 = apkDownloadContext.downloadUrl;
            } else {
                str3 = "";
            }
            if (map == null) {
                map = new HashMap<>();
            }
            UTAnalytics.getInstance().getDefaultTracker().send(new UTOriginalCustomHitBuilder("Page_ApkUpdate", 19999, str, str2, str3, map).build());
        } catch (Throwable th) {
            wdm.h("AppVersionUtils.trackUT.error.", th);
        }
    }
}
