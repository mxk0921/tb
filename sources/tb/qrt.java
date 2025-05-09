package tb;

import com.alipay.android.msp.framework.dynfun.TplMsg;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.jvm.Volatile;
import kotlinx.coroutines.m;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public final class qrt implements g1a<Throwable, xhv> {
    public static final AtomicIntegerFieldUpdater e = AtomicIntegerFieldUpdater.newUpdater(qrt.class, TplMsg.VALUE_T_NATIVE_RETURN);

    /* renamed from: a  reason: collision with root package name */
    public final m f26899a;
    @Volatile
    public volatile int b;
    public final Thread c = Thread.currentThread();
    public rr7 d;

    public qrt(m mVar) {
        this.f26899a = mVar;
    }

    public final void a() {
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = e;
            int i = atomicIntegerFieldUpdater.get(this);
            if (i != 0) {
                if (i != 2) {
                    if (i == 3) {
                        Thread.interrupted();
                        return;
                    } else {
                        b(i);
                        throw null;
                    }
                }
            } else if (atomicIntegerFieldUpdater.compareAndSet(this, i, 1)) {
                rr7 rr7Var = this.d;
                if (rr7Var != null) {
                    rr7Var.dispose();
                    return;
                }
                return;
            }
        }
    }

    public final Void b(int i) {
        throw new IllegalStateException(("Illegal state " + i).toString());
    }

    public void c(Throwable th) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i;
        do {
            atomicIntegerFieldUpdater = e;
            i = atomicIntegerFieldUpdater.get(this);
            if (i != 0) {
                if (i != 1 && i != 2 && i != 3) {
                    b(i);
                    throw null;
                }
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, 2));
        this.c.interrupt();
        atomicIntegerFieldUpdater.set(this, 3);
    }

    public final void d() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i;
        this.d = this.f26899a.F(true, true, this);
        do {
            atomicIntegerFieldUpdater = e;
            i = atomicIntegerFieldUpdater.get(this);
            if (i != 0) {
                if (i != 2 && i != 3) {
                    b(i);
                    throw null;
                }
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, 0));
    }

    @Override // tb.g1a
    public /* bridge */ /* synthetic */ xhv invoke(Throwable th) {
        c(th);
        return xhv.INSTANCE;
    }
}
