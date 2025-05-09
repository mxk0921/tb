package tb;

import android.text.TextUtils;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.alibaba.mtl.appmonitor.model.DimensionSet;
import com.alibaba.mtl.appmonitor.model.DimensionValueSet;
import com.alibaba.mtl.appmonitor.model.Measure;
import com.alibaba.mtl.appmonitor.model.MeasureSet;
import com.alibaba.mtl.appmonitor.model.MeasureValueSet;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.alinnpython.AliNNPythonThreadState;
import com.ut.mini.UTAnalytics;
import com.ut.mini.UTTracker;
import com.ut.mini.internal.UTOriginalCustomHitBuilder;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;
import tb.vu3;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class xqh {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static boolean f31547a = false;
    public static boolean b = false;

    static {
        t2o.a(577765445);
    }

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("578a902a", new Object[0]);
        } else {
            j("DAI", 19999, "config_cv_request", null, null, null);
        }
    }

    public static void b(boolean z, long j) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d386752c", new Object[]{new Boolean(z), new Long(j)});
            return;
        }
        if (z) {
            str = "Y";
        } else {
            str = "N";
        }
        j("DAI", 19999, "config_cv_update", str, j + "", null);
    }

    public static void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("83677d6f", new Object[0]);
        } else {
            j("DAI", 19999, "device_cv_coverage", null, null, null);
        }
    }

    public static void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c407ba1", new Object[0]);
        } else {
            j("DAI", 19999, "cv_init", null, null, null);
        }
    }

    public static void e(int i, int i2, int i3, long j, String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cd884183", new Object[]{new Integer(i), new Integer(i2), new Integer(i3), new Long(j), str, str2, str3, str4});
            return;
        }
        k();
        DimensionValueSet create = DimensionValueSet.create();
        create.setValue("sdk_version", "0.9.8.5");
        create.setValue("resource_type", str);
        create.setValue("resource_name", str2);
        create.setValue("resource_url", str3);
        create.setValue("deploy_id", "");
        create.setValue("extend_arg1", str4);
        create.setValue("error_code", i + "");
        HashMap hashMap = new HashMap();
        hashMap.put("succeeded_count", Double.valueOf(((double) i2) * 1.0d));
        hashMap.put("failed_count", Double.valueOf(((double) i3) * 1.0d));
        hashMap.put("time_cost", Double.valueOf(j * 1.0d));
        AppMonitor.Stat.commit("DAI", "download_stat", create, MeasureValueSet.create(hashMap));
    }

    public static void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8094706f", new Object[0]);
        } else {
            j("DAI", 19999, "init", null, null, null);
        }
    }

    public static void g(String str, String str2, JSONObject jSONObject) {
        String jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("38f83203", new Object[]{str, str2, jSONObject});
            return;
        }
        if (jSONObject != null) {
            try {
                jSONObject2 = jSONObject.toString();
            } catch (Throwable th) {
                th.printStackTrace();
                return;
            }
        } else {
            jSONObject2 = null;
        }
        AppMonitor.Alarm.commitFail("DAI", "python_exception_alarm", jSONObject2, str, str2);
    }

    public static void h(AliNNPythonThreadState aliNNPythonThreadState, String str, String str2, String str3, String str4, int i, int i2, int i3, long j, long j2, long j3, long j4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("152aa8cf", new Object[]{aliNNPythonThreadState, str, str2, str3, str4, new Integer(i), new Integer(i2), new Integer(i3), new Long(j), new Long(j2), new Long(j3), new Long(j4)});
        } else {
            i(aliNNPythonThreadState, str, str2, str3, str4, i, i2, i3, j, j2, j3, j4, null);
        }
    }

    public static void i(AliNNPythonThreadState aliNNPythonThreadState, String str, String str2, String str3, String str4, int i, int i2, int i3, long j, long j2, long j3, long j4, Map<String, Map<String, Object>> map) {
        double d;
        double d2;
        double d3;
        double d4;
        double d5;
        double d6;
        double d7;
        Map<String, Object> map2;
        Map<String, Object> map3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8749ad6", new Object[]{aliNNPythonThreadState, str, str2, str3, str4, new Integer(i), new Integer(i2), new Integer(i3), new Long(j), new Long(j2), new Long(j3), new Long(j4), map});
            return;
        }
        l();
        DimensionValueSet create = DimensionValueSet.create();
        create.setValue("sdk_version", "0.9.8.5");
        create.setValue("model_name", str);
        String str5 = "";
        create.setValue("biz_name", str5);
        create.setValue("alias_name", str5);
        create.setValue("env", str5);
        create.setValue("deploy_id", str5);
        create.setValue("extend_arg1", str5);
        create.setValue("error_code", i + str5);
        if (!TextUtils.isEmpty(str3)) {
            str5 = str3;
        }
        create.setValue("cid", str5);
        create.setValue("method_name", str4);
        if (!(map == null || !map.containsKey("dims") || (map3 = map.get("dims")) == null)) {
            for (String str6 : map3.keySet()) {
                create.setValue(str6, String.valueOf(map3.get(str6)));
            }
        }
        HashMap hashMap = new HashMap();
        hashMap.put("succeeded_count", Double.valueOf(i2 * 1.0d));
        hashMap.put("failed_count", Double.valueOf(i3 * 1.0d));
        if (aliNNPythonThreadState != null) {
            d6 = aliNNPythonThreadState.cpuTimeCost;
            d5 = aliNNPythonThreadState.memoryWaterLevel;
            d7 = aliNNPythonThreadState.memorySize;
            d4 = aliNNPythonThreadState.networkRequestCount;
            d3 = aliNNPythonThreadState.networkRequestSize;
            d2 = d6 != vu3.b.GEO_NOT_SUPPORT ? aliNNPythonThreadState.cpuClockCost / d6 : vu3.b.GEO_NOT_SUPPORT;
            d = aliNNPythonThreadState.cpuWaterLevel;
        } else {
            d7 = vu3.b.GEO_NOT_SUPPORT;
            d6 = vu3.b.GEO_NOT_SUPPORT;
            d5 = vu3.b.GEO_NOT_SUPPORT;
            d4 = vu3.b.GEO_NOT_SUPPORT;
            d3 = vu3.b.GEO_NOT_SUPPORT;
            d2 = vu3.b.GEO_NOT_SUPPORT;
            d = vu3.b.GEO_NOT_SUPPORT;
        }
        hashMap.put("time_cost", Double.valueOf(d6));
        hashMap.put("memory_water_level", Double.valueOf(d5));
        hashMap.put("memory_usage", Double.valueOf(d7));
        hashMap.put("network_request_count", Double.valueOf(d4));
        hashMap.put("data_service_rw_count", Double.valueOf(d3));
        hashMap.put("cpu_usage", Double.valueOf(d2));
        hashMap.put("cpu_water_level", Double.valueOf(d));
        hashMap.put("queue_time", Double.valueOf(j * 1.0d));
        hashMap.put("prepare_time", Double.valueOf(j2 * 1.0d));
        hashMap.put("execute_time", Double.valueOf(j3 * 1.0d));
        hashMap.put("postprocess_time", Double.valueOf(j4 * 1.0d));
        hashMap.put("system_cpu_usage", Double.valueOf((double) vu3.b.GEO_NOT_SUPPORT));
        hashMap.put("system_memory_usage", Double.valueOf((double) vu3.b.GEO_NOT_SUPPORT));
        hashMap.put("system_memory_capacity", Double.valueOf((double) vu3.b.GEO_NOT_SUPPORT));
        if (!(map == null || !map.containsKey("meas") || (map2 = map.get("meas")) == null)) {
            for (String str7 : map2.keySet()) {
                if (map2.get(str7) instanceof Double) {
                    hashMap.put(str7, (Double) map2.get(str7));
                }
            }
        }
        MeasureValueSet create2 = MeasureValueSet.create(hashMap);
        kgh.a("MRTMonitor", "[commitModuleRunStatNew] dvs:" + create.getMap() + ",mvs:" + hashMap);
        AppMonitor.Stat.commit("DAI", "model_run_stat", create, create2);
    }

    public static void j(String str, int i, String str2, String str3, String str4, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a30ee7ab", new Object[]{str, new Integer(i), str2, str3, str4, map});
            return;
        }
        try {
            UTTracker defaultTracker = UTAnalytics.getInstance().getDefaultTracker();
            if (defaultTracker != null) {
                defaultTracker.send(new UTOriginalCustomHitBuilder(str, i, str2, str3, str4, map).build());
                kgh.a("MRTMonitor", "pageName=" + str + " eventId=" + i + " arg1=" + str2 + " arg2=" + str3 + " arg3=" + str4 + " args=" + map);
            }
        } catch (Throwable unused) {
        }
    }

    public static synchronized void k() {
        synchronized (xqh.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("772d3246", new Object[0]);
                return;
            }
            if (!f31547a) {
                DimensionSet addDimension = DimensionSet.create().addDimension("sdk_version").addDimension("resource_type").addDimension("resource_name").addDimension("resource_url").addDimension("deploy_id").addDimension("extend_arg1").addDimension("error_code");
                MeasureSet create = MeasureSet.create();
                create.addMeasure(new Measure("succeeded_count"));
                create.addMeasure(new Measure("failed_count"));
                create.addMeasure(new Measure("time_cost"));
                AppMonitor.register("DAI", "download_stat", create, addDimension);
                f31547a = true;
            }
        }
    }

    public static void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b803a9e3", new Object[0]);
        } else if (!b) {
            synchronized (xqh.class) {
                try {
                    if (!b) {
                        DimensionSet addDimension = DimensionSet.create().addDimension("sdk_version").addDimension("model_name").addDimension("biz_name").addDimension("alias_name").addDimension("env").addDimension("deploy_id").addDimension("extend_arg1").addDimension("error_code").addDimension("cid").addDimension("method_name").addDimension("dim1").addDimension("dim2").addDimension("dim3").addDimension("dim4").addDimension("dim5");
                        MeasureSet create = MeasureSet.create();
                        create.addMeasure(new Measure("succeeded_count"));
                        create.addMeasure(new Measure("failed_count"));
                        create.addMeasure(new Measure("time_cost"));
                        create.addMeasure(new Measure("memory_water_level"));
                        create.addMeasure(new Measure("memory_usage"));
                        create.addMeasure(new Measure("network_request_count"));
                        create.addMeasure(new Measure("data_service_rw_count"));
                        create.addMeasure(new Measure("cpu_usage"));
                        create.addMeasure(new Measure("cpu_water_level"));
                        Measure measure = new Measure("queue_time");
                        measure.setRange(Double.valueOf((double) vu3.b.GEO_NOT_SUPPORT), Double.valueOf(120000.0d));
                        create.addMeasure(measure);
                        Measure measure2 = new Measure("prepare_time");
                        measure2.setRange(Double.valueOf((double) vu3.b.GEO_NOT_SUPPORT), Double.valueOf(120000.0d));
                        create.addMeasure(measure2);
                        Measure measure3 = new Measure("execute_time");
                        measure3.setRange(Double.valueOf((double) vu3.b.GEO_NOT_SUPPORT), Double.valueOf(120000.0d));
                        create.addMeasure(measure3);
                        Measure measure4 = new Measure("postprocess_time");
                        measure4.setRange(Double.valueOf((double) vu3.b.GEO_NOT_SUPPORT), Double.valueOf(120000.0d));
                        create.addMeasure(measure4);
                        create.addMeasure(new Measure("system_cpu_usage"));
                        create.addMeasure(new Measure("system_memory_usage"));
                        create.addMeasure(new Measure("system_memory_capacity"));
                        create.addMeasure("mes1");
                        create.addMeasure("mes2");
                        create.addMeasure("mes3");
                        create.addMeasure("mes4");
                        create.addMeasure("mes5");
                        AppMonitor.register("DAI", "model_run_stat", create, addDimension);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            b = true;
        }
    }
}
