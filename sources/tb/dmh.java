package tb;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class dmh<T> {
    public static Executor e = Executors.newCachedThreadPool();

    /* renamed from: a  reason: collision with root package name */
    public final Set<plh<T>> f17918a;
    public final Set<plh<Throwable>> b;
    public final Handler c;
    public volatile zlh<T> d;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class a extends FutureTask<zlh<T>> {
        public a(Callable<zlh<T>> callable) {
            super(callable);
        }

        @Override // java.util.concurrent.FutureTask
        public void done() {
            if (!isCancelled()) {
                try {
                    dmh.this.k(get());
                } catch (InterruptedException | ExecutionException e) {
                    dmh.this.k(new zlh(e));
                }
            }
        }
    }

    public dmh(Callable<zlh<T>> callable) {
        this(callable, false);
    }

    public synchronized dmh<T> c(plh<Throwable> plhVar) {
        try {
            zlh<T> zlhVar = this.d;
            if (!(zlhVar == null || zlhVar.a() == null)) {
                plhVar.onResult(zlhVar.a());
            }
            this.b.add(plhVar);
        } catch (Throwable th) {
            throw th;
        }
        return this;
    }

    public synchronized dmh<T> d(plh<T> plhVar) {
        try {
            zlh<T> zlhVar = this.d;
            if (!(zlhVar == null || zlhVar.b() == null)) {
                plhVar.onResult(zlhVar.b());
            }
            this.f17918a.add(plhVar);
        } catch (Throwable th) {
            throw th;
        }
        return this;
    }

    public final /* synthetic */ void e() {
        zlh<T> zlhVar = this.d;
        if (zlhVar != null) {
            if (zlhVar.b() != null) {
                h(zlhVar.b());
            } else {
                f(zlhVar.a());
            }
        }
    }

    public final synchronized void f(Throwable th) {
        ArrayList arrayList = new ArrayList(this.b);
        if (arrayList.isEmpty()) {
            zhh.c("Lottie encountered an error but no failure listener was added:", th);
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((plh) it.next()).onResult(th);
        }
    }

    public final void g() {
        this.c.post(new Runnable() { // from class: tb.cmh
            @Override // java.lang.Runnable
            public final void run() {
                dmh.this.e();
            }
        });
    }

    public final synchronized void h(T t) {
        Iterator it = new ArrayList(this.f17918a).iterator();
        while (it.hasNext()) {
            ((plh) it.next()).onResult(t);
        }
    }

    public synchronized dmh<T> i(plh<Throwable> plhVar) {
        this.b.remove(plhVar);
        return this;
    }

    public synchronized dmh<T> j(plh<T> plhVar) {
        this.f17918a.remove(plhVar);
        return this;
    }

    public final void k(zlh<T> zlhVar) {
        if (this.d != null) {
            zhh.b("A task may only be set once.");
            return;
        }
        this.d = zlhVar;
        g();
    }

    public dmh(Callable<zlh<T>> callable, boolean z) {
        this.f17918a = new LinkedHashSet(1);
        this.b = new LinkedHashSet(1);
        this.c = new Handler(Looper.getMainLooper());
        this.d = null;
        if (z) {
            try {
                k(callable.call());
            } catch (Throwable th) {
                k(new zlh<>(th));
            }
        } else {
            e.execute(new a(callable));
        }
    }
}
