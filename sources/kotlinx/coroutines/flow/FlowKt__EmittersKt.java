package kotlinx.coroutines.flow;

import tb.sp9;
import tb.wst;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public final /* synthetic */ class FlowKt__EmittersKt {
    public static final void b(sp9<?> sp9Var) {
        if (sp9Var instanceof wst) {
            throw ((wst) sp9Var).f30905a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0038  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final <T> java.lang.Object c(tb.sp9<? super T> r4, tb.w1a<? super tb.sp9<? super T>, ? super java.lang.Throwable, ? super tb.ar4<? super tb.xhv>, ? extends java.lang.Object> r5, java.lang.Throwable r6, tb.ar4<? super tb.xhv> r7) {
        /*
            boolean r0 = r7 instanceof kotlinx.coroutines.flow.FlowKt__EmittersKt$invokeSafely$1
            if (r0 == 0) goto L_0x0013
            r0 = r7
            kotlinx.coroutines.flow.FlowKt__EmittersKt$invokeSafely$1 r0 = (kotlinx.coroutines.flow.FlowKt__EmittersKt$invokeSafely$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            kotlinx.coroutines.flow.FlowKt__EmittersKt$invokeSafely$1 r0 = new kotlinx.coroutines.flow.FlowKt__EmittersKt$invokeSafely$1
            r0.<init>(r7)
        L_0x0018:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = tb.dkf.d()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0038
            if (r2 != r3) goto L_0x0030
            java.lang.Object r4 = r0.L$0
            r6 = r4
            java.lang.Throwable r6 = (java.lang.Throwable) r6
            kotlin.b.b(r7)     // Catch: all -> 0x002e
            goto L_0x0046
        L_0x002e:
            r4 = move-exception
            goto L_0x0049
        L_0x0030:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x0038:
            kotlin.b.b(r7)
            r0.L$0 = r6     // Catch: all -> 0x002e
            r0.label = r3     // Catch: all -> 0x002e
            java.lang.Object r4 = r5.invoke(r4, r6, r0)     // Catch: all -> 0x002e
            if (r4 != r1) goto L_0x0046
            return r1
        L_0x0046:
            tb.xhv r4 = tb.xhv.INSTANCE
            return r4
        L_0x0049:
            if (r6 == 0) goto L_0x0050
            if (r6 == r4) goto L_0x0050
            tb.sm8.a(r4, r6)
        L_0x0050:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__EmittersKt.c(tb.sp9, tb.w1a, java.lang.Throwable, tb.ar4):java.lang.Object");
    }
}
