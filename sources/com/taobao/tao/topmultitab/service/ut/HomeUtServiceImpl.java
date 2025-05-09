package com.taobao.tao.topmultitab.service.ut;

import android.content.Intent;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.homepage.view.widgets.ViewPagerFakeDragView;
import com.taobao.tao.topmultitab.protocol.IHomeSubTabController;
import com.taobao.tao.topmultitab.service.controller.IHomeControllerService;
import com.taobao.tao.topmultitab.service.data.IHomeDataService;
import com.taobao.tao.topmultitab.service.lifecycle.IHomePageLifecycleService;
import com.taobao.tao.topmultitab.service.lifecycle.listener.IPageLifeCycle;
import com.taobao.tao.topmultitab.service.pageprovider.IHomePageProviderService;
import com.taobao.tao.topmultitab.service.view.IHomeViewService;
import tb.cfc;
import tb.e0p;
import tb.h8x;
import tb.imn;
import tb.lq6;
import tb.q4d;
import tb.r5a;
import tb.rvk;
import tb.sfh;
import tb.t2o;
import tb.v20;
import tb.w4b;
import tb.wcc;
import tb.xcc;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class HomeUtServiceImpl implements IHomeUtService {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "HomeUtService";
    private IHomeControllerService mControllerService;
    private IHomeDataService mDataService;
    private wcc mHomePageContext;
    private IHomeViewService mHomeViewService;
    private IHomePageLifecycleService mLifecycleService;
    private IHomeViewService.b mOnPageChangeListener;
    private q4d mOutLinker;
    private IPageLifeCycle mPageLifeCycle;
    private IHomePageProviderService mPageProviderService;
    private rvk mUiRefreshListener;
    private boolean manualDragging = false;
    private int oldPosition = 1;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a extends v20 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/topmultitab/service/ut/HomeUtServiceImpl$1");
        }

        @Override // tb.v20, com.taobao.tao.topmultitab.service.lifecycle.listener.IPageLifeCycle
        public void onPause() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            } else if (!h8x.a()) {
                w4b.a(HomeUtServiceImpl.access$100(HomeUtServiceImpl.this));
            }
        }

        @Override // tb.v20, com.taobao.tao.topmultitab.service.lifecycle.listener.IPageLifeCycle
        public void onResume(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("72eca07d", new Object[]{this, str});
            } else if (HomeUtServiceImpl.access$000(HomeUtServiceImpl.this) != null) {
                IHomeSubTabController currentSubTabController = HomeUtServiceImpl.access$000(HomeUtServiceImpl.this).getCurrentSubTabController();
                if (!h8x.a() && currentSubTabController != null) {
                    w4b.i(currentSubTabController, HomeUtServiceImpl.access$100(HomeUtServiceImpl.this));
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class b implements q4d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // tb.q4d
        public void onOutLink(String str, Intent intent, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1dd04721", new Object[]{this, str, intent, str2});
            } else if (HomeUtServiceImpl.access$000(HomeUtServiceImpl.this) != null) {
                w4b.i(HomeUtServiceImpl.access$000(HomeUtServiceImpl.this).getCurrentSubTabController(), HomeUtServiceImpl.access$100(HomeUtServiceImpl.this));
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class c implements rvk {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // tb.rvk
        public void a(imn imnVar, JSONObject jSONObject, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a163b5e6", new Object[]{this, imnVar, jSONObject, str});
            }
        }

        @Override // tb.rvk
        public void b(imn imnVar, JSONObject jSONObject, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b0e63fb7", new Object[]{this, imnVar, jSONObject, str});
                return;
            }
            String string = jSONObject.getString("dataSourceType");
            String string2 = jSONObject.getString("dataChangeType");
            if (TextUtils.equals(string, "local") && TextUtils.equals(string2, "base")) {
                lq6.a().c("homepage", "homePageCacheRender");
                sfh.f("HomeUtService", "NewDataRefreshSubscriber.homePageCacheRender");
            }
            w4b.h(imnVar, HomeUtServiceImpl.access$200(HomeUtServiceImpl.this));
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
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/topmultitab/service/ut/HomeUtServiceImpl$4");
        }

        @Override // com.taobao.tao.topmultitab.service.view.IHomeViewService.a, com.taobao.tao.topmultitab.service.view.IHomeViewService.b
        public void onPageScrollStateChanged(int i) {
            boolean z = true;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6581cc1e", new Object[]{this, new Integer(i)});
            } else if (HomeUtServiceImpl.access$300(HomeUtServiceImpl.this) != null && HomeUtServiceImpl.access$000(HomeUtServiceImpl.this) != null) {
                if (i == 0) {
                    if (HomeUtServiceImpl.access$400(HomeUtServiceImpl.this)) {
                        IHomeSubTabController currentSubTabController = HomeUtServiceImpl.access$000(HomeUtServiceImpl.this).getCurrentSubTabController();
                        int currentTabIndex = HomeUtServiceImpl.access$300(HomeUtServiceImpl.this).getCurrentTabIndex();
                        HomeUtServiceImpl homeUtServiceImpl = HomeUtServiceImpl.this;
                        if (currentTabIndex != HomeUtServiceImpl.access$500(homeUtServiceImpl)) {
                            z = false;
                        }
                        HomeUtServiceImpl.access$600(homeUtServiceImpl, currentSubTabController, z);
                    }
                    HomeUtServiceImpl.access$402(HomeUtServiceImpl.this, false);
                } else if (i == 1) {
                    HomeUtServiceImpl.access$402(HomeUtServiceImpl.this, true);
                    HomeUtServiceImpl homeUtServiceImpl2 = HomeUtServiceImpl.this;
                    HomeUtServiceImpl.access$502(homeUtServiceImpl2, HomeUtServiceImpl.access$300(homeUtServiceImpl2).getCurrentTabIndex());
                }
            }
        }

        @Override // com.taobao.tao.topmultitab.service.view.IHomeViewService.a, com.taobao.tao.topmultitab.service.view.IHomeViewService.b
        public void onPageSelected(int i, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("db26523d", new Object[]{this, new Integer(i), str});
            } else if (HomeUtServiceImpl.access$000(HomeUtServiceImpl.this) != null) {
                IHomeSubTabController lastTabController = HomeUtServiceImpl.access$000(HomeUtServiceImpl.this).getLastTabController();
                IHomeSubTabController currentSubTabController = HomeUtServiceImpl.access$000(HomeUtServiceImpl.this).getCurrentSubTabController();
                if (lastTabController != currentSubTabController) {
                    w4b.g(currentSubTabController, i);
                    w4b.a(HomeUtServiceImpl.access$100(HomeUtServiceImpl.this));
                    w4b.i(currentSubTabController, HomeUtServiceImpl.access$100(HomeUtServiceImpl.this));
                }
            }
        }
    }

    static {
        t2o.a(729810384);
        t2o.a(729810391);
    }

    public static /* synthetic */ IHomeControllerService access$000(HomeUtServiceImpl homeUtServiceImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IHomeControllerService) ipChange.ipc$dispatch("5e7b670e", new Object[]{homeUtServiceImpl});
        }
        return homeUtServiceImpl.mControllerService;
    }

    public static /* synthetic */ IHomePageProviderService access$100(HomeUtServiceImpl homeUtServiceImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IHomePageProviderService) ipChange.ipc$dispatch("50876037", new Object[]{homeUtServiceImpl});
        }
        return homeUtServiceImpl.mPageProviderService;
    }

    public static /* synthetic */ wcc access$200(HomeUtServiceImpl homeUtServiceImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (wcc) ipChange.ipc$dispatch("24a46b7e", new Object[]{homeUtServiceImpl});
        }
        return homeUtServiceImpl.mHomePageContext;
    }

    public static /* synthetic */ IHomeViewService access$300(HomeUtServiceImpl homeUtServiceImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IHomeViewService) ipChange.ipc$dispatch("331d4523", new Object[]{homeUtServiceImpl});
        }
        return homeUtServiceImpl.mHomeViewService;
    }

    public static /* synthetic */ boolean access$400(HomeUtServiceImpl homeUtServiceImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("849b224b", new Object[]{homeUtServiceImpl})).booleanValue();
        }
        return homeUtServiceImpl.manualDragging;
    }

    public static /* synthetic */ boolean access$402(HomeUtServiceImpl homeUtServiceImpl, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f5e8e1f3", new Object[]{homeUtServiceImpl, new Boolean(z)})).booleanValue();
        }
        homeUtServiceImpl.manualDragging = z;
        return z;
    }

    public static /* synthetic */ int access$500(HomeUtServiceImpl homeUtServiceImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2fc2619", new Object[]{homeUtServiceImpl})).intValue();
        }
        return homeUtServiceImpl.oldPosition;
    }

    public static /* synthetic */ int access$502(HomeUtServiceImpl homeUtServiceImpl, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("43a81a12", new Object[]{homeUtServiceImpl, new Integer(i)})).intValue();
        }
        homeUtServiceImpl.oldPosition = i;
        return i;
    }

    public static /* synthetic */ void access$600(HomeUtServiceImpl homeUtServiceImpl, IHomeSubTabController iHomeSubTabController, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a86b0798", new Object[]{homeUtServiceImpl, iHomeSubTabController, new Boolean(z)});
        } else {
            homeUtServiceImpl.viewPagerSliderTrack(iHomeSubTabController, z);
        }
    }

    private void addOutLinkListener(IHomePageLifecycleService iHomePageLifecycleService) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9772a6ac", new Object[]{this, iHomePageLifecycleService});
        } else if (iHomePageLifecycleService != null) {
            this.mOutLinker = createOutLinkListener();
            iHomePageLifecycleService.getOutLinkRegister().b(this.mOutLinker);
        }
    }

    private void addPageLifecycleListener(IHomePageLifecycleService iHomePageLifecycleService) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e2acdd1f", new Object[]{this, iHomePageLifecycleService});
        } else if (iHomePageLifecycleService != null) {
            this.mPageLifeCycle = createPageLifeCycleListener();
            iHomePageLifecycleService.getPageLifeCycleRegister().a(this.mPageLifeCycle);
        }
    }

    private void commitSlideUt(IHomeSubTabController iHomeSubTabController) {
        String str;
        String str2;
        Exception e;
        int intValue;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8744a0e1", new Object[]{this, iHomeSubTabController});
            return;
        }
        boolean isLastIsTouchFakeDragView = ViewPagerFakeDragView.isLastIsTouchFakeDragView();
        String str3 = "home";
        String str4 = "Page_Home";
        if (isSameControllerByType(str3, iHomeSubTabController)) {
            if (isLastIsTouchFakeDragView) {
                str = "Page_Home_SlideNavito-tabtuijian";
            } else {
                str = "Page_Home_Slideto-tabtuijian";
            }
            str2 = "spm=a21acg.b41183928.c1600427199067.d1600427199067";
        } else {
            str3 = "subscribe";
            if (isSameControllerByType(str3, iHomeSubTabController)) {
                if (isLastIsTouchFakeDragView) {
                    str = "Page_Home_SlideNavito-tabdingyue";
                } else {
                    str = "Page_Home_Slideto-tabdingyue";
                }
                str4 = "Page_DingYueIndexAll";
                str2 = "spm=a2141.1.searchbar.dingyue";
            } else {
                str3 = com.taobao.tao.topmultitab.service.controller.a.HOME_TAB_ID_LITE_TAO;
                if (isSameControllerByType(str3, iHomeSubTabController)) {
                    if (isLastIsTouchFakeDragView) {
                        str = "Page_Home_SlideNavito-tabtaote";
                    } else {
                        str = "Page_Home_Slideto-tabtaote";
                    }
                    str4 = "Page_Home_taotetab";
                    str2 = "a2141.1.searchbar.taote";
                } else {
                    str3 = com.taobao.tao.topmultitab.service.controller.a.HOME_TAB_ID_DYNAMIC;
                    if (isSameControllerByType(str3, iHomeSubTabController)) {
                        if (isLastIsTouchFakeDragView) {
                            str = "Page_Home_SlideNavito-tabdynamic";
                        } else {
                            str = "Page_Home_Slideto-tabdynamic";
                        }
                        str4 = "Page_TMGHomeDynamic";
                        str2 = "a2141.1.searchbar.dynamic";
                    } else {
                        str3 = "campaign";
                        if (isSameControllerByType(str3, iHomeSubTabController)) {
                            str4 = "Page_HomeSale";
                            str = "Page_Home_Button-slide2dacu";
                            str2 = "spm=a2141.1.searchbar.dacu";
                        } else {
                            str3 = IHomeControllerService.HOME_TAB_ID_HOUR_DELIVERY;
                            if (isSameControllerByType(str3, iHomeSubTabController)) {
                                str = "Page_Home_Button-slide2LBS";
                                str2 = "spm=a2141.1.searchbar.lbs";
                            } else {
                                str3 = null;
                                str = null;
                                str2 = null;
                                str4 = null;
                            }
                        }
                    }
                }
            }
        }
        int i = 2101;
        r5a.i(str4, 2101, str, str2);
        JSONObject d2 = e0p.d();
        if (d2 == null) {
            r5a.i(str4, 2101, str, str2);
        }
        JSONObject b2 = e0p.b(d2, str3);
        if (b2 != null) {
            try {
                if (!(b2.getJSONObject("clickParam") == null || TextUtils.isEmpty(b2.getJSONObject("clickParam").getString("page")) || b2.getJSONObject("clickParam").getInteger("eventId") == null)) {
                    String string = b2.getJSONObject("clickParam").getString("page");
                    try {
                        intValue = b2.getJSONObject("clickParam").getInteger("eventId").intValue();
                    } catch (Exception e2) {
                        e = e2;
                    }
                    try {
                        r5a.j(string, intValue, str, b2.getJSONObject("clickParam").getString("arg2"), b2.getJSONObject("clickParam").getString("arg3"), b2.getJSONObject("clickParam").getJSONObject("args"));
                        return;
                    } catch (Exception e3) {
                        e = e3;
                        i = intValue;
                        str4 = string;
                        e.printStackTrace();
                        sfh.e("HomeUtService", "commitSlideUt  exception", e);
                        r5a.i(str4, i, str, str2);
                    }
                }
            } catch (Exception e4) {
                e = e4;
            }
        }
        r5a.i(str4, i, str, str2);
    }

    private IHomeViewService.b createOnPageChangeListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IHomeViewService.b) ipChange.ipc$dispatch("83b2b44a", new Object[]{this});
        }
        return new d();
    }

    private q4d createOutLinkListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (q4d) ipChange.ipc$dispatch("e2ba17f4", new Object[]{this});
        }
        return new b();
    }

    private IPageLifeCycle createPageLifeCycleListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IPageLifeCycle) ipChange.ipc$dispatch("46a4199b", new Object[]{this});
        }
        return new a();
    }

    private rvk createUiRefreshListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rvk) ipChange.ipc$dispatch("8d198fc8", new Object[]{this});
        }
        return new c();
    }

    private IHomeSubTabController getHomeSubTabController(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IHomeSubTabController) ipChange.ipc$dispatch("f6ed7b88", new Object[]{this, str});
        }
        IHomeControllerService iHomeControllerService = this.mControllerService;
        if (iHomeControllerService != null) {
            return iHomeControllerService.getHomeSubTabController(str);
        }
        return null;
    }

    private boolean isSameControllerByType(String str, IHomeSubTabController iHomeSubTabController) {
        IHomeSubTabController homeSubTabController;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8556ac97", new Object[]{this, str, iHomeSubTabController})).booleanValue();
        }
        if (iHomeSubTabController == null || (homeSubTabController = getHomeSubTabController(str)) == null) {
            return false;
        }
        return homeSubTabController.equals(iHomeSubTabController);
    }

    private void registerUiRefreshListener() {
        IHomeDataService iHomeDataService;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("adb2e39f", new Object[]{this});
            return;
        }
        wcc wccVar = this.mHomePageContext;
        if (wccVar != null && (iHomeDataService = (IHomeDataService) wccVar.a(IHomeDataService.class)) != null) {
            rvk createUiRefreshListener = createUiRefreshListener();
            this.mUiRefreshListener = createUiRefreshListener;
            iHomeDataService.addOnUiRefreshListener(createUiRefreshListener);
        }
    }

    private void removeOutLinkListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("822e9c9f", new Object[]{this});
            return;
        }
        IHomePageLifecycleService iHomePageLifecycleService = this.mLifecycleService;
        if (iHomePageLifecycleService != null && this.mOutLinker != null) {
            iHomePageLifecycleService.getOutLinkRegister().a(this.mOutLinker);
        }
    }

    private void removePageLifecycleListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("54efec52", new Object[]{this});
            return;
        }
        IHomePageLifecycleService iHomePageLifecycleService = this.mLifecycleService;
        if (iHomePageLifecycleService != null && this.mPageLifeCycle != null) {
            iHomePageLifecycleService.getPageLifeCycleRegister().b(this.mPageLifeCycle);
        }
    }

    private void unRegisterUiRefreshListener() {
        IHomeDataService iHomeDataService;
        rvk rvkVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c4b9786", new Object[]{this});
            return;
        }
        wcc wccVar = this.mHomePageContext;
        if (wccVar != null && (iHomeDataService = (IHomeDataService) wccVar.a(IHomeDataService.class)) != null && (rvkVar = this.mUiRefreshListener) != null) {
            iHomeDataService.removeOnUiRefreshListener(rvkVar);
        }
    }

    private void viewPagerSliderTrack(IHomeSubTabController iHomeSubTabController, boolean z) {
        String str;
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26e35506", new Object[]{this, iHomeSubTabController, new Boolean(z)});
            return;
        }
        try {
            IHomeSubTabController homeSubTabController = getHomeSubTabController("home");
            IHomeSubTabController homeSubTabController2 = getHomeSubTabController("subscribe");
            if (!z) {
                commitSlideUt(iHomeSubTabController);
            } else if (iHomeSubTabController.equals(homeSubTabController) && z) {
                if (ViewPagerFakeDragView.isLastIsTouchFakeDragView()) {
                    str2 = "Page_Home_Tuijian_SlideNavito-tabtuijian";
                } else {
                    str2 = "Page_Home_Tuijian_Slideto-tabtuijian";
                }
                r5a.i("Page_Home", 19999, str2, "");
            } else if (iHomeSubTabController.equals(homeSubTabController2) && z) {
                if (ViewPagerFakeDragView.isLastIsTouchFakeDragView()) {
                    str = "Page_Home_Dingyue_SlideNavito-tabdingyue";
                } else {
                    str = "Page_Home_Dingyue_Slideto-tabdingyue";
                }
                r5a.i("Page_DingYueIndexAll", 19999, str, "");
            }
        } catch (Throwable th) {
            sfh.d("HomeUtService", "viewPagerSliderTrack error : " + th.getMessage());
        }
    }

    @Override // com.taobao.tao.topmultitab.service.base.IHomePageService, com.taobao.infoflow.protocol.subservice.ISubService
    public /* synthetic */ void onCreateService(cfc cfcVar) {
        xcc.a(this, cfcVar);
    }

    @Override // com.taobao.infoflow.protocol.subservice.ISubService
    public void onDestroyService() {
        IHomeViewService iHomeViewService;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("770ac0a1", new Object[]{this});
            return;
        }
        unRegisterUiRefreshListener();
        removeOutLinkListener();
        removePageLifecycleListener();
        IHomeViewService.b bVar = this.mOnPageChangeListener;
        if (bVar != null && (iHomeViewService = this.mHomeViewService) != null) {
            iHomeViewService.removeOnPageChangeListener(bVar);
        }
    }

    @Override // com.taobao.tao.topmultitab.service.base.IHomePageService
    public void onCreateService(wcc wccVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("312ad712", new Object[]{this, wccVar});
            return;
        }
        this.mHomePageContext = wccVar;
        this.mControllerService = (IHomeControllerService) wccVar.a(IHomeControllerService.class);
        this.mDataService = (IHomeDataService) wccVar.a(IHomeDataService.class);
        this.mPageProviderService = (IHomePageProviderService) wccVar.a(IHomePageProviderService.class);
        this.mUiRefreshListener = createUiRefreshListener();
        registerUiRefreshListener();
        IHomePageLifecycleService iHomePageLifecycleService = (IHomePageLifecycleService) wccVar.a(IHomePageLifecycleService.class);
        this.mLifecycleService = iHomePageLifecycleService;
        addOutLinkListener(iHomePageLifecycleService);
        addPageLifecycleListener(this.mLifecycleService);
        IHomeViewService iHomeViewService = (IHomeViewService) wccVar.a(IHomeViewService.class);
        this.mHomeViewService = iHomeViewService;
        if (iHomeViewService != null) {
            IHomeViewService.b createOnPageChangeListener = createOnPageChangeListener();
            this.mOnPageChangeListener = createOnPageChangeListener;
            this.mHomeViewService.addOnPageChangeListener(createOnPageChangeListener);
        }
    }
}
