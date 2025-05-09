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
@Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"E", "R", "Ltb/ozm;", "Ltb/xhv;", "<anonymous>", "(Ltb/ozm;)V"}, k = 3, mv = {1, 8, 0})
@DebugMetadata(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$mapIndexed$1", f = "Deprecated.kt", i = {0, 0, 1, 1, 2, 2}, l = {344, 345, 345}, m = "invokeSuspend", n = {"$this$produce", "index", "$this$produce", "index", "$this$produce", "index"}, s = {"L$0", "I$0", "L$0", "I$0", "L$0", "I$0"})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
final class ChannelsKt__DeprecatedKt$mapIndexed$1 extends SuspendLambda implements u1a<ozm<Object>, ar4<? super xhv>, Object> {
    final /* synthetic */ ReceiveChannel<Object> $this_mapIndexed;
    final /* synthetic */ w1a<Integer, Object, ar4<Object>, Object> $transform;
    int I$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ChannelsKt__DeprecatedKt$mapIndexed$1(ReceiveChannel<Object> receiveChannel, w1a<? super Integer, Object, ? super ar4<Object>, ? extends Object> w1aVar, ar4<? super ChannelsKt__DeprecatedKt$mapIndexed$1> ar4Var) {
        super(2, ar4Var);
        this.$this_mapIndexed = receiveChannel;
        this.$transform = w1aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ar4<xhv> create(Object obj, ar4<?> ar4Var) {
        ChannelsKt__DeprecatedKt$mapIndexed$1 channelsKt__DeprecatedKt$mapIndexed$1 = new ChannelsKt__DeprecatedKt$mapIndexed$1(this.$this_mapIndexed, this.$transform, ar4Var);
        channelsKt__DeprecatedKt$mapIndexed$1.L$0 = obj;
        return channelsKt__DeprecatedKt$mapIndexed$1;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00a4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00a8  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x00a5 -> B:13:0x0058). Please submit an issue!!! */
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
            r3 = 3
            r4 = 2
            if (r1 == 0) goto L_0x0048
            if (r1 == r2) goto L_0x003a
            if (r1 == r4) goto L_0x0028
            if (r1 != r3) goto L_0x0020
            int r1 = r10.I$0
            java.lang.Object r5 = r10.L$1
            kotlinx.coroutines.channels.ChannelIterator r5 = (kotlinx.coroutines.channels.ChannelIterator) r5
            java.lang.Object r6 = r10.L$0
            tb.ozm r6 = (tb.ozm) r6
            kotlin.b.b(r11)
            r11 = r6
            goto L_0x0058
        L_0x0020:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L_0x0028:
            int r1 = r10.I$0
            java.lang.Object r5 = r10.L$2
            tb.ozm r5 = (tb.ozm) r5
            java.lang.Object r6 = r10.L$1
            kotlinx.coroutines.channels.ChannelIterator r6 = (kotlinx.coroutines.channels.ChannelIterator) r6
            java.lang.Object r7 = r10.L$0
            tb.ozm r7 = (tb.ozm) r7
            kotlin.b.b(r11)
            goto L_0x0093
        L_0x003a:
            int r1 = r10.I$0
            java.lang.Object r5 = r10.L$1
            kotlinx.coroutines.channels.ChannelIterator r5 = (kotlinx.coroutines.channels.ChannelIterator) r5
            java.lang.Object r6 = r10.L$0
            tb.ozm r6 = (tb.ozm) r6
            kotlin.b.b(r11)
            goto L_0x006a
        L_0x0048:
            kotlin.b.b(r11)
            java.lang.Object r11 = r10.L$0
            tb.ozm r11 = (tb.ozm) r11
            kotlinx.coroutines.channels.ReceiveChannel<java.lang.Object> r1 = r10.$this_mapIndexed
            kotlinx.coroutines.channels.ChannelIterator r1 = r1.iterator()
            r5 = 0
            r5 = r1
            r1 = 0
        L_0x0058:
            r10.L$0 = r11
            r10.L$1 = r5
            r10.I$0 = r1
            r10.label = r2
            java.lang.Object r6 = r5.a(r10)
            if (r6 != r0) goto L_0x0067
            return r0
        L_0x0067:
            r9 = r6
            r6 = r11
            r11 = r9
        L_0x006a:
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r11 = r11.booleanValue()
            if (r11 == 0) goto L_0x00a8
            java.lang.Object r11 = r5.next()
            tb.w1a<java.lang.Integer, java.lang.Object, tb.ar4<java.lang.Object>, java.lang.Object> r7 = r10.$transform
            int r8 = r1 + 1
            java.lang.Integer r1 = tb.gk2.b(r1)
            r10.L$0 = r6
            r10.L$1 = r5
            r10.L$2 = r6
            r10.I$0 = r8
            r10.label = r4
            java.lang.Object r11 = r7.invoke(r1, r11, r10)
            if (r11 != r0) goto L_0x008f
            return r0
        L_0x008f:
            r7 = r6
            r1 = r8
            r6 = r5
            r5 = r7
        L_0x0093:
            r10.L$0 = r7
            r10.L$1 = r6
            r8 = 0
            r10.L$2 = r8
            r10.I$0 = r1
            r10.label = r3
            java.lang.Object r11 = r5.d(r11, r10)
            if (r11 != r0) goto L_0x00a5
            return r0
        L_0x00a5:
            r5 = r6
            r11 = r7
            goto L_0x0058
        L_0x00a8:
            tb.xhv r11 = tb.xhv.INSTANCE
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$mapIndexed$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public final Object invoke(ozm<Object> ozmVar, ar4<? super xhv> ar4Var) {
        return ((ChannelsKt__DeprecatedKt$mapIndexed$1) create(ozmVar, ar4Var)).invokeSuspend(xhv.INSTANCE);
    }
}
