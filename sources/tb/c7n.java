package tb;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.Choreographer;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.launcher.bootstrap.tao.ability.qos.QoSHandler;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class c7n implements QoSHandler, Handler.Callback, Choreographer.FrameCallback {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Handler f16902a;
    public boolean e = false;
    public boolean f = false;
    public final Queue<Message> b = new LinkedBlockingQueue();
    public final Queue<Message> c = new LinkedBlockingQueue();
    public boolean d = !t.a(null, "ngQoSDynamicPriority");

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f16903a;
        public final /* synthetic */ Runnable b;

        public a(int i, Runnable runnable) {
            this.f16903a = i;
            this.b = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                c7n.b(c7n.this, this.f16903a, this.b);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (c7n.c(c7n.this)) {
                whh.a("QoSHandler", "skipped due to pending queue has been already scheduled in time");
            } else {
                c7n.f(c7n.d(c7n.this), c7n.e(c7n.this));
                c7n.g(c7n.this, "PENDING_TRANSFER_TO_TASK_QUEUE");
            }
        }
    }

    public c7n(Looper looper) {
        this.f16902a = new Handler(looper, this);
    }

    public static /* synthetic */ void b(c7n c7nVar, int i, Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a8de139", new Object[]{c7nVar, new Integer(i), runnable});
        } else {
            c7nVar.m(i, runnable);
        }
    }

    public static /* synthetic */ boolean c(c7n c7nVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5f34c84d", new Object[]{c7nVar})).booleanValue();
        }
        return c7nVar.d;
    }

    public static /* synthetic */ Queue d(c7n c7nVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Queue) ipChange.ipc$dispatch("ec1fea6a", new Object[]{c7nVar});
        }
        return c7nVar.c;
    }

    public static /* synthetic */ Queue e(c7n c7nVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Queue) ipChange.ipc$dispatch("d1cb46eb", new Object[]{c7nVar});
        }
        return c7nVar.b;
    }

    public static /* synthetic */ void f(Queue queue, Queue queue2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2cca3bb", new Object[]{queue, queue2});
        } else {
            q(queue, queue2);
        }
    }

    public static /* synthetic */ void g(c7n c7nVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6006d2d7", new Object[]{c7nVar, str});
        } else {
            c7nVar.i(str);
        }
    }

    public static <T> void q(Queue<T> queue, Queue<T> queue2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a62ec02d", new Object[]{queue, queue2});
            return;
        }
        T poll = queue.poll();
        while (poll != null) {
            queue2.offer(poll);
            poll = queue.poll();
        }
    }

    @Override // com.taobao.android.launcher.bootstrap.tao.ability.qos.QoSHandler
    public boolean a(int i, Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("69c77f3e", new Object[]{this, new Integer(i), runnable})).booleanValue();
        }
        whh.a("QoSHandler", "enqueue task");
        return this.f16902a.post(new a(i, runnable));
    }

    @Override // android.view.Choreographer.FrameCallback
    public void doFrame(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f46aacbb", new Object[]{this, new Long(j)});
            return;
        }
        whh.a("QoSHandler", "doFrame callback received");
        i("DO_FRAME");
    }

    public final int h(Runnable runnable) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d6eaf47d", new Object[]{this, runnable})).intValue();
        }
        if ((runnable instanceof g7n) && (i = ((g7n) runnable).f19775a) >= 0) {
            return i;
        }
        return 0;
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("282a8c1d", new Object[]{this, message})).booleanValue();
        }
        if (message.what != 100) {
            return false;
        }
        int i = message.arg2;
        if (i == 1) {
            whh.a("QoSHandler", "handleMessage(POST), run the task");
            n(message);
            i("POST");
            return true;
        } else if (i != 0) {
            return false;
        } else {
            whh.a("QoSHandler", "handleMessage(DO_FRAME), post frame");
            Choreographer.getInstance().postFrameCallback(this);
            return true;
        }
    }

    public final void j(int i, Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7784fa8e", new Object[]{this, new Integer(i), runnable});
            return;
        }
        int h = h(runnable);
        whh.a("QoSHandler", "genTaskChain with param { frameCount=" + h + " }");
        for (int i2 = 0; i2 < h; i2++) {
            ((LinkedBlockingQueue) this.b).offer(l(i, 0, null));
        }
    }

    public final boolean k(int i, Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2c11854f", new Object[]{this, new Integer(i), runnable})).booleanValue();
        }
        Message l = l(i, 1, runnable);
        if (i == 2) {
            if (!this.d) {
                this.d = true;
            }
            ((LinkedBlockingQueue) this.b).offer(l);
            j(i, runnable);
            q(this.c, this.b);
            return true;
        } else if (this.d) {
            ((LinkedBlockingQueue) this.b).offer(l);
            return true;
        } else {
            ((LinkedBlockingQueue) this.c).offer(l);
            return false;
        }
    }

    public final Message l(int i, int i2, Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Message) ipChange.ipc$dispatch("aa538502", new Object[]{this, new Integer(i), new Integer(i2), runnable});
        }
        if (runnable != null) {
            return Message.obtain(this.f16902a, 100, i, i2, new f7n(i, i2, runnable));
        }
        return Message.obtain(this.f16902a, 100, i, i2);
    }

    public final void m(int i, Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c08bf6fd", new Object[]{this, new Integer(i), runnable});
        } else if (k(i, runnable)) {
            o();
            this.f = true;
        } else {
            p();
        }
    }

    public final void n(Message message) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("229f49bd", new Object[]{this, message});
            return;
        }
        Object obj = message.obj;
        if (obj instanceof f7n) {
            f7n f7nVar = (f7n) obj;
            w35.a("QoSHandler#runTask");
            try {
                f7nVar.run();
            } finally {
                try {
                    throw th;
                } finally {
                }
            }
        }
    }

    public boolean o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4532f3a2", new Object[]{this})).booleanValue();
        }
        if (this.f) {
            return false;
        }
        i("SCHEDULE");
        return true;
    }

    public final void p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6435e5f8", new Object[]{this});
        } else if (!this.e) {
            this.e = true;
            whh.a("QoSHandler", "schedule the pending tasks are executed in future");
            this.f16902a.postDelayed(new b(), 300L);
        }
    }

    public final void i(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("779c0553", new Object[]{this, str});
            return;
        }
        Message message = (Message) ((LinkedBlockingQueue) this.b).poll();
        if (message == null) {
            whh.a("QoSHandler", "schedule(reason=" + str + ") finished, no task in queue");
            this.f = false;
            return;
        }
        whh.a("QoSHandler", "poll(what=" + message.what + ",level=" + message.arg1 + ",type=" + message.arg2 + ",reason=" + str + f7l.BRACKET_END_STR);
        if (message.arg1 == 1) {
            this.f16902a.sendMessageAtFrontOfQueue(message);
        } else {
            message.sendToTarget();
        }
    }
}
