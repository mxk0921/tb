package tb;

import android.os.Handler;
import android.os.Looper;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.PriorityQueue;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class g6v implements huo, Runnable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final int f = 200;
    private static final int g = 10;
    private static final int h = 8;

    /* renamed from: a  reason: collision with root package name */
    private final PriorityQueue<buo> f19762a = new PriorityQueue<>(200);
    private final Handler b = new Handler(Looper.getMainLooper());
    private boolean c;
    private int d;
    private long e;

    @Override // tb.huo
    public synchronized void a(buo buoVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("388bbf9d", new Object[]{this, buoVar});
            return;
        }
        this.f19762a.add(buoVar);
        if (!this.c && !this.f19762a.isEmpty()) {
            this.c = true;
            this.b.post(this);
        }
    }

    @Override // tb.huo
    public int c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a2751476", new Object[]{this})).intValue();
        }
        return this.f19762a.size();
    }

    @Override // tb.huo
    public boolean f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("50b9f46f", new Object[]{this})).booleanValue();
        }
        return true;
    }

    @Override // tb.huo
    public String getStatus() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("71829d11", new Object[]{this});
        }
        return "ui thread scheduler status:\nqueue size:" + c() + "\nexecuting:" + this.c;
    }

    @Override // java.lang.Runnable
    public void run() {
        buo poll;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
            return;
        }
        int i = this.d + 1;
        this.d = i;
        if (i > 10 || this.e > 8) {
            this.d = 0;
            this.e = 0L;
            synchronized (this) {
                try {
                    if (this.f19762a.size() > 0) {
                        this.b.post(this);
                    } else {
                        this.c = false;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return;
        }
        synchronized (this) {
            poll = this.f19762a.poll();
        }
        if (poll != null) {
            long currentTimeMillis = System.currentTimeMillis();
            poll.run();
            this.e += System.currentTimeMillis() - currentTimeMillis;
            run();
            return;
        }
        synchronized (this) {
            this.c = false;
        }
    }
}
