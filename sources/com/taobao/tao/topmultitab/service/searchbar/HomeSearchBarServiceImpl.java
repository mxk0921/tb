package com.taobao.tao.topmultitab.service.searchbar;

import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.infoflow.protocol.model.datamodel.response.IContainerDataModel;
import com.taobao.informationflowdataservice.dataservice.core.datasource.model.card.SectionModel;
import com.taobao.tao.Globals;
import com.taobao.tao.topmultitab.service.data.IHomeDataService;
import com.taobao.tao.topmultitab.service.festival.IFestivalService;
import com.taobao.tao.topmultitab.service.lifecycle.IHomePageLifecycleService;
import com.taobao.tao.topmultitab.service.searchbar.impl.bgview.HomeSearchBarBgView;
import com.taobao.tao.topmultitab.service.searchbar.impl.searchview.SearchBarView;
import com.taobao.tao.topmultitab.service.view.IHomeViewService;
import com.taobao.tao.util.DensityUtil;
import com.taobao.tao.util.SystemBarDecorator;
import com.taobao.taobao.R;
import tb.bzh;
import tb.c0p;
import tb.cfc;
import tb.dvh;
import tb.e0p;
import tb.f0p;
import tb.hqk;
import tb.imn;
import tb.jt8;
import tb.l6c;
import tb.os6;
import tb.q0p;
import tb.rvk;
import tb.saj;
import tb.t2o;
import tb.tit;
import tb.uqa;
import tb.wcc;
import tb.xcc;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class HomeSearchBarServiceImpl implements IHomeSearchBarService {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int DEFAULT_SEARCHBAR_CONTAINER_HEIGHT = 77;
    private static final String SEARCH_BAR_CONTAINER_HEIGHT = "searchBarContainerHeight";
    public static final float STATUS_HEIGHT_DP_FLOAT;
    public static final int STATUS_HEIGHT_PX;
    public static final String S_ITEM = "item";
    private static final String TAG = "HomeSearchBarServiceImpl";
    public int currentHeightPX;
    private c0p mBgController;
    private hqk mDataProcessListener;
    private IHomeDataService mDataService;
    private l6c mFestivalChangeListener;
    private wcc mHomeContext;
    private boolean mIsCreateView;
    private ViewTreeObserver.OnGlobalLayoutListener mListener;
    private bzh mMainContainerLayoutController;
    private saj mMultiController;
    private int mOldSearchContainerHeight;
    private RelativeLayout mSearchBarContainer;
    private rvk mUiRefreshListener;
    private q0p mViewController;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements l6c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // tb.l6c
        public void onFestivalChanged() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d12b9844", new Object[]{this});
                return;
            }
            HomeSearchBarServiceImpl.access$000(HomeSearchBarServiceImpl.this).o();
            HomeSearchBarServiceImpl.access$100(HomeSearchBarServiceImpl.this).d();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class b implements ViewTreeObserver.OnGlobalLayoutListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("df7e7eb3", new Object[]{this});
                return;
            }
            uqa.b("SearchBar", "onGlobalLayout", null);
            HomeSearchBarServiceImpl.access$200(HomeSearchBarServiceImpl.this);
            HomeSearchBarServiceImpl.access$300(HomeSearchBarServiceImpl.this);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class c implements hqk {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // tb.hqk
        public void a(JSONObject jSONObject, IContainerDataModel<?> iContainerDataModel, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8a114a6e", new Object[]{this, jSONObject, iContainerDataModel, str});
                return;
            }
            uqa.b("SearchBar", "onDataProcessFinish", "MainContainerLayout refreshLayout");
            HomeSearchBarServiceImpl.access$500(HomeSearchBarServiceImpl.this).i(iContainerDataModel, str, HomeSearchBarServiceImpl.access$400(HomeSearchBarServiceImpl.this));
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
    public class d implements rvk {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public d() {
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
            f0p.b(imnVar, str);
            JSONObject d = e0p.d();
            String g = e0p.g(d);
            if (!HomeSearchBarServiceImpl.this.isDX3SearchViewReady() || TextUtils.isEmpty(g)) {
                HomeSearchBarServiceImpl.this.setSearchSection(d);
                uqa.b("SearchBar", "dataFinish", "updateSearchBarByNewData setSearchSection");
                return;
            }
            HomeSearchBarServiceImpl.access$100(HomeSearchBarServiceImpl.this).b(d);
            uqa.b("SearchBar", "dataFinish", "updateSearchBarByNewData refreshSearchBox");
        }
    }

    static {
        t2o.a(729810317);
        t2o.a(729810322);
        int statusBarHeight = SystemBarDecorator.getStatusBarHeight(Globals.getApplication());
        STATUS_HEIGHT_PX = statusBarHeight;
        STATUS_HEIGHT_DP_FLOAT = jt8.b(Globals.getApplication(), statusBarHeight);
    }

    public static /* synthetic */ c0p access$000(HomeSearchBarServiceImpl homeSearchBarServiceImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c0p) ipChange.ipc$dispatch("95d9273d", new Object[]{homeSearchBarServiceImpl});
        }
        return homeSearchBarServiceImpl.mBgController;
    }

    public static /* synthetic */ q0p access$100(HomeSearchBarServiceImpl homeSearchBarServiceImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (q0p) ipChange.ipc$dispatch("a1d43efc", new Object[]{homeSearchBarServiceImpl});
        }
        return homeSearchBarServiceImpl.mViewController;
    }

    public static /* synthetic */ void access$200(HomeSearchBarServiceImpl homeSearchBarServiceImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7a43e303", new Object[]{homeSearchBarServiceImpl});
        } else {
            homeSearchBarServiceImpl.updateTabViewPadding();
        }
    }

    public static /* synthetic */ void access$300(HomeSearchBarServiceImpl homeSearchBarServiceImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("934534a2", new Object[]{homeSearchBarServiceImpl});
        } else {
            homeSearchBarServiceImpl.saveSearchBarContainerHeight();
        }
    }

    public static /* synthetic */ RelativeLayout access$400(HomeSearchBarServiceImpl homeSearchBarServiceImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RelativeLayout) ipChange.ipc$dispatch("b1167b91", new Object[]{homeSearchBarServiceImpl});
        }
        return homeSearchBarServiceImpl.mSearchBarContainer;
    }

    public static /* synthetic */ bzh access$500(HomeSearchBarServiceImpl homeSearchBarServiceImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (bzh) ipChange.ipc$dispatch("ae7e60f6", new Object[]{homeSearchBarServiceImpl});
        }
        return homeSearchBarServiceImpl.mMainContainerLayoutController;
    }

    private void addOnGlobalLayoutListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d902cf08", new Object[]{this});
            return;
        }
        this.mListener = createGlobalLayoutListener();
        this.mSearchBarContainer.getViewTreeObserver().addOnGlobalLayoutListener(this.mListener);
    }

    private Pair<String, String> beginMTSStage(JSONObject jSONObject) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Pair) ipChange.ipc$dispatch("1b1d0878", new Object[]{this, jSONObject});
        }
        String j = dvh.j(dvh.TASK_UI_REFRESH);
        tit.a b2 = tit.b(jSONObject.getJSONObject("template"));
        if (TextUtils.isEmpty(j) || b2 == null || TextUtils.isEmpty(b2.d())) {
            str = "";
        } else {
            str = b2.d();
            dvh.b(str, j);
        }
        return new Pair<>(j, str);
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
        return new a();
    }

    private ViewTreeObserver.OnGlobalLayoutListener createGlobalLayoutListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewTreeObserver.OnGlobalLayoutListener) ipChange.ipc$dispatch("44593aa0", new Object[]{this});
        }
        return new b();
    }

    private rvk createUiRefreshListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rvk) ipChange.ipc$dispatch("8d198fc8", new Object[]{this});
        }
        return new d();
    }

    private void registerDataProcess() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cbcc0c49", new Object[]{this});
        } else if (this.mDataService != null) {
            hqk createDataProcessListener = createDataProcessListener();
            this.mDataProcessListener = createDataProcessListener;
            this.mDataService.addDataProcessListener(createDataProcessListener);
        }
    }

    private void registerFestivalChangeListener() {
        IFestivalService iFestivalService;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c0612ba6", new Object[]{this});
            return;
        }
        wcc wccVar = this.mHomeContext;
        if (wccVar != null && (iFestivalService = (IFestivalService) wccVar.a(IFestivalService.class)) != null) {
            this.mFestivalChangeListener = createFestivalChangeListener();
            iFestivalService.getFestivalChangeRegister().a(this.mFestivalChangeListener);
        }
    }

    private void registerUiRefreshListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("adb2e39f", new Object[]{this});
        } else if (this.mDataService != null) {
            rvk createUiRefreshListener = createUiRefreshListener();
            this.mUiRefreshListener = createUiRefreshListener;
            this.mDataService.addOnUiRefreshListener(createUiRefreshListener);
        }
    }

    private void removeOnGlobalLayoutListener() {
        RelativeLayout relativeLayout;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("723d692b", new Object[]{this});
        } else if (this.mListener != null && (relativeLayout = this.mSearchBarContainer) != null) {
            relativeLayout.getViewTreeObserver().removeOnGlobalLayoutListener(this.mListener);
        }
    }

    private void saveSearchBarContainerHeight() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6bb2e661", new Object[]{this});
            return;
        }
        int currentSearchContainerHeightPX = getCurrentSearchContainerHeightPX();
        if (isSearchBarContainerHeightChange(currentSearchContainerHeightPX)) {
            boolean k = os6.k(SEARCH_BAR_CONTAINER_HEIGHT, currentSearchContainerHeightPX);
            uqa.b("SearchBar", "saveSearchBarContainerHeight", "isSaveSucceed: " + k);
        }
    }

    private void unRegisterFestivalChangeListener() {
        IFestivalService iFestivalService;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e6fd01f", new Object[]{this});
            return;
        }
        wcc wccVar = this.mHomeContext;
        if (wccVar != null && this.mFestivalChangeListener != null && (iFestivalService = (IFestivalService) wccVar.a(IFestivalService.class)) != null) {
            iFestivalService.getFestivalChangeRegister().b(this.mFestivalChangeListener);
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
        if (iHomeDataService != null && (rvkVar = this.mUiRefreshListener) != null) {
            iHomeDataService.removeOnUiRefreshListener(rvkVar);
        }
    }

    private void unregisterDataProcess() {
        hqk hqkVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e8aa190", new Object[]{this});
            return;
        }
        IHomeDataService iHomeDataService = this.mDataService;
        if (iHomeDataService != null && (hqkVar = this.mDataProcessListener) != null) {
            iHomeDataService.removeDataProcessListener(hqkVar);
        }
    }

    private void updateTabViewPadding() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("30f0487", new Object[]{this});
        } else if (isSearchBarContainerHeightChange(getCurrentSearchContainerHeightPX())) {
            IHomeViewService iHomeViewService = (IHomeViewService) this.mHomeContext.a(IHomeViewService.class);
            if (iHomeViewService != null) {
                uqa.b("SearchBar", "updateTabViewPadding", "更新padding");
                iHomeViewService.updatePageViewPadding();
            }
            this.mOldSearchContainerHeight = getCurrentSearchContainerHeightPX();
        }
    }

    @Override // com.taobao.tao.topmultitab.service.searchbar.IHomeSearchBarService
    public void addViewToMultiTabContainer(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b6caa27", new Object[]{this, view});
        } else if (!this.mIsCreateView) {
            uqa.b("SearchBar", "addViewToMultiTabContainer", "视图没创建");
        } else {
            uqa.b("SearchBar", "addViewToMultiTabContainer", "添加分类tab");
            this.mMultiController.c(view);
            updateTabViewPadding();
            saveSearchBarContainerHeight();
        }
    }

    @Override // com.taobao.tao.topmultitab.service.searchbar.IHomeSearchBarService
    public void createView(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f36ae60a", new Object[]{this, view});
            return;
        }
        RelativeLayout relativeLayout = (RelativeLayout) view;
        this.mSearchBarContainer = relativeLayout;
        this.mMainContainerLayoutController.j(relativeLayout);
        this.mOldSearchContainerHeight = view.getHeight();
        this.mDataService = (IHomeDataService) this.mHomeContext.a(IHomeDataService.class);
        this.mBgController = new c0p(this.mDataService, (IHomePageLifecycleService) this.mHomeContext.a(IHomePageLifecycleService.class), (HomeSearchBarBgView) view.findViewById(R.id.search_bg_view));
        this.mViewController = new q0p(this.mHomeContext, (SearchBarView) view.findViewById(R.id.search_view));
        this.mMultiController = new saj((FrameLayout) view.findViewById(R.id.multi_tab_container));
        registerUiRefreshListener();
        registerDataProcess();
        registerFestivalChangeListener();
        addOnGlobalLayoutListener();
        this.mIsCreateView = true;
        setSearchSection(e0p.d());
        uqa.b("SearchBar", "createView", null);
    }

    @Override // com.taobao.tao.topmultitab.service.searchbar.IHomeSearchBarService
    public void forceRefreshSearchBar() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("143938c2", new Object[]{this});
        } else if (this.mIsCreateView) {
            JSONObject d2 = e0p.d();
            if (d2 == null) {
                uqa.b("SearchBar", "forceRefreshSearchBar", "searchBarSection == null");
                return;
            }
            SectionModel sectionModel = new SectionModel(d2);
            e0p.c(sectionModel);
            setSearchSection(sectionModel);
            uqa.b("SearchBar", "forceRefreshSearchBar", "强制刷新搜索栏");
        }
    }

    @Override // com.taobao.tao.topmultitab.service.searchbar.IHomeSearchBarService
    public int getCurrentSearchContainerHeightPX() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9d5dc97f", new Object[]{this})).intValue();
        }
        int dip2px = DensityUtil.dip2px(this.mSearchBarContainer.getContext(), 77.0f) + STATUS_HEIGHT_PX;
        uqa.b("SearchBar", "getCurrentHeightPX", "defaultValue: " + dip2px);
        if (!this.mIsCreateView) {
            int f = os6.f(SEARCH_BAR_CONTAINER_HEIGHT, dip2px);
            uqa.b("SearchBar", "getCurrentHeightPX", "saveData: " + f);
            return f;
        }
        this.currentHeightPX = this.mSearchBarContainer.getMeasuredHeight();
        uqa.b("SearchBar", "getCurrentHeightPX", "currentHeightPX before: " + this.currentHeightPX);
        if (this.currentHeightPX <= 0) {
            this.currentHeightPX = os6.f(SEARCH_BAR_CONTAINER_HEIGHT, dip2px);
        }
        uqa.b("SearchBar", "getCurrentHeightPX", "currentHeightPX: " + this.currentHeightPX);
        return this.currentHeightPX;
    }

    @Override // com.taobao.tao.topmultitab.service.searchbar.IHomeSearchBarService
    @Deprecated
    public DXRootView getDX3SearchView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXRootView) ipChange.ipc$dispatch("62c6355a", new Object[]{this});
        }
        if (!this.mIsCreateView) {
            return null;
        }
        return this.mViewController.getDX3SearchView();
    }

    @Override // com.taobao.tao.topmultitab.service.searchbar.IHomeSearchBarService
    public Object getValueFromSearchBarData(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("2ad6f931", new Object[]{this, str});
        }
        if (this.mIsCreateView) {
            return this.mViewController.getValueFromSearchBarData(str);
        }
        uqa.b("SearchBar", "getValueFromSearchBarData", "视图没创建");
        return null;
    }

    @Override // com.taobao.tao.topmultitab.service.searchbar.IHomeSearchBarService
    public boolean isDX3SearchViewReady() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("71f603cc", new Object[]{this})).booleanValue();
        }
        if (!this.mIsCreateView) {
            return false;
        }
        return this.mViewController.isDX3SearchViewReady();
    }

    @Override // com.taobao.tao.topmultitab.service.base.IHomePageService, com.taobao.infoflow.protocol.subservice.ISubService
    public /* synthetic */ void onCreateService(cfc cfcVar) {
        xcc.a(this, cfcVar);
    }

    @Override // com.taobao.infoflow.protocol.subservice.ISubService
    public void onDestroyService() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("770ac0a1", new Object[]{this});
            return;
        }
        unRegisterUiRefreshListener();
        unregisterDataProcess();
        unRegisterFestivalChangeListener();
        removeOnGlobalLayoutListener();
        this.mMultiController.f();
        this.mViewController.destroy();
        this.mBgController.h();
        this.mIsCreateView = false;
        uqa.b("SearchBar", "destroy", null);
    }

    @Override // com.taobao.tao.topmultitab.service.searchbar.IHomeSearchBarService
    public void partialRefreshWidgetNode(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d2f7eb1", new Object[]{this, str});
        } else if (!this.mIsCreateView) {
            uqa.b("SearchBar", "partialRefreshWidgetNode", "视图没创建");
        } else {
            this.mViewController.partialRefreshWidgetNode(str);
        }
    }

    @Override // com.taobao.tao.topmultitab.service.searchbar.IHomeSearchBarService
    public void refreshSearchBox(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("739411e1", new Object[]{this, jSONObject});
        } else if (!this.mIsCreateView) {
            uqa.b("SearchBar", "isFromHomeRequest", "视图没创建");
        } else {
            uqa.b("SearchBar", "refreshSearchBox", "");
            this.mViewController.c(jSONObject);
        }
    }

    @Override // com.taobao.tao.topmultitab.service.searchbar.IHomeSearchBarService
    public void setSearchBarAlpha(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe736164", new Object[]{this, new Float(f)});
        } else if (this.mIsCreateView) {
            this.mSearchBarContainer.setAlpha(f);
        }
    }

    @Override // com.taobao.tao.topmultitab.service.searchbar.IHomeSearchBarService
    public void setSearchBarVisibility(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("457cd41", new Object[]{this, new Integer(i)});
        } else if (!this.mIsCreateView) {
            uqa.b("SearchBar", "setSearchBarVisibility", "视图没创建");
        } else {
            uqa.b("SearchBar", "setSearchBarVisibility", "visibility: " + i);
            if (this.mSearchBarContainer.getVisibility() == i) {
                uqa.b("SearchBar", "setSearchBarVisibility", "visibility 没变化");
            } else {
                this.mSearchBarContainer.setVisibility(i);
            }
        }
    }

    @Override // com.taobao.tao.topmultitab.service.base.IHomePageService
    public void onCreateService(wcc wccVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("312ad712", new Object[]{this, wccVar});
            return;
        }
        this.mHomeContext = wccVar;
        this.mMainContainerLayoutController = new bzh();
    }

    @Override // com.taobao.tao.topmultitab.service.searchbar.IHomeSearchBarService
    public void setSearchSection(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f57b94e", new Object[]{this, jSONObject});
            return;
        }
        uqa.b("SearchBar", "refreshDxSearchBar", null);
        if (jSONObject != null && this.mIsCreateView) {
            Pair<String, String> beginMTSStage = beginMTSStage(jSONObject);
            this.mBgController.n(jSONObject);
            this.mViewController.a(jSONObject, this.mHomeContext);
            updateTabViewPadding();
            saveSearchBarContainerHeight();
            if (!TextUtils.isEmpty((CharSequence) beginMTSStage.first) && !TextUtils.isEmpty((CharSequence) beginMTSStage.second)) {
                dvh.f((String) beginMTSStage.second, true, (String) beginMTSStage.first);
            }
        }
    }

    private boolean isSearchBarContainerHeightChange(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("afad83a9", new Object[]{this, new Integer(i)})).booleanValue();
        }
        uqa.b("SearchBar", "updateTabViewPadding", "newSearchBarHeight: " + i + "mOldSearchContainerHeight: " + this.mOldSearchContainerHeight);
        return i != this.mOldSearchContainerHeight;
    }
}
