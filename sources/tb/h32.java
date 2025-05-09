package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public abstract class h32 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final List<qdd> f20383a = new ArrayList();

    static {
        t2o.a(1001390082);
        t2o.a(1001390090);
    }

    public static /* synthetic */ void g(h32 h32Var, Map map, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e1c2c80", new Object[]{h32Var, map, new Integer(i), obj});
        } else if (obj == null) {
            if ((i & 1) != 0) {
                map = null;
            }
            h32Var.f(map);
        } else {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: update");
        }
    }

    public void a(qdd qddVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf660d99", new Object[]{this, qddVar});
            return;
        }
        ckf.g(qddVar, "processor");
        ((ArrayList) this.f20383a).add(qddVar);
    }

    public void b(e3c e3cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e029d5a", new Object[]{this, e3cVar});
            return;
        }
        ckf.g(e3cVar, "event");
        d(e3cVar);
    }

    public abstract Map<String, Object> c();

    public abstract void d(e3c e3cVar);

    public final void e(zzn zznVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d87c9210", new Object[]{this, zznVar});
            return;
        }
        Iterator it = ((ArrayList) this.f20383a).iterator();
        while (it.hasNext()) {
            ((qdd) it.next()).a(c(), zznVar);
        }
    }

    public final void f(Map<String, ? extends Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4ce5f0b5", new Object[]{this, map});
            return;
        }
        Iterator it = ((ArrayList) this.f20383a).iterator();
        while (it.hasNext()) {
            ((qdd) it.next()).b(c(), map);
        }
    }
}
