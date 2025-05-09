package tb;

import android.os.Build;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.alibaba.mtl.appmonitor.model.DimensionSet;
import com.alibaba.mtl.appmonitor.model.DimensionValueSet;
import com.alibaba.mtl.appmonitor.model.Measure;
import com.alibaba.mtl.appmonitor.model.MeasureSet;
import com.alibaba.mtl.appmonitor.model.MeasureValueSet;
import com.android.alibaba.ip.runtime.IpChange;
import com.xiaomi.mipush.sdk.PushMessageHelper;
import java.util.Random;
import tb.vu3;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class qq0 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String UNCOMMIT_DIMENSION = "ALINN_UNCOMMIT_VALUE";
    public static final float UNCOMMIT_MEASURE = -998.999f;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public float f26876a;
        public float b;

        static {
            t2o.a(367001629);
            new Random();
        }

        public void a(String str, String str2, String str3, String str4, float f, float f2, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("55c7fcae", new Object[]{this, str, str2, str3, str4, new Float(f), new Float(f2), new Boolean(z)});
                return;
            }
            bzf.e("AliNNJava", "inferenceCommit: bizName=%s, packageId=%s, moduleName=%s, inference cost=%.2fms, memoryIncSize=%s, errorCode=%s, gpuSupport=%b", str, str2, str3, Float.valueOf(this.b), Float.valueOf(this.f26876a), str4, Boolean.valueOf(z));
            qq0.g(str, str2, str3, str4, f, f2, this.b, this.f26876a, z);
        }
    }

    public static DimensionValueSet a(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DimensionValueSet) ipChange.ipc$dispatch("8069696d", new Object[]{str, str2, str3});
        }
        return b(str, str2, str3, -1);
    }

    public static DimensionValueSet b(String str, String str2, String str3, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DimensionValueSet) ipChange.ipc$dispatch("91c7e66e", new Object[]{str, str2, str3, new Integer(i)});
        }
        DimensionValueSet create = DimensionValueSet.create();
        create.setValue("alinn_version", "2.9.3.6");
        create.setValue("os_version", String.valueOf(Build.VERSION.SDK_INT));
        create.setValue("device_code", String.valueOf(Build.MODEL));
        create.setValue(xxl.CPU_ARCH, System.getProperty("os.arch"));
        if (i >= 0) {
            create.setValue("gpu_support", String.valueOf(i));
        }
        create.setValue("biz_name", str);
        create.setValue("package_id", str2);
        create.setValue("model_name", str3);
        return create;
    }

    public static void c(DimensionValueSet dimensionValueSet, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a3edbda1", new Object[]{dimensionValueSet, str, str2});
        } else if (!"ALINN_UNCOMMIT_VALUE".equals(str2)) {
            dimensionValueSet.setValue(str, str2);
        }
    }

    public static void d(MeasureValueSet measureValueSet, String str, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65dfa349", new Object[]{measureValueSet, str, new Float(f)});
        } else if (f != -998.999f) {
            measureValueSet.setValue(str, f);
        }
    }

    public static Measure e(String str, Double d, Double d2, Double d3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Measure) ipChange.ipc$dispatch("48022514", new Object[]{str, d, d2, d3});
        }
        Measure measure = new Measure(str, d);
        if (!(d2 == null || d3 == null)) {
            measure.setRange(d2, d3);
        }
        return measure;
    }

    public static void f(String str, String str2, String str3, String str4, boolean z, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bcf952fa", new Object[]{str, str2, str3, str4, new Boolean(z), new Float(f)});
            return;
        }
        DimensionValueSet create = DimensionValueSet.create();
        create.setValue("biz_name", str);
        create.setValue("package_id", str2);
        create.setValue("alinn_version", "2.9.3.6");
        create.setValue(PushMessageHelper.ERROR_TYPE, str3);
        if (str4.equals("ALINN_UNCOMMIT_VALUE")) {
            str4 = "0";
        }
        create.setValue("error_code", str4);
        MeasureValueSet create2 = MeasureValueSet.create();
        if (z) {
            d(create2, "succeeded_count", 1.0f);
        } else {
            d(create2, "failed_count", 1.0f);
        }
        d(create2, "downloaded_time", f);
        AppMonitor.Stat.commit("AliNN", "download_stat", create, create2);
    }

    public static void g(String str, String str2, String str3, String str4, float f, float f2, float f3, float f4, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bbca9dd5", new Object[]{str, str2, str3, str4, new Float(f), new Float(f2), new Float(f3), new Float(f4), new Boolean(z)});
            return;
        }
        DimensionValueSet b = b(str, str2, str3, z ? 1 : 0);
        c(b, "error_code", str4);
        MeasureValueSet create = MeasureValueSet.create();
        d(create, "succeeded_count", f);
        d(create, "failed_count", f2);
        d(create, "inferenced_time", f3);
        if (f4 >= 0.0f) {
            d(create, "memory_add", f4);
        }
        AppMonitor.Stat.commit("AliNN", "inference_stat", b, create);
    }

    public static void h(String str, String str2, String str3, String str4, boolean z, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cde45cd5", new Object[]{str, str2, str3, str4, new Boolean(z), new Float(f)});
            return;
        }
        DimensionValueSet a2 = a(str, str2, str3);
        c(a2, "error_code", str4);
        MeasureValueSet create = MeasureValueSet.create();
        if (z) {
            d(create, "succeeded_count", 1.0f);
        } else {
            d(create, "failed_count", 1.0f);
        }
        d(create, "loaded_time", f);
        AppMonitor.Stat.commit("AliNN", "loadmodel_stat", a2, create);
    }

    public static void i(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c07bd215", new Object[]{str, str2});
            return;
        }
        DimensionValueSet create = DimensionValueSet.create();
        create.setValue("biz_name", str);
        create.setValue("package_id", str2);
        create.setValue("alinn_version", "2.9.3.6");
        MeasureValueSet create2 = MeasureValueSet.create();
        d(create2, "received_count", 1.0f);
        AppMonitor.Stat.commit("AliNN", "receive_stat", create, create2);
    }

    static {
        t2o.a(367001628);
        DimensionSet create = DimensionSet.create();
        create.addDimension("biz_name");
        create.addDimension("package_id");
        create.addDimension("alinn_version");
        MeasureSet create2 = MeasureSet.create();
        create2.addMeasure("received_count");
        AppMonitor.register("AliNN", "receive_stat", create2, create);
        DimensionSet create3 = DimensionSet.create();
        create3.addDimension("alinn_version");
        create3.addDimension("biz_name");
        create3.addDimension("package_id");
        create3.addDimension(PushMessageHelper.ERROR_TYPE);
        create3.addDimension("error_code");
        MeasureSet create4 = MeasureSet.create();
        create4.addMeasure("succeeded_count");
        create4.addMeasure("failed_count");
        Double valueOf = Double.valueOf((double) vu3.b.GEO_NOT_SUPPORT);
        Double valueOf2 = Double.valueOf(120000.0d);
        create4.addMeasure(e("downloaded_time", valueOf, valueOf, valueOf2));
        AppMonitor.register("AliNN", "download_stat", create4, create3);
        DimensionSet create5 = DimensionSet.create();
        create5.addDimension("alinn_version");
        create5.addDimension("device_code");
        create5.addDimension("biz_name");
        create5.addDimension("package_id");
        create5.addDimension("model_name");
        create5.addDimension("os_version");
        create5.addDimension(xxl.CPU_ARCH);
        create5.addDimension("error_code");
        MeasureSet create6 = MeasureSet.create();
        create6.addMeasure("succeeded_count");
        create6.addMeasure("failed_count");
        create6.addMeasure(e("loaded_time", valueOf, valueOf, valueOf2));
        AppMonitor.register("AliNN", "loadmodel_stat", create6, create5);
        DimensionSet create7 = DimensionSet.create();
        create7.addDimension("alinn_version");
        create7.addDimension("os_version");
        create7.addDimension("device_code");
        create7.addDimension(xxl.CPU_ARCH);
        create7.addDimension("gpu_support");
        create7.addDimension("nnapi_support");
        create7.addDimension("biz_name");
        create7.addDimension("package_id");
        create7.addDimension("model_name");
        create7.addDimension("error_code");
        MeasureSet create8 = MeasureSet.create();
        create8.addMeasure("succeeded_count");
        create8.addMeasure("failed_count");
        Double valueOf3 = Double.valueOf(60000.0d);
        create8.addMeasure(e("inferenced_time", valueOf, valueOf, valueOf3));
        create8.addMeasure(e("memory_add", valueOf, valueOf, Double.valueOf(1.0E8d)));
        AppMonitor.register("AliNN", "inference_stat", create8, create7);
        DimensionSet create9 = DimensionSet.create();
        create9.addDimension("alinn_version");
        create9.addDimension("os_version");
        create9.addDimension("device_code");
        create9.addDimension(xxl.CPU_ARCH);
        create9.addDimension("gpu_support");
        create9.addDimension("nnapi_support");
        create9.addDimension("biz_name");
        create9.addDimension("package_id");
        create9.addDimension("model_name");
        create9.addDimension("layers_cost_time");
        MeasureSet create10 = MeasureSet.create();
        create10.addMeasure(e("layers_cost_time_sum", valueOf, valueOf, valueOf3));
        AppMonitor.register("AliNN", "layer_stat", create10, create9);
    }
}
