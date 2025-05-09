package kotlinx.coroutines.channels;

import com.loc.at;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import tb.ar4;
import tb.ozm;
import tb.u1a;
import tb.xhv;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"E", "K", "Ltb/ozm;", "Ltb/xhv;", "<anonymous>", "(Ltb/ozm;)V"}, k = 3, mv = {1, 8, 0})
@DebugMetadata(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$distinctBy$1", f = "Deprecated.kt", i = {0, 0, 1, 1, 1, 2, 2, 2}, l = {387, 388, 390}, m = "invokeSuspend", n = {"$this$produce", "keys", "$this$produce", "keys", "e", "$this$produce", "keys", at.k}, s = {"L$0", "L$1", "L$0", "L$1", "L$3", "L$0", "L$1", "L$3"})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
final class ChannelsKt__DeprecatedKt$distinctBy$1 extends SuspendLambda implements u1a<ozm<Object>, ar4<? super xhv>, Object> {
    final /* synthetic */ u1a<Object, ar4<Object>, Object> $selector;
    final /* synthetic */ ReceiveChannel<Object> $this_distinctBy;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ChannelsKt__DeprecatedKt$distinctBy$1(ReceiveChannel<Object> receiveChannel, u1a<Object, ? super ar4<Object>, ? extends Object> u1aVar, ar4<? super ChannelsKt__DeprecatedKt$distinctBy$1> ar4Var) {
        super(2, ar4Var);
        this.$this_distinctBy = receiveChannel;
        this.$selector = u1aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ar4<xhv> create(Object obj, ar4<?> ar4Var) {
        ChannelsKt__DeprecatedKt$distinctBy$1 channelsKt__DeprecatedKt$distinctBy$1 = new ChannelsKt__DeprecatedKt$distinctBy$1(this.$this_distinctBy, this.$selector, ar4Var);
        channelsKt__DeprecatedKt$distinctBy$1.L$0 = obj;
        return channelsKt__DeprecatedKt$distinctBy$1;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0078 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00bd  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x00a1 -> B:29:0x00ba). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x00b4 -> B:28:0x00b6). Please submit an issue!!! */
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
            r2 = 3
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L_0x0051
            if (r1 == r4) goto L_0x0041
            if (r1 == r3) goto L_0x002c
            if (r1 != r2) goto L_0x0024
            java.lang.Object r1 = r10.L$3
            java.lang.Object r5 = r10.L$2
            kotlinx.coroutines.channels.ChannelIterator r5 = (kotlinx.coroutines.channels.ChannelIterator) r5
            java.lang.Object r6 = r10.L$1
            java.util.HashSet r6 = (java.util.HashSet) r6
            java.lang.Object r7 = r10.L$0
            tb.ozm r7 = (tb.ozm) r7
            kotlin.b.b(r11)
            goto L_0x00b6
        L_0x0024:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L_0x002c:
            java.lang.Object r1 = r10.L$3
            java.lang.Object r5 = r10.L$2
            kotlinx.coroutines.channels.ChannelIterator r5 = (kotlinx.coroutines.channels.ChannelIterator) r5
            java.lang.Object r6 = r10.L$1
            java.util.HashSet r6 = (java.util.HashSet) r6
            java.lang.Object r7 = r10.L$0
            tb.ozm r7 = (tb.ozm) r7
            kotlin.b.b(r11)
            r9 = r5
            r5 = r1
            r1 = r9
            goto L_0x009d
        L_0x0041:
            java.lang.Object r1 = r10.L$2
            kotlinx.coroutines.channels.ChannelIterator r1 = (kotlinx.coroutines.channels.ChannelIterator) r1
            java.lang.Object r5 = r10.L$1
            java.util.HashSet r5 = (java.util.HashSet) r5
            java.lang.Object r6 = r10.L$0
            tb.ozm r6 = (tb.ozm) r6
            kotlin.b.b(r11)
            goto L_0x0079
        L_0x0051:
            kotlin.b.b(r11)
            java.lang.Object r11 = r10.L$0
            tb.ozm r11 = (tb.ozm) r11
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>()
            kotlinx.coroutines.channels.ReceiveChannel<java.lang.Object> r5 = r10.$this_distinctBy
            kotlinx.coroutines.channels.ChannelIterator r5 = r5.iterator()
            r6 = r11
            r9 = r5
            r5 = r1
            r1 = r9
        L_0x0067:
            r10.L$0 = r6
            r10.L$1 = r5
            r10.L$2 = r1
            r11 = 0
            r10.L$3 = r11
            r10.label = r4
            java.lang.Object r11 = r1.a(r10)
            if (r11 != r0) goto L_0x0079
            return r0
        L_0x0079:
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r11 = r11.booleanValue()
            if (r11 == 0) goto L_0x00bd
            java.lang.Object r11 = r1.next()
            tb.u1a<java.lang.Object, tb.ar4<java.lang.Object>, java.lang.Object> r7 = r10.$selector
            r10.L$0 = r6
            r10.L$1 = r5
            r10.L$2 = r1
            r10.L$3 = r11
            r10.label = r3
            java.lang.Object r7 = r7.invoke(r11, r10)
            if (r7 != r0) goto L_0x0098
            return r0
        L_0x0098:
            r9 = r5
            r5 = r11
            r11 = r7
            r7 = r6
            r6 = r9
        L_0x009d:
            boolean r8 = r6.contains(r11)
            if (r8 != 0) goto L_0x00ba
            r10.L$0 = r7
            r10.L$1 = r6
            r10.L$2 = r1
            r10.L$3 = r11
            r10.label = r2
            java.lang.Object r5 = r7.d(r5, r10)
            if (r5 != r0) goto L_0x00b4
            return r0
        L_0x00b4:
            r5 = r1
            r1 = r11
        L_0x00b6:
            r6.add(r1)
            r1 = r5
        L_0x00ba:
            r5 = r6
            r6 = r7
            goto L_0x0067
        L_0x00bd:
            tb.xhv r11 = tb.xhv.INSTANCE
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$distinctBy$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public final Object invoke(ozm<Object> ozmVar, ar4<? super xhv> ar4Var) {
        return ((ChannelsKt__DeprecatedKt$distinctBy$1) create(ozmVar, ar4Var)).invokeSuspend(xhv.INSTANCE);
    }
}
