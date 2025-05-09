package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.coroutines.d;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref$ObjectRef;
import tb.st4;
import tb.u1a;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlin/coroutines/d;", "result", "Lkotlin/coroutines/d$b;", "element", "invoke", "(Lkotlin/coroutines/d;Lkotlin/coroutines/d$b;)Lkotlin/coroutines/d;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public final class CoroutineContextKt$foldCopies$folded$1 extends Lambda implements u1a<d, d.b, d> {
    final /* synthetic */ boolean $isNewCoroutine;
    final /* synthetic */ Ref$ObjectRef<d> $leftoverContext;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoroutineContextKt$foldCopies$folded$1(Ref$ObjectRef<d> ref$ObjectRef, boolean z) {
        super(2);
        this.$leftoverContext = ref$ObjectRef;
        this.$isNewCoroutine = z;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [T, kotlin.coroutines.d] */
    public final d invoke(d dVar, d.b bVar) {
        if (!(bVar instanceof st4)) {
            return dVar.plus(bVar);
        }
        d.b bVar2 = this.$leftoverContext.element.get(bVar.getKey());
        if (bVar2 == null) {
            st4 st4Var = (st4) bVar;
            if (this.$isNewCoroutine) {
                st4Var = st4Var.e();
            }
            return dVar.plus(st4Var);
        }
        Ref$ObjectRef<d> ref$ObjectRef = this.$leftoverContext;
        ref$ObjectRef.element = ref$ObjectRef.element.minusKey(bVar.getKey());
        return dVar.plus(((st4) bVar).Z(bVar2));
    }
}
