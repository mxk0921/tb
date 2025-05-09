package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.proxy.tbliveinteractive.IInteractiveProxy;
import com.taobao.taolive.sdk.adapter.network.INetDataObject;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class khf implements cgc, IInteractiveProxy.g {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final long f22669a;
    public long c;
    public long d;
    public long e;
    public final ukr g;
    public List<cgc> f = new ArrayList();
    public final long b = p();

    static {
        t2o.a(295699831);
        t2o.a(806356558);
        t2o.a(806355278);
    }

    public khf(ukr ukrVar, long j) {
        this.g = ukrVar;
        this.f22669a = j;
    }

    @Override // tb.cgc
    public void a(IInteractiveProxy.e eVar, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ebb4a74e", new Object[]{this, eVar, map});
            return;
        }
        List<cgc> list = this.f;
        if (list != null) {
            Iterator it = ((ArrayList) list).iterator();
            while (it.hasNext()) {
                ((cgc) it.next()).a(eVar, map);
            }
        }
    }

    @Override // tb.cgc
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dec5108c", new Object[]{this});
            return;
        }
        List<cgc> list = this.f;
        if (list != null) {
            Iterator it = ((ArrayList) list).iterator();
            while (it.hasNext()) {
                ((cgc) it.next()).b();
            }
        }
    }

    @Override // tb.cgc
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9264a7ae", new Object[]{this});
            return;
        }
        List<cgc> list = this.f;
        if (list != null) {
            Iterator it = ((ArrayList) list).iterator();
            while (it.hasNext()) {
                ((cgc) it.next()).c();
            }
        }
    }

    @Override // tb.cgc
    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("40139be7", new Object[]{this});
            return;
        }
        p();
        List<cgc> list = this.f;
        if (list != null) {
            Iterator it = ((ArrayList) list).iterator();
            while (it.hasNext()) {
                ((cgc) it.next()).d();
            }
        }
    }

    @Override // tb.cgc
    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a31779c", new Object[]{this});
            return;
        }
        p();
        List<cgc> list = this.f;
        if (list != null) {
            Iterator it = ((ArrayList) list).iterator();
            while (it.hasNext()) {
                ((cgc) it.next()).e();
            }
        }
    }

    @Override // com.taobao.android.live.plugin.proxy.tbliveinteractive.IInteractiveProxy.g
    public void f(cgc cgcVar) {
        List<cgc> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a80d14fd", new Object[]{this, cgcVar});
        } else if (cgcVar != null && (list = this.f) != null) {
            list.remove(cgcVar);
        }
    }

    @Override // tb.cgc
    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("185c12c2", new Object[]{this});
            return;
        }
        List<cgc> list = this.f;
        if (list != null) {
            Iterator it = ((ArrayList) list).iterator();
            while (it.hasNext()) {
                ((cgc) it.next()).g();
            }
        }
    }

    @Override // com.taobao.android.live.plugin.proxy.tbliveinteractive.IInteractiveProxy.g
    public void h(cgc cgcVar) {
        List<cgc> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("745e6cda", new Object[]{this, cgcVar});
        } else if (cgcVar != null && (list = this.f) != null) {
            list.add(cgcVar);
        }
    }

    @Override // tb.cgc
    public void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b1af1706", new Object[]{this});
            return;
        }
        this.d = p();
        List<cgc> list = this.f;
        if (list != null) {
            Iterator it = ((ArrayList) list).iterator();
            while (it.hasNext()) {
                ((cgc) it.next()).i();
            }
        }
    }

    @Override // tb.cgc
    public void j(IInteractiveProxy.e eVar, INetDataObject iNetDataObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5fb4920b", new Object[]{this, eVar, iNetDataObject});
            return;
        }
        List<cgc> list = this.f;
        if (list != null) {
            Iterator it = ((ArrayList) list).iterator();
            while (it.hasNext()) {
                ((cgc) it.next()).j(eVar, iNetDataObject);
            }
        }
    }

    @Override // tb.cgc
    public void k(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("83ce2e6d", new Object[]{this, new Boolean(z)});
            return;
        }
        this.c = p();
        List<cgc> list = this.f;
        if (list != null) {
            Iterator it = ((ArrayList) list).iterator();
            while (it.hasNext()) {
                ((cgc) it.next()).k(z);
            }
        }
    }

    @Override // tb.cgc
    public void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3205bac", new Object[]{this});
            return;
        }
        List<cgc> list = this.f;
        if (list != null) {
            Iterator it = ((ArrayList) list).iterator();
            while (it.hasNext()) {
                ((cgc) it.next()).l();
            }
        }
    }

    @Override // tb.cgc
    public void m(IInteractiveProxy.e eVar, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e043eb2", new Object[]{this, eVar, map});
            return;
        }
        if (this.e == 0) {
            this.e = p();
            q();
        }
        List<cgc> list = this.f;
        if (list != null) {
            Iterator it = ((ArrayList) list).iterator();
            while (it.hasNext()) {
                ((cgc) it.next()).m(eVar, map);
            }
        }
    }

    @Override // tb.cgc
    public void n(IInteractiveProxy.e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("158d7fdd", new Object[]{this, eVar});
            return;
        }
        List<cgc> list = this.f;
        if (list != null) {
            Iterator it = ((ArrayList) list).iterator();
            while (it.hasNext()) {
                ((cgc) it.next()).n(eVar);
            }
        }
    }

    public void o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        List<cgc> list = this.f;
        if (list != null) {
            list.clear();
            this.f = null;
        }
    }

    public final long p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fff5e63e", new Object[]{this})).longValue();
        }
        return System.currentTimeMillis();
    }

    public final void q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed9aa1dd", new Object[]{this});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("enterRoom", Long.valueOf(this.f22669a));
        hashMap.put("gotLiveDetail", Long.valueOf(this.b));
        hashMap.put("gotComponentList", Long.valueOf(this.c));
        hashMap.put("initWebView", Long.valueOf(this.d));
        hashMap.put("firstInteractComponent", Long.valueOf(this.e));
        this.g.v("TBLiveWVPlugin.Event.performanceInfo", hashMap);
    }
}
