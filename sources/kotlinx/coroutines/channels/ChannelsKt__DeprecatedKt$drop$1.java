package kotlinx.coroutines.channels;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import tb.ar4;
import tb.ozm;
import tb.u1a;
import tb.xhv;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"E", "Ltb/ozm;", "Ltb/xhv;", "<anonymous>", "(Ltb/ozm;)V"}, k = 3, mv = {1, 8, 0})
@DebugMetadata(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$drop$1", f = "Deprecated.kt", i = {0, 0, 1, 2}, l = {164, 169, 170}, m = "invokeSuspend", n = {"$this$produce", "remaining", "$this$produce", "$this$produce"}, s = {"L$0", "I$0", "L$0", "L$0"})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
final class ChannelsKt__DeprecatedKt$drop$1 extends SuspendLambda implements u1a {
    final /* synthetic */ int $n;
    final /* synthetic */ ReceiveChannel $this_drop;
    int I$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChannelsKt__DeprecatedKt$drop$1(int i, ReceiveChannel receiveChannel, ar4 ar4Var) {
        super(2, ar4Var);
        this.$n = i;
        this.$this_drop = receiveChannel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ar4<xhv> create(Object obj, ar4<?> ar4Var) {
        ChannelsKt__DeprecatedKt$drop$1 channelsKt__DeprecatedKt$drop$1 = new ChannelsKt__DeprecatedKt$drop$1(this.$n, this.$this_drop, ar4Var);
        channelsKt__DeprecatedKt$drop$1.L$0 = obj;
        return channelsKt__DeprecatedKt$drop$1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0070, code lost:
        if (r1 == 0) goto L_0x0072;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0085 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a2  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0060 -> B:20:0x0063). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x009f -> B:8:0x001c). Please submit an issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            java.lang.Object r0 = tb.dkf.d()
            int r1 = r8.label
            r2 = 3
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L_0x0040
            if (r1 == r4) goto L_0x0032
            if (r1 == r3) goto L_0x0026
            if (r1 != r2) goto L_0x001e
            java.lang.Object r1 = r8.L$1
            kotlinx.coroutines.channels.ChannelIterator r1 = (kotlinx.coroutines.channels.ChannelIterator) r1
            java.lang.Object r4 = r8.L$0
            tb.ozm r4 = (tb.ozm) r4
            kotlin.b.b(r9)
        L_0x001c:
            r9 = r4
            goto L_0x0079
        L_0x001e:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L_0x0026:
            java.lang.Object r1 = r8.L$1
            kotlinx.coroutines.channels.ChannelIterator r1 = (kotlinx.coroutines.channels.ChannelIterator) r1
            java.lang.Object r4 = r8.L$0
            tb.ozm r4 = (tb.ozm) r4
            kotlin.b.b(r9)
            goto L_0x0089
        L_0x0032:
            int r1 = r8.I$0
            java.lang.Object r5 = r8.L$1
            kotlinx.coroutines.channels.ChannelIterator r5 = (kotlinx.coroutines.channels.ChannelIterator) r5
            java.lang.Object r6 = r8.L$0
            tb.ozm r6 = (tb.ozm) r6
            kotlin.b.b(r9)
            goto L_0x0063
        L_0x0040:
            kotlin.b.b(r9)
            java.lang.Object r9 = r8.L$0
            tb.ozm r9 = (tb.ozm) r9
            int r1 = r8.$n
            if (r1 < 0) goto L_0x00a5
            if (r1 <= 0) goto L_0x0073
            kotlinx.coroutines.channels.ReceiveChannel r5 = r8.$this_drop
            kotlinx.coroutines.channels.ChannelIterator r5 = r5.iterator()
            r6 = r9
        L_0x0054:
            r8.L$0 = r6
            r8.L$1 = r5
            r8.I$0 = r1
            r8.label = r4
            java.lang.Object r9 = r5.a(r8)
            if (r9 != r0) goto L_0x0063
            return r0
        L_0x0063:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto L_0x0072
            r5.next()
            int r1 = r1 + (-1)
            if (r1 != 0) goto L_0x0054
        L_0x0072:
            r9 = r6
        L_0x0073:
            kotlinx.coroutines.channels.ReceiveChannel r1 = r8.$this_drop
            kotlinx.coroutines.channels.ChannelIterator r1 = r1.iterator()
        L_0x0079:
            r8.L$0 = r9
            r8.L$1 = r1
            r8.label = r3
            java.lang.Object r4 = r1.a(r8)
            if (r4 != r0) goto L_0x0086
            return r0
        L_0x0086:
            r7 = r4
            r4 = r9
            r9 = r7
        L_0x0089:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto L_0x00a2
            java.lang.Object r9 = r1.next()
            r8.L$0 = r4
            r8.L$1 = r1
            r8.label = r2
            java.lang.Object r9 = r4.d(r9, r8)
            if (r9 != r0) goto L_0x001c
            return r0
        L_0x00a2:
            tb.xhv r9 = tb.xhv.INSTANCE
            return r9
        L_0x00a5:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r0 = "Requested element count "
            r9.<init>(r0)
            r9.append(r1)
            java.lang.String r0 = " is less than zero."
            r9.append(r0)
            java.lang.String r9 = r9.toString()
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r9 = r9.toString()
            r0.<init>(r9)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$drop$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public final Object invoke(ozm ozmVar, ar4 ar4Var) {
        return ((ChannelsKt__DeprecatedKt$drop$1) create(ozmVar, ar4Var)).invokeSuspend(xhv.INSTANCE);
    }
}
