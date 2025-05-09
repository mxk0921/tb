package tb;

import kotlin.coroutines.d;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public final class qgv implements d.b, d.c<qgv> {
    public static final qgv INSTANCE = new qgv();

    @Override // kotlin.coroutines.d
    public <R> R fold(R r, u1a<? super R, ? super d.b, ? extends R> u1aVar) {
        return (R) d.b.a.a(this, r, u1aVar);
    }

    @Override // kotlin.coroutines.d
    public <E extends d.b> E get(d.c<E> cVar) {
        return (E) d.b.a.b(this, cVar);
    }

    @Override // kotlin.coroutines.d
    public d minusKey(d.c<?> cVar) {
        return d.b.a.c(this, cVar);
    }

    @Override // kotlin.coroutines.d
    public d plus(d dVar) {
        return d.b.a.d(this, dVar);
    }

    @Override // kotlin.coroutines.d.b
    public d.c<?> getKey() {
        return this;
    }
}
