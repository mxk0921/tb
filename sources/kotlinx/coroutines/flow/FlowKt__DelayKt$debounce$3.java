package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.DelayKt;
import tb.g1a;
import tb.s08;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u0002H\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "T", "emittedItem", "invoke", "(Ljava/lang/Object;)Ljava/lang/Long;"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
final class FlowKt__DelayKt$debounce$3 extends Lambda implements g1a<Object, Long> {
    final /* synthetic */ g1a<Object, s08> $timeout;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowKt__DelayKt$debounce$3(g1a<Object, s08> g1aVar) {
        super(1);
        this.$timeout = g1aVar;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // tb.g1a
    public final Long invoke(Object obj) {
        return Long.valueOf(DelayKt.d(this.$timeout.invoke(obj).m0()));
    }
}
