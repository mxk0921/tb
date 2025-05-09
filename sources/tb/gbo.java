package tb;

import kotlin.Result;
import kotlin.b;
import kotlinx.coroutines.c;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public final class gbo<T> extends ruf {
    public final c<T> h;

    /* JADX WARN: Multi-variable type inference failed */
    public gbo(c<? super T> cVar) {
        this.h = cVar;
    }

    @Override // tb.g1a
    public /* bridge */ /* synthetic */ xhv invoke(Throwable th) {
        p(th);
        return xhv.INSTANCE;
    }

    @Override // tb.ha4
    public void p(Throwable th) {
        Object v0 = q().v0();
        String str = dv6.DEBUG_PROPERTY_NAME;
        boolean z = v0 instanceof fa4;
        c<T> cVar = this.h;
        if (z) {
            cVar.resumeWith(Result.m1108constructorimpl(b.a(((fa4) v0).f19137a)));
        } else {
            cVar.resumeWith(Result.m1108constructorimpl(suf.b(v0)));
        }
    }
}
