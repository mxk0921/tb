package kotlin.collections.builders;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import tb.ckf;
import tb.h20;
import tb.tep;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public final class a<K, V> extends h20<Map.Entry<K, V>, K, V> {

    /* renamed from: a  reason: collision with root package name */
    public final MapBuilder<K, V> f15240a;

    public a(MapBuilder<K, V> mapBuilder) {
        ckf.g(mapBuilder, "backing");
        this.f15240a = mapBuilder;
    }

    @Override // tb.s20, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        e((Map.Entry) obj);
        throw null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean addAll(Collection<? extends Map.Entry<K, V>> collection) {
        ckf.g(collection, tep.KEY_UNIFORM_RESULT);
        throw new UnsupportedOperationException();
    }

    @Override // tb.h20
    public boolean c(Map.Entry<? extends K, ? extends V> entry) {
        ckf.g(entry, "element");
        return this.f15240a.containsEntry$kotlin_stdlib(entry);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        this.f15240a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean containsAll(Collection<? extends Object> collection) {
        ckf.g(collection, tep.KEY_UNIFORM_RESULT);
        return this.f15240a.containsAllEntries$kotlin_stdlib(collection);
    }

    @Override // tb.h20
    public boolean d(Map.Entry entry) {
        ckf.g(entry, "element");
        return this.f15240a.removeEntry$kotlin_stdlib(entry);
    }

    public boolean e(Map.Entry<K, V> entry) {
        ckf.g(entry, "element");
        throw new UnsupportedOperationException();
    }

    @Override // tb.s20
    public int getSize() {
        return this.f15240a.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return this.f15240a.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator<Map.Entry<K, V>> iterator() {
        return this.f15240a.entriesIterator$kotlin_stdlib();
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean removeAll(Collection<? extends Object> collection) {
        ckf.g(collection, tep.KEY_UNIFORM_RESULT);
        this.f15240a.checkIsMutable$kotlin_stdlib();
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean retainAll(Collection<? extends Object> collection) {
        ckf.g(collection, tep.KEY_UNIFORM_RESULT);
        this.f15240a.checkIsMutable$kotlin_stdlib();
        return super.retainAll(collection);
    }
}
