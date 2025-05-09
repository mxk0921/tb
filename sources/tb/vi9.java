package tb;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public final class vi9<T> implements sbp<T> {

    /* renamed from: a  reason: collision with root package name */
    public final sbp<T> f30029a;
    public final boolean b;
    public final g1a<T, Boolean> c;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public static final class a implements Iterator<T>, rzf {

        /* renamed from: a  reason: collision with root package name */
        public final Iterator<T> f30030a;
        public int b = -1;
        public T c;
        public final /* synthetic */ vi9<T> d;

        public a(vi9<T> vi9Var) {
            this.d = vi9Var;
            this.f30030a = vi9Var.f30029a.iterator();
        }

        public final void a() {
            T next;
            vi9<T> vi9Var;
            do {
                Iterator<T> it = this.f30030a;
                if (it.hasNext()) {
                    next = it.next();
                    vi9Var = this.d;
                } else {
                    this.b = 0;
                    return;
                }
            } while (((Boolean) vi9Var.c.invoke(next)).booleanValue() != vi9Var.b);
            this.c = next;
            this.b = 1;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.b == -1) {
                a();
            }
            if (this.b == 1) {
                return true;
            }
            return false;
        }

        @Override // java.util.Iterator
        public T next() {
            if (this.b == -1) {
                a();
            }
            if (this.b != 0) {
                T t = this.c;
                this.c = null;
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
    public vi9(sbp<? extends T> sbpVar, boolean z, g1a<? super T, Boolean> g1aVar) {
        ckf.g(sbpVar, "sequence");
        ckf.g(g1aVar, "predicate");
        this.f30029a = sbpVar;
        this.b = z;
        this.c = g1aVar;
    }

    @Override // tb.sbp
    public Iterator<T> iterator() {
        return new a(this);
    }
}
