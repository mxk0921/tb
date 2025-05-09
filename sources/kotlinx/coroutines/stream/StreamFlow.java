package kotlinx.coroutines.stream;

import com.alipay.android.msp.framework.dynfun.TplMsg;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.stream.Stream;
import kotlin.Metadata;
import kotlin.jvm.Volatile;
import tb.qp9;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\n\u001a\u00020\t2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H\u0096@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\fR\u000b\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000f"}, d2 = {"Lkotlinx/coroutines/stream/StreamFlow;", "T", "Ltb/qp9;", "Ljava/util/stream/Stream;", "stream", "<init>", "(Ljava/util/stream/Stream;)V", "Ltb/sp9;", "collector", "Ltb/xhv;", "a", "(Ltb/sp9;Ltb/ar4;)Ljava/lang/Object;", "Ljava/util/stream/Stream;", "Ltb/qg1;", "consumed", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
final class StreamFlow<T> implements qp9<T> {
    private static final AtomicIntegerFieldUpdater c = AtomicIntegerFieldUpdater.newUpdater(StreamFlow.class, TplMsg.VALUE_T_NATIVE_RETURN);

    /* renamed from: a  reason: collision with root package name */
    private final Stream<T> f15394a;
    @Volatile
    private volatile int b = 0;

    public StreamFlow(Stream<T> stream) {
        this.f15394a = stream;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005c A[Catch: all -> 0x0036, TRY_LEAVE, TryCatch #0 {all -> 0x0036, blocks: (B:12:0x0031, B:21:0x0056, B:23:0x005c), top: B:34:0x0031 }] */
    @Override // tb.qp9, tb.t23
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object a(tb.sp9<? super T> r7, tb.ar4<? super tb.xhv> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof kotlinx.coroutines.stream.StreamFlow$collect$1
            if (r0 == 0) goto L_0x0013
            r0 = r8
            kotlinx.coroutines.stream.StreamFlow$collect$1 r0 = (kotlinx.coroutines.stream.StreamFlow$collect$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            kotlinx.coroutines.stream.StreamFlow$collect$1 r0 = new kotlinx.coroutines.stream.StreamFlow$collect$1
            r0.<init>(r6, r8)
        L_0x0018:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = tb.dkf.d()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0040
            if (r2 != r3) goto L_0x0038
            java.lang.Object r7 = r0.L$2
            java.util.Iterator r7 = (java.util.Iterator) r7
            java.lang.Object r2 = r0.L$1
            tb.sp9 r2 = (tb.sp9) r2
            java.lang.Object r4 = r0.L$0
            kotlinx.coroutines.stream.StreamFlow r4 = (kotlinx.coroutines.stream.StreamFlow) r4
            kotlin.b.b(r8)     // Catch: all -> 0x0036
            r8 = r2
            goto L_0x0056
        L_0x0036:
            r7 = move-exception
            goto L_0x0079
        L_0x0038:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x0040:
            kotlin.b.b(r8)
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r8 = kotlinx.coroutines.stream.StreamFlow.c
            r2 = 0
            boolean r8 = r8.compareAndSet(r6, r2, r3)
            if (r8 == 0) goto L_0x007f
            java.util.stream.Stream<T> r8 = r6.f15394a     // Catch: all -> 0x0077
            java.util.Iterator r8 = tb.fpq.a(r8)     // Catch: all -> 0x0077
            r4 = r6
            r5 = r8
            r8 = r7
            r7 = r5
        L_0x0056:
            boolean r2 = r7.hasNext()     // Catch: all -> 0x0036
            if (r2 == 0) goto L_0x006f
            java.lang.Object r2 = r7.next()     // Catch: all -> 0x0036
            r0.L$0 = r4     // Catch: all -> 0x0036
            r0.L$1 = r8     // Catch: all -> 0x0036
            r0.L$2 = r7     // Catch: all -> 0x0036
            r0.label = r3     // Catch: all -> 0x0036
            java.lang.Object r2 = r8.emit(r2, r0)     // Catch: all -> 0x0036
            if (r2 != r1) goto L_0x0056
            return r1
        L_0x006f:
            java.util.stream.Stream<T> r7 = r4.f15394a
            tb.gpq.a(r7)
            tb.xhv r7 = tb.xhv.INSTANCE
            return r7
        L_0x0077:
            r7 = move-exception
            r4 = r6
        L_0x0079:
            java.util.stream.Stream<T> r8 = r4.f15394a
            tb.gpq.a(r8)
            throw r7
        L_0x007f:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "Stream.consumeAsFlow can be collected only once"
            r7.<init>(r8)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.stream.StreamFlow.a(tb.sp9, tb.ar4):java.lang.Object");
    }
}
