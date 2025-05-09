package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.RunnableScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class ndq extends auo<RunnableScheduledFuture<?>> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final ScheduledThreadPoolExecutor f24663a = new ScheduledThreadPoolExecutor(1, sdq.INSTANCE);

    static {
        t2o.a(676331602);
    }

    public static /* synthetic */ Object ipc$super(ndq ndqVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/split/executor/SplitScheduleTaskExecutor");
    }

    public RunnableScheduledFuture<?> a(Runnable runnable, long j, TimeUnit timeUnit) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RunnableScheduledFuture) ipChange.ipc$dispatch("711da958", new Object[]{this, runnable, new Long(j), timeUnit});
        }
        return (RunnableScheduledFuture) this.f24663a.schedule(runnable, j, timeUnit);
    }
}
