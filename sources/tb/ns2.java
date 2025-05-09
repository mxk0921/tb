package tb;

import android.os.SystemClock;
import android.util.Pair;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class ns2<V> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public boolean f24919a;
    public V b;
    public String c;
    public kkf d;
    public Callable<V> e;
    public final Object f = new Object();

    public static <V> ns2<V> b(os2<V> os2Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ns2) ipChange.ipc$dispatch("f747f0a", new Object[]{os2Var});
        }
        ns2<V> ns2Var = new ns2<>();
        ns2Var.f24919a = false;
        ns2Var.b = null;
        ns2Var.c = os2Var.f25610a;
        ns2Var.d = os2Var.b;
        ns2Var.e = os2Var.c;
        return ns2Var;
    }

    public void c(V v) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6251244", new Object[]{this, v});
        } else if (uca.f29291a) {
            this.b = v;
            kkf kkfVar = this.d;
            if (!(kkfVar instanceof nkf)) {
                if (kkfVar instanceof okf) {
                    okf okfVar = (okf) kkfVar;
                    okfVar.getClass();
                    okfVar.c = SystemClock.elapsedRealtime();
                } else {
                    boolean z = kkfVar instanceof mkf;
                }
            }
            this.f24919a = true;
        } else {
            synchronized (this.f) {
                try {
                    kkf kkfVar2 = this.d;
                    if (!(kkfVar2 instanceof nkf)) {
                        if (kkfVar2 instanceof okf) {
                            okf okfVar2 = (okf) kkfVar2;
                            okfVar2.getClass();
                            okfVar2.c = SystemClock.elapsedRealtime();
                        } else {
                            boolean z2 = kkfVar2 instanceof mkf;
                        }
                    }
                    this.f24919a = true;
                    this.b = v;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public boolean d() {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
        }
        kkf kkfVar = this.d;
        if (!(kkfVar instanceof nkf)) {
            if (kkfVar instanceof okf) {
                okf okfVar = (okf) kkfVar;
                if (okfVar.c != Long.MIN_VALUE && SystemClock.elapsedRealtime() - okfVar.c < okfVar.f25440a.toMillis(okfVar.b)) {
                    z = true;
                }
                this.f24919a = z;
            } else {
                boolean z2 = kkfVar instanceof mkf;
            }
        }
        return this.f24919a;
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        kkf kkfVar = this.d;
        if (!(kkfVar instanceof nkf) && !(kkfVar instanceof okf) && (kkfVar instanceof mkf)) {
            mkf mkfVar = (mkf) kkfVar;
            lkf lkfVar = new lkf(mkfVar, this);
            mkfVar.getClass();
            mkfVar.f24100a.registerComponentCallbacks(lkfVar);
        }
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "CacheItem{entryKey='" + this.c + "', isValid=" + this.f24919a + ", invalidPolicy=" + l2w.a(this.d) + ", value=" + l2w.a(this.b) + '}';
    }

    public Pair<Boolean, V> a(gwt gwtVar) {
        boolean d;
        boolean z;
        Pair<Boolean, V> pair;
        boolean d2;
        boolean z2 = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Pair) ipChange.ipc$dispatch("27264ec0", new Object[]{this, gwtVar});
        }
        V v = null;
        if (uca.f29291a) {
            if (d()) {
                v = this.b;
                z2 = true;
            } else {
                try {
                    v = this.e.call();
                    z2 = true;
                } catch (Throwable th) {
                    th.printStackTrace();
                    v = null;
                }
                if (z2) {
                    c(v);
                } else {
                    v = null;
                }
            }
            gwt.f(gwtVar, TimeUnit.MICROSECONDS, "Cache", "refreshed: " + (true ^ d2) + " for " + this);
            Boolean valueOf = Boolean.valueOf(z2);
            if (z2) {
            }
            return new Pair<>(valueOf, v);
        }
        synchronized (this.f) {
            try {
                if (!d()) {
                    V call = this.e.call();
                    z = true;
                    if (1 != 0) {
                        c(call);
                    }
                } else {
                    z = true;
                }
                gwt.f(gwtVar, TimeUnit.MICROSECONDS, "Cache", "refreshed: " + (true ^ d) + " for " + this);
                Boolean valueOf2 = Boolean.valueOf(z);
                if (z) {
                    v = this.b;
                }
                pair = new Pair<>(valueOf2, v);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return pair;
    }
}
