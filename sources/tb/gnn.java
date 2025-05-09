package tb;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.subservice.biz.IPopViewService;
import com.taobao.tao.topmultitab.protocol.IHomeSubTabController;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class gnn extends hw {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public son f20115a;
    public final fdc b;
    public final String c;
    public final wcc d;

    static {
        t2o.a(729809386);
    }

    public gnn(fdc fdcVar, String str, wcc wccVar) {
        super(fdcVar);
        this.b = fdcVar;
        this.c = str;
        this.d = wccVar;
        this.f20115a = new son(fdcVar, str, this, wccVar);
    }

    public static /* synthetic */ Object ipc$super(gnn gnnVar, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1945314236:
                super.passThroughData((v7d) objArr[0], (String) objArr[1], (String) objArr[2]);
                return null;
            case -1504501726:
                super.onDestroy();
                return null;
            case -1326718709:
                return super.getTabBarButtonShowState();
            case -483360559:
                super.selectTabByTabId((String) objArr[0]);
                return null;
            case 454293861:
                return new Boolean(super.a());
            case 1400020315:
                return super.getCurrentSubContainerType();
            case 1845730697:
                return super.getSubTabSearchBoxData();
            case 1912732256:
                return super.getViewBySectionBizCodeAndItemBizCode((String) objArr[0], (String) objArr[1]);
            case 2136867569:
                return new Boolean(super.isAllowProcessPageBack());
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/infoflow/RecommendController");
        }
    }

    @Override // tb.hw
    public boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1b13f965", new Object[]{this})).booleanValue();
        }
        son sonVar = this.f20115a;
        if (sonVar == null) {
            return super.a();
        }
        return sonVar.v();
    }

    @Override // tb.nv, com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public void addPopMessageListenerByMain(IPopViewService.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f869e2b9", new Object[]{this, aVar});
            return;
        }
        IHomeSubTabController c = c();
        if (c != null) {
            c.addPopMessageListenerByMain(aVar);
        }
    }

    public void b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("657cd1ad", new Object[]{this, new Boolean(z)});
            return;
        }
        IHomeSubTabController c = c();
        if (c instanceof uaj) {
            ((uaj) c).d(z);
        }
    }

    public final IHomeSubTabController c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IHomeSubTabController) ipChange.ipc$dispatch("ae0b87e6", new Object[]{this});
        }
        if (this.f20115a == null) {
            this.f20115a = new son(this.b, this.c, this, this.d);
        }
        return this.f20115a.n();
    }

    @Override // com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public View createView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("79a2c742", new Object[]{this, context});
        }
        IHomeSubTabController c = c();
        if (c != null) {
            return c.createView(context);
        }
        return null;
    }

    public boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("43df7919", new Object[]{this})).booleanValue();
        }
        son sonVar = this.f20115a;
        if (sonVar == null) {
            return false;
        }
        return sonVar.q();
    }

    public boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8ac9d0f5", new Object[]{this})).booleanValue();
        }
        son sonVar = this.f20115a;
        if (sonVar == null) {
            return false;
        }
        return sonVar.s();
    }

    public boolean f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c39968a7", new Object[]{this})).booleanValue();
        }
        son sonVar = this.f20115a;
        if (sonVar == null) {
            return false;
        }
        return sonVar.t();
    }

    public boolean g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c0862e14", new Object[]{this})).booleanValue();
        }
        son sonVar = this.f20115a;
        if (sonVar == null) {
            return false;
        }
        return sonVar.u();
    }

    @Override // tb.nv, com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public String getCurrentSubContainerType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("53729d5b", new Object[]{this});
        }
        IHomeSubTabController c = c();
        if (c != null) {
            return c.getCurrentSubContainerType();
        }
        return super.getCurrentSubContainerType();
    }

    @Override // tb.nv, com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public Map<String, String> getRequestUpstreamBizParam(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("312f52b4", new Object[]{this, str});
        }
        IHomeSubTabController c = c();
        if (c != null) {
            return c.getRequestUpstreamBizParam(str);
        }
        return null;
    }

    @Override // tb.nv, com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public int getSubContainerScrollY() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("745ec8f", new Object[]{this})).intValue();
        }
        IHomeSubTabController c = c();
        if (c != null) {
            return c.getSubContainerScrollY();
        }
        return 0;
    }

    @Override // tb.nv, com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public String getSubPageName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("93a20a95", new Object[]{this});
        }
        IHomeSubTabController c = c();
        if (c != null) {
            return c.getSubPageName();
        }
        return null;
    }

    @Override // tb.nv, com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public JSONObject getSubTabData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("f7e6579c", new Object[]{this});
        }
        IHomeSubTabController c = c();
        if (c != null) {
            return c.getSubTabData();
        }
        return null;
    }

    @Override // tb.nv, com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public ntd getSubTabParams() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ntd) ipChange.ipc$dispatch("8e24caab", new Object[]{this});
        }
        IHomeSubTabController c = c();
        if (c != null) {
            return c.getSubTabParams();
        }
        return null;
    }

    @Override // tb.nv, com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public JSONObject getSubTabSearchBarData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("bab9b3d1", new Object[]{this});
        }
        IHomeSubTabController c = c();
        if (c != null) {
            return c.getSubTabSearchBarData();
        }
        return null;
    }

    @Override // tb.nv, com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public JSONObject getSubTabSearchBoxData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("6e039d89", new Object[]{this});
        }
        IHomeSubTabController c = c();
        if (c != null) {
            return c.getSubTabSearchBoxData();
        }
        return super.getSubTabSearchBoxData();
    }

    @Override // tb.nv, com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public String getTabBarButtonShowState() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b0ebe10b", new Object[]{this});
        }
        IHomeSubTabController c = c();
        if (c != null) {
            return c.getTabBarButtonShowState();
        }
        return super.getTabBarButtonShowState();
    }

    @Override // tb.nv, com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public Map<String, String> getUpdateNextPageProperties() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("37691e90", new Object[]{this});
        }
        IHomeSubTabController c = c();
        if (c != null) {
            return c.getUpdateNextPageProperties();
        }
        return null;
    }

    @Override // tb.nv, com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public String getUpdatePageName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("111ff600", new Object[]{this});
        }
        IHomeSubTabController c = c();
        if (c != null) {
            return c.getUpdatePageName();
        }
        return null;
    }

    @Override // tb.nv, com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public Map<String, String> getUpdatePageProperties() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("30e122fd", new Object[]{this});
        }
        IHomeSubTabController c = c();
        if (c != null) {
            return c.getUpdatePageProperties();
        }
        return null;
    }

    @Override // tb.nv, com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public String getUpdatePageUtParam() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a4393099", new Object[]{this});
        }
        IHomeSubTabController c = c();
        if (c != null) {
            return c.getUpdatePageUtParam();
        }
        return null;
    }

    @Override // tb.nv, com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public View getViewBySectionBizCodeAndItemBizCode(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("7201fa60", new Object[]{this, str, str2});
        }
        IHomeSubTabController c = c();
        if (c != null) {
            return c.getViewBySectionBizCodeAndItemBizCode(str, str2);
        }
        return super.getViewBySectionBizCodeAndItemBizCode(str, str2);
    }

    public void h(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e003e16f", new Object[]{this, new Boolean(z)});
            return;
        }
        IHomeSubTabController c = c();
        if (c instanceof uaj) {
            ((uaj) c).i(z);
        }
    }

    @Override // tb.nv, com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public boolean isAllowProcessPageBack() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7f5e02f1", new Object[]{this})).booleanValue();
        }
        IHomeSubTabController c = c();
        if (c != null) {
            return c.isAllowProcessPageBack();
        }
        return super.isAllowProcessPageBack();
    }

    @Override // tb.nv, com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public boolean isEnablePullReFresh() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b20c9b34", new Object[]{this})).booleanValue();
        }
        IHomeSubTabController c = c();
        if (c != null) {
            return c.isEnablePullReFresh();
        }
        return false;
    }

    @Override // tb.nv, com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public boolean isEnableToSecondFloor() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8c45f0bb", new Object[]{this})).booleanValue();
        }
        IHomeSubTabController c = c();
        if (c != null) {
            return c.isEnableToSecondFloor();
        }
        return false;
    }

    @Override // tb.nv, com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public boolean isHandleUpAndDownScrollingEvent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5f36d8fc", new Object[]{this})).booleanValue();
        }
        IHomeSubTabController c = c();
        if (c != null) {
            return c.isHandleUpAndDownScrollingEvent();
        }
        return false;
    }

    @Override // tb.nv, com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public boolean isOnRocketState() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f6f1c3f", new Object[]{this})).booleanValue();
        }
        IHomeSubTabController c = c();
        if (c != null) {
            return c.isOnRocketState();
        }
        return false;
    }

    @Override // tb.nv, com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public boolean isReachTop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("36ef4cb7", new Object[]{this})).booleanValue();
        }
        IHomeSubTabController c = c();
        if (c != null) {
            return c.isReachTop();
        }
        return false;
    }

    @Override // tb.nv, com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public void notifyOutLinkParams(Intent intent, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac20293", new Object[]{this, intent, str});
            return;
        }
        IHomeSubTabController c = c();
        if (c != null) {
            c.notifyOutLinkParams(intent, str);
        }
    }

    @Override // tb.nv, com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public void onActivityResult(int i, int i2, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4af7346f", new Object[]{this, new Integer(i), new Integer(i2), intent});
            return;
        }
        IHomeSubTabController c = c();
        if (c != null) {
            c.onActivityResult(i, i2, intent);
        }
    }

    @Override // tb.nv, com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public void onAppToBackground() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("938dadf2", new Object[]{this});
            return;
        }
        IHomeSubTabController c = c();
        if (c != null) {
            c.onAppToBackground();
        }
    }

    @Override // tb.nv, com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public void onAppToFront() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c0c238d3", new Object[]{this});
            return;
        }
        IHomeSubTabController c = c();
        if (c != null) {
            c.onAppToFront();
        }
    }

    @Override // tb.nv, com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public void onClickRocket() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41ace924", new Object[]{this});
            return;
        }
        IHomeSubTabController c = c();
        if (c != null) {
            c.onClickRocket();
        }
    }

    @Override // tb.nv, com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public void onColdStartResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("45e9b853", new Object[]{this});
            return;
        }
        IHomeSubTabController c = c();
        if (c != null) {
            c.onColdStartResume();
        }
    }

    @Override // tb.nv, com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        IHomeSubTabController c = c();
        if (c != null) {
            c.onDestroy();
        }
        son sonVar = this.f20115a;
        if (sonVar != null) {
            sonVar.m();
            this.f20115a = null;
        }
    }

    @Override // tb.nv, com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public void onEnterPullSecondFloor() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("11729e81", new Object[]{this});
            return;
        }
        IHomeSubTabController c = c();
        if (c != null) {
            c.onEnterPullSecondFloor();
        }
    }

    @Override // tb.nv, com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public void onExitPullSecondFloor() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e74a49d", new Object[]{this});
            return;
        }
        IHomeSubTabController c = c();
        if (c != null) {
            c.onExitPullSecondFloor();
        }
    }

    @Override // tb.nv, com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public void onFestivalRefresh() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e0e05ceb", new Object[]{this});
            return;
        }
        IHomeSubTabController c = c();
        if (c != null) {
            c.onFestivalRefresh();
        }
    }

    @Override // tb.nv, com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public void onPageSelected() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90abdd0", new Object[]{this});
            return;
        }
        IHomeSubTabController c = c();
        if (c != null) {
            c.onPageSelected();
        }
    }

    @Override // tb.nv, com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public void onPageUnSelected() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1dadaf89", new Object[]{this});
            return;
        }
        IHomeSubTabController c = c();
        if (c != null) {
            c.onPageUnSelected();
        }
    }

    @Override // tb.nv, com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        IHomeSubTabController c = c();
        if (c != null) {
            c.onPause();
        }
    }

    @Override // tb.nv, com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public void onPullDistance(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2dcc8a23", new Object[]{this, new Integer(i)});
            return;
        }
        IHomeSubTabController c = c();
        if (c != null) {
            c.onPullDistance(i);
        }
    }

    @Override // tb.nv, com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public void onPullRefresh() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24224e7e", new Object[]{this});
            return;
        }
        IHomeSubTabController c = c();
        if (c != null) {
            c.onPullRefresh();
        }
    }

    @Override // tb.nv, com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public void onRefreshStateChanged(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("645061a", new Object[]{this, str, str2});
            return;
        }
        IHomeSubTabController c = c();
        if (c != null) {
            c.onRefreshStateChanged(str, str2);
        }
    }

    @Override // tb.nv, com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        IHomeSubTabController c = c();
        if (c != null) {
            c.onResume();
        }
    }

    @Override // tb.nv, com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public void onStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
            return;
        }
        IHomeSubTabController c = c();
        if (c != null) {
            c.onStart();
        }
    }

    @Override // tb.nv, com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public void onStop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3dde88", new Object[]{this});
            return;
        }
        IHomeSubTabController c = c();
        if (c != null) {
            c.onStop();
        }
    }

    @Override // tb.nv, com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public void onWillExit() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3bc02c16", new Object[]{this});
            return;
        }
        IHomeSubTabController c = c();
        if (c != null) {
            c.onWillExit();
        }
    }

    @Override // tb.nv, com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public void passThroughData(v7d v7dVar, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c0cdc44", new Object[]{this, v7dVar, str, str2});
            return;
        }
        IHomeSubTabController c = c();
        if (c != null) {
            c.passThroughData(v7dVar, str, str2);
        }
        super.passThroughData(v7dVar, str, str2);
    }

    @Override // tb.nv, com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public View preCreateView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("7349eddf", new Object[]{this, context});
        }
        IHomeSubTabController c = c();
        if (c != null) {
            return c.preCreateView(context);
        }
        return null;
    }

    @Override // tb.nv, com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public void removePopMessageListenerByMain(IPopViewService.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e8fa476", new Object[]{this, aVar});
            return;
        }
        IHomeSubTabController c = c();
        if (c != null) {
            c.removePopMessageListenerByMain(aVar);
        }
    }

    @Override // tb.nv, com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public boolean scrollToPositionWithOffset(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8f5c5ef5", new Object[]{this, new Integer(i), new Integer(i2)})).booleanValue();
        }
        IHomeSubTabController c = c();
        if (c != null) {
            return c.scrollToPositionWithOffset(i, i2);
        }
        return false;
    }

    @Override // tb.nv, com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public void selectTabByTabId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e33080d1", new Object[]{this, str});
            return;
        }
        IHomeSubTabController c = c();
        if (c != null) {
            c.selectTabByTabId(str);
        }
        super.selectTabByTabId(str);
    }

    @Override // tb.nv, com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public boolean smoothScrollToPositionFromInfoFlow(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("89c0a6db", new Object[]{this, new Integer(i)})).booleanValue();
        }
        IHomeSubTabController c = c();
        if (c != null) {
            return c.smoothScrollToPositionFromInfoFlow(i);
        }
        return false;
    }

    @Override // tb.nv, com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public void triggerPopRemoveByMain(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dacbf3e", new Object[]{this, str});
            return;
        }
        IHomeSubTabController c = c();
        if (c != null) {
            c.triggerPopRemoveByMain(str);
        }
    }

    @Override // tb.nv, com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public void triggerPopShowByMain(int i, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b38f4fa", new Object[]{this, new Integer(i), jSONObject});
            return;
        }
        IHomeSubTabController c = c();
        if (c != null) {
            c.triggerPopShowByMain(i, jSONObject);
        }
    }
}
