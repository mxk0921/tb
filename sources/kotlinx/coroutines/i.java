package kotlinx.coroutines;

import com.loc.at;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Metadata;
import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.jvm.Volatile;
import tb.ar4;
import tb.dkf;
import tb.fa4;
import tb.g1a;
import tb.ia4;
import tb.suf;
import tb.vq7;
import tb.wuo;
import tb.xhv;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00000\u0002B\u001f\b\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\u000bJ\u0019\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0014¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0012\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0014¢\u0006\u0004\b\u0012\u0010\u0011J\u0011\u0010\u0013\u001a\u0004\u0018\u00010\rH\u0000¢\u0006\u0004\b\u0013\u0010\u0014R\u000b\u0010\u0015\u001a\u00020\r8\u0006X\u0087\u0004¨\u0006\u0016"}, d2 = {"Lkotlinx/coroutines/i;", "T", "Ltb/wuo;", "Lkotlin/coroutines/d;", "context", "Ltb/ar4;", "uCont", "<init>", "(Lkotlin/coroutines/d;Ltb/ar4;)V", "", "A1", "()Z", "z1", "", "state", "Ltb/xhv;", "G", "(Ljava/lang/Object;)V", "r1", "w1", "()Ljava/lang/Object;", "_decision", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public final class i<T> extends wuo<T> {
    private static final AtomicIntegerFieldUpdater h = AtomicIntegerFieldUpdater.newUpdater(i.class, at.f);
    @Volatile
    private volatile int g;

    public i(d dVar, ar4<? super T> ar4Var) {
        super(dVar, ar4Var);
    }

    private final boolean A1() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = h;
        do {
            int i = atomicIntegerFieldUpdater.get(this);
            if (i != 0) {
                if (i == 2) {
                    return false;
                }
                throw new IllegalStateException("Already suspended");
            }
        } while (!h.compareAndSet(this, 0, 1));
        return true;
    }

    public static final AtomicIntegerFieldUpdater x1() {
        return h;
    }

    private final void y1(AtomicIntegerFieldUpdater atomicIntegerFieldUpdater, g1a<? super Integer, xhv> g1aVar, Object obj) {
        while (true) {
            g1aVar.invoke(Integer.valueOf(atomicIntegerFieldUpdater.get(obj)));
        }
    }

    private final boolean z1() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = h;
        do {
            int i = atomicIntegerFieldUpdater.get(this);
            if (i != 0) {
                if (i == 1) {
                    return false;
                }
                throw new IllegalStateException("Already resumed");
            }
        } while (!h.compareAndSet(this, 0, 2));
        return true;
    }

    @Override // tb.wuo, kotlinx.coroutines.JobSupport
    public void G(Object obj) {
        r1(obj);
    }

    @Override // tb.wuo, kotlinx.coroutines.a
    public void r1(Object obj) {
        if (!z1()) {
            vq7.b(IntrinsicsKt__IntrinsicsJvmKt.c(this.f), ia4.a(obj, this.f), null, 2, null);
        }
    }

    public final Object w1() {
        if (A1()) {
            return dkf.d();
        }
        Object b = suf.b(v0());
        if (!(b instanceof fa4)) {
            return b;
        }
        throw ((fa4) b).f19137a;
    }
}
