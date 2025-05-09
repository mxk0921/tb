package kotlinx.coroutines.internal;

import kotlin.Metadata;
import kotlin.coroutines.d;
import kotlin.jvm.internal.Lambda;
import tb.u1a;
import tb.upt;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00002\f\u0010\u0001\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ltb/upt;", "found", "Lkotlin/coroutines/d$b;", "element", "invoke", "(Ltb/upt;Lkotlin/coroutines/d$b;)Ltb/upt;", "<no name provided>"}, k = 3, mv = {1, 8, 0})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public final class ThreadContextKt$findOne$1 extends Lambda implements u1a<upt<?>, d.b, upt<?>> {
    public static final ThreadContextKt$findOne$1 INSTANCE = new ThreadContextKt$findOne$1();

    public ThreadContextKt$findOne$1() {
        super(2);
    }

    public final upt<?> invoke(upt<?> uptVar, d.b bVar) {
        if (uptVar != null) {
            return uptVar;
        }
        if (bVar instanceof upt) {
            return (upt) bVar;
        }
        return null;
    }
}
