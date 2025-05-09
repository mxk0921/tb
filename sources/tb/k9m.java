package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class k9m {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final k9m INSTANCE;

    /* renamed from: a  reason: collision with root package name */
    public static final List<zy1> f22502a = new ArrayList();

    static {
        t2o.a(1007681541);
        t2o.a(1007681571);
        k9m k9mVar = new k9m();
        INSTANCE = k9mVar;
        k9mVar.a(new flq());
    }

    public final void a(zy1 zy1Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9d2f1dd", new Object[]{this, zy1Var});
            return;
        }
        ckf.g(zy1Var, ku0.TRACK_PAGE_COUNTER_TYPE_PLUGIN);
        f22502a.add(zy1Var);
    }

    public void b(boolean z, xoh xohVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc2e1f04", new Object[]{this, new Boolean(z), xohVar});
            return;
        }
        ckf.g(xohVar, "params");
        Iterator it = ((ArrayList) f22502a).iterator();
        while (it.hasNext()) {
            ((zy1) it.next()).a(z, xohVar);
        }
    }

    public void c(xoh xohVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("709956ce", new Object[]{this, xohVar});
            return;
        }
        ckf.g(xohVar, "params");
        Iterator it = ((ArrayList) f22502a).iterator();
        while (it.hasNext()) {
            ((zy1) it.next()).b(xohVar);
        }
    }

    public void d(xoh xohVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70b5afcf", new Object[]{this, xohVar});
            return;
        }
        ckf.g(xohVar, "params");
        Iterator it = ((ArrayList) f22502a).iterator();
        while (it.hasNext()) {
            ((zy1) it.next()).c(xohVar);
        }
    }

    public void e(l29 l29Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2e6c567f", new Object[]{this, l29Var});
            return;
        }
        Iterator it = ((ArrayList) f22502a).iterator();
        while (it.hasNext()) {
            ((zy1) it.next()).d(l29Var);
        }
    }

    public void f(boolean z, l29 l29Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a537a24", new Object[]{this, new Boolean(z), l29Var});
            return;
        }
        Iterator it = ((ArrayList) f22502a).iterator();
        while (it.hasNext()) {
            ((zy1) it.next()).e(z, l29Var);
        }
    }

    public void g(boolean z, xoh xohVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f56002a3", new Object[]{this, new Boolean(z), xohVar});
            return;
        }
        ckf.g(xohVar, "params");
        Iterator it = ((ArrayList) f22502a).iterator();
        while (it.hasNext()) {
            ((zy1) it.next()).f(z, xohVar);
        }
    }
}
