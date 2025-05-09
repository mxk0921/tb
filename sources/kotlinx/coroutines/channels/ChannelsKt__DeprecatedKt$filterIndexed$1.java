package kotlinx.coroutines.channels;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import tb.ar4;
import tb.ozm;
import tb.u1a;
import tb.w1a;
import tb.xhv;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"E", "Ltb/ozm;", "Ltb/xhv;", "<anonymous>", "(Ltb/ozm;)V"}, k = 3, mv = {1, 8, 0})
@DebugMetadata(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filterIndexed$1", f = "Deprecated.kt", i = {0, 0, 1, 1, 1, 2, 2}, l = {211, 212, 212}, m = "invokeSuspend", n = {"$this$produce", "index", "$this$produce", "e", "index", "$this$produce", "index"}, s = {"L$0", "I$0", "L$0", "L$2", "I$0", "L$0", "I$0"})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
final class ChannelsKt__DeprecatedKt$filterIndexed$1 extends SuspendLambda implements u1a {
    final /* synthetic */ w1a $predicate;
    final /* synthetic */ ReceiveChannel $this_filterIndexed;
    int I$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChannelsKt__DeprecatedKt$filterIndexed$1(ReceiveChannel receiveChannel, w1a w1aVar, ar4 ar4Var) {
        super(2, ar4Var);
        this.$this_filterIndexed = receiveChannel;
        this.$predicate = w1aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ar4<xhv> create(Object obj, ar4<?> ar4Var) {
        ChannelsKt__DeprecatedKt$filterIndexed$1 channelsKt__DeprecatedKt$filterIndexed$1 = new ChannelsKt__DeprecatedKt$filterIndexed$1(this.$this_filterIndexed, this.$predicate, ar4Var);
        channelsKt__DeprecatedKt$filterIndexed$1.L$0 = obj;
        return channelsKt__DeprecatedKt$filterIndexed$1;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00af  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x00ad -> B:13:0x005a). Please submit an issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            java.lang.Object r0 = tb.dkf.d()
            int r1 = r11.label
            r2 = 1
            r3 = 0
            r4 = 3
            r5 = 2
            if (r1 == 0) goto L_0x0049
            if (r1 == r2) goto L_0x003b
            if (r1 == r5) goto L_0x0028
            if (r1 != r4) goto L_0x0020
            int r1 = r11.I$0
            java.lang.Object r6 = r11.L$1
            kotlinx.coroutines.channels.ChannelIterator r6 = (kotlinx.coroutines.channels.ChannelIterator) r6
            java.lang.Object r7 = r11.L$0
            tb.ozm r7 = (tb.ozm) r7
            kotlin.b.b(r12)
            goto L_0x005a
        L_0x0020:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L_0x0028:
            int r1 = r11.I$0
            java.lang.Object r6 = r11.L$2
            java.lang.Object r7 = r11.L$1
            kotlinx.coroutines.channels.ChannelIterator r7 = (kotlinx.coroutines.channels.ChannelIterator) r7
            java.lang.Object r8 = r11.L$0
            tb.ozm r8 = (tb.ozm) r8
            kotlin.b.b(r12)
            r10 = r7
            r7 = r6
            r6 = r10
            goto L_0x0094
        L_0x003b:
            int r1 = r11.I$0
            java.lang.Object r6 = r11.L$1
            kotlinx.coroutines.channels.ChannelIterator r6 = (kotlinx.coroutines.channels.ChannelIterator) r6
            java.lang.Object r7 = r11.L$0
            tb.ozm r7 = (tb.ozm) r7
            kotlin.b.b(r12)
            goto L_0x006b
        L_0x0049:
            kotlin.b.b(r12)
            java.lang.Object r12 = r11.L$0
            tb.ozm r12 = (tb.ozm) r12
            kotlinx.coroutines.channels.ReceiveChannel r1 = r11.$this_filterIndexed
            kotlinx.coroutines.channels.ChannelIterator r1 = r1.iterator()
            r6 = 0
            r7 = r12
            r6 = r1
            r1 = 0
        L_0x005a:
            r11.L$0 = r7
            r11.L$1 = r6
            r11.L$2 = r3
            r11.I$0 = r1
            r11.label = r2
            java.lang.Object r12 = r6.a(r11)
            if (r12 != r0) goto L_0x006b
            return r0
        L_0x006b:
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r12 = r12.booleanValue()
            if (r12 == 0) goto L_0x00af
            java.lang.Object r12 = r6.next()
            tb.w1a r8 = r11.$predicate
            int r9 = r1 + 1
            java.lang.Integer r1 = tb.gk2.b(r1)
            r11.L$0 = r7
            r11.L$1 = r6
            r11.L$2 = r12
            r11.I$0 = r9
            r11.label = r5
            java.lang.Object r1 = r8.invoke(r1, r12, r11)
            if (r1 != r0) goto L_0x0090
            return r0
        L_0x0090:
            r8 = r7
            r7 = r12
            r12 = r1
            r1 = r9
        L_0x0094:
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r12 = r12.booleanValue()
            if (r12 == 0) goto L_0x00ad
            r11.L$0 = r8
            r11.L$1 = r6
            r11.L$2 = r3
            r11.I$0 = r1
            r11.label = r4
            java.lang.Object r12 = r8.d(r7, r11)
            if (r12 != r0) goto L_0x00ad
            return r0
        L_0x00ad:
            r7 = r8
            goto L_0x005a
        L_0x00af:
            tb.xhv r12 = tb.xhv.INSTANCE
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filterIndexed$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public final Object invoke(ozm ozmVar, ar4 ar4Var) {
        return ((ChannelsKt__DeprecatedKt$filterIndexed$1) create(ozmVar, ar4Var)).invokeSuspend(xhv.INSTANCE);
    }
}
