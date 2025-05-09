package com.taobao.infoflow.taobao.subservice.biz.afterbuy.staytimeservice;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.behavir.config.BHRTaskConfigBase;
import com.taobao.infoflow.protocol.model.datamodel.response.IContainerDataModel;
import com.taobao.infoflow.protocol.subservice.biz.afterbuy.IAfterBuyStayTimeService;
import com.taobao.infoflow.protocol.subservice.framework.IContainerDataService;
import com.taobao.infoflow.protocol.subservice.framework.IMainFeedsViewService;
import com.taobao.informationflowdataservice.dataservice.core.datasource.model.card.SectionModel;
import com.taobao.informationflowdataservice.dataservice.core.datasource.model.response.AwesomeGetContainerData;
import com.taobao.nestedscroll.recyclerview.ChildRecyclerView;
import java.util.ArrayList;
import java.util.List;
import tb.arb;
import tb.cfc;
import tb.get;
import tb.h6c;
import tb.lrj;
import tb.pb6;
import tb.pof;
import tb.py;
import tb.t2o;
import tb.tit;
import tb.uqa;
import tb.ynf;
import tb.z4a;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class AfterBuyStayTimeServiceImpl implements IAfterBuyStayTimeService {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final int DEFAULT_ANCHOR = Integer.MAX_VALUE;
    private static final String TAG = "RecommendStayTimeListener";
    private int anchorPos;
    private arb containerType;
    private int currentVisible = -1;
    private List<SectionModel> lastData;
    private h6c<ViewGroup> mFeedsViewLifeCycleRegister;
    private cfc mInfoFlowContext;
    private IMainFeedsViewService<?> mMainFeedsViewService;
    private View.OnAttachStateChangeListener mOnAttachStateChangeListener;
    private h6c.c<ViewGroup> mOnFeedsScrollListener;
    private h6c.e mOnWindowVisibilityChangedListener;
    private ViewPager.OnPageChangeListener pageChangeListener;
    private List<py> stayTimeCalculators;
    private ViewPager viewPager;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                AfterBuyStayTimeServiceImpl.access$000(AfterBuyStayTimeServiceImpl.this);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class b implements h6c.c<ViewGroup> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // tb.h6c.c
        public void n(boolean z, boolean z2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("bb26e08c", new Object[]{this, new Boolean(z), new Boolean(z2)});
            }
        }

        @Override // tb.h6c.c
        public void onScrollStateChanged(ViewGroup viewGroup, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e409bdce", new Object[]{this, viewGroup, new Integer(i)});
            } else if (i == 0 && (viewGroup instanceof ChildRecyclerView)) {
                AfterBuyStayTimeServiceImpl.access$100(AfterBuyStayTimeServiceImpl.this, (ChildRecyclerView) viewGroup);
            }
        }

        @Override // tb.h6c.c
        public void onScrolled(ViewGroup viewGroup, int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f7f64c91", new Object[]{this, viewGroup, new Integer(i), new Integer(i2)});
            } else if (viewGroup instanceof ChildRecyclerView) {
                AfterBuyStayTimeServiceImpl.access$100(AfterBuyStayTimeServiceImpl.this, (ChildRecyclerView) viewGroup);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class c implements h6c.e {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // tb.h6c.e
        public void b(boolean z) {
            int i = 0;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e4813aba", new Object[]{this, new Boolean(z)});
                return;
            }
            ViewGroup originalView = AfterBuyStayTimeServiceImpl.access$400(AfterBuyStayTimeServiceImpl.this).getOriginalView();
            if (!(originalView instanceof ChildRecyclerView)) {
                uqa.b(BHRTaskConfigBase.TYPE_CONFIG_UT, AfterBuyStayTimeServiceImpl.TAG, "onWindowVisibilityChanged, view not ChildRecyclerView, discard");
            } else if (!z || AfterBuyStayTimeServiceImpl.access$500(AfterBuyStayTimeServiceImpl.this, (RecyclerView) originalView)) {
                if (!z) {
                    i = 4;
                }
                AfterBuyStayTimeServiceImpl.access$300(AfterBuyStayTimeServiceImpl.this, (ChildRecyclerView) originalView, i);
            } else {
                uqa.b(BHRTaskConfigBase.TYPE_CONFIG_UT, AfterBuyStayTimeServiceImpl.TAG, "onWindowVisibilityChanged, view not onScreen, discard");
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class d implements View.OnAttachStateChangeListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public d() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3d337638", new Object[]{this, view});
            } else if (view instanceof ChildRecyclerView) {
                AfterBuyStayTimeServiceImpl.this.onAttachedToWindow((ChildRecyclerView) view);
            }
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7f64d55b", new Object[]{this, view});
            } else if (view instanceof ChildRecyclerView) {
                AfterBuyStayTimeServiceImpl.this.onDetachedFromWindow();
            }
        }
    }

    static {
        t2o.a(491782274);
        t2o.a(488636630);
    }

    public static /* synthetic */ void access$000(AfterBuyStayTimeServiceImpl afterBuyStayTimeServiceImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5d558271", new Object[]{afterBuyStayTimeServiceImpl});
        } else {
            afterBuyStayTimeServiceImpl.unRegisterViewPagerListener();
        }
    }

    public static /* synthetic */ void access$100(AfterBuyStayTimeServiceImpl afterBuyStayTimeServiceImpl, ChildRecyclerView childRecyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f527d8b4", new Object[]{afterBuyStayTimeServiceImpl, childRecyclerView});
        } else {
            afterBuyStayTimeServiceImpl.calculate(childRecyclerView);
        }
    }

    public static /* synthetic */ ViewPager access$200(AfterBuyStayTimeServiceImpl afterBuyStayTimeServiceImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewPager) ipChange.ipc$dispatch("61b0f05a", new Object[]{afterBuyStayTimeServiceImpl});
        }
        return afterBuyStayTimeServiceImpl.viewPager;
    }

    public static /* synthetic */ void access$300(AfterBuyStayTimeServiceImpl afterBuyStayTimeServiceImpl, ChildRecyclerView childRecyclerView, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("80fa508d", new Object[]{afterBuyStayTimeServiceImpl, childRecyclerView, new Integer(i)});
        } else {
            afterBuyStayTimeServiceImpl.changeVisibility(childRecyclerView, i);
        }
    }

    public static /* synthetic */ IMainFeedsViewService access$400(AfterBuyStayTimeServiceImpl afterBuyStayTimeServiceImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IMainFeedsViewService) ipChange.ipc$dispatch("7fc00c9d", new Object[]{afterBuyStayTimeServiceImpl});
        }
        return afterBuyStayTimeServiceImpl.mMainFeedsViewService;
    }

    public static /* synthetic */ boolean access$500(AfterBuyStayTimeServiceImpl afterBuyStayTimeServiceImpl, RecyclerView recyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("32ce4005", new Object[]{afterBuyStayTimeServiceImpl, recyclerView})).booleanValue();
        }
        return afterBuyStayTimeServiceImpl.isViewOnScreen(recyclerView);
    }

    private void calculate(ChildRecyclerView childRecyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("648b5eef", new Object[]{this, childRecyclerView});
        } else if (this.stayTimeCalculators != null) {
            int anchorPos = getAnchorPos(childRecyclerView);
            this.anchorPos = anchorPos;
            if (anchorPos != Integer.MAX_VALUE) {
                for (py pyVar : this.stayTimeCalculators) {
                    pyVar.a(childRecyclerView, this.anchorPos);
                }
            }
        }
    }

    private void changeVisibility(ChildRecyclerView childRecyclerView, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3f426ff8", new Object[]{this, childRecyclerView, new Integer(i)});
        } else if (!isVisibleChange(this.currentVisible, i)) {
            uqa.b(BHRTaskConfigBase.TYPE_CONFIG_UT, TAG, "changeVisibility, visible not change, discard. current=" + this.currentVisible);
        } else {
            this.currentVisible = i;
            uqa.b(BHRTaskConfigBase.TYPE_CONFIG_UT, TAG, "changeVisibility, change visibility to " + i);
            if (i == 0) {
                uqa.b(BHRTaskConfigBase.TYPE_CONFIG_UT, TAG, "changeVisibility, start calculate");
                calculate(childRecyclerView);
                return;
            }
            uqa.b(BHRTaskConfigBase.TYPE_CONFIG_UT, TAG, "changeVisibility, start leave");
            leave();
        }
    }

    private View.OnAttachStateChangeListener createAttachStateChangeListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View.OnAttachStateChangeListener) ipChange.ipc$dispatch("3f6af2f0", new Object[]{this});
        }
        return new d();
    }

    private h6c.c<ViewGroup> createOnFeedsScrollListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (h6c.c) ipChange.ipc$dispatch("424ddef8", new Object[]{this});
        }
        return new b();
    }

    private h6c.e createOnWindowVisibilityChangedListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (h6c.e) ipChange.ipc$dispatch("97524f18", new Object[]{this});
        }
        return new c();
    }

    private ViewPager.OnPageChangeListener createPageChangeListener(final ChildRecyclerView childRecyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewPager.OnPageChangeListener) ipChange.ipc$dispatch("8a179641", new Object[]{this, childRecyclerView});
        }
        return new ViewPager.OnPageChangeListener() { // from class: com.taobao.infoflow.taobao.subservice.biz.afterbuy.staytimeservice.AfterBuyStayTimeServiceImpl.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
            public void onPageScrollStateChanged(int i) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("6581cc1e", new Object[]{this, new Integer(i)});
                }
            }

            @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
            public void onPageScrolled(int i, float f, int i2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("f4c13b05", new Object[]{this, new Integer(i), new Float(f), new Integer(i2)});
                }
            }

            @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
            public void onPageSelected(int i) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("184d6f33", new Object[]{this, new Integer(i)});
                    return;
                }
                try {
                    uqa.b(BHRTaskConfigBase.TYPE_CONFIG_UT, AfterBuyStayTimeServiceImpl.TAG, "onPageSelected");
                    if (AfterBuyStayTimeServiceImpl.access$200(AfterBuyStayTimeServiceImpl.this).findFocus() == childRecyclerView.getNestedScrollParent()) {
                        AfterBuyStayTimeServiceImpl.access$300(AfterBuyStayTimeServiceImpl.this, childRecyclerView, 0);
                    } else {
                        AfterBuyStayTimeServiceImpl.access$300(AfterBuyStayTimeServiceImpl.this, childRecyclerView, 4);
                    }
                } catch (Throwable th) {
                    uqa.b(BHRTaskConfigBase.TYPE_CONFIG_UT, AfterBuyStayTimeServiceImpl.TAG, th.getMessage());
                }
            }
        };
    }

    private int getAnchorPos(RecyclerView recyclerView) {
        IContainerDataService iContainerDataService;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d6353dba", new Object[]{this, recyclerView})).intValue();
        }
        if (recyclerView == null || (iContainerDataService = (IContainerDataService) this.mInfoFlowContext.a(IContainerDataService.class)) == null) {
            return Integer.MAX_VALUE;
        }
        IContainerDataModel containerData = iContainerDataService.getContainerData();
        if (!(containerData instanceof AwesomeGetContainerData)) {
            return Integer.MAX_VALUE;
        }
        List<SectionModel> totalData = ((AwesomeGetContainerData) containerData).getTotalData();
        if (this.lastData == totalData) {
            return this.anchorPos;
        }
        this.lastData = totalData;
        if (totalData == null || totalData.isEmpty()) {
            return Integer.MAX_VALUE;
        }
        for (int i = 0; i < totalData.size(); i++) {
            if (!isFullSpan(totalData.get(i))) {
                return i;
            }
        }
        return Integer.MAX_VALUE;
    }

    private ViewPager getViewPager(ChildRecyclerView childRecyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewPager) ipChange.ipc$dispatch("d9bc1a58", new Object[]{this, childRecyclerView});
        }
        if (childRecyclerView == null) {
            return null;
        }
        lrj nestedScrollParent = childRecyclerView.getNestedScrollParent();
        if (!(nestedScrollParent instanceof ViewGroup)) {
            return null;
        }
        ViewParent viewParent = (ViewGroup) nestedScrollParent;
        while (viewParent != null) {
            viewParent = viewParent.getParent();
            uqa.b(BHRTaskConfigBase.TYPE_CONFIG_UT, TAG, "getViewPager, target:".concat(viewParent.getClass().getSimpleName()));
            if (!(viewParent instanceof ViewPager)) {
                if (viewParent instanceof ViewGroup) {
                    if (viewParent instanceof ViewPager.DecorView) {
                        break;
                    }
                } else {
                    break;
                }
            } else {
                return (ViewPager) viewParent;
            }
        }
        return null;
    }

    private boolean isViewOnScreen(RecyclerView recyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4228eb1a", new Object[]{this, recyclerView})).booleanValue();
        }
        if (recyclerView == null || recyclerView.getContext() == null || !recyclerView.isShown()) {
            return false;
        }
        int[] iArr = new int[2];
        recyclerView.getLocationOnScreen(iArr);
        int i = iArr[0];
        if (i < 0 || i > pb6.s(recyclerView.getContext())) {
            return false;
        }
        return true;
    }

    private boolean isVisibleChange(int i, int i2) {
        boolean z;
        boolean z2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3acc5ee3", new Object[]{this, new Integer(i), new Integer(i2)})).booleanValue();
        }
        if (i < 0) {
            return true;
        }
        if (i == 0) {
            z = true;
        } else {
            z = false;
        }
        if (i2 == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z || !z2) {
            return true;
        }
        return false;
    }

    private void leave() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("62f29fbe", new Object[]{this});
            return;
        }
        List<py> list = this.stayTimeCalculators;
        if (list != null) {
            for (py pyVar : list) {
                pyVar.n();
            }
        }
    }

    private boolean needRegisterViewPagerListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b8a7b6a4", new Object[]{this})).booleanValue();
        }
        arb arbVar = this.containerType;
        if (arbVar == null) {
            return false;
        }
        if (TextUtils.equals(arbVar.getContainerId(), z4a.REC_ORDER_LIST_CATAPULT.b()) || TextUtils.equals(this.containerType.getContainerId(), z4a.REC_ORDER_LIST.b())) {
            return true;
        }
        return false;
    }

    private void registerOnScrollListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b75a22a", new Object[]{this});
            return;
        }
        h6c.c<ViewGroup> createOnFeedsScrollListener = createOnFeedsScrollListener();
        this.mOnFeedsScrollListener = createOnFeedsScrollListener;
        h6c<ViewGroup> h6cVar = this.mFeedsViewLifeCycleRegister;
        if (h6cVar != null) {
            h6cVar.h(createOnFeedsScrollListener);
        }
    }

    private void registerOnWindowChangeListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f571e51d", new Object[]{this});
            return;
        }
        h6c.e createOnWindowVisibilityChangedListener = createOnWindowVisibilityChangedListener();
        this.mOnWindowVisibilityChangedListener = createOnWindowVisibilityChangedListener;
        this.mFeedsViewLifeCycleRegister.Q(createOnWindowVisibilityChangedListener);
    }

    private void registerRecyclerAttachListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56d71c2", new Object[]{this});
            return;
        }
        View.OnAttachStateChangeListener createAttachStateChangeListener = createAttachStateChangeListener();
        this.mOnAttachStateChangeListener = createAttachStateChangeListener;
        this.mFeedsViewLifeCycleRegister.g(createAttachStateChangeListener);
    }

    private void registerViewPagerListener(ChildRecyclerView childRecyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d6972a98", new Object[]{this, childRecyclerView});
        } else if (needRegisterViewPagerListener()) {
            if (this.pageChangeListener != null) {
                uqa.b(BHRTaskConfigBase.TYPE_CONFIG_UT, TAG, "already register viewPager listener, discard");
                return;
            }
            ViewPager viewPager = getViewPager(childRecyclerView);
            this.viewPager = viewPager;
            if (viewPager == null) {
                uqa.b(BHRTaskConfigBase.TYPE_CONFIG_UT, TAG, "viewPager is null, discard");
                return;
            }
            ViewPager.OnPageChangeListener createPageChangeListener = createPageChangeListener(childRecyclerView);
            this.pageChangeListener = createPageChangeListener;
            this.viewPager.addOnPageChangeListener(createPageChangeListener);
            uqa.b(BHRTaskConfigBase.TYPE_CONFIG_UT, TAG, "register viewPager listener success");
        }
    }

    private void unRegisterOnScrollListener() {
        h6c.c<ViewGroup> cVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("10935563", new Object[]{this});
            return;
        }
        h6c<ViewGroup> h6cVar = this.mFeedsViewLifeCycleRegister;
        if (h6cVar != null && (cVar = this.mOnFeedsScrollListener) != null) {
            h6cVar.v(cVar);
        }
    }

    private void unRegisterOnWindowChangeListener() {
        h6c<ViewGroup> h6cVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a3808996", new Object[]{this});
            return;
        }
        h6c.e eVar = this.mOnWindowVisibilityChangedListener;
        if (eVar != null && (h6cVar = this.mFeedsViewLifeCycleRegister) != null) {
            h6cVar.o(eVar);
        }
    }

    private void unRegisterRecyclerAttachListener() {
        View.OnAttachStateChangeListener onAttachStateChangeListener;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b37c163b", new Object[]{this});
            return;
        }
        h6c<ViewGroup> h6cVar = this.mFeedsViewLifeCycleRegister;
        if (h6cVar != null && (onAttachStateChangeListener = this.mOnAttachStateChangeListener) != null) {
            h6cVar.L(onAttachStateChangeListener);
        }
    }

    private void unRegisterViewPagerListener() {
        ViewPager.OnPageChangeListener onPageChangeListener;
        ViewPager viewPager;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4036f37d", new Object[]{this});
        } else if (needRegisterViewPagerListener() && (onPageChangeListener = this.pageChangeListener) != null && (viewPager = this.viewPager) != null) {
            viewPager.removeOnPageChangeListener(onPageChangeListener);
            this.pageChangeListener = null;
            this.viewPager = null;
            uqa.b(BHRTaskConfigBase.TYPE_CONFIG_UT, TAG, "remove viewPager listener success");
        }
    }

    public void onAttachedToWindow(ChildRecyclerView childRecyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4dce2f97", new Object[]{this, childRecyclerView});
        } else {
            registerViewPagerListener(childRecyclerView);
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.ISubService
    public void onCreateService(cfc cfcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa0061f", new Object[]{this, cfcVar});
            return;
        }
        this.mInfoFlowContext = cfcVar;
        IMainFeedsViewService<?> iMainFeedsViewService = (IMainFeedsViewService) cfcVar.a(IMainFeedsViewService.class);
        this.mMainFeedsViewService = iMainFeedsViewService;
        this.mFeedsViewLifeCycleRegister = iMainFeedsViewService.getLifeCycleRegister();
        registerOnScrollListener();
        registerOnWindowChangeListener();
        registerRecyclerAttachListener();
    }

    @Override // com.taobao.infoflow.protocol.subservice.ISubService
    public void onDestroyService() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("770ac0a1", new Object[]{this});
            return;
        }
        unRegisterOnScrollListener();
        unRegisterOnWindowChangeListener();
        unRegisterRecyclerAttachListener();
    }

    public void onDetachedFromWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3896b092", new Object[]{this});
        } else {
            get.a().f(new a(), 1L);
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.afterbuy.IAfterBuyStayTimeService
    public void onScrolledByNestedParentEach(lrj lrjVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("17d67a07", new Object[]{this, lrjVar});
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.afterbuy.IAfterBuyStayTimeService
    public void updateContainerType(arb arbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60cd8fbf", new Object[]{this, arbVar});
        } else if (arbVar != null) {
            this.containerType = arbVar;
            ArrayList arrayList = new ArrayList(2);
            this.stayTimeCalculators = arrayList;
            arrayList.add(new ynf(this.containerType.a(), this.containerType.getContainerId()));
            this.stayTimeCalculators.add(new pof(this.containerType.a(), this.containerType.getContainerId()));
        }
    }

    private boolean isFullSpan(SectionModel sectionModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5afed0e7", new Object[]{this, sectionModel})).booleanValue();
        }
        return (sectionModel == null || sectionModel.getJSONObject("template") == null || !TextUtils.equals("one", tit.c(sectionModel.getJSONObject("template")))) ? false : true;
    }
}
