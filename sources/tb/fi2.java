package tb;

import android.app.Activity;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.bootimage.arch.flow.bootimage.BroadcastFlowInterceptor;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class fi2 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final lh2 d;
    public final a29 e;
    public final djq f;

    /* renamed from: a  reason: collision with root package name */
    public final List<vxb> f19305a = new ArrayList();
    public final List<ckc> b = new ArrayList();
    public final List<m7c> c = new ArrayList();
    public final BroadcastFlowInterceptor g = new BroadcastFlowInterceptor();

    static {
        t2o.a(736100361);
    }

    public fi2() {
        lh2 lh2Var = new lh2();
        this.d = lh2Var;
        a29 a29Var = new a29();
        this.e = a29Var;
        this.f = new djq(lh2Var, a29Var);
        d();
        f();
        e();
    }

    public void a(int i, Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc55ebcc", new Object[]{this, new Integer(i), activity});
            return;
        }
        tm1.a("2ARCH_BootImageWorkFlow", "launcherStart: ");
        nh2.n("");
        Iterator it = ((ArrayList) this.c).iterator();
        while (it.hasNext()) {
            if (!((m7c) it.next()).a()) {
                tm1.a("2ARCH_BootImageWorkFlow", "launcherStart: 拦截");
                return;
            }
        }
        tm1.a("2ARCH_BootImageWorkFlow", "launcherStart: start");
        this.f.a(activity);
        Iterator it2 = ((ArrayList) this.b).iterator();
        while (it2.hasNext()) {
            ckc ckcVar = (ckc) it2.next();
            tm1.a("2ARCH_BootImageWorkFlow", "launcherStart: 分发 " + ckcVar.getClass());
            ckcVar.onStart(this.d.g(), i);
        }
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("35d752af", new Object[]{this});
            return;
        }
        tm1.a("2ARCH_BootImageWorkFlow", "loadDataFromCache: ");
        Iterator it = ((ArrayList) this.f19305a).iterator();
        while (it.hasNext()) {
            ((vxb) it.next()).d();
        }
    }

    public void c(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("321fb035", new Object[]{this, new Integer(i)});
            return;
        }
        Iterator it = ((ArrayList) this.b).iterator();
        while (it.hasNext()) {
            ((ckc) it.next()).onDownload(this.d.g(), i);
        }
    }

    public final void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7deb2296", new Object[]{this});
            return;
        }
        this.f19305a.add(this.d);
        this.f19305a.add(this.e);
    }

    public final void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab0e7564", new Object[]{this});
            return;
        }
        this.c.add(this.g);
        this.c.add(this.e);
    }

    public final void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b49051a", new Object[]{this});
        } else {
            this.b.add(this.f);
        }
    }

    public void h(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f55dc7a5", new Object[]{this, jSONObject});
            return;
        }
        tm1.a("2ARCH_BootImageWorkFlow", "updateAwesomeData: ");
        Iterator it = ((ArrayList) this.f19305a).iterator();
        while (it.hasNext()) {
            ((vxb) it.next()).b(jSONObject);
        }
    }

    public void i(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e90d432f", new Object[]{this, jSONObject});
            return;
        }
        tm1.a("2ARCH_BootImageWorkFlow", "updateSplashData: ");
        Iterator it = ((ArrayList) this.f19305a).iterator();
        while (it.hasNext()) {
            ((vxb) it.next()).c(jSONObject);
        }
    }

    public void g(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b7a35573", new Object[]{this, new Integer(i)});
            return;
        }
        Iterator it = ((ArrayList) this.b).iterator();
        while (it.hasNext()) {
            ckc ckcVar = (ckc) it.next();
            tm1.a("2ARCH_BootImageWorkFlow", "pageInBackground: 分发 " + ckcVar.getClass());
            ckcVar.onTerminate(i, 205, 0);
        }
    }
}
