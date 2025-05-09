package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class wrn {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String NOT_REACH_TOP = "notReachTop";
    public static final String REACH_TOP = "reachTop";

    /* renamed from: a  reason: collision with root package name */
    public static final Map<String, String> f30876a = new HashMap();

    static {
        t2o.a(729809996);
    }

    public static String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("867a3140", new Object[]{str});
        }
        return (String) ((HashMap) f30876a).get(str);
    }

    public static void b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ed1804f", new Object[]{str, str2});
        } else {
            ((HashMap) f30876a).put(str, str2);
        }
    }
}
