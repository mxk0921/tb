package kotlinx.coroutines.flow;

import kotlin.coroutines.d;
import kotlinx.coroutines.m;
import tb.ckf;
import tb.dv6;
import tb.rgq;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public final /* synthetic */ class FlowKt__ErrorsKt {
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0037  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final <T> java.lang.Object a(tb.qp9<? extends T> r4, tb.sp9<? super T> r5, tb.ar4<? super java.lang.Throwable> r6) {
        /*
            boolean r0 = r6 instanceof kotlinx.coroutines.flow.FlowKt__ErrorsKt$catchImpl$1
            if (r0 == 0) goto L_0x0013
            r0 = r6
            kotlinx.coroutines.flow.FlowKt__ErrorsKt$catchImpl$1 r0 = (kotlinx.coroutines.flow.FlowKt__ErrorsKt$catchImpl$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            kotlinx.coroutines.flow.FlowKt__ErrorsKt$catchImpl$1 r0 = new kotlinx.coroutines.flow.FlowKt__ErrorsKt$catchImpl$1
            r0.<init>(r6)
        L_0x0018:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = tb.dkf.d()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0037
            if (r2 != r3) goto L_0x002f
            java.lang.Object r4 = r0.L$0
            kotlin.jvm.internal.Ref$ObjectRef r4 = (kotlin.jvm.internal.Ref$ObjectRef) r4
            kotlin.b.b(r6)     // Catch: all -> 0x002d
            goto L_0x004f
        L_0x002d:
            r5 = move-exception
            goto L_0x0053
        L_0x002f:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x0037:
            kotlin.b.b(r6)
            kotlin.jvm.internal.Ref$ObjectRef r6 = new kotlin.jvm.internal.Ref$ObjectRef
            r6.<init>()
            kotlinx.coroutines.flow.FlowKt__ErrorsKt$catchImpl$2 r2 = new kotlinx.coroutines.flow.FlowKt__ErrorsKt$catchImpl$2     // Catch: all -> 0x0051
            r2.<init>(r5, r6)     // Catch: all -> 0x0051
            r0.L$0 = r6     // Catch: all -> 0x0051
            r0.label = r3     // Catch: all -> 0x0051
            java.lang.Object r4 = r4.a(r2, r0)     // Catch: all -> 0x0051
            if (r4 != r1) goto L_0x004f
            return r1
        L_0x004f:
            r4 = 0
            return r4
        L_0x0051:
            r5 = move-exception
            r4 = r6
        L_0x0053:
            T r4 = r4.element
            java.lang.Throwable r4 = (java.lang.Throwable) r4
            boolean r6 = c(r5, r4)
            if (r6 != 0) goto L_0x0076
            kotlin.coroutines.d r6 = r0.getContext()
            boolean r6 = b(r5, r6)
            if (r6 != 0) goto L_0x0076
            if (r4 != 0) goto L_0x006a
            return r5
        L_0x006a:
            boolean r6 = r5 instanceof java.util.concurrent.CancellationException
            if (r6 == 0) goto L_0x0072
            tb.sm8.a(r4, r5)
            throw r4
        L_0x0072:
            tb.sm8.a(r5, r4)
            throw r5
        L_0x0076:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__ErrorsKt.a(tb.qp9, tb.sp9, tb.ar4):java.lang.Object");
    }

    public static final boolean b(Throwable th, d dVar) {
        m mVar = (m) dVar.get(m.Key);
        if (mVar == null || !mVar.isCancelled()) {
            return false;
        }
        return c(th, mVar.u0());
    }

    public static final boolean c(Throwable th, Throwable th2) {
        if (th2 != null) {
            if (dv6.c()) {
                th2 = rgq.l(th2);
            }
            if (dv6.c()) {
                th = rgq.l(th);
            }
            if (ckf.b(th2, th)) {
                return true;
            }
        }
        return false;
    }
}
