package com.taobao.tao.topmultitab.service.tabbar;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import com.alibaba.ability.localization.Localization;
import com.alibaba.ability.localization.constants.Language;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.festival.FestivalMgr;
import com.taobao.infoflow.protocol.model.datamodel.response.IContainerDataModel;
import com.taobao.infoflow.protocol.model.datamodel.response.IContainerInnerDataModel;
import com.taobao.tao.Globals;
import com.taobao.tao.navigation.Interface.TabHostStatusListener;
import com.taobao.tao.topmultitab.protocol.IHomeSubTabController;
import com.taobao.tao.topmultitab.service.controller.IHomeControllerService;
import com.taobao.tao.topmultitab.service.data.IHomeDataService;
import com.taobao.tao.topmultitab.service.festival.IFestivalService;
import com.taobao.tao.topmultitab.service.view.IHomeViewService;
import com.taobao.taobao.R;
import tb.bx;
import tb.cfc;
import tb.gnn;
import tb.hqk;
import tb.jps;
import tb.kbq;
import tb.kis;
import tb.l6c;
import tb.m5a;
import tb.s2b;
import tb.t2o;
import tb.uqa;
import tb.vqa;
import tb.wcc;
import tb.xcc;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class TabBarActionButtonServiceImpl implements ITabBarActionButtonService {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String GLOBAL_GREY = "globalGrey";
    private static final String TAB_BAR_BUTTON_BG_PIC_URL_KEY = "tabbarImagesURL_home_second_selected";
    private IHomeControllerService mControllerService;
    private hqk mDataProcessListener;
    private IHomeDataService mDataService;
    private l6c mFestivalChangeListener;
    private IFestivalService mFestivalService;
    private boolean mIsAtR4UStatus;
    private boolean mIsFestivalStatus;
    private boolean mIsGrey;
    private boolean mIsOverSeaButton;
    private Localization.a mLocaleChangeListener;
    private IHomeViewService.b mOnPageChangeListener;
    private bx mPageLifeCycle;
    private jps mTabBarActionButtonProvider;
    private ITabBarActionButtonService mTabBarActionButtonService;
    private IHomeViewService mViewService;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements TabHostStatusListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // com.taobao.tao.navigation.Interface.TabHostStatusListener
        public int listenEventType() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("ec7280e7", new Object[]{this})).intValue();
            }
            return 1;
        }

        @Override // com.taobao.tao.navigation.Interface.TabHostStatusListener
        public void onTabHostStatusChanged(TabHostStatusListener.a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("45bff8f3", new Object[]{this, aVar});
            } else {
                TabBarActionButtonServiceImpl.access$000(TabBarActionButtonServiceImpl.this);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class b implements Localization.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // com.alibaba.ability.localization.Localization.a
        public void onChange(Language language, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6c58b74d", new Object[]{this, language, str});
                return;
            }
            vqa j = vqa.k().i("BottomTabBar").j("onLocaleChanged");
            if (TabBarActionButtonServiceImpl.access$100(TabBarActionButtonServiceImpl.this) == null) {
                j.e("mTabBarActionButtonProvider == null").a();
            } else if (Localization.o()) {
                TabBarActionButtonServiceImpl.access$200(TabBarActionButtonServiceImpl.this);
            } else if (TabBarActionButtonServiceImpl.access$300(TabBarActionButtonServiceImpl.this)) {
                j.e("重置图标").a();
                TabBarActionButtonServiceImpl.access$100(TabBarActionButtonServiceImpl.this).k();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class c implements hqk {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
        public class a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ boolean f12852a;
            public final /* synthetic */ vqa b;

            public a(boolean z, vqa vqaVar) {
                this.f12852a = z;
                this.b = vqaVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                TabBarActionButtonServiceImpl.access$702(TabBarActionButtonServiceImpl.this, this.f12852a);
                IHomeSubTabController currentSubTabController = TabBarActionButtonServiceImpl.access$400(TabBarActionButtonServiceImpl.this).getCurrentSubTabController();
                if (currentSubTabController != null) {
                    vqa vqaVar = this.b;
                    vqaVar.e("同步置灰状态,isGrey: " + this.f12852a);
                    currentSubTabController.syncGreyStatus(this.f12852a);
                }
                if (TabBarActionButtonServiceImpl.access$100(TabBarActionButtonServiceImpl.this) != null) {
                    this.b.e("状态变化了，更新图标").a();
                    TabBarActionButtonServiceImpl.access$100(TabBarActionButtonServiceImpl.this).p(this.f12852a);
                }
            }
        }

        public c() {
        }

        @Override // tb.hqk
        public void a(JSONObject jSONObject, IContainerDataModel<?> iContainerDataModel, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8a114a6e", new Object[]{this, jSONObject, iContainerDataModel, str});
                return;
            }
            vqa j = vqa.k().i("BottomTabBar").j("onDataProcess");
            if (!kbq.e(Globals.getApplication())) {
                j.e("不是海外").a();
            } else if (TabBarActionButtonServiceImpl.access$400(TabBarActionButtonServiceImpl.this) == null) {
                j.e("controller服务为空").a();
            } else if (TabBarActionButtonServiceImpl.access$500(TabBarActionButtonServiceImpl.this)) {
                j.e("当前有氛围").a();
            } else {
                boolean access$600 = TabBarActionButtonServiceImpl.access$600(TabBarActionButtonServiceImpl.this, iContainerDataModel);
                if (access$600 == TabBarActionButtonServiceImpl.access$700(TabBarActionButtonServiceImpl.this)) {
                    j.e("置灰状态没变化").a();
                } else {
                    m5a.a().i(new a(access$600, j));
                }
            }
        }

        @Override // tb.hqk
        public void b(JSONObject jSONObject, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6c0a53b0", new Object[]{this, jSONObject, str});
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class d extends bx {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public d() {
        }

        public static /* synthetic */ Object ipc$super(d dVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/topmultitab/service/tabbar/TabBarActionButtonServiceImpl$4");
        }

        @Override // tb.bx
        public void o() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            } else {
                TabBarActionButtonServiceImpl.access$800(TabBarActionButtonServiceImpl.this);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class f extends IHomeViewService.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public f() {
        }

        public static /* synthetic */ Object ipc$super(f fVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/topmultitab/service/tabbar/TabBarActionButtonServiceImpl$6");
        }

        @Override // com.taobao.tao.topmultitab.service.view.IHomeViewService.a, com.taobao.tao.topmultitab.service.view.IHomeViewService.b
        public void onPageSelected(int i, String str) {
            String str2;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("db26523d", new Object[]{this, new Integer(i), str});
            } else if (TabBarActionButtonServiceImpl.access$400(TabBarActionButtonServiceImpl.this) != null) {
                IHomeSubTabController currentSubTabController = TabBarActionButtonServiceImpl.access$400(TabBarActionButtonServiceImpl.this).getCurrentSubTabController();
                if (currentSubTabController instanceof gnn) {
                    gnn gnnVar = (gnn) currentSubTabController;
                    TabBarActionButtonServiceImpl.this.setTabBarActionButtonState(gnnVar.getTabBarButtonShowState());
                    uqa.b("UITabSwitch", "TopBarOnPageSelected", "当前底部bar状态" + gnnVar.getTabBarButtonShowState());
                    return;
                }
                TabBarActionButtonServiceImpl.this.setRocketState(currentSubTabController.isOnRocketState());
                if (currentSubTabController.isOnRocketState()) {
                    str2 = "小火箭图标";
                } else {
                    str2 = "淘字";
                }
                uqa.b("UITabSwitch", "TopBarOnPageSelected", "当前底部bar状态".concat(str2));
            }
        }
    }

    static {
        t2o.a(729810376);
        t2o.a(729810368);
    }

    public static /* synthetic */ void access$000(TabBarActionButtonServiceImpl tabBarActionButtonServiceImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cee9774", new Object[]{tabBarActionButtonServiceImpl});
        } else {
            tabBarActionButtonServiceImpl.resetView();
        }
    }

    public static /* synthetic */ jps access$100(TabBarActionButtonServiceImpl tabBarActionButtonServiceImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jps) ipChange.ipc$dispatch("97b7e882", new Object[]{tabBarActionButtonServiceImpl});
        }
        return tabBarActionButtonServiceImpl.mTabBarActionButtonProvider;
    }

    public static /* synthetic */ boolean access$1000(TabBarActionButtonServiceImpl tabBarActionButtonServiceImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8bba0729", new Object[]{tabBarActionButtonServiceImpl})).booleanValue();
        }
        return tabBarActionButtonServiceImpl.mIsAtR4UStatus;
    }

    public static /* synthetic */ void access$200(TabBarActionButtonServiceImpl tabBarActionButtonServiceImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c8d56332", new Object[]{tabBarActionButtonServiceImpl});
        } else {
            tabBarActionButtonServiceImpl.loadOverseaTabBarButton();
        }
    }

    public static /* synthetic */ boolean access$300(TabBarActionButtonServiceImpl tabBarActionButtonServiceImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a6c8c915", new Object[]{tabBarActionButtonServiceImpl})).booleanValue();
        }
        return tabBarActionButtonServiceImpl.mIsOverSeaButton;
    }

    public static /* synthetic */ IHomeControllerService access$400(TabBarActionButtonServiceImpl tabBarActionButtonServiceImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IHomeControllerService) ipChange.ipc$dispatch("ef5c209", new Object[]{tabBarActionButtonServiceImpl});
        }
        return tabBarActionButtonServiceImpl.mControllerService;
    }

    public static /* synthetic */ boolean access$500(TabBarActionButtonServiceImpl tabBarActionButtonServiceImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("62af94d3", new Object[]{tabBarActionButtonServiceImpl})).booleanValue();
        }
        return tabBarActionButtonServiceImpl.mIsFestivalStatus;
    }

    public static /* synthetic */ boolean access$502(TabBarActionButtonServiceImpl tabBarActionButtonServiceImpl, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1957c6b", new Object[]{tabBarActionButtonServiceImpl, new Boolean(z)})).booleanValue();
        }
        tabBarActionButtonServiceImpl.mIsFestivalStatus = z;
        return z;
    }

    public static /* synthetic */ boolean access$600(TabBarActionButtonServiceImpl tabBarActionButtonServiceImpl, IContainerDataModel iContainerDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("88dec9d1", new Object[]{tabBarActionButtonServiceImpl, iContainerDataModel})).booleanValue();
        }
        return tabBarActionButtonServiceImpl.isGrey(iContainerDataModel);
    }

    public static /* synthetic */ boolean access$700(TabBarActionButtonServiceImpl tabBarActionButtonServiceImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1e966091", new Object[]{tabBarActionButtonServiceImpl})).booleanValue();
        }
        return tabBarActionButtonServiceImpl.mIsGrey;
    }

    public static /* synthetic */ boolean access$702(TabBarActionButtonServiceImpl tabBarActionButtonServiceImpl, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c288286d", new Object[]{tabBarActionButtonServiceImpl, new Boolean(z)})).booleanValue();
        }
        tabBarActionButtonServiceImpl.mIsGrey = z;
        return z;
    }

    public static /* synthetic */ void access$800(TabBarActionButtonServiceImpl tabBarActionButtonServiceImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fc89c66c", new Object[]{tabBarActionButtonServiceImpl});
        } else {
            tabBarActionButtonServiceImpl.checkFestivalStatus();
        }
    }

    public static /* synthetic */ String access$900(TabBarActionButtonServiceImpl tabBarActionButtonServiceImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c1f787b5", new Object[]{tabBarActionButtonServiceImpl});
        }
        return tabBarActionButtonServiceImpl.getTabBarFestivalButtonImageUrl();
    }

    private void checkFestivalStatus() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4d329a39", new Object[]{this});
        } else if (!this.mIsFestivalStatus) {
            String tabBarFestivalButtonImageUrl = getTabBarFestivalButtonImageUrl();
            if (!TextUtils.isEmpty(tabBarFestivalButtonImageUrl)) {
                this.mTabBarActionButtonProvider.q(tabBarFestivalButtonImageUrl);
                this.mIsFestivalStatus = true;
            }
        }
    }

    private bx createAbsPageLifeCycle() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (bx) ipChange.ipc$dispatch("36e5e101", new Object[]{this});
        }
        return new d();
    }

    private hqk createDataProcessListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (hqk) ipChange.ipc$dispatch("656f8d08", new Object[]{this});
        }
        return new c();
    }

    private l6c createFestivalChangeListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (l6c) ipChange.ipc$dispatch("417b612a", new Object[]{this});
        }
        return new e();
    }

    private Localization.a createLocaleChangeListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Localization.a) ipChange.ipc$dispatch("a6b7cd4b", new Object[]{this});
        }
        return new b();
    }

    private IHomeViewService.b createOnPageChangeListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IHomeViewService.b) ipChange.ipc$dispatch("83b2b44a", new Object[]{this});
        }
        return new f();
    }

    private TabHostStatusListener createTabHostStatusListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TabHostStatusListener) ipChange.ipc$dispatch("454eb5ed", new Object[]{this});
        }
        return new a();
    }

    private String getTabBarFestivalButtonImageUrl() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3722d6e7", new Object[]{this});
        }
        return FestivalMgr.i().l("global", TAB_BAR_BUTTON_BG_PIC_URL_KEY);
    }

    @Override // com.taobao.tao.topmultitab.service.base.IHomePageService, com.taobao.infoflow.protocol.subservice.ISubService
    public /* synthetic */ void onCreateService(cfc cfcVar) {
        xcc.a(this, cfcVar);
    }

    @Override // com.taobao.infoflow.protocol.subservice.ISubService
    public void onDestroyService() {
        IHomeViewService.b bVar;
        IFestivalService iFestivalService;
        hqk hqkVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("770ac0a1", new Object[]{this});
            return;
        }
        Localization.a aVar = this.mLocaleChangeListener;
        if (aVar != null) {
            Localization.s(aVar);
        }
        IHomeDataService iHomeDataService = this.mDataService;
        if (!(iHomeDataService == null || (hqkVar = this.mDataProcessListener) == null)) {
            iHomeDataService.removeDataProcessListener(hqkVar);
        }
        if (!(this.mFestivalChangeListener == null || (iFestivalService = this.mFestivalService) == null)) {
            iFestivalService.getFestivalChangeRegister().b(this.mFestivalChangeListener);
        }
        IHomeViewService iHomeViewService = this.mViewService;
        if (!(iHomeViewService == null || (bVar = this.mOnPageChangeListener) == null)) {
            iHomeViewService.removeOnPageChangeListener(bVar);
        }
        jps jpsVar = this.mTabBarActionButtonProvider;
        if (jpsVar != null) {
            jpsVar.e();
        }
        if (this.mPageLifeCycle != null) {
            s2b.c().u(this.mPageLifeCycle);
        }
        com.taobao.tao.navigation.a.c0("homePage");
    }

    @Override // com.taobao.tao.topmultitab.service.tabbar.ITabBarActionButtonService
    public void setRocketState(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a598d3b2", new Object[]{this, new Boolean(z)});
        } else if (z) {
            setTabBarActionButtonState("rocket");
        } else {
            setTabBarActionButtonState(kis.TAO);
        }
    }

    @Override // com.taobao.tao.topmultitab.service.tabbar.ITabBarActionButtonService
    public void setTabBarActionButtonState(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("78b836da", new Object[]{this, str});
        } else if (this.mTabBarActionButtonService != null) {
            if (TextUtils.equals("rocket", str)) {
                this.mTabBarActionButtonService.changeToR4UButtonView();
            } else {
                this.mTabBarActionButtonService.changeToHomepageButtonView();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class e implements l6c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public e() {
        }

        @Override // tb.l6c
        public void onFestivalChanged() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d12b9844", new Object[]{this});
                return;
            }
            vqa j = vqa.k().i("BottomTabBar").j("onFestivalChanged");
            if (Localization.o()) {
                j.e("海外多语言").a();
                return;
            }
            String access$900 = TabBarActionButtonServiceImpl.access$900(TabBarActionButtonServiceImpl.this);
            boolean isEmpty = TextUtils.isEmpty(access$900);
            boolean z = !isEmpty;
            if (TabBarActionButtonServiceImpl.access$100(TabBarActionButtonServiceImpl.this) == null) {
                j.e("mTabBarActionButtonProvider == null").a();
            } else if (!isEmpty) {
                j.e("imageUrl: " + access$900).a();
                TabBarActionButtonServiceImpl.access$100(TabBarActionButtonServiceImpl.this).q(access$900);
                TabBarActionButtonServiceImpl.access$502(TabBarActionButtonServiceImpl.this, true);
            } else if (z != TabBarActionButtonServiceImpl.access$500(TabBarActionButtonServiceImpl.this)) {
                TabBarActionButtonServiceImpl.access$100(TabBarActionButtonServiceImpl.this).o(TabBarActionButtonServiceImpl.access$1000(TabBarActionButtonServiceImpl.this));
                TabBarActionButtonServiceImpl.access$502(TabBarActionButtonServiceImpl.this, false);
            }
        }
    }

    private boolean isGrey(IContainerDataModel<?> iContainerDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("890f200f", new Object[]{this, iContainerDataModel})).booleanValue();
        }
        vqa j = vqa.k().i("BottomTabBar").j("isGrey");
        if (iContainerDataModel == null) {
            j.e("containerDataModel == null").a();
            return false;
        }
        IContainerInnerDataModel<?> base = iContainerDataModel.getBase();
        if (base == null) {
            j.e("baseData == null").a();
            return false;
        }
        JSONObject passParams = base.getPassParams();
        if (passParams == null) {
            j.e("passParams == null").a();
            return false;
        }
        boolean booleanValue = passParams.getBooleanValue(GLOBAL_GREY);
        j.e("isGrey: " + booleanValue).a();
        return booleanValue;
    }

    @Override // com.taobao.tao.topmultitab.service.tabbar.ITabBarActionButtonService
    public void changeToHomepageButtonView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9fc745b7", new Object[]{this});
            return;
        }
        vqa j = vqa.k().i("BottomTabBar").j("changeToHomepageButtonView");
        if (this.mTabBarActionButtonProvider == null) {
            j.e("mTabBarActionButtonProvider == null").a();
        } else if (!this.mIsAtR4UStatus || this.mIsFestivalStatus) {
            j.e("不是小火箭状态或者有氛围: " + this.mIsFestivalStatus).a();
        } else if (Localization.o()) {
            j.e("海外多语言不设置成淘字").a();
        } else {
            this.mIsAtR4UStatus = false;
            j.e("切换成淘字按钮").a();
            this.mTabBarActionButtonProvider.c();
        }
    }

    @Override // com.taobao.tao.topmultitab.service.tabbar.ITabBarActionButtonService
    public void changeToR4UButtonView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3081ec66", new Object[]{this});
            return;
        }
        vqa j = vqa.k().i("BottomTabBar").j("changeToR4UButtonView");
        if (this.mTabBarActionButtonProvider == null) {
            j.e("tabBarActionButtonProvider == null").a();
        } else if (this.mIsAtR4UStatus || this.mIsFestivalStatus) {
            j.e("当前是小火箭状态或者有氛围: " + this.mIsFestivalStatus).a();
        } else if (Localization.o()) {
            j.e("海外多语言不设置成小火箭").a();
        } else {
            this.mIsAtR4UStatus = true;
            j.e("切换成小火箭按钮").a();
            this.mTabBarActionButtonProvider.d();
        }
    }

    @Override // com.taobao.tao.topmultitab.service.base.IHomePageService
    public void onCreateService(wcc wccVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("312ad712", new Object[]{this, wccVar});
            return;
        }
        this.mControllerService = (IHomeControllerService) wccVar.a(IHomeControllerService.class);
        this.mViewService = (IHomeViewService) wccVar.a(IHomeViewService.class);
        this.mTabBarActionButtonService = (ITabBarActionButtonService) wccVar.a(ITabBarActionButtonService.class);
        if (this.mViewService != null) {
            IHomeViewService.b createOnPageChangeListener = createOnPageChangeListener();
            this.mOnPageChangeListener = createOnPageChangeListener;
            this.mViewService.addOnPageChangeListener(createOnPageChangeListener);
        }
        this.mTabBarActionButtonProvider = new jps(wccVar);
        this.mLocaleChangeListener = createLocaleChangeListener();
        this.mDataProcessListener = createDataProcessListener();
        this.mFestivalChangeListener = createFestivalChangeListener();
        Localization.a(this.mLocaleChangeListener);
        com.taobao.tao.navigation.a.J("homePage", createTabHostStatusListener());
        IHomeDataService iHomeDataService = (IHomeDataService) wccVar.a(IHomeDataService.class);
        this.mDataService = iHomeDataService;
        if (iHomeDataService != null) {
            iHomeDataService.addDataProcessListener(this.mDataProcessListener);
        }
        IFestivalService iFestivalService = (IFestivalService) wccVar.a(IFestivalService.class);
        this.mFestivalService = iFestivalService;
        if (iFestivalService != null) {
            iFestivalService.getFestivalChangeRegister().a(this.mFestivalChangeListener);
        }
        this.mTabBarActionButtonProvider.h();
        if (Localization.o()) {
            loadOverseaTabBarButton();
        }
        this.mPageLifeCycle = createAbsPageLifeCycle();
        s2b.c().r(this.mPageLifeCycle);
    }

    private void loadOverseaTabBarButton() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d21dc6ec", new Object[]{this});
            return;
        }
        Drawable drawable = Globals.getApplication().getDrawable(R.drawable.uik_nav_home_selected_en);
        this.mIsOverSeaButton = true;
        vqa.k().i("BottomTabBar").j("loadOverseaButton").e("加载海外图标").a();
        this.mTabBarActionButtonProvider.j(drawable, false);
    }

    private void resetView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd36a71b", new Object[]{this});
            return;
        }
        vqa j = vqa.k().i("BottomTabBar").j("resetView");
        if (this.mTabBarActionButtonProvider != null) {
            if (kbq.e(Globals.getApplication())) {
                this.mIsAtR4UStatus = false;
            }
            this.mTabBarActionButtonProvider.n();
            if (this.mIsFestivalStatus) {
                String tabBarFestivalButtonImageUrl = getTabBarFestivalButtonImageUrl();
                this.mTabBarActionButtonProvider.q(tabBarFestivalButtonImageUrl);
                j.e("当前有氛围，需要恢复，氛围是: " + tabBarFestivalButtonImageUrl).a();
            } else if (Localization.o()) {
                loadOverseaTabBarButton();
                j.e("当前是海外多语言，设置海外图标").a();
            } else if (this.mIsGrey) {
                this.mTabBarActionButtonProvider.p(true);
                j.e("当前置灰，需要恢复").a();
            } else {
                this.mTabBarActionButtonProvider.o(this.mIsAtR4UStatus);
                j.e("重置小火箭视图").a();
            }
        }
    }
}
