package tb;

import android.os.Handler;
import android.os.Looper;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.launcher.task.FluidTaskConfig;
import com.taobao.android.fluid.launcher.task.ScheduleTask;
import java.util.Comparator;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class uy0 implements pzd {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final PriorityBlockingQueue<ScheduleTask> f29665a = new PriorityBlockingQueue<>(11, new a());
    public final AtomicBoolean b = new AtomicBoolean(true);
    public final Handler c = new Handler(Looper.getMainLooper());
    public ScheduleTask d;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements Comparator<ScheduleTask> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        /* renamed from: a */
        public int compare(ScheduleTask scheduleTask, ScheduleTask scheduleTask2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("16723b1f", new Object[]{this, scheduleTask, scheduleTask2})).intValue();
            }
            return Integer.compare(uy0.c(uy0.this, scheduleTask), uy0.c(uy0.this, scheduleTask2));
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ScheduleTask f29667a;

        public b(ScheduleTask scheduleTask) {
            this.f29667a = scheduleTask;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                this.f29667a.run();
            }
        }
    }

    static {
        t2o.a(806355078);
        t2o.a(806355084);
    }

    public static /* synthetic */ int c(uy0 uy0Var, ScheduleTask scheduleTask) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7d9f89c", new Object[]{uy0Var, scheduleTask})).intValue();
        }
        return uy0Var.d(scheduleTask);
    }

    @Override // tb.pzd
    public void a(ScheduleTask scheduleTask) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f94d77cc", new Object[]{this, scheduleTask});
        } else if (this.f29665a.remove(scheduleTask)) {
            scheduleTask.k();
        }
    }

    @Override // tb.pzd
    public void b(ScheduleTask scheduleTask) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc1deaee", new Object[]{this, scheduleTask});
        } else if (!(scheduleTask instanceof ty0)) {
            eir.a("TAG_ANIMATION_TASK", "AnimationTaskScheduler only receive AnimationScheduleTask");
        } else {
            eir.a("AnimationTaskScheduler", "submitTask " + scheduleTask.getTaskName());
            scheduleTask.o();
            this.f29665a.offer(new ty0(scheduleTask.b(), (ky0) scheduleTask.e(), scheduleTask.f(), this));
            f();
        }
    }

    public final int d(ScheduleTask scheduleTask) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c775461f", new Object[]{this, scheduleTask})).intValue();
        }
        FluidTaskConfig f = scheduleTask.f();
        if (f != null) {
            return f.a();
        }
        return 0;
    }

    public void e(ScheduleTask scheduleTask) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("96737c8c", new Object[]{this, scheduleTask});
        } else if (scheduleTask != null) {
            eir.a("AnimationTaskScheduler", "notifyCurRunningAnimationEnd " + scheduleTask.getTaskName());
            if (this.d == scheduleTask) {
                this.d = null;
            }
        }
    }

    public void f() {
        ScheduleTask poll;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e4c0cdb1", new Object[]{this});
            return;
        }
        eir.a("AnimationTaskScheduler", "scheduleNext isRunning = " + this.b + " mCurRunningTask = " + this.d);
        if (this.b.get() && this.d == null && !this.f29665a.isEmpty() && (poll = this.f29665a.poll()) != null) {
            this.d = poll;
            this.c.post(new b(poll));
        }
    }

    @Override // tb.pzd
    public void shutdown() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b466fdd", new Object[]{this});
        } else {
            this.b.set(false);
        }
    }
}
