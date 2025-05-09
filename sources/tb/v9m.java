package tb;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.os.SystemClock;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.launcher.bootstrap.tao.ability.dispatch.Dispatchers;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class v9m implements xq7, Runnable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String i = "PollingDispatcher";

    /* renamed from: a  reason: collision with root package name */
    private final String f29870a;
    private final Message e;
    private boolean f = false;
    private boolean g = false;
    private long h = 0;
    private final Handler d = f();
    private final Queue<rij> b = new LinkedBlockingQueue();
    private final Queue<Message> c = new LinkedBlockingQueue();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Message f29871a;

        public a(Message message) {
            this.f29871a = message;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            whh.a(v9m.i, "handle(what=" + this.f29871a.what + f7l.BRACKET_END_STR);
            if (this.f29871a == v9m.d(v9m.this)) {
                Dispatchers.a("HeadMsgDispatched", "true");
            }
            Dispatchers.g(v9m.i, v9m.this, this.f29871a);
            v9m.e(v9m.this);
        }
    }

    public v9m(Message message, String str) {
        this.f29870a = str;
        this.e = Message.obtain(message);
        g();
        Dispatchers.a("Impl", i);
        Dispatchers.a("Enabled", "true");
    }

    public static /* synthetic */ Message d(v9m v9mVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Message) ipChange.ipc$dispatch("b011a647", new Object[]{v9mVar});
        }
        return v9mVar.e;
    }

    public static /* synthetic */ void e(v9m v9mVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a37b523", new Object[]{v9mVar});
        } else {
            v9mVar.h();
        }
    }

    private Handler f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Handler) ipChange.ipc$dispatch("534f1f3c", new Object[]{this});
        }
        HandlerThread handlerThread = new HandlerThread("NGActivityThread");
        handlerThread.start();
        return new Handler(handlerThread.getLooper());
    }

    private void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d22c77d1", new Object[]{this});
            return;
        }
        whh.a(i, "enqueue(what=" + this.e.what + f7l.BRACKET_END_STR);
        this.c.offer(this.e);
    }

    @Override // tb.xq7
    public boolean a(rij rijVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcfe75cf", new Object[]{this, rijVar})).booleanValue();
        }
        return this.b.offer(rijVar);
    }

    @Override // tb.xq7
    public boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b183fc05", new Object[]{this})).booleanValue();
        }
        if (this.f) {
            return false;
        }
        this.h = SystemClock.uptimeMillis();
        this.f = true;
        this.d.post(this);
        return true;
    }

    @Override // tb.xq7
    public boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("aafb874c", new Object[]{this})).booleanValue();
        }
        return true;
    }

    @Override // tb.xq7
    public String getType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("13e5e549", new Object[]{this});
        }
        return this.f29870a;
    }

    @Override // tb.xq7
    public boolean handleMessage(Message message) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("282a8c1d", new Object[]{this, message})).booleanValue();
        }
        if (this.g) {
            whh.a(i, "handleMessage, dispatched=true");
            Dispatchers.g(i, this, message);
            return true;
        }
        Message obtain = Message.obtain(message);
        boolean offer = this.c.offer(obtain);
        int size = this.c.size();
        whh.a(i, "enqueue(what=" + obtain.what + ",res=" + offer + ",size=" + size + f7l.BRACKET_END_STR);
        Dispatchers.a("QueueSize", String.valueOf(size));
        return offer;
    }

    @Override // java.lang.Runnable
    public void run() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
            return;
        }
        rij poll = this.b.poll();
        if (poll != null) {
            Dispatchers.a("Staging", this.f29870a + f7l.BRACKET_START_STR + poll.getName() + f7l.BRACKET_END_STR);
            StringBuilder sb = new StringBuilder("run#");
            sb.append(poll.getName());
            whh.a(i, sb.toString());
            poll.run();
            this.d.post(this);
            return;
        }
        Dispatchers.a("Staging", this.f29870a + f7l.BRACKET_START_STR + this.e.what + f7l.BRACKET_END_STR);
        long uptimeMillis = SystemClock.uptimeMillis();
        whh.a(i, "run#" + this.f29870a + "(what=" + this.e.what + ") started, cost before=" + (uptimeMillis - this.h) + "ms");
        Dispatchers.a("DispatchingTime", String.valueOf(uptimeMillis));
        try {
            h();
            long uptimeMillis2 = SystemClock.uptimeMillis();
            long j = uptimeMillis2 - this.h;
            whh.a(i, "run#" + this.f29870a + "(what=" + this.e.what + ") finished, cost total=" + j + "ms");
            Dispatchers.a("Staging", this.f29870a + f7l.BRACKET_START_STR + this.e.what + ") finished in " + j + "ms");
            Dispatchers.a("DispatchedTime", String.valueOf(uptimeMillis2));
        } catch (Throwable th) {
            whh.b(i, "run#" + this.f29870a + "(what=" + this.e.what + ") failed: ", th);
            throw th;
        }
    }

    private void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("573f89f7", new Object[]{this});
            return;
        }
        Message poll = this.c.poll();
        if (poll == null) {
            whh.a(i, "message queue is empty now, dispatched=true");
            this.g = true;
            return;
        }
        whh.a(i, "dequeue(what=" + poll.what + f7l.BRACKET_END_STR);
        poll.getTarget().post(new a(poll));
    }
}
