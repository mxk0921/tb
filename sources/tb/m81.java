package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.api.Login;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class m81 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final Map<String, Map<String, Object>> f23837a = new ConcurrentHashMap(4);

    public static Map<String, Object> a() {
        String userId;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("fcc9d0d3", new Object[0]);
        }
        if (mba.b().c() && (userId = Login.getUserId()) != null) {
            return (Map) ((ConcurrentHashMap) f23837a).get(userId);
        }
        return null;
    }

    public static Object b(String str) {
        String userId;
        Map map;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("150d97b5", new Object[]{str});
        }
        if (!mba.b().c() || (userId = Login.getUserId()) == null || (map = (Map) ((ConcurrentHashMap) f23837a).get(userId)) == null) {
            return null;
        }
        return map.get(str);
    }

    public static void c(String str, Object obj) {
        String userId;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f80ca410", new Object[]{str, obj});
        } else if (mba.b().c() && (userId = Login.getUserId()) != null) {
            Map<String, Map<String, Object>> map = f23837a;
            Map map2 = (Map) ((ConcurrentHashMap) map).get(userId);
            if (map2 == null) {
                map2 = new ConcurrentHashMap();
                ((ConcurrentHashMap) map).put(userId, map2);
            }
            map2.put(str, obj);
        }
    }
}
