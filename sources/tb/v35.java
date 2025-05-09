package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class v35<T> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final lc7<T> f29758a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class a<T> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final lc7<T> f29759a;
        public final T b;

        public a(lc7<T> lc7Var, T t) {
            this.f29759a = lc7Var;
            this.b = t;
        }

        public static <T> a<T> a(lc7<T> lc7Var, T t) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("286b971d", new Object[]{lc7Var, t});
            }
            return new a<>(lc7Var, t);
        }

        @SafeVarargs
        public final void b(T t, T... tArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9c900031", new Object[]{this, t, tArr});
            } else {
                e.a(this.f29759a, this.b).b(t, tArr);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class b<T> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final lc7<T> f29760a;
        public final T[] b;

        public b(lc7<T> lc7Var, T[] tArr) {
            this.f29760a = lc7Var;
            this.b = tArr;
        }

        public static <T> b<T> a(lc7<T> lc7Var, T[] tArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("45c0f421", new Object[]{lc7Var, tArr});
            }
            return new b<>(lc7Var, tArr);
        }

        public final void b(T t) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("61602b00", new Object[]{this, t});
            } else {
                f.a(this.f29760a, this.b).b(t);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class c<T> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final lc7<T> f29761a;

        public c(lc7<T> lc7Var, T t) {
            lc7Var.addAsDependentOnAllLeafNodes(t);
            this.f29761a = lc7Var;
        }

        public static <T> c<T> a(lc7<T> lc7Var, T t) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (c) ipChange.ipc$dispatch("f1246651", new Object[]{lc7Var, t});
            }
            return new c<>(lc7Var, t);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class d<T> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final lc7<T> f29762a;

        public d(lc7<T> lc7Var, T t) {
            this.f29762a = lc7Var;
            lc7Var.addAsDependencyToAllInitialNodes(t);
        }

        public static <T> d<T> a(lc7<T> lc7Var, T t) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (d) ipChange.ipc$dispatch("df838ab1", new Object[]{lc7Var, t});
            }
            return new d<>(lc7Var, t);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class e<T> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final lc7<T> f29763a;
        public final T b;

        public e(lc7<T> lc7Var, T t) {
            this.f29763a = lc7Var;
            this.b = t;
        }

        public static <T> e<T> a(lc7<T> lc7Var, T t) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (e) ipChange.ipc$dispatch("c2995dd2", new Object[]{lc7Var, t});
            }
            return new e<>(lc7Var, t);
        }

        @SafeVarargs
        public final void b(T t, T... tArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9c900031", new Object[]{this, t, tArr});
                return;
            }
            this.f29763a.addDependency(this.b, t);
            for (T t2 : tArr) {
                this.f29763a.addDependency(this.b, t2);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class f<T> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final lc7<T> f29764a;
        public final T[] b;

        public f(lc7<T> lc7Var, T[] tArr) {
            this.f29764a = lc7Var;
            this.b = tArr;
        }

        public static <T> f<T> a(lc7<T> lc7Var, T[] tArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (f) ipChange.ipc$dispatch("569a327b", new Object[]{lc7Var, tArr});
            }
            return new f<>(lc7Var, tArr);
        }

        public final void b(T t) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("61602b00", new Object[]{this, t});
                return;
            }
            for (T t2 : this.b) {
                this.f29764a.addDependency(t2, t);
            }
        }
    }

    public v35(lc7<T> lc7Var) {
        this.f29758a = lc7Var;
    }

    public static <T, R> v35<T> f(q35<T, R> q35Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (v35) ipChange.ipc$dispatch("7b109d87", new Object[]{q35Var});
        }
        return new v35<>(q35Var.e());
    }

    public a<T> a(T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("246ccc51", new Object[]{this, t});
        }
        return a.a(this.f29758a, t);
    }

    @SafeVarargs
    public final b<T> b(T... tArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("e60a7255", new Object[]{this, tArr});
        }
        return b.a(this.f29758a, tArr);
    }

    public e<T> c(T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (e) ipChange.ipc$dispatch("b46a067d", new Object[]{this, t});
        }
        this.f29758a.addIndependent(t);
        return new e<>(this.f29758a, t);
    }

    public void d(T t, T t2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a7e0c1da", new Object[]{this, t, t2});
        } else {
            this.f29758a.addDependency(t, t2);
        }
    }

    public c<T> e(T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c) ipChange.ipc$dispatch("bfee35e7", new Object[]{this, t});
        }
        return c.a(this.f29758a, t);
    }

    public d<T> g(T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d) ipChange.ipc$dispatch("36521635", new Object[]{this, t});
        }
        return d.a(this.f29758a, t);
    }
}
