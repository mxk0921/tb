package tb;

import com.nirvana.tools.requestqueue.strategy.CallbackStrategy;
import com.nirvana.tools.requestqueue.strategy.ThreadStrategy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.RunnableScheduledFuture;
import tb.n5o;
import tb.p9o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class f4o<T extends p9o> {

    /* renamed from: a  reason: collision with root package name */
    public final List<qv2<T>> f19000a = new ArrayList();
    public f4o<T>.f b;
    public d3o<T> c;
    public final e d;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ qv2 f19001a;
        final /* synthetic */ p9o b;

        public a(qv2 qv2Var, p9o p9oVar) {
            this.f19001a = qv2Var;
            this.b = p9oVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public final void run() {
            this.f19001a.onResult(this.b);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ qv2 f19002a;
        final /* synthetic */ p9o b;

        public b(qv2 qv2Var, p9o p9oVar) {
            this.f19002a = qv2Var;
            this.b = p9oVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public final void run() {
            this.f19002a.onResult(this.b);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            f4o.this.c(f4o.this.c.getAction().onTimeout());
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static /* synthetic */ class d {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f19004a;
        public static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[CallbackStrategy.values().length];
            b = iArr;
            try {
                iArr[CallbackStrategy.LIST.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                b[CallbackStrategy.COVER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[ThreadStrategy.values().length];
            f19004a = iArr2;
            try {
                iArr2[ThreadStrategy.THREAD.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f19004a[ThreadStrategy.THREAD_MAIN.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f19004a[ThreadStrategy.SAME_WITH_CALLABLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public interface e {
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class f implements Runnable {
        private Runnable b;

        /* renamed from: a  reason: collision with root package name */
        private volatile boolean f19005a = false;
        RunnableScheduledFuture<?> c = null;

        public f(Runnable runnable) {
            this.b = runnable;
        }

        public final synchronized void a() {
            try {
                if (this.b != null) {
                    ln8.b().f(this.b);
                }
                if (this.c != null) {
                    ln8.b().g(this.c);
                }
                this.f19005a = true;
            } catch (Throwable th) {
                throw th;
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (!this.f19005a) {
                try {
                    T call = f4o.this.c.getAction().call();
                    if (!this.f19005a) {
                        f4o.this.c(call);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public f4o(d3o<T> d3oVar, e eVar) {
        this.c = d3oVar;
        this.d = eVar;
    }

    public final void a() {
        if (this.b == null) {
            c cVar = new c();
            this.b = new f(cVar);
            int i = d.f19004a[this.c.getThreadStrategy().ordinal()];
            if (i == 1) {
                ln8.b().h(this.b);
                this.b.c = ln8.b().i(cVar, this.c.getTimeout());
            } else if (i == 2) {
                ln8.b().c(this.b);
                ln8.b().d(cVar, this.c.getTimeout());
            } else {
                throw new IllegalArgumentException("Request Callable ThreadStrategy Illegal");
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x004c A[Catch: all -> 0x0037, TRY_LEAVE, TryCatch #0 {all -> 0x0037, blocks: (B:3:0x0001, B:8:0x0024, B:9:0x0033, B:12:0x0039, B:13:0x0042, B:15:0x004c), top: B:20:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void b(tb.d3o<T> r6) {
        /*
            r5 = this;
            monitor-enter(r5)
            tb.qv2 r0 = r6.getCallback()     // Catch: all -> 0x0037
            long r1 = r6.getTimeout()     // Catch: all -> 0x0037
            long r3 = java.lang.System.currentTimeMillis()     // Catch: all -> 0x0037
            long r1 = r1 + r3
            r0.setExpiredTime(r1)     // Catch: all -> 0x0037
            int[] r0 = tb.f4o.d.b     // Catch: all -> 0x0037
            com.nirvana.tools.requestqueue.strategy.CallbackStrategy r1 = r6.getCallbackStrategy()     // Catch: all -> 0x0037
            int r1 = r1.ordinal()     // Catch: all -> 0x0037
            r0 = r0[r1]     // Catch: all -> 0x0037
            r1 = 1
            if (r0 == r1) goto L_0x0039
            r1 = 2
            if (r0 == r1) goto L_0x0024
            goto L_0x0042
        L_0x0024:
            java.util.List<tb.qv2<T extends tb.p9o>> r0 = r5.f19000a     // Catch: all -> 0x0037
            java.util.ArrayList r0 = (java.util.ArrayList) r0     // Catch: all -> 0x0037
            r0.clear()     // Catch: all -> 0x0037
            java.util.List<tb.qv2<T extends tb.p9o>> r0 = r5.f19000a     // Catch: all -> 0x0037
            tb.qv2 r1 = r6.getCallback()     // Catch: all -> 0x0037
            java.util.ArrayList r0 = (java.util.ArrayList) r0     // Catch: all -> 0x0037
        L_0x0033:
            r0.add(r1)     // Catch: all -> 0x0037
            goto L_0x0042
        L_0x0037:
            r6 = move-exception
            goto L_0x0059
        L_0x0039:
            java.util.List<tb.qv2<T extends tb.p9o>> r0 = r5.f19000a     // Catch: all -> 0x0037
            tb.qv2 r1 = r6.getCallback()     // Catch: all -> 0x0037
            java.util.ArrayList r0 = (java.util.ArrayList) r0     // Catch: all -> 0x0037
            goto L_0x0033
        L_0x0042:
            java.util.List<tb.qv2<T extends tb.p9o>> r0 = r5.f19000a     // Catch: all -> 0x0037
            java.util.ArrayList r0 = (java.util.ArrayList) r0     // Catch: all -> 0x0037
            boolean r0 = r0.isEmpty()     // Catch: all -> 0x0037
            if (r0 == 0) goto L_0x0057
            java.util.List<tb.qv2<T extends tb.p9o>> r0 = r5.f19000a     // Catch: all -> 0x0037
            tb.qv2 r6 = r6.getCallback()     // Catch: all -> 0x0037
            java.util.ArrayList r0 = (java.util.ArrayList) r0     // Catch: all -> 0x0037
            r0.add(r6)     // Catch: all -> 0x0037
        L_0x0057:
            monitor-exit(r5)
            return
        L_0x0059:
            monitor-exit(r5)     // Catch: all -> 0x0037
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.f4o.b(tb.d3o):void");
    }

    public final synchronized void c(T t) {
        try {
            if (((ArrayList) this.f19000a).size() > 0) {
                ArrayList arrayList = new ArrayList(((ArrayList) this.f19000a).size());
                Iterator it = ((ArrayList) this.f19000a).iterator();
                long j = 0;
                while (it.hasNext()) {
                    qv2 qv2Var = (qv2) it.next();
                    if (t.isTimeout()) {
                        long currentTimeMillis = System.currentTimeMillis() - qv2Var.getExpiredTime();
                        if (currentTimeMillis > qv2Var.getThreshold()) {
                            if (j > currentTimeMillis) {
                                j = currentTimeMillis;
                            }
                        }
                    }
                    int i = d.f19004a[qv2Var.getThreadStrategy().ordinal()];
                    if (i == 1) {
                        ln8.b().h(new a(qv2Var, t));
                    } else if (i == 2) {
                        ln8.b().c(new b(qv2Var, t));
                    } else if (i == 3) {
                        arrayList.add(qv2Var);
                    }
                    it.remove();
                }
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    ((qv2) it2.next()).onResult(t);
                }
                arrayList.clear();
                if (!((ArrayList) this.f19000a).isEmpty()) {
                    d3o<T> d3oVar = this.c;
                    if (d3oVar != null) {
                        d3oVar.setTimeout(j);
                    }
                    a();
                    return;
                }
                e eVar = this.d;
                if (eVar != null) {
                    ((n5o.a) eVar).a(this);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
