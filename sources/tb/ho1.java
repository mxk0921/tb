package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.launcher.task.ScheduleTask;
import com.taobao.android.virtual_thread.face.VExecutors;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public final class ho1 implements pzd {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final Map<String, Future<?>> b = new ConcurrentHashMap();

    /* renamed from: a  reason: collision with root package name */
    public final ScheduledExecutorService f20775a = VExecutors.newScheduledThreadPool(1, new a(this));

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements qqt {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a(ho1 ho1Var) {
        }

        @Override // tb.qqt
        public String newThreadName() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("57dab4a4", new Object[]{this});
            }
            return "FluidBackgroundScheduler";
        }
    }

    static {
        t2o.a(806355081);
        t2o.a(806355084);
    }

    @Override // tb.pzd
    public void a(ScheduleTask scheduleTask) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f94d77cc", new Object[]{this, scheduleTask});
            return;
        }
        Future future = (Future) ((ConcurrentHashMap) this.b).remove(scheduleTask.h());
        if (future != null) {
            future.cancel(true);
        }
    }

    @Override // tb.pzd
    public void b(ScheduleTask scheduleTask) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc1deaee", new Object[]{this, scheduleTask});
            return;
        }
        ((ConcurrentHashMap) this.b).put(scheduleTask.h(), this.f20775a.schedule(scheduleTask, scheduleTask.d(), TimeUnit.MILLISECONDS));
    }

    @Override // tb.pzd
    public void shutdown() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b466fdd", new Object[]{this});
        } else {
            this.f20775a.shutdownNow();
        }
    }
}
