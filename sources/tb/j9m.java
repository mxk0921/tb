package tb;

import com.alibaba.fastjson.JSONArray;
import com.alipay.android.msp.framework.offline.CashierOperationReceiver;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class j9m implements z9d, w11 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final CopyOnWriteArrayList<z9d> f21851a = new CopyOnWriteArrayList<>();

    static {
        t2o.a(745537978);
        t2o.a(745537971);
    }

    public j9m() {
        t3j t3jVar = new t3j();
        s(new z3j());
        s(t3jVar);
    }

    @Override // tb.z9d
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d496726e", new Object[]{this});
            return;
        }
        c21.e(this);
        for (z9d z9dVar : this.f21851a) {
            z9dVar.a();
        }
    }

    @Override // tb.z9d
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("59172fa7", new Object[]{this});
            return;
        }
        for (z9d z9dVar : this.f21851a) {
            z9dVar.b();
        }
    }

    @Override // tb.z9d
    public void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63e7c19f", new Object[]{this, str});
            return;
        }
        ckf.h(str, CashierOperationReceiver.PARAMS_IDENTIFY);
        for (z9d z9dVar : this.f21851a) {
            z9dVar.c(str);
        }
    }

    @Override // tb.z9d
    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b01cec2", new Object[]{this});
            return;
        }
        for (z9d z9dVar : this.f21851a) {
            z9dVar.d();
        }
    }

    @Override // tb.z9d
    public void e(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d40f842f", new Object[]{this, str, new Long(j)});
            return;
        }
        for (z9d z9dVar : this.f21851a) {
            z9dVar.e(str, j);
        }
    }

    @Override // tb.z9d
    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7d74291", new Object[]{this});
            return;
        }
        for (z9d z9dVar : this.f21851a) {
            z9dVar.f();
        }
    }

    @Override // tb.z9d
    public void g(JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d0b6f765", new Object[]{this, jSONArray});
            return;
        }
        ckf.h(jSONArray, "nameList");
        for (z9d z9dVar : this.f21851a) {
            z9dVar.g(jSONArray);
        }
    }

    @Override // tb.z9d
    public void h(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("69ab8dbf", new Object[]{this, str, new Long(j)});
            return;
        }
        for (z9d z9dVar : this.f21851a) {
            z9dVar.h(str, j);
        }
    }

    @Override // tb.z9d
    public void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("32f8d25d", new Object[]{this});
            return;
        }
        for (z9d z9dVar : this.f21851a) {
            z9dVar.i();
        }
    }

    @Override // tb.z9d
    public void j(List<h3j> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("df37a422", new Object[]{this, list});
            return;
        }
        ckf.h(list, "list");
        for (z9d z9dVar : this.f21851a) {
            z9dVar.j(list);
        }
    }

    @Override // tb.z9d
    public void k(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc819339", new Object[]{this, str});
            return;
        }
        ckf.h(str, CashierOperationReceiver.PARAMS_IDENTIFY);
        for (z9d z9dVar : this.f21851a) {
            z9dVar.k(str);
        }
    }

    @Override // tb.z9d
    public void l(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("846f1040", new Object[]{this, str});
            return;
        }
        ckf.h(str, CashierOperationReceiver.PARAMS_IDENTIFY);
        for (z9d z9dVar : this.f21851a) {
            z9dVar.l(str);
        }
    }

    @Override // tb.z9d
    public void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b1ebf56", new Object[]{this});
            return;
        }
        for (z9d z9dVar : this.f21851a) {
            z9dVar.m();
        }
    }

    @Override // tb.z9d
    public void n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("655b6c9", new Object[]{this});
            return;
        }
        for (z9d z9dVar : this.f21851a) {
            z9dVar.n();
        }
    }

    @Override // tb.z9d
    public void o(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c6e51058", new Object[]{this, str});
            return;
        }
        ckf.h(str, CashierOperationReceiver.PARAMS_IDENTIFY);
        for (z9d z9dVar : this.f21851a) {
            z9dVar.o(str);
        }
    }

    @Override // com.taobao.application.common.IPageListener
    public void onPageChanged(String str, int i, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fcf1be38", new Object[]{this, str, new Integer(i), new Long(j)});
        } else if (i == 1) {
            h(str, j);
        } else if (i == 2) {
            e(str, j);
        } else if (i == 3) {
            p(str, j);
        }
    }

    @Override // tb.z9d
    public void p(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d34970bf", new Object[]{this, str, new Long(j)});
            return;
        }
        for (z9d z9dVar : this.f21851a) {
            z9dVar.p(str, j);
        }
    }

    @Override // tb.z9d
    public void q(List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9f266ab", new Object[]{this, list});
            return;
        }
        ckf.h(list, "nameList");
        for (z9d z9dVar : this.f21851a) {
            z9dVar.q(list);
        }
    }

    @Override // tb.z9d
    public void r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c39d72d8", new Object[]{this});
            return;
        }
        for (z9d z9dVar : this.f21851a) {
            z9dVar.r();
        }
    }

    public final void s(z9d z9dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9cca20e4", new Object[]{this, z9dVar});
            return;
        }
        ckf.h(z9dVar, ku0.TRACK_PAGE_COUNTER_TYPE_PLUGIN);
        this.f21851a.add(z9dVar);
    }
}
