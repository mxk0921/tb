package com.taobao.android.fluid.launcher.task;

import android.os.SystemClock;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import tb.fzd;
import tb.o3s;
import tb.t2o;
import tb.xr9;
import tb.yr9;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class ScheduleTask implements fzd, Runnable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "ScheduleTask";
    public static final String TASK_STATE_CANCEL = "cancel";
    public static final String TASK_STATE_COMPLETE = "complete";
    public static final String TASK_STATE_ERROR = "error";
    public static final String TASK_STATE_INIT = "init";
    public static final String TASK_STATE_START = "start";
    public static final String TASK_STATE_SUBMIT = "submit";
    private static final long g = 0;

    /* renamed from: a  reason: collision with root package name */
    private final String f7914a;
    private final xr9 b;
    private final FluidTaskConfig c;
    private final String e;
    private String d = "init";
    private long f = -1;

    /* compiled from: Taobao */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public @interface TaskState {
    }

    static {
        t2o.a(806355093);
        t2o.a(806355091);
    }

    public ScheduleTask(String str, xr9 xr9Var, FluidTaskConfig fluidTaskConfig) {
        this.f7914a = str;
        this.b = xr9Var;
        this.c = fluidTaskConfig;
        this.e = xr9Var.getTaskName() + "@" + hashCode();
    }

    @Override // tb.fzd
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9425d337", new Object[]{this});
        } else {
            this.b.a();
        }
    }

    public String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("42bddf1", new Object[]{this});
        }
        return this.f7914a;
    }

    public long c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5dc5322b", new Object[]{this})).longValue();
        }
        return this.f;
    }

    public long d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ee424fb5", new Object[]{this})).longValue();
        }
        FluidTaskConfig fluidTaskConfig = this.c;
        if (fluidTaskConfig == null) {
            return 0L;
        }
        return fluidTaskConfig.b;
    }

    public xr9 e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xr9) ipChange.ipc$dispatch("e9e85b69", new Object[]{this});
        }
        return this.b;
    }

    public FluidTaskConfig f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FluidTaskConfig) ipChange.ipc$dispatch("8e42abe3", new Object[]{this});
        }
        return this.c;
    }

    public String g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f8f3f435", new Object[]{this});
        }
        return this.b.b();
    }

    @Override // tb.fzd
    public String getTaskName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d0a42b93", new Object[]{this});
        }
        return this.b.getTaskName();
    }

    public String h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("54ada043", new Object[]{this});
        }
        return this.e;
    }

    public String i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3d7e0563", new Object[]{this});
        }
        return this.d;
    }

    public String j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bb92b816", new Object[]{this});
        }
        FluidTaskConfig fluidTaskConfig = this.c;
        if (fluidTaskConfig == null) {
            return "main";
        }
        return fluidTaskConfig.c;
    }

    public void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("379d4540", new Object[]{this});
            return;
        }
        this.b.c();
        this.d = "cancel";
    }

    public void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cbffcbf", new Object[]{this});
            return;
        }
        this.b.d();
        this.d = "complete";
        yr9.c(this);
    }

    public void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("11bc4f70", new Object[]{this});
            return;
        }
        this.b.e();
        this.d = "error";
        yr9.c(this);
    }

    public void n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
            return;
        }
        this.b.f();
        this.d = "start";
    }

    public void o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b4157de", new Object[]{this});
            return;
        }
        this.b.g();
        this.d = "submit";
    }

    @Override // java.lang.Runnable
    public void run() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
            return;
        }
        o3s.b(TAG, "任务执行开始：" + this.e);
        n();
        try {
            long uptimeMillis = SystemClock.uptimeMillis();
            a();
            this.f = SystemClock.uptimeMillis() - uptimeMillis;
            l();
            o3s.b(TAG, "任务执行结束：" + this.e);
        } catch (Exception e) {
            m();
            o3s.c(TAG, " 任务执行异常：" + this.e, e);
        }
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "[ " + this.e + " | " + j() + " | " + d() + " | " + this.d + " | " + this.f + " ]";
    }
}
