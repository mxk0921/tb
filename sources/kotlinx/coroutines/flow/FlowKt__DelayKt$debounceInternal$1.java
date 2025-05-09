package kotlinx.coroutines.flow;

import com.taobao.artc.api.AConstants;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import tb.ar4;
import tb.g1a;
import tb.pg1;
import tb.qp9;
import tb.sp9;
import tb.uu4;
import tb.w1a;
import tb.xhv;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "Ltb/uu4;", "Ltb/sp9;", "downstream", "Ltb/xhv;", "<anonymous>", "(Ltb/uu4;Ltb/sp9;)V"}, k = 3, mv = {1, 8, 0})
@DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1", f = "Delay.kt", i = {0, 0, 0, 0, 1, 1, 1}, l = {AConstants.ArtcErrorServerErrorDropByMobility, 426}, m = "invokeSuspend", n = {"downstream", pg1.ATOM_values, "lastValue", "timeoutMillis", "downstream", pg1.ATOM_values, "lastValue"}, s = {"L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2"})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
final class FlowKt__DelayKt$debounceInternal$1 extends SuspendLambda implements w1a<uu4, sp9<Object>, ar4<? super xhv>, Object> {
    final /* synthetic */ qp9<Object> $this_debounceInternal;
    final /* synthetic */ g1a<Object, Long> $timeoutMillisSelector;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    Object L$2;
    Object L$3;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowKt__DelayKt$debounceInternal$1(g1a<Object, Long> g1aVar, qp9<Object> qp9Var, ar4<? super FlowKt__DelayKt$debounceInternal$1> ar4Var) {
        super(3, ar4Var);
        this.$timeoutMillisSelector = g1aVar;
        this.$this_debounceInternal = qp9Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00e4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00e5  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x00e2 -> B:7:0x001e). Please submit an issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            Method dump skipped, instructions count: 232
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public final Object invoke(uu4 uu4Var, sp9<Object> sp9Var, ar4<? super xhv> ar4Var) {
        FlowKt__DelayKt$debounceInternal$1 flowKt__DelayKt$debounceInternal$1 = new FlowKt__DelayKt$debounceInternal$1(this.$timeoutMillisSelector, this.$this_debounceInternal, ar4Var);
        flowKt__DelayKt$debounceInternal$1.L$0 = uu4Var;
        flowKt__DelayKt$debounceInternal$1.L$1 = sp9Var;
        return flowKt__DelayKt$debounceInternal$1.invokeSuspend(xhv.INSTANCE);
    }
}
