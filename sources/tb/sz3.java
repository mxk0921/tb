package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Collection;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class sz3 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(503317405);
    }

    public static boolean a(Collection collection) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1b35377f", new Object[]{collection})).booleanValue();
        }
        if (collection == null || collection.isEmpty()) {
            return true;
        }
        return false;
    }

    public static boolean b(Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("489e80ff", new Object[]{map})).booleanValue();
        }
        if (map == null || map.isEmpty()) {
            return true;
        }
        return false;
    }

    public static boolean c(Map map, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("862cbacd", new Object[]{map, new Integer(i)})).booleanValue();
        }
        if (map == null || map.size() >= i) {
            return false;
        }
        return true;
    }

    public static boolean d(Collection collection) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("176de380", new Object[]{collection})).booleanValue();
        }
        return !a(collection);
    }

    public static boolean e(Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6e44e41e", new Object[]{map})).booleanValue();
        }
        return !b(map);
    }
}
