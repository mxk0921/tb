package tb;

import kotlinx.coroutines.JobSupport;
import kotlinx.coroutines.c;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public final class gr3 extends huf {
    public final c<?> h;

    public gr3(c<?> cVar) {
        this.h = cVar;
    }

    @Override // tb.g1a
    public /* bridge */ /* synthetic */ xhv invoke(Throwable th) {
        p(th);
        return xhv.INSTANCE;
    }

    @Override // tb.ha4
    public void p(Throwable th) {
        JobSupport q = q();
        c<?> cVar = this.h;
        cVar.R(cVar.y(q));
    }
}
