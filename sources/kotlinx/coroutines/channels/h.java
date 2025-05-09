package kotlinx.coroutines.channels;

import kotlin.coroutines.d;
import kotlinx.coroutines.channels.i;
import tb.ni3;
import tb.ozm;
import tb.tu4;
import tb.xhv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public final class h<E> extends ni3<E> implements ozm<E> {
    public h(d dVar, c<E> cVar) {
        super(dVar, cVar, true, true);
    }

    @Override // kotlinx.coroutines.a
    public void t1(Throwable th, boolean z) {
        if (!w1().s(th) && !z) {
            tu4.a(getContext(), th);
        }
    }

    /* renamed from: x1 */
    public void u1(xhv xhvVar) {
        i.a.a(w1(), null, 1, null);
    }

    @Override // tb.ozm
    public /* bridge */ /* synthetic */ i w() {
        return this;
    }
}
