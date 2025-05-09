package tb;

import java.util.Iterator;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public final class ite<T> implements Iterable<hte<? extends T>>, rzf {

    /* renamed from: a  reason: collision with root package name */
    public final d1a<Iterator<T>> f21569a;

    /* JADX WARN: Multi-variable type inference failed */
    public ite(d1a<? extends Iterator<? extends T>> d1aVar) {
        ckf.g(d1aVar, "iteratorFactory");
        this.f21569a = d1aVar;
    }

    @Override // java.lang.Iterable
    public Iterator<hte<T>> iterator() {
        return new jte(this.f21569a.invoke());
    }
}
