package tb;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public final class s3i<K, V> implements r3i<K, V> {

    /* renamed from: a  reason: collision with root package name */
    public final Map<K, V> f27778a;
    public final g1a<K, V> b;

    /* JADX WARN: Multi-variable type inference failed */
    public s3i(Map<K, ? extends V> map, g1a<? super K, ? extends V> g1aVar) {
        ckf.g(map, "map");
        ckf.g(g1aVar, "default");
        this.f27778a = map;
        this.b = g1aVar;
    }

    public Set<Map.Entry<K, V>> a() {
        return getMap().entrySet();
    }

    @Override // tb.r3i
    public V b(K k) {
        Map<K, V> map = getMap();
        V v = map.get(k);
        if (v != null || map.containsKey(k)) {
            return v;
        }
        return this.b.invoke(k);
    }

    public Set<K> c() {
        return getMap().keySet();
    }

    @Override // java.util.Map
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return getMap().containsKey(obj);
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        return getMap().containsValue(obj);
    }

    public int d() {
        return getMap().size();
    }

    public Collection<V> e() {
        return getMap().values();
    }

    @Override // java.util.Map
    public final /* bridge */ Set<Map.Entry<K, V>> entrySet() {
        return a();
    }

    @Override // java.util.Map
    public boolean equals(Object obj) {
        return getMap().equals(obj);
    }

    @Override // java.util.Map
    public V get(Object obj) {
        return getMap().get(obj);
    }

    @Override // tb.r3i
    public Map<K, V> getMap() {
        return this.f27778a;
    }

    @Override // java.util.Map
    public int hashCode() {
        return getMap().hashCode();
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return getMap().isEmpty();
    }

    @Override // java.util.Map
    public final /* bridge */ Set<K> keySet() {
        return c();
    }

    @Override // java.util.Map
    public V put(K k, V v) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public void putAll(Map<? extends K, ? extends V> map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public V remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
        return d();
    }

    public String toString() {
        return getMap().toString();
    }

    @Override // java.util.Map
    public final /* bridge */ Collection<V> values() {
        return e();
    }
}
