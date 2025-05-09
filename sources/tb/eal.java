package tb;

import android.text.TextUtils;
import anet.channel.GlobalAppRuntimeInfo;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.alibaba.mtl.appmonitor.model.DimensionSet;
import com.alibaba.mtl.appmonitor.model.DimensionValueSet;
import com.alibaba.mtl.appmonitor.model.Measure;
import com.alibaba.mtl.appmonitor.model.MeasureSet;
import com.alibaba.mtl.appmonitor.model.MeasureValueSet;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OConstant;
import com.taobao.orange.util.OLog;
import com.ut.mini.UTAnalytics;
import com.ut.mini.internal.UTOriginalCustomHitBuilder;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import tb.vu3;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class eal {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "OrangeMonitor";

    /* renamed from: a  reason: collision with root package name */
    public static final boolean f18412a;
    public static final int b = 19997;
    public static boolean c = false;
    public static final AtomicBoolean d = new AtomicBoolean(false);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ DimensionValueSet f18413a;
        public final /* synthetic */ MeasureValueSet b;
        public final /* synthetic */ Map c;

        public a(DimensionValueSet dimensionValueSet, MeasureValueSet measureValueSet, Map map) {
            this.f18413a = dimensionValueSet;
            this.b = measureValueSet;
            this.c = map;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                eal.q(OConstant.MONITOR_MODULE, OConstant.POINT_CONFIG_UPDATE, this.f18413a, this.b);
                UTAnalytics.getInstance().getDefaultTracker().send(new UTOriginalCustomHitBuilder("Orange_UT", eal.b, OConstant.POINT_CONFIG_UPDATE, "arg2", "arg3", this.c).build());
            } catch (Exception unused) {
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ UTOriginalCustomHitBuilder f18414a;

        public b(UTOriginalCustomHitBuilder uTOriginalCustomHitBuilder) {
            this.f18414a = uTOriginalCustomHitBuilder;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                UTAnalytics.getInstance().getDefaultTracker().send(this.f18414a.build());
            } catch (Exception e) {
                OLog.e(eal.TAG, "UTAnalytics send error.", e, new Object[0]);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ DimensionValueSet f18415a;
        public final /* synthetic */ MeasureValueSet b;
        public final /* synthetic */ Map c;

        public c(DimensionValueSet dimensionValueSet, MeasureValueSet measureValueSet, Map map) {
            this.f18415a = dimensionValueSet;
            this.b = measureValueSet;
            this.c = map;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                eal.q(OConstant.MONITOR_MODULE, OConstant.POINT_FETCH_CRITICAL_CONFIG, this.f18415a, this.b);
                UTAnalytics.getInstance().getDefaultTracker().send(new UTOriginalCustomHitBuilder("Orange_UT", eal.b, OConstant.POINT_FETCH_CRITICAL_CONFIG, "arg2", "arg3", this.c).build());
            } catch (Exception unused) {
            }
        }
    }

    static {
        t2o.a(613417118);
        f18412a = false;
        try {
            IpChange ipChange = AppMonitor.$ipChange;
            f18412a = true;
        } catch (ClassNotFoundException unused) {
            f18412a = false;
        }
    }

    public static void c(String str) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("148dd18f", new Object[]{str});
            return;
        }
        String valueOf = String.valueOf(System.currentTimeMillis() - com.taobao.orange.a.J);
        HashMap hashMap = new HashMap();
        hashMap.put(OConstant.DIMEN_CONFIG_NAME, str);
        hashMap.put("process", cw0.b);
        hashMap.put(OConstant.DIMEN_COMMIT_TIME, valueOf);
        hashMap.put(OConstant.DIMEN_PROCESS_START_TIME, Long.toString(cw0.c() - com.taobao.orange.a.J));
        if (com.taobao.orange.a.b) {
            str2 = "1";
        } else {
            str2 = "0";
        }
        hashMap.put("isMainProcess", str2);
        fck.d(new b(new UTOriginalCustomHitBuilder("Orange_UT", b, "config_not_get", "arg2", "arg3", hashMap)), 20000L);
    }

    public static void d(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c58de29d", new Object[]{str, str2, str3});
        } else {
            f(str, str2, str3, null, null, null);
        }
    }

    public static void e(String str, String str2, String str3, Boolean bool, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("85f00b5a", new Object[]{str, str2, str3, bool, str4});
        } else {
            f(str, str2, str3, bool, str4, null);
        }
    }

    public static void g(String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6adc7f27", new Object[]{str, str2, str3, str4});
        } else {
            f(str, str2, str3, null, null, str4);
        }
    }

    public static void i(String str, String str2, String str3, String str4, String str5) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44533817", new Object[]{str, str2, str3, str4, str5});
        } else if (f18412a) {
            DimensionValueSet create = DimensionValueSet.create();
            create.setValue(OConstant.DIMEN_CONFIG_NAME, str);
            create.setValue(OConstant.DIMEN_CONTENT_MD5_VALUE, str2);
            create.setValue("configVersion", str3);
            create.setValue(OConstant.DIMEN_CONFIG_RESOURCE_ID, str4);
            create.setValue(OConstant.DIMEN_CONFIG_CHANGE_VERSION, str5);
            q(OConstant.MONITOR_MODULE, OConstant.POINT_CONTENT_MD5, create, MeasureValueSet.create());
        }
    }

    public static void j(String str, String str2, String str3, double d2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5653f8a1", new Object[]{str, str2, str3, new Double(d2)});
        } else if (f18412a) {
            AppMonitor.Counter.commit(str, str2, str3, d2);
        }
    }

    public static void k(String str, String str2, long j, long j2, long j3, long j4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c50c8e24", new Object[]{str, str2, new Long(j), new Long(j2), new Long(j3), new Long(j4)});
        } else if (f18412a) {
            HashMap hashMap = new HashMap();
            String l = Long.toString(j - com.taobao.orange.a.J);
            String l2 = Long.toString(j2 - com.taobao.orange.a.J);
            String l3 = Long.toString(j3 - com.taobao.orange.a.J);
            String l4 = Long.toString(j4 - com.taobao.orange.a.J);
            try {
                hashMap.put("dataId", str);
                hashMap.put(OConstant.DIMEN_CRITICAL_ACCS_STATUS, str2);
                hashMap.put(OConstant.DIMEN_ACCS_START_TIME, l);
                hashMap.put(OConstant.DIMEN_ACCS_DONE_TIME, l2);
                hashMap.put(OConstant.DIMEN_PARSE_START_TIME, l3);
                hashMap.put(OConstant.DIMEN_PARSE_DONE_TIME, l4);
                UTAnalytics.getInstance().getDefaultTracker().send(new UTOriginalCustomHitBuilder("Orange_UT", b, OConstant.POINT_CRITICAL_ACCS_UPDATE, "arg2", "arg3", hashMap).build());
            } catch (Exception unused) {
            }
        }
    }

    public static void l(String str, String str2, String str3, String str4, String str5) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("49c1ffee", new Object[]{str, str2, str3, str4, str5});
        } else if (f18412a) {
            AppMonitor.Alarm.commitFail(str, str2, str3, str4, str5);
        }
    }

    public static void n(String str, boolean z, boolean z2, int i, double d2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("78c21f7f", new Object[]{str, new Boolean(z), new Boolean(z2), new Integer(i), new Double(d2)});
        } else if (f18412a) {
            DimensionValueSet create = DimensionValueSet.create();
            create.setValue(OConstant.DIMEN_CONFIG_NAME, str);
            String str2 = "0";
            create.setValue("success", z ? "1" : str2);
            if (z2) {
                str2 = "1";
            }
            create.setValue(OConstant.DIMEN_FILE_LOCK, str2);
            create.setValue("process", cw0.b);
            create.setValue("processIsolated", "1");
            create.setValue("type", String.valueOf(i));
            MeasureValueSet create2 = MeasureValueSet.create();
            create2.setValue("cost", d2);
            q(OConstant.MONITOR_MODULE, OConstant.POINT_FILE_STAT, create, create2);
        }
    }

    public static void q(String str, String str2, DimensionValueSet dimensionValueSet, MeasureValueSet measureValueSet) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70f8ffe0", new Object[]{str, str2, dimensionValueSet, measureValueSet});
        } else if (f18412a) {
            AppMonitor.Stat.commit(str, str2, dimensionValueSet, measureValueSet);
        }
    }

    public static void r(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d3416f1", new Object[]{str, str2, str3});
        } else if (f18412a) {
            AppMonitor.Alarm.commitSuccess(str, str2, str3);
        }
    }

    public static Measure s(String str, double d2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Measure) ipChange.ipc$dispatch("d011e540", new Object[]{str, new Double(d2)});
        }
        Measure measure = new Measure(str);
        measure.setRange(Double.valueOf((double) vu3.b.GEO_NOT_SUPPORT), Double.valueOf(d2));
        return measure;
    }

    public static void t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[0]);
        } else if (f18412a) {
            DimensionSet create = DimensionSet.create();
            create.addDimension("bootType");
            create.addDimension("downgradeType");
            create.addDimension("monitorType");
            create.addDimension("process");
            create.addDimension("processIsolated");
            MeasureSet create2 = MeasureSet.create();
            create2.addMeasure(s("requestCount", 10000.0d));
            create2.addMeasure(s("persistCount", 10000.0d));
            create2.addMeasure(s("restoreCount", 10000.0d));
            create2.addMeasure(s("persistTime", 1000000.0d));
            create2.addMeasure(s("restoreTime", 1000000.0d));
            create2.addMeasure(s("ioTime", 1000000.0d));
            create2.addMeasure(s("initCostTime", 1000000.0d));
            v(OConstant.MONITOR_MODULE, OConstant.POINT_BOOT_PERF, create2, create, false);
            DimensionSet create3 = DimensionSet.create();
            create3.addDimension(OConstant.DIMEN_CONFIG_NAME);
            create3.addDimension("configVersion");
            create3.addDimension(OConstant.DIMEN_CONFIG_CHANGE_VERSION);
            create3.addDimension(OConstant.DIMEN_CONFIG_ENABLE_CHANGE_VERSION);
            create3.addDimension("process");
            create3.addDimension("processIsolated");
            create3.addDimension(OConstant.DIMEN_CONFIG_KEY);
            MeasureSet create4 = MeasureSet.create();
            create3.addDimension(OConstant.DIMEN_COMMIT_TIME);
            create3.addDimension(OConstant.DIMEN_PROCESS_START_TIME);
            create3.addDimension("isCritical");
            v(OConstant.MONITOR_MODULE, OConstant.POINT_CONFIG_USE, create4, create3, false);
            create3.addDimension(OConstant.DIMEN_IS_COLD_STARTUP);
            create3.addDimension("eagleEyeTraceId");
            create3.addDimension("dataId");
            v(OConstant.MONITOR_MODULE, OConstant.POINT_CONFIG_UPDATE, create4, create3, false);
            DimensionSet create5 = DimensionSet.create();
            create5.addDimension(OConstant.DIMEN_INDEX_UPDATE_APP_INDEX_VERSION);
            create5.addDimension(OConstant.DIMEN_INDEX_UPDATE_BASE_VERSION);
            create5.addDimension(OConstant.DIMEN_INDEX_UPDATE_DIFF_SWITCH);
            create5.addDimension("responseHeader");
            create5.addDimension("process");
            create5.addDimension("processIsolated");
            create5.addDimension(OConstant.DIMEN_COMMIT_TIME);
            v(OConstant.MONITOR_MODULE, OConstant.POINT_DIFF_INDEX_UPDATE, create4, create5, false);
            DimensionSet create6 = DimensionSet.create();
            create6.addDimension(OConstant.DIMEN_CONFIG_NAME);
            create6.addDimension("success");
            create6.addDimension(OConstant.DIMEN_FILE_LOCK);
            create6.addDimension("process");
            create6.addDimension("processIsolated");
            create6.addDimension("type");
            MeasureSet create7 = MeasureSet.create();
            create7.addMeasure("cost");
            v(OConstant.MONITOR_MODULE, OConstant.POINT_FILE_STAT, create7, create6, false);
            DimensionSet create8 = DimensionSet.create();
            create8.addDimension(OConstant.DIMEN_CONFIG_NAME);
            create8.addDimension("process");
            create8.addDimension(OConstant.DIMEN_CONFIG_LOAD_STATUS);
            create8.addDimension(OConstant.DIMEN_CONFIG_HTTP_STATUS);
            create8.addDimension(OConstant.DIMEN_CONFIG_BG);
            v(OConstant.MONITOR_MODULE, OConstant.POINT_CONFIG_LOAD, create4, create8, false);
            DimensionSet create9 = DimensionSet.create();
            create9.addDimension("process");
            create9.addDimension(OConstant.DIMEN_CONFIG_NAME);
            v(OConstant.MONITOR_MODULE, OConstant.POINT_CHANNEL_CONFIG_USE, MeasureSet.create(), create9, false);
            DimensionSet create10 = DimensionSet.create();
            create10.addDimension("process");
            create10.addDimension(OConstant.DIMEN_CONFIG_BG);
            create10.addDimension(OConstant.DIMEN_IS_CHANNEL_PROCESS);
            create10.addDimension(OConstant.DIMEN_REPLACE_SERVICE_STATUS);
            create10.addDimension(OConstant.DIMEN_REPLACE_SERVICE_TYPE);
            MeasureSet create11 = MeasureSet.create();
            create11.addMeasure(OConstant.DIMEN_PROCESS_START_TIME);
            create11.addMeasure(OConstant.DIMEN_REPLACE_TO_LOCAL_TIME);
            create11.addMeasure(OConstant.DIMEN_REPLACE_TO_BIND_TIME);
            v(OConstant.MONITOR_MODULE, OConstant.POINT_REPLACE_SERVICE, create11, create10, false);
            DimensionSet create12 = DimensionSet.create();
            create9.addDimension(OConstant.DIMEN_CONFIG_NAME);
            create9.addDimension(OConstant.DIMEN_CONTENT_MD5_VALUE);
            create9.addDimension("configVersion");
            create9.addDimension(OConstant.DIMEN_CONFIG_RESOURCE_ID);
            create9.addDimension(OConstant.DIMEN_CONFIG_CHANGE_VERSION);
            v(OConstant.MONITOR_MODULE, OConstant.POINT_CONTENT_MD5, MeasureSet.create(), create12, false);
        }
    }

    public static void u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("980b3492", new Object[0]);
        } else if (f18412a) {
            DimensionSet create = DimensionSet.create();
            create.addDimension(OConstant.DIMEN_CRITICAL_CONFIGS_VERSION);
            create.addDimension("eagleEyeTraceId");
            create.addDimension(OConstant.DIMEN_CRITICAL_FETCH_STATUS);
            create.addDimension(OConstant.DIMEN_PROCESS_START_TIME);
            create.addDimension(OConstant.DIMEN_FETCH_CRITICAL_START_TIME);
            create.addDimension(OConstant.DIMEN_FETCH_CRITICAL_END_TIME);
            create.addDimension(OConstant.DIMEN_NET_CONNECT_COST_TIME);
            create.addDimension(OConstant.DIMEN_NET_RESPONSE_COST_TIME);
            create.addDimension(OConstant.DIMEN_PARSE_COST_TIME);
            create.addDimension(OConstant.DIMEN_NET_REQUEST_START_TIME);
            create.addDimension(OConstant.DIMEN_HIT_NET_STRATEGY);
            create.addDimension(OConstant.DIMEN_IS_COLD_STARTUP);
            create.addDimension(OConstant.DIMEN_CONFIG_BG);
            create.addDimension("errCode");
            create.addDimension(OConstant.DIMEN_SERVER_ERROR);
            create.addDimension(OConstant.DIMEN_CONTENT_LENGTH);
            create.addDimension(OConstant.DIMEN_CONTENT_REAL_LENGTH);
            v(OConstant.MONITOR_MODULE, OConstant.POINT_FETCH_CRITICAL_CONFIG, MeasureSet.create(), create, false);
        }
    }

    public static void v(String str, String str2, MeasureSet measureSet, DimensionSet dimensionSet, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9377804e", new Object[]{str, str2, measureSet, dimensionSet, new Boolean(z)});
        } else if (f18412a) {
            AppMonitor.register(str, str2, measureSet, dimensionSet, z);
        }
    }

    public static void b(String str, String str2, String str3, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6edabf23", new Object[]{str, str2, str3, new Integer(i)});
        } else if (f18412a && !TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
            DimensionValueSet create = DimensionValueSet.create();
            create.setValue(OConstant.DIMEN_CONFIG_NAME, str2);
            create.setValue("process", cw0.b);
            create.setValue(OConstant.DIMEN_CONFIG_LOAD_STATUS, str3);
            create.setValue(OConstant.DIMEN_CONFIG_HTTP_STATUS, String.valueOf(i));
            try {
                create.setValue(OConstant.DIMEN_CONFIG_BG, String.valueOf(GlobalAppRuntimeInfo.isAppBackground()));
            } catch (Throwable th) {
                OLog.e(TAG, "commitConfigLoadMonitor", th, new Object[0]);
            }
            q(OConstant.MONITOR_MODULE, str, create, MeasureValueSet.create());
        }
    }

    public static void p(String str, String str2, double d2, double d3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bbca785d", new Object[]{str, str2, new Double(d2), new Double(d3)});
        } else if (f18412a) {
            DimensionValueSet create = DimensionValueSet.create();
            try {
                create.setValue("process", cw0.b);
                create.setValue(OConstant.DIMEN_CONFIG_BG, String.valueOf(GlobalAppRuntimeInfo.isAppBackground()));
            } catch (Throwable th) {
                OLog.e(TAG, "commitConfigLoadMonitor", th, new Object[0]);
            }
            String str3 = "0";
            create.setValue(OConstant.DIMEN_IS_CHANNEL_PROCESS, com.taobao.orange.a.d ? "1" : str3);
            if ("success".equals(str)) {
                str3 = "1";
            }
            create.setValue(OConstant.DIMEN_REPLACE_SERVICE_STATUS, str3);
            create.setValue(OConstant.DIMEN_REPLACE_SERVICE_TYPE, str2);
            MeasureValueSet create2 = MeasureValueSet.create();
            create2.setValue(OConstant.DIMEN_PROCESS_START_TIME, cw0.c());
            create2.setValue(OConstant.DIMEN_REPLACE_TO_LOCAL_TIME, d2);
            create2.setValue(OConstant.DIMEN_REPLACE_TO_BIND_TIME, d3);
            q(OConstant.MONITOR_MODULE, OConstant.POINT_REPLACE_SERVICE, create, create2);
        }
    }

    public static void a(fal falVar) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("185376b4", new Object[]{falVar});
        } else if (f18412a) {
            DimensionValueSet create = DimensionValueSet.create();
            if (falVar.f19142a.f19143a) {
                str = "1";
            } else {
                str = "0";
            }
            create.setValue("bootType", str);
            create.setValue("downgradeType", String.valueOf(falVar.f19142a.b));
            create.setValue("monitorType", String.valueOf(falVar.f19142a.c));
            create.setValue("process", cw0.b);
            create.setValue("processIsolated", "1");
            MeasureValueSet create2 = MeasureValueSet.create();
            create2.setValue("requestCount", falVar.f19142a.d);
            create2.setValue("persistCount", falVar.f19142a.e);
            create2.setValue("restoreCount", falVar.f19142a.f);
            create2.setValue("persistTime", falVar.f19142a.g);
            create2.setValue("restoreTime", falVar.f19142a.h);
            create2.setValue("ioTime", falVar.f19142a.i);
            create2.setValue("initCostTime", falVar.f19142a.j);
            q(OConstant.MONITOR_MODULE, OConstant.POINT_BOOT_PERF, create, create2);
            OLog.e(TAG, "commit boot stat", falVar.f19142a.toString());
        }
    }

    public static void f(String str, String str2, String str3, Boolean bool, String str4, String str5) {
        String str6;
        String str7;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cced2a4", new Object[]{str, str2, str3, bool, str4, str5});
        } else if (f18412a) {
            if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
                OLog.e(TAG, "commit error because data empty!", new Object[0]);
                return;
            }
            DimensionValueSet create = DimensionValueSet.create();
            create.setValue(OConstant.DIMEN_CONFIG_NAME, str);
            create.setValue("configVersion", str2);
            create.setValue(OConstant.DIMEN_CONFIG_CHANGE_VERSION, str3 == null ? "" : str3);
            create.setValue(OConstant.DIMEN_CONFIG_ENABLE_CHANGE_VERSION, "1");
            create.setValue("process", cw0.b);
            create.setValue("processIsolated", "1");
            String valueOf = String.valueOf(System.currentTimeMillis() - com.taobao.orange.a.J);
            create.setValue(OConstant.DIMEN_COMMIT_TIME, valueOf);
            String l = Long.toString(cw0.c() - com.taobao.orange.a.J);
            create.setValue(OConstant.DIMEN_PROCESS_START_TIME, l);
            if (bool == null) {
                str6 = "";
            } else {
                str6 = bool.toString();
            }
            create.setValue(OConstant.DIMEN_IS_COLD_STARTUP, str6);
            create.setValue("eagleEyeTraceId", str4 == null ? "" : str4);
            create.setValue("dataId", str5 == null ? "" : str5);
            MeasureValueSet create2 = MeasureValueSet.create();
            HashMap hashMap = new HashMap();
            hashMap.put(OConstant.DIMEN_CONFIG_NAME, str);
            hashMap.put("configVersion", str2);
            hashMap.put(OConstant.DIMEN_CONFIG_CHANGE_VERSION, str3 == null ? "" : str3);
            hashMap.put("process", cw0.b);
            hashMap.put(OConstant.DIMEN_COMMIT_TIME, valueOf);
            hashMap.put(OConstant.DIMEN_PROCESS_START_TIME, l);
            if (bool == null) {
                str7 = "";
            } else {
                str7 = bool.toString();
            }
            hashMap.put(OConstant.DIMEN_IS_COLD_STARTUP, str7);
            hashMap.put("eagleEyeTraceId", str4 == null ? "" : str4);
            hashMap.put("dataId", str5 == null ? "" : str5);
            fck.d(new a(create, create2, hashMap), (bool == null || !bool.booleanValue()) ? 0L : 20000L);
        }
    }

    public static void h(String str, String str2, String str3, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a14236c3", new Object[]{str, str2, str3, new Boolean(z)});
        } else if (f18412a) {
            if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
                OLog.e(TAG, "commit error because data empty!", new Object[0]);
                return;
            }
            DimensionValueSet create = DimensionValueSet.create();
            MeasureValueSet create2 = MeasureValueSet.create();
            create.setValue(OConstant.DIMEN_CONFIG_NAME, str);
            create.setValue("configVersion", str2);
            String str4 = "";
            create.setValue(OConstant.DIMEN_CONFIG_CHANGE_VERSION, str3 == null ? str4 : str3);
            create.setValue(OConstant.DIMEN_CONFIG_ENABLE_CHANGE_VERSION, "1");
            create.setValue("process", cw0.b);
            create.setValue("processIsolated", "1");
            String valueOf = String.valueOf(System.currentTimeMillis() - com.taobao.orange.a.J);
            create.setValue(OConstant.DIMEN_COMMIT_TIME, valueOf);
            String l = Long.toString(cw0.c() - com.taobao.orange.a.J);
            create.setValue(OConstant.DIMEN_PROCESS_START_TIME, l);
            create.setValue("isCritical", Boolean.toString(z));
            q(OConstant.MONITOR_MODULE, OConstant.POINT_CONFIG_USE, create, create2);
            try {
                HashMap hashMap = new HashMap();
                hashMap.put(OConstant.DIMEN_CONFIG_NAME, str);
                hashMap.put("configVersion", str2);
                if (str3 != null) {
                    str4 = str3;
                }
                hashMap.put(OConstant.DIMEN_CONFIG_CHANGE_VERSION, str4);
                hashMap.put("process", cw0.b);
                hashMap.put(OConstant.DIMEN_COMMIT_TIME, valueOf);
                hashMap.put("isCritical", Boolean.toString(z));
                hashMap.put(OConstant.DIMEN_PROCESS_START_TIME, l);
                UTAnalytics.getInstance().getDefaultTracker().send(new UTOriginalCustomHitBuilder("Orange_UT", b, OConstant.POINT_CONFIG_USE, "arg2", "arg3", hashMap).build());
            } catch (Exception unused) {
            }
        }
    }

    public static void o(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("48d955db", new Object[]{str, str2, str3});
        } else if (f18412a) {
            String valueOf = String.valueOf(System.currentTimeMillis() - com.taobao.orange.a.J);
            DimensionValueSet create = DimensionValueSet.create();
            create.setValue(OConstant.DIMEN_INDEX_UPDATE_APP_INDEX_VERSION, str);
            create.setValue(OConstant.DIMEN_INDEX_UPDATE_BASE_VERSION, str2);
            create.setValue(OConstant.DIMEN_INDEX_UPDATE_DIFF_SWITCH, String.valueOf(com.taobao.orange.a.v));
            create.setValue("responseHeader", str3);
            create.setValue("process", cw0.b);
            create.setValue("processIsolated", "1");
            create.setValue(OConstant.DIMEN_COMMIT_TIME, valueOf);
            q(OConstant.MONITOR_MODULE, OConstant.POINT_DIFF_INDEX_UPDATE, create, MeasureValueSet.create());
            try {
                HashMap hashMap = new HashMap();
                hashMap.put(OConstant.DIMEN_INDEX_UPDATE_APP_INDEX_VERSION, str);
                hashMap.put(OConstant.DIMEN_INDEX_UPDATE_BASE_VERSION, str2);
                hashMap.put(OConstant.DIMEN_INDEX_UPDATE_DIFF_SWITCH, String.valueOf(com.taobao.orange.a.v));
                hashMap.put("responseHeader", str3);
                hashMap.put("process", cw0.b);
                hashMap.put(OConstant.DIMEN_COMMIT_TIME, valueOf);
                UTAnalytics.getInstance().getDefaultTracker().send(new UTOriginalCustomHitBuilder("Orange_UT", b, OConstant.POINT_DIFF_INDEX_UPDATE, "arg2", "arg3", hashMap).build());
            } catch (Exception unused) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01e6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void m(java.lang.String r29, java.lang.String r30, tb.zs1.a r31, boolean r32, java.lang.String r33, java.lang.String r34, int r35, int r36) {
        /*
            Method dump skipped, instructions count: 492
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.eal.m(java.lang.String, java.lang.String, tb.zs1$a, boolean, java.lang.String, java.lang.String, int, int):void");
    }
}
