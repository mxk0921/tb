package kotlinx.coroutines.flow.internal;

import kotlin.Metadata;
import kotlin.coroutines.d;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.m;
import tb.u1a;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "count", "Lkotlin/coroutines/d$b;", "element", "invoke", "(ILkotlin/coroutines/d$b;)Ljava/lang/Integer;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public final class SafeCollector_commonKt$checkContext$result$1 extends Lambda implements u1a<Integer, d.b, Integer> {
    final /* synthetic */ SafeCollector<?> $this_checkContext;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SafeCollector_commonKt$checkContext$result$1(SafeCollector<?> safeCollector) {
        super(2);
        this.$this_checkContext = safeCollector;
    }

    @Override // tb.u1a
    public /* bridge */ /* synthetic */ Integer invoke(Integer num, d.b bVar) {
        return invoke(num.intValue(), bVar);
    }

    public final Integer invoke(int i, d.b bVar) {
        d.c<?> key = bVar.getKey();
        d.b bVar2 = this.$this_checkContext.collectContext.get(key);
        if (key != m.Key) {
            return Integer.valueOf(bVar != bVar2 ? Integer.MIN_VALUE : i + 1);
        }
        m mVar = (m) bVar2;
        m b = SafeCollector_commonKt.b((m) bVar, mVar);
        if (b == mVar) {
            if (mVar != null) {
                i++;
            }
            return Integer.valueOf(i);
        }
        throw new IllegalStateException(("Flow invariant is violated:\n\t\tEmission from another coroutine is detected.\n\t\tChild of " + b + ", expected child of " + mVar + ".\n\t\tFlowCollector is not thread-safe and concurrent emissions are prohibited.\n\t\tTo mitigate this restriction please use 'channelFlow' builder instead of 'flow'").toString());
    }
}
