package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.launcher.task.ScheduleTask;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class vy0 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final HashMap<xvg, ScheduleTask> f30330a = new HashMap<>();
    public final er9 b;

    static {
        t2o.a(806355066);
    }

    public vy0(er9 er9Var) {
        this.b = er9Var;
    }

    public void a(xvg xvgVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f6711a0", new Object[]{this, xvgVar});
        } else if (xvgVar == null) {
            eir.a("TAG_ANIMATION_TASK", "addAnimationStartTask animationTask == null");
        } else if (xvgVar.isDirectExecution()) {
            xvgVar.start();
        } else {
            this.f30330a.put(xvgVar, this.b.l(new ky0(xvgVar)));
        }
    }

    public void b(xvg xvgVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("55348c1d", new Object[]{this, xvgVar});
            return;
        }
        ScheduleTask scheduleTask = this.f30330a.get(xvgVar);
        if (scheduleTask != null) {
            this.f30330a.remove(xvgVar);
            this.b.b(scheduleTask);
        }
    }
}
