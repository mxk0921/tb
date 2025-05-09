package tb;

import java.util.Iterator;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public final class jte<T> implements Iterator<hte<? extends T>>, rzf {

    /* renamed from: a  reason: collision with root package name */
    public final Iterator<T> f22198a;
    public int b;

    /* JADX WARN: Multi-variable type inference failed */
    public jte(Iterator<? extends T> it) {
        ckf.g(it, pg1.ATOM_EXT_iterator);
        this.f22198a = it;
    }

    /* renamed from: a */
    public final hte<T> next() {
        int i = this.b;
        this.b = i + 1;
        if (i >= 0) {
            return new hte<>(i, this.f22198a.next());
        }
        yz3.p();
        throw null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f22198a.hasNext();
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
