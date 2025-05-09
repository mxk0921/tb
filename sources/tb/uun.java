package tb;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dressup.common.component.layout.CommonListLayoutComponent;
import com.taobao.android.dressup.common.component.outer.DressupListComponent;
import com.taobao.android.dressup.common.model.PageModel;
import com.taobao.android.dressup.common.model.RootModel;
import com.taobao.android.dressup.common.service.data.CommonDataService;
import com.taobao.android.dressup.common.view.pullrefresh.DressRefreshHeader;
import com.taobao.uikit.extend.component.refresh.TBRefreshHeader;
import com.taobao.uikit.extend.component.refresh.TBSwipeRefreshLayout;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import kotlin.Metadata;
import tb.q8u;
import tb.tpu;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public final class uun extends CommonListLayoutComponent implements khd {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final a Companion = new a(null);
    public static final String TAG = "RefreshListLayoutComponent";
    public final Handler i = new Handler(Looper.getMainLooper());
    public TBSwipeRefreshLayout j;
    public DressRefreshHeader k;
    public TUrlImageView l;
    public boolean m;
    public boolean n;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static final class a {
        static {
            t2o.a(918552621);
        }

        public a() {
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static final class b implements TBSwipeRefreshLayout.OnPullRefreshListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ TBSwipeRefreshLayout b;

        public b(TBSwipeRefreshLayout tBSwipeRefreshLayout) {
            this.b = tBSwipeRefreshLayout;
        }

        @Override // com.taobao.uikit.extend.component.refresh.TBSwipeRefreshLayout.OnPullRefreshListener
        public void onPullDistance(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2dcc8a23", new Object[]{this, new Integer(i)});
            }
        }

        @Override // com.taobao.uikit.extend.component.refresh.TBSwipeRefreshLayout.OnPullRefreshListener
        public void onRefresh() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c9cbba83", new Object[]{this});
            }
        }

        @Override // com.taobao.uikit.extend.component.refresh.TBSwipeRefreshLayout.OnPullRefreshListener
        public void onRefreshStateChanged(TBRefreshHeader.RefreshState refreshState, TBRefreshHeader.RefreshState refreshState2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1f1ba5ae", new Object[]{this, refreshState, refreshState2});
                return;
            }
            ckf.g(refreshState, "oldRefreshState");
            ckf.g(refreshState2, "newRefreshState");
            if (refreshState2 == TBRefreshHeader.RefreshState.REFRESHING && !uun.C(uun.this)) {
                uun.D(uun.this, this.b);
            }
        }
    }

    /* compiled from: Taobao */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ltb/xhv;", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static final class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ TBSwipeRefreshLayout f29620a;

        public c(TBSwipeRefreshLayout tBSwipeRefreshLayout) {
            this.f29620a = tBSwipeRefreshLayout;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                this.f29620a.setRefreshing(false);
            }
        }
    }

    static {
        t2o.a(918552620);
        t2o.a(729809932);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uun(qpu qpuVar) {
        super(qpuVar);
        ckf.g(qpuVar, "turboEngineContext");
    }

    public static final /* synthetic */ boolean C(uun uunVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ccab1789", new Object[]{uunVar})).booleanValue();
        }
        return uunVar.n;
    }

    public static final /* synthetic */ void D(uun uunVar, TBSwipeRefreshLayout tBSwipeRefreshLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("67889046", new Object[]{uunVar, tBSwipeRefreshLayout});
        } else {
            uunVar.H(tBSwipeRefreshLayout);
        }
    }

    public static /* synthetic */ Object ipc$super(uun uunVar, String str, Object... objArr) {
        if (str.hashCode() == -1238648751) {
            return super.createViewImpl();
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dressup/common/component/layout/RefreshListLayoutComponent");
    }

    public final boolean F() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1151be5d", new Object[]{this})).booleanValue();
        }
        return this.m;
    }

    public final boolean G() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56d673fc", new Object[]{this})).booleanValue();
        }
        TBSwipeRefreshLayout tBSwipeRefreshLayout = this.j;
        if (tBSwipeRefreshLayout != null) {
            return tBSwipeRefreshLayout.isRefreshing();
        }
        return false;
    }

    public final void I() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf5a1671", new Object[]{this});
            return;
        }
        TUrlImageView tUrlImageView = this.l;
        if (tUrlImageView != null) {
            ViewGroup viewGroup = null;
            if ((tUrlImageView != null ? tUrlImageView.getParent() : null) != null) {
                tpu.a.b(tpu.Companion, TAG, "removeSkeletonImage", null, 4, null);
                TUrlImageView tUrlImageView2 = this.l;
                ViewParent parent = tUrlImageView2 != null ? tUrlImageView2.getParent() : null;
                if (parent instanceof ViewGroup) {
                    viewGroup = parent;
                }
                ViewGroup viewGroup2 = viewGroup;
                if (viewGroup2 != null) {
                    viewGroup2.removeView(this.l);
                }
            }
        }
    }

    @Override // tb.khd
    public void onError() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("11bc4f70", new Object[]{this});
            return;
        }
        this.i.removeCallbacksAndMessages(null);
        TBSwipeRefreshLayout tBSwipeRefreshLayout = this.j;
        if (tBSwipeRefreshLayout != null) {
            tBSwipeRefreshLayout.setRefreshing(false);
        }
        this.n = false;
    }

    public final void H(TBSwipeRefreshLayout tBSwipeRefreshLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9fefaa38", new Object[]{this, tBSwipeRefreshLayout});
            return;
        }
        q8u.a aVar = q8u.Companion;
        aVar.a("pullRefresh");
        this.i.removeCallbacksAndMessages(null);
        sod service = o().getService(byb.class);
        if (service != null) {
            CommonDataService commonDataService = (CommonDataService) service;
            if (kz7.a() && dz7.Companion.a()) {
                commonDataService.W1();
            }
            this.m = true;
            DressupListComponent t = t();
            if (t != null) {
                t.H();
                this.n = true;
            }
            this.i.postDelayed(new c(tBSwipeRefreshLayout), 5000L);
            aVar.c();
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type com.taobao.android.dressup.common.service.data.CommonDataService");
    }

    @Override // com.taobao.android.dressup.common.component.layout.CommonListLayoutComponent, com.taobao.android.turbo.core.component.BaseComponent
    public FrameLayout createViewImpl() {
        String skeletonImageUrl;
        String ceilingImageUrl;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout) ipChange.ipc$dispatch("b62bb851", new Object[]{this});
        }
        FrameLayout createViewImpl = super.createViewImpl();
        DressupListComponent t = t();
        if (t != null) {
            t.G(this);
        }
        DressupListComponent t2 = t();
        RecyclerView recyclerView = null;
        Object view = t2 != null ? t2.getView() : null;
        if (view instanceof RecyclerView) {
            recyclerView = (RecyclerView) view;
        } else if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                ckf.f(childAt, "recyclerViewContainer.getChildAt(i)");
                if (childAt instanceof RecyclerView) {
                    recyclerView = (RecyclerView) childAt;
                }
            }
        }
        if (recyclerView != null) {
            E(recyclerView);
        }
        Object s = ((byb) o().getService(byb.class)).s();
        if (s != null) {
            PageModel pageModel = (PageModel) s;
            RootModel rootModel = pageModel.getRootModel();
            if (!(rootModel == null || (ceilingImageUrl = rootModel.getCeilingImageUrl()) == null)) {
                TUrlImageView tUrlImageView = new TUrlImageView(getContext());
                tUrlImageView.setImageUrl(ceilingImageUrl);
                tUrlImageView.setScaleType(ImageView.ScaleType.FIT_XY);
                createViewImpl.addView(tUrlImageView, 0, new FrameLayout.LayoutParams(-1, -1));
            }
            RootModel rootModel2 = pageModel.getRootModel();
            if (!(rootModel2 == null || (skeletonImageUrl = rootModel2.getSkeletonImageUrl()) == null)) {
                TUrlImageView tUrlImageView2 = new TUrlImageView(getContext());
                tUrlImageView2.setImageUrl(skeletonImageUrl);
                tUrlImageView2.setScaleType(ImageView.ScaleType.CENTER_CROP);
                xhv xhvVar = xhv.INSTANCE;
                this.l = tUrlImageView2;
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
                layoutParams.topMargin = pb6.c(getContext(), 299.0f);
                createViewImpl.addView(this.l, 1, layoutParams);
            }
            return createViewImpl;
        }
        throw new NullPointerException("null cannot be cast to non-null type com.taobao.android.dressup.common.model.PageModel");
    }

    @Override // tb.khd
    public void onSuccess() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d0e393ab", new Object[]{this});
            return;
        }
        q8u.a aVar = q8u.Companion;
        aVar.a("pullRefresh_onSuccess");
        this.i.removeCallbacksAndMessages(null);
        TBSwipeRefreshLayout tBSwipeRefreshLayout = this.j;
        if (tBSwipeRefreshLayout != null) {
            tBSwipeRefreshLayout.setRefreshing(false);
        }
        this.n = false;
        ((rcd) o().getService(rcd.class)).e();
        aVar.c();
    }

    public final void E(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("14813f11", new Object[]{this, view});
            return;
        }
        ViewParent parent = view.getParent();
        if (parent != null) {
            ViewGroup viewGroup = (ViewGroup) parent;
            viewGroup.removeView(view);
            this.k = new DressRefreshHeader(getContext());
            TBSwipeRefreshLayout tBSwipeRefreshLayout = new TBSwipeRefreshLayout(getContext());
            DressRefreshHeader dressRefreshHeader = this.k;
            if (dressRefreshHeader != null) {
                tBSwipeRefreshLayout.setHeaderView(dressRefreshHeader);
                tBSwipeRefreshLayout.enablePullRefresh(true);
                tBSwipeRefreshLayout.setMaxPullDistance(150);
                tBSwipeRefreshLayout.getRefresHeader().setBackgroundColor(0);
                tBSwipeRefreshLayout.setOnPullRefreshListener(new b(tBSwipeRefreshLayout));
                tBSwipeRefreshLayout.addView(view, new FrameLayout.LayoutParams(-1, -1));
                viewGroup.addView(tBSwipeRefreshLayout, new FrameLayout.LayoutParams(-1, -1));
                this.j = tBSwipeRefreshLayout;
                return;
            }
            ckf.y("refreshHeader");
            throw null;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
    }
}
