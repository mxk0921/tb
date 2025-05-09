package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.model.IDMComponent;
import java.util.ArrayList;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class et6 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final List<IDMComponent> f18802a = new ArrayList();
    public final List<IDMComponent> b = new ArrayList();
    public final List<IDMComponent> c = new ArrayList();
    public final List<IDMComponent> d = new ArrayList();
    public final List<IDMComponent> e = new ArrayList();
    public final List<IDMComponent> f = new ArrayList();
    public final List<IDMComponent> g = new ArrayList();
    public final List<o58> h = new ArrayList();
    public u55 i;

    static {
        t2o.a(157286575);
    }

    public List<IDMComponent> a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("97519297", new Object[]{this});
        }
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.f18802a);
        arrayList.addAll(this.b);
        arrayList.addAll(this.c);
        arrayList.addAll(this.d);
        arrayList.addAll(this.e);
        arrayList.addAll(this.g);
        arrayList.addAll(this.f);
        return arrayList;
    }

    public IDMComponent b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IDMComponent) ipChange.ipc$dispatch("9c633444", new Object[]{this});
        }
        if (((ArrayList) this.f).isEmpty()) {
            return null;
        }
        return (IDMComponent) ((ArrayList) this.f).get(0);
    }

    public List<IDMComponent> c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("7433c84a", new Object[]{this});
        }
        return this.b;
    }

    public u55 d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (u55) ipChange.ipc$dispatch("e22f967d", new Object[]{this});
        }
        return this.i;
    }

    public List<o58> e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("1cb32a5f", new Object[]{this});
        }
        return this.h;
    }

    public List<IDMComponent> f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("901b59b1", new Object[]{this});
        }
        return this.c;
    }

    public IDMComponent g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IDMComponent) ipChange.ipc$dispatch("793bcacf", new Object[]{this});
        }
        if (((ArrayList) this.g).isEmpty()) {
            return null;
        }
        return (IDMComponent) ((ArrayList) this.g).get(0);
    }

    public List<IDMComponent> h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("3a8cbc7f", new Object[]{this});
        }
        return this.f18802a;
    }

    public List<IDMComponent> i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("e59f8638", new Object[]{this});
        }
        return this.e;
    }

    public List<IDMComponent> j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("c1b65cac", new Object[]{this});
        }
        return this.d;
    }

    public void k(List<IDMComponent> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dab4866", new Object[]{this, list});
        } else if (list != null && list.size() != 0) {
            ((ArrayList) this.f).clear();
            ((ArrayList) this.f).addAll(list);
        }
    }

    public void l(List<IDMComponent> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e7e8ba5a", new Object[]{this, list});
        } else if (list != null && list.size() > 0) {
            ((ArrayList) this.b).clear();
            ((ArrayList) this.b).addAll(list);
        }
    }

    public void m(u55 u55Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d3080b", new Object[]{this, u55Var});
        } else {
            this.i = u55Var;
        }
    }

    public void n(List<o58> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad2ab54d", new Object[]{this, list});
        } else if (list != null && !list.isEmpty()) {
            ((ArrayList) this.h).clear();
            ((ArrayList) this.h).addAll(list);
        }
    }

    public void o(List<IDMComponent> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3426c2d3", new Object[]{this, list});
        } else if (list != null && list.size() > 0) {
            ((ArrayList) this.c).clear();
            ((ArrayList) this.c).addAll(list);
        }
    }

    public void p(List<IDMComponent> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9155ad7b", new Object[]{this, list});
        } else if (list != null && list.size() != 0) {
            ((ArrayList) this.g).clear();
            ((ArrayList) this.g).addAll(list);
        }
    }

    public void q(List<IDMComponent> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d7e1b9c5", new Object[]{this, list});
        } else if (list != null && list.size() > 0) {
            ((ArrayList) this.f18802a).clear();
            ((ArrayList) this.f18802a).addAll(list);
        }
    }

    public void r(List<IDMComponent> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1516ee2c", new Object[]{this, list});
        } else if (list != null && list.size() > 0) {
            ((ArrayList) this.e).clear();
            ((ArrayList) this.e).addAll(list);
        }
    }

    public void s(List<IDMComponent> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c2c5f3a0", new Object[]{this, list});
        } else if (list != null && list.size() > 0) {
            ((ArrayList) this.d).clear();
            ((ArrayList) this.d).addAll(list);
        }
    }
}
