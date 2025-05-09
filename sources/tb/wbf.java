package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class wbf {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final Map<String, tbf> f30587a = new ConcurrentHashMap();

    static {
        t2o.a(912262026);
    }

    public static tbf a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (tbf) ipChange.ipc$dispatch("474c8bac", new Object[]{str});
        }
        return (tbf) ((ConcurrentHashMap) f30587a).get(str);
    }

    public static void b(String str, tbf tbfVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("85d0eb", new Object[]{str, tbfVar});
            return;
        }
        tgh.b("InsideLifecycleRegistrar", "registerInsideLifecycleObserver : " + str);
        if (str != null) {
            ((ConcurrentHashMap) f30587a).put(str, tbfVar);
        }
    }

    public static void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9109879", new Object[]{str});
            return;
        }
        tgh.b("InsideLifecycleRegistrar", "unregisterInsideLifecycleObserver : " + str);
        Map<String, tbf> map = f30587a;
        if (!((ConcurrentHashMap) map).containsKey(str)) {
            tgh.b("InsideLifecycleRegistrar", "no key : " + str);
            return;
        }
        ((ConcurrentHashMap) map).remove(str);
    }
}
