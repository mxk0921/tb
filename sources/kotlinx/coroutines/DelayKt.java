package kotlinx.coroutines;

import kotlin.coroutines.c;
import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import tb.ar4;
import tb.dkf;
import tb.hfn;
import tb.jv6;
import tb.s08;
import tb.t07;
import tb.xhv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public final class DelayKt {
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(tb.ar4<?> r4) {
        /*
            boolean r0 = r4 instanceof kotlinx.coroutines.DelayKt$awaitCancellation$1
            if (r0 == 0) goto L_0x0013
            r0 = r4
            kotlinx.coroutines.DelayKt$awaitCancellation$1 r0 = (kotlinx.coroutines.DelayKt$awaitCancellation$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            kotlinx.coroutines.DelayKt$awaitCancellation$1 r0 = new kotlinx.coroutines.DelayKt$awaitCancellation$1
            r0.<init>(r4)
        L_0x0018:
            java.lang.Object r4 = r0.result
            java.lang.Object r1 = tb.dkf.d()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 == r3) goto L_0x002d
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r0)
            throw r4
        L_0x002d:
            kotlin.b.b(r4)
            goto L_0x0052
        L_0x0031:
            kotlin.b.b(r4)
            r0.label = r3
            kotlinx.coroutines.c r4 = new kotlinx.coroutines.c
            tb.ar4 r2 = kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.c(r0)
            r4.<init>(r2, r3)
            r4.E()
            java.lang.Object r4 = r4.A()
            java.lang.Object r2 = tb.dkf.d()
            if (r4 != r2) goto L_0x004f
            tb.jv6.c(r0)
        L_0x004f:
            if (r4 != r1) goto L_0x0052
            return r1
        L_0x0052:
            kotlin.KotlinNothingValueException r4 = new kotlin.KotlinNothingValueException
            r4.<init>()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.DelayKt.a(tb.ar4):java.lang.Object");
    }

    public static final Object b(long j, ar4<? super xhv> ar4Var) {
        if (j <= 0) {
            return xhv.INSTANCE;
        }
        c cVar = new c(IntrinsicsKt__IntrinsicsJvmKt.c(ar4Var), 1);
        cVar.E();
        if (j < Long.MAX_VALUE) {
            c(cVar.getContext()).c(j, cVar);
        }
        Object A = cVar.A();
        if (A == dkf.d()) {
            jv6.c(ar4Var);
        }
        if (A == dkf.d()) {
            return A;
        }
        return xhv.INSTANCE;
    }

    public static final h c(d dVar) {
        h hVar;
        d.b bVar = dVar.get(c.Key);
        if (bVar instanceof h) {
            hVar = (h) bVar;
        } else {
            hVar = null;
        }
        if (hVar == null) {
            return t07.a();
        }
        return hVar;
    }

    public static final long d(long j) {
        if (s08.i(j, s08.Companion.c()) > 0) {
            return hfn.d(s08.v(j), 1L);
        }
        return 0L;
    }
}
