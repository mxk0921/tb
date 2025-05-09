package tb;

import android.content.Context;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.ut.monitor.DataReceiveMonitor;
import com.taobao.android.turbo.core.component.BaseOuterComponent;
import com.taobao.android.turbo.core.service.BaseServiceDelegate;
import com.taobao.android.turbo.model.DrawerModel;
import com.taobao.android.turbo.model.TabModel;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class dps extends BaseServiceDelegate implements kxd {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final b7d b;
    public final c1c c;
    public final k1e d;
    public final xwc e;
    public final tjb f;
    public final fed g;
    public final azc h;
    public final f2e i;

    static {
        t2o.a(916455429);
        t2o.a(916455431);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dps(qpu qpuVar) {
        super(qpuVar);
        ckf.g(qpuVar, "context");
        this.b = (b7d) qpuVar.getService(b7d.class);
        this.c = (c1c) qpuVar.getService(c1c.class);
        this.d = (k1e) qpuVar.getService(k1e.class);
        this.e = (xwc) qpuVar.getService(xwc.class);
        this.f = (tjb) qpuVar.getService(tjb.class);
        this.g = (fed) qpuVar.getService(fed.class);
        this.h = (azc) qpuVar.getService(azc.class);
        this.i = (f2e) qpuVar.getService(f2e.class);
    }

    public static /* synthetic */ Object ipc$super(dps dpsVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/turbo/Tab2ServiceDelegate");
    }

    @Override // tb.kxd
    public void A(boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("35d69233", new Object[]{this, new Boolean(z), new Boolean(z2)});
        } else {
            this.f.i1(z, z2);
        }
    }

    @Override // tb.kxd
    public void B(rjb rjbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("37e92383", new Object[]{this, rjbVar});
            return;
        }
        ckf.g(rjbVar, DataReceiveMonitor.CB_LISTENER);
        this.f.B(rjbVar);
    }

    @Override // tb.kxd
    public Map<String, String> C(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("17a75b01", new Object[]{this, str});
        }
        ckf.g(str, "subPageId");
        return this.i.C(str);
    }

    @Override // tb.kxd
    public boolean D(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a4eb38b0", new Object[]{this, str, str2})).booleanValue();
        }
        ckf.g(str, "subPageId");
        ckf.g(str2, "pageName");
        return this.i.D(str, str2);
    }

    @Override // tb.kxd
    public DrawerModel.DrawerGravity E(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DrawerModel.DrawerGravity) ipChange.ipc$dispatch("1e2cde54", new Object[]{this, str});
        }
        ckf.g(str, "drawerId");
        return this.c.E(str);
    }

    @Override // tb.kxd
    public boolean J(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("25568abf", new Object[]{this, str, map})).booleanValue();
        }
        ckf.g(str, "subPageId");
        ckf.g(map, wua.KEY_PROPERTIES);
        return this.i.J(str, map);
    }

    @Override // tb.kxd
    public void L(rjb rjbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("40e57d80", new Object[]{this, rjbVar});
            return;
        }
        ckf.g(rjbVar, DataReceiveMonitor.CB_LISTENER);
        this.f.L(rjbVar);
    }

    @Override // tb.kxd
    public void M(ieb iebVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c133c2a", new Object[]{this, iebVar});
            return;
        }
        ckf.g(iebVar, DataReceiveMonitor.CB_LISTENER);
        this.b.M(iebVar);
    }

    @Override // tb.kxd
    public boolean N() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5182c40a", new Object[]{this})).booleanValue();
        }
        return this.d.N();
    }

    @Override // tb.kxd
    public boolean O() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9d0793af", new Object[]{this})).booleanValue();
        }
        return this.d.O();
    }

    @Override // tb.kxd
    public boolean P(String str, String str2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4c52d539", new Object[]{this, str, str2, new Boolean(z)})).booleanValue();
        }
        ckf.g(str, "subPageId");
        ckf.g(str2, "pageName");
        return this.i.P(str, str2, z);
    }

    @Override // tb.kxd
    public void Q(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("763fb67f", new Object[]{this, context, str});
            return;
        }
        ckf.g(context, "context");
        ckf.g(str, "id");
        this.h.Q(context, str);
    }

    @Override // tb.kxd
    public boolean S(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e7806309", new Object[]{this, str})).booleanValue();
        }
        ckf.g(str, "subPageId");
        return this.i.S(str);
    }

    @Override // tb.kxd
    public Map<String, Integer> T() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("59432d6e", new Object[]{this});
        }
        return this.e.T();
    }

    @Override // tb.kxd
    public boolean V(DrawerModel.DrawerGravity drawerGravity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("634db84e", new Object[]{this, drawerGravity})).booleanValue();
        }
        ckf.g(drawerGravity, "drawerGravity");
        return this.c.V(drawerGravity);
    }

    @Override // tb.kxd
    public int W() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5f287b0", new Object[]{this})).intValue();
        }
        return this.d.W();
    }

    @Override // tb.kxd
    public TabModel X(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TabModel) ipChange.ipc$dispatch("f619fbce", new Object[]{this, str});
        }
        ckf.g(str, vaj.KEY_TAB_ID);
        return this.e.d0(this.e.E1(str));
    }

    @Override // tb.kxd
    public boolean Y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("dcf6a53f", new Object[]{this})).booleanValue();
        }
        return this.f.p0();
    }

    @Override // tb.kxd
    public void Z(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8eea8acf", new Object[]{this, new Boolean(z)});
        } else {
            this.c.k(z);
        }
    }

    @Override // tb.kxd
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84a431c2", new Object[]{this});
        } else {
            this.d.a();
        }
    }

    @Override // tb.kxd
    public boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("1bb83ae6", new Object[]{this})).booleanValue() : this.d.show();
    }

    @Override // tb.kxd
    public void d(a1c a1cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a0ae613", new Object[]{this, a1cVar});
            return;
        }
        ckf.g(a1cVar, DataReceiveMonitor.CB_LISTENER);
        this.c.Y().d(a1cVar);
    }

    @Override // tb.kxd
    public void e(d1c d1cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a604a482", new Object[]{this, d1cVar});
            return;
        }
        ckf.g(d1cVar, DataReceiveMonitor.CB_LISTENER);
        this.c.Y().e(d1cVar);
    }

    @Override // tb.kxd
    public void f(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e906539a", new Object[]{this, jSONObject});
        } else {
            this.g.f(jSONObject);
        }
    }

    @Override // tb.vod
    public int getScrollState() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("199fa08", new Object[]{this})).intValue();
        }
        return this.e.getScrollState();
    }

    @Override // tb.kxd
    public boolean hideBackButton() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ddb73ce6", new Object[]{this})).booleanValue();
        }
        return this.d.hideBackButton();
    }

    @Override // tb.kxd
    public void p(a1c a1cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8429b7fa", new Object[]{this, a1cVar});
            return;
        }
        ckf.g(a1cVar, DataReceiveMonitor.CB_LISTENER);
        this.c.Y().p(a1cVar);
    }

    @Override // tb.kxd
    public void r(ieb iebVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e617e7", new Object[]{this, iebVar});
            return;
        }
        ckf.g(iebVar, DataReceiveMonitor.CB_LISTENER);
        this.b.r(iebVar);
    }

    @Override // tb.kxd
    public boolean selectTab(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("33f96ace", new Object[]{this, str})).booleanValue();
        }
        ckf.g(str, vaj.KEY_TAB_ID);
        return this.e.selectTab(str);
    }

    @Override // tb.kxd
    public boolean showBackButton() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2041761", new Object[]{this})).booleanValue();
        }
        return this.d.showBackButton();
    }

    @Override // tb.kxd
    public void t(byd bydVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c8df18f", new Object[]{this, bydVar});
            return;
        }
        ckf.g(bydVar, DataReceiveMonitor.CB_LISTENER);
        this.e.Y().t(bydVar);
    }

    @Override // tb.kxd
    public void u(BaseOuterComponent.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7a0cdf87", new Object[]{this, bVar});
            return;
        }
        ckf.g(bVar, "message");
        this.b.u(bVar);
    }

    @Override // tb.kxd
    public Map<String, String> w(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("c8accbd2", new Object[]{this, str});
        }
        ckf.g(str, "subPageId");
        return this.i.w(str);
    }

    @Override // tb.kxd
    public void x(k7d k7dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3b2b608", new Object[]{this, k7dVar});
            return;
        }
        ckf.g(k7dVar, DataReceiveMonitor.CB_LISTENER);
        this.b.x(k7dVar);
    }

    @Override // tb.kxd
    public int y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("765615ae", new Object[]{this})).intValue();
        }
        return this.d.y();
    }

    @Override // tb.kxd
    public boolean z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("88fceaeb", new Object[]{this})).booleanValue();
        }
        return this.d.hide();
    }

    @Override // tb.kxd
    public void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3cd697d2", new Object[]{this, str});
            return;
        }
        ckf.g(str, "iconUrl");
        this.d.b(str);
    }
}
