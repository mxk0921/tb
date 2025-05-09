package tb;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public final class ubo<T> extends q20<T> {

    /* renamed from: a  reason: collision with root package name */
    public final List<T> f29278a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public static final class a implements ListIterator<T>, rzf {

        /* renamed from: a  reason: collision with root package name */
        public final ListIterator<T> f29279a;
        public final /* synthetic */ ubo<T> b;

        public a(ubo<T> uboVar, int i) {
            int M;
            this.b = uboVar;
            List list = uboVar.f29278a;
            M = e04.M(uboVar, i);
            this.f29279a = list.listIterator(M);
        }

        @Override // java.util.ListIterator
        public void add(T t) {
            ListIterator<T> listIterator = this.f29279a;
            listIterator.add(t);
            listIterator.previous();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.f29279a.hasPrevious();
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.f29279a.hasNext();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public T next() {
            return this.f29279a.previous();
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            int L;
            L = e04.L(this.b, this.f29279a.previousIndex());
            return L;
        }

        @Override // java.util.ListIterator
        public T previous() {
            return this.f29279a.next();
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            int L;
            L = e04.L(this.b, this.f29279a.nextIndex());
            return L;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            this.f29279a.remove();
        }

        @Override // java.util.ListIterator
        public void set(T t) {
            this.f29279a.set(t);
        }
    }

    public ubo(List<T> list) {
        ckf.g(list, "delegate");
        this.f29278a = list;
    }

    @Override // tb.q20, java.util.AbstractList, java.util.List
    public void add(int i, T t) {
        int M;
        List<T> list = this.f29278a;
        M = e04.M(this, i);
        list.add(M, t);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        this.f29278a.clear();
    }

    @Override // java.util.AbstractList, java.util.List
    public T get(int i) {
        int K;
        List<T> list = this.f29278a;
        K = e04.K(this, i);
        return list.get(K);
    }

    @Override // tb.q20
    public int getSize() {
        return this.f29278a.size();
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator<T> iterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator<T> listIterator() {
        return listIterator(0);
    }

    @Override // tb.q20
    public T removeAt(int i) {
        int K;
        List<T> list = this.f29278a;
        K = e04.K(this, i);
        return list.remove(K);
    }

    @Override // tb.q20, java.util.AbstractList, java.util.List
    public T set(int i, T t) {
        int K;
        List<T> list = this.f29278a;
        K = e04.K(this, i);
        return list.set(K, t);
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator<T> listIterator(int i) {
        return new a(this, i);
    }
}
