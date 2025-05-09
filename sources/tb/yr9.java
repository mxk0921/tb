package tb;

import com.alibaba.mtl.appmonitor.AppMonitor;
import com.alibaba.mtl.appmonitor.model.DimensionSet;
import com.alibaba.mtl.appmonitor.model.DimensionValueSet;
import com.alibaba.mtl.appmonitor.model.MeasureSet;
import com.alibaba.mtl.appmonitor.model.MeasureValueSet;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.mnn.BaseMnnRunUnit;
import com.taobao.android.fluid.launcher.task.ScheduleTask;
import com.taobao.android.weex_uikit.widget.video.c;
import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public final class yr9 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String MODULE = "FluidSDK";

    static {
        t2o.a(806355087);
        b();
    }

    public static int a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3cec5212", new Object[0])).intValue();
        }
        chb g = c21.g();
        if (g != null) {
            return g.getInt("deviceLevel", -1);
        }
        return -1;
    }

    public static void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("40b3809e", new Object[0]);
            return;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add("costTime");
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add("bizName");
        arrayList2.add("deviceLevel");
        arrayList2.add(BaseMnnRunUnit.KEY_TASK_NAME);
        arrayList2.add("taskState");
        arrayList2.add(c.ATTR_DELAY_TIME);
        arrayList2.add("threadMode");
        AppMonitor.register("FluidSDK", "FluidLauncherTask", MeasureSet.create(arrayList), DimensionSet.create(arrayList2), true);
    }

    public static void c(ScheduleTask scheduleTask) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e5c0e32", new Object[]{scheduleTask});
        } else if (scheduleTask != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("costTime", String.valueOf(scheduleTask.c()));
            HashMap hashMap2 = new HashMap();
            hashMap2.put("bizName", scheduleTask.b());
            hashMap2.put("deviceLevel", String.valueOf(a()));
            hashMap2.put(BaseMnnRunUnit.KEY_TASK_NAME, scheduleTask.getTaskName());
            hashMap2.put("taskState", scheduleTask.i());
            hashMap2.put(c.ATTR_DELAY_TIME, String.valueOf(scheduleTask.d()));
            hashMap2.put("threadMode", scheduleTask.j());
            AppMonitor.Stat.commit("FluidSDK", "FluidLauncherTask", DimensionValueSet.fromStringMap(hashMap2), MeasureValueSet.fromStringMap(hashMap));
        }
    }
}
