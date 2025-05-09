package com.taobao.tao.recommend4.recyclerview;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.recommend4.manager.a;
import com.taobao.tao.recommend4.recyclerview.HomeChildRecyclerView;
import com.taobao.tao.recommend4.recyclerview.R4StaggeredGridLayoutManager;
import com.taobao.taobao.R;
import tb.ba4;
import tb.bqa;
import tb.ctn;
import tb.lh0;
import tb.lhd;
import tb.m5a;
import tb.pj9;
import tb.t2o;
import tb.z4a;
import tb.zpk;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public HomeChildRecyclerView f12717a;
    public RecommendRecyclerAdapter b;
    public RecommendItemDecoration c;
    public final com.taobao.tao.recommend4.manager.a d;
    public SlideUpAnimationLogic e;
    public BuyAfterLayoutCorrector f;
    public ba4 g;
    public zpk h;
    public pj9 i;

    /* compiled from: Taobao */
    /* renamed from: com.taobao.tao.recommend4.recyclerview.a$a  reason: collision with other inner class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class View$OnAttachStateChangeListenerC0722a implements View.OnAttachStateChangeListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ RecommendViewExposureListener f12718a;

        /* compiled from: Taobao */
        /* renamed from: com.taobao.tao.recommend4.recyclerview.a$a$a  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
        public class RunnableC0723a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public RunnableC0723a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                View$OnAttachStateChangeListenerC0722a aVar = View$OnAttachStateChangeListenerC0722a.this;
                aVar.f12718a.onScrollStateChanged(a.this.f12717a, 0);
            }
        }

        public View$OnAttachStateChangeListenerC0722a(RecommendViewExposureListener recommendViewExposureListener) {
            this.f12718a = recommendViewExposureListener;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3d337638", new Object[]{this, view});
            } else {
                m5a.a().g(new RunnableC0723a(), 100L);
            }
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7f64d55b", new Object[]{this, view});
            } else {
                this.f12718a.onScrollStateChanged(a.this.f12717a, 0);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class b implements zpk {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // tb.zpk
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("710f571c", new Object[]{this});
            } else if (a.a(a.this) != null) {
                a.a(a.this).a();
            }
        }

        @Override // tb.zpk
        public void b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a17feca1", new Object[]{this});
            } else if (a.a(a.this) != null) {
                a.a(a.this).b();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class c implements R4StaggeredGridLayoutManager.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ e f12721a;

        public c(e eVar) {
            this.f12721a = eVar;
        }

        public void a(boolean z, boolean z2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4ab2fb3", new Object[]{this, new Boolean(z), new Boolean(z2)});
            } else if (z) {
                this.f12721a.a((int) ctn.a(a.this.f12717a));
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class d implements View.OnAttachStateChangeListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f12722a;

        public d(int i) {
            this.f12722a = i;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3d337638", new Object[]{this, view});
                return;
            }
            bqa.d("RecommendWrapper", "handleRecyclerViewBackgroundColorAndMargin onViewAttachedToWindow");
            RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) a.this.f12717a.getLayoutParams();
            if (layoutParams != null) {
                ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = this.f12722a;
                a.this.f12717a.setLayoutParams(layoutParams);
            }
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7f64d55b", new Object[]{this, view});
            } else {
                bqa.d("RecommendWrapper", "handleRecyclerViewBackgroundColorAndMargin onViewDetachedFromWindow");
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public interface e {
        void a(int i);
    }

    static {
        t2o.a(729810061);
    }

    public a(com.taobao.tao.recommend4.manager.a aVar) {
        this.d = aVar;
    }

    public static /* synthetic */ zpk a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (zpk) ipChange.ipc$dispatch("7c3adb92", new Object[]{aVar});
        }
        return aVar.h;
    }

    public static a c(com.taobao.tao.recommend4.manager.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("d6d28b48", new Object[]{aVar});
        }
        if (aVar == null) {
            return null;
        }
        return new a(aVar);
    }

    public void b(HomeChildRecyclerView.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b9e714a6", new Object[]{this, aVar});
            return;
        }
        HomeChildRecyclerView homeChildRecyclerView = this.f12717a;
        if (homeChildRecyclerView != null) {
            homeChildRecyclerView.addOnTouchEventListener(aVar);
        }
    }

    public final zpk d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (zpk) ipChange.ipc$dispatch("183b6926", new Object[]{this});
        }
        return new b();
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        SlideUpAnimationLogic slideUpAnimationLogic = this.e;
        if (slideUpAnimationLogic != null) {
            slideUpAnimationLogic.n();
        }
        BuyAfterLayoutCorrector buyAfterLayoutCorrector = this.f;
        if (buyAfterLayoutCorrector != null) {
            buyAfterLayoutCorrector.f();
            this.f = null;
        }
        pj9 pj9Var = this.i;
        if (pj9Var != null) {
            pj9Var.c();
        }
        ba4 ba4Var = this.g;
        if (ba4Var != null) {
            ba4Var.f();
        }
        this.f12717a.setNestedScrollParent(null);
    }

    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c16dddf7", new Object[]{this});
            return;
        }
        RecommendRecyclerAdapter recommendRecyclerAdapter = this.b;
        if (recommendRecyclerAdapter != null) {
            recommendRecyclerAdapter.d0();
        }
    }

    public void g(lhd lhdVar) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91d4c824", new Object[]{this, lhdVar});
            return;
        }
        HomeChildRecyclerView homeChildRecyclerView = new HomeChildRecyclerView(this.d.getContext());
        this.f12717a = homeChildRecyclerView;
        homeChildRecyclerView.setBackgroundResource(R.color.rec4_background_color);
        this.f12717a.setOverScrollMode(2);
        u(this.d.g());
        com.taobao.tao.recommend4.manager.a aVar = this.d;
        this.c = new RecommendItemDecoration(aVar, aVar.o());
        RecommendRecyclerAdapter recommendRecyclerAdapter = new RecommendRecyclerAdapter(this.d, this.c);
        this.b = recommendRecyclerAdapter;
        this.f12717a.setAdapter(recommendRecyclerAdapter);
        this.f12717a.addItemDecoration(this.c);
        RecommendActionTrackScrollListener recommendActionTrackScrollListener = new RecommendActionTrackScrollListener(this.d.getContainerType());
        RecommendViewExposureListener recommendViewExposureListener = new RecommendViewExposureListener(this.d.getContainerType());
        com.taobao.tao.recommend4.manager.a aVar2 = this.d;
        if (aVar2 != null) {
            str = aVar2.getContainerId();
        } else {
            str = "afterBuy";
        }
        RecommendViewPreloadListener recommendViewPreloadListener = new RecommendViewPreloadListener(str, lhdVar);
        this.f12717a.attachExposureListener(recommendViewExposureListener);
        this.f12717a.addOnScrollListener(recommendViewExposureListener);
        this.f12717a.addOnScrollListener(recommendActionTrackScrollListener);
        this.f12717a.addOnScrollListener(recommendViewPreloadListener);
        this.f12717a.addOnChildAttachStateChangeListener(new RecommendActionTrackChildListener(this.b));
        RecommendStayTimeListener recommendStayTimeListener = new RecommendStayTimeListener(this.d.getContainerType());
        this.f12717a.attachStayTimeListener(recommendStayTimeListener);
        this.f12717a.addOnScrollListener(recommendStayTimeListener);
        this.f12717a.addOnAttachStateChangeListener(new View$OnAttachStateChangeListenerC0722a(recommendViewExposureListener));
        this.f = new BuyAfterLayoutCorrector(this.f12717a, lhdVar);
        this.i = new pj9(this.f12717a, str);
        this.g = new ba4(this.f12717a, d(), this.d.getContainerType());
    }

    public int h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("dbbe351d", new Object[]{this})).intValue();
        }
        HomeChildRecyclerView homeChildRecyclerView = this.f12717a;
        if (homeChildRecyclerView == null) {
            return 2;
        }
        RecyclerView.LayoutManager layoutManager = homeChildRecyclerView.getLayoutManager();
        if (layoutManager instanceof StaggeredGridLayoutManager) {
            return ((StaggeredGridLayoutManager) layoutManager).getSpanCount();
        }
        return 2;
    }

    public int i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1324432f", new Object[]{this})).intValue();
        }
        HomeChildRecyclerView homeChildRecyclerView = this.f12717a;
        if (homeChildRecyclerView == null) {
            return -1;
        }
        RecyclerView.LayoutManager layoutManager = homeChildRecyclerView.getLayoutManager();
        if (layoutManager instanceof StaggeredGridLayoutManager) {
            int[] findFirstCompletelyVisibleItemPositions = ((StaggeredGridLayoutManager) layoutManager).findFirstCompletelyVisibleItemPositions(null);
            if (findFirstCompletelyVisibleItemPositions.length > 0) {
                return findFirstCompletelyVisibleItemPositions[0];
            }
        }
        return -1;
    }

    public void j(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee9bc723", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        this.f12717a.setBackgroundColor(i);
        ViewGroup.LayoutParams layoutParams = this.f12717a.getLayoutParams();
        if (layoutParams instanceof FrameLayout.LayoutParams) {
            ((FrameLayout.LayoutParams) layoutParams).topMargin = i2;
            this.f12717a.setLayoutParams(layoutParams);
        } else if (layoutParams instanceof RecyclerView.LayoutParams) {
            ((ViewGroup.MarginLayoutParams) ((RecyclerView.LayoutParams) layoutParams)).topMargin = i2;
            this.f12717a.setLayoutParams(layoutParams);
        } else {
            this.f12717a.addOnAttachStateChangeListener(new d(i2));
        }
    }

    public void k(HomeChildRecyclerView.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68053ce3", new Object[]{this, aVar});
            return;
        }
        HomeChildRecyclerView homeChildRecyclerView = this.f12717a;
        if (homeChildRecyclerView != null) {
            homeChildRecyclerView.removeOnTouchEventListener(aVar);
        }
    }

    public void l() {
        RecommendRecyclerAdapter recommendRecyclerAdapter;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("79935b87", new Object[]{this});
            return;
        }
        HomeChildRecyclerView homeChildRecyclerView = this.f12717a;
        if (homeChildRecyclerView != null && (recommendRecyclerAdapter = this.b) != null) {
            homeChildRecyclerView.setAdapter(recommendRecyclerAdapter);
        }
    }

    public void m(boolean z, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a097b080", new Object[]{this, new Boolean(z), new Integer(i)});
        } else if (this.f12717a != null) {
            u(i);
            this.f12717a.getRecycledViewPool().clear();
            RecommendItemDecoration recommendItemDecoration = this.c;
            if (recommendItemDecoration != null) {
                recommendItemDecoration.e(i);
            }
            RecommendRecyclerAdapter recommendRecyclerAdapter = this.b;
            if (recommendRecyclerAdapter != null) {
                recommendRecyclerAdapter.f0(z);
            }
            bqa.d("RecommendWrapper", "reset column count: " + i);
        }
    }

    public void n(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("161fb68b", new Object[]{this, new Integer(i)});
            return;
        }
        HomeChildRecyclerView homeChildRecyclerView = this.f12717a;
        if (homeChildRecyclerView != null) {
            homeChildRecyclerView.scrollToPosition(i);
        }
    }

    public void o(a.AbstractC0720a aVar, lh0 lh0Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4384ed7", new Object[]{this, aVar, lh0Var});
            return;
        }
        com.taobao.tao.recommend4.manager.a aVar2 = this.d;
        if (aVar2 != null && this.f12717a != null) {
            this.e = new SlideUpAnimationLogic(this.f12717a, aVar2.getContainerId(), lh0Var, aVar);
        }
    }

    public void p(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c14273c", new Object[]{this, new Integer(i)});
            return;
        }
        RecommendRecyclerAdapter recommendRecyclerAdapter = this.b;
        if (recommendRecyclerAdapter != null) {
            recommendRecyclerAdapter.h0(i);
        }
    }

    public void q(zpk zpkVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3d42f22f", new Object[]{this, zpkVar});
        } else {
            this.h = zpkVar;
        }
    }

    public void r(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c782b44", new Object[]{this, new Integer(i)});
            return;
        }
        RecommendItemDecoration recommendItemDecoration = this.c;
        if (recommendItemDecoration != null) {
            recommendItemDecoration.f(i);
        }
        RecommendRecyclerAdapter recommendRecyclerAdapter = this.b;
        if (recommendRecyclerAdapter != null) {
            recommendRecyclerAdapter.i0(i);
        }
    }

    public void s(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("129092a0", new Object[]{this, eVar});
            return;
        }
        HomeChildRecyclerView homeChildRecyclerView = this.f12717a;
        if (homeChildRecyclerView != null) {
            RecyclerView.LayoutManager layoutManager = homeChildRecyclerView.getLayoutManager();
            if (layoutManager instanceof R4StaggeredGridLayoutManager) {
                ((R4StaggeredGridLayoutManager) layoutManager).C(new c(eVar));
            }
        }
    }

    public void t(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39f267fb", new Object[]{this, new Boolean(z)});
            return;
        }
        HomeChildRecyclerView homeChildRecyclerView = this.f12717a;
        if (homeChildRecyclerView != null) {
            RecyclerView.LayoutManager layoutManager = homeChildRecyclerView.getLayoutManager();
            if (layoutManager instanceof R4StaggeredGridLayoutManager) {
                ((R4StaggeredGridLayoutManager) layoutManager).F(z);
            }
        }
    }

    public void u(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("117e4576", new Object[]{this, new Integer(i)});
            return;
        }
        R4StaggeredGridLayoutManager r4StaggeredGridLayoutManager = new R4StaggeredGridLayoutManager(i, 1, this.d);
        r4StaggeredGridLayoutManager.E(this.f12717a);
        this.f12717a.setLayoutManager(r4StaggeredGridLayoutManager);
    }

    public void v(z4a z4aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2903cfd1", new Object[]{this, z4aVar});
            return;
        }
        SlideUpAnimationLogic slideUpAnimationLogic = this.e;
        if (slideUpAnimationLogic != null) {
            slideUpAnimationLogic.z(z4aVar);
        }
        ba4 ba4Var = this.g;
        if (ba4Var != null) {
            ba4Var.m(z4aVar);
        }
    }

    public void w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("47bf5038", new Object[]{this});
            return;
        }
        ba4 ba4Var = this.g;
        if (ba4Var != null) {
            ba4Var.j();
        }
    }

    public void x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cd9c5abf", new Object[]{this});
            return;
        }
        ba4 ba4Var = this.g;
        if (ba4Var != null) {
            ba4Var.k();
        }
    }
}
