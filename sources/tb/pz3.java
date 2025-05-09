package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Collection;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class pz3 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(404750663);
    }

    public static boolean a(Collection collection) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1b35377f", new Object[]{collection})).booleanValue();
        }
        if (collection == null || collection.size() == 0) {
            return true;
        }
        return false;
    }

    public static boolean b(Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("489e80ff", new Object[]{map})).booleanValue();
        }
        if (map == null || map.size() == 0) {
            return true;
        }
        return false;
    }
}
