package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class lsi<T> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final boolean f23543a;
    public final HashSet<Runnable> b;
    public T c;

    static {
        t2o.a(993001489);
    }

    public lsi(T t) {
        this.f23543a = true;
        this.b = new HashSet<>();
        this.c = t;
    }

    public static final void h(g1a g1aVar, lsi lsiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9ee3d11", new Object[]{g1aVar, lsiVar});
            return;
        }
        ckf.g(g1aVar, "$consumer");
        ckf.g(lsiVar, "this$0");
        g1aVar.invoke(lsiVar.c);
    }

    public final void b(T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dfa19e12", new Object[]{this, t});
        } else if (!this.f23543a && t == null) {
            throw new IllegalArgumentException("value can not be null");
        }
    }

    public final void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b366243", new Object[]{this, str});
        }
    }

    public final void d(g1a<? super T, xhv> g1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c9992449", new Object[]{this, g1aVar});
            return;
        }
        ckf.g(g1aVar, "consumer");
        e(true, g1aVar);
    }

    public final void e(boolean z, final g1a<? super T, xhv> g1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("213daa77", new Object[]{this, new Boolean(z), g1aVar});
            return;
        }
        ckf.g(g1aVar, "consumer");
        c("consume");
        if (z) {
            this.b.add(new Runnable() { // from class: tb.jfz
                @Override // java.lang.Runnable
                public final void run() {
                    lsi.h(g1a.this, this);
                }
            });
        }
        g1aVar.invoke((T) this.c);
    }

    public final T f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("6045ccb0", new Object[]{this});
        }
        c("get");
        return this.c;
    }

    public final void g(T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6d63f592", new Object[]{this, t});
            return;
        }
        c("update");
        b(t);
        T t2 = this.c;
        this.c = t;
        if (!ckf.b(t2, t)) {
            Iterator<Runnable> it = this.b.iterator();
            ckf.f(it, "iterator(...)");
            while (it.hasNext()) {
                Runnable next = it.next();
                ckf.f(next, "next(...)");
                next.run();
            }
        }
    }

    public lsi(T t, boolean z) {
        this(t);
        this.f23543a = z;
    }
}
