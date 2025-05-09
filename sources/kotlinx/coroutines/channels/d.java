package kotlinx.coroutines.channels;

import tb.g1a;
import tb.xhv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public final class d {
    public static final <E> c<E> a(int i, BufferOverflow bufferOverflow, g1a<? super E, xhv> g1aVar) {
        c<E> fVar;
        if (i != -2) {
            if (i != -1) {
                if (i != 0) {
                    if (i == Integer.MAX_VALUE) {
                        return new BufferedChannel(Integer.MAX_VALUE, g1aVar);
                    }
                    if (bufferOverflow == BufferOverflow.SUSPEND) {
                        return new BufferedChannel(i, g1aVar);
                    }
                    return new f(i, bufferOverflow, g1aVar);
                } else if (bufferOverflow == BufferOverflow.SUSPEND) {
                    fVar = new BufferedChannel<>(0, g1aVar);
                } else {
                    fVar = new f<>(1, bufferOverflow, g1aVar);
                }
            } else if (bufferOverflow == BufferOverflow.SUSPEND) {
                return new f(1, BufferOverflow.DROP_OLDEST, g1aVar);
            } else {
                throw new IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow");
            }
        } else if (bufferOverflow == BufferOverflow.SUSPEND) {
            fVar = new BufferedChannel<>(c.Factory.a(), g1aVar);
        } else {
            fVar = new f<>(1, bufferOverflow, g1aVar);
        }
        return fVar;
    }

    public static /* synthetic */ c b(int i, BufferOverflow bufferOverflow, g1a g1aVar, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        if ((i2 & 2) != 0) {
            bufferOverflow = BufferOverflow.SUSPEND;
        }
        if ((i2 & 4) != 0) {
            g1aVar = null;
        }
        return a(i, bufferOverflow, g1aVar);
    }
}
