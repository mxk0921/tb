package tb;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class hao<T> {

    /* renamed from: a  reason: collision with root package name */
    public int f20504a = 0;
    public int b = 0;
    public final Object[] c;

    static {
        t2o.a(813694996);
    }

    public hao(int i) {
        this.c = new Object[i];
    }

    public boolean a() {
        if (this.b == 0) {
            return true;
        }
        return false;
    }

    public T b() {
        if (a()) {
            return null;
        }
        int i = this.f20504a;
        int i2 = this.b;
        int i3 = ((i - i2) + 100) % 100;
        Object[] objArr = this.c;
        T t = (T) objArr[i3];
        objArr[i3] = null;
        this.b = i2 - 1;
        return t;
    }

    public T c(T t) {
        int i = this.f20504a;
        Object[] objArr = this.c;
        T t2 = (T) objArr[i];
        objArr[i] = t;
        this.f20504a = (i + 1) % 100;
        int i2 = this.b;
        if (i2 < 100) {
            this.b = i2 + 1;
        }
        return t2;
    }
}
