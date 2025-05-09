package tb;

import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.selects.OnTimeout;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public final class nvk {
    /* JADX WARN: Multi-variable type inference failed */
    public static final <R> void a(c9p<? super R> c9pVar, long j, g1a<? super ar4<? super R>, ? extends Object> g1aVar) {
        c9pVar.a(new OnTimeout(j).b(), g1aVar);
    }

    public static final <R> void b(c9p<? super R> c9pVar, long j, g1a<? super ar4<? super R>, ? extends Object> g1aVar) {
        a(c9pVar, DelayKt.d(j), g1aVar);
    }
}
