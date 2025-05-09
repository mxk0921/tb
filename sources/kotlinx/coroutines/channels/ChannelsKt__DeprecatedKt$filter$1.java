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
@DebugMetadata(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filter$1", f = "Deprecated.kt", i = {0, 1, 1, 2}, l = {198, 199, 199}, m = "invokeSuspend", n = {"$this$produce", "$this$produce", "e", "$this$produce"}, s = {"L$0", "L$0", "L$2", "L$0"})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
final class ChannelsKt__DeprecatedKt$filter$1 extends SuspendLambda implements u1a<ozm<Object>, ar4<? super xhv>, Object> {
    final /* synthetic */ u1a<Object, ar4<? super Boolean>, Object> $predicate;
    final /* synthetic */ ReceiveChannel<Object> $this_filter;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ChannelsKt__DeprecatedKt$filter$1(ReceiveChannel<Object> receiveChannel, u1a<Object, ? super ar4<? super Boolean>, ? extends Object> u1aVar, ar4<? super ChannelsKt__DeprecatedKt$filter$1> ar4Var) {
        super(2, ar4Var);
        this.$this_filter = receiveChannel;
        this.$predicate = u1aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ar4<xhv> create(Object obj, ar4<?> ar4Var) {
        ChannelsKt__DeprecatedKt$filter$1 channelsKt__DeprecatedKt$filter$1 = new ChannelsKt__DeprecatedKt$filter$1(this.$this_filter, this.$predicate, ar4Var);
        channelsKt__DeprecatedKt$filter$1.L$0 = obj;
        return channelsKt__DeprecatedKt$filter$1;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x009a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x0098 -> B:13:0x0051). Please submit an issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            java.lang.Object r0 = tb.dkf.d()
            int r1 = r9.label
            r2 = 0
            r3 = 3
            r4 = 2
            r5 = 1
            if (r1 == 0) goto L_0x0043
            if (r1 == r5) goto L_0x0037
            if (r1 == r4) goto L_0x0026
            if (r1 != r3) goto L_0x001e
            java.lang.Object r1 = r9.L$1
            kotlinx.coroutines.channels.ChannelIterator r1 = (kotlinx.coroutines.channels.ChannelIterator) r1
            java.lang.Object r6 = r9.L$0
            tb.ozm r6 = (tb.ozm) r6
            kotlin.b.b(r10)
            goto L_0x0051
        L_0x001e:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L_0x0026:
            java.lang.Object r1 = r9.L$2
            java.lang.Object r6 = r9.L$1
            kotlinx.coroutines.channels.ChannelIterator r6 = (kotlinx.coroutines.channels.ChannelIterator) r6
            java.lang.Object r7 = r9.L$0
            tb.ozm r7 = (tb.ozm) r7
            kotlin.b.b(r10)
            r8 = r6
            r6 = r1
            r1 = r8
            goto L_0x0081
        L_0x0037:
            java.lang.Object r1 = r9.L$1
            kotlinx.coroutines.channels.ChannelIterator r1 = (kotlinx.coroutines.channels.ChannelIterator) r1
            java.lang.Object r6 = r9.L$0
            tb.ozm r6 = (tb.ozm) r6
            kotlin.b.b(r10)
            goto L_0x0060
        L_0x0043:
            kotlin.b.b(r10)
            java.lang.Object r10 = r9.L$0
            tb.ozm r10 = (tb.ozm) r10
            kotlinx.coroutines.channels.ReceiveChannel<java.lang.Object> r1 = r9.$this_filter
            kotlinx.coroutines.channels.ChannelIterator r1 = r1.iterator()
            r6 = r10
        L_0x0051:
            r9.L$0 = r6
            r9.L$1 = r1
            r9.L$2 = r2
            r9.label = r5
            java.lang.Object r10 = r1.a(r9)
            if (r10 != r0) goto L_0x0060
            return r0
        L_0x0060:
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 == 0) goto L_0x009a
            java.lang.Object r10 = r1.next()
            tb.u1a<java.lang.Object, tb.ar4<? super java.lang.Boolean>, java.lang.Object> r7 = r9.$predicate
            r9.L$0 = r6
            r9.L$1 = r1
            r9.L$2 = r10
            r9.label = r4
            java.lang.Object r7 = r7.invoke(r10, r9)
            if (r7 != r0) goto L_0x007d
            return r0
        L_0x007d:
            r8 = r6
            r6 = r10
            r10 = r7
            r7 = r8
        L_0x0081:
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 == 0) goto L_0x0098
            r9.L$0 = r7
            r9.L$1 = r1
            r9.L$2 = r2
            r9.label = r3
            java.lang.Object r10 = r7.d(r6, r9)
            if (r10 != r0) goto L_0x0098
            return r0
        L_0x0098:
            r6 = r7
            goto L_0x0051
        L_0x009a:
            tb.xhv r10 = tb.xhv.INSTANCE
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filter$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public final Object invoke(ozm<Object> ozmVar, ar4<? super xhv> ar4Var) {
        return ((ChannelsKt__DeprecatedKt$filter$1) create(ozmVar, ar4Var)).invokeSuspend(xhv.INSTANCE);
    }
}
