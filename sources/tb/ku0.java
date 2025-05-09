package tb;

import android.text.TextUtils;
import android.util.Log;
import com.alibaba.analytics.AnalyticsMgr;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.alibaba.mtl.appmonitor.model.DimensionSet;
import com.alibaba.mtl.appmonitor.model.DimensionValueSet;
import com.alibaba.mtl.appmonitor.model.Measure;
import com.alibaba.mtl.appmonitor.model.MeasureSet;
import com.alibaba.mtl.appmonitor.model.MeasureValueSet;
import com.android.alibaba.ip.runtime.IpChange;
import com.huawei.hms.utils.FileUtil;
import com.taobao.aranger.constant.Constants;
import com.taobao.phenix.compat.stat.TBImageFlowMonitor;
import com.ut.mini.UTAnalytics;
import java.io.File;
import tb.amo;
import tb.vu3;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class ku0 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String CRASH_ALARM = "CrashAlarm";
    public static final String CROWD_EFFECTIVE_COUNTER = "CrowdEffectiveCounter";
    public static final String CROWD_INVOKE_COUNTER = "CrowdInvokeCounter";
    public static final String CROWD_STAT = "CrowdStat";
    public static final String DATABASE_EXPERIMENT_GROUPS_V2_ALARM = "DatabaseExperimentGroupsV2Alarm";
    public static final String DOWNLOAD_ALARM = "DownloadAlarm";
    public static final String DOWNLOAD_STAT = "DownloadStatV2";
    public static final String EXPERIMENT_ACTIVATE_COUNTER = "ExperimentActivateCounter";
    public static final String EXPERIMENT_ACTIVATE_STAT = "ExperimentActivateStat";
    public static final String EXPERIMENT_ACTIVATE_STAT_TYPE_ACTIVATE_SERVER = "activateServer";
    public static final String EXPERIMENT_ACTIVATE_STAT_TYPE_ACTIVATE_SERVER_SYNC = "activateServerSync";
    public static final String EXPERIMENT_ACTIVATE_STAT_TYPE_URL = "url";
    public static final String EXPERIMENT_ACTIVATE_STAT_TYPE_VARIATION = "variation";
    public static final String EXPERIMENT_DATA_REACH_TYPE = "ExperimentDataReachType";
    public static final String EXPERIMENT_EFFECTIVE_COUNTER = "ExperimentEffectiveCounter";
    public static final String MULTI_PROCESS_ALARM = "MultiProcessAlarm";
    public static final String PARAM_HANDLE_ERROR = "paramHandleError";
    public static final String SERVICE_ALARM = "ServiceAlarm";
    public static final String TRACK_1022_BLOCK_COUNTER = "Track1022BlockCounter";
    public static final String TRACK_PAGE_COUNTER = "TrackPageCounter";
    public static final String TRACK_PAGE_COUNTER_TYPE_EVO_ACTIVE = "evoActive";
    public static final String TRACK_PAGE_COUNTER_TYPE_PLUGIN = "plugin";
    public static final String TRACK_PAGE_COUNTER_TYPE_UPDATE_PAGENAME = "updatePageName";
    public static final String TRACK_STAT = "TrackStat";
    public static final String TRACK_TYPE_ROUTING_RESULT = "routing_result";
    public static final String TRACK_TYPE_ROUTING_VALUE = "routing_value";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Throwable f22923a;
        public final /* synthetic */ String b;

        public a(Throwable th, String str) {
            this.f22923a = th;
            this.b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                ku0.f(ku0.CRASH_ALARM, Log.getStackTraceString(this.f22923a), this.b, "");
            }
        }
    }

    static {
        t2o.a(961544366);
    }

    public static void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("25217196", new Object[]{str});
        } else {
            AppMonitor.Counter.commit("Yixiu", str, 1.0d);
        }
    }

    public static void b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b8a1a1e0", new Object[]{str, str2});
        } else {
            AppMonitor.Counter.commit("Yixiu", str, str2, 1.0d);
        }
    }

    public static void c(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c5f785e9", new Object[]{str, new Long(j)});
        } else if (str != null) {
            h(CROWD_STAT, DimensionValueSet.create().setValue(r4p.KEY_SHOP_SEARCH_ELDER, str), MeasureValueSet.create().setValue("time", j));
        }
    }

    public static void e(String str, boolean z, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5e545c", new Object[]{str, new Boolean(z), new Long(j)});
        } else if (!TextUtils.isEmpty(str)) {
            h(EXPERIMENT_ACTIVATE_STAT, DimensionValueSet.create().setValue("type", str).setValue("result", String.valueOf(z)), MeasureValueSet.create().setValue("time", j));
        }
    }

    public static void f(String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("426ed724", new Object[]{str, str2, str3, str4});
        } else {
            AppMonitor.Alarm.commitFail("Yixiu", str, str2, str3, str4);
        }
    }

    public static void g(String str, String str2, String str3, String str4, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b6cc030", new Object[]{str, str2, str3, str4, new Boolean(z)});
        } else if (!z || wyv.h(n.j().b())) {
            AppMonitor.Alarm.commitFail("Yixiu", str, str2, str3, str4);
        }
    }

    public static void h(String str, DimensionValueSet dimensionValueSet, MeasureValueSet measureValueSet) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("77d43496", new Object[]{str, dimensionValueSet, measureValueSet});
        } else {
            AppMonitor.Stat.commit("Yixiu", str, dimensionValueSet, measureValueSet);
        }
    }

    public static void i(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aeeeb8e7", new Object[]{str, str2});
        } else {
            AppMonitor.Alarm.commitSuccess("Yixiu", str, str2);
        }
    }

    public static void j(String str, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("276e8c9b", new Object[]{str, th});
        } else if (!n.j().r() || !new File("/data/local/tmp/.yixiu_exception_throw").exists()) {
            ogh.h("Analytics", th.getMessage(), th);
            if (n.j().a().H()) {
                if (!AnalyticsMgr.g) {
                    ydt.e(new a(th, str));
                } else {
                    f(CRASH_ALARM, Log.getStackTraceString(th), str, "");
                }
            }
        } else {
            throw new RuntimeException(th);
        }
    }

    public static void k(boolean z, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8bc599ff", new Object[]{new Boolean(z), new Long(j)});
        } else {
            h(TRACK_STAT, DimensionValueSet.create().setValue("result", String.valueOf(z)), MeasureValueSet.create().setValue("time", j));
        }
    }

    public static String l(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5b6b9fe5", new Object[]{new Long(j)});
        }
        if (0 == j) {
            return "0";
        }
        if (j < 1024) {
            return "<1k";
        }
        if (j < FileUtil.LOCAL_REPORT_FILE_MAX_SIZE) {
            return "1k<n<10k";
        }
        if (j < 102400) {
            return "10k<n<100k";
        }
        if (j < Constants.MAX_SIZE) {
            return "100k<n<200k";
        }
        if (j < 307200) {
            return "200k<n<300k";
        }
        if (j < 409600) {
            return "300k<n<400k";
        }
        if (j < 512000) {
            return "400k<n<500k";
        }
        if (j < 1048576) {
            return "500k<n<1M";
        }
        return (j / 1048576) + "M";
    }

    public static void m(String str, MeasureSet measureSet, DimensionSet dimensionSet) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a1c8497c", new Object[]{str, measureSet, dimensionSet});
        } else {
            AppMonitor.register("Yixiu", str, measureSet, dimensionSet);
        }
    }

    public static void n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cd762c5", new Object[0]);
            return;
        }
        DimensionSet addDimension = DimensionSet.create().addDimension(r4p.KEY_SHOP_SEARCH_ELDER);
        Measure measure = new Measure("time");
        measure.setRange(Double.valueOf((double) vu3.b.GEO_NOT_SUPPORT), Double.valueOf(120000.0d));
        m(CROWD_STAT, MeasureSet.create().addMeasure(measure), addDimension);
    }

    public static void o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("772d3246", new Object[0]);
            return;
        }
        DimensionSet addDimension = DimensionSet.create().addDimension("type").addDimension("url").addDimension(TBImageFlowMonitor.SIZ_RANGE_DIMEN).addDimension("net").addDimension("success").addDimension("background");
        Measure measure = new Measure(amo.c.POINT_NAME);
        measure.setRange(Double.valueOf((double) vu3.b.GEO_NOT_SUPPORT), Double.valueOf(120000.0d));
        m(DOWNLOAD_STAT, MeasureSet.create().addMeasure(measure), addDimension);
    }

    public static void p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4d4a520e", new Object[0]);
            return;
        }
        DimensionSet addDimension = DimensionSet.create().addDimension("type").addDimension("result");
        Measure measure = new Measure("time");
        measure.setRange(Double.valueOf((double) vu3.b.GEO_NOT_SUPPORT), Double.valueOf(120000.0d));
        m(EXPERIMENT_ACTIVATE_STAT, MeasureSet.create().addMeasure(measure), addDimension);
    }

    public static void q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b72b3d63", new Object[0]);
            return;
        }
        DimensionSet addDimension = DimensionSet.create().addDimension("result");
        Measure measure = new Measure("time");
        measure.setRange(Double.valueOf((double) vu3.b.GEO_NOT_SUPPORT), Double.valueOf(120000.0d));
        m(TRACK_STAT, MeasureSet.create().addMeasure(measure), addDimension);
    }

    public static void r(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eeb7f9c6", new Object[]{str, new Boolean(z)});
            return;
        }
        try {
            g1v g1vVar = new g1v();
            g1vVar.setProperty(g1v.FIELD_EVENT_ID, "19999");
            g1vVar.setProperty(g1v.FIELD_PAGE, "Yixiu");
            g1vVar.setProperty(g1v.FIELD_ARG1, "Auge");
            g1vVar.setProperty(g1v.FIELD_ARG2, str);
            g1vVar.setProperty(g1v.FIELD_ARG3, String.valueOf(z));
            UTAnalytics.getInstance().getDefaultTracker().send(g1vVar.build());
        } catch (Throwable th) {
            ogh.g("Analytics", th.getMessage());
        }
    }

    public static void d(String str, String str2, long j, long j2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("17ccc6a6", new Object[]{str, str2, new Long(j), new Long(j2), new Boolean(z)});
        } else if (!TextUtils.isEmpty(str)) {
            h(DOWNLOAD_STAT, DimensionValueSet.create().setValue("type", str).setValue("url", str2).setValue(TBImageFlowMonitor.SIZ_RANGE_DIMEN, l(j)).setValue("net", wyv.d(n.j().b())).setValue("success", String.valueOf(z)).setValue("background", String.valueOf(c21.g().getBoolean("isInBackground", true))), MeasureValueSet.create().setValue(amo.c.POINT_NAME, j2));
        }
    }
}
