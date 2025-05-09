package kotlinx.coroutines.flow.internal;

import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.channels.ReceiveChannel;
import tb.ar4;
import tb.dkf;
import tb.sp9;
import tb.u1a;
import tb.uu4;
import tb.xhv;
import tb.yp9;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "Ltb/uu4;", "Ltb/xhv;", "<anonymous>", "(Ltb/uu4;)V"}, k = 3, mv = {1, 8, 0})
@DebugMetadata(c = "kotlinx.coroutines.flow.internal.ChannelFlow$collect$2", f = "ChannelFlow.kt", i = {}, l = {123}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public final class ChannelFlow$collect$2 extends SuspendLambda implements u1a<uu4, ar4<? super xhv>, Object> {
    final /* synthetic */ sp9<T> $collector;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ChannelFlow<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ChannelFlow$collect$2(sp9<? super T> sp9Var, ChannelFlow<T> channelFlow, ar4<? super ChannelFlow$collect$2> ar4Var) {
        super(2, ar4Var);
        this.$collector = sp9Var;
        this.this$0 = channelFlow;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ar4<xhv> create(Object obj, ar4<?> ar4Var) {
        ChannelFlow$collect$2 channelFlow$collect$2 = new ChannelFlow$collect$2(this.$collector, this.this$0, ar4Var);
        channelFlow$collect$2.L$0 = obj;
        return channelFlow$collect$2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object d = dkf.d();
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            sp9<T> sp9Var = this.$collector;
            ReceiveChannel n = this.this$0.n((uu4) this.L$0);
            this.label = 1;
            if (yp9.m(sp9Var, n, this) == d) {
                return d;
            }
        } else if (i == 1) {
            b.b(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return xhv.INSTANCE;
    }

    public final Object invoke(uu4 uu4Var, ar4<? super xhv> ar4Var) {
        return ((ChannelFlow$collect$2) create(uu4Var, ar4Var)).invokeSuspend(xhv.INSTANCE);
    }
}
