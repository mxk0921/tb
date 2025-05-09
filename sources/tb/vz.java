package tb;

import android.app.Activity;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.LinkedHashSet;
import java.util.Set;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public abstract class vz {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Activity f30355a;
    public final Object b;
    public final Set<vz> c = new LinkedHashSet();

    static {
        t2o.a(481297459);
    }

    public vz(Activity activity, Object obj) {
        ckf.g(activity, "activity");
        this.f30355a = activity;
        this.b = obj;
        if (obj instanceof vz) {
            ((vz) obj).C(this);
        }
    }

    public final void C(vz vzVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad7a9e50", new Object[]{this, vzVar});
            return;
        }
        ckf.g(vzVar, "child");
        this.c.add(vzVar);
        a(vzVar);
    }

    public final void D() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e402f4d8", new Object[]{this});
            return;
        }
        Object obj = this.b;
        if (obj instanceof vz) {
            ((vz) obj).Q(this);
        }
        P();
    }

    public final Activity E() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Activity) ipChange.ipc$dispatch("81223f9c", new Object[]{this});
        }
        return this.f30355a;
    }

    public void G() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a83cc9b", new Object[]{this});
            return;
        }
        for (vz vzVar : this.c) {
            vzVar.G();
        }
    }

    public void J() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c5b0e87", new Object[]{this});
            return;
        }
        for (vz vzVar : this.c) {
            vzVar.J();
        }
    }

    public void K() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4093bf38", new Object[]{this});
            return;
        }
        for (vz vzVar : this.c) {
            vzVar.K();
        }
    }

    public void L() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b94d49d", new Object[]{this});
            return;
        }
        for (vz vzVar : this.c) {
            vzVar.L();
        }
    }

    public void M() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9510bdf6", new Object[]{this});
            return;
        }
        for (vz vzVar : this.c) {
            vzVar.M();
        }
    }

    public void N() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("481b5ba0", new Object[]{this});
            return;
        }
        for (vz vzVar : this.c) {
            vzVar.N();
        }
    }

    public void O() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c07e26ec", new Object[]{this});
            return;
        }
        for (vz vzVar : this.c) {
            vzVar.O();
        }
    }

    public void P() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e7a61dd", new Object[]{this});
            return;
        }
        for (vz vzVar : this.c) {
            vzVar.P();
        }
    }

    public final void Q(vz vzVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c97f1933", new Object[]{this, vzVar});
            return;
        }
        ckf.g(vzVar, "child");
        this.c.remove(vzVar);
        b(vzVar);
    }

    public void a(vz vzVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("37f60b6c", new Object[]{this, vzVar});
        } else {
            ckf.g(vzVar, "child");
        }
    }

    public void b(vz vzVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("809c6ccc", new Object[]{this, vzVar});
        } else {
            ckf.g(vzVar, "child");
        }
    }
}
