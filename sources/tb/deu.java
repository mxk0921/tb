package tb;

import java.util.Iterator;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public final class deu<T, R> implements sbp<R> {

    /* renamed from: a  reason: collision with root package name */
    public final sbp<T> f17763a;
    public final g1a<T, R> b;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public static final class a implements Iterator<R>, rzf {

        /* renamed from: a  reason: collision with root package name */
        public final Iterator<T> f17764a;
        public final /* synthetic */ deu<T, R> b;

        public a(deu<T, R> deuVar) {
            this.b = deuVar;
            this.f17764a = deuVar.f17763a.iterator();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f17764a.hasNext();
        }

        @Override // java.util.Iterator
        public R next() {
            return (R) this.b.b.invoke(this.f17764a.next());
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public deu(sbp<? extends T> sbpVar, g1a<? super T, ? extends R> g1aVar) {
        ckf.g(sbpVar, "sequence");
        ckf.g(g1aVar, "transformer");
        this.f17763a = sbpVar;
        this.b = g1aVar;
    }

    @Override // tb.sbp
    public Iterator<R> iterator() {
        return new a(this);
    }
}
