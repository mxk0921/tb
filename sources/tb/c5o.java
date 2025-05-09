package tb;

import android.os.Handler;
import android.os.Looper;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.task.Coordinator;
import java.util.Iterator;
import java.util.LinkedList;

/*  JADX ERROR: JadxRuntimeException in pass: ClassModifier
    jadx.core.utils.exceptions.JadxRuntimeException: Not class type: T
    	at jadx.core.dex.info.ClassInfo.checkClassType(ClassInfo.java:53)
    	at jadx.core.dex.info.ClassInfo.fromType(ClassInfo.java:31)
    	at jadx.core.dex.visitors.ClassModifier.removeSyntheticFields(ClassModifier.java:80)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:58)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:52)
    */
/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class c5o<T> implements or7 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final h5p f16878a;
    public final g5p<T> b;
    public final v5p c;
    public hk4<T> d;
    public boolean e;
    public boolean f;
    public hk4<? super Throwable> g;
    public final LinkedList<hk4<T>> h = new LinkedList<>();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static final class b extends xpo {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ c5o<T> c;
        public final /* synthetic */ T d;

        public b(c5o<T> c5oVar, T t) {
            this.c = c5oVar;
            this.d = t;
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/rx/network/mtop/RequestObservable$onFinish$1");
        }

        @Override // tb.xpo
        public void c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("15c1193f", new Object[]{this});
                return;
            }
            hk4 c = c5o.c(this.c);
            if (c != null) {
                c.accept(this.d);
            } else {
                ckf.y("onFinish");
                throw null;
            }
        }
    }

    static {
        t2o.a(815792919);
        t2o.a(815792918);
    }

    public c5o(h5p h5pVar, g5p<T> g5pVar, v5p v5pVar) {
        this.f16878a = h5pVar;
        this.b = g5pVar;
        this.c = v5pVar;
    }

    public static final /* synthetic */ hk4 c(c5o c5oVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (hk4) ipChange.ipc$dispatch("b41e7cc8", new Object[]{c5oVar});
        }
        return c5oVar.d;
    }

    public static final void d(c5o c5oVar, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a805b84b", new Object[]{c5oVar, th});
            return;
        }
        ckf.g(c5oVar, "this$0");
        ckf.g(th, "$e");
        hk4<? super Throwable> hk4Var = c5oVar.g;
        ckf.d(hk4Var);
        hk4Var.accept(th);
    }

    public static final void e(c5o c5oVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e3abd99", new Object[]{c5oVar});
            return;
        }
        ckf.g(c5oVar, "this$0");
        h5p h5pVar = c5oVar.f16878a;
        if (h5pVar == null) {
            hk4<? super Throwable> hk4Var = c5oVar.g;
            if (hk4Var != null) {
                hk4Var.accept(new NullPointerException("request is null"));
                return;
            }
            return;
        }
        try {
            m4p g = i4p.g(h5pVar.f20426a, c5oVar.c);
            ckf.f(g, "syncRequest(...)");
            g5p<T> g5pVar = c5oVar.b;
            if (g5pVar != null) {
                T a2 = g5pVar.a(g.b, c5oVar.c);
                ckf.f(a2, "convert(...)");
                c5oVar.m(a2);
                c5oVar.l(a2);
            } else {
                c5oVar.m(g);
                c5oVar.l(g);
            }
        } catch (Throwable th) {
            c5oVar.k(th);
        }
    }

    @Override // tb.or7
    public void dispose() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("226c8326", new Object[]{this});
        } else {
            this.e = true;
        }
    }

    public final c5o<T> i(hk4<T> hk4Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c5o) ipChange.ipc$dispatch("947eda1f", new Object[]{this, hk4Var});
        }
        ckf.g(hk4Var, "consumer");
        this.h.add(hk4Var);
        return this;
    }

    @Override // tb.or7
    public boolean isDisposed() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("be7a7a", new Object[]{this})).booleanValue();
        }
        return this.e;
    }

    public final c5o<T> j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c5o) ipChange.ipc$dispatch("8f241af5", new Object[]{this});
        }
        this.f = true;
        return this;
    }

    public final void k(final Throwable th) {
        hk4<? super Throwable> hk4Var;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf54aa85", new Object[]{this, th});
        } else if (!this.e && (hk4Var = this.g) != null) {
            if (this.f) {
                new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: tb.rlz
                    @Override // java.lang.Runnable
                    public final void run() {
                        c5o.d(c5o.this, th);
                    }
                });
            } else {
                hk4Var.accept(th);
            }
        }
    }

    public final void l(T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4bff3a75", new Object[]{this, t});
        } else if (!this.e) {
            if (this.f) {
                new Handler(Looper.getMainLooper()).post(new b(this, t));
                return;
            }
            try {
                hk4<T> hk4Var = this.d;
                if (hk4Var != null) {
                    hk4Var.accept(t);
                } else {
                    ckf.y("onFinish");
                    throw null;
                }
            } catch (Throwable unused) {
            }
        }
    }

    public final void m(T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b4b8495", new Object[]{this, t});
        } else if (!this.e) {
            Iterator<hk4<T>> it = this.h.iterator();
            ckf.f(it, "iterator(...)");
            while (it.hasNext()) {
                hk4<T> next = it.next();
                ckf.f(next, "next(...)");
                next.accept(t);
            }
        }
    }

    public final or7 n(hk4<T> hk4Var, hk4<? super Throwable> hk4Var2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (or7) ipChange.ipc$dispatch("faf30923", new Object[]{this, hk4Var, hk4Var2});
        }
        ckf.g(hk4Var, "onNext");
        this.d = hk4Var;
        this.g = hk4Var2;
        o();
        return this;
    }

    public final void o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b8c8a6be", new Object[]{this});
        } else {
            Coordinator.execute(new Runnable() { // from class: tb.qlz
                @Override // java.lang.Runnable
                public final void run() {
                    c5o.e(c5o.this);
                }
            });
        }
    }
}
