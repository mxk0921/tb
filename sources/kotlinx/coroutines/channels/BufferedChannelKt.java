package kotlinx.coroutines.channels;

import tb.g1a;
import tb.q23;
import tb.q3r;
import tb.u1r;
import tb.xhv;
import tb.zi3;
import tb.zyf;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public final class BufferedChannelKt {
    public static final int SEGMENT_SIZE;
    public static final int b;

    /* renamed from: a  reason: collision with root package name */
    public static final zi3<Object> f15254a = new zi3<>(-1, null, null, 0);
    public static final u1r BUFFERED = new u1r("BUFFERED");
    public static final u1r c = new u1r("SHOULD_BUFFER");
    public static final u1r d = new u1r("S_RESUMING_BY_RCV");
    public static final u1r e = new u1r("RESUMING_BY_EB");
    public static final u1r f = new u1r("POISONED");
    public static final u1r g = new u1r("DONE_RCV");
    public static final u1r h = new u1r("INTERRUPTED_SEND");
    public static final u1r i = new u1r("INTERRUPTED_RCV");
    public static final u1r j = new u1r("CHANNEL_CLOSED");
    public static final u1r k = new u1r("SUSPEND");
    public static final u1r l = new u1r("SUSPEND_NO_WAITER");
    public static final u1r m = new u1r("FAILED");
    public static final u1r n = new u1r("NO_RECEIVE_RESULT");
    public static final u1r o = new u1r("CLOSE_HANDLER_CLOSED");
    public static final u1r p = new u1r("CLOSE_HANDLER_INVOKED");
    public static final u1r q = new u1r("NO_CLOSE_CAUSE");

    static {
        int e2;
        int e3;
        e2 = q3r.e("kotlinx.coroutines.bufferedChannel.segmentSize", 32, 0, 0, 12, null);
        SEGMENT_SIZE = e2;
        e3 = q3r.e("kotlinx.coroutines.bufferedChannel.expandBufferCompletionWaitIterations", 10000, 0, 0, 12, null);
        b = e3;
    }

    public static final long A(int i2) {
        if (i2 == 0) {
            return 0L;
        }
        if (i2 != Integer.MAX_VALUE) {
            return i2;
        }
        return Long.MAX_VALUE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> boolean B(q23<? super T> q23Var, T t, g1a<? super Throwable, xhv> g1aVar) {
        Object q2 = q23Var.q(t, null, g1aVar);
        if (q2 == null) {
            return false;
        }
        q23Var.p(q2);
        return true;
    }

    public static /* synthetic */ boolean C(q23 q23Var, Object obj, g1a g1aVar, int i2, Object obj2) {
        if ((i2 & 2) != 0) {
            g1aVar = null;
        }
        return B(q23Var, obj, g1aVar);
    }

    public static final long v(long j2, boolean z) {
        long j3;
        if (z) {
            j3 = 4611686018427387904L;
        } else {
            j3 = 0;
        }
        return j3 + j2;
    }

    public static final long w(long j2, int i2) {
        return (i2 << 60) + j2;
    }

    public static final <E> zi3<E> x(long j2, zi3<E> zi3Var) {
        return new zi3<>(j2, zi3Var, zi3Var.u(), 0);
    }

    public static final <E> zyf<zi3<E>> y() {
        return BufferedChannelKt$createSegmentFunction$1.INSTANCE;
    }

    public static final u1r z() {
        return j;
    }
}
