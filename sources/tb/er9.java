package tb;

import android.content.Context;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.launcher.task.FluidTaskConfig;
import com.taobao.android.fluid.launcher.task.ScheduleTask;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public final class er9 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final fr9 f18774a;
    public final hft b = new hft();
    public final Map<String, FluidTaskConfig> c = new HashMap();
    public final List<ScheduleTask> d = new ArrayList();
    public final ux9 e;

    static {
        t2o.a(806355056);
    }

    public er9(Context context, ux9 ux9Var, fr9 fr9Var) {
        this.f18774a = fr9Var;
        this.e = ux9Var;
        f(fr9Var);
    }

    public static er9 d(Context context, ux9 ux9Var, fr9 fr9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (er9) ipChange.ipc$dispatch("8f0f1afd", new Object[]{context, ux9Var, fr9Var});
        }
        return new er9(context, ux9Var, fr9Var);
    }

    public final void a(ScheduleTask scheduleTask) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c6ed6f05", new Object[]{this, scheduleTask});
        } else {
            this.d.add(scheduleTask);
        }
    }

    public void b(ScheduleTask scheduleTask) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a76ce675", new Object[]{this, scheduleTask});
        } else if (scheduleTask != null) {
            j(scheduleTask);
            this.b.a(scheduleTask);
        }
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f79d9664", new Object[]{this});
        } else {
            this.b.b(this.d);
        }
    }

    public final List<FluidTaskConfig> e(String str) {
        Exception e;
        List<FluidTaskConfig> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("e176a0b8", new Object[]{this, str});
        }
        List<FluidTaskConfig> list2 = null;
        String K = hjr.K("fluid_task_config", null);
        if (K == null) {
            return null;
        }
        try {
            list = (List) JSON.parseObject(K).get(str);
        } catch (Exception e2) {
            e = e2;
        }
        try {
            o3s.b("FluidLauncher", "FluidLauncher 从远程获取任务配置: ".concat(K));
            return list;
        } catch (Exception e3) {
            e = e3;
            list2 = list;
            o3s.c("FluidLauncher", "FluidLauncher 从远程获取任务配置失败", e);
            return list2;
        }
    }

    public final void f(fr9 fr9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d03ec4d5", new Object[]{this, fr9Var});
            return;
        }
        h(fr9Var);
        i(fr9Var);
        g();
    }

    public final void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c4b6c6cf", new Object[]{this});
            return;
        }
        vy0 vy0Var = new vy0(this);
        ux9 ux9Var = this.e;
        if (ux9Var != null) {
            ux9Var.P(vy0Var);
        }
    }

    public final Map<String, FluidTaskConfig> h(fr9 fr9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("a6ab80e3", new Object[]{this, fr9Var});
        }
        List<FluidTaskConfig> e = e(fr9Var.d());
        if (e == null) {
            e = fr9Var.e().a();
            o3s.b("FluidLauncher", "FluidLauncher 从本地获取任务配置: " + e);
        }
        for (FluidTaskConfig fluidTaskConfig : e) {
            ((HashMap) this.c).put(fluidTaskConfig.f7913a, fluidTaskConfig);
        }
        return this.c;
    }

    public final void i(fr9 fr9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d0bd712", new Object[]{this, fr9Var});
        } else if (fr9Var.f() != null) {
            for (xr9 xr9Var : fr9Var.f().a()) {
                a(new ScheduleTask(fr9Var.d(), xr9Var, (FluidTaskConfig) ((HashMap) this.c).get(xr9Var.getTaskName())));
            }
        }
    }

    public final void j(ScheduleTask scheduleTask) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("40014a02", new Object[]{this, scheduleTask});
        } else {
            ((ArrayList) this.d).remove(scheduleTask);
        }
    }

    public void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b466fdd", new Object[]{this});
            return;
        }
        this.b.d();
        o3s.b("FluidLauncher", "FluidLauncher 关闭任务调度器");
    }

    public ScheduleTask l(ky0 ky0Var) {
        ScheduleTask scheduleTask;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ScheduleTask) ipChange.ipc$dispatch("587a7e6c", new Object[]{this, ky0Var});
        }
        if (ky0Var == null) {
            return null;
        }
        String taskName = ky0Var.getTaskName();
        if (TextUtils.isEmpty(taskName)) {
            return null;
        }
        FluidTaskConfig fluidTaskConfig = (FluidTaskConfig) ((HashMap) this.c).get(taskName);
        if (ky0Var.h() == null) {
            return null;
        }
        if (ky0Var.h().isQueue()) {
            scheduleTask = new ty0(this.f18774a.d(), ky0Var, fluidTaskConfig, this.b.c());
        } else {
            scheduleTask = new ScheduleTask(this.f18774a.d(), ky0Var, fluidTaskConfig);
        }
        a(scheduleTask);
        this.b.e(scheduleTask);
        return scheduleTask;
    }

    public void m(xr9 xr9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a50bead7", new Object[]{this, xr9Var});
        } else if (xr9Var != null) {
            String taskName = xr9Var.getTaskName();
            if (!TextUtils.isEmpty(taskName)) {
                ScheduleTask scheduleTask = new ScheduleTask(this.f18774a.d(), xr9Var, (FluidTaskConfig) ((HashMap) this.c).get(taskName));
                a(scheduleTask);
                this.b.e(scheduleTask);
            }
        }
    }

    public void n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("794c2b02", new Object[]{this});
        } else {
            this.b.f(this.d);
        }
    }
}
