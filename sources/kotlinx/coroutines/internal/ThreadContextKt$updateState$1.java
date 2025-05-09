package kotlinx.coroutines.internal;

import kotlin.Metadata;
import kotlin.coroutines.d;
import kotlin.jvm.internal.Lambda;
import tb.prt;
import tb.u1a;
import tb.upt;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ltb/prt;", "state", "Lkotlin/coroutines/d$b;", "element", "invoke", "(Ltb/prt;Lkotlin/coroutines/d$b;)Ltb/prt;", "<no name provided>"}, k = 3, mv = {1, 8, 0})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public final class ThreadContextKt$updateState$1 extends Lambda implements u1a<prt, d.b, prt> {
    public static final ThreadContextKt$updateState$1 INSTANCE = new ThreadContextKt$updateState$1();

    public ThreadContextKt$updateState$1() {
        super(2);
    }

    public final prt invoke(prt prtVar, d.b bVar) {
        if (bVar instanceof upt) {
            upt<?> uptVar = (upt) bVar;
            prtVar.a(uptVar, uptVar.M0(prtVar.f26265a));
        }
        return prtVar;
    }
}
