package tb;

import android.os.Build;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.alibaba.mtl.appmonitor.model.DimensionSet;
import com.alibaba.mtl.appmonitor.model.DimensionValueSet;
import com.alibaba.mtl.appmonitor.model.MeasureSet;
import com.alibaba.mtl.appmonitor.model.MeasureValueSet;
import com.android.alibaba.ip.runtime.IpChange;
import com.ut.mini.UTAnalytics;
import com.ut.mini.UTHitBuilders$UTCustomHitBuilder;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class uq0 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String UNCOMMIT_DIMENSION = "ALINN_UNCOMMIT_VALUE";
    public static final float UNCOMMIT_MEASURE = -998.999f;

    /* renamed from: a  reason: collision with root package name */
    public static final boolean f29553a;

    public static DimensionValueSet a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DimensionValueSet) ipChange.ipc$dispatch("cd751177", new Object[]{str, str2});
        }
        DimensionValueSet create = DimensionValueSet.create();
        create.setValue("script_type", "python");
        create.setValue("script_version", "2.4.1.29");
        create.setValue("os_version", String.valueOf(Build.VERSION.SDK_INT));
        create.setValue("device_code", String.valueOf(Build.MODEL));
        create.setValue(xxl.CPU_ARCH, System.getProperty("os.arch"));
        create.setValue("biz_name", str);
        create.setValue("module_name", str2);
        return create;
    }

    public static void b(DimensionValueSet dimensionValueSet, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a3edbda1", new Object[]{dimensionValueSet, str, str2});
        } else if (!"ALINN_UNCOMMIT_VALUE".equals(str2)) {
            dimensionValueSet.setValue(str, str2);
        }
    }

    public static void c(MeasureValueSet measureValueSet, String str, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65dfa349", new Object[]{measureValueSet, str, new Float(f)});
        } else if (f != -998.999f) {
            measureValueSet.setValue(str, f);
        }
    }

    public static void d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bf499732", new Object[]{str});
            return;
        }
        UTHitBuilders$UTCustomHitBuilder uTHitBuilders$UTCustomHitBuilder = new UTHitBuilders$UTCustomHitBuilder("PythonInitError");
        uTHitBuilders$UTCustomHitBuilder.setEventPage("DAI");
        uTHitBuilders$UTCustomHitBuilder.setProperty("errorMsg", str);
        UTAnalytics.getInstance().getDefaultTracker().send(uTHitBuilders$UTCustomHitBuilder.build());
    }

    public static void e(String str, String str2, String str3, boolean z, float f, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94553479", new Object[]{str, str2, str3, new Boolean(z), new Float(f), new Float(f2)});
        } else if (f29553a) {
            DimensionValueSet a2 = a(str, str2);
            b(a2, "error_code", str3);
            MeasureValueSet create = MeasureValueSet.create();
            if (z) {
                c(create, "succeeded_count", 1.0f);
            } else {
                c(create, "failed_count", 1.0f);
            }
            c(create, "time_cost", f);
            c(create, "memory_add", f2);
            AppMonitor.Stat.commit("AliNNPython", "script_stat", a2, create);
        }
    }

    static {
        try {
            IpChange ipChange = AppMonitor.$ipChange;
            f29553a = true;
        } catch (ClassNotFoundException unused) {
            f29553a = false;
        }
        if (f29553a) {
            try {
                DimensionSet create = DimensionSet.create();
                create.addDimension("script_type");
                create.addDimension("script_version");
                create.addDimension("os_version");
                create.addDimension("device_code");
                create.addDimension(xxl.CPU_ARCH);
                create.addDimension("biz_name");
                create.addDimension("module_name");
                create.addDimension("error_code");
                MeasureSet create2 = MeasureSet.create();
                create2.addMeasure("succeeded_count");
                create2.addMeasure("failed_count");
                create2.addMeasure("time_cost");
                create2.addMeasure("memory_add");
                AppMonitor.register("AliNNPython", "script_stat", create2, create);
            } catch (Throwable unused2) {
                f29553a = false;
            }
        }
    }
}
