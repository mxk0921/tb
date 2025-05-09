package tb;

import com.taobao.android.festival.jsbridge.AliFestivalWVPlugin;
import java.util.Map;
import java.util.NoSuchElementException;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class u3i {
    public static <K, V> V a(Map<K, ? extends V> map, K k) {
        ckf.g(map, "<this>");
        if (map instanceof r3i) {
            return (V) ((r3i) map).b(k);
        }
        V v = (V) map.get(k);
        if (v != null || map.containsKey(k)) {
            return v;
        }
        throw new NoSuchElementException("Key " + k + " is missing in the map.");
    }

    public static <K, V> Map<K, V> b(Map<K, ? extends V> map, g1a<? super K, ? extends V> g1aVar) {
        ckf.g(map, "<this>");
        ckf.g(g1aVar, AliFestivalWVPlugin.PARAMS_DEFAULT_VALUE);
        if (map instanceof r3i) {
            return b(((r3i) map).getMap(), g1aVar);
        }
        return new s3i(map, g1aVar);
    }
}
