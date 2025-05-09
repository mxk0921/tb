package tb;

import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public abstract class pw1<K, A> {
    public final d<K> c;
    public fmh<A> e;

    /* renamed from: a  reason: collision with root package name */
    public final List<b> f26347a = new ArrayList(1);
    public boolean b = false;
    public float d = 0.0f;
    public A f = null;
    public float g = -1.0f;
    public float h = -1.0f;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public interface b {
        void g();
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class c<T> implements d<T> {
        public c() {
        }

        @Override // tb.pw1.d
        public boolean a(float f) {
            zhh.b("not implemented");
            return false;
        }

        @Override // tb.pw1.d
        public boolean b(float f) {
            return false;
        }

        @Override // tb.pw1.d
        public w4g<T> c() {
            zhh.b("not implemented");
            return null;
        }

        @Override // tb.pw1.d
        public float d() {
            return 0.0f;
        }

        @Override // tb.pw1.d
        public float e() {
            return 1.0f;
        }

        @Override // tb.pw1.d
        public boolean isEmpty() {
            return true;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public interface d<T> {
        boolean a(float f);

        boolean b(float f);

        w4g<T> c();

        float d();

        float e();

        boolean isEmpty();
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class e<T> implements d<T> {

        /* renamed from: a  reason: collision with root package name */
        public final List<? extends w4g<T>> f26348a;
        public w4g<T> c = null;
        public float d = -1.0f;
        public w4g<T> b = f(0.0f);

        public e(List<? extends w4g<T>> list) {
            this.f26348a = list;
        }

        @Override // tb.pw1.d
        public boolean a(float f) {
            w4g<T> w4gVar = this.c;
            w4g<T> w4gVar2 = this.b;
            if (w4gVar == w4gVar2 && this.d == f) {
                return true;
            }
            this.c = w4gVar2;
            this.d = f;
            return false;
        }

        @Override // tb.pw1.d
        public boolean b(float f) {
            if (this.b.a(f)) {
                return !this.b.h();
            }
            this.b = f(f);
            return true;
        }

        @Override // tb.pw1.d
        public w4g<T> c() {
            return this.b;
        }

        @Override // tb.pw1.d
        public float d() {
            return ((w4g) this.f26348a.get(0)).e();
        }

        @Override // tb.pw1.d
        public float e() {
            List<? extends w4g<T>> list = this.f26348a;
            return ((w4g) list.get(list.size() - 1)).b();
        }

        public final w4g<T> f(float f) {
            List<? extends w4g<T>> list = this.f26348a;
            w4g<T> w4gVar = (w4g) list.get(list.size() - 1);
            if (f >= w4gVar.e()) {
                return w4gVar;
            }
            for (int size = list.size() - 2; size >= 1; size--) {
                w4g<T> w4gVar2 = (w4g) list.get(size);
                if (this.b != w4gVar2 && w4gVar2.a(f)) {
                    return w4gVar2;
                }
            }
            return (w4g) list.get(0);
        }

        @Override // tb.pw1.d
        public boolean isEmpty() {
            return false;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class f<T> implements d<T> {

        /* renamed from: a  reason: collision with root package name */
        public final w4g<T> f26349a;
        public float b = -1.0f;

        public f(List<? extends w4g<T>> list) {
            this.f26349a = (w4g) list.get(0);
        }

        @Override // tb.pw1.d
        public boolean a(float f) {
            if (this.b == f) {
                return true;
            }
            this.b = f;
            return false;
        }

        @Override // tb.pw1.d
        public boolean b(float f) {
            return !this.f26349a.h();
        }

        @Override // tb.pw1.d
        public w4g<T> c() {
            return this.f26349a;
        }

        @Override // tb.pw1.d
        public float d() {
            return this.f26349a.e();
        }

        @Override // tb.pw1.d
        public float e() {
            return this.f26349a.b();
        }

        @Override // tb.pw1.d
        public boolean isEmpty() {
            return false;
        }
    }

    public pw1(List<? extends w4g<K>> list) {
        this.c = o(list);
    }

    public static <T> d<T> o(List<? extends w4g<T>> list) {
        if (list.isEmpty()) {
            return new c();
        }
        if (list.size() == 1) {
            return new f(list);
        }
        return new e(list);
    }

    public void a(b bVar) {
        ((ArrayList) this.f26347a).add(bVar);
    }

    public w4g<K> b() {
        w4g<K> c2 = this.c.c();
        k6g.a("BaseKeyframeAnimation#getCurrentKeyframe");
        return c2;
    }

    public float c() {
        if (this.h == -1.0f) {
            this.h = this.c.e();
        }
        return this.h;
    }

    public float d() {
        w4g<K> b2 = b();
        if (b2.h()) {
            return 0.0f;
        }
        return b2.d.getInterpolation(e());
    }

    public float e() {
        if (this.b) {
            return 0.0f;
        }
        w4g<K> b2 = b();
        if (b2 == null) {
            zhh.b("The result of BaseKeyframeAnimation#getCurrentKeyframe is null!!");
            return 0.0f;
        } else if (b2.h()) {
            return 0.0f;
        } else {
            return (this.d - b2.e()) / (b2.b() - b2.e());
        }
    }

    public float f() {
        return this.d;
    }

    public final float g() {
        if (this.g == -1.0f) {
            this.g = this.c.d();
        }
        return this.g;
    }

    public A h() {
        A a2;
        Interpolator interpolator;
        float e2 = e();
        if (this.e == null && this.c.a(e2)) {
            return this.f;
        }
        w4g<K> b2 = b();
        Interpolator interpolator2 = b2.e;
        if (interpolator2 == null || (interpolator = b2.f) == null) {
            a2 = i(b2, d());
        } else {
            a2 = j(b2, e2, interpolator2.getInterpolation(e2), interpolator.getInterpolation(e2));
        }
        this.f = a2;
        return a2;
    }

    public abstract A i(w4g<K> w4gVar, float f2);

    public A j(w4g<K> w4gVar, float f2, float f3, float f4) {
        throw new UnsupportedOperationException("This animation does not support split dimensions!");
    }

    public void k() {
        int i = 0;
        while (true) {
            ArrayList arrayList = (ArrayList) this.f26347a;
            if (i < arrayList.size()) {
                ((b) arrayList.get(i)).g();
                i++;
            } else {
                return;
            }
        }
    }

    public void l() {
        this.b = true;
    }

    public void m(float f2) {
        d<K> dVar = this.c;
        if (!dVar.isEmpty()) {
            if (f2 < g()) {
                f2 = g();
            } else if (f2 > c()) {
                f2 = c();
            }
            if (f2 != this.d) {
                this.d = f2;
                if (dVar.b(f2)) {
                    k();
                }
            }
        }
    }

    public void n(fmh<A> fmhVar) {
        fmh<A> fmhVar2 = this.e;
        if (fmhVar2 != null) {
            fmhVar2.c(null);
        }
        this.e = fmhVar;
    }
}
