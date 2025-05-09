package tb;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public final class mcf<T> implements qx8<T> {

    /* renamed from: a  reason: collision with root package name */
    public final T f23940a;

    public mcf(T t) {
        this.f23940a = t;
    }

    public static <T> qx8<T> a(T t) {
        gpm.c(t, "instance cannot be null");
        return new mcf(t);
    }

    @Override // tb.x1n
    public T get() {
        return this.f23940a;
    }
}
