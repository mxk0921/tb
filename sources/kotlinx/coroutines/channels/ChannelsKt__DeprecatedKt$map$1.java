package kotlinx.coroutines.channels;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import tb.ar4;
import tb.ozm;
import tb.u1a;
import tb.xhv;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"E", "R", "Ltb/ozm;", "Ltb/xhv;", "<anonymous>", "(Ltb/ozm;)V"}, k = 3, mv = {1, 8, 0})
@DebugMetadata(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$map$1", f = "Deprecated.kt", i = {0, 0, 1, 1, 2, 2}, l = {487, 333, 333}, m = "invokeSuspend", n = {"$this$produce", "$this$consume$iv$iv", "$this$produce", "$this$consume$iv$iv", "$this$produce", "$this$consume$iv$iv"}, s = {"L$0", "L$2", "L$0", "L$2", "L$0", "L$2"})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
final class ChannelsKt__DeprecatedKt$map$1 extends SuspendLambda implements u1a<ozm<Object>, ar4<? super xhv>, Object> {
    final /* synthetic */ ReceiveChannel<Object> $this_map;
    final /* synthetic */ u1a<Object, ar4<Object>, Object> $transform;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ChannelsKt__DeprecatedKt$map$1(ReceiveChannel<Object> receiveChannel, u1a<Object, ? super ar4<Object>, ? extends Object> u1aVar, ar4<? super ChannelsKt__DeprecatedKt$map$1> ar4Var) {
        super(2, ar4Var);
        this.$this_map = receiveChannel;
        this.$transform = u1aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ar4<xhv> create(Object obj, ar4<?> ar4Var) {
        ChannelsKt__DeprecatedKt$map$1 channelsKt__DeprecatedKt$map$1 = new ChannelsKt__DeprecatedKt$map$1(this.$this_map, this.$transform, ar4Var);
        channelsKt__DeprecatedKt$map$1.L$0 = obj;
        return channelsKt__DeprecatedKt$map$1;
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0091 A[Catch: all -> 0x0027, TRY_LEAVE, TryCatch #0 {all -> 0x0027, blocks: (B:8:0x0022, B:18:0x005f, B:20:0x006e, B:21:0x0075, B:25:0x0089, B:27:0x0091, B:35:0x00c5), top: B:42:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00bf A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00c5 A[Catch: all -> 0x0027, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0027, blocks: (B:8:0x0022, B:18:0x005f, B:20:0x006e, B:21:0x0075, B:25:0x0089, B:27:0x0091, B:35:0x00c5), top: B:42:0x000a }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x00c0 -> B:21:0x0075). Please submit an issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            Method dump skipped, instructions count: 211
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$map$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public final Object invoke(ozm<Object> ozmVar, ar4<? super xhv> ar4Var) {
        return ((ChannelsKt__DeprecatedKt$map$1) create(ozmVar, ar4Var)).invokeSuspend(xhv.INSTANCE);
    }
}
