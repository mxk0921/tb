package tb;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.infoflow.multitab.protocol.IMultiTabPerformanceListener;
import com.taobao.tao.infoflow.multitab.viewprovider.tablayout.a;
import com.taobao.tao.infoflow.multitab.viewprovider.tablayout.e;
import com.taobao.tao.infoflow.multitab.viewprovider.viewpager.PullRefreshViewPagerProvider;
import com.taobao.tao.infoflow.multitab.viewprovider.viewpager.a;
import com.taobao.tao.topmultitab.protocol.IHomeSubTabController;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class gbj {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public View f19867a;
    public final fdc b;
    public final taj c;
    public JSONObject d;
    public boolean e;
    public final fuq f;
    public final IMultiTabPerformanceListener g;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements a.c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // com.taobao.tao.infoflow.multitab.viewprovider.viewpager.a.c
        public void a(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("720f7bb4", new Object[]{this, new Integer(i)});
                return;
            }
            IHomeSubTabController q = gbj.a(gbj.this).q(i);
            if (q != null) {
                d9j.c("MultiTabViewProvider", "instantiateItem 补偿 onPageSelected: " + i);
                gbj.this.e(q);
                q.onPageSelected();
                gbj.a(gbj.this).J(-1);
            }
        }
    }

    static {
        t2o.a(729809482);
    }

    public gbj(fuq fuqVar, JSONObject jSONObject, fdc fdcVar, IMultiTabPerformanceListener iMultiTabPerformanceListener) {
        this.f = fuqVar;
        this.d = jSONObject;
        this.b = fdcVar;
        this.g = iMultiTabPerformanceListener;
        taj tajVar = new taj();
        this.c = tajVar;
        w(tajVar, fuqVar);
    }

    public static /* synthetic */ fuq a(gbj gbjVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (fuq) ipChange.ipc$dispatch("e6f4b67b", new Object[]{gbjVar});
        }
        return gbjVar.f;
    }

    public void A(a.e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42f917c1", new Object[]{this, eVar});
            return;
        }
        com.taobao.tao.infoflow.multitab.viewprovider.tablayout.a aVar = (com.taobao.tao.infoflow.multitab.viewprovider.tablayout.a) l(com.taobao.tao.infoflow.multitab.viewprovider.tablayout.a.KEY);
        if (aVar != null) {
            aVar.c(eVar);
        }
    }

    public void B(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("706bb7a4", new Object[]{this, new Boolean(z)});
            return;
        }
        com.taobao.tao.infoflow.multitab.viewprovider.viewpager.a aVar = (com.taobao.tao.infoflow.multitab.viewprovider.viewpager.a) l(com.taobao.tao.infoflow.multitab.viewprovider.viewpager.a.KEY);
        if (aVar != null) {
            aVar.setRefreshing(z);
        }
    }

    public void C() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("72d25778", new Object[]{this});
            return;
        }
        e eVar = (e) l(com.taobao.tao.infoflow.multitab.viewprovider.tablayout.a.KEY);
        if (eVar != null) {
            eVar.p0();
        }
    }

    public final void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d508ea7a", new Object[]{this});
            return;
        }
        com.taobao.tao.infoflow.multitab.viewprovider.viewpager.a aVar = (com.taobao.tao.infoflow.multitab.viewprovider.viewpager.a) l(com.taobao.tao.infoflow.multitab.viewprovider.viewpager.a.KEY);
        e eVar = (e) l(com.taobao.tao.infoflow.multitab.viewprovider.tablayout.a.KEY);
        if (aVar != null && eVar != null) {
            aVar.l(eVar);
        }
    }

    public final void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bdd689c5", new Object[]{this});
            return;
        }
        com.taobao.tao.infoflow.multitab.viewprovider.viewpager.a aVar = (com.taobao.tao.infoflow.multitab.viewprovider.viewpager.a) l(com.taobao.tao.infoflow.multitab.viewprovider.viewpager.a.KEY);
        if (aVar != null) {
            aVar.q(new a());
        }
    }

    public void d(a.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1e7906", new Object[]{this, bVar});
            return;
        }
        com.taobao.tao.infoflow.multitab.viewprovider.viewpager.a aVar = (com.taobao.tao.infoflow.multitab.viewprovider.viewpager.a) l(com.taobao.tao.infoflow.multitab.viewprovider.viewpager.a.KEY);
        if (aVar != null) {
            aVar.j(bVar);
        }
    }

    public void e(IHomeSubTabController iHomeSubTabController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("38ee91d5", new Object[]{this, iHomeSubTabController});
            return;
        }
        g(iHomeSubTabController);
        f(iHomeSubTabController);
        q(iHomeSubTabController);
    }

    public final void f(IHomeSubTabController iHomeSubTabController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("897db9d1", new Object[]{this, iHomeSubTabController});
            return;
        }
        boolean isEnablePullReFresh = iHomeSubTabController.isEnablePullReFresh();
        j(isEnablePullReFresh);
        this.b.y(iHomeSubTabController, isEnablePullReFresh);
    }

    public final void g(IHomeSubTabController iHomeSubTabController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1bccfcf", new Object[]{this, iHomeSubTabController});
        } else {
            this.b.B(iHomeSubTabController, iHomeSubTabController.isEnableToSecondFloor());
        }
    }

    public final void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2fbbc970", new Object[]{this});
        } else {
            this.c.a();
        }
    }

    public View i(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("79a2c742", new Object[]{this, context});
        }
        View view = this.f19867a;
        if (view == null) {
            return o(context);
        }
        this.f19867a = null;
        return view;
    }

    public void j(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("388183ba", new Object[]{this, new Boolean(z)});
            return;
        }
        com.taobao.tao.infoflow.multitab.viewprovider.viewpager.a aVar = (com.taobao.tao.infoflow.multitab.viewprovider.viewpager.a) l(com.taobao.tao.infoflow.multitab.viewprovider.viewpager.a.KEY);
        if (aVar != null) {
            aVar.s(z);
        }
    }

    public View k(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("632da627", new Object[]{this, str});
        }
        com.taobao.tao.infoflow.multitab.viewprovider.tablayout.a aVar = (com.taobao.tao.infoflow.multitab.viewprovider.tablayout.a) l(com.taobao.tao.infoflow.multitab.viewprovider.tablayout.a.KEY);
        if (aVar == null) {
            return null;
        }
        return aVar.a(str);
    }

    public final <T extends ywc> T l(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ((ywc) ipChange.ipc$dispatch("3c9deb80", new Object[]{this, str}));
        }
        return (T) this.c.b(str);
    }

    public final Context m(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("ca7802fe", new Object[]{this, context});
        }
        if (!(context instanceof cew)) {
            return context;
        }
        Context a2 = ((cew) context).a();
        if (!vxl.b().z()) {
            if (a2 == null) {
                return context;
            }
        } else if (!(a2 instanceof Activity)) {
            return context;
        }
        return a2;
    }

    public List<JSONObject> n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("b75e68d5", new Object[]{this});
        }
        com.taobao.tao.infoflow.multitab.viewprovider.viewpager.a aVar = (com.taobao.tao.infoflow.multitab.viewprovider.viewpager.a) l(com.taobao.tao.infoflow.multitab.viewprovider.viewpager.a.KEY);
        if (aVar == null) {
            return null;
        }
        return aVar.i();
    }

    public final synchronized View o(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("fe1492ae", new Object[]{this, context});
        }
        LinearLayout linearLayout = new LinearLayout(m(context));
        linearLayout.setOrientation(1);
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        for (Map.Entry<String, ywc> entry : this.c.c().entrySet()) {
            entry.getValue().d(linearLayout);
        }
        b();
        c();
        this.e = true;
        JSONObject jSONObject = this.d;
        if (jSONObject != null) {
            v(jSONObject);
        }
        C();
        return linearLayout;
    }

    public boolean p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("420e5503", new Object[]{this})).booleanValue();
        }
        com.taobao.tao.infoflow.multitab.viewprovider.tablayout.a aVar = (com.taobao.tao.infoflow.multitab.viewprovider.tablayout.a) l(com.taobao.tao.infoflow.multitab.viewprovider.tablayout.a.KEY);
        if (aVar == null || !aVar.e()) {
            return false;
        }
        return true;
    }

    public final void q(IHomeSubTabController iHomeSubTabController) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f5562276", new Object[]{this, iHomeSubTabController});
            return;
        }
        boolean isOnRocketState = iHomeSubTabController.isOnRocketState();
        fdc fdcVar = this.b;
        if (isOnRocketState) {
            str = "rocket";
        } else {
            str = kis.TAO;
        }
        fdcVar.I(iHomeSubTabController, str);
    }

    public void r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        for (Map.Entry<String, ywc> entry : this.c.c().entrySet()) {
            entry.getValue().onDestroy();
        }
        h();
    }

    public void s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6fe0f9c2", new Object[]{this});
            return;
        }
        com.taobao.tao.infoflow.multitab.viewprovider.tablayout.a aVar = (com.taobao.tao.infoflow.multitab.viewprovider.tablayout.a) l(com.taobao.tao.infoflow.multitab.viewprovider.tablayout.a.KEY);
        if (aVar != null) {
            aVar.o();
        }
    }

    public synchronized View t(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("7349eddf", new Object[]{this, context});
        }
        if (this.f19867a == null) {
            this.f19867a = o(context);
        }
        return this.f19867a;
    }

    public void u(int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2cae5029", new Object[]{this, new Integer(i), new Boolean(z)});
            return;
        }
        com.taobao.tao.infoflow.multitab.viewprovider.viewpager.a aVar = (com.taobao.tao.infoflow.multitab.viewprovider.viewpager.a) l(com.taobao.tao.infoflow.multitab.viewprovider.viewpager.a.KEY);
        if (aVar != null) {
            aVar.n(i, z);
        }
    }

    public synchronized void v(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ef27accf", new Object[]{this, jSONObject});
        } else if (!this.e) {
            this.d = jSONObject;
        } else {
            List<JSONObject> x = vaj.x(jSONObject);
            for (Map.Entry<String, ywc> entry : this.c.c().entrySet()) {
                entry.getValue().r(jSONObject, x, true);
            }
        }
    }

    public final void w(taj tajVar, fuq fuqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("30be97c3", new Object[]{this, tajVar, fuqVar});
            return;
        }
        tajVar.d(com.taobao.tao.infoflow.multitab.viewprovider.viewpager.a.KEY, new PullRefreshViewPagerProvider(fuqVar, this.g));
        tajVar.d(com.taobao.tao.infoflow.multitab.viewprovider.tablayout.a.KEY, new e(tajVar, fuqVar, this.g));
    }

    public void x(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fbe4a160", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        com.taobao.tao.infoflow.multitab.viewprovider.tablayout.a aVar = (com.taobao.tao.infoflow.multitab.viewprovider.tablayout.a) l(com.taobao.tao.infoflow.multitab.viewprovider.tablayout.a.KEY);
        if (aVar != null) {
            aVar.p(i, i2);
        }
    }

    public void y(String str, a.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7bc4e24a", new Object[]{this, str, bVar});
            return;
        }
        com.taobao.tao.infoflow.multitab.viewprovider.tablayout.a aVar = (com.taobao.tao.infoflow.multitab.viewprovider.tablayout.a) l(com.taobao.tao.infoflow.multitab.viewprovider.tablayout.a.KEY);
        if (aVar != null) {
            aVar.g(str, bVar);
        }
    }

    public void z(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e33080d1", new Object[]{this, str});
            return;
        }
        com.taobao.tao.infoflow.multitab.viewprovider.tablayout.a aVar = (com.taobao.tao.infoflow.multitab.viewprovider.tablayout.a) l(com.taobao.tao.infoflow.multitab.viewprovider.tablayout.a.KEY);
        if (aVar != null) {
            aVar.h(str);
        }
    }
}
