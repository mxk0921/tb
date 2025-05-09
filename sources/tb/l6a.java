package tb;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public final class l6a<T> implements sbp<T> {

    /* renamed from: a  reason: collision with root package name */
    public final d1a<T> f23134a;
    public final g1a<T, T> b;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public static final class a implements Iterator<T>, rzf {

        /* renamed from: a  reason: collision with root package name */
        public T f23135a;
        public int b = -2;
        public final /* synthetic */ l6a<T> c;

        public a(l6a<T> l6aVar) {
            this.c = l6aVar;
        }

        public final void a() {
            T t;
            int i;
            int i2 = this.b;
            l6a<T> l6aVar = this.c;
            if (i2 == -2) {
                t = (T) l6aVar.f23134a.invoke();
            } else {
                g1a g1aVar = l6aVar.b;
                T t2 = this.f23135a;
                ckf.d(t2);
                t = (T) g1aVar.invoke(t2);
            }
            this.f23135a = t;
            if (t == null) {
                i = 0;
            } else {
                i = 1;
            }
            this.b = i;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.b < 0) {
                a();
            }
            if (this.b == 1) {
                return true;
            }
            return false;
        }

        @Override // java.util.Iterator
        public T next() {
            if (this.b < 0) {
                a();
            }
            if (this.b != 0) {
                T t = this.f23135a;
                ckf.e(t, "null cannot be cast to non-null type T of kotlin.sequences.GeneratorSequence");
                this.b = -1;
                return t;
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public l6a(d1a<? extends T> d1aVar, g1a<? super T, ? extends T> g1aVar) {
        ckf.g(d1aVar, "getInitialValue");
        ckf.g(g1aVar, "getNextValue");
        this.f23134a = d1aVar;
        this.b = g1aVar;
    }

    @Override // tb.sbp
    public Iterator<T> iterator() {
        return new a(this);
    }
}
