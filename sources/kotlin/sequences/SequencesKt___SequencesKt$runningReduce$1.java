package kotlin.sequences;

import androidx.exifinterface.media.ExifInterface;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import tb.ar4;
import tb.dkf;
import tb.pg1;
import tb.sbp;
import tb.u1a;
import tb.vbp;
import tb.xhv;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {ExifInterface.LATITUDE_SOUTH, "Ltb/vbp;", "Ltb/xhv;", "<anonymous>", "(Ltb/vbp;)V"}, k = 3, mv = {2, 1, 0})
@DebugMetadata(c = "kotlin.sequences.SequencesKt___SequencesKt$runningReduce$1", f = "_Sequences.kt", i = {0, 0, 0, 1, 1, 1}, l = {2368, 2371}, m = "invokeSuspend", n = {"$this$sequence", pg1.ATOM_EXT_iterator, "accumulator", "$this$sequence", pg1.ATOM_EXT_iterator, "accumulator"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2"})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
final class SequencesKt___SequencesKt$runningReduce$1 extends RestrictedSuspendLambda implements u1a<vbp<Object>, ar4<? super xhv>, Object> {
    final /* synthetic */ u1a<Object, Object, Object> $operation;
    final /* synthetic */ sbp<Object> $this_runningReduce;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SequencesKt___SequencesKt$runningReduce$1(sbp<Object> sbpVar, u1a<Object, Object, Object> u1aVar, ar4<? super SequencesKt___SequencesKt$runningReduce$1> ar4Var) {
        super(2, ar4Var);
        this.$this_runningReduce = sbpVar;
        this.$operation = u1aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ar4<xhv> create(Object obj, ar4<?> ar4Var) {
        SequencesKt___SequencesKt$runningReduce$1 sequencesKt___SequencesKt$runningReduce$1 = new SequencesKt___SequencesKt$runningReduce$1(this.$this_runningReduce, this.$operation, ar4Var);
        sequencesKt___SequencesKt$runningReduce$1.L$0 = obj;
        return sequencesKt___SequencesKt$runningReduce$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        vbp vbpVar;
        Iterator<Object> it;
        Object obj2;
        Object d = dkf.d();
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            vbpVar = (vbp) this.L$0;
            Iterator<Object> it2 = this.$this_runningReduce.iterator();
            if (it2.hasNext()) {
                obj2 = it2.next();
                this.L$0 = vbpVar;
                this.L$1 = it2;
                this.L$2 = obj2;
                this.label = 1;
                if (vbpVar.a(obj2, this) == d) {
                    return d;
                }
                it = it2;
            }
            return xhv.INSTANCE;
        } else if (i == 1 || i == 2) {
            obj2 = this.L$2;
            it = (Iterator) this.L$1;
            vbpVar = (vbp) this.L$0;
            b.b(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        while (it.hasNext()) {
            obj2 = this.$operation.invoke(obj2, it.next());
            this.L$0 = vbpVar;
            this.L$1 = it;
            this.L$2 = obj2;
            this.label = 2;
            if (vbpVar.a(obj2, this) == d) {
                return d;
            }
        }
        return xhv.INSTANCE;
    }

    public final Object invoke(vbp<Object> vbpVar, ar4<? super xhv> ar4Var) {
        return ((SequencesKt___SequencesKt$runningReduce$1) create(vbpVar, ar4Var)).invokeSuspend(xhv.INSTANCE);
    }
}
