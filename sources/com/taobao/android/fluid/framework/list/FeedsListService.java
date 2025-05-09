package com.taobao.android.fluid.framework.list;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.framework.list.render.ListRenderManager;
import com.taobao.android.fluid.framework.list.render.MultiRecyclerViewAdapter;
import com.taobao.android.fluid.framework.list.view.LockableRecycerView;
import com.taobao.uikit.extend.component.refresh.TBSwipeRefreshLayout;
import tb.bpk;
import tb.c69;
import tb.nkc;
import tb.ntm;
import tb.t2o;
import tb.uq9;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class FeedsListService implements IFeedsListService {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String UT_PAGE_NAME = "Page_videointeract";
    private c69 mFeedsListListenerManager;
    private final FluidContext mFluidContext;
    private ListRenderManager mListViewManager;

    static {
        t2o.a(468714447);
        t2o.a(468714448);
    }

    public FeedsListService(FluidContext fluidContext) {
        this.mFluidContext = fluidContext;
    }

    @Override // com.taobao.android.fluid.framework.list.IFeedsListService
    public void addCardChangeListener(bpk bpkVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c6088f8b", new Object[]{this, bpkVar});
        } else {
            this.mFeedsListListenerManager.d(bpkVar);
        }
    }

    @Override // com.taobao.android.fluid.framework.list.IFeedsListService
    public void addDragListener(LockableRecycerView.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa0fc18b", new Object[]{this, aVar});
        } else {
            this.mFeedsListListenerManager.e(aVar);
        }
    }

    @Override // com.taobao.android.fluid.framework.list.IFeedsListService
    public void addListSpeedChangeListener(nkc nkcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41413921", new Object[]{this, nkcVar});
        } else {
            this.mFeedsListListenerManager.f(nkcVar);
        }
    }

    @Override // com.taobao.android.fluid.framework.list.IFeedsListService
    public void addLoadMoreListener(TBSwipeRefreshLayout.OnPushLoadMoreListener onPushLoadMoreListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d0a47452", new Object[]{this, onPushLoadMoreListener});
        } else {
            this.mFeedsListListenerManager.g(onPushLoadMoreListener);
        }
    }

    @Override // com.taobao.android.fluid.framework.list.IFeedsListService
    public void addOnScrollListener(RecyclerView.OnScrollListener onScrollListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b67b00fd", new Object[]{this, onScrollListener});
        } else {
            this.mListViewManager.q(onScrollListener);
        }
    }

    @Override // com.taobao.android.fluid.framework.list.IFeedsListService
    public void addRefreshListener(TBSwipeRefreshLayout.OnPullRefreshListener onPullRefreshListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5df2649", new Object[]{this, onPullRefreshListener});
        } else {
            this.mFeedsListListenerManager.h(onPullRefreshListener);
        }
    }

    @Override // com.taobao.android.fluid.framework.list.IFeedsListService
    public void addScrollListener(RecyclerView.OnScrollListener onScrollListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f328d7e", new Object[]{this, onScrollListener});
        } else {
            this.mFeedsListListenerManager.i(onScrollListener);
        }
    }

    @Override // com.taobao.android.fluid.framework.list.IFeedsListService
    public uq9 getActiveCard() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (uq9) ipChange.ipc$dispatch("934fc714", new Object[]{this});
        }
        return this.mListViewManager.x();
    }

    @Override // com.taobao.android.fluid.framework.list.IFeedsListService
    public int getActivePosition() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("13183d3f", new Object[]{this})).intValue();
        }
        return this.mListViewManager.y();
    }

    @Override // com.taobao.android.fluid.framework.list.IFeedsListService
    public View getContentView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("ce219891", new Object[]{this});
        }
        return this.mListViewManager.A();
    }

    @Override // com.taobao.android.fluid.framework.list.IFeedsListService
    public int getLastAppearCardPos() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6840b11d", new Object[]{this})).intValue();
        }
        return this.mListViewManager.B();
    }

    @Override // com.taobao.android.fluid.framework.list.IFeedsListService
    public LinearLayoutManager getLayoutManager() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LinearLayoutManager) ipChange.ipc$dispatch("4a7cf619", new Object[]{this});
        }
        return this.mListViewManager.C();
    }

    @Override // com.taobao.android.fluid.framework.list.IFeedsListService
    public int getListSpeed() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2e00068d", new Object[]{this})).intValue();
        }
        return this.mListViewManager.D();
    }

    @Override // com.taobao.android.fluid.framework.list.IFeedsListService
    public MultiRecyclerViewAdapter getMediaCardListAdapter() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MultiRecyclerViewAdapter) ipChange.ipc$dispatch("8e79a948", new Object[]{this});
        }
        return this.mListViewManager.E();
    }

    @Override // com.taobao.android.fluid.framework.list.IFeedsListService
    public ntm getPreloadVideoData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ntm) ipChange.ipc$dispatch("d066531a", new Object[]{this});
        }
        return this.mListViewManager.F();
    }

    @Override // com.taobao.android.fluid.framework.list.IFeedsListService
    public LockableRecycerView getRecyclerView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LockableRecycerView) ipChange.ipc$dispatch("f0d4393f", new Object[]{this});
        }
        return this.mListViewManager.G();
    }

    @Override // com.taobao.android.fluid.framework.list.IFeedsListService
    public boolean isFastScroll() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6bd0b61e", new Object[]{this})).booleanValue();
        }
        return this.mListViewManager.H();
    }

    @Override // com.taobao.android.fluid.framework.list.IFeedsListService
    public boolean isPublicAutoCut() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c5d252eb", new Object[]{this})).booleanValue();
        }
        return this.mListViewManager.I();
    }

    @Override // com.taobao.android.fluid.framework.list.IFeedsListService
    public boolean isPublicTheLastOne() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("532e225d", new Object[]{this})).booleanValue();
        }
        return this.mListViewManager.J();
    }

    @Override // com.taobao.android.fluid.framework.list.IFeedsListService
    public void notifyItemChanged(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d809a144", new Object[]{this, new Integer(i)});
        } else {
            this.mListViewManager.K(i);
        }
    }

    @Override // com.taobao.android.fluid.core.FluidService
    public void onCreateService() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("486f8601", new Object[]{this});
            return;
        }
        this.mFeedsListListenerManager = new c69(this.mFluidContext);
        this.mListViewManager = new ListRenderManager(this.mFluidContext, this.mFeedsListListenerManager);
    }

    @Override // com.taobao.android.fluid.core.FluidService
    public void onDestroyService() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("770ac0a1", new Object[]{this});
        }
    }

    @Override // com.taobao.android.fluid.framework.list.IFeedsListService
    public void preloadNext(uq9 uq9Var, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a2fb79a0", new Object[]{this, uq9Var, new Boolean(z)});
        } else {
            this.mListViewManager.L(uq9Var, z);
        }
    }

    @Override // com.taobao.android.fluid.framework.list.IFeedsListService
    public void publicNextVideo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7db89e6", new Object[]{this});
        } else {
            this.mListViewManager.M();
        }
    }

    @Override // com.taobao.android.fluid.framework.list.IFeedsListService
    public void publicPreVideo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dda84928", new Object[]{this});
        } else {
            this.mListViewManager.N();
        }
    }

    @Override // com.taobao.android.fluid.framework.list.IFeedsListService
    public void removeCardChangeListener(bpk bpkVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a54a81ee", new Object[]{this, bpkVar});
        } else {
            this.mFeedsListListenerManager.o(bpkVar);
        }
    }

    @Override // com.taobao.android.fluid.framework.list.IFeedsListService
    public void removeDragListener(LockableRecycerView.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fc9aa208", new Object[]{this, aVar});
        } else {
            this.mFeedsListListenerManager.p(aVar);
        }
    }

    @Override // com.taobao.android.fluid.framework.list.IFeedsListService
    public void removeListSpeedChangeListener(nkc nkcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60564c9e", new Object[]{this, nkcVar});
        } else {
            this.mFeedsListListenerManager.q(nkcVar);
        }
    }

    @Override // com.taobao.android.fluid.framework.list.IFeedsListService
    public void removeLoadMoreListener(TBSwipeRefreshLayout.OnPushLoadMoreListener onPushLoadMoreListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ec29c8f", new Object[]{this, onPushLoadMoreListener});
        } else {
            this.mFeedsListListenerManager.r(onPushLoadMoreListener);
        }
    }

    @Override // com.taobao.android.fluid.framework.list.IFeedsListService
    public void removeRefreshListener(TBSwipeRefreshLayout.OnPullRefreshListener onPullRefreshListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c4f439c6", new Object[]{this, onPullRefreshListener});
        } else {
            this.mFeedsListListenerManager.s(onPullRefreshListener);
        }
    }

    @Override // com.taobao.android.fluid.framework.list.IFeedsListService
    public void removeScrollListener(RecyclerView.OnScrollListener onScrollListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3d3a6c21", new Object[]{this, onScrollListener});
        } else {
            this.mFeedsListListenerManager.t(onScrollListener);
        }
    }

    @Override // com.taobao.android.fluid.framework.list.IFeedsListService
    public void renderCacheVideo(ntm ntmVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e4253bf3", new Object[]{this, ntmVar});
        } else {
            this.mListViewManager.P(ntmVar);
        }
    }

    @Override // com.taobao.android.fluid.framework.list.IFeedsListService
    public void renderList(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d5d3e24d", new Object[]{this, context});
        } else {
            this.mListViewManager.Q(context);
        }
    }

    @Override // com.taobao.android.fluid.framework.list.IFeedsListService
    public void runOnLayoutSafe(View view, Runnable runnable, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d73da1d2", new Object[]{this, view, runnable, str});
        } else {
            this.mListViewManager.S(view, runnable, str);
        }
    }

    @Override // com.taobao.android.fluid.framework.list.IFeedsListService
    public boolean scrollToItem(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b2da01b0", new Object[]{this, str})).booleanValue();
        }
        return this.mListViewManager.T(str);
    }

    @Override // com.taobao.android.fluid.framework.list.IFeedsListService
    public void setAutoLock(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d4b3d6b1", new Object[]{this, new Boolean(z)});
        } else {
            this.mListViewManager.U(z);
        }
    }

    @Override // com.taobao.android.fluid.framework.list.IFeedsListService
    public void setPublicAutoCut(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cc520e05", new Object[]{this, new Boolean(z)});
        } else {
            this.mListViewManager.b0(z);
        }
    }

    @Override // com.taobao.android.fluid.framework.list.IFeedsListService
    public void setScrollLockedExternal(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f6c08109", new Object[]{this, new Boolean(z)});
        } else {
            this.mListViewManager.c0(z);
        }
    }

    @Override // com.taobao.android.fluid.framework.list.IFeedsListService
    public void smoothScrollToPosition(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e65f897d", new Object[]{this, new Integer(i)});
        } else {
            this.mListViewManager.d0(i);
        }
    }
}
