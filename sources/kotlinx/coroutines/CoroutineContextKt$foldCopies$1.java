package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.coroutines.d;
import kotlin.jvm.internal.Lambda;
import tb.st4;
import tb.u1a;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlin/coroutines/d;", "result", "Lkotlin/coroutines/d$b;", "element", "invoke", "(Lkotlin/coroutines/d;Lkotlin/coroutines/d$b;)Lkotlin/coroutines/d;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public final class CoroutineContextKt$foldCopies$1 extends Lambda implements u1a<d, d.b, d> {
    public static final CoroutineContextKt$foldCopies$1 INSTANCE = new CoroutineContextKt$foldCopies$1();

    public CoroutineContextKt$foldCopies$1() {
        super(2);
    }

    public final d invoke(d dVar, d.b bVar) {
        if (bVar instanceof st4) {
            return dVar.plus(((st4) bVar).e());
        }
        return dVar.plus(bVar);
    }
}
