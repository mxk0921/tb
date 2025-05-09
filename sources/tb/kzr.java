package tb;

import android.app.Activity;
import android.content.Context;
import android.widget.Toast;
import com.alibaba.android.aura.AURAFlowData;
import com.alibaba.android.aura.AURAGlobalData;
import com.alibaba.android.aura.annotation.AURAExtensionImpl;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXEngineConfig;
import com.taobao.android.dinamicx.s;
import tb.a2s;
import tb.g2s;

/* compiled from: Taobao */
@AURAExtensionImpl(code = "tbwaitpay.impl.lifecycle.dxEngine.config")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class kzr implements dbb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public lo f23028a;

    static {
        t2o.a(725614621);
        t2o.a(81788962);
    }

    public final void B(s sVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a251611", new Object[]{this, sVar});
            return;
        }
        e2s e2sVar = new e2s(this.f23028a.f());
        e2sVar.c(new d2s());
        sVar.r(b2s.PARSER_ID, new b2s(e2sVar));
        sVar.r(x7r.DX_PARSER_ID, new x7r());
        sVar.s(-489609274268614298L, new tm0());
    }

    public final void J0(s sVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e5c3f22c", new Object[]{this, sVar});
            return;
        }
        sVar.u(a2s.DX_WIDGET_ID, new a2s.b());
        sVar.u(g2s.DX_WIDGET_ID, new g2s.a());
        sVar.u(w9r.ID, new w9r());
    }

    public final void L(s sVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c8b3976f", new Object[]{this, sVar});
            return;
        }
        sVar.k().v().j("-8184561642900287420", as0.class, "validatesData");
        sVar.k().v().j("3653929102547346655", wr0.class, "sequenceData");
    }

    @Override // tb.dbb
    public void O(s sVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d731be67", new Object[]{this, sVar});
            return;
        }
        B(sVar);
        J0(sVar);
        m0(sVar);
        L(sVar);
        sVar.k().T0(new nm0());
        Context f = this.f23028a.f();
        if (f instanceof Activity) {
            sVar.k().l1((Activity) this.f23028a.f());
        } else if (th.c()) {
            Toast.makeText(f, "AURAInstance 需要传入Activity", 1).show();
        }
    }

    @Override // tb.dbb
    public DXEngineConfig getConfig() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXEngineConfig) ipChange.ipc$dispatch("2f487a5b", new Object[]{this});
        }
        String d = this.f23028a.d();
        DXEngineConfig.b X = new DXEngineConfig.b(x(d)).Q(2).Y(d).X(188);
        if (r()) {
            X.H(true, true);
        }
        return X.F();
    }

    public final void m0(s sVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e90a378", new Object[]{this, sVar});
        } else {
            sVar.s(1544903441687469454L, new ph());
        }
    }

    @Override // tb.ybb
    public void onCreate(lo loVar, yi yiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe8206ca", new Object[]{this, loVar, yiVar});
        } else {
            this.f23028a = loVar;
        }
    }

    @Override // tb.lbb
    public void onDataChanged(AURAFlowData aURAFlowData, AURAGlobalData aURAGlobalData, hbb hbbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bab53acc", new Object[]{this, aURAFlowData, aURAGlobalData, hbbVar});
        }
    }

    @Override // tb.ybb
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
        }
    }

    public final boolean r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a9e9ebfe", new Object[]{this})).booleanValue();
        }
        return ((Boolean) fk.b(this.f23028a.i(), "autoSize", Boolean.class, Boolean.FALSE)).booleanValue();
    }

    public final String x(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4d9cdc0a", new Object[]{this, str});
        }
        if ("tbwaitpay".equalsIgnoreCase(str)) {
            return "purchase";
        }
        return "tbwaitpayfloat".equalsIgnoreCase(str) ? "confirmOrder" : str;
    }
}
