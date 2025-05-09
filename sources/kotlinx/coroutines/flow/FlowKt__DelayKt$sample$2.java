package kotlinx.coroutines.flow;

import com.huawei.hms.push.constant.RemoteMessageConst;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.channels.ProduceKt;
import kotlinx.coroutines.channels.ReceiveChannel;
import kotlinx.coroutines.selects.SelectImplementation;
import tb.ar4;
import tb.dkf;
import tb.iak;
import tb.pg1;
import tb.qp9;
import tb.sp9;
import tb.uu4;
import tb.w1a;
import tb.xhv;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "Ltb/uu4;", "Ltb/sp9;", "downstream", "Ltb/xhv;", "<anonymous>", "(Ltb/uu4;Ltb/sp9;)V"}, k = 3, mv = {1, 8, 0})
@DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$sample$2", f = "Delay.kt", i = {0, 0, 0, 0}, l = {423}, m = "invokeSuspend", n = {"downstream", pg1.ATOM_values, "lastValue", RemoteMessageConst.Notification.TICKER}, s = {"L$0", "L$1", "L$2", "L$3"})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
final class FlowKt__DelayKt$sample$2 extends SuspendLambda implements w1a<uu4, sp9<Object>, ar4<? super xhv>, Object> {
    final /* synthetic */ long $periodMillis;
    final /* synthetic */ qp9<Object> $this_sample;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    Object L$2;
    Object L$3;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowKt__DelayKt$sample$2(long j, qp9<Object> qp9Var, ar4<? super FlowKt__DelayKt$sample$2> ar4Var) {
        super(3, ar4Var);
        this.$periodMillis = j;
        this.$this_sample = qp9Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        sp9 sp9Var;
        ReceiveChannel receiveChannel;
        Ref$ObjectRef ref$ObjectRef;
        ReceiveChannel receiveChannel2;
        ReceiveChannel b;
        Object d = dkf.d();
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            uu4 uu4Var = (uu4) this.L$0;
            ReceiveChannel e = ProduceKt.e(uu4Var, null, -1, new FlowKt__DelayKt$sample$2$values$1(this.$this_sample, null), 1, null);
            Ref$ObjectRef ref$ObjectRef2 = new Ref$ObjectRef();
            b = FlowKt__DelayKt.b(uu4Var, this.$periodMillis, 0L, 2, null);
            sp9Var = (sp9) this.L$1;
            receiveChannel = e;
            ref$ObjectRef = ref$ObjectRef2;
            receiveChannel2 = b;
        } else if (i == 1) {
            receiveChannel2 = (ReceiveChannel) this.L$3;
            ref$ObjectRef = (Ref$ObjectRef) this.L$2;
            receiveChannel = (ReceiveChannel) this.L$1;
            sp9Var = (sp9) this.L$0;
            b.b(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        while (ref$ObjectRef.element != iak.DONE) {
            SelectImplementation selectImplementation = new SelectImplementation(getContext());
            selectImplementation.s(receiveChannel.n(), new FlowKt__DelayKt$sample$2$1$1(ref$ObjectRef, receiveChannel2, null));
            selectImplementation.s(receiveChannel2.j(), new FlowKt__DelayKt$sample$2$1$2(ref$ObjectRef, sp9Var, null));
            this.L$0 = sp9Var;
            this.L$1 = receiveChannel;
            this.L$2 = ref$ObjectRef;
            this.L$3 = receiveChannel2;
            this.label = 1;
            if (selectImplementation.o(this) == d) {
                return d;
            }
        }
        return xhv.INSTANCE;
    }

    public final Object invoke(uu4 uu4Var, sp9<Object> sp9Var, ar4<? super xhv> ar4Var) {
        FlowKt__DelayKt$sample$2 flowKt__DelayKt$sample$2 = new FlowKt__DelayKt$sample$2(this.$periodMillis, this.$this_sample, ar4Var);
        flowKt__DelayKt$sample$2.L$0 = uu4Var;
        flowKt__DelayKt$sample$2.L$1 = sp9Var;
        return flowKt__DelayKt$sample$2.invokeSuspend(xhv.INSTANCE);
    }
}
