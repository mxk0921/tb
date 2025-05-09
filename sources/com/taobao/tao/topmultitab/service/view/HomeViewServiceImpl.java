package com.taobao.tao.topmultitab.service.view;

import android.graphics.Color;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.viewpager.widget.ViewPager;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.autosize.TBAutoSizeConfig;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.tao.topmultitab.protocol.IHomeSubTabController;
import com.taobao.tao.topmultitab.service.bgcontainer.IBGContainerService;
import com.taobao.tao.topmultitab.service.controller.IHomeControllerService;
import com.taobao.tao.topmultitab.service.data.IHomeDataService;
import com.taobao.tao.topmultitab.service.lifecycle.IHomePageLifecycleService;
import com.taobao.tao.topmultitab.service.pageprovider.IHomePageProviderService;
import com.taobao.tao.topmultitab.service.pulldown.IPullDownService;
import com.taobao.tao.topmultitab.service.searchbar.IHomeSearchBarService;
import com.taobao.tao.topmultitab.service.view.IHomeViewService;
import com.taobao.tao.topmultitab.service.viewresue.IHomeViewReuseService;
import com.taobao.tao.topmultitab.view.HomeViewPager;
import com.taobao.tao.topmultitab.view.HomeViewPagerAdapter;
import com.taobao.taobao.R;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import tb.b9b;
import tb.bqa;
import tb.cfc;
import tb.fve;
import tb.imn;
import tb.phg;
import tb.rrs;
import tb.rvk;
import tb.s2b;
import tb.t2o;
import tb.uqa;
import tb.v20;
import tb.vaj;
import tb.vqa;
import tb.vxl;
import tb.war;
import tb.wcc;
import tb.xcc;
import tb.z6d;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class HomeViewServiceImpl extends v20 implements IHomeViewService {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "HomeViewService";
    private HomeViewPager homeViewPager;
    private boolean isScrolling;
    private boolean isSelectedByTopMultiTab;
    private IBGContainerService mBGContainerService;
    private IHomeControllerService mControllerService;
    private IHomeDataService mDataService;
    private wcc mHomePageContext;
    private IHomeSearchBarService mHomeSearchBarService;
    private IHomePageProviderService mPageProviderService;
    private IPullDownService mPullDownService;
    private IPullDownService.a mPullSecondFloorListener;
    private rvk mUiRefreshListener;
    private HomeViewPagerAdapter viewPagerAdapter;
    private FrameLayout viewPagerContainer;
    private float mLastPositionOffset = -1.0f;
    private final TopMultiTabBindingXMsg mBindingXEvent = new TopMultiTabBindingXMsg();
    private final List<IHomeViewService.b> mPageChangeListeners = new CopyOnWriteArrayList();
    private final AtomicBoolean mIsPreCreateMultiTabView = new AtomicBoolean(false);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements rvk {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
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
            } else if (HomeViewServiceImpl.access$900(HomeViewServiceImpl.this) == null) {
                bqa.d("HomeViewService", "OnUiRefreshListener, mPageProviderService == null");
            } else {
                z6d pageProvider = HomeViewServiceImpl.access$900(HomeViewServiceImpl.this).getPageProvider();
                if (pageProvider == null) {
                    bqa.d("HomeViewService", "OnUiRefreshListener, pageProvider == null");
                    return;
                }
                View rootView = pageProvider.getRootView();
                if (rootView == null) {
                    bqa.d("HomeViewService", "OnUiRefreshListener, rootView == null");
                    return;
                }
                try {
                    String string = imnVar.u(str).getExt().getString(vaj.KEY_BG_COLOR);
                    if (!TextUtils.isEmpty(string)) {
                        rootView.setBackgroundColor(war.c(2, Color.parseColor(string)));
                    } else {
                        rootView.setBackgroundResource(R.color.homepage_background);
                    }
                } catch (Throwable th) {
                    rootView.setBackgroundResource(R.color.homepage_background);
                    bqa.d("HomeViewService", "updateGlobalBgColor," + th);
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class b implements IPullDownService.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // com.taobao.tao.topmultitab.service.pulldown.IPullDownService.a
        public void onEnterPullSecondFloor() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("11729e81", new Object[]{this});
            } else if (HomeViewServiceImpl.access$1000(HomeViewServiceImpl.this) != null) {
                HomeViewServiceImpl.access$1000(HomeViewServiceImpl.this).setVisibility(8);
            }
        }

        @Override // com.taobao.tao.topmultitab.service.pulldown.IPullDownService.a
        public void onExitPullSecondFloor() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5e74a49d", new Object[]{this});
            } else if (HomeViewServiceImpl.access$1000(HomeViewServiceImpl.this) != null) {
                HomeViewServiceImpl.access$1000(HomeViewServiceImpl.this).setVisibility(0);
            }
        }
    }

    static {
        t2o.a(729810392);
        t2o.a(729810396);
    }

    public static /* synthetic */ HomeViewPagerAdapter access$000(HomeViewServiceImpl homeViewServiceImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HomeViewPagerAdapter) ipChange.ipc$dispatch("dc9cc9fe", new Object[]{homeViewServiceImpl});
        }
        return homeViewServiceImpl.viewPagerAdapter;
    }

    public static /* synthetic */ float access$100(HomeViewServiceImpl homeViewServiceImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e735a91a", new Object[]{homeViewServiceImpl})).floatValue();
        }
        return homeViewServiceImpl.mLastPositionOffset;
    }

    public static /* synthetic */ FrameLayout access$1000(HomeViewServiceImpl homeViewServiceImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout) ipChange.ipc$dispatch("c9e8cd5d", new Object[]{homeViewServiceImpl});
        }
        return homeViewServiceImpl.viewPagerContainer;
    }

    public static /* synthetic */ float access$102(HomeViewServiceImpl homeViewServiceImpl, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b702db48", new Object[]{homeViewServiceImpl, new Float(f)})).floatValue();
        }
        homeViewServiceImpl.mLastPositionOffset = f;
        return f;
    }

    public static /* synthetic */ void access$200(HomeViewServiceImpl homeViewServiceImpl, int i, float f, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("279435d", new Object[]{homeViewServiceImpl, new Integer(i), new Float(f), new Integer(i2)});
        } else {
            homeViewServiceImpl.notifyPageScrolled(i, f, i2);
        }
    }

    public static /* synthetic */ HomeViewPager access$300(HomeViewServiceImpl homeViewServiceImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HomeViewPager) ipChange.ipc$dispatch("c249dbc6", new Object[]{homeViewServiceImpl});
        }
        return homeViewServiceImpl.homeViewPager;
    }

    public static /* synthetic */ void access$400(HomeViewServiceImpl homeViewServiceImpl, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3749d9c", new Object[]{homeViewServiceImpl, new Integer(i)});
        } else {
            homeViewServiceImpl.postScrollMessage(i);
        }
    }

    public static /* synthetic */ IHomeControllerService access$500(HomeViewServiceImpl homeViewServiceImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IHomeControllerService) ipChange.ipc$dispatch("714be813", new Object[]{homeViewServiceImpl});
        }
        return homeViewServiceImpl.mControllerService;
    }

    public static /* synthetic */ void access$600(HomeViewServiceImpl homeViewServiceImpl, int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("900e3ae8", new Object[]{homeViewServiceImpl, new Integer(i), str});
        } else {
            homeViewServiceImpl.onPageSelected(i, str);
        }
    }

    public static /* synthetic */ void access$700(HomeViewServiceImpl homeViewServiceImpl, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a7694c1f", new Object[]{homeViewServiceImpl, new Integer(i)});
        } else {
            homeViewServiceImpl.notifyPageScrollStateChange(i);
        }
    }

    public static /* synthetic */ boolean access$802(HomeViewServiceImpl homeViewServiceImpl, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("503e12f7", new Object[]{homeViewServiceImpl, new Boolean(z)})).booleanValue();
        }
        homeViewServiceImpl.isScrolling = z;
        return z;
    }

    public static /* synthetic */ IHomePageProviderService access$900(HomeViewServiceImpl homeViewServiceImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IHomePageProviderService) ipChange.ipc$dispatch("80ca51bf", new Object[]{homeViewServiceImpl});
        }
        return homeViewServiceImpl.mPageProviderService;
    }

    private void createHomeViewPager(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d047df28", new Object[]{this, view});
            return;
        }
        if (this.homeViewPager == null) {
            HomeViewPager homeViewPager = new HomeViewPager(view.getContext(), this.mHomePageContext);
            this.homeViewPager = homeViewPager;
            homeViewPager.setOverScrollMode(2);
            this.homeViewPager.setNestedScrollingEnabled(false);
            this.homeViewPager.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            this.viewPagerAdapter = new HomeViewPagerAdapter(this.homeViewPager);
        }
        removeParent(this.homeViewPager);
        this.viewPagerAdapter.w();
        this.homeViewPager.clearOnPageChangeListeners();
        this.homeViewPager.addOnPageChangeListener(getOnPageChangeListener());
        this.homeViewPager.setAdapter(this.viewPagerAdapter);
        FrameLayout frameLayout = (FrameLayout) view.findViewById(R.id.rv_main_container_wrapper);
        this.viewPagerContainer = frameLayout;
        frameLayout.addView(this.homeViewPager);
        uqa.b("TopTabBar", "createHomeViewPager", "HomeViewService.createHomeViewPager;创建首页ViewPager");
    }

    private IPullDownService.a createSecondFloorListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IPullDownService.a) ipChange.ipc$dispatch("3b6f81bb", new Object[]{this});
        }
        return new b();
    }

    private rvk createUiRefreshListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rvk) ipChange.ipc$dispatch("8d198fc8", new Object[]{this});
        }
        return new a();
    }

    private ViewPager.OnPageChangeListener getOnPageChangeListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewPager.OnPageChangeListener) ipChange.ipc$dispatch("7589130a", new Object[]{this});
        }
        return new ViewPager.OnPageChangeListener() { // from class: com.taobao.tao.topmultitab.service.view.HomeViewServiceImpl.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
            public void onPageScrollStateChanged(int i) {
                boolean z = true;
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("6581cc1e", new Object[]{this, new Integer(i)});
                } else if (HomeViewServiceImpl.access$000(HomeViewServiceImpl.this) != null && HomeViewServiceImpl.access$300(HomeViewServiceImpl.this) != null) {
                    HomeViewServiceImpl.access$700(HomeViewServiceImpl.this, i);
                    if (i == 0) {
                        HomeViewServiceImpl.access$102(HomeViewServiceImpl.this, -1.0f);
                    }
                    HomeViewServiceImpl homeViewServiceImpl = HomeViewServiceImpl.this;
                    if (i == 0) {
                        z = false;
                    }
                    HomeViewServiceImpl.access$802(homeViewServiceImpl, z);
                }
            }

            @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
            public void onPageSelected(int i) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("184d6f33", new Object[]{this, new Integer(i)});
                } else if (HomeViewServiceImpl.access$000(HomeViewServiceImpl.this) != null) {
                    HomeViewServiceImpl.access$000(HomeViewServiceImpl.this).h(i);
                    if (HomeViewServiceImpl.access$500(HomeViewServiceImpl.this) != null) {
                        HomeViewServiceImpl.access$600(HomeViewServiceImpl.this, i, HomeViewServiceImpl.access$500(HomeViewServiceImpl.this).getSubControllerType(HomeViewServiceImpl.access$500(HomeViewServiceImpl.this).getLastTabController()));
                    }
                }
            }

            @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
            public void onPageScrolled(int i, float f, int i2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("f4c13b05", new Object[]{this, new Integer(i), new Float(f), new Integer(i2)});
                } else if (HomeViewServiceImpl.access$000(HomeViewServiceImpl.this) != null) {
                    if (HomeViewServiceImpl.access$100(HomeViewServiceImpl.this) >= 0.0f) {
                        if (f > HomeViewServiceImpl.access$100(HomeViewServiceImpl.this)) {
                            HomeViewServiceImpl.access$000(HomeViewServiceImpl.this).h(1 + i);
                        } else if (f < HomeViewServiceImpl.access$100(HomeViewServiceImpl.this)) {
                            HomeViewServiceImpl.access$000(HomeViewServiceImpl.this).h(i);
                        }
                    }
                    HomeViewServiceImpl.access$102(HomeViewServiceImpl.this, f);
                    IHomeSubTabController n = HomeViewServiceImpl.access$000(HomeViewServiceImpl.this).n(i);
                    if (n != null) {
                        n.onPageScrolled(f, i2);
                    }
                    HomeViewServiceImpl.access$200(HomeViewServiceImpl.this, i, f, i2);
                    HomeViewServiceImpl homeViewServiceImpl = HomeViewServiceImpl.this;
                    HomeViewServiceImpl.access$400(homeViewServiceImpl, (HomeViewServiceImpl.access$300(homeViewServiceImpl).getWidth() * i) + i2);
                    vqa f2 = vqa.k().i("UITabSwitch").j("TopBarOnPageScrolled").e("HomeViewService.onPageScrolled").f("滑动至position", i);
                    f2.g("偏移距离比例positionOffset", f + "").f("偏移距离pixels值", i2).a();
                }
            }
        };
    }

    public static /* synthetic */ Object ipc$super(HomeViewServiceImpl homeViewServiceImpl, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/topmultitab/service/view/HomeViewServiceImpl");
    }

    private void notifyPageScrollStateChange(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("82859ce0", new Object[]{this, new Integer(i)});
            return;
        }
        for (IHomeViewService.b bVar : this.mPageChangeListeners) {
            bVar.onPageScrollStateChanged(i);
        }
    }

    private void notifyPageScrolled(int i, float f, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5415d55b", new Object[]{this, new Integer(i), new Float(f), new Integer(i2)});
            return;
        }
        for (IHomeViewService.b bVar : this.mPageChangeListeners) {
            bVar.onPageScrolled(i, f, i2);
        }
    }

    private void notifyPageSelected(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b178093", new Object[]{this, new Integer(i), str});
            return;
        }
        for (IHomeViewService.b bVar : this.mPageChangeListeners) {
            bVar.onPageSelected(i, str);
        }
    }

    private void postScrollEndMessage() {
        DXRootView dX3SearchView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("546c4620", new Object[]{this});
            return;
        }
        IHomeSearchBarService iHomeSearchBarService = this.mHomeSearchBarService;
        if (iHomeSearchBarService != null && (dX3SearchView = iHomeSearchBarService.getDX3SearchView()) != null) {
            uqa.b("TopTabBar", "postScrollEndMessage", "发送滚动结束的事件");
            this.mBindingXEvent.postMessageEnd(dX3SearchView);
        }
    }

    private void registerPageLifeCycleListener() {
        IHomePageLifecycleService iHomePageLifecycleService;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("171cc6f3", new Object[]{this});
            return;
        }
        wcc wccVar = this.mHomePageContext;
        if (wccVar != null && (iHomePageLifecycleService = (IHomePageLifecycleService) wccVar.a(IHomePageLifecycleService.class)) != null) {
            iHomePageLifecycleService.getPageLifeCycleRegister().a(this);
        }
    }

    private void registerSecondFloorListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89516930", new Object[]{this});
            return;
        }
        IPullDownService iPullDownService = this.mPullDownService;
        if (iPullDownService == null) {
            bqa.d("HomeViewService", "registerSecondFloorListener, mPullDownService == null");
            return;
        }
        IPullDownService.a aVar = this.mPullSecondFloorListener;
        if (aVar != null) {
            iPullDownService.removePullSecondFloorListener(aVar);
        }
        IPullDownService.a createSecondFloorListener = createSecondFloorListener();
        this.mPullSecondFloorListener = createSecondFloorListener;
        this.mPullDownService.addPullSecondFloorListener(createSecondFloorListener);
    }

    private void registerUiRefreshListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("adb2e39f", new Object[]{this});
        } else if (this.mDataService == null) {
            bqa.d("HomeViewService", "registerUiRefreshListener, mDataService == null");
        } else {
            rvk createUiRefreshListener = createUiRefreshListener();
            this.mUiRefreshListener = createUiRefreshListener;
            this.mDataService.addOnUiRefreshListener(createUiRefreshListener);
        }
    }

    private void removeParent(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f2238edd", new Object[]{this, view});
        } else if (view != null && (view.getParent() instanceof ViewGroup)) {
            ((ViewGroup) view.getParent()).removeView(view);
        }
    }

    private void setEnablePullRefresh(boolean z) {
        IPullDownService iPullDownService;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d49396bc", new Object[]{this, new Boolean(z)});
            return;
        }
        wcc wccVar = this.mHomePageContext;
        if (wccVar != null && (iPullDownService = (IPullDownService) wccVar.a(IPullDownService.class)) != null) {
            iPullDownService.setEnablePullRefresh(z);
        }
    }

    private void setEnableToSecondFloor(boolean z) {
        IPullDownService iPullDownService;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("38ae6035", new Object[]{this, new Boolean(z)});
            return;
        }
        wcc wccVar = this.mHomePageContext;
        if (wccVar != null && (iPullDownService = (IPullDownService) wccVar.a(IPullDownService.class)) != null) {
            iPullDownService.setEnableToSecondFloor(z);
        }
    }

    private void unRegisterPageLifeCycleListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a0db2f5a", new Object[]{this});
            return;
        }
        wcc wccVar = this.mHomePageContext;
        if (wccVar == null) {
            bqa.d("HomeViewService", "unRegisterPageLifeCycleListener, mHomePageContext == null");
            return;
        }
        IHomePageLifecycleService iHomePageLifecycleService = (IHomePageLifecycleService) wccVar.a(IHomePageLifecycleService.class);
        if (iHomePageLifecycleService == null) {
            bqa.d("HomeViewService", "unRegisterPageLifeCycleListener, pageLifecycleService == null");
        } else {
            iHomePageLifecycleService.getPageLifeCycleRegister().b(this);
        }
    }

    private void unRegisterSecondFloorListener() {
        IPullDownService.a aVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f48cbf57", new Object[]{this});
            return;
        }
        IPullDownService iPullDownService = this.mPullDownService;
        if (iPullDownService == null || (aVar = this.mPullSecondFloorListener) == null) {
            bqa.d("HomeViewService", "unRegisterSecondFloorListener, mPullDownService == null");
        } else {
            iPullDownService.removePullSecondFloorListener(aVar);
        }
    }

    private void unRegisterUiRefreshListener() {
        rvk rvkVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c4b9786", new Object[]{this});
            return;
        }
        IHomeDataService iHomeDataService = this.mDataService;
        if (iHomeDataService == null || (rvkVar = this.mUiRefreshListener) == null) {
            bqa.d("HomeViewService", "unRegisterUiRefreshListener, mDataService == null");
        } else {
            iHomeDataService.removeOnUiRefreshListener(rvkVar);
        }
    }

    private void updateHeaderView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("40bebf82", new Object[]{this});
            return;
        }
        IBGContainerService iBGContainerService = this.mBGContainerService;
        if (iBGContainerService == null) {
            bqa.d("HomeViewService", "updateBgView bgContainerManager == null");
        } else {
            iBGContainerService.updateHeaderView();
        }
    }

    @Override // com.taobao.tao.topmultitab.service.view.IHomeViewService
    public void addOnPageChangeListener(IHomeViewService.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf016cb", new Object[]{this, bVar});
        } else {
            this.mPageChangeListeners.add(bVar);
        }
    }

    @Override // com.taobao.tao.topmultitab.service.view.IHomeViewService
    public void compensateOnPageSelected(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8733171", new Object[]{this, str});
        } else {
            onPageSelected(0, str);
        }
    }

    @Override // com.taobao.tao.topmultitab.service.view.IHomeViewService
    public void createView(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f36ae60a", new Object[]{this, view});
            return;
        }
        uqa.b("TopTabBar", "createView", "创建多TAB相关视图");
        IHomeControllerService iHomeControllerService = this.mControllerService;
        if (iHomeControllerService != null) {
            iHomeControllerService.initOverseaTabController();
        }
        preCreateMultiTabView(view);
        createHomeViewPager(view);
    }

    @Override // com.taobao.tao.topmultitab.service.view.IHomeViewService
    public void destroyView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70a84ec6", new Object[]{this});
            return;
        }
        bqa.d("HomeViewService", "destroyView");
        HomeViewPagerAdapter homeViewPagerAdapter = this.viewPagerAdapter;
        if (homeViewPagerAdapter != null) {
            homeViewPagerAdapter.s();
            this.viewPagerAdapter = null;
        }
        this.homeViewPager = null;
        this.viewPagerContainer = null;
    }

    @Override // com.taobao.tao.topmultitab.service.view.IHomeViewService
    public List<String> getAllTabType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("38c318dc", new Object[]{this});
        }
        HomeViewPagerAdapter homeViewPagerAdapter = this.viewPagerAdapter;
        if (homeViewPagerAdapter != null) {
            return homeViewPagerAdapter.j();
        }
        return null;
    }

    @Override // com.taobao.tao.topmultitab.service.view.IHomeViewService
    public int getCurrentTabIndex() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("66e38d1a", new Object[]{this})).intValue();
        }
        HomeViewPager homeViewPager = this.homeViewPager;
        if (homeViewPager == null) {
            return -1;
        }
        return homeViewPager.getCurrentItem();
    }

    @Override // com.taobao.tao.topmultitab.service.view.IHomeViewService
    public JSONObject getCurrentTabItem() {
        List<JSONObject> o;
        int currentTabIndex;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("1495ceac", new Object[]{this});
        }
        HomeViewPagerAdapter homeViewPagerAdapter = this.viewPagerAdapter;
        if (homeViewPagerAdapter != null && (o = homeViewPagerAdapter.o()) != null && !o.isEmpty() && (currentTabIndex = getCurrentTabIndex()) >= 0 && currentTabIndex < o.size()) {
            return o.get(currentTabIndex);
        }
        return null;
    }

    @Override // com.taobao.tao.topmultitab.service.view.IHomeViewService
    public String getDefaultPageType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b818f1e5", new Object[]{this});
        }
        HomeViewPagerAdapter homeViewPagerAdapter = this.viewPagerAdapter;
        if (homeViewPagerAdapter == null) {
            return "home";
        }
        return homeViewPagerAdapter.b;
    }

    @Override // com.taobao.tao.topmultitab.service.view.IHomeViewService
    public int getPosByType(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f6b65a33", new Object[]{this, str})).intValue();
        }
        HomeViewPagerAdapter homeViewPagerAdapter = this.viewPagerAdapter;
        if (homeViewPagerAdapter != null) {
            return homeViewPagerAdapter.m(str);
        }
        return -1;
    }

    @Override // com.taobao.tao.topmultitab.service.view.IHomeViewService
    public List<JSONObject> getTabItems() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("63ca769f", new Object[]{this});
        }
        HomeViewPagerAdapter homeViewPagerAdapter = this.viewPagerAdapter;
        if (homeViewPagerAdapter != null) {
            return homeViewPagerAdapter.o();
        }
        return null;
    }

    @Override // com.taobao.tao.topmultitab.service.view.IHomeViewService
    public String getTypeByPos(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3971c9b1", new Object[]{this, new Integer(i)});
        }
        HomeViewPagerAdapter homeViewPagerAdapter = this.viewPagerAdapter;
        if (homeViewPagerAdapter != null) {
            return homeViewPagerAdapter.p(i);
        }
        return null;
    }

    @Override // com.taobao.tao.topmultitab.service.view.IHomeViewService
    public boolean isScrolling() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ad3ffaf6", new Object[]{this})).booleanValue();
        }
        return this.isScrolling;
    }

    @Override // com.taobao.tao.topmultitab.service.view.IHomeViewService
    public boolean isSelectedByTopMultiTab() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2b99ef60", new Object[]{this})).booleanValue();
        }
        return this.isSelectedByTopMultiTab;
    }

    @Override // com.taobao.tao.topmultitab.service.base.IHomePageService, com.taobao.infoflow.protocol.subservice.ISubService
    public /* synthetic */ void onCreateService(cfc cfcVar) {
        xcc.a(this, cfcVar);
    }

    @Override // tb.v20, com.taobao.tao.topmultitab.service.lifecycle.listener.IPageLifeCycle
    public void onCreateView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("acffd587", new Object[]{this});
            return;
        }
        this.mHomeSearchBarService = (IHomeSearchBarService) this.mHomePageContext.a(IHomeSearchBarService.class);
        this.mBGContainerService = (IBGContainerService) this.mHomePageContext.a(IBGContainerService.class);
        this.mPullDownService = (IPullDownService) this.mHomePageContext.a(IPullDownService.class);
        registerSecondFloorListener();
    }

    @Override // com.taobao.infoflow.protocol.subservice.ISubService
    public void onDestroyService() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("770ac0a1", new Object[]{this});
            return;
        }
        unRegisterSecondFloorListener();
        unRegisterUiRefreshListener();
        unRegisterPageLifeCycleListener();
    }

    @Override // com.taobao.tao.topmultitab.service.view.IHomeViewService
    public void postScrollToCurrentPosMessage() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cba685eb", new Object[]{this});
        } else if (this.homeViewPager != null) {
            if (b9b.h() || b9b.e()) {
                postScrollMessage(getCurrentTabIndex() * TBAutoSizeConfig.x().H(this.homeViewPager.getContext()));
            } else {
                postScrollMessage(getCurrentTabIndex() * this.homeViewPager.getWidth());
            }
        }
    }

    @Override // com.taobao.tao.topmultitab.service.view.IHomeViewService
    public void reRenderItem(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("faf8c9ed", new Object[]{this, str});
            return;
        }
        HomeViewPagerAdapter homeViewPagerAdapter = this.viewPagerAdapter;
        if (homeViewPagerAdapter != null) {
            homeViewPagerAdapter.t(str);
        }
    }

    @Override // com.taobao.tao.topmultitab.service.view.IHomeViewService
    public void reSetTabItems(List<JSONObject> list, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("520e3722", new Object[]{this, list, new Boolean(z)});
            return;
        }
        HomeViewPagerAdapter homeViewPagerAdapter = this.viewPagerAdapter;
        if (homeViewPagerAdapter != null && this.homeViewPager != null) {
            homeViewPagerAdapter.z(list, z);
            this.homeViewPager.setAdapter(this.viewPagerAdapter);
        }
    }

    @Override // com.taobao.tao.topmultitab.service.view.IHomeViewService
    public void removeOnPageChangeListener(IHomeViewService.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c83de588", new Object[]{this, bVar});
        } else {
            this.mPageChangeListeners.remove(bVar);
        }
    }

    @Override // com.taobao.tao.topmultitab.service.view.IHomeViewService
    public void selectTab(String str) {
        HomeViewPagerAdapter homeViewPagerAdapter;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("33f96aca", new Object[]{this, str});
        } else if (!TextUtils.isEmpty(str) && (homeViewPagerAdapter = this.viewPagerAdapter) != null) {
            homeViewPagerAdapter.y(str);
        }
    }

    @Override // com.taobao.tao.topmultitab.service.view.IHomeViewService
    public void setSelectedByTopMultiTab(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c954830", new Object[]{this, new Boolean(z)});
        } else {
            this.isSelectedByTopMultiTab = z;
        }
    }

    @Override // com.taobao.tao.topmultitab.service.view.IHomeViewService
    public void updatePageViewPadding() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7533fa1b", new Object[]{this});
            return;
        }
        HomeViewPagerAdapter homeViewPagerAdapter = this.viewPagerAdapter;
        if (homeViewPagerAdapter != null) {
            homeViewPagerAdapter.B();
        }
    }

    @Override // com.taobao.tao.topmultitab.service.view.IHomeViewService
    public void updateTabListData(List<JSONObject> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5fe32d0c", new Object[]{this, list});
            return;
        }
        HomeViewPagerAdapter homeViewPagerAdapter = this.viewPagerAdapter;
        if (homeViewPagerAdapter != null) {
            homeViewPagerAdapter.C(list);
        }
    }

    private void onPageSelected(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("db26523d", new Object[]{this, new Integer(i), str});
        } else if (this.mControllerService != null) {
            setSelectedByTopMultiTab(true);
            vqa f = vqa.k().i("UITabSwitch").j("TopBarOnPageSelected").e("HomeViewService.onPageSelected").e("顶部tab被选中.").f("选中position", i);
            IHomeSubTabController n = this.viewPagerAdapter.n(i);
            String subControllerType = this.mControllerService.getSubControllerType(n);
            if (n != null && !TextUtils.equals(subControllerType, str)) {
                notifyPageSelected(i, subControllerType);
                setEnablePullRefresh(n.isEnablePullReFresh());
                f.g("是否允许下拉刷新", n.isEnablePullReFresh() + "");
                setEnableToSecondFloor(n.isEnableToSecondFloor());
                f.g("二楼样式是否可见", n.isEnableToSecondFloor() + "");
                postScrollEndMessage();
                updateHeaderView();
                this.homeViewPager.onPageSelected();
                f.a();
            }
            s2b.c().l(i);
            bqa.d("HomeViewService", "onPageSelected: " + i);
        }
    }

    private void postScrollMessage(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88f647e2", new Object[]{this, new Integer(i)});
            return;
        }
        bqa.d("HomeViewService", "postScrollMessage, offset=" + i);
        IHomeSearchBarService iHomeSearchBarService = this.mHomeSearchBarService;
        if (iHomeSearchBarService != null) {
            this.mBindingXEvent.postMessage(iHomeSearchBarService.getDX3SearchView(), Math.max(0, i));
        }
    }

    @Override // com.taobao.tao.topmultitab.service.base.IHomePageService
    public void onCreateService(wcc wccVar) {
        IHomeViewReuseService iHomeViewReuseService;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("312ad712", new Object[]{this, wccVar});
            return;
        }
        phg.k("HomeViewServiceImpl");
        this.mHomePageContext = wccVar;
        this.mControllerService = (IHomeControllerService) wccVar.a(IHomeControllerService.class);
        this.mPageProviderService = (IHomePageProviderService) wccVar.a(IHomePageProviderService.class);
        this.mDataService = (IHomeDataService) wccVar.a(IHomeDataService.class);
        this.mUiRefreshListener = createUiRefreshListener();
        registerUiRefreshListener();
        registerPageLifeCycleListener();
        if (vxl.b().J() && (iHomeViewReuseService = (IHomeViewReuseService) wccVar.a(IHomeViewReuseService.class)) != null) {
            iHomeViewReuseService.setAsyncTaskCount(1);
            iHomeViewReuseService.preCreateRootView(this);
        }
        phg.j("HomeViewServiceImpl");
    }

    @Override // com.taobao.tao.topmultitab.service.view.IHomeViewService
    public synchronized void preCreateMultiTabView(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c008d6b", new Object[]{this, view});
        } else if (vxl.b().C() && this.mIsPreCreateMultiTabView.compareAndSet(true, true)) {
        } else {
            if (this.mControllerService == null) {
                fve.e("HomeViewService", "获取 IHomeControllerService 失败");
                return;
            }
            String c = rrs.c("home");
            IHomeSubTabController realSubTabController = this.mControllerService.getRealSubTabController(c);
            if (realSubTabController == null) {
                fve.e("HomeViewService", "获取新架构 IHomeSubTabController 失败， realType ： " + c);
                return;
            }
            fve.e("HomeViewService", "预加载新架构推荐信息流， realType ： " + c);
            realSubTabController.preCreateView(view.getContext());
        }
    }

    @Override // com.taobao.tao.topmultitab.service.view.IHomeViewService
    public void selectTab(JSONObject jSONObject) {
        HomeViewPagerAdapter homeViewPagerAdapter;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b84fd9f0", new Object[]{this, jSONObject});
        } else if (jSONObject != null && (homeViewPagerAdapter = this.viewPagerAdapter) != null) {
            homeViewPagerAdapter.x(jSONObject);
        }
    }
}
