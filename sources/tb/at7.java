package tb;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public final class at7<T> implements x1n<T> {
    public static final Object c = new Object();

    /* renamed from: a  reason: collision with root package name */
    public volatile x1n<T> f15988a;
    public volatile Object b = c;

    public at7(x1n<T> x1nVar) {
        this.f15988a = x1nVar;
    }

    public static <P extends x1n<T>, T> x1n<T> a(P p) {
        gpm.b(p);
        if (p instanceof at7) {
            return p;
        }
        return new at7(p);
    }

    public static Object b(Object obj, Object obj2) {
        if (obj == c || obj == obj2) {
            return obj2;
        }
        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj + " & " + obj2 + ". This is likely due to a circular dependency.");
    }

    @Override // tb.x1n
    public T get() {
        T t = (T) this.b;
        Object obj = c;
        if (t == obj) {
            synchronized (this) {
                try {
                    t = this.b;
                    if (t == obj) {
                        t = this.f15988a.get();
                        b(this.b, t);
                        this.b = t;
                        this.f15988a = null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return t;
    }
}
