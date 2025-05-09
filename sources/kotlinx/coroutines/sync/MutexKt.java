package kotlinx.coroutines.sync;

import tb.ofj;
import tb.u1r;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public final class MutexKt {

    /* renamed from: a  reason: collision with root package name */
    public static final u1r f15397a = new u1r("NO_OWNER");
    public static final u1r b = new u1r("ALREADY_LOCKED_BY_OWNER");

    public static final ofj a(boolean z) {
        return new MutexImpl(z);
    }

    public static /* synthetic */ ofj b(boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return a(z);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final <T> java.lang.Object c(tb.ofj r4, java.lang.Object r5, tb.d1a<? extends T> r6, tb.ar4<? super T> r7) {
        /*
            boolean r0 = r7 instanceof kotlinx.coroutines.sync.MutexKt$withLock$1
            if (r0 == 0) goto L_0x0013
            r0 = r7
            kotlinx.coroutines.sync.MutexKt$withLock$1 r0 = (kotlinx.coroutines.sync.MutexKt$withLock$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            kotlinx.coroutines.sync.MutexKt$withLock$1 r0 = new kotlinx.coroutines.sync.MutexKt$withLock$1
            r0.<init>(r7)
        L_0x0018:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = tb.dkf.d()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x003c
            if (r2 != r3) goto L_0x0034
            java.lang.Object r4 = r0.L$2
            r6 = r4
            tb.d1a r6 = (tb.d1a) r6
            java.lang.Object r5 = r0.L$1
            java.lang.Object r4 = r0.L$0
            tb.ofj r4 = (tb.ofj) r4
            kotlin.b.b(r7)
            goto L_0x004e
        L_0x0034:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x003c:
            kotlin.b.b(r7)
            r0.L$0 = r4
            r0.L$1 = r5
            r0.L$2 = r6
            r0.label = r3
            java.lang.Object r7 = r4.b(r5, r0)
            if (r7 != r1) goto L_0x004e
            return r1
        L_0x004e:
            java.lang.Object r6 = r6.invoke()     // Catch: all -> 0x0056
            r4.unlock(r5)
            return r6
        L_0x0056:
            r6 = move-exception
            r4.unlock(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.sync.MutexKt.c(tb.ofj, java.lang.Object, tb.d1a, tb.ar4):java.lang.Object");
    }
}
