package tb;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public final class a8k<T> implements mjn<Object, T> {

    /* renamed from: a  reason: collision with root package name */
    public T f15596a;

    @Override // tb.mjn
    public void a(Object obj, a0g<?> a0gVar, T t) {
        ckf.g(a0gVar, "property");
        ckf.g(t, "value");
        this.f15596a = t;
    }

    @Override // tb.mjn
    public T b(Object obj, a0g<?> a0gVar) {
        ckf.g(a0gVar, "property");
        T t = this.f15596a;
        if (t != null) {
            return t;
        }
        throw new IllegalStateException("Property " + a0gVar.getName() + " should be initialized before get.");
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder("NotNullProperty(");
        if (this.f15596a != null) {
            str = "value=" + this.f15596a;
        } else {
            str = "value not initialized yet";
        }
        sb.append(str);
        sb.append(')');
        return sb.toString();
    }
}
