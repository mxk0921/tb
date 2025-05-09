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
public abstract class g20 implements fdc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final f1b f19689a;
    public final txd b;

    static {
        t2o.a(729809595);
        t2o.a(729810132);
    }

    public g20(txd txdVar, f1b f1bVar) {
        this.f19689a = f1bVar;
        this.b = txdVar;
    }

    @Override // tb.fdc
    public void A(IHomeSubTabController iHomeSubTabController, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5aa07856", new Object[]{this, iHomeSubTabController, map});
            return;
        }
        StringBuilder sb = new StringBuilder("updatePageProperties self : ");
        sb.append(iHomeSubTabController == null ? null : iHomeSubTabController.getClass().getSimpleName());
        sb.append(", aProperties : ");
        sb.append(map);
        fve.e("AbstractMainLandInfoFlowCallBack", sb.toString());
        if (!b(iHomeSubTabController)) {
            this.f19689a.H(map);
        }
    }

    @Override // tb.fdc
    public void B(IHomeSubTabController iHomeSubTabController, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("62f3fe73", new Object[]{this, iHomeSubTabController, new Boolean(z)});
            return;
        }
        StringBuilder sb = new StringBuilder("setSecondFloorEnable self : ");
        sb.append(iHomeSubTabController == null ? null : iHomeSubTabController.getClass().getSimpleName());
        sb.append(", isEnable : ");
        sb.append(z);
        fve.e("AbstractMainLandInfoFlowCallBack", sb.toString());
        if (!b(iHomeSubTabController)) {
            this.f19689a.d(z);
        }
    }

    @Override // tb.fdc
    public List<String> C(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("57fb0188", new Object[]{this, str});
        }
        return this.f19689a.u(str);
    }

    @Override // tb.fdc
    public float D(IHomeSubTabController iHomeSubTabController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f078534e", new Object[]{this, iHomeSubTabController})).floatValue();
        }
        return this.f19689a.o();
    }

    @Override // tb.fdc
    public JSONObject E(IHomeSubTabController iHomeSubTabController) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("cf42b524", new Object[]{this, iHomeSubTabController});
        }
        StringBuilder sb = new StringBuilder("getSubContainerParam self : ");
        if (iHomeSubTabController == null) {
            str = null;
        } else {
            str = iHomeSubTabController.getClass().getSimpleName();
        }
        sb.append(str);
        fve.e("AbstractMainLandInfoFlowCallBack", sb.toString());
        if (b(iHomeSubTabController)) {
            return null;
        }
        return this.f19689a.r();
    }

    @Override // tb.fdc
    public void F(IHomeSubTabController iHomeSubTabController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a79ae84a", new Object[]{this, iHomeSubTabController});
        } else {
            this.f19689a.B();
        }
    }

    @Override // tb.fdc
    public JSONObject G(IHomeSubTabController iHomeSubTabController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("9450efb0", new Object[]{this, iHomeSubTabController});
        }
        return this.f19689a.s();
    }

    @Override // tb.fdc
    public void H(IHomeSubTabController iHomeSubTabController, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a2276024", new Object[]{this, iHomeSubTabController, view});
            return;
        }
        StringBuilder sb = new StringBuilder("setBgView self : ");
        sb.append(iHomeSubTabController == null ? null : iHomeSubTabController.getClass().getSimpleName());
        fve.e("AbstractMainLandInfoFlowCallBack", sb.toString());
        this.f19689a.D(view);
    }

    @Override // tb.fdc
    public void I(IHomeSubTabController iHomeSubTabController, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e70e505b", new Object[]{this, iHomeSubTabController, str});
            return;
        }
        StringBuilder sb = new StringBuilder("setTabBarActionButtonState self : ");
        sb.append(iHomeSubTabController == null ? null : iHomeSubTabController.getClass().getSimpleName());
        sb.append(", tabBarShowState : ");
        sb.append(str);
        fve.e("AbstractMainLandInfoFlowCallBack", sb.toString());
        if (!b(iHomeSubTabController)) {
            this.f19689a.G(str);
        }
    }

    @Override // tb.fdc
    public int J(IHomeSubTabController iHomeSubTabController) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b6879045", new Object[]{this, iHomeSubTabController})).intValue();
        }
        StringBuilder sb = new StringBuilder("getCurrentBgViewId self : ");
        if (iHomeSubTabController == null) {
            str = null;
        } else {
            str = iHomeSubTabController.getClass().getSimpleName();
        }
        sb.append(str);
        fve.e("AbstractMainLandInfoFlowCallBack", sb.toString());
        return this.f19689a.g();
    }

    @Override // tb.fdc
    public int K(IHomeSubTabController iHomeSubTabController) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3de7d79b", new Object[]{this, iHomeSubTabController})).intValue();
        }
        StringBuilder sb = new StringBuilder("getPullDownDistance self : ");
        if (iHomeSubTabController == null) {
            str = null;
        } else {
            str = iHomeSubTabController.getClass().getSimpleName();
        }
        sb.append(str);
        fve.e("AbstractMainLandInfoFlowCallBack", sb.toString());
        if (b(iHomeSubTabController)) {
            return 0;
        }
        return this.f19689a.m();
    }

    @Override // tb.fdc
    public void L(IHomeSubTabController iHomeSubTabController, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1cd3edce", new Object[]{this, iHomeSubTabController, str});
            return;
        }
        StringBuilder sb = new StringBuilder("updatePageUtparam self : ");
        sb.append(iHomeSubTabController == null ? null : iHomeSubTabController.getClass().getSimpleName());
        sb.append(", aPageUtparam : ");
        sb.append(str);
        fve.e("AbstractMainLandInfoFlowCallBack", sb.toString());
        if (!b(iHomeSubTabController)) {
            this.f19689a.I(str);
        }
    }

    @Override // tb.fdc
    public Fragment a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Fragment) ipChange.ipc$dispatch("bc1dab59", new Object[]{this});
        }
        return this.f19689a.l();
    }

    @Override // tb.fdc
    public int d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e67f5875", new Object[]{this})).intValue();
        }
        return this.f19689a.t();
    }

    @Override // tb.fdc
    public String e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f716939", new Object[]{this});
        }
        return this.f19689a.h();
    }

    @Override // tb.fdc
    public Context f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("c69c0cdc", new Object[]{this});
        }
        return this.f19689a.f();
    }

    @Override // tb.fdc
    public void g(zve zveVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("69759066", new Object[]{this, zveVar});
        } else {
            this.f19689a.z(zveVar);
        }
    }

    @Override // tb.fdc
    public z9c getGlobalExtModel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (z9c) ipChange.ipc$dispatch("532d2c9e", new Object[]{this});
        }
        return this.f19689a.k();
    }

    @Override // tb.fdc
    public View h(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("64e717e3", new Object[]{this, str});
        }
        return this.f19689a.e(str);
    }

    @Override // tb.fdc
    public boolean isAdaptHudScreen() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("11522a16", new Object[]{this})).booleanValue();
        }
        return this.f19689a.v();
    }

    @Override // tb.fdc
    public boolean j(View view, ViewGroup.LayoutParams layoutParams) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("50f5465e", new Object[]{this, view, layoutParams})).booleanValue();
        }
        return this.f19689a.a(view, layoutParams);
    }

    @Override // tb.fdc
    public Map<String, Integer> k(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("5b799bd5", new Object[]{this, str, str2});
        }
        return this.f19689a.p(str, str2);
    }

    @Override // tb.fdc
    public String l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("22cee907", new Object[]{this});
        }
        return this.f19689a.i();
    }

    @Override // tb.fdc
    public boolean m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1b9831f6", new Object[]{this})).booleanValue();
        }
        return this.f19689a.b();
    }

    @Override // tb.fdc
    public boolean n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("58c4938", new Object[]{this})).booleanValue();
        }
        return this.f19689a.w();
    }

    @Override // tb.fdc
    public String q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4ced540f", new Object[]{this});
        }
        return this.f19689a.n();
    }

    @Override // tb.fdc
    public boolean r(IHomeSubTabController iHomeSubTabController) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("97d524ed", new Object[]{this, iHomeSubTabController})).booleanValue();
        }
        StringBuilder sb = new StringBuilder("isRefreshing self : ");
        if (iHomeSubTabController == null) {
            str = null;
        } else {
            str = iHomeSubTabController.getClass().getSimpleName();
        }
        sb.append(str);
        fve.e("AbstractMainLandInfoFlowCallBack", sb.toString());
        if (b(iHomeSubTabController)) {
            return false;
        }
        return this.f19689a.x();
    }

    @Override // tb.fdc
    public void s(IHomeSubTabController iHomeSubTabController, boolean z) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2620dcad", new Object[]{this, iHomeSubTabController, new Boolean(z)});
            return;
        }
        StringBuilder sb = new StringBuilder("onReachTopChanged self : ");
        if (iHomeSubTabController == null) {
            str = null;
        } else {
            str = iHomeSubTabController.getClass().getSimpleName();
        }
        sb.append(str);
        sb.append(", isReachTop : ");
        sb.append(z);
        fve.e("AbstractMainLandInfoFlowCallBack", sb.toString());
        if (!b(iHomeSubTabController)) {
            this.f19689a.y(z);
        }
    }

    @Override // tb.fdc
    public void t(IHomeSubTabController iHomeSubTabController, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a20659e", new Object[]{this, iHomeSubTabController, jSONObject});
            return;
        }
        StringBuilder sb = new StringBuilder("refreshSearchBox self : ");
        sb.append(iHomeSubTabController == null ? null : iHomeSubTabController.getClass().getSimpleName());
        fve.e("AbstractMainLandInfoFlowCallBack", sb.toString());
        if (!b(iHomeSubTabController)) {
            this.f19689a.C(jSONObject);
        }
    }

    @Override // tb.fdc
    public void u(IHomeSubTabController iHomeSubTabController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e61e41ec", new Object[]{this, iHomeSubTabController});
            return;
        }
        StringBuilder sb = new StringBuilder("refreshFinish self : ");
        sb.append(iHomeSubTabController == null ? null : iHomeSubTabController.getClass().getSimpleName());
        fve.e("AbstractMainLandInfoFlowCallBack", sb.toString());
        if (!b(iHomeSubTabController)) {
            this.f19689a.A();
        }
    }

    @Override // tb.fdc
    public JSONObject v(IHomeSubTabController iHomeSubTabController) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("a39b1c41", new Object[]{this, iHomeSubTabController});
        }
        StringBuilder sb = new StringBuilder("getSelfTabInformation self : ");
        if (iHomeSubTabController == null) {
            str = null;
        } else {
            str = iHomeSubTabController.getClass().getSimpleName();
        }
        sb.append(str);
        fve.e("AbstractMainLandInfoFlowCallBack", sb.toString());
        return this.f19689a.q(iHomeSubTabController);
    }

    @Override // tb.fdc
    public void w(IHomeSubTabController iHomeSubTabController, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("140af775", new Object[]{this, iHomeSubTabController, new Boolean(z)});
            return;
        }
        StringBuilder sb = new StringBuilder("setTabBarActionButtonState self : ");
        sb.append(iHomeSubTabController == null ? null : iHomeSubTabController.getClass().getSimpleName());
        sb.append(", isRocket : ");
        sb.append(z);
        fve.e("AbstractMainLandInfoFlowCallBack", sb.toString());
        if (!b(iHomeSubTabController)) {
            this.f19689a.F(z);
        }
    }

    @Override // tb.fdc
    public JSONObject x(IHomeSubTabController iHomeSubTabController) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("3304e87a", new Object[]{this, iHomeSubTabController});
        }
        StringBuilder sb = new StringBuilder("getGlobalBgConfig self : ");
        if (iHomeSubTabController == null) {
            str = null;
        } else {
            str = iHomeSubTabController.getClass().getSimpleName();
        }
        sb.append(str);
        fve.e("AbstractMainLandInfoFlowCallBack", sb.toString());
        return this.f19689a.j();
    }

    @Override // tb.fdc
    public void y(IHomeSubTabController iHomeSubTabController, boolean z) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("31e0b24d", new Object[]{this, iHomeSubTabController, new Boolean(z)});
            return;
        }
        StringBuilder sb = new StringBuilder("enablePullReFresh self : ");
        if (iHomeSubTabController == null) {
            str = null;
        } else {
            str = iHomeSubTabController.getClass().getSimpleName();
        }
        sb.append(str);
        sb.append(", isEnable : ");
        sb.append(z);
        fve.e("AbstractMainLandInfoFlowCallBack", sb.toString());
        if (!b(iHomeSubTabController)) {
            this.f19689a.c(z);
        }
    }

    @Override // tb.fdc
    public void z(IHomeSubTabController iHomeSubTabController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("93f6d4b1", new Object[]{this, iHomeSubTabController});
            return;
        }
        StringBuilder sb = new StringBuilder("setRefreshing self : ");
        sb.append(iHomeSubTabController == null ? null : iHomeSubTabController.getClass().getSimpleName());
        fve.e("AbstractMainLandInfoFlowCallBack", sb.toString());
        if (!b(iHomeSubTabController)) {
            this.f19689a.E();
        }
    }

    public boolean b(IHomeSubTabController iHomeSubTabController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d5af4b4", new Object[]{this, iHomeSubTabController})).booleanValue();
        }
        IHomeSubTabController a2 = this.b.a();
        fve.e("AbstractMainLandInfoFlowCallBack", "currentTabController:" + a2 + "当前传进来的值是:" + iHomeSubTabController);
        return (iHomeSubTabController == a2 || a2 == null) ? false : true;
    }
}
