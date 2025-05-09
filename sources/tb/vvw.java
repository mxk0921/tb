package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class vvw {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final WeakHashMap<Object, vvw> b = new WeakHashMap<>();

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, String> f30289a = new ConcurrentHashMap();

    static {
        t2o.a(982516152);
    }

    public static synchronized vvw a(Object obj) {
        synchronized (vvw.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (vvw) ipChange.ipc$dispatch("a44eb639", new Object[]{obj});
            }
            WeakHashMap<Object, vvw> weakHashMap = b;
            vvw vvwVar = weakHashMap.get(obj);
            if (vvwVar == null) {
                vvwVar = new vvw();
                weakHashMap.put(obj, vvwVar);
            }
            return vvwVar;
        }
    }

    public static String b(Object obj, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c8f1192a", new Object[]{obj, str});
        }
        return (String) ((ConcurrentHashMap) a(obj).f30289a).get(str);
    }

    public static void c(Object obj, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d7e72a64", new Object[]{obj, str});
        } else {
            ((ConcurrentHashMap) a(obj).f30289a).remove(str);
        }
    }

    public static void d(Object obj, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9eec368c", new Object[]{obj, str, str2});
            return;
        }
        Map<String, String> map = a(obj).f30289a;
        if (str2 == null) {
            ((ConcurrentHashMap) map).remove(str);
        } else {
            ((ConcurrentHashMap) map).put(str, str2);
        }
    }
}
