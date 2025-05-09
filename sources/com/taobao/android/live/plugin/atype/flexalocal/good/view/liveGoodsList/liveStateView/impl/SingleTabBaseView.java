package com.taobao.android.live.plugin.atype.flexalocal.good.view.liveGoodsList.liveStateView.impl;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.Button;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.RecyclerView;
import com.alilive.adapter.uikit.AliUrlImageView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.good.CloseRecyclerView;
import com.taobao.android.live.plugin.atype.flexalocal.good.basemvplib.impl.GoodsBaseView;
import com.taobao.android.live.plugin.atype.flexalocal.good.insideprefetch.InsidePrefetchHelper;
import com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.ItemCategory;
import com.taobao.android.live.plugin.atype.flexalocal.good.view.liveGoodsList.liveStateMutitabView.impl.GoodsLiveStateMutitabView;
import com.taobao.android.live.plugin.atype.flexalocal.good.view.liveGoodsList.liveStateView.impl.SingleTabBaseView;
import com.taobao.android.live.plugin.atype.flexalocal.good.view.liveGoodsList.liveStateView.impl.adapter.AbstractGoodsRecyclerAdapter;
import com.taobao.android.live.plugin.atype.flexalocal.good.view.liveGoodsList.liveStateView.impl.view.RecyclerViewNoBugLinearLayoutManager;
import com.taobao.taobao.R;
import java.util.HashMap;
import tb.hha;
import tb.igq;
import tb.kkr;
import tb.kug;
import tb.nqd;
import tb.pqd;
import tb.pxg;
import tb.t2o;
import tb.tea;
import tb.wda;
import tb.xea;
import tb.yga;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public abstract class SingleTabBaseView<T extends nqd> extends GoodsBaseView<T> implements pqd {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "SingleTabBaseView";
    public String categoryId;
    public String categoryType;
    private tea frameTracer;
    private FrameLayout mBackTopFrameLayout;
    private View mEmptyView;
    private ViewGroup mErrorView;
    private boolean mFrameTracerListenerAttached = false;
    public AbstractGoodsRecyclerAdapter mGoodsLiveStateListAdapter;
    public boolean mHasShowed;
    public ItemCategory mItemCategory;
    public boolean mLandspace;
    public CloseRecyclerView mListView;
    private final GoodsLiveStateMutitabView.c mMultiTabViewDataGetter;
    public String tabName;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements CloseRecyclerView.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // com.taobao.android.live.plugin.atype.flexalocal.good.CloseRecyclerView.a
        public void a(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e067b313", new Object[]{this, new Boolean(z)});
            } else {
                SingleTabBaseView.access$000(SingleTabBaseView.this);
            }
        }

        @Override // com.taobao.android.live.plugin.atype.flexalocal.good.CloseRecyclerView.a
        public void b(int i, int i2, int i3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8c9fcd8b", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3)});
            } else {
                SingleTabBaseView.this.checkNeedCompensate(i, i2, i3);
            }
        }

        @Override // com.taobao.android.live.plugin.atype.flexalocal.good.CloseRecyclerView.a
        public void c(boolean z, boolean z2) {
            int i = 0;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cf6d3fca", new Object[]{this, new Boolean(z), new Boolean(z2)});
                return;
            }
            if (SingleTabBaseView.access$100(SingleTabBaseView.this) != null && TextUtils.equals("0", SingleTabBaseView.this.categoryId)) {
                int visibility = SingleTabBaseView.access$100(SingleTabBaseView.this).getVisibility();
                FrameLayout access$100 = SingleTabBaseView.access$100(SingleTabBaseView.this);
                if (!z) {
                    i = 8;
                }
                access$100.setVisibility(i);
                if (visibility != 0 && z) {
                    SingleTabBaseView.access$200(SingleTabBaseView.this);
                }
            }
            if (SingleTabBaseView.access$300(SingleTabBaseView.this) != null && z2) {
                SingleTabBaseView.access$400(SingleTabBaseView.this).m.f++;
            }
        }

        @Override // com.taobao.android.live.plugin.atype.flexalocal.good.CloseRecyclerView.a
        public void d() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6de45c84", new Object[]{this});
            } else if (kkr.i().d() != null) {
                kkr.i().d().c();
            }
        }
    }

    static {
        t2o.a(295699355);
        t2o.a(295699338);
    }

    public SingleTabBaseView(xea xeaVar, ItemCategory itemCategory, GoodsLiveStateMutitabView.c cVar, boolean z) {
        super(xeaVar, z);
        this.mItemCategory = itemCategory;
        this.mMultiTabViewDataGetter = cVar;
        this.mLandspace = z;
        this.tabName = itemCategory.name;
        this.categoryId = itemCategory.categoryId;
        this.categoryType = itemCategory.bizType;
    }

    public static /* synthetic */ void access$000(SingleTabBaseView singleTabBaseView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3fad0382", new Object[]{singleTabBaseView});
        } else {
            singleTabBaseView.loadMore();
        }
    }

    public static /* synthetic */ FrameLayout access$100(SingleTabBaseView singleTabBaseView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout) ipChange.ipc$dispatch("6efbd1f6", new Object[]{singleTabBaseView});
        }
        return singleTabBaseView.mBackTopFrameLayout;
    }

    public static /* synthetic */ void access$200(SingleTabBaseView singleTabBaseView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9095684", new Object[]{singleTabBaseView});
        } else {
            singleTabBaseView.exposureBackToTopBtn();
        }
    }

    public static /* synthetic */ xea access$300(SingleTabBaseView singleTabBaseView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xea) ipChange.ipc$dispatch("e64cd095", new Object[]{singleTabBaseView});
        }
        return singleTabBaseView.mGoodLiveContext;
    }

    public static /* synthetic */ xea access$400(SingleTabBaseView singleTabBaseView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xea) ipChange.ipc$dispatch("2ad5dcf4", new Object[]{singleTabBaseView});
        }
        return singleTabBaseView.mGoodLiveContext;
    }

    public static /* synthetic */ tea access$500(SingleTabBaseView singleTabBaseView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (tea) ipChange.ipc$dispatch("98c62a24", new Object[]{singleTabBaseView});
        }
        return singleTabBaseView.frameTracer;
    }

    public static /* synthetic */ xea access$600(SingleTabBaseView singleTabBaseView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xea) ipChange.ipc$dispatch("b3e7f5b2", new Object[]{singleTabBaseView});
        }
        return singleTabBaseView.mGoodLiveContext;
    }

    private void clickBackToTopBtn() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("542e8ed8", new Object[]{this});
            return;
        }
        HashMap<String, String> hashMap = new HashMap<>();
        if (!"0".equals(this.categoryId)) {
            str = "other";
        } else {
            str = "all";
        }
        hashMap.put("tab", str);
        if (kkr.i() != null && kkr.i().o() != null) {
            kkr.i().o().c("BackTop", hashMap);
        }
    }

    public static SingleTabBaseView constructTabView(xea xeaVar, ItemCategory itemCategory, GoodsLiveStateMutitabView.c cVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SingleTabBaseView) ipChange.ipc$dispatch("1783dbc1", new Object[]{xeaVar, itemCategory, cVar, new Boolean(z)});
        }
        if (xeaVar == null || itemCategory == null) {
            return null;
        }
        return new NonPreheatTabView(xeaVar, itemCategory, cVar, z);
    }

    private void exposureBackToTopBtn() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("93b36857", new Object[]{this});
            return;
        }
        HashMap<String, String> hashMap = new HashMap<>();
        if (!"0".equals(this.categoryId)) {
            str = "other";
        } else {
            str = "all";
        }
        hashMap.put("tab", str);
        if (kkr.i() != null && kkr.i().o() != null) {
            kkr.i().o().b("BackTop", hashMap);
        }
    }

    private tea getFrameTracerFromParent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (tea) ipChange.ipc$dispatch("29127d2c", new Object[]{this});
        }
        ViewParent parent = getParent();
        while (parent != null && !(parent instanceof GoodsLiveStateMutitabView)) {
            parent = parent.getParent();
        }
        if (parent != null) {
            return ((GoodsLiveStateMutitabView) parent).frameTracer;
        }
        return null;
    }

    public static /* synthetic */ Object ipc$super(SingleTabBaseView singleTabBaseView, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1983604863) {
            super.destroy();
            return null;
        } else if (hashCode == 1626033557) {
            super.onAttachedToWindow();
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/android/live/plugin/atype/flexalocal/good/view/liveGoodsList/liveStateView/impl/SingleTabBaseView");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onCreateContentView$6(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("285b9333", new Object[]{this, view});
        } else {
            ((nqd) this.mPresenter).A(false, null);
        }
    }

    private void loadMore() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3f65f062", new Object[]{this});
        } else {
            ((nqd) this.mPresenter).loadMore();
        }
    }

    private void registerScrollListenerForFrameTracer() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fcb4de5c", new Object[]{this});
        } else if (!this.mFrameTracerListenerAttached) {
            if (this.frameTracer == null) {
                this.frameTracer = getFrameTracerFromParent();
            }
            if (this.frameTracer != null) {
                this.mListView.addOnScrollListener(new RecyclerView.OnScrollListener() { // from class: com.taobao.android.live.plugin.atype.flexalocal.good.view.liveGoodsList.liveStateView.impl.SingleTabBaseView.2
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    public static /* synthetic */ Object ipc$super(AnonymousClass2 r2, String str, Object... objArr) {
                        if (str.hashCode() == 1361287682) {
                            super.onScrollStateChanged((RecyclerView) objArr[0], ((Number) objArr[1]).intValue());
                            return null;
                        }
                        int hashCode = str.hashCode();
                        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/atype/flexalocal/good/view/liveGoodsList/liveStateView/impl/SingleTabBaseView$2");
                    }

                    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
                    public void onScrollStateChanged(RecyclerView recyclerView, int i) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("51239a02", new Object[]{this, recyclerView, new Integer(i)});
                            return;
                        }
                        super.onScrollStateChanged(recyclerView, i);
                        if (i == 2 || i == 1) {
                            SingleTabBaseView.access$500(SingleTabBaseView.this).d(true);
                            if (i == 1) {
                                kug.b(SingleTabBaseView.access$600(SingleTabBaseView.this));
                            }
                            hha.b(SingleTabBaseView.TAG, "onScrollStateChanged | start. state=" + i);
                            return;
                        }
                        SingleTabBaseView.access$500(SingleTabBaseView.this).d(false);
                        kug.a();
                        hha.b(SingleTabBaseView.TAG, "onScrollStateChanged | end.");
                    }
                });
                this.mFrameTracerListenerAttached = true;
            }
        }
    }

    public abstract void checkNeedCompensate(int i, int i2, int i3);

    public abstract AbstractGoodsRecyclerAdapter constructAdapter();

    @Override // com.taobao.android.live.plugin.atype.flexalocal.good.basemvplib.impl.GoodsBaseView, com.taobao.android.live.plugin.atype.flexalocal.good.basemvplib.impl.GoodsBaseTempView
    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        super.destroy();
        this.mHasShowed = false;
        AbstractGoodsRecyclerAdapter abstractGoodsRecyclerAdapter = this.mGoodsLiveStateListAdapter;
        if (abstractGoodsRecyclerAdapter != null) {
            abstractGoodsRecyclerAdapter.destroy();
        }
    }

    @Override // tb.pqd
    public AbstractGoodsRecyclerAdapter getAdapter() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AbstractGoodsRecyclerAdapter) ipChange.ipc$dispatch("9330d3b6", new Object[]{this});
        }
        if (this.mGoodsLiveStateListAdapter == null) {
            this.mGoodsLiveStateListAdapter = constructAdapter();
        }
        return this.mGoodsLiveStateListAdapter;
    }

    public ItemCategory getItemCategory() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ItemCategory) ipChange.ipc$dispatch("e964a693", new Object[]{this});
        }
        return this.mItemCategory;
    }

    @Override // tb.pqd
    public CloseRecyclerView getRecyclerView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CloseRecyclerView) ipChange.ipc$dispatch("14b4294e", new Object[]{this});
        }
        if (this.mListView == null) {
            this.mListView = new CloseRecyclerView(this.mGoodLiveContext.i());
        }
        return this.mListView;
    }

    @Override // tb.pqd
    public void hideEmptyView(pxg pxgVar) {
        View view;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b49ddff0", new Object[]{this, pxgVar});
        } else if (pxgVar.f26374a.equalsIgnoreCase(this.tabName) && (view = this.mEmptyView) != null) {
            view.setVisibility(8);
        }
    }

    @Override // tb.pqd
    public void hideErrorView(pxg pxgVar) {
        ViewGroup viewGroup;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c5c913ab", new Object[]{this, pxgVar});
        } else if (pxgVar.f26374a.equalsIgnoreCase(this.tabName) && (viewGroup = this.mErrorView) != null) {
            viewGroup.setVisibility(8);
        }
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.good.basemvplib.impl.GoodsBaseTempView
    public void initData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1ae4861", new Object[]{this});
        } else {
            ((nqd) this.mPresenter).j();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60eb4d95", new Object[]{this});
            return;
        }
        super.onAttachedToWindow();
        if (tea.ENABLED) {
            registerScrollListenerForFrameTracer();
        }
    }

    public void onHide() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b4c13c8", new Object[]{this});
        }
    }

    public void setItemCategory(ItemCategory itemCategory) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5622b57b", new Object[]{this, itemCategory});
            return;
        }
        this.mItemCategory = itemCategory;
        if (itemCategory != null) {
            this.tabName = itemCategory.name;
            this.categoryType = itemCategory.bizType;
        }
    }

    @Override // tb.pqd
    public void showEmptyView(pxg pxgVar) {
        View view;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3783b815", new Object[]{this, pxgVar});
        } else if (pxgVar.f26374a.equalsIgnoreCase(this.tabName) && (view = this.mEmptyView) != null) {
            view.setVisibility(0);
        }
    }

    @Override // tb.pqd
    public void showErrorView(pxg pxgVar) {
        ViewGroup viewGroup;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("48aeebd0", new Object[]{this, pxgVar});
        } else if (pxgVar.f26374a.equalsIgnoreCase(this.tabName) && (viewGroup = this.mErrorView) != null) {
            viewGroup.setVisibility(0);
            igq.n().a("GoodListDX2");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onCreateContentView$7(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("245d2212", new Object[]{this, view});
            return;
        }
        hha.c(TAG, "scrollToPosition 0");
        this.mBackTopFrameLayout.setVisibility(8);
        this.mListView.scrollToPosition(0);
        clickBackToTopBtn();
    }

    public void showPackage(boolean z) {
        xea xeaVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ad1e244", new Object[]{this, new Boolean(z)});
            return;
        }
        boolean z2 = this.mHasShowed;
        this.mHasShowed = true;
        show();
        nqd nqdVar = (nqd) this.mPresenter;
        CloseRecyclerView closeRecyclerView = this.mListView;
        nqdVar.A(z, closeRecyclerView != null ? closeRecyclerView.getCurrentShowItemList(nqdVar.o()) : null);
        if (!(!yga.i() || (xeaVar = this.mGoodLiveContext) == null || xeaVar.S == null)) {
            hha.b(TAG, "handle prefetch data cache");
            nqd nqdVar2 = (nqd) this.mPresenter;
            xea.c cVar = this.mGoodLiveContext.S;
            nqdVar2.G(cVar.f31334a, false, false, cVar.b, cVar.c, "prefetch");
            this.mGoodLiveContext.S = null;
        }
        if (!z2) {
            ((nqd) this.mPresenter).b();
        }
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.good.basemvplib.impl.GoodsBaseView
    public View onCreateContentView() {
        View view;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("a20e10cc", new Object[]{this});
        }
        if (this.mbPopFromRight) {
            view = LayoutInflater.from(getContext()).inflate(R.layout.taolive_goods_package_popupwindow_new_land_flexalocal, (ViewGroup) null);
        } else {
            view = LayoutInflater.from(getContext()).inflate(R.layout.taolive_goods_package_popupwindow_new_flexalocal, (ViewGroup) null);
        }
        this.mErrorView = (ViewGroup) view.findViewById(R.id.taolive_goods_package_error);
        Button button = (Button) view.findViewById(R.id.taolive_goods_package_retry);
        this.mEmptyView = view.findViewById(R.id.empty_view);
        this.mListView = (CloseRecyclerView) view.findViewById(R.id.listview);
        this.mBackTopFrameLayout = (FrameLayout) view.findViewById(R.id.ll_back_top_view2);
        ((AliUrlImageView) view.findViewById(R.id.back_top_image2)).setImageUrl("https://gw.alicdn.com/imgextra/i1/O1CN01kzkSRM1rZ0MqBhBqK_!!6000000005644-2-tps-144-144.png");
        this.mListView.setLayoutManager(new RecyclerViewNoBugLinearLayoutManager(this.mGoodLiveContext.i(), 1, false));
        AbstractGoodsRecyclerAdapter constructAdapter = constructAdapter();
        this.mGoodsLiveStateListAdapter = constructAdapter;
        this.mListView.setAdapter(constructAdapter);
        this.mListView.setHasFixedSize(true);
        if (!wda.F()) {
            this.mListView.setItemViewCacheSize(4);
        }
        this.mGoodsLiveStateListAdapter.Q(this.tabName);
        ((GoodsLiveStateMutitabView.a) this.mMultiTabViewDataGetter).a(this.mListView);
        RecyclerView.ItemAnimator itemAnimator = this.mListView.getItemAnimator();
        if (itemAnimator instanceof DefaultItemAnimator) {
            ((DefaultItemAnimator) itemAnimator).setSupportsChangeAnimations(false);
        }
        this.mListView.setCloseViewListener(new a());
        button.setOnClickListener(new View.OnClickListener() { // from class: tb.wzp
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                SingleTabBaseView.this.lambda$onCreateContentView$6(view2);
            }
        });
        this.mBackTopFrameLayout.setOnClickListener(new View.OnClickListener() { // from class: tb.yzp
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                SingleTabBaseView.this.lambda$onCreateContentView$7(view2);
            }
        });
        InsidePrefetchHelper insidePrefetchHelper = this.insidePrefetchHelper;
        if (insidePrefetchHelper != null) {
            insidePrefetchHelper.g(this.mListView, InsidePrefetchHelper.OPEN_SOURCE_SCROLL_GOODLIST);
        }
        return view;
    }
}
