package tb;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.subservice.biz.IPopViewService;
import com.taobao.tao.infoflow.multitab.viewprovider.tablayout.a;
import com.taobao.tao.topmultitab.protocol.IHomeSubTabController;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class uaj extends hw {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final waj f29260a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements a.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ boolean f29261a;
        public final /* synthetic */ boolean b;
        public final /* synthetic */ Intent c;
        public final /* synthetic */ String d;

        public a(boolean z, boolean z2, Intent intent, String str) {
            this.f29261a = z;
            this.b = z2;
            this.c = intent;
            this.d = str;
        }

        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("349e85bd", new Object[]{this});
            } else if (!this.f29261a || !this.b) {
                IHomeSubTabController b = uaj.b(uaj.this);
                if (b == null) {
                    b = uaj.c(uaj.this).M();
                }
                if (b != null) {
                    b.notifyOutLinkParams(this.c, this.d);
                    d9j.c("MultiTabController", "onOutLinkJumped: ".concat(b.getClass().getSimpleName()));
                }
            } else {
                d9j.c("MultiTabController", "提前通知外链参数");
            }
        }
    }

    static {
        t2o.a(729809444);
    }

    public uaj(fdc fdcVar, JSONObject jSONObject, IHomeSubTabController iHomeSubTabController, wcc wccVar) {
        super(fdcVar);
        this.f29260a = new waj(fdcVar, jSONObject, iHomeSubTabController, wccVar);
    }

    public static /* synthetic */ IHomeSubTabController b(uaj uajVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IHomeSubTabController) ipChange.ipc$dispatch("a468ec43", new Object[]{uajVar});
        }
        return uajVar.e();
    }

    public static /* synthetic */ waj c(uaj uajVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (waj) ipChange.ipc$dispatch("79c01ef8", new Object[]{uajVar});
        }
        return uajVar.f29260a;
    }

    public static /* synthetic */ Object ipc$super(uaj uajVar, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1326718709:
                return super.getTabBarButtonShowState();
            case 1845730697:
                return super.getSubTabSearchBoxData();
            case 1912732256:
                return super.getViewBySectionBizCodeAndItemBizCode((String) objArr[0], (String) objArr[1]);
            case 2136867569:
                return new Boolean(super.isAllowProcessPageBack());
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/infoflow/multitab/MultiTabController");
        }
    }

    @Override // tb.hw
    public boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1b13f965", new Object[]{this})).booleanValue();
        }
        return this.f29260a.W();
    }

    @Override // tb.nv, com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public void addPopMessageListenerByMain(IPopViewService.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f869e2b9", new Object[]{this, aVar});
            return;
        }
        i0b N = this.f29260a.N();
        if (N != null) {
            N.addPopMessageListenerByMain(aVar);
        }
    }

    @Override // com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public synchronized View createView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("79a2c742", new Object[]{this, context});
        }
        d9j.c("MultiTabController", "getCurrentSubContainerType: " + this.f29260a.J());
        return this.f29260a.D(context);
    }

    public void d(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("657cd1ad", new Object[]{this, new Boolean(z)});
        } else {
            this.f29260a.G(z);
        }
    }

    public final IHomeSubTabController e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IHomeSubTabController) ipChange.ipc$dispatch("fcf287aa", new Object[]{this});
        }
        return this.f29260a.a();
    }

    public boolean f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("43df7919", new Object[]{this})).booleanValue();
        }
        return this.f29260a.T();
    }

    public boolean g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8ac9d0f5", new Object[]{this})).booleanValue();
        }
        return this.f29260a.V();
    }

    @Override // tb.nv, com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public String getCurrentSubContainerType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("53729d5b", new Object[]{this});
        }
        return this.f29260a.J();
    }

    @Override // tb.nv, com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public Map<String, String> getRequestUpstreamBizParam(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("312f52b4", new Object[]{this, str});
        }
        return this.f29260a.R(str);
    }

    @Override // tb.nv, com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public int getSubContainerScrollY() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("745ec8f", new Object[]{this})).intValue();
        }
        IHomeSubTabController e = e();
        if (e != null) {
            return e.getSubContainerScrollY();
        }
        return 0;
    }

    @Override // tb.nv, com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public String getSubPageName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("93a20a95", new Object[]{this});
        }
        IHomeSubTabController e = e();
        if (e != null) {
            return e.getSubPageName();
        }
        return null;
    }

    @Override // tb.nv, com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public JSONObject getSubTabData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("f7e6579c", new Object[]{this});
        }
        return this.f29260a.K();
    }

    @Override // tb.nv, com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public ntd getSubTabParams() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ntd) ipChange.ipc$dispatch("8e24caab", new Object[]{this});
        }
        IHomeSubTabController e = e();
        if (e != null) {
            return e.getSubTabParams();
        }
        return null;
    }

    @Override // tb.nv, com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public JSONObject getSubTabSearchBarData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("bab9b3d1", new Object[]{this});
        }
        IHomeSubTabController e = e();
        if (e != null) {
            return e.getSubTabSearchBarData();
        }
        return null;
    }

    @Override // tb.nv, com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public JSONObject getSubTabSearchBoxData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("6e039d89", new Object[]{this});
        }
        IHomeSubTabController e = e();
        if (e != null) {
            return e.getSubTabSearchBoxData();
        }
        return super.getSubTabSearchBoxData();
    }

    @Override // tb.nv, com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public String getTabBarButtonShowState() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b0ebe10b", new Object[]{this});
        }
        IHomeSubTabController e = e();
        if (e != null) {
            return e.getTabBarButtonShowState();
        }
        return super.getTabBarButtonShowState();
    }

    @Override // tb.nv, com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public Map<String, String> getUpdateNextPageProperties() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("37691e90", new Object[]{this});
        }
        IHomeSubTabController e = e();
        if (e != null) {
            return e.getUpdateNextPageProperties();
        }
        return null;
    }

    @Override // tb.nv, com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public String getUpdatePageName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("111ff600", new Object[]{this});
        }
        IHomeSubTabController e = e();
        if (e != null) {
            return e.getUpdatePageName();
        }
        return null;
    }

    @Override // tb.nv, com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public Map<String, String> getUpdatePageProperties() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("30e122fd", new Object[]{this});
        }
        IHomeSubTabController e = e();
        if (e != null) {
            return e.getUpdatePageProperties();
        }
        return null;
    }

    @Override // tb.nv, com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public String getUpdatePageUtParam() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a4393099", new Object[]{this});
        }
        IHomeSubTabController e = e();
        if (e != null) {
            return e.getUpdatePageUtParam();
        }
        return null;
    }

    @Override // tb.nv, com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public View getViewBySectionBizCodeAndItemBizCode(String str, String str2) {
        waj wajVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("7201fa60", new Object[]{this, str, str2});
        }
        if (!TextUtils.equals(str, "categoryTab")) {
            IHomeSubTabController e = e();
            if (e != null) {
                return e.getViewBySectionBizCodeAndItemBizCode(str, str2);
            }
            return super.getViewBySectionBizCodeAndItemBizCode(str, str2);
        } else if (TextUtils.isEmpty(str2) || (wajVar = this.f29260a) == null) {
            return null;
        } else {
            return wajVar.I(str2);
        }
    }

    public boolean h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c39968a7", new Object[]{this})).booleanValue();
        }
        return this.f29260a.U();
    }

    public void i(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e003e16f", new Object[]{this, new Boolean(z)});
        } else {
            this.f29260a.o0(z);
        }
    }

    @Override // tb.nv, com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public boolean isAllowProcessPageBack() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7f5e02f1", new Object[]{this})).booleanValue();
        }
        i0b N = this.f29260a.N();
        if (N != null) {
            return N.isAllowProcessPageBack();
        }
        return super.isAllowProcessPageBack();
    }

    @Override // tb.nv, com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public boolean isEnablePullReFresh() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b20c9b34", new Object[]{this})).booleanValue();
        }
        IHomeSubTabController e = e();
        if (e != null) {
            return e.isEnablePullReFresh();
        }
        return false;
    }

    @Override // tb.nv, com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public boolean isEnableToSecondFloor() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8c45f0bb", new Object[]{this})).booleanValue();
        }
        IHomeSubTabController e = e();
        if (e != null) {
            return e.isEnableToSecondFloor();
        }
        return false;
    }

    @Override // tb.nv, com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public boolean isHandleUpAndDownScrollingEvent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5f36d8fc", new Object[]{this})).booleanValue();
        }
        IHomeSubTabController e = e();
        if (e != null) {
            return e.isHandleUpAndDownScrollingEvent();
        }
        return false;
    }

    @Override // tb.nv, com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public boolean isOnRocketState() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f6f1c3f", new Object[]{this})).booleanValue();
        }
        IHomeSubTabController e = e();
        if (e != null) {
            return e.isOnRocketState();
        }
        return false;
    }

    @Override // tb.nv, com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public boolean isReachTop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("36ef4cb7", new Object[]{this})).booleanValue();
        }
        IHomeSubTabController e = e();
        if (e != null) {
            return e.isReachTop();
        }
        return false;
    }

    @Override // tb.nv, com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public void onActivityResult(int i, int i2, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4af7346f", new Object[]{this, new Integer(i), new Integer(i2), intent});
            return;
        }
        IHomeSubTabController e = e();
        if (e != null) {
            e.onActivityResult(i, i2, intent);
        }
    }

    @Override // tb.nv, com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public void onAppToBackground() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("938dadf2", new Object[]{this});
            return;
        }
        IHomeSubTabController e = e();
        if (e != null) {
            e.onAppToBackground();
        }
    }

    @Override // tb.nv, com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public void onAppToFront() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c0c238d3", new Object[]{this});
            return;
        }
        IHomeSubTabController e = e();
        if (e != null) {
            e.onAppToFront();
        }
    }

    @Override // tb.nv, com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public void onClickRocket() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41ace924", new Object[]{this});
            return;
        }
        IHomeSubTabController e = e();
        if (e != null) {
            e.onClickRocket();
        }
    }

    @Override // tb.nv, com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public void onColdStartResume() {
        waj wajVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("45e9b853", new Object[]{this});
            return;
        }
        IHomeSubTabController e = e();
        if (e == null && (wajVar = this.f29260a) != null) {
            e = wajVar.M();
        }
        if (e != null) {
            try {
                e.onColdStartResume();
            } catch (AbstractMethodError e2) {
                d9j.d("PageLifeCycleRegister", "onColdStartResume方法找不到，请使用摩天轮打包", e2);
            }
        }
    }

    @Override // tb.nv, com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public void onCreate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18a7a6c2", new Object[]{this});
            return;
        }
        IHomeSubTabController e = e();
        if (e != null) {
            e.onCreate();
        }
    }

    @Override // tb.nv, com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
        } else {
            this.f29260a.E();
        }
    }

    @Override // tb.nv, com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public void onEnterPullSecondFloor() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("11729e81", new Object[]{this});
            return;
        }
        IHomeSubTabController e = e();
        if (e != null) {
            e.onEnterPullSecondFloor();
        }
    }

    @Override // tb.nv, com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public void onExitPullSecondFloor() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e74a49d", new Object[]{this});
            return;
        }
        IHomeSubTabController e = e();
        if (e != null) {
            e.onExitPullSecondFloor();
        }
    }

    @Override // tb.nv, com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public void onFestivalRefresh() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e0e05ceb", new Object[]{this});
            return;
        }
        IHomeSubTabController e = e();
        if (e != null) {
            e.onFestivalRefresh();
        }
    }

    @Override // tb.nv, com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public void onPageSelected() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90abdd0", new Object[]{this});
            return;
        }
        IHomeSubTabController e = e();
        if (e != null) {
            e.onPageSelected();
        }
    }

    @Override // tb.nv, com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public void onPageUnSelected() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1dadaf89", new Object[]{this});
            return;
        }
        IHomeSubTabController e = e();
        if (e != null) {
            e.onPageUnSelected();
        }
    }

    @Override // tb.nv, com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        IHomeSubTabController e = e();
        if (e != null) {
            e.onPause();
        }
    }

    @Override // tb.nv, com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public void onPullDistance(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2dcc8a23", new Object[]{this, new Integer(i)});
            return;
        }
        IHomeSubTabController e = e();
        if (e != null) {
            e.onPullDistance(i);
        }
    }

    @Override // tb.nv, com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public void onPullRefresh() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24224e7e", new Object[]{this});
            return;
        }
        IHomeSubTabController e = e();
        if (e != null) {
            e.onPullRefresh();
        }
    }

    @Override // tb.nv, com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public void onRefreshStateChanged(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("645061a", new Object[]{this, str, str2});
            return;
        }
        IHomeSubTabController e = e();
        if (e != null) {
            e.onRefreshStateChanged(str, str2);
        }
    }

    @Override // tb.nv, com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        IHomeSubTabController e = e();
        if (e != null) {
            e.onResume();
        }
    }

    @Override // tb.nv, com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public void onStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
            return;
        }
        this.f29260a.a0();
        IHomeSubTabController e = e();
        if (e != null) {
            e.onStart();
        }
    }

    @Override // tb.nv, com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public void onStop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3dde88", new Object[]{this});
            return;
        }
        this.f29260a.b0();
        IHomeSubTabController e = e();
        if (e != null) {
            e.onStop();
        }
    }

    @Override // tb.nv, com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public void onWillExit() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3bc02c16", new Object[]{this});
            return;
        }
        IHomeSubTabController e = e();
        if (e != null) {
            e.onWillExit();
        }
    }

    @Override // tb.nv, com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public void passThroughData(v7d v7dVar, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c0cdc44", new Object[]{this, v7dVar, str, str2});
            return;
        }
        waj wajVar = this.f29260a;
        if (wajVar != null) {
            wajVar.d0(v7dVar, str, str2);
        }
    }

    @Override // tb.nv, com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public synchronized View preCreateView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("7349eddf", new Object[]{this, context});
        }
        return this.f29260a.f0(context);
    }

    @Override // tb.nv, com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public void removePopMessageListenerByMain(IPopViewService.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e8fa476", new Object[]{this, aVar});
            return;
        }
        i0b N = this.f29260a.N();
        if (N != null) {
            N.removePopMessageListenerByMain(aVar);
        }
    }

    @Override // tb.nv, com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public boolean scrollToPositionWithOffset(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8f5c5ef5", new Object[]{this, new Integer(i), new Integer(i2)})).booleanValue();
        }
        IHomeSubTabController e = e();
        if (e != null) {
            return e.scrollToPositionWithOffset(i, i2);
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
        waj wajVar = this.f29260a;
        if (wajVar != null) {
            wajVar.n0(str);
        }
    }

    @Override // tb.nv, com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public boolean smoothScrollToPositionFromInfoFlow(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("89c0a6db", new Object[]{this, new Integer(i)})).booleanValue();
        }
        IHomeSubTabController e = e();
        if (e != null) {
            return e.smoothScrollToPositionFromInfoFlow(i);
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
        i0b N = this.f29260a.N();
        if (N != null) {
            N.triggerPopRemoveByMain(str);
        }
    }

    @Override // tb.nv, com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public void triggerPopShowByMain(int i, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b38f4fa", new Object[]{this, new Integer(i), jSONObject});
            return;
        }
        i0b N = this.f29260a.N();
        if (N != null) {
            N.triggerPopShowByMain(i, jSONObject);
        }
    }

    @Override // tb.nv, com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public void notifyOutLinkParams(Intent intent, String str) {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac20293", new Object[]{this, intent, str});
        } else if (intent == null) {
            d9j.c("MultiTabController", "notifyOutLinkParams intent == null");
        } else {
            Uri data = intent.getData();
            if (data == null) {
                d9j.c("MultiTabController", "notifyOutLinkParams uri == null");
                return;
            }
            boolean b = f4b.b("enableOutLinkNotifyParamInAdvance", true);
            if (b) {
                String queryParameter = data.getQueryParameter("categoryTabId");
                d9j.c("MultiTabController", "通知外链参数，categoryTabId： " + queryParameter);
                IHomeSubTabController Q = this.f29260a.Q(queryParameter);
                if (Q != null) {
                    Q.notifyOutLinkParams(intent, str);
                    d9j.c("MultiTabController", "onOutLinkJumped: ".concat(Q.getClass().getSimpleName()));
                    z = true;
                    this.f29260a.X(data, str, new a(b, z, intent, str));
                }
            }
            z = false;
            this.f29260a.X(data, str, new a(b, z, intent, str));
        }
    }
}
