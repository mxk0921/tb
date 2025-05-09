package kotlinx.coroutines;

import tb.ar4;
import tb.pgv;
import tb.quf;
import tb.u1a;
import tb.uu4;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public final class TimeoutKt {
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0016, code lost:
        if (r4 == null) goto L_0x0018;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final kotlinx.coroutines.TimeoutCancellationException a(long r2, kotlinx.coroutines.h r4, kotlinx.coroutines.m r5) {
        /*
            boolean r0 = r4 instanceof tb.ka7
            if (r0 == 0) goto L_0x0007
            tb.ka7 r4 = (tb.ka7) r4
            goto L_0x0008
        L_0x0007:
            r4 = 0
        L_0x0008:
            if (r4 == 0) goto L_0x0018
            tb.s08$a r0 = tb.s08.Companion
            kotlin.time.DurationUnit r0 = kotlin.time.DurationUnit.MILLISECONDS
            long r0 = tb.w08.p(r2, r0)
            java.lang.String r4 = r4.w(r0)
            if (r4 != 0) goto L_0x002b
        L_0x0018:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r0 = "Timed out waiting for "
            r4.<init>(r0)
            r4.append(r2)
            java.lang.String r2 = " ms"
            r4.append(r2)
            java.lang.String r4 = r4.toString()
        L_0x002b:
            kotlinx.coroutines.TimeoutCancellationException r2 = new kotlinx.coroutines.TimeoutCancellationException
            r2.<init>(r4, r5)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.TimeoutKt.a(long, kotlinx.coroutines.h, kotlinx.coroutines.m):kotlinx.coroutines.TimeoutCancellationException");
    }

    public static final <U, T extends U> Object b(p<U, ? super T> pVar, u1a<? super uu4, ? super ar4<? super T>, ? extends Object> u1aVar) {
        quf.e(pVar, DelayKt.c(pVar.f.getContext()).b(pVar.g, pVar, pVar.getContext()));
        return pgv.d(pVar, pVar, u1aVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0076 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0077  */
    /* JADX WARN: Type inference failed for: r2v1, types: [T, kotlinx.coroutines.p] */
    /* JADX WARN: Unknown variable types count: 1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final <T> java.lang.Object c(long r7, tb.u1a<? super tb.uu4, ? super tb.ar4<? super T>, ? extends java.lang.Object> r9, tb.ar4<? super T> r10) {
        /*
            boolean r0 = r10 instanceof kotlinx.coroutines.TimeoutKt$withTimeoutOrNull$1
            if (r0 == 0) goto L_0x0013
            r0 = r10
            kotlinx.coroutines.TimeoutKt$withTimeoutOrNull$1 r0 = (kotlinx.coroutines.TimeoutKt$withTimeoutOrNull$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            kotlinx.coroutines.TimeoutKt$withTimeoutOrNull$1 r0 = new kotlinx.coroutines.TimeoutKt$withTimeoutOrNull$1
            r0.<init>(r10)
        L_0x0018:
            java.lang.Object r10 = r0.result
            java.lang.Object r1 = tb.dkf.d()
            int r2 = r0.label
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L_0x003c
            if (r2 != r4) goto L_0x0034
            java.lang.Object r7 = r0.L$1
            kotlin.jvm.internal.Ref$ObjectRef r7 = (kotlin.jvm.internal.Ref$ObjectRef) r7
            java.lang.Object r8 = r0.L$0
            tb.u1a r8 = (tb.u1a) r8
            kotlin.b.b(r10)     // Catch: TimeoutCancellationException -> 0x0032
            goto L_0x006f
        L_0x0032:
            r8 = move-exception
            goto L_0x0070
        L_0x0034:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x003c:
            kotlin.b.b(r10)
            r5 = 0
            int r10 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r10 > 0) goto L_0x0046
            return r3
        L_0x0046:
            kotlin.jvm.internal.Ref$ObjectRef r10 = new kotlin.jvm.internal.Ref$ObjectRef
            r10.<init>()
            r0.L$0 = r9     // Catch: TimeoutCancellationException -> 0x0068
            r0.L$1 = r10     // Catch: TimeoutCancellationException -> 0x0068
            r0.J$0 = r7     // Catch: TimeoutCancellationException -> 0x0068
            r0.label = r4     // Catch: TimeoutCancellationException -> 0x0068
            kotlinx.coroutines.p r2 = new kotlinx.coroutines.p     // Catch: TimeoutCancellationException -> 0x0068
            r2.<init>(r7, r0)     // Catch: TimeoutCancellationException -> 0x0068
            r10.element = r2     // Catch: TimeoutCancellationException -> 0x0068
            java.lang.Object r7 = b(r2, r9)     // Catch: TimeoutCancellationException -> 0x0068
            java.lang.Object r8 = tb.dkf.d()     // Catch: TimeoutCancellationException -> 0x0068
            if (r7 != r8) goto L_0x006b
            tb.jv6.c(r0)     // Catch: TimeoutCancellationException -> 0x0068
            goto L_0x006b
        L_0x0068:
            r8 = move-exception
            r7 = r10
            goto L_0x0070
        L_0x006b:
            if (r7 != r1) goto L_0x006e
            return r1
        L_0x006e:
            r10 = r7
        L_0x006f:
            return r10
        L_0x0070:
            kotlinx.coroutines.m r9 = r8.coroutine
            T r7 = r7.element
            if (r9 != r7) goto L_0x0077
            return r3
        L_0x0077:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.TimeoutKt.c(long, tb.u1a, tb.ar4):java.lang.Object");
    }
}
