package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.template.download.DXTemplateItem;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import tb.lc6;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class na6 implements lc6.e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public iwb f24603a;
    public int d;
    public int e;
    public Map<String, List<zh6>> f;
    public List<DXTemplateItem> g;
    public List<DXTemplateItem> h;
    public List<zh6> i;
    public boolean b = false;
    public int c = 500;
    public List<iwb> j = new ArrayList();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ k66 f24604a;

        public a(k66 k66Var) {
            this.f24604a = k66Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            iwb iwbVar = na6.this.f24603a;
            if (iwbVar != null) {
                iwbVar.onNotificationListener(this.f24604a);
            }
        }
    }

    static {
        t2o.a(444596930);
        t2o.a(444596937);
    }

    public na6() {
        int i = this.c;
        int i2 = lc6.g;
        this.d = (i < i2 ? i2 : i) / i2;
        this.g = new ArrayList();
        this.h = new ArrayList();
        this.i = new ArrayList();
    }

    private void b(zh6 zh6Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84a6765d", new Object[]{this, zh6Var});
        } else if (zh6Var != null && zh6Var.f32770a != null) {
            this.i.add(zh6Var);
        }
    }

    private boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f13a3954", new Object[]{this})).booleanValue();
        }
        if (this.g.size() > 0 || this.h.size() > 0 || this.i.size() > 0) {
            return true;
        }
        return false;
    }

    @Override // tb.lc6.e
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("482f6a75", new Object[]{this});
        } else if (this.f24603a == null || this.e != this.d) {
            this.e++;
        } else {
            j();
            this.e = 0;
        }
    }

    public synchronized void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b42d4c54", new Object[]{this});
            return;
        }
        this.g = new ArrayList();
        this.h = new ArrayList();
        this.i = new ArrayList();
    }

    public iwb d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (iwb) ipChange.ipc$dispatch("968d92a9", new Object[]{this});
        }
        return this.f24603a;
    }

    public synchronized void f(List<DXTemplateItem> list, List<DXTemplateItem> list2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("af2f0c94", new Object[]{this, list, list2});
            return;
        }
        if (list != null && list.size() > 0) {
            this.g.addAll(list);
        }
        if (list2 != null && list2.size() > 0) {
            this.h.addAll(list2);
        }
    }

    public synchronized void g(pu5 pu5Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e9699c3", new Object[]{this, pu5Var});
        } else if (pu5Var != null) {
            if (pu5Var.b() && pu5Var.a() != null) {
                this.g.add(pu5Var.a());
            } else if (pu5Var.a() != null) {
                this.h.add(pu5Var.a());
            }
        }
    }

    public synchronized void h(zh6 zh6Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4d21579a", new Object[]{this, zh6Var});
            return;
        }
        if (!(zh6Var == null || zh6Var.f32770a == null)) {
            b(zh6Var);
        }
    }

    public void i(iwb iwbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e4fbd62d", new Object[]{this, iwbVar});
        } else if (iwbVar != null) {
            this.f24603a = iwbVar;
            if (!this.b) {
                lc6.e().h(this);
                this.b = true;
            }
        }
    }

    public synchronized void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("58b5a39a", new Object[]{this});
            return;
        }
        if (e()) {
            k66 k66Var = new k66(this.g, this.h, this.i);
            c();
            jb6.n(new a(k66Var));
        }
    }

    public void k(iwb iwbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8b6a32a6", new Object[]{this, iwbVar});
        } else if (this.b) {
            if (iwbVar != null) {
                this.f24603a = null;
            }
            lc6.e().q(this);
            this.b = false;
        }
    }
}
