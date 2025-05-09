package kotlinx.coroutines.flow;

import kotlinx.coroutines.channels.ReceiveChannel;
import kotlinx.coroutines.flow.internal.a;
import tb.ar4;
import tb.dkf;
import tb.qp9;
import tb.sp9;
import tb.uu4;
import tb.xhv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public final /* synthetic */ class FlowKt__ChannelsKt {
    public static final <T> Object b(sp9<? super T> sp9Var, ReceiveChannel<? extends T> receiveChannel, ar4<? super xhv> ar4Var) {
        Object c = c(sp9Var, receiveChannel, true, ar4Var);
        if (c == dkf.d()) {
            return c;
        }
        return xhv.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0072 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x007f A[Catch: all -> 0x003c, TRY_LEAVE, TryCatch #0 {all -> 0x003c, blocks: (B:13:0x0036, B:19:0x0054, B:21:0x005e, B:22:0x0062, B:26:0x0077, B:28:0x007f), top: B:40:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0094  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x0091 -> B:14:0x0039). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final <T> java.lang.Object c(tb.sp9<? super T> r6, kotlinx.coroutines.channels.ReceiveChannel<? extends T> r7, boolean r8, tb.ar4<? super tb.xhv> r9) {
        /*
            boolean r0 = r9 instanceof kotlinx.coroutines.flow.FlowKt__ChannelsKt$emitAllImpl$1
            if (r0 == 0) goto L_0x0013
            r0 = r9
            kotlinx.coroutines.flow.FlowKt__ChannelsKt$emitAllImpl$1 r0 = (kotlinx.coroutines.flow.FlowKt__ChannelsKt$emitAllImpl$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            kotlinx.coroutines.flow.FlowKt__ChannelsKt$emitAllImpl$1 r0 = new kotlinx.coroutines.flow.FlowKt__ChannelsKt$emitAllImpl$1
            r0.<init>(r9)
        L_0x0018:
            java.lang.Object r9 = r0.result
            java.lang.Object r1 = tb.dkf.d()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x0058
            if (r2 == r4) goto L_0x0046
            if (r2 != r3) goto L_0x003e
            boolean r8 = r0.Z$0
            java.lang.Object r6 = r0.L$2
            kotlinx.coroutines.channels.ChannelIterator r6 = (kotlinx.coroutines.channels.ChannelIterator) r6
            java.lang.Object r7 = r0.L$1
            kotlinx.coroutines.channels.ReceiveChannel r7 = (kotlinx.coroutines.channels.ReceiveChannel) r7
            java.lang.Object r2 = r0.L$0
            tb.sp9 r2 = (tb.sp9) r2
            kotlin.b.b(r9)     // Catch: all -> 0x003c
        L_0x0039:
            r9 = r6
            r6 = r2
            goto L_0x0062
        L_0x003c:
            r6 = move-exception
            goto L_0x009d
        L_0x003e:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0046:
            boolean r8 = r0.Z$0
            java.lang.Object r6 = r0.L$2
            kotlinx.coroutines.channels.ChannelIterator r6 = (kotlinx.coroutines.channels.ChannelIterator) r6
            java.lang.Object r7 = r0.L$1
            kotlinx.coroutines.channels.ReceiveChannel r7 = (kotlinx.coroutines.channels.ReceiveChannel) r7
            java.lang.Object r2 = r0.L$0
            tb.sp9 r2 = (tb.sp9) r2
            kotlin.b.b(r9)     // Catch: all -> 0x003c
            goto L_0x0077
        L_0x0058:
            kotlin.b.b(r9)
            tb.yp9.o(r6)
            kotlinx.coroutines.channels.ChannelIterator r9 = r7.iterator()     // Catch: all -> 0x003c
        L_0x0062:
            r0.L$0 = r6     // Catch: all -> 0x003c
            r0.L$1 = r7     // Catch: all -> 0x003c
            r0.L$2 = r9     // Catch: all -> 0x003c
            r0.Z$0 = r8     // Catch: all -> 0x003c
            r0.label = r4     // Catch: all -> 0x003c
            java.lang.Object r2 = r9.a(r0)     // Catch: all -> 0x003c
            if (r2 != r1) goto L_0x0073
            return r1
        L_0x0073:
            r5 = r2
            r2 = r6
            r6 = r9
            r9 = r5
        L_0x0077:
            java.lang.Boolean r9 = (java.lang.Boolean) r9     // Catch: all -> 0x003c
            boolean r9 = r9.booleanValue()     // Catch: all -> 0x003c
            if (r9 == 0) goto L_0x0094
            java.lang.Object r9 = r6.next()     // Catch: all -> 0x003c
            r0.L$0 = r2     // Catch: all -> 0x003c
            r0.L$1 = r7     // Catch: all -> 0x003c
            r0.L$2 = r6     // Catch: all -> 0x003c
            r0.Z$0 = r8     // Catch: all -> 0x003c
            r0.label = r3     // Catch: all -> 0x003c
            java.lang.Object r9 = r2.emit(r9, r0)     // Catch: all -> 0x003c
            if (r9 != r1) goto L_0x0039
            return r1
        L_0x0094:
            if (r8 == 0) goto L_0x009a
            r6 = 0
            tb.bj3.b(r7, r6)
        L_0x009a:
            tb.xhv r6 = tb.xhv.INSTANCE
            return r6
        L_0x009d:
            throw r6     // Catch: all -> 0x009e
        L_0x009e:
            r9 = move-exception
            if (r8 == 0) goto L_0x00a4
            tb.bj3.b(r7, r6)
        L_0x00a4:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__ChannelsKt.c(tb.sp9, kotlinx.coroutines.channels.ReceiveChannel, boolean, tb.ar4):java.lang.Object");
    }

    public static final <T> ReceiveChannel<T> d(qp9<? extends T> qp9Var, uu4 uu4Var) {
        return a.b(qp9Var).n(uu4Var);
    }
}
