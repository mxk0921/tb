package tb;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class iao {

    /* renamed from: a  reason: collision with root package name */
    public int f21195a;
    public float b;
    public final Map<String, Float> c;
    public boolean d;
    public int e;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public static final iao f21196a = new iao();

        static {
            t2o.a(813694999);
        }
    }

    static {
        t2o.a(813694997);
    }

    public static iao d() {
        return b.f21196a;
    }

    public int a() {
        int i = this.f21195a;
        if (i <= 0 || i > 1048576) {
            return 40960;
        }
        return i;
    }

    public int b() {
        int i = this.e;
        if (i <= 0 || i > 500) {
            return 50;
        }
        return i;
    }

    public float c(String str) {
        Float f = (Float) ((ConcurrentHashMap) this.c).get(str);
        if (f != null) {
            return Math.min(f.floatValue(), this.b);
        }
        return Math.min(1.0f, this.b);
    }

    public boolean e() {
        return this.d;
    }

    public void f(float f) {
        if (f < 0.0f || f > 1.0f) {
            this.b = 1.0f;
        } else {
            this.b = f;
        }
    }

    public void g(int i) {
        if (i <= 0 || i > 1048576) {
            this.f21195a = 40960;
        } else {
            this.f21195a = i;
        }
    }

    public void h(String str, float f) {
        Map<String, Float> map = this.c;
        if (f < 0.0f || f > 1.0f) {
            ((ConcurrentHashMap) map).put(str, Float.valueOf(1.0f));
            return;
        }
        ((ConcurrentHashMap) map).put(str, Float.valueOf(f));
    }

    public void i(int i) {
        if (i <= 0 || i > 500) {
            this.e = 50;
        } else {
            this.e = i;
        }
    }

    public void j(boolean z) {
        this.d = z;
    }

    public iao() {
        this.f21195a = 40960;
        this.b = 1.0f;
        this.c = new ConcurrentHashMap();
        this.d = false;
        this.e = 50;
    }
}
