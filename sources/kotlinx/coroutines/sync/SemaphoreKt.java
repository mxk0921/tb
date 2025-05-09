package kotlinx.coroutines.sync;

import tb.q3r;
import tb.u1r;
import tb.y9p;
import tb.z9p;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public final class SemaphoreKt {

    /* renamed from: a  reason: collision with root package name */
    public static final int f15399a;
    public static final u1r b = new u1r("PERMIT");
    public static final u1r c = new u1r("TAKEN");
    public static final u1r d = new u1r("BROKEN");
    public static final u1r e = new u1r("CANCELLED");
    public static final int f;

    static {
        int e2;
        int e3;
        e2 = q3r.e("kotlinx.coroutines.semaphore.maxSpinCycles", 100, 0, 0, 12, null);
        f15399a = e2;
        e3 = q3r.e("kotlinx.coroutines.semaphore.segmentSize", 16, 0, 0, 12, null);
        f = e3;
    }

    public static final y9p a(int i, int i2) {
        return new SemaphoreImpl(i, i2);
    }

    public static /* synthetic */ y9p b(int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        return a(i, i2);
    }

    public static final z9p j(long j, z9p z9pVar) {
        return new z9p(j, z9pVar, 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final <T> java.lang.Object k(tb.y9p r4, tb.d1a<? extends T> r5, tb.ar4<? super T> r6) {
        /*
            boolean r0 = r6 instanceof kotlinx.coroutines.sync.SemaphoreKt$withPermit$1
            if (r0 == 0) goto L_0x0013
            r0 = r6
            kotlinx.coroutines.sync.SemaphoreKt$withPermit$1 r0 = (kotlinx.coroutines.sync.SemaphoreKt$withPermit$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            kotlinx.coroutines.sync.SemaphoreKt$withPermit$1 r0 = new kotlinx.coroutines.sync.SemaphoreKt$withPermit$1
            r0.<init>(r6)
        L_0x0018:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = tb.dkf.d()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x003a
            if (r2 != r3) goto L_0x0032
            java.lang.Object r4 = r0.L$1
            r5 = r4
            tb.d1a r5 = (tb.d1a) r5
            java.lang.Object r4 = r0.L$0
            tb.y9p r4 = (tb.y9p) r4
            kotlin.b.b(r6)
            goto L_0x004a
        L_0x0032:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x003a:
            kotlin.b.b(r6)
            r0.L$0 = r4
            r0.L$1 = r5
            r0.label = r3
            java.lang.Object r6 = r4.a(r0)
            if (r6 != r1) goto L_0x004a
            return r1
        L_0x004a:
            java.lang.Object r5 = r5.invoke()     // Catch: all -> 0x0052
            r4.release()
            return r5
        L_0x0052:
            r5 = move-exception
            r4.release()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.sync.SemaphoreKt.k(tb.y9p, tb.d1a, tb.ar4):java.lang.Object");
    }
}
