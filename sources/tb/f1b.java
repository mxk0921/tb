package tb;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.topmultitab.protocol.IHomeSubTabController;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class f1b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final IHomeSubTabController f18936a;
    public final fdc b;

    static {
        t2o.a(729809597);
    }

    public f1b(IHomeSubTabController iHomeSubTabController, fdc fdcVar) {
        this.f18936a = iHomeSubTabController;
        this.b = fdcVar;
    }

    public void A() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("132b68d5", new Object[]{this});
        } else {
            this.b.u(this.f18936a);
        }
    }

    public void B() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("10621d37", new Object[]{this});
        } else {
            this.b.F(this.f18936a);
        }
    }

    public void C(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("739411e1", new Object[]{this, jSONObject});
        } else {
            this.b.t(this.f18936a, jSONObject);
        }
    }

    public void D(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae059bdf", new Object[]{this, view});
        } else {
            this.b.H(this.f18936a, view);
        }
    }

    public void E() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66b92130", new Object[]{this});
        } else {
            this.b.z(this.f18936a);
        }
    }

    public void F(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a598d3b2", new Object[]{this, new Boolean(z)});
        } else {
            this.b.w(this.f18936a, z);
        }
    }

    public void G(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("78b836da", new Object[]{this, str});
        } else {
            this.b.I(this.f18936a, str);
        }
    }

    public void H(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("14a94ff3", new Object[]{this, map});
        } else {
            this.b.A(this.f18936a, map);
        }
    }

    public void I(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e373f147", new Object[]{this, str});
        } else {
            this.b.L(this.f18936a, str);
        }
    }

    public boolean a(View view, ViewGroup.LayoutParams layoutParams) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("50f5465e", new Object[]{this, view, layoutParams})).booleanValue();
        }
        return this.b.j(view, layoutParams);
    }

    public boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1b9831f6", new Object[]{this})).booleanValue();
        }
        return this.b.m();
    }

    public void c(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("af535fda", new Object[]{this, new Boolean(z)});
        } else {
            this.b.y(this.f18936a, z);
        }
    }

    public void d(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a64165d8", new Object[]{this, new Boolean(z)});
        } else {
            this.b.B(this.f18936a, z);
        }
    }

    public View e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("64e717e3", new Object[]{this, str});
        }
        return this.b.h(str);
    }

    public Context f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("c69c0cdc", new Object[]{this});
        }
        return this.b.f();
    }

    public int g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8428fa22", new Object[]{this})).intValue();
        }
        return this.b.J(this.f18936a);
    }

    public String h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f716939", new Object[]{this});
        }
        return this.b.e();
    }

    public String i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("22cee907", new Object[]{this});
        }
        return this.b.l();
    }

    public JSONObject j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("9fda5947", new Object[]{this});
        }
        return this.b.x(this.f18936a);
    }

    public z9c k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (z9c) ipChange.ipc$dispatch("532d2c9e", new Object[]{this});
        }
        return this.b.getGlobalExtModel();
    }

    public Fragment l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Fragment) ipChange.ipc$dispatch("bc1dab59", new Object[]{this});
        }
        return this.b.a();
    }

    public int m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("22c6288c", new Object[]{this})).intValue();
        }
        return this.b.K(this.f18936a);
    }

    public String n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4ced540f", new Object[]{this});
        }
        return this.b.q();
    }

    public float o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5411de93", new Object[]{this})).floatValue();
        }
        return this.b.D(this.f18936a);
    }

    public Map<String, Integer> p(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("5b799bd5", new Object[]{this, str, str2});
        }
        return this.b.k(str, str2);
    }

    public JSONObject q(IHomeSubTabController iHomeSubTabController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("a39b1c41", new Object[]{this, iHomeSubTabController});
        }
        return this.b.v(this.f18936a);
    }

    public JSONObject r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("3aab96dd", new Object[]{this});
        }
        return this.b.E(this.f18936a);
    }

    public JSONObject s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("bab9b3d1", new Object[]{this});
        }
        return this.b.G(this.f18936a);
    }

    public int t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e67f5875", new Object[]{this})).intValue();
        }
        return this.b.d();
    }

    public List<String> u(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("57fb0188", new Object[]{this, str});
        }
        return this.b.C(str);
    }

    public boolean v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("11522a16", new Object[]{this})).booleanValue();
        }
        return this.b.isAdaptHudScreen();
    }

    public boolean w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("58c4938", new Object[]{this})).booleanValue();
        }
        return this.b.n();
    }

    public boolean x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56d673fc", new Object[]{this})).booleanValue();
        }
        return this.b.r(this.f18936a);
    }

    public void y(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("45cbb17a", new Object[]{this, new Boolean(z)});
        } else {
            this.b.s(this.f18936a, z);
        }
    }

    public void z(zve zveVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("69759066", new Object[]{this, zveVar});
        } else {
            this.b.g(zveVar);
        }
    }
}
