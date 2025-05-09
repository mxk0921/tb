package com.taobao.android.live.plugin.atype.flexalocal.good.view.liveGoodsList.liveStateMutitabView.impl;

import android.app.Activity;
import android.os.Handler;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.good.basemvplib.impl.GoodsBaseView;
import com.taobao.android.live.plugin.atype.flexalocal.good.insideprefetch.InsidePrefetchHelper;
import com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.ItemCategory;
import com.taobao.android.live.plugin.atype.flexalocal.good.view.liveGoodsList.liveStateMutitabView.impl.adapter.LiveStateMutitabViewpagerAdapter;
import com.taobao.android.live.plugin.atype.flexalocal.good.view.liveGoodsList.liveStateView.impl.NonPreheatTabView;
import com.taobao.android.live.plugin.atype.flexalocal.good.view.liveGoodsList.liveStateView.impl.SingleTabBaseView;
import com.taobao.android.live.plugin.atype.flexalocal.input.view.MultiSlidingTabStripAType;
import com.taobao.taobao.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import tb.fha;
import tb.gbc;
import tb.hha;
import tb.iha;
import tb.kkr;
import tb.s3c;
import tb.sjr;
import tb.t2o;
import tb.tea;
import tb.v2s;
import tb.vha;
import tb.wda;
import tb.xea;
import tb.yga;
import tb.zqq;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class GoodsLiveStateMutitabView extends GoodsBaseView<gbc> implements s3c {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "StateMutitabView";
    private int currentTab;
    private String currentTabCategory;
    private List<SingleTabBaseView> liveStateViewList;
    private RecyclerView.RecycledViewPool mGoodListRecycledViewPool;
    private LiveStateMutitabViewpagerAdapter mLiveStateMutitabViewpagerAdapter;
    private d mTopDataObserver;
    private ViewPager mViewPager;
    private MultiSlidingTabStripAType multiSlidingTabStrip;
    private String userId;
    public tea frameTracer = new tea();
    private c mMultiTabViewDataGetter = new a();
    private Runnable prefetchRunnable = new b();
    private Handler mHandler = new Handler();
    private final int switchTabInsidePreFetchDelayDuration = yga.t0();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        public void a(RecyclerView recyclerView) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("675d3ff1", new Object[]{this, recyclerView});
            } else if (GoodsLiveStateMutitabView.access$000(GoodsLiveStateMutitabView.this) != null) {
                recyclerView.setRecycledViewPool(GoodsLiveStateMutitabView.access$000(GoodsLiveStateMutitabView.this));
            } else {
                GoodsLiveStateMutitabView.access$002(GoodsLiveStateMutitabView.this, recyclerView.getRecycledViewPool());
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (GoodsLiveStateMutitabView.access$100(GoodsLiveStateMutitabView.this) != null && GoodsLiveStateMutitabView.access$100(GoodsLiveStateMutitabView.this).get(GoodsLiveStateMutitabView.access$200(GoodsLiveStateMutitabView.this)) != null) {
                ((SingleTabBaseView) GoodsLiveStateMutitabView.access$100(GoodsLiveStateMutitabView.this).get(GoodsLiveStateMutitabView.access$200(GoodsLiveStateMutitabView.this))).preFetchInsideDetailData(InsidePrefetchHelper.OPEN_SOURCE_SWITCH_GOODLIST_TAB);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public interface c {
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public interface d {
    }

    static {
        t2o.a(295699315);
        t2o.a(295699312);
        t2o.a(806355016);
    }

    public GoodsLiveStateMutitabView(xea xeaVar, boolean z) {
        super(xeaVar, z);
        initView();
        this.frameTracer.b((Activity) getContext());
        hha.b(TAG, "init() | regiester. " + this);
        sjr.g().a(this);
    }

    public static /* synthetic */ RecyclerView.RecycledViewPool access$000(GoodsLiveStateMutitabView goodsLiveStateMutitabView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecyclerView.RecycledViewPool) ipChange.ipc$dispatch("db8867a", new Object[]{goodsLiveStateMutitabView});
        }
        return goodsLiveStateMutitabView.mGoodListRecycledViewPool;
    }

    public static /* synthetic */ RecyclerView.RecycledViewPool access$002(GoodsLiveStateMutitabView goodsLiveStateMutitabView, RecyclerView.RecycledViewPool recycledViewPool) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecyclerView.RecycledViewPool) ipChange.ipc$dispatch("618ad5d9", new Object[]{goodsLiveStateMutitabView, recycledViewPool});
        }
        goodsLiveStateMutitabView.mGoodListRecycledViewPool = recycledViewPool;
        return recycledViewPool;
    }

    public static /* synthetic */ List access$100(GoodsLiveStateMutitabView goodsLiveStateMutitabView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("d6a7b169", new Object[]{goodsLiveStateMutitabView});
        }
        return goodsLiveStateMutitabView.liveStateViewList;
    }

    public static /* synthetic */ int access$200(GoodsLiveStateMutitabView goodsLiveStateMutitabView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("40ef8570", new Object[]{goodsLiveStateMutitabView})).intValue();
        }
        return goodsLiveStateMutitabView.currentTab;
    }

    public static /* synthetic */ int access$202(GoodsLiveStateMutitabView goodsLiveStateMutitabView, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bc87849b", new Object[]{goodsLiveStateMutitabView, new Integer(i)})).intValue();
        }
        goodsLiveStateMutitabView.currentTab = i;
        return i;
    }

    public static /* synthetic */ String access$300(GoodsLiveStateMutitabView goodsLiveStateMutitabView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f5605e44", new Object[]{goodsLiveStateMutitabView});
        }
        return goodsLiveStateMutitabView.currentTabCategory;
    }

    public static /* synthetic */ void access$400(GoodsLiveStateMutitabView goodsLiveStateMutitabView, int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("62ca8bac", new Object[]{goodsLiveStateMutitabView, new Integer(i), new Boolean(z)});
        } else {
            goodsLiveStateMutitabView.handlePagerChanged(i, z);
        }
    }

    public static /* synthetic */ Handler access$500(GoodsLiveStateMutitabView goodsLiveStateMutitabView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Handler) ipChange.ipc$dispatch("973f51ec", new Object[]{goodsLiveStateMutitabView});
        }
        return goodsLiveStateMutitabView.mHandler;
    }

    public static /* synthetic */ Runnable access$600(GoodsLiveStateMutitabView goodsLiveStateMutitabView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Runnable) ipChange.ipc$dispatch("a7ead1fb", new Object[]{goodsLiveStateMutitabView});
        }
        return goodsLiveStateMutitabView.prefetchRunnable;
    }

    public static /* synthetic */ int access$700(GoodsLiveStateMutitabView goodsLiveStateMutitabView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6bf91b4b", new Object[]{goodsLiveStateMutitabView})).intValue();
        }
        return goodsLiveStateMutitabView.switchTabInsidePreFetchDelayDuration;
    }

    public static /* synthetic */ String access$800(GoodsLiveStateMutitabView goodsLiveStateMutitabView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2edfd9c9", new Object[]{goodsLiveStateMutitabView});
        }
        return goodsLiveStateMutitabView.userId;
    }

    private SingleTabBaseView getCurrentTabView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SingleTabBaseView) ipChange.ipc$dispatch("c095f783", new Object[]{this});
        }
        int currentTab = getCurrentTab();
        if (this.liveStateViewList.size() <= currentTab) {
            return this.liveStateViewList.get(0);
        }
        return this.liveStateViewList.get(currentTab);
    }

    private SingleTabBaseView getDefaultTabView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SingleTabBaseView) ipChange.ipc$dispatch("3292d84b", new Object[]{this});
        }
        List<SingleTabBaseView> list = this.liveStateViewList;
        if (list != null && !list.isEmpty()) {
            for (SingleTabBaseView singleTabBaseView : this.liveStateViewList) {
                if (singleTabBaseView.getItemCategory().isDefaultTab()) {
                    return singleTabBaseView;
                }
            }
        }
        return null;
    }

    private void handlePagerChanged(int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("67eacff1", new Object[]{this, new Integer(i), new Boolean(z)});
            return;
        }
        this.currentTab = i;
        this.currentTabCategory = this.liveStateViewList.get(i).categoryId;
        xea xeaVar = this.mGoodLiveContext;
        if (xeaVar != null) {
            xeaVar.Z(this.liveStateViewList.get(i).getItemCategory());
            xea xeaVar2 = this.mGoodLiveContext;
            xeaVar2.J = this.currentTabCategory;
            xeaVar2.K = this.liveStateViewList.get(i).tabName;
        }
        iha.p(this.liveStateViewList.get(i).tabName, i, z, this.currentTabCategory);
        this.liveStateViewList.get(i).showPackage(z);
    }

    private void initMutitabLiveStateView(List<SingleTabBaseView> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9bc1d7a", new Object[]{this, list});
            return;
        }
        SingleTabBaseView constructTabView = SingleTabBaseView.constructTabView(this.mGoodLiveContext, ItemCategory.constructDefaultCategory(), this.mMultiTabViewDataGetter, false);
        if (constructTabView != null) {
            constructTabView.initView();
            if ((constructTabView instanceof NonPreheatTabView) && this.mGoodLiveContext.R()) {
                ((NonPreheatTabView) constructTabView).recoverFromData();
            }
            list.add(constructTabView);
        }
    }

    public static /* synthetic */ Object ipc$super(GoodsLiveStateMutitabView goodsLiveStateMutitabView, String str, Object... objArr) {
        if (str.hashCode() == -1983604863) {
            super.destroy();
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/atype/flexalocal/good/view/liveGoodsList/liveStateMutitabView/impl/GoodsLiveStateMutitabView");
    }

    private boolean isCurrentCategory(String str) {
        ItemCategory itemCategory;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d8da89e2", new Object[]{this, str})).booleanValue();
        }
        int size = this.liveStateViewList.size();
        int i = this.currentTab;
        if (i < size && (itemCategory = this.liveStateViewList.get(i).getItemCategory()) != null) {
            return TextUtils.equals(str, itemCategory.categoryId);
        }
        return false;
    }

    @Override // tb.s3c
    public String bizCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("36951559", new Object[]{this});
        }
        return "GoodsLiveStateMutitabView";
    }

    public void clearCategoriesNav() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5861aba1", new Object[]{this});
        } else if (this.liveStateViewList.size() > 1) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(this.liveStateViewList.get(0));
            for (SingleTabBaseView singleTabBaseView : this.liveStateViewList) {
                if (!singleTabBaseView.categoryId.equals("0")) {
                    singleTabBaseView.destroy();
                }
            }
            this.liveStateViewList.clear();
            this.liveStateViewList.addAll(arrayList);
            this.mLiveStateMutitabViewpagerAdapter.notifyDataSetChanged();
            this.multiSlidingTabStrip.notifyDataSetChanged(0);
            this.mViewPager.setCurrentItem(0);
            this.multiSlidingTabStrip.setVisibility(8);
        }
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.good.basemvplib.impl.GoodsBaseView, com.taobao.android.live.plugin.atype.flexalocal.good.basemvplib.impl.GoodsBaseTempView
    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        super.destroy();
        xea xeaVar = this.mGoodLiveContext;
        this.frameTracer.e((Activity) getContext(), xeaVar, xeaVar.m.f);
        List<SingleTabBaseView> list = this.liveStateViewList;
        if (list != null) {
            for (SingleTabBaseView singleTabBaseView : list) {
                singleTabBaseView.destroy();
            }
        }
        Handler handler = this.mHandler;
        if (handler != null) {
            handler.removeCallbacks(this.prefetchRunnable);
        }
        hha.b(TAG, "destroy() | unregiester.   " + this);
        sjr.g().b(this);
    }

    public int getCurrentTab() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3327aecc", new Object[]{this})).intValue();
        }
        return this.currentTab;
    }

    public List<SingleTabBaseView> getLiveStateViewList() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("d94c74e", new Object[]{this});
        }
        return this.liveStateViewList;
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.good.basemvplib.impl.GoodsBaseTempView
    public void initData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1ae4861", new Object[]{this});
            return;
        }
        this.userId = v2s.o().u().getUserId();
        this.liveStateViewList.get(0).initData();
        String str = this.liveStateViewList.get(0).categoryId;
        this.currentTabCategory = str;
        xea xeaVar = this.mGoodLiveContext;
        if (xeaVar != null) {
            xeaVar.J = str;
            xeaVar.Z(this.liveStateViewList.get(0).getItemCategory());
        }
    }

    @Override // tb.s3c
    public String[] observeEvents() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("37b2602b", new Object[]{this});
        }
        return new String[]{"com.taobao.taolive.goods.preheat.tab"};
    }

    @Override // tb.s3c
    public String observeUniqueIdentification() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4914bdfe", new Object[]{this});
        }
        xea xeaVar = this.mGoodLiveContext;
        if (xeaVar != null) {
            return xeaVar.F();
        }
        return null;
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.good.basemvplib.impl.GoodsBaseView
    public View onCreateContentView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("a20e10cc", new Object[]{this});
        }
        View inflate = LayoutInflater.from(getContext()).inflate(R.layout.taolive_goods_live_state_mutitab_layout_flexalocal, (ViewGroup) null);
        this.mViewPager = (ViewPager) inflate.findViewById(R.id.taolive_goods_live_state_mutitab_viewpager);
        MultiSlidingTabStripAType multiSlidingTabStripAType = (MultiSlidingTabStripAType) inflate.findViewById(R.id.taolive_goods_live_state_mutitab_strip2);
        this.multiSlidingTabStrip = multiSlidingTabStripAType;
        multiSlidingTabStripAType.setVisibility(8);
        ArrayList arrayList = new ArrayList();
        this.liveStateViewList = arrayList;
        arrayList.clear();
        initMutitabLiveStateView(this.liveStateViewList);
        LiveStateMutitabViewpagerAdapter liveStateMutitabViewpagerAdapter = new LiveStateMutitabViewpagerAdapter(this.mGoodLiveContext.i(), this.liveStateViewList);
        this.mLiveStateMutitabViewpagerAdapter = liveStateMutitabViewpagerAdapter;
        this.mViewPager.setAdapter(liveStateMutitabViewpagerAdapter);
        this.multiSlidingTabStrip.setOnPageChangeListener(new ViewPager.SimpleOnPageChangeListener() { // from class: com.taobao.android.live.plugin.atype.flexalocal.good.view.liveGoodsList.liveStateMutitabView.impl.GoodsLiveStateMutitabView.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass3 r2, String str, Object... objArr) {
                str.hashCode();
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/atype/flexalocal/good/view/liveGoodsList/liveStateMutitabView/impl/GoodsLiveStateMutitabView$3");
            }

            @Override // androidx.viewpager.widget.ViewPager.SimpleOnPageChangeListener, androidx.viewpager.widget.ViewPager.OnPageChangeListener
            public void onPageSelected(int i) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("184d6f33", new Object[]{this, new Integer(i)});
                } else if (TextUtils.equals(((SingleTabBaseView) GoodsLiveStateMutitabView.access$100(GoodsLiveStateMutitabView.this).get(i)).categoryId, GoodsLiveStateMutitabView.access$300(GoodsLiveStateMutitabView.this))) {
                    GoodsLiveStateMutitabView.access$202(GoodsLiveStateMutitabView.this, i);
                } else {
                    GoodsLiveStateMutitabView.access$400(GoodsLiveStateMutitabView.this, i, true);
                    if (GoodsLiveStateMutitabView.access$500(GoodsLiveStateMutitabView.this) != null) {
                        GoodsLiveStateMutitabView.access$500(GoodsLiveStateMutitabView.this).postDelayed(GoodsLiveStateMutitabView.access$600(GoodsLiveStateMutitabView.this), GoodsLiveStateMutitabView.access$700(GoodsLiveStateMutitabView.this));
                    }
                    HashMap<String, String> hashMap = new HashMap<>();
                    hashMap.put("user_id", GoodsLiveStateMutitabView.access$800(GoodsLiveStateMutitabView.this));
                    hashMap.put("categoryType", ((SingleTabBaseView) GoodsLiveStateMutitabView.access$100(GoodsLiveStateMutitabView.this).get(i)).categoryType);
                    hashMap.put("class_number", String.valueOf(i));
                    hashMap.put("class_total", String.valueOf(GoodsLiveStateMutitabView.access$100(GoodsLiveStateMutitabView.this).size()));
                    hashMap.put("categoryName", ((SingleTabBaseView) GoodsLiveStateMutitabView.access$100(GoodsLiveStateMutitabView.this).get(i)).tabName);
                    if (kkr.i().o() != null) {
                        kkr.i().o().c("itemclass_click", hashMap);
                    }
                }
            }
        });
        this.multiSlidingTabStrip.setViewPager(this.mViewPager);
        return inflate;
    }

    @Override // tb.s3c
    public void onEvent(String str, Object obj) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3897928", new Object[]{this, str, obj});
        } else if ("com.taobao.taolive.goods.preheat.tab".equals(str)) {
            for (SingleTabBaseView singleTabBaseView : this.liveStateViewList) {
                if (singleTabBaseView.getItemCategory().isPreheatTab()) {
                    this.mViewPager.setCurrentItem(i);
                    handlePagerChanged(i, true);
                    return;
                }
                i++;
            }
        }
    }

    public void onHide() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b4c13c8", new Object[]{this});
            return;
        }
        SingleTabBaseView defaultTabView = getDefaultTabView();
        if (defaultTabView != null) {
            defaultTabView.onHide();
        }
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.good.basemvplib.impl.GoodsBaseTempView
    public void resume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("deb96e34", new Object[]{this});
            return;
        }
        SingleTabBaseView currentTabView = getCurrentTabView();
        if (currentTabView != null) {
            currentTabView.resume();
        }
    }

    public void setTopDataObserver(d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("49e2c0a4", new Object[]{this, dVar});
        }
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.good.basemvplib.impl.GoodsBaseTempView
    public void showPackage() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b7932290", new Object[]{this});
            return;
        }
        show();
        handlePagerChanged(this.currentTab, false);
    }

    public boolean switchToTab(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3cfc3e5b", new Object[]{this, str})).booleanValue();
        }
        if (!TextUtils.isEmpty(str) && !this.liveStateViewList.isEmpty()) {
            for (int i = 0; i < this.liveStateViewList.size(); i++) {
                ItemCategory itemCategory = this.liveStateViewList.get(i).getItemCategory();
                if (TextUtils.equals(itemCategory.categoryId, str)) {
                    this.mGoodLiveContext.Z(itemCategory);
                    this.currentTabCategory = itemCategory.categoryId;
                    this.mViewPager.setCurrentItem(i);
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.good.basemvplib.impl.GoodsBaseView
    public gbc initInjector() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (gbc) ipChange.ipc$dispatch("5b9ac3e", new Object[]{this}) : new fha(this.mGoodLiveContext);
    }

    public void refreshCategoriesNav(List<ItemCategory> list, String str, List<String> list2) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b179357f", new Object[]{this, list, str, list2});
            return;
        }
        ArrayList arrayList = new ArrayList();
        List<SingleTabBaseView> list3 = this.liveStateViewList;
        if (list3 != null && list3.size() > 0) {
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            for (ItemCategory itemCategory : list) {
                if (itemCategory != null) {
                    Iterator<SingleTabBaseView> it = this.liveStateViewList.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            SingleTabBaseView next = it.next();
                            if (!TextUtils.isEmpty(next.categoryId) && next.categoryId.equals(itemCategory.categoryId)) {
                                next.setItemCategory(itemCategory);
                                arrayList2.add(next);
                                break;
                            }
                        } else {
                            SingleTabBaseView constructTabView = SingleTabBaseView.constructTabView(this.mGoodLiveContext, itemCategory, this.mMultiTabViewDataGetter, false);
                            if (constructTabView != null) {
                                constructTabView.initView();
                                arrayList2.add(constructTabView);
                            }
                        }
                    }
                    arrayList3.add(itemCategory.categoryId);
                    if (TextUtils.isEmpty(itemCategory.bizType)) {
                        str2 = "null";
                    } else {
                        str2 = itemCategory.bizType;
                    }
                    arrayList.add(str2);
                }
            }
            Iterator it2 = arrayList2.iterator();
            int i = -1;
            int i2 = -1;
            while (it2.hasNext()) {
                SingleTabBaseView singleTabBaseView = (SingleTabBaseView) it2.next();
                if (!TextUtils.isEmpty(this.currentTabCategory) && this.currentTabCategory.equals(singleTabBaseView.categoryId)) {
                    i = arrayList2.indexOf(singleTabBaseView);
                }
                if (!TextUtils.isEmpty(str) && TextUtils.equals(singleTabBaseView.categoryId, str)) {
                    i2 = arrayList2.indexOf(singleTabBaseView);
                }
            }
            for (SingleTabBaseView singleTabBaseView2 : this.liveStateViewList) {
                if (!arrayList3.contains(singleTabBaseView2.categoryId)) {
                    singleTabBaseView2.destroy();
                }
            }
            this.liveStateViewList.clear();
            this.liveStateViewList.addAll(arrayList2);
            this.mLiveStateMutitabViewpagerAdapter.notifyDataSetChanged();
            this.multiSlidingTabStrip.notifyDataSetChanged(i);
            if (i2 >= 0 && i2 != i && yga.s0()) {
                handlePagerChanged(i2, true);
                this.mViewPager.setCurrentItem(i2);
                vha.e(list2, str);
            } else if (i >= 0) {
                this.mViewPager.setCurrentItem(i);
            }
            if (this.liveStateViewList.size() > 1) {
                this.multiSlidingTabStrip.setVisibility(0);
                sjr.g().c("com.taobao.taolive.goods.show.nav_layout_split.inner", Boolean.TRUE, xea.E(this.mGoodLiveContext));
                HashMap<String, String> hashMap = new HashMap<>();
                hashMap.put("user_id", this.userId);
                hashMap.put("class_number", String.valueOf(i));
                hashMap.put("class_total", String.valueOf(list.size()));
                hashMap.put("categoryIds", zqq.b(arrayList3, '&'));
                hashMap.put("categoryTypes", zqq.b(arrayList, '&'));
                if (kkr.i().o() == null) {
                    return;
                }
                if (wda.G()) {
                    kkr.i().o().a("itemclass_view", hashMap);
                } else {
                    kkr.i().o().b("itemclass_view", hashMap);
                }
            } else {
                this.multiSlidingTabStrip.setVisibility(8);
                sjr.g().c("com.taobao.taolive.goods.show.nav_layout_split.inner", Boolean.FALSE, xea.E(this.mGoodLiveContext));
            }
        }
    }
}
