package kotlinx.coroutines.debug.internal;

import com.alipay.android.msp.framework.dynfun.TplMsg;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.Volatile;
import tb.a07;
import tb.ckf;
import tb.g4i;
import tb.gua;
import tb.hfn;
import tb.r20;
import tb.rzf;
import tb.s20;
import tb.u1a;
import tb.vzf;
import tb.we4;
import tb.yi3;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public final class ConcurrentWeakMap<K, V> extends r20<K, V> {
    public static final AtomicIntegerFieldUpdater d = AtomicIntegerFieldUpdater.newUpdater(ConcurrentWeakMap.class, "a");
    public static final AtomicReferenceFieldUpdater e = AtomicReferenceFieldUpdater.newUpdater(ConcurrentWeakMap.class, Object.class, TplMsg.VALUE_T_NATIVE_RETURN);
    @Volatile

    /* renamed from: a  reason: collision with root package name */
    public volatile int f15260a;
    @Volatile
    public volatile Object b;
    public final ReferenceQueue<K> c;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public final class a {
        public static final AtomicIntegerFieldUpdater h = AtomicIntegerFieldUpdater.newUpdater(a.class, "d");

        /* renamed from: a  reason: collision with root package name */
        public final int f15261a;
        public final int b;
        public final int c;
        @Volatile
        public volatile int d;
        public final AtomicReferenceArray e;
        public final AtomicReferenceArray f;

        /* compiled from: Taobao */
        /* renamed from: kotlinx.coroutines.debug.internal.ConcurrentWeakMap$a$a  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
        public final class C0860a<E> implements Iterator<E>, rzf {

            /* renamed from: a  reason: collision with root package name */
            public final u1a<K, V, E> f15262a;
            public int b = -1;
            public K c;
            public V d;

            /* JADX WARN: Multi-variable type inference failed */
            public C0860a(u1a<? super K, ? super V, ? extends E> u1aVar) {
                this.f15262a = u1aVar;
                a();
            }

            public final void a() {
                K k;
                while (true) {
                    int i = this.b + 1;
                    this.b = i;
                    ConcurrentWeakMap<K, V>.a aVar = a.this;
                    if (i < aVar.f15261a) {
                        gua guaVar = (gua) aVar.e.get(this.b);
                        if (!(guaVar == null || (k = (K) guaVar.get()) == null)) {
                            this.c = k;
                            V v = (V) aVar.f.get(this.b);
                            if (v instanceof g4i) {
                                v = (V) ((g4i) v).f19721a;
                            }
                            if (v != null) {
                                this.d = v;
                                return;
                            }
                        }
                    } else {
                        return;
                    }
                }
            }

            public Void c() {
                we4.b();
                throw null;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                if (this.b < a.this.f15261a) {
                    return true;
                }
                return false;
            }

            @Override // java.util.Iterator
            public E next() {
                if (this.b < a.this.f15261a) {
                    K k = this.c;
                    if (k != null) {
                        V v = this.d;
                        if (v != null) {
                            E invoke = this.f15262a.invoke(k, v);
                            a();
                            return invoke;
                        }
                        ckf.y("value");
                        throw null;
                    }
                    ckf.y("key");
                    throw null;
                }
                throw new NoSuchElementException();
            }

            @Override // java.util.Iterator
            public /* bridge */ /* synthetic */ void remove() {
                c();
                throw null;
            }
        }

        public a(int i) {
            this.f15261a = i;
            this.b = Integer.numberOfLeadingZeros(i) + 1;
            this.c = (i * 2) / 3;
            this.e = new AtomicReferenceArray(i);
            this.f = new AtomicReferenceArray(i);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Object i(a aVar, Object obj, Object obj2, gua guaVar, int i, Object obj3) {
            if ((i & 4) != 0) {
                guaVar = null;
            }
            return aVar.h(obj, obj2, guaVar);
        }

        public final void d(gua<?> guaVar) {
            int f = f(guaVar.f20242a);
            while (true) {
                gua<?> guaVar2 = (gua) this.e.get(f);
                if (guaVar2 != null) {
                    if (guaVar2 == guaVar) {
                        k(f);
                        return;
                    }
                    if (f == 0) {
                        f = this.f15261a;
                    }
                    f--;
                } else {
                    return;
                }
            }
        }

        public final V e(K k) {
            int f = f(k.hashCode());
            while (true) {
                gua guaVar = (gua) this.e.get(f);
                if (guaVar == null) {
                    return null;
                }
                T t = guaVar.get();
                if (ckf.b(k, t)) {
                    V v = (V) this.f.get(f);
                    if (v instanceof g4i) {
                        return (V) ((g4i) v).f19721a;
                    }
                    return v;
                }
                if (t == 0) {
                    k(f);
                }
                if (f == 0) {
                    f = this.f15261a;
                }
                f--;
            }
        }

        public final int f(int i) {
            return (i * (-1640531527)) >>> this.b;
        }

        public final <E> Iterator<E> g(u1a<? super K, ? super V, ? extends E> u1aVar) {
            return new C0860a(u1aVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:23:0x0052, code lost:
            r8 = r7.f;
            r10 = r8.get(r0);
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x005a, code lost:
            if ((r10 instanceof tb.g4i) == false) goto L_0x005d;
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x005c, code lost:
            return r4;
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x0061, code lost:
            if (tb.yi3.a(r8, r0, r10, r9) == false) goto L_0x0052;
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x0063, code lost:
            return r10;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object h(K r8, V r9, tb.gua<K> r10) {
            /*
                r7 = this;
                int r0 = r8.hashCode()
                int r0 = r7.f(r0)
                r1 = 0
            L_0x0009:
                java.util.concurrent.atomic.AtomicReferenceArray r2 = r7.e
                java.lang.Object r3 = r2.get(r0)
                tb.gua r3 = (tb.gua) r3
                tb.u1r r4 = tb.we4.f30654a
                java.util.concurrent.atomic.AtomicIntegerFieldUpdater r5 = kotlinx.coroutines.debug.internal.ConcurrentWeakMap.a.h
                if (r3 != 0) goto L_0x0043
                r3 = 0
                if (r9 != 0) goto L_0x001b
                return r3
            L_0x001b:
                if (r1 != 0) goto L_0x002f
            L_0x001d:
                int r1 = r5.get(r7)
                int r6 = r7.c
                if (r1 < r6) goto L_0x0026
                return r4
            L_0x0026:
                int r6 = r1 + 1
                boolean r1 = r5.compareAndSet(r7, r1, r6)
                if (r1 == 0) goto L_0x001d
                r1 = 1
            L_0x002f:
                if (r10 != 0) goto L_0x003c
                tb.gua r10 = new tb.gua
                kotlinx.coroutines.debug.internal.ConcurrentWeakMap<K, V> r5 = kotlinx.coroutines.debug.internal.ConcurrentWeakMap.this
                java.lang.ref.ReferenceQueue r5 = kotlinx.coroutines.debug.internal.ConcurrentWeakMap.h(r5)
                r10.<init>(r8, r5)
            L_0x003c:
                boolean r2 = tb.yi3.a(r2, r0, r3, r10)
                if (r2 != 0) goto L_0x0052
                goto L_0x0009
            L_0x0043:
                java.lang.Object r2 = r3.get()
                boolean r3 = tb.ckf.b(r8, r2)
                if (r3 == 0) goto L_0x0064
                if (r1 == 0) goto L_0x0052
                r5.decrementAndGet(r7)
            L_0x0052:
                java.util.concurrent.atomic.AtomicReferenceArray r8 = r7.f
                java.lang.Object r10 = r8.get(r0)
                boolean r1 = r10 instanceof tb.g4i
                if (r1 == 0) goto L_0x005d
                return r4
            L_0x005d:
                boolean r8 = tb.yi3.a(r8, r0, r10, r9)
                if (r8 == 0) goto L_0x0052
                return r10
            L_0x0064:
                if (r2 != 0) goto L_0x0069
                r7.k(r0)
            L_0x0069:
                if (r0 != 0) goto L_0x006d
                int r0 = r7.f15261a
            L_0x006d:
                int r0 = r0 + (-1)
                goto L_0x0009
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.debug.internal.ConcurrentWeakMap.a.h(java.lang.Object, java.lang.Object, tb.gua):java.lang.Object");
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final ConcurrentWeakMap<K, V>.a j() {
            Object obj;
            Object obj2;
            g4i c;
            while (true) {
                ConcurrentWeakMap<K, V> concurrentWeakMap = ConcurrentWeakMap.this;
                ConcurrentWeakMap<K, V>.a aVar = (ConcurrentWeakMap<K, V>.a) new a(Integer.highestOneBit(hfn.c(concurrentWeakMap.size(), 4)) * 4);
                for (int i = 0; i < this.f15261a; i++) {
                    gua guaVar = (gua) this.e.get(i);
                    if (guaVar != null) {
                        obj = guaVar.get();
                    } else {
                        obj = null;
                    }
                    if (guaVar != null && obj == null) {
                        k(i);
                    }
                    while (true) {
                        AtomicReferenceArray atomicReferenceArray = this.f;
                        obj2 = atomicReferenceArray.get(i);
                        if (obj2 instanceof g4i) {
                            obj2 = ((g4i) obj2).f19721a;
                            break;
                        }
                        c = we4.c(obj2);
                        if (yi3.a(atomicReferenceArray, i, obj2, c)) {
                            break;
                        }
                    }
                    if (obj == null || obj2 == null || aVar.h(obj, obj2, guaVar) != we4.f30654a) {
                    }
                }
                return aVar;
            }
        }

        public final void k(int i) {
            AtomicReferenceArray atomicReferenceArray;
            Object obj;
            do {
                atomicReferenceArray = this.f;
                obj = atomicReferenceArray.get(i);
                if (obj == null || (obj instanceof g4i)) {
                    return;
                }
            } while (!yi3.a(atomicReferenceArray, i, obj, null));
            ConcurrentWeakMap.this.j();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public static final class b<K, V> implements Map.Entry<K, V>, vzf.a {

        /* renamed from: a  reason: collision with root package name */
        public final K f15263a;
        public final V b;

        public b(K k, V v) {
            this.f15263a = k;
            this.b = v;
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return this.f15263a;
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.b;
        }

        @Override // java.util.Map.Entry
        public V setValue(V v) {
            we4.b();
            throw null;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public final class c<E> extends s20<E> {

        /* renamed from: a  reason: collision with root package name */
        public final u1a<K, V, E> f15264a;

        /* JADX WARN: Multi-variable type inference failed */
        public c(u1a<? super K, ? super V, ? extends E> u1aVar) {
            this.f15264a = u1aVar;
        }

        @Override // tb.s20, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean add(E e) {
            we4.b();
            throw null;
        }

        @Override // tb.s20
        public int getSize() {
            return ConcurrentWeakMap.this.size();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<E> iterator() {
            return ((a) ConcurrentWeakMap.e.get(ConcurrentWeakMap.this)).g(this.f15264a);
        }
    }

    public ConcurrentWeakMap() {
        this(false, 1, null);
    }

    @Override // tb.r20
    public Set<Map.Entry<K, V>> a() {
        return new c(ConcurrentWeakMap$entries$1.INSTANCE);
    }

    @Override // tb.r20
    public Set<K> c() {
        return new c(ConcurrentWeakMap$keys$1.INSTANCE);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        Iterator it = ((c) keySet()).iterator();
        while (true) {
            a.C0860a aVar = (a.C0860a) it;
            if (aVar.hasNext()) {
                remove(aVar.next());
            } else {
                return;
            }
        }
    }

    @Override // tb.r20
    public int d() {
        return d.get(this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        if (obj == null) {
            return null;
        }
        return (V) ((a) e.get(this)).e(obj);
    }

    public final void i(gua<?> guaVar) {
        ((a) e.get(this)).d(guaVar);
    }

    public final void j() {
        d.decrementAndGet(this);
    }

    public final synchronized V k(K k, V v) {
        V v2;
        a aVar = (a) e.get(this);
        while (true) {
            v2 = (V) a.i(aVar, k, v, null, 4, null);
            if (v2 == we4.f30654a) {
                aVar = aVar.j();
                e.set(this, aVar);
            }
        }
        return v2;
    }

    public final void l() {
        ReferenceQueue<K> referenceQueue = this.c;
        if (referenceQueue != null) {
            while (true) {
                try {
                    Reference<? extends K> remove = referenceQueue.remove();
                    ckf.e(remove, "null cannot be cast to non-null type kotlinx.coroutines.debug.internal.HashedWeakRef<*>");
                    i((gua) remove);
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                    return;
                }
            }
        } else {
            throw new IllegalStateException("Must be created with weakRefQueue = true");
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V put(K k, V v) {
        V v2 = (V) a.i((a) e.get(this), k, v, null, 4, null);
        if (v2 == we4.f30654a) {
            v2 = k(k, v);
        }
        if (v2 == null) {
            d.incrementAndGet(this);
        }
        return v2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        if (obj == 0) {
            return null;
        }
        V v = (V) a.i((a) e.get(this), obj, null, null, 4, null);
        if (v == we4.f30654a) {
            v = k(obj, null);
        }
        if (v != null) {
            d.decrementAndGet(this);
        }
        return v;
    }

    public /* synthetic */ ConcurrentWeakMap(boolean z, int i, a07 a07Var) {
        this((i & 1) != 0 ? false : z);
    }

    public ConcurrentWeakMap(boolean z) {
        this.b = new a(16);
        this.c = z ? new ReferenceQueue<>() : null;
    }
}
