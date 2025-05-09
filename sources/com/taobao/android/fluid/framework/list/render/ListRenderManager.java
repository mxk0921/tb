package com.taobao.android.fluid.framework.list.render;

import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.FluidSDK;
import com.taobao.android.fluid.business.usertrack.ITrackService;
import com.taobao.android.fluid.business.videocollection.ICollectionService;
import com.taobao.android.fluid.common.view.TBVideoPagerSnapHelper;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.core.FluidService;
import com.taobao.android.fluid.core.exception.FluidException;
import com.taobao.android.fluid.framework.analysis.monitor.ListMonitor;
import com.taobao.android.fluid.framework.card.ICardService;
import com.taobao.android.fluid.framework.card.cards.album.PictureAlbumCard;
import com.taobao.android.fluid.framework.container.IContainerService;
import com.taobao.android.fluid.framework.data.IDataService;
import com.taobao.android.fluid.framework.data.datamodel.a;
import com.taobao.android.fluid.framework.deprecated.message.IMessageService;
import com.taobao.android.fluid.framework.hostcontainer.pageinterface.IHostPageInterfaceService;
import com.taobao.android.fluid.framework.hostcontainer.tnode.IHostTNodeService;
import com.taobao.android.fluid.framework.list.IFeedsListService;
import com.taobao.android.fluid.framework.list.view.FullPageRefreshHeader;
import com.taobao.android.fluid.framework.list.view.LockableRecycerView;
import com.taobao.android.fluid.framework.scene.ISceneConfigService;
import com.taobao.tao.flexbox.layoutmanager.view.swipeRefresh.TNodeTBSwipeRefreshLayout;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.component.refresh.TBRefreshHeader;
import com.taobao.uikit.extend.component.refresh.TBSwipeRefreshLayout;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import tb.akt;
import tb.anl;
import tb.b93;
import tb.bod;
import tb.bpk;
import tb.c3a;
import tb.d3a;
import tb.d5n;
import tb.d69;
import tb.d6c;
import tb.enc;
import tb.eps;
import tb.h1u;
import tb.hr9;
import tb.hxf;
import tb.ici;
import tb.ir9;
import tb.k5h;
import tb.kon;
import tb.la2;
import tb.lwl;
import tb.ns8;
import tb.ntm;
import tb.nug;
import tb.nwv;
import tb.oqi;
import tb.pj0;
import tb.pr9;
import tb.prp;
import tb.s19;
import tb.t2o;
import tb.uq9;
import tb.vn8;
import tb.xau;
import tb.xv4;
import tb.xyw;
import tb.zpm;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public final class ListRenderManager {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final FluidContext f7843a;
    public final IContainerService b;
    public final IDataService c;
    public final IMessageService d;
    public final IHostTNodeService e;
    public final ICollectionService f;
    public final Handler g = new Handler(Looper.getMainLooper());
    public final d6c h;
    public LockableRecycerView i;
    public LinearLayoutManager j;
    public MultiRecyclerViewAdapter k;
    public TBVideoPagerSnapHelper l;
    public View m;
    public TBSwipeRefreshLayout n;
    public uq9 o;
    public long p;
    public boolean q;
    public boolean r;
    public final int s;
    public final nug t;
    public final int u;

    /* compiled from: Taobao */
    /* renamed from: com.taobao.android.fluid.framework.list.render.ListRenderManager$4  reason: invalid class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class AnonymousClass4 extends MultiRecyclerViewAdapter {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public AnonymousClass4(FluidContext fluidContext) {
            super(fluidContext);
        }

        public static /* synthetic */ Object ipc$super(AnonymousClass4 r2, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/fluid/framework/list/render/ListRenderManager$4");
        }

        public int y0(com.taobao.android.fluid.framework.data.datamodel.a aVar, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("7ea9b7ff", new Object[]{this, aVar, new Integer(i)})).intValue();
            }
            return aVar.j(0);
        }

        public uq9 z0(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (uq9) ipChange.ipc$dispatch("bd4ae4b6", new Object[]{this, new Integer(i)});
            }
            ir9.b("ListRenderManager", "PickPreloadControllerNew，卡片type：" + i);
            if (i == 0) {
                return new prp(ListRenderManager.j(ListRenderManager.this));
            }
            if (i == 1) {
                return new pj0(ListRenderManager.j(ListRenderManager.this));
            }
            if (i == 2) {
                return new k5h(ListRenderManager.j(ListRenderManager.this));
            }
            if (i == 3) {
                return new PictureAlbumCard(ListRenderManager.j(ListRenderManager.this));
            }
            if (i == 4) {
                return new ns8(ListRenderManager.j(ListRenderManager.this));
            }
            if (i != 5) {
                return null;
            }
            return new xyw(ListRenderManager.j(ListRenderManager.this));
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements TBVideoPagerSnapHelper.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // com.taobao.android.fluid.common.view.TBVideoPagerSnapHelper.b
        public void a(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("88c838a7", new Object[]{this, new Integer(i)});
                return;
            }
            ListRenderManager.m(ListRenderManager.this).a(i);
            com.taobao.android.fluid.framework.list.render.b.g(ListRenderManager.this.G(), i);
            ListRenderManager.g(ListRenderManager.this).e(i);
            hr9.b(ListRenderManager.j(ListRenderManager.this));
            zpm.g().b(ListRenderManager.j(ListRenderManager.this), ListRenderManager.i(ListRenderManager.this).getDataList(), i + 1);
        }

        @Override // com.taobao.android.fluid.common.view.TBVideoPagerSnapHelper.b
        public void b(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4fa88aa1", new Object[]{this, new Boolean(z)});
                return;
            }
            ListRenderManager.m(ListRenderManager.this).b(z);
            ListRenderManager.h(ListRenderManager.this, z);
        }

        @Override // com.taobao.android.fluid.common.view.TBVideoPagerSnapHelper.b
        public void c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9d08aa3", new Object[]{this});
                return;
            }
            ListRenderManager.m(ListRenderManager.this).c();
            ListRenderManager.this.E().i0(ListRenderManager.this.G());
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class b implements la2<String, BitmapDrawable> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b(ListRenderManager listRenderManager) {
        }

        /* renamed from: b */
        public void a(String str, BitmapDrawable bitmapDrawable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7626bc8", new Object[]{this, str, bitmapDrawable});
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                ListRenderManager.a(ListRenderManager.this).setAutoLock(false);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class d implements bpk {
        public static volatile transient /* synthetic */ IpChange $ipChange;

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
                    return;
                }
                while (!ListRenderManager.p(ListRenderManager.this).getFeedbackList().isEmpty()) {
                    ListRenderManager.p(ListRenderManager.this).insertDetailListAtCurrent((kon.h) ListRenderManager.p(ListRenderManager.this).getFeedbackList().removeFirst());
                }
            }
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
        public class b implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ uq9 f7850a;
            public final /* synthetic */ uq9 b;

            public b(uq9 uq9Var, uq9 uq9Var2) {
                this.f7850a = uq9Var;
                this.b = uq9Var2;
            }

            @Override // java.lang.Runnable
            public void run() {
                boolean z = false;
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                uq9 uq9Var = this.f7850a;
                if (uq9Var == null) {
                    ListRenderManager.this.L(this.b, false);
                    ListRenderManager.this.L(this.b, true);
                } else if ((uq9Var instanceof ici) && (this.b instanceof ici)) {
                    int adapterPosition = ((ici) uq9Var).f0().getAdapterPosition();
                    int adapterPosition2 = ((ici) this.b).f0().getAdapterPosition();
                    ListRenderManager listRenderManager = ListRenderManager.this;
                    uq9 uq9Var2 = this.b;
                    if (adapterPosition > adapterPosition2) {
                        z = true;
                    }
                    listRenderManager.L(uq9Var2, z);
                }
            }
        }

        public d() {
        }

        @Override // tb.bpk
        public void m(uq9 uq9Var, uq9 uq9Var2) {
            com.taobao.android.fluid.framework.data.datamodel.a currentMediaSetData;
            d3a d3aVar;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c3112268", new Object[]{this, uq9Var, uq9Var2});
                return;
            }
            ir9.b("ListRenderManager", "onActiveCardChanged current: " + ListRenderManager.k(ListRenderManager.this, uq9Var) + ", old: " + ListRenderManager.k(ListRenderManager.this, uq9Var2));
            ListRenderManager.l(ListRenderManager.this, uq9Var);
            ListRenderManager.m(ListRenderManager.this).m(uq9Var, uq9Var2);
            if (d69.c()) {
                ListRenderManager.n(ListRenderManager.this);
            }
            if (uq9Var != null && (currentMediaSetData = ((IDataService) ListRenderManager.j(ListRenderManager.this).getService(IDataService.class)).getCurrentMediaSetData()) != null) {
                ListRenderManager.o(ListRenderManager.this);
                a.d e = currentMediaSetData.e();
                String H = e.H();
                anl pageInterface = ((IHostPageInterfaceService) ListRenderManager.j(ListRenderManager.this).getService(IHostPageInterfaceService.class)).getPageInterface();
                String str = null;
                if (pageInterface != null) {
                    d3aVar = c3a.a((bod) pageInterface);
                } else {
                    d3aVar = ListRenderManager.j(ListRenderManager.this).getContext() instanceof bod ? c3a.a((bod) ListRenderManager.j(ListRenderManager.this).getContext()) : null;
                }
                if (!TextUtils.isEmpty(H) && d3aVar != null) {
                    ITrackService iTrackService = (ITrackService) ListRenderManager.j(ListRenderManager.this).getService(ITrackService.class);
                    if (iTrackService != null) {
                        Map<String, String> activeCardCommonTrack = iTrackService.getActiveCardCommonTrack();
                        activeCardCommonTrack.put("contentId", e.f());
                        activeCardCommonTrack.put("videoId", e.f());
                        activeCardCommonTrack.put("video_spm_cnt", activeCardCommonTrack.get("spm-cnt"));
                        activeCardCommonTrack.put("video_spm_url", activeCardCommonTrack.get("spm-url"));
                        str = hxf.d(activeCardCommonTrack);
                    }
                    ir9.b("ListRenderManager", "侧滑进个人页--commonTrack=" + str);
                    d3aVar.y(H, str);
                }
                ListRenderManager.this.G().setAutoLock(false);
                ListRenderManager.c(ListRenderManager.this).post(new a());
                ListRenderManager.p(ListRenderManager.this).getmPreloadNextHandler().removeMessages(0);
                ListRenderManager.p(ListRenderManager.this).getmPreloadNextHandler().postDelayed(new b(uq9Var2, uq9Var), 1000L);
            }
        }

        @Override // tb.bpk
        public void k(uq9 uq9Var, uq9 uq9Var2) {
            boolean z = true;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d85cf3e9", new Object[]{this, uq9Var, uq9Var2});
                return;
            }
            ir9.b("ListRenderManager", "onBeforeActiveCardChanged current: " + ListRenderManager.k(ListRenderManager.this, uq9Var) + ", old: " + ListRenderManager.k(ListRenderManager.this, uq9Var2));
            ListRenderManager.m(ListRenderManager.this).k(uq9Var, uq9Var2);
            if ((uq9Var2 instanceof ici) && (uq9Var instanceof ici)) {
                int adapterPosition = ((ici) uq9Var2).f0().getAdapterPosition();
                int adapterPosition2 = ((ici) uq9Var).f0().getAdapterPosition();
                FluidContext j = ListRenderManager.j(ListRenderManager.this);
                if (adapterPosition2 <= adapterPosition) {
                    z = false;
                }
                xau.l(j, z);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class e implements LockableRecycerView.c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f7851a;

        public e(Context context) {
            this.f7851a = context;
        }

        @Override // com.taobao.android.fluid.framework.list.view.LockableRecycerView.a
        public void j() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("54b330fc", new Object[]{this});
                return;
            }
            ListRenderManager.m(ListRenderManager.this).j();
            ir9.b("ListRenderManager", "VideoProcess PublicCardListController.mLoadMoreRunnable onDragDown。");
            ListRenderManager.d(ListRenderManager.this, false);
            if (!ListRenderManager.p(ListRenderManager.this).isLoadingUp()) {
                int findFirstVisibleItemPosition = ListRenderManager.this.C().findFirstVisibleItemPosition();
                if (!d69.d()) {
                    if (findFirstVisibleItemPosition <= ListRenderManager.e(ListRenderManager.this)) {
                        ListRenderManager.p(ListRenderManager.this).postLoadUpRunnable();
                    }
                } else if (findFirstVisibleItemPosition < 2) {
                    ListRenderManager.p(ListRenderManager.this).postLoadUpRunnable();
                }
                if (!ListRenderManager.p(ListRenderManager.this).isLoadingUp() && !ListRenderManager.this.G().canScrollVertically(-1) && !ListRenderManager.p(ListRenderManager.this).ismHasShowNoMoreMsgUp() && ListRenderManager.p(ListRenderManager.this).isUpNoMoreData() && !TextUtils.isEmpty(ListRenderManager.p(ListRenderManager.this).getNoMoreMsgUp())) {
                    h1u.a(this.f7851a, ListRenderManager.p(ListRenderManager.this).getNoMoreMsgUp());
                    ListRenderManager.p(ListRenderManager.this).setHasShowNoMoreMsgUp(true);
                }
            }
        }

        @Override // com.taobao.android.fluid.framework.list.view.LockableRecycerView.c
        public void l() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5bd4d54c", new Object[]{this});
            } else {
                ListRenderManager.m(ListRenderManager.this).l();
            }
        }

        @Override // com.taobao.android.fluid.framework.list.view.LockableRecycerView.c
        public void n() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e46ce4c5", new Object[]{this});
            } else {
                ListRenderManager.m(ListRenderManager.this).n();
            }
        }

        @Override // com.taobao.android.fluid.framework.list.view.LockableRecycerView.a
        public void onDragUp() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("76868f35", new Object[]{this});
                return;
            }
            ListRenderManager.m(ListRenderManager.this).onDragUp();
            boolean canScrollVertically = ListRenderManager.this.G().canScrollVertically(1);
            ir9.b("ListRenderManager", "VideoProcess PublicCardListController.mLoadMoreRunnable onDragUp。 canScrollUp=" + canScrollVertically + " isLoadingMore()=" + ListRenderManager.p(ListRenderManager.this).isLoadingMore());
            ListRenderManager.d(ListRenderManager.this, false);
            if (!canScrollVertically) {
                int findLastVisibleItemPosition = ListRenderManager.this.C().findLastVisibleItemPosition();
                int b = vn8.b(ListRenderManager.p(ListRenderManager.this).isLoadingMore(), ListRenderManager.p(ListRenderManager.this).isNoMoreData(), ListRenderManager.p(ListRenderManager.this).getNoRecReason());
                vn8.g(ListRenderManager.j(ListRenderManager.this), findLastVisibleItemPosition, b);
                com.taobao.android.fluid.business.usertrack.track.ut.videotracker.b.U(ListRenderManager.j(ListRenderManager.this), "cannot_scrollup", String.valueOf(System.currentTimeMillis() - ListRenderManager.p(ListRenderManager.this).getStartRecommendtime()), String.valueOf(b), String.valueOf(findLastVisibleItemPosition), ListRenderManager.p(ListRenderManager.this).getRecommendRequestId());
                ir9.b("ListRenderManager", "VideoProcess PublicCardListController.mLoadMoreRunnable onDragUp。滑不动 reason=" + b + " position=" + findLastVisibleItemPosition + " ; getRecommendRequestId()=" + ListRenderManager.p(ListRenderManager.this).getRecommendRequestId() + "; cost=" + (System.currentTimeMillis() - ListRenderManager.p(ListRenderManager.this).getStartRecommendtime()));
            }
            if (!ListRenderManager.p(ListRenderManager.this).isLoadingMore()) {
                if (!d69.d()) {
                    ListRenderManager.n(ListRenderManager.this);
                } else if (ListRenderManager.this.C().getItemCount() < ListRenderManager.this.C().findFirstVisibleItemPosition() + 4) {
                    ListRenderManager.p(ListRenderManager.this).postLoadDownRunnable();
                }
                if (!ListRenderManager.p(ListRenderManager.this).isLoadingMore() && !canScrollVertically && !ListRenderManager.p(ListRenderManager.this).isHasShowNoMoreMsg() && ListRenderManager.p(ListRenderManager.this).isNoMoreData() && !TextUtils.isEmpty(ListRenderManager.p(ListRenderManager.this).getNoMoreMsg())) {
                    ir9.b("ListRenderManager", "VideoProcess PublicCardListController.mLoadMoreRunnable onDragUp。 isNoMoreData()=true；toast提示：" + ListRenderManager.p(ListRenderManager.this).getNoMoreMsg());
                    h1u.a(this.f7851a, ListRenderManager.p(ListRenderManager.this).getNoMoreMsg());
                    ListRenderManager.p(ListRenderManager.this).setHasShowNoMoreMsg(true);
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class f implements d5n {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public f() {
        }

        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c3573f5c", new Object[]{this});
            } else {
                ListRenderManager.f(ListRenderManager.this).setRefreshing(false);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class g implements TBSwipeRefreshLayout.OnPullRefreshListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ d5n f7853a;

        public g(d5n d5nVar) {
            this.f7853a = d5nVar;
        }

        @Override // com.taobao.uikit.extend.component.refresh.TBSwipeRefreshLayout.OnPullRefreshListener
        public void onPullDistance(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2dcc8a23", new Object[]{this, new Integer(i)});
            } else {
                ListRenderManager.m(ListRenderManager.this).onPullDistance(i);
            }
        }

        @Override // com.taobao.uikit.extend.component.refresh.TBSwipeRefreshLayout.OnPullRefreshListener
        public void onRefresh() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c9cbba83", new Object[]{this});
            } else {
                ListRenderManager.m(ListRenderManager.this).onRefresh();
            }
        }

        @Override // com.taobao.uikit.extend.component.refresh.TBSwipeRefreshLayout.OnPullRefreshListener
        public void onRefreshStateChanged(TBRefreshHeader.RefreshState refreshState, TBRefreshHeader.RefreshState refreshState2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1f1ba5ae", new Object[]{this, refreshState, refreshState2});
                return;
            }
            ListRenderManager.m(ListRenderManager.this).onRefreshStateChanged(refreshState, refreshState2);
            if (refreshState2 == TBRefreshHeader.RefreshState.REFRESHING) {
                ListRenderManager.p(ListRenderManager.this).requestDetailDataAndRefresh(this.f7853a);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public interface h {
        int a(com.taobao.android.fluid.framework.data.datamodel.a aVar);
    }

    static {
        t2o.a(468714461);
    }

    public ListRenderManager(FluidContext fluidContext, d6c d6cVar) {
        this.f7843a = fluidContext;
        FluidService service = fluidContext.getService(IContainerService.class);
        Objects.requireNonNull(service);
        this.b = (IContainerService) service;
        FluidService service2 = fluidContext.getService(IDataService.class);
        Objects.requireNonNull(service2);
        IDataService iDataService = (IDataService) service2;
        this.c = iDataService;
        FluidService service3 = fluidContext.getService(IMessageService.class);
        Objects.requireNonNull(service3);
        this.d = (IMessageService) service3;
        FluidService service4 = fluidContext.getService(IHostTNodeService.class);
        Objects.requireNonNull(service4);
        this.e = (IHostTNodeService) service4;
        FluidService service5 = fluidContext.getService(ICollectionService.class);
        Objects.requireNonNull(service5);
        this.f = (ICollectionService) service5;
        this.h = d6cVar;
        int orangeIntConfig = FluidSDK.getRemoteConfigAdapter().getOrangeIntConfig("residueCount", 4);
        this.s = orangeIntConfig;
        ListMonitor listMonitor = new ListMonitor(fluidContext);
        nug nugVar = new nug();
        this.t = nugVar;
        nugVar.f(d6cVar);
        iDataService.addDetailRequestListener(listMonitor);
        int n = eps.n(fluidContext);
        this.u = n;
        ir9.b("ListRenderManager", "滑动 ResidueCount:" + orangeIntConfig + " ,cardBindPreNum:" + n);
    }

    public static /* synthetic */ LockableRecycerView a(ListRenderManager listRenderManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LockableRecycerView) ipChange.ipc$dispatch("72157a62", new Object[]{listRenderManager});
        }
        return listRenderManager.i;
    }

    public static /* synthetic */ int b(ListRenderManager listRenderManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9bd0bef2", new Object[]{listRenderManager})).intValue();
        }
        return listRenderManager.u;
    }

    public static /* synthetic */ Handler c(ListRenderManager listRenderManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Handler) ipChange.ipc$dispatch("ede09839", new Object[]{listRenderManager});
        }
        return listRenderManager.g;
    }

    public static /* synthetic */ void d(ListRenderManager listRenderManager, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7891c26", new Object[]{listRenderManager, new Boolean(z)});
        } else {
            listRenderManager.s(z);
        }
    }

    public static /* synthetic */ int e(ListRenderManager listRenderManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("cf080b62", new Object[]{listRenderManager})).intValue();
        }
        return listRenderManager.s;
    }

    public static /* synthetic */ TBSwipeRefreshLayout f(ListRenderManager listRenderManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TBSwipeRefreshLayout) ipChange.ipc$dispatch("ed949941", new Object[]{listRenderManager});
        }
        return listRenderManager.n;
    }

    public static /* synthetic */ nug g(ListRenderManager listRenderManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (nug) ipChange.ipc$dispatch("a37fac89", new Object[]{listRenderManager});
        }
        return listRenderManager.t;
    }

    public static /* synthetic */ boolean h(ListRenderManager listRenderManager, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("65e26a64", new Object[]{listRenderManager, new Boolean(z)})).booleanValue();
        }
        listRenderManager.q = z;
        return z;
    }

    public static /* synthetic */ MultiRecyclerViewAdapter i(ListRenderManager listRenderManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MultiRecyclerViewAdapter) ipChange.ipc$dispatch("d88636ae", new Object[]{listRenderManager});
        }
        return listRenderManager.k;
    }

    public static /* synthetic */ FluidContext j(ListRenderManager listRenderManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FluidContext) ipChange.ipc$dispatch("fc4a32a7", new Object[]{listRenderManager});
        }
        return listRenderManager.f7843a;
    }

    public static /* synthetic */ String k(ListRenderManager listRenderManager, uq9 uq9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("44e084ad", new Object[]{listRenderManager, uq9Var});
        }
        return listRenderManager.z(uq9Var);
    }

    public static /* synthetic */ uq9 l(ListRenderManager listRenderManager, uq9 uq9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (uq9) ipChange.ipc$dispatch("f54c0911", new Object[]{listRenderManager, uq9Var});
        }
        listRenderManager.o = uq9Var;
        return uq9Var;
    }

    public static /* synthetic */ d6c m(ListRenderManager listRenderManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d6c) ipChange.ipc$dispatch("62e9e47e", new Object[]{listRenderManager});
        }
        return listRenderManager.h;
    }

    public static /* synthetic */ void n(ListRenderManager listRenderManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("46182905", new Object[]{listRenderManager});
        } else {
            listRenderManager.r();
        }
    }

    public static /* synthetic */ void o(ListRenderManager listRenderManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d241006", new Object[]{listRenderManager});
        } else {
            listRenderManager.R();
        }
    }

    public static /* synthetic */ IDataService p(ListRenderManager listRenderManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IDataService) ipChange.ipc$dispatch("a6d86440", new Object[]{listRenderManager});
        }
        return listRenderManager.c;
    }

    public View A() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("ce219891", new Object[]{this});
        }
        return this.m;
    }

    public int B() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6840b11d", new Object[]{this})).intValue();
        }
        MultiRecyclerViewAdapter multiRecyclerViewAdapter = this.k;
        if (multiRecyclerViewAdapter != null) {
            return multiRecyclerViewAdapter.m0();
        }
        return -1;
    }

    public LinearLayoutManager C() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LinearLayoutManager) ipChange.ipc$dispatch("4a7cf619", new Object[]{this});
        }
        return this.j;
    }

    public int D() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2e00068d", new Object[]{this})).intValue();
        }
        return this.t.d();
    }

    public MultiRecyclerViewAdapter E() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MultiRecyclerViewAdapter) ipChange.ipc$dispatch("8e79a948", new Object[]{this});
        }
        return this.k;
    }

    public ntm F() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ntm) ipChange.ipc$dispatch("d066531a", new Object[]{this});
        }
        return this.k.o0();
    }

    public LockableRecycerView G() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LockableRecycerView) ipChange.ipc$dispatch("f0d4393f", new Object[]{this});
        }
        return this.i;
    }

    public boolean H() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6bd0b61e", new Object[]{this})).booleanValue();
        }
        return this.q;
    }

    public boolean I() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c5d252eb", new Object[]{this})).booleanValue();
        }
        return this.r;
    }

    public boolean J() {
        RecyclerView.Adapter adapter;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("532e225d", new Object[]{this})).booleanValue();
        }
        if (!b93.b()) {
            RecyclerView.LayoutManager layoutManager = this.i.getLayoutManager();
            if (!(layoutManager instanceof LinearLayoutManager) || (adapter = this.i.getAdapter()) == null) {
                return true;
            }
            int findFirstCompletelyVisibleItemPosition = ((LinearLayoutManager) layoutManager).findFirstCompletelyVisibleItemPosition();
            if (findFirstCompletelyVisibleItemPosition < 0 || findFirstCompletelyVisibleItemPosition < adapter.getItemCount() - 1) {
                return false;
            }
            return true;
        }
        int totalCount = this.c.getTotalCount();
        if (y() < totalCount - 1) {
            return false;
        }
        ir9.b("ListRenderManager", "isPublicTheLastOne，播下一个 不存在下一个内容， currentPosition=" + y() + " totalCount=" + totalCount);
        return true;
    }

    public void K(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d809a144", new Object[]{this, new Integer(i)});
            return;
        }
        int currentMediaPosition = this.c.getCurrentMediaPosition();
        if (!akt.p2("ShortVideo.enableRefreshForPublish", true) || i != currentMediaPosition) {
            this.k.notifyItemChanged(i);
        } else if (x() instanceof ici) {
            RecyclerViewHolder f0 = ((ici) x()).f0();
            int size = this.k.getDataList().size();
            if (size <= i) {
                ir9.b("ListRenderManager", "index out of array, index:" + i + " size: " + size);
                return;
            }
            f0.d0().g(this.k.getDataList().get(i), i);
        }
    }

    public void L(uq9 uq9Var, boolean z) {
        int i;
        com.taobao.android.fluid.framework.data.datamodel.a aVar;
        a.d e2;
        a.e K;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a2fb79a0", new Object[]{this, uq9Var, new Boolean(z)});
        } else if (uq9Var instanceof ici) {
            int adapterPosition = ((ici) uq9Var).f0().getAdapterPosition();
            if (z) {
                if (adapterPosition <= 0) {
                    return;
                }
            } else if (this.c.getMediaSetList().size() <= adapterPosition + 1) {
                return;
            }
            if (z) {
                i = adapterPosition - 1;
            } else {
                i = adapterPosition + 1;
            }
            if (i < this.c.getMediaSetList().size() && (aVar = (com.taobao.android.fluid.framework.data.datamodel.a) this.c.getMediaSetList().get(i)) != null && (e2 = aVar.e()) != null && e2.C() && !eps.f() && (K = e2.K()) != null) {
                xv4.c(K);
                String g2 = K.g();
                if (!TextUtils.isEmpty(g2)) {
                    FluidSDK.getImageAdapter().load(g2, new b(this));
                }
            }
        }
    }

    public void M() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7db89e6", new Object[]{this});
        } else {
            O(true);
        }
    }

    public void N() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dda84928", new Object[]{this});
        } else {
            O(false);
        }
    }

    public void P(ntm ntmVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e4253bf3", new Object[]{this, ntmVar});
        } else {
            this.k.x0(ntmVar);
        }
    }

    public void Q(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d5d3e24d", new Object[]{this, context});
            return;
        }
        View w = w(context);
        this.m = w;
        this.i = (LockableRecycerView) w.findViewById(R.id.fluid_sdk_v_mediaset_list);
        Y();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(context) { // from class: com.taobao.android.fluid.framework.list.render.ListRenderManager.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass3 r6, String str, Object... objArr) {
                int hashCode = str.hashCode();
                if (hashCode == 1027840325) {
                    super.onLayoutChildren((RecyclerView.Recycler) objArr[0], (RecyclerView.State) objArr[1]);
                    return null;
                } else if (hashCode == 1951908722) {
                    return new Integer(super.scrollVerticallyBy(((Number) objArr[0]).intValue(), (RecyclerView.Recycler) objArr[1], (RecyclerView.State) objArr[2]));
                } else {
                    if (hashCode == 2087983122) {
                        super.collectAdjacentPrefetchPositions(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), (RecyclerView.State) objArr[2], (RecyclerView.LayoutManager.LayoutPrefetchRegistry) objArr[3]);
                        return null;
                    }
                    int hashCode2 = str.hashCode();
                    throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/android/fluid/framework/list/render/ListRenderManager$3");
                }
            }

            @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
            public void collectAdjacentPrefetchPositions(int i, int i2, RecyclerView.State state, RecyclerView.LayoutManager.LayoutPrefetchRegistry layoutPrefetchRegistry) {
                int i3;
                int i4 = 0;
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("7c741812", new Object[]{this, new Integer(i), new Integer(i2), state, layoutPrefetchRegistry});
                    return;
                }
                super.collectAdjacentPrefetchPositions(i, i2, state, layoutPrefetchRegistry);
                if (ListRenderManager.b(ListRenderManager.this) > 0 && i2 > 0) {
                    try {
                        if (ListRenderManager.i(ListRenderManager.this) != null && state.getItemCount() == ListRenderManager.i(ListRenderManager.this).getItemCount()) {
                            int position = getPosition(getChildAt(getChildCount() - 1));
                            int min = Math.min(ListRenderManager.b(ListRenderManager.this) + position, state.getItemCount() - 1);
                            int i5 = position + 1;
                            while (i5 <= min) {
                                layoutPrefetchRegistry.addPosition(i5, i4);
                                i5++;
                                i4++;
                            }
                            return;
                        }
                        StringBuilder sb = new StringBuilder("count does not match:");
                        sb.append(state.getItemCount());
                        sb.append(",");
                        if (ListRenderManager.i(ListRenderManager.this) != null) {
                            i3 = ListRenderManager.i(ListRenderManager.this).getItemCount();
                        } else {
                            i3 = -1;
                        }
                        sb.append(i3);
                        ir9.b("ListRenderManager", sb.toString());
                    } catch (Exception e2) {
                        ir9.c("ListRenderManager", "collectAdjacentPrefetchPositions", e2);
                    }
                }
            }

            @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
            public void onLayoutChildren(RecyclerView.Recycler recycler, RecyclerView.State state) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("3d439945", new Object[]{this, recycler, state});
                    return;
                }
                try {
                    super.onLayoutChildren(recycler, state);
                } catch (Exception e2) {
                    e2.printStackTrace();
                    FluidException.throwException(ListRenderManager.j(ListRenderManager.this), IFeedsListService.RECYCLER_VIEW_INDEX_OUT_OF_BOUNDS, e2);
                }
                if (ListRenderManager.a(ListRenderManager.this) != null) {
                    ListRenderManager.a(ListRenderManager.this).setRecycler(recycler);
                }
            }

            @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
            public int scrollVerticallyBy(int i, RecyclerView.Recycler recycler, RecyclerView.State state) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Number) ipChange2.ipc$dispatch("7457c372", new Object[]{this, new Integer(i), recycler, state})).intValue();
                }
                try {
                    return super.scrollVerticallyBy(i, recycler, state);
                } catch (Exception e2) {
                    FluidException.throwException(ListRenderManager.j(ListRenderManager.this), IFeedsListService.RECYCLER_VIEW_INDEX_OUT_OF_BOUNDS, e2);
                    return 0;
                }
            }
        };
        this.j = linearLayoutManager;
        linearLayoutManager.setOrientation(1);
        this.i.setLayoutManager(this.j);
        this.i.setHasFixedSize(true);
        this.i.setItemViewCacheSize(1);
        if (lwl.c(this.f7843a)) {
            ir9.b("PerfSmooth", "close RV default prefetch");
            this.i.getLayoutManager().setItemPrefetchEnabled(false);
        }
        W(context);
        Z();
        AnonymousClass4 r6 = new AnonymousClass4(this.f7843a);
        this.k = r6;
        r6.v0(this.c.getMediaSetList());
        V();
        this.i.setAdapter(this.k);
        TBVideoPagerSnapHelper tBVideoPagerSnapHelper = new TBVideoPagerSnapHelper();
        this.l = tBVideoPagerSnapHelper;
        tBVideoPagerSnapHelper.attachToRecyclerView(this.i);
        a0();
    }

    public final void R() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b4c4a3eb", new Object[]{this});
            return;
        }
        ir9.b("ListRenderManager", "PickPreloadControllerNew，resetUpScrollFlag,重置标记位");
        this.b.toggleCacheLoading(false);
    }

    public void S(View view, Runnable runnable, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d73da1d2", new Object[]{this, view, runnable, str});
            return;
        }
        LockableRecycerView t = t(view);
        if (t == null || !t.isDuringLayout()) {
            runnable.run();
            return;
        }
        nwv.y0(runnable);
        xau.J(str);
        ir9.b("ListRenderManager", "duringLayout:" + str);
    }

    public boolean T(String str) {
        a.d e2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b2da01b0", new Object[]{this, str})).booleanValue();
        }
        if (str == null) {
            return false;
        }
        int size = this.c.getMediaSetList().size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            }
            com.taobao.android.fluid.framework.data.datamodel.a aVar = (com.taobao.android.fluid.framework.data.datamodel.a) this.c.getMediaSetList().get(i);
            if (aVar != null && (e2 = aVar.e()) != null && str.equals(e2.f())) {
                break;
            }
            i++;
        }
        if (i < 0) {
            return false;
        }
        this.i.scrollToPosition(i);
        return true;
    }

    public void U(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d4b3d6b1", new Object[]{this, new Boolean(z)});
        } else {
            this.i.setAutoLock(z);
        }
    }

    public final void V() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("901ee98", new Object[]{this});
        } else {
            this.k.w0(new d());
        }
    }

    public final void W(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8732d338", new Object[]{this, context});
        } else {
            this.i.setOnDragListener(new e(context));
        }
    }

    public final void X() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec90fc10", new Object[]{this});
        } else {
            this.n.setOnPullRefreshListener(new g(new f()));
        }
    }

    public final void Y() {
        TBSwipeRefreshLayout tBSwipeRefreshLayout;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd12215", new Object[]{this});
        } else if (d69.f(this.f7843a) && (tBSwipeRefreshLayout = this.n) != null) {
            tBSwipeRefreshLayout.enablePullRefresh(true);
            this.n.getRefresHeader().setBackgroundColor(0);
            X();
        }
    }

    public final void Z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e571da69", new Object[]{this});
        } else if (!d69.d()) {
            this.i.addOnScrollListener(new RecyclerView.OnScrollListener() { // from class: com.taobao.android.fluid.framework.list.render.ListRenderManager.9
                public static volatile transient /* synthetic */ IpChange $ipChange;

                /* renamed from: a  reason: collision with root package name */
                public boolean f7845a = false;

                public static /* synthetic */ Object ipc$super(AnonymousClass9 r2, String str, Object... objArr) {
                    if (str.hashCode() == -1177043419) {
                        super.onScrolled((RecyclerView) objArr[0], ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue());
                        return null;
                    }
                    int hashCode = str.hashCode();
                    throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/fluid/framework/list/render/ListRenderManager$9");
                }

                @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
                public void onScrolled(RecyclerView recyclerView, int i, int i2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("b9d7be25", new Object[]{this, recyclerView, new Integer(i), new Integer(i2)});
                        return;
                    }
                    super.onScrolled(recyclerView, i, i2);
                    ListRenderManager.m(ListRenderManager.this).onScrolled(recyclerView, i, i2);
                    if (i2 != 0 && recyclerView.getScrollState() == 1 && !this.f7845a) {
                        oqi.d(ListRenderManager.j(ListRenderManager.this), "startdrag");
                        this.f7845a = true;
                        ListRenderManager.d(ListRenderManager.this, true);
                    }
                }

                @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
                public void onScrollStateChanged(RecyclerView recyclerView, int i) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("51239a02", new Object[]{this, recyclerView, new Integer(i)});
                        return;
                    }
                    ir9.b("ListRenderManager", "onScrollStateChanged, newState:" + i + ", isDragging:" + this.f7845a);
                    ListRenderManager.m(ListRenderManager.this).onScrollStateChanged(recyclerView, i);
                    StringBuilder sb = new StringBuilder("VideoProcess PublicCardListController.mLoadMoreRunnable trackdrag onScrollStateChanged rv state:");
                    sb.append(i);
                    ir9.a("ListRenderManager", sb.toString());
                    if (i == 0) {
                        if (this.f7845a) {
                            oqi.d(ListRenderManager.j(ListRenderManager.this), "enddrag");
                            this.f7845a = false;
                        }
                        if (!d69.c()) {
                            ListRenderManager.n(ListRenderManager.this);
                        }
                    } else if (i == 1) {
                        ListRenderManager listRenderManager = ListRenderManager.this;
                        System.currentTimeMillis();
                        listRenderManager.getClass();
                    } else if (i == 2) {
                        oqi.d(ListRenderManager.j(ListRenderManager.this), "enddrag");
                        this.f7845a = false;
                    }
                    if (!this.f7845a) {
                        ListRenderManager.d(ListRenderManager.this, false);
                    }
                }
            });
        }
    }

    public final void a0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94e949f4", new Object[]{this});
        } else {
            this.l.c(new a());
        }
    }

    public void b0(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cc520e05", new Object[]{this, new Boolean(z)});
        } else {
            this.r = z;
        }
    }

    public void c0(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f6c08109", new Object[]{this, new Boolean(z)});
            return;
        }
        this.i.setLocked(z);
        enc lockListListener = ((ISceneConfigService) this.f7843a.getService(ISceneConfigService.class)).getLockListListener();
        if (lockListListener != null) {
            lockListListener.b(z);
        }
    }

    public void d0(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e65f897d", new Object[]{this, new Integer(i)});
            return;
        }
        try {
            ir9.b("ListRenderManager", "hideLoadingMore smoothScrollToPosition position=" + i + "; getScrollState=" + this.i.getScrollState());
            this.i.stopScroll();
            this.i.smoothScrollToPosition(i);
        } catch (Exception e2) {
            FluidException.throwException(this.f7843a, IFeedsListService.SCROLL_INVALID_TARGET_POSITION, e2);
        }
    }

    public void q(RecyclerView.OnScrollListener onScrollListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b67b00fd", new Object[]{this, onScrollListener});
            return;
        }
        LockableRecycerView lockableRecycerView = this.i;
        if (lockableRecycerView != null) {
            lockableRecycerView.addOnScrollListener(onScrollListener);
        }
    }

    public final void s(boolean z) {
        uq9 activeCard;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed3ba8ec", new Object[]{this, new Boolean(z)});
        } else if (b93.s(this.f7843a) && (activeCard = ((ICardService) this.f7843a.getService(ICardService.class)).getActiveCard()) != null) {
            activeCard.I(z);
        }
    }

    public LockableRecycerView t(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LockableRecycerView) ipChange.ipc$dispatch("d489f241", new Object[]{this, view});
        }
        if (view == null) {
            return null;
        }
        while (view != null) {
            if (view instanceof LockableRecycerView) {
                return (LockableRecycerView) view;
            }
            if (view.getParent() instanceof View) {
                view = (View) view.getParent();
            } else {
                view = null;
            }
        }
        return null;
    }

    public final View u(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("627cb46a", new Object[]{this, context});
        }
        LockableRecycerView lockableRecycerView = new LockableRecycerView(context);
        lockableRecycerView.setId(R.id.fluid_sdk_v_mediaset_list);
        return lockableRecycerView;
    }

    public final View v(Context context, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("886b1333", new Object[]{this, context, view});
        }
        if (!d69.f(this.f7843a)) {
            return view;
        }
        TNodeTBSwipeRefreshLayout tNodeTBSwipeRefreshLayout = new TNodeTBSwipeRefreshLayout(context);
        this.n = tNodeTBSwipeRefreshLayout;
        tNodeTBSwipeRefreshLayout.setHeaderView(new FullPageRefreshHeader(context));
        this.n.addView(view);
        this.n.setTargetScrollWithLayout(false);
        this.n.setMaxPullDistance(pr9.c(context, 36));
        this.n.setCustomRefreshHeight(pr9.c(context, 36));
        this.n.enableSecondFloor(false);
        return this.n;
    }

    public final View w(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("7334ca29", new Object[]{this, context});
        }
        long currentTimeMillis = System.currentTimeMillis();
        View u = u(context);
        boolean h2 = d69.h();
        ir9.a("ListRenderManager", "generateLayout:" + h2 + " inflateTime=" + (System.currentTimeMillis() - currentTimeMillis));
        return v(context, u);
    }

    public uq9 x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (uq9) ipChange.ipc$dispatch("934fc714", new Object[]{this});
        }
        return this.o;
    }

    public int y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("13183d3f", new Object[]{this})).intValue();
        }
        uq9 uq9Var = this.o;
        if (uq9Var != null) {
            return uq9Var.M();
        }
        return -1;
    }

    public final String z(uq9 uq9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d4f672b7", new Object[]{this, uq9Var});
        }
        if (uq9Var == null) {
            return null;
        }
        return uq9Var.y();
    }

    public final void r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d211b5a5", new Object[]{this});
            return;
        }
        ir9.b("ListRenderManager", "VideoProcess PublicCardListController.mLoadMoreRunnable checkToLoadMore");
        if (C() != null) {
            if (this.c.getMediaSetList().isEmpty()) {
                ir9.b("ListRenderManager", "VideoProcess PublicCardListController.mLoadMoreRunnable checkToLoadMore() return-- getMediaSetList().isEmpty()");
                return;
            }
            int itemCount = C().getItemCount();
            int findLastVisibleItemPosition = C().findLastVisibleItemPosition();
            ir9.b("ListRenderManager", " checkToLoadMore totalItemCount=" + itemCount + " lastVisibleItem=" + findLastVisibleItemPosition + " first=" + C().findFirstVisibleItemPosition() + " isLoadingMore()=" + this.c.isLoadingMore());
            if (SystemClock.elapsedRealtime() - this.p > 500) {
                this.p = SystemClock.elapsedRealtime();
                uq9 uq9Var = this.o;
                if (uq9Var instanceof ici) {
                    try {
                        int adapterPosition = ((ici) uq9Var).f0().getAdapterPosition();
                        int i = itemCount - 1;
                        if (adapterPosition == i && findLastVisibleItemPosition == i) {
                            HashMap hashMap = new HashMap(1);
                            hashMap.put("listSize", Integer.valueOf(itemCount));
                            hashMap.put("index", Integer.valueOf(adapterPosition));
                            ir9.b("ListRenderManager", "VideoProcess PublicCardListController.mLoadMoreRunnable checkToLoadMore noData. totalItemCount=" + itemCount + " curPosition=" + adapterPosition);
                            s19.a(this.o, "noData", null, hashMap);
                        }
                    } catch (Exception e2) {
                        ir9.b("ListRenderManager", "e : " + e2.getMessage());
                    }
                }
            }
            if (!this.c.isLoadingMore() && (itemCount - 1) - findLastVisibleItemPosition <= this.s) {
                this.c.postLoadDownRunnable();
            }
        }
    }

    public void O(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a96cd469", new Object[]{this, new Boolean(z)});
            return;
        }
        int totalCount = this.c.getTotalCount();
        if (b93.b()) {
            if (z && y() >= totalCount - 1) {
                ir9.b("ListRenderManager", "publicSmoothVideo，向下滑，不存在下一个内容， currentPosition=" + y() + " totalCount=" + totalCount);
                return;
            } else if (!z && y() == 0) {
                ir9.b("ListRenderManager", "publicSmoothVideo，向上滑，不存在上一个内容， currentPosition=" + y());
                return;
            }
        }
        this.i.setAutoLock(true);
        int height = this.i.getHeight();
        if (!((ICollectionService) this.f7843a.getService(ICollectionService.class)).checkDialogPopup()) {
            ir9.b("ListRenderManager", "publicSmoothVideo currentPosition=" + y() + " totalCount=" + totalCount);
            LockableRecycerView lockableRecycerView = this.i;
            if (!z) {
                height = -height;
            }
            lockableRecycerView.smoothScrollBy(0, height);
            b0(true);
            this.g.postDelayed(new c(), 1000L);
        }
    }
}
