package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.proxy.tbliveinteractive.IInteractiveProxy;
import com.taobao.taolive.sdk.adapter.network.INetDataObject;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public abstract class sxp implements cgc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(295699832);
        t2o.a(806356558);
    }

    @Override // tb.cgc
    public void a(IInteractiveProxy.e eVar, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ebb4a74e", new Object[]{this, eVar, map});
        }
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
        }
    }

    @Override // tb.cgc
    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("40139be7", new Object[]{this});
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
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("185c12c2", new Object[]{this});
        }
    }

    @Override // tb.cgc
    public void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b1af1706", new Object[]{this});
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
    public /* synthetic */ void l() {
    }
}
