package tb;

import android.util.Pair;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.tschedule.TScheduleInitialize;
import com.taobao.android.tschedule.parser.ExprParserParams;
import com.taobao.android.tschedule.task.RenderScheduleTask;
import com.taobao.android.tschedule.task.ScheduleTask;
import com.taobao.android.tschedule.taskcontext.RenderTaskContext;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class met {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(329252971);
    }

    public static List<Pair<String, RenderScheduleTask>> a(List<RenderScheduleTask> list, String str) {
        String c;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("a1290dc5", new Object[]{list, str});
        }
        ArrayList arrayList = new ArrayList();
        for (RenderScheduleTask renderScheduleTask : list) {
            if (b().contains(renderScheduleTask.taskKey) && (c = c(renderScheduleTask)) != null && wnv.c(c, str)) {
                arrayList.add(Pair.create(c, renderScheduleTask));
            }
        }
        return arrayList;
    }

    public static List<String> b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("be079962", new Object[0]);
        }
        List<String> g = zms.g();
        if (g == null) {
            return Collections.emptyList();
        }
        return g;
    }

    public static String c(RenderScheduleTask renderScheduleTask) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3bd98ed1", new Object[]{renderScheduleTask});
        }
        cms c = cms.c(cms.PREFIX, new Object[0]);
        wp8 wp8Var = new wp8(new ExprParserParams(null, null, null, ((RenderTaskContext) renderScheduleTask.taskContext).params.timeContent), TScheduleInitialize.d());
        if (c != null) {
            return c.b(wp8Var).content;
        }
        return null;
    }

    public static List<RenderScheduleTask> d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("fb07013e", new Object[0]);
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, List<ScheduleTask>> entry : nms.c().entrySet()) {
            List<ScheduleTask> value = entry.getValue();
            if (value.size() == 1) {
                ScheduleTask scheduleTask = value.get(0);
                if (scheduleTask instanceof RenderScheduleTask) {
                    arrayList.add((RenderScheduleTask) scheduleTask);
                }
            }
        }
        return arrayList;
    }
}
