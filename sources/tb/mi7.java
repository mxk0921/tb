package tb;

import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.text.TextUtils;
import android.util.Log;
import com.ali.alihadeviceevaluator.model.ReportRule;
import com.ali.alihadeviceevaluator.old.HardWareInfo;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.alibaba.mtl.appmonitor.model.DimensionSet;
import com.alibaba.mtl.appmonitor.model.DimensionValueSet;
import com.alibaba.mtl.appmonitor.model.MeasureSet;
import com.alibaba.mtl.appmonitor.model.MeasureValueSet;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.change.app.icon.biz.ChangeAppIconBridge;
import java.io.File;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class mi7 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String K_REPORT_LAST_TIMESTAMP = "report_lasttimestamp";
    public static final String K_REPORT_RULE = "report_rule";
    public static final String K_REPORT_VALID_PERIOD = "report_validperiod";

    /* renamed from: a  reason: collision with root package name */
    public static volatile boolean f24060a = true;
    public static rl0 b;

    public static boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2537e9f7", new Object[0])).booleanValue();
        }
        if (!m1g.b().contains(K_REPORT_LAST_TIMESTAMP)) {
            return true;
        }
        return System.currentTimeMillis() >= m1g.b().getLong(K_REPORT_LAST_TIMESTAMP, 0L) + z9a.a(!m1g.b().contains(K_REPORT_VALID_PERIOD) ? 24L : m1g.b().getLong(K_REPORT_VALID_PERIOD, 0L));
    }

    public static void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[0]);
        } else if (f24060a) {
            f24060a = false;
            AppMonitor.register(z9a.TAG, "DeviceInfo", MeasureSet.create().addMeasure(ai7.KEY_OLD_SCORE).addMeasure("deviceScore").addMeasure(ai7.KEY_CPU_SCORE).addMeasure(ai7.KEY_GPU_SCORE).addMeasure(ai7.KEY_MEM_SCORE), DimensionSet.create().addDimension(ChangeAppIconBridge.KEY_DEVICEMODEL, "ALI_DEFAULT").addDimension(ai7.KEY_CPU_BRAND, "ALI_DEFAULT").addDimension(ai7.KEY_CPU_NAME, "ALI_DEFAULT").addDimension(ai7.KEY_CPU_COUNT, "ALI_DEFAULT").addDimension(ai7.KEY_CPU_MAX_FREQ, "ALI_DEFAULT").addDimension(ai7.KEY_CPU_MIN_FREQ, "ALI_DEFAULT").addDimension("cpuFreqArray", "ALI_DEFAULT").addDimension(ai7.KEY_GPU_NAME, "ALI_DEFAULT").addDimension(ai7.KEY_GPU_BRAND, "ALI_DEFAULT").addDimension(ai7.KEY_GPU_FREQ, "ALI_DEFAULT").addDimension(ai7.KEY_CPU_ARCH, "ALI_DEFAULT").addDimension(ai7.KEY_DISPLAY_WIDTH, "ALI_DEFAULT").addDimension(ai7.KEY_DISPLAY_HEIGHT, "ALI_DEFAULT").addDimension(ai7.KEY_DISPLAY_DENSITY, "ALI_DEFAULT").addDimension("openGLVersion", "ALI_DEFAULT").addDimension("memTotal", "ALI_DEFAULT").addDimension("memJava", "ALI_DEFAULT").addDimension("memNative", "ALI_DEFAULT").addDimension(ai7.KEY_MEM_LIMITED_HEAP, "ALI_DEFAULT").addDimension(ai7.KEY_MEM_LIMITED_LARGE_HEAP, "ALI_DEFAULT").addDimension("osVersion", "ALI_DEFAULT").addDimension("storeTotal", "ALI_DEFAULT").addDimension("storeFree", "ALI_DEFAULT").addDimension("deviceUsedTime", "ALI_DEFAULT").addDimension("deviceIsRoot", "ALI_DEFAULT").addDimension("memTotalUsed", "ALI_DEFAULT").addDimension("memJavaUsed", "ALI_DEFAULT").addDimension("memNativeUsed", "ALI_DEFAULT").addDimension("pssTotal", "ALI_DEFAULT").addDimension("pssJava", "ALI_DEFAULT").addDimension("pssNative", "ALI_DEFAULT").addDimension("ext", "{}"));
        }
    }

    public static boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c6b36bb7", new Object[0])).booleanValue();
        }
        String[] strArr = {"/system/bin/su", "/system/xbin/su", "/system/sbin/su", "/sbin/su", "/vendor/bin/su"};
        for (int i = 0; i < 5; i++) {
            try {
                if (new File(strArr[i]).exists()) {
                    return true;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return false;
    }

    public static void d(DimensionValueSet dimensionValueSet) {
        Map<String, List<String>> map;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("be26772", new Object[]{dimensionValueSet});
            return;
        }
        try {
            String string = m1g.b().getString(K_REPORT_RULE, null);
            ReportRule reportRule = string == null ? null : (ReportRule) JSON.parseObject(string, ReportRule.class);
            if (!(reportRule == null || (map = reportRule.propMapping) == null)) {
                JSONObject jSONObject = new JSONObject(reportRule.propMapping.size());
                n3r n3rVar = new n3r();
                for (String str : map.keySet()) {
                    List<String> list = reportRule.propMapping.get(str);
                    if (list != null) {
                        String str2 = null;
                        for (String str3 : list) {
                            str2 = n3rVar.a(str3);
                            if (!TextUtils.isEmpty(str2)) {
                                break;
                            }
                        }
                        if (!TextUtils.isEmpty(str2)) {
                            if (dimensionValueSet.containValue(str)) {
                                dimensionValueSet.setValue(str, str2);
                            } else {
                                jSONObject.put(str, (Object) str2);
                            }
                        }
                    }
                }
                if (!jSONObject.isEmpty()) {
                    dimensionValueSet.setValue("ext", jSONObject.toJSONString());
                }
            }
        } catch (Throwable th) {
            th.printStackTrace();
            Log.e(z9a.TAG, "mappingProps failed!!");
        }
    }

    public static void f(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("848bf84e", new Object[]{new Integer(i)});
        } else if (i > 0) {
            try {
                AppMonitor.Counter.commit(z9a.TAG, "lazyLoad", i);
            } catch (Throwable th) {
                th.printStackTrace();
                Log.e(z9a.TAG, "reportLazyLoad failed!!");
            }
        }
    }

    public static void g(rl0 rl0Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75766668", new Object[]{rl0Var});
        } else {
            b = rl0Var;
        }
    }

    public static void h(DimensionValueSet dimensionValueSet, String str, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7824f639", new Object[]{dimensionValueSet, str, new Float(f)});
        } else if (f > 0.0f && dimensionValueSet != null) {
            dimensionValueSet.setValue(str, f + "");
        }
    }

    public static void i(DimensionValueSet dimensionValueSet, String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7825017c", new Object[]{dimensionValueSet, str, new Integer(i)});
        } else if (i > 0 && dimensionValueSet != null) {
            dimensionValueSet.setValue(str, i + "");
        }
    }

    public static void j(DimensionValueSet dimensionValueSet, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab823c71", new Object[]{dimensionValueSet, str, str2});
        } else if (!TextUtils.isEmpty(str2) && dimensionValueSet != null) {
            dimensionValueSet.setValue(str, str2);
        }
    }

    public static void e(HardWareInfo hardWareInfo) {
        rl0 rl0Var;
        StatFs statFs;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c06b76b6", new Object[]{hardWareInfo});
        } else if (zym.d() && a()) {
            b();
            try {
                DimensionValueSet create = DimensionValueSet.create();
                MeasureValueSet create2 = MeasureValueSet.create();
                j(create, ChangeAppIconBridge.KEY_DEVICEMODEL, Build.MODEL);
                j(create, ai7.KEY_CPU_BRAND, hardWareInfo.f1869a);
                j(create, ai7.KEY_CPU_NAME, hardWareInfo.b);
                i(create, ai7.KEY_CPU_COUNT, hardWareInfo.c);
                h(create, ai7.KEY_CPU_MAX_FREQ, hardWareInfo.d);
                h(create, ai7.KEY_CPU_MIN_FREQ, hardWareInfo.e);
                float[] fArr = hardWareInfo.f;
                StringBuilder sb = new StringBuilder();
                if (fArr != null) {
                    sb.append(fArr[0]);
                    for (int i = 1; i < fArr.length; i++) {
                        sb.append(",");
                        sb.append(fArr[i]);
                    }
                }
                j(create, "cpuFreqArray", sb.toString());
                j(create, ai7.KEY_GPU_NAME, hardWareInfo.g);
                j(create, ai7.KEY_GPU_BRAND, hardWareInfo.h);
                h(create, ai7.KEY_GPU_FREQ, (float) hardWareInfo.i);
                j(create, ai7.KEY_CPU_ARCH, hardWareInfo.c());
                i(create, ai7.KEY_DISPLAY_WIDTH, hardWareInfo.k);
                i(create, ai7.KEY_DISPLAY_HEIGHT, hardWareInfo.l);
                h(create, ai7.KEY_DISPLAY_DENSITY, hardWareInfo.m);
                j(create, "openGLVersion", lp0.d().c().d);
                h(create, "memTotal", (float) lp0.d().e().f23478a);
                h(create, "memJava", (float) lp0.d().e().c);
                h(create, "memNative", (float) lp0.d().e().e);
                int[] d = new np0().d(z9a.f32627a);
                i(create, ai7.KEY_MEM_LIMITED_HEAP, d[0]);
                i(create, ai7.KEY_MEM_LIMITED_LARGE_HEAP, d[1]);
                i(create, "osVersion", Build.VERSION.SDK_INT);
                try {
                    long blockSize = new StatFs(Environment.getDataDirectory().getPath()).getBlockSize();
                    h(create, "storeTotal", (float) ((((statFs.getBlockCount() * blockSize) / 1024) / 1024) / 1024));
                    h(create, "storeFree", (float) ((((blockSize * statFs.getAvailableBlocks()) / 1024) / 1024) / 1024));
                } catch (Exception e) {
                    e.printStackTrace();
                }
                File file = new File("/sdcard/Android/");
                if (file.exists()) {
                    h(create, "deviceUsedTime", (float) (Math.abs(System.currentTimeMillis() - file.lastModified()) / 86400000));
                }
                j(create, "deviceIsRoot", c() + "");
                h(create, "memTotalUsed", (float) lp0.d().e().b);
                h(create, "memJavaUsed", (float) lp0.d().e().d);
                h(create, "memNativeUsed", (float) lp0.d().e().f);
                h(create, "pssTotal", (float) lp0.d().e().i);
                h(create, "pssJava", (float) lp0.d().e().g);
                h(create, "pssNative", (float) lp0.d().e().h);
                d(create);
                create2.setValue(ai7.KEY_OLD_SCORE, hardWareInfo.n());
                if (b != null) {
                    create2.setValue("deviceScore", rl0Var.h());
                }
                create2.setValue(ai7.KEY_CPU_SCORE, hardWareInfo.f());
                create2.setValue(ai7.KEY_GPU_SCORE, hardWareInfo.j());
                create2.setValue(ai7.KEY_MEM_SCORE, hardWareInfo.m());
                JSON.toJSONString(create2);
                JSON.toJSONString(create);
                AppMonitor.Stat.commit(z9a.TAG, "DeviceInfo", create, create2);
                m1g.b().edit().putLong(K_REPORT_LAST_TIMESTAMP, System.currentTimeMillis());
                m1g.b().edit().commit();
            } catch (Throwable th) {
                th.printStackTrace();
                Log.e(z9a.TAG, "report info failed!!");
            }
        }
    }
}
