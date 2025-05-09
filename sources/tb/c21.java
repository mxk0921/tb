package tb;

import android.app.Activity;
import android.app.Application;
import android.os.Handler;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.application.common.IApmEventListener;
import com.taobao.application.common.IScrollListener;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class c21 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static jhb f16786a;
    public static final Map<t11, Boolean> b = new HashMap();
    public static final List<t11> c = new ArrayList();
    public static final List<w11> d = new ArrayList();
    public static final List<w11> e = new ArrayList();
    public static final List<v11> f = new ArrayList();
    public static final List<v11> g = new ArrayList();
    public static final List<IApmEventListener> h = new ArrayList();
    public static final List<IApmEventListener> i = new ArrayList();
    public static final List<ijb> j = new ArrayList();
    public static final List<ijb> k = new ArrayList();
    public static final List<IScrollListener> l = new ArrayList();
    public static final List<IScrollListener> m = new ArrayList();

    public static void a(t11 t11Var, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("875f442e", new Object[]{t11Var, new Boolean(z)});
            return;
        }
        jhb jhbVar = f16786a;
        if (jhbVar != null) {
            ((b21) jhbVar).a(t11Var, z);
            return;
        }
        synchronized (c21.class) {
            ((HashMap) b).put(t11Var, Boolean.valueOf(z));
            ((ArrayList) c).remove(t11Var);
        }
    }

    public static void b(ijb ijbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("15f41b30", new Object[]{ijbVar});
            return;
        }
        jhb jhbVar = f16786a;
        if (jhbVar != null) {
            ((b21) jhbVar).b(ijbVar);
            return;
        }
        synchronized (c21.class) {
            ((ArrayList) j).add(ijbVar);
            ((ArrayList) k).remove(ijbVar);
        }
    }

    public static void c(IApmEventListener iApmEventListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("caaeece2", new Object[]{iApmEventListener});
            return;
        }
        jhb jhbVar = f16786a;
        if (jhbVar != null) {
            ((b21) jhbVar).c(iApmEventListener);
            return;
        }
        synchronized (c21.class) {
            ((ArrayList) h).add(iApmEventListener);
            ((ArrayList) i).remove(iApmEventListener);
        }
    }

    public static void d(v11 v11Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cd78e822", new Object[]{v11Var});
            return;
        }
        jhb jhbVar = f16786a;
        if (jhbVar != null) {
            ((b21) jhbVar).d(v11Var);
            return;
        }
        synchronized (c21.class) {
            ((ArrayList) f).add(v11Var);
            ((ArrayList) g).remove(v11Var);
        }
    }

    public static void e(w11 w11Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2ec47e60", new Object[]{w11Var});
            return;
        }
        jhb jhbVar = f16786a;
        if (jhbVar != null) {
            ((b21) jhbVar).e(w11Var);
            return;
        }
        synchronized (c21.class) {
            ((ArrayList) d).add(w11Var);
            ((ArrayList) e).remove(w11Var);
        }
    }

    public static void f(IScrollListener iScrollListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3d38080", new Object[]{iScrollListener});
            return;
        }
        jhb jhbVar = f16786a;
        if (jhbVar != null) {
            ((b21) jhbVar).f(iScrollListener);
            return;
        }
        synchronized (c21.class) {
            ((ArrayList) l).add(iScrollListener);
            ((ArrayList) m).remove(iScrollListener);
        }
    }

    public static chb g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (chb) ipChange.ipc$dispatch("78a245d7", new Object[0]);
        }
        jhb jhbVar = f16786a;
        if (jhbVar != null) {
            return ((b21) jhbVar).k();
        }
        return chb.DEFAULT;
    }

    public static Handler h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Handler) ipChange.ipc$dispatch("4e5fe2bb", new Object[0]);
        }
        jhb jhbVar = f16786a;
        if (jhbVar != null) {
            return ((b21) jhbVar).m();
        }
        return null;
    }

    public static Activity i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Activity) ipChange.ipc$dispatch("1d7099f3", new Object[0]);
        }
        jhb jhbVar = f16786a;
        if (jhbVar != null) {
            return ((b21) jhbVar).q();
        }
        return null;
    }

    public static void j(t11 t11Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("759ecf63", new Object[]{t11Var});
            return;
        }
        jhb jhbVar = f16786a;
        if (jhbVar != null) {
            ((b21) jhbVar).t(t11Var);
            return;
        }
        synchronized (c21.class) {
            ((ArrayList) c).add(t11Var);
            ((HashMap) b).remove(t11Var);
        }
    }

    public static void k(IApmEventListener iApmEventListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4eea7adf", new Object[]{iApmEventListener});
            return;
        }
        jhb jhbVar = f16786a;
        if (jhbVar != null) {
            ((b21) jhbVar).v(iApmEventListener);
            return;
        }
        synchronized (c21.class) {
            ((ArrayList) i).add(iApmEventListener);
            ((ArrayList) h).remove(iApmEventListener);
        }
    }

    public static void l(v11 v11Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d01e1385", new Object[]{v11Var});
            return;
        }
        jhb jhbVar = f16786a;
        if (jhbVar != null) {
            ((b21) jhbVar).w(v11Var);
            return;
        }
        synchronized (c21.class) {
            ((ArrayList) g).add(v11Var);
            ((ArrayList) f).remove(v11Var);
        }
    }

    public static void m(w11 w11Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("19c2f983", new Object[]{w11Var});
            return;
        }
        jhb jhbVar = f16786a;
        if (jhbVar != null) {
            ((b21) jhbVar).x(w11Var);
            return;
        }
        synchronized (c21.class) {
            ((ArrayList) e).add(w11Var);
            ((ArrayList) d).remove(w11Var);
        }
    }

    public static void n(IScrollListener iScrollListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c95794fd", new Object[]{iScrollListener});
            return;
        }
        jhb jhbVar = f16786a;
        if (jhbVar != null) {
            ((b21) jhbVar).y(iScrollListener);
            return;
        }
        synchronized (c21.class) {
            ((ArrayList) m).add(iScrollListener);
            ((ArrayList) l).remove(iScrollListener);
        }
    }

    public static void o(jhb jhbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b9cbfad8", new Object[]{jhbVar});
            return;
        }
        f16786a = jhbVar;
        synchronized (c21.class) {
            try {
                for (Map.Entry entry : ((HashMap) b).entrySet()) {
                    ((b21) jhbVar).a((Application.ActivityLifecycleCallbacks) entry.getKey(), ((Boolean) entry.getValue()).booleanValue());
                }
                ((HashMap) b).clear();
                Iterator it = ((ArrayList) c).iterator();
                while (it.hasNext()) {
                    ((b21) jhbVar).t((t11) it.next());
                }
                ((ArrayList) c).clear();
                Iterator it2 = ((ArrayList) d).iterator();
                while (it2.hasNext()) {
                    ((b21) jhbVar).e((w11) it2.next());
                }
                ((ArrayList) d).clear();
                Iterator it3 = ((ArrayList) e).iterator();
                while (it3.hasNext()) {
                    ((b21) jhbVar).x((w11) it3.next());
                }
                ((ArrayList) e).clear();
                Iterator it4 = ((ArrayList) f).iterator();
                while (it4.hasNext()) {
                    ((b21) jhbVar).d((v11) it4.next());
                }
                ((ArrayList) f).clear();
                Iterator it5 = ((ArrayList) g).iterator();
                while (it5.hasNext()) {
                    ((b21) jhbVar).w((v11) it5.next());
                }
                ((ArrayList) g).clear();
                Iterator it6 = ((ArrayList) h).iterator();
                while (it6.hasNext()) {
                    ((b21) jhbVar).c((IApmEventListener) it6.next());
                }
                ((ArrayList) h).clear();
                Iterator it7 = ((ArrayList) i).iterator();
                while (it7.hasNext()) {
                    ((b21) jhbVar).v((IApmEventListener) it7.next());
                }
                ((ArrayList) i).clear();
                Iterator it8 = ((ArrayList) j).iterator();
                while (it8.hasNext()) {
                    ((b21) jhbVar).b((ijb) it8.next());
                }
                ((ArrayList) j).clear();
                Iterator it9 = ((ArrayList) k).iterator();
                while (it9.hasNext()) {
                    ((b21) jhbVar).u((ijb) it9.next());
                }
                ((ArrayList) k).clear();
                Iterator it10 = ((ArrayList) l).iterator();
                while (it10.hasNext()) {
                    ((b21) jhbVar).f((IScrollListener) it10.next());
                }
                ((ArrayList) l).clear();
                Iterator it11 = ((ArrayList) m).iterator();
                while (it11.hasNext()) {
                    ((b21) jhbVar).y((IScrollListener) it11.next());
                }
                ((ArrayList) m).clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
