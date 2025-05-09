package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class uij implements ThreadFactory {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final AtomicInteger f29401a;
    public final int b;

    static {
        t2o.a(144703614);
    }

    public uij(String str, int i) {
        ckf.g(str, "prefix");
        this.b = i;
        this.f29401a = new AtomicInteger(0);
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Thread) ipChange.ipc$dispatch("d8079a58", new Object[]{this, runnable});
        }
        ckf.g(runnable, "r");
        Thread thread = new Thread(runnable);
        thread.setPriority(this.b);
        thread.setName("mega-pool-" + this.f29401a.incrementAndGet());
        return thread;
    }

    public /* synthetic */ uij(String str, int i, int i2, a07 a07Var) {
        this(str, (i2 & 2) != 0 ? 5 : i);
    }
}
