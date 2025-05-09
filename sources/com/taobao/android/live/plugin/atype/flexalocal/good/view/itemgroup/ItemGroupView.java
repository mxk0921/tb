package com.taobao.android.live.plugin.atype.flexalocal.good.view.itemgroup;

import android.os.Handler;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.fastjson.JSONObject;
import com.alilive.adapter.uikit.AliUrlImageView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.live.plugin.atype.flexalocal.good.basemvplib.impl.GoodsBaseView;
import com.taobao.android.live.plugin.atype.flexalocal.good.goodviewnew.GoodsView;
import com.taobao.android.live.plugin.atype.flexalocal.good.insideprefetch.InsidePrefetchHelper;
import com.taobao.android.live.plugin.atype.flexalocal.good.view.itemgroup.ItemGroupPopupView;
import com.taobao.android.live.plugin.atype.flexalocal.good.view.liveGoodsList.liveStateView.impl.adapter.AbstractGoodsRecyclerAdapter;
import com.taobao.android.live.plugin.atype.flexalocal.good.view.liveGoodsList.liveStateView.impl.adapter.ItemGroupAdapter2;
import com.taobao.android.live.plugin.atype.flexalocal.good.view.liveGoodsList.liveStateView.impl.view.RecyclerViewNoBugLinearLayoutManager;
import com.taobao.schedule.ViewProxy;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import java.util.ArrayList;
import tb.bdd;
import tb.fof;
import tb.ikr;
import tb.kbc;
import tb.s3c;
import tb.sac;
import tb.sjr;
import tb.t2o;
import tb.u3u;
import tb.xea;
import tb.yga;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class ItemGroupView extends GoodsBaseView<fof> implements sac, View.OnClickListener, s3c {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private View mBackBtn;
    private View mCloseBtn;
    private b mCloseHandler;
    private AliUrlImageView mEmptyImage;
    private View mEmptyLayout;
    private AliUrlImageView mErrorImage;
    private View mErrorLayout;
    private kbc mGoodsView;
    private AbstractGoodsRecyclerAdapter mGroupAdapter;
    private FrameLayout mGroupInfoDXContainer;
    private View mItemDataContainer;
    private ItemGroupPageInfo mPageInfo;
    private RecyclerView mRecyclerView;
    private TextView mRetryButton;
    private TextView mTips;
    private TextView mTitle;
    private final Runnable prefetchRunnable = new a();
    private RecyclerView.OnScrollListener mScrollListener = new RecyclerView.OnScrollListener() { // from class: com.taobao.android.live.plugin.atype.flexalocal.good.view.itemgroup.ItemGroupView.2
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(AnonymousClass2 r2, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/atype/flexalocal/good/view/itemgroup/ItemGroupView$2");
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b9d7be25", new Object[]{this, recyclerView, new Integer(i), new Integer(i2)});
                return;
            }
            int itemCount = recyclerView.getAdapter().getItemCount();
            int findLastVisibleItemPosition = ((RecyclerViewNoBugLinearLayoutManager) recyclerView.getLayoutManager()).findLastVisibleItemPosition();
            int childCount = recyclerView.getChildCount();
            if (findLastVisibleItemPosition >= itemCount - 3 && childCount > 0 && ItemGroupView.access$000(ItemGroupView.this) != null) {
                ((fof) ItemGroupView.access$200(ItemGroupView.this)).g(ItemGroupView.access$100(ItemGroupView.this).id, ItemGroupView.access$100(ItemGroupView.this).type);
            }
        }
    };
    private final int aggregationFirstShowPreFetchDelayDuration = yga.t0();
    private Handler mHandler = new Handler();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
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
                ItemGroupView.this.preFetchInsideDetailData(InsidePrefetchHelper.OPEN_SOURCE_OPE_AGGREGATION);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public interface b {
    }

    static {
        t2o.a(295699300);
        t2o.a(295699309);
        t2o.a(806355016);
    }

    public ItemGroupView(xea xeaVar, boolean z) {
        super(xeaVar, z);
        initView();
    }

    public static /* synthetic */ bdd access$000(ItemGroupView itemGroupView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (bdd) ipChange.ipc$dispatch("e598580c", new Object[]{itemGroupView});
        }
        return itemGroupView.mPresenter;
    }

    public static /* synthetic */ ItemGroupPageInfo access$100(ItemGroupView itemGroupView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ItemGroupPageInfo) ipChange.ipc$dispatch("bd4c5ee", new Object[]{itemGroupView});
        }
        return itemGroupView.mPageInfo;
    }

    public static /* synthetic */ bdd access$200(ItemGroupView itemGroupView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (bdd) ipChange.ipc$dispatch("72f5df0e", new Object[]{itemGroupView});
        }
        return itemGroupView.mPresenter;
    }

    private void handleClose() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1ff0c537", new Object[]{this});
            return;
        }
        ItemGroupPageInfo itemGroupPageInfo = this.mPageInfo;
        if (itemGroupPageInfo != null && TextUtils.equals(itemGroupPageInfo.closeAction, u3u.ENTRY_TYPE_LIVE_CART)) {
            ((GoodsView) this.mGoodsView).E();
        }
    }

    public static /* synthetic */ Object ipc$super(ItemGroupView itemGroupView, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1983604863) {
            super.destroy();
            return null;
        } else if (hashCode == -340027132) {
            super.show();
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/android/live/plugin/atype/flexalocal/good/view/itemgroup/ItemGroupView");
        }
    }

    private void renderDXGroupInfo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a428a54a", new Object[]{this});
            return;
        }
        DXRootView a2 = ikr.f().a(this.mGoodLiveContext.i(), "taolive_goods_aggregation_coupon_card");
        if (a2 != null) {
            this.mGroupInfoDXContainer.addView(a2);
            ikr.f().m(a2, this.mPageInfo.data, this.mGoodLiveContext);
        }
    }

    @Override // tb.s3c
    public String bizCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("36951559", new Object[]{this});
        }
        return "ItemGroupView";
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.good.basemvplib.impl.GoodsBaseView, com.taobao.android.live.plugin.atype.flexalocal.good.basemvplib.impl.GoodsBaseTempView
    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        super.destroy();
        RecyclerView recyclerView = this.mRecyclerView;
        if (recyclerView != null) {
            recyclerView.removeOnScrollListener(this.mScrollListener);
        }
        Handler handler = this.mHandler;
        if (handler != null) {
            handler.removeCallbacks(this.prefetchRunnable);
        }
        this.mGoodsView = null;
        sjr.g().b(this);
    }

    @Override // tb.sac
    public AbstractGoodsRecyclerAdapter getAdapter() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AbstractGoodsRecyclerAdapter) ipChange.ipc$dispatch("9330d3b6", new Object[]{this});
        }
        return this.mGroupAdapter;
    }

    @Override // tb.sac
    public View getContentView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("ce219891", new Object[]{this});
        }
        return this.mContentView;
    }

    public ItemGroupPageInfo getPageInfo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ItemGroupPageInfo) ipChange.ipc$dispatch("91d9b849", new Object[]{this});
        }
        return this.mPageInfo;
    }

    @Override // tb.s3c
    public String[] observeEvents() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("37b2602b", new Object[]{this});
        }
        return new String[]{"com.taobao.taolive.hide.member.identification.inner", "com.taobao.taolive.room.goodlist.timepoint.asked.inner", "com.taobao.taolive.room.goodlist.all.refresh.item.inner"};
    }

    @Override // tb.s3c
    public String observeUniqueIdentification() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4914bdfe", new Object[]{this});
        }
        return xea.E(this.mGoodLiveContext);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
        } else if (view.getId() == R.id.taolive_good_itemgroup_btn_back) {
            b bVar = this.mCloseHandler;
            if (bVar != null) {
                ((ItemGroupPopupView.a) bVar).a();
            }
            handleClose();
        } else if (view.getId() == R.id.taolive_good_itemgroup_btn_close) {
            b bVar2 = this.mCloseHandler;
            if (bVar2 != null) {
                ((ItemGroupPopupView.a) bVar2).a();
            }
            handleClose();
        } else if (view.getId() == R.id.taolive_good_itemgroup_retry) {
            ItemGroupPageInfo itemGroupPageInfo = this.mPageInfo;
            ((fof) this.mPresenter).D(itemGroupPageInfo.id, itemGroupPageInfo.type, -1);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x002b, code lost:
        if (r7.equals("com.taobao.taolive.hide.member.identification.inner") == false) goto L_0x0023;
     */
    @Override // tb.s3c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onEvent(java.lang.String r7, java.lang.Object r8) {
        /*
            r6 = this;
            r0 = 2
            r1 = 1
            r2 = 0
            com.android.alibaba.ip.runtime.IpChange r3 = com.taobao.android.live.plugin.atype.flexalocal.good.view.itemgroup.ItemGroupView.$ipChange
            boolean r4 = r3 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r4 == 0) goto L_0x0018
            java.lang.String r4 = "c3897928"
            r5 = 3
            java.lang.Object[] r5 = new java.lang.Object[r5]
            r5[r2] = r6
            r5[r1] = r7
            r5[r0] = r8
            r3.ipc$dispatch(r4, r5)
            return
        L_0x0018:
            r7.hashCode()
            r3 = -1
            int r4 = r7.hashCode()
            switch(r4) {
                case -2034149202: goto L_0x0039;
                case 189607490: goto L_0x002e;
                case 224943025: goto L_0x0025;
                default: goto L_0x0023;
            }
        L_0x0023:
            r0 = -1
            goto L_0x0043
        L_0x0025:
            java.lang.String r1 = "com.taobao.taolive.hide.member.identification.inner"
            boolean r7 = r7.equals(r1)
            if (r7 != 0) goto L_0x0043
            goto L_0x0023
        L_0x002e:
            java.lang.String r0 = "com.taobao.taolive.room.goodlist.timepoint.asked.inner"
            boolean r7 = r7.equals(r0)
            if (r7 != 0) goto L_0x0037
            goto L_0x0023
        L_0x0037:
            r0 = 1
            goto L_0x0043
        L_0x0039:
            java.lang.String r0 = "com.taobao.taolive.room.goodlist.all.refresh.item.inner"
            boolean r7 = r7.equals(r0)
            if (r7 != 0) goto L_0x0042
            goto L_0x0023
        L_0x0042:
            r0 = 0
        L_0x0043:
            switch(r0) {
                case 0: goto L_0x004f;
                case 1: goto L_0x004f;
                case 2: goto L_0x0047;
                default: goto L_0x0046;
            }
        L_0x0046:
            goto L_0x005c
        L_0x0047:
            T extends tb.bdd r7 = r6.mPresenter
            tb.fof r7 = (tb.fof) r7
            r7.a()
            goto L_0x005c
        L_0x004f:
            boolean r7 = r8 instanceof com.taobao.taolive.sdk.model.common.LiveItem
            if (r7 == 0) goto L_0x005c
            T extends tb.bdd r7 = r6.mPresenter
            tb.fof r7 = (tb.fof) r7
            com.taobao.taolive.sdk.model.common.LiveItem r8 = (com.taobao.taolive.sdk.model.common.LiveItem) r8
            r7.h(r8)
        L_0x005c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.live.plugin.atype.flexalocal.good.view.itemgroup.ItemGroupView.onEvent(java.lang.String, java.lang.Object):void");
    }

    public void setCloseHandler(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c9db6a7e", new Object[]{this, bVar});
        } else {
            this.mCloseHandler = bVar;
        }
    }

    public void setPageInfo(kbc kbcVar, ItemGroupPageInfo itemGroupPageInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("473d0a6d", new Object[]{this, kbcVar, itemGroupPageInfo});
            return;
        }
        this.mGoodsView = kbcVar;
        if (itemGroupPageInfo != null) {
            this.mPageInfo = itemGroupPageInfo;
            this.mTitle.setText(itemGroupPageInfo.title);
            if ("back".equals(this.mPageInfo.topButton)) {
                this.mBackBtn.setVisibility(0);
                this.mCloseBtn.setVisibility(8);
            } else {
                this.mBackBtn.setVisibility(8);
                this.mCloseBtn.setVisibility(0);
            }
            if (TextUtils.isEmpty(this.mPageInfo.goodsTips)) {
                this.mTips.setVisibility(8);
            } else {
                this.mTips.setVisibility(0);
            }
            JSONObject jSONObject = this.mPageInfo.data;
            if (jSONObject != null && !jSONObject.isEmpty()) {
                renderDXGroupInfo();
            }
            sjr.g().a(this);
        }
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.good.basemvplib.impl.GoodsBaseView
    public void show() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ebbb9904", new Object[]{this});
            return;
        }
        super.show();
        ItemGroupPageInfo itemGroupPageInfo = this.mPageInfo;
        ((fof) this.mPresenter).D(itemGroupPageInfo.id, itemGroupPageInfo.type, -1);
        this.mHandler.postDelayed(this.prefetchRunnable, this.aggregationFirstShowPreFetchDelayDuration);
    }

    @Override // tb.sac
    public void showEmpty(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b00b2ee1", new Object[]{this, str});
            return;
        }
        this.mItemDataContainer.setVisibility(8);
        this.mEmptyLayout.setVisibility(0);
        this.mErrorLayout.setVisibility(8);
    }

    @Override // tb.sac
    public void showError(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce476d5c", new Object[]{this, str});
            return;
        }
        this.mItemDataContainer.setVisibility(8);
        this.mEmptyLayout.setVisibility(8);
        this.mErrorLayout.setVisibility(0);
    }

    @Override // tb.sac
    public void showGoodList(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f6ec5e0e", new Object[]{this, new Integer(i), str});
            return;
        }
        showInitState();
        this.mTips.setText(this.mPageInfo.goodsTips);
    }

    public void showInitState() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e39edd6b", new Object[]{this});
            return;
        }
        this.mItemDataContainer.setVisibility(0);
        this.mEmptyLayout.setVisibility(8);
        this.mErrorLayout.setVisibility(8);
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.good.basemvplib.impl.GoodsBaseView
    public fof initInjector() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (fof) ipChange.ipc$dispatch("25e1f1f7", new Object[]{this});
        }
        fof fofVar = new fof(this.mGoodLiveContext);
        showInitState();
        return fofVar;
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.good.basemvplib.impl.GoodsBaseView
    public View onCreateContentView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("a20e10cc", new Object[]{this});
        }
        View inflate = LayoutInflater.from(getContext()).inflate(R.layout.taolive_goods_itemgroup_layout_flexalocal, (ViewGroup) null);
        this.mTitle = (TextView) inflate.findViewById(R.id.taolive_good_itemgroup_title);
        View findViewById = inflate.findViewById(R.id.taolive_good_itemgroup_btn_back);
        this.mBackBtn = findViewById;
        ViewProxy.setOnClickListener(findViewById, this);
        View findViewById2 = inflate.findViewById(R.id.taolive_good_itemgroup_btn_close);
        this.mCloseBtn = findViewById2;
        ViewProxy.setOnClickListener(findViewById2, this);
        ((TUrlImageView) inflate.findViewById(R.id.taolive_good_itemgroup_btn_close_img)).setImageUrl("https://gw.alicdn.com/imgextra/i1/O1CN01Pv6KZ11BwAWFPaJ8K_!!6000000000009-2-tps-90-92.png");
        this.mGroupInfoDXContainer = (FrameLayout) inflate.findViewById(R.id.taolive_good_itemgroup_keyinfo);
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(R.id.taolive_good_itemgroup_recyclerview);
        this.mRecyclerView = recyclerView;
        recyclerView.setLayoutManager(new RecyclerViewNoBugLinearLayoutManager(this.mGoodLiveContext.i(), 1, false));
        this.mRecyclerView.addOnScrollListener(this.mScrollListener);
        ItemGroupAdapter2 itemGroupAdapter2 = new ItemGroupAdapter2(this.mGoodLiveContext, new ArrayList(), this.mRecyclerView);
        this.mGroupAdapter = itemGroupAdapter2;
        this.mRecyclerView.setAdapter(itemGroupAdapter2);
        this.mRecyclerView.setItemViewCacheSize(0);
        this.mTips = (TextView) inflate.findViewById(R.id.taolive_good_itemgroup_tips);
        this.mItemDataContainer = inflate.findViewById(R.id.taolive_good_itemgroup_content);
        this.mEmptyLayout = inflate.findViewById(R.id.taolive_good_itemgroup_empty_layout);
        AliUrlImageView aliUrlImageView = (AliUrlImageView) inflate.findViewById(R.id.taolive_good_itemgroup_empty_image);
        this.mEmptyImage = aliUrlImageView;
        aliUrlImageView.setImageUrl("https://gw.alicdn.com/imgextra/i2/O1CN01SzKoo829WrPPzGQF5_!!6000000008076-2-tps-220-220.png");
        this.mErrorLayout = inflate.findViewById(R.id.taolive_good_itemgroup_error_layout);
        AliUrlImageView aliUrlImageView2 = (AliUrlImageView) inflate.findViewById(R.id.taolive_good_itemgroup_error_image);
        this.mErrorImage = aliUrlImageView2;
        aliUrlImageView2.setImageUrl("https://gw.alicdn.com/imgextra/i2/O1CN01tM8zwX1oPtS5h7fFn_!!6000000005218-2-tps-330-330.png");
        TextView textView = (TextView) inflate.findViewById(R.id.taolive_good_itemgroup_retry);
        this.mRetryButton = textView;
        textView.setOnClickListener(this);
        InsidePrefetchHelper insidePrefetchHelper = this.insidePrefetchHelper;
        if (insidePrefetchHelper != null) {
            insidePrefetchHelper.g(this.mRecyclerView, InsidePrefetchHelper.OPEN_SOURCE_SCROLL_AGGREGATION);
        }
        return inflate;
    }
}
