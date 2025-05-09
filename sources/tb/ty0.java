package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.launcher.task.FluidTaskConfig;
import com.taobao.android.fluid.launcher.task.ScheduleTask;
import tb.xvg;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class ty0 extends ScheduleTask {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final uy0 h;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements xvg.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // tb.xvg.a
        public void a(xvg xvgVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c223d18e", new Object[]{this, xvgVar});
                return;
            }
            ty0.this.l();
            o3s.b(ScheduleTask.TAG, "动画任务执行结束：" + ty0.this.h());
            ty0.p(ty0.this).e(ty0.this);
            ty0.p(ty0.this).f();
        }

        @Override // tb.xvg.a
        public void b(xvg xvgVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3f1b83e7", new Object[]{this, xvgVar});
            }
        }

        @Override // tb.xvg.a
        public void c(xvg xvgVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4c3c3fd3", new Object[]{this, xvgVar});
            }
        }

        @Override // tb.xvg.a
        public void d(xvg xvgVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6c294424", new Object[]{this, xvgVar});
            }
        }

        @Override // tb.xvg.a
        public void e(xvg xvgVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("dfb09f52", new Object[]{this, xvgVar});
            }
        }
    }

    static {
        t2o.a(806355064);
    }

    public ty0(String str, ky0 ky0Var, FluidTaskConfig fluidTaskConfig, uy0 uy0Var) {
        super(str, ky0Var, fluidTaskConfig);
        this.h = uy0Var;
    }

    public static /* synthetic */ Object ipc$super(ty0 ty0Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/fluid/launcher/animation/AnimationScheduleTask");
    }

    public static /* synthetic */ uy0 p(ty0 ty0Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (uy0) ipChange.ipc$dispatch("43d5cf9c", new Object[]{ty0Var});
        }
        return ty0Var.h;
    }

    @Override // com.taobao.android.fluid.launcher.task.ScheduleTask, java.lang.Runnable
    public void run() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
            return;
        }
        o3s.b(ScheduleTask.TAG, "动画任务执行开始：" + h());
        n();
        try {
            if (e() instanceof ky0) {
                ((ky0) e()).h().addAnimationListener(new a());
                a();
            }
        } catch (Exception e) {
            m();
            o3s.c(ScheduleTask.TAG, "动画任务执行异常：" + h(), e);
            this.h.f();
        }
    }
}
