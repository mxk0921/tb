package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.handler.AbilityCenter;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public abstract class ze7 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static Map<String, WeakReference<ze7>> f32705a;

    static {
        t2o.a(912261527);
    }

    public static WeakReference<ze7> f(String str) {
        Map<String, WeakReference<ze7>> map;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WeakReference) ipChange.ipc$dispatch("b024ce47", new Object[]{str});
        }
        if (str == null || (map = f32705a) == null) {
            return null;
        }
        return (WeakReference) ((ConcurrentHashMap) map).get(str);
    }

    public static void j(String str, ze7 ze7Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("50276e30", new Object[]{str, ze7Var});
        } else if (str != null && ze7Var != null) {
            if (f32705a == null) {
                f32705a = new ConcurrentHashMap();
            }
            f32705a.put(str, new WeakReference<>(ze7Var));
        }
    }

    public static void k(String str) {
        Map<String, WeakReference<ze7>> map;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d1a390b", new Object[]{str});
        } else if (str != null && (map = f32705a) != null) {
            ((ConcurrentHashMap) map).remove(str);
        }
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        e().d();
        h().b();
        b().c();
        d().a();
        i().a();
        g().j();
    }

    public abstract AbilityCenter b();

    public abstract Context c();

    public abstract oc4 d();

    public abstract bq6 e();

    public abstract eo7 g();

    public abstract xig h();

    public abstract viq i();
}
