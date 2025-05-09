package tb;

import android.text.TextUtils;
import android.util.Pair;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.client.GlobalClientInfo;
import com.taobao.accs.sync.queue.PreQueue;
import com.taobao.accs.sync.queue.SyncQueue;
import com.taobao.tao.powermsg.outter.PowerMsg4WW;
import com.xiaomi.mipush.sdk.Constants;
import java.util.AbstractQueue;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import tb.f2r;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class c2r<T extends f2r> extends AbstractQueue<T> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final r2j f16796a;
    public PreQueue b;
    public SyncQueue c;
    public final String d;
    public final String e;
    public final int f;
    public final boolean g;
    public final fud h;
    public Pair<Integer, Integer> i;
    public volatile int k;
    public final Object j = new Object();
    public volatile boolean l = false;
    public final q0e m = new c();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            c2r c2rVar = c2r.this;
            List<f2r> e = c2rVar.f16796a.e(c2r.j(c2rVar), c2r.k(c2r.this), c2r.d(c2r.this), Integer.MAX_VALUE);
            if (e != null) {
                for (f2r f2rVar : e) {
                    c2r.this.offer(f2rVar);
                }
            }
            c2r.f(c2r.this).a(c2r.j(c2r.this), c2r.k(c2r.this));
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class c implements q0e {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // tb.q0e
        public void onTimeout() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a13bc209", new Object[]{this});
                return;
            }
            pmo.c("SyncExecutor", "preQueue.onTimeout()", new Object[0]);
            synchronized (c2r.c(c2r.this)) {
                c2r.b(c2r.this).incrementSeq();
                c2r.i(c2r.this);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class d implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ f2r f16800a;

        public d(f2r f2rVar) {
            this.f16800a = f2rVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            this.f16800a.i(c2r.f(c2r.this).c(this.f16800a.d(), this.f16800a.a()));
            c2r.this.f16796a.d(this.f16800a);
        }
    }

    static {
        t2o.a(343933198);
    }

    public c2r(String str, String str2, int i, int i2, long j, boolean z, fud fudVar) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || fudVar == null) {
            throw new IllegalArgumentException("SyncExecutor.arguments are illegal");
        }
        r2j r2jVar = new r2j(GlobalClientInfo.getContext());
        this.f16796a = r2jVar;
        this.d = str;
        this.e = str2;
        this.k = Math.max(0, i - 1);
        this.f = i2 <= 1 ? Integer.MAX_VALUE : i2;
        this.g = z;
        this.h = fudVar;
        o(j);
        n();
        u();
        r2jVar.b(str);
    }

    public static /* synthetic */ boolean a(c2r c2rVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3d00b3d8", new Object[]{c2rVar})).booleanValue();
        }
        return c2rVar.l;
    }

    public static /* synthetic */ SyncQueue b(c2r c2rVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SyncQueue) ipChange.ipc$dispatch("6e4faac4", new Object[]{c2rVar});
        }
        return c2rVar.c;
    }

    public static /* synthetic */ Object c(c2r c2rVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("1ee0f5e0", new Object[]{c2rVar});
        }
        return c2rVar.j;
    }

    public static /* synthetic */ int d(c2r c2rVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ea609964", new Object[]{c2rVar})).intValue();
        }
        return c2rVar.k;
    }

    public static /* synthetic */ int e(c2r c2rVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4ca75427", new Object[]{c2rVar, new Integer(i)})).intValue();
        }
        c2rVar.k = i;
        return i;
    }

    public static /* synthetic */ fud f(c2r c2rVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (fud) ipChange.ipc$dispatch("f1744e30", new Object[]{c2rVar});
        }
        return c2rVar.h;
    }

    public static /* synthetic */ int g(c2r c2rVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5df5dd22", new Object[]{c2rVar})).intValue();
        }
        return c2rVar.f;
    }

    public static /* synthetic */ boolean h(c2r c2rVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("97c07f12", new Object[]{c2rVar})).booleanValue();
        }
        return c2rVar.g;
    }

    public static /* synthetic */ void i(c2r c2rVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d18b20ed", new Object[]{c2rVar});
        } else {
            c2rVar.l();
        }
    }

    public static /* synthetic */ Object ipc$super(c2r c2rVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/accs/sync/queue/SyncExecutor");
    }

    public static /* synthetic */ String j(c2r c2rVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e420a354", new Object[]{c2rVar});
        }
        return c2rVar.d;
    }

    public static /* synthetic */ String k(c2r c2rVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("31e01b55", new Object[]{c2rVar});
        }
        return c2rVar.e;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public Iterator<T> iterator() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Iterator) ipChange.ipc$dispatch("8f345362", new Object[]{this});
        }
        return null;
    }

    public final void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("78134edd", new Object[]{this});
            return;
        }
        f2r peek = this.b.peek();
        pmo.c("SyncExecutor", "checkPreQueue", "next", peek);
        if (peek != null) {
            if (this.c.isNext(peek)) {
                this.c.offer(this.b.poll());
                return;
            }
            this.b.updateTimeout();
            if (m()) {
                s();
            }
        }
    }

    public final void n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e48bb97c", new Object[]{this});
            return;
        }
        yqt.d(this.d + Constants.WAVE_SEPARATOR + this.e).execute(new a());
    }

    public final void o(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a64a99dc", new Object[]{this, new Long(j)});
            return;
        }
        int i = this.k;
        Comparator<f2r> comparator = d2r.comparator;
        this.c = new SyncQueue(i, comparator);
        PreQueue preQueue = new PreQueue(this.k, comparator);
        this.b = preQueue;
        preQueue.setTimeout(j, this.m);
    }

    /* renamed from: q */
    public T peek() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ((f2r) ipChange.ipc$dispatch("314e3c1", new Object[]{this}));
        }
        return null;
    }

    /* renamed from: r */
    public T poll() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ((f2r) ipChange.ipc$dispatch("4a99abdd", new Object[]{this}));
        }
        return null;
    }

    public void s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e0f884c", new Object[]{this});
            return;
        }
        int curSeq = this.c.getCurSeq();
        int i = curSeq + 1;
        f2r peek = this.b.peek();
        int b2 = peek == null ? Integer.MAX_VALUE : peek.b() - 1;
        if (i <= b2) {
            int min = Math.min(b2, curSeq + 50);
            this.i = Pair.create(Integer.valueOf(i), Integer.valueOf(min));
            this.h.d(this.d, this.e, i, min);
            pmo.c("SyncExecutor", "start pull", "serviceId", this.d, "streamId", this.e, "start", Integer.valueOf(i), "end", Integer.valueOf(min));
            return;
        }
        pmo.c("SyncExecutor", "pull illegalArgs", "start", Integer.valueOf(i), "end", Integer.valueOf(b2));
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public int size() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("32697bfb", new Object[]{this})).intValue();
        }
        return this.b.size() + this.c.size();
    }

    public List<f2r> t(String str, String str2, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("c67c7564", new Object[]{this, str, str2, new Integer(i), new Integer(i2)});
        }
        pmo.c("SyncExecutor", "biz query()", new Object[0]);
        return this.f16796a.e(str, str2, i, i2);
    }

    public final void u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24bf5feb", new Object[]{this});
        } else {
            yqt.b().execute(new b());
        }
    }

    public void v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6623bb89", new Object[]{this});
            return;
        }
        this.l = true;
        synchronized (this.j) {
            this.b.clear();
            this.c.clear();
        }
        this.f16796a.c(this.d, this.e, Integer.MAX_VALUE);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Throwable th;
            f2r poll;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            while (true) {
                boolean z = true;
                while (!c2r.a(c2r.this)) {
                    try {
                        poll = c2r.b(c2r.this).poll(3L, TimeUnit.SECONDS);
                    } catch (Throwable th2) {
                        th = th2;
                        z = z;
                    }
                    if (poll != null) {
                        try {
                            synchronized (c2r.c(c2r.this)) {
                                if (poll.b() <= c2r.d(c2r.this)) {
                                    pmo.c("SyncExecutor", "give up msg", "outputSeq", Integer.valueOf(c2r.d(c2r.this)), y1r.COL_SEQ, Integer.valueOf(poll.b()));
                                } else if (c2r.f(c2r.this).b(poll)) {
                                    c2r.e(c2r.this, poll.b());
                                    if (c2r.d(c2r.this) % c2r.g(c2r.this) == 1) {
                                        pmo.c("SyncExecutor", "dynamic delete", PowerMsg4WW.KEY_END_SEQ, Integer.valueOf(c2r.d(c2r.this)));
                                        if (c2r.h(c2r.this)) {
                                            c2r.this.f16796a.c(poll.d(), poll.e(), poll.b());
                                        }
                                    }
                                } else {
                                    pmo.c("SyncExecutor", "callback.onSync() err", new Object[0]);
                                }
                                c2r.i(c2r.this);
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            z = true;
                        }
                    } else if (z) {
                        try {
                            c2r.this.s();
                            z = false;
                        } catch (Throwable th4) {
                            th = th4;
                            z = false;
                        }
                    }
                    pmo.b("SyncExecutor", "getSyncQueueScheduler.execute err", th, new Object[0]);
                }
                return;
            }
        }
    }

    public final boolean m() {
        int curSeq;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("59c0432e", new Object[]{this})).booleanValue();
        }
        if (this.i == null || (curSeq = this.c.getCurSeq() + 1) < ((Integer) this.i.first).intValue() || curSeq > ((Integer) this.i.second).intValue()) {
            return true;
        }
        pmo.a("SyncExecutor", "pull repeat", "start", Integer.valueOf(this.c.getCurSeq() + 1), "pullRange.end", this.i.second);
        return false;
    }

    /* renamed from: p */
    public boolean offer(T t) {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ce04ce74", new Object[]{this, t})).booleanValue();
        }
        if (TextUtils.isEmpty(this.e) || !this.e.equals(t.e())) {
            pmo.c("SyncExecutor", "offer failed", "mStream", this.e, "msgStream", t.e());
            return false;
        } else if (t.b() <= this.k) {
            pmo.c("SyncExecutor", "offer failed", "outputSeq", Integer.valueOf(this.k), "t.seq", Integer.valueOf(t.b()));
            return false;
        } else {
            synchronized (this.j) {
                try {
                    if (this.c.isNext(t)) {
                        z = this.c.offer((f2r) t);
                    } else {
                        if (!this.b.isEmpty() && this.b.isNext(t)) {
                            z = this.b.offer((f2r) t);
                        }
                        z = this.b.offer((f2r) t);
                        if (m()) {
                            s();
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (this.g && z && t.f()) {
                if (t.a() != null) {
                    yqt.c().execute(new d(t));
                } else {
                    this.f16796a.d(t);
                }
            }
            return z;
        }
    }
}
