package tb;

import android.os.Handler;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.PriorityQueue;
import java.util.concurrent.ExecutorService;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class t15 implements huo, Runnable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final int d = 200;

    /* renamed from: a  reason: collision with root package name */
    private final PriorityQueue<buo> f28402a = new PriorityQueue<>(200);
    private Handler b;
    private ExecutorService c;

    public t15(ExecutorService executorService) {
        this.c = executorService;
    }

    @Override // tb.huo
    public synchronized void a(buo buoVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("388bbf9d", new Object[]{this, buoVar});
            return;
        }
        this.f28402a.add(buoVar);
        Handler handler = this.b;
        if (handler != null) {
            handler.post(this);
        } else {
            ExecutorService executorService = this.c;
            if (executorService != null) {
                executorService.submit(buoVar);
            }
        }
    }

    @Override // tb.huo
    public int c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a2751476", new Object[]{this})).intValue();
        }
        return this.f28402a.size();
    }

    @Override // tb.huo
    public boolean f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("50b9f46f", new Object[]{this})).booleanValue();
        }
        return false;
    }

    @Override // tb.huo
    public String getStatus() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("71829d11", new Object[]{this});
        }
        return "CustomScheduler:\nqueue size:" + c();
    }

    @Override // java.lang.Runnable
    public void run() {
        buo poll;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
            return;
        }
        synchronized (this) {
            poll = this.f28402a.poll();
        }
        if (poll != null) {
            poll.run();
            run();
        }
    }

    public t15(Handler handler) {
        this.b = handler;
    }
}
