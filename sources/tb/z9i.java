package tb;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Comparator;
import java.util.Observable;
import java.util.Observer;
import java.util.PriorityQueue;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public final class z9i {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final int g = eag.y();
    public static final z9i h = new z9i();

    /* renamed from: a  reason: collision with root package name */
    public volatile boolean f32628a;
    public HandlerThread b;
    public Handler c;
    public int d = 0;
    public final PriorityQueue<va> e = new PriorityQueue<>(1000, new a(this));
    public final Observer f = new c();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements Comparator<va> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a(z9i z9iVar) {
        }

        /* renamed from: a */
        public int compare(va vaVar, va vaVar2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("5b0eebb7", new Object[]{this, vaVar, vaVar2})).intValue();
            }
            if (vaVar == null || vaVar2 == null) {
                return 0;
            }
            return vaVar2.i() - vaVar.i();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class b extends Handler {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b(Looper looper) {
            super(looper);
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            if (str.hashCode() == 673877017) {
                super.handleMessage((Message) objArr[0]);
                return null;
            }
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/litecreator/preload/MaterialTaskScheduler$2");
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("282a8c19", new Object[]{this, message});
                return;
            }
            super.handleMessage(message);
            z9i.a(z9i.this, message);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class c implements Observer {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // java.util.Observer
        public void update(Observable observable, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9292f698", new Object[]{this, observable, obj});
            } else {
                z9i.b(z9i.this, (va) observable, ((Integer) obj).intValue());
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class d implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ va f32631a;

        public d(va vaVar) {
            this.f32631a = vaVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                z9i.c(z9i.this, this.f32631a);
            }
        }
    }

    static {
        t2o.a(511705312);
    }

    public static /* synthetic */ void a(z9i z9iVar, Message message) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("37d21b34", new Object[]{z9iVar, message});
        } else {
            z9iVar.j(message);
        }
    }

    public static /* synthetic */ void b(z9i z9iVar, va vaVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("221fd675", new Object[]{z9iVar, vaVar, new Integer(i)});
        } else {
            z9iVar.l(vaVar, i);
        }
    }

    public static /* synthetic */ void c(z9i z9iVar, va vaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e93cab0f", new Object[]{z9iVar, vaVar});
        } else {
            z9iVar.h(vaVar);
        }
    }

    public static /* synthetic */ void d(z9i z9iVar, va vaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2ebefd0", new Object[]{z9iVar, vaVar});
        } else {
            z9iVar.e(vaVar);
        }
    }

    public static z9i i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (z9i) ipChange.ipc$dispatch("34a15dae", new Object[0]);
        }
        return h;
    }

    public void f(va vaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("709bb299", new Object[]{this, vaVar});
        } else {
            g(vaVar, true);
        }
    }

    public final boolean k(va vaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f9840860", new Object[]{this, vaVar})).booleanValue();
        }
        if (vaVar.i() > 1) {
            if (this.d >= g + 1) {
                return true;
            }
            return false;
        } else if (this.d >= g) {
            return true;
        } else {
            return false;
        }
    }

    public final void l(va vaVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc15a0c9", new Object[]{this, vaVar, new Integer(i)});
        } else if (this.c != null) {
            Message obtain = Message.obtain();
            if (i == 2) {
                obtain.what = 2;
            } else if (i == 3) {
                obtain.what = 3;
            }
            obtain.obj = vaVar;
            this.c.sendMessage(obtain);
            this.c.sendEmptyMessage(4);
        }
    }

    public void n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("810347e9", new Object[]{this});
        } else {
            o();
        }
    }

    public void p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6623bb89", new Object[]{this});
        } else {
            q();
        }
    }

    public final void e(va vaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("58c2f443", new Object[]{this, vaVar});
        } else if (!this.f32628a || this.c == null) {
            odg.c("MaterialTaskScheduler", "scheduler has't started yet.");
        } else {
            Message obtain = Message.obtain();
            obtain.what = 5;
            obtain.obj = vaVar;
            this.c.sendMessage(obtain);
        }
    }

    public void g(va vaVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a2db535b", new Object[]{this, vaVar, new Boolean(z)});
        } else if (z) {
            vaVar.run();
        } else if (!this.f32628a || this.c == null) {
            odg.c("MaterialTaskScheduler", "scheduler has't started yet.");
        } else {
            trt.h(new d(vaVar));
        }
    }

    public final void h(va vaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("36ca1e43", new Object[]{this, vaVar});
        } else if (!this.f32628a || this.c == null) {
            odg.c("MaterialTaskScheduler", "scheduler has't started yet.");
        } else {
            Message obtain = Message.obtain();
            obtain.what = 1;
            obtain.obj = vaVar;
            this.c.sendMessage(obtain);
            this.c.sendEmptyMessage(4);
        }
    }

    public final void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e7fea967", new Object[]{this});
            return;
        }
        va peek = this.e.peek();
        if (peek == null) {
            odg.d("MaterialTaskScheduler", "not task left in this queue, waiting for new task.");
        } else if (k(peek)) {
            odg.d("MaterialTaskScheduler", "there is't enough channel.");
        } else {
            va poll = this.e.poll();
            if (poll != null) {
                this.d++;
                poll.addObserver(this.f);
                trt.f(poll, !poll.e());
                odg.d("MaterialTaskScheduler", "task-" + poll.h() + " scheduled, now task queue size = " + this.e.size());
            }
        }
    }

    public final synchronized void o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb56e19b", new Object[]{this});
        } else if (this.f32628a) {
            odg.c("MaterialTaskScheduler", "scheduler has already started.");
        } else {
            HandlerThread handlerThread = new HandlerThread("MaterialTaskScheduler");
            this.b = handlerThread;
            handlerThread.start();
            this.c = new b(this.b.getLooper());
            this.f32628a = true;
        }
    }

    public final synchronized void q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("688db1fb", new Object[]{this});
        } else if (!this.f32628a) {
            odg.c("MaterialTaskScheduler", "scheduler has already stop.");
        } else {
            HandlerThread handlerThread = this.b;
            if (handlerThread != null) {
                handlerThread.quitSafely();
                this.b = null;
                this.c = null;
            }
            this.e.clear();
            this.d = 0;
            this.f32628a = false;
        }
    }

    public final void j(Message message) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("282a8c19", new Object[]{this, message});
            return;
        }
        int i = message.what;
        if (i == 1) {
            va vaVar = (va) message.obj;
            if (!this.e.contains(vaVar)) {
                this.e.offer(vaVar);
                odg.d("MaterialTaskScheduler", "task-" + vaVar.h() + " dispatched, now task queue size = " + this.e.size());
            }
        } else if (i != 2) {
            if (i == 3) {
                this.d--;
                odg.d("MaterialTaskScheduler", "task-" + ((va) message.obj).h() + " timeout, now task queue size = " + this.e.size());
            } else if (i != 4) {
                if (i == 5) {
                    va vaVar2 = (va) message.obj;
                    if (this.e.contains(vaVar2)) {
                        this.e.remove(vaVar2);
                        odg.d("MaterialTaskScheduler", "task-" + vaVar2.h() + " canceled, now task queue size = " + this.e.size());
                        return;
                    }
                    return;
                }
                return;
            }
            m();
        } else {
            this.d--;
            odg.d("MaterialTaskScheduler", "task-" + ((va) message.obj).h() + " finished, now task queue size = " + this.e.size());
        }
    }
}
