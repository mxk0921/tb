package kotlin.sequences;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import tb.ar4;
import tb.d1a;
import tb.dkf;
import tb.sbp;
import tb.u1a;
import tb.vbp;
import tb.xhv;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "Ltb/vbp;", "Ltb/xhv;", "<anonymous>", "(Ltb/vbp;)V"}, k = 3, mv = {2, 1, 0})
@DebugMetadata(c = "kotlin.sequences.SequencesKt__SequencesKt$ifEmpty$1", f = "Sequences.kt", i = {}, l = {69, 71}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
final class SequencesKt__SequencesKt$ifEmpty$1 extends RestrictedSuspendLambda implements u1a<vbp<Object>, ar4<? super xhv>, Object> {
    final /* synthetic */ d1a<sbp<Object>> $defaultValue;
    final /* synthetic */ sbp<Object> $this_ifEmpty;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SequencesKt__SequencesKt$ifEmpty$1(sbp<Object> sbpVar, d1a<? extends sbp<Object>> d1aVar, ar4<? super SequencesKt__SequencesKt$ifEmpty$1> ar4Var) {
        super(2, ar4Var);
        this.$this_ifEmpty = sbpVar;
        this.$defaultValue = d1aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ar4<xhv> create(Object obj, ar4<?> ar4Var) {
        SequencesKt__SequencesKt$ifEmpty$1 sequencesKt__SequencesKt$ifEmpty$1 = new SequencesKt__SequencesKt$ifEmpty$1(this.$this_ifEmpty, this.$defaultValue, ar4Var);
        sequencesKt__SequencesKt$ifEmpty$1.L$0 = obj;
        return sequencesKt__SequencesKt$ifEmpty$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object d = dkf.d();
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            vbp vbpVar = (vbp) this.L$0;
            Iterator<Object> it = this.$this_ifEmpty.iterator();
            if (it.hasNext()) {
                this.label = 1;
                if (vbpVar.c(it, this) == d) {
                    return d;
                }
            } else {
                this.label = 2;
                if (vbpVar.d(this.$defaultValue.invoke(), this) == d) {
                    return d;
                }
            }
        } else if (i == 1 || i == 2) {
            b.b(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return xhv.INSTANCE;
    }

    public final Object invoke(vbp<Object> vbpVar, ar4<? super xhv> ar4Var) {
        return ((SequencesKt__SequencesKt$ifEmpty$1) create(vbpVar, ar4Var)).invokeSuspend(xhv.INSTANCE);
    }
}
