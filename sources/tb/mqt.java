package tb;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public final class mqt {
    public static final mqt INSTANCE = new mqt();

    /* renamed from: a  reason: collision with root package name */
    public static final ThreadLocal<sk8> f24239a = nqt.a(new u1r("ThreadLocalEventLoop"));

    public final sk8 a() {
        ThreadLocal<sk8> threadLocal = f24239a;
        sk8 sk8Var = threadLocal.get();
        if (sk8Var != null) {
            return sk8Var;
        }
        sk8 a2 = tk8.a();
        threadLocal.set(a2);
        return a2;
    }

    public final void b() {
        f24239a.set(null);
    }

    public final void c(sk8 sk8Var) {
        f24239a.set(sk8Var);
    }
}
