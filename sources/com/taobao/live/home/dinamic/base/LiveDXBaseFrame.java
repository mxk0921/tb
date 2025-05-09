package com.taobao.live.home.dinamic.base;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.live.home.LiveHomeController;
import com.taobao.live.home.base.RecyclerArrayAdapter;
import com.taobao.live.home.business.BaseListRequest;
import com.taobao.live.home.dinamic.business.FeedListResponse;
import com.taobao.live.home.dinamic.view.LiveListViewHolder;
import com.taobao.taobao.R;
import java.util.List;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.ax1;
import tb.dlc;
import tb.r0h;
import tb.t2o;
import tb.w6d;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class LiveDXBaseFrame extends RecyclerView.OnScrollListener implements w6d {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final String j = LiveDXBaseFrame.class.getSimpleName();

    /* renamed from: a  reason: collision with root package name */
    public final Context f10947a;
    public View b;
    public RecyclerView c;
    public SwipeRefreshLayout d;
    public RecyclerArrayAdapter<IMTOPDataObject> e;
    public RecyclerView.LayoutManager f;
    public ax1 g;
    public final dlc h;
    public final int i = 2;

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
                LiveDXBaseFrame.this.w();
            }
        }

        @Override // com.taobao.live.home.base.RecyclerArrayAdapter.c
        public void b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("82599ef8", new Object[]{this});
            } else {
                LiveDXBaseFrame.this.w();
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
                LiveDXBaseFrame.this.s();
            }
        }
    }

    static {
        t2o.a(806355396);
        t2o.a(806355359);
    }

    public LiveDXBaseFrame(Context context, dlc dlcVar) {
        this.f10947a = context;
        this.h = dlcVar;
    }

    public static /* synthetic */ Object ipc$super(LiveDXBaseFrame liveDXBaseFrame, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1177043419) {
            super.onScrolled((RecyclerView) objArr[0], ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue());
            return null;
        } else if (hashCode == 1361287682) {
            super.onScrollStateChanged((RecyclerView) objArr[0], ((Number) objArr[1]).intValue());
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/live/home/dinamic/base/LiveDXBaseFrame");
        }
    }

    @Override // tb.w6d
    public void Q1(BaseListRequest baseListRequest) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a60aad8f", new Object[]{this, baseListRequest});
        } else if (baseListRequest != null) {
            baseListRequest.s += baseListRequest.n;
        }
    }

    public final RecyclerArrayAdapter<IMTOPDataObject> b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecyclerArrayAdapter) ipChange.ipc$dispatch("3228478", new Object[]{this});
        }
        return this.h.g();
    }

    @Override // tb.w6d
    public void i1(BaseListRequest baseListRequest) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("335854d1", new Object[]{this, baseListRequest});
        } else if (baseListRequest != null) {
            baseListRequest.s = 0L;
        }
    }

    public final void o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e8fbf63", new Object[]{this});
            return;
        }
        BaseListRequest createRequest = this.h.createRequest();
        ax1 a2 = this.h.a();
        this.g = a2;
        if (a2 != null) {
            a2.u(this);
            if (createRequest != null) {
                this.g.v(createRequest);
            }
        }
    }

    @Override // tb.w6d
    public boolean onJudgeEnd() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c4c0044e", new Object[]{this})).booleanValue();
        }
        return this.h.i(this.e);
    }

    @Override // tb.w6d
    public void onPageEnd() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7729b6f4", new Object[]{this});
            return;
        }
        RecyclerArrayAdapter<IMTOPDataObject> recyclerArrayAdapter = this.e;
        if (recyclerArrayAdapter != null) {
            recyclerArrayAdapter.d0();
        }
    }

    @Override // tb.w6d
    public void onPageError(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c9cfa8ab", new Object[]{this, str});
            return;
        }
        SwipeRefreshLayout swipeRefreshLayout = this.d;
        if (swipeRefreshLayout != null) {
            swipeRefreshLayout.setRefreshing(false);
        }
        this.h.onPageError(str);
    }

    @Override // tb.w6d
    public void onPageReceived(BaseOutDo baseOutDo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("27cdbec4", new Object[]{this, baseOutDo});
        } else if (baseOutDo instanceof FeedListResponse) {
            FeedListResponse feedListResponse = (FeedListResponse) baseOutDo;
            if (this.e != null && feedListResponse.getData() != null) {
                RecyclerArrayAdapter<IMTOPDataObject> recyclerArrayAdapter = this.e;
                if (recyclerArrayAdapter != null) {
                    recyclerArrayAdapter.O(feedListResponse.getData().dataList);
                }
                if (feedListResponse.getData().dataList != null) {
                    String str = j;
                    r0h.b(str, "onPageReceived: " + feedListResponse.getData().dataList.size() + " list size: " + this.e.U());
                }
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
    public void onScrollStateChanged(RecyclerView recyclerView, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("51239a02", new Object[]{this, recyclerView, new Integer(i)});
            return;
        }
        super.onScrollStateChanged(recyclerView, i);
        if (this.c != null) {
            RecyclerView.LayoutManager layoutManager = this.f;
            if (layoutManager instanceof StaggeredGridLayoutManager) {
                int i2 = this.i;
                int[] iArr = new int[i2];
                int[] iArr2 = new int[i2];
                ((StaggeredGridLayoutManager) layoutManager).findFirstVisibleItemPositions(iArr);
                ((StaggeredGridLayoutManager) this.f).findLastVisibleItemPositions(iArr2);
                for (int min = Math.min(iArr[0], iArr[this.i - 1]); min <= Math.max(iArr2[0], iArr2[this.i - 1]); min++) {
                    RecyclerView.ViewHolder findViewHolderForAdapterPosition = this.c.findViewHolderForAdapterPosition(min);
                    if (findViewHolderForAdapterPosition instanceof LiveListViewHolder) {
                        LiveListViewHolder liveListViewHolder = (LiveListViewHolder) findViewHolderForAdapterPosition;
                        liveListViewHolder.onScrollStateChanged(i);
                        liveListViewHolder.o0();
                    }
                }
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
    public void onScrolled(RecyclerView recyclerView, int i, int i2) {
        int U;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b9d7be25", new Object[]{this, recyclerView, new Integer(i), new Integer(i2)});
            return;
        }
        super.onScrolled(recyclerView, i, i2);
        if (this.c != null) {
            RecyclerView.LayoutManager layoutManager = this.f;
            if (layoutManager instanceof StaggeredGridLayoutManager) {
                int i3 = this.i;
                int[] iArr = new int[i3];
                int[] iArr2 = new int[i3];
                ((StaggeredGridLayoutManager) layoutManager).findFirstVisibleItemPositions(iArr);
                ((StaggeredGridLayoutManager) this.f).findLastVisibleItemPositions(iArr2);
                for (int min = Math.min(iArr[0], iArr[this.i - 1]); min <= Math.max(iArr2[0], iArr2[this.i - 1]); min++) {
                    RecyclerView.ViewHolder findViewHolderForAdapterPosition = this.c.findViewHolderForAdapterPosition(min);
                    if (findViewHolderForAdapterPosition instanceof LiveListViewHolder) {
                        LiveListViewHolder liveListViewHolder = (LiveListViewHolder) findViewHolderForAdapterPosition;
                        liveListViewHolder.j0(recyclerView.getScrollState());
                        liveListViewHolder.o0();
                    }
                }
                RecyclerArrayAdapter<IMTOPDataObject> recyclerArrayAdapter = this.e;
                if (recyclerArrayAdapter != null && (U = recyclerArrayAdapter.U()) >= 20 && iArr2[0] >= U - 10) {
                    w();
                }
            }
        }
    }

    public final void p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c16966be", new Object[]{this});
            return;
        }
        RecyclerArrayAdapter<IMTOPDataObject> recyclerArrayAdapter = this.e;
        if (!(recyclerArrayAdapter == null || recyclerArrayAdapter.W() != 0 || this.h.b() == 0)) {
            this.e.g0(this.h.b(), new a());
        }
        if (this.e != null) {
            if (this.h.b() != 0) {
                this.e.h0(this.h.d());
            }
            if (this.h.h() != 0) {
                this.e.f0(this.h.h(), new b());
            }
        }
    }

    public final void r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e29bcab0", new Object[]{this});
        }
    }

    public void s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d7528eeb", new Object[]{this});
        } else if (this.g != null) {
            LiveHomeController.instance().loadTemplate();
            this.g.j();
            SwipeRefreshLayout swipeRefreshLayout = this.d;
            if (swipeRefreshLayout != null) {
                swipeRefreshLayout.setRefreshing(true);
            }
        }
    }

    public RecyclerArrayAdapter<IMTOPDataObject> t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecyclerArrayAdapter) ipChange.ipc$dispatch("3042ee52", new Object[]{this});
        }
        return this.e;
    }

    public final void u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ffd024c5", new Object[]{this});
            return;
        }
        View view = this.b;
        if (view != null) {
            this.d = (SwipeRefreshLayout) view.findViewById(R.id.live_list_refresh);
            this.c = (RecyclerView) this.b.findViewById(R.id.live_list_recycler_view);
            SwipeRefreshLayout swipeRefreshLayout = this.d;
            if (swipeRefreshLayout != null) {
                swipeRefreshLayout.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() { // from class: com.taobao.live.home.dinamic.base.LiveDXBaseFrame.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.OnRefreshListener
                    public void onRefresh() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("c9cbba83", new Object[]{this});
                        } else {
                            LiveDXBaseFrame.this.s();
                        }
                    }
                });
                this.d.setColorSchemeResources(R.color.live_refresh_color);
                this.d.setDistanceToTriggerSync(100);
            }
            if (this.c != null) {
                RecyclerArrayAdapter<IMTOPDataObject> b2 = b();
                this.e = b2;
                if (b2 != null) {
                    this.c.addOnScrollListener(this);
                    this.c.setAdapter(this.e);
                    RecyclerView.LayoutManager c = this.h.c(this.f10947a, this.e);
                    this.f = c;
                    if (c != null) {
                        this.c.setLayoutManager(c);
                    }
                    RecyclerView.ItemDecoration f = this.h.f();
                    if (f != null) {
                        this.c.addItemDecoration(f);
                    }
                }
            }
            r();
            p();
        }
        o();
    }

    public void v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b7157237", new Object[]{this});
        } else {
            s();
        }
    }

    public void w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3f65f062", new Object[]{this});
            return;
        }
        ax1 ax1Var = this.g;
        if (ax1Var != null) {
            ax1Var.m();
        }
    }

    public void x(ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a1a1cc6", new Object[]{this, viewGroup});
            return;
        }
        View inflate = LayoutInflater.from(this.f10947a).inflate(R.layout.live_base_list_fragment, viewGroup, false);
        this.b = inflate;
        if (viewGroup != null) {
            viewGroup.addView(inflate);
        }
        u();
    }

    public final void z(List<IMTOPDataObject> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90e99e91", new Object[]{this, list});
            return;
        }
        RecyclerArrayAdapter<IMTOPDataObject> recyclerArrayAdapter = this.e;
        if (recyclerArrayAdapter != null && this.c != null) {
            recyclerArrayAdapter.e0();
            this.e.Q();
            this.h.e(list);
            this.e.O(list);
            this.c.invalidateItemDecorations();
        }
    }

    @Override // tb.w6d
    public void onPageReload(BaseOutDo baseOutDo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("15a8a88c", new Object[]{this, baseOutDo});
            return;
        }
        SwipeRefreshLayout swipeRefreshLayout = this.d;
        if (swipeRefreshLayout != null) {
            swipeRefreshLayout.setRefreshing(false);
        }
        if (baseOutDo instanceof FeedListResponse) {
            FeedListResponse feedListResponse = (FeedListResponse) baseOutDo;
            if (this.e != null && feedListResponse.getData() != null) {
                z(feedListResponse.getData().dataList);
                if (feedListResponse.getData().dataList != null) {
                    String str = j;
                    r0h.d(str, "onPageReload: " + feedListResponse.getData().dataList.size());
                }
            }
        }
    }
}
