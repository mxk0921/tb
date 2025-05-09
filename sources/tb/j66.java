package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXEngineConfig;
import com.taobao.android.dinamicx.f;
import com.taobao.android.dinamicx.template.download.DXTemplateItem;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import tb.lc6;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class j66 implements lc6.e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public iwb f21788a;
    public int c;
    public int d;
    public int e;
    public Map<String, List<zh6>> f;
    public List<DXTemplateItem> g;
    public List<DXTemplateItem> h;
    public List<zh6> i;
    public boolean b = false;
    public List<iwb> j = new ArrayList();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ k66 f21789a;

        public a(k66 k66Var) {
            this.f21789a = k66Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            iwb iwbVar = j66.this.f21788a;
            if (iwbVar != null) {
                iwbVar.onNotificationListener(this.f21789a);
                try {
                    List<iwb> list = j66.this.j;
                    if (list != null && list.size() > 0) {
                        for (int i = 0; i < j66.this.j.size(); i++) {
                            j66.this.j.get(i).onNotificationListener(this.f21789a);
                        }
                    }
                } catch (Throwable th) {
                    xv5.b(th);
                    ic5.s(h36.TAG, null, "Signal", "Signal_Exception", f.DX_ERROR_CODE_SIGNAL_EXCEPTION_CRASH_2, xv5.a(th));
                }
            }
        }
    }

    static {
        t2o.a(444596926);
        t2o.a(444596937);
    }

    public j66(DXEngineConfig dXEngineConfig) {
        int l = dXEngineConfig.l();
        this.c = l;
        int i = lc6.g;
        this.d = (l < i ? i : l) / i;
        this.g = new ArrayList();
        this.h = new ArrayList();
        this.i = new ArrayList();
    }

    private void c(zh6 zh6Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84a6765d", new Object[]{this, zh6Var});
        } else if (zh6Var != null && zh6Var.f32770a != null) {
            this.i.add(zh6Var);
        }
    }

    private boolean f() {
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
        } else if (this.f21788a == null || this.e != this.d) {
            this.e++;
        } else {
            l();
            this.e = 0;
        }
    }

    public void b(iwb iwbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d6879", new Object[]{this, iwbVar});
        } else if (iwbVar != null && !this.j.contains(iwbVar)) {
            this.j.add(iwbVar);
        }
    }

    public synchronized void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b42d4c54", new Object[]{this});
            return;
        }
        this.g = new ArrayList();
        this.h = new ArrayList();
        this.i = new ArrayList();
    }

    public iwb e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (iwb) ipChange.ipc$dispatch("968d92a9", new Object[]{this});
        }
        return this.f21788a;
    }

    public synchronized void g(List<DXTemplateItem> list, List<DXTemplateItem> list2) {
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

    public synchronized void h(pu5 pu5Var) {
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

    public synchronized void i(zh6 zh6Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4d21579a", new Object[]{this, zh6Var});
            return;
        }
        if (!(zh6Var == null || zh6Var.f32770a == null)) {
            c(zh6Var);
        }
    }

    public void j(iwb iwbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e4fbd62d", new Object[]{this, iwbVar});
        } else if (iwbVar != null) {
            this.f21788a = iwbVar;
            if (!this.b) {
                lc6.e().g(this);
                this.b = true;
            }
        }
    }

    public void k(iwb iwbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b6704436", new Object[]{this, iwbVar});
        } else if (iwbVar != null && this.j.contains(iwbVar)) {
            this.j.remove(iwbVar);
        }
    }

    public synchronized void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("58b5a39a", new Object[]{this});
            return;
        }
        int size = this.g.size();
        int size2 = this.h.size();
        int size3 = this.i.size();
        if (size > 0 || size2 > 0 || size3 > 0) {
            k66 k66Var = new k66(this.g, this.h, this.i);
            la6.b("DX模板下载完成或降级通知业务刷新:finishedSize=" + size + "failSize=" + size2 + "templateUpdateRequestSize=" + size3);
            d();
            jb6.n(new a(k66Var));
        }
    }

    public void m(iwb iwbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8b6a32a6", new Object[]{this, iwbVar});
        } else if (this.b) {
            if (iwbVar != null) {
                this.f21788a = null;
            }
            lc6.e().p(this);
            this.b = false;
        }
    }
}
