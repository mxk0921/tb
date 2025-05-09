package kotlin.sequences;

import java.util.List;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.random.Random;
import tb.ar4;
import tb.d04;
import tb.dcp;
import tb.dkf;
import tb.pg1;
import tb.ra;
import tb.sbp;
import tb.u1a;
import tb.vbp;
import tb.xhv;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "Ltb/vbp;", "Ltb/xhv;", "<anonymous>", "(Ltb/vbp;)V"}, k = 3, mv = {2, 1, 0})
@DebugMetadata(c = "kotlin.sequences.SequencesKt__SequencesKt$shuffled$1", f = "Sequences.kt", i = {0, 0}, l = {ra.INSTALL_PROVIDER}, m = "invokeSuspend", n = {"$this$sequence", pg1.ATOM_EXT_buffer}, s = {"L$0", "L$1"})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
final class SequencesKt__SequencesKt$shuffled$1 extends RestrictedSuspendLambda implements u1a<vbp<Object>, ar4<? super xhv>, Object> {
    final /* synthetic */ Random $random;
    final /* synthetic */ sbp<Object> $this_shuffled;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SequencesKt__SequencesKt$shuffled$1(sbp<Object> sbpVar, Random random, ar4<? super SequencesKt__SequencesKt$shuffled$1> ar4Var) {
        super(2, ar4Var);
        this.$this_shuffled = sbpVar;
        this.$random = random;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ar4<xhv> create(Object obj, ar4<?> ar4Var) {
        SequencesKt__SequencesKt$shuffled$1 sequencesKt__SequencesKt$shuffled$1 = new SequencesKt__SequencesKt$shuffled$1(this.$this_shuffled, this.$random, ar4Var);
        sequencesKt__SequencesKt$shuffled$1.L$0 = obj;
        return sequencesKt__SequencesKt$shuffled$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        vbp vbpVar;
        List list;
        Object d = dkf.d();
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            list = dcp.z(this.$this_shuffled);
            vbpVar = (vbp) this.L$0;
        } else if (i == 1) {
            list = (List) this.L$1;
            vbpVar = (vbp) this.L$0;
            b.b(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        while (!list.isEmpty()) {
            int nextInt = this.$random.nextInt(list.size());
            Object C = d04.C(list);
            if (nextInt < list.size()) {
                C = list.set(nextInt, C);
            }
            this.L$0 = vbpVar;
            this.L$1 = list;
            this.label = 1;
            if (vbpVar.a(C, this) == d) {
                return d;
            }
        }
        return xhv.INSTANCE;
    }

    public final Object invoke(vbp<Object> vbpVar, ar4<? super xhv> ar4Var) {
        return ((SequencesKt__SequencesKt$shuffled$1) create(vbpVar, ar4Var)).invokeSuspend(xhv.INSTANCE);
    }
}
