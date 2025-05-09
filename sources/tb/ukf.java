package tb;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.jvm.Volatile;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public final class ukf extends huf {
    public static final AtomicIntegerFieldUpdater j = AtomicIntegerFieldUpdater.newUpdater(ukf.class, bmv.MSGTYPE_INTERVAL);
    public final g1a<Throwable, xhv> h;
    @Volatile
    public volatile int i;

    /* JADX WARN: Multi-variable type inference failed */
    public ukf(g1a<? super Throwable, xhv> g1aVar) {
        this.h = g1aVar;
    }

    @Override // tb.g1a
    public /* bridge */ /* synthetic */ xhv invoke(Throwable th) {
        p(th);
        return xhv.INSTANCE;
    }

    @Override // tb.ha4
    public void p(Throwable th) {
        if (j.compareAndSet(this, 0, 1)) {
            this.h.invoke(th);
        }
    }
}
