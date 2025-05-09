package tb;

import android.os.Handler;
import android.os.Looper;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.PriorityQueue;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class h6v implements huo, Runnable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final int f = 8;
    private static final long g = System.currentTimeMillis();
    private static final int h = 200;
    private static final long i = 4000;

    /* renamed from: a  reason: collision with root package name */
    private final PriorityQueue<buo> f20448a = new PriorityQueue<>(200);
    private final Handler b = new Handler(Looper.getMainLooper());
    private boolean c;
    private int d;
    private long e;

    private boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("87a294c4", new Object[]{this})).booleanValue();
        }
        if (eko.c()) {
            return eko.d();
        }
        if (!eko.d() || System.currentTimeMillis() - g >= 4000) {
            return false;
        }
        return true;
    }

    private boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a6aa3d9a", new Object[]{this})).booleanValue();
        }
        return eko.f();
    }

    private void g(buo buoVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44b375f2", new Object[]{this, buoVar});
            return;
        }
        if (b()) {
            this.b.postAtFrontOfQueue(buoVar);
        } else {
            this.b.post(buoVar);
        }
        if (!this.f20448a.isEmpty() && !this.c) {
            if (b()) {
                this.b.postAtFrontOfQueue(this);
            } else {
                this.b.post(this);
            }
        }
    }

    @Override // tb.huo
    public synchronized void a(buo buoVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("388bbf9d", new Object[]{this, buoVar});
        } else if (eko.n()) {
            g(buoVar);
        } else {
            this.f20448a.add(buoVar);
            if (!this.c && !this.f20448a.isEmpty()) {
                this.c = true;
                if (b()) {
                    this.b.postAtFrontOfQueue(this);
                } else {
                    this.b.post(this);
                }
            }
        }
    }

    @Override // tb.huo
    public int c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a2751476", new Object[]{this})).intValue();
        }
        return this.f20448a.size();
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
        int i2;
        buo poll;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
            return;
        }
        if (d()) {
            i2 = eko.b();
        } else {
            i2 = 10;
        }
        int i3 = this.d + 1;
        this.d = i3;
        if (i3 > i2 || this.e > 8) {
            this.d = 0;
            this.e = 0L;
            synchronized (this) {
                try {
                    if (this.f20448a.size() <= 0) {
                        this.c = false;
                    } else if (b()) {
                        this.b.postAtFrontOfQueue(this);
                    } else {
                        this.b.post(this);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return;
        }
        synchronized (this) {
            poll = this.f20448a.poll();
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
