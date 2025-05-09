package tb;

import android.os.Handler;
import android.os.Looper;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.communication.ThreadMode;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class p84 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final ThreadPoolExecutor f25932a;
    public final e b = new e(new b());
    public final Handler c = new Handler(Looper.getMainLooper());
    public final e d = new e(new c());
    public final Map<Integer, List<ntc>> e = new ConcurrentHashMap();
    public final Map<Integer, ktc> f = new ConcurrentHashMap();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a implements ThreadFactory {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final AtomicInteger f25933a = new AtomicInteger(1);

        public a(p84 p84Var) {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Thread) ipChange.ipc$dispatch("d8079a58", new Object[]{this, runnable});
            }
            Thread thread = new Thread(runnable, "CommunicationCenter Thread - " + this.f25933a.getAndIncrement());
            if (thread.isDaemon()) {
                thread.setDaemon(false);
            }
            if (thread.getPriority() != 5) {
                thread.setPriority(5);
            }
            return thread;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class b implements ftc {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // tb.ftc
        public void execute(Runnable runnable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1afb0dfa", new Object[]{this, runnable});
            } else if (Looper.myLooper() != Looper.getMainLooper()) {
                runnable.run();
            } else {
                p84.a(p84.this).execute(runnable);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class c implements ftc {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // tb.ftc
        public void execute(Runnable runnable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1afb0dfa", new Object[]{this, runnable});
            } else if (Looper.myLooper() == Looper.getMainLooper()) {
                runnable.run();
            } else {
                p84.b(p84.this).post(runnable);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class d implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private dtc f25936a;
        private ntc b;

        static {
            t2o.a(912261355);
        }

        public d(dtc dtcVar, ntc ntcVar) {
            this.f25936a = dtcVar;
            this.b = ntcVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            ntc ntcVar = this.b;
            if (ntcVar != null) {
                ntcVar.y1(this.f25936a);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class e {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final ftc f25937a;
        public final ArrayDeque<Runnable> b = new ArrayDeque<>();
        public Runnable c;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
        public class a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ Runnable f25938a;

            public a(Runnable runnable) {
                this.f25938a = runnable;
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                try {
                    this.f25938a.run();
                } finally {
                    e.a(e.this);
                }
            }
        }

        static {
            t2o.a(912261356);
        }

        public e(ftc ftcVar) {
            this.f25937a = ftcVar;
        }

        public static /* synthetic */ void a(e eVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("450f6930", new Object[]{eVar});
            } else {
                eVar.c();
            }
        }

        public synchronized void b(Runnable runnable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1afb0dfa", new Object[]{this, runnable});
                return;
            }
            this.b.offer(new a(runnable));
            if (this.c == null) {
                c();
            }
        }

        public final synchronized void c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e4c0cdb1", new Object[]{this});
                return;
            }
            Runnable poll = this.b.poll();
            this.c = poll;
            if (poll != null) {
                this.f25937a.execute(poll);
            }
        }
    }

    static {
        t2o.a(912261351);
    }

    public p84() {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new a(this));
        this.f25932a = threadPoolExecutor;
        threadPoolExecutor.allowCoreThreadTimeOut(true);
    }

    public static /* synthetic */ ThreadPoolExecutor a(p84 p84Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ThreadPoolExecutor) ipChange.ipc$dispatch("263c18e7", new Object[]{p84Var});
        }
        return p84Var.f25932a;
    }

    public static /* synthetic */ Handler b(p84 p84Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Handler) ipChange.ipc$dispatch("42685a3e", new Object[]{p84Var});
        }
        return p84Var.c;
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        ((ConcurrentHashMap) this.e).clear();
        ((ConcurrentHashMap) this.f).clear();
    }

    public void d(dtc dtcVar) {
        List<ntc> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("22a2fc9", new Object[]{this, dtcVar});
        } else if (dtcVar != null && (list = (List) ((ConcurrentHashMap) this.e).get(Integer.valueOf(dtcVar.getMessageId()))) != null) {
            for (ntc ntcVar : list) {
                if (ThreadMode.WorkThread == ntcVar.W2()) {
                    this.b.b(new d(dtcVar, ntcVar));
                } else {
                    this.d.b(new d(dtcVar, ntcVar));
                }
            }
        }
    }

    public <T> T e(dtc dtcVar) {
        ktc ktcVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("1ecc6561", new Object[]{this, dtcVar});
        }
        if (dtcVar == null || (ktcVar = (ktc) ((ConcurrentHashMap) this.f).get(Integer.valueOf(dtcVar.getMessageId()))) == null) {
            return null;
        }
        return (T) ktcVar.i(dtcVar);
    }

    public void f(int i, ktc ktcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cbab6708", new Object[]{this, new Integer(i), ktcVar});
        } else if (ktcVar != null) {
            synchronized (this) {
                ((ConcurrentHashMap) this.f).put(Integer.valueOf(i), ktcVar);
            }
        }
    }

    public <T extends dtc> void g(Class<T> cls, ktc ktcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad27d342", new Object[]{this, cls, ktcVar});
        } else {
            f(zoi.a(cls), ktcVar);
        }
    }

    public void h(int i, ntc ntcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("afd92c3e", new Object[]{this, new Integer(i), ntcVar});
        } else if (ntcVar != null) {
            synchronized (this) {
                try {
                    List<ntc> list = (List) ((ConcurrentHashMap) this.e).get(Integer.valueOf(i));
                    if (list == null) {
                        list = Collections.synchronizedList(new ArrayList());
                        ((ConcurrentHashMap) this.e).put(Integer.valueOf(i), list);
                    }
                    for (ntc ntcVar2 : list) {
                        if (ntcVar2 == ntcVar) {
                            return;
                        }
                    }
                    list.add(ntcVar);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public <T extends dtc> void i(Class<T> cls, ntc ntcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("179e63c4", new Object[]{this, cls, ntcVar});
        } else {
            h(zoi.a(cls), ntcVar);
        }
    }

    public void j(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7fbbf8f0", new Object[]{this, new Integer(i)});
        } else {
            ((ConcurrentHashMap) this.f).remove(Integer.valueOf(i));
        }
    }

    public <T extends dtc> void k(Class<T> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5191632a", new Object[]{this, cls});
        } else {
            j(zoi.a(cls));
        }
    }

    public void l(ktc ktcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fed510e4", new Object[]{this, ktcVar});
        } else if (ktcVar != null) {
            synchronized (this) {
                try {
                    for (Map.Entry entry : ((ConcurrentHashMap) this.f).entrySet()) {
                        if (entry.getValue() == ktcVar) {
                            ((ConcurrentHashMap) this.f).remove(entry.getKey());
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public void m(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4985cff1", new Object[]{this, new Integer(i)});
        } else {
            ((ConcurrentHashMap) this.e).remove(Integer.valueOf(i));
        }
    }

    public <T extends dtc> void n(Class<T> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6377182b", new Object[]{this, cls});
        } else {
            m(zoi.a(cls));
        }
    }

    public void o(ntc ntcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("25ecfad6", new Object[]{this, ntcVar});
        } else if (ntcVar != null) {
            synchronized (this) {
                try {
                    for (List list : ((ConcurrentHashMap) this.e).values()) {
                        for (int size = list.size() - 1; size > 0; size--) {
                            if (((ntc) list.get(size)) == ntcVar) {
                                list.remove(size);
                            }
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}
