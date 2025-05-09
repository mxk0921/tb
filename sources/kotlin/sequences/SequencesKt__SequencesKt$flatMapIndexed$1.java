package kotlin.sequences;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import tb.ar4;
import tb.dkf;
import tb.g1a;
import tb.gk2;
import tb.sbp;
import tb.u1a;
import tb.vbp;
import tb.xhv;
import tb.yz3;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"R", "Ltb/vbp;", "Ltb/xhv;", "<anonymous>", "(Ltb/vbp;)V"}, k = 3, mv = {2, 1, 0})
@DebugMetadata(c = "kotlin.sequences.SequencesKt__SequencesKt$flatMapIndexed$1", f = "Sequences.kt", i = {0, 0}, l = {350}, m = "invokeSuspend", n = {"$this$sequence", "index"}, s = {"L$0", "I$0"})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
final class SequencesKt__SequencesKt$flatMapIndexed$1 extends RestrictedSuspendLambda implements u1a<vbp<Object>, ar4<? super xhv>, Object> {
    final /* synthetic */ g1a<Object, Iterator<Object>> $iterator;
    final /* synthetic */ sbp<Object> $source;
    final /* synthetic */ u1a<Integer, Object, Object> $transform;
    int I$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SequencesKt__SequencesKt$flatMapIndexed$1(sbp<Object> sbpVar, u1a<? super Integer, Object, Object> u1aVar, g1a<Object, ? extends Iterator<Object>> g1aVar, ar4<? super SequencesKt__SequencesKt$flatMapIndexed$1> ar4Var) {
        super(2, ar4Var);
        this.$source = sbpVar;
        this.$transform = u1aVar;
        this.$iterator = g1aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ar4<xhv> create(Object obj, ar4<?> ar4Var) {
        SequencesKt__SequencesKt$flatMapIndexed$1 sequencesKt__SequencesKt$flatMapIndexed$1 = new SequencesKt__SequencesKt$flatMapIndexed$1(this.$source, this.$transform, this.$iterator, ar4Var);
        sequencesKt__SequencesKt$flatMapIndexed$1.L$0 = obj;
        return sequencesKt__SequencesKt$flatMapIndexed$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i;
        vbp vbpVar;
        Iterator<Object> it;
        Object d = dkf.d();
        int i2 = this.label;
        if (i2 == 0) {
            b.b(obj);
            vbpVar = (vbp) this.L$0;
            it = this.$source.iterator();
            i = 0;
        } else if (i2 == 1) {
            int i3 = this.I$0;
            it = (Iterator) this.L$1;
            vbpVar = (vbp) this.L$0;
            b.b(obj);
            i = i3;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        while (it.hasNext()) {
            Object next = it.next();
            u1a<Integer, Object, Object> u1aVar = this.$transform;
            int i4 = i + 1;
            if (i >= 0) {
                Object invoke = u1aVar.invoke(gk2.b(i), next);
                this.L$0 = vbpVar;
                this.L$1 = it;
                this.I$0 = i4;
                this.label = 1;
                if (vbpVar.c(this.$iterator.invoke(invoke), this) == d) {
                    return d;
                }
                i = i4;
            } else {
                yz3.p();
                throw null;
            }
        }
        return xhv.INSTANCE;
    }

    public final Object invoke(vbp<Object> vbpVar, ar4<? super xhv> ar4Var) {
        return ((SequencesKt__SequencesKt$flatMapIndexed$1) create(vbpVar, ar4Var)).invokeSuspend(xhv.INSTANCE);
    }
}
