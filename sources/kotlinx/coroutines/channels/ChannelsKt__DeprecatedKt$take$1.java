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
@DebugMetadata(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$take$1", f = "Deprecated.kt", i = {0, 0, 1, 1}, l = {254, 255}, m = "invokeSuspend", n = {"$this$produce", "remaining", "$this$produce", "remaining"}, s = {"L$0", "I$0", "L$0", "I$0"})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
final class ChannelsKt__DeprecatedKt$take$1 extends SuspendLambda implements u1a {
    final /* synthetic */ int $n;
    final /* synthetic */ ReceiveChannel $this_take;
    int I$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChannelsKt__DeprecatedKt$take$1(int i, ReceiveChannel receiveChannel, ar4 ar4Var) {
        super(2, ar4Var);
        this.$n = i;
        this.$this_take = receiveChannel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ar4<xhv> create(Object obj, ar4<?> ar4Var) {
        ChannelsKt__DeprecatedKt$take$1 channelsKt__DeprecatedKt$take$1 = new ChannelsKt__DeprecatedKt$take$1(this.$n, this.$this_take, ar4Var);
        channelsKt__DeprecatedKt$take$1.L$0 = obj;
        return channelsKt__DeprecatedKt$take$1;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0057 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0073 -> B:7:0x001b). Please submit an issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            java.lang.Object r0 = tb.dkf.d()
            int r1 = r7.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L_0x0033
            if (r1 == r3) goto L_0x0025
            if (r1 != r2) goto L_0x001d
            int r1 = r7.I$0
            java.lang.Object r4 = r7.L$1
            kotlinx.coroutines.channels.ChannelIterator r4 = (kotlinx.coroutines.channels.ChannelIterator) r4
            java.lang.Object r5 = r7.L$0
            tb.ozm r5 = (tb.ozm) r5
            kotlin.b.b(r8)
        L_0x001b:
            r8 = r5
            goto L_0x0076
        L_0x001d:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L_0x0025:
            int r1 = r7.I$0
            java.lang.Object r4 = r7.L$1
            kotlinx.coroutines.channels.ChannelIterator r4 = (kotlinx.coroutines.channels.ChannelIterator) r4
            java.lang.Object r5 = r7.L$0
            tb.ozm r5 = (tb.ozm) r5
            kotlin.b.b(r8)
            goto L_0x005b
        L_0x0033:
            kotlin.b.b(r8)
            java.lang.Object r8 = r7.L$0
            tb.ozm r8 = (tb.ozm) r8
            int r1 = r7.$n
            if (r1 != 0) goto L_0x0041
            tb.xhv r8 = tb.xhv.INSTANCE
            return r8
        L_0x0041:
            if (r1 < 0) goto L_0x0080
            kotlinx.coroutines.channels.ReceiveChannel r4 = r7.$this_take
            kotlinx.coroutines.channels.ChannelIterator r4 = r4.iterator()
        L_0x0049:
            r7.L$0 = r8
            r7.L$1 = r4
            r7.I$0 = r1
            r7.label = r3
            java.lang.Object r5 = r4.a(r7)
            if (r5 != r0) goto L_0x0058
            return r0
        L_0x0058:
            r6 = r5
            r5 = r8
            r8 = r6
        L_0x005b:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L_0x007d
            java.lang.Object r8 = r4.next()
            r7.L$0 = r5
            r7.L$1 = r4
            r7.I$0 = r1
            r7.label = r2
            java.lang.Object r8 = r5.d(r8, r7)
            if (r8 != r0) goto L_0x001b
            return r0
        L_0x0076:
            int r1 = r1 + (-1)
            if (r1 != 0) goto L_0x0049
            tb.xhv r8 = tb.xhv.INSTANCE
            return r8
        L_0x007d:
            tb.xhv r8 = tb.xhv.INSTANCE
            return r8
        L_0x0080:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r0 = "Requested element count "
            r8.<init>(r0)
            r8.append(r1)
            java.lang.String r0 = " is less than zero."
            r8.append(r0)
            java.lang.String r8 = r8.toString()
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r8 = r8.toString()
            r0.<init>(r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$take$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public final Object invoke(ozm ozmVar, ar4 ar4Var) {
        return ((ChannelsKt__DeprecatedKt$take$1) create(ozmVar, ar4Var)).invokeSuspend(xhv.INSTANCE);
    }
}
