package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class pq4 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final Map<Integer, Boolean> f26234a = new ConcurrentHashMap();

    static {
        t2o.a(912261822);
    }

    public static boolean a(Object obj) {
        Boolean bool;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a211241b", new Object[]{obj})).booleanValue();
        }
        if (obj == null || (bool = (Boolean) ((ConcurrentHashMap) f26234a).get(Integer.valueOf(obj.hashCode()))) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public static void b(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a8da94f", new Object[]{obj});
        } else if (obj != null) {
            ((ConcurrentHashMap) f26234a).put(Integer.valueOf(obj.hashCode()), Boolean.TRUE);
        }
    }
}
