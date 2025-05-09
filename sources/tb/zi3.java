package tb;

import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlinx.coroutines.channels.BufferedChannel;
import kotlinx.coroutines.channels.BufferedChannelKt;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public final class zi3<E> extends v8p<zi3<E>> {
    public final BufferedChannel<E> h;
    public final AtomicReferenceArray i = new AtomicReferenceArray(BufferedChannelKt.SEGMENT_SIZE * 2);

    public zi3(long j, zi3<E> zi3Var, BufferedChannel<E> bufferedChannel, int i) {
        super(j, zi3Var, i);
        this.h = bufferedChannel;
    }

    public final void A(int i, Object obj) {
        this.i.set((i * 2) + 1, obj);
    }

    public final void B(int i, E e) {
        z(i, e);
    }

    @Override // tb.v8p
    public int n() {
        return BufferedChannelKt.SEGMENT_SIZE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0061, code lost:
        s(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0064, code lost:
        if (r0 == false) goto L_?;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0066, code lost:
        r4 = u().b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x006c, code lost:
        if (r4 == null) goto L_?;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x006e, code lost:
        kotlinx.coroutines.internal.OnUndeliveredElementKt.b(r4, r5, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0071, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:?, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:?, code lost:
        return;
     */
    @Override // tb.v8p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void o(int r4, java.lang.Throwable r5, kotlin.coroutines.d r6) {
        /*
            r3 = this;
            int r5 = kotlinx.coroutines.channels.BufferedChannelKt.SEGMENT_SIZE
            if (r4 < r5) goto L_0x0006
            r0 = 1
            goto L_0x0007
        L_0x0006:
            r0 = 0
        L_0x0007:
            if (r0 == 0) goto L_0x000a
            int r4 = r4 - r5
        L_0x000a:
            java.lang.Object r5 = r3.v(r4)
        L_0x000e:
            java.lang.Object r1 = r3.w(r4)
            boolean r2 = r1 instanceof tb.qww
            if (r2 != 0) goto L_0x0072
            boolean r2 = r1 instanceof tb.rww
            if (r2 == 0) goto L_0x001b
            goto L_0x0072
        L_0x001b:
            tb.u1r r2 = kotlinx.coroutines.channels.BufferedChannelKt.j()
            if (r1 == r2) goto L_0x0061
            tb.u1r r2 = kotlinx.coroutines.channels.BufferedChannelKt.i()
            if (r1 != r2) goto L_0x0028
            goto L_0x0061
        L_0x0028:
            tb.u1r r2 = kotlinx.coroutines.channels.BufferedChannelKt.p()
            if (r1 == r2) goto L_0x000e
            tb.u1r r2 = kotlinx.coroutines.channels.BufferedChannelKt.q()
            if (r1 != r2) goto L_0x0035
            goto L_0x000e
        L_0x0035:
            tb.u1r r4 = kotlinx.coroutines.channels.BufferedChannelKt.f()
            if (r1 == r4) goto L_0x0060
            tb.u1r r4 = kotlinx.coroutines.channels.BufferedChannelKt.BUFFERED
            if (r1 != r4) goto L_0x0040
            goto L_0x0060
        L_0x0040:
            tb.u1r r4 = kotlinx.coroutines.channels.BufferedChannelKt.z()
            if (r1 != r4) goto L_0x0047
            return
        L_0x0047:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "unexpected state: "
            r5.<init>(r6)
            r5.append(r1)
            java.lang.String r5 = r5.toString()
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
        L_0x0060:
            return
        L_0x0061:
            r3.s(r4)
            if (r0 == 0) goto L_0x0071
            kotlinx.coroutines.channels.BufferedChannel r4 = r3.u()
            tb.g1a<E, tb.xhv> r4 = r4.b
            if (r4 == 0) goto L_0x0071
            kotlinx.coroutines.internal.OnUndeliveredElementKt.b(r4, r5, r6)
        L_0x0071:
            return
        L_0x0072:
            if (r0 == 0) goto L_0x0079
            tb.u1r r2 = kotlinx.coroutines.channels.BufferedChannelKt.j()
            goto L_0x007d
        L_0x0079:
            tb.u1r r2 = kotlinx.coroutines.channels.BufferedChannelKt.i()
        L_0x007d:
            boolean r1 = r3.r(r4, r1, r2)
            if (r1 == 0) goto L_0x000e
            r3.s(r4)
            r1 = r0 ^ 1
            r3.x(r4, r1)
            if (r0 == 0) goto L_0x0098
            kotlinx.coroutines.channels.BufferedChannel r4 = r3.u()
            tb.g1a<E, tb.xhv> r4 = r4.b
            if (r4 == 0) goto L_0x0098
            kotlinx.coroutines.internal.OnUndeliveredElementKt.b(r4, r5, r6)
        L_0x0098:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.zi3.o(int, java.lang.Throwable, kotlin.coroutines.d):void");
    }

    public final boolean r(int i, Object obj, Object obj2) {
        return yi3.a(this.i, (i * 2) + 1, obj, obj2);
    }

    public final void s(int i) {
        z(i, null);
    }

    public final Object t(int i, Object obj) {
        return this.i.getAndSet((i * 2) + 1, obj);
    }

    public final BufferedChannel<E> u() {
        BufferedChannel<E> bufferedChannel = this.h;
        ckf.d(bufferedChannel);
        return bufferedChannel;
    }

    public final E v(int i) {
        return (E) this.i.get(i * 2);
    }

    public final Object w(int i) {
        return this.i.get((i * 2) + 1);
    }

    public final void x(int i, boolean z) {
        if (z) {
            u().K1((this.e * BufferedChannelKt.SEGMENT_SIZE) + i);
        }
        p();
    }

    public final E y(int i) {
        E v = v(i);
        s(i);
        return v;
    }

    public final void z(int i, Object obj) {
        this.i.lazySet(i * 2, obj);
    }
}
