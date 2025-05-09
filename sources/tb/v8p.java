package tb;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.coroutines.d;
import kotlin.jvm.Volatile;
import tb.v8p;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public abstract class v8p<S extends v8p<S>> extends te4<S> implements x7k {
    public static final AtomicIntegerFieldUpdater g = AtomicIntegerFieldUpdater.newUpdater(v8p.class, "f");
    public final long e;
    @Volatile
    public volatile int f;

    public v8p(long j, S s, int i) {
        super(s);
        this.e = j;
        this.f = i << 16;
    }

    @Override // tb.te4
    public boolean h() {
        if (g.get(this) != n() || i()) {
            return false;
        }
        return true;
    }

    public final boolean m() {
        if (g.addAndGet(this, -65536) != n() || i()) {
            return false;
        }
        return true;
    }

    public abstract int n();

    public abstract void o(int i, Throwable th, d dVar);

    public final void p() {
        if (g.incrementAndGet(this) == n()) {
            k();
        }
    }

    public final boolean q() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i;
        do {
            atomicIntegerFieldUpdater = g;
            i = atomicIntegerFieldUpdater.get(this);
            if (i == n() && !i()) {
                return false;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, 65536 + i));
        return true;
    }
}
