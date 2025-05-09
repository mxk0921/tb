package tb;

import android.app.Activity;
import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.proxy.tbliveinteractive.IInteractiveProxy;
import com.taobao.taolive.sdk.adapter.network.INetDataObject;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class lhf implements cgc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final String f23341a;
    public final Context b;
    public final bxl c;
    public final ux9 d;

    static {
        t2o.a(779092968);
        t2o.a(806356558);
    }

    public lhf(String str, Context context, ux9 ux9Var, bxl bxlVar) {
        this.b = context;
        this.f23341a = str;
        this.d = ux9Var;
        this.c = bxlVar;
    }

    @Override // tb.cgc
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dec5108c", new Object[]{this});
        }
    }

    @Override // tb.cgc
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9264a7ae", new Object[]{this});
        } else {
            sj9.q(this.d);
        }
    }

    @Override // tb.cgc
    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("40139be7", new Object[]{this});
            return;
        }
        bxl bxlVar = this.c;
        if (bxlVar != null) {
            bxlVar.e(this.f23341a);
        }
    }

    @Override // tb.cgc
    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a31779c", new Object[]{this});
        }
    }

    @Override // tb.cgc
    public void g() {
        bxl bxlVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("185c12c2", new Object[]{this});
            return;
        }
        rc.b((Activity) this.b, "h5_live_start_load_url");
        sj9.p(this.d);
        if (pvs.t0() && (bxlVar = this.c) != null) {
            bxlVar.a("kH5UrlStartLoad", String.valueOf(System.currentTimeMillis()));
        }
    }

    @Override // tb.cgc
    public void i() {
        bxl bxlVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b1af1706", new Object[]{this});
            return;
        }
        sj9.o(this.d);
        if (pvs.t0() && (bxlVar = this.c) != null) {
            bxlVar.a("kH5ontainerInitFinish", String.valueOf(System.currentTimeMillis()));
        }
    }

    @Override // tb.cgc
    public void j(IInteractiveProxy.e eVar, INetDataObject iNetDataObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5fb4920b", new Object[]{this, eVar, iNetDataObject});
        }
    }

    @Override // tb.cgc
    public void k(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("83ce2e6d", new Object[]{this, new Boolean(z)});
        } else {
            sj9.b(this.d);
        }
    }

    @Override // tb.cgc
    public void l() {
        bxl bxlVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3205bac", new Object[]{this});
        } else if (pvs.t0() && (bxlVar = this.c) != null) {
            bxlVar.a("kH5ontainerInitBegin", String.valueOf(System.currentTimeMillis()));
        }
    }

    @Override // tb.cgc
    public void m(IInteractiveProxy.e eVar, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e043eb2", new Object[]{this, eVar, map});
            return;
        }
        try {
            if (this.c != null) {
                this.c.f(this.f23341a, map.get("name"), map.containsKey("time") ? Long.parseLong(map.get("time")) : 0L);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // tb.cgc
    public void n(IInteractiveProxy.e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("158d7fdd", new Object[]{this, eVar});
        }
    }

    @Override // tb.cgc
    public void a(IInteractiveProxy.e eVar, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ebb4a74e", new Object[]{this, eVar, map});
            return;
        }
        try {
            if (this.c != null) {
                this.c.g(this.f23341a, map.get("name"), map.containsKey("index") ? yqq.o(map.get("index")) : -1, map.containsKey("isEnableMultiBatchRender") && yqq.i(map.get("isEnableMultiBatchRender"), false), map.get("priority"));
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}
