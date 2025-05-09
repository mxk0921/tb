package kotlin.collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import tb.ckf;
import tb.v3i;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class a extends v3i {
    public static <K, V> Map<K, V> h() {
        EmptyMap emptyMap = EmptyMap.INSTANCE;
        ckf.e(emptyMap, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.emptyMap, V of kotlin.collections.MapsKt__MapsKt.emptyMap>");
        return emptyMap;
    }

    public static <K, V> HashMap<K, V> i(Pair<? extends K, ? extends V>... pairArr) {
        ckf.g(pairArr, "pairs");
        HashMap<K, V> hashMap = new HashMap<>(v3i.e(pairArr.length));
        o(hashMap, pairArr);
        return hashMap;
    }

    public static <K, V> Map<K, V> j(Pair<? extends K, ? extends V>... pairArr) {
        ckf.g(pairArr, "pairs");
        if (pairArr.length <= 0) {
            return h();
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(v3i.e(pairArr.length));
        s(pairArr, linkedHashMap);
        return linkedHashMap;
    }

    public static <K, V> Map<K, V> k(Pair<? extends K, ? extends V>... pairArr) {
        ckf.g(pairArr, "pairs");
        LinkedHashMap linkedHashMap = new LinkedHashMap(v3i.e(pairArr.length));
        o(linkedHashMap, pairArr);
        return linkedHashMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <K, V> Map<K, V> l(Map<K, ? extends V> map) {
        ckf.g(map, "<this>");
        int size = map.size();
        if (size == 0) {
            return h();
        }
        if (size != 1) {
            return map;
        }
        return v3i.g(map);
    }

    public static <K, V> Map<K, V> m(Map<? extends K, ? extends V> map, Map<? extends K, ? extends V> map2) {
        ckf.g(map, "<this>");
        ckf.g(map2, "map");
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.putAll(map2);
        return linkedHashMap;
    }

    public static final <K, V> void n(Map<? super K, ? super V> map, Iterable<? extends Pair<? extends K, ? extends V>> iterable) {
        ckf.g(map, "<this>");
        ckf.g(iterable, "pairs");
        Iterator<? extends Pair<? extends K, ? extends V>> it = iterable.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            map.put((Object) pair.component1(), (Object) pair.component2());
        }
    }

    public static final <K, V> void o(Map<? super K, ? super V> map, Pair<? extends K, ? extends V>[] pairArr) {
        ckf.g(map, "<this>");
        ckf.g(pairArr, "pairs");
        for (Pair<? extends K, ? extends V> pair : pairArr) {
            map.put((Object) pair.component1(), (Object) pair.component2());
        }
    }

    public static <K, V> Map<K, V> p(Iterable<? extends Pair<? extends K, ? extends V>> iterable) {
        Object next;
        ckf.g(iterable, "<this>");
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            int size = collection.size();
            if (size == 0) {
                return h();
            }
            if (size != 1) {
                LinkedHashMap linkedHashMap = new LinkedHashMap(v3i.e(collection.size()));
                q(iterable, linkedHashMap);
                return linkedHashMap;
            }
            if (iterable instanceof List) {
                next = ((List) iterable).get(0);
            } else {
                next = collection.iterator().next();
            }
            return v3i.f((Pair) next);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        q(iterable, linkedHashMap2);
        return l(linkedHashMap2);
    }

    public static final <K, V, M extends Map<? super K, ? super V>> M q(Iterable<? extends Pair<? extends K, ? extends V>> iterable, M m) {
        ckf.g(iterable, "<this>");
        ckf.g(m, "destination");
        n(m, iterable);
        return m;
    }

    public static <K, V> Map<K, V> r(Map<? extends K, ? extends V> map) {
        ckf.g(map, "<this>");
        int size = map.size();
        if (size == 0) {
            return h();
        }
        if (size != 1) {
            return t(map);
        }
        return v3i.g(map);
    }

    public static final <K, V, M extends Map<? super K, ? super V>> M s(Pair<? extends K, ? extends V>[] pairArr, M m) {
        ckf.g(pairArr, "<this>");
        ckf.g(m, "destination");
        o(m, pairArr);
        return m;
    }

    public static <K, V> Map<K, V> t(Map<? extends K, ? extends V> map) {
        ckf.g(map, "<this>");
        return new LinkedHashMap(map);
    }
}
