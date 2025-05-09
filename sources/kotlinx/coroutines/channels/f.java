package kotlinx.coroutines.channels;

import kotlinx.coroutines.channels.e;
import kotlinx.coroutines.internal.OnUndeliveredElementKt;
import kotlinx.coroutines.internal.UndeliveredElementException;
import tb.a07;
import tb.ar4;
import tb.dun;
import tb.g1a;
import tb.gk2;
import tb.k9p;
import tb.ns3;
import tb.qww;
import tb.sm8;
import tb.u1r;
import tb.xhv;
import tb.zi3;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class f<E> extends BufferedChannel<E> {
    public final BufferOverflow v;

    public /* synthetic */ f(int i, BufferOverflow bufferOverflow, g1a g1aVar, int i2, a07 a07Var) {
        this(i, bufferOverflow, (i2 & 4) != 0 ? null : g1aVar);
    }

    public static /* synthetic */ <E> Object L1(f<E> fVar, E e, ar4<? super xhv> ar4Var) {
        UndeliveredElementException d;
        Object P1 = fVar.P1(e, true);
        if (!(P1 instanceof e.a)) {
            return xhv.INSTANCE;
        }
        e.c(P1);
        g1a<E, xhv> g1aVar = fVar.b;
        if (g1aVar == null || (d = OnUndeliveredElementKt.d(g1aVar, e, null, 2, null)) == null) {
            throw fVar.m0();
        }
        sm8.a(d, fVar.m0());
        throw d;
    }

    public static /* synthetic */ <E> Object M1(f<E> fVar, E e, ar4<? super Boolean> ar4Var) {
        Object P1 = fVar.P1(e, true);
        if (P1 instanceof e.c) {
            return gk2.a(false);
        }
        xhv xhvVar = (xhv) P1;
        return gk2.a(true);
    }

    public final Object N1(E e, boolean z) {
        g1a<E, xhv> g1aVar;
        UndeliveredElementException d;
        Object m = super.m(e);
        if (e.h(m) || e.g(m)) {
            return m;
        }
        if (!z || (g1aVar = this.b) == null || (d = OnUndeliveredElementKt.d(g1aVar, e, null, 2, null)) == null) {
            e.b bVar = e.Companion;
            xhv xhvVar = xhv.INSTANCE;
            bVar.b(xhvVar);
            return xhvVar;
        }
        throw d;
    }

    public final Object O1(E e) {
        zi3 zi3Var;
        qww qwwVar;
        u1r u1rVar = BufferedChannelKt.BUFFERED;
        zi3 zi3Var2 = (zi3) BufferedChannel.q.get(this);
        while (true) {
            long andIncrement = BufferedChannel.m.getAndIncrement(this);
            long j = andIncrement & 1152921504606846975L;
            boolean y0 = y0(andIncrement);
            long j2 = BufferedChannelKt.SEGMENT_SIZE;
            long j3 = j / j2;
            int i = (int) (j % j2);
            if (zi3Var2.e != j3) {
                zi3 a0 = a0(j3, zi3Var2);
                if (a0 != null) {
                    zi3Var = a0;
                } else if (y0) {
                    break;
                }
            } else {
                zi3Var = zi3Var2;
            }
            int G1 = G1(zi3Var, i, e, j, u1rVar, y0);
            if (G1 == 0) {
                zi3Var.b();
                e.b bVar = e.Companion;
                xhv xhvVar = xhv.INSTANCE;
                bVar.b(xhvVar);
                return xhvVar;
            } else if (G1 == 1) {
                e.b bVar2 = e.Companion;
                xhv xhvVar2 = xhv.INSTANCE;
                bVar2.b(xhvVar2);
                return xhvVar2;
            } else if (G1 != 2) {
                if (G1 == 3) {
                    throw new IllegalStateException("unexpected");
                } else if (G1 != 4) {
                    if (G1 == 5) {
                        zi3Var.b();
                    }
                    zi3Var2 = zi3Var;
                } else if (j < l0()) {
                    zi3Var.b();
                }
            } else if (y0) {
                zi3Var.p();
            } else {
                if (u1rVar instanceof qww) {
                    qwwVar = (qww) u1rVar;
                } else {
                    qwwVar = null;
                }
                if (qwwVar != null) {
                    V0(qwwVar, zi3Var, i);
                }
                W((zi3Var.e * j2) + i);
                e.b bVar3 = e.Companion;
                xhv xhvVar3 = xhv.INSTANCE;
                bVar3.b(xhvVar3);
                return xhvVar3;
            }
        }
        return e.Companion.a(m0());
    }

    public final Object P1(E e, boolean z) {
        if (this.v == BufferOverflow.DROP_LATEST) {
            return N1(e, z);
        }
        return O1(e);
    }

    @Override // kotlinx.coroutines.channels.BufferedChannel, kotlinx.coroutines.channels.i
    public Object d(E e, ar4<? super xhv> ar4Var) {
        return L1(this, e, ar4Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.coroutines.channels.BufferedChannel
    public void k1(k9p<?> k9pVar, Object obj) {
        Object m = m(obj);
        if (!(m instanceof e.c)) {
            xhv xhvVar = (xhv) m;
            k9pVar.b(xhv.INSTANCE);
        } else if (m instanceof e.a) {
            e.c(m);
            k9pVar.b(BufferedChannelKt.z());
        } else {
            throw new IllegalStateException("unreachable");
        }
    }

    @Override // kotlinx.coroutines.channels.BufferedChannel, kotlinx.coroutines.channels.i
    public Object m(E e) {
        return P1(e, false);
    }

    @Override // kotlinx.coroutines.channels.BufferedChannel
    public Object q1(E e, ar4<? super Boolean> ar4Var) {
        return M1(this, e, ar4Var);
    }

    @Override // kotlinx.coroutines.channels.BufferedChannel
    public boolean x1() {
        return false;
    }

    @Override // kotlinx.coroutines.channels.BufferedChannel
    public boolean z0() {
        if (this.v == BufferOverflow.DROP_OLDEST) {
            return true;
        }
        return false;
    }

    public f(int i, BufferOverflow bufferOverflow, g1a<? super E, xhv> g1aVar) {
        super(i, g1aVar);
        this.v = bufferOverflow;
        if (bufferOverflow == BufferOverflow.SUSPEND) {
            throw new IllegalArgumentException(("This implementation does not support suspension for senders, use " + ((ns3) dun.b(BufferedChannel.class)).getSimpleName() + " instead").toString());
        } else if (i < 1) {
            throw new IllegalArgumentException(("Buffered channel capacity must be at least 1, but " + i + " was specified").toString());
        }
    }
}
