package tb;

import android.os.Handler;
import android.os.Looper;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class o7p {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static volatile o7p d;

    /* renamed from: a  reason: collision with root package name */
    public final AtomicBoolean f25191a = new AtomicBoolean(false);
    public final ConcurrentLinkedQueue<Runnable> b = new ConcurrentLinkedQueue<>();
    public final Handler c = new Handler(Looper.getMainLooper());

    static {
        t2o.a(729809801);
    }

    public static o7p a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (o7p) ipChange.ipc$dispatch("5b4ffe98", new Object[0]);
        }
        if (d == null) {
            synchronized (o7p.class) {
                try {
                    if (d == null) {
                        d = new o7p();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return d;
    }

    public final boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4b7d932a", new Object[]{this})).booleanValue();
        }
        return vxl.b().p();
    }

    public boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bbebfa16", new Object[]{this})).booleanValue();
        }
        if (!b() || this.f25191a.get()) {
            return false;
        }
        return true;
    }

    public void e(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f44b6a68", new Object[]{this, runnable});
        } else if (c()) {
            this.b.offer(runnable);
        } else {
            this.c.postAtFrontOfQueue(runnable);
        }
    }

    public void f(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3f14d14c", new Object[]{this, runnable});
            return;
        }
        if (!this.b.isEmpty()) {
            this.b.remove(runnable);
        }
        this.c.removeCallbacks(runnable);
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68bd0af", new Object[]{this});
            return;
        }
        bqa.d("SecondRefreshTaskExecutor", "onSecondRefresh");
        this.f25191a.set(true);
        while (!this.b.isEmpty()) {
            Runnable poll = this.b.poll();
            if (poll != null) {
                bqa.d("SecondRefreshTaskExecutor", "runTasks, task: " + poll);
                this.c.postAtFrontOfQueue(poll);
            }
        }
    }
}
