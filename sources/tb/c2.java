package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.launcher.task.ScheduleTask;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class c2 implements pzd {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(806355077);
        t2o.a(806355084);
    }

    @Override // tb.pzd
    public void a(ScheduleTask scheduleTask) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f94d77cc", new Object[]{this, scheduleTask});
        } else {
            jr9.c(scheduleTask);
        }
    }

    @Override // tb.pzd
    public void b(ScheduleTask scheduleTask) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc1deaee", new Object[]{this, scheduleTask});
        } else if (scheduleTask.d() > 0) {
            jr9.b(scheduleTask, scheduleTask.d());
        } else {
            jr9.a(scheduleTask);
        }
    }

    @Override // tb.pzd
    public void shutdown() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b466fdd", new Object[]{this});
        }
    }
}
