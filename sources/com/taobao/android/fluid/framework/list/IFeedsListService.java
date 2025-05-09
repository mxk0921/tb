package com.taobao.android.fluid.framework.list;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.taobao.android.fluid.core.FluidService;
import com.taobao.android.fluid.framework.list.render.MultiRecyclerViewAdapter;
import com.taobao.android.fluid.framework.list.view.LockableRecycerView;
import com.taobao.uikit.extend.component.refresh.TBSwipeRefreshLayout;
import tb.ar9;
import tb.bpk;
import tb.nkc;
import tb.ntm;
import tb.uq9;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public interface IFeedsListService extends FluidService {
    public static final ar9 RECYCLER_VIEW_INDEX_OUT_OF_BOUNDS = new ar9("LIST-1", "RecyclerView 索引越界");
    public static final ar9 SCROLL_INVALID_TARGET_POSITION = new ar9("LIST-2", "无效的滚动索引");
    public static final String SERVICE_NAME = "IFeedsListService";

    /* synthetic */ void addCardChangeListener(bpk bpkVar);

    /* synthetic */ void addDragListener(LockableRecycerView.a aVar);

    /* synthetic */ void addListSpeedChangeListener(nkc nkcVar);

    /* synthetic */ void addLoadMoreListener(TBSwipeRefreshLayout.OnPushLoadMoreListener onPushLoadMoreListener);

    /* synthetic */ void addOnScrollListener(RecyclerView.OnScrollListener onScrollListener);

    /* synthetic */ void addRefreshListener(TBSwipeRefreshLayout.OnPullRefreshListener onPullRefreshListener);

    /* synthetic */ void addScrollListener(RecyclerView.OnScrollListener onScrollListener);

    /* synthetic */ uq9 getActiveCard();

    /* synthetic */ int getActivePosition();

    /* synthetic */ View getContentView();

    /* synthetic */ int getLastAppearCardPos();

    /* synthetic */ LinearLayoutManager getLayoutManager();

    /* synthetic */ int getListSpeed();

    /* synthetic */ MultiRecyclerViewAdapter getMediaCardListAdapter();

    ntm getPreloadVideoData();

    /* synthetic */ LockableRecycerView getRecyclerView();

    /* synthetic */ boolean isFastScroll();

    /* synthetic */ boolean isPublicAutoCut();

    /* synthetic */ boolean isPublicTheLastOne();

    /* synthetic */ void notifyItemChanged(int i);

    /* synthetic */ void preloadNext(uq9 uq9Var, boolean z);

    /* synthetic */ void publicNextVideo();

    /* synthetic */ void publicPreVideo();

    /* synthetic */ void removeCardChangeListener(bpk bpkVar);

    /* synthetic */ void removeDragListener(LockableRecycerView.a aVar);

    /* synthetic */ void removeListSpeedChangeListener(nkc nkcVar);

    /* synthetic */ void removeLoadMoreListener(TBSwipeRefreshLayout.OnPushLoadMoreListener onPushLoadMoreListener);

    /* synthetic */ void removeRefreshListener(TBSwipeRefreshLayout.OnPullRefreshListener onPullRefreshListener);

    /* synthetic */ void removeScrollListener(RecyclerView.OnScrollListener onScrollListener);

    void renderCacheVideo(ntm ntmVar);

    /* synthetic */ void renderList(Context context);

    /* synthetic */ void runOnLayoutSafe(View view, Runnable runnable, String str);

    /* synthetic */ boolean scrollToItem(String str);

    /* synthetic */ void setAutoLock(boolean z);

    /* synthetic */ void setPublicAutoCut(boolean z);

    /* synthetic */ void setScrollLockedExternal(boolean z);

    /* synthetic */ void smoothScrollToPosition(int i);
}
