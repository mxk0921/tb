package kotlin.collections.builders;

import java.util.Collection;
import java.util.Iterator;
import tb.ckf;
import tb.p20;
import tb.tep;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public final class c<V> extends p20<V> {

    /* renamed from: a  reason: collision with root package name */
    public final MapBuilder<?, V> f15242a;

    public c(MapBuilder<?, V> mapBuilder) {
        ckf.g(mapBuilder, "backing");
        this.f15242a = mapBuilder;
    }

    @Override // tb.p20
    public int a() {
        return this.f15242a.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean add(V v) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean addAll(Collection<? extends V> collection) {
        ckf.g(collection, tep.KEY_UNIFORM_RESULT);
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public void clear() {
        this.f15242a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean contains(Object obj) {
        return this.f15242a.containsValue(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        return this.f15242a.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public Iterator<V> iterator() {
        return this.f15242a.valuesIterator$kotlin_stdlib();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean remove(Object obj) {
        return this.f15242a.removeValue$kotlin_stdlib(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean removeAll(Collection<? extends Object> collection) {
        ckf.g(collection, tep.KEY_UNIFORM_RESULT);
        this.f15242a.checkIsMutable$kotlin_stdlib();
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean retainAll(Collection<? extends Object> collection) {
        ckf.g(collection, tep.KEY_UNIFORM_RESULT);
        this.f15242a.checkIsMutable$kotlin_stdlib();
        return super.retainAll(collection);
    }
}
