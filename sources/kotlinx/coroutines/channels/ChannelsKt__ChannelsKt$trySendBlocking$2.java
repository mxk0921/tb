package kotlinx.coroutines.channels;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.channels.e;
import tb.ar4;
import tb.dkf;
import tb.u1a;
import tb.uu4;
import tb.xhv;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"E", "Ltb/uu4;", "Lkotlinx/coroutines/channels/e;", "Ltb/xhv;", "<anonymous>", "(Ltb/uu4;)Lkotlinx/coroutines/channels/e;"}, k = 3, mv = {1, 8, 0})
@DebugMetadata(c = "kotlinx.coroutines.channels.ChannelsKt__ChannelsKt$trySendBlocking$2", f = "Channels.kt", i = {}, l = {39}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
final class ChannelsKt__ChannelsKt$trySendBlocking$2 extends SuspendLambda implements u1a<uu4, ar4<? super e<? extends xhv>>, Object> {
    final /* synthetic */ Object $element;
    final /* synthetic */ i<Object> $this_trySendBlocking;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChannelsKt__ChannelsKt$trySendBlocking$2(i<Object> iVar, Object obj, ar4<? super ChannelsKt__ChannelsKt$trySendBlocking$2> ar4Var) {
        super(2, ar4Var);
        this.$this_trySendBlocking = iVar;
        this.$element = obj;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ar4<xhv> create(Object obj, ar4<?> ar4Var) {
        ChannelsKt__ChannelsKt$trySendBlocking$2 channelsKt__ChannelsKt$trySendBlocking$2 = new ChannelsKt__ChannelsKt$trySendBlocking$2(this.$this_trySendBlocking, this.$element, ar4Var);
        channelsKt__ChannelsKt$trySendBlocking$2.L$0 = obj;
        return channelsKt__ChannelsKt$trySendBlocking$2;
    }

    @Override // tb.u1a
    public /* bridge */ /* synthetic */ Object invoke(uu4 uu4Var, ar4<? super e<? extends xhv>> ar4Var) {
        return invoke2(uu4Var, (ar4<? super e<xhv>>) ar4Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        Object obj3;
        Object d = dkf.d();
        int i = this.label;
        try {
            if (i == 0) {
                b.b(obj);
                uu4 uu4Var = (uu4) this.L$0;
                i<Object> iVar = this.$this_trySendBlocking;
                Object obj4 = this.$element;
                this.label = 1;
                if (iVar.d(obj4, this) == d) {
                    return d;
                }
            } else if (i == 1) {
                b.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            obj2 = Result.m1108constructorimpl(xhv.INSTANCE);
        } catch (Throwable th) {
            obj2 = Result.m1108constructorimpl(b.a(th));
        }
        if (Result.m1115isSuccessimpl(obj2)) {
            e.b bVar = e.Companion;
            obj3 = xhv.INSTANCE;
            bVar.b(obj3);
        } else {
            obj3 = e.Companion.a(Result.m1111exceptionOrNullimpl(obj2));
        }
        return e.a(obj3);
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final Object invoke2(uu4 uu4Var, ar4<? super e<xhv>> ar4Var) {
        return ((ChannelsKt__ChannelsKt$trySendBlocking$2) create(uu4Var, ar4Var)).invokeSuspend(xhv.INSTANCE);
    }
}
