package kotlinx.coroutines.flow.internal;

import kotlin.Metadata;
import kotlin.coroutines.d;
import kotlin.jvm.internal.Lambda;
import tb.u1a;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "", "count", "Lkotlin/coroutines/d$b;", "<anonymous parameter 1>", "invoke", "(ILkotlin/coroutines/d$b;)Ljava/lang/Integer;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public final class SafeCollector$collectContextSize$1 extends Lambda implements u1a<Integer, d.b, Integer> {
    public static final SafeCollector$collectContextSize$1 INSTANCE = new SafeCollector$collectContextSize$1();

    public SafeCollector$collectContextSize$1() {
        super(2);
    }

    public final Integer invoke(int i, d.b bVar) {
        return Integer.valueOf(i + 1);
    }

    @Override // tb.u1a
    public /* bridge */ /* synthetic */ Integer invoke(Integer num, d.b bVar) {
        return invoke(num.intValue(), bVar);
    }
}
