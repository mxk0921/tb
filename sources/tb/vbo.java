package tb;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class vbo<T> extends c20<T> {

    /* renamed from: a  reason: collision with root package name */
    public final List<T> f29910a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public static final class a implements ListIterator<T>, rzf {

        /* renamed from: a  reason: collision with root package name */
        public final ListIterator<T> f29911a;
        public final /* synthetic */ vbo<T> b;

        /* JADX WARN: Multi-variable type inference failed */
        public a(vbo<? extends T> vboVar, int i) {
            int M;
            this.b = vboVar;
            List list = vboVar.f29910a;
            M = e04.M(vboVar, i);
            this.f29911a = list.listIterator(M);
        }

        @Override // java.util.ListIterator
        public void add(T t) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.f29911a.hasPrevious();
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.f29911a.hasNext();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public T next() {
            return this.f29911a.previous();
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            int L;
            L = e04.L(this.b, this.f29911a.previousIndex());
            return L;
        }

        @Override // java.util.ListIterator
        public T previous() {
            return this.f29911a.next();
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            int L;
            L = e04.L(this.b, this.f29911a.nextIndex());
            return L;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.ListIterator
        public void set(T t) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public vbo(List<? extends T> list) {
        ckf.g(list, "delegate");
        this.f29910a = list;
    }

    @Override // tb.c20, java.util.List
    public T get(int i) {
        int K;
        List<T> list = this.f29910a;
        K = e04.K(this, i);
        return list.get(K);
    }

    @Override // tb.c20, tb.n00
    public int getSize() {
        return this.f29910a.size();
    }

    @Override // tb.c20, tb.n00, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator<T> iterator() {
        return listIterator(0);
    }

    @Override // tb.c20, java.util.List
    public ListIterator<T> listIterator() {
        return listIterator(0);
    }

    @Override // tb.c20, java.util.List
    public ListIterator<T> listIterator(int i) {
        return new a(this, i);
    }
}
