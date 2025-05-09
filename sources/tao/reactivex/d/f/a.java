package tao.reactivex.d.f;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.atomic.AtomicReference;
import tb.i6y;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public final class a<T> implements i6y<T> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final AtomicReference<C0871a<T>> f15440a = new AtomicReference<>();
    public final AtomicReference<C0871a<T>> b = new AtomicReference<>();

    /* compiled from: Taobao */
    /* renamed from: tao.reactivex.d.f.a$a  reason: collision with other inner class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public static final class C0871a<E> extends AtomicReference<C0871a<E>> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private E f15441a;

        static {
            t2o.a(628097474);
        }

        public C0871a() {
        }

        public static /* synthetic */ Object ipc$super(C0871a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in tao/reactivex/d/f/a$a");
        }

        public E a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (E) ipChange.ipc$dispatch("bd3407ca", new Object[]{this});
            }
            E b = b();
            a((C0871a<E>) null);
            return b;
        }

        public E b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (E) ipChange.ipc$dispatch("43b9c269", new Object[]{this});
            }
            return this.f15441a;
        }

        public C0871a<E> c() {
            Object obj;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                obj = ipChange.ipc$dispatch("366aa18e", new Object[]{this});
            } else {
                obj = get();
            }
            return (C0871a) obj;
        }

        public C0871a(E e) {
            a((C0871a<E>) e);
        }

        public void a(E e) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a6251244", new Object[]{this, e});
            } else {
                this.f15441a = e;
            }
        }

        public void a(C0871a<E> aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9c14a6cc", new Object[]{this, aVar});
            } else {
                lazySet(aVar);
            }
        }
    }

    static {
        t2o.a(628097473);
        t2o.a(628097403);
    }

    public a() {
        C0871a<T> aVar = new C0871a<>();
        g(aVar);
        b(aVar);
    }

    public C0871a<T> a() {
        IpChange ipChange = $ipChange;
        return (C0871a) (ipChange instanceof IpChange ? ipChange.ipc$dispatch("c3c8800c", new Object[]{this}) : this.f15440a.get());
    }

    public C0871a<T> b(C0871a<T> aVar) {
        Object andSet;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            andSet = ipChange.ipc$dispatch("a4891770", new Object[]{this, aVar});
        } else {
            andSet = this.f15440a.getAndSet(aVar);
        }
        return (C0871a) andSet;
    }

    @Override // tb.u7y
    public T c() {
        C0871a<T> c;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("ca3f7d08", new Object[]{this});
        }
        C0871a<T> h = h();
        C0871a<T> c2 = h.c();
        if (c2 != null) {
            T a2 = c2.a();
            g(c2);
            return a2;
        } else if (h == a()) {
            return null;
        } else {
            do {
                c = h.c();
            } while (c == null);
            T a3 = c.a();
            g(c);
            return a3;
        }
    }

    @Override // tb.u7y
    public boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[]{this})).booleanValue();
        }
        if (f() == a()) {
            return true;
        }
        return false;
    }

    @Override // tb.u7y
    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        while (c() != null && !d()) {
        }
    }

    public C0871a<T> f() {
        Object obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            obj = ipChange.ipc$dispatch("fd1990cd", new Object[]{this});
        } else {
            obj = this.b.get();
        }
        return (C0871a) obj;
    }

    public void g(C0871a<T> aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ce5ae2b", new Object[]{this, aVar});
        } else {
            this.b.lazySet(aVar);
        }
    }

    public C0871a<T> h() {
        Object obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            obj = ipChange.ipc$dispatch("e25dd3d1", new Object[]{this});
        } else {
            obj = this.b.get();
        }
        return (C0871a) obj;
    }

    @Override // tb.u7y
    public boolean a(T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a6251248", new Object[]{this, t})).booleanValue();
        }
        if (t != null) {
            C0871a<T> aVar = new C0871a<>(t);
            b(aVar).a(aVar);
            return true;
        }
        throw new NullPointerException("Null is not a valid element");
    }
}
