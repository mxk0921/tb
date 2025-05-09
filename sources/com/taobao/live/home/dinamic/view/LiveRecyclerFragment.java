package com.taobao.live.home.dinamic.view;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.live.home.LiveHomeController;
import com.taobao.live.home.base.RecyclerArrayAdapter;
import com.taobao.live.home.business.BaseListRequest;
import com.taobao.live.home.dinamic.business.FeedListResponse;
import com.taobao.live.home.dinamic.model.DinamicDataObject;
import com.taobao.live.home.view.BaseLiveRecyclerFragment;
import com.taobao.taobao.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.ax1;
import tb.e2h;
import tb.eqd;
import tb.nlc;
import tb.owo;
import tb.qyg;
import tb.r0h;
import tb.t2o;
import tb.w6d;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public abstract class LiveRecyclerFragment extends BaseLiveRecyclerFragment implements w6d, nlc, eqd {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final String n = LiveRecyclerFragment.class.getSimpleName();
    public RecyclerView h;
    public SwipeRefreshLayout i;
    public RecyclerView.LayoutManager j;
    public final List<IMTOPDataObject> k = new ArrayList();
    public RecyclerArrayAdapter<IMTOPDataObject> l;
    public InnerScrollListener m;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class InnerScrollListener extends RecyclerView.OnScrollListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(806355462);
        }

        public InnerScrollListener() {
        }

        public static /* synthetic */ Object ipc$super(InnerScrollListener innerScrollListener, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/live/home/dinamic/view/LiveRecyclerFragment$InnerScrollListener");
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("51239a02", new Object[]{this, recyclerView, new Integer(i)});
                return;
            }
            qyg.c().i("com.taobao.live.home.h5.scroll.state.changed", Integer.valueOf(i));
            LiveRecyclerFragment.this.W2(i);
            if (LiveRecyclerFragment.D2(LiveRecyclerFragment.this) != null) {
                LiveRecyclerFragment.D2(LiveRecyclerFragment.this).onScrollStateChanged(recyclerView, i);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b9d7be25", new Object[]{this, recyclerView, new Integer(i), new Integer(i2)});
                return;
            }
            LiveRecyclerFragment.this.X2(recyclerView.getScrollState(), i, i2);
            if (LiveRecyclerFragment.D2(LiveRecyclerFragment.this) != null) {
                LiveRecyclerFragment.D2(LiveRecyclerFragment.this).onScrolled(recyclerView, i, i2);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a implements RecyclerArrayAdapter.c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // com.taobao.live.home.base.RecyclerArrayAdapter.c
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c7effe9b", new Object[]{this});
            } else {
                LiveRecyclerFragment.this.loadMore();
            }
        }

        @Override // com.taobao.live.home.base.RecyclerArrayAdapter.c
        public void b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("82599ef8", new Object[]{this});
            } else {
                LiveRecyclerFragment.this.loadMore();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class b implements RecyclerArrayAdapter.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // com.taobao.live.home.base.RecyclerArrayAdapter.b
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e99b2b8d", new Object[]{this});
            }
        }

        @Override // com.taobao.live.home.base.RecyclerArrayAdapter.b
        public void b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("48e004a6", new Object[]{this});
            } else {
                LiveRecyclerFragment.this.N2();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class c implements RecyclerArrayAdapter.d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fad9ae1a", new Object[]{this});
            } else {
                LiveRecyclerFragment.this.N2();
            }
        }

        public void b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("bdcc8399", new Object[]{this});
            }
        }
    }

    static {
        t2o.a(806355456);
        t2o.a(806355359);
        t2o.a(806355483);
        t2o.a(806355450);
    }

    public static /* synthetic */ RecyclerView.OnScrollListener D2(LiveRecyclerFragment liveRecyclerFragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecyclerView.OnScrollListener) ipChange.ipc$dispatch("109615a9", new Object[]{liveRecyclerFragment});
        }
        liveRecyclerFragment.getClass();
        return null;
    }

    public static /* synthetic */ Object ipc$super(LiveRecyclerFragment liveRecyclerFragment, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1504501726) {
            super.onDestroy();
            return null;
        } else if (hashCode == 462397159) {
            super.onDestroyView();
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/live/home/dinamic/view/LiveRecyclerFragment");
        }
    }

    @Override // com.taobao.live.home.view.BaseLiveRecyclerFragment
    public void A2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("562dcbcb", new Object[]{this});
            return;
        }
        RecyclerArrayAdapter<IMTOPDataObject> recyclerArrayAdapter = this.l;
        if (recyclerArrayAdapter != null && recyclerArrayAdapter.U() == 0 && this.d != null) {
            N2();
            SwipeRefreshLayout swipeRefreshLayout = this.i;
            if (swipeRefreshLayout != null) {
                swipeRefreshLayout.setRefreshing(true);
            }
        }
    }

    @Override // com.taobao.live.home.view.BaseLiveRecyclerFragment
    public ax1 B2(Bundle bundle, BaseListRequest baseListRequest) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ax1) ipChange.ipc$dispatch("3cfa32dd", new Object[]{this, bundle, baseListRequest});
        }
        ax1 K2 = K2(getContext(), bundle);
        if (K2 != null) {
            K2.u(this);
            K2.v(baseListRequest);
        }
        return K2;
    }

    public final void E2(List<IMTOPDataObject> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("58c0b782", new Object[]{this, list});
        } else if (list != null) {
            Iterator<IMTOPDataObject> it = list.iterator();
            while (it.hasNext()) {
                DinamicDataObject dinamicDataObject = (DinamicDataObject) it.next();
                dinamicDataObject.mChannelId = Q2();
                dinamicDataObject.mChannelType = R2();
            }
            RecyclerArrayAdapter<IMTOPDataObject> recyclerArrayAdapter = this.l;
            if (recyclerArrayAdapter != null) {
                recyclerArrayAdapter.O(list);
            }
            ((ArrayList) this.k).clear();
            ((ArrayList) this.k).addAll(list);
        } else {
            RecyclerArrayAdapter<IMTOPDataObject> recyclerArrayAdapter2 = this.l;
            if (recyclerArrayAdapter2 != null) {
                recyclerArrayAdapter2.j0();
            }
        }
    }

    public final void J2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("55cbb423", new Object[]{this});
            return;
        }
        RecyclerArrayAdapter<IMTOPDataObject> recyclerArrayAdapter = this.l;
        if (recyclerArrayAdapter != null && recyclerArrayAdapter.W() == 0) {
            this.l.g0(R.layout.live_load_more_view, new a());
        }
        RecyclerArrayAdapter<IMTOPDataObject> recyclerArrayAdapter2 = this.l;
        if (recyclerArrayAdapter2 != null) {
            recyclerArrayAdapter2.f0(T2(), new b());
            this.l.i0(T2(), new c());
        }
    }

    public abstract ax1 K2(Context context, Bundle bundle);

    public RecyclerView.LayoutManager M2(RecyclerArrayAdapter<IMTOPDataObject> recyclerArrayAdapter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecyclerView.LayoutManager) ipChange.ipc$dispatch("45d8b792", new Object[]{this, recyclerArrayAdapter});
        }
        StaggeredGridLayoutManager staggeredGridLayoutManager = new StaggeredGridLayoutManager(U2(), 1);
        staggeredGridLayoutManager.setGapStrategy(0);
        return staggeredGridLayoutManager;
    }

    public void N2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d7528eeb", new Object[]{this});
        } else if (this.d != null) {
            LiveHomeController.instance().loadTemplate();
            this.d.j();
        }
    }

    public RecyclerArrayAdapter<IMTOPDataObject> O2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecyclerArrayAdapter) ipChange.ipc$dispatch("3042ee52", new Object[]{this});
        }
        return new LiveRecyclerAdapter(getContext(), this);
    }

    @Override // tb.w6d
    public void Q1(BaseListRequest baseListRequest) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a60aad8f", new Object[]{this, baseListRequest});
        } else if (baseListRequest != null) {
            baseListRequest.s += baseListRequest.n;
            r0h.b(n, "onLoadMore: s " + baseListRequest.s);
        }
    }

    public String Q2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5ac47931", new Object[]{this});
        }
        return "";
    }

    public String R2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("44447fb2", new Object[]{this});
        }
        return "";
    }

    public int S2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4fed2753", new Object[]{this})).intValue();
        }
        RecyclerArrayAdapter<IMTOPDataObject> recyclerArrayAdapter = this.l;
        if (recyclerArrayAdapter != null) {
            return recyclerArrayAdapter.U();
        }
        return 0;
    }

    public int T2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f16c2289", new Object[]{this})).intValue();
        }
        return R.layout.live_load_error_layout;
    }

    public int U2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6a1c2e29", new Object[]{this})).intValue();
        }
        return 2;
    }

    public void W2(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57be9ce4", new Object[]{this, new Integer(i)});
            return;
        }
        RecyclerView.LayoutManager layoutManager = this.j;
        if ((layoutManager instanceof StaggeredGridLayoutManager) && this.h != null) {
            int[] iArr = new int[2];
            int[] iArr2 = new int[2];
            ((StaggeredGridLayoutManager) layoutManager).findFirstVisibleItemPositions(iArr);
            ((StaggeredGridLayoutManager) this.j).findLastVisibleItemPositions(iArr2);
            for (int min = Math.min(iArr[0], iArr[1]); min <= Math.max(iArr2[0], iArr2[1]); min++) {
                RecyclerView.ViewHolder findViewHolderForAdapterPosition = this.h.findViewHolderForAdapterPosition(min);
                if (findViewHolderForAdapterPosition instanceof LiveListViewHolder) {
                    LiveListViewHolder liveListViewHolder = (LiveListViewHolder) findViewHolderForAdapterPosition;
                    liveListViewHolder.onScrollStateChanged(i);
                    liveListViewHolder.o0();
                }
            }
        }
    }

    public void X2(int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b678ee8", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3)});
        } else if (this.h != null) {
            RecyclerView.LayoutManager layoutManager = this.j;
            if (layoutManager instanceof StaggeredGridLayoutManager) {
                int[] iArr = new int[2];
                int[] iArr2 = new int[2];
                ((StaggeredGridLayoutManager) layoutManager).findFirstVisibleItemPositions(iArr);
                ((StaggeredGridLayoutManager) this.j).findLastVisibleItemPositions(iArr2);
                for (int min = Math.min(iArr[0], iArr[1]); min <= Math.max(iArr2[0], iArr2[1]); min++) {
                    RecyclerView.ViewHolder findViewHolderForAdapterPosition = this.h.findViewHolderForAdapterPosition(min);
                    if (findViewHolderForAdapterPosition instanceof LiveListViewHolder) {
                        LiveListViewHolder liveListViewHolder = (LiveListViewHolder) findViewHolderForAdapterPosition;
                        liveListViewHolder.j0(i);
                        liveListViewHolder.o0();
                    }
                }
                c3(iArr2[0]);
            }
        }
    }

    public RecyclerView.ItemDecoration a3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecyclerView.ItemDecoration) ipChange.ipc$dispatch("26208679", new Object[]{this});
        }
        return new LiveNormalDecoration(owo.e(getContext(), "12ap", 0), owo.e(getContext(), "4.5ap", 0), owo.e(getContext(), "9ap", 0));
    }

    public void b3(List<IMTOPDataObject> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f6d9203c", new Object[]{this, list});
        }
    }

    public void c3(int i) {
        int U;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39ff551a", new Object[]{this, new Integer(i)});
            return;
        }
        RecyclerArrayAdapter<IMTOPDataObject> recyclerArrayAdapter = this.l;
        if (recyclerArrayAdapter != null && (U = recyclerArrayAdapter.U()) >= 20 && i >= U - 10) {
            loadMore();
        }
    }

    public final void d3(List<IMTOPDataObject> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90e99e91", new Object[]{this, list});
            return;
        }
        this.l.e0();
        this.l.Q();
        b3(list);
        E2(list);
        this.h.invalidateItemDecorations();
        this.l.notifyItemRangeChanged(0, list.size());
    }

    @Override // com.taobao.live.home.view.BaseLiveRecyclerFragment
    public int getLayoutId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bf537e55", new Object[]{this})).intValue();
        }
        return R.layout.live_base_list_fragment;
    }

    @Override // tb.w6d
    public void i1(BaseListRequest baseListRequest) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("335854d1", new Object[]{this, baseListRequest});
        } else if (baseListRequest != null) {
            baseListRequest.s = 0L;
            String str = n;
            r0h.b(str, "onReload: n " + baseListRequest.n);
        }
    }

    public void loadMore() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3f65f062", new Object[]{this});
            return;
        }
        ax1 ax1Var = this.d;
        if (ax1Var != null) {
            ax1Var.m();
        }
    }

    @Override // com.taobao.live.home.view.BaseLiveRecyclerFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        qyg.c().j(this);
        this.m = null;
    }

    @Override // com.taobao.live.home.view.BaseLiveRecyclerFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b8f9ee7", new Object[]{this});
            return;
        }
        super.onDestroyView();
        try {
            if (this.h != null) {
                for (int i = 0; i < S2(); i++) {
                    RecyclerView.ViewHolder findViewHolderForAdapterPosition = this.h.findViewHolderForAdapterPosition(i);
                    if (findViewHolderForAdapterPosition instanceof LiveListViewHolder) {
                        ((LiveListViewHolder) findViewHolderForAdapterPosition).destroy();
                    }
                }
                this.h.removeOnScrollListener(this.m);
                this.h.removeAllViews();
            }
        } catch (Exception unused) {
        }
    }

    @Override // tb.w6d
    public boolean onJudgeEnd() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c4c0044e", new Object[]{this})).booleanValue();
        }
        RecyclerArrayAdapter<IMTOPDataObject> recyclerArrayAdapter = this.l;
        if (recyclerArrayAdapter == null || recyclerArrayAdapter.U() < e2h.z()) {
            return false;
        }
        return true;
    }

    @Override // tb.nlc
    public void onLiveEvent(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("25d9ef1c", new Object[]{this, str, obj});
        }
    }

    @Override // tb.w6d
    public void onPageEnd() {
        Object obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7729b6f4", new Object[]{this});
            return;
        }
        String str = n;
        StringBuilder sb = new StringBuilder("onPageEnd: size ");
        RecyclerArrayAdapter<IMTOPDataObject> recyclerArrayAdapter = this.l;
        if (recyclerArrayAdapter != null) {
            obj = Integer.valueOf(recyclerArrayAdapter.U());
        } else {
            obj = "null";
        }
        sb.append(obj);
        r0h.b(str, sb.toString());
        RecyclerArrayAdapter<IMTOPDataObject> recyclerArrayAdapter2 = this.l;
        if (recyclerArrayAdapter2 != null) {
            recyclerArrayAdapter2.d0();
        }
    }

    @Override // tb.w6d
    public void onPageReceived(BaseOutDo baseOutDo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("27cdbec4", new Object[]{this, baseOutDo});
        } else if (baseOutDo instanceof FeedListResponse) {
            FeedListResponse feedListResponse = (FeedListResponse) baseOutDo;
            if (this.l != null && feedListResponse.getData() != null) {
                E2(feedListResponse.getData().dataList);
                if (feedListResponse.getData().dataList != null) {
                    String str = n;
                    r0h.b(str, "onPageReceived: " + feedListResponse.getData().dataList.size() + " list size: " + this.l.U());
                }
            }
        }
    }

    @Override // com.taobao.live.home.view.BaseLiveRecyclerFragment
    public void v2(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9cb82b62", new Object[]{this, view});
            return;
        }
        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) findViewById(R.id.live_list_refresh);
        this.i = swipeRefreshLayout;
        if (swipeRefreshLayout != null) {
            swipeRefreshLayout.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() { // from class: com.taobao.live.home.dinamic.view.LiveRecyclerFragment.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.OnRefreshListener
                public void onRefresh() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("c9cbba83", new Object[]{this});
                    } else {
                        LiveRecyclerFragment.this.N2();
                    }
                }
            });
            this.i.setColorSchemeResources(R.color.live_refresh_color);
            this.i.setDistanceToTriggerSync(100);
        }
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.live_list_recycler_view);
        this.h = recyclerView;
        if (recyclerView != null) {
            RecyclerArrayAdapter<IMTOPDataObject> O2 = O2();
            this.l = O2;
            RecyclerView.LayoutManager M2 = M2(O2);
            this.j = M2;
            this.h.setLayoutManager(M2);
            this.h.addItemDecoration(a3(), 0);
            this.h.setAdapter(this.l);
            this.h.setItemAnimator(null);
            InnerScrollListener innerScrollListener = new InnerScrollListener();
            this.m = innerScrollListener;
            this.h.addOnScrollListener(innerScrollListener);
        }
        J2();
        qyg.c().f(this);
    }

    @Override // tb.w6d
    public void onPageError(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c9cfa8ab", new Object[]{this, str});
            return;
        }
        String str2 = n;
        r0h.b(str2, "onPageError: " + str);
        SwipeRefreshLayout swipeRefreshLayout = this.i;
        if (swipeRefreshLayout != null) {
            swipeRefreshLayout.setRefreshing(false);
        }
    }

    @Override // tb.w6d
    public void onPageReload(BaseOutDo baseOutDo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("15a8a88c", new Object[]{this, baseOutDo});
            return;
        }
        SwipeRefreshLayout swipeRefreshLayout = this.i;
        if (swipeRefreshLayout != null) {
            swipeRefreshLayout.setRefreshing(false);
        }
        if (baseOutDo instanceof FeedListResponse) {
            FeedListResponse feedListResponse = (FeedListResponse) baseOutDo;
            if (this.l != null && feedListResponse.getData() != null) {
                d3(feedListResponse.getData().dataList);
                if (feedListResponse.getData().dataList != null) {
                    String str = n;
                    r0h.b(str, "onPageReload: " + feedListResponse.getData().dataList.size());
                }
            }
        }
    }
}
