package tb;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public abstract class glk<V> implements mjn<Object, V> {

    /* renamed from: a  reason: collision with root package name */
    public V f20074a;

    public glk(V v) {
        this.f20074a = v;
    }

    @Override // tb.mjn
    public void a(Object obj, a0g<?> a0gVar, V v) {
        ckf.g(a0gVar, "property");
        V v2 = this.f20074a;
        d(a0gVar, v2, v);
        this.f20074a = v;
        c(a0gVar, v2, v);
    }

    @Override // tb.mjn
    public V b(Object obj, a0g<?> a0gVar) {
        ckf.g(a0gVar, "property");
        return this.f20074a;
    }

    public abstract void c(a0g<?> a0gVar, V v, V v2);

    public boolean d(a0g<?> a0gVar, V v, V v2) {
        ckf.g(a0gVar, "property");
        return true;
    }

    public String toString() {
        return "ObservableProperty(value=" + this.f20074a + ')';
    }
}
