package tb;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.widget.desc.image.DetailImageView;
import java.util.ArrayList;
import java.util.Iterator;
import tb.hme;
import tb.md7;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public abstract class kd7<T extends md7> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public Context f22590a;
    public final LayoutInflater b;
    public final Resources c;
    public View d;
    public ux1 e;
    public int f;
    public T g;

    static {
        t2o.a(912262364);
        t2o.a(912262371);
        t2o.a(912262260);
    }

    public kd7(Context context) {
        this.f22590a = context;
        this.b = LayoutInflater.from(context);
        this.c = this.f22590a.getResources();
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1ea0212b", new Object[]{this});
        }
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("99c34246", new Object[]{this});
        }
    }

    public void f(T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d6f9a3e3", new Object[]{this, t});
            return;
        }
        T t2 = this.g;
        if (t2 != null && t2.i != null) {
            ArrayList arrayList = new ArrayList();
            Iterator it = ((ArrayList) t.j).iterator();
            while (it.hasNext()) {
                ux1 ux1Var = (ux1) it.next();
                if (ux1Var != null && (ux1Var instanceof rc7)) {
                    String b = ((rc7) ux1Var).m1123b();
                    if ("user_track".equals(b) || "open_url".equals(b)) {
                        arrayList.add(ux1Var);
                    } else if ("ut_exposure".equals(b)) {
                        this.e = ux1Var;
                    }
                }
            }
            sl8.a(this.f22590a, t, this.d, arrayList);
        }
    }

    public boolean g(T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4947399b", new Object[]{this, t})).booleanValue();
        }
        this.g = t;
        if (!(this.d == null || t == null)) {
            if (m(t)) {
                this.d.setVisibility(8);
            } else {
                if (this.d.getVisibility() == 8) {
                    this.d.setVisibility(0);
                }
                f(t);
                ux1 ux1Var = this.e;
                if (ux1Var != null && !t.e) {
                    q84.f(this.f22590a, ux1Var);
                    t.e = true;
                }
                h(t);
            }
        }
        return true;
    }

    public abstract void h(T t);

    public int i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("62e7f399", new Object[]{this})).intValue();
        }
        return this.f;
    }

    public abstract View j(T t);

    public abstract boolean m(T t);

    public void n(DetailImageView detailImageView, String str, koe koeVar, ame ameVar, hme hmeVar) {
        hme hmeVar2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2700862d", new Object[]{this, detailImageView, str, koeVar, ameVar, hmeVar});
            return;
        }
        if (hmeVar == null) {
            hmeVar = new hme.a().m();
        }
        if (detailImageView != null && !TextUtils.isEmpty(str)) {
            if (hmeVar != null) {
                hme.a t = new hme.a().n(hmeVar.a()).p(hmeVar.c()).s(hmeVar.e()).q(hmeVar.d()).t(hmeVar.f());
                if (koeVar != null) {
                    t.u(koeVar.f22798a).o(koeVar.b);
                }
                hmeVar2 = t.m();
            } else {
                hmeVar2 = null;
            }
            egr d = egr.d();
            if (d == null) {
                return;
            }
            if (ameVar == null) {
                d.f(str, detailImageView, hmeVar2);
            } else {
                d.a(str, detailImageView, hmeVar2, ameVar);
            }
        }
    }

    public View o(T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("13502a45", new Object[]{this, t});
        }
        this.g = t;
        try {
            this.d = j(t);
        } catch (Exception e) {
            tgh.c("DescViewHolder", "Detail view holder get view error:", e);
            this.d = null;
        }
        return this.d;
    }

    public void p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
        }
    }

    public void s(boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6d90b75e", new Object[]{this, new Boolean(z), new Boolean(z2)});
        }
    }

    public void t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
        }
    }

    public void u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3dde88", new Object[]{this});
        }
    }

    public void v(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ced5a91", new Object[]{this, new Integer(i)});
        } else {
            this.f = i;
        }
    }
}
