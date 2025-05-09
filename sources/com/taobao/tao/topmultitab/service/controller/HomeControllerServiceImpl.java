package com.taobao.tao.topmultitab.service.controller;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.recommend3.gateway.model.response.AwesomeGetContainerData;
import com.taobao.tao.topmultitab.protocol.IHomeSubTabController;
import com.taobao.tao.topmultitab.service.bgcontainer.IBGContainerService;
import com.taobao.tao.topmultitab.service.controller.a;
import com.taobao.tao.topmultitab.service.pageprovider.IHomePageProviderService;
import com.taobao.tao.topmultitab.service.pulldown.IPullDownService;
import com.taobao.tao.topmultitab.service.searchbar.IHomeSearchBarService;
import com.taobao.tao.topmultitab.service.tabbar.ITabBarActionButtonService;
import com.taobao.tao.topmultitab.service.view.IHomeViewService;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import tb.b5b;
import tb.b9b;
import tb.bqa;
import tb.cfc;
import tb.d0p;
import tb.e0p;
import tb.fdc;
import tb.fve;
import tb.gnn;
import tb.kba;
import tb.mll;
import tb.muq;
import tb.oer;
import tb.ovq;
import tb.phg;
import tb.r5a;
import tb.rrs;
import tb.sfh;
import tb.t2o;
import tb.ucm;
import tb.vaj;
import tb.wcc;
import tb.xcc;
import tb.xti;
import tb.yyj;
import tb.z6d;
import tb.z9c;
import tb.zve;
import tb.zza;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class HomeControllerServiceImpl implements IHomeControllerService {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String IS_NEW_THEME_ENABLE = "isNew2021UIEnable";
    private static final String TAG = "HomeControllerService";
    private IHomeSubTabController lastTabController;
    private fdc mHomeTabContainerCallBack;
    private IHomeViewService.b mOnPageChangeListener;
    private IHomePageProviderService mPageProviderService;
    private IHomeViewService mViewService;
    private com.taobao.tao.topmultitab.service.controller.a overseaTopMultiTab;
    private mll pageCallback;
    private d0p searchBarCallback;
    private final ConcurrentHashMap<String, IHomeSubTabController> homeSubTabProtocol = new ConcurrentHashMap<>(2);
    private boolean mHasInit = false;
    private final ovq.c onBundleLoadListener = new b();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements a.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        public void a(String str, IHomeSubTabController iHomeSubTabController) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d626b61d", new Object[]{this, str, iHomeSubTabController});
            } else {
                HomeControllerServiceImpl.access$000(HomeControllerServiceImpl.this, str, iHomeSubTabController);
            }
        }

        public void b(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3d4475bd", new Object[]{this, str});
            } else {
                HomeControllerServiceImpl.this.unRegisterHomeSubTabController(str);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class b implements ovq.c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // tb.ovq.c
        public void b(IHomeSubTabController iHomeSubTabController) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("dbefd956", new Object[]{this, iHomeSubTabController});
                return;
            }
            HomeControllerServiceImpl.access$000(HomeControllerServiceImpl.this, "subscribe", iHomeSubTabController);
            if (HomeControllerServiceImpl.this.getCurrentSubTabController() == HomeControllerServiceImpl.this.getRealSubTabController("subscribe")) {
                HomeControllerServiceImpl.access$102(HomeControllerServiceImpl.this, iHomeSubTabController);
            }
            if (HomeControllerServiceImpl.access$200(HomeControllerServiceImpl.this) != null) {
                HomeControllerServiceImpl.access$200(HomeControllerServiceImpl.this).reRenderItem("subscribe");
            }
            if (HomeControllerServiceImpl.this.getCurrentSubTabController() == iHomeSubTabController) {
                iHomeSubTabController.onPageSelected();
                muq.b();
            }
        }

        @Override // tb.ovq.c
        public void onFail() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cd42bfa4", new Object[]{this});
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class c implements fdc {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ wcc f12803a;

        public c(wcc wccVar) {
            this.f12803a = wccVar;
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
            sfh.c("HomeControllerService", sb.toString());
            if (!HomeControllerServiceImpl.access$300(HomeControllerServiceImpl.this, iHomeSubTabController)) {
                r5a.i("Page_Home", 19999, "Page_HomePage_Subscribe_updateProperty", "");
                return;
            }
            z6d access$500 = HomeControllerServiceImpl.access$500(HomeControllerServiceImpl.this);
            if (access$500 != null) {
                r5a.t(access$500.k1(), map);
            }
        }

        @Override // tb.fdc
        public void B(IHomeSubTabController iHomeSubTabController, boolean z) {
            String str;
            IPullDownService iPullDownService;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("62f3fe73", new Object[]{this, iHomeSubTabController, new Boolean(z)});
                return;
            }
            StringBuilder sb = new StringBuilder("enableSecondFloor self : ");
            if (iHomeSubTabController == null) {
                str = null;
            } else {
                str = iHomeSubTabController.getClass().getSimpleName();
            }
            sb.append(str);
            sb.append(", isEnable : ");
            sb.append(z);
            sfh.c("HomeControllerService", sb.toString());
            if (HomeControllerServiceImpl.access$300(HomeControllerServiceImpl.this, iHomeSubTabController) && (iPullDownService = (IPullDownService) this.f12803a.a(IPullDownService.class)) != null) {
                iPullDownService.setEnableToSecondFloor(z);
            }
        }

        @Override // tb.fdc
        public List<String> C(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (List) ipChange.ipc$dispatch("57fb0188", new Object[]{this, str});
            }
            if (TextUtils.equals(str, "getSelectPopWebUrl")) {
                return e0p.n();
            }
            return null;
        }

        @Override // tb.fdc
        public float D(IHomeSubTabController iHomeSubTabController) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("f078534e", new Object[]{this, iHomeSubTabController})).floatValue();
            }
            if (HomeControllerServiceImpl.access$600(HomeControllerServiceImpl.this) == null) {
                return 0.0f;
            }
            if (!(iHomeSubTabController instanceof gnn)) {
                return HomeControllerServiceImpl.access$600(HomeControllerServiceImpl.this).a();
            }
            gnn gnnVar = (gnn) iHomeSubTabController;
            boolean f = gnnVar.f();
            boolean d = gnnVar.d();
            fve.e("HomeControllerService", "subscribe -> getSearchBarHeight isSelectSubscribe:" + f + ",isCreatingSubscribe:" + d);
            if (!gnnVar.a() || (!f && !d)) {
                return HomeControllerServiceImpl.access$600(HomeControllerServiceImpl.this).a();
            }
            return 0.0f;
        }

        @Override // tb.fdc
        public JSONObject E(IHomeSubTabController iHomeSubTabController) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (JSONObject) ipChange.ipc$dispatch("cf42b524", new Object[]{this, iHomeSubTabController});
            }
            if (HomeControllerServiceImpl.access$600(HomeControllerServiceImpl.this) == null) {
                return null;
            }
            return HomeControllerServiceImpl.access$600(HomeControllerServiceImpl.this).e(iHomeSubTabController);
        }

        @Override // tb.fdc
        public void F(IHomeSubTabController iHomeSubTabController) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a79ae84a", new Object[]{this, iHomeSubTabController});
            } else if (HomeControllerServiceImpl.access$600(HomeControllerServiceImpl.this) != null) {
                if (!HomeControllerServiceImpl.access$400(HomeControllerServiceImpl.this)) {
                    HomeControllerServiceImpl.access$600(HomeControllerServiceImpl.this).i(iHomeSubTabController);
                } else if (!TextUtils.equals(iHomeSubTabController.getCurrentSubContainerType(), "subscribe")) {
                    HomeControllerServiceImpl.access$600(HomeControllerServiceImpl.this).i(iHomeSubTabController);
                }
            }
        }

        @Override // tb.fdc
        public JSONObject G(IHomeSubTabController iHomeSubTabController) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (JSONObject) ipChange.ipc$dispatch("9450efb0", new Object[]{this, iHomeSubTabController});
            }
            if (HomeControllerServiceImpl.access$600(HomeControllerServiceImpl.this) == null) {
                return null;
            }
            return HomeControllerServiceImpl.access$600(HomeControllerServiceImpl.this).f(iHomeSubTabController);
        }

        @Override // tb.fdc
        public void H(IHomeSubTabController iHomeSubTabController, View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a2276024", new Object[]{this, iHomeSubTabController, view});
                return;
            }
            IBGContainerService iBGContainerService = (IBGContainerService) this.f12803a.a(IBGContainerService.class);
            if (iBGContainerService == null) {
                bqa.d("HomeControllerService", "setBgView bgContainerManager == null");
            } else {
                iBGContainerService.setBgView(view);
            }
        }

        @Override // tb.fdc
        public void I(IHomeSubTabController iHomeSubTabController, String str) {
            ITabBarActionButtonService iTabBarActionButtonService;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e70e505b", new Object[]{this, iHomeSubTabController, str});
                return;
            }
            StringBuilder sb = new StringBuilder("setTabBarActionButtonState self : ");
            sb.append(iHomeSubTabController == null ? null : iHomeSubTabController.getClass().getSimpleName());
            sb.append(", TabBarButtonShowState : ");
            sb.append(str);
            sfh.c("HomeControllerService", sb.toString());
            if (HomeControllerServiceImpl.access$300(HomeControllerServiceImpl.this, iHomeSubTabController) && (iTabBarActionButtonService = (ITabBarActionButtonService) this.f12803a.a(ITabBarActionButtonService.class)) != null) {
                iTabBarActionButtonService.setTabBarActionButtonState(str);
            }
        }

        @Override // tb.fdc
        public int J(IHomeSubTabController iHomeSubTabController) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("b6879045", new Object[]{this, iHomeSubTabController})).intValue();
            }
            IBGContainerService iBGContainerService = (IBGContainerService) this.f12803a.a(IBGContainerService.class);
            if (iBGContainerService != null) {
                return iBGContainerService.getCurrentBgViewId();
            }
            bqa.d("HomeControllerService", "getCurrentBgViewId bgContainerManager == null");
            return -1;
        }

        @Override // tb.fdc
        public int K(IHomeSubTabController iHomeSubTabController) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("3de7d79b", new Object[]{this, iHomeSubTabController})).intValue();
            }
            IBGContainerService iBGContainerService = (IBGContainerService) this.f12803a.a(IBGContainerService.class);
            if (iBGContainerService == null) {
                return 0;
            }
            return iBGContainerService.getLastHeaderScrollDistance();
        }

        @Override // tb.fdc
        public void L(IHomeSubTabController iHomeSubTabController, String str) {
            z6d access$500;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1cd3edce", new Object[]{this, iHomeSubTabController, str});
                return;
            }
            StringBuilder sb = new StringBuilder("updatePageUtparam self : ");
            sb.append(iHomeSubTabController == null ? null : iHomeSubTabController.getClass().getSimpleName());
            sb.append(", aPageUtparam : ");
            sb.append(str);
            sfh.c("HomeControllerService", sb.toString());
            if (HomeControllerServiceImpl.access$300(HomeControllerServiceImpl.this, iHomeSubTabController) && (access$500 = HomeControllerServiceImpl.access$500(HomeControllerServiceImpl.this)) != null) {
                r5a.u(access$500.k1(), str);
            }
        }

        @Override // tb.fdc
        public Fragment a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Fragment) ipChange.ipc$dispatch("bc1dab59", new Object[]{this});
            }
            z6d access$500 = HomeControllerServiceImpl.access$500(HomeControllerServiceImpl.this);
            if (access$500 instanceof Fragment) {
                return (Fragment) access$500;
            }
            return null;
        }

        @Override // tb.fdc
        public int d() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("e67f5875", new Object[]{this})).intValue();
            }
            if (HomeControllerServiceImpl.access$600(HomeControllerServiceImpl.this) == null) {
                return 0;
            }
            return HomeControllerServiceImpl.access$600(HomeControllerServiceImpl.this).h();
        }

        @Override // tb.fdc
        public String e() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("f716939", new Object[]{this});
            }
            if (e0p.o()) {
                return vaj.KEY_EMBED_SEARCH_BAR;
            }
            return "topMutliTab";
        }

        @Override // tb.fdc
        public Context f() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Context) ipChange.ipc$dispatch("c69c0cdc", new Object[]{this});
            }
            z6d access$500 = HomeControllerServiceImpl.access$500(HomeControllerServiceImpl.this);
            if (access$500 == null) {
                return null;
            }
            return access$500.k1();
        }

        @Override // tb.fdc
        public void g(zve zveVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("69759066", new Object[]{this, zveVar});
            } else {
                ucm.f(zveVar);
            }
        }

        @Override // tb.fdc
        public z9c getGlobalExtModel() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (z9c) ipChange.ipc$dispatch("532d2c9e", new Object[]{this});
            }
            return kba.a();
        }

        @Override // tb.fdc
        public View h(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (View) ipChange.ipc$dispatch("64e717e3", new Object[]{this, str});
            }
            IHomeSearchBarService iHomeSearchBarService = (IHomeSearchBarService) this.f12803a.a(IHomeSearchBarService.class);
            if (iHomeSearchBarService != null && TextUtils.equals(str, e0p.h())) {
                return iHomeSearchBarService.getDX3SearchView();
            }
            return null;
        }

        @Override // tb.fdc
        public boolean isAdaptHudScreen() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("11522a16", new Object[]{this})).booleanValue();
            }
            return b9b.b();
        }

        @Override // tb.fdc
        public boolean j(View view, ViewGroup.LayoutParams layoutParams) {
            z6d access$500;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("50f5465e", new Object[]{this, view, layoutParams})).booleanValue();
            }
            if (view == null || (access$500 = HomeControllerServiceImpl.access$500(HomeControllerServiceImpl.this)) == null) {
                return false;
            }
            View rootView = access$500.getRootView();
            if (!(rootView instanceof ViewGroup)) {
                return false;
            }
            if (layoutParams == null) {
                layoutParams = new ViewGroup.LayoutParams(-2, -2);
            }
            ((ViewGroup) rootView).addView(view, layoutParams);
            return true;
        }

        @Override // tb.fdc
        public Map<String, Integer> k(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Map) ipChange.ipc$dispatch("5b799bd5", new Object[]{this, str, str2});
            }
            if (HomeControllerServiceImpl.access$600(HomeControllerServiceImpl.this) == null) {
                return null;
            }
            return HomeControllerServiceImpl.access$600(HomeControllerServiceImpl.this).c(str, str2);
        }

        @Override // tb.fdc
        public String l() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("22cee907", new Object[]{this});
            }
            if (HomeControllerServiceImpl.access$200(HomeControllerServiceImpl.this) == null) {
                return null;
            }
            return HomeControllerServiceImpl.access$200(HomeControllerServiceImpl.this).getTypeByPos(HomeControllerServiceImpl.access$200(HomeControllerServiceImpl.this).getCurrentTabIndex());
        }

        @Override // tb.fdc
        public boolean m() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("1b9831f6", new Object[]{this})).booleanValue();
            }
            JSONObject A = zza.c().A();
            if (A == null) {
                return false;
            }
            return A.getBooleanValue("enableInfoFlowScale");
        }

        @Override // tb.fdc
        public boolean n() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("58c4938", new Object[]{this})).booleanValue();
            }
            if (HomeControllerServiceImpl.access$700(HomeControllerServiceImpl.this) == null) {
                return false;
            }
            return HomeControllerServiceImpl.access$700(HomeControllerServiceImpl.this).b();
        }

        @Override // tb.fdc
        public String q() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("4ced540f", new Object[]{this});
            }
            return rrs.c("home");
        }

        @Override // tb.fdc
        public boolean r(IHomeSubTabController iHomeSubTabController) {
            String str;
            IPullDownService iPullDownService;
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
            sfh.c("HomeControllerService", sb.toString());
            if (HomeControllerServiceImpl.access$300(HomeControllerServiceImpl.this, iHomeSubTabController) && (iPullDownService = (IPullDownService) this.f12803a.a(IPullDownService.class)) != null) {
                return iPullDownService.isRefreshing();
            }
            return false;
        }

        @Override // tb.fdc
        public void s(IHomeSubTabController iHomeSubTabController, boolean z) {
            IBGContainerService iBGContainerService;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2620dcad", new Object[]{this, iHomeSubTabController, new Boolean(z)});
                return;
            }
            sfh.c("HomeControllerService", "onReachTopChanged() called with: isReachTop = [" + z + "]");
            if (HomeControllerServiceImpl.access$300(HomeControllerServiceImpl.this, iHomeSubTabController) && (iBGContainerService = (IBGContainerService) this.f12803a.a(IBGContainerService.class)) != null) {
                iBGContainerService.updateHeaderView();
            }
        }

        @Override // tb.fdc
        public void t(IHomeSubTabController iHomeSubTabController, JSONObject jSONObject) {
            IHomeSearchBarService iHomeSearchBarService;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1a20659e", new Object[]{this, iHomeSubTabController, jSONObject});
            } else if (HomeControllerServiceImpl.access$300(HomeControllerServiceImpl.this, iHomeSubTabController) && e0p.o() && (iHomeSearchBarService = (IHomeSearchBarService) this.f12803a.a(IHomeSearchBarService.class)) != null) {
                iHomeSearchBarService.refreshSearchBox(jSONObject);
            }
        }

        @Override // tb.fdc
        public JSONObject v(IHomeSubTabController iHomeSubTabController) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (JSONObject) ipChange.ipc$dispatch("a39b1c41", new Object[]{this, iHomeSubTabController});
            }
            if (HomeControllerServiceImpl.access$200(HomeControllerServiceImpl.this) == null || HomeControllerServiceImpl.access$600(HomeControllerServiceImpl.this) == null) {
                return null;
            }
            fve.e("HomeControllerService", "getSelfTabInformation,self: " + iHomeSubTabController);
            String subControllerType = HomeControllerServiceImpl.this.getSubControllerType(iHomeSubTabController);
            if (!TextUtils.isEmpty(subControllerType)) {
                return HomeControllerServiceImpl.access$600(HomeControllerServiceImpl.this).d(HomeControllerServiceImpl.access$200(HomeControllerServiceImpl.this).getPosByType(subControllerType));
            }
            fve.e("HomeControllerService", "subType == null");
            return null;
        }

        @Override // tb.fdc
        public void w(IHomeSubTabController iHomeSubTabController, boolean z) {
            ITabBarActionButtonService iTabBarActionButtonService;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("140af775", new Object[]{this, iHomeSubTabController, new Boolean(z)});
                return;
            }
            StringBuilder sb = new StringBuilder("setRocketState self : ");
            sb.append(iHomeSubTabController == null ? null : iHomeSubTabController.getClass().getSimpleName());
            sb.append(", isRocket : ");
            sb.append(z);
            sfh.c("HomeControllerService", sb.toString());
            if (HomeControllerServiceImpl.access$300(HomeControllerServiceImpl.this, iHomeSubTabController) && (iTabBarActionButtonService = (ITabBarActionButtonService) this.f12803a.a(ITabBarActionButtonService.class)) != null) {
                iTabBarActionButtonService.setRocketState(z);
            }
        }

        @Override // tb.fdc
        public JSONObject x(IHomeSubTabController iHomeSubTabController) {
            JSONObject ext;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (JSONObject) ipChange.ipc$dispatch("3304e87a", new Object[]{this, iHomeSubTabController});
            }
            AwesomeGetContainerData u = zza.c().u(yyj.e().f());
            if (u == null || (ext = u.getExt()) == null) {
                return null;
            }
            return ext.getJSONObject("globalTheme");
        }

        @Override // tb.fdc
        public void y(IHomeSubTabController iHomeSubTabController, boolean z) {
            String str;
            IPullDownService iPullDownService;
            boolean z2;
            boolean z3;
            boolean z4;
            boolean z5 = true;
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
            sfh.c("HomeControllerService", sb.toString());
            if (!HomeControllerServiceImpl.access$300(HomeControllerServiceImpl.this, iHomeSubTabController) || (iPullDownService = (IPullDownService) this.f12803a.a(IPullDownService.class)) == null) {
                return;
            }
            if (HomeControllerServiceImpl.access$400(HomeControllerServiceImpl.this)) {
                gnn gnnVar = (gnn) HomeControllerServiceImpl.this.getCurrentSubTabController();
                boolean e = gnnVar.e();
                if (!e || !z) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                iPullDownService.setEnablePullRefresh(z2);
                StringBuilder sb2 = new StringBuilder("enablePullReFresh TopPullRefresh : ");
                if (!e || !z) {
                    z3 = false;
                } else {
                    z3 = true;
                }
                sb2.append(z3);
                sb2.append(", isMultiTab : ");
                if (e || !z) {
                    z4 = false;
                } else {
                    z4 = true;
                }
                sb2.append(z4);
                sfh.c("HomeControllerService", sb2.toString());
                if (e || !z) {
                    z5 = false;
                }
                gnnVar.b(z5);
                return;
            }
            iPullDownService.setEnablePullRefresh(z);
        }

        @Override // tb.fdc
        public void z(IHomeSubTabController iHomeSubTabController) {
            String str;
            IPullDownService iPullDownService;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("93f6d4b1", new Object[]{this, iHomeSubTabController});
                return;
            }
            StringBuilder sb = new StringBuilder("IHomeSubTabController self : ");
            if (iHomeSubTabController == null) {
                str = null;
            } else {
                str = iHomeSubTabController.getClass().getSimpleName();
            }
            sb.append(str);
            sfh.c("HomeControllerService", sb.toString());
            if (!HomeControllerServiceImpl.access$300(HomeControllerServiceImpl.this, iHomeSubTabController) || (iPullDownService = (IPullDownService) this.f12803a.a(IPullDownService.class)) == null) {
                return;
            }
            if (HomeControllerServiceImpl.access$400(HomeControllerServiceImpl.this)) {
                gnn gnnVar = (gnn) HomeControllerServiceImpl.this.getCurrentSubTabController();
                if (!gnnVar.e()) {
                    gnnVar.h(true);
                } else {
                    iPullDownService.setRefreshing(true);
                }
            } else {
                iPullDownService.setRefreshing(true);
            }
        }

        @Override // tb.fdc
        public void u(IHomeSubTabController iHomeSubTabController) {
            IPullDownService iPullDownService;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e61e41ec", new Object[]{this, iHomeSubTabController});
                return;
            }
            StringBuilder sb = new StringBuilder("refreshFinish self : ");
            sb.append(iHomeSubTabController == null ? null : iHomeSubTabController.getClass().getSimpleName());
            sfh.c("HomeControllerService", sb.toString());
            if (!HomeControllerServiceImpl.access$300(HomeControllerServiceImpl.this, iHomeSubTabController) || (iPullDownService = (IPullDownService) this.f12803a.a(IPullDownService.class)) == null) {
                return;
            }
            if (HomeControllerServiceImpl.access$400(HomeControllerServiceImpl.this)) {
                gnn gnnVar = (gnn) HomeControllerServiceImpl.this.getCurrentSubTabController();
                if (!gnnVar.e()) {
                    gnnVar.h(false);
                } else {
                    iPullDownService.setRefreshing(false);
                }
            } else {
                iPullDownService.setRefreshing(false);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class d extends IHomeViewService.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public d() {
        }

        public static /* synthetic */ Object ipc$super(d dVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/topmultitab/service/controller/HomeControllerServiceImpl$4");
        }

        @Override // com.taobao.tao.topmultitab.service.view.IHomeViewService.a, com.taobao.tao.topmultitab.service.view.IHomeViewService.b
        public void onPageSelected(int i, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("db26523d", new Object[]{this, new Integer(i), str});
                return;
            }
            if (HomeControllerServiceImpl.access$100(HomeControllerServiceImpl.this) != null) {
                HomeControllerServiceImpl.access$100(HomeControllerServiceImpl.this).onPageUnSelected();
            }
            IHomeSubTabController currentSubTabController = HomeControllerServiceImpl.this.getCurrentSubTabController();
            if (currentSubTabController != null) {
                currentSubTabController.onPageSelected();
            }
            HomeControllerServiceImpl homeControllerServiceImpl = HomeControllerServiceImpl.this;
            HomeControllerServiceImpl.access$102(homeControllerServiceImpl, homeControllerServiceImpl.getCurrentSubTabController());
        }
    }

    static {
        t2o.a(729810166);
        t2o.a(729810171);
    }

    public static /* synthetic */ void access$000(HomeControllerServiceImpl homeControllerServiceImpl, String str, IHomeSubTabController iHomeSubTabController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70c7bb8c", new Object[]{homeControllerServiceImpl, str, iHomeSubTabController});
        } else {
            homeControllerServiceImpl.registerHomeSubTabController(str, iHomeSubTabController);
        }
    }

    public static /* synthetic */ IHomeSubTabController access$100(HomeControllerServiceImpl homeControllerServiceImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IHomeSubTabController) ipChange.ipc$dispatch("689e0d9b", new Object[]{homeControllerServiceImpl});
        }
        return homeControllerServiceImpl.lastTabController;
    }

    public static /* synthetic */ IHomeSubTabController access$102(HomeControllerServiceImpl homeControllerServiceImpl, IHomeSubTabController iHomeSubTabController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IHomeSubTabController) ipChange.ipc$dispatch("6fe1c86a", new Object[]{homeControllerServiceImpl, iHomeSubTabController});
        }
        homeControllerServiceImpl.lastTabController = iHomeSubTabController;
        return iHomeSubTabController;
    }

    public static /* synthetic */ IHomeViewService access$200(HomeControllerServiceImpl homeControllerServiceImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IHomeViewService) ipChange.ipc$dispatch("af4fc0c2", new Object[]{homeControllerServiceImpl});
        }
        return homeControllerServiceImpl.mViewService;
    }

    public static /* synthetic */ boolean access$300(HomeControllerServiceImpl homeControllerServiceImpl, IHomeSubTabController iHomeSubTabController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5981e71d", new Object[]{homeControllerServiceImpl, iHomeSubTabController})).booleanValue();
        }
        return homeControllerServiceImpl.isEnableSubTabCallback(iHomeSubTabController);
    }

    public static /* synthetic */ boolean access$400(HomeControllerServiceImpl homeControllerServiceImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bb7575ab", new Object[]{homeControllerServiceImpl})).booleanValue();
        }
        return homeControllerServiceImpl.isMultiTab();
    }

    public static /* synthetic */ z6d access$500(HomeControllerServiceImpl homeControllerServiceImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (z6d) ipChange.ipc$dispatch("ac231f38", new Object[]{homeControllerServiceImpl});
        }
        return homeControllerServiceImpl.getPageProvider();
    }

    public static /* synthetic */ d0p access$600(HomeControllerServiceImpl homeControllerServiceImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d0p) ipChange.ipc$dispatch("4ee85a08", new Object[]{homeControllerServiceImpl});
        }
        return homeControllerServiceImpl.searchBarCallback;
    }

    public static /* synthetic */ mll access$700(HomeControllerServiceImpl homeControllerServiceImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mll) ipChange.ipc$dispatch("d20ade09", new Object[]{homeControllerServiceImpl});
        }
        return homeControllerServiceImpl.pageCallback;
    }

    private IHomeSubTabController createHomeSubTabController(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IHomeSubTabController) ipChange.ipc$dispatch("21a8022e", new Object[]{this, str});
        }
        str.hashCode();
        if (str.equals("campaign")) {
            return new b5b(this.mHomeTabContainerCallBack, "campaign");
        }
        if (!str.equals(IHomeControllerService.HOME_TAB_ID_HOUR_DELIVERY)) {
            return null;
        }
        return new oer(this.mHomeTabContainerCallBack);
    }

    private IHomeViewService.b createOnPageChangeListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IHomeViewService.b) ipChange.ipc$dispatch("83b2b44a", new Object[]{this});
        }
        return new d();
    }

    private z6d getPageProvider() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (z6d) ipChange.ipc$dispatch("de13c8c1", new Object[]{this});
        }
        IHomePageProviderService iHomePageProviderService = this.mPageProviderService;
        if (iHomePageProviderService != null) {
            return iHomePageProviderService.getPageProvider();
        }
        return null;
    }

    private void initHomeSubTabController(wcc wccVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("40aea8f8", new Object[]{this, wccVar});
            return;
        }
        this.mHomeTabContainerCallBack = initHomeTabContainerCallBack(wccVar);
        this.searchBarCallback = new d0p();
        this.pageCallback = new mll();
        this.overseaTopMultiTab = new com.taobao.tao.topmultitab.service.controller.a(new a());
        long elapsedRealtime = SystemClock.elapsedRealtime();
        gnn gnnVar = new gnn(this.mHomeTabContainerCallBack, xti.TAB_ID_MAINLAND_RECOMMEND_MICROSERVICES, wccVar);
        fve.e("HomeControllerService", "大陆Controller 构建耗时：" + (SystemClock.elapsedRealtime() - elapsedRealtime));
        registerHomeSubTabController(xti.TAB_ID_MAINLAND_RECOMMEND_MICROSERVICES, gnnVar);
        registerHomeSubTabController("subscribe", new ovq(this.mHomeTabContainerCallBack, this.onBundleLoadListener));
        this.overseaTopMultiTab.c(this.mHomeTabContainerCallBack);
    }

    private fdc initHomeTabContainerCallBack(wcc wccVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (fdc) ipChange.ipc$dispatch("72c27e09", new Object[]{this, wccVar});
        }
        return new c(wccVar);
    }

    private boolean isCurrentTab(IHomeSubTabController iHomeSubTabController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d741da18", new Object[]{this, iHomeSubTabController})).booleanValue();
        }
        if (iHomeSubTabController == getCurrentSubTabController()) {
            return true;
        }
        return false;
    }

    private boolean isMultiTab() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5ad8471", new Object[]{this})).booleanValue();
        }
        IHomeSubTabController currentSubTabController = getCurrentSubTabController();
        if (currentSubTabController instanceof gnn) {
            return ((gnn) currentSubTabController).g();
        }
        return false;
    }

    @Override // com.taobao.tao.topmultitab.service.controller.IHomeControllerService
    public void checkLoadSubscribeBundle() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f9eb005", new Object[]{this});
            return;
        }
        IHomeSubTabController currentSubTabController = getCurrentSubTabController();
        if (!(currentSubTabController instanceof gnn) || !((gnn) currentSubTabController).a()) {
            sfh.d("HomeControllerService", "checkLoadSubscribeBundle 触发 远程化下载");
            IHomeSubTabController realSubTabController = getRealSubTabController("subscribe");
            if (!(realSubTabController instanceof ovq)) {
                sfh.d("HomeControllerService", "订阅已经最新，无需加载");
                return;
            }
            ovq ovqVar = (ovq) realSubTabController;
            z6d pageProvider = getPageProvider();
            if (pageProvider == null || pageProvider.k1() == null) {
                sfh.d("HomeControllerService", "首页 Activity 未准备好，无法加载订阅bundle");
            } else {
                ovqVar.f(pageProvider.k1());
            }
        } else {
            sfh.d("HomeControllerService", "checkLoadSubscribeBundle 分类tab不触发 远程化下载");
        }
    }

    @Override // com.taobao.tao.topmultitab.service.controller.IHomeControllerService
    public Map<String, IHomeSubTabController> getControllers() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("6f58cf5d", new Object[]{this});
        }
        return new HashMap(this.homeSubTabProtocol);
    }

    @Override // com.taobao.tao.topmultitab.service.controller.IHomeControllerService
    public IHomeSubTabController getCurrentSubTabController() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IHomeSubTabController) ipChange.ipc$dispatch("7c3a56ec", new Object[]{this});
        }
        IHomeViewService iHomeViewService = this.mViewService;
        if (iHomeViewService == null) {
            return null;
        }
        String typeByPos = iHomeViewService.getTypeByPos(iHomeViewService.getCurrentTabIndex());
        if (TextUtils.isEmpty(typeByPos)) {
            return null;
        }
        return getRealSubTabController(typeByPos);
    }

    @Override // com.taobao.tao.topmultitab.service.controller.IHomeControllerService
    public IHomeSubTabController getHomeSubTabController(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IHomeSubTabController) ipChange.ipc$dispatch("f6ed7b88", new Object[]{this, str});
        }
        String c2 = rrs.c(str);
        bqa.d("HomeControllerService", "getHomeSubTabController subTabType：" + c2);
        return getRealSubTabController(c2);
    }

    @Override // com.taobao.tao.topmultitab.service.controller.IHomeControllerService
    public IHomeSubTabController getLastTabController() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IHomeSubTabController) ipChange.ipc$dispatch("3742867d", new Object[]{this});
        }
        return this.lastTabController;
    }

    @Override // com.taobao.tao.topmultitab.service.controller.IHomeControllerService
    public IHomeSubTabController getRealSubTabController(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IHomeSubTabController) ipChange.ipc$dispatch("f0f1ac47", new Object[]{this, str});
        }
        if (!TextUtils.isEmpty(str)) {
            return this.homeSubTabProtocol.get(str);
        }
        bqa.d("HomeControllerService", "getRealSubTabController subTabFlag == null");
        return null;
    }

    @Override // com.taobao.tao.topmultitab.service.controller.IHomeControllerService
    public String getSubControllerType(IHomeSubTabController iHomeSubTabController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("84eff386", new Object[]{this, iHomeSubTabController});
        }
        if (iHomeSubTabController == null) {
            return null;
        }
        for (Map.Entry<String, IHomeSubTabController> entry : this.homeSubTabProtocol.entrySet()) {
            String key = entry.getKey();
            if (entry.getValue().equals(iHomeSubTabController)) {
                return rrs.g(key);
            }
        }
        return null;
    }

    @Override // com.taobao.tao.topmultitab.service.controller.IHomeControllerService
    public boolean hotSwitchContainer(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("42fdf7ad", new Object[]{this, jSONObject})).booleanValue();
        }
        com.taobao.tao.topmultitab.service.controller.a aVar = this.overseaTopMultiTab;
        if (aVar != null) {
            return aVar.b(jSONObject);
        }
        return false;
    }

    @Override // com.taobao.tao.topmultitab.service.controller.IHomeControllerService
    public void initOverseaTabController() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ef098c8d", new Object[]{this});
            return;
        }
        com.taobao.tao.topmultitab.service.controller.a aVar = this.overseaTopMultiTab;
        if (aVar != null) {
            aVar.c(this.mHomeTabContainerCallBack);
        }
    }

    @Override // com.taobao.tao.topmultitab.service.controller.IHomeControllerService
    public boolean isAtRecommendTab() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("afb30a61", new Object[]{this})).booleanValue();
        }
        if (isMultiTab()) {
            return ((gnn) getCurrentSubTabController()).e();
        }
        return xti.c();
    }

    @Override // com.taobao.tao.topmultitab.service.base.IHomePageService, com.taobao.infoflow.protocol.subservice.ISubService
    public /* synthetic */ void onCreateService(cfc cfcVar) {
        xcc.a(this, cfcVar);
    }

    @Override // com.taobao.tao.topmultitab.service.base.IHomeStaticService, com.taobao.infoflow.protocol.subservice.ISubService
    public void onDestroyService() {
        IHomeViewService.b bVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("770ac0a1", new Object[]{this});
            return;
        }
        this.overseaTopMultiTab.a();
        this.lastTabController = null;
        IHomeViewService iHomeViewService = this.mViewService;
        if (iHomeViewService != null && (bVar = this.mOnPageChangeListener) != null) {
            iHomeViewService.removeOnPageChangeListener(bVar);
            this.mViewService = null;
        }
    }

    @Override // com.taobao.tao.topmultitab.service.controller.IHomeControllerService
    public void registerHomeSubTabController(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("78b3e344", new Object[]{this, str});
        } else if (!TextUtils.isEmpty(str) && !this.homeSubTabProtocol.containsKey(str)) {
            registerHomeSubTabController(str, createHomeSubTabController(str));
        }
    }

    @Override // com.taobao.tao.topmultitab.service.controller.IHomeControllerService
    public void unRegisterHomeSubTabController(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3d4475bd", new Object[]{this, str});
        } else if (!TextUtils.isEmpty(str) && this.homeSubTabProtocol.containsKey(str)) {
            bqa.d("HomeControllerService", "unRegisterHomeSubTabController,subTabFlag: " + str);
            this.homeSubTabProtocol.remove(str);
        }
    }

    @Override // com.taobao.tao.topmultitab.service.base.IHomePageService
    public void onCreateService(wcc wccVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("312ad712", new Object[]{this, wccVar});
            return;
        }
        phg.m("HomeControllerServiceImpl");
        this.mViewService = (IHomeViewService) wccVar.a(IHomeViewService.class);
        this.mPageProviderService = (IHomePageProviderService) wccVar.a(IHomePageProviderService.class);
        if (this.mViewService != null) {
            IHomeViewService.b createOnPageChangeListener = createOnPageChangeListener();
            this.mOnPageChangeListener = createOnPageChangeListener;
            this.mViewService.addOnPageChangeListener(createOnPageChangeListener);
        }
        if (!this.mHasInit) {
            initHomeSubTabController(wccVar);
            this.mHasInit = true;
        }
        phg.l("HomeControllerServiceImpl");
    }

    private boolean isEnableSubTabCallback(IHomeSubTabController iHomeSubTabController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1f97a8d7", new Object[]{this, iHomeSubTabController})).booleanValue();
        }
        if (isCurrentTab(iHomeSubTabController)) {
            return true;
        }
        StringBuilder sb = new StringBuilder("【异常】不在当前页调用了回调！！! ");
        sb.append(iHomeSubTabController == null ? null : iHomeSubTabController.getClass().getSimpleName());
        sfh.d("HomeControllerService", sb.toString());
        return false;
    }

    @Override // com.taobao.tao.topmultitab.service.controller.IHomeControllerService
    public boolean isSubscribeTab() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e9b94240", new Object[]{this})).booleanValue();
        }
        if (isMultiTab()) {
            gnn gnnVar = (gnn) getCurrentSubTabController();
            if (gnnVar.a()) {
                return gnnVar.f();
            }
        }
        return this.homeSubTabProtocol.get("subscribe") == this.lastTabController;
    }

    private void registerHomeSubTabController(String str, IHomeSubTabController iHomeSubTabController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d626b61d", new Object[]{this, str, iHomeSubTabController});
        } else if (!TextUtils.isEmpty(str) && iHomeSubTabController != null) {
            bqa.d("HomeControllerService", "registerHomeSubTabController,subTabFlag: " + str + ",containerProvider:" + iHomeSubTabController);
            this.homeSubTabProtocol.put(str, iHomeSubTabController);
        }
    }
}
