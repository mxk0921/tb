package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Collection;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class bh {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(79691953);
    }

    public static <E> boolean a(Collection<E> collection) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1b35377f", new Object[]{collection})).booleanValue();
        }
        if (collection == null || collection.isEmpty()) {
            return true;
        }
        return false;
    }

    public static <K, V> boolean b(Map<K, V> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("489e80ff", new Object[]{map})).booleanValue();
        }
        if (map == null || map.isEmpty()) {
            return true;
        }
        return false;
    }
}
