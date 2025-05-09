package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.tschedule.TSchedule;
import com.taobao.android.tschedule.strategy.b;
import com.taobao.android.tschedule.task.RenderScheduleTask;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class yls {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(329253013);
        t2o.a(329253012);
    }

    public final Set<String> a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Set) ipChange.ipc$dispatch("2c2e9dd7", new Object[]{this});
        }
        b bVar = b.C0504b.instance;
        String e = bVar.e();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (!TextUtils.isEmpty(e)) {
            linkedHashSet.add(e);
        }
        List<String> g = zms.g();
        if (g != null && !g.isEmpty()) {
            if (!bVar.k()) {
                ArrayList arrayList = new ArrayList(g);
                List<RenderScheduleTask> d = met.d();
                if (!d.isEmpty()) {
                    for (RenderScheduleTask renderScheduleTask : d) {
                        arrayList.remove(renderScheduleTask.taskKey);
                    }
                    linkedHashSet.addAll(arrayList);
                }
            } else if (zms.j()) {
                ArrayList arrayList2 = new ArrayList(g);
                List<RenderScheduleTask> d2 = met.d();
                if (!d2.isEmpty()) {
                    for (RenderScheduleTask renderScheduleTask2 : d2) {
                        if (!arrayList2.contains(renderScheduleTask2.taskKey) || !renderScheduleTask2.isValid()) {
                            arrayList2.remove(renderScheduleTask2.taskKey);
                        }
                    }
                    linkedHashSet.addAll(arrayList2);
                }
            } else {
                linkedHashSet.addAll(g);
            }
        }
        return linkedHashSet;
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("81867598", new Object[]{this});
            return;
        }
        Set<String> a2 = a();
        if (a2.isEmpty()) {
            zdh.a("TS.PredictWhitelist", "闲时白名单为空");
            return;
        }
        if (a2.size() > 20) {
            zdh.a("TS.PredictWhitelist", "闲时白名单数量大于2，超出阈值");
        }
        Iterator<String> it = a2.iterator();
        for (int i = 0; i < 20; i++) {
            if (it.hasNext()) {
                String next = it.next();
                zdh.a("TS.PredictWhitelist", "闲时任务执行开始。key = " + next);
                boolean preload = TSchedule.preload("idle", next, new Object[0]);
                zdh.a("TS.PredictWhitelist", "闲时任务执行结束。key = " + next + ";是否有对应task=" + preload);
                if (preload) {
                    dms.b("downgrade", next, "1", "TSchedule", "predict_result", null);
                } else {
                    dms.a("downgrade", next, "1", "TSchedule", "predict_result", null, "TS_PREDICT_EMPTY", "");
                }
            }
        }
    }
}
