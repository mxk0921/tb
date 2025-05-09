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
import tb.e2s;
import tb.lm0;

/* compiled from: Taobao */
@AURAExtensionImpl(code = "alibuy.impl.lifecycle.dxEngine.config")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class wm0 implements dbb {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int KEY_MODULE_CODE = 88;

    /* renamed from: a  reason: collision with root package name */
    public lo f30773a;
    public lm0 b;
    public e2s.a c;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a implements lm0.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ s f30774a;

        public a(wm0 wm0Var, s sVar) {
            this.f30774a = sVar;
        }

        public boolean a(long j, evb evbVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("7a2c3e9a", new Object[]{this, new Long(j), evbVar})).booleanValue();
            }
            return this.f30774a.r(j, evbVar);
        }

        public boolean b(long j, qub qubVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("31e964d3", new Object[]{this, new Long(j), qubVar})).booleanValue();
            }
            return this.f30774a.u(j, qubVar);
        }
    }

    static {
        t2o.a(301989965);
        t2o.a(81788962);
    }

    public final void B(s sVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a251611", new Object[]{this, sVar});
            return;
        }
        e2s e2sVar = new e2s(this.f30773a.f());
        e2sVar.c(x());
        sVar.r(b2s.PARSER_ID, new b2s(e2sVar));
        sVar.r(jm0.PARSER_ID, new jm0());
    }

    @Override // tb.dbb
    public void O(s sVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d731be67", new Object[]{this, sVar});
            return;
        }
        im0.c(sVar);
        im0.b(sVar);
        im0.a(sVar);
        B(sVar);
        sVar.k().T0(new nm0());
        Context f = this.f30773a.f();
        if (f instanceof Activity) {
            sVar.k().l1((Activity) this.f30773a.f());
        } else if (th.c()) {
            Toast.makeText(f, "AURAInstance 需要传入Activity", 1).show();
        }
        lm0 lm0Var = this.b;
        if (lm0Var != null) {
            lm0Var.b(new a(this, sVar));
        }
    }

    @Override // tb.dbb
    public DXEngineConfig getConfig() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXEngineConfig) ipChange.ipc$dispatch("2f487a5b", new Object[]{this});
        }
        String d = this.f30773a.d();
        DXEngineConfig.b X = new DXEngineConfig.b(d).Q(2).Y(d).X(88);
        if (r()) {
            X.H(true, true);
        }
        return X.F();
    }

    @Override // tb.ybb
    public void onCreate(lo loVar, yi yiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe8206ca", new Object[]{this, loVar, yiVar});
        } else {
            this.f30773a = loVar;
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
        return ((Boolean) fk.b(this.f30773a.i(), "autoSize", Boolean.class, Boolean.FALSE)).booleanValue();
    }

    public final e2s.a x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (e2s.a) ipChange.ipc$dispatch("ee1be7dd", new Object[]{this});
        }
        if (this.b == null) {
            lm0 lm0Var = (lm0) this.f30773a.g("aliBuyDXConfig", lm0.class);
            this.b = lm0Var;
            if (lm0Var != null) {
                this.c = lm0Var.a();
            }
        }
        return this.c;
    }
}
