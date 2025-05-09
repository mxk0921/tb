package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.appbundle.scheduler.Priority;
import com.taobao.appbundle.scheduler.internal.ScheduledRunnable;
import java.util.concurrent.Future;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.TimeUnit;
import tb.guo;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class fxm extends guo.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final kd4 f19612a = new kd4();
    public final PriorityBlockingQueue<ljf> b;
    public final Priority c;
    public final int d;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a implements Future<Object> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ljf f19613a;

        public a(ljf ljfVar) {
            this.f19613a = ljfVar;
        }

        @Override // java.util.concurrent.Future
        public boolean cancel(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("9f7d8cf7", new Object[]{this, new Boolean(z)})).booleanValue();
            }
            return fxm.b(fxm.this).remove(this.f19613a);
        }

        @Override // java.util.concurrent.Future
        public Object get() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ipChange.ipc$dispatch("6352d3f5", new Object[]{this});
            }
            return null;
        }

        @Override // java.util.concurrent.Future
        public boolean isCancelled() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("6ff5f452", new Object[]{this})).booleanValue();
            }
            return fxm.b(fxm.this).contains(this.f19613a);
        }

        @Override // java.util.concurrent.Future
        public boolean isDone() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("15dabe57", new Object[]{this})).booleanValue();
            }
            return false;
        }

        @Override // java.util.concurrent.Future
        public Object get(long j, TimeUnit timeUnit) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ipChange.ipc$dispatch("122d0181", new Object[]{this, new Long(j), timeUnit});
            }
            return null;
        }
    }

    static {
        t2o.a(377487429);
    }

    public fxm(PriorityBlockingQueue<ljf> priorityBlockingQueue, Priority priority, int i) {
        this.b = priorityBlockingQueue;
        this.c = priority;
        this.d = i;
    }

    public static /* synthetic */ PriorityBlockingQueue b(fxm fxmVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PriorityBlockingQueue) ipChange.ipc$dispatch("2f099dd1", new Object[]{fxmVar});
        }
        return fxmVar.b;
    }

    public static /* synthetic */ Object ipc$super(fxm fxmVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/appbundle/scheduler/internal/PrioritySchedulerWorker");
    }

    @Override // tb.guo.a
    public pr7 a(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (pr7) ipChange.ipc$dispatch("40a97fca", new Object[]{this, runnable});
        }
        return c(runnable, 0L, TimeUnit.MILLISECONDS);
    }

    public pr7 c(Runnable runnable, long j, TimeUnit timeUnit) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (pr7) ipChange.ipc$dispatch("85f38656", new Object[]{this, runnable, new Long(j), timeUnit});
        }
        ljf ljfVar = new ljf(runnable, this.c, this.d);
        ScheduledRunnable scheduledRunnable = new ScheduledRunnable(ljfVar, this.f19612a);
        scheduledRunnable.setFuture(new a(ljfVar));
        this.f19612a.b(scheduledRunnable);
        this.b.offer(ljfVar, j, timeUnit);
        return scheduledRunnable;
    }

    @Override // tb.pr7
    public void dispose() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("226c8326", new Object[]{this});
        } else {
            this.f19612a.dispose();
        }
    }
}
