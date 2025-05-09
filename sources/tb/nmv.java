package tb;

import android.app.Application;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.TLog;
import java.io.File;
import java.util.Map;
import org.json.JSONObject;
import tb.d2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class nmv {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final Object f24834a = new Object();
    public static Boolean b;

    public static /* synthetic */ void c(Application application) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("739fee8e", new Object[]{application});
            return;
        }
        try {
            synchronized (f24834a) {
                File file = new File(application.getCacheDir().getPath() + File.separator + gc9.SLICE_DATA_DIR);
                if (file.exists() && file.isDirectory()) {
                    File[] listFiles = file.listFiles();
                    if (!(listFiles == null || listFiles.length == 0)) {
                        for (File file2 : listFiles) {
                            f(application, file2);
                        }
                    }
                }
            }
        } catch (Exception e) {
            TLog.loge("MetricKit.ReportUploader", "Upload Fail File Error.", e);
        }
    }

    public static String d(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("980a93b5", new Object[]{map});
        }
        return new JSONObject(map).toString();
    }

    public static void e(Map<String, String> map, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e62b35c1", new Object[]{map, str});
            return;
        }
        Boolean bool = b;
        if (bool == null || bool.booleanValue()) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("Header", new JSONObject(map));
                jSONObject.put("Content", new JSONObject(str));
                new fln().a("ALI_APM//monitor/metrickit", jSONObject.toString(), false);
            } catch (Throwable unused) {
                b = Boolean.FALSE;
            }
        }
    }

    public static void g(final Application application) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18a07f02", new Object[]{application});
        } else {
            mti.c().a().execute(new Runnable() { // from class: tb.lmv
                @Override // java.lang.Runnable
                public final void run() {
                    nmv.c(application);
                }
            });
        }
    }

    public static void f(Application application, File file) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("825eb072", new Object[]{application, file});
            return;
        }
        String name = file.getName();
        if (name.startsWith("metrickit_") && name.endsWith(q2s.JSON) && b(new d2o.b().f(file.getName().replace("metrickit_", "").replace(q2s.JSON, "")).h(ng9.a(file)).a())) {
            file.delete();
        } else if (name.startsWith("metrickit_V1_") && name.endsWith(".txt")) {
            String[] split = name.replace(".txt", "").split("_");
            if (split.length == 4 && !Long.toString(c0c.LAUNCH_SESSION).equals(split[2]) && b(new d2o.b().f(split[3]).e(new gc9(application, "", file).k()).g(c0c.UNESCAPED_SEPARATOR).a())) {
                file.delete();
            }
        }
    }

    public static boolean b(d2o d2oVar) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5043c680", new Object[]{d2oVar})).booleanValue();
        }
        if (!d2oVar.f()) {
            return false;
        }
        boolean z = false;
        while (true) {
            int i2 = i + 1;
            if (i >= 2) {
                break;
            }
            z = zap.b().d(null, System.currentTimeMillis(), null, 61003, "AliHAMetrics", d2oVar.e(), null, d2oVar.d()).booleanValue();
            if (z) {
                TLog.loge("MetricKit.ReportUploader", "send success ", d(d2oVar.d()), d2oVar.e());
                break;
            }
            TLog.loge("MetricKit.ReportUploader", "send fail ", String.valueOf(i2), d(d2oVar.d()), d2oVar.e());
            i = i2;
        }
        e(d2oVar.d(), d2oVar.e());
        return z;
    }
}
