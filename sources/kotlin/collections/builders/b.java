package kotlin.collections.builders;

import java.util.Collection;
import java.util.Iterator;
import tb.ckf;
import tb.s20;
import tb.tep;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public final class b<E> extends s20<E> {

    /* renamed from: a  reason: collision with root package name */
    public final MapBuilder<E, ?> f15241a;

    public b(MapBuilder<E, ?> mapBuilder) {
        ckf.g(mapBuilder, "backing");
        this.f15241a = mapBuilder;
    }

    @Override // tb.s20, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean add(E e) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean addAll(Collection<? extends E> collection) {
        ckf.g(collection, tep.KEY_UNIFORM_RESULT);
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        this.f15241a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return this.f15241a.containsKey(obj);
    }

    @Override // tb.s20
    public int getSize() {
        return this.f15241a.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return this.f15241a.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator<E> iterator() {
        return this.f15241a.keysIterator$kotlin_stdlib();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        return this.f15241a.removeKey$kotlin_stdlib(obj);
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean removeAll(Collection<? extends Object> collection) {
        ckf.g(collection, tep.KEY_UNIFORM_RESULT);
        this.f15241a.checkIsMutable$kotlin_stdlib();
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean retainAll(Collection<? extends Object> collection) {
        ckf.g(collection, tep.KEY_UNIFORM_RESULT);
        this.f15241a.checkIsMutable$kotlin_stdlib();
        return super.retainAll(collection);
    }
}
