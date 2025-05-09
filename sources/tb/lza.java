package tb;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.topmultitab.protocol.IHomeSubTabController;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class lza {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final IHomeSubTabController f23660a;
    public final fdc b;

    static {
        t2o.a(491782813);
    }

    public lza(IHomeSubTabController iHomeSubTabController, fdc fdcVar) {
        this.f23660a = iHomeSubTabController;
        this.b = fdcVar;
    }

    public void A(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a598d3b2", new Object[]{this, new Boolean(z)});
        } else {
            this.b.w(this.f23660a, z);
        }
    }

    public void B(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("14a94ff3", new Object[]{this, map});
        } else {
            this.b.A(this.f23660a, map);
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
            this.b.y(this.f23660a, z);
        }
    }

    public View d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("64e717e3", new Object[]{this, str});
        }
        return this.b.h(str);
    }

    public JSONObject e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("58e5c3fb", new Object[]{this});
        }
        z9c globalExtModel = this.b.getGlobalExtModel();
        if (globalExtModel == null) {
            return null;
        }
        return globalExtModel.e();
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
        return this.b.J(this.f23660a);
    }

    public String h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("22cee907", new Object[]{this});
        }
        return this.b.l();
    }

    public JSONObject i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("9fda5947", new Object[]{this});
        }
        return this.b.x(this.f23660a);
    }

    public Fragment j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Fragment) ipChange.ipc$dispatch("bc1dab59", new Object[]{this});
        }
        return this.b.a();
    }

    public int k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("22c6288c", new Object[]{this})).intValue();
        }
        return this.b.K(this.f23660a);
    }

    public JSONObject l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("3dfc2e7f", new Object[]{this});
        }
        z9c globalExtModel = this.b.getGlobalExtModel();
        if (globalExtModel == null) {
            return null;
        }
        return globalExtModel.d();
    }

    public String m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4ced540f", new Object[]{this});
        }
        return this.b.q();
    }

    public float n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5411de93", new Object[]{this})).floatValue();
        }
        return this.b.D(this.f23660a);
    }

    public Map<String, Integer> o(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("5b799bd5", new Object[]{this, str, str2});
        }
        return this.b.k(str, str2);
    }

    public JSONObject p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("3aab96dd", new Object[]{this});
        }
        return this.b.E(this.f23660a);
    }

    public JSONObject q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("bab9b3d1", new Object[]{this});
        }
        return this.b.G(this.f23660a);
    }

    public boolean r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("11522a16", new Object[]{this})).booleanValue();
        }
        return this.b.isAdaptHudScreen();
    }

    public boolean s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("58c4938", new Object[]{this})).booleanValue();
        }
        return this.b.n();
    }

    public boolean t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56d673fc", new Object[]{this})).booleanValue();
        }
        return this.b.r(this.f23660a);
    }

    public void u(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("45cbb17a", new Object[]{this, new Boolean(z)});
        } else {
            this.b.s(this.f23660a, z);
        }
    }

    public void v(zve zveVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("69759066", new Object[]{this, zveVar});
        } else {
            this.b.g(zveVar);
        }
    }

    public void w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("132b68d5", new Object[]{this});
        } else {
            this.b.u(this.f23660a);
        }
    }

    public void x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("10621d37", new Object[]{this});
        } else {
            this.b.F(this.f23660a);
        }
    }

    public void y(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("93e4afff", new Object[]{this, view});
        } else {
            this.b.H(this.f23660a, view);
        }
    }

    public void z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66b92130", new Object[]{this});
        } else {
            this.b.z(this.f23660a);
        }
    }
}
