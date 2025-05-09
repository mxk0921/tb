package tb;

import java.util.Collections;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.builders.MapBuilder;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class v3i extends u3i {
    public static <K, V> Map<K, V> c(Map<K, V> map) {
        ckf.g(map, "builder");
        return ((MapBuilder) map).build();
    }

    public static <K, V> Map<K, V> d(int i) {
        return new MapBuilder(i);
    }

    public static int e(int i) {
        if (i < 0) {
            return i;
        }
        if (i < 3) {
            return i + 1;
        }
        if (i < 1073741824) {
            return (int) ((i / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }

    public static <K, V> Map<K, V> f(Pair<? extends K, ? extends V> pair) {
        ckf.g(pair, "pair");
        Map<K, V> singletonMap = Collections.singletonMap(pair.getFirst(), pair.getSecond());
        ckf.f(singletonMap, "singletonMap(...)");
        return singletonMap;
    }

    public static final <K, V> Map<K, V> g(Map<? extends K, ? extends V> map) {
        ckf.g(map, "<this>");
        Map.Entry<? extends K, ? extends V> next = map.entrySet().iterator().next();
        Map<K, V> singletonMap = Collections.singletonMap(next.getKey(), next.getValue());
        ckf.f(singletonMap, "with(...)");
        return singletonMap;
    }
}
