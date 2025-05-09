package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.movehighlight.controller.TaoliveHighlightController;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class dxa {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static dxa j;

    /* renamed from: a  reason: collision with root package name */
    public z6m f18131a;
    public njb b;
    public m0e c;
    public p0e d;
    public TaoliveHighlightController.c e;
    public iyc f;
    public bxa g;
    public ykc h;
    public JSONObject i;

    static {
        t2o.a(779092497);
    }

    public static dxa b(ux9 ux9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (dxa) ipChange.ipc$dispatch("8f9278a8", new Object[]{ux9Var});
        }
        if (owa.b(ux9Var)) {
            return owa.a(ux9Var).b();
        }
        HashMap hashMap = new HashMap();
        if (ux9Var != null) {
            hashMap.put("frameContext", String.valueOf(ux9Var.hashCode()));
        }
        sbu.i(ux9Var, 19999, "highlight_local_adapter_refactor", hashMap);
        return e();
    }

    public static dxa e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (dxa) ipChange.ipc$dispatch("ab9bdafb", new Object[0]);
        }
        if (j == null) {
            synchronized (dxa.class) {
                try {
                    if (j == null) {
                        j = new dxa();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return j;
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed57a11f", new Object[]{this});
            return;
        }
        q(null);
        t(null);
        u(null);
        r(null);
        n(null);
        p(null);
        s(null);
        o(null);
    }

    public JSONObject c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("b378f56a", new Object[]{this});
        }
        return this.i;
    }

    public TaoliveHighlightController.c d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TaoliveHighlightController.c) ipChange.ipc$dispatch("7382699a", new Object[]{this});
        }
        return this.e;
    }

    public ykc f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ykc) ipChange.ipc$dispatch("5841b61f", new Object[]{this});
        }
        return this.h;
    }

    public iyc g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (iyc) ipChange.ipc$dispatch("9b79db4b", new Object[]{this});
        }
        return this.f;
    }

    public z6m h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (z6m) ipChange.ipc$dispatch("fa5f8d1f", new Object[]{this});
        }
        return this.f18131a;
    }

    public p0e i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (p0e) ipChange.ipc$dispatch("a06ddbca", new Object[]{this});
        }
        return this.d;
    }

    public bxa j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (bxa) ipChange.ipc$dispatch("4fbd498f", new Object[]{this});
        }
        return this.g;
    }

    public njb k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (njb) ipChange.ipc$dispatch("1291e14a", new Object[]{this});
        }
        return this.b;
    }

    public m0e l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (m0e) ipChange.ipc$dispatch("988c53b7", new Object[]{this});
        }
        return this.c;
    }

    public void m(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e342d2f2", new Object[]{this, jSONObject});
        } else {
            this.i = jSONObject;
        }
    }

    public void n(TaoliveHighlightController.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b9090ec", new Object[]{this, cVar});
        } else {
            this.e = cVar;
        }
    }

    public void o(ykc ykcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6aa6c87", new Object[]{this, ykcVar});
        } else {
            this.h = ykcVar;
        }
    }

    public void p(iyc iycVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("95a53155", new Object[]{this, iycVar});
        } else {
            this.f = iycVar;
        }
    }

    public void q(z6m z6mVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("19a549e9", new Object[]{this, z6mVar});
        } else {
            this.f18131a = z6mVar;
        }
    }

    public void r(p0e p0eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a34b5274", new Object[]{this, p0eVar});
        } else {
            this.d = p0eVar;
        }
    }

    public void s(bxa bxaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc1e7a9b", new Object[]{this, bxaVar});
        } else {
            this.g = bxaVar;
        }
    }

    public void t(njb njbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("930bb6f0", new Object[]{this, njbVar});
        } else {
            this.b = njbVar;
        }
    }

    public void u(m0e m0eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("294c9dcb", new Object[]{this, m0eVar});
        } else {
            this.c = m0eVar;
        }
    }
}
