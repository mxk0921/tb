package tb;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public final class g9p<Q> implements f9p<Q> {

    /* renamed from: a  reason: collision with root package name */
    public final Object f19816a;
    public final w1a<Object, k9p<?>, Object, xhv> b;
    public final w1a<Object, Object, Object, Object> c;
    public final w1a<k9p<?>, Object, Object, g1a<Throwable, xhv>> d;

    /* JADX WARN: Multi-variable type inference failed */
    public g9p(Object obj, w1a<Object, ? super k9p<?>, Object, xhv> w1aVar, w1a<Object, Object, Object, ? extends Object> w1aVar2, w1a<? super k9p<?>, Object, Object, ? extends g1a<? super Throwable, xhv>> w1aVar3) {
        this.f19816a = obj;
        this.b = w1aVar;
        this.c = w1aVar2;
        this.d = w1aVar3;
    }

    @Override // tb.j9p
    public w1a<k9p<?>, Object, Object, g1a<Throwable, xhv>> a() {
        return this.d;
    }

    @Override // tb.j9p
    public w1a<Object, k9p<?>, Object, xhv> b() {
        return this.b;
    }

    @Override // tb.j9p
    public Object c() {
        return this.f19816a;
    }

    @Override // tb.j9p
    public w1a<Object, Object, Object, Object> d() {
        return this.c;
    }

    public /* synthetic */ g9p(Object obj, w1a w1aVar, w1a w1aVar2, w1a w1aVar3, int i, a07 a07Var) {
        this(obj, w1aVar, w1aVar2, (i & 8) != 0 ? null : w1aVar3);
    }
}
