package tb;

import android.os.Build;
import com.alibaba.fastjson.JSON;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.alibaba.mtl.appmonitor.model.DimensionSet;
import com.alibaba.mtl.appmonitor.model.DimensionValueSet;
import com.alibaba.mtl.appmonitor.model.MeasureSet;
import com.alibaba.mtl.appmonitor.model.MeasureValueSet;
import com.android.alibaba.ip.runtime.IpChange;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.taobao.android.cachecleaner.autoclear.MatchBasedAutoClear;
import com.taobao.android.cachecleaner.monitor.info.CacheOverviewInfo;
import com.taobao.tao.log.TLog;
import com.ut.mini.UTAnalytics;
import com.ut.mini.UTHitBuilders$UTCustomHitBuilder;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class s71 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(737149070);
    }

    public static void a(CacheOverviewInfo cacheOverviewInfo, int i, long j, long j2, long j3, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb32bc2f", new Object[]{cacheOverviewInfo, new Integer(i), new Long(j), new Long(j2), new Long(j3), str});
            return;
        }
        DimensionValueSet create = DimensionValueSet.create();
        create.setValue(h7r.DEVICE_BRAND, Build.BRAND);
        create.setValue(h7r.DEVICE_MODEL, Build.MODEL);
        create.setValue("trigger_state", String.valueOf(i));
        MeasureValueSet create2 = MeasureValueSet.create();
        create2.setValue("clear_cache_size", j);
        create2.setValue("available_size", j2);
        create2.setValue("time_consuming", j3);
        AppMonitor.Stat.commit("cache_cleaner", "auto_clear", create, create2);
        cacheOverviewInfo.setTotalUsedSize(cacheOverviewInfo.getTotalUsedSize() - j);
        c(cacheOverviewInfo, str);
        TLog.loge(yr2.MODULE, "AppMonitorUtil", "commitAutoClearMonitor: clear cache size " + j + "KB,  current available size " + j2 + "KB, trigger mode " + i + ", consume time " + j3 + "ms");
    }

    public static void b(CacheOverviewInfo cacheOverviewInfo, int i, long j, long j2, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("beedcd09", new Object[]{cacheOverviewInfo, new Integer(i), new Long(j), new Long(j2), str});
            return;
        }
        a(cacheOverviewInfo, i, j, j2, -1L, str);
        TLog.loge(yr2.MODULE, "AppMonitorUtil", "commitAutoClearMonitor: clear cache size " + j + "KB,  current available size " + j2 + "KB, trigger mode " + i);
    }

    public static void c(CacheOverviewInfo cacheOverviewInfo, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c2586d11", new Object[]{cacheOverviewInfo, str});
            return;
        }
        UTHitBuilders$UTCustomHitBuilder uTHitBuilders$UTCustomHitBuilder = new UTHitBuilders$UTCustomHitBuilder("storage_monitor");
        uTHitBuilders$UTCustomHitBuilder.setEventPage("cache_monitor_basic_info_after_clear").setProperty("basic_info", JSON.toJSONString(cacheOverviewInfo));
        uTHitBuilders$UTCustomHitBuilder.setProperty("from", str);
        UTAnalytics.getInstance().getDefaultTracker().send(uTHitBuilders$UTCustomHitBuilder.build());
    }

    public static void d(String str, String str2, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d31595aa", new Object[]{str, str2, new Long(j)});
        } else if (j >= 0) {
            DimensionValueSet create = DimensionValueSet.create();
            create.setValue("clean_state", str);
            create.setValue("clean_type", str2);
            create.setValue(h7r.DEVICE_MODEL, Build.MODEL);
            MeasureValueSet create2 = MeasureValueSet.create();
            if (str.equals("clean_success")) {
                create2.setValue("clean_time", j);
            }
            AppMonitor.Stat.commit("cache_cleaner", "clean_time", create, create2);
            TLog.loge(yr2.MODULE, "AppMonitorUtil", "commitCleanTime: state = " + str + " type = " + str2 + " cleanTime = " + j);
        }
    }

    public static void e(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("474112eb", new Object[]{new Long(j)});
            return;
        }
        DimensionValueSet create = DimensionValueSet.create();
        create.setValue(h7r.DEVICE_BRAND, Build.BRAND);
        create.setValue(h7r.DEVICE_MODEL, Build.MODEL);
        MeasureValueSet create2 = MeasureValueSet.create();
        create2.setValue("clear_expired_files_size", j);
        AppMonitor.Stat.commit("cache_cleaner", "clear_expired_files", create, create2);
    }

    public static void f(MatchBasedAutoClear.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3f2bb75", new Object[]{cVar});
            return;
        }
        DimensionValueSet create = DimensionValueSet.create();
        MeasureValueSet create2 = MeasureValueSet.create();
        create.setValue("ret_code", cVar.k() + "");
        create.setValue("msg", cVar.j());
        create.setValue("file_list", JSON.toJSONString(cVar.h()));
        create2.setValue("size", (double) cVar.i());
        AppMonitor.Stat.commit("cache_cleaner", "clear_matching_files", create, create2);
    }

    public static void g(long j, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5d967ef", new Object[]{new Long(j), new Boolean(z), new Boolean(z2)});
            return;
        }
        DimensionValueSet create = DimensionValueSet.create();
        MeasureValueSet create2 = MeasureValueSet.create();
        create.setValue(HiAnalyticsConstant.BI_KEY_COST_TIME, String.valueOf(j));
        create.setValue("hit_opt_new_monitor", String.valueOf(z));
        create.setValue("hit_opt_remove_diff", String.valueOf(z2));
        AppMonitor.Stat.commit("cache_cleaner", "init_task", create, create2);
    }

    public static void h(String str, boolean z, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4d490ffe", new Object[]{str, new Boolean(z), new Long(j)});
            return;
        }
        DimensionValueSet create = DimensionValueSet.create();
        MeasureValueSet create2 = MeasureValueSet.create();
        create.setValue("biz_name", str);
        create.setValue("biz_clear_status", z + "");
        create2.setValue("biz_clear_size", (double) j);
        AppMonitor.Stat.commit("cache_cleaner", "biz_clear_size", create, create2);
    }

    public static void i(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8e4e1d87", new Object[]{str, str2});
            return;
        }
        DimensionValueSet create = DimensionValueSet.create();
        MeasureValueSet create2 = MeasureValueSet.create();
        create.setValue("exception", str);
        create.setValue("description", str2);
        AppMonitor.Stat.commit("cache_cleaner", "clear_exception", create, create2);
    }

    public static void j(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("55615b79", new Object[]{str});
            return;
        }
        DimensionValueSet create = DimensionValueSet.create();
        MeasureValueSet create2 = MeasureValueSet.create();
        create.setValue("biz_inner_path", str);
        AppMonitor.Stat.commit("cache_cleaner", "biz_all_path", create, create2);
    }

    public static void k(long j, long j2, long j3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("637ba6e0", new Object[]{new Long(j), new Long(j2), new Long(j3)});
        } else if (j > 0 || j2 > 0 || j3 > 0) {
            DimensionValueSet create = DimensionValueSet.create();
            create.setValue(h7r.DEVICE_BRAND, Build.BRAND);
            create.setValue(h7r.DEVICE_MODEL, Build.MODEL);
            MeasureValueSet create2 = MeasureValueSet.create();
            create2.setValue("scan_inner_time", j);
            create2.setValue("scan_ext_cache_time", j2);
            create2.setValue("scan_ext_files_time", j3);
            AppMonitor.Stat.commit("cache_cleaner", "files_scan_time", create, create2);
            TLog.loge(yr2.MODULE, "AppMonitorUtil", "commitScanFileTime: innerTime = " + j + " extCacheTime = " + j2 + " extFilesTime = " + j3);
        }
    }

    public static void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa057db1", new Object[0]);
            return;
        }
        DimensionSet create = DimensionSet.create();
        MeasureSet create2 = MeasureSet.create();
        create.addDimension(HiAnalyticsConstant.BI_KEY_COST_TIME);
        create.addDimension("hit_opt_new_monitor");
        create.addDimension("hit_opt_remove_diff");
        AppMonitor.register("cache_cleaner", "init_task", create2, create);
        DimensionSet create3 = DimensionSet.create();
        MeasureSet create4 = MeasureSet.create();
        create3.addDimension(h7r.DEVICE_BRAND);
        create3.addDimension(h7r.DEVICE_MODEL);
        create3.addDimension("trigger_state");
        create4.addMeasure("clear_cache_size");
        create4.addMeasure("available_size");
        create4.addMeasure("time_consuming");
        AppMonitor.register("cache_cleaner", "auto_clear", create4, create3);
        DimensionSet create5 = DimensionSet.create();
        MeasureSet create6 = MeasureSet.create();
        create5.addDimension(h7r.DEVICE_BRAND);
        create5.addDimension(h7r.DEVICE_MODEL);
        create6.addMeasure("clear_expired_files_size");
        AppMonitor.register("cache_cleaner", "clear_expired_files", create6, create5);
        DimensionSet create7 = DimensionSet.create();
        MeasureSet create8 = MeasureSet.create();
        create7.addDimension(h7r.DEVICE_BRAND);
        create7.addDimension(h7r.DEVICE_MODEL);
        create7.addDimension("file_name");
        AppMonitor.register("cache_cleaner", "clear_expired_files_failed", create8, create7);
        DimensionSet create9 = DimensionSet.create();
        MeasureSet create10 = MeasureSet.create();
        create9.addDimension("ret_code");
        create9.addDimension("msg");
        create9.addDimension("file_list");
        create10.addMeasure("size");
        AppMonitor.register("cache_cleaner", "clear_matching_files", create10, create9);
        DimensionSet create11 = DimensionSet.create();
        MeasureSet create12 = MeasureSet.create();
        create11.addDimension("exception");
        create11.addDimension("description");
        AppMonitor.register("cache_cleaner", "clear_exception", create12, create11);
        DimensionSet create13 = DimensionSet.create();
        MeasureSet create14 = MeasureSet.create();
        create13.addDimension("biz_name");
        create13.addDimension("biz_clear_status");
        create14.addMeasure("biz_clear_size");
        AppMonitor.register("cache_cleaner", "biz_clear_size", create14, create13);
        DimensionSet create15 = DimensionSet.create();
        MeasureSet create16 = MeasureSet.create();
        create15.addDimension("biz_inner_path");
        AppMonitor.register("cache_cleaner", "biz_all_path", create16, create15);
        DimensionSet create17 = DimensionSet.create();
        MeasureSet create18 = MeasureSet.create();
        create17.addDimension(h7r.DEVICE_BRAND);
        create17.addDimension(h7r.DEVICE_MODEL);
        create18.addMeasure("scan_inner_time");
        create18.addMeasure("scan_ext_cache_time");
        create18.addMeasure("scan_ext_files_time");
        AppMonitor.register("cache_cleaner", "files_scan_time", create18, create17);
        DimensionSet create19 = DimensionSet.create();
        MeasureSet create20 = MeasureSet.create();
        create19.addDimension("clean_state");
        create19.addDimension("clean_type");
        create19.addDimension(h7r.DEVICE_MODEL);
        create20.addMeasure("clean_time");
        AppMonitor.register("cache_cleaner", "clean_time", create20, create19);
    }
}
