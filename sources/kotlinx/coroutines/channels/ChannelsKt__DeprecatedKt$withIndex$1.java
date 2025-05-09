package kotlinx.coroutines.channels;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import tb.ar4;
import tb.ozm;
import tb.u1a;
import tb.xhv;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00020\u0001H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"E", "Ltb/ozm;", "Ltb/hte;", "Ltb/xhv;", "<anonymous>", "(Ltb/ozm;)V"}, k = 3, mv = {1, 8, 0})
@DebugMetadata(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$withIndex$1", f = "Deprecated.kt", i = {0, 0, 1, 1}, l = {370, 371}, m = "invokeSuspend", n = {"$this$produce", "index", "$this$produce", "index"}, s = {"L$0", "I$0", "L$0", "I$0"})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
final class ChannelsKt__DeprecatedKt$withIndex$1 extends SuspendLambda implements u1a {
    final /* synthetic */ ReceiveChannel $this_withIndex;
    int I$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChannelsKt__DeprecatedKt$withIndex$1(ReceiveChannel receiveChannel, ar4 ar4Var) {
        super(2, ar4Var);
        this.$this_withIndex = receiveChannel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ar4<xhv> create(Object obj, ar4<?> ar4Var) {
        ChannelsKt__DeprecatedKt$withIndex$1 channelsKt__DeprecatedKt$withIndex$1 = new ChannelsKt__DeprecatedKt$withIndex$1(this.$this_withIndex, ar4Var);
        channelsKt__DeprecatedKt$withIndex$1.L$0 = obj;
        return channelsKt__DeprecatedKt$withIndex$1;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x007b -> B:11:0x0044). Please submit an issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            java.lang.Object r0 = tb.dkf.d()
            int r1 = r10.label
            r2 = 1
            r3 = 2
            if (r1 == 0) goto L_0x0036
            if (r1 == r2) goto L_0x0028
            if (r1 != r3) goto L_0x0020
            int r1 = r10.I$0
            java.lang.Object r4 = r10.L$1
            kotlinx.coroutines.channels.ChannelIterator r4 = (kotlinx.coroutines.channels.ChannelIterator) r4
            java.lang.Object r5 = r10.L$0
            tb.ozm r5 = (tb.ozm) r5
            kotlin.b.b(r11)
            r11 = r5
            r8 = r4
            r4 = r1
            r1 = r8
            goto L_0x0044
        L_0x0020:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L_0x0028:
            int r1 = r10.I$0
            java.lang.Object r4 = r10.L$1
            kotlinx.coroutines.channels.ChannelIterator r4 = (kotlinx.coroutines.channels.ChannelIterator) r4
            java.lang.Object r5 = r10.L$0
            tb.ozm r5 = (tb.ozm) r5
            kotlin.b.b(r11)
            goto L_0x0059
        L_0x0036:
            kotlin.b.b(r11)
            java.lang.Object r11 = r10.L$0
            tb.ozm r11 = (tb.ozm) r11
            kotlinx.coroutines.channels.ReceiveChannel r1 = r10.$this_withIndex
            kotlinx.coroutines.channels.ChannelIterator r1 = r1.iterator()
            r4 = 0
        L_0x0044:
            r10.L$0 = r11
            r10.L$1 = r1
            r10.I$0 = r4
            r10.label = r2
            java.lang.Object r5 = r1.a(r10)
            if (r5 != r0) goto L_0x0053
            return r0
        L_0x0053:
            r8 = r5
            r5 = r11
            r11 = r8
            r9 = r4
            r4 = r1
            r1 = r9
        L_0x0059:
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r11 = r11.booleanValue()
            if (r11 == 0) goto L_0x007f
            java.lang.Object r11 = r4.next()
            tb.hte r6 = new tb.hte
            int r7 = r1 + 1
            r6.<init>(r1, r11)
            r10.L$0 = r5
            r10.L$1 = r4
            r10.I$0 = r7
            r10.label = r3
            java.lang.Object r11 = r5.d(r6, r10)
            if (r11 != r0) goto L_0x007b
            return r0
        L_0x007b:
            r1 = r4
            r11 = r5
            r4 = r7
            goto L_0x0044
        L_0x007f:
            tb.xhv r11 = tb.xhv.INSTANCE
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$withIndex$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public final Object invoke(ozm ozmVar, ar4 ar4Var) {
        return ((ChannelsKt__DeprecatedKt$withIndex$1) create(ozmVar, ar4Var)).invokeSuspend(xhv.INSTANCE);
    }
}
