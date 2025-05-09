package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class dik {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(944767252);
    }

    public static <T> T a(T t, T t2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("ee37d10e", new Object[]{t, t2});
        }
        if (t != null) {
            return t;
        }
        return t2;
    }

    public static <T> boolean b(List<T> list, List<T> list2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a9a75599", new Object[]{list, list2})).booleanValue();
        }
        if (list == list2) {
            return true;
        }
        if ((list == null && list2 != null && list2.size() == 0) || (list2 == null && list != null && list.size() == 0)) {
            return true;
        }
        if (list.size() == list2.size() && list.containsAll(list2) && list2.containsAll(list)) {
            return true;
        }
        return false;
    }

    public static <V> void c(List<V> list, V v) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e2ac27aa", new Object[]{list, v});
        } else if (list != null && v != null) {
            list.add(v);
        }
    }

    public static <K, V> V d(Map<K, V> map, K k) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (V) ipChange.ipc$dispatch("e6a74ff", new Object[]{map, k});
        }
        return (V) e(map, k, null);
    }

    public static <K, V> V e(Map<K, V> map, K k, V v) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (V) ipChange.ipc$dispatch("6733bf63", new Object[]{map, k, v});
        }
        if (map == null || k == null) {
            return v;
        }
        return map.get(k);
    }

    public static <K, V> void f(Map<K, V> map, K k, V v) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c952abd6", new Object[]{map, k, v});
        } else if (map != null && k != null && v != null) {
            map.put(k, v);
        }
    }

    public static <K, V> void g(Map<K, V> map, K k) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f942467", new Object[]{map, k});
        } else if (map != null && k != null) {
            map.remove(k);
        }
    }
}
