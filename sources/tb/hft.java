package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.launcher.task.ScheduleTask;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public final class hft {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final pzd f20611a;
    public final pzd b;
    public final uy0 c;

    static {
        t2o.a(806355086);
    }

    public hft() {
        if (d4s.e(d4s.SWITCH_ENABLE_A_DAEMON, true)) {
            this.f20611a = new c2();
        } else {
            this.f20611a = new n1i();
        }
        this.c = new uy0();
        ho1 ho1Var = new ho1();
        this.b = ho1Var;
        o3s.b("TaskSchedulers", "TaskSchedulers 初始化成功，主线程任务调度器：" + this.f20611a + ", 后台线程任务调度器：" + ho1Var);
    }

    public void a(ScheduleTask scheduleTask) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f94d77cc", new Object[]{this, scheduleTask});
        } else if (scheduleTask != null) {
            if (scheduleTask instanceof ty0) {
                this.c.a(scheduleTask);
            } else if (TextUtils.equals(scheduleTask.j(), "main")) {
                this.f20611a.a(scheduleTask);
            } else {
                ((ho1) this.b).a(scheduleTask);
            }
            scheduleTask.k();
            o3s.b("TaskSchedulers", "取消任务：" + scheduleTask);
        }
    }

    public void b(List<ScheduleTask> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d2fadb55", new Object[]{this, list});
            return;
        }
        for (ScheduleTask scheduleTask : list) {
            if (TextUtils.equals(scheduleTask.i(), "complete")) {
                o3s.b("TaskSchedulers", "取消任务失败，任务已完成：" + scheduleTask);
            } else {
                if (scheduleTask instanceof ty0) {
                    this.c.a(scheduleTask);
                } else if (TextUtils.equals(scheduleTask.j(), "main")) {
                    this.f20611a.a(scheduleTask);
                } else {
                    ((ho1) this.b).a(scheduleTask);
                }
                scheduleTask.k();
                o3s.b("TaskSchedulers", "取消任务成功：" + scheduleTask);
            }
        }
        o3s.b("TaskSchedulers", "取消任务结束，任务队列任务个数：" + list.size());
    }

    public uy0 c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (uy0) ipChange.ipc$dispatch("1c1163d9", new Object[]{this});
        }
        return this.c;
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b466fdd", new Object[]{this});
            return;
        }
        this.f20611a.shutdown();
        ((ho1) this.b).shutdown();
        this.c.shutdown();
    }

    public void e(ScheduleTask scheduleTask) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc1deaee", new Object[]{this, scheduleTask});
        } else if (TextUtils.equals(scheduleTask.i(), "complete")) {
            o3s.b("TaskSchedulers", "提交任务失败，任务已完成：" + scheduleTask);
        } else {
            if (scheduleTask instanceof ty0) {
                this.c.b(scheduleTask);
            } else if (TextUtils.equals(scheduleTask.j(), "main")) {
                this.f20611a.b(scheduleTask);
            } else {
                ((ho1) this.b).b(scheduleTask);
            }
            scheduleTask.o();
            o3s.b("TaskSchedulers", "提交任务：" + scheduleTask);
        }
    }

    public void f(List<ScheduleTask> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("35d873f3", new Object[]{this, list});
            return;
        }
        for (ScheduleTask scheduleTask : list) {
            if (TextUtils.equals(scheduleTask.i(), "complete")) {
                o3s.b("TaskSchedulers", "提交任务失败，任务已完成：" + scheduleTask);
            } else {
                if (scheduleTask instanceof ty0) {
                    this.c.b(scheduleTask);
                } else if (TextUtils.equals(scheduleTask.j(), "main")) {
                    this.f20611a.b(scheduleTask);
                } else {
                    ((ho1) this.b).b(scheduleTask);
                }
                scheduleTask.o();
                o3s.b("TaskSchedulers", "提交任务成功：" + scheduleTask);
            }
        }
        o3s.b("TaskSchedulers", "提交任务结束，任务队列任务个数：" + list.size());
    }
}
