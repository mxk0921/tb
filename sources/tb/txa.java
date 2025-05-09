package tb;

import android.text.TextUtils;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.alibaba.mtl.appmonitor.model.DimensionSet;
import com.alibaba.mtl.appmonitor.model.DimensionValueSet;
import com.alibaba.mtl.appmonitor.model.MeasureSet;
import com.alibaba.mtl.appmonitor.model.MeasureValueSet;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class txa {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String MEASURE_BATCH_COUNT = "batch_count";
    public static final String MEASURE_COMPRESS_TIME = "compress_time";
    public static final String MEASURE_TOTAL_TIME = "totalTime";

    /* renamed from: a  reason: collision with root package name */
    public static volatile boolean f29017a = false;

    static {
        t2o.a(1034944573);
    }

    public static void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("226148e9", new Object[]{str, str2});
        } else if (!TextUtils.isEmpty(str)) {
            if (TextUtils.isEmpty(str2)) {
                str2 = "unknown";
            }
            AppMonitor.Alarm.commitFail("Highway", "highwayError", str, str2);
        }
    }

    public static void b(String str, boolean z, Map<String, Long> map) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("908b967d", new Object[]{str, new Boolean(z), map});
        } else if (!map.isEmpty() && !TextUtils.isEmpty(str)) {
            if (!f29017a) {
                synchronized (txa.class) {
                    try {
                        if (!f29017a) {
                            MeasureSet create = MeasureSet.create();
                            create.addMeasure("totalTime");
                            create.addMeasure(MEASURE_BATCH_COUNT);
                            create.addMeasure(MEASURE_COMPRESS_TIME);
                            DimensionSet create2 = DimensionSet.create();
                            create2.addDimension("eventName");
                            create2.addDimension("isSuccess");
                            AppMonitor.register("Highway", "upload", create, create2);
                            f29017a = true;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            DimensionValueSet create3 = DimensionValueSet.create();
            create3.setValue("eventName", str);
            if (z) {
                str2 = "1";
            } else {
                str2 = "0";
            }
            create3.setValue("isSuccess", str2);
            MeasureValueSet create4 = MeasureValueSet.create();
            for (Map.Entry<String, Long> entry : map.entrySet()) {
                create4.setValue(entry.getKey(), entry.getValue().longValue());
            }
            AppMonitor.Stat.commit("Highway", "upload", create3, create4);
        }
    }
}
