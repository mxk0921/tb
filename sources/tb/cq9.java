package tb;

import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.d;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.m;
import tb.o2a;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public final /* synthetic */ class cq9 {
    public static final <T> qp9<T> a(qp9<? extends T> qp9Var, int i, BufferOverflow bufferOverflow) {
        BufferOverflow bufferOverflow2;
        int i2;
        if (i < 0 && i != -2 && i != -1) {
            throw new IllegalArgumentException(("Buffer size should be non-negative, BUFFERED, or CONFLATED, but was " + i).toString());
        } else if (i != -1 || bufferOverflow == BufferOverflow.SUSPEND) {
            if (i == -1) {
                bufferOverflow2 = BufferOverflow.DROP_OLDEST;
                i2 = 0;
            } else {
                i2 = i;
                bufferOverflow2 = bufferOverflow;
            }
            if (qp9Var instanceof o2a) {
                return o2a.a.a((o2a) qp9Var, null, i2, bufferOverflow2, 1, null);
            }
            return new qi3(qp9Var, null, i2, bufferOverflow2, 2, null);
        } else {
            throw new IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow");
        }
    }

    public static /* synthetic */ qp9 b(qp9 qp9Var, int i, BufferOverflow bufferOverflow, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = -2;
        }
        if ((i2 & 2) != 0) {
            bufferOverflow = BufferOverflow.SUSPEND;
        }
        return yp9.b(qp9Var, i, bufferOverflow);
    }

    public static final void c(d dVar) {
        if (dVar.get(m.Key) != null) {
            throw new IllegalArgumentException(("Flow context cannot contain job in it. Had " + dVar).toString());
        }
    }

    public static final <T> qp9<T> d(qp9<? extends T> qp9Var) {
        qp9<T> b;
        b = b(qp9Var, -1, null, 2, null);
        return b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> qp9<T> e(qp9<? extends T> qp9Var, d dVar) {
        c(dVar);
        if (ckf.b(dVar, EmptyCoroutineContext.INSTANCE)) {
            return qp9Var;
        }
        if (qp9Var instanceof o2a) {
            return o2a.a.a((o2a) qp9Var, dVar, 0, null, 6, null);
        }
        return new qi3(qp9Var, dVar, 0, null, 12, null);
    }
}
