package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.virtual_thread.VirtualExecutors;
import com.taobao.android.virtual_thread.VirtualThread;
import java.util.concurrent.ThreadFactory;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class m1w implements yct {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final j1r f23727a;
    public final yiw b;

    static {
        t2o.a(970981411);
        t2o.a(970981409);
    }

    public m1w(j1r j1rVar, yiw yiwVar) {
        this.f23727a = j1rVar;
        this.b = yiwVar;
    }

    public static /* synthetic */ Thread b(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Thread) ipChange.ipc$dispatch("9265913e", new Object[]{runnable});
        }
        return new VirtualThread(runnable, "lottie");
    }

    @Override // tb.yct
    public void execute() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e48bb97c", new Object[]{this});
        } else if (this.f23727a.c("useLottieVirtualThread", this.b.a())) {
            dmh.e = VirtualExecutors.newCachedVirtualThreadPool(new ThreadFactory() { // from class: tb.l1w
                @Override // java.util.concurrent.ThreadFactory
                public final Thread newThread(Runnable runnable) {
                    Thread b;
                    b = m1w.b(runnable);
                    return b;
                }
            });
            ghh.a("MonitorTask", "succ");
        } else {
            ghh.a("MonitorTask", "failed");
        }
    }
}
