package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.android.dinamicx.widget.DXWidgetRefreshOption;
import com.taobao.android.dinamicx_v4.responsive.impl.PropertyInfo;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import tb.yl6;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class n96 implements twb, xub {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public WeakReference<yl6> f24585a;
    public WeakReference<Object> b;
    public String c;
    public boolean d;
    public List<WeakReference<DXWidgetNode>> e;
    public WeakReference<DXWidgetNode> f;
    public WeakReference<yub> g;
    public List<PropertyInfo> h;

    static {
        t2o.a(444597877);
        t2o.a(444597977);
        t2o.a(444597975);
    }

    public n96(yl6 yl6Var) {
        f(yl6Var);
    }

    @Override // tb.twb
    public void a(Object obj, boolean z) {
        yl6 yl6Var;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1525b862", new Object[]{this, obj, new Boolean(z)});
            return;
        }
        WeakReference<yl6> weakReference = this.f24585a;
        if (weakReference != null && (yl6Var = weakReference.get()) != null) {
            yl6Var.h().h(obj);
            if (this.d) {
                m(yl6Var, obj);
                if (z) {
                    h();
                }
            } else if (z) {
                h();
            }
            if (z) {
                l();
            }
        }
    }

    @Override // tb.twb
    public List<PropertyInfo> b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("99f7a7ed", new Object[]{this});
        }
        return this.h;
    }

    @Override // tb.twb
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a60a7f3a", new Object[]{this});
            return;
        }
        h();
        l();
    }

    @Override // tb.twb
    public void d(DXWidgetNode dXWidgetNode, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c6d36b52", new Object[]{this, dXWidgetNode, new Long(j)});
            return;
        }
        if (this.h == null) {
            this.h = new ArrayList();
        }
        Iterator it = ((ArrayList) this.h).iterator();
        while (it.hasNext()) {
            PropertyInfo propertyInfo = (PropertyInfo) it.next();
            if (propertyInfo.c() == null) {
                it.remove();
            } else if (propertyInfo.c().get() == dXWidgetNode) {
                propertyInfo.a(j);
                return;
            }
        }
        PropertyInfo propertyInfo2 = new PropertyInfo();
        propertyInfo2.e(dXWidgetNode);
        propertyInfo2.a(j);
        ((ArrayList) this.h).add(propertyInfo2);
    }

    public void e(DXWidgetNode dXWidgetNode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cd9828a5", new Object[]{this, dXWidgetNode});
        } else if (dXWidgetNode != null) {
            ((ArrayList) this.e).add(new WeakReference(dXWidgetNode));
        }
    }

    public void f(yl6 yl6Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a021abb8", new Object[]{this, yl6Var});
            return;
        }
        this.f24585a = new WeakReference<>(yl6Var);
        this.e = new ArrayList();
        new ArrayList();
        this.d = yl6Var.f().d();
        this.c = yl6Var.f().b();
    }

    public void g(DXWidgetNode dXWidgetNode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a95e34de", new Object[]{this, dXWidgetNode});
        } else if (dXWidgetNode != null) {
            this.f = new WeakReference<>(dXWidgetNode);
        }
    }

    public void h() {
        Iterator it;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7693f932", new Object[]{this});
            return;
        }
        List<WeakReference<DXWidgetNode>> list = this.e;
        if (list != null && (it = ((ArrayList) list).iterator()) != null) {
            DXWidgetRefreshOption a2 = new DXWidgetRefreshOption.a().d(true).c(1).g(true).a();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                if (weakReference.get() == null) {
                    it.remove();
                } else {
                    ((DXWidgetNode) weakReference.get()).setNeedParse(a2);
                }
            }
        }
    }

    public void i(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6246f81", new Object[]{this, obj});
        } else {
            this.b = new WeakReference<>(obj);
        }
    }

    public boolean j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("95a7f5fb", new Object[]{this})).booleanValue();
        }
        return this.d;
    }

    public void k(yub yubVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7828bb58", new Object[]{this, yubVar});
        } else if (!TextUtils.isEmpty(this.c) && this.d && yubVar != null) {
            this.g = new WeakReference<>(yubVar);
            yubVar.a(this.c, this);
        }
    }

    public void l() {
        yl6 yl6Var;
        List<ac5> b;
        ac5 ac5Var;
        fc5 d;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5fb9149d", new Object[]{this});
            return;
        }
        DXWidgetNode dXWidgetNode = this.f.get();
        if (!(dXWidgetNode == null || !dXWidgetNode.isRootNode() || (yl6Var = this.f24585a.get()) == null || (b = dXWidgetNode.getDxv4Properties().b()) == null)) {
            for (yl6.a aVar : yl6Var.d()) {
                int a2 = aVar.a();
                if (a2 >= 0 && a2 < b.size() && (ac5Var = b.get(a2)) != null && (d = ac5Var.d()) != null) {
                    d.g(aVar.b());
                }
            }
        }
    }

    public final void m(yl6 yl6Var, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eaa0d2fa", new Object[]{this, yl6Var, obj});
        } else if (yl6Var.f().a() == 1) {
            try {
                DXWidgetNode dXWidgetNode = this.f.get();
                if (dXWidgetNode != null) {
                    bb6.a(this.c, this.b.get(), obj, dXWidgetNode.getDXRuntimeContext().j());
                    WeakReference<yub> weakReference = this.g;
                    if (weakReference != null && weakReference.get() != null) {
                        this.g.get().b(this.c);
                    }
                }
            } catch (Exception e) {
                xv5.b(e);
            }
        }
    }

    @Override // tb.twb
    public void setState(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a7d10b2", new Object[]{this, obj});
        } else {
            a(obj, true);
        }
    }
}
