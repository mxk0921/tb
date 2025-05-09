package tb;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public final class vr7 extends g23 {

    /* renamed from: a  reason: collision with root package name */
    public final rr7 f30197a;

    public vr7(rr7 rr7Var) {
        this.f30197a = rr7Var;
    }

    @Override // tb.h23
    public void f(Throwable th) {
        this.f30197a.dispose();
    }

    @Override // tb.g1a
    public /* bridge */ /* synthetic */ xhv invoke(Throwable th) {
        f(th);
        return xhv.INSTANCE;
    }

    public String toString() {
        return "DisposeOnCancel[" + this.f30197a + ']';
    }
}
