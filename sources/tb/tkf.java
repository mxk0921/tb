package tb;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public final class tkf extends g23 {

    /* renamed from: a  reason: collision with root package name */
    public final g1a<Throwable, xhv> f28765a;

    /* JADX WARN: Multi-variable type inference failed */
    public tkf(g1a<? super Throwable, xhv> g1aVar) {
        this.f28765a = g1aVar;
    }

    @Override // tb.h23
    public void f(Throwable th) {
        this.f28765a.invoke(th);
    }

    @Override // tb.g1a
    public /* bridge */ /* synthetic */ xhv invoke(Throwable th) {
        f(th);
        return xhv.INSTANCE;
    }

    public String toString() {
        return "InvokeOnCancel[" + ov6.a(this.f28765a) + '@' + ov6.b(this) + ']';
    }
}
