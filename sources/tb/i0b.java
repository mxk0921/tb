package tb;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.subservice.biz.IPopViewService;
import com.taobao.tao.Globals;
import java.util.Map;
import tb.dve;
import tb.xue;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class i0b extends nv {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public xue b;
    public n2c c;
    public e6d d;
    public xxd e;
    public kgb f;
    public ejb g;
    public hed h;
    public vkd i;
    public e8e j;
    public dzc k;
    public oqb l;
    public cac m;
    public u7d n;
    public m4d o;
    public final fdc p;
    public final String q;
    public View r;
    public sad t;
    public Context v;

    /* renamed from: a  reason: collision with root package name */
    public final g1b f21012a = new g1b();
    public boolean s = false;
    public boolean u = true;

    static {
        t2o.a(729809604);
    }

    public i0b(fdc fdcVar, String str) {
        super(fdcVar);
        fve.e("HomeInfoFlowController", "new HomeInfoFlowController");
        this.p = fdcVar;
        this.q = str;
        c(str, fdcVar);
    }

    public static /* synthetic */ Object ipc$super(i0b i0bVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == 1257714799) {
            super.onActivityResult(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), (Intent) objArr[2]);
            return null;
        } else if (hashCode == 2136867569) {
            return new Boolean(super.isAllowProcessPageBack());
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/tao/infoflow/scene/homemainland/controller/HomeInfoFlowController");
        }
    }

    public final void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("82caebb8", new Object[]{this});
        } else if (h2b.a().c() == null) {
        } else {
            if (!this.u) {
                wyh.a("Page_Home", null, this, new String[0]);
            } else {
                this.u = false;
            }
        }
    }

    @Override // tb.nv, com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public void addPopMessageListenerByMain(IPopViewService.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f869e2b9", new Object[]{this, aVar});
            return;
        }
        sad sadVar = this.t;
        if (sadVar != null) {
            sadVar.addPopMessageListenerByMain(aVar);
        }
    }

    public final View b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("a6d5acba", new Object[]{this, context});
        }
        fve.e("HomeInfoFlowController", "createInfoFlowContainer");
        d();
        return this.c.c(context);
    }

    public final void c(String str, fdc fdcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bf536322", new Object[]{this, str, fdcVar});
            return;
        }
        fve.e("HomeInfoFlowController", "initInfoFlowEngine");
        phg.k("initInfoFlowEngine");
        l9t.a(new dve.b(new yft()).D(new bgt()).M(new iue()).L(new j0b()).B(new cgt()).I(new n9t()).E(new wue()));
        this.b = new xue.b(this.f21012a).d(new j1b(str, this.f21012a, new lza(this, fdcVar))).c();
        Log.e("HomeInfoFlowController", "InfoFlowEngine create finish");
        n2c b = this.b.b();
        this.c = b;
        this.d = b.e();
        this.e = this.c.d();
        this.f = this.c.a();
        ejb b2 = this.c.b();
        this.g = b2;
        this.h = b2.getPullDownRefreshInvoker();
        this.i = this.g.getRocketInvoker();
        this.j = this.g.getUtInvoker();
        this.i = this.g.getRocketInvoker();
        this.l = this.g.getContainerInvoker();
        this.k = this.g.getNaviBarInvoker();
        this.m = this.g.getGlobalThemeInvoker();
        this.o = this.g.getOutLinkInvoker();
        this.t = this.g.getPopInvoker();
        this.n = this.g.getPassParamsInvoker();
        phg.j("initInfoFlowEngine");
    }

    @Override // com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public synchronized View createView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("79a2c742", new Object[]{this, context});
        }
        this.v = context;
        View view = this.r;
        if (view != null) {
            this.r = null;
            return view;
        }
        return b(context);
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("be627128", new Object[]{this});
        } else if (this.b == null) {
            fve.e("HomeInfoFlowController", "reInitInfoFlowEngine initInfoFlowEngine");
            c(this.q, this.p);
            if (this.s) {
                this.e.onPageSelected();
            }
        }
    }

    @Override // tb.nv, com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public int getSubContainerScrollY() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("745ec8f", new Object[]{this})).intValue();
        }
        oqb oqbVar = this.l;
        if (oqbVar != null) {
            return oqbVar.e();
        }
        return 0;
    }

    @Override // tb.nv, com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public ntd getSubTabParams() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ntd) ipChange.ipc$dispatch("8e24caab", new Object[]{this});
        }
        oqb oqbVar = this.l;
        if (oqbVar == null) {
            return null;
        }
        return oqbVar.getSubTabParams();
    }

    @Override // tb.nv, com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public JSONObject getSubTabSearchBarData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("bab9b3d1", new Object[]{this});
        }
        dzc dzcVar = this.k;
        if (dzcVar != null) {
            return dzcVar.getSubTabSearchBarData();
        }
        return null;
    }

    @Override // tb.nv, com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public Map<String, String> getUpdateNextPageProperties() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("37691e90", new Object[]{this});
        }
        e8e e8eVar = this.j;
        if (e8eVar != null) {
            return e8eVar.getUpdateNextPageProperties();
        }
        return null;
    }

    @Override // tb.nv, com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public String getUpdatePageName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("111ff600", new Object[]{this});
        }
        e8e e8eVar = this.j;
        if (e8eVar != null) {
            return e8eVar.getUpdatePageName();
        }
        return null;
    }

    @Override // tb.nv, com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public Map<String, String> getUpdatePageProperties() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("30e122fd", new Object[]{this});
        }
        e8e e8eVar = this.j;
        if (e8eVar != null) {
            return e8eVar.getUpdatePageProperties();
        }
        return null;
    }

    @Override // tb.nv, com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public String getUpdatePageUtParam() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a4393099", new Object[]{this});
        }
        e8e e8eVar = this.j;
        if (e8eVar != null) {
            return e8eVar.getUpdatePageUtParam();
        }
        return null;
    }

    @Override // tb.nv, com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public View getViewBySectionBizCodeAndItemBizCode(String str, String str2) {
        oqb oqbVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("7201fa60", new Object[]{this, str, str2});
        }
        if (!TextUtils.equals(str, "categoryTab") && (oqbVar = this.l) != null) {
            return oqbVar.b(str, str2);
        }
        return null;
    }

    @Override // tb.nv, com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public boolean isAllowProcessPageBack() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7f5e02f1", new Object[]{this})).booleanValue();
        }
        if (this.g.getOutLinkInvoker().isInQRCodePreview()) {
            return false;
        }
        o1e topViewInvoker = this.g.getTopViewInvoker();
        if (topViewInvoker != null) {
            return !topViewInvoker.expendTopViewRecord();
        }
        return super.isAllowProcessPageBack();
    }

    @Override // tb.nv, com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public boolean isEnablePullReFresh() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b20c9b34", new Object[]{this})).booleanValue();
        }
        hed hedVar = this.h;
        if (hedVar != null) {
            return hedVar.isEnablePullReFresh();
        }
        return true;
    }

    @Override // tb.nv, com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public boolean isHandleUpAndDownScrollingEvent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5f36d8fc", new Object[]{this})).booleanValue();
        }
        oqb oqbVar = this.l;
        if (oqbVar != null) {
            return oqbVar.a();
        }
        return false;
    }

    @Override // tb.nv, com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public boolean isOnRocketState() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f6f1c3f", new Object[]{this})).booleanValue();
        }
        vkd vkdVar = this.i;
        if (vkdVar != null) {
            return vkdVar.isOnRocketState();
        }
        return false;
    }

    @Override // tb.nv, com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public boolean isReachTop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("36ef4cb7", new Object[]{this})).booleanValue();
        }
        oqb oqbVar = this.l;
        if (oqbVar != null) {
            return oqbVar.isReachTop();
        }
        return true;
    }

    @Override // tb.nv, com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public void notifyOutLinkParams(Intent intent, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac20293", new Object[]{this, intent, str});
            return;
        }
        m4d m4dVar = this.o;
        if (m4dVar != null) {
            m4dVar.notifyOutLinkParams(intent, str);
        }
    }

    @Override // tb.nv, com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public void onActivityResult(int i, int i2, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4af7346f", new Object[]{this, new Integer(i), new Integer(i2), intent});
            return;
        }
        super.onActivityResult(i, i2, intent);
        e6d e6dVar = this.d;
        if (e6dVar != null) {
            e6dVar.onActivityResult(i, i2, intent);
        }
    }

    @Override // tb.nv, com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public void onAppToBackground() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("938dadf2", new Object[]{this});
        } else {
            this.f.onAppToBackground();
        }
    }

    @Override // tb.nv, com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public void onAppToFront() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c0c238d3", new Object[]{this});
        } else {
            this.f.onAppToFront();
        }
    }

    @Override // tb.nv, com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public void onClickRocket() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41ace924", new Object[]{this});
            return;
        }
        vkd vkdVar = this.i;
        if (vkdVar != null) {
            vkdVar.onClickRocket();
        }
    }

    @Override // tb.nv, com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public void onColdStartResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("45e9b853", new Object[]{this});
        } else {
            this.d.onColdStartResume();
        }
    }

    @Override // tb.nv, com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        fve.e("HomeInfoFlowController", "onDestroy");
        this.d.onDestroy();
        xue xueVar = this.b;
        if (xueVar != null) {
            xueVar.a();
            this.b = null;
        }
        this.r = null;
        this.v = null;
    }

    @Override // tb.nv, com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public void onEnterPullSecondFloor() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("11729e81", new Object[]{this});
            return;
        }
        hed hedVar = this.h;
        if (hedVar != null) {
            hedVar.onEnterPullSecondFloor();
        }
    }

    @Override // tb.nv, com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public void onExitPullSecondFloor() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e74a49d", new Object[]{this});
            return;
        }
        hed hedVar = this.h;
        if (hedVar != null) {
            hedVar.onExitPullSecondFloor();
        }
    }

    @Override // tb.nv, com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public void onFestivalRefresh() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e0e05ceb", new Object[]{this});
            return;
        }
        cac cacVar = this.m;
        if (cacVar != null) {
            cacVar.onFestivalRefresh();
        }
    }

    @Override // tb.nv, com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public void onPageSelected() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90abdd0", new Object[]{this});
            return;
        }
        xpa.b(true);
        this.s = true;
        this.e.onPageSelected();
        a();
    }

    @Override // tb.nv, com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public void onPageUnSelected() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1dadaf89", new Object[]{this});
            return;
        }
        xpa.b(false);
        this.s = false;
        this.e.onPageUnSelected();
    }

    @Override // tb.nv, com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        xpa.b(false);
        this.d.onPause();
    }

    @Override // tb.nv, com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public void onPullDistance(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2dcc8a23", new Object[]{this, new Integer(i)});
            return;
        }
        hed hedVar = this.h;
        if (hedVar != null) {
            hedVar.onPullDistance(i);
        }
    }

    @Override // tb.nv, com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public void onPullRefresh() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24224e7e", new Object[]{this});
            return;
        }
        hed hedVar = this.h;
        if (hedVar != null) {
            hedVar.onPullRefresh();
        }
    }

    @Override // tb.nv, com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public void onRefreshStateChanged(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("645061a", new Object[]{this, str, str2});
            return;
        }
        hed hedVar = this.h;
        if (hedVar != null) {
            hedVar.onRefreshStateChanged(str, str2);
        }
    }

    @Override // tb.nv, com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        xpa.b(true);
        this.d.onResume();
    }

    @Override // tb.nv, com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public void onWillExit() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3bc02c16", new Object[]{this});
            return;
        }
        e6d e6dVar = this.d;
        if (e6dVar != null) {
            e6dVar.onWillExit();
        }
    }

    @Override // tb.nv, com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public void passThroughData(v7d v7dVar, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c0cdc44", new Object[]{this, v7dVar, str, str2});
            return;
        }
        u7d u7dVar = this.n;
        if (u7dVar != null) {
            u7dVar.a(v7dVar, str, str2);
        }
    }

    @Override // tb.nv, com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public synchronized View preCreateView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("7349eddf", new Object[]{this, context});
        }
        if (this.r == null) {
            this.r = b(context);
        }
        return this.r;
    }

    @Override // tb.nv, com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public void removePopMessageListenerByMain(IPopViewService.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e8fa476", new Object[]{this, aVar});
            return;
        }
        sad sadVar = this.t;
        if (sadVar != null) {
            sadVar.removePopMessageListenerByMain(aVar);
        }
    }

    @Override // tb.nv, com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public boolean scrollToPositionWithOffset(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8f5c5ef5", new Object[]{this, new Integer(i), new Integer(i2)})).booleanValue();
        }
        oqb oqbVar = this.l;
        if (oqbVar == null) {
            return false;
        }
        return oqbVar.scrollToPositionWithOffset(i, i2);
    }

    @Override // tb.nv, com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public boolean smoothScrollToPositionFromInfoFlow(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("89c0a6db", new Object[]{this, new Integer(i)})).booleanValue();
        }
        oqb oqbVar = this.l;
        if (oqbVar == null) {
            return false;
        }
        return oqbVar.smoothScrollToPositionFromInfoFlow(i);
    }

    @Override // tb.nv, com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public void triggerPopRemoveByMain(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dacbf3e", new Object[]{this, str});
            return;
        }
        sad sadVar = this.t;
        if (sadVar != null) {
            sadVar.triggerPopRemoveByMain(str);
        }
    }

    @Override // tb.nv, com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public void triggerPopShowByMain(int i, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b38f4fa", new Object[]{this, new Integer(i), jSONObject});
            return;
        }
        sad sadVar = this.t;
        if (sadVar != null) {
            sadVar.triggerPopShowByMain(i, jSONObject);
        }
    }

    @Override // tb.nv, com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public String getTabBarButtonShowState() {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b0ebe10b", new Object[]{this});
        }
        vkd vkdVar = this.i;
        if (vkdVar != null) {
            z = vkdVar.isOnRocketState();
        }
        if (z) {
            return "rocket";
        }
        return kis.TAO;
    }

    @Override // tb.nv, com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public boolean isEnableToSecondFloor() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8c45f0bb", new Object[]{this})).booleanValue();
        }
        Context context = this.v;
        if (context == null) {
            context = Globals.getApplication();
        }
        if ((!b9b.e() || b9b.g(context)) && !b9b.h()) {
            hed hedVar = this.h;
            if (hedVar != null) {
                return hedVar.isEnableToSecondFloor();
            }
            return false;
        }
        bqa.d("TopTabBar", "折叠屏 设置 二楼不可出");
        return false;
    }
}
