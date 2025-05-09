package kotlinx.coroutines.channels;

import com.taobao.android.alinnkit.entity.FaceDetectionReport;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import tb.ar4;
import tb.ozm;
import tb.u1a;
import tb.xhv;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"E", "R", "Ltb/ozm;", "Ltb/xhv;", "<anonymous>", "(Ltb/ozm;)V"}, k = 3, mv = {1, 8, 0})
@DebugMetadata(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$flatMap$1", f = "Deprecated.kt", i = {0, 1, 2}, l = {321, FaceDetectionReport.NATIVE_FLOAT_OUT_LENGTH, FaceDetectionReport.NATIVE_FLOAT_OUT_LENGTH}, m = "invokeSuspend", n = {"$this$produce", "$this$produce", "$this$produce"}, s = {"L$0", "L$0", "L$0"})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
final class ChannelsKt__DeprecatedKt$flatMap$1 extends SuspendLambda implements u1a {
    final /* synthetic */ ReceiveChannel $this_flatMap;
    final /* synthetic */ u1a $transform;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChannelsKt__DeprecatedKt$flatMap$1(ReceiveChannel receiveChannel, u1a u1aVar, ar4 ar4Var) {
        super(2, ar4Var);
        this.$this_flatMap = receiveChannel;
        this.$transform = u1aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ar4<xhv> create(Object obj, ar4<?> ar4Var) {
        ChannelsKt__DeprecatedKt$flatMap$1 channelsKt__DeprecatedKt$flatMap$1 = new ChannelsKt__DeprecatedKt$flatMap$1(this.$this_flatMap, this.$transform, ar4Var);
        channelsKt__DeprecatedKt$flatMap$1.L$0 = obj;
        return channelsKt__DeprecatedKt$flatMap$1;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0081 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0082  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x007f -> B:13:0x004b). Please submit an issue!!! */
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
            r2 = 3
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L_0x003d
            if (r1 == r4) goto L_0x0031
            if (r1 == r3) goto L_0x0025
            if (r1 != r2) goto L_0x001d
            java.lang.Object r1 = r7.L$1
            kotlinx.coroutines.channels.ChannelIterator r1 = (kotlinx.coroutines.channels.ChannelIterator) r1
            java.lang.Object r5 = r7.L$0
            tb.ozm r5 = (tb.ozm) r5
            kotlin.b.b(r8)
            goto L_0x004b
        L_0x001d:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L_0x0025:
            java.lang.Object r1 = r7.L$1
            kotlinx.coroutines.channels.ChannelIterator r1 = (kotlinx.coroutines.channels.ChannelIterator) r1
            java.lang.Object r5 = r7.L$0
            tb.ozm r5 = (tb.ozm) r5
            kotlin.b.b(r8)
            goto L_0x0073
        L_0x0031:
            java.lang.Object r1 = r7.L$1
            kotlinx.coroutines.channels.ChannelIterator r1 = (kotlinx.coroutines.channels.ChannelIterator) r1
            java.lang.Object r5 = r7.L$0
            tb.ozm r5 = (tb.ozm) r5
            kotlin.b.b(r8)
            goto L_0x0058
        L_0x003d:
            kotlin.b.b(r8)
            java.lang.Object r8 = r7.L$0
            tb.ozm r8 = (tb.ozm) r8
            kotlinx.coroutines.channels.ReceiveChannel r1 = r7.$this_flatMap
            kotlinx.coroutines.channels.ChannelIterator r1 = r1.iterator()
            r5 = r8
        L_0x004b:
            r7.L$0 = r5
            r7.L$1 = r1
            r7.label = r4
            java.lang.Object r8 = r1.a(r7)
            if (r8 != r0) goto L_0x0058
            return r0
        L_0x0058:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L_0x0082
            java.lang.Object r8 = r1.next()
            tb.u1a r6 = r7.$transform
            r7.L$0 = r5
            r7.L$1 = r1
            r7.label = r3
            java.lang.Object r8 = r6.invoke(r8, r7)
            if (r8 != r0) goto L_0x0073
            return r0
        L_0x0073:
            kotlinx.coroutines.channels.ReceiveChannel r8 = (kotlinx.coroutines.channels.ReceiveChannel) r8
            r7.L$0 = r5
            r7.L$1 = r1
            r7.label = r2
            java.lang.Object r8 = tb.bj3.s(r8, r5, r7)
            if (r8 != r0) goto L_0x004b
            return r0
        L_0x0082:
            tb.xhv r8 = tb.xhv.INSTANCE
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$flatMap$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public final Object invoke(ozm ozmVar, ar4 ar4Var) {
        return ((ChannelsKt__DeprecatedKt$flatMap$1) create(ozmVar, ar4Var)).invokeSuspend(xhv.INSTANCE);
    }
}
