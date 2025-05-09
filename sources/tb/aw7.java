package tb;

import kotlin.coroutines.d;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public final class aw7 implements d {

    /* renamed from: a  reason: collision with root package name */
    public final Throwable f16038a;
    public final /* synthetic */ d b;

    public aw7(Throwable th, d dVar) {
        this.f16038a = th;
        this.b = dVar;
    }

    @Override // kotlin.coroutines.d
    public <R> R fold(R r, u1a<? super R, ? super d.b, ? extends R> u1aVar) {
        return (R) this.b.fold(r, u1aVar);
    }

    @Override // kotlin.coroutines.d
    public <E extends d.b> E get(d.c<E> cVar) {
        return (E) this.b.get(cVar);
    }

    @Override // kotlin.coroutines.d
    public d minusKey(d.c<?> cVar) {
        return this.b.minusKey(cVar);
    }

    @Override // kotlin.coroutines.d
    public d plus(d dVar) {
        return this.b.plus(dVar);
    }
}
