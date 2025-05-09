package tb;

import android.view.View;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.avplayer.DWContext;
import com.taobao.avplayer.DWLifecycleType;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class i85 implements ctb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final DWContext f21152a;
    public h85 b;
    public r75 c;
    public p85 d;
    public final ArrayList<ctb> e = new ArrayList<>();

    static {
        t2o.a(452984925);
        t2o.a(452985037);
    }

    public i85(DWContext dWContext) {
        this.f21152a = dWContext;
        d();
        c();
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        ArrayList<ctb> arrayList = this.e;
        if (arrayList != null) {
            arrayList.clear();
        }
        p85 p85Var = this.d;
        if (p85Var != null) {
            p85Var.e();
            this.d = null;
        }
        r75 r75Var = this.c;
        if (r75Var != null) {
            r75Var.d();
        }
    }

    public View b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("576a35e4", new Object[]{this});
        }
        return this.b.c();
    }

    public final void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
            return;
        }
        if (this.f21152a.mInteractiveId != -1) {
            p85 p85Var = new p85(this.f21152a, this.b);
            this.d = p85Var;
            e(p85Var);
        }
        r75 r75Var = new r75(this.f21152a);
        this.c = r75Var;
        e(r75Var);
        this.b.b(this.c.e(), new FrameLayout.LayoutParams(-1, -1));
    }

    public final void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce529ddc", new Object[]{this});
        } else {
            this.b = new h85(this.f21152a);
        }
    }

    public final void e(ctb ctbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fbffd053", new Object[]{this, ctbVar});
        } else if (!this.e.contains(ctbVar)) {
            this.e.add(ctbVar);
        }
    }

    public void f(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("127138cd", new Object[]{this, new Boolean(z)});
            return;
        }
        p85 p85Var = this.d;
        if (p85Var != null) {
            p85Var.i(z);
        }
    }

    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("684668ab", new Object[]{this});
            return;
        }
        p85 p85Var = this.d;
        if (p85Var != null) {
            p85Var.j();
        }
    }

    @Override // tb.ctb
    public void onLifecycleChanged(DWLifecycleType dWLifecycleType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1e41106", new Object[]{this, dWLifecycleType});
            return;
        }
        Iterator<ctb> it = this.e.iterator();
        while (it.hasNext()) {
            it.next().onLifecycleChanged(dWLifecycleType);
        }
    }
}
