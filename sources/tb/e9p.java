package tb;

import kotlinx.coroutines.selects.SelectKt;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public final class e9p implements d9p {

    /* renamed from: a  reason: collision with root package name */
    public final Object f18380a;
    public final w1a<Object, k9p<?>, Object, xhv> b;
    public final w1a<k9p<?>, Object, Object, g1a<Throwable, xhv>> c;
    public final w1a<Object, Object, Object, Object> d;

    /* JADX WARN: Multi-variable type inference failed */
    public e9p(Object obj, w1a<Object, ? super k9p<?>, Object, xhv> w1aVar, w1a<? super k9p<?>, Object, Object, ? extends g1a<? super Throwable, xhv>> w1aVar2) {
        w1a<Object, Object, Object, Object> w1aVar3;
        this.f18380a = obj;
        this.b = w1aVar;
        this.c = w1aVar2;
        w1aVar3 = SelectKt.f15393a;
        this.d = w1aVar3;
    }

    @Override // tb.j9p
    public w1a<k9p<?>, Object, Object, g1a<Throwable, xhv>> a() {
        return this.c;
    }

    @Override // tb.j9p
    public w1a<Object, k9p<?>, Object, xhv> b() {
        return this.b;
    }

    @Override // tb.j9p
    public Object c() {
        return this.f18380a;
    }

    @Override // tb.j9p
    public w1a<Object, Object, Object, Object> d() {
        return this.d;
    }

    public /* synthetic */ e9p(Object obj, w1a w1aVar, w1a w1aVar2, int i, a07 a07Var) {
        this(obj, w1aVar, (i & 4) != 0 ? null : w1aVar2);
    }
}
