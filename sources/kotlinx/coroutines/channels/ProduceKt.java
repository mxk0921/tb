package kotlinx.coroutines.channels;

import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.d;
import kotlinx.coroutines.CoroutineContextKt;
import kotlinx.coroutines.CoroutineStart;
import tb.ar4;
import tb.g1a;
import tb.ozm;
import tb.u1a;
import tb.uu4;
import tb.xhv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public final class ProduceKt {
    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(tb.ozm<?> r4, tb.d1a<tb.xhv> r5, tb.ar4<? super tb.xhv> r6) {
        /*
            boolean r0 = r6 instanceof kotlinx.coroutines.channels.ProduceKt$awaitClose$1
            if (r0 == 0) goto L_0x0013
            r0 = r6
            kotlinx.coroutines.channels.ProduceKt$awaitClose$1 r0 = (kotlinx.coroutines.channels.ProduceKt$awaitClose$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            kotlinx.coroutines.channels.ProduceKt$awaitClose$1 r0 = new kotlinx.coroutines.channels.ProduceKt$awaitClose$1
            r0.<init>(r6)
        L_0x0018:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = tb.dkf.d()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x003c
            if (r2 != r3) goto L_0x0034
            java.lang.Object r4 = r0.L$1
            r5 = r4
            tb.d1a r5 = (tb.d1a) r5
            java.lang.Object r4 = r0.L$0
            tb.ozm r4 = (tb.ozm) r4
            kotlin.b.b(r6)     // Catch: all -> 0x0032
            goto L_0x0075
        L_0x0032:
            r4 = move-exception
            goto L_0x007b
        L_0x0034:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x003c:
            kotlin.b.b(r6)
            kotlin.coroutines.d r6 = r0.getContext()
            kotlinx.coroutines.m$b r2 = kotlinx.coroutines.m.Key
            kotlin.coroutines.d$b r6 = r6.get(r2)
            if (r6 != r4) goto L_0x007f
            r0.L$0 = r4     // Catch: all -> 0x0032
            r0.L$1 = r5     // Catch: all -> 0x0032
            r0.label = r3     // Catch: all -> 0x0032
            kotlinx.coroutines.c r6 = new kotlinx.coroutines.c     // Catch: all -> 0x0032
            tb.ar4 r2 = kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.c(r0)     // Catch: all -> 0x0032
            r6.<init>(r2, r3)     // Catch: all -> 0x0032
            r6.E()     // Catch: all -> 0x0032
            kotlinx.coroutines.channels.ProduceKt$awaitClose$4$1 r2 = new kotlinx.coroutines.channels.ProduceKt$awaitClose$4$1     // Catch: all -> 0x0032
            r2.<init>(r6)     // Catch: all -> 0x0032
            r4.k(r2)     // Catch: all -> 0x0032
            java.lang.Object r4 = r6.A()     // Catch: all -> 0x0032
            java.lang.Object r6 = tb.dkf.d()     // Catch: all -> 0x0032
            if (r4 != r6) goto L_0x0072
            tb.jv6.c(r0)     // Catch: all -> 0x0032
        L_0x0072:
            if (r4 != r1) goto L_0x0075
            return r1
        L_0x0075:
            r5.invoke()
            tb.xhv r4 = tb.xhv.INSTANCE
            return r4
        L_0x007b:
            r5.invoke()
            throw r4
        L_0x007f:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "awaitClose() can only be invoked from the producer context"
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ProduceKt.a(tb.ozm, tb.d1a, tb.ar4):java.lang.Object");
    }

    public static final <E> ReceiveChannel<E> b(uu4 uu4Var, d dVar, int i, BufferOverflow bufferOverflow, CoroutineStart coroutineStart, g1a<? super Throwable, xhv> g1aVar, u1a<? super ozm<? super E>, ? super ar4<? super xhv>, ? extends Object> u1aVar) {
        h hVar = new h(CoroutineContextKt.e(uu4Var, dVar), d.b(i, bufferOverflow, null, 4, null));
        if (g1aVar != null) {
            hVar.D0(g1aVar);
        }
        hVar.v1(coroutineStart, hVar, u1aVar);
        return hVar;
    }

    public static final <E> ReceiveChannel<E> c(uu4 uu4Var, d dVar, int i, u1a<? super ozm<? super E>, ? super ar4<? super xhv>, ? extends Object> u1aVar) {
        return b(uu4Var, dVar, i, BufferOverflow.SUSPEND, CoroutineStart.DEFAULT, null, u1aVar);
    }

    public static /* synthetic */ ReceiveChannel d(uu4 uu4Var, d dVar, int i, BufferOverflow bufferOverflow, CoroutineStart coroutineStart, g1a g1aVar, u1a u1aVar, int i2, Object obj) {
        int i3;
        if ((i2 & 1) != 0) {
            dVar = EmptyCoroutineContext.INSTANCE;
        }
        if ((i2 & 2) != 0) {
            i3 = 0;
        } else {
            i3 = i;
        }
        if ((i2 & 4) != 0) {
            bufferOverflow = BufferOverflow.SUSPEND;
        }
        if ((i2 & 8) != 0) {
            coroutineStart = CoroutineStart.DEFAULT;
        }
        if ((i2 & 16) != 0) {
            g1aVar = null;
        }
        return b(uu4Var, dVar, i3, bufferOverflow, coroutineStart, g1aVar, u1aVar);
    }

    public static /* synthetic */ ReceiveChannel e(uu4 uu4Var, d dVar, int i, u1a u1aVar, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            dVar = EmptyCoroutineContext.INSTANCE;
        }
        if ((i2 & 2) != 0) {
            i = 0;
        }
        return c(uu4Var, dVar, i, u1aVar);
    }
}
