package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.Callable;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public final class gux {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final fux f20250a = new a();
    public static final vxx<Throwable> b = new e();
    public static final Runnable c = new c();
    public static final vxx<Object> d = new b();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public static final class a implements fux {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(628097392);
            t2o.a(628097382);
        }

        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            }
        }

        public String toString() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
            }
            return "EmptyAction";
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public static final class b implements vxx<Object> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(628097393);
            t2o.a(628097383);
        }

        @Override // tb.vxx
        public void accept(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b028bfab", new Object[]{this, obj});
            }
        }

        public String toString() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
            }
            return "EmptyConsumer";
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public static final class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(628097394);
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            }
        }

        public String toString() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
            }
            return "EmptyRunnable";
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public static final class d<T, U> implements Callable<U>, lzx<T, U> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final U f20251a;

        static {
            t2o.a(628097395);
            t2o.a(628097384);
        }

        public d(U u) {
            this.f20251a = u;
        }

        @Override // tb.lzx
        public U apply(T t) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (U) ipChange.ipc$dispatch("7a74adc1", new Object[]{this, t});
            }
            return this.f20251a;
        }

        @Override // java.util.concurrent.Callable
        public U call() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (U) ipChange.ipc$dispatch("6d249ded", new Object[]{this});
            }
            return this.f20251a;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public static final class e implements vxx<Throwable> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(628097396);
            t2o.a(628097383);
        }

        public void a(Throwable th) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fb9ad88d", new Object[]{this, th});
            } else {
                oux.a(new tao.reactivex.b.d(th));
            }
        }

        @Override // tb.vxx
        public /* synthetic */ void accept(Throwable th) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b028bfab", new Object[]{this, th});
            } else {
                a(th);
            }
        }
    }

    static {
        t2o.a(628097391);
    }

    public static <T> Callable<T> a(T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Callable) ipChange.ipc$dispatch("54dbe705", new Object[]{t});
        }
        return new d(t);
    }

    public static <T> vxx<T> b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (vxx) ipChange.ipc$dispatch("96f12fa0", new Object[0]);
        }
        return (vxx<T>) d;
    }
}
