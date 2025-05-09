package com.taobao.android.dinamicx.widget.recycler;

import android.content.Context;
import android.graphics.Canvas;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.widget.recycler.nested.DXNestedScrollerView;
import com.taobao.android.dinamicx.widget.recycler.refresh.TBAbsRefreshHeader;
import com.taobao.android.dinamicx.widget.recycler.refresh.TBSwipeRefreshLayout;
import com.taobao.android.dinamicx.widget.recycler.view.DXRecyclerView;
import com.taobao.android.dinamicx.widget.refresh.layout.DXRefreshLayout;
import com.taobao.android.dinamicx.widget.refresh.layout.constant.DXRefreshState;
import com.taobao.taobao.R;
import tb.a36;
import tb.fa6;
import tb.g2c;
import tb.ga6;
import tb.ih5;
import tb.nb6;
import tb.nc6;
import tb.otk;
import tb.rb5;
import tb.s96;
import tb.t2o;
import tb.w96;
import tb.wq2;
import tb.zg5;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class WaterfallLayout implements g2c, TBSwipeRefreshLayout.i {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final DXNestedScrollerView A;
    public final boolean B;
    public final boolean C;
    public w96 D;
    public final int E;
    public final boolean F;
    public final boolean G;
    public DXRefreshLayout H;
    public otk I;
    public rb5 J;
    public int K;
    public int L;
    public final ih5 M;
    public final String N;

    /* renamed from: a  reason: collision with root package name */
    public int f7473a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public boolean k;
    public boolean l;
    public boolean m;
    public String[] n;
    public String[] o;
    public TBSwipeRefreshLayout.j p;
    public RecyclerView.OnScrollListener q;
    public WaterfallLayoutRelativeLayout r;
    public StickyLayout s;
    public StickyItemDecoration t;
    public SpaceItemDecoration u;
    public RecyclerView.LayoutManager v;
    public RecyclerView w;
    public TBSwipeRefreshLayout x;
    public boolean y;
    public final TBAbsRefreshHeader z;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a extends nc6 {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ RecyclerView d;

        public a(WaterfallLayout waterfallLayout, RecyclerView recyclerView) {
            this.d = recyclerView;
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            int hashCode = str.hashCode();
            if (hashCode == -747657308) {
                return new Boolean(super.b((View) objArr[0]));
            }
            if (hashCode == 2094028612) {
                return new Boolean(super.a((View) objArr[0]));
            }
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/android/dinamicx/widget/recycler/WaterfallLayout$1");
        }

        @Override // tb.nc6, tb.sb6
        public boolean a(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("7cd05744", new Object[]{this, view})).booleanValue();
            }
            return super.a(this.d);
        }

        @Override // tb.nc6, tb.sb6
        public boolean b(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("d36fa7a4", new Object[]{this, view})).booleanValue();
            }
            return super.b(this.d);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class b implements otk {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ TBSwipeRefreshLayout.j f7474a;

        public b(WaterfallLayout waterfallLayout, TBSwipeRefreshLayout.j jVar) {
            this.f7474a = jVar;
        }

        @Override // tb.avk
        public void d(DXRefreshLayout dXRefreshLayout, DXRefreshState dXRefreshState, DXRefreshState dXRefreshState2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e8269120", new Object[]{this, dXRefreshLayout, dXRefreshState, dXRefreshState2});
                return;
            }
            TBSwipeRefreshLayout.j jVar = this.f7474a;
            TBAbsRefreshHeader.RefreshState refreshState = TBAbsRefreshHeader.RefreshState.NONE;
            jVar.a(ga6.a(dXRefreshState, refreshState), ga6.a(dXRefreshState2, refreshState));
        }

        public void k(DXRefreshLayout dXRefreshLayout) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a72d8566", new Object[]{this, dXRefreshLayout});
            } else {
                this.f7474a.onRefresh();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public int f7475a = 1;
        public final int b = -1;
        public int c;
        public int d;
        public int e;
        public int f;
        public int g;
        public boolean h;
        public String[] i;
        public boolean j;
        public TBAbsRefreshHeader k;
        public DXNestedScrollerView l;
        public boolean m;
        public boolean n;
        public int o;
        public boolean p;
        public boolean q;
        public rb5 r;
        public ih5 s;
        public int t;
        public int u;
        public String v;

        static {
            t2o.a(444597538);
        }

        public c a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (c) ipChange.ipc$dispatch("a978cc54", new Object[]{this, str});
            }
            this.v = str;
            return this;
        }

        public WaterfallLayout b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (WaterfallLayout) ipChange.ipc$dispatch("9b1a5e02", new Object[]{this});
            }
            return new WaterfallLayout(this.f7475a, this.b, this.c, this.d, this.e, 0, 0, 0, 0, this.f, this.g, this.h, false, this.i, null, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, this.r, this.t, this.u, this.s, this.v, null);
        }

        public c c(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (c) ipChange.ipc$dispatch("85ebcbb9", new Object[]{this, new Integer(i)});
            }
            this.f7475a = i;
            return this;
        }

        public c d(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (c) ipChange.ipc$dispatch("ac2f9b52", new Object[]{this, new Integer(i)});
            }
            this.c = i;
            return this;
        }

        public c e(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (c) ipChange.ipc$dispatch("ed9956c0", new Object[]{this, new Boolean(z)});
            }
            this.j = z;
            return this;
        }

        public c f(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (c) ipChange.ipc$dispatch("bac74df3", new Object[]{this, new Boolean(z)});
            }
            this.p = z;
            return this;
        }

        public c g(rb5 rb5Var) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (c) ipChange.ipc$dispatch("f4e2d76", new Object[]{this, rb5Var});
            }
            this.r = rb5Var;
            return this;
        }

        public c h(DXNestedScrollerView dXNestedScrollerView) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (c) ipChange.ipc$dispatch("e464489c", new Object[]{this, dXNestedScrollerView});
            }
            this.l = dXNestedScrollerView;
            return this;
        }

        public c i(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (c) ipChange.ipc$dispatch("afbde3f", new Object[]{this, new Boolean(z)});
            }
            this.m = z;
            return this;
        }

        public c j(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (c) ipChange.ipc$dispatch("b29955c0", new Object[]{this, new Boolean(z)});
            }
            this.q = z;
            return this;
        }

        public c k(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (c) ipChange.ipc$dispatch("6c8cb850", new Object[]{this, new Boolean(z)});
            }
            this.h = z;
            return this;
        }

        public c l(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (c) ipChange.ipc$dispatch("2c36de83", new Object[]{this, new Integer(i)});
            }
            this.d = i;
            return this;
        }

        public c m(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (c) ipChange.ipc$dispatch("bcbf77bd", new Object[]{this, new Integer(i)});
            }
            this.f = i;
            return this;
        }

        public c n(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (c) ipChange.ipc$dispatch("25bb19a4", new Object[]{this, new Integer(i)});
            }
            this.g = i;
            return this;
        }

        public c o(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (c) ipChange.ipc$dispatch("f74693e8", new Object[]{this, new Boolean(z)});
            }
            this.n = z;
            return this;
        }

        public c p(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (c) ipChange.ipc$dispatch("59534acf", new Object[]{this, new Integer(i)});
            }
            this.t = i;
            return this;
        }

        public c q(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (c) ipChange.ipc$dispatch("513e6031", new Object[]{this, new Integer(i)});
            }
            this.u = i;
            return this;
        }

        public c r(String[] strArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (c) ipChange.ipc$dispatch("a0b4ee3b", new Object[]{this, strArr});
            }
            this.i = strArr;
            return this;
        }

        public c s(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (c) ipChange.ipc$dispatch("c8b96118", new Object[]{this, new Integer(i)});
            }
            this.e = i;
            return this;
        }

        public c t(TBAbsRefreshHeader tBAbsRefreshHeader) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (c) ipChange.ipc$dispatch("c54f0080", new Object[]{this, tBAbsRefreshHeader});
            }
            this.k = tBAbsRefreshHeader;
            return this;
        }

        public c u(ih5 ih5Var) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (c) ipChange.ipc$dispatch("3a6d66f5", new Object[]{this, ih5Var});
            }
            this.s = ih5Var;
            return this;
        }

        public c v(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (c) ipChange.ipc$dispatch("12a9ad08", new Object[]{this, new Integer(i)});
            }
            this.o = i;
            return this;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class d extends wq2 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(444597539);
        }

        public static /* synthetic */ Object ipc$super(d dVar, String str, Object... objArr) {
            if (str.hashCode() == -874034088) {
                return new Boolean(super.g());
            }
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dinamicx/widget/recycler/WaterfallLayout$WaterfallLayoutClipRadiusHandler");
        }

        @Override // tb.wq2
        public boolean g() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("cbe74c58", new Object[]{this})).booleanValue();
            }
            if (!super.g() || "VTR-AL00".equals(Build.MODEL)) {
                return false;
            }
            return true;
        }
    }

    static {
        t2o.a(444597535);
        t2o.a(444597516);
        t2o.a(444597602);
    }

    public /* synthetic */ WaterfallLayout(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, boolean z, boolean z2, String[] strArr, String[] strArr2, boolean z3, TBAbsRefreshHeader tBAbsRefreshHeader, DXNestedScrollerView dXNestedScrollerView, boolean z4, boolean z5, int i12, boolean z6, boolean z7, rb5 rb5Var, int i13, int i14, ih5 ih5Var, String str, a aVar) {
        this(i, i2, i3, i4, i5, i6, i7, i8, i9, i10, i11, z, z2, strArr, strArr2, z3, tBAbsRefreshHeader, dXNestedScrollerView, z4, z5, i12, z6, z7, rb5Var, i13, i14, ih5Var, str);
    }

    public void A(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dab29a8c", new Object[]{this, new Boolean(z)});
        } else {
            this.y = z;
        }
    }

    public void B() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("626fb7c9", new Object[]{this});
            return;
        }
        DXRefreshLayout dXRefreshLayout = this.H;
        if (dXRefreshLayout != null) {
            dXRefreshLayout.autoPullDownLoadMore();
        }
    }

    public void C() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("647ae420", new Object[]{this});
            return;
        }
        TBSwipeRefreshLayout tBSwipeRefreshLayout = this.x;
        if (tBSwipeRefreshLayout != null) {
            tBSwipeRefreshLayout.setAutoRefreshing(true);
            return;
        }
        DXRefreshLayout dXRefreshLayout = this.H;
        if (dXRefreshLayout != null) {
            dXRefreshLayout.finishRefresh();
        }
    }

    public void D() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("855fbb69", new Object[]{this});
            return;
        }
        DXRefreshLayout dXRefreshLayout = this.H;
        if (dXRefreshLayout != null) {
            dXRefreshLayout.finishPullDownLoadMore();
        }
    }

    public void E() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f3f1c80", new Object[]{this});
            return;
        }
        TBSwipeRefreshLayout tBSwipeRefreshLayout = this.x;
        if (tBSwipeRefreshLayout != null) {
            tBSwipeRefreshLayout.setRefreshing(false);
            return;
        }
        DXRefreshLayout dXRefreshLayout = this.H;
        if (dXRefreshLayout != null) {
            dXRefreshLayout.autoRefresh();
        }
    }

    public final void F(DXRefreshLayout dXRefreshLayout) {
        Context context;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e996e3a", new Object[]{this, dXRefreshLayout});
        } else if (dXRefreshLayout != null && (context = dXRefreshLayout.getContext()) != null) {
            if (this.G) {
                if (this.J == null) {
                    this.J = new a36(context);
                }
                dXRefreshLayout.setEnablePullLoadMore(true);
            } else {
                dXRefreshLayout.setEnablePullLoadMore(false);
                if (this.k) {
                    if (this.J == null) {
                        this.J = new fa6(context, this.z);
                    }
                    dXRefreshLayout.setHeaderHeightPx((int) context.getResources().getDimension(R.dimen.uik_refresh_header_height));
                    dXRefreshLayout.setEnableRefresh(true);
                } else {
                    dXRefreshLayout.setEnableRefresh(false);
                }
            }
            if (zg5.H2()) {
                dXRefreshLayout.setEnableLoadMore(false);
            } else {
                dXRefreshLayout.setEnableLoadMore(true);
            }
            rb5 rb5Var = this.J;
            if (rb5Var != null) {
                rb5Var.v(this.n);
                this.J.p(this.K);
                this.J.t(this.L);
                dXRefreshLayout.setRefreshHeader(this.J);
            }
            otk otkVar = this.I;
            if (otkVar != null) {
                rb5 rb5Var2 = this.J;
                if (rb5Var2 != null) {
                    rb5Var2.o(otkVar);
                }
                dXRefreshLayout.setOnRefreshListener(this.I);
            }
        }
    }

    public boolean a(TBSwipeRefreshLayout tBSwipeRefreshLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("86c7809", new Object[]{this, tBSwipeRefreshLayout})).booleanValue();
        }
        if (!zg5.m4(this.N)) {
            return !this.y;
        }
        RecyclerView k = k();
        if (k == null) {
            return true;
        }
        if (k == this.A.getmChildList()) {
            return !this.A.isChildReachTop();
        }
        RecyclerView.LayoutManager layoutManager = k.getLayoutManager();
        if (!(layoutManager instanceof StaggeredGridLayoutManager)) {
            return true;
        }
        RecyclerView.Adapter adapter = k.getAdapter();
        if (!(adapter instanceof RecyclerAdapter)) {
            return true;
        }
        StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) layoutManager;
        int[] iArr = new int[staggeredGridLayoutManager.getSpanCount()];
        staggeredGridLayoutManager.findFirstCompletelyVisibleItemPositions(iArr);
        int i = iArr[0];
        if (i < 0 || adapter.getItemCount() == 0) {
            return true;
        }
        if (i == 0) {
            return !this.A.isChildReachTop();
        }
        for (int i2 = 0; i2 < i && i <= adapter.getItemCount(); i2++) {
            if (!(((RecyclerAdapter) adapter).Z(i2, true) instanceof s96)) {
                return true;
            }
        }
        return !this.A.isChildReachTop();
    }

    public DXRecyclerView b(Context context) {
        DXRecyclerView waterFallLayoutCustomRecyclerView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXRecyclerView) ipChange.ipc$dispatch("bb549494", new Object[]{this, context});
        }
        ih5 ih5Var = this.M;
        if (ih5Var == null || (waterFallLayoutCustomRecyclerView = ih5Var.getWaterFallLayoutCustomRecyclerView(context)) == null) {
            return new DXRecyclerView(context);
        }
        return waterFallLayoutCustomRecyclerView;
    }

    public final ViewGroup c(Context context, View view, RecyclerView recyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("20afbf84", new Object[]{this, context, view, recyclerView});
        }
        DXRefreshLayout dXRefreshLayout = new DXRefreshLayout(context);
        this.H = dXRefreshLayout;
        F(dXRefreshLayout);
        this.H.setEnableScrollContentWhenLoaded(true);
        this.H.setScrollBoundaryDecider(new a(this, recyclerView));
        this.H.setRefreshContent(view);
        return this.H;
    }

    public final View d(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("b07f7aa9", new Object[]{this, context});
        }
        DXRecyclerView b2 = b(context);
        StickyItemDecoration stickyItemDecoration = new StickyItemDecoration(this.F);
        this.t = stickyItemDecoration;
        b2.addItemDecoration(stickyItemDecoration);
        SpaceItemDecoration spaceItemDecoration = new SpaceItemDecoration(this.b, this.c, this.d, this.f7473a, this.B);
        this.u = spaceItemDecoration;
        b2.addItemDecoration(spaceItemDecoration);
        this.w = b2;
        RecyclerView.OnScrollListener onScrollListener = this.q;
        if (onScrollListener != null) {
            b2.addOnScrollListener(onScrollListener);
        }
        r(b2, context);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.addView(b2);
        StickyLayout stickyLayout = new StickyLayout(context);
        this.s = stickyLayout;
        stickyLayout.setRecyclerView(this.w);
        frameLayout.addView(this.s, -1, -1);
        this.t.l(this.s);
        this.s.setHeightUpdateListener(this);
        return frameLayout;
    }

    public final ViewGroup e(Context context, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("1b88e2e9", new Object[]{this, context, view});
        }
        TBSwipeRefreshLayout tBSwipeRefreshLayout = new TBSwipeRefreshLayout(context);
        this.x = tBSwipeRefreshLayout;
        tBSwipeRefreshLayout.setOnChildScrollUpCallback(this);
        TBAbsRefreshHeader tBAbsRefreshHeader = this.z;
        if (tBAbsRefreshHeader != null) {
            this.x.setHeaderView(tBAbsRefreshHeader);
        }
        if (this.k) {
            this.x.enablePullRefresh(true);
        }
        if (this.l) {
            this.x.enableLoadMore(true);
        }
        TBSwipeRefreshLayout.j jVar = this.p;
        if (jVar != null) {
            this.x.setOnPullRefreshListener(jVar);
        }
        this.x.setLoadMoreTips(this.o);
        this.x.setRefreshTips(this.n);
        this.x.addView(view);
        return this.x;
    }

    public View f(Context context, boolean z) {
        ViewGroup viewGroup;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("c4f16f16", new Object[]{this, context, new Boolean(z)});
        }
        WaterfallLayoutRelativeLayout waterfallLayoutRelativeLayout = new WaterfallLayoutRelativeLayout(context);
        this.r = waterfallLayoutRelativeLayout;
        waterfallLayoutRelativeLayout.setTranslationY(-1.0f);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -1);
        marginLayoutParams.leftMargin = this.i;
        marginLayoutParams.rightMargin = this.j;
        this.r.setLayoutParams(marginLayoutParams);
        this.r.setPadding(this.e, this.g, this.f, this.h);
        View d2 = d(context);
        RecyclerView recyclerView = this.w;
        if (!z) {
            viewGroup = e(context, d2);
        } else {
            viewGroup = c(context, d2, recyclerView);
        }
        this.r.addView(viewGroup, -1, -1);
        if (this.A.getmRootList() == null) {
            this.A.addView(this.r);
            this.A.setRoot(recyclerView);
            return this.A;
        }
        DXNestedScrollerView dXNestedScrollerView = this.A;
        if (dXNestedScrollerView != null && dXNestedScrollerView.getmChildList() == null) {
            this.A.setCurrentChild(recyclerView);
        }
        return this.r;
    }

    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a06fd285", new Object[]{this});
            return;
        }
        DXRefreshLayout dXRefreshLayout = this.H;
        if (dXRefreshLayout != null) {
            dXRefreshLayout.failPullDownLoadMore();
        }
    }

    public wq2 h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (wq2) ipChange.ipc$dispatch("a6a1a69b", new Object[]{this});
        }
        WaterfallLayoutRelativeLayout waterfallLayoutRelativeLayout = this.r;
        if (waterfallLayoutRelativeLayout != null) {
            return waterfallLayoutRelativeLayout.getCLipRadiusHandler();
        }
        return null;
    }

    public RecyclerView.OnScrollListener i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecyclerView.OnScrollListener) ipChange.ipc$dispatch("3014c82e", new Object[]{this});
        }
        return this.q;
    }

    public w96 j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (w96) ipChange.ipc$dispatch("4869c537", new Object[]{this});
        }
        return this.D;
    }

    public RecyclerView k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecyclerView) ipChange.ipc$dispatch("650c36e3", new Object[]{this});
        }
        return this.w;
    }

    public TBSwipeRefreshLayout l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TBSwipeRefreshLayout) ipChange.ipc$dispatch("5f8d790a", new Object[]{this});
        }
        return this.x;
    }

    public boolean m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ecdea5b8", new Object[]{this})).booleanValue();
        }
        DXRefreshLayout dXRefreshLayout = this.H;
        if (dXRefreshLayout == null) {
            return false;
        }
        return dXRefreshLayout.isPullDownLoading();
    }

    public boolean n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("af7a7005", new Object[]{this})).booleanValue();
        }
        DXRefreshLayout dXRefreshLayout = this.H;
        if (dXRefreshLayout == null) {
            return false;
        }
        return dXRefreshLayout.isPullDownNoData();
    }

    public void o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1bb22a72", new Object[]{this});
            return;
        }
        DXRefreshLayout dXRefreshLayout = this.H;
        if (dXRefreshLayout != null) {
            dXRefreshLayout.noDataPullDownLoadMore();
        }
    }

    public RecyclerView.LayoutManager p() {
        ScrollStaggeredGridLayoutManager waterFallLayoutCustomLayoutManager;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecyclerView.LayoutManager) ipChange.ipc$dispatch("c93a2e57", new Object[]{this});
        }
        ih5 ih5Var = this.M;
        if (ih5Var != null && (waterFallLayoutCustomLayoutManager = ih5Var.getWaterFallLayoutCustomLayoutManager(this.f7473a, this.E, this)) != null) {
            return waterFallLayoutCustomLayoutManager;
        }
        if (this.E == 0) {
            return new ScrollStaggeredGridLayoutManager(this.f7473a, 0, this);
        }
        return new ScrollStaggeredGridLayoutManager(this.f7473a, 1, this);
    }

    public void q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae44b5", new Object[]{this});
            return;
        }
        this.w.removeItemDecoration(this.t);
        this.w.addItemDecoration(this.t);
    }

    public void r(RecyclerView recyclerView, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("30b6809e", new Object[]{this, recyclerView, context});
            return;
        }
        this.w = recyclerView;
        if (this.C) {
            recyclerView.setItemAnimator(new DefaultItemAnimator());
        } else {
            recyclerView.setItemAnimator(null);
        }
        recyclerView.setHasFixedSize(true);
        if (this.m) {
            recyclerView.setOverScrollMode(2);
        }
        this.v = p();
        recyclerView.setDescendantFocusability(131072);
        recyclerView.setLayoutManager(this.v);
        recyclerView.setClipToPadding(false);
        recyclerView.setSaveEnabled(false);
    }

    public void s(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, boolean z, boolean z2, String[] strArr, String[] strArr2, boolean z3, boolean z4, int i12, int i13, boolean z5) {
        boolean z6;
        WaterfallLayout waterfallLayout;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b02a9b73", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), new Integer(i6), new Integer(i7), new Integer(i8), new Integer(i9), new Integer(i10), new Integer(i11), new Boolean(z), new Boolean(z2), strArr, strArr2, new Boolean(z3), new Boolean(z4), new Integer(i12), new Integer(i13), new Boolean(z5)});
            return;
        }
        if (this.r != null) {
            if (!(this.i == i10 && this.j == i11)) {
                ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -1);
                marginLayoutParams.leftMargin = i10;
                marginLayoutParams.rightMargin = i11;
                this.r.setLayoutParams(marginLayoutParams);
            }
            if (!(this.e == i6 && this.h == i9 && this.f == i7 && this.g == i8)) {
                this.r.setPadding(i6, i8, i7, i9);
            }
        }
        TBSwipeRefreshLayout tBSwipeRefreshLayout = this.x;
        if (tBSwipeRefreshLayout != null) {
            if (z) {
                tBSwipeRefreshLayout.enablePullRefresh(true);
            } else {
                tBSwipeRefreshLayout.enablePullRefresh(false);
            }
            if (z2) {
                this.x.enableLoadMore(true);
            } else {
                this.x.enableLoadMore(false);
            }
            this.x.setLoadMoreTips(strArr2);
            this.x.setRefreshTips(strArr);
            this.x.setOnChildScrollUpCallback(this);
        }
        if (this.w != null) {
            StickyItemDecoration stickyItemDecoration = this.t;
            if (stickyItemDecoration != null) {
                stickyItemDecoration.a();
            }
            if (this.b == i3 && this.c == i4 && this.d == i5 && this.f7473a == i) {
                z6 = z3;
                waterfallLayout = this;
            } else {
                this.w.removeItemDecoration(this.u);
                waterfallLayout = this;
                z6 = z3;
                SpaceItemDecoration spaceItemDecoration = new SpaceItemDecoration(i3, i4, i5, i, z4);
                waterfallLayout.u = spaceItemDecoration;
                waterfallLayout.w.addItemDecoration(spaceItemDecoration);
            }
            if (z6) {
                waterfallLayout.w.setOverScrollMode(2);
            } else {
                waterfallLayout.w.setOverScrollMode(0);
            }
            if (waterfallLayout.f7473a != i) {
                waterfallLayout.f7473a = i;
                if (!z5 || !(waterfallLayout.v instanceof StaggeredGridLayoutManager) || nb6.i()) {
                    RecyclerView.LayoutManager p = p();
                    waterfallLayout.v = p;
                    waterfallLayout.w.setLayoutManager(p);
                } else {
                    ((StaggeredGridLayoutManager) waterfallLayout.v).setSpanCount(i);
                }
            }
        } else {
            z6 = z3;
            waterfallLayout = this;
        }
        waterfallLayout.f7473a = i;
        waterfallLayout.b = i3;
        waterfallLayout.c = i4;
        waterfallLayout.d = i5;
        waterfallLayout.e = i6;
        waterfallLayout.f = i7;
        waterfallLayout.g = i8;
        waterfallLayout.h = i9;
        waterfallLayout.i = i10;
        waterfallLayout.j = i11;
        waterfallLayout.k = z;
        waterfallLayout.l = z2;
        waterfallLayout.n = strArr;
        waterfallLayout.o = strArr2;
        waterfallLayout.m = z6;
        waterfallLayout.K = i12;
        waterfallLayout.L = i13;
        DXRefreshLayout dXRefreshLayout = waterfallLayout.H;
        if (dXRefreshLayout != null) {
            waterfallLayout.F(dXRefreshLayout);
        }
    }

    public void t(BaseStickyAdapter baseStickyAdapter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("12ee7eb0", new Object[]{this, baseStickyAdapter});
            return;
        }
        this.w.setAdapter(baseStickyAdapter);
        baseStickyAdapter.P(this.w);
        this.t.k(baseStickyAdapter);
    }

    public void u(d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("603c8450", new Object[]{this, dVar});
            return;
        }
        WaterfallLayoutRelativeLayout waterfallLayoutRelativeLayout = this.r;
        if (waterfallLayoutRelativeLayout != null) {
            waterfallLayoutRelativeLayout.setClipRadiusHandler(dVar);
        }
    }

    public void v(TBSwipeRefreshLayout.j jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("73314b58", new Object[]{this, jVar});
            return;
        }
        this.p = jVar;
        TBSwipeRefreshLayout tBSwipeRefreshLayout = this.x;
        if (tBSwipeRefreshLayout != null) {
            tBSwipeRefreshLayout.setOnPullRefreshListener(jVar);
        } else if (this.H == null) {
        } else {
            if (jVar != null) {
                w(new b(this, jVar));
            } else {
                w(null);
            }
        }
    }

    public final void w(otk otkVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed859684", new Object[]{this, otkVar});
            return;
        }
        DXRefreshLayout dXRefreshLayout = this.H;
        if (dXRefreshLayout != null) {
            this.I = otkVar;
            dXRefreshLayout.setOnRefreshListener(otkVar);
            rb5 rb5Var = this.J;
            if (rb5Var != null) {
                rb5Var.o(otkVar);
            }
        }
    }

    public void x(RecyclerView.OnScrollListener onScrollListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3771abe", new Object[]{this, onScrollListener});
            return;
        }
        this.q = onScrollListener;
        RecyclerView recyclerView = this.w;
        if (recyclerView != null) {
            recyclerView.clearOnScrollListeners();
            this.w.addOnScrollListener(onScrollListener);
        }
    }

    public void y(w96 w96Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c8bfb29", new Object[]{this, w96Var});
            return;
        }
        this.D = w96Var;
        RecyclerView recyclerView = this.w;
        if (recyclerView != null) {
            recyclerView.setOnTouchListener(w96Var);
        }
    }

    public void z(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("80a97b34", new Object[]{this, new Boolean(z)});
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class WaterfallLayoutRelativeLayout extends RelativeLayout {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private wq2 cLipRadiusHandler;

        static {
            t2o.a(444597540);
        }

        public WaterfallLayoutRelativeLayout(Context context) {
            super(context);
        }

        public static /* synthetic */ Object ipc$super(WaterfallLayoutRelativeLayout waterfallLayoutRelativeLayout, String str, Object... objArr) {
            if (str.hashCode() == 623593120) {
                super.dispatchDraw((Canvas) objArr[0]);
                return null;
            }
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dinamicx/widget/recycler/WaterfallLayout$WaterfallLayoutRelativeLayout");
        }

        @Override // android.view.ViewGroup, android.view.View
        public void dispatchDraw(Canvas canvas) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("252b46a0", new Object[]{this, canvas});
                return;
            }
            wq2 wq2Var = this.cLipRadiusHandler;
            if (wq2Var == null) {
                super.dispatchDraw(canvas);
            } else if (wq2Var.h()) {
                super.dispatchDraw(canvas);
            } else {
                this.cLipRadiusHandler.b(this, canvas);
                super.dispatchDraw(canvas);
                this.cLipRadiusHandler.a(this, canvas);
            }
        }

        public wq2 getCLipRadiusHandler() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (wq2) ipChange.ipc$dispatch("a6a1a69b", new Object[]{this});
            }
            return this.cLipRadiusHandler;
        }

        public void setClipRadiusHandler(wq2 wq2Var) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("592fcdab", new Object[]{this, wq2Var});
            } else {
                this.cLipRadiusHandler = wq2Var;
            }
        }

        public WaterfallLayoutRelativeLayout(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public WaterfallLayoutRelativeLayout(Context context, AttributeSet attributeSet, int i) {
            super(context, attributeSet, i);
        }
    }

    public WaterfallLayout(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, boolean z, boolean z2, String[] strArr, String[] strArr2, boolean z3, TBAbsRefreshHeader tBAbsRefreshHeader, DXNestedScrollerView dXNestedScrollerView, boolean z4, boolean z5, int i12, boolean z6, boolean z7, rb5 rb5Var, int i13, int i14, ih5 ih5Var, String str) {
        this.y = true;
        this.f7473a = i;
        this.b = i3;
        this.c = i4;
        this.d = i5;
        this.e = i6;
        this.f = i7;
        this.g = i8;
        this.h = i9;
        this.i = i10;
        this.j = i11;
        this.k = z;
        this.l = z2;
        this.n = strArr;
        this.o = strArr2;
        this.m = z3;
        this.z = tBAbsRefreshHeader;
        this.A = dXNestedScrollerView;
        this.B = z4;
        this.C = z5;
        this.E = i12;
        this.F = z6;
        this.G = z7;
        this.J = rb5Var;
        this.K = i13;
        this.L = i14;
        this.M = ih5Var;
        this.N = str;
    }
}
